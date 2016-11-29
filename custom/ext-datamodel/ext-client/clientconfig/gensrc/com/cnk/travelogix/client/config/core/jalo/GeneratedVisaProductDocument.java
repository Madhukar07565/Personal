/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.jalo.AbstractProductDocument;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.VisaProductDocument VisaProductDocument}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedVisaProductDocument extends AbstractProductDocument
{
	/** Qualifier of the <code>VisaProductDocument.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>VisaProductDocument.entryType</code> attribute **/
	public static final String ENTRYTYPE = "entryType";
	/** Qualifier of the <code>VisaProductDocument.duration</code> attribute **/
	public static final String DURATION = "duration";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractProductDocument.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(ENTRYTYPE, AttributeMode.INITIAL);
		tmp.put(DURATION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaProductDocument.country</code> attribute.
	 * @return the country - Visa Product Details
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaProductDocument.country</code> attribute.
	 * @return the country - Visa Product Details
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaProductDocument.country</code> attribute. 
	 * @param value the country - Visa Product Details
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaProductDocument.country</code> attribute. 
	 * @param value the country - Visa Product Details
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaProductDocument.duration</code> attribute.
	 * @return the duration - Visa Product Details
	 */
	public Double getDuration(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, DURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaProductDocument.duration</code> attribute.
	 * @return the duration - Visa Product Details
	 */
	public Double getDuration()
	{
		return getDuration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaProductDocument.duration</code> attribute. 
	 * @return the duration - Visa Product Details
	 */
	public double getDurationAsPrimitive(final SessionContext ctx)
	{
		Double value = getDuration( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaProductDocument.duration</code> attribute. 
	 * @return the duration - Visa Product Details
	 */
	public double getDurationAsPrimitive()
	{
		return getDurationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaProductDocument.duration</code> attribute. 
	 * @param value the duration - Visa Product Details
	 */
	public void setDuration(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, DURATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaProductDocument.duration</code> attribute. 
	 * @param value the duration - Visa Product Details
	 */
	public void setDuration(final Double value)
	{
		setDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaProductDocument.duration</code> attribute. 
	 * @param value the duration - Visa Product Details
	 */
	public void setDuration(final SessionContext ctx, final double value)
	{
		setDuration( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaProductDocument.duration</code> attribute. 
	 * @param value the duration - Visa Product Details
	 */
	public void setDuration(final double value)
	{
		setDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaProductDocument.entryType</code> attribute.
	 * @return the entryType - Visa Product Details
	 */
	public EnumerationValue getEntryType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ENTRYTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaProductDocument.entryType</code> attribute.
	 * @return the entryType - Visa Product Details
	 */
	public EnumerationValue getEntryType()
	{
		return getEntryType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaProductDocument.entryType</code> attribute. 
	 * @param value the entryType - Visa Product Details
	 */
	public void setEntryType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ENTRYTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaProductDocument.entryType</code> attribute. 
	 * @param value the entryType - Visa Product Details
	 */
	public void setEntryType(final EnumerationValue value)
	{
		setEntryType( getSession().getSessionContext(), value );
	}
	
}
