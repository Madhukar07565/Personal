/**
 * 
 */
package com.cnk.travelogix.common.storefront.controllers.pages;

import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.commercefacades.order.OrderFacade;
import de.hybris.platform.commercefacades.order.data.OrderData;
import de.hybris.platform.commercefacades.product.data.CategoryData;
import de.hybris.platform.core.model.order.OrderModel;

import java.io.UnsupportedEncodingException;

import java.util.ArrayList;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cnk.travelogix.common.storefront.controllers.form.SearchFilterForm;
import com.cnk.travelogix.operations.data.BusinessUnitData;
import com.cnk.travelogix.operations.data.CompanyData;
import com.cnk.travelogix.operations.data.GroupCompanyData;
import com.cnk.travelogix.operations.data.GroupOfCompaniesData;
import com.cnk.travelogix.operations.data.MarketData;
import com.cnk.travelogix.operations.data.SavedQueryData;
import com.cnk.travelogix.operations.data.SearchFilterData;
import com.cnk.travelogix.operations.data.StrategicBusinessUnitData;
import com.cnk.travelogix.operations.employee.data.EmployeeData;
import com.cnk.travelogix.operations.facades.OrderListFacade;
import com.cnk.travelogix.operations.facades.TimeLimitBookingFacade;


/**
 * @author C5244545
 *
 */

@Controller
@RequestMapping(value = "/order")
public class TravelogixOrderPageController extends AbstractSearchPageController
{
	private static final Logger LOG = Logger.getLogger(TravelogixOrderPageController.class);
	private static final String SEARCH_VIEW_FILTER_BOOKING_CMS_PAGE = "cnkSearchViewFilterBookingPage";

	private static final String ORDER_CODE_PATH_VARIABLE_PATTERN = "/{orderCode}";
	private static final String BOOKING_DETAILS_CMS_PAGE = "cnkBookingDetailsPage";
	public static final String SAVED_QUERY_PATTERN = "/order/searchview";
	private static final String SAVED_QUERY_CODE_PATH_VARIABLE_PATTERN = "/{savedQueryCode}";

	@Resource(name = "orderListFacade")
	private OrderListFacade orderListFacade;

	@Resource(name = "orderFacade")
	private OrderFacade orderFacade;

	@Resource(name = "timeLimitBookingFacade")
	TimeLimitBookingFacade timeLimitBookingFacade;

	/**
	 * This method for displaying SearchView page with Dynamic orders
	 * 
	 * @return String
	 * @throws CMSItemNotFoundException
	 */
	@RequestMapping(value = "/searchview", method = RequestMethod.GET)
	public String getSearchViewPage(final Model model, @ModelAttribute("searchFilterForm") SearchFilterForm searchFilterForm)
			throws CMSItemNotFoundException
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("getSearchViewPage()------------called");
		}

		//List<OrderData> orderList = orderListFacade.getListOfOrders();
		List<SavedQueryData> savedQueryList = orderListFacade.getSavedQueriesByEmployee();
		Map<String, String> bookingPriorityValues = orderListFacade.getBookingPriorityEnumValues();
		Map<String, String> bookingStatusValues = orderListFacade.getBookingStatusEnumValues();
		Map<String, String> bookingTypeValues = orderListFacade.getBookingTypeEnumValues();

		List<GroupOfCompaniesData> groupOfCompaniesData = orderListFacade.getGroupOfCompanies();
		List<GroupCompanyData> groupCompaniesData = orderListFacade.getGroupCompanies();
		List<CompanyData> companiesData = orderListFacade.getCompanies();
		List<MarketData> marketsData = orderListFacade.getMarkets();

		List<StrategicBusinessUnitData> sbuDatas = orderListFacade.getStrategicBusinessUnits();
		List<BusinessUnitData> buDatas = orderListFacade.getBusinessUnits();

		Map<String, String> clientTypeMap = orderListFacade.getClientTypeEnumValues();
		Map<String, String> clientCategoryMap = orderListFacade.getClientCategoryEnumValues();
		Map<String, String> clientSubCategoryMap = orderListFacade.getClientSubCategoryEnumValues();

		final Map<CategoryData, List<CategoryData>> categoriesMap = orderListFacade.getProductCategoryAndSubCategory();

		model.addAttribute("savedQueryList", savedQueryList);
		model.addAttribute("searchFilterForm", new SearchFilterForm());
		model.addAttribute("bookingPriorityValues", bookingPriorityValues);
		model.addAttribute("bookingStatusValues", bookingStatusValues);
		model.addAttribute("bookingTypeValues", bookingTypeValues);

		model.addAttribute("groupOfCompaniesData", groupOfCompaniesData);
		model.addAttribute("groupCompaniesData", groupCompaniesData);
		model.addAttribute("companiesData", companiesData);
		model.addAttribute("marketsData", marketsData);
		model.addAttribute("sbuDatas", sbuDatas);
		model.addAttribute("buDatas", buDatas);

		model.addAttribute("categoriesMap", categoriesMap);

		model.addAttribute("clientTypeMap", clientTypeMap);
		model.addAttribute("clientCategoryMap", clientCategoryMap);
		model.addAttribute("clientSubCategoryMap", clientSubCategoryMap);

		storeCmsPageInModel(model, getContentPageForLabelOrId(SEARCH_VIEW_FILTER_BOOKING_CMS_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(SEARCH_VIEW_FILTER_BOOKING_CMS_PAGE));

		return getViewForPage(model);
	}


	@RequestMapping(value = "/searchResult", method = RequestMethod.POST)
	public String getSearchResultPage(Model model, @ModelAttribute("searchFilterForm") SearchFilterForm searchFilterForm)
			throws CMSItemNotFoundException
	{

		if (LOG.isDebugEnabled())
		{
			LOG.debug("getSearchResultPage() called...!");
		}

		storeCmsPageInModel(model, getContentPageForLabelOrId(SEARCH_VIEW_FILTER_BOOKING_CMS_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(SEARCH_VIEW_FILTER_BOOKING_CMS_PAGE));
		model.addAttribute("searchFilterForm", new SearchFilterForm());

		return getViewForPage(model);
	}

	@RequestMapping(value = "/" + ORDER_CODE_PATH_VARIABLE_PATTERN, method = RequestMethod.GET)
	public String orderDetail(@PathVariable("orderCode") final String orderCode, final Model model)
			throws CMSItemNotFoundException, UnsupportedEncodingException
	{

		storeCmsPageInModel(model, getContentPageForLabelOrId(BOOKING_DETAILS_CMS_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(BOOKING_DETAILS_CMS_PAGE));

		OrderData orderData = orderListFacade.getOrdersForCode(orderCode);
		model.addAttribute("orderData", orderData);

		return getViewForPage(model);
	}

	@RequestMapping(value = "/saved-query", method = RequestMethod.POST)
	public String createSavedQuery(@ModelAttribute("searchFilterForm") SearchFilterForm searchFilterForm)
	{
		String bookingDateFrom = null;
		if (LOG.isDebugEnabled())
		{
			LOG.debug("createSavedQuery() called...!");
		}
		SearchFilterData searchFilterData = new SearchFilterData();
		searchFilterData.setBookingRefNumber(searchFilterForm.getBookingRefNumber());
		searchFilterData.setAssignment(searchFilterForm.getAssignment());
		searchFilterData.setUserName(searchFilterForm.getUserName());
		searchFilterData.setFinancialControlId(searchFilterForm.getFinancialControlId());
		bookingDateFrom = searchFilterForm.getBookingDateFrom();
		if (null != bookingDateFrom && !bookingDateFrom.isEmpty())
		{
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			try
			{
				Date  date = dateFormat.parse(bookingDateFrom);
				searchFilterData.setBookingDateFrom(dateFormat.format(date));
			}
			catch (ParseException e)
			{
				LOG.error("Exception occured while formating date : " + e.getMessage(), e);
			}
		}

		searchFilterData.setUserName(searchFilterForm.getUserName());

		searchFilterData.setMarketUid(searchFilterForm.getMarketUid());
		searchFilterData.setCompanyUid(searchFilterForm.getCompanyUid());
		searchFilterData.setGroupCompanyUid(searchFilterForm.getGroupCompanyUid());
		searchFilterData.setGroupOfCompanyUid(searchFilterForm.getGroupOfCompanyUid());

		searchFilterData.setTravellerName(searchFilterForm.getTravellerName());
		searchFilterData.setTravellerPhoneNumber(searchFilterForm.getTravellerPhoneNumber());
		searchFilterData.setTravellerEmailId(searchFilterForm.getTravellerEmailId());

		searchFilterData.setSavedQueryName(searchFilterForm.getSavedQueryName());
		orderListFacade.createSavedQuery(searchFilterData);

		return REDIRECT_PREFIX + SAVED_QUERY_PATTERN;
	}

	@ResponseBody
	@RequestMapping(value = "/check-saved-query", method = RequestMethod.GET)
	public int checkSavedQuery(@RequestParam("name") String savedQueryName)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("checkSavedQuery() called wiht saved query name : " + savedQueryName);
		}
		return orderListFacade.getSavedQueriesCount(savedQueryName);
	}

	@RequestMapping(value = "/saved-query/" + SAVED_QUERY_CODE_PATH_VARIABLE_PATTERN, method = RequestMethod.GET)
	public String getSavedQueryResult(@PathVariable("savedQueryCode") String savedQueryCode, RedirectAttributes redirectModel)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("getSavedQueryResult() called.....with savedQueryCode" + savedQueryCode);
		}

		List<OrderData> orderDataList = null;
		try
		{
			orderDataList = orderListFacade.getBookingDetailsBySavedQuery(savedQueryCode);
			LOG.debug("orderDataList size : " + orderDataList.size());
		}
		catch (Exception e)
		{
			LOG.error("Exception occured while calling getSavedQueryResult - " + e.getMessage(), e);
		}
		redirectModel.addFlashAttribute("orderDataList", orderDataList);

		return REDIRECT_PREFIX + SAVED_QUERY_PATTERN;
	}

	@ResponseBody
	@RequestMapping(value = "/product-sub-categories", method = RequestMethod.GET)
	public List<CategoryData> getProductSubCategories(@RequestParam("categoryCode") String categoryCode)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("getProductSubCategories called with category code " + categoryCode);
		}
		List<CategoryData> categoryDatas = null;
		try
		{
			categoryDatas = orderListFacade.getProductSubCategories(categoryCode);
		}
		catch (Exception e)
		{
			LOG.error("Exception occured while calling getProductSubCategories with code - " + categoryCode + e.getMessage(), e);
		}

		return categoryDatas;
	}

	/**
	 * method to update timeLimit booking
	 * 
	 * @throws ParseException
	 */
	@ResponseBody
	@RequestMapping(value = "/" + ORDER_CODE_PATH_VARIABLE_PATTERN + "/updateTimeLimit", method = RequestMethod.GET, produces =
	{ MediaType.APPLICATION_JSON })
	public void updateTimeLimit(@PathVariable("orderCode") final String orderCode, @RequestParam("updatedDate") String updatedDate)
			throws ParseException
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("Update Time Limit Updated Date is" + updatedDate);
		}
		if (orderCode != null && updatedDate != null)
		{
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Date date = new Date();
			date = df.parse(updatedDate);
			timeLimitBookingFacade.updateTimeLimit(orderCode, date);
		}
	}

}

