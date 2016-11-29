package com.cnk.travelogix.common.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.util.GlobalMessages;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cnk.travelogix.common.storefront.forms.ServiceOrderSearchForm;
import com.cnk.travelogix.operations.data.ServiceOrderData;
import com.cnk.travelogix.operations.data.ServiceOrderSearchParameterData;
import com.cnk.travelogix.operations.facades.ServiceOrderFacade;


/**
 *
 * Controller for Service Order functionality
 */
@Controller
@Scope("tenant")
@RequestMapping("/serviceorder")
public class ServiceOrderPageController extends AbstractSearchPageController
{
	private static final Logger LOG = Logger.getLogger(ServiceOrderPageController.class);

	@Resource(name = "serviceOrderFacade")
	private ServiceOrderFacade serviceOrderFacade;

	private static final String SERVICE_ORDER_SEARCH_PAGE = "serviceOrderSearchPage";

	private Map<String, Object> init()
	{
		Map<String, Object> commonAttribute = new HashedMap<>();
		commonAttribute.put("serviceOrderType", serviceOrderFacade.getServiceOrderTypes());
		return commonAttribute;
	}

	/**
	 * @param model
	 * @return String view page
	 * @throws CMSItemNotFoundException
	 */
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(final Model model) throws CMSItemNotFoundException
	{
		model.addAllAttributes(init());
		final ServiceOrderSearchForm serviceOrderSearchForm = new ServiceOrderSearchForm();
		model.addAttribute("serviceOrderSearchForm", serviceOrderSearchForm);

		storeCmsPageInModel(model, getContentPageForLabelOrId(SERVICE_ORDER_SEARCH_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(SERVICE_ORDER_SEARCH_PAGE));

		return getViewForPage(model);
	}

	/**
	 * @param serviceOrderSearchForm
	 * @param result
	 * @param model
	 * @param redirectModel
	 * @param page
	 * @param pageSize
	 * @param showMode
	 * @param sortCode
	 * @return String view page
	 * @throws CMSItemNotFoundException
	 */
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String searchResults(final ServiceOrderSearchForm serviceOrderSearchForm, final BindingResult result, final Model model,
			final RedirectAttributes redirectModel, @RequestParam(value = "page", defaultValue = "0") int page,
			@RequestParam(value = "pageSize", defaultValue = "10") int pageSize,
			@RequestParam(value = "show", defaultValue = "Page") final ShowMode showMode,
			@RequestParam(value = "sort", required = false) final String sortCode) throws CMSItemNotFoundException
	{
		if (result.hasErrors())
		{
			for (ObjectError error : result.getAllErrors())
			{
				LOG.error(error.getCode() + ": " + error.getDefaultMessage());
			}
			GlobalMessages.addFlashMessage(redirectModel, GlobalMessages.CONF_MESSAGES_HOLDER,
					"serviceOrder.search.processingError");
		}
		if (serviceOrderSearchForm.getPageSize() != 0)
		{
			pageSize = serviceOrderSearchForm.getPageSize();
		}

		final PageableData pageableData = createPageableData(page, pageSize, sortCode, showMode);
		final ServiceOrderSearchParameterData serviceOrderSearchData = populateSearchData(serviceOrderSearchForm);
		final SearchPageData<ServiceOrderData> searchPageData = getServiceOrderFacade().searchServiceOrders(serviceOrderSearchData,
				pageableData);
		if (searchPageData == null)
		{
			GlobalMessages.addFlashMessage(redirectModel, GlobalMessages.CONF_MESSAGES_HOLDER, "serviceOrder.record.norecord.found");
		}
		model.addAllAttributes(init());
		model.addAttribute("serviceOrderSearchForm", serviceOrderSearchForm);
		model.addAttribute("searchPageData", searchPageData);

		storeCmsPageInModel(model, getContentPageForLabelOrId(SERVICE_ORDER_SEARCH_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(SERVICE_ORDER_SEARCH_PAGE));

		return getViewForPage(model);
	}

	/**
	 * @param serviceOrderSearchForm
	 * @return ServiceOrderSearchParameterData
	 */
	private ServiceOrderSearchParameterData populateSearchData(ServiceOrderSearchForm serviceOrderSearchForm)
	{
		final ServiceOrderSearchParameterData serviceOrderSearchData = new ServiceOrderSearchParameterData();

		serviceOrderSearchData.setServiceOrderType(serviceOrderSearchForm.getServiceOrderType());
		serviceOrderSearchData.setServiceOrderId(serviceOrderSearchForm.getServiceOrderId());
		serviceOrderSearchData.setSupplierName(serviceOrderSearchForm.getSupplierName());
		serviceOrderSearchData.setSupplierId(serviceOrderSearchForm.getSupplierId());
		serviceOrderSearchData.setSupplierCurrency(serviceOrderSearchForm.getSupplierCurrency());
		serviceOrderSearchData.setSupplierSettlementStatus(serviceOrderSearchForm.getSupplierSettlementStatus());
		serviceOrderSearchData.setSupplierBillPassingStatus(serviceOrderSearchForm.getSupplierBillPassingStatus());
		serviceOrderSearchData.setProductCategory(serviceOrderSearchForm.getProductCategory());
		serviceOrderSearchData.setProductCategorySubType(serviceOrderSearchForm.getProductCategorySubType());
		serviceOrderSearchData.setProductName(serviceOrderSearchForm.getProductName());
		serviceOrderSearchData.setBookingRefNumber(serviceOrderSearchForm.getBookingRefNumber());
		serviceOrderSearchData.setEticketId(serviceOrderSearchForm.getEticketId());
		serviceOrderSearchData.setPassengerName(serviceOrderSearchForm.getPassengerName());
		serviceOrderSearchData.setSearchDateType(serviceOrderSearchForm.getSearchDateType());
		serviceOrderSearchData.setFromDate(serviceOrderSearchForm.getFromDate());
		serviceOrderSearchData.setToDate(serviceOrderSearchForm.getToDate());

		return serviceOrderSearchData;
	}

	/**
	 * @return the serviceOrderFacade
	 */
	public ServiceOrderFacade getServiceOrderFacade()
	{
		return serviceOrderFacade;
	}

	/**
	 * @param serviceOrderFacade
	 *           the serviceOrderFacade to set
	 */
	public void setServiceOrderFacade(ServiceOrderFacade serviceOrderFacade)
	{
		this.serviceOrderFacade = serviceOrderFacade;
	}
}
