/**
 *
 */
package com.cnk.travelogix.b2c.storefront.controllers.pages;

import static org.apache.commons.lang.StringEscapeUtils.escapeHtml;

import de.hybris.platform.acceleratorstorefrontcommons.annotations.RequireHardLogIn;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractSearchPageController;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.util.GlobalMessages;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.platform.commercefacades.customer.CustomerFacade;
import de.hybris.platform.commercefacades.order.CheckoutFacade;
import de.hybris.platform.commercefacades.order.OrderFacade;
import de.hybris.platform.commercefacades.order.data.OrderData;
import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.commercefacades.user.UserFacade;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cnk.travelogix.b2c.facades.order.B2cCartFacade;
import com.cnk.travelogix.b2c.facades.order.B2cOrderFacade;
import com.cnk.travelogix.b2c.storefront.controllers.ControllerConstants;
import com.cnk.travelogix.common.core.cart.data.AccommodationNonPrimaryTravellerData;
import com.cnk.travelogix.common.core.cart.data.AccommodationTravellerData;
import com.cnk.travelogix.common.core.cart.data.OrderHotelDetailInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderRoomDetailInfoData;


/**
 * Controller for booking list page
 */
@Controller
@Scope("tenant")
public class BookingSummaryPageController extends AbstractSearchPageController implements GenericFormUtil
{
	/**
	 * We use this suffix pattern because of an issue with Spring 3.1 where a Uri value is incorrectly extracted if it
	 * contains on or more '.' characters. Please see https://jira.springsource.org/browse/SPR-6164 for a discussion on
	 * the issue and future resolution.
	 */
	private static final String REDIRECT_TO_ORDER_HISTORY_PAGE = REDIRECT_PREFIX + "/my-account/orders";
	private static final String ORDER_CODE_PATH_VARIABLE_PATTERN = "{orderCode:.*}";
	private static final String ADDRESS_CODE_PATH_VARIABLE_PATTERN = "{addressCode:.*}";

	private static final String ORDER_HISTORY_CMS_PAGE = "orders";
	private static final String ORDER_DETAIL_CMS_PAGE = "order";

	private static final Logger LOG = Logger.getLogger(BookingSummaryPageController.class);

	@Resource(name = "orderFacade")
	private OrderFacade orderFacade;

//	@Resource(name = "b2cCartFacade")
//	private B2cCartFacade b2cCartFacade;
	
	@Resource(name = "b2cOrderFacade")
	private B2cOrderFacade b2cOrderFacade;

	@Resource(name = "acceleratorCheckoutFacade")
	private CheckoutFacade checkoutFacade;

	@Resource(name = "userFacade")
	private UserFacade userFacade;

	@Resource(name = "customerFacade")
	private CustomerFacade customerFacade;

	@RequestMapping(value = "/order/" + ORDER_CODE_PATH_VARIABLE_PATTERN, method = RequestMethod.GET)
	@RequireHardLogIn
	public String order(@PathVariable("orderCode") final String orderCode, final Model model,
			final RedirectAttributes redirectModel) throws CMSItemNotFoundException
	{
		try
		{
			final OrderData orderDetails = b2cOrderFacade.getGroupedOrderDetailsForCode(orderCode);
			model.addAttribute("orderData", orderDetails);
			model.addAttribute("orderDataJson", escapeHtml(writeToJson(orderDetails)));
		}
		catch (final UnknownIdentifierException e)
		{
			LOG.warn("Attempted to load a order that does not exist or is not visible", e);
			GlobalMessages.addFlashMessage(redirectModel, GlobalMessages.ERROR_MESSAGES_HOLDER, "system.error.page.not.found", null);
			return REDIRECT_TO_ORDER_HISTORY_PAGE;
		}
		//			storeCmsPageInModel(model, getContentPageForLabelOrId(ORDER_DETAIL_CMS_PAGE));
		//			model.addAttribute(ThirdPartyConstants.SeoRobots.META_ROBOTS, ThirdPartyConstants.SeoRobots.NOINDEX_NOFOLLOW);
		//			setUpMetaDataForContentPage(model, getContentPageForLabelOrId(ORDER_DETAIL_CMS_PAGE));

		final ContentPageModel page = getContentPageForLabelOrId("ezgb2cbookingsummarypage");
		storeCmsPageInModel(model, page);
		setUpMetaDataForContentPage(model, page);
		//updatePageTitle(model, getContentPageForLabelOrId(null));
		return ControllerConstants.Views.Pages.MultiStepCheckout.Ezeego.BookingSummaryPage;
		//return getViewForPage(model);
	}

}
