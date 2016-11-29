/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.suppliers.jalo;

import com.cnk.travelogix.suppliers.constants.SuppliersConstants;
import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.suppliers.jalo.CheckFileStatusCronJob CheckFileStatusCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCheckFileStatusCronJob extends CronJob
{
	/** Qualifier of the <code>CheckFileStatusCronJob.lastRunTime</code> attribute **/
	public static final String LASTRUNTIME = "lastRunTime";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(LASTRUNTIME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CheckFileStatusCronJob.lastRunTime</code> attribute.
	 * @return the lastRunTime
	 */
	public Date getLastRunTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, LASTRUNTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CheckFileStatusCronJob.lastRunTime</code> attribute.
	 * @return the lastRunTime
	 */
	public Date getLastRunTime()
	{
		return getLastRunTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CheckFileStatusCronJob.lastRunTime</code> attribute. 
	 * @param value the lastRunTime
	 */
	public void setLastRunTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, LASTRUNTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CheckFileStatusCronJob.lastRunTime</code> attribute. 
	 * @param value the lastRunTime
	 */
	public void setLastRunTime(final Date value)
	{
		setLastRunTime( getSession().getSessionContext(), value );
	}
	
}
