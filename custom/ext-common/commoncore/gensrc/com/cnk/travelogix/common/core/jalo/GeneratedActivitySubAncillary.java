/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.RoomAncillary;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ActivitySubAncillary}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivitySubAncillary extends RoomAncillary
{
	/** Qualifier of the <code>ActivitySubAncillary.activityName</code> attribute **/
	public static final String ACTIVITYNAME = "activityName";
	/** Qualifier of the <code>ActivitySubAncillary.vehicleType</code> attribute **/
	public static final String VEHICLETYPE = "vehicleType";
	/** Qualifier of the <code>ActivitySubAncillary.numberOfAdult</code> attribute **/
	public static final String NUMBEROFADULT = "numberOfAdult";
	/** Qualifier of the <code>ActivitySubAncillary.numberOfChild</code> attribute **/
	public static final String NUMBEROFCHILD = "numberOfChild";
	/** Qualifier of the <code>ActivitySubAncillary.issueDate</code> attribute **/
	public static final String ISSUEDATE = "issueDate";
	/** Qualifier of the <code>ActivitySubAncillary.duration</code> attribute **/
	public static final String DURATION = "duration";
	/** Qualifier of the <code>ActivitySubAncillary.startDate</code> attribute **/
	public static final String STARTDATE = "startDate";
	/** Qualifier of the <code>ActivitySubAncillary.endDate</code> attribute **/
	public static final String ENDDATE = "endDate";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(RoomAncillary.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ACTIVITYNAME, AttributeMode.INITIAL);
		tmp.put(VEHICLETYPE, AttributeMode.INITIAL);
		tmp.put(NUMBEROFADULT, AttributeMode.INITIAL);
		tmp.put(NUMBEROFCHILD, AttributeMode.INITIAL);
		tmp.put(ISSUEDATE, AttributeMode.INITIAL);
		tmp.put(DURATION, AttributeMode.INITIAL);
		tmp.put(STARTDATE, AttributeMode.INITIAL);
		tmp.put(ENDDATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySubAncillary.activityName</code> attribute.
	 * @return the activityName
	 */
	public String getActivityName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ACTIVITYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySubAncillary.activityName</code> attribute.
	 * @return the activityName
	 */
	public String getActivityName()
	{
		return getActivityName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySubAncillary.activityName</code> attribute. 
	 * @param value the activityName
	 */
	public void setActivityName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ACTIVITYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySubAncillary.activityName</code> attribute. 
	 * @param value the activityName
	 */
	public void setActivityName(final String value)
	{
		setActivityName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySubAncillary.duration</code> attribute.
	 * @return the duration
	 */
	public String getDuration(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySubAncillary.duration</code> attribute.
	 * @return the duration
	 */
	public String getDuration()
	{
		return getDuration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySubAncillary.duration</code> attribute. 
	 * @param value the duration
	 */
	public void setDuration(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DURATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySubAncillary.duration</code> attribute. 
	 * @param value the duration
	 */
	public void setDuration(final String value)
	{
		setDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySubAncillary.endDate</code> attribute.
	 * @return the endDate
	 */
	public Date getEndDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ENDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySubAncillary.endDate</code> attribute.
	 * @return the endDate
	 */
	public Date getEndDate()
	{
		return getEndDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySubAncillary.endDate</code> attribute. 
	 * @param value the endDate
	 */
	public void setEndDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ENDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySubAncillary.endDate</code> attribute. 
	 * @param value the endDate
	 */
	public void setEndDate(final Date value)
	{
		setEndDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySubAncillary.issueDate</code> attribute.
	 * @return the issueDate
	 */
	public Date getIssueDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ISSUEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySubAncillary.issueDate</code> attribute.
	 * @return the issueDate
	 */
	public Date getIssueDate()
	{
		return getIssueDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySubAncillary.issueDate</code> attribute. 
	 * @param value the issueDate
	 */
	public void setIssueDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ISSUEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySubAncillary.issueDate</code> attribute. 
	 * @param value the issueDate
	 */
	public void setIssueDate(final Date value)
	{
		setIssueDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySubAncillary.numberOfAdult</code> attribute.
	 * @return the numberOfAdult
	 */
	public String getNumberOfAdult(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NUMBEROFADULT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySubAncillary.numberOfAdult</code> attribute.
	 * @return the numberOfAdult
	 */
	public String getNumberOfAdult()
	{
		return getNumberOfAdult( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySubAncillary.numberOfAdult</code> attribute. 
	 * @param value the numberOfAdult
	 */
	public void setNumberOfAdult(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NUMBEROFADULT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySubAncillary.numberOfAdult</code> attribute. 
	 * @param value the numberOfAdult
	 */
	public void setNumberOfAdult(final String value)
	{
		setNumberOfAdult( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySubAncillary.numberOfChild</code> attribute.
	 * @return the numberOfChild
	 */
	public String getNumberOfChild(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NUMBEROFCHILD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySubAncillary.numberOfChild</code> attribute.
	 * @return the numberOfChild
	 */
	public String getNumberOfChild()
	{
		return getNumberOfChild( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySubAncillary.numberOfChild</code> attribute. 
	 * @param value the numberOfChild
	 */
	public void setNumberOfChild(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NUMBEROFCHILD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySubAncillary.numberOfChild</code> attribute. 
	 * @param value the numberOfChild
	 */
	public void setNumberOfChild(final String value)
	{
		setNumberOfChild( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySubAncillary.startDate</code> attribute.
	 * @return the startDate
	 */
	public Date getStartDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, STARTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySubAncillary.startDate</code> attribute.
	 * @return the startDate
	 */
	public Date getStartDate()
	{
		return getStartDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySubAncillary.startDate</code> attribute. 
	 * @param value the startDate
	 */
	public void setStartDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, STARTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySubAncillary.startDate</code> attribute. 
	 * @param value the startDate
	 */
	public void setStartDate(final Date value)
	{
		setStartDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySubAncillary.vehicleType</code> attribute.
	 * @return the vehicleType
	 */
	public EnumerationValue getVehicleType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, VEHICLETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySubAncillary.vehicleType</code> attribute.
	 * @return the vehicleType
	 */
	public EnumerationValue getVehicleType()
	{
		return getVehicleType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySubAncillary.vehicleType</code> attribute. 
	 * @param value the vehicleType
	 */
	public void setVehicleType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, VEHICLETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySubAncillary.vehicleType</code> attribute. 
	 * @param value the vehicleType
	 */
	public void setVehicleType(final EnumerationValue value)
	{
		setVehicleType( getSession().getSessionContext(), value );
	}
	
}
