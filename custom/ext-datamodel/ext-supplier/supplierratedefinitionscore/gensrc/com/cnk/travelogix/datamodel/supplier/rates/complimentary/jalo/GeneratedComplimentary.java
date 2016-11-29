/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.complimentary.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.complimentary.jalo.Complimentary Complimentary}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedComplimentary extends AbstractTravelogixSupplierOffer
{
	/** Qualifier of the <code>Complimentary.minPaxOrNight</code> attribute **/
	public static final String MINPAXORNIGHT = "minPaxOrNight";
	/** Qualifier of the <code>Complimentary.passengerType</code> attribute **/
	public static final String PASSENGERTYPE = "passengerType";
	/** Qualifier of the <code>Complimentary.applicableDays</code> attribute **/
	public static final String APPLICABLEDAYS = "applicableDays";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixSupplierOffer.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MINPAXORNIGHT, AttributeMode.INITIAL);
		tmp.put(PASSENGERTYPE, AttributeMode.INITIAL);
		tmp.put(APPLICABLEDAYS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Complimentary.applicableDays</code> attribute.
	 * @return the applicableDays
	 */
	public Collection<EnumerationValue> getApplicableDays(final SessionContext ctx)
	{
		Collection<EnumerationValue> coll = (Collection<EnumerationValue>)getProperty( ctx, APPLICABLEDAYS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Complimentary.applicableDays</code> attribute.
	 * @return the applicableDays
	 */
	public Collection<EnumerationValue> getApplicableDays()
	{
		return getApplicableDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Complimentary.applicableDays</code> attribute. 
	 * @param value the applicableDays
	 */
	public void setApplicableDays(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		setProperty(ctx, APPLICABLEDAYS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Complimentary.applicableDays</code> attribute. 
	 * @param value the applicableDays
	 */
	public void setApplicableDays(final Collection<EnumerationValue> value)
	{
		setApplicableDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Complimentary.minPaxOrNight</code> attribute.
	 * @return the minPaxOrNight
	 */
	public Integer getMinPaxOrNight(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MINPAXORNIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Complimentary.minPaxOrNight</code> attribute.
	 * @return the minPaxOrNight
	 */
	public Integer getMinPaxOrNight()
	{
		return getMinPaxOrNight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Complimentary.minPaxOrNight</code> attribute. 
	 * @return the minPaxOrNight
	 */
	public int getMinPaxOrNightAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMinPaxOrNight( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Complimentary.minPaxOrNight</code> attribute. 
	 * @return the minPaxOrNight
	 */
	public int getMinPaxOrNightAsPrimitive()
	{
		return getMinPaxOrNightAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Complimentary.minPaxOrNight</code> attribute. 
	 * @param value the minPaxOrNight
	 */
	public void setMinPaxOrNight(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MINPAXORNIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Complimentary.minPaxOrNight</code> attribute. 
	 * @param value the minPaxOrNight
	 */
	public void setMinPaxOrNight(final Integer value)
	{
		setMinPaxOrNight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Complimentary.minPaxOrNight</code> attribute. 
	 * @param value the minPaxOrNight
	 */
	public void setMinPaxOrNight(final SessionContext ctx, final int value)
	{
		setMinPaxOrNight( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Complimentary.minPaxOrNight</code> attribute. 
	 * @param value the minPaxOrNight
	 */
	public void setMinPaxOrNight(final int value)
	{
		setMinPaxOrNight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Complimentary.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PASSENGERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Complimentary.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType()
	{
		return getPassengerType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Complimentary.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PASSENGERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Complimentary.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final EnumerationValue value)
	{
		setPassengerType( getSession().getSessionContext(), value );
	}
	
}
