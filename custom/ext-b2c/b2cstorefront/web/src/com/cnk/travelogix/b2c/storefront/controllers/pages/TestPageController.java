/**
 *
 */
package com.cnk.travelogix.b2c.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author i322561
 *
 */
@Controller
@Scope("tenant")
@RequestMapping(value = "/", method = RequestMethod.GET)
public class TestPageController extends AbstractPageController
{

	//CMS Pages
	private static final String WISHLIST_CMS_PAGE = "ezgb2cWishlistPage";
	private static final String CONFIRM_PASSWORD_PAGE = "completeAccPage";
	private static final String SIGNUP_PAGE = "signupPage";
	private static final String WALLET_CMS_PAGE = "ezgb2cWalletPage";
	private static final String SETTINGS_CMS_PAGE = "ezgb2cSettingsPage";
	private static final String BOOKING_LIST_PAGE = "ezgb2cbookinglistpage";
	private static final String AMEND_CANCEL_ALL_PRODUCTS_PAGE = "ezgb2cAmendCancelAllProductsPage";

	@RequestMapping(value = "/wishlist", method = RequestMethod.GET)
	public String getWishlist(final HttpServletRequest request, final Model model) throws CMSItemNotFoundException
	{
		storeCmsPageInModel(model, getContentPageForLabelOrId(WISHLIST_CMS_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(WISHLIST_CMS_PAGE));

		return "pages/ezg/account/wishlistPage";
	}

	@RequestMapping(value = "/wishlistAuth", method = RequestMethod.GET)
	public String getWishlistAuth(final HttpServletRequest request, final Model model) throws CMSItemNotFoundException
	{
		storeCmsPageInModel(model, getContentPageForLabelOrId(WISHLIST_CMS_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(WISHLIST_CMS_PAGE));

		return "pages/ezg/account/wishlistPage";
	}

	@RequestMapping(value = "/completeAcc", method = RequestMethod.GET)
	public String getCompleteAcc(final HttpServletRequest request, final Model model) throws CMSItemNotFoundException
	{
		storeCmsPageInModel(model, getContentPageForLabelOrId(CONFIRM_PASSWORD_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(CONFIRM_PASSWORD_PAGE));

		return "pages/ezg/account/completeAccPage";
	}

	//	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	//	public String getSignup(final HttpServletRequest request, final Model model) throws CMSItemNotFoundException
	//	{
	//		storeCmsPageInModel(model, getContentPageForLabelOrId(SIGNUP_PAGE));
	//		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(SIGNUP_PAGE));
	//
	//		return "pages/ezg/account/signupPage";
	//	}
	//
	//	@RequestMapping(value = "/wallet", method = RequestMethod.GET)
	//	public String getWallet(final HttpServletRequest request, final Model model) throws CMSItemNotFoundException
	//	{
	//		storeCmsPageInModel(model, getContentPageForLabelOrId(WALLET_CMS_PAGE));
	//		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(WALLET_CMS_PAGE));
	//
	//		return "pages/ezg/account/walletPage";
	//	}
	//
	//	@RequestMapping(value = "/settings", method = RequestMethod.GET)
	//	public String getSettings(final HttpServletRequest request, final Model model) throws CMSItemNotFoundException
	//	{
	//		storeCmsPageInModel(model, getContentPageForLabelOrId(SETTINGS_CMS_PAGE));
	//		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(SETTINGS_CMS_PAGE));
	//
	//		return "pages/ezg/account/settingsPage";
	//	}

//	@RequestMapping(value = "/bookList", method = RequestMethod.GET)
//	public String getBookingList(final HttpServletRequest request, final Model model) throws CMSItemNotFoundException
//	{
//		storeCmsPageInModel(model, getContentPageForLabelOrId(BOOKING_LIST_PAGE));
//		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(BOOKING_LIST_PAGE));
//
//		return "pages/ezg/cart/bookingList";
//	}

	@RequestMapping(value = "/amendCancelAllProduct", method = RequestMethod.GET)
	public String getAmendCancelAllProduct(final HttpServletRequest request, final Model model) throws CMSItemNotFoundException
	{
		storeCmsPageInModel(model, getContentPageForLabelOrId(AMEND_CANCEL_ALL_PRODUCTS_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(AMEND_CANCEL_ALL_PRODUCTS_PAGE));

		return "pages/ezg/cart/amendCancelAllproducts";
	}

}
