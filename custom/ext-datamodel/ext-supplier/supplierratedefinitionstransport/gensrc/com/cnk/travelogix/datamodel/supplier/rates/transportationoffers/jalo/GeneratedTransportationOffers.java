/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.transportationoffers.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.carGroupupgrade.jalo.CarGroupUpgrade;
import com.cnk.travelogix.datamodel.supplier.rates.driverinformation.jalo.DriverInformation;
import com.cnk.travelogix.datamodel.supplier.rates.pickuplocation.jalo.PickupLocation;
import com.cnk.travelogix.datamodel.supplier.rates.sIPPcodeupgrade.jalo.SIPPCodeUpgrade;
import com.cnk.travelogix.datamodel.supplier.rates.transportationsurchargedetail.jalo.TransportationSurchargeSuppDetail;
import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer;
import com.cnk.travelogix.datamodel.supplier.rates.vehicleupgrade.jalo.VehicleUpgrade;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionstransportConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.transportationoffers.jalo.TransportationOffers TransportationOffers}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTransportationOffers extends AbstractTravelogixSupplierOffer
{
	/** Qualifier of the <code>TransportationOffers.rentalPeriodFrom</code> attribute **/
	public static final String RENTALPERIODFROM = "rentalPeriodFrom";
	/** Qualifier of the <code>TransportationOffers.rentalPeriodTo</code> attribute **/
	public static final String RENTALPERIODTO = "rentalPeriodTo";
	/** Qualifier of the <code>TransportationOffers.rentalPeriodHours</code> attribute **/
	public static final String RENTALPERIODHOURS = "rentalPeriodHours";
	/** Qualifier of the <code>TransportationOffers.feesDeduction</code> attribute **/
	public static final String FEESDEDUCTION = "feesDeduction";
	/** Qualifier of the <code>TransportationOffers.passengerType</code> attribute **/
	public static final String PASSENGERTYPE = "passengerType";
	/** Qualifier of the <code>TransportationOffers.discountCalculatedOn</code> attribute **/
	public static final String DISCOUNTCALCULATEDON = "discountCalculatedOn";
	/** Qualifier of the <code>TransportationOffers.appliedOnAll</code> attribute **/
	public static final String APPLIEDONALL = "appliedOnAll";
	/** Qualifier of the <code>TransportationOffers.complimentaryDetails</code> attribute **/
	public static final String COMPLIMENTARYDETAILS = "complimentaryDetails";
	/** Qualifier of the <code>TransportationOffers.freeDaysCount</code> attribute **/
	public static final String FREEDAYSCOUNT = "freeDaysCount";
	/** Qualifier of the <code>TransportationOffers.surcharge</code> attribute **/
	public static final String SURCHARGE = "surcharge";
	/** Qualifier of the <code>TransportationOffers.driverLicense</code> attribute **/
	public static final String DRIVERLICENSE = "driverLicense";
	/** Qualifier of the <code>TransportationOffers.licensePossessionPeriod</code> attribute **/
	public static final String LICENSEPOSSESSIONPERIOD = "licensePossessionPeriod";
	/** Qualifier of the <code>TransportationOffers.allowOfferClubbing</code> attribute **/
	public static final String ALLOWOFFERCLUBBING = "allowOfferClubbing";
	/** Qualifier of the <code>TransportationOffers.promotionCode</code> attribute **/
	public static final String PROMOTIONCODE = "promotionCode";
	/** Qualifier of the <code>TransportationOffers.offerAvailableOn</code> attribute **/
	public static final String OFFERAVAILABLEON = "offerAvailableOn";
	/** Qualifier of the <code>TransportationOffers.dayOfWeek</code> attribute **/
	public static final String DAYOFWEEK = "dayOfWeek";
	/** Qualifier of the <code>TransportationOffers.mustDay</code> attribute **/
	public static final String MUSTDAY = "mustDay";
	/** Qualifier of the <code>TransportationOffers.offerTime</code> attribute **/
	public static final String OFFERTIME = "offerTime";
	/** Qualifier of the <code>TransportationOffers.carGroupUpgrades</code> attribute **/
	public static final String CARGROUPUPGRADES = "carGroupUpgrades";
	/** Qualifier of the <code>TransportationOffers.sIPPCodeUpgrades</code> attribute **/
	public static final String SIPPCODEUPGRADES = "sIPPCodeUpgrades";
	/** Qualifier of the <code>TransportationOffers.vehicleUpgrades</code> attribute **/
	public static final String VEHICLEUPGRADES = "vehicleUpgrades";
	/** Qualifier of the <code>TransportationOffers.driverInformations</code> attribute **/
	public static final String DRIVERINFORMATIONS = "driverInformations";
	/** Qualifier of the <code>TransportationOffers.pickUpLocation</code> attribute **/
	public static final String PICKUPLOCATION = "pickUpLocation";
	/**
	* {@link OneToManyHandler} for handling 1:n CARGROUPUPGRADES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CarGroupUpgrade> CARGROUPUPGRADESHANDLER = new OneToManyHandler<CarGroupUpgrade>(
	SupplierratedefinitionstransportConstants.TC.CARGROUPUPGRADE,
	false,
	"transportationOffers",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SIPPCODEUPGRADES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SIPPCodeUpgrade> SIPPCODEUPGRADESHANDLER = new OneToManyHandler<SIPPCodeUpgrade>(
	SupplierratedefinitionstransportConstants.TC.SIPPCODEUPGRADE,
	false,
	"transportationOffers",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n VEHICLEUPGRADES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<VehicleUpgrade> VEHICLEUPGRADESHANDLER = new OneToManyHandler<VehicleUpgrade>(
	SupplierratedefinitionstransportConstants.TC.VEHICLEUPGRADE,
	false,
	"transportationOffers",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n DRIVERINFORMATIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DriverInformation> DRIVERINFORMATIONSHANDLER = new OneToManyHandler<DriverInformation>(
	SupplierratedefinitionstransportConstants.TC.DRIVERINFORMATION,
	false,
	"transportationOffers",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PICKUPLOCATION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PickupLocation> PICKUPLOCATIONHANDLER = new OneToManyHandler<PickupLocation>(
	SupplierratedefinitionstransportConstants.TC.PICKUPLOCATION,
	false,
	"transportationOffers",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixSupplierOffer.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(RENTALPERIODFROM, AttributeMode.INITIAL);
		tmp.put(RENTALPERIODTO, AttributeMode.INITIAL);
		tmp.put(RENTALPERIODHOURS, AttributeMode.INITIAL);
		tmp.put(FEESDEDUCTION, AttributeMode.INITIAL);
		tmp.put(PASSENGERTYPE, AttributeMode.INITIAL);
		tmp.put(DISCOUNTCALCULATEDON, AttributeMode.INITIAL);
		tmp.put(APPLIEDONALL, AttributeMode.INITIAL);
		tmp.put(COMPLIMENTARYDETAILS, AttributeMode.INITIAL);
		tmp.put(FREEDAYSCOUNT, AttributeMode.INITIAL);
		tmp.put(SURCHARGE, AttributeMode.INITIAL);
		tmp.put(DRIVERLICENSE, AttributeMode.INITIAL);
		tmp.put(LICENSEPOSSESSIONPERIOD, AttributeMode.INITIAL);
		tmp.put(ALLOWOFFERCLUBBING, AttributeMode.INITIAL);
		tmp.put(PROMOTIONCODE, AttributeMode.INITIAL);
		tmp.put(OFFERAVAILABLEON, AttributeMode.INITIAL);
		tmp.put(DAYOFWEEK, AttributeMode.INITIAL);
		tmp.put(MUSTDAY, AttributeMode.INITIAL);
		tmp.put(OFFERTIME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.allowOfferClubbing</code> attribute.
	 * @return the allowOfferClubbing
	 */
	public Boolean isAllowOfferClubbing(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ALLOWOFFERCLUBBING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.allowOfferClubbing</code> attribute.
	 * @return the allowOfferClubbing
	 */
	public Boolean isAllowOfferClubbing()
	{
		return isAllowOfferClubbing( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.allowOfferClubbing</code> attribute. 
	 * @return the allowOfferClubbing
	 */
	public boolean isAllowOfferClubbingAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAllowOfferClubbing( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.allowOfferClubbing</code> attribute. 
	 * @return the allowOfferClubbing
	 */
	public boolean isAllowOfferClubbingAsPrimitive()
	{
		return isAllowOfferClubbingAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.allowOfferClubbing</code> attribute. 
	 * @param value the allowOfferClubbing
	 */
	public void setAllowOfferClubbing(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ALLOWOFFERCLUBBING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.allowOfferClubbing</code> attribute. 
	 * @param value the allowOfferClubbing
	 */
	public void setAllowOfferClubbing(final Boolean value)
	{
		setAllowOfferClubbing( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.allowOfferClubbing</code> attribute. 
	 * @param value the allowOfferClubbing
	 */
	public void setAllowOfferClubbing(final SessionContext ctx, final boolean value)
	{
		setAllowOfferClubbing( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.allowOfferClubbing</code> attribute. 
	 * @param value the allowOfferClubbing
	 */
	public void setAllowOfferClubbing(final boolean value)
	{
		setAllowOfferClubbing( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.appliedOnAll</code> attribute.
	 * @return the appliedOnAll
	 */
	public Boolean isAppliedOnAll(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, APPLIEDONALL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.appliedOnAll</code> attribute.
	 * @return the appliedOnAll
	 */
	public Boolean isAppliedOnAll()
	{
		return isAppliedOnAll( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.appliedOnAll</code> attribute. 
	 * @return the appliedOnAll
	 */
	public boolean isAppliedOnAllAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAppliedOnAll( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.appliedOnAll</code> attribute. 
	 * @return the appliedOnAll
	 */
	public boolean isAppliedOnAllAsPrimitive()
	{
		return isAppliedOnAllAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.appliedOnAll</code> attribute. 
	 * @param value the appliedOnAll
	 */
	public void setAppliedOnAll(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, APPLIEDONALL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.appliedOnAll</code> attribute. 
	 * @param value the appliedOnAll
	 */
	public void setAppliedOnAll(final Boolean value)
	{
		setAppliedOnAll( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.appliedOnAll</code> attribute. 
	 * @param value the appliedOnAll
	 */
	public void setAppliedOnAll(final SessionContext ctx, final boolean value)
	{
		setAppliedOnAll( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.appliedOnAll</code> attribute. 
	 * @param value the appliedOnAll
	 */
	public void setAppliedOnAll(final boolean value)
	{
		setAppliedOnAll( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.carGroupUpgrades</code> attribute.
	 * @return the carGroupUpgrades
	 */
	public Set<CarGroupUpgrade> getCarGroupUpgrades(final SessionContext ctx)
	{
		return (Set<CarGroupUpgrade>)CARGROUPUPGRADESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.carGroupUpgrades</code> attribute.
	 * @return the carGroupUpgrades
	 */
	public Set<CarGroupUpgrade> getCarGroupUpgrades()
	{
		return getCarGroupUpgrades( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.carGroupUpgrades</code> attribute. 
	 * @param value the carGroupUpgrades
	 */
	public void setCarGroupUpgrades(final SessionContext ctx, final Set<CarGroupUpgrade> value)
	{
		CARGROUPUPGRADESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.carGroupUpgrades</code> attribute. 
	 * @param value the carGroupUpgrades
	 */
	public void setCarGroupUpgrades(final Set<CarGroupUpgrade> value)
	{
		setCarGroupUpgrades( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to carGroupUpgrades. 
	 * @param value the item to add to carGroupUpgrades
	 */
	public void addToCarGroupUpgrades(final SessionContext ctx, final CarGroupUpgrade value)
	{
		CARGROUPUPGRADESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to carGroupUpgrades. 
	 * @param value the item to add to carGroupUpgrades
	 */
	public void addToCarGroupUpgrades(final CarGroupUpgrade value)
	{
		addToCarGroupUpgrades( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from carGroupUpgrades. 
	 * @param value the item to remove from carGroupUpgrades
	 */
	public void removeFromCarGroupUpgrades(final SessionContext ctx, final CarGroupUpgrade value)
	{
		CARGROUPUPGRADESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from carGroupUpgrades. 
	 * @param value the item to remove from carGroupUpgrades
	 */
	public void removeFromCarGroupUpgrades(final CarGroupUpgrade value)
	{
		removeFromCarGroupUpgrades( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.complimentaryDetails</code> attribute.
	 * @return the complimentaryDetails
	 */
	public String getComplimentaryDetails(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMPLIMENTARYDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.complimentaryDetails</code> attribute.
	 * @return the complimentaryDetails
	 */
	public String getComplimentaryDetails()
	{
		return getComplimentaryDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.complimentaryDetails</code> attribute. 
	 * @param value the complimentaryDetails
	 */
	public void setComplimentaryDetails(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMPLIMENTARYDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.complimentaryDetails</code> attribute. 
	 * @param value the complimentaryDetails
	 */
	public void setComplimentaryDetails(final String value)
	{
		setComplimentaryDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.dayOfWeek</code> attribute.
	 * @return the dayOfWeek
	 */
	public Collection<EnumerationValue> getDayOfWeek(final SessionContext ctx)
	{
		Collection<EnumerationValue> coll = (Collection<EnumerationValue>)getProperty( ctx, DAYOFWEEK);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.dayOfWeek</code> attribute.
	 * @return the dayOfWeek
	 */
	public Collection<EnumerationValue> getDayOfWeek()
	{
		return getDayOfWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.dayOfWeek</code> attribute. 
	 * @param value the dayOfWeek
	 */
	public void setDayOfWeek(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		setProperty(ctx, DAYOFWEEK,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.dayOfWeek</code> attribute. 
	 * @param value the dayOfWeek
	 */
	public void setDayOfWeek(final Collection<EnumerationValue> value)
	{
		setDayOfWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.discountCalculatedOn</code> attribute.
	 * @return the discountCalculatedOn
	 */
	public EnumerationValue getDiscountCalculatedOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DISCOUNTCALCULATEDON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.discountCalculatedOn</code> attribute.
	 * @return the discountCalculatedOn
	 */
	public EnumerationValue getDiscountCalculatedOn()
	{
		return getDiscountCalculatedOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.discountCalculatedOn</code> attribute. 
	 * @param value the discountCalculatedOn
	 */
	public void setDiscountCalculatedOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DISCOUNTCALCULATEDON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.discountCalculatedOn</code> attribute. 
	 * @param value the discountCalculatedOn
	 */
	public void setDiscountCalculatedOn(final EnumerationValue value)
	{
		setDiscountCalculatedOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.driverInformations</code> attribute.
	 * @return the driverInformations
	 */
	public Set<DriverInformation> getDriverInformations(final SessionContext ctx)
	{
		return (Set<DriverInformation>)DRIVERINFORMATIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.driverInformations</code> attribute.
	 * @return the driverInformations
	 */
	public Set<DriverInformation> getDriverInformations()
	{
		return getDriverInformations( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.driverInformations</code> attribute. 
	 * @param value the driverInformations
	 */
	public void setDriverInformations(final SessionContext ctx, final Set<DriverInformation> value)
	{
		DRIVERINFORMATIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.driverInformations</code> attribute. 
	 * @param value the driverInformations
	 */
	public void setDriverInformations(final Set<DriverInformation> value)
	{
		setDriverInformations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to driverInformations. 
	 * @param value the item to add to driverInformations
	 */
	public void addToDriverInformations(final SessionContext ctx, final DriverInformation value)
	{
		DRIVERINFORMATIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to driverInformations. 
	 * @param value the item to add to driverInformations
	 */
	public void addToDriverInformations(final DriverInformation value)
	{
		addToDriverInformations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from driverInformations. 
	 * @param value the item to remove from driverInformations
	 */
	public void removeFromDriverInformations(final SessionContext ctx, final DriverInformation value)
	{
		DRIVERINFORMATIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from driverInformations. 
	 * @param value the item to remove from driverInformations
	 */
	public void removeFromDriverInformations(final DriverInformation value)
	{
		removeFromDriverInformations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.driverLicense</code> attribute.
	 * @return the driverLicense
	 */
	public Boolean isDriverLicense(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DRIVERLICENSE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.driverLicense</code> attribute.
	 * @return the driverLicense
	 */
	public Boolean isDriverLicense()
	{
		return isDriverLicense( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.driverLicense</code> attribute. 
	 * @return the driverLicense
	 */
	public boolean isDriverLicenseAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDriverLicense( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.driverLicense</code> attribute. 
	 * @return the driverLicense
	 */
	public boolean isDriverLicenseAsPrimitive()
	{
		return isDriverLicenseAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.driverLicense</code> attribute. 
	 * @param value the driverLicense
	 */
	public void setDriverLicense(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DRIVERLICENSE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.driverLicense</code> attribute. 
	 * @param value the driverLicense
	 */
	public void setDriverLicense(final Boolean value)
	{
		setDriverLicense( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.driverLicense</code> attribute. 
	 * @param value the driverLicense
	 */
	public void setDriverLicense(final SessionContext ctx, final boolean value)
	{
		setDriverLicense( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.driverLicense</code> attribute. 
	 * @param value the driverLicense
	 */
	public void setDriverLicense(final boolean value)
	{
		setDriverLicense( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.feesDeduction</code> attribute.
	 * @return the feesDeduction
	 */
	public EnumerationValue getFeesDeduction(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, FEESDEDUCTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.feesDeduction</code> attribute.
	 * @return the feesDeduction
	 */
	public EnumerationValue getFeesDeduction()
	{
		return getFeesDeduction( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.feesDeduction</code> attribute. 
	 * @param value the feesDeduction
	 */
	public void setFeesDeduction(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, FEESDEDUCTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.feesDeduction</code> attribute. 
	 * @param value the feesDeduction
	 */
	public void setFeesDeduction(final EnumerationValue value)
	{
		setFeesDeduction( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.freeDaysCount</code> attribute.
	 * @return the freeDaysCount
	 */
	public Integer getFreeDaysCount(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, FREEDAYSCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.freeDaysCount</code> attribute.
	 * @return the freeDaysCount
	 */
	public Integer getFreeDaysCount()
	{
		return getFreeDaysCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.freeDaysCount</code> attribute. 
	 * @return the freeDaysCount
	 */
	public int getFreeDaysCountAsPrimitive(final SessionContext ctx)
	{
		Integer value = getFreeDaysCount( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.freeDaysCount</code> attribute. 
	 * @return the freeDaysCount
	 */
	public int getFreeDaysCountAsPrimitive()
	{
		return getFreeDaysCountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.freeDaysCount</code> attribute. 
	 * @param value the freeDaysCount
	 */
	public void setFreeDaysCount(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, FREEDAYSCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.freeDaysCount</code> attribute. 
	 * @param value the freeDaysCount
	 */
	public void setFreeDaysCount(final Integer value)
	{
		setFreeDaysCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.freeDaysCount</code> attribute. 
	 * @param value the freeDaysCount
	 */
	public void setFreeDaysCount(final SessionContext ctx, final int value)
	{
		setFreeDaysCount( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.freeDaysCount</code> attribute. 
	 * @param value the freeDaysCount
	 */
	public void setFreeDaysCount(final int value)
	{
		setFreeDaysCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.licensePossessionPeriod</code> attribute.
	 * @return the licensePossessionPeriod
	 */
	public Integer getLicensePossessionPeriod(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, LICENSEPOSSESSIONPERIOD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.licensePossessionPeriod</code> attribute.
	 * @return the licensePossessionPeriod
	 */
	public Integer getLicensePossessionPeriod()
	{
		return getLicensePossessionPeriod( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.licensePossessionPeriod</code> attribute. 
	 * @return the licensePossessionPeriod
	 */
	public int getLicensePossessionPeriodAsPrimitive(final SessionContext ctx)
	{
		Integer value = getLicensePossessionPeriod( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.licensePossessionPeriod</code> attribute. 
	 * @return the licensePossessionPeriod
	 */
	public int getLicensePossessionPeriodAsPrimitive()
	{
		return getLicensePossessionPeriodAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.licensePossessionPeriod</code> attribute. 
	 * @param value the licensePossessionPeriod
	 */
	public void setLicensePossessionPeriod(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, LICENSEPOSSESSIONPERIOD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.licensePossessionPeriod</code> attribute. 
	 * @param value the licensePossessionPeriod
	 */
	public void setLicensePossessionPeriod(final Integer value)
	{
		setLicensePossessionPeriod( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.licensePossessionPeriod</code> attribute. 
	 * @param value the licensePossessionPeriod
	 */
	public void setLicensePossessionPeriod(final SessionContext ctx, final int value)
	{
		setLicensePossessionPeriod( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.licensePossessionPeriod</code> attribute. 
	 * @param value the licensePossessionPeriod
	 */
	public void setLicensePossessionPeriod(final int value)
	{
		setLicensePossessionPeriod( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.mustDay</code> attribute.
	 * @return the mustDay
	 */
	public Collection<EnumerationValue> getMustDay(final SessionContext ctx)
	{
		Collection<EnumerationValue> coll = (Collection<EnumerationValue>)getProperty( ctx, MUSTDAY);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.mustDay</code> attribute.
	 * @return the mustDay
	 */
	public Collection<EnumerationValue> getMustDay()
	{
		return getMustDay( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.mustDay</code> attribute. 
	 * @param value the mustDay
	 */
	public void setMustDay(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		setProperty(ctx, MUSTDAY,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.mustDay</code> attribute. 
	 * @param value the mustDay
	 */
	public void setMustDay(final Collection<EnumerationValue> value)
	{
		setMustDay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.offerAvailableOn</code> attribute.
	 * @return the offerAvailableOn
	 */
	public EnumerationValue getOfferAvailableOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, OFFERAVAILABLEON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.offerAvailableOn</code> attribute.
	 * @return the offerAvailableOn
	 */
	public EnumerationValue getOfferAvailableOn()
	{
		return getOfferAvailableOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.offerAvailableOn</code> attribute. 
	 * @param value the offerAvailableOn
	 */
	public void setOfferAvailableOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, OFFERAVAILABLEON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.offerAvailableOn</code> attribute. 
	 * @param value the offerAvailableOn
	 */
	public void setOfferAvailableOn(final EnumerationValue value)
	{
		setOfferAvailableOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.offerTime</code> attribute.
	 * @return the offerTime
	 */
	public Date getOfferTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, OFFERTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.offerTime</code> attribute.
	 * @return the offerTime
	 */
	public Date getOfferTime()
	{
		return getOfferTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.offerTime</code> attribute. 
	 * @param value the offerTime
	 */
	public void setOfferTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, OFFERTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.offerTime</code> attribute. 
	 * @param value the offerTime
	 */
	public void setOfferTime(final Date value)
	{
		setOfferTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PASSENGERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType()
	{
		return getPassengerType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PASSENGERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final EnumerationValue value)
	{
		setPassengerType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.pickUpLocation</code> attribute.
	 * @return the pickUpLocation
	 */
	public Set<PickupLocation> getPickUpLocation(final SessionContext ctx)
	{
		return (Set<PickupLocation>)PICKUPLOCATIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.pickUpLocation</code> attribute.
	 * @return the pickUpLocation
	 */
	public Set<PickupLocation> getPickUpLocation()
	{
		return getPickUpLocation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.pickUpLocation</code> attribute. 
	 * @param value the pickUpLocation
	 */
	public void setPickUpLocation(final SessionContext ctx, final Set<PickupLocation> value)
	{
		PICKUPLOCATIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.pickUpLocation</code> attribute. 
	 * @param value the pickUpLocation
	 */
	public void setPickUpLocation(final Set<PickupLocation> value)
	{
		setPickUpLocation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to pickUpLocation. 
	 * @param value the item to add to pickUpLocation
	 */
	public void addToPickUpLocation(final SessionContext ctx, final PickupLocation value)
	{
		PICKUPLOCATIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to pickUpLocation. 
	 * @param value the item to add to pickUpLocation
	 */
	public void addToPickUpLocation(final PickupLocation value)
	{
		addToPickUpLocation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from pickUpLocation. 
	 * @param value the item to remove from pickUpLocation
	 */
	public void removeFromPickUpLocation(final SessionContext ctx, final PickupLocation value)
	{
		PICKUPLOCATIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from pickUpLocation. 
	 * @param value the item to remove from pickUpLocation
	 */
	public void removeFromPickUpLocation(final PickupLocation value)
	{
		removeFromPickUpLocation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.promotionCode</code> attribute.
	 * @return the promotionCode
	 */
	public String getPromotionCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PROMOTIONCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.promotionCode</code> attribute.
	 * @return the promotionCode
	 */
	public String getPromotionCode()
	{
		return getPromotionCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.promotionCode</code> attribute. 
	 * @param value the promotionCode
	 */
	public void setPromotionCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PROMOTIONCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.promotionCode</code> attribute. 
	 * @param value the promotionCode
	 */
	public void setPromotionCode(final String value)
	{
		setPromotionCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.rentalPeriodFrom</code> attribute.
	 * @return the rentalPeriodFrom
	 */
	public Integer getRentalPeriodFrom(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, RENTALPERIODFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.rentalPeriodFrom</code> attribute.
	 * @return the rentalPeriodFrom
	 */
	public Integer getRentalPeriodFrom()
	{
		return getRentalPeriodFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.rentalPeriodFrom</code> attribute. 
	 * @return the rentalPeriodFrom
	 */
	public int getRentalPeriodFromAsPrimitive(final SessionContext ctx)
	{
		Integer value = getRentalPeriodFrom( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.rentalPeriodFrom</code> attribute. 
	 * @return the rentalPeriodFrom
	 */
	public int getRentalPeriodFromAsPrimitive()
	{
		return getRentalPeriodFromAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.rentalPeriodFrom</code> attribute. 
	 * @param value the rentalPeriodFrom
	 */
	public void setRentalPeriodFrom(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, RENTALPERIODFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.rentalPeriodFrom</code> attribute. 
	 * @param value the rentalPeriodFrom
	 */
	public void setRentalPeriodFrom(final Integer value)
	{
		setRentalPeriodFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.rentalPeriodFrom</code> attribute. 
	 * @param value the rentalPeriodFrom
	 */
	public void setRentalPeriodFrom(final SessionContext ctx, final int value)
	{
		setRentalPeriodFrom( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.rentalPeriodFrom</code> attribute. 
	 * @param value the rentalPeriodFrom
	 */
	public void setRentalPeriodFrom(final int value)
	{
		setRentalPeriodFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.rentalPeriodHours</code> attribute.
	 * @return the rentalPeriodHours
	 */
	public Integer getRentalPeriodHours(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, RENTALPERIODHOURS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.rentalPeriodHours</code> attribute.
	 * @return the rentalPeriodHours
	 */
	public Integer getRentalPeriodHours()
	{
		return getRentalPeriodHours( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.rentalPeriodHours</code> attribute. 
	 * @return the rentalPeriodHours
	 */
	public int getRentalPeriodHoursAsPrimitive(final SessionContext ctx)
	{
		Integer value = getRentalPeriodHours( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.rentalPeriodHours</code> attribute. 
	 * @return the rentalPeriodHours
	 */
	public int getRentalPeriodHoursAsPrimitive()
	{
		return getRentalPeriodHoursAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.rentalPeriodHours</code> attribute. 
	 * @param value the rentalPeriodHours
	 */
	public void setRentalPeriodHours(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, RENTALPERIODHOURS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.rentalPeriodHours</code> attribute. 
	 * @param value the rentalPeriodHours
	 */
	public void setRentalPeriodHours(final Integer value)
	{
		setRentalPeriodHours( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.rentalPeriodHours</code> attribute. 
	 * @param value the rentalPeriodHours
	 */
	public void setRentalPeriodHours(final SessionContext ctx, final int value)
	{
		setRentalPeriodHours( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.rentalPeriodHours</code> attribute. 
	 * @param value the rentalPeriodHours
	 */
	public void setRentalPeriodHours(final int value)
	{
		setRentalPeriodHours( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.rentalPeriodTo</code> attribute.
	 * @return the rentalPeriodTo
	 */
	public Integer getRentalPeriodTo(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, RENTALPERIODTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.rentalPeriodTo</code> attribute.
	 * @return the rentalPeriodTo
	 */
	public Integer getRentalPeriodTo()
	{
		return getRentalPeriodTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.rentalPeriodTo</code> attribute. 
	 * @return the rentalPeriodTo
	 */
	public int getRentalPeriodToAsPrimitive(final SessionContext ctx)
	{
		Integer value = getRentalPeriodTo( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.rentalPeriodTo</code> attribute. 
	 * @return the rentalPeriodTo
	 */
	public int getRentalPeriodToAsPrimitive()
	{
		return getRentalPeriodToAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.rentalPeriodTo</code> attribute. 
	 * @param value the rentalPeriodTo
	 */
	public void setRentalPeriodTo(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, RENTALPERIODTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.rentalPeriodTo</code> attribute. 
	 * @param value the rentalPeriodTo
	 */
	public void setRentalPeriodTo(final Integer value)
	{
		setRentalPeriodTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.rentalPeriodTo</code> attribute. 
	 * @param value the rentalPeriodTo
	 */
	public void setRentalPeriodTo(final SessionContext ctx, final int value)
	{
		setRentalPeriodTo( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.rentalPeriodTo</code> attribute. 
	 * @param value the rentalPeriodTo
	 */
	public void setRentalPeriodTo(final int value)
	{
		setRentalPeriodTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.sIPPCodeUpgrades</code> attribute.
	 * @return the sIPPCodeUpgrades
	 */
	public Set<SIPPCodeUpgrade> getSIPPCodeUpgrades(final SessionContext ctx)
	{
		return (Set<SIPPCodeUpgrade>)SIPPCODEUPGRADESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.sIPPCodeUpgrades</code> attribute.
	 * @return the sIPPCodeUpgrades
	 */
	public Set<SIPPCodeUpgrade> getSIPPCodeUpgrades()
	{
		return getSIPPCodeUpgrades( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.sIPPCodeUpgrades</code> attribute. 
	 * @param value the sIPPCodeUpgrades
	 */
	public void setSIPPCodeUpgrades(final SessionContext ctx, final Set<SIPPCodeUpgrade> value)
	{
		SIPPCODEUPGRADESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.sIPPCodeUpgrades</code> attribute. 
	 * @param value the sIPPCodeUpgrades
	 */
	public void setSIPPCodeUpgrades(final Set<SIPPCodeUpgrade> value)
	{
		setSIPPCodeUpgrades( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sIPPCodeUpgrades. 
	 * @param value the item to add to sIPPCodeUpgrades
	 */
	public void addToSIPPCodeUpgrades(final SessionContext ctx, final SIPPCodeUpgrade value)
	{
		SIPPCODEUPGRADESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sIPPCodeUpgrades. 
	 * @param value the item to add to sIPPCodeUpgrades
	 */
	public void addToSIPPCodeUpgrades(final SIPPCodeUpgrade value)
	{
		addToSIPPCodeUpgrades( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sIPPCodeUpgrades. 
	 * @param value the item to remove from sIPPCodeUpgrades
	 */
	public void removeFromSIPPCodeUpgrades(final SessionContext ctx, final SIPPCodeUpgrade value)
	{
		SIPPCODEUPGRADESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sIPPCodeUpgrades. 
	 * @param value the item to remove from sIPPCodeUpgrades
	 */
	public void removeFromSIPPCodeUpgrades(final SIPPCodeUpgrade value)
	{
		removeFromSIPPCodeUpgrades( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.surcharge</code> attribute.
	 * @return the surcharge
	 */
	public TransportationSurchargeSuppDetail getSurcharge(final SessionContext ctx)
	{
		return (TransportationSurchargeSuppDetail)getProperty( ctx, SURCHARGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.surcharge</code> attribute.
	 * @return the surcharge
	 */
	public TransportationSurchargeSuppDetail getSurcharge()
	{
		return getSurcharge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.surcharge</code> attribute. 
	 * @param value the surcharge
	 */
	public void setSurcharge(final SessionContext ctx, final TransportationSurchargeSuppDetail value)
	{
		setProperty(ctx, SURCHARGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.surcharge</code> attribute. 
	 * @param value the surcharge
	 */
	public void setSurcharge(final TransportationSurchargeSuppDetail value)
	{
		setSurcharge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.vehicleUpgrades</code> attribute.
	 * @return the vehicleUpgrades
	 */
	public Set<VehicleUpgrade> getVehicleUpgrades(final SessionContext ctx)
	{
		return (Set<VehicleUpgrade>)VEHICLEUPGRADESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOffers.vehicleUpgrades</code> attribute.
	 * @return the vehicleUpgrades
	 */
	public Set<VehicleUpgrade> getVehicleUpgrades()
	{
		return getVehicleUpgrades( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.vehicleUpgrades</code> attribute. 
	 * @param value the vehicleUpgrades
	 */
	public void setVehicleUpgrades(final SessionContext ctx, final Set<VehicleUpgrade> value)
	{
		VEHICLEUPGRADESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOffers.vehicleUpgrades</code> attribute. 
	 * @param value the vehicleUpgrades
	 */
	public void setVehicleUpgrades(final Set<VehicleUpgrade> value)
	{
		setVehicleUpgrades( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to vehicleUpgrades. 
	 * @param value the item to add to vehicleUpgrades
	 */
	public void addToVehicleUpgrades(final SessionContext ctx, final VehicleUpgrade value)
	{
		VEHICLEUPGRADESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to vehicleUpgrades. 
	 * @param value the item to add to vehicleUpgrades
	 */
	public void addToVehicleUpgrades(final VehicleUpgrade value)
	{
		addToVehicleUpgrades( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from vehicleUpgrades. 
	 * @param value the item to remove from vehicleUpgrades
	 */
	public void removeFromVehicleUpgrades(final SessionContext ctx, final VehicleUpgrade value)
	{
		VEHICLEUPGRADESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from vehicleUpgrades. 
	 * @param value the item to remove from vehicleUpgrades
	 */
	public void removeFromVehicleUpgrades(final VehicleUpgrade value)
	{
		removeFromVehicleUpgrades( getSession().getSessionContext(), value );
	}
	
}
