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
package com.cnk.travelogix.b2c.storefront.controllers.misc;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.AbstractController;
import de.hybris.platform.acceleratorstorefrontcommons.forms.AddToCartOrderForm;
import de.hybris.platform.commercefacades.order.converters.populator.GroupCartModificationListPopulator;
import de.hybris.platform.commercefacades.order.data.CartData;
import de.hybris.platform.commercefacades.order.data.CartModificationData;
import de.hybris.platform.commercefacades.order.data.CnkCartEntryModificationData;
import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.commercefacades.product.ProductFacade;
import de.hybris.platform.commerceservices.order.CommerceCartModificationException;
import de.hybris.platform.util.Config;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.jgroups.util.UUID;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cnk.travelogix.b2c.facades.order.B2cCartFacade;
import com.cnk.travelogix.b2c.storefront.controllers.ControllerConstants;
import com.cnk.travelogix.b2c.storefront.forms.AddFlightToCartForm;
import com.cnk.travelogix.b2c.storefront.forms.AddHotelToCartForm;
import com.cnk.travelogix.b2c.storefront.forms.FlightLine;
import com.cnk.travelogix.b2c.storefront.forms.FlightLineDetail;
import com.cnk.travelogix.common.core.cart.data.AirlineIATAData;
import com.cnk.travelogix.common.core.cart.data.CommonFlightDetailInfoData;
import com.cnk.travelogix.common.core.cart.data.CommonFlightInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderFlightDetailInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderRoomDetailInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderTicketInfoData;
import com.cnk.travelogix.common.core.cart.data.PriceInfoData;
import com.cnk.travelogix.common.core.enums.CnkRoomType;
import com.cnk.travelogix.common.core.enums.PassengerType;
import com.cnk.travelogix.common.facades.product.CnkProductSearchFacade;
import com.cnk.travelogix.common.facades.product.data.flight.FlightData;
import com.cnk.travelogix.common.facades.product.data.flight.FlightDetailData;


/**
 * Controller for Add to Cart functionality which is not specific to a certain page.
 */
@Controller
@Scope("tenant")
public class AddToCartController extends AbstractController
{
	private static final String QUANTITY_ATTR = "quantity";
	private static final String TYPE_MISMATCH_ERROR_CODE = "typeMismatch";
	private static final String ERROR_MSG_TYPE = "errorMsg";
	private static final String QUANTITY_INVALID_BINDING_MESSAGE_KEY = "basket.error.quantity.invalid.binding";
	private static final String SHOWN_PRODUCT_COUNT = "b2cstorefront.storefront.minicart.shownProductCount";
	private static final String MINICART_PROD_COUNT = "minicartProdCount";
	private static final Logger LOG = Logger.getLogger(AddToCartController.class);

	@Resource(name = "b2cCartFacade")
	private B2cCartFacade b2cCartFacade;

	@Resource(name = "accProductFacade")
	private ProductFacade productFacade;

	@Resource(name = "groupCartModificationListPopulator")
	private GroupCartModificationListPopulator groupCartModificationListPopulator;

	@Resource(name = "flightSearchFacade")
	CnkProductSearchFacade CnkProductSearchFacade;

	@RequestMapping(value = "/cart/add/hotel", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public Map addToCart(final Model model, @Valid final AddHotelToCartForm form, final BindingResult bindingErrors,
			final HttpSession session) throws ParseException
	{
		final Map map = new HashMap();
		if (bindingErrors.hasErrors())
		{
			map.put("status", "addtocart-failed");
			map.put("errors", bindingErrors);
			//			return getViewWithBindingErrorMessages(model, bindingErrors);
			return map;
		}

		//validateForm(form);

		final String qtyString = form.getNumberOfRoom();

		final long qty = Long.parseLong(qtyString);
		if (StringUtils.isEmpty(qtyString) || qty <= 0)
		{
			model.addAttribute(ERROR_MSG_TYPE, "basket.error.quantity.invalid");
			model.addAttribute(QUANTITY_ATTR, Long.valueOf(0L));
		}
		else
		{
			try
			{
				//For edit mode, first remove, then add new entries.
				final String originalGrpId = form.getOriginalGroupId();
				if (originalGrpId != null && StringUtils.isNotEmpty(originalGrpId))
				{
					b2cCartFacade.removeHotel(originalGrpId);
				}

				final OrderRoomDetailInfoData room = populateRoomDataFromForm(form);
				final CartModificationData cartModification = b2cCartFacade.addHotelToCart(room, qty);
				model.addAttribute(QUANTITY_ATTR, Long.valueOf(cartModification.getQuantityAdded()));

				model.addAttribute("cartCode", cartModification.getCartCode());

				final List<CnkCartEntryModificationData> entries = cartModification.getEntries();
				model.addAttribute("entries", entries);

				if (cartModification.getQuantityAdded() == 0L)
				{
					model.addAttribute(ERROR_MSG_TYPE, "basket.information.quantity.noItemsAdded." + cartModification.getStatusCode());
				}
				else if (cartModification.getQuantityAdded() < qty)
				{
					model.addAttribute(ERROR_MSG_TYPE,
							"basket.information.quantity.reducedNumberOfItemsAdded." + cartModification.getStatusCode());
				}
			}
			catch (final CommerceCartModificationException ex)
			{
				logDebugException(ex);
				model.addAttribute(ERROR_MSG_TYPE, "basket.error.occurred");
				model.addAttribute(QUANTITY_ATTR, Long.valueOf(0L));
			}
		}

		//		model.addAttribute("product", productFacade.getProductForCodeAndOptions(form.getHotelId(), Arrays.asList(ProductOption.BASIC)));
		//		model.addAttribute("entries", b2cCartFacade.getSessionCart().getEntries());
		final CartData cart = b2cCartFacade.getSessionCart();
		model.addAttribute("cart", cart);
		//return "redirect:/cart";
		//return ControllerConstants.Views.Fragments.Cart.MiniCartFragment;
		session.setAttribute(MINICART_PROD_COUNT, cart.getTotalUnitCount());


		map.put("totalCount", cart.getTotalUnitCount());
		map.put("status", "addtocart-success");
		return map;
	}

	@RequestMapping(value = "/cart/add/flight", method = RequestMethod.POST)
	@ResponseBody
	public Map addFlightToCart(final Model model,
			@Valid @ModelAttribute("addFlightToCartForm") final AddFlightToCartForm addFlightToCartForm,
			final BindingResult bindingErrors, final HttpSession session) throws ParseException
	{
		final Map map = new HashMap();
		if (bindingErrors.hasErrors())
		{
			map.put("status", "addtocart-failed");
			map.put("errors", bindingErrors);
			return map;
		}

		int qty = 0;

		if (addFlightToCartForm.isBooking())
		{
			qty = addFlightToCartForm.getFlights().size();
		}
		else
		{
			qty = addFlightToCartForm.getFlightIds().size();
		}


		if (qty == 0)
		{
			model.addAttribute(ERROR_MSG_TYPE, "basket.error.quantity.invalid");
			model.addAttribute(QUANTITY_ATTR, Long.valueOf(0L));
		}
		else
		{
			try
			{
				//For edit mode, first remove, then add new entries.
				final String originalGrpId = addFlightToCartForm.getOriginalGroupId();
				if (originalGrpId != null && StringUtils.isNotEmpty(originalGrpId))
				{
					b2cCartFacade.removeEntriesByGroupId(originalGrpId);
				}
				final List<OrderFlightDetailInfoData> OrderFlightDetailInfoDatas = this
						.populateOrderFlightDataFromForm(addFlightToCartForm);
				final List<CartModificationData> cartModificationDataList = b2cCartFacade.addFlightsToCart(
						OrderFlightDetailInfoDatas, model);
				model.addAttribute("cartModificationDataList", cartModificationDataList);
			}
			catch (final CommerceCartModificationException ex)
			{
				logDebugException(ex);
				model.addAttribute(ERROR_MSG_TYPE, "basket.error.occurred");
				model.addAttribute(QUANTITY_ATTR, Long.valueOf(0L));
			}
		}

		final CartData cart = b2cCartFacade.getSessionCart();
		model.addAttribute("cart", cart);
		session.setAttribute(MINICART_PROD_COUNT, cart.getTotalUnitCount());


		map.put("totalCount", cart.getTotalUnitCount());
		map.put("status", "addtocart-success");
		return map;
	}

	@RequestMapping(value = "/cart/book/flight", method = RequestMethod.POST)
	public String bookFlight(final Model model,
			@Valid @ModelAttribute("addFlightToCartForm") final AddFlightToCartForm addFlightToCartForm,
			final BindingResult bindingErrors) throws ParseException
	{
		if (bindingErrors.hasErrors())
		{
			return getViewWithBindingErrorMessages(model, bindingErrors);
		}

		//validateForm(form);
		int qty = 0;

		if (addFlightToCartForm.isBooking())
		{
			qty = addFlightToCartForm.getFlights().size();
		}
		else
		{
			qty = addFlightToCartForm.getFlightIds().size();
		}


		if (qty == 0)
		{
			model.addAttribute(ERROR_MSG_TYPE, "basket.error.quantity.invalid");
			model.addAttribute(QUANTITY_ATTR, Long.valueOf(0L));
		}
		else
		{
			try
			{
				//For edit mode, first remove, then add new entries.
				final String originalGrpId = addFlightToCartForm.getOriginalGroupId();
				if (originalGrpId != null && StringUtils.isNotEmpty(originalGrpId))
				{
					b2cCartFacade.removeEntriesByGroupId(originalGrpId);
				}
				final List<OrderFlightDetailInfoData> OrderFlightDetailInfoDatas = this
						.populateOrderFlightDataFromForm(addFlightToCartForm);
				final List<CartModificationData> cartModificationDataList = b2cCartFacade.addFlightsToCart(
						OrderFlightDetailInfoDatas, model);
				model.addAttribute("cartModificationDataList", cartModificationDataList);
			}
			catch (final CommerceCartModificationException ex)
			{
				logDebugException(ex);
				model.addAttribute(ERROR_MSG_TYPE, "basket.error.occurred");
				model.addAttribute(QUANTITY_ATTR, Long.valueOf(0L));
			}
		}

		model.addAttribute("cart", b2cCartFacade.getSessionCart());
		return "redirect:/cart";
	}

	private OrderRoomDetailInfoData populateRoomDataFromForm(final AddHotelToCartForm form) throws ParseException
	{
		final OrderRoomDetailInfoData room = new OrderRoomDetailInfoData();
		room.setHotelId(form.getHotelId());
		room.setRoomId(form.getRoomId());
		room.setRoomType(CnkRoomType.valueOf(form.getRoomType()));
		room.setNumberOfAdult(form.getNumberOfAdult());
		room.setNumberOfChild(form.getNumberOfChild());
		room.setGroupId(form.getGroupId());
		room.setRoomCheckinDate(form.getCheckInDate());
		room.setRoomCheckoutDate(form.getCheckOutDate());
		room.setNumberOfNight(form.getNumberOfNight());
		return room;
	}

	/**
	 * Populate Order Flight Data From Form.
	 *
	 * @param form
	 * @return List<OrderFlightDetailInfoData>
	 * @throws ParseException
	 */
	private List<OrderFlightDetailInfoData> populateOrderFlightDataFromForm(final AddFlightToCartForm form) throws ParseException
	{
		List<FlightLine> flights = new ArrayList<FlightLine>();
		if (form.isBooking())
		{
			if (CollectionUtils.isNotEmpty(form.getFlights()))
			{
				flights = form.getFlights();
			}
		}
		else
		{
			if (CollectionUtils.isNotEmpty(form.getFlightIds()))
			{
				int index = 0;
				for (final String flightProductId : form.getFlightIds())
				{
					final FlightData singleFlight = (FlightData) CnkProductSearchFacade.searchProductDetail(flightProductId);
					flights.add(this.ConvertFlightDataToForm(singleFlight, form.getSelectedFareTypes().get(index)));
					index++;
				}
			}
		}

		final List<OrderFlightDetailInfoData> orderFlightDetailInfos = new ArrayList<OrderFlightDetailInfoData>();
		final String groupId = UUID.randomUUID().toString();
		final int numberOfAdult = form.getNumberOfAdult();
		final int numberOfChild = form.getNumberOfChild();
		final int numberOfInfant = form.getNumberOfInfant();
		String journeyType = form.getJourneyType();
		if (journeyType.equals("oneway"))
		{
			journeyType = "ONE_WAY";
		}
		else if (journeyType.equals("twoway"))
		{
			journeyType = "RETURN";
		}
		else
		{
			journeyType = "MULTI_CITY";
		}
		int i = 1;
		for (final FlightLine flightLine : flights)
		{
			if (flightLine != null)
			{
				final OrderFlightDetailInfoData orderFlightDetailInfoData = new OrderFlightDetailInfoData();

				orderFlightDetailInfoData.setJourneyType(journeyType);
				orderFlightDetailInfoData.setGroupId(groupId);
				orderFlightDetailInfoData.setSequence(String.valueOf(i));
				orderFlightDetailInfoData.setCommonFlightInfoData(copyFormCommonData(flightLine));
				final List<OrderTicketInfoData> OrderTicketInfoDatas = this.generateOrderTicketData(flightLine, numberOfAdult,
						numberOfChild, numberOfInfant, orderFlightDetailInfoData);
				orderFlightDetailInfoData.setOrderTicketList(OrderTicketInfoDatas);
				orderFlightDetailInfos.add(orderFlightDetailInfoData);
				i++;
			}
		}
		return orderFlightDetailInfos;
	}

	/**
	 * Convert Flight Data To Form.
	 *
	 * @param flightData
	 * @return FlightLine;
	 */
	private FlightLine ConvertFlightDataToForm(final FlightData flightData, final String fareType)
	{
		final FlightLine flightLine = new FlightLine();
		final AirlineIATAData airlineIATAData = new AirlineIATAData();
		if (flightData.getAirlineIATA() != null)
		{
			airlineIATAData.setAccountingCode(flightData.getAirlineIATA().getAccountingCode());
			airlineIATAData.setAirlineName(flightData.getAirlineIATA().getAirlineName());
			airlineIATAData.setAirlinePrefix(flightData.getAirlineIATA().getAirlinePrefix());
		}
		flightLine.setAirlineIATA(airlineIATAData);
		flightLine.setArrivalTime(flightData.getArrivalTime());
		flightLine.setCabinClass(flightData.getCabinClass());
		flightLine.setDepartureTime(flightData.getDepartureTime());
		flightLine.setDuration(flightData.getDuration());
		flightLine.setFlightNumber(flightData.getFlightNumber());
		flightLine.setFromCity(flightData.getFromSection() != null ? flightData.getFromSection().getCity() : StringUtils.EMPTY);
		flightLine.setFromTerminal(flightData.getFromSection() != null ? flightData.getFromSection().getTerminal()
				: StringUtils.EMPTY);
		flightLine.setNumberOfStops(flightData.getNumberOfStops());
		final PriceInfoData priceInfoData = new PriceInfoData();
		if (!CollectionUtils.isEmpty(flightData.getFareSummary()))
		{
			priceInfoData
					.setCostPrice(Double.parseDouble(flightData.getFareSummary().get(Integer.parseInt(fareType)).getWebPrice()));
		}

		flightLine.setPriceInfoData(priceInfoData);
		flightLine.setToCity(flightData.getToSection() != null ? flightData.getToSection().getCity() : StringUtils.EMPTY);
		flightLine.setToTerminal(flightData.getToSection() != null ? flightData.getToSection().getTerminal() : StringUtils.EMPTY);
		final List<FlightLineDetail> flightLineDetails = new ArrayList<FlightLineDetail>();
		if (CollectionUtils.isNotEmpty(flightData.getFlightDetails()))
		{
			for (final FlightDetailData flightDetailData : flightData.getFlightDetails())
			{
				final FlightLineDetail flightLineDetail = new FlightLineDetail();
				flightLineDetail.setArrivalTime(flightDetailData.getArrivalTime());
				flightLineDetail.setCabinClass(flightDetailData.getCabinClass());
				flightLineDetail.setDepartureTime(flightDetailData.getDepartureTime());
				flightLineDetail.setDuration(flightDetailData.getDuration());
				flightLineDetail.setFlightNumber(flightDetailData.getFlightNumber());
				flightLineDetail.setFromCity(flightDetailData.getFromSection() != null ? flightDetailData.getFromSection().getCity()
						: StringUtils.EMPTY);
				flightLineDetail.setFromTerminal(flightDetailData.getFromSection() != null ? flightDetailData.getFromSection()
						.getTerminal() : StringUtils.EMPTY);
				flightLineDetail.setToCity(flightDetailData.getToSection() != null ? flightDetailData.getToSection().getCity()
						: StringUtils.EMPTY);
				flightLineDetail.setToTerminal(flightDetailData.getToSection() != null ? flightDetailData.getToSection()
						.getTerminal() : StringUtils.EMPTY);
				flightLineDetails.add(flightLineDetail);
			}
		}
		flightLine.getFlightDetails().addAll(flightLineDetails);
		return flightLine;
	}

	/**
	 * Copy form data to common flight info.
	 *
	 * @param flightLine
	 * @return CommonFlightInfoData
	 */
	private CommonFlightInfoData copyFormCommonData(final FlightLine flightLine)
	{
		final CommonFlightInfoData commonFlightInfoData = new CommonFlightInfoData();
		commonFlightInfoData.setAirlineIATAData(flightLine.getAirlineIATA());
		commonFlightInfoData.setArrivalTime(flightLine.getArrivalTime());
		commonFlightInfoData.setCabinClass(flightLine.getCabinClass());
		commonFlightInfoData.setDepartureTime(flightLine.getDepartureTime());
		commonFlightInfoData.setDuration(flightLine.getDuration());
		commonFlightInfoData.setFlightNumber(flightLine.getFlightNumber());
		commonFlightInfoData.setFromCity(flightLine.getFromCity());
		commonFlightInfoData.setFromTerminal(flightLine.getFromTerminal());
		commonFlightInfoData.setNumberOfStops(flightLine.getNumberOfStops());
		commonFlightInfoData.setPriceInfo(flightLine.getPriceInfoData());
		commonFlightInfoData.setToCity(flightLine.getToCity());
		commonFlightInfoData.setToTerminal(flightLine.getToTerminal());
		final List<CommonFlightDetailInfoData> commonFlightDetailInfoDatas = new ArrayList<CommonFlightDetailInfoData>();

		if (CollectionUtils.isNotEmpty(flightLine.getFlightDetails()))
		{
			for (final FlightLineDetail FlightLineDetail : flightLine.getFlightDetails())
			{
				final CommonFlightDetailInfoData commonFlightDetailInfoData = new CommonFlightDetailInfoData();
				commonFlightDetailInfoData.setArrivalTime(FlightLineDetail.getArrivalTime());
				commonFlightDetailInfoData.setCabinClass(FlightLineDetail.getCabinClass());
				commonFlightDetailInfoData.setDepartureTime(FlightLineDetail.getDepartureTime());
				commonFlightDetailInfoData.setDuration(FlightLineDetail.getDuration());
				commonFlightDetailInfoData.setFlightNumber(FlightLineDetail.getFlightNumber());
				commonFlightDetailInfoData.setFromCity(FlightLineDetail.getFromCity());
				commonFlightDetailInfoData.setFromTerminal(FlightLineDetail.getFromTerminal());
				commonFlightDetailInfoData.setToCity(FlightLineDetail.getToCity());
				commonFlightDetailInfoData.setToTerminal(FlightLineDetail.getToTerminal());
				commonFlightDetailInfoDatas.add(commonFlightDetailInfoData);
			}
		}
		commonFlightInfoData.setCommonFlightDetailList(commonFlightDetailInfoDatas);
		return commonFlightInfoData;
	}


	/**
	 * Generate Order Ticket Data.
	 *
	 * @param flightLine
	 * @param numberOfAdult
	 * @param numberOfChild
	 * @param numberOfInfant
	 * @return List<OrderTicketInfoData>
	 */
	private List<OrderTicketInfoData> generateOrderTicketData(final FlightLine flightLine, final int numberOfAdult,
			final int numberOfChild, final int numberOfInfant, final OrderFlightDetailInfoData orderFlightDetailInfoData)
	{
		final List<OrderTicketInfoData> OrderTicketInfoDatas = new ArrayList<OrderTicketInfoData>();

		int i = 0;
		int j = 0;
		int k = 0;
		while (i < numberOfAdult)
		{
			final OrderTicketInfoData orderTicketInfoData = new OrderTicketInfoData();
			orderTicketInfoData.setCommonFlightInfoData(this.copyFormCommonData(flightLine));
			orderTicketInfoData.setPassengerType(PassengerType.ADULT);
			orderTicketInfoData.setOrderFlightDetailInfoData(orderFlightDetailInfoData);
			final PriceInfoData priceInfoData = new PriceInfoData();
			priceInfoData.setCostPrice(flightLine.getPriceInfoData().getCostPrice());
			orderTicketInfoData.setPriceInfo(priceInfoData);
			OrderTicketInfoDatas.add(orderTicketInfoData);
			i++;
		}

		while (j < numberOfChild)
		{
			final OrderTicketInfoData orderTicketInfoData = new OrderTicketInfoData();
			orderTicketInfoData.setCommonFlightInfoData(this.copyFormCommonData(flightLine));
			orderTicketInfoData.setPassengerType(PassengerType.CHILD);
			orderTicketInfoData.setOrderFlightDetailInfoData(orderFlightDetailInfoData);
			final PriceInfoData priceInfoData = new PriceInfoData();
			priceInfoData.setCostPrice(flightLine.getPriceInfoData().getCostPrice());
			orderTicketInfoData.setPriceInfo(priceInfoData);
			OrderTicketInfoDatas.add(orderTicketInfoData);
			j++;
		}

		while (k < numberOfInfant)
		{
			final OrderTicketInfoData orderTicketInfoData = new OrderTicketInfoData();
			orderTicketInfoData.setCommonFlightInfoData(this.copyFormCommonData(flightLine));
			orderTicketInfoData.setPassengerType(PassengerType.INFANT);
			orderTicketInfoData.setOrderFlightDetailInfoData(orderFlightDetailInfoData);
			final PriceInfoData priceInfoData = new PriceInfoData();
			priceInfoData.setCostPrice(flightLine.getPriceInfoData().getCostPrice());
			orderTicketInfoData.setPriceInfo(priceInfoData);
			OrderTicketInfoDatas.add(orderTicketInfoData);
			k++;
		}
		return OrderTicketInfoDatas;
	}

	protected String getViewWithBindingErrorMessages(final Model model, final BindingResult bindingErrors)
	{
		for (final ObjectError error : bindingErrors.getAllErrors())
		{
			if (isTypeMismatchError(error))
			{
				model.addAttribute(ERROR_MSG_TYPE, QUANTITY_INVALID_BINDING_MESSAGE_KEY);
			}
			else
			{
				model.addAttribute(ERROR_MSG_TYPE, error.getDefaultMessage());
			}
		}
		return ControllerConstants.Views.Fragments.Cart.AddToCartPopup;
	}

	protected boolean isTypeMismatchError(final ObjectError error)
	{
		return error.getCode().equals(TYPE_MISMATCH_ERROR_CODE);
	}

	@RequestMapping(value = "/cart/addGrid", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public final String addGridToCart(@RequestBody final AddToCartOrderForm form, final Model model)
	{
		final Set<String> multidErrorMsgs = new HashSet<String>();
		final List<CartModificationData> modificationDataList = new ArrayList<CartModificationData>();

		for (final OrderEntryData cartEntry : form.getCartEntries())
		{
			if (!isValidProductEntry(cartEntry))
			{
				LOG.error("Error processing entry");
			}
			else if (!isValidQuantity(cartEntry))
			{
				multidErrorMsgs.add("basket.error.quantity.invalid");
			}
			else
			{
				addEntryToCart(multidErrorMsgs, modificationDataList, cartEntry);
			}
		}

		if (CollectionUtils.isNotEmpty(modificationDataList))
		{
			groupCartModificationListPopulator.populate(null, modificationDataList);

			model.addAttribute("modifications", modificationDataList);
		}

		if (CollectionUtils.isNotEmpty(multidErrorMsgs))
		{
			model.addAttribute("multidErrorMsgs", multidErrorMsgs);
		}

		model.addAttribute("numberShowing", Integer.valueOf(Config.getInt(SHOWN_PRODUCT_COUNT, 3)));


		return ControllerConstants.Views.Fragments.Cart.AddToCartPopup;
	}

	protected void logDebugException(final Exception ex)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug(ex);
		}
	}

	protected void addEntryToCart(final Set<String> multidErrorMsgs, final List<CartModificationData> modificationDataList,
			final OrderEntryData cartEntry)
	{
		try
		{
			final long qty = cartEntry.getQuantity().longValue();
			final CartModificationData cartModificationData = b2cCartFacade.addToCart(cartEntry.getProduct().getCode(), qty);
			if (cartModificationData.getQuantityAdded() == 0L)
			{
				multidErrorMsgs.add("basket.information.quantity.noItemsAdded." + cartModificationData.getStatusCode());
			}
			else if (cartModificationData.getQuantityAdded() < qty)
			{
				multidErrorMsgs.add("basket.information.quantity.reducedNumberOfItemsAdded." + cartModificationData.getStatusCode());
			}

			modificationDataList.add(cartModificationData);

		}
		catch (final CommerceCartModificationException ex)
		{
			multidErrorMsgs.add("basket.error.occurred");
			logDebugException(ex);
		}
	}

	protected boolean isValidProductEntry(final OrderEntryData cartEntry)
	{
		return cartEntry.getProduct() != null && StringUtils.isNotBlank(cartEntry.getProduct().getCode());
	}

	protected boolean isValidQuantity(final OrderEntryData cartEntry)
	{
		return cartEntry.getQuantity() != null && cartEntry.getQuantity().longValue() >= 1L;
	}
}
