/**
 *
 */
package com.cnk.travelogix.common.core.order.strategy;

import de.hybris.platform.basecommerce.enums.OrderEntryStatus;
import de.hybris.platform.commerceservices.order.CommerceCartModification;
import de.hybris.platform.commerceservices.order.CommerceCartModificationStatus;
import de.hybris.platform.commerceservices.service.data.CommerceCartParameter;
import de.hybris.platform.commerceservices.strategies.impl.DefaultCartValidationStrategy;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.CartEntryModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cnk.travelogix.common.core.enums.ProductTypeEnum;
import com.cnk.travelogix.common.core.model.OrderHotelDetailInfoModel;
import com.cnk.travelogix.common.core.model.OrderRoomDetailInfoModel;
import com.cnk.travelogix.common.core.model.PriceInfoModel;
import com.cnk.travelogix.common.core.order.ExtCartModificationStatus;
import com.cnk.travelogix.common.core.order.mock.CnkProductSearchService;
import com.cnk.travelogix.common.core.order.mock.HotelSearchParam;
import com.cnk.travelogix.common.core.order.mock.HotelSearchParam.RoomParam;
import com.cnk.travelogix.common.core.order.mock.HotelValidationResult;
import com.cnk.travelogix.common.core.order.mock.HotelValidationResult.RoomResult;
import com.cnk.travelogix.common.core.order.mock.util.CnkBookingUtils;


/**
 * @author i323801
 *
 */
public class EzgCartValidationStrategy extends DefaultCartValidationStrategy
{

	CnkProductSearchService cnkProductSearchService;

	@Override
	public List<CommerceCartModification> validateCart(final CommerceCartParameter parameter)
	{
		final CartModel cartModel = parameter.getCart();

		//clean payment and delivery info
		cleanCart(cartModel);

		if (cartModel != null && cartModel.getEntries() != null && !cartModel.getEntries().isEmpty())
		{
			List<AbstractOrderEntryModel> entries = cartModel.getEntries();
			//group entries by hotel/flight
			Map<String, List> m = CnkBookingUtils.groupOrderEntries(entries);
			
			//TODO SI
			Map<OrderHotelDetailInfoModel, HotelValidationResult> hotelResults = cnkProductSearchService
					.getHotelAvailibilityAndPrice(m.get("hotel"));
			
			//TODO SI
//			Map<OrderHotelDetailInfoModel, HotelValidationResult> flightResults = cnkProductSearchService
//					.getHotelAvailibilityAndPrice(m.get("flight"));

			final List<CommerceCartModification> modifications = new ArrayList<CommerceCartModification>();

			for (final AbstractOrderEntryModel orderEntryModel : cartModel.getEntries())
			{
				if (orderEntryModel.getProductTypeEnum().equals(ProductTypeEnum.ROOM))
				{
					OrderRoomDetailInfoModel orderRoomDetailInfoModel = (OrderRoomDetailInfoModel) orderEntryModel
							.getOrderProductInfo();
					OrderHotelDetailInfoModel hotel = orderRoomDetailInfoModel.getOrderHotelDetailInfo();
					modifications.add(validateCartEntry(cartModel, (CartEntryModel) orderEntryModel, hotelResults.get(hotel)));
				}
			}
			return modifications;
		}
		else
		{
			return Collections.emptyList();
		}
	}

	/**
	 * @param cartModel
	 * @param orderEntryModel
	 * @param hotelValidationResult
	 * @return
	 */
	private CommerceCartModification validateCartEntry(CartModel cartModel, CartEntryModel cartEntryModel,
			HotelValidationResult hotelValidationResult)
	{
		
		CommerceCartModification modification = new CommerceCartModification();
		
		if (hotelValidationResult == null)
		{
			return handleNotAvailableProduct(cartEntryModel);
		}
		// First verify that the hotel product exists in hybris
		try
		{
			getProductService().getProductForCode(cartEntryModel.getProduct().getCode());
		}
		catch (final UnknownIdentifierException e)
		{
			modification = handleNotAvailableProduct(cartEntryModel);
		}

		Map<String,RoomResult> roomResult = hotelValidationResult.getResultMap();
		OrderRoomDetailInfoModel room = (OrderRoomDetailInfoModel)cartEntryModel.getOrderProductInfo();
		RoomResult result = roomResult.get(room.getRoomId());
		
		int availableRooms = result.getNumberOfAvaiableRooms();
		if (availableRooms <= 0)
		{
			modification = handleNotAvailableProduct(cartEntryModel);
		}
		else
		{
			// -1
			result.setNumberOfAvaiableRooms(result.getNumberOfAvaiableRooms() - 1);

			double latestPrice = result.getPriceInfo();
			PriceInfoModel priceModel = room.getPriceInfo();
			priceModel.setCostPrice(latestPrice);
			getModelService().save(priceModel);
			 
			double orignalPrice = cartEntryModel.getBasePrice();
			if (orignalPrice == latestPrice)
			{
				modification = handlePriceChangeProduct(cartEntryModel, CommerceCartModificationStatus.SUCCESS, null);
			}
			else
			{
				if (latestPrice > orignalPrice)
				{
					double threshold = 100;
					if (latestPrice - orignalPrice > threshold)
					{
						cartEntryModel.setBasePrice(latestPrice);
						modification = handlePriceChangeProduct(cartEntryModel,
								ExtCartModificationStatus.PRICE_CHANGED_MORE_THAN_THREASHOLD, "the price changed more than threshold.");
					}
					else
					{
						modification = handlePriceChangeProduct(cartEntryModel,
								ExtCartModificationStatus.PRICE_CHANGED_LESS_THAN_THREASHOLD, "the price change less than threshold.");
					}
				}
				else
				{
					cartEntryModel.setBasePrice(latestPrice);
					modification = handlePriceChangeProduct(cartEntryModel, ExtCartModificationStatus.PRICE_REDUCED, "price reduced.");
				}

			}
		}
		return modification;
	}


	private CommerceCartModification handlePriceChangeProduct(CartEntryModel cartEntryModel, String statusCode, String message)
	{
		final CommerceCartModification modification = new CommerceCartModification();
		modification.setStatusCode(statusCode);
		modification.setQuantityAdded(1);
		modification.setQuantity(1);
		modification.setEntry(cartEntryModel);
		modification.setMessage(message);
		getModelService().save(cartEntryModel);
		return modification;
	}


	private CommerceCartModification handleNotAvailableProduct(CartEntryModel cartEntryModel)
	{
		final CommerceCartModification modification = new CommerceCartModification();
		modification.setStatusCode(CommerceCartModificationStatus.UNAVAILABLE);
		modification.setQuantityAdded(0);
		modification.setQuantity(0);
		modification.setEntry(cartEntryModel);
		modification.setMessage("the product is not available any more.");
		
		cartEntryModel.setQuantityStatus(OrderEntryStatus.DEAD);
		cartEntryModel.setBasePrice(0d);
		cartEntryModel.setTotalPrice(0d);
		cartEntryModel.setCalculated(Boolean.TRUE);
		cartEntryModel.setQuantity(0l);
		cartEntryModel.setTaxValues(Collections.EMPTY_LIST);
		cartEntryModel.setDiscountValues(Collections.EMPTY_LIST);
		//getModelService().remove(cartEntryModel);
		getModelService().save(cartEntryModel);

		return modification;
	}

	/**
	 * prepare params for SI
	 * 
	 * @param list
	 * @return
	 */
	private Map<String, HotelSearchParam> createHotelSearchParam(List<OrderHotelDetailInfoModel> list)
	{
		Map<String, HotelSearchParam> hotelsParam = new HashMap<String, HotelSearchParam>();
		for (OrderHotelDetailInfoModel hotel : list)
		{
			final String hotelId = hotel.getHotelId();
			HotelSearchParam hotelParam = hotelsParam.get(hotelId);
			if (hotelParam == null)
			{
				hotelParam = new HotelSearchParam();
				List<RoomParam> roomList = new ArrayList();
				hotelParam.setRooms(roomList);

				// TODO SI set supplier  
				//param.setSuppliers(suppliers);
			}

			populateHotelParamData(hotelParam, hotel);
			hotelsParam.put(hotelId, hotelParam);
		}

		return hotelsParam;
	}

	void populateHotelParamData(HotelSearchParam hotelParam, OrderHotelDetailInfoModel hotel)
	{
		hotelParam.setHotelId(hotel.getHotelId());
		final List<OrderRoomDetailInfoModel> rooms = hotel.getOrderRoomDetailInfo();
		for (OrderRoomDetailInfoModel room : rooms)
		{
			RoomParam e = hotelParam.new RoomParam();
			e.setRoomId(room.getRoomId());
			e.setNumOfAdult(Integer.parseInt(room.getNumberOfAdult()));
			e.setNumOfChild(Integer.parseInt(room.getNumberOfChild()));
			hotelParam.getRooms().add(e);
		}
		hotelParam.setCheckinDate(hotel.getHotelCheckinDate());
		hotelParam.setCheckoutDate(hotel.getHotelCheckoutDate());
		hotelParam.setNumberOfRooms(hotelParam.getNumberOfRooms() + Integer.parseInt(hotel.getNumberOfrooms()));
	}

	/**
	 * @return the cnkProductSearchService
	 */
	public CnkProductSearchService getCnkProductSearchService()
	{
		return cnkProductSearchService;
	}

	/**
	 * @param cnkProductSearchService
	 *           the cnkProductSearchService to set
	 */
	public void setCnkProductSearchService(CnkProductSearchService cnkProductSearchService)
	{
		this.cnkProductSearchService = cnkProductSearchService;
	}


}
