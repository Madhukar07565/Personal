/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.cnk.travelogix.b2c.facades.order;

import de.hybris.platform.basecommerce.enums.OrderEntryStatus;
import de.hybris.platform.catalog.CatalogService;
import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.catalog.enums.ArticleApprovalStatus;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.commercefacades.order.data.AbstractOrderData;
import de.hybris.platform.commercefacades.order.data.CartData;
import de.hybris.platform.commercefacades.order.data.CartModificationData;
import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.commercefacades.order.impl.DefaultCartFacade;
import de.hybris.platform.commerceservices.order.CommerceCartModification;
import de.hybris.platform.commerceservices.order.CommerceCartModificationException;
import de.hybris.platform.commerceservices.service.data.CommerceCartParameter;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.ProductService;
import de.hybris.platform.product.UnitService;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.velocity.runtime.parser.node.MathUtils;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.ui.Model;

import com.cnk.travelogix.b2c.services.order.service.EzgCommerceCartService;
import com.cnk.travelogix.common.core.cart.data.AccommodationTravellerData;
import com.cnk.travelogix.common.core.cart.data.FlightTravellerData;
import com.cnk.travelogix.common.core.cart.data.OrderFlightDetailInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderRoomDetailInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderTicketInfoData;
import com.cnk.travelogix.common.core.enums.OrderEntryTypeEnum;
import com.cnk.travelogix.common.core.enums.ProductTypeEnum;
import com.cnk.travelogix.common.core.model.AccommodationTravellerModel;
import com.cnk.travelogix.common.core.model.DummyProductModel;
import com.cnk.travelogix.common.core.model.FlightTravellerModel;
import com.cnk.travelogix.common.core.model.OrderFlightDetailInfoModel;
import com.cnk.travelogix.common.core.model.OrderProductInfoModel;
import com.cnk.travelogix.common.core.model.OrderRoomDetailInfoModel;
import com.cnk.travelogix.common.core.model.OrderTicketInfoModel;
import com.cnk.travelogix.common.core.model.TravelInsuranceModel;
import com.cnk.travelogix.common.core.model.TravellerModel;
import com.cnk.travelogix.common.core.order.mock.CnkProductSearchService;
import com.cnk.travelogix.common.core.order.service.OrderProductService;
import com.cnk.travelogix.common.facades.order.populators.reverse.OrderTicketReversePopulator;
import com.cnk.travelogix.common.facades.product.data.hotel.HotelData;


public class B2cCartFacade extends DefaultCartFacade
{
	@Resource(name = "catalogVersionService")
	private CatalogVersionService catalogVersionService;
	@Resource(name = "catalogService")
	private CatalogService catalogService;
	@Resource
	private ProductService productService;
	@Resource
	private OrderProductService orderProductService;
	@Resource
	private UnitService unitService;
	@Resource
	EzgCommerceCartService ezgCommerceCartService;
	@Resource(name="mockHotelProductSearchService")
	private CnkProductSearchService  cnkProductSearchService;//TODO SI 
	
	private Converter<AbstractOrderData, AbstractOrderData> groupOrderEntryConverter;

	private Populator<OrderRoomDetailInfoData, OrderRoomDetailInfoModel> roomReversePopulator;
	private Populator<AccommodationTravellerData, AccommodationTravellerModel> hotelTravelerReversePopulator;
	private Populator<FlightTravellerData, FlightTravellerModel> flightTravelerReversePopulator;

	@Resource
	private OrderTicketReversePopulator orderTicketReversePopulator;

	private ModelService modelService;
	private static final Logger LOG = Logger.getLogger(B2cCartFacade.class);

	/**
	 * add 1 room to cart, or add several same room to cart.
	 */
	public CartModificationData addHotelToCart(final OrderRoomDetailInfoData roomData, final long quantity)
			throws CommerceCartModificationException
	{
		final ProductModel product = getHotelProduct(roomData.getHotelId(), "supplier1");
		final CartModel cartModel = getCartService().getSessionCart();
		final CommerceCartParameter parameter = new CommerceCartParameter();
		parameter.setEnableHooks(true);
		parameter.setCart(cartModel);
		parameter.setQuantity(quantity);
		parameter.setProduct(product);
		parameter.setUnit(product.getUnit());
		parameter.setCreateNewEntry(true);
		parameter.setOrderProductInfo(createRoomModel(roomData));

		final CommerceCartModification modification = ezgCommerceCartService.addToCart(parameter);

		return getCartModificationConverter().convert(modification);
	}

	/**
	 * Add flights to cart.
	 */
	public List<CartModificationData> addFlightsToCart(final List<OrderFlightDetailInfoData> orderFlightDetailInfoDatas,
			final Model model) throws CommerceCartModificationException
	{
		final List<CommerceCartModification> cartModificationList = new ArrayList<CommerceCartModification>();

		for (final OrderFlightDetailInfoData OrderFlightDetailInfoData : orderFlightDetailInfoDatas)
		{
			for (final OrderTicketInfoData orderTicketInfoData : OrderFlightDetailInfoData.getOrderTicketList())
			{
				final ProductModel product = getFlightProduct("E00Indigo", "supplier1");
				final CartModel cartModel = getCartService().getSessionCart();
				final CommerceCartParameter parameter = new CommerceCartParameter();
				parameter.setEnableHooks(true);
				parameter.setCart(cartModel);
				//As we add one unique product each time so we just set the quantity as 1.
				parameter.setQuantity(1);
				parameter.setProduct(product);
				parameter.setUnit(product.getUnit());
				parameter.setCreateNewEntry(true);
				parameter.setOrderProductInfo(createOrderTicketDetailModel(orderTicketInfoData));

				CommerceCartModification modification = null;
				try
				{
					modification = ezgCommerceCartService.addToCart(parameter);
					model.addAttribute("quantity", Long.valueOf(modification.getQuantityAdded()));
					model.addAttribute("cartCode",
							modification.getEntry() != null ? modification.getEntry().getOrder() != null ? modification.getEntry()
									.getOrder().getCode() : null : null);
					if (modification.getQuantityAdded() == 0L)
					{
						model.addAttribute("errorMsg", "basket.information.quantity.noItemsAdded." + modification.getStatusCode());
					}
					else if (modification.getQuantityAdded() < cartModificationList.size())
					{
						model.addAttribute("errorMsg",
								"basket.information.quantity.reducedNumberOfItemsAdded." + modification.getStatusCode());
					}

				}
				catch (final CommerceCartModificationException ex)
				{
					logDebugException(ex);
					model.addAttribute("errorMsg", "basket.error.occurred");
					model.addAttribute("quantity", Long.valueOf(0L));
				}
				if (modification != null)
				{
					cartModificationList.add(modification);
				}
			}
		}

		if (cartModificationList.isEmpty())
		{
			throw new CommerceCartModificationException("Modification quantity must not be less than one.");
		}
		return Converters.convertAll(cartModificationList, getCartModificationConverter());
	}

	public long getExpireTime()
	{
		//TODO SI get expire time from prod from SI
		final long fiveMin = 120000;
		return fiveMin;
	}

	public List<CommerceCartModification> checkAvaiablility() throws CommerceCartModificationException
	{
		final CommerceCartParameter parameters = new CommerceCartParameter();
		parameters.setCart(getCartService().getSessionCart());
		parameters.setEnableHooks(true);
		//1,validate
		//2,remove invalid prod
		//3,calculate cart
		final List<CommerceCartModification> errors = ezgCommerceCartService.validateCart(parameters);
		return errors;
	}

	public List<CommerceCartModification> checkAvaiablilityWithThreshold() throws CommerceCartModificationException
	{
		final List<CommerceCartModification> errors = this.checkAvaiablility();
		//TODO get threshold from prod from SI

		return errors;
	}

	/**
	 * create room model before add to cart TODO
	 */
	private OrderRoomDetailInfoModel createRoomModel(final OrderRoomDetailInfoData roomData)
	{
		// TODO get room from SI
		HotelData mockhotel = (HotelData) cnkProductSearchService.searchProductDetail(roomData.getHotelId());

		orderProductService.populateOrderProductFromSIProduct(mockhotel, roomData);
		OrderRoomDetailInfoModel roomModel = orderProductService.createRoomModel(roomData);

		roomReversePopulator.populate(roomData, roomModel);
		return roomModel;
	}

	/**
	 * create order ticket model before add to cart.
	 */
	private OrderTicketInfoModel createOrderTicketDetailModel(final OrderTicketInfoData orderTicketInfoData)
	{
		final OrderTicketInfoModel orderTicketInfoModel = modelService.create(OrderTicketInfoModel.class);

		this.orderTicketReversePopulator.populate(orderTicketInfoData, orderTicketInfoModel);
		modelService.save(orderTicketInfoModel);
		return orderTicketInfoModel;
	}

	/**
	 * get rooms info/traveler info grouped by groupId, hotelId
	 */
	public List<OrderEntryData> getHotelInfoByGroup(final AbstractOrderData groupedCartData)
	{
		List<OrderEntryData> hotels = new ArrayList<OrderEntryData>();

		List<OrderEntryData> entries = groupedCartData.getEntries();

		for (OrderEntryData entry : entries)
		{
			if (OrderEntryTypeEnum.HOTEL.equals(entry.getOrderEntryType()))
			{
				hotels.add(entry);
			}
		}

		return hotels;
	}

	public AbstractOrderData getGroupedCartData(final CartData cartData)
	{
		AbstractOrderData groupedCartData = getGroupOrderEntryConverter().convert(cartData);
		
		return groupedCartData;
	}
	/**
	 * Get Order Entry By Ticket.
	 *
	 */
	public List<OrderEntryData> getTicketInfoByGroup(final AbstractOrderData cartData)
	{
		final List<OrderEntryData> entries = new ArrayList<OrderEntryData>();

		for (final OrderEntryData entry : cartData.getEntries())
		{
			if (OrderEntryTypeEnum.FLIGHT_GROUP.equals(entry.getOrderEntryType()))
			{
				entries.add(entry);
			}
		}

		return entries;
	}

	/*
	 * TODO mock hotel and air company data in hybris master data(most), we use this hotel as OOTB product . for hotel
	 * and aircompany not in master data, we create a dummy product to set to OOTB product. save room and flight prod
	 * info to orderProductInfo.
	 */
	private ProductModel getHotelProduct(final String code, final String supplier)
	{
		final HotelData mockhotel = (HotelData) cnkProductSearchService.searchProductDetail(code);
		return convertDataToModel(mockhotel);
	}

	/*
	 * TODO mock air company data in hybris master data(most), we use this airline as OOTB product . foraircompany not in
	 * master data, we create a dummy product to set to OOTB product. save flight prod info to orderProductInfo.
	 */
	private ProductModel getFlightProduct(final String code, final String supplier)
	{
		final ProductModel product = getProductService().getProductForCode(catalogService.getCatalogVersion("EZ-IN", "Online"),
				"E00Indigo");

		return product;
	}

	/**
	 * TODO mock
	 */
	private ProductModel convertDataToModel(final HotelData hoteData)
	{
		DummyProductModel pmodel;
		final CatalogVersionModel catalogVersion = catalogService.getCatalogVersion("EZ-IN", "Online");

		final List<ProductModel> p = orderProductService.getProductForCode(catalogVersion, hoteData.getId());
		
		if (p != null && !p.isEmpty())
		{
			pmodel = (DummyProductModel) p.get(0);
		}
		else
		{
			pmodel = modelService.create(DummyProductModel.class);
			hoteData.getRooms();
			pmodel.setUnit(unitService.getUnitForCode("pieces"));
			pmodel.setCode(hoteData.getId());
			pmodel.setMaxOrderQuantity(Integer.valueOf(Integer.MAX_VALUE));
			pmodel.setName(hoteData.getBrand(), Locale.ENGLISH);
			pmodel.setApprovalStatus(ArticleApprovalStatus.APPROVED);
			pmodel.setCatalogVersion(catalogVersion);
			//TODO
			pmodel.setDescription( hoteData.getAddress());
			modelService.save(pmodel);
		}
		return pmodel;
	}

	/**
	 * get hotel info from entry, set traveler info to room, set room info to hotel, then save entry.
	 */
	public void saveTravelersInfo(final Map<String, AccommodationTravellerData> travelersData)
	{
		final CartModel cartModel = getCartService().getSessionCart();
		final List<AbstractOrderEntryModel> entries = cartModel.getEntries();
		for (final AbstractOrderEntryModel entry : entries)
		{
			final Integer entryNumber = entry.getEntryNumber();
			final AccommodationTravellerData traveler = travelersData.get(entryNumber.toString());
			if (traveler != null && entry.getProductTypeEnum().equals(ProductTypeEnum.ROOM))
			{
				final Set<TravellerModel> existingTravelers = entry.getTraveller();
				AccommodationTravellerModel travelerModel;
				// get existing traveler on entry
				if (existingTravelers != null && !existingTravelers.isEmpty())
				{
					travelerModel = (AccommodationTravellerModel) existingTravelers.iterator().next();
				}
				else
				//create a new traveler model and save to entry
				{
					travelerModel = createAccommodationTravellerModel();
					travelerModel.setAbstractOrderEntry(entry);
					final Set<TravellerModel> set = new HashSet<TravellerModel>();
					set.add(travelerModel);
					entry.setTraveller(set);
				}

				//covertAccommodationTravellerDataToModel(traveler, travelerModel);
				hotelTravelerReversePopulator.populate(traveler, travelerModel);

				// save updated model
				modelService.save(travelerModel);
				modelService.save(entry);
			}
		}

		modelService.save(cartModel);
	}

	/**
	 * TODO refactor these method of update flags
	 */
	public void updateTermsAndConditionFlag(final Map<String, Boolean> map)
	{
		final CartModel cartModel = getCartService().getSessionCart();
		final List<AbstractOrderEntryModel> entries = cartModel.getEntries();
		for (final AbstractOrderEntryModel entry : entries)
		{
			final Integer entryNumber = entry.getEntryNumber();
			final Boolean val = map.get(String.valueOf(entryNumber));
			if (val != null && val.booleanValue())
			{
				final OrderProductInfoModel orderProd = entry.getOrderProductInfo();
				//TODO moved to hotel
				//orderProd.setAgreeTerms(Boolean.TRUE);
				// save updated model
				modelService.save(orderProd);
			}

			modelService.save(entry);
		}
		//modelService.save(cartModel);
	}

	/**
	 * Save Flight Travelers Info.
	 */
	public void saveFlightTravelersInfo(final Map<String, FlightTravellerData> travelersData)
	{
		final CartModel cartModel = getCartService().getSessionCart();
		final List<AbstractOrderEntryModel> entries = cartModel.getEntries();
		for (final AbstractOrderEntryModel entry : entries)
		{
			final Integer entryNumber = entry.getEntryNumber();
			final FlightTravellerData traveler = travelersData.get(entryNumber.toString());
			if (traveler != null && entry.getProductTypeEnum().equals(ProductTypeEnum.TICKET))
			{
				final Set<TravellerModel> existingTravelers = entry.getTraveller();
				FlightTravellerModel travelerModel;
				// get existing traveler on entry
				if (existingTravelers != null && !existingTravelers.isEmpty())
				{
					travelerModel = (FlightTravellerModel) existingTravelers.iterator().next();
				}
				else
				{
					final FlightTravellerModel flightTraveller = modelService.create(FlightTravellerModel.class);
					travelerModel = flightTraveller;
					final Set<TravellerModel> set = new HashSet<TravellerModel>();
					set.add(travelerModel);
					entry.setTraveller(set);
				}

				this.flightTravelerReversePopulator.populate(traveler, travelerModel);
				// save updated model
				modelService.save(travelerModel);
				modelService.save(entry);
			}
		}

		modelService.save(cartModel);
	}

	public void updateFixedInsuranceInfo(final Map<String, Boolean> map)
	{
		final CartModel cartModel = getCartService().getSessionCart();
		final List<AbstractOrderEntryModel> entries = cartModel.getEntries();
		for (final AbstractOrderEntryModel entry : entries)
		{
			final Integer entryNumber = entry.getEntryNumber();
			final Boolean val = map.get(String.valueOf(entryNumber));
			if (val != null && val.booleanValue())
			{
				//TODO get fixed insurance from DB.
				final TravelInsuranceModel insu = modelService.create(TravelInsuranceModel.class);
				insu.setCode("INS-1");
				insu.setCostPrice(Double.valueOf(129));

				OrderProductInfoModel prod = entry.getOrderProductInfo();
				if (prod instanceof OrderRoomDetailInfoModel)
				{
					final OrderRoomDetailInfoModel room = (OrderRoomDetailInfoModel) prod;
					final Number total = MathUtils.add(Integer.valueOf(room.getNumberOfAdult()),
							Integer.valueOf(room.getNumberOfChild()));
					insu.setTotalPrice(Double.valueOf(129 * total.intValue()));

					entry.setTravelInsurance(insu);
					// save updated model
					//				modelService.save(insu);
				}
			}

			modelService.save(entry);
		}
	}

	public void updateTimeLimit(final Map<String, Boolean> map)
	{
		final CartModel cartModel = getCartService().getSessionCart();
		final List<AbstractOrderEntryModel> entries = cartModel.getEntries();
		for (final AbstractOrderEntryModel entry : entries)
		{
			final Integer entryNumber = entry.getEntryNumber();
			final Boolean val = map.get(String.valueOf(entryNumber));
			if (val != null && val.booleanValue())
			{
				final OrderProductInfoModel orderProd = entry.getOrderProductInfo();
				//TODO moved
				//orderProd.setTimeLimit(Boolean.TRUE);
				// save updated model
				modelService.save(orderProd);
			}

			modelService.save(entry);
		}
	}

	/**
	 * remove all rooms under hotel which group id is parameter
	 */
	public void removeHotel(final String groupId) throws CommerceCartModificationException
	{
		final CartModel cartModel = getCartService().getSessionCart();
		final List<AbstractOrderEntryModel> entries = cartModel.getEntries();
		for (final AbstractOrderEntryModel entry : entries)
		{
			if (entry.getProductTypeEnum().equals(ProductTypeEnum.ROOM))
			{
				final OrderProductInfoModel prod = entry.getOrderProductInfo();
				if (prod != null && prod.getGroupId() != null && prod.getGroupId().equals(groupId))
				{
					final Integer entryNumber = entry.getEntryNumber();
					super.updateCartEntry(entryNumber.intValue(), 0l);
				}
			}
		}

		this.normalizeRoomIndex();
	}

	/**
	 * remove all ticket entries which group id is parameter
	 */
	public void removeEntriesByGroupId(final String groupId) throws CommerceCartModificationException
	{
		final CartModel cartModel = getCartService().getSessionCart();
		final List<AbstractOrderEntryModel> entries = cartModel.getEntries();
		for (final AbstractOrderEntryModel entry : entries)
		{
			if (entry.getProductTypeEnum().equals(ProductTypeEnum.TICKET))
			{
				final OrderProductInfoModel prod = entry.getOrderProductInfo();
				final OrderTicketInfoModel OrderTicketInfoModel = (OrderTicketInfoModel) prod;
				final OrderFlightDetailInfoModel orderFlightDetailInfoModel = OrderTicketInfoModel.getOrderFlightDetailInfo();
				if (orderFlightDetailInfoModel != null && orderFlightDetailInfoModel.getGroupId().equals(groupId))
				{
					final Integer entryNumber = entry.getEntryNumber();
					super.updateCartEntry(entryNumber.intValue(), 0l);
				}
			}
		}
	}

	/**
	 * after remove order entry, to normalize room index
	 */
	public void normalizeRoomIndex()
	{
		final CartModel cartModel = getCartService().getSessionCart();
		final List<AbstractOrderEntryModel> entries = new ArrayList<AbstractOrderEntryModel>(cartModel.getEntries());
		for (final AbstractOrderEntryModel entry : entries)
		{
			final OrderProductInfoModel product = entry.getOrderProductInfo();
			if (product instanceof OrderRoomDetailInfoModel)
			{
				final OrderRoomDetailInfoModel room = (OrderRoomDetailInfoModel) product;
				room.setRoomIndex(entry.getEntryNumber());
				getModelService().save(room);
			}
			getModelService().save(entry);
		}
	}

	public void removeUnavailableEntries() throws NumberFormatException, CommerceCartModificationException
	{
		final CartModel cartModel = getCartService().getSessionCart();
		final List<AbstractOrderEntryModel> entries = new ArrayList<AbstractOrderEntryModel>(cartModel.getEntries());
		for (final AbstractOrderEntryModel entry : entries)
		{
			if (OrderEntryStatus.DEAD.equals(entry.getQuantityStatus()))
			{
				Integer entryNumber = entry.getEntryNumber();
				this.updateCartEntry(Long.parseLong("" + entryNumber), 0l);
				this.normalizeRoomIndex();
			}

		}

		getModelService().save(cartModel);
	}
	/**
	 * create traveler model
	 */
	private AccommodationTravellerModel createAccommodationTravellerModel()
	{
		final AccommodationTravellerModel traveler = modelService.create(AccommodationTravellerModel.class);
		return traveler;
	}

	protected void logDebugException(final Exception ex)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug(ex);
		}
	}

	protected ModelService getModelService()
	{
		return modelService;
	}

	@Required
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	/**
	 * @return the roomReversePopulator
	 */
	public Populator<OrderRoomDetailInfoData, OrderRoomDetailInfoModel> getRoomReversePopulator()
	{
		return roomReversePopulator;
	}

	/**
	 * @param roomReversePopulator
	 *           the roomReversePopulator to set
	 */
	public void setRoomReversePopulator(final Populator<OrderRoomDetailInfoData, OrderRoomDetailInfoModel> roomReversePopulator)
	{
		this.roomReversePopulator = roomReversePopulator;
	}

	/**
	 * @return the hotelTravelerReversePopulator
	 */
	public Populator<AccommodationTravellerData, AccommodationTravellerModel> getHotelTravelerReversePopulator()
	{
		return hotelTravelerReversePopulator;
	}

	/**
	 * @param hotelTravelerReversePopulator
	 *           the hotelTravelerReversePopulator to set
	 */
	public void setHotelTravelerReversePopulator(
			final Populator<AccommodationTravellerData, AccommodationTravellerModel> hotelTravelerReversePopulator)
	{
		this.hotelTravelerReversePopulator = hotelTravelerReversePopulator;
	}

	/**
	 * @return the flightTravelerReversePopulator
	 */
	public Populator<FlightTravellerData, FlightTravellerModel> getFlightTravelerReversePopulator()
	{
		return flightTravelerReversePopulator;
	}

	/**
	 * @param flightTravelerReversePopulator
	 *           the flightTravelerReversePopulator to set
	 */
	public void setFlightTravelerReversePopulator(
			final Populator<FlightTravellerData, FlightTravellerModel> flightTravelerReversePopulator)
	{
		this.flightTravelerReversePopulator = flightTravelerReversePopulator;
	}

	/**
	 * @return the groupOrderEntryConverter
	 */
	public Converter<AbstractOrderData, AbstractOrderData> getGroupOrderEntryConverter()
	{
		return groupOrderEntryConverter;
	}

	/**
	 * @param groupOrderEntryConverter
	 *           the groupOrderEntryConverter to set
	 */
	public void setGroupOrderEntryConverter(final Converter<AbstractOrderData, AbstractOrderData> groupOrderEntryConverter)
	{
		this.groupOrderEntryConverter = groupOrderEntryConverter;
	}
	
	 

}
