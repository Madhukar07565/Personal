/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.holiday.master.core.constants;

/**
 * @deprecated use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast","PMD"})
public class GeneratedHolidayproductmastercoreConstants
{
	public static final String EXTENSIONNAME = "holidayproductmastercore";
	public static class TC
	{
		public static final String ACCODAYWISEITINERARY = "AccoDayWiseItinerary".intern();
		public static final String ACTIVITYDAYWISEITINERARY = "ActivityDayWiseItinerary".intern();
		public static final String BLACKOUTDATES = "BlackOutDates".intern();
		public static final String CARPACKAGE = "CarPackage".intern();
		public static final String DAYWISEITINERARY = "DayWiseItinerary".intern();
		public static final String FEEDER = "Feeder".intern();
		public static final String FLAVORTYPE = "FlavorType".intern();
		public static final String FLIGHTTRANSFERDAYWISEITINERARY = "FlightTransferDayWiseItinerary".intern();
		public static final String HOLIDAYBRAND = "HolidayBrand".intern();
		public static final String HOLIDAYDESTINATION = "HolidayDestination".intern();
		public static final String HOLIDAYFLAVOR = "HolidayFlavor".intern();
		public static final String HOLIDAYHUB = "HolidayHub".intern();
		public static final String HOLIDAYITINERARYDETAILS = "HolidayItineraryDetails".intern();
		public static final String HOLIDAYPRODUCT = "HolidayProduct".intern();
		public static final String HOLIDAYPRODUCTTYPE = "HolidayProductType".intern();
		public static final String OFFLINEVISADETAILS = "OfflineVisaDetails".intern();
		public static final String ONLINEVISADETAILS = "OnlineVisaDetails".intern();
		public static final String OTHERDAYWISEITINERARY = "OtherDayWiseItinerary".intern();
		public static final String PRICES = "Prices".intern();
		public static final String RAILPASSTRANSFERDAYWISEITINERARY = "RailPassTransferDayWiseItinerary".intern();
		public static final String RAILTICKETTRANSFERDAYWISEITINERARY = "RailTicketTransferDayWiseItinerary".intern();
		public static final String RAILTRANSFERDAYWISEITINERARY = "RailTransferDayWiseItinerary".intern();
		public static final String RATEDEFINEDFORTYPE = "RateDefinedForType".intern();
		public static final String RENTALTRANSFERDAYWISEITINERARY = "RentalTransferDayWiseItinerary".intern();
		public static final String SESSION = "Session".intern();
		public static final String TRANSFERCATEGORY = "TransferCategory".intern();
		public static final String TRANSFERPRODUCTDAYWISEITINERARY = "TransferProductDayWiseItinerary".intern();
	}
	public static class Attributes
	{
		public static class AbstractDayWiseItinerary
		{
			public static final String HOLIDAYFLAVOR = "holidayFlavor".intern();
		}
		public static class AbstractVisaDetails
		{
			public static final String HOLIDAYFLAVOR = "holidayFlavor".intern();
		}
	}
	public static class Enumerations
	{
		public static class FlavorType
		{
			public static final String SEAT_IN_COACH_PACKAGES = "Seat_in_Coach_Packages".intern();
			public static final String SELF_DRIVE_PACKAGES = "Self_Drive_Packages".intern();
			public static final String PRIVATE_TOURING = "Private_Touring".intern();
			public static final String PREMIUM_TOURS_WITH_TOUR_MANAGER_INDIAN_MEALS = "Premium_Tours_with_Tour_Manager_Indian_Meals".intern();
			public static final String COACH_TOUR_WITH_INDIAN_MEALS_TOUR_ESCORT = "Coach_tour_with_Indian_meals_Tour_Escort".intern();
			public static final String COACH_TOUR_WITH_INDIAN_MEALS_TOUR_DIRECTOR = "Coach_tour_with_Indian_meals_Tour_Director".intern();
			public static final String COACH_TOURS_ALL_INCLUSIVE = "Coach_Tours_All_Inclusive".intern();
			public static final String RAIL_HOLIDAYS = "Rail_Holidays".intern();
			public static final String HOTEL_PACKAGES = "Hotel_Packages".intern();
			public static final String COACH_TOUR_WITH_INDIAN_MEALS = "Coach_tour_with_Indian_meals".intern();
			public static final String CRUISE_HOLIDAYS = "Cruise_Holidays".intern();
			public static final String COACH_TOUR_WITH_CONTINENTAL_MEAL = "Coach_Tour_with_Continental_meal".intern();
			public static final String COACH_TOUR_WITH_CONTINENTAL_MEALS_TOUR_MANAGER = "Coach_Tour_with_Continental_meals_Tour_Manager".intern();
			public static final String PREMIUM_TOURS_WITH_TOUR_MANAGER = "Premium_Tours_with_Tour_Manager".intern();
			public static final String COACH_TOUR_WITH_CONTINENTAL_MEALS_TOUR_DIRECTOR = "Coach_tour_with_Continental_meals_Tour_Director".intern();
			public static final String COACH_TOUR_WITH_TOUR_MANAGER = "Coach_tour_with_Tour_Manager".intern();
		}
		public static class HolidayProductType
		{
			public static final String FIT = "FIT".intern();
			public static final String GROUP = "GROUP".intern();
			public static final String BOTH = "BOTH".intern();
		}
		public static class RateDefinedForType
		{
			public static final String CITY_TRANSFER = "CITY_TRANSFER".intern();
			public static final String INTERCITYTRANSFER = "INTERCITYTRANSFER".intern();
			public static final String CITY_USE = "CITY_USE".intern();
			public static final String OUT_STATION = "OUT_STATION".intern();
		}
		public static class Session
		{
			public static final String MORNING = "MORNING".intern();
			public static final String AFTERNOON = "AFTERNOON".intern();
			public static final String EVENING = "EVENING".intern();
			public static final String NIGHT = "NIGHT".intern();
		}
		public static class TransferCategory
		{
			public static final String RENTAL = "RENTAL".intern();
			public static final String TRANSFER = "TRANSFER".intern();
		}
	}
	public static class Relations
	{
		public static final String HOLIDAYFLAVORTOABSTRACTDAYWISEITINERARY = "HolidayFlavorTOAbstractDayWiseItinerary".intern();
		public static final String HOLIDAYFLAVORTOABSTRACTVISADETAILS = "HolidayFlavorTOAbstractVisaDetails".intern();
		public static final String HOLIDAYFLAVORTOBLACKOUTDATES = "HolidayFlavorTOBlackOutDates".intern();
		public static final String HOLIDAYFLAVORTODAYWISEITINERARY = "HolidayFlavorTODayWiseItinerary".intern();
		public static final String HOLIDAYFLAVORTOHOLIDAYHUB = "HolidayFlavorTOHolidayHub".intern();
		public static final String HOLIDAYHUBTOFEEDER = "HolidayHubTOFeeder".intern();
		public static final String HOLIDAYITINERARYDETAILSTODAYWISEITINERARY = "HolidayItineraryDetailsTODayWiseItinerary".intern();
		public static final String HOLIDAYPRODUCTTODESTINATION = "HolidayProductTODestination".intern();
	}
	
	protected GeneratedHolidayproductmastercoreConstants()
	{
		// private constructor
	}
	
	
}
