package com.cnk.travelogix.common.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.util.GlobalMessages;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.commercefacades.order.OrderFacade;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.enumeration.EnumerationService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cnk.travelogix.common.core.enums.DateType;
import com.cnk.travelogix.common.core.enums.EntityType;
import com.cnk.travelogix.common.core.enums.ReceiptStatus;
import com.cnk.travelogix.common.core.enums.ReceiptType;
import com.cnk.travelogix.common.storefront.forms.ReceiptSearchForm;
import com.cnk.travelogix.operations.data.EnumerationDto;
import com.cnk.travelogix.operations.data.TravelogixClientDetailsData;
import com.cnk.travelogix.operations.data.TravelogixPaymentReceiptData;
import com.cnk.travelogix.operations.facades.TravelogixCommonDataFacade;
import com.cnk.travelogix.operations.facades.impl.DefaultTravelogixPaymentReceiptFacade;
import com.google.gson.Gson;


/**
 * The Implementation of receipt controller.
 *
 */
@Controller
@Scope("tenant")
@RequestMapping(value = "/receipt")
public class ReceiptPageController extends AbstractSearchPageController
{
	private static final Logger LOG = Logger.getLogger(ReceiptPageController.class);

	private static final String RECEIPT_CMS_PAGE = "receipt";

	private static final String ISSUE_RECEIPT_CMS_PAGE = "issuereceipt";

	private static Map<String, Object> commonAttribute = new HashedMap<>();

	@Resource
	private DefaultTravelogixPaymentReceiptFacade travelogixPaymentReceiptFacade;

	@Resource
	private TravelogixCommonDataFacade travelogixCommonDataFacade;

	@Resource
	private EnumerationService enumerationService;

	@Resource
	OrderFacade orderFacade;

	final Gson gson = new Gson();

	private void init()
	{
		commonAttribute.put("entityTypes", gson.toJson(getEntityTypes()));
		commonAttribute.put("clientTypes", gson.toJson(travelogixCommonDataFacade.getClientTypes()));
		commonAttribute.put("clientCategories", gson.toJson(travelogixCommonDataFacade.getClientCategory()));
		commonAttribute.put("clientSubCategories", gson.toJson(travelogixCommonDataFacade.getClientSubCategory()));
		commonAttribute.put("receiptStatus", gson.toJson(getReceiptStatus()));
		commonAttribute.put("dateType", gson.toJson(getDateType()));
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String getReceipt(final Model model) throws CMSItemNotFoundException
	{
		init();
		model.addAllAttributes(commonAttribute);
		storeCmsPageInModel(model, getCmsPageService().getPageForId(RECEIPT_CMS_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(RECEIPT_CMS_PAGE));
		ReceiptSearchForm receiptForm = new ReceiptSearchForm();
		model.addAttribute("receiptForm", receiptForm);

		return getViewForPage(model);
	}

	/**
	 * The search functionality
	 * 
	 * @param model
	 * @return String
	 * @throws CMSItemNotFoundException
	 */
	@ResponseBody
	@RequestMapping(value = "/search", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public SearchPageData<TravelogixPaymentReceiptData> searchReceiptResults(@RequestBody final ReceiptSearchForm receiptForm,
			final Model model, @RequestParam(value = "page", defaultValue = "0") int page,
			@RequestParam(value = "size", defaultValue = "10") int size,
			@RequestParam(value = "show", defaultValue = "Page") final ShowMode showMode,
			@RequestParam(value = "sort", required = false) final String sortCode) throws CMSItemNotFoundException
	{
		init();
		storeCmsPageInModel(model, getCmsPageService().getPageForId(RECEIPT_CMS_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(RECEIPT_CMS_PAGE));
		final PageableData pageableData = createPageableData(page, size, sortCode, showMode);
		SearchPageData<TravelogixPaymentReceiptData> searchPageData = null;
		try
		{
			searchPageData = travelogixPaymentReceiptFacade.searchReceipts(populateSearchData(receiptForm), pageableData);
			if (searchPageData == null)
			{
				GlobalMessages.addErrorMessage(model, "receipt.error.noresults");
			}
		}
		catch (Exception exception)
		{
			LOG.error("Error! in fetching search data results: " + exception);
		}
		model.addAllAttributes(commonAttribute);

		return searchPageData;
	}

	private TravelogixPaymentReceiptData populateSearchData(final ReceiptSearchForm receiptForm)
	{
		final TravelogixPaymentReceiptData receiptData = new TravelogixPaymentReceiptData();
		receiptData.setReceiptType(receiptForm.getReceiptType());
		receiptData.setReferenceId(receiptForm.getReferenceId());
		receiptData.setReceiptNumber(receiptForm.getReceiptNumber());

		TravelogixClientDetailsData travelogixClientDetailsData = new TravelogixClientDetailsData();
		travelogixClientDetailsData.setClientType(receiptForm.getClientType());
		travelogixClientDetailsData.setClientCategory(receiptForm.getClientCategory());
		travelogixClientDetailsData.setClientSubCategory(receiptForm.getClientSubCategory());
		travelogixClientDetailsData.setClientName(receiptForm.getClientName());

		receiptData.setTravelogixClientDetailsData(travelogixClientDetailsData);
		receiptData.setPassengerName(receiptForm.getPassengerName());
		receiptData.setReceiptStatus(receiptForm.getReceiptStatus());
		receiptData.setReceiptCreationDate(receiptForm.getFromDate());
		receiptData.setToDate(receiptForm.getToDate());
		return receiptData;
	}

	public List<EnumerationDto> getEntityTypes()
	{
		final List<EnumerationDto> dtos = new ArrayList<>();
		final List<EntityType> enumTypes = enumerationService.getEnumerationValues(EntityType._TYPECODE);
		for (final EntityType enumType : enumTypes)
		{
			final EnumerationDto dto = new EnumerationDto();
			dto.setCode(enumType.getCode());
			dto.setName(enumerationService.getEnumerationName(enumType));
			dtos.add(dto);
		}
		return dtos;
	}


	@ModelAttribute(value = "receiptType")
	public List<EnumerationDto> getReceiptType()
	{
		List<EnumerationDto> supplierReceipt = new ArrayList<>();
		List<EnumerationDto> clientReceipt = new ArrayList<>();
		final List<EnumerationDto> dtos = new ArrayList<>();
		final List<ReceiptType> enumTypes = enumerationService.getEnumerationValues(ReceiptType._TYPECODE);
		for (final ReceiptType enumType : enumTypes)
		{
			final EnumerationDto dto = new EnumerationDto();
			dto.setCode(enumType.getCode());
			dto.setName(enumerationService.getEnumerationName(enumType));
			if (enumType.equals(ReceiptType.EXTERNAL_SUPPLIER_RECEIPT.toString())
					|| enumType.equals(ReceiptType.INTERNAL_SUPPLIER_RECEIPT.toString()))
			{
				supplierReceipt.add(dto);
				return supplierReceipt;
			}
			else
			{
				clientReceipt.add(dto);
				return clientReceipt;
			}
		}
		return dtos;
	}

	@ModelAttribute(value = "receiptStatus")
	public List<EnumerationDto> getReceiptStatus()
	{
		final List<EnumerationDto> dtos = new ArrayList<>();
		final List<ReceiptStatus> enumTypes = enumerationService.getEnumerationValues(ReceiptStatus._TYPECODE);
		for (final ReceiptStatus enumType : enumTypes)
		{
			final EnumerationDto dto = new EnumerationDto();
			dto.setCode(enumType.getCode());
			dto.setName(enumerationService.getEnumerationName(enumType));
			dtos.add(dto);
		}
		return dtos;
	}

	@ModelAttribute(value = "dateType")
	public List<EnumerationDto> getDateType()
	{
		final List<EnumerationDto> dtos = new ArrayList<>();
		final List<DateType> enumTypes = enumerationService.getEnumerationValues(DateType._TYPECODE);
		for (final DateType enumType : enumTypes)
		{
			final EnumerationDto dto = new EnumerationDto();
			dto.setCode(enumType.getCode());
			dto.setName(enumerationService.getEnumerationName(enumType));
			dtos.add(dto);
		}
		return dtos;
	}
}