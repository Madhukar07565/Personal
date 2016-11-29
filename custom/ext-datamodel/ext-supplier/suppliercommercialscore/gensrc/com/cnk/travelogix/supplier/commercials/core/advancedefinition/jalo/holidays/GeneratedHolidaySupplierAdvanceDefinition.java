/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.holidays;

import com.cnk.travelogix.masterdata.core.tours.jalo.TourType;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.accommodation.AccoSupplierAdvanceDefinition;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.holidays.HolidaySupplierAdvanceDefinition HolidaySupplierAdvanceDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHolidaySupplierAdvanceDefinition extends AccoSupplierAdvanceDefinition
{
	/** Qualifier of the <code>HolidaySupplierAdvanceDefinition.extensionNights</code> attribute **/
	public static final String EXTENSIONNIGHTS = "extensionNights";
	/** Qualifier of the <code>HolidaySupplierAdvanceDefinition.flights</code> attribute **/
	public static final String FLIGHTS = "flights";
	/** Qualifier of the <code>HolidaySupplierAdvanceDefinition.cancellationCharges</code> attribute **/
	public static final String CANCELLATIONCHARGES = "cancellationCharges";
	/** Qualifier of the <code>HolidaySupplierAdvanceDefinition.optionalTours</code> attribute **/
	public static final String OPTIONALTOURS = "optionalTours";
	/** Qualifier of the <code>HolidaySupplierAdvanceDefinition.tripProtection</code> attribute **/
	public static final String TRIPPROTECTION = "tripProtection";
	/** Qualifier of the <code>HolidaySupplierAdvanceDefinition.supplement</code> attribute **/
	public static final String SUPPLEMENT = "supplement";
	/** Qualifier of the <code>HolidaySupplierAdvanceDefinition.surcharge</code> attribute **/
	public static final String SURCHARGE = "surcharge";
	/** Qualifier of the <code>HolidaySupplierAdvanceDefinition.upgrade</code> attribute **/
	public static final String UPGRADE = "upgrade";
	/** Qualifier of the <code>HolidaySupplierAdvanceDefinition.tourTypes</code> attribute **/
	public static final String TOURTYPES = "tourTypes";
	/** Relation ordering override parameter constants for TourType2AdvcenceDefinition from ((suppliercommercialscore))*/
	protected static String TOURTYPE2ADVCENCEDEFINITION_SRC_ORDERED = "relation.TourType2AdvcenceDefinition.source.ordered";
	protected static String TOURTYPE2ADVCENCEDEFINITION_TGT_ORDERED = "relation.TourType2AdvcenceDefinition.target.ordered";
	/** Relation disable markmodifed parameter constants for TourType2AdvcenceDefinition from ((suppliercommercialscore))*/
	protected static String TOURTYPE2ADVCENCEDEFINITION_MARKMODIFIED = "relation.TourType2AdvcenceDefinition.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AccoSupplierAdvanceDefinition.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(EXTENSIONNIGHTS, AttributeMode.INITIAL);
		tmp.put(FLIGHTS, AttributeMode.INITIAL);
		tmp.put(CANCELLATIONCHARGES, AttributeMode.INITIAL);
		tmp.put(OPTIONALTOURS, AttributeMode.INITIAL);
		tmp.put(TRIPPROTECTION, AttributeMode.INITIAL);
		tmp.put(SUPPLEMENT, AttributeMode.INITIAL);
		tmp.put(SURCHARGE, AttributeMode.INITIAL);
		tmp.put(UPGRADE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.cancellationCharges</code> attribute.
	 * @return the cancellationCharges
	 */
	public Boolean isCancellationCharges(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, CANCELLATIONCHARGES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.cancellationCharges</code> attribute.
	 * @return the cancellationCharges
	 */
	public Boolean isCancellationCharges()
	{
		return isCancellationCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.cancellationCharges</code> attribute. 
	 * @return the cancellationCharges
	 */
	public boolean isCancellationChargesAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isCancellationCharges( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.cancellationCharges</code> attribute. 
	 * @return the cancellationCharges
	 */
	public boolean isCancellationChargesAsPrimitive()
	{
		return isCancellationChargesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.cancellationCharges</code> attribute. 
	 * @param value the cancellationCharges
	 */
	public void setCancellationCharges(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, CANCELLATIONCHARGES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.cancellationCharges</code> attribute. 
	 * @param value the cancellationCharges
	 */
	public void setCancellationCharges(final Boolean value)
	{
		setCancellationCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.cancellationCharges</code> attribute. 
	 * @param value the cancellationCharges
	 */
	public void setCancellationCharges(final SessionContext ctx, final boolean value)
	{
		setCancellationCharges( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.cancellationCharges</code> attribute. 
	 * @param value the cancellationCharges
	 */
	public void setCancellationCharges(final boolean value)
	{
		setCancellationCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.extensionNights</code> attribute.
	 * @return the extensionNights
	 */
	public Boolean isExtensionNights(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, EXTENSIONNIGHTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.extensionNights</code> attribute.
	 * @return the extensionNights
	 */
	public Boolean isExtensionNights()
	{
		return isExtensionNights( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.extensionNights</code> attribute. 
	 * @return the extensionNights
	 */
	public boolean isExtensionNightsAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isExtensionNights( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.extensionNights</code> attribute. 
	 * @return the extensionNights
	 */
	public boolean isExtensionNightsAsPrimitive()
	{
		return isExtensionNightsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.extensionNights</code> attribute. 
	 * @param value the extensionNights
	 */
	public void setExtensionNights(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, EXTENSIONNIGHTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.extensionNights</code> attribute. 
	 * @param value the extensionNights
	 */
	public void setExtensionNights(final Boolean value)
	{
		setExtensionNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.extensionNights</code> attribute. 
	 * @param value the extensionNights
	 */
	public void setExtensionNights(final SessionContext ctx, final boolean value)
	{
		setExtensionNights( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.extensionNights</code> attribute. 
	 * @param value the extensionNights
	 */
	public void setExtensionNights(final boolean value)
	{
		setExtensionNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.flights</code> attribute.
	 * @return the flights
	 */
	public Boolean isFlights(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, FLIGHTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.flights</code> attribute.
	 * @return the flights
	 */
	public Boolean isFlights()
	{
		return isFlights( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.flights</code> attribute. 
	 * @return the flights
	 */
	public boolean isFlightsAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isFlights( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.flights</code> attribute. 
	 * @return the flights
	 */
	public boolean isFlightsAsPrimitive()
	{
		return isFlightsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.flights</code> attribute. 
	 * @param value the flights
	 */
	public void setFlights(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, FLIGHTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.flights</code> attribute. 
	 * @param value the flights
	 */
	public void setFlights(final Boolean value)
	{
		setFlights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.flights</code> attribute. 
	 * @param value the flights
	 */
	public void setFlights(final SessionContext ctx, final boolean value)
	{
		setFlights( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.flights</code> attribute. 
	 * @param value the flights
	 */
	public void setFlights(final boolean value)
	{
		setFlights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.optionalTours</code> attribute.
	 * @return the optionalTours
	 */
	public Boolean isOptionalTours(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, OPTIONALTOURS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.optionalTours</code> attribute.
	 * @return the optionalTours
	 */
	public Boolean isOptionalTours()
	{
		return isOptionalTours( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.optionalTours</code> attribute. 
	 * @return the optionalTours
	 */
	public boolean isOptionalToursAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isOptionalTours( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.optionalTours</code> attribute. 
	 * @return the optionalTours
	 */
	public boolean isOptionalToursAsPrimitive()
	{
		return isOptionalToursAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.optionalTours</code> attribute. 
	 * @param value the optionalTours
	 */
	public void setOptionalTours(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, OPTIONALTOURS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.optionalTours</code> attribute. 
	 * @param value the optionalTours
	 */
	public void setOptionalTours(final Boolean value)
	{
		setOptionalTours( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.optionalTours</code> attribute. 
	 * @param value the optionalTours
	 */
	public void setOptionalTours(final SessionContext ctx, final boolean value)
	{
		setOptionalTours( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.optionalTours</code> attribute. 
	 * @param value the optionalTours
	 */
	public void setOptionalTours(final boolean value)
	{
		setOptionalTours( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.supplement</code> attribute.
	 * @return the supplement
	 */
	public Boolean isSupplement(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SUPPLEMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.supplement</code> attribute.
	 * @return the supplement
	 */
	public Boolean isSupplement()
	{
		return isSupplement( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.supplement</code> attribute. 
	 * @return the supplement
	 */
	public boolean isSupplementAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSupplement( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.supplement</code> attribute. 
	 * @return the supplement
	 */
	public boolean isSupplementAsPrimitive()
	{
		return isSupplementAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.supplement</code> attribute. 
	 * @param value the supplement
	 */
	public void setSupplement(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SUPPLEMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.supplement</code> attribute. 
	 * @param value the supplement
	 */
	public void setSupplement(final Boolean value)
	{
		setSupplement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.supplement</code> attribute. 
	 * @param value the supplement
	 */
	public void setSupplement(final SessionContext ctx, final boolean value)
	{
		setSupplement( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.supplement</code> attribute. 
	 * @param value the supplement
	 */
	public void setSupplement(final boolean value)
	{
		setSupplement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.surcharge</code> attribute.
	 * @return the surcharge
	 */
	public Boolean isSurcharge(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SURCHARGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.surcharge</code> attribute.
	 * @return the surcharge
	 */
	public Boolean isSurcharge()
	{
		return isSurcharge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.surcharge</code> attribute. 
	 * @return the surcharge
	 */
	public boolean isSurchargeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSurcharge( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.surcharge</code> attribute. 
	 * @return the surcharge
	 */
	public boolean isSurchargeAsPrimitive()
	{
		return isSurchargeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.surcharge</code> attribute. 
	 * @param value the surcharge
	 */
	public void setSurcharge(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SURCHARGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.surcharge</code> attribute. 
	 * @param value the surcharge
	 */
	public void setSurcharge(final Boolean value)
	{
		setSurcharge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.surcharge</code> attribute. 
	 * @param value the surcharge
	 */
	public void setSurcharge(final SessionContext ctx, final boolean value)
	{
		setSurcharge( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.surcharge</code> attribute. 
	 * @param value the surcharge
	 */
	public void setSurcharge(final boolean value)
	{
		setSurcharge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.tourTypes</code> attribute.
	 * @return the tourTypes
	 */
	public Collection<TourType> getTourTypes(final SessionContext ctx)
	{
		final List<TourType> items = getLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.TOURTYPE2ADVCENCEDEFINITION,
			"TourType",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.tourTypes</code> attribute.
	 * @return the tourTypes
	 */
	public Collection<TourType> getTourTypes()
	{
		return getTourTypes( getSession().getSessionContext() );
	}
	
	public long getTourTypesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.TOURTYPE2ADVCENCEDEFINITION,
			"TourType",
			null
		);
	}
	
	public long getTourTypesCount()
	{
		return getTourTypesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.tourTypes</code> attribute. 
	 * @param value the tourTypes
	 */
	public void setTourTypes(final SessionContext ctx, final Collection<TourType> value)
	{
		setLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.TOURTYPE2ADVCENCEDEFINITION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(TOURTYPE2ADVCENCEDEFINITION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.tourTypes</code> attribute. 
	 * @param value the tourTypes
	 */
	public void setTourTypes(final Collection<TourType> value)
	{
		setTourTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to tourTypes. 
	 * @param value the item to add to tourTypes
	 */
	public void addToTourTypes(final SessionContext ctx, final TourType value)
	{
		addLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.TOURTYPE2ADVCENCEDEFINITION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TOURTYPE2ADVCENCEDEFINITION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to tourTypes. 
	 * @param value the item to add to tourTypes
	 */
	public void addToTourTypes(final TourType value)
	{
		addToTourTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from tourTypes. 
	 * @param value the item to remove from tourTypes
	 */
	public void removeFromTourTypes(final SessionContext ctx, final TourType value)
	{
		removeLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.TOURTYPE2ADVCENCEDEFINITION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TOURTYPE2ADVCENCEDEFINITION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from tourTypes. 
	 * @param value the item to remove from tourTypes
	 */
	public void removeFromTourTypes(final TourType value)
	{
		removeFromTourTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.tripProtection</code> attribute.
	 * @return the tripProtection
	 */
	public Boolean isTripProtection(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, TRIPPROTECTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.tripProtection</code> attribute.
	 * @return the tripProtection
	 */
	public Boolean isTripProtection()
	{
		return isTripProtection( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.tripProtection</code> attribute. 
	 * @return the tripProtection
	 */
	public boolean isTripProtectionAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isTripProtection( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.tripProtection</code> attribute. 
	 * @return the tripProtection
	 */
	public boolean isTripProtectionAsPrimitive()
	{
		return isTripProtectionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.tripProtection</code> attribute. 
	 * @param value the tripProtection
	 */
	public void setTripProtection(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, TRIPPROTECTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.tripProtection</code> attribute. 
	 * @param value the tripProtection
	 */
	public void setTripProtection(final Boolean value)
	{
		setTripProtection( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.tripProtection</code> attribute. 
	 * @param value the tripProtection
	 */
	public void setTripProtection(final SessionContext ctx, final boolean value)
	{
		setTripProtection( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.tripProtection</code> attribute. 
	 * @param value the tripProtection
	 */
	public void setTripProtection(final boolean value)
	{
		setTripProtection( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.upgrade</code> attribute.
	 * @return the upgrade
	 */
	public Boolean isUpgrade(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, UPGRADE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.upgrade</code> attribute.
	 * @return the upgrade
	 */
	public Boolean isUpgrade()
	{
		return isUpgrade( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.upgrade</code> attribute. 
	 * @return the upgrade
	 */
	public boolean isUpgradeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isUpgrade( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaySupplierAdvanceDefinition.upgrade</code> attribute. 
	 * @return the upgrade
	 */
	public boolean isUpgradeAsPrimitive()
	{
		return isUpgradeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.upgrade</code> attribute. 
	 * @param value the upgrade
	 */
	public void setUpgrade(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, UPGRADE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.upgrade</code> attribute. 
	 * @param value the upgrade
	 */
	public void setUpgrade(final Boolean value)
	{
		setUpgrade( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.upgrade</code> attribute. 
	 * @param value the upgrade
	 */
	public void setUpgrade(final SessionContext ctx, final boolean value)
	{
		setUpgrade( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaySupplierAdvanceDefinition.upgrade</code> attribute. 
	 * @param value the upgrade
	 */
	public void setUpgrade(final boolean value)
	{
		setUpgrade( getSession().getSessionContext(), value );
	}
	
}
