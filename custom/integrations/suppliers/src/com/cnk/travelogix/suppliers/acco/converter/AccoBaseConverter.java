package com.cnk.travelogix.suppliers.acco.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.AcceptedPaymentsType;
import org.opentravel.ota._2003._05.AcceptedPaymentsType.AcceptedPayment;
import org.opentravel.ota._2003._05.AdditionalDetailType;
import org.opentravel.ota._2003._05.AdditionalDetailsType;
import org.opentravel.ota._2003._05.AddressInfoType;
import org.opentravel.ota._2003._05.AddressType.BldgRoom;
import org.opentravel.ota._2003._05.AmountPercentType;
import org.opentravel.ota._2003._05.BasicPropertyInfoType;
import org.opentravel.ota._2003._05.CancelPenaltiesType;
import org.opentravel.ota._2003._05.CancelPenaltyType;
import org.opentravel.ota._2003._05.CancelPenaltyType.Deadline;
import org.opentravel.ota._2003._05.CommentType;
import org.opentravel.ota._2003._05.CommentType.Comment;
import org.opentravel.ota._2003._05.CommissionType;
import org.opentravel.ota._2003._05.CommissionType.CommissionableAmount;
import org.opentravel.ota._2003._05.CustomerType.Email;
import org.opentravel.ota._2003._05.DateTimeSpanType;
import org.opentravel.ota._2003._05.EncryptionTokenType;
import org.opentravel.ota._2003._05.GuestCountType;
import org.opentravel.ota._2003._05.HotelResModifyRequestType;
import org.opentravel.ota._2003._05.HotelResModifyType;
import org.opentravel.ota._2003._05.HotelReservationType;
import org.opentravel.ota._2003._05.HotelReservationType.ResGlobalInfo;
import org.opentravel.ota._2003._05.ItemSearchCriterionType.HotelRef;
import org.opentravel.ota._2003._05.ListPaymentCardIssuer;
import org.opentravel.ota._2003._05.OTAHotelAvailRS;
import org.opentravel.ota._2003._05.PaymentCardType;
import org.opentravel.ota._2003._05.PaymentCardType.ThreeDomainSecurity;
import org.opentravel.ota._2003._05.PaymentCardType.ThreeDomainSecurity.Results;
import org.opentravel.ota._2003._05.PersonNameType;
import org.opentravel.ota._2003._05.ProfileType;
import org.opentravel.ota._2003._05.ProfilesType;
import org.opentravel.ota._2003._05.RateIndicatorType;
import org.opentravel.ota._2003._05.RatePlanInclusionsType;
import org.opentravel.ota._2003._05.RatePlanType;
import org.opentravel.ota._2003._05.RateType;
import org.opentravel.ota._2003._05.RequiredPaymentsType;
import org.opentravel.ota._2003._05.RequiredPaymentsType.GuaranteePayment;
import org.opentravel.ota._2003._05.ResGuestType;
import org.opentravel.ota._2003._05.ResGuestsType;
import org.opentravel.ota._2003._05.RoomAmenityPrefType;
import org.opentravel.ota._2003._05.RoomStayCandidateType;
import org.opentravel.ota._2003._05.RoomStayType;
import org.opentravel.ota._2003._05.RoomStayType.RoomRates;
import org.opentravel.ota._2003._05.RoomStayType.RoomTypes;
import org.opentravel.ota._2003._05.RoomStaysType;
import org.opentravel.ota._2003._05.RoomTypeType;
import org.opentravel.ota._2003._05.RoomTypeType.Amenities;
import org.opentravel.ota._2003._05.ServiceRPHsType;
import org.opentravel.ota._2003._05.ServiceRPHsType.ServiceRPH;
import org.opentravel.ota._2003._05.ServicesType;
import org.opentravel.ota._2003._05.SuccessType;
import org.opentravel.ota._2003._05.TPAExtensionsType;
import org.opentravel.ota._2003._05.TaxType;
import org.opentravel.ota._2003._05.TaxesType;
import org.opentravel.ota._2003._05.TotalType;
import org.opentravel.ota._2003._05.TransactionActionType;
import org.opentravel.ota._2003._05.UniqueIDType;
import org.opentravel.ota._2003._05.WarningType;
import org.opentravel.ota._2003._05.WarningsType;
import org.w3c.dom.Element;

import com.cnk.travelogix.suppliers.acco.AmountPercent;
import com.cnk.travelogix.suppliers.acco.data.*;
import com.cnk.travelogix.suppliers.common.converter.BaseConverter;
import com.cnk.travelogix.suppliers.common.data.SupplierID;
import com.cnk.travelogix.suppliers.common.data.TPAExtensions;
import com.coxandkings.integ.suppl.common.SupplierIDType;

/**
 * AccoBase Converter
 */
public class AccoBaseConverter extends BaseConverter {

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
     * @param hotelResModify
     * @return hoteResModifyReq
     */
    public HotelResModifyRequestType getHotelModify(HotelResModify hotelResModify) {
	HotelResModifyRequestType hoteResModifyReq = new HotelResModifyRequestType();
	hoteResModifyReq.setTarget(hotelResModify.getTarget());
	hoteResModifyReq.setVersion(hotelResModify.getVersion());
	if (hotelResModify.getResStatus() != null)
	    hoteResModifyReq.setResStatus(TransactionActionType.fromValue(hotelResModify.getResStatus()));
	List<UniqueIDType> idTypeList = new ArrayList<>();
	List<UniqueID> idlist = hotelResModify.getUniqueID();
	if (idlist != null) {
	    for (UniqueID uniqueID : idlist) {
		UniqueIDType idType = new UniqueIDType();
		idType.setID(uniqueID.getId());
		idType.setType(uniqueID.getType());
		idTypeList.add(idType);
	    }
	}
	hoteResModifyReq.getUniqueID().addAll(idTypeList);
	HotelResModifyType hotelResModifyType = new HotelResModifyType();
	List<org.opentravel.ota._2003._05.HotelResModifyType.HotelResModify> otaHotelModifyList = new ArrayList<>();
	org.opentravel.ota._2003._05.HotelResModifyType.HotelResModify otaHotelResModify = new org.opentravel.ota._2003._05.HotelResModifyType.HotelResModify();
	otaHotelResModify.setRoomStays(getRoomstays(hotelResModify));
	otaHotelResModify.setResGuests(getResGuests(hotelResModify));
	List<UniqueIDType> idTypes = getUniqueids(hotelResModify);
	if (idTypes != null)
	    otaHotelResModify.getUniqueID().addAll(idTypes);
	ServicesType serviceType = getServices(hotelResModify);
	if (!serviceType.getService().isEmpty())
	    getHotelModifyService(serviceType, otaHotelResModify);
	ResGuestsType restGuestType = getResGuests(hotelResModify);
	if (!restGuestType.getResGuest().isEmpty()) {
	    getHotelModifyResGuest(restGuestType, otaHotelResModify);
	}
	otaHotelModifyList.add(otaHotelResModify);
	hotelResModifyType.getHotelResModify().add(otaHotelResModify);
	hoteResModifyReq.setHotelResModifies(hotelResModifyType);
	return hoteResModifyReq;
    }

    private void getHotelModifyResGuest(ResGuestsType restGuestType, org.opentravel.ota._2003._05.HotelResModifyType.HotelResModify otaHotelResModify) {
	if (restGuestType.getResGuest().get(0).getResGuestRPH() != null)
	    otaHotelResModify.setResGuests(restGuestType);
    }

    private void getHotelModifyService(ServicesType serviceType, org.opentravel.ota._2003._05.HotelResModifyType.HotelResModify otaHotelResModify) {
	if (serviceType.getService().get(0).getID() != null)
	    otaHotelResModify.setServices(serviceType);
    }

    protected org.opentravel.ota._2003._05.ProfilesType.ProfileInfo setProfilesType(com.cnk.travelogix.suppliers.acco.data.Criterion criterion) {
	org.opentravel.ota._2003._05.ProfilesType.ProfileInfo profileInfo = new org.opentravel.ota._2003._05.ProfilesType.ProfileInfo();
	List<com.cnk.travelogix.suppliers.acco.data.ProfileInfo> profiles = criterion.getProfiles();
	if (profiles != null) {
	    for (com.cnk.travelogix.suppliers.acco.data.ProfileInfo profileInfoData : profiles) {
		ProfileType profileType = new ProfileType();
		Profile profileData = profileInfoData.getProfile();
		if (profileData != null) {
		    profileType.setCustomer(setOtaCustomerType(profileData.getCustomer()));

		    TPAExtensionsType tpaExtensions = setTPAExtensions(profileInfoData);
		    profileType.setTPAExtensions(tpaExtensions);
		}
		profileInfo.setProfile(profileType);
	    }
	}
	return profileInfo;
    }

    private org.opentravel.ota._2003._05.CustomerType setOtaCustomerType(com.cnk.travelogix.suppliers.acco.data.CustomerType customerType) {
	org.opentravel.ota._2003._05.CustomerType otaCustomerType = new org.opentravel.ota._2003._05.CustomerType();
	List<com.cnk.travelogix.suppliers.acco.data.CitizenCountryName> citizenCountryNameData = customerType.getCitizenCountryName();
	for (com.cnk.travelogix.suppliers.acco.data.CitizenCountryName citizenCountryName : citizenCountryNameData) {
	    org.opentravel.ota._2003._05.CustomerType.CitizenCountryName otaCitizenCountryName = new org.opentravel.ota._2003._05.CustomerType.CitizenCountryName();
	    otaCitizenCountryName.setCode(citizenCountryName.getCode());
	    otaCustomerType.getCitizenCountryName().add(otaCitizenCountryName);
	}
	return otaCustomerType;
    }

    protected DateTimeSpanType setDateTimeSpan(com.cnk.travelogix.suppliers.acco.data.Criterion criterion) {
	DateTimeSpanType dateTimeSpanType = new DateTimeSpanType();
	com.cnk.travelogix.suppliers.acco.data.DateTimeSpanType dateTimeSpanTypeData = criterion.getStayDateRange();
	if (dateTimeSpanTypeData != null) {
	    dateTimeSpanType.setStart(dateTimeSpanTypeData.getStart());
	    dateTimeSpanType.setEnd(dateTimeSpanTypeData.getEnd());
	    dateTimeSpanType.setDuration(dateTimeSpanTypeData.getDuration());
	}
	return dateTimeSpanType;
    }

    /**
     * @param hotelResModify
     * @return otaUniqueIdList
     */
    public List<UniqueIDType> getUniqueids(HotelResModify hotelResModify) {
	List<HotelReservation> hotelReservations = hotelResModify.getHotelResModifies();
	List<UniqueIDType> uniqueList = null;
	if (hotelReservations != null && !hotelReservations.isEmpty()) {
	    for (HotelReservation hotelReservation : hotelReservations) {
		uniqueList = setUniqueId(hotelReservation.getUniqueID());
	    }
	}
	return uniqueList;
    }

    public List<UniqueIDType> setUniqueId(List<UniqueID> uniqueIDs) {
	List<UniqueIDType> otaUniqueIdList = new ArrayList<>();
	if (uniqueIDs != null) {
	    for (UniqueID uniqueID : uniqueIDs) {
		UniqueIDType otaUniqueId = new UniqueIDType();
		otaUniqueId.setID(uniqueID.getId());
		otaUniqueId.setType(uniqueID.getType());
		otaUniqueIdList.add(otaUniqueId);
	    }
	}
	return otaUniqueIdList;
    }

    /**
     * @param hotelResModify
     * @return roomStaysType
     */
    public RoomStaysType getRoomstays(HotelResModify hotelResModify) {
	RoomStaysType roomStaysType = new RoomStaysType();
	List<org.opentravel.ota._2003._05.RoomStaysType.RoomStay> otaRoomStayList = new ArrayList<>();
	List<HotelReservation> hotelReservations = hotelResModify.getHotelResModifies();
	if (hotelReservations != null && !hotelReservations.isEmpty()) {
	    for (HotelReservation hotelReservation : hotelReservations) {
		List<RoomStay> roomStays = hotelReservation.getRoomStays();
		getRoomStayData(otaRoomStayList, roomStays);
	    }
	}
	roomStaysType.getRoomStay().addAll(otaRoomStayList);
	return roomStaysType;
    }

    /**
     * @param otaRoomStayList
     * @param roomStays
     */
    private void getRoomStayData(List<org.opentravel.ota._2003._05.RoomStaysType.RoomStay> otaRoomStayList, List<RoomStay> roomStays) {
	if (roomStays != null) {
	    for (RoomStay roomStay : roomStays) {
		org.opentravel.ota._2003._05.RoomStaysType.RoomStay roomStayObj = getRoomStay(roomStay);
		org.opentravel.ota._2003._05.RoomStayType.RatePlans rateRoomPlans = getRatePlans(roomStay);
		if (!rateRoomPlans.getRatePlan().isEmpty()) {
		    setHotelModifyRoomplans(rateRoomPlans, roomStayObj);
		}
		org.opentravel.ota._2003._05.RoomStayType.RoomRates roomRates = getRoomRates(roomStay);
		if (!roomRates.getRoomRate().isEmpty()) {
		    setHotelModifyRoomRates(roomRates, roomStayObj);
		}
		otaRoomStayList.add(roomStayObj);
	    }
	}
    }

    private void setHotelModifyRoomplans(org.opentravel.ota._2003._05.RoomStayType.RatePlans rateRoomPlans, org.opentravel.ota._2003._05.RoomStaysType.RoomStay roomStayObj) {
	if (rateRoomPlans.getRatePlan().get(0).getRatePlanCode() != null)
	    roomStayObj.setRatePlans(rateRoomPlans);
    }

    private void setHotelModifyRoomRates(RoomRates roomRates, org.opentravel.ota._2003._05.RoomStaysType.RoomStay roomStayObj) {
	if (roomRates.getRoomRate().get(0).getTotal() != null)
	    roomStayObj.setRoomRates(roomRates);
    }

    /**
     * @param roomStay
     * @return otaRatePlans
     */
    public RoomStayType.RatePlans getRatePlans(RoomStay roomStay) {
	RoomStayType.RatePlans otaRatePlans = new RoomStayType.RatePlans();
	List<RatePlanType> ratePlaneTypeList = new ArrayList<>();
	List<RatePlans> ratePlansList = roomStay.getRatePlans();
	if (ratePlansList != null) {
	    for (RatePlans ratePlans : ratePlansList) {
		RatePlanType ratePlanTypedata = new RatePlanType();
		ratePlanTypedata.setAvailableQuantity(ratePlans.getAvailableQuantity());
		ratePlanTypedata.setRatePlanCode(ratePlans.getRatePlanCode());
		ratePlanTypedata.setRatePlanName(ratePlans.getRatePlanName());
		ratePlanTypedata.setRatePlanType(ratePlans.getRatePlanType());
		ratePlanTypedata.setRatePlanID(ratePlans.getRatePlanID());
		ratePlanTypedata.setBookingCode(ratePlans.getBookingCode());
		// no attributes
		RateIndicatorType rateIndicatorType = null;
		ratePlanTypedata.setRateIndicator(rateIndicatorType);
		org.opentravel.ota._2003._05.ParagraphType paragrah = new org.opentravel.ota._2003._05.ParagraphType();
		ParagraphType paragraphType = ratePlans.getRatePlanDesciption();
		if (paragraphType != null) {
		    paragrah.setName(paragraphType.getName());
		    ratePlanTypedata.setRatePlanDescription(paragrah);
		}
		MealsIncluded mealsIncluded = ratePlans.getMealsIncluded();
		if (mealsIncluded != null) {
		    org.opentravel.ota._2003._05.RatePlanType.MealsIncluded otaMealsIncluded = new org.opentravel.ota._2003._05.RatePlanType.MealsIncluded();
		    otaMealsIncluded.setBreakfast(mealsIncluded.getBreakfast());
		    otaMealsIncluded.setDinner(mealsIncluded.getDinner());
		    otaMealsIncluded.setLunch(mealsIncluded.getLunch());
		    otaMealsIncluded.setMealPlanIndicator(mealsIncluded.getMealPlanIndicator());
		    otaMealsIncluded.getMealPlanCodes().addAll(mealsIncluded.getMealPlanCodes());
		    ratePlanTypedata.setMealsIncluded(otaMealsIncluded);
		}
		RatePlanInclusions ratePlanIncludtion = ratePlans.getRatePlanInclusions();
		if (ratePlanIncludtion != null) {

		    RatePlanInclusionsType paragraphTypeDesc = setParagraphType(ratePlanIncludtion.getRatePlanInclusionDesciption());
		    ratePlanTypedata.setRatePlanInclusions(paragraphTypeDesc);
		}
		ratePlanTypedata.setCancelPenalties(setCancelPenaltiesType(ratePlans.getCancelPenalties()));

		ratePlaneTypeList.add(ratePlanTypedata);
	    }
	}
	otaRatePlans.getRatePlan().addAll(ratePlaneTypeList);
	return otaRatePlans;
    }

    private CancelPenaltiesType setCancelPenaltiesType(CancelPenalties cancelpenalties) {
	CancelPenaltiesType cancelPenaltiesType = new CancelPenaltiesType();
	if (cancelpenalties != null) {

	    List<CancelPenaltyType> cacelPenaltyTypeList = new ArrayList<>();
	    cancelpenalties.getCancelPolicyIndicator();
	    List<CancelPenalty> cancelPenaltyList = cancelpenalties.getCancelPenalty();
	    for (CancelPenalty cancelPenalty : cancelPenaltyList) {
		CancelPenaltyType cancelPenaltyType = new CancelPenaltyType();
		cancelPenaltyType.setEnd(cancelPenalty.getEnd());
		cancelPenaltyType.setStart(cancelPenalty.getStart());
		cancelPenaltyType.setDuration(cancelPenalty.getDuration());
		cancelPenaltyType.setDeadline(setOtaDeadline(cancelPenalty.getDeadline()));
		cancelPenaltyType.setAmountPercent(setAmountPercentData(cancelPenalty.getAmountPercent()));
		List<org.opentravel.ota._2003._05.ParagraphType> paragraphTypeList = new ArrayList<>();
		List<ParagraphType> paraphList = cancelPenalty.getPenaltyDescription();
		setHotelModifyParagraph(paraphList, paragraphTypeList);
		cancelPenaltyType.getPenaltyDescription().addAll(paragraphTypeList);
		cacelPenaltyTypeList.add(cancelPenaltyType);
	    }
	    cancelPenaltiesType.getCancelPenalty().addAll(cacelPenaltyTypeList);
	}
	return cancelPenaltiesType;
    }

    private Deadline setOtaDeadline(com.cnk.travelogix.suppliers.acco.data.Deadline deadLine) {
	org.opentravel.ota._2003._05.CancelPenaltyType.Deadline otaDeadline = new org.opentravel.ota._2003._05.CancelPenaltyType.Deadline();
	otaDeadline.setAbsoluteDeadline(deadLine.getAbsoluteDeadline());
	otaDeadline.setOffsetDropTime(deadLine.getOffsetDropTime());
	otaDeadline.setOffsetUnitMultiplier(deadLine.getOffsetUnitMultiplier());
	//no attributes to set 
	org.opentravel.ota._2003._05.TimeUnitType otaTimeUnitType = null;
	otaDeadline.setOffsetTimeUnit(otaTimeUnitType);
	return otaDeadline;
    }

    private AmountPercentType setAmountPercentData(AmountPercent amountPercent) {
	AmountPercentType amountPercentType = new AmountPercentType();
	amountPercentType.setAmount(amountPercent.getAmount());
	amountPercentType.setPercent(amountPercent.getPercent());
	amountPercentType.setNmbrOfNights(amountPercent.getNmbrOfNights());
	amountPercentType.setTaxInclusive(amountPercent.getTaxInclusive());
	return amountPercentType;
    }

    private RatePlanInclusionsType setParagraphType(ParagraphType paragraphTypeDesc) {
	RatePlanInclusionsType ratePlanInclusionsType = new RatePlanInclusionsType();
	if (paragraphTypeDesc != null) {
	    org.opentravel.ota._2003._05.ParagraphType paragrahDesc = new org.opentravel.ota._2003._05.ParagraphType();
	    paragrahDesc.setName(paragraphTypeDesc.getName());
	    ratePlanInclusionsType.setRatePlanInclusionDesciption(paragrahDesc);
	}
	return ratePlanInclusionsType;
    }

    private void setHotelModifyParagraph(List<ParagraphType> paraphList, List<org.opentravel.ota._2003._05.ParagraphType> paragraphTypeList) {
	for (ParagraphType paragraphTypeobj : paraphList) {
	    org.opentravel.ota._2003._05.ParagraphType paragrahTypeDesc = new org.opentravel.ota._2003._05.ParagraphType();
	    paragrahTypeDesc.setName(paragraphTypeobj.getName());
	    paragraphTypeList.add(paragrahTypeDesc);
	}
    }

    /**
     * @param roomStay
     * @return roomRates
     */
    public org.opentravel.ota._2003._05.RoomStayType.RoomRates getRoomRates(RoomStay roomStay) {
	org.opentravel.ota._2003._05.RoomStayType.RoomRates roomRates = new org.opentravel.ota._2003._05.RoomStayType.RoomRates();
	List<org.opentravel.ota._2003._05.RoomStayType.RoomRates.RoomRate> otaRoomRatesList = roomRates.getRoomRate();
	List<RoomRate> roomRateList = roomStay.getRoomRates();
	if (roomRateList != null) {
	    for (RoomRate roomRate : roomRateList) {
		org.opentravel.ota._2003._05.RoomStayType.RoomRates.RoomRate otaRoomRate = new org.opentravel.ota._2003._05.RoomStayType.RoomRates.RoomRate();
		RateIndicatorType rateIndicatorType = null;
		//no attributes to set
		otaRoomRate.setAvailabilityStatus(rateIndicatorType);
		otaRoomRate.setBookingCode(roomRate.getBookingCode());
		otaRoomRate.setNumberOfUnits(roomRate.getNumberOfUnits());
		otaRoomRate.setEffectiveDate(toXMLGregorianCalendar(roomRate.getEffectiveDate()));
		otaRoomRate.setExpireDate(toXMLGregorianCalendar(roomRate.getExpireDate()));
		otaRoomRate.setRatePlanType(roomRate.getRatePlanType());
		otaRoomRate.setRatePlanID(roomRate.getRatePlanID());
		otaRoomRate.setRatePlanQualifier(roomRate.getRatePlanQualifier());
		otaRoomRate.setRatePlanCode(roomRate.getRatePlanCode());
		otaRoomRate.setRoomTypeCode(roomRate.getRoomTypeCode());
		otaRoomRate.setRoomID(roomRate.getRoomID());
		List<org.opentravel.ota._2003._05.RoomRateType.Availability> otaAvailabilityList = new ArrayList<>();
		// No variables 
		List<Availability> availabilityList = roomRate.getAvailability();
		for (Availability availability : availabilityList) {
		    availability.getAvailabilityStatus();
		    org.opentravel.ota._2003._05.RoomRateType.Availability otaAvailability = new org.opentravel.ota._2003._05.RoomRateType.Availability();
		    RateIndicatorType availRateIndicatorType = null;
		    otaAvailability.setAvailabilityStatus(availRateIndicatorType);
		    otaAvailabilityList.add(otaAvailability);
		}

		otaRoomRate.getAvailability().addAll(otaAvailabilityList);
		TotalType totalType = new TotalType();
		Total total = roomRate.getTotal();
		totalType.setAmountAfterTax(total.getAmountAfterTax());
		totalType.setAmountBeforeTax(total.getAmountBeforeTax());
		totalType.setCurrencyCode(total.getCurrencyCode());
		totalType.setType(total.getType());
		otaRoomRate.setTotal(totalType);
		RateType rateType = new RateType();
		List<org.opentravel.ota._2003._05.RateType.Rate> otaRoomRateList = new ArrayList<>();
		List<Rate> rateList = roomRate.getRates();
		for (Rate rate : rateList) {
		    org.opentravel.ota._2003._05.RateType.Rate roomRateobj = new org.opentravel.ota._2003._05.RateType.Rate();
		    roomRateobj.setEffectiveDate(toXMLGregorianCalendar(rate.getEffectiveDate()));
		    roomRateobj.setExpireDate(toXMLGregorianCalendar(rate.getExpireDate()));
		    org.opentravel.ota._2003._05.ParagraphType paragraphType = new org.opentravel.ota._2003._05.ParagraphType();
		    ParagraphType paragraph = rate.getRateDescription();
		    paragraphType.setName(paragraph.getName());
		    roomRateobj.setRateDescription(paragraphType);
		    TotalType baseTotal = new TotalType();
		    Total base = rate.getBase();
		    baseTotal.setAmountAfterTax(base.getAmountAfterTax());
		    baseTotal.setAmountBeforeTax(base.getAmountBeforeTax());
		    baseTotal.setType(base.getType());
		    baseTotal.setCurrencyCode(base.getCurrencyCode());
		    TaxesType taxesType = new TaxesType();
		    List<TaxType> taxTypeList = new ArrayList<>();
		    List<Tax> taxList = base.getTaxes();
		    setHotelModifyTax(taxList, taxTypeList);
		    taxesType.getTax().addAll(taxTypeList);
		    baseTotal.setTaxes(taxesType);
		    roomRateobj.setBase(baseTotal);
		    TotalType otaRateTotal = new TotalType();
		    Total rateTotal = rate.getTotal();
		    otaRateTotal.setAmountAfterTax(rateTotal.getAmountAfterTax());
		    otaRateTotal.setAmountBeforeTax(rateTotal.getAmountBeforeTax());
		    otaRateTotal.setType(rateTotal.getType());
		    otaRateTotal.setCurrencyCode(rateTotal.getCurrencyCode());
		    roomRateobj.setTotal(otaRateTotal);
		    List<org.opentravel.ota._2003._05.AmountType.Discount> discountTypeList = new ArrayList<>();
		    List<Discount> discountList = rate.getDiscount();
		    setHotelModefyDiscount(discountList, discountTypeList);
		    roomRateobj.getDiscount().addAll(discountTypeList);
		    otaRoomRateList.add(roomRateobj);
		    // No Attribute for Fee
		}
		rateType.getRate().addAll(otaRoomRateList);
		otaRoomRate.setRates(rateType);
		otaRoomRatesList.add(otaRoomRate);
	    }
	}
	roomRates.getRoomRate().addAll(otaRoomRatesList);
	return roomRates;
    }

    private void setHotelModefyDiscount(List<Discount> discountList, List<org.opentravel.ota._2003._05.AmountType.Discount> discountTypeList) {
	for (Discount discount : discountList) {
	    org.opentravel.ota._2003._05.AmountType.Discount discountType = new org.opentravel.ota._2003._05.AmountType.Discount();
	    org.opentravel.ota._2003._05.ParagraphType discountParagraphType = new org.opentravel.ota._2003._05.ParagraphType();
	    ParagraphType discountparagraphType = discount.getDiscountReason();
	    discountParagraphType.setName(discountparagraphType.getName());
	    discountType.setDiscountReason(discountParagraphType);
	    discountType.setAmountBeforeTax(discount.getAmountBeforeTax());
	    discountType.setAppliesTo(discount.getAppliesTo());
	    discountTypeList.add(discountType);
	}

    }

    private void setHotelModifyTax(List<Tax> taxList, List<TaxType> taxTypeList) {
	for (Tax tax : taxList) {
	    TaxType taxType = new TaxType();
	    taxType.setAmount(tax.getAmount());
	    taxType.setCode(tax.getCode());
	    taxTypeList.add(taxType);
	}

    }

    /**
     * @param roomStay
     * @return otaRoomStayObj
     */
    public org.opentravel.ota._2003._05.RoomStaysType.RoomStay getRoomStay(RoomStay roomStay) {
	org.opentravel.ota._2003._05.RoomStaysType.RoomStay otaRoomStayObj = new RoomStaysType.RoomStay();
	otaRoomStayObj.setRoomStayStatus(roomStay.getRoomStayStatus());
	otaRoomStayObj.setMarketCode(roomStay.getMarketCode());
	otaRoomStayObj.setDiscountCode(roomStay.getDiscountCode());
	otaRoomStayObj.setIndexNumber(roomStay.getIndexNumber());
	RoomTypes roomType = getRoomTypes(roomStay);
	if (!roomType.getRoomType().isEmpty()) {
	    setHotelModifyRoomType(roomType, otaRoomStayObj);
	}
	BasicPropertyInfoType otaBasicPropertyInfoType = new BasicPropertyInfoType();
	BasicPropertyInfo basicPropertyInfo = roomStay.getBasicPropertyInfo();
	setHotelBasicPropertyInfo(basicPropertyInfo, otaBasicPropertyInfoType);
	org.opentravel.ota._2003._05.DateTimeSpanType otaDateTimeSpan = new org.opentravel.ota._2003._05.DateTimeSpanType();
	com.cnk.travelogix.suppliers.acco.data.DateTimeSpanType dateTimeSpanType = roomStay.getTimeSpan();
	if (dateTimeSpanType != null) {
	    otaDateTimeSpan.setEnd(dateTimeSpanType.getEnd());
	    otaDateTimeSpan.setStart(dateTimeSpanType.getStart());
	    otaRoomStayObj.setTimeSpan(otaDateTimeSpan);
	}
	otaRoomStayObj.setGuestCounts(setOtaGuestCountType(roomStay.getGuestCounts()));

	org.opentravel.ota._2003._05.CommentType otaCommentType = new org.opentravel.ota._2003._05.CommentType();
	List<org.opentravel.ota._2003._05.CommentType.Comment> otaCommentList = new ArrayList<>();
	Comments comment = roomStay.getComments();
	if (comment != null) {
	    List<ParagraphType> commentList = comment.getComment();
	    for (ParagraphType paragraphType : commentList) {
		org.opentravel.ota._2003._05.CommentType.Comment otaComment = new org.opentravel.ota._2003._05.CommentType.Comment();
		otaComment.setName(paragraphType.getName());
		// need to set 
		paragraphType.getText();
		otaCommentList.add(otaComment);
	    }
	    otaCommentType.getComment().addAll(otaCommentList);
	    otaRoomStayObj.setComments(otaCommentType);
	}

	org.opentravel.ota._2003._05.ServiceRPHsType otaServiceRphsType = otaRoomStayObj.getServiceRPHs();
	if (otaServiceRphsType != null) {
	    List<ServiceRPH> otaServiceRphsList = otaServiceRphsType.getServiceRPH();
	    List<ServiceRPHs> serviceRphs = roomStay.getServiceRPHs();
	    for (ServiceRPHs servicerph : serviceRphs) {
		ServiceRPH serviceRPH = new ServiceRPH();
		serviceRPH.setRPH(servicerph.getRph());
		serviceRPH.setIsPerRoom(servicerph.getIsPerRoom());
		otaServiceRphsList.add(serviceRPH);
	    }
	    otaServiceRphsType.getServiceRPH().addAll(otaServiceRphsList);
	    otaRoomStayObj.setServiceRPHs(otaServiceRphsType);
	}
	TotalType totaltype = new TotalType();
	Total total = roomStay.getTotal();
	if (total != null) {
	    totaltype.setAmountAfterTax(total.getAmountAfterTax());
	    totaltype.setAmountBeforeTax(total.getAmountBeforeTax());
	    totaltype.setCurrencyCode(total.getCurrencyCode());
	    totaltype.setDecimalPlaces(total.getDecimalPlaces());
	    totaltype.setType(total.getType());
	    TaxesType taxestype = new TaxesType();
	    List<TaxType> taxTypeList = new ArrayList<>();
	    List<Tax> taxList = total.getTaxes();
	    for (Tax tax : taxList) {
		TaxType taxType = new TaxType();
		List<ParagraphType> paragraph = tax.getTaxDescription();
		//no attribute 
		for (ParagraphType paragraphType : paragraph) {
		    org.opentravel.ota._2003._05.ParagraphType paragraph1 = new org.opentravel.ota._2003._05.ParagraphType();
		    paragraph1.setName(paragraphType.getName());
		    taxType.getTaxDescription().add(paragraph1);
		}
		taxTypeList.add(taxType);
	    }
	    totaltype.setTaxes(taxestype);
	    otaRoomStayObj.setTotal(totaltype);
	}
	return otaRoomStayObj;
    }

    protected GuestCountType setOtaGuestCountType(com.cnk.travelogix.suppliers.acco.data.GuestCountType guestCountType) {
	org.opentravel.ota._2003._05.GuestCountType otaGuestCountType = new org.opentravel.ota._2003._05.GuestCountType();
	if (guestCountType != null) {
	    otaGuestCountType.setIsPerRoom(guestCountType.getIsPerRoom());
	    List<GuestCount> guestCounts = guestCountType.getGuestCount();
	    for (GuestCount guestCount : guestCounts) {
		org.opentravel.ota._2003._05.GuestCountType.GuestCount otaGuestCount = new org.opentravel.ota._2003._05.GuestCountType.GuestCount();
		otaGuestCount.setAge(guestCount.getAge());
		otaGuestCount.setCount(guestCount.getCount());
		otaGuestCount.setAgeQualifyingCode(guestCount.getAgeQualifyingCode());
		otaGuestCount.setAgeBucket(guestCount.getAgeBucket());
		otaGuestCount.setResGuestRPH(guestCount.getResGuestRPH());
		otaGuestCountType.getGuestCount().add(otaGuestCount);
	    }
	}
	return otaGuestCountType;
    }

    private void setHotelBasicPropertyInfo(BasicPropertyInfo basicPropertyInfo, BasicPropertyInfoType otaBasicPropertyInfoType) {
	if (basicPropertyInfo != null) {
	    otaBasicPropertyInfoType.setCurrencyCode(basicPropertyInfo.getCurrencyCode());
	    otaBasicPropertyInfoType.setHotelCityCode(basicPropertyInfo.getHotelCityCode());
	    otaBasicPropertyInfoType.setHotelSegmentCategoryCode(basicPropertyInfo.getHotelSegmentCategoryCode());
	    otaBasicPropertyInfoType.setHotelName(basicPropertyInfo.getHotelName());
	    otaBasicPropertyInfoType.setAreaID(basicPropertyInfo.getAreaID());
	    otaBasicPropertyInfoType.setChainCode(basicPropertyInfo.getChainCode());
	    otaBasicPropertyInfoType.setChainName(basicPropertyInfo.getChainName());
	    setBasicInfoAddress(basicPropertyInfo, otaBasicPropertyInfoType);
	    setBasicInfoAwards(basicPropertyInfo, otaBasicPropertyInfoType);
	}

    }

    private void setBasicInfoAwards(BasicPropertyInfo basicPropertyInfo, BasicPropertyInfoType otaBasicPropertyInfoType) {
	List<Award> awardsListData = basicPropertyInfo.getAward();
	for (Award award : awardsListData) {
	    org.opentravel.ota._2003._05.BasicPropertyInfoType.Award otaAward = new org.opentravel.ota._2003._05.BasicPropertyInfoType.Award();
	    otaAward.setProvider(award.getProvider());
	    otaAward.setRating(award.getRating());
	    otaBasicPropertyInfoType.getAward().add(otaAward);
	}
    }

    private void setBasicInfoAddress(BasicPropertyInfo basicPropertyInfo, BasicPropertyInfoType otaBasicPropertyInfoType) {
	com.cnk.travelogix.suppliers.acco.data.Address otaAddress = basicPropertyInfo.getAddress();
	List<String> addresslisnes = otaAddress.getAddressLine();
	org.opentravel.ota._2003._05.AddressInfoType otaAddressInfoType = new org.opentravel.ota._2003._05.AddressInfoType();
	otaAddressInfoType.setCounty(otaAddress.getCounty());
	otaAddressInfoType.setCityName(otaAddress.getCityName());
	otaAddressInfoType.getBldgRoom().containsAll(otaAddress.getBldgRoom());
	otaAddressInfoType.getAddressLine().addAll(addresslisnes);
	otaBasicPropertyInfoType.setAddress(otaAddressInfoType);
    }

    protected void setHotelModifyRoomType(RoomTypes roomType, org.opentravel.ota._2003._05.RoomStaysType.RoomStay otaRoomStayObj) {
	if (roomType.getRoomType().get(0).getRoomID() != null) {
	    otaRoomStayObj.setRoomTypes(roomType);
	}
    }

    /**
     * @param roomStay
     * @return otaRoomTypes
     */
    public RoomTypes getRoomTypes(RoomStay roomStay) {
	RoomTypes otaRoomTypes = new RoomTypes();
	List<RoomTypeType> otaRoomTypeTypeList = new ArrayList<>();
	if (roomStay.getRoomTypes() != null) {
	    List<RoomType> roomTypeList = roomStay.getRoomTypes();
	    for (RoomType roomType : roomTypeList) {
		RoomTypeType otaroomTypeType = new RoomTypeType();
		otaroomTypeType.setRoomID(roomType.getRoomID());
		otaroomTypeType.setRoomType(roomType.getRoomType());
		otaroomTypeType.setRoomTypeCode(roomType.getRoomTypeCode());
		otaroomTypeType.setRoomLocationCode(roomType.getRoomLocationCode());
		otaroomTypeType.setQuantity(roomType.getQuantity());
		otaroomTypeType.setPromotionCode(roomType.getPromotionCode());
		org.opentravel.ota._2003._05.ParagraphType otaPragraph = new org.opentravel.ota._2003._05.ParagraphType();
		ParagraphType paragraphType = roomType.getRoomDescription();
		if (paragraphType != null) {
		    otaPragraph.setName(paragraphType.getName());
		    //need to set 
		    paragraphType.getText();
		    otaroomTypeType.setRoomDescription(otaPragraph);
		}
		otaroomTypeType.setNonSmoking(roomType.getNonSmoking());
		otaroomTypeType.setNumberOfUnits(roomType.getNumberOfUnits());
		if (roomType.getBedTypeCode() != null && !roomType.getBedTypeCode().isEmpty()) {
		    otaroomTypeType.getBedTypeCode().addAll(roomType.getBedTypeCode());

		    AdditionalDetailsType additionalDetailsType = setOtaAdditionalDetailsType(roomType.getAdditionalDetails());
		    otaroomTypeType.setAdditionalDetails(additionalDetailsType);

		    List<org.opentravel.ota._2003._05.RoomTypeType.Occupancy> otaOccupancyList = getOccupancyDataRoomType(roomType.getOccupancy());
		    otaroomTypeType.getOccupancy().addAll(otaOccupancyList);

		    List<RoomAmenityPrefType> otaRoomAmenityPrefTypeList = setAmenity(roomType.getAmenities());
		    org.opentravel.ota._2003._05.RoomTypeType.Amenities otaAmenities = new org.opentravel.ota._2003._05.RoomTypeType.Amenities();

		    otaAmenities.getAmenity().addAll(otaRoomAmenityPrefTypeList);
		    otaroomTypeType.setAmenities(otaAmenities);

		    otaroomTypeType.setTPAExtensions(populateTpaExtension(roomType.getTpaExtensions()));
		}
		otaRoomTypeTypeList.add(otaroomTypeType);
		otaRoomTypes.getRoomType().addAll(otaRoomTypeTypeList);
	    }
	}
	return otaRoomTypes;
    }

    protected TPAExtensionsType populateTpaExtension(TPAExtensions tpaExtensionsData) {
	TPAExtensionsType tpaExtensions = null;
	if (tpaExtensionsData != null) {
	    tpaExtensions = getTPAExtensionsType(tpaExtensionsData, NAMESPACE_ACCO);
	}
	return tpaExtensions;
    }

    public List<RoomAmenityPrefType> setAmenity(List<Amenity> amenityList) {
	List<RoomAmenityPrefType> otaRoomAmenityPrefTypeList = new ArrayList<>();
	if (amenityList != null && !amenityList.isEmpty()) {
	    for (Amenity amenity : amenityList) {
		RoomAmenityPrefType otaRoomAmenityPrefType = new RoomAmenityPrefType();
		otaRoomAmenityPrefType.setRoomAmenity(amenity.getRoomAmenity());
		otaRoomAmenityPrefType.setQuantity(amenity.getQuantity());
		otaRoomAmenityPrefType.setQualityLevel(amenity.getQualityLevel());
		otaRoomAmenityPrefTypeList.add(otaRoomAmenityPrefType);
	    }
	}
	return otaRoomAmenityPrefTypeList;
    }

    public AdditionalDetailsType setOtaAdditionalDetailsType(List<AdditionalDetail> addtitionalDetails) {
	AdditionalDetailsType otaAdditionalDetailsType = new AdditionalDetailsType();
	if (addtitionalDetails != null && !addtitionalDetails.isEmpty()) {
	    List<AdditionalDetailType> otaAdditionalDetailTypeList = new ArrayList<>();
	    for (AdditionalDetail additionalDetail : addtitionalDetails) {
		AdditionalDetailType otaAdditionalDetailType = new AdditionalDetailType();
		otaAdditionalDetailType.setCode(additionalDetail.getCode());
		otaAdditionalDetailType.setType(additionalDetail.getType());
		com.cnk.travelogix.suppliers.acco.data.ParagraphType paragraphType2 = additionalDetail.getDetailDescription();
		org.opentravel.ota._2003._05.ParagraphType otaParagraph = new org.opentravel.ota._2003._05.ParagraphType();
		otaParagraph.setName(paragraphType2.getName());
		// no attributes to set 
		otaAdditionalDetailType.setDetailDescription(otaParagraph);
		otaAdditionalDetailTypeList.add(otaAdditionalDetailType);
	    }
	    otaAdditionalDetailsType.getAdditionalDetail().addAll(otaAdditionalDetailTypeList);
	}
	return otaAdditionalDetailsType;
    }

    /**
     * @param hotelResModify
     * @return otaServicesType
     */
    public org.opentravel.ota._2003._05.ServicesType getServices(HotelResModify hotelResModify) {
	org.opentravel.ota._2003._05.ServicesType otaServicesType = new org.opentravel.ota._2003._05.ServicesType();
	List<HotelReservation> hotelReservations = hotelResModify.getHotelResModifies();
	List<org.opentravel.ota._2003._05.ServiceType> serviceTypes = null;
	if (hotelReservations != null && !hotelReservations.isEmpty()) {
	    serviceTypes = getServiceTypes(hotelReservations);
	}
	if (serviceTypes != null) {
	    otaServicesType.getService().addAll(serviceTypes);
	}
	return otaServicesType;
    }

    /**
     * @param hotelReservations
     */
    private List<org.opentravel.ota._2003._05.ServiceType> getServiceTypes(List<HotelReservation> hotelReservations) {
	List<org.opentravel.ota._2003._05.ServiceType> serviceTypeList = new ArrayList<>();
	for (HotelReservation hotelReservation : hotelReservations) {
	    List<ServiceType> serives = hotelReservation.getServices();
	    if (serives != null) {
		for (ServiceType serviceType : serives) {
		    org.opentravel.ota._2003._05.ServiceType otaServiceType = new org.opentravel.ota._2003._05.ServiceType();
		    otaServiceType.setID(serviceType.getId());
		    otaServiceType.setType(serviceType.getType());
		    serviceTypeList.add(otaServiceType);
		}
	    }
	}
	return serviceTypeList;
    }

    /**
     * @param hotelResModify
     * @return otaResGuestsType
     */
    public org.opentravel.ota._2003._05.ResGuestsType getResGuests(HotelResModify hotelResModify) {
	org.opentravel.ota._2003._05.ResGuestsType otaResGuestsType = new org.opentravel.ota._2003._05.ResGuestsType();
	List<HotelReservation> hotelReservations = hotelResModify.getHotelResModifies();
	if (hotelReservations != null && !hotelReservations.isEmpty()) {
	    for (HotelReservation hotelReservation : hotelReservations) {
		otaResGuestsType.getResGuest().addAll(setOtaResGuestTypeList(hotelReservation.getResGuests()));
	    }
	}
	return otaResGuestsType;
    }

    /**
     * @param resGuests
     * @return otaResGuestTypeList
     */
    public List<ResGuestType> setOtaResGuestTypeList(List<ResGuest> resGuests) {
	List<ResGuestType> otaResGuestTypeList = new ArrayList<>();
	if (resGuests != null) {
	    for (ResGuest resGuestobj : resGuests) {
		ResGuestType otaResGuestType = new ResGuestType();
		otaResGuestType.setResGuestRPH(resGuestobj.getResGuestRPH());
		otaResGuestType.setAgeQualifyingCode(resGuestobj.getAgeQualifyingCode());
		otaResGuestType.setPrimaryIndicator(resGuestobj.getPrimaryIndicator());
		ProfilesType otaProfilesType = new ProfilesType();
		List<org.opentravel.ota._2003._05.ProfilesType.ProfileInfo> otaProfileInfoList = new ArrayList<>();
		List<ProfileInfo> profileInfo = resGuestobj.getProfiles();
		setHotelProfileInfo(profileInfo, otaProfileInfoList);
		otaProfilesType.getProfileInfo().addAll(otaProfileInfoList);
		otaResGuestType.setProfiles(otaProfilesType);
		otaResGuestTypeList.add(otaResGuestType);
	    }
	}
	return otaResGuestTypeList;
    }

    private void setHotelProfileInfo(List<ProfileInfo> profileInfo, List<org.opentravel.ota._2003._05.ProfilesType.ProfileInfo> otaProfileInfoList) {
	for (ProfileInfo profileobj : profileInfo) {
	    org.opentravel.ota._2003._05.ProfilesType.ProfileInfo otaProfileInfo = new org.opentravel.ota._2003._05.ProfilesType.ProfileInfo();
	    Profile profile = profileobj.getProfile();
	    org.opentravel.ota._2003._05.ProfileType otaProfileType = new org.opentravel.ota._2003._05.ProfileType();
	    otaProfileType.setRPH(profile.getRph());
	    org.opentravel.ota._2003._05.CustomerType otaCustomerType = new org.opentravel.ota._2003._05.CustomerType();
	    otaCustomerType.getPersonName().addAll(getotaPersonNameType(profile.getPersonName()));

	    CustomerType customertype = profile.getCustomer();
	    otaCustomerType.getPersonName().addAll(getOtacustomerPersonName(customertype.getPersonName()));
	    otaCustomerType.getCitizenCountryName().addAll(getOtaCitizenCountryNameList(customertype.getCitizenCountryName()));
	    otaCustomerType.getEmail().addAll(getOtaEmailList(customertype.getEmail()));
	    otaProfileType.setCustomer(otaCustomerType);
	    otaProfileInfo.setProfile(otaProfileType);
	    otaProfileInfoList.add(otaProfileInfo);
	}
    }

    /**
     * @param customerPersonalNames
     * @return otaPersonName
     */
    public List<PersonNameType> getOtacustomerPersonName(List<PersonName> customerPersonalNames) {
	List<PersonNameType> otaPersonName = new ArrayList<>();
	for (PersonName personName : customerPersonalNames) {
	    final PersonNameType nameType = getPersonNameType(personName);
	    otaPersonName.add(nameType);
	}
	return otaPersonName;
    }

    /**
     * @param personName
     * @return nameType
     */
    private PersonNameType getPersonNameType(PersonName personName) {
	PersonNameType nameType = new PersonNameType();

	nameType.getGivenName().addAll(personName.getGivenName());
	nameType.setSurname(personName.getSurname());
	nameType.setSurnamePrefix(personName.getSurnamePrefix());
	if (personName.getMiddleName() != null && !personName.getMiddleName().isEmpty())
	    nameType.getMiddleName().addAll(personName.getMiddleName());
	if (personName.getNamePrefix() != null && !personName.getNamePrefix().isEmpty())
	    nameType.getNamePrefix().addAll(personName.getNamePrefix());
	if (personName.getNameSuffix() != null && !personName.getNameSuffix().isEmpty())
	    nameType.getNameSuffix().addAll(personName.getNameSuffix());
	if (personName.getNameTitle() != null && personName.getNameTitle().isEmpty())
	    nameType.getNameTitle().addAll(personName.getNameTitle());
	return nameType;
    }

    /**
     * @param emailList
     * @return otaEmailList
     */
    public List<Email> getOtaEmailList(List<com.cnk.travelogix.suppliers.acco.data.Email> emailList) {
	List<Email> otaEmailList = new ArrayList<>();
	if (emailList != null && !emailList.isEmpty()) {
	    for (com.cnk.travelogix.suppliers.acco.data.Email email : emailList) {
		Email otaEmail = new Email();
		otaEmail.setValue(email.getValue());
		otaEmailList.add(otaEmail);
	    }
	}
	return otaEmailList;
    }

    /**
     * @param citizenCountryNameList
     * @return otaCitizenCountryNameList
     */
    public List<org.opentravel.ota._2003._05.CustomerType.CitizenCountryName> getOtaCitizenCountryNameList(List<CitizenCountryName> citizenCountryNameList) {
	List<org.opentravel.ota._2003._05.CustomerType.CitizenCountryName> otaCitizenCountryNameList = new ArrayList<>();
	if (citizenCountryNameList != null && !citizenCountryNameList.isEmpty()) {
	    for (CitizenCountryName citizenCountryName : citizenCountryNameList) {
		org.opentravel.ota._2003._05.CustomerType.CitizenCountryName otaCitizenCountryName = new org.opentravel.ota._2003._05.CustomerType.CitizenCountryName();
		otaCitizenCountryName.setCode(citizenCountryName.getCode());
		otaCitizenCountryNameList.add(otaCitizenCountryName);
	    }
	}
	return otaCitizenCountryNameList;
    }

    /**
     * 
     * @param personNameList
     * @return otaPersonNameType
     */
    public List<PersonNameType> getotaPersonNameType(List<PersonName> personNameList) {
	List<PersonNameType> otaPersonNameType = new ArrayList<>();
	if (personNameList != null) {
	    for (PersonName personName : personNameList) {
		PersonNameType otaPersonName = new PersonNameType();
		otaPersonName.getGivenName().addAll(personName.getGivenName());
		otaPersonName.setSurname(personName.getSurname());
		if (!personName.getMiddleName().isEmpty())
		    otaPersonName.getMiddleName().addAll(personName.getMiddleName());
		if (!personName.getNamePrefix().isEmpty())
		    otaPersonName.getNamePrefix().addAll(personName.getNamePrefix());
		if (!personName.getNameSuffix().isEmpty())
		    otaPersonName.getNameSuffix().addAll(personName.getNameSuffix());
		if (!personName.getSurnamePrefix().isEmpty())
		    otaPersonName.setSurnamePrefix(personName.getSurnamePrefix());
		if (!personName.getNameTitle().isEmpty())
		    otaPersonName.getNameTitle().addAll(personName.getNameTitle());
		otaPersonNameType.add(otaPersonName);
	    }
	}
	return otaPersonNameType;
    }

    /**
     * @param otaHotelResModifyResponseType
     * @return hotelResModifyRs
     */
    public HotelResModifyRs getHotelModifyData(org.opentravel.ota._2003._05.HotelResModifyResponseType otaHotelResModifyResponseType) {
	HotelResModifyRs hotelResModifyRs = new HotelResModifyRs();
	hotelResModifyRs.setVersion(otaHotelResModifyResponseType.getVersion());
	Object successType = otaHotelResModifyResponseType.getSuccess();
	if (successType instanceof SuccessType)
	    hotelResModifyRs.setSuccess((Success) successType);

	WarningsType warningsType = otaHotelResModifyResponseType.getWarnings();
	List<Warning> warningDataList = new ArrayList<>();
	List<WarningType> warningList = warningsType.getWarning();
	for (WarningType warningType : warningList) {
	    Warning warningData = new Warning();
	    warningData.setStatus(warningType.getStatus());
	    warningData.setType(warningType.getType());
	    warningDataList.add(warningData);
	}
	hotelResModifyRs.setWarnings(warningDataList);
	hotelResModifyRs.setErrors(getErrorsData(otaHotelResModifyResponseType.getErrors()));
	hotelResModifyRs.setHotelResModifies(getHotelResModifiesData(otaHotelResModifyResponseType));
	return hotelResModifyRs;
    }

    public HotelResModifyRs getHotelModifyData(org.opentravel.ota._2003._05.HotelResModifyResponseType otaHotelResModifyResponseType, String supplierId) {
	HotelResModifyRs hotelResModifyRs = new HotelResModifyRs();
	hotelResModifyRs.setVersion(otaHotelResModifyResponseType.getVersion());
	Object successType = otaHotelResModifyResponseType.getSuccess();
	if (successType instanceof SuccessType)
	    hotelResModifyRs.setSuccess((Success) successType);

	hotelResModifyRs.setErrors(getErrorsData(otaHotelResModifyResponseType.getErrors(), supplierId));
	WarningsType warningsType = otaHotelResModifyResponseType.getWarnings();
	List<Warning> warningDataList = new ArrayList<>();
	List<WarningType> warningList = warningsType.getWarning();
	for (WarningType warningType : warningList) {
	    Warning warningData = new Warning();
	    warningData.setStatus(warningType.getStatus());
	    warningData.setType(warningType.getType());
	    warningDataList.add(warningData);
	}
	hotelResModifyRs.setWarnings(warningDataList);
	hotelResModifyRs.setHotelResModifies(getHotelResModifiesData(otaHotelResModifyResponseType));
	return hotelResModifyRs;
    }

    /**
     * @param otaHotelResModifyResponseType
     * @return hotelResModifyType
     */
    public List<HotelReservation> getHotelResModifiesData(org.opentravel.ota._2003._05.HotelResModifyResponseType otaHotelResModifyResponseType) {
	HotelResModifyType hotelResModifyType = otaHotelResModifyResponseType.getHotelResModifies();
	List<HotelReservation> hotelReservationsDataList = new ArrayList<>();
	List<org.opentravel.ota._2003._05.HotelResModifyType.HotelResModify> hotelResModifyList = hotelResModifyType.getHotelResModify();
	for (org.opentravel.ota._2003._05.HotelResModifyType.HotelResModify hotelResModify : hotelResModifyList) {
	    HotelReservation hotelReservationData = new HotelReservation();
	    hotelReservationData.setResStatus(hotelResModify.getResStatus());
	    hotelReservationData.setCreateDateTime(getDateGregorianCalendar(hotelResModify.getCreateDateTime()));
	    List<UniqueIDType> uniqueidtypeList = hotelResModify.getUniqueID();
	    List<UniqueID> uniqueIdList = new ArrayList<>();
	    for (UniqueIDType uniqueIDType : uniqueidtypeList) {
		UniqueID uniqueID = new UniqueID();
		uniqueID.setId(uniqueIDType.getID());
		uniqueID.setType(uniqueIDType.getType());
		uniqueIdList.add(uniqueID);
	    }
	    hotelReservationData.setUniqueID(uniqueIdList);
	    hotelReservationData.setRoomStays(getromStays(hotelResModify));
	    hotelReservationData.setServices(getServicesData(hotelResModify));
	    hotelReservationData.getResGuests().addAll(getResGuestsData(hotelResModify.getResGuests()));
	    hotelReservationData.setResGlobalInfo(getResGlobalInfoData(hotelResModify));
	    hotelReservationsDataList.add(hotelReservationData);
	}
	return hotelReservationsDataList;
    }

    /**
     * @param hotelResModify
     * @return roomStayListData
     */
    public List<RoomStay> getromStays(org.opentravel.ota._2003._05.HotelResModifyType.HotelResModify hotelResModify) {
	List<RoomStay> roomStayListData = new ArrayList<>();
	RoomStaysType roomType = hotelResModify.getRoomStays();
	List<org.opentravel.ota._2003._05.RoomStaysType.RoomStay> roomStayList = roomType.getRoomStay();
	for (org.opentravel.ota._2003._05.RoomStaysType.RoomStay roomStay : roomStayList) {
	    RoomStay roomStayData = new RoomStay();
	    roomStayData.setRoomStayStatus(roomStay.getRoomStayStatus());
	    roomStayData.setIndexNumber(roomStay.getIndexNumber());
	    roomStayData.setMarketCode(roomStay.getMarketCode());
	    roomStayData.setDiscountCode(roomStay.getDiscountCode());
	    roomStayData.setRoomTypes(getRoomType(roomStay));
	    roomStayData.setBasicPropertyInfo(getBasicPropertyInfo(roomStay));
	    roomStayData.setTimeSpan(getTimeSpanData(roomStay));
	    roomStayData.setGuestCounts(getGuestCountsData(roomStay));
	    roomStayData.setComments(getCommentsData(roomStay));
	    roomStayData.setServiceRPHs(getServiceRPHsData(roomStay));
	    roomStayListData.add(roomStayData);
	}
	return roomStayListData;
    }

    /**
     * @param roomStay
     * @return roomTypeListData
     */
    public List<RoomType> getRoomType(org.opentravel.ota._2003._05.RoomStaysType.RoomStay roomStay) {
	List<RoomType> roomTypeListData = new ArrayList<>();
	RoomTypes otaRoomType = roomStay.getRoomTypes();
	List<RoomTypeType> roomTypeTypeList = otaRoomType.getRoomType();
	for (RoomTypeType roomTypeType : roomTypeTypeList) {
	    RoomType roomTypeData = new RoomType();
	    roomTypeData.setRoomID(roomTypeType.getRoomID());
	    roomTypeData.setRoomType(roomTypeType.getRoomType());
	    roomTypeData.setRoomTypeCode(roomTypeType.getRoomTypeCode());
	    roomTypeData.setRoomLocationCode(roomTypeType.getRoomLocationCode());
	    roomTypeData.setBedTypeCode(roomTypeType.getBedTypeCode());
	    roomTypeData.setNumberOfUnits(roomTypeType.getNumberOfUnits());
	    if (roomTypeType.isNonSmoking()) {
		roomTypeData.setNonSmoking(true);
	    } else {
		roomTypeData.setNonSmoking(false);
	    }
	    org.opentravel.ota._2003._05.ParagraphType pragrah = roomTypeType.getRoomDescription();
	    ParagraphType pragraphData = new ParagraphType();
	    pragraphData.setName(pragrah.getName());
	    //paragraph doesn't contain text attribute add in all
	    roomTypeData.setRoomDescription(pragraphData);
	    roomTypeData.setAdditionalDetails(getAdditionalDetailsData(roomTypeType));
	    roomTypeData.setOccupancy(getOccupancyData(roomTypeType));
	    roomTypeData.setAmenities(getAmenitiesData(roomTypeType));
	    roomTypeListData.add(roomTypeData);
	}
	return roomTypeListData;
    }

    /**
     * @param roomTypeType
     * @return additionalDetailsList
     */
    public List<AdditionalDetail> getAdditionalDetailsData(RoomTypeType roomTypeType) {
	List<AdditionalDetail> additionalDetailsList = new ArrayList<>();
	AdditionalDetailsType additinalDetails = roomTypeType.getAdditionalDetails();
	List<AdditionalDetailType> additinalDetailsList = additinalDetails.getAdditionalDetail();
	for (AdditionalDetailType additionalDetailType : additinalDetailsList) {
	    AdditionalDetail addtionalDetails = new AdditionalDetail();
	    org.opentravel.ota._2003._05.ParagraphType pragrah = additionalDetailType.getDetailDescription();
	    ParagraphType pragraphData = new ParagraphType();
	    pragraphData.setName(pragrah.getName());
	    //paragraph doesn't contain text attribute add in all
	    addtionalDetails.setDetailDescription(pragraphData);
	    addtionalDetails.setType(additionalDetailType.getType());
	    addtionalDetails.setType(additionalDetailType.getCode());
	    additionalDetailsList.add(addtionalDetails);
	}
	return additionalDetailsList;
    }

    /**
     * @param roomTypeType
     * @return occupancyListData
     */
    public List<Occupancy> getOccupancyData(RoomTypeType roomTypeType) {
	List<Occupancy> occupancyListData = new ArrayList<>();
	List<org.opentravel.ota._2003._05.RoomTypeType.Occupancy> occupancyList = roomTypeType.getOccupancy();
	for (org.opentravel.ota._2003._05.RoomTypeType.Occupancy occupancy : occupancyList) {
	    Occupancy occupancyData = new Occupancy();
	    occupancyData.setMinOccupancy(occupancy.getMinOccupancy());
	    occupancyData.setMaxOccupancy(occupancy.getMaxOccupancy());
	    occupancyData.setAgeQualifyingCode(occupancy.getAgeQualifyingCode());
	    occupancyData.setMaxAge(occupancy.getMaxAge());
	    occupancyData.setMinAge(occupancy.getMinAge());
	    occupancyListData.add(occupancyData);
	}
	return occupancyListData;
    }

    /**
     * @param getOccupency
     * @return otaOccupancyList
     */
    public List<org.opentravel.ota._2003._05.RoomTypeType.Occupancy> getOccupancyDataRoomType(List<Occupancy> getOccupency) {
	List<org.opentravel.ota._2003._05.RoomTypeType.Occupancy> otaOccupancyList = new ArrayList<>();
	if (getOccupency != null && !getOccupency.isEmpty()) {
	    for (Occupancy occupancy : getOccupency) {
		org.opentravel.ota._2003._05.RoomTypeType.Occupancy otaOccupency = new org.opentravel.ota._2003._05.RoomTypeType.Occupancy();
		otaOccupency.setAgeQualifyingCode(occupancy.getAgeQualifyingCode());
		otaOccupency.setMaxAge(occupancy.getMaxAge());
		otaOccupency.setMaxOccupancy(occupancy.getMaxOccupancy());
		otaOccupency.setMinAge(occupancy.getMinAge());
		otaOccupency.setMinOccupancy(occupancy.getMinOccupancy());
		otaOccupancyList.add(otaOccupency);
	    }
	}
	return otaOccupancyList;
    }

    /**
     * @param roomTypeType
     * @return amenityListData
     */
    public List<Amenity> getAmenitiesData(RoomTypeType roomTypeType) {
	List<Amenity> amenityListData = new ArrayList<>();
	Amenities amenities = roomTypeType.getAmenities();
	List<RoomAmenityPrefType> roomAmeityList = amenities.getAmenity();
	for (RoomAmenityPrefType roomAmenityPrefType : roomAmeityList) {
	    Amenity amenity = new Amenity();
	    amenity.setRoomAmenity(roomAmenityPrefType.getRoomAmenity());
	    amenityListData.add(amenity);
	}
	return amenityListData;
    }

    /**
     * @param roomStay
     * @return basicPropertyInfoData
     */
    public BasicPropertyInfo getBasicPropertyInfo(org.opentravel.ota._2003._05.RoomStaysType.RoomStay roomStay) {
	BasicPropertyInfo basicPropertyInfoData = new BasicPropertyInfo();
	org.opentravel.ota._2003._05.RoomStayType.BasicPropertyInfo basicPropertyInfo = roomStay.getBasicPropertyInfo();
	basicPropertyInfoData.setCurrencyCode(basicPropertyInfo.getCurrencyCode());
	basicPropertyInfoData.setHotelCode(basicPropertyInfo.getHotelCode());
	basicPropertyInfoData.setHotelSegmentCategoryCode(basicPropertyInfo.getHotelSegmentCategoryCode());
	basicPropertyInfoData.setHotelCityCode(basicPropertyInfo.getHotelCityCode());
	basicPropertyInfoData.setHotelName(basicPropertyInfo.getHotelName());
	basicPropertyInfoData.setAreaID(basicPropertyInfo.getAreaID());
	basicPropertyInfoData.setChainCode(basicPropertyInfo.getChainCode());
	basicPropertyInfoData.setChainName(basicPropertyInfo.getChainName());
	Address address = new Address();
	AddressInfoType addressType = basicPropertyInfo.getAddress();
	address.setAddressLine(addressType.getAddressLine());
	address.setCityName(addressType.getCityName());
	address.setCounty(addressType.getCounty());
	List<BldgRoom> bldgRoomList = addressType.getBldgRoom();
	List<com.cnk.travelogix.suppliers.acco.data.BldgRoom> bldgRoomListData = new ArrayList<>();
	for (BldgRoom bldgRoom : bldgRoomList) {
	    com.cnk.travelogix.suppliers.acco.data.BldgRoom bldgRommData = new com.cnk.travelogix.suppliers.acco.data.BldgRoom();
	    //no attribute to set
	    bldgRoom.getValue();
	    bldgRoomListData.add(bldgRommData);
	}
	address.setBldgRoom(bldgRoomListData);
	basicPropertyInfoData.setAddress(address);
	basicPropertyInfoData.setAward(getAwardData(basicPropertyInfo));
	return basicPropertyInfoData;
    }

    /**
     * @param basicPropertyInfo
     * @return awardListData
     */
    public List<Award> getAwardData(org.opentravel.ota._2003._05.RoomStayType.BasicPropertyInfo basicPropertyInfo) {
	List<Award> awardListData = new ArrayList<>();
	List<org.opentravel.ota._2003._05.BasicPropertyInfoType.Award> awardList = basicPropertyInfo.getAward();
	for (org.opentravel.ota._2003._05.BasicPropertyInfoType.Award award : awardList) {
	    Award awardData = new Award();
	    awardData.setProvider(award.getProvider());
	    awardData.setRating(award.getRating());
	    awardList.add(award);
	}
	return awardListData;
    }

    /**
     * @param roomStay
     * @return dateTimeSpan
     */
    public com.cnk.travelogix.suppliers.acco.data.DateTimeSpanType getTimeSpanData(org.opentravel.ota._2003._05.RoomStaysType.RoomStay roomStay) {
	com.cnk.travelogix.suppliers.acco.data.DateTimeSpanType dateTimeSpan = new com.cnk.travelogix.suppliers.acco.data.DateTimeSpanType();
	DateTimeSpanType dateTime = roomStay.getTimeSpan();
	dateTimeSpan.setEnd(dateTime.getEnd());
	dateTimeSpan.setStart(dateTime.getStart());
	return dateTimeSpan;
    }

    /**
     * @param roomStay
     * @return guestCountType
     */
    public com.cnk.travelogix.suppliers.acco.data.GuestCountType getGuestCountsData(org.opentravel.ota._2003._05.RoomStaysType.RoomStay roomStay) {
	com.cnk.travelogix.suppliers.acco.data.GuestCountType guestCountType = new com.cnk.travelogix.suppliers.acco.data.GuestCountType();
	List<GuestCount> guestCountListData = new ArrayList<>();
	org.opentravel.ota._2003._05.GuestCountType guestCount = roomStay.getGuestCounts();
	guestCountType.setIsPerRoom(guestCount.isIsPerRoom());
	List<org.opentravel.ota._2003._05.GuestCountType.GuestCount> guestCountList = guestCount.getGuestCount();
	for (org.opentravel.ota._2003._05.GuestCountType.GuestCount guestCountobj : guestCountList) {
	    GuestCount guestCountData = new GuestCount();
	    guestCountData.setAge(guestCountobj.getAge());
	    guestCountData.setAgeBucket(guestCountobj.getAgeBucket());
	    guestCountData.setAgeQualifyingCode(guestCountobj.getAgeQualifyingCode());
	    guestCountData.setCount(guestCountobj.getCount());
	    guestCountListData.add(guestCountData);
	}
	guestCountType.setGuestCount(guestCountListData);
	return guestCountType;
    }

    /**
     * @param roomStay
     * @return commentsData
     */
    public Comments getCommentsData(org.opentravel.ota._2003._05.RoomStaysType.RoomStay roomStay) {
	Comments commentsData = new Comments();
	List<ParagraphType> pragraphListData = commentsData.getComment();
	CommentType commentType = roomStay.getComments();
	//org.opentravel.ota._2003._05.CommentType.Comment
	List<Comment> commentList = commentType.getComment();
	for (Comment comment : commentList) {
	    ParagraphType paragraphData = new ParagraphType();
	    paragraphData.setName(comment.getName());
	    pragraphListData.add(paragraphData);
	    //paragraph doesn't contain text attribute add in all
	}
	commentsData.setComment(pragraphListData);
	return commentsData;
    }

    /**
     * @param roomStay
     * @return serviceRphsListData
     */
    public List<ServiceRPHs> getServiceRPHsData(org.opentravel.ota._2003._05.RoomStaysType.RoomStay roomStay) {
	List<ServiceRPHs> serviceRphsListData = new ArrayList<>();
	ServiceRPHsType serviceRphstype = roomStay.getServiceRPHs();
	List<ServiceRPH> serviceRphsList = serviceRphstype.getServiceRPH();
	for (ServiceRPH serviceRPH : serviceRphsList) {
	    ServiceRPHs serviceRphsData = new ServiceRPHs();
	    serviceRphsData.setRph(serviceRPH.getRPH());
	    serviceRphsListData.add(serviceRphsData);
	}
	return serviceRphsListData;
    }

    /**
     * @param hotelResModify
     * @return serviceTypeListData
     */
    public List<ServiceType> getServicesData(org.opentravel.ota._2003._05.HotelResModifyType.HotelResModify hotelResModify) {
	List<ServiceType> serviceTypeListData = new ArrayList<>();
	ServicesType services = hotelResModify.getServices();
	List<org.opentravel.ota._2003._05.ServiceType> servicesList = services.getService();
	for (org.opentravel.ota._2003._05.ServiceType serviceType : servicesList) {
	    ServiceType serviceTypeData = new ServiceType();
	    serviceTypeData.setId(serviceType.getID());
	    serviceTypeData.setType(serviceType.getType());
	    serviceTypeListData.add(serviceTypeData);
	}
	return serviceTypeListData;
    }

    /**
     * @param resGuestsType
     * @return resGuestListData
     */
    public List<ResGuest> getResGuestsData(ResGuestsType resGuestsType) {
	List<ResGuest> resGuestListData = new ArrayList<>();
	List<ResGuestType> resGuestTypeList = resGuestsType.getResGuest();
	for (ResGuestType resGuestType : resGuestTypeList) {
	    ResGuest resGuestData = new ResGuest();
	    resGuestData.setResGuestRPH(resGuestType.getResGuestRPH());
	    resGuestData.setAgeQualifyingCode(resGuestType.getAgeQualifyingCode());
	    if (resGuestType.isPrimaryIndicator()) {
		resGuestData.setPrimaryIndicator(true);
	    } else {
		resGuestData.setPrimaryIndicator(false);
	    }
	    ProfilesType profilesType = resGuestType.getProfiles();
	    List<ProfileInfo> profileInfoListData = new ArrayList<>();
	    List<org.opentravel.ota._2003._05.ProfilesType.ProfileInfo> profileInfoList = profilesType.getProfileInfo();
	    for (org.opentravel.ota._2003._05.ProfilesType.ProfileInfo profileInfo : profileInfoList) {
		ProfileInfo profileInfoData = new ProfileInfo();
		Profile profile = new Profile();
		ProfileType profileType = profileInfo.getProfile();
		profile.setRph(profileType.getRPH());
		CustomerType customerTypeData = new CustomerType();
		org.opentravel.ota._2003._05.CustomerType customerType = profileType.getCustomer();
		List<PersonName> personNameListData = new ArrayList<>();
		List<PersonNameType> personNameList = customerType.getPersonName();
		for (PersonNameType personNameType : personNameList) {
		    PersonName personNameData = new PersonName();
		    personNameData.setGivenName(personNameType.getGivenName());
		    personNameData.setNamePrefix(personNameType.getNamePrefix());
		    personNameData.setSurname(personNameType.getSurname());
		    personNameData.setMiddleName(personNameType.getMiddleName());
		    personNameData.setNameSuffix(personNameType.getNameSuffix());
		    personNameData.setNameTitle(personNameType.getNameTitle());
		    personNameData.setSurnamePrefix(personNameType.getSurnamePrefix());
		    personNameListData.add(personNameData);
		}
		customerTypeData.setPersonName(personNameListData);
		List<CitizenCountryName> citizenCountryNameListData = new ArrayList<>();
		List<org.opentravel.ota._2003._05.CustomerType.CitizenCountryName> citizenCountryNameList = customerType.getCitizenCountryName();
		for (org.opentravel.ota._2003._05.CustomerType.CitizenCountryName citizenCountryName : citizenCountryNameList) {
		    CitizenCountryName citizenCountryNameData = new CitizenCountryName();
		    citizenCountryNameData.setCode(citizenCountryName.getCode());
		    citizenCountryNameListData.add(citizenCountryNameData);
		}
		customerTypeData.setCitizenCountryName(citizenCountryNameListData);
		profile.setCustomer(customerTypeData);
		profileInfoData.setProfile(profile);
		profileInfoListData.add(profileInfoData);
	    }
	    resGuestData.setProfiles(profileInfoListData);
	    resGuestListData.add(resGuestData);
	}
	return resGuestListData;
    }

    /**
     * @param hotelResModify
     * @return resGlobalInfoData
     */
    public com.cnk.travelogix.suppliers.acco.data.ResGlobalInfo getResGlobalInfoData(org.opentravel.ota._2003._05.HotelResModifyType.HotelResModify hotelResModify) {
	com.cnk.travelogix.suppliers.acco.data.ResGlobalInfo resGlobalInfoData = new com.cnk.travelogix.suppliers.acco.data.ResGlobalInfo();
	DepositPayments depositPayments = new DepositPayments();
	ResGlobalInfo resGlobalInfo = hotelResModify.getResGlobalInfo();
	RequiredPaymentsType reqPaymenttype = resGlobalInfo.getDepositPayments();

	List<GuaranteePayment> guaranteepaymentlist = reqPaymenttype.getGuaranteePayment();
	List<com.cnk.travelogix.suppliers.acco.data.GuaranteePayment> guaranteePaymentListData = new ArrayList<>();
	for (GuaranteePayment guaranteePayment : guaranteepaymentlist) {
	    com.cnk.travelogix.suppliers.acco.data.GuaranteePayment guaranteePaymentData = new com.cnk.travelogix.suppliers.acco.data.GuaranteePayment();
	    List<com.cnk.travelogix.suppliers.acco.data.AcceptedPayment> acceptedPaymentsDataList = new ArrayList<>();
	    AcceptedPaymentsType acceptedPayments = guaranteePayment.getAcceptedPayments();
	    List<AcceptedPayment> acceptedPaymentList = acceptedPayments.getAcceptedPayment();
	    for (AcceptedPayment acceptedPayment : acceptedPaymentList) {
		com.cnk.travelogix.suppliers.acco.data.AcceptedPayment acceptedPaymentData = new com.cnk.travelogix.suppliers.acco.data.AcceptedPayment();
		PaymentCard paymentCardData = new PaymentCard();
		PaymentCardType paymentcard = acceptedPayment.getPaymentCard();
		paymentCardData.setExpireDate(paymentcard.getExpireDate());
		CardType cardtype = new CardType();
		ListPaymentCardIssuer listPaymentCardIssue = paymentcard.getCardType();
		cardtype.setCode(listPaymentCardIssue.getCode());
		cardtype.setValue(listPaymentCardIssue.getValue());
		paymentCardData.setCardType(cardtype);
		paymentCardData.setCardHolderName(paymentcard.getCardHolderName());

		EncryptionType encTypeData = new EncryptionType();
		EncryptionTokenType encTokentype = paymentcard.getCardNumber();
		encTypeData.setPlainText(encTokentype.getPlainText());
		paymentCardData.setCardNumber(encTypeData);
		com.cnk.travelogix.suppliers.acco.data.ThreeDomainSecurity threeDomainSecurityData = new com.cnk.travelogix.suppliers.acco.data.ThreeDomainSecurity();
		ThreeDomainSecurity threeDomailSecurity = paymentcard.getThreeDomainSecurity();
		Results result = threeDomailSecurity.getResults();
		com.cnk.travelogix.suppliers.acco.data.Results resultsData = new com.cnk.travelogix.suppliers.acco.data.Results();
		resultsData.setCavv(result.getCAVV());
		threeDomainSecurityData.setResults(resultsData);
		paymentCardData.setThreeDomainSecurity(threeDomainSecurityData);
		acceptedPaymentData.setPaymentCard(paymentCardData);
		acceptedPaymentList.add(acceptedPayment);
	    }
	    guaranteePaymentData.setAcceptedPayments(acceptedPaymentsDataList);
	    guaranteePaymentListData.add(guaranteePaymentData);
	}
	depositPayments.setGuaranteePayment(guaranteePaymentListData);
	resGlobalInfoData.setDepositPayments(depositPayments);
	Total total = new Total();
	TotalType totalType = resGlobalInfo.getTotal();
	total.setAmountAfterTax(totalType.getAmountAfterTax());
	total.setCurrencyCode(totalType.getCurrencyCode());
	total.setType(totalType.getType());
	resGlobalInfoData.setTotal(total);
	Commission commitionTypeData = new Commission();
	CommissionType commmitionType = resGlobalInfo.getTotalCommissions();
	com.cnk.travelogix.suppliers.acco.data.CommissionableAmount commissionableAmountData = new com.cnk.travelogix.suppliers.acco.data.CommissionableAmount();
	CommissionableAmount commission = commmitionType.getCommissionableAmount();
	commissionableAmountData.setAmount(commission.getAmount());
	commissionableAmountData.setCurrencyCode(commission.getCurrencyCode());
	commitionTypeData.setCommissionableAmount(commissionableAmountData);
	resGlobalInfoData.setTotalCommissions(commitionTypeData);
	return resGlobalInfoData;
    }

    protected List<RoomStay> getRoomStayData(OTAHotelAvailRS otaHotelAvailRS) {
	List<com.cnk.travelogix.suppliers.acco.data.RoomStay> roomStaysData = new ArrayList<>();
	if (otaHotelAvailRS.getRoomStays() != null) {
	    List<org.opentravel.ota._2003._05.OTAHotelAvailRS.RoomStays.RoomStay> otaroomStay = otaHotelAvailRS.getRoomStays().getRoomStay();
	    for (org.opentravel.ota._2003._05.OTAHotelAvailRS.RoomStays.RoomStay roomStay : otaroomStay) {
		com.cnk.travelogix.suppliers.acco.data.RoomStay roomStayData = new com.cnk.travelogix.suppliers.acco.data.RoomStay();
		roomStayData.setRph(roomStay.getRPH());
		roomStayData.setMarketCode(roomStay.getMarketCode());
		populateRoomAvailableRoomStayData(roomStay, roomStayData);

		List<com.cnk.travelogix.suppliers.acco.data.RoomRate> roomRates = new ArrayList<>();
		List<RoomRate> roomRateData = setRoomRateData(roomStay);
		roomRates.addAll(roomRateData);
		roomStayData.setRoomRates(roomRates);
		com.cnk.travelogix.suppliers.acco.data.BasicPropertyInfo basicPropertyInfoData = setBasicPropertyInfoData(roomStay);
		roomStayData.setBasicPropertyInfo(basicPropertyInfoData);
		DateTimeSpanType dateTimeSpanType = roomStay.getTimeSpan();
		com.cnk.travelogix.suppliers.acco.data.DateTimeSpanType dateTimeSpanTypeData = new com.cnk.travelogix.suppliers.acco.data.DateTimeSpanType();
		dateTimeSpanTypeData.setEnd(dateTimeSpanType.getEnd());
		dateTimeSpanTypeData.setStart(dateTimeSpanType.getStart());
		roomStayData.setTimeSpan(dateTimeSpanTypeData);
		final TPAExtensionsType tpaExtensions = roomStay.getTPAExtensions();
		TPAExtensions tpaExtensionsData = setTPAExtension(tpaExtensions);
		roomStayData.setTpaExtensions(tpaExtensionsData);
		roomStaysData.add(roomStayData);
	    }
	}
	return roomStaysData;
    }

    protected void populateRoomAvailableRoomStayData(org.opentravel.ota._2003._05.OTAHotelAvailRS.RoomStays.RoomStay roomStay, RoomStay roomStayData) {

	roomStayData.setAvailabilityStatus(roomStayData.getAvailabilityStatus());

	List<RoomType> roomTypes = new ArrayList<>();
	List<RoomType> roomTypeData = setRoomTypeData(roomStay);
	roomTypes.addAll(roomTypeData);
	roomStayData.setRoomTypes(roomTypes);

	List<RatePlans> ratePlans = new ArrayList<>();
	List<RatePlans> rateplansData = setRatePlans(roomStay);
	ratePlans.addAll(rateplansData);
	roomStayData.setRatePlans(ratePlans);

	com.cnk.travelogix.suppliers.acco.data.Total totalData = getTotalData(roomStay.getTotal());
	roomStayData.setTotal(totalData);

    }

    public RoomStayCandidateType setRoomStayCandidate(com.cnk.travelogix.suppliers.acco.data.Criterion criterion) {
	RoomStayCandidateType roomStayCandidateType = new RoomStayCandidateType();
	List<com.cnk.travelogix.suppliers.acco.data.RoomStayCandidate> candidatesData = criterion.getRoomStayCandidates();
	for (com.cnk.travelogix.suppliers.acco.data.RoomStayCandidate roomStayCandidate : candidatesData) {
	    GuestCountType guestCountType = new GuestCountType();
	    com.cnk.travelogix.suppliers.acco.data.GuestCountType guestCountData = roomStayCandidate.getGuestCounts();
	    if (guestCountData.getIsPerRoom() != null)
		guestCountType.setIsPerRoom(guestCountData.getIsPerRoom());

	    List<com.cnk.travelogix.suppliers.acco.data.GuestCount> guestCountTypeData = guestCountData.getGuestCount();
	    for (com.cnk.travelogix.suppliers.acco.data.GuestCount guestCountsData : guestCountTypeData) {
		org.opentravel.ota._2003._05.GuestCountType.GuestCount guestCount = new org.opentravel.ota._2003._05.GuestCountType.GuestCount();
		guestCount.setAgeQualifyingCode(guestCountsData.getAgeQualifyingCode());
		guestCount.setAge(guestCountsData.getAge());
		guestCount.setCount(guestCountsData.getCount());
		guestCountType.getGuestCount().add(guestCount);
	    }
	    roomStayCandidateType.setGuestCounts(guestCountType);

	}
	return roomStayCandidateType;
    }

    protected List<Warning> getRetreiveBookingWarning(WarningsType warningsType) {
	List<Warning> warningDataList = new ArrayList<>();
	if (warningsType != null) {
	    List<WarningType> warningTypes = warningsType.getWarning();
	    for (WarningType warningType : warningTypes) {
		Warning warningData = new Warning();
		warningData.setShortText(warningType.getShortText());
		warningData.setStatus(warningType.getStatus());
		warningData.setType(warningType.getType());
		warningDataList.add(warningData);
	    }
	}
	return warningDataList;
    }

    protected List<RoomStay> getRetrieveBookingRoomStayData(HotelReservationType otaHotelReservationRS) {

	List<com.cnk.travelogix.suppliers.acco.data.RoomStay> roomStayDataList = new ArrayList<>();
	RoomStaysType roomStayType = otaHotelReservationRS.getRoomStays();
	List<org.opentravel.ota._2003._05.RoomStaysType.RoomStay> otaroomStay = roomStayType.getRoomStay();
	for (org.opentravel.ota._2003._05.RoomStaysType.RoomStay roomStay : otaroomStay) {
	    com.cnk.travelogix.suppliers.acco.data.RoomStay roomStayData = new com.cnk.travelogix.suppliers.acco.data.RoomStay();
	    roomStayData.setMarketCode(roomStay.getMarketCode());
	    roomStayData.setRoomStayStatus(roomStay.getRoomStayStatus());
	    roomStayData.setIndexNumber(roomStay.getIndexNumber());
	    roomStayData.setDiscountCode(roomStay.getDiscountCode());
	    //no attributes RateIndicator
	    List<RoomType> roomTypes = new ArrayList<>();
	    List<RoomType> roomTypeData = setRetrieveBookingRoomTypeData(roomStay);
	    roomTypes.addAll(roomTypeData);
	    roomStayData.setRoomTypes(roomTypes);
	    List<RatePlans> ratePlans = new ArrayList<>();
	    List<RatePlans> rateplansData = setRetrieveBookingRatePlans(roomStay);
	    ratePlans.addAll(rateplansData);
	    roomStayData.setRatePlans(ratePlans);
	    com.cnk.travelogix.suppliers.acco.data.Total totalData = getTotalData(roomStay.getTotal());
	    roomStayData.setTotal(totalData);
	    List<com.cnk.travelogix.suppliers.acco.data.RoomRate> roomRates = new ArrayList<>();
	    List<RoomRate> roomRateData = setRetrieveBookingRoomRateData(roomStay);
	    roomRates.addAll(roomRateData);
	    roomStayData.setRoomRates(roomRates);
	    com.cnk.travelogix.suppliers.acco.data.BasicPropertyInfo basicPropertyInfoData = setBookingBasicPropertyInfoData(roomStay);
	    roomStayData.setBasicPropertyInfo(basicPropertyInfoData);
	    DateTimeSpanType dateTimeSpanType = roomStay.getTimeSpan();
	    com.cnk.travelogix.suppliers.acco.data.DateTimeSpanType dateTimeSpanTypeData = new com.cnk.travelogix.suppliers.acco.data.DateTimeSpanType();
	    dateTimeSpanTypeData.setEnd(dateTimeSpanType.getEnd());
	    dateTimeSpanTypeData.setStart(dateTimeSpanType.getStart());
	    roomStayData.setTimeSpan(dateTimeSpanTypeData);
	    com.cnk.travelogix.suppliers.acco.data.GuestCountType guestCountType = new com.cnk.travelogix.suppliers.acco.data.GuestCountType();
	    List<com.cnk.travelogix.suppliers.acco.data.GuestCount> guestCounts = new ArrayList<>();
	    List<GuestCount> roomStayGuestData = getRetrieveBookingRoomRate(roomStay);
	    guestCounts.addAll(roomStayGuestData);
	    guestCountType.setGuestCount(guestCounts);
	    roomStayData.setGuestCounts(guestCountType);
	    CommentType comments = roomStay.getComments();
	    List<Comment> commentsList = comments.getComment();
	    com.cnk.travelogix.suppliers.acco.data.Comments commentsData = new com.cnk.travelogix.suppliers.acco.data.Comments();
	    for (Comment comment : commentsList) {
		List<com.cnk.travelogix.suppliers.acco.data.ParagraphType> paragraphTypesData = new ArrayList<>();
		com.cnk.travelogix.suppliers.acco.data.ParagraphType paragraphTypeData = new com.cnk.travelogix.suppliers.acco.data.ParagraphType();
		paragraphTypeData.setName(comment.getName());
		paragraphTypesData.add(paragraphTypeData);
		commentsData.setComment(paragraphTypesData);
	    }
	    roomStayData.setComments(commentsData);
	    ServiceRPHsType serviceRPHsType = roomStay.getServiceRPHs();
	    List<ServiceRPH> serviceRPHs = serviceRPHsType.getServiceRPH();
	    List<ServiceRPHs> serviceRPHsData = new ArrayList<>();
	    ServiceRPHs serviceRPHData = new ServiceRPHs();
	    for (ServiceRPH serviceRPH : serviceRPHs) {
		serviceRPHData.setRph(serviceRPH.getRPH());
		serviceRPHData.setIsPerRoom(serviceRPH.isIsPerRoom());
	    }
	    serviceRPHsData.add(serviceRPHData);
	    roomStayData.setServiceRPHs(serviceRPHsData);
	    roomStayDataList.add(roomStayData);
	}
	return roomStayDataList;
    }

    public List<RoomType> setRetrieveBookingRoomTypeData(org.opentravel.ota._2003._05.RoomStaysType.RoomStay roomStay) {
	List<RoomType> roomTypeListData = new ArrayList<>();
	RoomTypes roomTypes = roomStay.getRoomTypes();
	List<RoomTypeType> otaRoomType = roomTypes.getRoomType();
	for (RoomTypeType roomTypeType : otaRoomType) {

	    RoomType roomTypeData = populateRoomTypeData(roomTypeType);

	    List<com.cnk.travelogix.suppliers.acco.data.Occupancy> occupancies = new ArrayList<>();
	    List<Occupancy> occupancyData = getOccupancyData(roomTypeType);
	    occupancies.addAll(occupancyData);
	    roomTypeData.setOccupancy(occupancies);
	    com.cnk.travelogix.suppliers.acco.data.ParagraphType roomDescriptionParagraphType = getParagraphTypeData(roomTypeType);
	    roomTypeData.setRoomDescription(roomDescriptionParagraphType);
	    roomTypeListData.add(roomTypeData);
	}

	return roomTypeListData;
    }

    protected RoomType populateRoomTypeData(RoomTypeType roomTypeType) {
	RoomType roomTypeData = new RoomType();
	roomTypeData.setBedTypeCode(roomTypeType.getBedTypeCode());
	roomTypeData.setNonSmoking(roomTypeType.isNonSmoking());
	roomTypeData.setNumberOfUnits(roomTypeType.getNumberOfUnits());
	roomTypeData.setRoomID(roomTypeType.getRoomID());
	roomTypeData.setRoomLocationCode(roomTypeType.getRoomLocationCode());
	roomTypeData.setRoomType(roomTypeType.getRoomType());
	roomTypeData.setRoomTypeCode(roomTypeType.getRoomTypeCode());
	roomTypeData.setQuantity(roomTypeType.getQuantity());
	List<AdditionalDetail> additionalDetails = new ArrayList<>();
	List<AdditionalDetail> additionalDetailsData = getAdditionalDetailData(roomTypeType);
	additionalDetails.addAll(additionalDetailsData);
	roomTypeData.setAdditionalDetails(additionalDetails);
	List<Amenity> amenities = new ArrayList<>();
	Amenity amenityData = getAmenityData(roomTypeType);
	amenities.add(amenityData);
	roomTypeData.setAmenities(amenities);
	return roomTypeData;
    }

    protected com.cnk.travelogix.suppliers.acco.data.ParagraphType getParagraphTypeData(RoomTypeType roomTypeType) {
	com.cnk.travelogix.suppliers.acco.data.ParagraphType paragraphType = new com.cnk.travelogix.suppliers.acco.data.ParagraphType();
	org.opentravel.ota._2003._05.ParagraphType roomDescriptionParagraphType = roomTypeType.getRoomDescription();
	if (roomDescriptionParagraphType != null) {
	    paragraphType.setName(roomDescriptionParagraphType.getName());
	}
	return paragraphType;
    }

    protected Amenity getAmenityData(RoomTypeType roomTypeType) {
	Amenity amenityData = new Amenity();
	if (roomTypeType.getAmenities() != null) {
	    List<RoomAmenityPrefType> amenities = roomTypeType.getAmenities().getAmenity();
	    for (RoomAmenityPrefType roomAmenityPrefType : amenities) {
		amenityData.setRoomAmenity(roomAmenityPrefType.getRoomAmenity());
		amenityData.setQualityLevel(roomAmenityPrefType.getQualityLevel());
		amenityData.setQuantity(roomAmenityPrefType.getQuantity());
	    }
	}
	return amenityData;
    }

    protected List<RoomRate> setRetrieveBookingRoomRateData(org.opentravel.ota._2003._05.RoomStaysType.RoomStay roomStay) {
	List<com.cnk.travelogix.suppliers.acco.data.RoomRate> roomRatesList = new ArrayList<>();

	if (roomStay.getRoomRates() != null) {
	    List<org.opentravel.ota._2003._05.RoomStayType.RoomRates.RoomRate> roomRates = roomStay.getRoomRates().getRoomRate();
	    for (org.opentravel.ota._2003._05.RoomStayType.RoomRates.RoomRate roomRate : roomRates) {
		com.cnk.travelogix.suppliers.acco.data.RoomRate roomRateData = populateRoomRateDataResponse(roomRate);
		roomRatesList.add(roomRateData);
	    }
	}
	return roomRatesList;
    }

    private RoomRate populateRoomRateDataResponse(org.opentravel.ota._2003._05.RoomStayType.RoomRates.RoomRate roomRate) {
	com.cnk.travelogix.suppliers.acco.data.RoomRate roomRateData = new com.cnk.travelogix.suppliers.acco.data.RoomRate();
	roomRateData.setBookingCode(roomRate.getBookingCode());
	roomRateData.setNumberOfUnits(roomRate.getNumberOfUnits());
	roomRateData.setRatePlanCode(roomRate.getRatePlanCode());
	roomRateData.setRatePlanID(roomRate.getRatePlanID());
	roomRateData.setRatePlanQualifier(roomRate.isRatePlanQualifier());
	roomRateData.setRatePlanType(roomRate.getRatePlanType());
	roomRateData.setRoomID(roomRate.getRoomID());
	roomRateData.setRoomTypeCode(roomRate.getRoomTypeCode());
	roomRateData.setEffectiveDate(getDateGregorianCalendar(roomRate.getEffectiveDate()));
	roomRateData.setExpireDate(getDateGregorianCalendar(roomRate.getExpireDate()));
	com.cnk.travelogix.suppliers.acco.data.Total roomTotalData = setTotalData(roomRate.getTotal());
	roomRateData.setTotal(roomTotalData);
	List<com.cnk.travelogix.suppliers.acco.data.Rate> rates = new ArrayList<>();
	List<Rate> rateData = setRoomRate(roomRate);
	rates.addAll(rateData);
	roomRateData.setRates(rates);
	return roomRateData;
    }

    protected List<Rate> setRoomRate(org.opentravel.ota._2003._05.RoomStayType.RoomRates.RoomRate roomRate) {
	List<com.cnk.travelogix.suppliers.acco.data.Rate> rates = new ArrayList<>();
	if (roomRate.getRates() != null) {
	    List<org.opentravel.ota._2003._05.RateType.Rate> otaRate = roomRate.getRates().getRate();
	    for (org.opentravel.ota._2003._05.RateType.Rate rate : otaRate) {
		com.cnk.travelogix.suppliers.acco.data.Rate rateData = new com.cnk.travelogix.suppliers.acco.data.Rate();
		rateData.setEffectiveDate(getDateGregorianCalendar(rate.getEffectiveDate()));
		rateData.setExpireDate(getDateGregorianCalendar(rate.getExpireDate()));
		com.cnk.travelogix.suppliers.acco.data.ParagraphType paragraphTypesData = new com.cnk.travelogix.suppliers.acco.data.ParagraphType();
		org.opentravel.ota._2003._05.ParagraphType rateParagraphType = rate.getRateDescription();
		if (rateParagraphType != null)
		    paragraphTypesData.setName(rateParagraphType.getName());

		rateData.setRateDescription(paragraphTypesData);
		com.cnk.travelogix.suppliers.acco.data.Total roomTotalData = getTotalData(rate.getBase());
		rateData.setBase(roomTotalData);
		Total baseRateTotal = setTotalData(rate.getTotal());
		rateData.setTotal(baseRateTotal);
		List<com.cnk.travelogix.suppliers.acco.data.Discount> discounts = new ArrayList<>();
		com.cnk.travelogix.suppliers.acco.data.Discount rateDiscountData = getRateDiscountData(rate);
		discounts.add(rateDiscountData);
		rateData.setDiscount(discounts);
		rates.add(rateData);
	    }
	}
	return rates;
    }

    private com.cnk.travelogix.suppliers.acco.data.Discount getRateDiscountData(org.opentravel.ota._2003._05.RateType.Rate rate) {
	com.cnk.travelogix.suppliers.acco.data.Discount rateDiscountData = new com.cnk.travelogix.suppliers.acco.data.Discount();
	List<org.opentravel.ota._2003._05.AmountType.Discount> rateDiscount = rate.getDiscount();
	for (org.opentravel.ota._2003._05.AmountType.Discount discount : rateDiscount) {
	    rateDiscountData.setAmountBeforeTax(discount.getAmountBeforeTax());
	    rateDiscountData.setAppliesTo(discount.getAppliesTo());
	    com.cnk.travelogix.suppliers.acco.data.ParagraphType rateParagraphTypesData = new com.cnk.travelogix.suppliers.acco.data.ParagraphType();
	    org.opentravel.ota._2003._05.ParagraphType otaRateParagraphType = discount.getDiscountReason();
	    rateParagraphTypesData.setName(otaRateParagraphType.getName());
	    rateDiscountData.setDiscountReason(rateParagraphTypesData);
	}
	return rateDiscountData;
    }

    protected List<RatePlans> setRetrieveBookingRatePlans(org.opentravel.ota._2003._05.RoomStaysType.RoomStay roomStay) {
	List<RatePlans> rateplansListData = new ArrayList<>();
	if (roomStay.getRatePlans() != null) {
	    List<RatePlanType> otaRatePlan = roomStay.getRatePlans().getRatePlan();
	    for (RatePlanType ratePlanType : otaRatePlan) {
		RatePlans rateplansData = populateRatePlansData(ratePlanType);
		rateplansListData.add(rateplansData);
	    }
	}
	return rateplansListData;
    }

    protected RatePlanInclusions getRatePlanInclusionsData(RatePlanType ratePlanType) {
	RatePlanInclusions ratePlanInclusions = new RatePlanInclusions();
	RatePlanInclusionsType ratePlanInclusionsParagraphType = ratePlanType.getRatePlanInclusions();
	if (ratePlanInclusionsParagraphType != null) {
	    org.opentravel.ota._2003._05.ParagraphType ratePlanInclParagraphType = ratePlanInclusionsParagraphType.getRatePlanInclusionDesciption();
	    com.cnk.travelogix.suppliers.acco.data.ParagraphType ratePlanInclParagraphTypeData = new com.cnk.travelogix.suppliers.acco.data.ParagraphType();
	    ratePlanInclParagraphTypeData.setName(ratePlanInclParagraphType.getName());
	    ratePlanInclusions.setRatePlanInclusionDesciption(ratePlanInclParagraphTypeData);
	}
	return ratePlanInclusions;
    }

    protected com.cnk.travelogix.suppliers.acco.data.MealsIncluded getMealsIncludedData(RatePlanType ratePlanType) {
	org.opentravel.ota._2003._05.RatePlanType.MealsIncluded mealsIncluded = ratePlanType.getMealsIncluded();
	com.cnk.travelogix.suppliers.acco.data.MealsIncluded mealsIncludedData = null;
	if (mealsIncluded != null) {
	    mealsIncludedData = new com.cnk.travelogix.suppliers.acco.data.MealsIncluded();
	    mealsIncludedData.setBreakfast(mealsIncluded.isBreakfast());
	    mealsIncludedData.setDinner(mealsIncluded.isDinner());
	    mealsIncludedData.setLunch(mealsIncluded.isLunch());
	    mealsIncludedData.setMealPlanIndicator(mealsIncluded.isMealPlanIndicator());
	    mealsIncludedData.setMealPlanCodes(mealsIncluded.getMealPlanCodes());
	}
	return mealsIncludedData;
    }

    protected com.cnk.travelogix.suppliers.acco.data.BasicPropertyInfo setBookingBasicPropertyInfoData(org.opentravel.ota._2003._05.RoomStaysType.RoomStay roomStay) {
	com.cnk.travelogix.suppliers.acco.data.BasicPropertyInfo basicPropertyInfoData;

	org.opentravel.ota._2003._05.RoomStayType.BasicPropertyInfo basicPropertyInfo = roomStay.getBasicPropertyInfo();
	basicPropertyInfoData = populateBasicPropertyInfo(basicPropertyInfo);

	if (basicPropertyInfo != null) {
	    AddressInfoType address = basicPropertyInfo.getAddress();
	    com.cnk.travelogix.suppliers.acco.data.Address addressData = new com.cnk.travelogix.suppliers.acco.data.Address();
	    if (address != null) {
		addressData.setAddressLine(address.getAddressLine());
		addressData.setCityName(address.getCityName());
		addressData.setCounty(address.getCounty());
		//bldgRoom no attrinutes
	    }
	    basicPropertyInfoData.setAddress(addressData);
	    List<org.opentravel.ota._2003._05.BasicPropertyInfoType.Award> award = basicPropertyInfo.getAward();
	    com.cnk.travelogix.suppliers.acco.data.Award awardData = new com.cnk.travelogix.suppliers.acco.data.Award();
	    for (org.opentravel.ota._2003._05.BasicPropertyInfoType.Award otaaward : award) {
		awardData.setProvider(otaaward.getProvider());
		awardData.setRating(otaaward.getRating());
	    }
	    basicPropertyInfoData.getAward().add(awardData);
	}
	return basicPropertyInfoData;
    }

    private List<GuestCount> getRetrieveBookingRoomRate(org.opentravel.ota._2003._05.RoomStaysType.RoomStay roomStay) {
	List<com.cnk.travelogix.suppliers.acco.data.GuestCount> guestCountsData = new ArrayList<>();
	if (roomStay.getGuestCounts() != null) {
	    List<org.opentravel.ota._2003._05.GuestCountType.GuestCount> otaGuestCountType = roomStay.getGuestCounts().getGuestCount();
	    for (org.opentravel.ota._2003._05.GuestCountType.GuestCount guestCount : otaGuestCountType) {
		com.cnk.travelogix.suppliers.acco.data.GuestCount roomRateGuestData = new com.cnk.travelogix.suppliers.acco.data.GuestCount();
		roomRateGuestData.setAge(guestCount.getAge());
		roomRateGuestData.setAgeBucket(guestCount.getAgeBucket());
		roomRateGuestData.setAgeQualifyingCode(guestCount.getAgeQualifyingCode());
		roomRateGuestData.setCount(guestCount.getCount());
		guestCountsData.add(roomRateGuestData);
	    }
	}
	return guestCountsData;
    }

    protected List<AdditionalDetail> getAdditionalDetailData(RoomTypeType roomTypeType) {
	List<AdditionalDetail> additionalDetails = new ArrayList<>();
	if (roomTypeType.getAdditionalDetails() != null) {
	    List<AdditionalDetailType> additionalDetailsType = roomTypeType.getAdditionalDetails().getAdditionalDetail();
	    for (AdditionalDetailType additionalDetailType : additionalDetailsType) {
		com.cnk.travelogix.suppliers.acco.data.AdditionalDetail additionalDetailsData = new com.cnk.travelogix.suppliers.acco.data.AdditionalDetail();
		additionalDetailsData.setCode(additionalDetailType.getCode());
		additionalDetailsData.setType(additionalDetailType.getType());
		org.opentravel.ota._2003._05.ParagraphType additionalDetailParagraphType = additionalDetailType.getDetailDescription();
		com.cnk.travelogix.suppliers.acco.data.ParagraphType additionalDetailParagraphTypeData = new com.cnk.travelogix.suppliers.acco.data.ParagraphType();
		additionalDetailParagraphTypeData.setName(additionalDetailParagraphType.getName());
		additionalDetailsData.setDetailDescription(additionalDetailParagraphTypeData);
		additionalDetails.add(additionalDetailsData);
	    }
	}
	return additionalDetails;
    }

    protected Total setTotalData(TotalType totalType) {
	com.cnk.travelogix.suppliers.acco.data.Total roomTotalData = null;
	if (totalType != null) {
	    roomTotalData = new com.cnk.travelogix.suppliers.acco.data.Total();
	    roomTotalData.setAmountAfterTax(totalType.getAmountAfterTax());
	    roomTotalData.setAmountBeforeTax(totalType.getAmountBeforeTax());
	    roomTotalData.setCurrencyCode(totalType.getCurrencyCode());
	    roomTotalData.setType(totalType.getType());
	    roomTotalData.setDecimalPlaces(totalType.getDecimalPlaces());
	}
	return roomTotalData;
    }

    protected Total getTotalData(TotalType totalType) {
	com.cnk.travelogix.suppliers.acco.data.Total totalData = setTotalData(totalType);
	Tax tax = new Tax();
	final TaxesType taxesList = totalType.getTaxes();
	if (taxesList != null) {
	    List<Tax> taxs = new ArrayList<>();
	    List<TaxType> taxes = taxesList.getTax();
	    for (TaxType taxType : taxes) {
		List<org.opentravel.ota._2003._05.ParagraphType> listParagraphType = taxType.getTaxDescription();
		for (org.opentravel.ota._2003._05.ParagraphType penaltyParagraphType : listParagraphType) {
		    com.cnk.travelogix.suppliers.acco.data.ParagraphType paragraphTypesData = new com.cnk.travelogix.suppliers.acco.data.ParagraphType();
		    paragraphTypesData.setName(penaltyParagraphType.getName());
		    tax.getTaxDescription().add(paragraphTypesData);
		    taxs.add(tax);
		}
	    }
	    totalData.setTaxes(taxs);
	    totalData.getTaxes().add(tax);
	}
	return totalData;
    }

    protected List<CancelPenalty> getCancelPenaltyData(List<CancelPenaltyType> cancelPenaltiesTypeList) {
	List<CancelPenalty> cancelPenalties = new ArrayList<>();
	for (CancelPenaltyType cancelPenaltyType : cancelPenaltiesTypeList) {
	    CancelPenalty cancelPenaltyData = new CancelPenalty();
	    cancelPenaltyData.setDuration(cancelPenaltyType.getDuration());
	    cancelPenaltyData.setEnd(cancelPenaltyType.getEnd());
	    cancelPenaltyData.setStart(cancelPenaltyType.getStart());
	    com.cnk.travelogix.suppliers.acco.data.Deadline deadlineData = getDeadlineData(cancelPenaltyType);
	    cancelPenaltyData.setDeadline(deadlineData);
	    AmountPercent amountPercentData = getAmountPercentData(cancelPenaltyType);
	    cancelPenaltyData.setAmountPercent(amountPercentData);
	    com.cnk.travelogix.suppliers.acco.data.ParagraphType paragraphTypesData = new com.cnk.travelogix.suppliers.acco.data.ParagraphType();
	    List<org.opentravel.ota._2003._05.ParagraphType> listParagraphType = cancelPenaltyType.getPenaltyDescription();
	    for (org.opentravel.ota._2003._05.ParagraphType penaltyParagraphType : listParagraphType) {
		paragraphTypesData.setName(penaltyParagraphType.getName());
	    }
	    cancelPenaltyData.getPenaltyDescription().add(paragraphTypesData);
	    cancelPenalties.add(cancelPenaltyData);
	}
	return cancelPenalties;
    }

    private AmountPercent getAmountPercentData(CancelPenaltyType cancelPenaltyType) {
	AmountPercent amountPercentData = null;
	AmountPercentType amountPercent = cancelPenaltyType.getAmountPercent();
	if (amountPercent != null) {
	    amountPercentData = new AmountPercent();
	    amountPercentData.setAmount(amountPercent.getAmount());
	    amountPercentData.setNmbrOfNights(amountPercent.getNmbrOfNights());
	    amountPercentData.setPercent(amountPercent.getPercent());
	    amountPercentData.setTaxInclusive(amountPercent.isTaxInclusive());
	}
	return amountPercentData;
    }

    private com.cnk.travelogix.suppliers.acco.data.Deadline getDeadlineData(CancelPenaltyType cancelPenaltyType) {
	com.cnk.travelogix.suppliers.acco.data.Deadline deadlineData = null;
	org.opentravel.ota._2003._05.CancelPenaltyType.Deadline deadline = cancelPenaltyType.getDeadline();
	if (deadline != null) {
	    deadlineData = new com.cnk.travelogix.suppliers.acco.data.Deadline();
	    deadlineData.setAbsoluteDeadline(deadline.getAbsoluteDeadline());
	    deadlineData.setOffsetDropTime(deadline.getOffsetDropTime());
	    deadlineData.setOffsetUnitMultiplier(deadline.getOffsetUnitMultiplier());
	    TimeUnit timeUnitData = new TimeUnit();
	    // no attribute for this
	    deadlineData.setOffsetTimeUnit(timeUnitData);
	}
	return deadlineData;
    }

    protected List<RoomType> setRoomTypeData(org.opentravel.ota._2003._05.OTAHotelAvailRS.RoomStays.RoomStay roomStay) {
	List<RoomType> roomTypes = new ArrayList<>();
	if (roomStay.getRoomTypes() != null) {
	    List<RoomTypeType> otaRoomType = roomStay.getRoomTypes().getRoomType();
	    for (RoomTypeType roomTypeType : otaRoomType) {
		RoomType roomTypeData = populateRoomTypeData(roomTypeType);
		final TPAExtensionsType tpaExtensions = roomTypeType.getTPAExtensions();
		if (tpaExtensions != null) {
		    final List<String> elementTypes = new ArrayList<>();
		    elementTypes.add("RoomCategoryID");
		    elementTypes.add("RoomCategoryName");
		    final TPAExtensions tpaExtensionsData = getTPAExtensionsData(tpaExtensions, elementTypes);
		    roomTypeData.setTpaExtensions(tpaExtensionsData);
		}

		List<com.cnk.travelogix.suppliers.acco.data.Occupancy> occupancyData = getOccupancyData(roomTypeType);
		roomTypeData.setOccupancy(occupancyData);
		com.cnk.travelogix.suppliers.acco.data.ParagraphType roomDescriptionParagraphType = getParagraphTypeData(roomTypeType);
		roomTypeData.setRoomDescription(roomDescriptionParagraphType);
		roomTypes.add(roomTypeData);
	    }
	}
	return roomTypes;
    }

    protected TPAExtensionsType setTPAExtensions(com.cnk.travelogix.suppliers.acco.data.ProfileInfo profileInfo) {
	final TPAExtensionsType tpaExtensionsType = new TPAExtensionsType();
	final TPAExtensions tpaExtensionsData = profileInfo.getTpaExtensions();
	if (tpaExtensionsData != null) {
	    ExtraBedDetails extraBedDetails = new ExtraBedDetails();
	    ExtraBedDetail extraBedDetail;
	    com.cnk.travelogix.suppliers.acco.data.ExtraBedDetails extraBedDetailsData = (com.cnk.travelogix.suppliers.acco.data.ExtraBedDetails) tpaExtensionsData
		    .getKeyObjectMap().get(com.cnk.travelogix.suppliers.acco.data.ExtraBedDetails.class);
	    List<com.cnk.travelogix.suppliers.acco.data.ExtraBedDetail> extraBedDetailsDataList = extraBedDetailsData.getExtraBedDetail();
	    for (com.cnk.travelogix.suppliers.acco.data.ExtraBedDetail extraBedDetailData : extraBedDetailsDataList) {
		extraBedDetail = new ExtraBedDetail();
		extraBedDetail.setRoomRPH(extraBedDetailData.getRoomRPH());
		extraBedDetails.getExtraBedDetail().add(extraBedDetail);
	    }
	    tpaExtensionsType.getAny().add(getElementFromJaxbObject(extraBedDetails));
	}
	return tpaExtensionsType;
    }

    protected List<RatePlans> setRatePlans(org.opentravel.ota._2003._05.OTAHotelAvailRS.RoomStays.RoomStay roomStay) {
	List<RatePlans> rateplansListData = new ArrayList<>();
	if (roomStay.getRatePlans() != null) {
	    List<RatePlanType> otaRatePlan = roomStay.getRatePlans().getRatePlan();
	    for (RatePlanType ratePlanType : otaRatePlan) {
		RatePlans rateplansData = populateRatePlansData(ratePlanType);
		rateplansListData.add(rateplansData);
	    }
	}
	return rateplansListData;
    }

    private RatePlans populateRatePlansData(RatePlanType ratePlanType) {
	RatePlans rateplansData = new RatePlans();
	rateplansData.setAvailableQuantity(ratePlanType.getAvailableQuantity());
	rateplansData.setRatePlanCode(ratePlanType.getRatePlanCode());
	rateplansData.setRatePlanName(ratePlanType.getRatePlanName());
	rateplansData.setRatePlanType(ratePlanType.getRatePlanType());
	com.cnk.travelogix.suppliers.acco.data.MealsIncluded mealsIncludedData = getMealsIncludedData(ratePlanType);
	rateplansData.setMealsIncluded(mealsIncludedData);
	org.opentravel.ota._2003._05.ParagraphType ratePlanParagraphType = ratePlanType.getRatePlanDescription();
	if (ratePlanParagraphType != null) {
	    com.cnk.travelogix.suppliers.acco.data.ParagraphType ratePlanParagraphTypeData = new com.cnk.travelogix.suppliers.acco.data.ParagraphType();
	    ratePlanParagraphTypeData.setName(ratePlanParagraphType.getName());
	    rateplansData.setRatePlanDesciption(ratePlanParagraphTypeData);
	}
	RatePlanInclusions ratePlanInclusions = getRatePlanInclusionsData(ratePlanType);
	rateplansData.setRatePlanInclusions(ratePlanInclusions);
	CancelPenalties cancelPenaltiesData = new CancelPenalties();
	CancelPenaltiesType cancelPenaltiesType = ratePlanType.getCancelPenalties();
	if (cancelPenaltiesType != null) {
	    cancelPenaltiesData.setCancelPolicyIndicator(cancelPenaltiesType.isCancelPolicyIndicator());
	    List<CancelPenalty> cancelPenaltyData = getCancelPenaltyData(cancelPenaltiesType.getCancelPenalty());
	    cancelPenaltiesData.setCancelPenalty(cancelPenaltyData);
	}
	rateplansData.setCancelPenalties(cancelPenaltiesData);
	return rateplansData;
    }

    protected List<com.cnk.travelogix.suppliers.acco.data.UniqueID> getUniqueIDData(List<UniqueIDType> uniqueID) {
	List<com.cnk.travelogix.suppliers.acco.data.UniqueID> uniqueIDs = new ArrayList<>();
	com.cnk.travelogix.suppliers.acco.data.UniqueID uniqueIDData;
	for (UniqueIDType uniqueIDType : uniqueID) {
	    uniqueIDData = new com.cnk.travelogix.suppliers.acco.data.UniqueID();
	    uniqueIDData.setId(uniqueIDType.getID());
	    uniqueIDData.setType(uniqueIDType.getType());
	    uniqueIDs.add(uniqueIDData);
	}
	return uniqueIDs;
    }

    protected HotelRef setHotelRef(com.cnk.travelogix.suppliers.acco.data.Criterion criterion) {
	org.opentravel.ota._2003._05.ItemSearchCriterionType.HotelRef otaHotelRef = null;
	List<com.cnk.travelogix.suppliers.acco.data.HotelRef> hotelRefData = criterion.getHotelRef();
	for (com.cnk.travelogix.suppliers.acco.data.HotelRef hotelRef : hotelRefData) {
	    otaHotelRef = new HotelRef();
	    otaHotelRef.setAreaID(hotelRef.getAreaID());
	    otaHotelRef.setHotelCityCode(hotelRef.getHotelCityCode());
	    otaHotelRef.setHotelCode(hotelRef.getHotelCode());
	}
	return otaHotelRef;
    }

    protected List<RoomRate> setRoomRateData(org.opentravel.ota._2003._05.OTAHotelAvailRS.RoomStays.RoomStay roomStay) {
	List<com.cnk.travelogix.suppliers.acco.data.RoomRate> roomRatesData = new ArrayList<>();
	if (roomStay.getRoomRates() != null) {
	    List<org.opentravel.ota._2003._05.RoomStayType.RoomRates.RoomRate> roomRates = roomStay.getRoomRates().getRoomRate();
	    for (org.opentravel.ota._2003._05.RoomStayType.RoomRates.RoomRate roomRate : roomRates) {
		com.cnk.travelogix.suppliers.acco.data.RoomRate roomRateData = populateRoomRateDataResponse(roomRate);
		List<com.cnk.travelogix.suppliers.acco.data.GuestCount> guestCounts = new ArrayList<>();
		com.cnk.travelogix.suppliers.acco.data.GuestCount roomRateGuestData = setRoomRateGuest(roomRate);
		guestCounts.add(roomRateGuestData);
		roomRateData.setGuestCounts(guestCounts);
		roomRatesData.add(roomRateData);
	    }
	}
	return roomRatesData;
    }

    protected com.cnk.travelogix.suppliers.acco.data.GuestCount setRoomRateGuest(org.opentravel.ota._2003._05.RoomStayType.RoomRates.RoomRate roomRate) {
	com.cnk.travelogix.suppliers.acco.data.GuestCount roomRateGuestData = null;
	if (roomRate.getGuestCounts() != null) {
	    List<org.opentravel.ota._2003._05.RoomStayType.RoomRates.RoomRate.GuestCounts.GuestCount> otaGuestCountType = roomRate.getGuestCounts().getGuestCount();
	    for (org.opentravel.ota._2003._05.RoomStayType.RoomRates.RoomRate.GuestCounts.GuestCount guestCount : otaGuestCountType) {
		roomRateGuestData = new com.cnk.travelogix.suppliers.acco.data.GuestCount();
		roomRateGuestData.setAge(guestCount.getAge());
		roomRateGuestData.setAgeBucket(guestCount.getAgeBucket());
		roomRateGuestData.setAgeQualifyingCode(guestCount.getAgeQualifyingCode());
		roomRateGuestData.setCount(guestCount.getCount());
	    }
	}
	return roomRateGuestData;
    }

    protected com.cnk.travelogix.suppliers.acco.data.BasicPropertyInfo setBasicPropertyInfoData(org.opentravel.ota._2003._05.OTAHotelAvailRS.RoomStays.RoomStay roomStay) {
	org.opentravel.ota._2003._05.RoomStayType.BasicPropertyInfo basicPropertyInfo = roomStay.getBasicPropertyInfo();
	return populateBasicPropertyInfo(basicPropertyInfo);
    }

    protected com.cnk.travelogix.suppliers.acco.data.BasicPropertyInfo populateBasicPropertyInfo(org.opentravel.ota._2003._05.RoomStayType.BasicPropertyInfo basicPropertyInfo) {
	com.cnk.travelogix.suppliers.acco.data.BasicPropertyInfo basicPropertyInfoData = null;
	if (basicPropertyInfo != null) {
	    basicPropertyInfoData = new com.cnk.travelogix.suppliers.acco.data.BasicPropertyInfo();
	    basicPropertyInfoData.setAreaID(basicPropertyInfo.getAreaID());
	    basicPropertyInfoData.setCurrencyCode(basicPropertyInfo.getCurrencyCode());
	    basicPropertyInfoData.setHotelSegmentCategoryCode(basicPropertyInfo.getHotelSegmentCategoryCode());
	    basicPropertyInfoData.setHotelCode(basicPropertyInfo.getHotelCode());
	    basicPropertyInfoData.setHotelName(basicPropertyInfo.getHotelName());
	    basicPropertyInfoData.setChainName(basicPropertyInfo.getChainName());
	    basicPropertyInfoData.setChainCode(basicPropertyInfo.getChainCode());
	    basicPropertyInfoData.setHotelCityCode(basicPropertyInfo.getHotelCityCode());
	}
	return basicPropertyInfoData;

    }

    private TPAExtensions setTPAExtension(TPAExtensionsType tpaExtensions) {
	TPAExtensions tpaExtensionsData = new TPAExtensions();
	final List<Element> elements = tpaExtensions.getAny();
	for (Element element : elements) {
	    if ("Minstay".equals(element.getLocalName())) {
		final Minstay minStayData = getJaxbObjectFromElement(Minstay.class, element);
		com.coxandkings.integ.suppl.acco.RoomRateInfo.Minstay minstay = new com.coxandkings.integ.suppl.acco.RoomRateInfo.Minstay();
		minStayData.setMinstayPrice(minstay.getMinstayPrice());
		minStayData.setMsDay(minstay.getMSDay());
		minStayData.setMsRate(minstay.getMSRate());
		minStayData.setMsType(minstay.getMSType());

		tpaExtensionsData.getKeyObjectMap().put(Minstay.class, minStayData);
	    }

	    if ("Compulsory".equals(element.getLocalName())) {
		final Compulsory compulsoryData = getJaxbObjectFromElement(Compulsory.class, element);
		com.coxandkings.integ.suppl.acco.RoomRateInfo.Compulsory compulsory = new com.coxandkings.integ.suppl.acco.RoomRateInfo.Compulsory();
		compulsoryData.setCompulsoryPrice(compulsory.getCompulsoryPrice());
		compulsoryData.setName(compulsory.getName());
		tpaExtensionsData.getKeyObjectMap().put(Compulsory.class, compulsoryData);
	    }

	    if ("Supplement".equals(element.getLocalName())) {
		final Supplement supplementData = getJaxbObjectFromElement(Supplement.class, element);
		com.coxandkings.integ.suppl.acco.RoomRateInfo.Supplement supplement = new com.coxandkings.integ.suppl.acco.RoomRateInfo.Supplement();
		supplementData.setSupplementPrice(supplement.getSupplementPrice());
		supplementData.setName(supplement.getName());
		tpaExtensionsData.getKeyObjectMap().put(Supplement.class, supplementData);
	    }

	    if ("EarlyBird".equals(element.getLocalName())) {
		final EarlyBird earlyBirdData = getJaxbObjectFromElement(EarlyBird.class, element);
		com.coxandkings.integ.suppl.acco.RoomRateInfo.EarlyBird earlyBird = new com.coxandkings.integ.suppl.acco.RoomRateInfo.EarlyBird();
		earlyBirdData.setEarlyBirdDiscount(earlyBird.getEarlyBirdDiscount());
		earlyBirdData.setEbRate(earlyBird.getEBRate());
		earlyBirdData.setEbType(earlyBird.getEBType());
		tpaExtensionsData.getKeyObjectMap().put(EarlyBird.class, earlyBirdData);
	    }

	    if ("Commission".equals(element.getLocalName())) {
		final Commission commissionData = getJaxbObjectFromElement(Commission.class, element);
		com.coxandkings.integ.suppl.acco.RoomRateInfo.Commission commission = new com.coxandkings.integ.suppl.acco.RoomRateInfo.Commission();
		commissionData.setCommissionPrice(commission.getCommissionPrice());
		commissionData.setCommRate(commission.getCommRate());
		commissionData.setCommType(commission.getCommType());
		tpaExtensionsData.getKeyObjectMap().put(Commission.class, commissionData);
	    }

	    if ("Promotion".equals(element.getLocalName())) {
		final Promotion promotionData = getJaxbObjectFromElement(Promotion.class, element);
		com.coxandkings.integ.suppl.acco.RoomRateInfo.Promotion promotion = new com.coxandkings.integ.suppl.acco.RoomRateInfo.Promotion();
		promotionData.setName(promotion.getName());
		promotionData.setPromoCode(promotion.getPromoCode());
		promotionData.setValue(promotion.getValue());
		promotionData.setPromotionBFPrice(promotion.getPromotionBFPrice());
		tpaExtensionsData.getKeyObjectMap().put(Promotion.class, promotionData);
	    }
	    final List<String> elementTypes = new ArrayList<>();
	    elementTypes.add("PriceInformation");
	    tpaExtensionsData = getTPAExtensionsData(tpaExtensions, elementTypes);

	    if ("RoomCategory".equals(element.getLocalName())) {
		final RoomCategory roomCategoryData = getJaxbObjectFromElement(RoomCategory.class, element);
		com.coxandkings.integ.suppl.acco.PriceInformation.RoomCategory roomCategory = new com.coxandkings.integ.suppl.acco.PriceInformation.RoomCategory();
		roomCategoryData.setCommPrice(roomCategory.getCommPrice());
		roomCategoryData.setGrossPrice(roomCategory.getGrossPrice());
		roomCategoryData.setId(roomCategory.getID());
		roomCategoryData.setNetPrice(roomCategory.getNetPrice());
		roomCategoryData.setPrice(roomCategory.getPrice());
		tpaExtensionsData.getKeyObjectMap().put(RoomCategory.class, roomCategoryData);
	    }

	    if ("RoomType".equals(element.getLocalName())) {
		final RoomType roomCategoryData = getJaxbObjectFromElement(RoomType.class, element);
		tpaExtensionsData.getKeyObjectMap().put(RoomCategory.class, roomCategoryData);
	    }
	}
	return tpaExtensionsData;
    }

    protected List<org.opentravel.ota._2003._05.OTACancelRQ.UniqueID> setUniqueIDData(List<com.cnk.travelogix.suppliers.acco.data.UniqueID> uniqueIdDatas) {
	List<org.opentravel.ota._2003._05.OTACancelRQ.UniqueID> uniqueIDs = new ArrayList<>();
	for (com.cnk.travelogix.suppliers.acco.data.UniqueID uniqueIDData : uniqueIdDatas) {
	    org.opentravel.ota._2003._05.OTACancelRQ.UniqueID uniqueID = new org.opentravel.ota._2003._05.OTACancelRQ.UniqueID();
	    uniqueID.setID(uniqueIDData.getId());
	    uniqueID.setType(uniqueIDData.getType());
	    uniqueIDs.add(uniqueID);
	}
	return uniqueIDs;
    }

}
