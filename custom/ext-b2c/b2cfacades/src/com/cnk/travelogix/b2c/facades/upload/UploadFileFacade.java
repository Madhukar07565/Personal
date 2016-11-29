/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.cnk.travelogix.b2c.facades.upload;

import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.catalog.model.CatalogModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.commercefacades.product.data.ImageData;
import de.hybris.platform.core.model.media.MediaFolderModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.media.MediaIOException;
import de.hybris.platform.servicelayer.media.MediaService;
import de.hybris.platform.servicelayer.model.ModelService;

import java.io.IOException;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.web.multipart.MultipartFile;

import com.cnk.travelogix.b2c.facades.customer.converters.populator.PhotoPopulator;


/**
 *
 */
public class UploadFileFacade
{
	protected static Logger LOG = Logger.getLogger(UploadFileFacade.class);

	private static final String UPLOADFILE_CATALOG = "upload_file_catalog";
	private static final String UPLOADFILE_CATALOGVERSION_VERSION = "online";
	private static final String UPLOAD_MEDIA_FOLDER = "EZG_UPLOAD_DOCUMENT";

	@Resource
	private ModelService modelService;
	@Resource
	private MediaService mediaService;
	@Resource
	PhotoPopulator photoPopulator;

	@Resource(name = "catalogVersionService")
	private CatalogVersionService catalogVersionService;

	public ImageData uploadImage(final MultipartFile file)
	{
		final MediaModel mediaModel = createMedia(file);
		final ImageData imageData = new ImageData();
		photoPopulator.populate(mediaModel, imageData);
		return imageData;
	}

	public MediaModel createMedia(final MultipartFile file)
	{
		final MediaModel mediaModel = modelService.create(MediaModel.class);
		buildMediaModel(mediaModel, file);
		return mediaModel;
	}

	private void buildMediaModel(final MediaModel mediaModel, final MultipartFile file)
	{
		mediaModel.setCode(UUID.randomUUID().toString());
		mediaModel.setRealFileName(file.getOriginalFilename());
		mediaModel.setAltText(
				StringUtils.substring(file.getOriginalFilename(), 0, StringUtils.lastIndexOf(file.getOriginalFilename(), ".")));
		mediaModel.setCatalogVersion(buildCatalogForUploadMedia());
		mediaModel.setFolder(buildMediaFolderForUploadingFiles());

		modelService.save(mediaModel);
		try
		{
			mediaService.setStreamForMedia(mediaModel, file.getInputStream());
		}
		catch (MediaIOException | IllegalArgumentException | IOException e)
		{
			LOG.error(e.getMessage());
		}
	}

	private CatalogVersionModel buildCatalogForUploadMedia()
	{
		final CatalogVersionModel uploadCatalogVersionModel = getCatalogForUploading();

		if (uploadCatalogVersionModel == null)
		{
			return __buildCatalogForUploading();
		}
		return uploadCatalogVersionModel;
	}

	private CatalogVersionModel __buildCatalogForUploading()
	{
		final CatalogModel catalog = this.modelService.create(CatalogModel.class);
		catalog.setId(UPLOADFILE_CATALOG);
		this.modelService.save(catalog);

		final CatalogVersionModel catalogVersion = modelService.create(CatalogVersionModel.class);
		catalogVersion.setVersion(UPLOADFILE_CATALOGVERSION_VERSION);
		catalogVersion.setCatalog(catalog);
		modelService.save(catalogVersion);

		return getCatalogForUploading();

	}

	private CatalogVersionModel getCatalogForUploading()
	{
		CatalogVersionModel uploadCatalogVersionModel = null;
		try
		{
			uploadCatalogVersionModel = catalogVersionService.getCatalogVersion(UPLOADFILE_CATALOG,
					UPLOADFILE_CATALOGVERSION_VERSION);
		}
		catch (final Exception e)
		{
			LOG.info("The file uploading catalog is not created.");
		}
		return uploadCatalogVersionModel;

	}

	private MediaFolderModel buildMediaFolderForUploadingFiles()
	{
		MediaFolderModel mediaFolder = null;
		try
		{
			mediaFolder = mediaService.getFolder(UPLOAD_MEDIA_FOLDER);
			if (LOG.isDebugEnabled())
			{
				LOG.debug("generateFile() - Save MediaModel - mediaFolder:" + UPLOAD_MEDIA_FOLDER + " is exists.");
			}
		}
		catch (final UnknownIdentifierException e)
		{
			if (LOG.isDebugEnabled())
			{
				LOG.debug("generateFile() - Save MediaModel - mediaFolder:" + UPLOAD_MEDIA_FOLDER
						+ " don't exists, prepare to create it.");
			}
			mediaFolder = new MediaFolderModel();
			mediaFolder.setQualifier(UPLOAD_MEDIA_FOLDER);
			mediaFolder.setPath(UPLOAD_MEDIA_FOLDER);
			modelService.save(mediaFolder);
			if (LOG.isDebugEnabled())
			{
				LOG.debug("generateFile() - Save MediaModel - mediaFolder:" + UPLOAD_MEDIA_FOLDER + " has been created successful.");
			}
		}
		return mediaFolder;
	}
}
