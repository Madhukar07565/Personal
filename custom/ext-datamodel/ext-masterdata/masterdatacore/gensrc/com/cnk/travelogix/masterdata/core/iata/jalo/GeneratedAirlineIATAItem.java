/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.masterdata.core.iata.jalo;

import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.iata.jalo.AbstractIATAItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.masterdata.core.iata.jalo.AirlineIATAItem AirlineIATAItem}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAirlineIATAItem extends AbstractIATAItem
{
	/** Qualifier of the <code>AirlineIATAItem.accountingCode</code> attribute **/
	public static final String ACCOUNTINGCODE = "accountingCode";
	/** Qualifier of the <code>AirlineIATAItem.prefixCode</code> attribute **/
	public static final String PREFIXCODE = "prefixCode";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractIATAItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ACCOUNTINGCODE, AttributeMode.INITIAL);
		tmp.put(PREFIXCODE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirlineIATAItem.accountingCode</code> attribute.
	 * @return the accountingCode - Accounting code (PAX) of the airline
	 */
	public String getAccountingCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ACCOUNTINGCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirlineIATAItem.accountingCode</code> attribute.
	 * @return the accountingCode - Accounting code (PAX) of the airline
	 */
	public String getAccountingCode()
	{
		return getAccountingCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirlineIATAItem.accountingCode</code> attribute. 
	 * @param value the accountingCode - Accounting code (PAX) of the airline
	 */
	public void setAccountingCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ACCOUNTINGCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirlineIATAItem.accountingCode</code> attribute. 
	 * @param value the accountingCode - Accounting code (PAX) of the airline
	 */
	public void setAccountingCode(final String value)
	{
		setAccountingCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirlineIATAItem.prefixCode</code> attribute.
	 * @return the prefixCode - Prefix code of the airline
	 */
	public String getPrefixCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PREFIXCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirlineIATAItem.prefixCode</code> attribute.
	 * @return the prefixCode - Prefix code of the airline
	 */
	public String getPrefixCode()
	{
		return getPrefixCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirlineIATAItem.prefixCode</code> attribute. 
	 * @param value the prefixCode - Prefix code of the airline
	 */
	public void setPrefixCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PREFIXCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirlineIATAItem.prefixCode</code> attribute. 
	 * @param value the prefixCode - Prefix code of the airline
	 */
	public void setPrefixCode(final String value)
	{
		setPrefixCode( getSession().getSessionContext(), value );
	}
	
}
