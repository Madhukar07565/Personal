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
package com.cnk.travelogix.b2c.storefront.controllers.pages;

import de.hybris.platform.acceleratorservices.controllers.page.PageType;
import de.hybris.platform.acceleratorservices.customer.CustomerLocationService;
import de.hybris.platform.acceleratorstorefrontcommons.breadcrumb.impl.SearchBreadcrumbBuilder;
import de.hybris.platform.acceleratorstorefrontcommons.constants.WebConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.ThirdPartyConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractSearchPageController;
import de.hybris.platform.acceleratorstorefrontcommons.util.MetaSanitizerUtil;
import de.hybris.platform.acceleratorstorefrontcommons.util.XSSFilterUtil;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.servicelayer.services.CMSComponentService;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.search.ProductSearchFacade;
import de.hybris.platform.commercefacades.search.data.AutocompleteResultData;
import de.hybris.platform.commercefacades.search.data.AutocompleteSuggestionData;
import de.hybris.platform.commercefacades.search.data.SearchQueryData;
import de.hybris.platform.commercefacades.search.data.SearchStateData;
import de.hybris.platform.commerceservices.search.facetdata.FacetData;
import de.hybris.platform.commerceservices.search.facetdata.FacetRefinement;
import de.hybris.platform.commerceservices.search.facetdata.FacetValueData;
import de.hybris.platform.commerceservices.search.facetdata.ProductSearchPageData;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.util.Config;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cnk.travelogix.b2c.facades.audoSuggestion.CitySearchFacade;
import com.cnk.travelogix.common.core.model.EzgSearchBoxComponentModel;
import com.cnk.travelogix.common.facades.autoSuggestion.AutoSuggestionFacade;
import com.cnk.travelogix.common.facades.product.CnkProductCompareFacade;
import com.cnk.travelogix.common.facades.product.CnkProductSearchFacade;
import com.cnk.travelogix.common.facades.product.data.CnkBreadcrumbData;
import com.cnk.travelogix.common.facades.product.data.CnkFacetData;
import com.cnk.travelogix.common.facades.product.data.CnkFacetDataList;
import com.cnk.travelogix.common.facades.product.data.CnkProductSearchPageData;
import com.cnk.travelogix.common.facades.product.data.CnkProductSortConditionData;
import com.cnk.travelogix.common.facades.product.data.CnkSortedDataList;
import com.cnk.travelogix.common.facades.product.data.FlightHotelSearchData;
import com.cnk.travelogix.common.facades.product.data.FlightHotelSearchRoomData;
import com.cnk.travelogix.common.facades.product.data.FlightProductSearchPageData;
import com.cnk.travelogix.common.facades.product.data.HotelSearchData;
import com.cnk.travelogix.common.facades.product.data.hotel.HotelCompareData;
import com.cnk.travelogix.common.facades.product.data.hotel.HotelData;
import com.cnk.travelogix.common.facades.product.data.hotel.HotelMarkerData;
import com.cnk.travelogix.common.facades.product.util.CnkBeanUtil;
import com.sap.security.core.server.csi.XSSEncoder;


@Controller
@Scope("tenant")
@RequestMapping("/search")
public class SearchPageController extends AbstractSearchPageController
{
	private static final String SEARCH_META_DESCRIPTION_ON = "search.meta.description.on";
	private static final String SEARCH_META_DESCRIPTION_RESULTS = "search.meta.description.results";

	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(SearchPageController.class);
	//TODO: delete the static default setting
	static
	{
		LOG.setLevel(Level.DEBUG);
	}
	private static final String COMPONENT_UID_PATH_VARIABLE_PATTERN = "{componentUid:.*}";
	private static final String FACET_SEPARATOR = ":";

	private static final String SEARCH_CMS_PAGE_ID = "search";
	private static final String SEARCH_HOTEL_PAGE_ID = "ezgHotelSearchResultPage";
	private static final String NO_RESULTS_CMS_PAGE_ID = "searchEmpty";

	private static final String VIEW_PAGE_SIZE = Config.getParameter("ezg.storefront.view.pageSize");

	@Resource(name = "productSearchFacade")
	private ProductSearchFacade<ProductData> productSearchFacade;

	@Resource(name = "searchBreadcrumbBuilder")
	private SearchBreadcrumbBuilder searchBreadcrumbBuilder;

	@Resource(name = "customerLocationService")
	private CustomerLocationService customerLocationService;

	@Resource(name = "cmsComponentService")
	private CMSComponentService cmsComponentService;

	@Resource(name = "facetFlightAndHotelSearchFacade")
	CnkProductSearchFacade facetFlightAndHotelSearchFacade;

	@Resource(name = "sortedHotelSearchFacade")
	private CnkProductSearchFacade sortedHotelSearchFacade;

	@Resource(name = "sortedFlightSearchFacade")
	private CnkProductSearchFacade sortedFlightSearchFacade;

	@Resource(name = "multicityIntlSortedFlightSearchFacade")
	private CnkProductSearchFacade multicityIntlSortedFlightSearchFacade;

	@Resource(name = "defaultSolrCitySearchFacade")
	private CitySearchFacade defaultSolrCitySearchFacade;

	@Resource(name = "defaultAutoSuggestionFacade")
	private AutoSuggestionFacade defaultAutoSuggestionFacade;

	@Resource(name = "defaultHotelCompareFacade")
	private CnkProductCompareFacade defaultHotelCompareFacade;


	@Resource
	private AbstractPopulatingConverter defaultHotelDataConverter;

	@RequestMapping(method = RequestMethod.GET, params = "!q")
	public String textSearch(@RequestParam(value = "text", defaultValue = "") final String searchText,
			final HttpServletRequest request, final Model model) throws CMSItemNotFoundException
	{
		if (StringUtils.isNotBlank(searchText))
		{
			final PageableData pageableData = createPageableData(0, getSearchPageSize(), null, ShowMode.Page);
			final String encodedSearchText = XSSFilterUtil.filter(searchText);

			final SearchStateData searchState = new SearchStateData();
			final SearchQueryData searchQueryData = new SearchQueryData();
			searchQueryData.setValue(encodedSearchText);
			searchState.setQuery(searchQueryData);

			ProductSearchPageData<SearchStateData, ProductData> searchPageData = null;
			try
			{
				searchPageData = encodeSearchPageData(productSearchFacade.textSearch(searchState, pageableData));
			}
			catch (final ConversionException e) // NOSONAR
			{
				// nothing to do - the exception is logged in SearchSolrQueryPopulator
			}

			if (searchPageData == null)
			{
				storeCmsPageInModel(model, getContentPageForLabelOrId(NO_RESULTS_CMS_PAGE_ID));
			}
			else if (searchPageData.getKeywordRedirectUrl() != null)
			{
				// if the search engine returns a redirect, just
				return "redirect:" + searchPageData.getKeywordRedirectUrl();
			}
			else if (searchPageData.getPagination().getTotalNumberOfResults() == 0)
			{
				model.addAttribute("searchPageData", searchPageData);
				storeCmsPageInModel(model, getContentPageForLabelOrId(NO_RESULTS_CMS_PAGE_ID));
				updatePageTitle(encodedSearchText, model);
			}
			else
			{
				storeContinueUrl(request);
				populateModel(model, searchPageData, ShowMode.Page);
				storeCmsPageInModel(model, getContentPageForLabelOrId(SEARCH_CMS_PAGE_ID));
				updatePageTitle(encodedSearchText, model);
			}
			model.addAttribute("userLocation", customerLocationService.getUserLocation());
			getRequestContextData(request).setSearch(searchPageData);
			if (searchPageData != null)
			{
				model.addAttribute(WebConstants.BREADCRUMBS_KEY, searchBreadcrumbBuilder.getBreadcrumbs(null, encodedSearchText,
						CollectionUtils.isEmpty(searchPageData.getBreadcrumbs())));
			}
		}
		else
		{
			storeCmsPageInModel(model, getContentPageForLabelOrId(NO_RESULTS_CMS_PAGE_ID));
		}
		model.addAttribute("pageType", PageType.PRODUCTSEARCH.name());
		model.addAttribute(ThirdPartyConstants.SeoRobots.META_ROBOTS, ThirdPartyConstants.SeoRobots.NOINDEX_FOLLOW);

		final String metaDescription = MetaSanitizerUtil
				.sanitizeDescription(getMessageSource().getMessage(SEARCH_META_DESCRIPTION_RESULTS, null,
						SEARCH_META_DESCRIPTION_RESULTS, getI18nService().getCurrentLocale()) + " " + searchText + " "
						+ getMessageSource().getMessage(SEARCH_META_DESCRIPTION_ON, null, SEARCH_META_DESCRIPTION_ON,
								getI18nService().getCurrentLocale())
						+ " " + getSiteName());
		final String metaKeywords = MetaSanitizerUtil.sanitizeKeywords(searchText);
		setUpMetaData(model, metaKeywords, metaDescription);

		return getViewForPage(model);
	}


	@RequestMapping(method = RequestMethod.POST, value = "/hotel/{searchType}")
	public String hotelSearch(final HttpServletRequest request, final Model model,
			@PathVariable(value = "searchType") final String searchType,
			@RequestParam(value = "tabName", defaultValue = "hotel") final String tabName) throws CMSItemNotFoundException
	{
		//get pageNumber
		final String pageNumber = "1";
		//get search widget view model-last changed data
		final String topSearchViewModel = request.getParameter("topSearchViewModel");
		//get search widget data model-changed data
		final String topSearchDataModel = request.getParameter("topSearchDataModel");
		//get facet search data
		String facetDataJson = request.getParameter("facetViewModel");
		//get filter search data
		String filterSearchDataJson = request.getParameter("filterSearchViewModel");

		if (LOG.isDebugEnabled())
		{
			LOG.info("topSearchViewModel:" + topSearchViewModel);
			LOG.info("topSearchDataModel:" + topSearchViewModel);
			LOG.info("facetDataJson:" + facetDataJson);
			LOG.info("filterSearchDataJson:" + filterSearchDataJson);
		}

		final HotelSearchData searchData = CnkBeanUtil.getBeanFromJson(topSearchDataModel, HotelSearchData.class);
		searchData.setPageNum(Integer.valueOf(pageNumber).intValue());
		searchData.setPageSize(Integer.valueOf(VIEW_PAGE_SIZE).intValue());

		List<CnkFacetDataList> facetDataListModel = new ArrayList<CnkFacetDataList>();

		if (StringUtils.equalsIgnoreCase(searchType, "topSearch"))
		{
			//
		}
		if (StringUtils.equalsIgnoreCase(searchType, "facetSearch"))
		{
			//search from plp page with facet
			facetDataListModel = CnkBeanUtil.getBeanListFromJson(facetDataJson, CnkFacetData.class);
		}
		if (StringUtils.equalsIgnoreCase(searchType, "filterSearch"))
		{
			facetDataListModel = CnkBeanUtil.getBeanListFromJson(filterSearchDataJson, CnkFacetData.class);
		}
		//set facet search items (facetSearch and filterSearch are all treated as facet attribute of searchData)
		if (CollectionUtils.isNotEmpty(facetDataListModel))
		{
			searchData.setFacets(facetDataListModel);
		}

		//TODO:search data - supplier

		//search products
		final CnkProductSearchPageData<HotelData> result = sortedHotelSearchFacade.searchProduct(searchData);

		//TODO:MOCK Convert data from SI

		//		for (final HotelData data : result.getResult())
		//		{
		//			defaultHotelDataConverter.populate(data, data);
		//		}

		//this only used to init the facet search and filter search page when the page loaded first time;
		final List<CnkFacetDataList> facetSearch = result.getFacets();
		if (StringUtils.isEmpty(facetDataJson))
		{
			final List<CnkFacetData> cnkFacetDataList = facetSearch.get(0).getFacets();
			if (CollectionUtils.isNotEmpty(cnkFacetDataList))
			{
				facetDataJson = CnkBeanUtil.getJsonFromObject(cnkFacetDataList);
			}
		}
		if (StringUtils.isEmpty(filterSearchDataJson))
		{
			filterSearchDataJson = CnkBeanUtil.getJsonFromObject(facetSearch.get(0).getFacets());
		}
		this.buildTitileReturnInfo(model, searchData);
		final List<HotelData> bestRecommends = result.getBestPriceRecommend();
		final List<CnkBreadcrumbData> breadcrumbs = result.getBreadcrumbs();
		final List<HotelData> products = result.getResult();
		final List<CnkSortedDataList> sortContionList = result.getSortConditionList();

		model.addAttribute("bestRecommends", CnkBeanUtil.getJsonFromObject(bestRecommends));
		model.addAttribute("breadcrumbs", breadcrumbs);
		model.addAttribute("hotelList", CnkBeanUtil.getJsonFromObject(products));
		model.addAttribute("sortContionList", CnkBeanUtil.getJsonFromObject(sortContionList));
		//add paging info
		model.addAttribute("result", result);
		//search query json transfer to pdp page
		final String lastSearchQuerys = CnkBeanUtil.getJsonFromObject(searchData);
		model.addAttribute("querys", lastSearchQuerys);
		model.addAttribute("searchData", searchData);
		//return facet search view model to bind
		model.addAttribute("facetViewJson", facetDataJson);
		//return top search view and data model to bind
		model.addAttribute("topSearchViewModel", topSearchViewModel);
		model.addAttribute("topSearchDataModel", topSearchDataModel);
		//return filter Search view and data model to bind
		model.addAttribute("filterSearchViewJson", filterSearchDataJson);
		//return lat/long array
		model.addAttribute("markers", generateMarkers(products));
		model.addAttribute("tabName", tabName);
		storeCmsPageInModel(model, getContentPageForLabelOrId(SEARCH_HOTEL_PAGE_ID));
		return getViewForPage(model);
	}

	private String generateMarkers(final List<HotelData> products)
	{
		final List<HotelMarkerData> markerList = new ArrayList<HotelMarkerData>();
		for (final HotelData hotelData : products)
		{
			markerList.add(hotelData.getMarker());
		}
		return CnkBeanUtil.getJsonFromObject(markerList);
	}



	@SuppressWarnings("boxing")
	private void buildTitileReturnInfo(final Model model, final HotelSearchData searchData)
	{
		model.addAttribute("view_destination", searchData.getDestination());
		model.addAttribute("view_checkInDate", searchData.getCheckInDate());
		model.addAttribute("view_checkOutDate", searchData.getCheckOutDate());
		model.addAttribute("view_nights", searchData.getNights());
		int adults = 0;
		int childs = 0;
		int rooms = 0;
		for (final FlightHotelSearchRoomData room : searchData.getHotelSearchRooms())
		{
			adults += room.getAdultCount();
			childs += room.getChildren().size();
			rooms++;
		}
		model.addAttribute("view_rooms", rooms);
		model.addAttribute("view_adults", adults);
		model.addAttribute("view_childs", childs);
	}

	@ResponseBody
	@RequestMapping(value = "/hotel/{searchType}/ajax", method = RequestMethod.POST)
	public CnkProductSearchPageData<HotelData> facetFilterHotelData(final HttpServletRequest request, final Model model,
			@PathVariable(value = "searchType") final String searchType)
	{
		final String pageNumber = request.getParameter("pageNumber") != null ? request.getParameter("pageNumber") : "1";

		//get search widget data model-changed data
		final String topSearchDataModel = request.getParameter("topSearchDataModel");
		//get facet search data
		final String facetDataJson = request.getParameter("facetViewModel");
		//get filter search data
		final String filterSearchDataJson = request.getParameter("filterSearchViewModel");
		//get selected sorted item
		final String selectedCode = request.getParameter("selectedCode");
		//get sort condition list
		final String sortConditionList = request.getParameter("sortConditionList");


		final HotelSearchData searchData = CnkBeanUtil.getBeanFromJson(topSearchDataModel, HotelSearchData.class);
		final List<CnkSortedDataList> sortConditions = CnkBeanUtil.getBeanListFromJson(sortConditionList, CnkSortedDataList.class);
		if (CollectionUtils.isNotEmpty(sortConditions) || StringUtils.isNotEmpty(selectedCode))
		{
			searchData.setSortConditionList(updateSortContionList(sortConditions, selectedCode));
		}
		searchData.setPageNum(Integer.valueOf(pageNumber).intValue());
		searchData.setPageSize(Integer.valueOf(VIEW_PAGE_SIZE).intValue());

		List<CnkFacetData> facetDataModel = new ArrayList<CnkFacetData>();
		if (StringUtils.equalsIgnoreCase(searchType, "facetSearch"))
		{
			//search from plp page with facet
			facetDataModel = CnkBeanUtil.getBeanListFromJson(facetDataJson, CnkFacetData.class);
		}
		else if (StringUtils.equalsIgnoreCase(searchType, "filterSearch"))
		{
			facetDataModel = CnkBeanUtil.getBeanListFromJson(filterSearchDataJson, CnkFacetData.class);
		}
		//set facet search items (facetSearch and filterSearch are all treated as facet attribute of searchData)
		if (CollectionUtils.isNotEmpty(facetDataModel))
		{
			final List<CnkFacetDataList> facetDataListModel = new ArrayList<CnkFacetDataList>();
			final CnkFacetDataList cnkFacetDataList = new CnkFacetDataList();
			cnkFacetDataList.setFacets(facetDataModel);
			facetDataListModel.add(cnkFacetDataList);
			searchData.setFacets(facetDataListModel);
		}
		//search products
		final CnkProductSearchPageData<HotelData> result = sortedHotelSearchFacade.searchProduct(searchData);
		return result;
	}

	private List<CnkSortedDataList> updateSortContionList(final List<CnkSortedDataList> sortConditionList,
			final String selectedCode)
	{
		for (final CnkSortedDataList conditionList : sortConditionList)
		{
			for (final CnkProductSortConditionData condition : conditionList.getConditions())
			{
				if (StringUtils.endsWithIgnoreCase(selectedCode, condition.getCode()))
				{
					condition.setSelected(true);
				}
				else
				{
					condition.setSelected(false);
				}
			}
		}
		return sortConditionList;
	}


	@ResponseBody
	@RequestMapping(value = "/comparehotel/ajax", method = RequestMethod.GET)
	public List<HotelCompareData> getComparedHotelDataList(final HttpServletRequest request,
			@RequestParam(value = "hotelIds", required = false) final String[] hotelIds)
	{
		final List<HotelCompareData> hotelDataList = defaultHotelCompareFacade.searchProductByIds(hotelIds);
		return hotelDataList;
	}


	/**
	 * By default, all input/output parameters are data in JSON format.
	 *
	 * @param serviceType
	 * @param request
	 * @param model
	 * @return don't tell :U
	 * @throws CMSItemNotFoundException
	 */
	@RequestMapping(method =
	{ RequestMethod.GET, RequestMethod.POST }, value = "/flight_and_hotel/{serviceType}")
	public String flightAndHotelSearch(@PathVariable("serviceType") final String serviceType, final HttpServletRequest request,
			final Model model) throws CMSItemNotFoundException
	{
		// import previous front-end JSON view model
		final String section1JsonViewModel = request.getParameter("section1ViewModel");

		// import previous front-end JSON data model
		final String searchJsonDataModel = request.getParameter("section1DataModel");
		final String facetsJsonDataModel = request.getParameter("section2ADataModel");

		if (LOG.isDebugEnabled())
		{
			LOG.debug(new Object[]
			{ section1JsonViewModel, searchJsonDataModel, facetsJsonDataModel });
		}

		try
		{
			// covert front-end JSON data model to back-end bean data model
			final FlightHotelSearchData searchBeanDataModel = CnkBeanUtil.getBeanFromJson(searchJsonDataModel,
					FlightHotelSearchData.class);
			final List<CnkFacetDataList> facetsBeanDataModelList = CnkBeanUtil.getBeanListFromJson(facetsJsonDataModel,
					CnkFacetDataList.class);
			searchBeanDataModel.setFacets(facetsBeanDataModelList);

			// search product now
			final CnkProductSearchPageData searchResultBeanDataModel = facetFlightAndHotelSearchFacade
					.searchProduct(searchBeanDataModel);
			final String facetJsonViewModel = CnkBeanUtil.getJsonFromObject(searchResultBeanDataModel.getFacets());
			final String searchResultJsonDataModel = CnkBeanUtil.getJsonFromObject(searchResultBeanDataModel);

			// export next front-end JSON view model
			model.addAttribute("section1ViewModel", section1JsonViewModel);
			model.addAttribute("section2AViewModel", facetJsonViewModel);
			// export next front-end JSON data model
			model.addAttribute("section1DataModel", searchJsonDataModel);
			model.addAttribute("section2BDataModel", searchResultJsonDataModel);

			// export next front-end BEAN data model
			model.addAttribute("section2BBeanDataModel", searchResultBeanDataModel);
		}
		catch (final Exception e)
		{
			LOG.error(e);
		}
		final String pageId = String.format("ezgFlightHotel%sSearchResultPage", StringUtils.capitalize(serviceType));
		storeCmsPageInModel(model, getContentPageForLabelOrId(pageId));
		return getViewForPage(model);
	}

	@RequestMapping(method =
	{ RequestMethod.GET, RequestMethod.POST }, value = "/flight/multicity-intl")
	public String flightSearchForMulticityIntl(final HttpServletRequest request,
			@RequestParam(value = "tabName", defaultValue = "flight") final String tabName, final Model model)
			throws CMSItemNotFoundException
	{
		final String jsonViewModel = request.getParameter("flightSection1ViewModel");
		final String jsonDataModel = request.getParameter("flightSection1DataModel");
		final String facetsJsonDataModel = request.getParameter("flightSection2AViewModel");
		final String flightSortDataModel = request.getParameter("flightSortDataModel");

		final FlightHotelSearchData searchBeanDataModel = CnkBeanUtil.getBeanFromJson(jsonDataModel, FlightHotelSearchData.class);
		final List<CnkFacetDataList> facetsBeanDataModelList = CnkBeanUtil.getBeanListFromJson(facetsJsonDataModel,
				CnkFacetDataList.class);
		final List<CnkSortedDataList> sortConditionList = CnkBeanUtil.getBeanListFromJson(flightSortDataModel,
				CnkSortedDataList.class);
		searchBeanDataModel.setFacets(facetsBeanDataModelList);
		searchBeanDataModel.setSortConditionList(sortConditionList);
		searchBeanDataModel.setFlightType("MULTICITY-INTL");
		final CnkProductSearchPageData searchPageData;
		try
		{
			searchPageData = multicityIntlSortedFlightSearchFacade.searchProduct(searchBeanDataModel);
		}
		catch (final Exception e)
		{
			LOG.error(e);
			return getViewForPage(model);
		}

		final String returnedFacetJsonViewModel = CnkBeanUtil.getJsonFromObject(searchPageData.getFacets());
		final String returnedFlightSortDataModel = CnkBeanUtil.getJsonFromObject(searchPageData.getSortConditionList());
		final String bestRecommends = CnkBeanUtil.getJsonFromObject(searchPageData.getBestPriceRecommend());
		final String resultList = CnkBeanUtil.getJsonFromObject(searchPageData.getResult());

		model.addAttribute("bestRecommends", bestRecommends);
		model.addAttribute("resultList", resultList);

		model.addAttribute("flightSection1ViewModel", jsonViewModel);
		model.addAttribute("flightSection1DataModel", jsonDataModel);
		model.addAttribute("flightSortDataModel", returnedFlightSortDataModel);
		model.addAttribute("flightSection2AViewModel", returnedFacetJsonViewModel);
		model.addAttribute("flightSection2BViewModel", searchPageData);
		model.addAttribute("tabName", tabName);

		//used only when from cart page to SRP.
		model.addAttribute("originalGroupId", request.getParameter("originalGroupId"));
		storeCmsPageInModel(model, getContentPageForLabelOrId("ezgFlightMulticityIntlSearchResultPage"));
		return getViewForPage(model);
	}

	@ResponseBody
	@RequestMapping(value = "/flight/multicity-intl/ajax", method = RequestMethod.POST)
	public FlightProductSearchPageData flightSearchAjaxForMulticityIntl(final HttpServletRequest request,
			@RequestParam(value = "tabName", defaultValue = "flight") final String tabName, final Model model)
	{

		final String jsonDataModel = request.getParameter("flightSection1DataModel");
		final String facetsJsonDataModel = request.getParameter("flightSection2AViewModel");

		final String flightSortDataModel = request.getParameter("flightSortDataModel");

		final List<CnkSortedDataList> sortConditionList = CnkBeanUtil.getBeanListFromJson(flightSortDataModel,
				CnkSortedDataList.class);

		final FlightHotelSearchData searchBeanDataModel = CnkBeanUtil.getBeanFromJson(jsonDataModel, FlightHotelSearchData.class);
		final List<CnkFacetDataList> facetsBeanDataModelList = CnkBeanUtil.getBeanListFromJson(facetsJsonDataModel,
				CnkFacetDataList.class);
		searchBeanDataModel.setFacets(facetsBeanDataModelList);
		searchBeanDataModel.setSortConditionList(sortConditionList);
		return (FlightProductSearchPageData) multicityIntlSortedFlightSearchFacade.searchProduct(searchBeanDataModel);

	}

	@RequestMapping(method =
	{ RequestMethod.GET, RequestMethod.POST }, value = "/flight/{serviceType}")
	public String flightSearch(@PathVariable("serviceType") final String serviceType, final HttpServletRequest request,
			@RequestParam(value = "tabName", defaultValue = "flight") final String tabName, final Model model)
			throws CMSItemNotFoundException
	{
		final String jsonViewModel = request.getParameter("flightSection1ViewModel");
		final String jsonDataModel = request.getParameter("flightSection1DataModel");
		final String facetsJsonDataModel = request.getParameter("flightSection2AViewModel");

		final String flightSortDataModel = request.getParameter("flightSortDataModel");

		//String jsonSearchPageData = null;
		try
		{
			// covert front-end JSON data model to back-end bean data model
			final FlightHotelSearchData searchBeanDataModel = CnkBeanUtil.getBeanFromJson(jsonDataModel,
					FlightHotelSearchData.class);
			final List<CnkFacetDataList> facetsBeanDataModelList = CnkBeanUtil.getBeanListFromJson(facetsJsonDataModel,
					CnkFacetDataList.class);

			final List<CnkSortedDataList> sortConditionList = CnkBeanUtil.getBeanListFromJson(flightSortDataModel,
					CnkSortedDataList.class);

			searchBeanDataModel.setFacets(facetsBeanDataModelList);
			searchBeanDataModel.setSortConditionList(sortConditionList);

			//final ObjectMapper objectMapper = CnkBeanUtil.getObjectMapper();

			final CnkProductSearchPageData searchPageData = sortedFlightSearchFacade.searchProduct(searchBeanDataModel);

			final String returnedFacetJsonViewModel = CnkBeanUtil.getJsonFromObject(searchPageData.getFacets());
			final String returnedFlightSortDataModel = CnkBeanUtil.getJsonFromObject(searchPageData.getSortConditionList());
			final String bestRecommends = CnkBeanUtil.getJsonFromObject(searchPageData.getBestPriceRecommend());
			final String resultList = CnkBeanUtil.getJsonFromObject(searchPageData.getResult());

			model.addAttribute("bestRecommends", bestRecommends);
			model.addAttribute("resultList", resultList);

			model.addAttribute("flightSection1ViewModel", jsonViewModel);
			model.addAttribute("flightSection1DataModel", jsonDataModel);
			model.addAttribute("flightSortDataModel", returnedFlightSortDataModel);
			model.addAttribute("flightSection2AViewModel", returnedFacetJsonViewModel);
			model.addAttribute("flightSection2BViewModel", searchPageData);
			model.addAttribute("tabName", tabName);

			//used only when from cart page to SRP.
			model.addAttribute("originalGroupId", request.getParameter("originalGroupId"));
			final String pageId = String.format("ezgFlight%sSearchResultPage", StringUtils.capitalize(serviceType));
			storeCmsPageInModel(model, getContentPageForLabelOrId(pageId));
		}
		catch (final Exception e)
		{
			LOG.error(e);
		}


		return getViewForPage(model);
	}

	@ResponseBody
	@RequestMapping(value = "/flight/{serviceType}/ajax", method = RequestMethod.POST)
	public FlightProductSearchPageData flightSearchAjax(@PathVariable("serviceType") final String serviceType,
			final HttpServletRequest request, @RequestParam(value = "tabName", defaultValue = "flight") final String tabName,
			final Model model)
	{

		final String jsonDataModel = request.getParameter("flightSection1DataModel");
		final String facetsJsonDataModel = request.getParameter("flightSection2AViewModel");

		final String flightSortDataModel = request.getParameter("flightSortDataModel");

		final List<CnkSortedDataList> sortConditionList = CnkBeanUtil.getBeanListFromJson(flightSortDataModel,
				CnkSortedDataList.class);

		final FlightHotelSearchData searchBeanDataModel = CnkBeanUtil.getBeanFromJson(jsonDataModel, FlightHotelSearchData.class);
		final List<CnkFacetDataList> facetsBeanDataModelList = CnkBeanUtil.getBeanListFromJson(facetsJsonDataModel,
				CnkFacetDataList.class);
		searchBeanDataModel.setFacets(facetsBeanDataModelList);
		searchBeanDataModel.setSortConditionList(sortConditionList);
		return (FlightProductSearchPageData) sortedFlightSearchFacade.searchProduct(searchBeanDataModel);

	}


	@RequestMapping(method = RequestMethod.GET, params = "q")
	public String refineSearch(@RequestParam("q") final String searchQuery,
			@RequestParam(value = "page", defaultValue = "0") final int page,
			@RequestParam(value = "show", defaultValue = "Page") final ShowMode showMode,
			@RequestParam(value = "sort", required = false) final String sortCode,
			@RequestParam(value = "text", required = false) final String searchText, final HttpServletRequest request,
			final Model model) throws CMSItemNotFoundException
	{
		final ProductSearchPageData<SearchStateData, ProductData> searchPageData = performSearch(searchQuery, page, showMode,
				sortCode, getSearchPageSize());

		populateModel(model, searchPageData, showMode);
		model.addAttribute("userLocation", customerLocationService.getUserLocation());

		if (searchPageData.getPagination().getTotalNumberOfResults() == 0)
		{
			updatePageTitle(searchPageData.getFreeTextSearch(), model);
			storeCmsPageInModel(model, getContentPageForLabelOrId(NO_RESULTS_CMS_PAGE_ID));
		}
		else
		{
			storeContinueUrl(request);
			updatePageTitle(searchPageData.getFreeTextSearch(), model);
			storeCmsPageInModel(model, getContentPageForLabelOrId(SEARCH_CMS_PAGE_ID));
		}
		model.addAttribute(WebConstants.BREADCRUMBS_KEY, searchBreadcrumbBuilder.getBreadcrumbs(null, searchPageData));
		model.addAttribute("pageType", PageType.PRODUCTSEARCH.name());

		final String metaDescription = MetaSanitizerUtil
				.sanitizeDescription(getMessageSource().getMessage(SEARCH_META_DESCRIPTION_RESULTS, null,
						SEARCH_META_DESCRIPTION_RESULTS, getI18nService().getCurrentLocale()) + " " + searchText + " "
						+ getMessageSource().getMessage(SEARCH_META_DESCRIPTION_ON, null, SEARCH_META_DESCRIPTION_ON,
								getI18nService().getCurrentLocale())
						+ " " + getSiteName());

		final String metaKeywords = MetaSanitizerUtil.sanitizeKeywords(searchText);
		setUpMetaData(model, metaKeywords, metaDescription);

		return getViewForPage(model);
	}

	protected ProductSearchPageData<SearchStateData, ProductData> performSearch(final String searchQuery, final int page,
			final ShowMode showMode, final String sortCode, final int pageSize)
	{
		final PageableData pageableData = createPageableData(page, pageSize, sortCode, showMode);

		final SearchStateData searchState = new SearchStateData();
		final SearchQueryData searchQueryData = new SearchQueryData();
		searchQueryData.setValue(searchQuery);
		searchState.setQuery(searchQueryData);

		return encodeSearchPageData(productSearchFacade.textSearch(searchState, pageableData));
	}

	@ResponseBody
	@RequestMapping(value = "/results", method = RequestMethod.GET)
	public SearchResultsData<ProductData> jsonSearchResults(@RequestParam("q") final String searchQuery,
			@RequestParam(value = "page", defaultValue = "0") final int page,
			@RequestParam(value = "show", defaultValue = "Page") final ShowMode showMode,
			@RequestParam(value = "sort", required = false) final String sortCode) throws CMSItemNotFoundException
	{
		final ProductSearchPageData<SearchStateData, ProductData> searchPageData = performSearch(searchQuery, page, showMode,
				sortCode, getSearchPageSize());
		final SearchResultsData<ProductData> searchResultsData = new SearchResultsData<>();
		searchResultsData.setResults(searchPageData.getResults());
		searchResultsData.setPagination(searchPageData.getPagination());
		return searchResultsData;
	}

	@ResponseBody
	@RequestMapping(value = "/facets", method = RequestMethod.GET)
	public FacetRefinement<SearchStateData> getFacets(@RequestParam("q") final String searchQuery,
			@RequestParam(value = "page", defaultValue = "0") final int page,
			@RequestParam(value = "show", defaultValue = "Page") final ShowMode showMode,
			@RequestParam(value = "sort", required = false) final String sortCode) throws CMSItemNotFoundException
	{
		final SearchStateData searchState = new SearchStateData();
		final SearchQueryData searchQueryData = new SearchQueryData();
		searchQueryData.setValue(searchQuery);
		searchState.setQuery(searchQueryData);

		final ProductSearchPageData<SearchStateData, ProductData> searchPageData = productSearchFacade.textSearch(searchState,
				createPageableData(page, getSearchPageSize(), sortCode, showMode));
		final List<FacetData<SearchStateData>> facets = refineFacets(searchPageData.getFacets(),
				convertBreadcrumbsToFacets(searchPageData.getBreadcrumbs()));
		final FacetRefinement<SearchStateData> refinement = new FacetRefinement<>();
		refinement.setFacets(facets);
		refinement.setCount(searchPageData.getPagination().getTotalNumberOfResults());
		refinement.setBreadcrumbs(searchPageData.getBreadcrumbs());
		return refinement;
	}

	@SuppressWarnings("boxing")
	@ResponseBody
	@RequestMapping(value = "/autocomplete/" + COMPONENT_UID_PATH_VARIABLE_PATTERN, method = RequestMethod.GET)
	public AutocompleteResultData getAutocompleteSuggestions(@PathVariable final String componentUid,
			@RequestParam("term") final String term) throws CMSItemNotFoundException
	{
		final AutocompleteResultData resultData = new AutocompleteResultData();
		final List<AutocompleteSuggestionData> list = new ArrayList<AutocompleteSuggestionData>();
		final EzgSearchBoxComponentModel component = (EzgSearchBoxComponentModel) cmsComponentService
				.getSimpleCMSComponent(componentUid);
		final int suggestSize = component.getMaxSuggestions();
		final int productSize = component.getMaxProducts();

		if (component.isDisplaySuggestions())
		{
			list.addAll(subList(productSearchFacade.getAutocompleteSuggestions(term), suggestSize));
		}
		if (component.isDisplayCity())
		{
			list.addAll(subList(defaultSolrCitySearchFacade.getAutocompleteSuggestions(term), suggestSize));
		}
		if (component.isDisplayArea())
		{
			list.addAll(defaultAutoSuggestionFacade.getSuggestedArea(term));
		}
		if (component.isDisplayChain())
		{
			//get chain, totally 269,provided by excel
		}
		if (component.isDisplayLandMark())
		{
			//
		}
		if (list.size() > suggestSize)
		{
			resultData.setSuggestions(list.subList(0, suggestSize));
		}
		else
		{
			resultData.setSuggestions(list);
		}
		if (component.isDisplayProducts())
		{
			resultData.setProducts(subList(productSearchFacade.textSearch(term).getResults(), productSize));
		}
		return resultData;
	}

	protected <E> List<E> subList(final List<E> list, final int maxElements)
	{
		if (CollectionUtils.isEmpty(list))
		{
			return Collections.emptyList();
		}

		if (list.size() > maxElements)
		{
			return list.subList(0, maxElements);
		}

		return list;
	}

	protected void updatePageTitle(final String searchText, final Model model)
	{
		storeContentPageTitleInModel(model, getPageTitleResolver().resolveContentPageTitle(
				getMessageSource().getMessage("search.meta.title", null, "search.meta.title", getI18nService().getCurrentLocale())
						+ " " + searchText));
	}


	protected ProductSearchPageData<SearchStateData, ProductData> encodeSearchPageData(
			final ProductSearchPageData<SearchStateData, ProductData> searchPageData)
	{
		final SearchStateData currentQuery = searchPageData.getCurrentQuery();

		if (currentQuery != null)
		{
			try
			{
				final SearchQueryData query = currentQuery.getQuery();
				final String encodedQueryValue = XSSEncoder.encodeHTML(query.getValue());
				query.setValue(encodedQueryValue);
				currentQuery.setQuery(query);
				searchPageData.setCurrentQuery(currentQuery);
				searchPageData.setFreeTextSearch(XSSEncoder.encodeHTML(searchPageData.getFreeTextSearch()));

				final List<FacetData<SearchStateData>> facets = searchPageData.getFacets();
				if (CollectionUtils.isNotEmpty(facets))
				{
					processFacetData(facets);
				}
			}
			catch (final UnsupportedEncodingException e)
			{
				if (LOG.isDebugEnabled())
				{
					LOG.debug("Error occured during Encoding the Search Page data values", e);
				}
			}
		}
		return searchPageData;
	}

	protected void processFacetData(final List<FacetData<SearchStateData>> facets) throws UnsupportedEncodingException
	{
		for (final FacetData<SearchStateData> facetData : facets)
		{
			final List<FacetValueData<SearchStateData>> topFacetValueDatas = facetData.getTopValues();
			if (CollectionUtils.isNotEmpty(topFacetValueDatas))
			{
				processFacetDatas(topFacetValueDatas);
			}
			final List<FacetValueData<SearchStateData>> facetValueDatas = facetData.getValues();
			if (CollectionUtils.isNotEmpty(facetValueDatas))
			{
				processFacetDatas(facetValueDatas);
			}
		}
	}

	protected void processFacetDatas(final List<FacetValueData<SearchStateData>> facetValueDatas)
			throws UnsupportedEncodingException
	{
		for (final FacetValueData<SearchStateData> facetValueData : facetValueDatas)
		{
			final SearchStateData facetQuery = facetValueData.getQuery();
			final SearchQueryData queryData = facetQuery.getQuery();
			final String queryValue = queryData.getValue();
			if (StringUtils.isNotBlank(queryValue))
			{
				final String[] queryValues = queryValue.split(FACET_SEPARATOR);
				final StringBuilder queryValueBuilder = new StringBuilder();
				queryValueBuilder.append(XSSEncoder.encodeHTML(queryValues[0]));
				for (int i = 1; i < queryValues.length; i++)
				{
					queryValueBuilder.append(FACET_SEPARATOR).append(queryValues[i]);
				}
				queryData.setValue(queryValueBuilder.toString());
			}
		}
	}

}
