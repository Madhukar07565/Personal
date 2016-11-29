/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.order.payment.PaymentInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.order.payment.PaymentInfo CodPaymentInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCodPaymentInfo extends PaymentInfo
{
	/** Qualifier of the <code>CodPaymentInfo.street</code> attribute **/
	public static final String STREET = "street";
	/** Qualifier of the <code>CodPaymentInfo.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>CodPaymentInfo.state</code> attribute **/
	public static final String STATE = "state";
	/** Qualifier of the <code>CodPaymentInfo.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>CodPaymentInfo.postalcode</code> attribute **/
	public static final String POSTALCODE = "postalcode";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(PaymentInfo.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(STREET, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(STATE, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(POSTALCODE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodPaymentInfo.city</code> attribute.
	 * @return the city
	 */
	public String getCity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodPaymentInfo.city</code> attribute.
	 * @return the city
	 */
	public String getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodPaymentInfo.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodPaymentInfo.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final String value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodPaymentInfo.country</code> attribute.
	 * @return the country
	 */
	public String getCountry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodPaymentInfo.country</code> attribute.
	 * @return the country
	 */
	public String getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodPaymentInfo.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodPaymentInfo.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final String value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodPaymentInfo.postalcode</code> attribute.
	 * @return the postalcode
	 */
	public String getPostalcode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, POSTALCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodPaymentInfo.postalcode</code> attribute.
	 * @return the postalcode
	 */
	public String getPostalcode()
	{
		return getPostalcode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodPaymentInfo.postalcode</code> attribute. 
	 * @param value the postalcode
	 */
	public void setPostalcode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, POSTALCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodPaymentInfo.postalcode</code> attribute. 
	 * @param value the postalcode
	 */
	public void setPostalcode(final String value)
	{
		setPostalcode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodPaymentInfo.state</code> attribute.
	 * @return the state
	 */
	public String getState(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodPaymentInfo.state</code> attribute.
	 * @return the state
	 */
	public String getState()
	{
		return getState( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodPaymentInfo.state</code> attribute. 
	 * @param value the state
	 */
	public void setState(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodPaymentInfo.state</code> attribute. 
	 * @param value the state
	 */
	public void setState(final String value)
	{
		setState( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodPaymentInfo.street</code> attribute.
	 * @return the street
	 */
	public String getStreet(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STREET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodPaymentInfo.street</code> attribute.
	 * @return the street
	 */
	public String getStreet()
	{
		return getStreet( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodPaymentInfo.street</code> attribute. 
	 * @param value the street
	 */
	public void setStreet(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STREET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodPaymentInfo.street</code> attribute. 
	 * @param value the street
	 */
	public void setStreet(final String value)
	{
		setStreet( getSession().getSessionContext(), value );
	}
	
}
