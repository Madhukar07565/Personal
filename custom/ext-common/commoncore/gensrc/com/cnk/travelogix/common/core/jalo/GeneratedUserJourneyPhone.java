/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem UserJourneyPhone}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedUserJourneyPhone extends GenericItem
{
	/** Qualifier of the <code>UserJourneyPhone.countryCode</code> attribute **/
	public static final String COUNTRYCODE = "countryCode";
	/** Qualifier of the <code>UserJourneyPhone.areaCode</code> attribute **/
	public static final String AREACODE = "areaCode";
	/** Qualifier of the <code>UserJourneyPhone.number</code> attribute **/
	public static final String NUMBER = "number";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COUNTRYCODE, AttributeMode.INITIAL);
		tmp.put(AREACODE, AttributeMode.INITIAL);
		tmp.put(NUMBER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyPhone.areaCode</code> attribute.
	 * @return the areaCode
	 */
	public Integer getAreaCode(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, AREACODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyPhone.areaCode</code> attribute.
	 * @return the areaCode
	 */
	public Integer getAreaCode()
	{
		return getAreaCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyPhone.areaCode</code> attribute. 
	 * @return the areaCode
	 */
	public int getAreaCodeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAreaCode( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyPhone.areaCode</code> attribute. 
	 * @return the areaCode
	 */
	public int getAreaCodeAsPrimitive()
	{
		return getAreaCodeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyPhone.areaCode</code> attribute. 
	 * @param value the areaCode
	 */
	public void setAreaCode(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, AREACODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyPhone.areaCode</code> attribute. 
	 * @param value the areaCode
	 */
	public void setAreaCode(final Integer value)
	{
		setAreaCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyPhone.areaCode</code> attribute. 
	 * @param value the areaCode
	 */
	public void setAreaCode(final SessionContext ctx, final int value)
	{
		setAreaCode( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyPhone.areaCode</code> attribute. 
	 * @param value the areaCode
	 */
	public void setAreaCode(final int value)
	{
		setAreaCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyPhone.countryCode</code> attribute.
	 * @return the countryCode
	 */
	public Integer getCountryCode(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, COUNTRYCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyPhone.countryCode</code> attribute.
	 * @return the countryCode
	 */
	public Integer getCountryCode()
	{
		return getCountryCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyPhone.countryCode</code> attribute. 
	 * @return the countryCode
	 */
	public int getCountryCodeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCountryCode( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyPhone.countryCode</code> attribute. 
	 * @return the countryCode
	 */
	public int getCountryCodeAsPrimitive()
	{
		return getCountryCodeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyPhone.countryCode</code> attribute. 
	 * @param value the countryCode
	 */
	public void setCountryCode(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, COUNTRYCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyPhone.countryCode</code> attribute. 
	 * @param value the countryCode
	 */
	public void setCountryCode(final Integer value)
	{
		setCountryCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyPhone.countryCode</code> attribute. 
	 * @param value the countryCode
	 */
	public void setCountryCode(final SessionContext ctx, final int value)
	{
		setCountryCode( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyPhone.countryCode</code> attribute. 
	 * @param value the countryCode
	 */
	public void setCountryCode(final int value)
	{
		setCountryCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyPhone.number</code> attribute.
	 * @return the number
	 */
	public Long getNumber(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, NUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyPhone.number</code> attribute.
	 * @return the number
	 */
	public Long getNumber()
	{
		return getNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyPhone.number</code> attribute. 
	 * @return the number
	 */
	public long getNumberAsPrimitive(final SessionContext ctx)
	{
		Long value = getNumber( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyPhone.number</code> attribute. 
	 * @return the number
	 */
	public long getNumberAsPrimitive()
	{
		return getNumberAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyPhone.number</code> attribute. 
	 * @param value the number
	 */
	public void setNumber(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, NUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyPhone.number</code> attribute. 
	 * @param value the number
	 */
	public void setNumber(final Long value)
	{
		setNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyPhone.number</code> attribute. 
	 * @param value the number
	 */
	public void setNumber(final SessionContext ctx, final long value)
	{
		setNumber( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyPhone.number</code> attribute. 
	 * @param value the number
	 */
	public void setNumber(final long value)
	{
		setNumber( getSession().getSessionContext(), value );
	}
	
}
