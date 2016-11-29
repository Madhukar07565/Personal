/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package com.cnk.travelogix.b2c.storefront.controllers.pages.checkout.steps.ezg;

import de.hybris.platform.acceleratorstorefrontcommons.annotations.PreValidateCheckoutStep;
import de.hybris.platform.acceleratorstorefrontcommons.annotations.RequireHardLogIn;
import de.hybris.platform.acceleratorstorefrontcommons.checkout.steps.CheckoutStep;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.checkout.steps.AbstractCheckoutStepController;
import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.catalog.model.CatalogModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.platform.commercefacades.order.data.CartData;
import de.hybris.platform.core.model.media.MediaFolderModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.media.impl.DefaultMediaService;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.jgroups.util.UUID;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cnk.travelogix.b2c.facades.order.B2cCartFacade;
import com.cnk.travelogix.b2c.storefront.controllers.ControllerConstants;


@Controller
@RequestMapping(value = "/checkout/multi/upload-docs")
public class UploadDocumentsCheckoutStepController extends AbstractCheckoutStepController
{
	private static final Logger LOG = Logger.getLogger(UploadDocumentsCheckoutStepController.class);

	public static final String EZG_B2C_CART_CMS_PAGE_LABEL = "ezgb2ccartpage";
	private static final String UPLOAD_DOCUMENTS = "upload-documents";
	private static final String UPLOADFILE_CATALOG = "upload_file_catalog";
	private static final String UPLOADFILE_CATALOGVERSION_VERSION = "online";
	private static final String UPLOAD_MEDIA_FOLDER = "EZG_UPLOAD_DOCUMENT";

	@Resource
	private ModelService modelService;

	@Resource(name = "b2cCartFacade")
	private B2cCartFacade b2cCartFacade;
	@Resource
	private DefaultMediaService mediaService;

	@Resource(name = "catalogVersionService")
	private CatalogVersionService catalogVersionService;

	@RequestMapping(method = RequestMethod.POST)
	@RequireHardLogIn
	public String nextSection(final Model model, final RedirectAttributes redirectModel) throws CMSItemNotFoundException
	{
		return getCheckoutStep().nextStep();
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	@RequireHardLogIn
	@ResponseBody
	public Map add(@RequestParam final MultipartFile[] uploadFiles, final Model model) throws CMSItemNotFoundException
	{
		final Map map = new HashMap();
		//		if (bindingErrors.hasErrors())
		//		{
		//			map.put("status", "upload-failed");
		//			map.put("errors", bindingErrors);
		//			return map;
		//		}
		try
		{
			if (uploadFiles != null && uploadFiles.length > 0)
			{
				for (final MultipartFile uploadFile : uploadFiles)
				{
					if (uploadFile != null && !uploadFile.isEmpty())
					{
						final CatalogVersionModel catalogVersion = this.buildCatalogForUploadMedia();

						final MediaModel media = modelService.create(MediaModel.class);
						media.setCode(uploadFile.getOriginalFilename() + UUID.randomUUID());
						media.setCatalogVersion(catalogVersion);
						media.setFolder(mediaService.getRootFolder());

						modelService.save(media);

						final MediaFolderModel mediaFolderModel = this.buildMediaFolderForUploadingFiles();

						mediaService.setStreamForMedia(media, uploadFile.getInputStream(), uploadFile.getOriginalFilename(), "",
								mediaFolderModel);

					}
				}
			}
			else
			{
				{
					map.put("msg", "error");
					map.put("status", "success");
					return map;
				}
			}
		}
		catch (final Exception e)
		{
			e.printStackTrace();
		}
		map.put("status", "upload-success");
		return map;
	}

	@RequestMapping(method = RequestMethod.GET)
	@RequireHardLogIn
	@Override
	@PreValidateCheckoutStep(checkoutStep = UPLOAD_DOCUMENTS)
	public String enterStep(final Model model, final RedirectAttributes redirectAttributes) throws CMSItemNotFoundException
	{
		final CartData cartData = b2cCartFacade.getSessionCartWithEntryOrdering(true);
		model.addAttribute("cartData", cartData);
		final ContentPageModel contentPage = getContentPageForLabelOrId(EZG_B2C_CART_CMS_PAGE_LABEL);
		storeCmsPageInModel(model, contentPage);
		setUpMetaDataForContentPage(model, contentPage);
		model.addAttribute("section", ControllerConstants.Views.Pages.MultiStepCheckout.Ezeego.CART_UPLOADDOCS);
		//TODO
		return ControllerConstants.Views.Pages.Cart.EzgCartPage;

		//return ControllerConstants.Views.Pages.MultiStepCheckout.Ezeego.UploadDocumentsPage;
	}

	/**
	 * This method gets called when the "Use Selected Delivery Method" button is clicked. It sets the selected delivery
	 * mode on the checkout facade and reloads the page highlighting the selected delivery Mode.
	 *
	 * @param selectedDeliveryMethod
	 *           - the id of the delivery mode.
	 * @return - a URL to the page to load.
	 */
	@RequestMapping(value = "/select", method = RequestMethod.GET)
	@RequireHardLogIn
	public String doSelectDeliveryMode(@RequestParam("delivery_method") final String selectedDeliveryMethod)
	{


		return getCheckoutStep().nextStep();
	}

	@RequestMapping(value = "/back", method = RequestMethod.GET)
	@RequireHardLogIn
	@Override
	public String back(final RedirectAttributes redirectAttributes)
	{
		return getCheckoutStep().previousStep();
	}

	@RequestMapping(value = "/next", method = RequestMethod.GET)
	@RequireHardLogIn
	@Override
	public String next(final RedirectAttributes redirectAttributes)
	{
		return getCheckoutStep().nextStep();
	}

	protected CheckoutStep getCheckoutStep()
	{
		return getCheckoutStep(UPLOAD_DOCUMENTS);
	}

	private CatalogVersionModel buildCatalogForUploadMedia()
	{
		CatalogVersionModel uploadCatalogVersionModel = null;
		try
		{
			uploadCatalogVersionModel = catalogVersionService.getCatalogVersion(
					UploadDocumentsCheckoutStepController.UPLOADFILE_CATALOG,
					UploadDocumentsCheckoutStepController.UPLOADFILE_CATALOGVERSION_VERSION);
		}
		catch (final Exception e)
		{
			LOG.info("The file uploading catalog is not created.");
		}
		if (uploadCatalogVersionModel == null)
		{
			final CatalogModel catalog = this.modelService.create(CatalogModel.class);
			catalog.setId(UploadDocumentsCheckoutStepController.UPLOADFILE_CATALOG);
			this.modelService.save(catalog);

			final CatalogVersionModel catalogVersion = modelService.create(CatalogVersionModel.class);
			catalogVersion.setVersion(UploadDocumentsCheckoutStepController.UPLOADFILE_CATALOGVERSION_VERSION);
			catalogVersion.setCatalog(catalog);
			modelService.save(catalogVersion);
		}
		return uploadCatalogVersionModel;
	}

	private MediaFolderModel buildMediaFolderForUploadingFiles()
	{
		MediaFolderModel mediaFolder = null;
		try
		{
			mediaFolder = mediaService.getFolder(UploadDocumentsCheckoutStepController.UPLOAD_MEDIA_FOLDER);
			if (LOG.isDebugEnabled())
			{
				LOG.debug("generateFile() - Save MediaModel - mediaFolder:"
						+ UploadDocumentsCheckoutStepController.UPLOAD_MEDIA_FOLDER + " is exists.");
			}
		}
		catch (final UnknownIdentifierException e)
		{
			if (LOG.isDebugEnabled())
			{
				LOG.debug("generateFile() - Save MediaModel - mediaFolder:"
						+ UploadDocumentsCheckoutStepController.UPLOAD_MEDIA_FOLDER + " don't exists, prepare to create it.");
			}
			mediaFolder = new MediaFolderModel();
			mediaFolder.setQualifier(UploadDocumentsCheckoutStepController.UPLOAD_MEDIA_FOLDER);
			mediaFolder.setPath(UploadDocumentsCheckoutStepController.UPLOAD_MEDIA_FOLDER);
			modelService.save(mediaFolder);
			if (LOG.isDebugEnabled())
			{
				LOG.debug("generateFile() - Save MediaModel - mediaFolder:"
						+ UploadDocumentsCheckoutStepController.UPLOAD_MEDIA_FOLDER + " has been created successful.");
			}
		}
		return mediaFolder;
	}
}
