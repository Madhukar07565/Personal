/**
 *
 */
package com.cnk.travelogix.b2c.storefront.controllers.misc;

import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.catalog.model.CatalogModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.commercefacades.product.data.ImageData;
import de.hybris.platform.core.model.media.MediaFolderModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.media.MediaIOException;
import de.hybris.platform.servicelayer.media.MediaService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.util.Config;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.UUID;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.cnk.travelogix.b2c.facades.upload.UploadFileFacade;
import com.cnk.travelogix.b2c.storefront.forms.ResponseMessage;

/**
 * @author i054410
 *
 */
@Controller
@RequestMapping("/fileUpload")
public class FileUploadController
{
	protected static Logger LOG = Logger.getLogger(FileUploadController.class);
	@Resource
	private ModelService modelService;
	@Resource
	private MediaService mediaService;
	@Resource
	private Converter<MediaModel, ImageData> imageConverter;
	@Resource
	private UploadFileFacade uploadFileFacade;

	@Resource(name = "catalogVersionService")
	private CatalogVersionService catalogVersionService;
	@Resource
	private ConfigurationService configurationService;

	public static String CONF_FILE_MAX_SIZE_KEY = "uploading.%s.fileMaxSize";
	public static String CONF_MAX_WIDTH_KEY = "uploading.%s.imageMaxWidth";
	public static String CONF_MAX_HEIGHT_KEY = "uploading.%s.imageMaxHeight";
	public static String CONF_MIN_WIDTH_KEY = "uploading.%s.imageMinWidth";
	public static String CONF_MIN_HEIGHT_KEY = "uploading.%s.imageMinHeight";
	public static String CONF_SUPPORTED_IMAGE = "uploading.supported.image";

	public static String CONF_VALID_FILE_EXTENSIONS = "uploading.validateExtensions";

	
	public static String[] VALID_FILE_EXTENSIONS =
	{ "jpg", "jpeg", "gif", "png" };

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody ResponseMessage uploadFile(@RequestParam final MultipartFile[] uploadFiles,
			@RequestParam(value = "fileType", required = false) final String fileType, final HttpServletRequest request,
			final HttpServletResponse response) throws IOException
	{
		ResponseMessage rm = new ResponseMessage();
		final String fileClass = fileType == null ? "default" : fileType;

		for (final MultipartFile uploadFile : uploadFiles)
		{
			if (uploadFile.isEmpty())
			{
				rm.changeStatus("Error").setMessage("uploaded file is empty");
				break;
			}
			else
			{
				// validation
				rm = this.validateFile(uploadFile, fileClass);
				if (rm.hasError())
				{
					break;
				}
				// save
				return this.uploadMedia(fileClass, uploadFile);
			}
		}
		return rm;
	}

	private ResponseMessage uploadMedia(final String fileType, final MultipartFile uploadFile)
	{
		final ResponseMessage rm = new ResponseMessage();
		final ImageData imageData = uploadFileFacade.uploadImage(uploadFile);
		rm.addInfo("URL", imageData.getUrl());
		rm.addInfo("text", imageData.getAltText());
		rm.addInfo("code", imageData.getCode());

		return rm.changeStatus("OK");
	}

	private ResponseMessage validateFile(final MultipartFile uploadFile, final String fileClass) throws IOException
	{
		final ResponseMessage rm = new ResponseMessage();

		final int maxSize = getMaxFileSize(fileClass);
		String fileType = getFileType(uploadFile);

		//Check for fileType Extension
		if (!isValidFileExtension(fileType))
		{
			return rm.changeStatus("Error").addInfo(uploadFile.getOriginalFilename(), "file type " + fileType + " not supported");
		}
		// size
		if (maxSize > 0 && uploadFile.getInputStream().available() / (1024 * 1024) > maxSize)
		{
			return rm.changeStatus("Error").addInfo(uploadFile.getOriginalFilename(), "file size exceeds limitation");
		}
		//image scale
		if (isImage(fileType) && !isValidateImageFile(uploadFile, fileClass, rm))
		{
			return rm;
		}
		return rm;
	}

	/**
	 * @param uploadFile
	 * @return
	 */
	private String getFileType(final MultipartFile uploadFile)
	{
		final String fileName = uploadFile.getOriginalFilename();

		return fileName.substring(fileName.lastIndexOf(".") + 1);
	}

	/**
	 * Function to verify if the uploaded file is of allowed extensions
	 *
	 * @param originalFilename
	 * @return isFileExtensionValid
	 */
	private boolean isValidFileExtension(final String extension)
	{
		String[] validateExtension = getValidateExtension();

		if (validateExtension.length == 0)
		{
			return true;
		}
		for (int i = 0; i < validateExtension.length; i++)
		{
			if (extension.equalsIgnoreCase(validateExtension[i]))
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * @param uploadFile
	 * @return
	 */
	//	private Map validateVideoFile(final MultipartFile uploadFile)
	//	{
	//		final int videoMaxWidth = Integer.parseInt(Config.getParameter(CONF_VIDEO_MAX_WIDTH_KEY));
	//		final int videoMaxHeight = Integer.parseInt(Config.getParameter(CONF_VIDEO_MAX_HEIGHT_KEY));
	//		final int videoMinWidth = Integer.parseInt(Config.getParameter(CONF_VIDEO_MIN_WIDTH_KEY));
	//		final int videoMinHeight = Integer.parseInt(Config.getParameter(CONF_VIDEO_MIN_HEIGHT_KEY));
	//		final IContainer container = IContainer.make();
	//		try
	//		{
	//			final File file = multipartToFile(uploadFile);
	//			if (file == null)
	//			{
	//				container.close();
	//				return getReturnMap(-1, vmsCommonFacade.getResouceValue(VMSError.VIDEO_PARSE_DAMAGE));
	//			}
	//			final RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
	//			if (container.open(randomAccessFile, IContainer.Type.READ, null) < 0)
	//			{
	//				container.close();
	//				return getReturnMap(-1, vmsCommonFacade.getResouceValue(VMSError.VIDEO_PARSE_DAMAGE));
	//			}
	//			final int numStreams = container.getNumStreams();
	//			int videoStreamId = -1;
	//			IStreamCoder videoCoder = null;
	//			for (int i = 0; i < numStreams; i++)
	//			{
	//				final IStream stream = container.getStream(i);
	//				final IStreamCoder coder = stream.getStreamCoder();
	//				if (coder.getCodecType() == ICodec.Type.CODEC_TYPE_VIDEO)
	//				{
	//					videoStreamId = i;
	//					videoCoder = coder;
	//					break;
	//				}
	//			}
	//			if (videoStreamId == -1)
	//			{
	//				container.close();
	//				return getReturnMap(-1, vmsCommonFacade.getResouceValue(VMSError.VIDEO_PARSE_STREAM));
	//			}
	//			if (videoCoder.open() < 0)
	//			{
	//				container.close();
	//				return getReturnMap(-1, vmsCommonFacade.getResouceValue(VMSError.VIDEO_PARSE_DECODER));
	//			}
	//			final int width = videoCoder.getWidth();
	//			final int height = videoCoder.getHeight();
	//			if (width < videoMinWidth || height < videoMinHeight)
	//			{
	//				container.close();
	//				return getReturnMap(-1, vmsCommonFacade.getResouceValue(VMSError.MINIMUM_DIMENSIONS_VIDEO_ERROR));
	//			}
	//			else if (width > videoMaxWidth || height > videoMaxHeight)
	//			{
	//				container.close();
	//				return getReturnMap(-1, vmsCommonFacade.getResouceValue(VMSError.MAXIMUM_DIMENSIONS_VIDEO_ERROR));
	//			}
	//		}
	//		catch (final Exception e)
	//		{
	//			container.close();
	//			return getReturnMap(-1, vmsCommonFacade.getResouceValue(VMSError.VIDEO_PARSE_ERROR));
	//		}
	//		container.close();
	//		return null;
	//	}

	//	private File multipartToFile(final MultipartFile file)
	//	{
	//		try
	//		{
	//			final File convFile = new File(file.getOriginalFilename());
	//			convFile.createNewFile();
	//			final FileOutputStream fos = new FileOutputStream(convFile);
	//			fos.write(file.getBytes());
	//			fos.close();
	//			return convFile;
	//		}
	//		catch (final IOException e)
	//		{
	//			e.printStackTrace();
	//		}
	//		return null;
	//	}

	//	private boolean isVideoFile(final String fileName)
	//	{
	//		final int dotIndex = fileName.lastIndexOf(".");
	//		if (dotIndex <= 0 || (dotIndex + 1 >= fileName.length()))
	//		{
	//			return false;
	//		}
	//		final String suffix = fileName.substring(dotIndex + 1);
	//		if (suffix.equals("mov") || suffix.equals("wmv") || suffix.equals("avi") || suffix.equals("asf") || suffix.equals("svi"))
	//		{
	//			return true;
	//		}
	//		return false;
	//	}

	private boolean isValidateImageFile(final MultipartFile uploadFile, String fileClass, final ResponseMessage rm)
	{
		boolean isValid = true;
		final int imageMaxWidth = getMaxWidth(fileClass); // PX
		final int imageMaxHeight = getMaxHeight(fileClass); // PX
		final int imageMinWidth = getMinWidth(fileClass); // PX
		final int imageMinHeight = getMinHeight(fileClass); // PX

		if (imageMaxWidth + imageMaxHeight + imageMinWidth + imageMinHeight == 0)
		{
			return isValid;
		}
		BufferedImage image = null;

		try
		{
			image = ImageIO.read(uploadFile.getInputStream());
		}
		catch (IOException e)
		{
			LOG.error(e.getMessage());
			rm.changeStatus("Error").setMessage(e.getMessage());
			return isValid = false;
		}
		if (image == null)
		{
			rm.changeStatus("Error").addInfo(uploadFile.getOriginalFilename(), "image can not be parsed");
			isValid = false;
		}
		if (image.getWidth() < imageMinWidth || image.getHeight() < imageMinHeight)
		{
			rm.changeStatus("Error").addInfo(uploadFile.getOriginalFilename(),
					String.format("size of %s is not match, max width: %s, max height: %s, min width: %s, min height: &s is required",
							uploadFile.getOriginalFilename(), imageMaxWidth + " px", imageMaxHeight + " px", imageMinWidth + " px",
							imageMinHeight + " px"));
			isValid = false;
		}
		else if (image.getWidth() > imageMaxWidth || image.getHeight() > imageMaxHeight)
		{
			rm.changeStatus("Error").addInfo(uploadFile.getOriginalFilename(),
					String.format("size of %s is not match, max width: %s, max height: %s, min width: %s, min height: &s is required",
							uploadFile.getOriginalFilename(), imageMaxWidth + " px", imageMaxHeight + " px", imageMinWidth + " px",
							imageMinHeight + " px"));
			isValid = false;
		}
		return isValid;
	}

	private String getConfig(final String key, final String type)
	{
		return Config.getParameter(String.format(key, type));
	}

	private String[] getValidateExtension()
	{

		final String config =  Config.getParameter(CONF_VALID_FILE_EXTENSIONS);

		if (config != null)
		{
			return config.split(",");
		}

		return new String[] {};
	}

	private int getMaxFileSize(final String fileClass)
	{
		final String config = getConfig(CONF_FILE_MAX_SIZE_KEY, fileClass);

		if (null == config)
		{
			return 0;
		}
		return Integer.parseInt(config);
	}

	private int getMaxWidth(String fileClass)
	{
		final String config = getConfig(CONF_MAX_WIDTH_KEY, fileClass);
		if (null == config)
		{
			return 0;
		}
		return Integer.parseInt(config);
	}

	private int getMinWidth(String fileClass)
	{
		final String config = getConfig(CONF_MIN_WIDTH_KEY, fileClass);
		if (null == config)
		{
			return 0;
		}
		return Integer.parseInt(config);
	}

	private int getMaxHeight(String fileClass)
	{
		final String config = getConfig(CONF_MAX_HEIGHT_KEY, fileClass);
		if (null == config)
		{
			return 0;
		}
		return Integer.parseInt(config);
	}

	private int getMinHeight(String fileClass)
	{
		final String config = getConfig(CONF_MIN_HEIGHT_KEY, fileClass);
		if (null == config)
		{
			return 0;
		}
		return Integer.parseInt(config);
	}

	private boolean isImage(String fileType)
	{
		final String config = Config.getParameter(CONF_SUPPORTED_IMAGE);
		if (config == null)
		{
			return false;
		}
		String[] split = config.split(",");
		for (int i = 0; i < split.length; i++)
		{
			if (fileType.equalsIgnoreCase(split[i]))
			{
				return true;
			}
		}
		return false;
	}

}
