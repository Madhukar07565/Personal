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
import de.hybris.platform.acceleratorstorefrontcommons.forms.AddressForm;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.platform.commercefacades.order.data.CartData;
import de.hybris.platform.commerceservices.order.CommerceCartModificationException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cnk.travelogix.b2c.facades.order.B2cCartFacade;
import com.cnk.travelogix.b2c.storefront.controllers.ControllerConstants;
import com.cnk.travelogix.b2c.storefront.forms.FlightTraveler;
import com.cnk.travelogix.b2c.storefront.forms.FlightTravelersForm;
import com.cnk.travelogix.b2c.storefront.forms.HotelNonPrimaryTraveller;
import com.cnk.travelogix.b2c.storefront.forms.HotelTraveler;
import com.cnk.travelogix.b2c.storefront.forms.HotelTravelersForm;
import com.cnk.travelogix.common.core.cart.data.AccommodationNonPrimaryTravellerData;
import com.cnk.travelogix.common.core.cart.data.AccommodationTravellerData;
import com.cnk.travelogix.common.core.cart.data.BreakfastSubAncillaryData;
import com.cnk.travelogix.common.core.cart.data.CarParkingSubAncillaryData;
import com.cnk.travelogix.common.core.cart.data.PetSubAncillaryData;
import com.cnk.travelogix.common.core.cart.data.WifiSubAncillaryData;
import com.cnk.travelogix.common.core.enums.HotelAncillaryType;
import com.cnk.travelogix.common.core.enums.HotelVehicleType;
import com.cnk.travelogix.common.core.cart.data.FlightTravellerData;


@Controller
@RequestMapping(value = "/checkout/multi/traveler-details")
public class TravelerDetailsCheckoutStepController extends AbstractCnkCheckoutStepController
{
	private static final String TRAVELER_DETAILS = "traveler-details";
	private static final String SHOW_SAVE_TO_ADDRESS_BOOK_ATTR = "showSaveToAddressBook";

	@Resource(name = "b2cCartFacade")
	private B2cCartFacade b2cCartFacade;


	@Override
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	@RequireHardLogIn
	@PreValidateCheckoutStep(checkoutStep = TRAVELER_DETAILS)
	public String enterStep(final Model model, final RedirectAttributes redirectAttributes) throws CMSItemNotFoundException
	{
		final ContentPageModel page = getContentPageForLabelOrId("ezgb2ccartpage");
		storeCmsPageInModel(model, page);
		setUpMetaDataForContentPage(model, page);
		//updatePageTitle(model, page);

		setUpOrderHotelInfo(model);

		return ControllerConstants.Views.Pages.MultiStepCheckout.Ezeego.TravelerDetailsPage;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	//@RequireHardLogIn
	public String add(@RequestBody final HotelTravelersForm form, final BindingResult bindingResult, final Model model,
			final RedirectAttributes redirectModel) throws CMSItemNotFoundException, ParseException, NumberFormatException, CommerceCartModificationException
	{
		//TODO  remove unavailable product before move forward.
		b2cCartFacade.removeUnavailableEntries();
		final CartData cartData = getCheckoutFacade().getCheckoutCart();
		//getAddressValidator().validate(travelerForm, bindingResult);
		model.addAttribute("cartData", cartData);
		model.addAttribute("travelerForm", form);

		final Map<String, AccommodationTravellerData> hotelTravelers = populateAccommodationTravelerDataFromForm(form);

		//getUserFacade().addFrequentTraveler(newAddress);

		// save traveler info
		b2cCartFacade.saveTravelersInfo(hotelTravelers);

		updateTermsAndConditionFlag(form);

		updateFixedInsuranceInfo(form);
		updateTimeLimit(form);
		return "update-success";
		//return getCheckoutStep().nextStep();
	}

	@RequestMapping(value = "/add/flight", method = RequestMethod.POST)
	@ResponseBody
	//@RequireHardLogIn
	public String addFlightTravelers(@RequestBody final FlightTravelersForm form, final Model model)
			throws CMSItemNotFoundException, ParseException
	{
		final CartData cartData = getCheckoutFacade().getCheckoutCart();
		model.addAttribute("cartData", cartData);
		model.addAttribute("travelerForm", form);

		final Map<String, FlightTravellerData> flightTravelers = this.populateFlightTravelerDataFromForm(form);

		b2cCartFacade.saveFlightTravelersInfo(flightTravelers);

		return "update-success";
	}



	/**
	 * Populate Flight Traveler Data From Form.
	 *
	 * @param travelerForm
	 * @return Map<String, FlightTravellerData>
	 * @throws ParseException
	 */
	private Map<String, FlightTravellerData> populateFlightTravelerDataFromForm(final FlightTravelersForm travelerForm)
			throws ParseException
	{
		final Map<String, FlightTravellerData> map = new HashMap<String, FlightTravellerData>();
		final List<FlightTraveler> travelers = travelerForm.getTravelers();
		if (CollectionUtils.isNotEmpty(travelers))
		{
			for (final FlightTraveler traveler : travelers)
			{
				final FlightTravellerData data = new FlightTravellerData();
				data.setCountryCode(traveler.getCountryCode());
				data.setDateOfBirth(traveler.getDataOfBirth());
				data.setEmail(traveler.getEmail());
				data.setFirstName(traveler.getFirstName());
				data.setFreflyernumber(traveler.getFreflyernumber());
				data.setFreflyerSelAirline(traveler.getFreflyerSelAirline());
				//				data.setIssueCountry(traveler.getIssueCountry());
				data.setLastName(traveler.getLastName());
				data.setMealprefer(traveler.getMealprefer());
				data.setMiddleName(traveler.getMiddleName());
				data.setMobileNumber(traveler.getMobileNumber());
				data.setNationality(traveler.getNationality());
				data.setPassportExpDate(traveler.getPassportExpDate());
				data.setPassportNumber(traveler.getPassportNumber());
				data.setPlaceOfIssue(traveler.getPlaceOfIssue());
				data.setSeatprefer(traveler.getSeatprefer());
				data.setSpecialrequest(traveler.getSpecialrequest());
				data.setTitle(traveler.getTravelerTitle());
				map.put(traveler.getOrderEntryNumber(), data);
			}
		}

		return map;
	}


	/**
	 * convert form to data
	 *
	 * @param travelerForm
	 * @return
	 * @throws ParseException
	 */

	private Map<String, AccommodationTravellerData> populateAccommodationTravelerDataFromForm(
			final HotelTravelersForm travelerForm) throws ParseException
	{
		final Map<String, AccommodationTravellerData> map = new HashMap<String, AccommodationTravellerData>();
		final List<HotelTraveler> travelers = travelerForm.getTravelers();
		if (travelers != null && !travelers.isEmpty())
		{
			for (final HotelTraveler traveler : travelers)
			{
				final AccommodationTravellerData data = new AccommodationTravellerData();

				//				data.setOrderEntryNumber(traveler.getOrderEntryNumber());
				//				data.setRoomId(travelerForm.getRoomId());
				data.setFirstName(traveler.getFirstName());
				data.setMiddleName(traveler.getMiddleName());
				data.setLastName(traveler.getLastName());
				data.setTitle(traveler.getTravelerTitle());
				data.setMobileNumber(traveler.getMobileNumber());
				data.setEmail(traveler.getEmail());
				data.setNationality(traveler.getNationality());

				final List<HotelNonPrimaryTraveller> nonTravs = traveler.getNonPrimaryTravellers();
				if (nonTravs != null && !nonTravs.isEmpty())
				{
					final List<AccommodationNonPrimaryTravellerData> nonList = new ArrayList<AccommodationNonPrimaryTravellerData>();
					for (final HotelNonPrimaryTraveller nonTrav : nonTravs)
					{
						final AccommodationNonPrimaryTravellerData non = new AccommodationNonPrimaryTravellerData();
						non.setFirstName(nonTrav.getFirstName());
						non.setLastName(nonTrav.getLastName());
						non.setTitle(nonTrav.getTravelerTitle());

						if (nonTrav.getDayOfBirth() != null)
						{
							final String date = nonTrav.getDayOfBirth();
							final String month = nonTrav.getMonthOfBirth();
							final String year = nonTrav.getYearOfBirth();
							final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
							non.setDateOfBirth(sdf.parse(year + StringUtils.leftPad(month, 2, '0') + StringUtils.leftPad(date, 2, '0')));
						}
						nonList.add(non);
					}
					data.setNonPrimaryTravellerList(nonList);
				}

				map.put(traveler.getOrderEntryNumber(), data);
			}
		}

		return map;
	}

	/**
	 * TODO refactor
	 * @param form
	 */
	private void updateTermsAndConditionFlag(final HotelTravelersForm form)
	{
		final List<HotelTraveler> travelers = form.getTravelers();
		if (travelers != null && !travelers.isEmpty())
		{
			Map<String, Boolean> map = new HashMap<String, Boolean>();

			for (final HotelTraveler traveler : travelers)
			{
				Boolean agree = traveler.getAgreeTerms();
				if (agree!=null && agree.booleanValue())
				{
					map.put(traveler.getOrderEntryNumber(), Boolean.TRUE);
				}
			}
			b2cCartFacade.updateTermsAndConditionFlag(map);
		}
	}

	private void updateFixedInsuranceInfo(final HotelTravelersForm form)
	{

		final List<HotelTraveler> travelers = form.getTravelers();
		if (travelers != null && !travelers.isEmpty())
		{
			Map<String, Boolean> map = new HashMap<String, Boolean>();

			for (final HotelTraveler traveler : travelers)
			{
				Boolean addInsurance = traveler.getInsurance();
				if (addInsurance!=null && addInsurance.booleanValue())
				{
					map.put(traveler.getOrderEntryNumber(), Boolean.TRUE);
				}
			}
			b2cCartFacade.updateFixedInsuranceInfo(map);
		}


	}

	private void updateTimeLimit(final HotelTravelersForm form)
	{

		final List<HotelTraveler> travelers = form.getTravelers();
		if (travelers != null && !travelers.isEmpty())
		{
			Map<String, Boolean> map = new HashMap<String, Boolean>();

			for (final HotelTraveler traveler : travelers)
			{
				Boolean bookTimeLimit = traveler.getTimeLimit();
				if (bookTimeLimit!=null && bookTimeLimit.booleanValue())
				{
					map.put(traveler.getOrderEntryNumber(), Boolean.TRUE);
				}
			}
			b2cCartFacade.updateTimeLimit(map);
		}


	}

	protected void populateCommonModelAttributes(final Model model, final CartData cartData, final HotelTravelersForm travelerForm)
			throws CMSItemNotFoundException
	{
		model.addAttribute("cartData", cartData);
		model.addAttribute("travelerForm", travelerForm);
		//		prepareDataForPage(model);
		//		storeCmsPageInModel(model, getContentPageForLabelOrId(MULTI_CHECKOUT_SUMMARY_CMS_PAGE_LABEL));
		//		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(MULTI_CHECKOUT_SUMMARY_CMS_PAGE_LABEL));
		//		setCheckoutStepLinksForModel(model, getCheckoutStep());
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	@RequireHardLogIn
	public String editAddressForm(@RequestParam("editAddressCode") final String editAddressCode, final Model model,
			final RedirectAttributes redirectAttributes) throws CMSItemNotFoundException
	{


		return ControllerConstants.Views.Pages.MultiStepCheckout.AddEditDeliveryAddressPage;
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	@RequireHardLogIn
	public String edit(final AddressForm addressForm, final BindingResult bindingResult, final Model model,
			final RedirectAttributes redirectModel) throws CMSItemNotFoundException
	{


		return getCheckoutStep().nextStep();
	}



	@RequestMapping(value = "/remove", method =
	{ RequestMethod.GET, RequestMethod.POST })
	@RequireHardLogIn
	public String removeAddress(@RequestParam("addressCode") final String addressCode, final RedirectAttributes redirectModel,
			final Model model) throws CMSItemNotFoundException
	{


		return getCheckoutStep().currentStep();
	}

	@RequestMapping(value = "/select", method = RequestMethod.POST)
	@RequireHardLogIn
	public String doSelectSuggestedAddress(final AddressForm addressForm, final RedirectAttributes redirectModel)
	{

		return getCheckoutStep().nextStep();
	}


	/**
	 * This method gets called when the "Use this Address" button is clicked. It sets the selected delivery address on
	 * the checkout facade - if it has changed, and reloads the page highlighting the selected delivery address.
	 *
	 * @param selectedAddressCode
	 *           - the id of the delivery address.
	 *
	 * @return - a URL to the page to load.
	 */
	@RequestMapping(value = "/select", method = RequestMethod.GET)
	@RequireHardLogIn
	public String doSelectDeliveryAddress(@RequestParam("selectedAddressCode") final String selectedAddressCode,
			final RedirectAttributes redirectAttributes)
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

	protected String getBreadcrumbKey()
	{
		return "checkout.multi." + getCheckoutStep().getProgressBarId() + ".breadcrumb";
	}

	protected CheckoutStep getCheckoutStep()
	{
		return getCheckoutStep(TRAVELER_DETAILS);
	}



}
