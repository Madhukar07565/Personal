/**
 *
 */
package com.cnk.travelogix.b2c.storefront.controllers.pages.checkout.steps.ezg;

import de.hybris.platform.acceleratorstorefrontcommons.annotations.RequireHardLogIn;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractCheckoutController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cnk.travelogix.common.core.cart.data.ActivitySubAncillaryData;
import com.cnk.travelogix.common.core.cart.data.BreakfastSubAncillaryData;
import com.cnk.travelogix.common.core.cart.data.CarParkingSubAncillaryData;
import com.cnk.travelogix.common.core.cart.data.EarlyCheckInSubAncillaryData;
import com.cnk.travelogix.common.core.cart.data.EquipmentSubAncillaryData;
import com.cnk.travelogix.common.core.cart.data.LateCheckOutSubAncillaryData;
import com.cnk.travelogix.common.core.cart.data.PetSubAncillaryData;
import com.cnk.travelogix.common.core.cart.data.RestaurantSubAncillaryData;
import com.cnk.travelogix.common.core.cart.data.SpaSubAncillaryData;
import com.cnk.travelogix.common.core.cart.data.TransferSubAncillaryData;
import com.cnk.travelogix.common.core.cart.data.WifiSubAncillaryData;
import com.cnk.travelogix.common.core.enums.HotelAncillaryType;
import com.cnk.travelogix.common.core.enums.HotelMealType;
import com.cnk.travelogix.common.core.enums.HotelSpaServiceType;
import com.cnk.travelogix.common.core.enums.HotelTransferType;
import com.cnk.travelogix.common.core.enums.HotelVehicleType;


/**
 * @author i323801
 *
 */
@Controller
@RequestMapping(value = "/checkout/multi/ancillary")
public class HotelAncillaryController extends AbstractCheckoutController
{
	@RequestMapping(value = "/hotel", method = RequestMethod.GET)
	@RequireHardLogIn
	@ResponseBody
	public Map hotelAncillary(final String hotelId, final String roomId, final String supplierId)
	{
		//TODO get ancillary from SI by hotelId, roomId, supplierId.
		final Map map = new HashMap();

		final WifiSubAncillaryData wifi = new WifiSubAncillaryData();
		wifi.setAncillaryType(HotelAncillaryType.WIFI);
		wifi.setDuration("10");

		final CarParkingSubAncillaryData carparking = new CarParkingSubAncillaryData();
		carparking.setAncillaryType(HotelAncillaryType.CAR_PARKING);
		carparking.setVehicleType(HotelVehicleType.MINI);
		carparking.setStartDate(new Date());
		carparking.setEndDate(new Date());

		final PetSubAncillaryData pet = new PetSubAncillaryData();
		pet.setAncillaryType(HotelAncillaryType.PET);
		pet.setNumberOfPets("3");

		final LateCheckOutSubAncillaryData latecheckout = new LateCheckOutSubAncillaryData();
		latecheckout.setAncillaryType(HotelAncillaryType.LATE_CHECK_OUT);
		latecheckout.setCheckoutTime(new Date());

		final EarlyCheckInSubAncillaryData earlycheckin = new EarlyCheckInSubAncillaryData();
		earlycheckin.setAncillaryType(HotelAncillaryType.EARLY_CHECK_IN);
		earlycheckin.setCheckInTime(new Date());

		final BreakfastSubAncillaryData breakfast = new BreakfastSubAncillaryData();
		breakfast.setAncillaryType(HotelAncillaryType.BREAKFAST);
		breakfast.setNumberOfAdult("1");
		breakfast.setNumberOfChild("2");

		final RestaurantSubAncillaryData restaurant = new RestaurantSubAncillaryData();
		restaurant.setAncillaryType(HotelAncillaryType.RESTAURANT);
		restaurant.setMealType(HotelMealType.MEAL1);
		restaurant.setNumberOfAdult("2");
		restaurant.setNumberOfChild("2");

		final SpaSubAncillaryData spa = new SpaSubAncillaryData();
		spa.setAncillaryType(HotelAncillaryType.SPA);
		spa.setDuration("4");
		spa.setNumberOfAdult("1");
		spa.setNumberOfChild("2");
		spa.setServiceType(HotelSpaServiceType.TYPE1);

		final TransferSubAncillaryData transfer = new TransferSubAncillaryData();
		transfer.setAncillaryType(HotelAncillaryType.TRANSFER);
		transfer.setIssueDate(new Date());
		transfer.setNumberOfAdult("2");
		transfer.setNumberOfChild("3");
		transfer.setTransferType(HotelTransferType.TRANSFER1);
		transfer.setVehicleType(HotelVehicleType.ECONOMY);

		final ActivitySubAncillaryData activity = new ActivitySubAncillaryData();
		activity.setActivityName("play football");
		activity.setAncillaryType(HotelAncillaryType.ACTIVITY);
		activity.setDuration("2 hours");
		activity.setEndDate(new Date());
		activity.setIssueDate(new Date());
		activity.setNumberOfAdult("1");
		activity.setNumberOfChild("2");
		activity.setStartDate(new Date());
		activity.setVehicleType(HotelVehicleType.MINI);

		final EquipmentSubAncillaryData equipment = new EquipmentSubAncillaryData();
		equipment.setAncillaryType(HotelAncillaryType.EQUIPMENT);
		equipment.setDuration("3 days");
		equipment.setEndDate(new Date());
		equipment.setEquipmentName("Camera");
		equipment.setQuantity(10);
		equipment.setStartDate(new Date());
		equipment.setVehicleType(HotelVehicleType.LUXARY);
		map.put("roomIndex", Integer.valueOf(0));
		map.put("wifi", wifi);
		map.put("carparking", carparking);
		map.put("petstay", pet);
		map.put("latecheckout", latecheckout);
		map.put("earlycheckin", earlycheckin);

		map.put("breakfast", breakfast);
		map.put("restaurant", restaurant);
		map.put("spa", spa);
		map.put("transfer", transfer);
		map.put("activity", activity);
		map.put("equipment", equipment);

		//		final OrderRoomDetailInfoData room = new OrderRoomDetailInfoData();
		//		room.setRoomIndex(Integer.valueOf(1));
		//		room.setRoomAncillaryList(new ArrayList<>());
		//		room.getRoomAncillaryList().add(wifi);
		//		room.getRoomAncillaryList().add(carparking);
		//		room.getRoomAncillaryList().add(pet);
		//		room.getRoomAncillaryList().add(latecheckout);
		//		room.getRoomAncillaryList().add(earlycheckin);
		//		room.getRoomAncillaryList().add(breakfast);
		//		room.getRoomAncillaryList().add(restaurant);
		//		room.getRoomAncillaryList().add(spa);
		//		room.getRoomAncillaryList().add(transfer);
		//		room.getRoomAncillaryList().add(activity);
		//		room.getRoomAncillaryList().add(equipment);
		//
		//		final List<OrderRoomDetailInfoData> roomList = new ArrayList<>();
		//		roomList.add(room);le
		//		map.put("roomList", roomList);
		map.put("specialrequest", "I want something to be special request.");
		return map;
	}

}
