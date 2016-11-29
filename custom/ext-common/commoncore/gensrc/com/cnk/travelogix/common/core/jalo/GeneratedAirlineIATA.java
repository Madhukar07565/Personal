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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem AirlineIATA}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAirlineIATA extends GenericItem
{
	/** Qualifier of the <code>AirlineIATA.airlineName</code> attribute **/
	public static final String AIRLINENAME = "airlineName";
	/** Qualifier of the <code>AirlineIATA.accountingCode</code> attribute **/
	public static final String ACCOUNTINGCODE = "accountingCode";
	/** Qualifier of the <code>AirlineIATA.airlinePrefix</code> attribute **/
	public static final String AIRLINEPREFIX = "airlinePrefix";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(AIRLINENAME, AttributeMode.INITIAL);
		tmp.put(ACCOUNTINGCODE, AttributeMode.INITIAL);
		tmp.put(AIRLINEPREFIX, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirlineIATA.accountingCode</code> attribute.
	 * @return the accountingCode - Accounting Code
	 */
	public String getAccountingCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ACCOUNTINGCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirlineIATA.accountingCode</code> attribute.
	 * @return the accountingCode - Accounting Code
	 */
	public String getAccountingCode()
	{
		return getAccountingCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirlineIATA.accountingCode</code> attribute. 
	 * @param value the accountingCode - Accounting Code
	 */
	public void setAccountingCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ACCOUNTINGCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirlineIATA.accountingCode</code> attribute. 
	 * @param value the accountingCode - Accounting Code
	 */
	public void setAccountingCode(final String value)
	{
		setAccountingCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirlineIATA.airlineName</code> attribute.
	 * @return the airlineName - airline Name
	 */
	public String getAirlineName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AIRLINENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirlineIATA.airlineName</code> attribute.
	 * @return the airlineName - airline Name
	 */
	public String getAirlineName()
	{
		return getAirlineName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirlineIATA.airlineName</code> attribute. 
	 * @param value the airlineName - airline Name
	 */
	public void setAirlineName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AIRLINENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirlineIATA.airlineName</code> attribute. 
	 * @param value the airlineName - airline Name
	 */
	public void setAirlineName(final String value)
	{
		setAirlineName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirlineIATA.airlinePrefix</code> attribute.
	 * @return the airlinePrefix - airline Prefix
	 */
	public String getAirlinePrefix(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AIRLINEPREFIX);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirlineIATA.airlinePrefix</code> attribute.
	 * @return the airlinePrefix - airline Prefix
	 */
	public String getAirlinePrefix()
	{
		return getAirlinePrefix( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirlineIATA.airlinePrefix</code> attribute. 
	 * @param value the airlinePrefix - airline Prefix
	 */
	public void setAirlinePrefix(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AIRLINEPREFIX,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirlineIATA.airlinePrefix</code> attribute. 
	 * @param value the airlinePrefix - airline Prefix
	 */
	public void setAirlinePrefix(final String value)
	{
		setAirlinePrefix( getSession().getSessionContext(), value );
	}
	
}
