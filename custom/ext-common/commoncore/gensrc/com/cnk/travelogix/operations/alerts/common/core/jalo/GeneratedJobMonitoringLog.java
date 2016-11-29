/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.operations.alerts.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.operations.alerts.common.core.jalo.JobMonitoringLog JobMonitoringLog}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedJobMonitoringLog extends GenericItem
{
	/** Qualifier of the <code>JobMonitoringLog.jobId</code> attribute **/
	public static final String JOBID = "jobId";
	/** Qualifier of the <code>JobMonitoringLog.alertName</code> attribute **/
	public static final String ALERTNAME = "alertName";
	/** Qualifier of the <code>JobMonitoringLog.company</code> attribute **/
	public static final String COMPANY = "company";
	/** Qualifier of the <code>JobMonitoringLog.jobStatus</code> attribute **/
	public static final String JOBSTATUS = "jobStatus";
	/** Qualifier of the <code>JobMonitoringLog.jobTriggeredOn</code> attribute **/
	public static final String JOBTRIGGEREDON = "jobTriggeredOn";
	/** Qualifier of the <code>JobMonitoringLog.jobCompletedOn</code> attribute **/
	public static final String JOBCOMPLETEDON = "jobCompletedOn";
	/** Qualifier of the <code>JobMonitoringLog.email</code> attribute **/
	public static final String EMAIL = "email";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(JOBID, AttributeMode.INITIAL);
		tmp.put(ALERTNAME, AttributeMode.INITIAL);
		tmp.put(COMPANY, AttributeMode.INITIAL);
		tmp.put(JOBSTATUS, AttributeMode.INITIAL);
		tmp.put(JOBTRIGGEREDON, AttributeMode.INITIAL);
		tmp.put(JOBCOMPLETEDON, AttributeMode.INITIAL);
		tmp.put(EMAIL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JobMonitoringLog.alertName</code> attribute.
	 * @return the alertName - Name for the Notification
	 */
	public String getAlertName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ALERTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JobMonitoringLog.alertName</code> attribute.
	 * @return the alertName - Name for the Notification
	 */
	public String getAlertName()
	{
		return getAlertName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JobMonitoringLog.alertName</code> attribute. 
	 * @param value the alertName - Name for the Notification
	 */
	public void setAlertName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ALERTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JobMonitoringLog.alertName</code> attribute. 
	 * @param value the alertName - Name for the Notification
	 */
	public void setAlertName(final String value)
	{
		setAlertName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JobMonitoringLog.company</code> attribute.
	 * @return the company - Company
	 */
	public String getCompany(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JobMonitoringLog.company</code> attribute.
	 * @return the company - Company
	 */
	public String getCompany()
	{
		return getCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JobMonitoringLog.company</code> attribute. 
	 * @param value the company - Company
	 */
	public void setCompany(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMPANY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JobMonitoringLog.company</code> attribute. 
	 * @param value the company - Company
	 */
	public void setCompany(final String value)
	{
		setCompany( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JobMonitoringLog.email</code> attribute.
	 * @return the email - Email id for sending notification
	 */
	public String getEmail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JobMonitoringLog.email</code> attribute.
	 * @return the email - Email id for sending notification
	 */
	public String getEmail()
	{
		return getEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JobMonitoringLog.email</code> attribute. 
	 * @param value the email - Email id for sending notification
	 */
	public void setEmail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JobMonitoringLog.email</code> attribute. 
	 * @param value the email - Email id for sending notification
	 */
	public void setEmail(final String value)
	{
		setEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JobMonitoringLog.jobCompletedOn</code> attribute.
	 * @return the jobCompletedOn - Completed time for workflow execution
	 */
	public Date getJobCompletedOn(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, JOBCOMPLETEDON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JobMonitoringLog.jobCompletedOn</code> attribute.
	 * @return the jobCompletedOn - Completed time for workflow execution
	 */
	public Date getJobCompletedOn()
	{
		return getJobCompletedOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JobMonitoringLog.jobCompletedOn</code> attribute. 
	 * @param value the jobCompletedOn - Completed time for workflow execution
	 */
	public void setJobCompletedOn(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, JOBCOMPLETEDON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JobMonitoringLog.jobCompletedOn</code> attribute. 
	 * @param value the jobCompletedOn - Completed time for workflow execution
	 */
	public void setJobCompletedOn(final Date value)
	{
		setJobCompletedOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JobMonitoringLog.jobId</code> attribute.
	 * @return the jobId - Id for the Notification
	 */
	public String getJobId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, JOBID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JobMonitoringLog.jobId</code> attribute.
	 * @return the jobId - Id for the Notification
	 */
	public String getJobId()
	{
		return getJobId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JobMonitoringLog.jobId</code> attribute. 
	 * @param value the jobId - Id for the Notification
	 */
	public void setJobId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, JOBID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JobMonitoringLog.jobId</code> attribute. 
	 * @param value the jobId - Id for the Notification
	 */
	public void setJobId(final String value)
	{
		setJobId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JobMonitoringLog.jobStatus</code> attribute.
	 * @return the jobStatus - Job Status
	 */
	public String getJobStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, JOBSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JobMonitoringLog.jobStatus</code> attribute.
	 * @return the jobStatus - Job Status
	 */
	public String getJobStatus()
	{
		return getJobStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JobMonitoringLog.jobStatus</code> attribute. 
	 * @param value the jobStatus - Job Status
	 */
	public void setJobStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, JOBSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JobMonitoringLog.jobStatus</code> attribute. 
	 * @param value the jobStatus - Job Status
	 */
	public void setJobStatus(final String value)
	{
		setJobStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JobMonitoringLog.jobTriggeredOn</code> attribute.
	 * @return the jobTriggeredOn - Start time for workflow execution
	 */
	public Date getJobTriggeredOn(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, JOBTRIGGEREDON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>JobMonitoringLog.jobTriggeredOn</code> attribute.
	 * @return the jobTriggeredOn - Start time for workflow execution
	 */
	public Date getJobTriggeredOn()
	{
		return getJobTriggeredOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JobMonitoringLog.jobTriggeredOn</code> attribute. 
	 * @param value the jobTriggeredOn - Start time for workflow execution
	 */
	public void setJobTriggeredOn(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, JOBTRIGGEREDON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>JobMonitoringLog.jobTriggeredOn</code> attribute. 
	 * @param value the jobTriggeredOn - Start time for workflow execution
	 */
	public void setJobTriggeredOn(final Date value)
	{
		setJobTriggeredOn( getSession().getSessionContext(), value );
	}
	
}
