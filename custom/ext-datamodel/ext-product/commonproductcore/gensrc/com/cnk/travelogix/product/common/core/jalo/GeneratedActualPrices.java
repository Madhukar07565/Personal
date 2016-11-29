/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.ActualPrices ActualPrices}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActualPrices extends GenericItem
{
	/** Qualifier of the <code>ActualPrices.onlineFrom</code> attribute **/
	public static final String ONLINEFROM = "onlineFrom";
	/** Qualifier of the <code>ActualPrices.offlineFrom</code> attribute **/
	public static final String OFFLINEFROM = "offlineFrom";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ONLINEFROM, AttributeMode.INITIAL);
		tmp.put(OFFLINEFROM, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActualPrices.offlineFrom</code> attribute.
	 * @return the offlineFrom - Offline from date
	 */
	public Date getOfflineFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, OFFLINEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActualPrices.offlineFrom</code> attribute.
	 * @return the offlineFrom - Offline from date
	 */
	public Date getOfflineFrom()
	{
		return getOfflineFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActualPrices.offlineFrom</code> attribute. 
	 * @param value the offlineFrom - Offline from date
	 */
	public void setOfflineFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, OFFLINEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActualPrices.offlineFrom</code> attribute. 
	 * @param value the offlineFrom - Offline from date
	 */
	public void setOfflineFrom(final Date value)
	{
		setOfflineFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActualPrices.onlineFrom</code> attribute.
	 * @return the onlineFrom - Online from date
	 */
	public Date getOnlineFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ONLINEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActualPrices.onlineFrom</code> attribute.
	 * @return the onlineFrom - Online from date
	 */
	public Date getOnlineFrom()
	{
		return getOnlineFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActualPrices.onlineFrom</code> attribute. 
	 * @param value the onlineFrom - Online from date
	 */
	public void setOnlineFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ONLINEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActualPrices.onlineFrom</code> attribute. 
	 * @param value the onlineFrom - Online from date
	 */
	public void setOnlineFrom(final Date value)
	{
		setOnlineFrom( getSession().getSessionContext(), value );
	}
	
}
