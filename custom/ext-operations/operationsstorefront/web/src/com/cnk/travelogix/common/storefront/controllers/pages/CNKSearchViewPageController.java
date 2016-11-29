/**
 * 
 */
package com.cnk.travelogix.common.storefront.controllers.pages;

import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.commercefacades.order.data.OrderData;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cnk.travelogix.common.storefront.controllers.form.SearchFilterForm;
import com.cnk.travelogix.operations.facades.OrderListFacade;


/**
 * @author C5244545
 *
 */

@Controller
@RequestMapping(value = "/pages")
public class CNKSearchViewPageController extends AbstractSearchPageController
{
	private static final Logger LOG = Logger.getLogger(AccountPageController.class);
	private static final String SEARCH_VIEW_FILTER_BOOKING_CMS_PAGE = "cnkSearchViewFilterBookingPage";

	@Resource(name = "orderListFacade")
	private OrderListFacade orderListFacade;


	/**
	 * This method is meant for displaying SearchView page with Dynamic orders
	 * 
	 * @return String
	 * @throws CMSItemNotFoundException 
	 */
	@RequestMapping(value = "/searchViewPage", method = RequestMethod.GET)
	public String getSearchViewPage(final Model model,@ModelAttribute("searchFilterForm") SearchFilterForm searchFilterForm,HttpServletRequest request,HttpServletResponse response) throws CMSItemNotFoundException
	{

		LOG.info("---------getSearchViewPage()------------called :");

		List<OrderData> orderList = orderListFacade.getListOfOrders();
		model.addAttribute("orderList", orderList);

		storeCmsPageInModel(model, getContentPageForLabelOrId(SEARCH_VIEW_FILTER_BOOKING_CMS_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(SEARCH_VIEW_FILTER_BOOKING_CMS_PAGE));

		model.addAttribute("searchFilterForm",new SearchFilterForm());
		
		return getViewForPage(model);
	}


	@RequestMapping(value="/searchResult",method=RequestMethod.POST)
	public String getSearchResultPage(Model model,@ModelAttribute("searchFilterForm") SearchFilterForm searchFilterForm,HttpServletRequest request,HttpServletResponse response) throws CMSItemNotFoundException
	{
		LOG.info("---------getSearchResultPage()------------called :");
		storeCmsPageInModel(model, getContentPageForLabelOrId(SEARCH_VIEW_FILTER_BOOKING_CMS_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(SEARCH_VIEW_FILTER_BOOKING_CMS_PAGE));
		//model.addAttribute(registerForm);
		model.addAttribute("searchFilterForm",new SearchFilterForm());
		
		return getViewForPage(model);
	}
}

