/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities;

import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer;
import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionsactivitiesConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.NightOrActivityAncillaryDiscountOffer NightOrActivityAncillaryDiscountOffer}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedNightOrActivityAncillaryDiscountOffer extends AbstractTravelogixSupplierOffer
{
	/** Qualifier of the <code>NightOrActivityAncillaryDiscountOffer.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>NightOrActivityAncillaryDiscountOffer.noOfActivitiesPurchased</code> attribute **/
	public static final String NOOFACTIVITIESPURCHASED = "noOfActivitiesPurchased";
	/** Qualifier of the <code>NightOrActivityAncillaryDiscountOffer.minPax</code> attribute **/
	public static final String MINPAX = "minPax";
	/** Qualifier of the <code>NightOrActivityAncillaryDiscountOffer.maxPax</code> attribute **/
	public static final String MAXPAX = "maxPax";
	/** Qualifier of the <code>NightOrActivityAncillaryDiscountOffer.passengerType</code> attribute **/
	public static final String PASSENGERTYPE = "passengerType";
	/** Qualifier of the <code>NightOrActivityAncillaryDiscountOffer.discountCalculatedOn</code> attribute **/
	public static final String DISCOUNTCALCULATEDON = "discountCalculatedOn";
	/** Qualifier of the <code>NightOrActivityAncillaryDiscountOffer.noOfActivitiesFOC</code> attribute **/
	public static final String NOOFACTIVITIESFOC = "noOfActivitiesFOC";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixSupplierOffer.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(NOOFACTIVITIESPURCHASED, AttributeMode.INITIAL);
		tmp.put(MINPAX, AttributeMode.INITIAL);
		tmp.put(MAXPAX, AttributeMode.INITIAL);
		tmp.put(PASSENGERTYPE, AttributeMode.INITIAL);
		tmp.put(DISCOUNTCALCULATEDON, AttributeMode.INITIAL);
		tmp.put(NOOFACTIVITIESFOC, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NightOrActivityAncillaryDiscountOffer.city</code> attribute.
	 * @return the city
	 */
	public City getCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NightOrActivityAncillaryDiscountOffer.city</code> attribute.
	 * @return the city
	 */
	public City getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NightOrActivityAncillaryDiscountOffer.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NightOrActivityAncillaryDiscountOffer.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final City value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NightOrActivityAncillaryDiscountOffer.discountCalculatedOn</code> attribute.
	 * @return the discountCalculatedOn
	 */
	public EnumerationValue getDiscountCalculatedOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DISCOUNTCALCULATEDON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NightOrActivityAncillaryDiscountOffer.discountCalculatedOn</code> attribute.
	 * @return the discountCalculatedOn
	 */
	public EnumerationValue getDiscountCalculatedOn()
	{
		return getDiscountCalculatedOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NightOrActivityAncillaryDiscountOffer.discountCalculatedOn</code> attribute. 
	 * @param value the discountCalculatedOn
	 */
	public void setDiscountCalculatedOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DISCOUNTCALCULATEDON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NightOrActivityAncillaryDiscountOffer.discountCalculatedOn</code> attribute. 
	 * @param value the discountCalculatedOn
	 */
	public void setDiscountCalculatedOn(final EnumerationValue value)
	{
		setDiscountCalculatedOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NightOrActivityAncillaryDiscountOffer.maxPax</code> attribute.
	 * @return the maxPax
	 */
	public Integer getMaxPax(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAXPAX);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NightOrActivityAncillaryDiscountOffer.maxPax</code> attribute.
	 * @return the maxPax
	 */
	public Integer getMaxPax()
	{
		return getMaxPax( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NightOrActivityAncillaryDiscountOffer.maxPax</code> attribute. 
	 * @return the maxPax
	 */
	public int getMaxPaxAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaxPax( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NightOrActivityAncillaryDiscountOffer.maxPax</code> attribute. 
	 * @return the maxPax
	 */
	public int getMaxPaxAsPrimitive()
	{
		return getMaxPaxAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NightOrActivityAncillaryDiscountOffer.maxPax</code> attribute. 
	 * @param value the maxPax
	 */
	public void setMaxPax(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAXPAX,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NightOrActivityAncillaryDiscountOffer.maxPax</code> attribute. 
	 * @param value the maxPax
	 */
	public void setMaxPax(final Integer value)
	{
		setMaxPax( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NightOrActivityAncillaryDiscountOffer.maxPax</code> attribute. 
	 * @param value the maxPax
	 */
	public void setMaxPax(final SessionContext ctx, final int value)
	{
		setMaxPax( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NightOrActivityAncillaryDiscountOffer.maxPax</code> attribute. 
	 * @param value the maxPax
	 */
	public void setMaxPax(final int value)
	{
		setMaxPax( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NightOrActivityAncillaryDiscountOffer.minPax</code> attribute.
	 * @return the minPax
	 */
	public Integer getMinPax(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MINPAX);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NightOrActivityAncillaryDiscountOffer.minPax</code> attribute.
	 * @return the minPax
	 */
	public Integer getMinPax()
	{
		return getMinPax( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NightOrActivityAncillaryDiscountOffer.minPax</code> attribute. 
	 * @return the minPax
	 */
	public int getMinPaxAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMinPax( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NightOrActivityAncillaryDiscountOffer.minPax</code> attribute. 
	 * @return the minPax
	 */
	public int getMinPaxAsPrimitive()
	{
		return getMinPaxAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NightOrActivityAncillaryDiscountOffer.minPax</code> attribute. 
	 * @param value the minPax
	 */
	public void setMinPax(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MINPAX,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NightOrActivityAncillaryDiscountOffer.minPax</code> attribute. 
	 * @param value the minPax
	 */
	public void setMinPax(final Integer value)
	{
		setMinPax( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NightOrActivityAncillaryDiscountOffer.minPax</code> attribute. 
	 * @param value the minPax
	 */
	public void setMinPax(final SessionContext ctx, final int value)
	{
		setMinPax( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NightOrActivityAncillaryDiscountOffer.minPax</code> attribute. 
	 * @param value the minPax
	 */
	public void setMinPax(final int value)
	{
		setMinPax( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NightOrActivityAncillaryDiscountOffer.noOfActivitiesFOC</code> attribute.
	 * @return the noOfActivitiesFOC
	 */
	public Integer getNoOfActivitiesFOC(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFACTIVITIESFOC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NightOrActivityAncillaryDiscountOffer.noOfActivitiesFOC</code> attribute.
	 * @return the noOfActivitiesFOC
	 */
	public Integer getNoOfActivitiesFOC()
	{
		return getNoOfActivitiesFOC( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NightOrActivityAncillaryDiscountOffer.noOfActivitiesFOC</code> attribute. 
	 * @return the noOfActivitiesFOC
	 */
	public int getNoOfActivitiesFOCAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfActivitiesFOC( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NightOrActivityAncillaryDiscountOffer.noOfActivitiesFOC</code> attribute. 
	 * @return the noOfActivitiesFOC
	 */
	public int getNoOfActivitiesFOCAsPrimitive()
	{
		return getNoOfActivitiesFOCAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NightOrActivityAncillaryDiscountOffer.noOfActivitiesFOC</code> attribute. 
	 * @param value the noOfActivitiesFOC
	 */
	public void setNoOfActivitiesFOC(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFACTIVITIESFOC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NightOrActivityAncillaryDiscountOffer.noOfActivitiesFOC</code> attribute. 
	 * @param value the noOfActivitiesFOC
	 */
	public void setNoOfActivitiesFOC(final Integer value)
	{
		setNoOfActivitiesFOC( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NightOrActivityAncillaryDiscountOffer.noOfActivitiesFOC</code> attribute. 
	 * @param value the noOfActivitiesFOC
	 */
	public void setNoOfActivitiesFOC(final SessionContext ctx, final int value)
	{
		setNoOfActivitiesFOC( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NightOrActivityAncillaryDiscountOffer.noOfActivitiesFOC</code> attribute. 
	 * @param value the noOfActivitiesFOC
	 */
	public void setNoOfActivitiesFOC(final int value)
	{
		setNoOfActivitiesFOC( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NightOrActivityAncillaryDiscountOffer.noOfActivitiesPurchased</code> attribute.
	 * @return the noOfActivitiesPurchased
	 */
	public Integer getNoOfActivitiesPurchased(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFACTIVITIESPURCHASED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NightOrActivityAncillaryDiscountOffer.noOfActivitiesPurchased</code> attribute.
	 * @return the noOfActivitiesPurchased
	 */
	public Integer getNoOfActivitiesPurchased()
	{
		return getNoOfActivitiesPurchased( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NightOrActivityAncillaryDiscountOffer.noOfActivitiesPurchased</code> attribute. 
	 * @return the noOfActivitiesPurchased
	 */
	public int getNoOfActivitiesPurchasedAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfActivitiesPurchased( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NightOrActivityAncillaryDiscountOffer.noOfActivitiesPurchased</code> attribute. 
	 * @return the noOfActivitiesPurchased
	 */
	public int getNoOfActivitiesPurchasedAsPrimitive()
	{
		return getNoOfActivitiesPurchasedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NightOrActivityAncillaryDiscountOffer.noOfActivitiesPurchased</code> attribute. 
	 * @param value the noOfActivitiesPurchased
	 */
	public void setNoOfActivitiesPurchased(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFACTIVITIESPURCHASED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NightOrActivityAncillaryDiscountOffer.noOfActivitiesPurchased</code> attribute. 
	 * @param value the noOfActivitiesPurchased
	 */
	public void setNoOfActivitiesPurchased(final Integer value)
	{
		setNoOfActivitiesPurchased( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NightOrActivityAncillaryDiscountOffer.noOfActivitiesPurchased</code> attribute. 
	 * @param value the noOfActivitiesPurchased
	 */
	public void setNoOfActivitiesPurchased(final SessionContext ctx, final int value)
	{
		setNoOfActivitiesPurchased( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NightOrActivityAncillaryDiscountOffer.noOfActivitiesPurchased</code> attribute. 
	 * @param value the noOfActivitiesPurchased
	 */
	public void setNoOfActivitiesPurchased(final int value)
	{
		setNoOfActivitiesPurchased( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NightOrActivityAncillaryDiscountOffer.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PASSENGERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NightOrActivityAncillaryDiscountOffer.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType()
	{
		return getPassengerType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NightOrActivityAncillaryDiscountOffer.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PASSENGERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NightOrActivityAncillaryDiscountOffer.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final EnumerationValue value)
	{
		setPassengerType( getSession().getSessionContext(), value );
	}
	
}
