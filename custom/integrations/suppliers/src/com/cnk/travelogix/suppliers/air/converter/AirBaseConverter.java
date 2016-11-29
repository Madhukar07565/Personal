/**
 * @author I077988
 */
package com.cnk.travelogix.suppliers.air.converter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.opentravel.ota._2003._05.AirFeeType;
import org.opentravel.ota._2003._05.AirItineraryPricingInfoType.ItinTotalFare;
import org.opentravel.ota._2003._05.AirItineraryPricingInfoType.PTCFareBreakdowns;
import org.opentravel.ota._2003._05.AirItineraryType;
import org.opentravel.ota._2003._05.AirItineraryType.OriginDestinationOptions;
import org.opentravel.ota._2003._05.AirItineraryType.OriginDestinationOptions.OriginDestinationOption;
import org.opentravel.ota._2003._05.AirSearchPrefsType;
import org.opentravel.ota._2003._05.AirTaxType;
import org.opentravel.ota._2003._05.AirTripType;
import org.opentravel.ota._2003._05.Baggage;
import org.opentravel.ota._2003._05.BookFlightSegmentType.BookingClassAvails;
import org.opentravel.ota._2003._05.BookFlightSegmentType.BookingClassAvails.BookingClassAvail;
import org.opentravel.ota._2003._05.BookFlightSegmentType.StopLocation;
import org.opentravel.ota._2003._05.DayOfWeekType;
import org.opentravel.ota._2003._05.EquipmentType;
import org.opentravel.ota._2003._05.FareAmountType;
import org.opentravel.ota._2003._05.FareBasisCodeType;
import org.opentravel.ota._2003._05.FareInfoType.FareReference;
import org.opentravel.ota._2003._05.FareStatusType;
import org.opentravel.ota._2003._05.FareType.BaseFare;
import org.opentravel.ota._2003._05.FareType.EquivFare;
import org.opentravel.ota._2003._05.FareType.Fees;
import org.opentravel.ota._2003._05.FareType.Taxes;
import org.opentravel.ota._2003._05.FareType.TotalFare;
import org.opentravel.ota._2003._05.FlightSegmentBaseType.ArrivalAirport;
import org.opentravel.ota._2003._05.FlightSegmentBaseType.DepartureAirport;
import org.opentravel.ota._2003._05.FlightSegmentType.MarketingAirline;
import org.opentravel.ota._2003._05.FlightTypeType;
import org.opentravel.ota._2003._05.OperatingAirlineType;
import org.opentravel.ota._2003._05.OriginDestinationOptionType.FlightSegment;
import org.opentravel.ota._2003._05.PTCFareBreakdownType;
import org.opentravel.ota._2003._05.PTCFareBreakdownType.FareBasisCodes;
import org.opentravel.ota._2003._05.PTCFareBreakdownType.FareInfo;
import org.opentravel.ota._2003._05.PTCFareBreakdownType.PassengerFare;
import org.opentravel.ota._2003._05.PassengerTypeQuantityType;
import org.opentravel.ota._2003._05.PricedItinerariesType.PricedItinerary;
import org.opentravel.ota._2003._05.PricedItineraryType.AirItineraryPricingInfo;
import org.opentravel.ota._2003._05.PricingSourceType;
import org.opentravel.ota._2003._05.TPAExtensionsType;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

import com.cnk.travelogix.suppliers.air.data.AirItinerary;
import com.cnk.travelogix.suppliers.air.data.CabinPref;
import com.cnk.travelogix.suppliers.air.data.FareInfoType;
import com.cnk.travelogix.suppliers.air.data.FareRestrictPref;
import com.cnk.travelogix.suppliers.air.data.FlightTypePref;
import com.cnk.travelogix.suppliers.air.data.OperatingAirline;
import com.cnk.travelogix.suppliers.air.data.PTCFareBreakdown;
import com.cnk.travelogix.suppliers.air.data.PassengerTypeQuantity;
import com.cnk.travelogix.suppliers.air.data.Warning;
import com.cnk.travelogix.suppliers.common.converter.BaseConverter;
import com.cnk.travelogix.suppliers.common.data.SupplierID;
import com.cnk.travelogix.suppliers.common.data.TPAExtensions;
import com.coxandkings.integ.suppl.air.Baggages;
import com.coxandkings.integ.suppl.common.SupplierIDType;

/**
 * @author I077988
 *
 */
public class AirBaseConverter extends BaseConverter {

    /**
     * @param supplierIDData
     * @return SupplierIDType
     */
    public SupplierIDType populateSupplierId(final SupplierID supplierIDData) {
	final SupplierIDType supplierIDType = new SupplierIDType();
	supplierIDType.setValue(supplierIDData.getValue());
	supplierIDType.setMarketType(supplierIDData.getMarketType());
	return supplierIDType;
    }

    /**
     * 
     * @param supplierIDType
     * @return supplierIDData
     */
    public SupplierID populateGetSupplierId(final SupplierIDType supplierIDType) {
	final SupplierID supplierIDData = new SupplierID();
	if (supplierIDType != null) {
	    supplierIDData.setValue(supplierIDType.getValue());
	    supplierIDData.setMarketType(supplierIDType.getMarketType());
	}
	return supplierIDData;
    }

    /**
     * @param flightTypePrefsData
     * @return List<AirSearchPrefsType.FlightTypePref>
     */
    public List<AirSearchPrefsType.FlightTypePref> populateFlightTypePrefs(final List<FlightTypePref> flightTypePrefsData) {
	List<AirSearchPrefsType.FlightTypePref> flightTypePrefs = new ArrayList<>();
	if (flightTypePrefsData != null && !flightTypePrefsData.isEmpty()) {
	    AirSearchPrefsType.FlightTypePref flightTypePref;
	    for (FlightTypePref flightTypePrefData : flightTypePrefsData) {
		flightTypePref = new AirSearchPrefsType.FlightTypePref();
		flightTypePref.setMaxConnections(flightTypePrefData.getMaxConnections());
		final String flightType = flightTypePrefData.getFlightType();
		if (StringUtils.hasText(flightType)) {
		    flightTypePref.setFlightType(FlightTypeType.fromValue(flightType));
		}
		flightTypePrefs.add(flightTypePref);
	    }
	}
	return flightTypePrefs;
    }

    /**
     * @param fareRestrictPrefsData
     * @return fareRestrictPrefs
     */
    public List<AirSearchPrefsType.FareRestrictPref> populateFareRestrictPrefs(List<FareRestrictPref> fareRestrictPrefsData) {
	List<AirSearchPrefsType.FareRestrictPref> fareRestrictPrefs = new ArrayList<>();
	if (fareRestrictPrefsData != null && !fareRestrictPrefsData.isEmpty()) {
	    AirSearchPrefsType.FareRestrictPref fareRestrictPref;
	    for (FareRestrictPref fareRestrictPrefData : fareRestrictPrefsData) {
		fareRestrictPref = new AirSearchPrefsType.FareRestrictPref();
		fareRestrictPref.setFareRestriction(fareRestrictPrefData.getFareRestriction());
		fareRestrictPref.setDate(fareRestrictPrefData.getDate());
		fareRestrictPrefs.add(fareRestrictPref);
	    }
	}
	return fareRestrictPrefs;
    }

    /**
     * @param cabinPrefsData
     * @return cabinPrefs
     */
    public List<AirSearchPrefsType.CabinPref> populateCabinPrefs(List<CabinPref> cabinPrefsData) {
	List<AirSearchPrefsType.CabinPref> cabinPrefs = new ArrayList<>();
	if (cabinPrefsData != null && !cabinPrefsData.isEmpty()) {
	    AirSearchPrefsType.CabinPref cabinPref;
	    for (CabinPref cabinPrefData : cabinPrefsData) {
		cabinPref = new AirSearchPrefsType.CabinPref();
		cabinPref.setCabin(cabinPrefData.getCabin());
		cabinPref.setCabinSubtype(cabinPrefData.getCabinSubtype());
		cabinPrefs.add(cabinPref);
	    }
	}
	return cabinPrefs;
    }

    /**
     * @param passengerTypeQuantitiesData
     * @return passengerTypeQuantities
     */
    public List<PassengerTypeQuantityType> populatePassengerTypeQuantity(final List<PassengerTypeQuantity> passengerTypeQuantitiesData) {
	List<PassengerTypeQuantityType> passengerTypeQuantities = new ArrayList<>();
	if (passengerTypeQuantitiesData != null && !passengerTypeQuantitiesData.isEmpty()) {
	    PassengerTypeQuantityType paxTypeQuantity;
	    for (PassengerTypeQuantity paxTypeQuantityData : passengerTypeQuantitiesData) {
		paxTypeQuantity = new PassengerTypeQuantityType();
		paxTypeQuantity.setCode(paxTypeQuantityData.getCode());
		paxTypeQuantity.setQuantity(paxTypeQuantityData.getQuantity());
		passengerTypeQuantities.add(paxTypeQuantity);
	    }
	}
	return passengerTypeQuantities;
    }

    /**
     * @param bookingClassAvailsData
     * @return bookingClassAvails
     */
    public List<BookingClassAvails> populateBookingClassAvails(List<com.cnk.travelogix.suppliers.air.data.BookingClassAvails> bookingClassAvailsData) {
	BookingClassAvails bookingClassAvails;
	final List<BookingClassAvails> bookingClassAvailsList = new ArrayList<>();
	if (bookingClassAvailsData != null && !bookingClassAvailsData.isEmpty()) {
	    for (com.cnk.travelogix.suppliers.air.data.BookingClassAvails bookingClassAvailData : bookingClassAvailsData) {
		bookingClassAvails = new BookingClassAvails();
		bookingClassAvails.setCabinType(bookingClassAvailData.getCabinType());
		bookingClassAvailsList.add(bookingClassAvails);
	    }
	}
	return bookingClassAvailsList;
    }

    /**
     * @param equipmentTypesData
     * @return equipmentTypes
     */
    public List<EquipmentType> populateEquipmentTypes(List<com.cnk.travelogix.suppliers.air.data.EquipmentType> equipmentTypesData) {
	EquipmentType equipment;
	final List<EquipmentType> equipmentTypes = new ArrayList<>();
	if (equipmentTypesData != null && !equipmentTypesData.isEmpty()) {
	    for (com.cnk.travelogix.suppliers.air.data.EquipmentType equipmentData : equipmentTypesData) {
		equipment = new EquipmentType();
		equipment.setAirEquipType(equipmentData.getAirEquipType());
		equipmentTypes.add(equipment);
	    }
	}
	return equipmentTypes;
    }

    /**
     * @param marketingAirlineData
     * @return marketingAirline
     */
    public MarketingAirline populateMarketingAirline(com.cnk.travelogix.suppliers.air.data.MarketingAirline marketingAirlineData) {
	MarketingAirline marketingAirline = null;
	if (marketingAirlineData != null) {
	    marketingAirline = new MarketingAirline();
	    marketingAirline.setCode(marketingAirlineData.getCode());
	    marketingAirline.setCompanyShortName(marketingAirlineData.getCompanyShortName());
	    marketingAirline.setCodeContext(marketingAirlineData.getCodeContext());
	}
	return marketingAirline;
    }

    /**
     * @param operatingAirlineData
     * @return operatingAirline
     */
    public OperatingAirlineType populateOperatingAirline(OperatingAirline operatingAirlineData) {
	OperatingAirlineType operatingAirline = null;
	if (operatingAirlineData != null) {
	    operatingAirline = new OperatingAirlineType();
	    operatingAirline.setCompanyShortName(operatingAirlineData.getCompanyShortName());
	    operatingAirline.setFlightNumber(operatingAirlineData.getFlightNumber());
	    operatingAirline.setCode(operatingAirlineData.getCode());
	}
	return operatingAirline;
    }

    /**
     * @param arrivalAirportData
     * @return arrivalAirport
     */
    public ArrivalAirport populateArrivalAirport(com.cnk.travelogix.suppliers.air.data.ArrivalAirport arrivalAirportData) {
	ArrivalAirport arrivalAirport = null;
	if (arrivalAirportData != null) {
	    arrivalAirport = new ArrivalAirport();
	    arrivalAirport.setTerminal(arrivalAirportData.getTerminal());
	    arrivalAirport.setLocationCode(arrivalAirportData.getLocationCode());
	}
	return arrivalAirport;
    }

    /**
     * @param departureAirportData
     * @return departureAirport
     */
    public DepartureAirport populateDepartureAirport(com.cnk.travelogix.suppliers.air.data.DepartureAirport departureAirportData) {
	DepartureAirport departureAirport = null;
	if (departureAirportData != null) {
	    departureAirport = new DepartureAirport();
	    departureAirport.setTerminal(departureAirportData.getTerminal());
	    departureAirport.setLocationCode(departureAirportData.getLocationCode());
	}
	return departureAirport;
    }

    /**
     * @param fareInfoTypes
     * @return fareInfoTypeData
     */
    public List<FareInfoType> getFareInfoTypesData(List<org.opentravel.ota._2003._05.FareInfoType.FareInfo> fareInfoTypes) {
	com.cnk.travelogix.suppliers.air.data.FareInfoType fareInfoTypeData;
	final List<com.cnk.travelogix.suppliers.air.data.FareInfoType> fareInfoTypesData = new ArrayList<>();
	if (fareInfoTypes != null && !fareInfoTypes.isEmpty()) {
	    for (org.opentravel.ota._2003._05.FareInfoType.FareInfo fareInfoType : fareInfoTypes) {
		fareInfoTypeData = new FareInfoType();
		fareInfoTypeData.setFareType(fareInfoType.getFareType());
		fareInfoTypeData.setFareBasisCode(fareInfoType.getFareBasisCode());
		final FareStatusType fareStatus = fareInfoType.getFareStatus();
		if (fareStatus != null) {
		    fareInfoTypeData.setFareStatus(fareStatus.toString());
		}
		fareInfoTypesData.add(fareInfoTypeData);
	    }
	}
	return fareInfoTypesData;
    }

    /**
     * @param fareReferences
     * @return fareReferenceData
     */
    public List<com.cnk.travelogix.suppliers.air.data.FareReference> getFareReferencesData(List<FareReference> fareReferences) {
	com.cnk.travelogix.suppliers.air.data.FareReference fareReferenceData;
	final List<com.cnk.travelogix.suppliers.air.data.FareReference> fareReferencesData = new ArrayList<>();
	if (fareReferences != null && !fareReferences.isEmpty()) {
	    for (FareReference fareReference : fareReferences) {
		fareReferenceData = new com.cnk.travelogix.suppliers.air.data.FareReference();
		fareReferenceData.setResBookDesigCode(fareReference.getResBookDesigCode());
		fareReferencesData.add(fareReferenceData);
	    }
	}
	return fareReferencesData;
    }

    /**
     * @param totalFare
     * @return totalFareData
     */
    public com.cnk.travelogix.suppliers.air.data.TotalFare getTotalFareData(TotalFare totalFare) {
	com.cnk.travelogix.suppliers.air.data.TotalFare totalFareData = null;
	if (totalFare != null) {
	    totalFareData = new com.cnk.travelogix.suppliers.air.data.TotalFare();
	    totalFareData.setCurrencyCode(totalFare.getCurrencyCode());
	    totalFareData.setAmount(totalFare.getAmount());
	    totalFareData.setDecimalPlaces(totalFare.getDecimalPlaces());
	}
	return totalFareData;
    }

    /**
     * @param fees
     * @return feesData
     */
    public com.cnk.travelogix.suppliers.air.data.Fees getFeesData(Fees fees) {
	com.cnk.travelogix.suppliers.air.data.Fees feesData = null;
	if (fees != null) {
	    feesData = new com.cnk.travelogix.suppliers.air.data.Fees();
	    feesData.setAmount(fees.getAmount());
	    feesData.setCurrencyCode(fees.getCurrencyCode());
	    final List<AirFeeType> feeTypes = fees.getFee();
	    com.cnk.travelogix.suppliers.air.data.AirFeeType airFeeTypeData;
	    final List<com.cnk.travelogix.suppliers.air.data.AirFeeType> airFeeTypesData = new ArrayList<>();
	    if (feeTypes != null && !feeTypes.isEmpty()) {
		for (AirFeeType airFeeType : feeTypes) {
		    airFeeTypeData = new com.cnk.travelogix.suppliers.air.data.AirFeeType();
		    airFeeTypeData.setFeeCode(airFeeType.getFeeCode());
		    airFeeTypeData.setDecimalPlaces(airFeeType.getDecimalPlaces());
		    airFeeTypeData.setAmount(airFeeType.getAmount());
		    airFeeTypeData.setFeeTransactionType(airFeeType.getFeeTransactionType());
		    airFeeTypesData.add(airFeeTypeData);
		}
	    }
	    feesData.setAirFeeTypes(airFeeTypesData);
	}
	return feesData;
    }

    /**
     * @param taxes
     * @return taxesData
     */
    public com.cnk.travelogix.suppliers.air.data.Taxes getTaxesData(Taxes taxes) {
	com.cnk.travelogix.suppliers.air.data.Taxes taxesData = null;
	if (taxes != null) {
	    taxesData = new com.cnk.travelogix.suppliers.air.data.Taxes();
	    taxesData.setAmount(taxes.getAmount());
	    final List<AirTaxType> taxTypes = taxes.getTax();
	    com.cnk.travelogix.suppliers.air.data.AirTaxType airTaxTypeData;
	    final List<com.cnk.travelogix.suppliers.air.data.AirTaxType> airTaxTypesData = new ArrayList<>();
	    if (taxTypes != null && !taxTypes.isEmpty()) {
		for (AirTaxType airTaxType : taxTypes) {
		    airTaxTypeData = new com.cnk.travelogix.suppliers.air.data.AirTaxType();
		    airTaxTypeData.setCurrencyCode(airTaxType.getCurrencyCode());
		    airTaxTypeData.setDecimalPlaces(airTaxType.getDecimalPlaces());
		    airTaxTypeData.setTaxCode(airTaxType.getTaxCode());
		    airTaxTypeData.setAmount(airTaxType.getAmount());
		    airTaxTypeData.setTaxName(airTaxType.getTaxName());
		    airTaxTypeData.setTaxTransactionType(airTaxType.getTaxTransactionType());
		    airTaxTypeData.setRph(airTaxType.getRPH());
		    airTaxTypesData.add(airTaxTypeData);
		}
	    }
	    taxesData.setAirTaxTypes(airTaxTypesData);
	}
	return taxesData;
    }

    /**
     * @param equivFares
     * @return equivFareData
     */
    public List<com.cnk.travelogix.suppliers.air.data.EquivFare> getEquivFaresData(List<EquivFare> equivFares) {
	com.cnk.travelogix.suppliers.air.data.EquivFare equivFareData;
	final List<com.cnk.travelogix.suppliers.air.data.EquivFare> equivFaresData = new ArrayList<>();
	if (equivFares != null && !equivFares.isEmpty()) {
	    for (EquivFare equivFare : equivFares) {
		equivFareData = new com.cnk.travelogix.suppliers.air.data.EquivFare();
		equivFareData.setCurrencyCode(equivFare.getCurrencyCode());
		equivFareData.setDecimalPlaces(equivFare.getDecimalPlaces());
		equivFareData.setAmount(equivFare.getAmount());
		final FareAmountType fareAmountType = equivFare.getFareAmountType();
		if (fareAmountType != null) {
		    equivFareData.setFareAmountType(fareAmountType.toString());
		}
		equivFaresData.add(equivFareData);
	    }
	}
	return equivFaresData;
    }

    /**
     * @param baseFare
     * @return baseFareData
     */
    public com.cnk.travelogix.suppliers.air.data.BaseFare getBaseFareData(BaseFare baseFare) {
	com.cnk.travelogix.suppliers.air.data.BaseFare baseFareData = null;
	if (baseFare != null) {
	    baseFareData = new com.cnk.travelogix.suppliers.air.data.BaseFare();
	    baseFareData.setCurrencyCode(baseFare.getCurrencyCode());
	    final FareAmountType fareAmountType = baseFare.getFareAmountType();
	    if (fareAmountType != null) {
		baseFareData.setFareAmountType(fareAmountType.toString());
	    }
	    baseFareData.setDecimalPlaces(baseFare.getDecimalPlaces());
	    baseFareData.setAmount(baseFare.getAmount());
	}
	return baseFareData;
    }

    /**
     * @param stopLocations
     * @return stopLocationData
     */
    public List<com.cnk.travelogix.suppliers.air.data.StopLocation> getStopLocationsData(List<StopLocation> stopLocations) {
	com.cnk.travelogix.suppliers.air.data.StopLocation stopLocationData;
	final List<com.cnk.travelogix.suppliers.air.data.StopLocation> stopLocationsData = new ArrayList<>();
	if (stopLocations != null && !stopLocations.isEmpty()) {
	    for (StopLocation stopLocation : stopLocations) {
		stopLocationData = new com.cnk.travelogix.suppliers.air.data.StopLocation();
		stopLocationData.setLocationCode(stopLocation.getLocationCode());
		stopLocationsData.add(stopLocationData);
	    }
	}
	return stopLocationsData;
    }

    /**
     * @param bookingClassAvails
     * @return bookingClassAvailData
     */
    public List<com.cnk.travelogix.suppliers.air.data.BookingClassAvails> getBookingClassAvailsData(List<BookingClassAvails> bookingClassAvails) {
	com.cnk.travelogix.suppliers.air.data.BookingClassAvails bookingClassAvailData;
	final List<com.cnk.travelogix.suppliers.air.data.BookingClassAvails> bookingClassAvailsData = new ArrayList<>();
	if (bookingClassAvails != null && !bookingClassAvails.isEmpty()) {
	    for (BookingClassAvails bookingClassAvail : bookingClassAvails) {
		bookingClassAvailData = new com.cnk.travelogix.suppliers.air.data.BookingClassAvails();
		bookingClassAvailData.setCabinType(bookingClassAvail.getCabinType());
		List<BookingClassAvail> otaBookingClassAvails = bookingClassAvail.getBookingClassAvail();
		for (BookingClassAvail otaBookingClassAvail : otaBookingClassAvails) {
		    bookingClassAvailData.setRph(otaBookingClassAvail.getRPH());
		}
		bookingClassAvailsData.add(bookingClassAvailData);
	    }
	}
	return bookingClassAvailsData;
    }

    /**
     * @param equipments
     * @return equipmentTypesData
     */
    public List<com.cnk.travelogix.suppliers.air.data.EquipmentType> getEquipmentTypesData(List<EquipmentType> equipments) {
	final List<com.cnk.travelogix.suppliers.air.data.EquipmentType> equipmentTypesData = new ArrayList<>();
	com.cnk.travelogix.suppliers.air.data.EquipmentType equipmentTypeData;
	if (equipments != null && !equipments.isEmpty()) {
	    for (EquipmentType equipmentType : equipments) {
		equipmentTypeData = new com.cnk.travelogix.suppliers.air.data.EquipmentType();
		equipmentTypeData.setAirEquipType(equipmentType.getAirEquipType());
		equipmentTypesData.add(equipmentTypeData);
	    }
	}
	return equipmentTypesData;
    }

    /**
     * @param marketingAirline
     * @return marketingAirlineData
     */
    public com.cnk.travelogix.suppliers.air.data.MarketingAirline getMarketingAirlineData(MarketingAirline marketingAirline) {
	com.cnk.travelogix.suppliers.air.data.MarketingAirline marketingAirlineData = null;
	if (marketingAirline != null) {
	    marketingAirlineData = new com.cnk.travelogix.suppliers.air.data.MarketingAirline();
	    marketingAirlineData.setCompanyShortName(marketingAirline.getCompanyShortName());
	    marketingAirlineData.setCode(marketingAirline.getCode());
	    marketingAirlineData.setCodeContext(marketingAirline.getCodeContext());
	}
	return marketingAirlineData;
    }

    /**
     * @param arrivalAirport
     * @return arrivalAirportData
     */
    public com.cnk.travelogix.suppliers.air.data.ArrivalAirport getArrivalAirportData(ArrivalAirport arrivalAirport) {
	com.cnk.travelogix.suppliers.air.data.ArrivalAirport arrivalAirportData = null;
	if (arrivalAirport != null) {
	    arrivalAirportData = new com.cnk.travelogix.suppliers.air.data.ArrivalAirport();
	    arrivalAirportData.setTerminal(arrivalAirport.getTerminal());
	    arrivalAirportData.setLocationCode(arrivalAirport.getLocationCode());
	    arrivalAirportData.setCodeContext(arrivalAirport.getCodeContext());
	}
	return arrivalAirportData;
    }

    /**
     * @param departureAirport
     * @return departureAirportData
     */
    public com.cnk.travelogix.suppliers.air.data.DepartureAirport getDepartureAirportData(final DepartureAirport departureAirport) {
	com.cnk.travelogix.suppliers.air.data.DepartureAirport departureAirportData = null;
	if (departureAirport != null) {
	    departureAirportData = new com.cnk.travelogix.suppliers.air.data.DepartureAirport();
	    departureAirportData.setTerminal(departureAirport.getTerminal());
	    departureAirportData.setLocationCode(departureAirport.getLocationCode());
	    departureAirportData.setCodeContext(departureAirport.getCodeContext());
	}
	return departureAirportData;
    }

    /**
     * @param operatingAirline
     * @return operatingAirlineData
     */
    public OperatingAirline getOperatingAirlineData(OperatingAirlineType operatingAirline) {
	OperatingAirline operatingAirlineData = null;
	if (operatingAirline != null) {
	    operatingAirlineData = new OperatingAirline();
	    operatingAirlineData.setFlightNumber(operatingAirline.getFlightNumber());
	    operatingAirlineData.setCompanyShortName(operatingAirline.getCompanyShortName());
	    operatingAirlineData.setCode(operatingAirline.getCode());
	}
	return operatingAirlineData;
    }

    /**
     * @param otaWarningTypelist
     * @return warnings
     */
    public List<Warning> populateWarningType(List<org.opentravel.ota._2003._05.WarningType> otaWarningTypelist) {
	List<Warning> warnings = new ArrayList<>();
	Warning warningTypeData;
	for (org.opentravel.ota._2003._05.WarningType otaWarningType : otaWarningTypelist) {
	    warningTypeData = new Warning();
	    warningTypeData.setCode(otaWarningType.getCode());
	    warningTypeData.setShortText(otaWarningType.getShortText());
	    warningTypeData.setDocURL(otaWarningType.getDocURL());
	    warningTypeData.setRecordID(otaWarningType.getRecordID());
	    warnings.add(warningTypeData);
	}
	return warnings;
    }

    /**
     * @param airItineraryPricingInfo
     * @return airItineraryPricingInfoData
     */
    protected com.cnk.travelogix.suppliers.air.data.AirItineraryPricingInfo getAirItineraryPricingInfoData(final AirItineraryPricingInfo airItineraryPricingInfo) {
	final com.cnk.travelogix.suppliers.air.data.AirItineraryPricingInfo airItineraryPricingInfoData = new com.cnk.travelogix.suppliers.air.data.AirItineraryPricingInfo();
	airItineraryPricingInfoData.setQuoteID(airItineraryPricingInfo.getQuoteID());
	airItineraryPricingInfoData.setValidatingAirlineCode(airItineraryPricingInfo.getValidatingAirlineCode());
	final PricingSourceType pricingSource = airItineraryPricingInfo.getPricingSource();
	if (pricingSource != null) {
	    airItineraryPricingInfoData.setPricingSource(pricingSource.toString());
	}
	final List<ItinTotalFare> itinTotalFares = airItineraryPricingInfo.getItinTotalFare();
	final List<com.cnk.travelogix.suppliers.air.data.ItinTotalFare> itinTotalFaresData = populateTotalFares(itinTotalFares);
	airItineraryPricingInfoData.setItinTotalFares(itinTotalFaresData);

	final PTCFareBreakdowns ptcFareBreakdowns = airItineraryPricingInfo.getPTCFareBreakdowns();
	final List<PTCFareBreakdownType> ptcFareBreakdownTypes = ptcFareBreakdowns.getPTCFareBreakdown();
	final List<PTCFareBreakdown> ptcFareBreakdownTypesData = getPTCFareBreakdownData(ptcFareBreakdownTypes);
	airItineraryPricingInfoData.setPtcFareBreakdown(ptcFareBreakdownTypesData);

	final TPAExtensionsType tpaExtensions = airItineraryPricingInfo.getTPAExtensions();
	if (tpaExtensions != null) {
	    final TPAExtensions tpaExtensionsData = getAirItineryPricingInfoTpaExtensions(tpaExtensions);
	    airItineraryPricingInfoData.setTpaExtensions(tpaExtensionsData);
	}
	return airItineraryPricingInfoData;
    }

    protected List<com.cnk.travelogix.suppliers.air.data.ItinTotalFare> populateTotalFares(List<ItinTotalFare> itinTotalFares) {
	final List<com.cnk.travelogix.suppliers.air.data.ItinTotalFare> itinTotalFaresData = new ArrayList<>();
	com.cnk.travelogix.suppliers.air.data.ItinTotalFare itinTotalFareData;
	for (ItinTotalFare itinTotalFare : itinTotalFares) {
	    itinTotalFareData = new com.cnk.travelogix.suppliers.air.data.ItinTotalFare();
	    itinTotalFareData.setBaseFare(getBaseFareData(itinTotalFare.getBaseFare()));
	    itinTotalFareData.setEquivFares(getEquivFaresData(itinTotalFare.getEquivFare()));
	    itinTotalFareData.setTaxes(getTaxesData(itinTotalFare.getTaxes()));
	    itinTotalFareData.setFees(getFeesData(itinTotalFare.getFees()));
	    itinTotalFareData.setTotalFare(getTotalFareData(itinTotalFare.getTotalFare()));
	    itinTotalFaresData.add(itinTotalFareData);
	}
	return itinTotalFaresData;
    }

    /**
     * @param tpaExtensions
     * @return tpaExtensionsData
     */
    public TPAExtensions getAirItineryPricingInfoTpaExtensions(final TPAExtensionsType tpaExtensions) {
	final TPAExtensions tpaExtensionsData = new TPAExtensions();
	final List<Element> elements = tpaExtensions.getAny();
	for (Element element : elements) {
	    if ("Baggages".equals(element.getLocalName())) {
		final Baggages baggages = getJaxbObjectFromElement(Baggages.class, element);
		com.cnk.travelogix.suppliers.air.data.Baggage baggageData;
		final com.cnk.travelogix.suppliers.air.data.Baggages baggagesData = new com.cnk.travelogix.suppliers.air.data.Baggages();
		final List<com.cnk.travelogix.suppliers.air.data.Baggage> baggagesList = new ArrayList<>();
		if (baggages != null) {
		    for (Baggage baggage : baggages.getBaggage()) {
			baggageData = new com.cnk.travelogix.suppliers.air.data.Baggage();
			baggageData.setBaggageCode(baggage.getBaggageCode());
			baggageData.setBaggageCharge(baggage.getBaggageCharge());
			baggageData.setBaggageDescription(baggage.getBaggageDescription());
			baggagesList.add(baggageData);
		    }
		}
		baggagesData.setBaggages(baggagesList);
		Map<Class<?>, Object> keyObjectMap = new HashMap<>();
		keyObjectMap.put(com.cnk.travelogix.suppliers.air.data.Baggages.class, baggagesData);
		tpaExtensionsData.setKeyObjectMap(keyObjectMap);
	    }
	}
	return tpaExtensionsData;
    }

    /**
     * @param pricedItineraries
     * @return pricedItinerariesData
     */
    protected List<com.cnk.travelogix.suppliers.air.data.PricedItinerary> getPricedItineraryData(final List<PricedItinerary> pricedItineraries) {
	com.cnk.travelogix.suppliers.air.data.PricedItinerary pricedItineraryData;
	final List<com.cnk.travelogix.suppliers.air.data.PricedItinerary> pricedItinerariesData = new ArrayList<>();
	for (PricedItinerary pricedItinerary : pricedItineraries) {
	    pricedItineraryData = new com.cnk.travelogix.suppliers.air.data.PricedItinerary();
	    pricedItineraryData.setSequenceNumber(pricedItinerary.getSequenceNumber());
	    pricedItineraryData.setPriceType(pricedItinerary.getPriceType());

	    final AirItineraryType airItinerary = pricedItinerary.getAirItinerary();
	    final AirItinerary airItineraryData = getAirItineraryData(airItinerary);
	    pricedItineraryData.setAirItinerary(airItineraryData);

	    final AirItineraryPricingInfo airItineraryPricingInfo = pricedItinerary.getAirItineraryPricingInfo();
	    final com.cnk.travelogix.suppliers.air.data.AirItineraryPricingInfo airItineraryPricingInfoData = getAirItineraryPricingInfoData(airItineraryPricingInfo);
	    pricedItineraryData.setAirItineraryPricingInfo(airItineraryPricingInfoData);

	    pricedItinerariesData.add(pricedItineraryData);
	}
	return pricedItinerariesData;
    }

    /**
     * @param ptcFareBreakdownTypes
     * @return ptcFareBreakdownTypesData
     */
    protected List<PTCFareBreakdown> getPTCFareBreakdownData(final List<PTCFareBreakdownType> ptcFareBreakdownTypes) {
	PTCFareBreakdown ptcFareBreakdownData;
	final List<PTCFareBreakdown> ptcFareBreakdownTypesData = new ArrayList<>();
	for (PTCFareBreakdownType ptcFareBreakdownType : ptcFareBreakdownTypes) {
	    ptcFareBreakdownData = new PTCFareBreakdown();
	    final PricingSourceType pricingSource = ptcFareBreakdownType.getPricingSource();
	    if (pricingSource != null) {
		ptcFareBreakdownData.setPricingSource(pricingSource.toString());
	    }
	    ptcFareBreakdownData.setFlightRefNumberRPHList(ptcFareBreakdownType.getFlightRefNumberRPHList());

	    final PassengerTypeQuantityType passengerTypeQuantity = ptcFareBreakdownType.getPassengerTypeQuantity();
	    final PassengerTypeQuantity passengerTypeQuantitydata = new PassengerTypeQuantity();
	    passengerTypeQuantitydata.setCode(passengerTypeQuantity.getCode());
	    passengerTypeQuantitydata.setQuantity(passengerTypeQuantity.getQuantity());
	    ptcFareBreakdownData.setPassengerTypeQuantity(passengerTypeQuantitydata);

	    final FareBasisCodes fareBasisCodes = ptcFareBreakdownType.getFareBasisCodes();
	    if (fareBasisCodes != null) {
		final List<FareBasisCodeType> fareBasisCodeTypes = fareBasisCodes.getFareBasisCode();
		com.cnk.travelogix.suppliers.air.data.FareBasisCodeType fareBasisCodeTypeData;
		final List<com.cnk.travelogix.suppliers.air.data.FareBasisCodeType> fareBasisCodeTypesData = new ArrayList<>();
		for (FareBasisCodeType fareBasisCodeType : fareBasisCodeTypes) {
		    fareBasisCodeTypeData = new com.cnk.travelogix.suppliers.air.data.FareBasisCodeType();
		    fareBasisCodeTypeData.setFlightSegmentRPH(fareBasisCodeType.getFlightSegmentRPH());
		    fareBasisCodeTypeData.setValue(fareBasisCodeType.getValue());
		    fareBasisCodeTypesData.add(fareBasisCodeTypeData);
		}
		ptcFareBreakdownData.setFareBasisCodeTypes(fareBasisCodeTypesData);
	    }
	    final List<PassengerFare> passengerFares = ptcFareBreakdownType.getPassengerFare();
	    com.cnk.travelogix.suppliers.air.data.PassengerFare passengerFareData;
	    final List<com.cnk.travelogix.suppliers.air.data.PassengerFare> passengerFaresData = new ArrayList<>();
	    for (PassengerFare passengerFare : passengerFares) {
		passengerFareData = new com.cnk.travelogix.suppliers.air.data.PassengerFare();
		passengerFareData.setBaseFare(getBaseFareData(passengerFare.getBaseFare()));
		passengerFareData.setEquivFares(getEquivFaresData(passengerFare.getEquivFare()));
		passengerFareData.setTaxes(getTaxesData(passengerFare.getTaxes()));
		passengerFareData.setFees(getFeesData(passengerFare.getFees()));
		passengerFareData.setTotalFare(getTotalFareData(passengerFare.getTotalFare()));
		passengerFaresData.add(passengerFareData);
	    }
	    ptcFareBreakdownData.setPassengerFares(passengerFaresData);

	    final List<FareInfo> fareInfos = ptcFareBreakdownType.getFareInfo();
	    if (fareInfos != null) {
		com.cnk.travelogix.suppliers.air.data.FareInfo fareInfoData;
		final List<com.cnk.travelogix.suppliers.air.data.FareInfo> fareInfosData = new ArrayList<>();
		for (FareInfo fareInfo : fareInfos) {
		    fareInfoData = new com.cnk.travelogix.suppliers.air.data.FareInfo();
		    fareInfoData.setCurrencyCode(fareInfo.getCurrencyCode());
		    fareInfoData.setFareReferences(getFareReferencesData(fareInfo.getFareReference()));
		    fareInfoData.setFareInfoTypes(getFareInfoTypesData(fareInfo.getFareInfo()));
		    fareInfosData.add(fareInfoData);
		}
		ptcFareBreakdownData.setFareInfos(fareInfosData);
	    }
	    ptcFareBreakdownTypesData.add(ptcFareBreakdownData);
	}
	return ptcFareBreakdownTypesData;
    }

    /**
     * @param airItinerary
     * @return airItineraryData
     */
    protected AirItinerary getAirItineraryData(final AirItineraryType airItinerary) {
	final AirItinerary airItineraryData = new AirItinerary();
	final AirTripType directionInd = airItinerary.getDirectionInd();
	if (directionInd != null) {
	    airItineraryData.setDirectionInd(directionInd.toString());
	}
	com.cnk.travelogix.suppliers.air.data.OriginDestinationOption originDestOptionData;
	final List<com.cnk.travelogix.suppliers.air.data.OriginDestinationOption> originDestOptionsData = new ArrayList<>();
	final List<OriginDestinationOption> originDestOptions = airItinerary.getOriginDestinationOptions().getOriginDestinationOption();
	for (OriginDestinationOption originDestOption : originDestOptions) {
	    originDestOptionData = new com.cnk.travelogix.suppliers.air.data.OriginDestinationOption();
	    originDestOptionData.setRph(originDestOption.getRPH());
	    originDestOptionData.setRefNumber(originDestOption.getRefNumber());
	    originDestOptionData.setTravelPurpose(originDestOption.getTravelPurpose());

	    com.cnk.travelogix.suppliers.air.data.FlightSegment flightSegmentData;
	    List<com.cnk.travelogix.suppliers.air.data.FlightSegment> flightSegmentsData = new ArrayList<>();
	    final List<FlightSegment> flightSegments = originDestOption.getFlightSegment();
	    for (FlightSegment flightSegment : flightSegments) {
		flightSegmentData = new com.cnk.travelogix.suppliers.air.data.FlightSegment();
		flightSegmentData.setNumberInParty(flightSegment.getNumberInParty());
		flightSegmentData.setLineNumber(flightSegment.getLineNumber());
		flightSegmentData.setStatus(flightSegment.getStatus());
		flightSegmentData.setETicketEligibility(flightSegment.getETicketEligibility());
		final DayOfWeekType departureDay = flightSegment.getDepartureDay();
		if (departureDay != null) {
		    flightSegmentData.setDepartureDay(departureDay.toString());
		}
		flightSegmentData.setConnectionType(flightSegment.getConnectionType());
		flightSegmentData.setInfoSource(flightSegment.getInfoSource());
		flightSegmentData.setMealCode(flightSegment.getMealCode());
		flightSegmentData.setFlightNumber(flightSegment.getFlightNumber());
		flightSegmentData.setResBookDesigCode(flightSegment.getResBookDesigCode());
		flightSegmentData.setArrivalDateTime(flightSegment.getArrivalDateTime().toGregorianCalendar().getTime());
		flightSegmentData.setDepartureDateTime(flightSegment.getDepartureDateTime().toGregorianCalendar().getTime());
		flightSegmentData.setStopQuantity(flightSegment.getStopQuantity());
		flightSegmentData.setMarriageGrp(flightSegment.getMarriageGrp());
		flightSegmentData.setDepartureAirport(getDepartureAirportData(flightSegment.getDepartureAirport()));
		flightSegmentData.setArrivalAirport(getArrivalAirportData(flightSegment.getArrivalAirport()));
		flightSegmentData.setOperatingAirline(getOperatingAirlineData(flightSegment.getOperatingAirline()));
		flightSegmentData.setMarketingAirline(getMarketingAirlineData(flightSegment.getMarketingAirline()));
		flightSegmentData.setEquipmentTypes(getEquipmentTypesData(flightSegment.getEquipment()));
		flightSegmentData.setBookingClassAvails(getBookingClassAvailsData(flightSegment.getBookingClassAvails()));
		flightSegmentData.setStopLocations(getStopLocationsData(flightSegment.getStopLocation()));
		flightSegmentData.setTpaExtensions(getTpaExtensionsDataResponse(flightSegment.getTPAExtensions()));
		flightSegmentsData.add(flightSegmentData);
	    }
	    originDestOptionData.setFlightSegments(flightSegmentsData);
	    originDestOptionsData.add(originDestOptionData);
	}
	airItineraryData.setOriginDestinationOptions(originDestOptionsData);
	return airItineraryData;
    }

    /**
     * @param tpaExtensions
     * @return tpaExtensionsData
     */
    protected TPAExtensions getTpaExtensionsDataResponse(final TPAExtensionsType tpaExtensions) {
	TPAExtensions tpaExtensionsData = null;
	if (tpaExtensions != null) {
	    final List<String> elementTypes = new ArrayList<>();
	    elementTypes.add("ExtendedRPH");
	    elementTypes.add("AvailableCount");
	    tpaExtensionsData = getTPAExtensionsData(tpaExtensions, elementTypes);
	}
	return tpaExtensionsData;
    }

    protected OriginDestinationOption populateFlightSegmentRequest(com.cnk.travelogix.suppliers.air.data.OriginDestinationOption originDestOptionData) {
	OriginDestinationOption originDestOption = new OriginDestinationOption();
	FlightSegment flightSegment;
	final List<com.cnk.travelogix.suppliers.air.data.FlightSegment> flightSegmentsData = originDestOptionData.getFlightSegments();
	for (com.cnk.travelogix.suppliers.air.data.FlightSegment flightSegmentData : flightSegmentsData) {
	    flightSegment = new FlightSegment();
	    if (flightSegmentData.getDepartureDateTime() != null) {
		flightSegment.setDepartureDateTime(toXMLGregorianCalendar(flightSegmentData.getDepartureDateTime()));
	    }
	    if (flightSegmentData.getArrivalDateTime() != null) {
		flightSegment.setArrivalDateTime(toXMLGregorianCalendar(flightSegmentData.getArrivalDateTime()));
	    }
	    flightSegment.setFlightNumber(flightSegmentData.getFlightNumber());
	    flightSegment.setResBookDesigCode(flightSegmentData.getResBookDesigCode());
	    flightSegment.setStopQuantity(flightSegmentData.getStopQuantity());
	    flightSegment.setRPH(flightSegmentData.getRph());
	    flightSegment.setFareBasisCode(flightSegmentData.getFareBasisCode());
	    flightSegment.setConnectionType(flightSegmentData.getConnectionType());
	    if (flightSegmentData.getFareBasisCode() != null) {
		flightSegment.setFareBasisCode(flightSegmentData.getFareBasisCode());
	    }
	    flightSegment.setMealCode(flightSegmentData.getMealCode());
	    flightSegment.setMarriageGrp(flightSegmentData.getMarriageGrp());
	    flightSegment.setDepartureAirport(populateDepartureAirport(flightSegmentData.getDepartureAirport()));
	    flightSegment.setArrivalAirport(populateArrivalAirport(flightSegmentData.getArrivalAirport()));
	    if (flightSegmentData.getOperatingAirline() != null) {
		flightSegment.setOperatingAirline(populateOperatingAirline(flightSegmentData.getOperatingAirline()));
	    }
	    if (flightSegmentData.getMarketingAirline() != null) {
		flightSegment.setMarketingAirline(populateMarketingAirline(flightSegmentData.getMarketingAirline()));
	    }
	    if (flightSegmentData.getEquipmentTypes() != null) {
		flightSegment.getEquipment().addAll(populateEquipmentTypes(flightSegmentData.getEquipmentTypes()));
	    }
	    if (flightSegmentData.getBookingClassAvails() != null) {
		flightSegment.getBookingClassAvails().addAll(populateBookingClassAvails(flightSegmentData.getBookingClassAvails()));
	    }
	    final TPAExtensions tpaExtensionsData = flightSegmentData.getTpaExtensions();
	    if (tpaExtensionsData != null) {
		final TPAExtensionsType tpaExtensionsType = getTPAExtensionsType(tpaExtensionsData, NAMESPACE_AIR);
		flightSegment.setTPAExtensions(tpaExtensionsType);
	    }
	    originDestOption.getFlightSegment().add(flightSegment);
	}
	originDestOption.setRPH(originDestOptionData.getRph());
	originDestOption.setRefNumber(originDestOptionData.getRefNumber());

	return originDestOption;
    }

    public String setSomething(String stringValue) {
	if (stringValue != null) {
	    return stringValue;
	}
	return null;

    }

    /**
     * @param originDestOptionsData
     * @return originDestOptions
     */
    protected OriginDestinationOptions populateOriginDestinationOption(final List<com.cnk.travelogix.suppliers.air.data.OriginDestinationOption> originDestOptionsData) {
	OriginDestinationOption originDestOption;
	final OriginDestinationOptions originDestOptions = new OriginDestinationOptions();
	for (com.cnk.travelogix.suppliers.air.data.OriginDestinationOption originDestOptionData : originDestOptionsData) {
	    originDestOption = populateFlightSegmentRequest(originDestOptionData);
	    originDestOptions.getOriginDestinationOption().add(originDestOption);
	}
	return originDestOptions;
    }

}
