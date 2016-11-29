/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.company.commercials.core.jalo.definition;

import com.cnk.travelogix.client.commercials.constants.ClientcommercialsConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.company.commercials.core.jalo.definition.CompanyClientPCC CompanyClientPCC}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCompanyClientPCC extends GenericItem
{
	/** Qualifier of the <code>CompanyClientPCC.mainOrmirrorPcc</code> attribute **/
	public static final String MAINORMIRRORPCC = "mainOrmirrorPcc";
	/** Qualifier of the <code>CompanyClientPCC.usage</code> attribute **/
	public static final String USAGE = "usage";
	/** Qualifier of the <code>CompanyClientPCC.hap</code> attribute **/
	public static final String HAP = "hap";
	/** Qualifier of the <code>CompanyClientPCC.priority</code> attribute **/
	public static final String PRIORITY = "priority";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(MAINORMIRRORPCC, AttributeMode.INITIAL);
		tmp.put(USAGE, AttributeMode.INITIAL);
		tmp.put(HAP, AttributeMode.INITIAL);
		tmp.put(PRIORITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyClientPCC.hap</code> attribute.
	 * @return the hap
	 */
	public String getHap(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HAP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyClientPCC.hap</code> attribute.
	 * @return the hap
	 */
	public String getHap()
	{
		return getHap( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyClientPCC.hap</code> attribute. 
	 * @param value the hap
	 */
	public void setHap(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HAP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyClientPCC.hap</code> attribute. 
	 * @param value the hap
	 */
	public void setHap(final String value)
	{
		setHap( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyClientPCC.mainOrmirrorPcc</code> attribute.
	 * @return the mainOrmirrorPcc
	 */
	public String getMainOrmirrorPcc(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MAINORMIRRORPCC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyClientPCC.mainOrmirrorPcc</code> attribute.
	 * @return the mainOrmirrorPcc
	 */
	public String getMainOrmirrorPcc()
	{
		return getMainOrmirrorPcc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyClientPCC.mainOrmirrorPcc</code> attribute. 
	 * @param value the mainOrmirrorPcc
	 */
	public void setMainOrmirrorPcc(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MAINORMIRRORPCC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyClientPCC.mainOrmirrorPcc</code> attribute. 
	 * @param value the mainOrmirrorPcc
	 */
	public void setMainOrmirrorPcc(final String value)
	{
		setMainOrmirrorPcc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyClientPCC.priority</code> attribute.
	 * @return the priority
	 */
	public String getPriority(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRIORITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyClientPCC.priority</code> attribute.
	 * @return the priority
	 */
	public String getPriority()
	{
		return getPriority( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyClientPCC.priority</code> attribute. 
	 * @param value the priority
	 */
	public void setPriority(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRIORITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyClientPCC.priority</code> attribute. 
	 * @param value the priority
	 */
	public void setPriority(final String value)
	{
		setPriority( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyClientPCC.usage</code> attribute.
	 * @return the usage
	 */
	public String getUsage(final SessionContext ctx)
	{
		return (String)getProperty( ctx, USAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyClientPCC.usage</code> attribute.
	 * @return the usage
	 */
	public String getUsage()
	{
		return getUsage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyClientPCC.usage</code> attribute. 
	 * @param value the usage
	 */
	public void setUsage(final SessionContext ctx, final String value)
	{
		setProperty(ctx, USAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyClientPCC.usage</code> attribute. 
	 * @param value the usage
	 */
	public void setUsage(final String value)
	{
		setUsage( getSession().getSessionContext(), value );
	}
	
}
