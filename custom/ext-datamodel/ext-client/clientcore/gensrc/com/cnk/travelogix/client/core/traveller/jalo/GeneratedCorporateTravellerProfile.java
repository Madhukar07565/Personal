/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.traveller.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.corporate.jalo.CostCentre;
import com.cnk.travelogix.client.core.corporate.jalo.Project;
import com.cnk.travelogix.client.core.traveller.jalo.TravellerProfile;
import com.cnk.travelogix.masterdata.core.c2l.jalo.Location;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.user.Employee;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.traveller.jalo.CorporateTravellerProfile CorporateTravellerProfile}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCorporateTravellerProfile extends TravellerProfile
{
	/** Qualifier of the <code>CorporateTravellerProfile.lockedBy</code> attribute **/
	public static final String LOCKEDBY = "lockedBy";
	/** Qualifier of the <code>CorporateTravellerProfile.employeeId</code> attribute **/
	public static final String EMPLOYEEID = "employeeId";
	/** Qualifier of the <code>CorporateTravellerProfile.approvalRequired</code> attribute **/
	public static final String APPROVALREQUIRED = "approvalRequired";
	/** Qualifier of the <code>CorporateTravellerProfile.location</code> attribute **/
	public static final String LOCATION = "location";
	/** Qualifier of the <code>CorporateTravellerProfile.projectCode</code> attribute **/
	public static final String PROJECTCODE = "projectCode";
	/** Qualifier of the <code>CorporateTravellerProfile.costCentreCode</code> attribute **/
	public static final String COSTCENTRECODE = "costCentreCode";
	/** Qualifier of the <code>CorporateTravellerProfile.reportingManager</code> attribute **/
	public static final String REPORTINGMANAGER = "reportingManager";
	/** Qualifier of the <code>CorporateTravellerProfile.selfBookingToolUser</code> attribute **/
	public static final String SELFBOOKINGTOOLUSER = "selfBookingToolUser";
	/** Qualifier of the <code>CorporateTravellerProfile.personalTravelAllowed</code> attribute **/
	public static final String PERSONALTRAVELALLOWED = "personalTravelAllowed";
	/** Qualifier of the <code>CorporateTravellerProfile.userId</code> attribute **/
	public static final String USERID = "userId";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(TravellerProfile.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(LOCKEDBY, AttributeMode.INITIAL);
		tmp.put(EMPLOYEEID, AttributeMode.INITIAL);
		tmp.put(APPROVALREQUIRED, AttributeMode.INITIAL);
		tmp.put(LOCATION, AttributeMode.INITIAL);
		tmp.put(PROJECTCODE, AttributeMode.INITIAL);
		tmp.put(COSTCENTRECODE, AttributeMode.INITIAL);
		tmp.put(REPORTINGMANAGER, AttributeMode.INITIAL);
		tmp.put(SELFBOOKINGTOOLUSER, AttributeMode.INITIAL);
		tmp.put(PERSONALTRAVELALLOWED, AttributeMode.INITIAL);
		tmp.put(USERID, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravellerProfile.approvalRequired</code> attribute.
	 * @return the approvalRequired
	 */
	public Boolean isApprovalRequired(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, APPROVALREQUIRED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravellerProfile.approvalRequired</code> attribute.
	 * @return the approvalRequired
	 */
	public Boolean isApprovalRequired()
	{
		return isApprovalRequired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravellerProfile.approvalRequired</code> attribute. 
	 * @return the approvalRequired
	 */
	public boolean isApprovalRequiredAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isApprovalRequired( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravellerProfile.approvalRequired</code> attribute. 
	 * @return the approvalRequired
	 */
	public boolean isApprovalRequiredAsPrimitive()
	{
		return isApprovalRequiredAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravellerProfile.approvalRequired</code> attribute. 
	 * @param value the approvalRequired
	 */
	public void setApprovalRequired(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, APPROVALREQUIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravellerProfile.approvalRequired</code> attribute. 
	 * @param value the approvalRequired
	 */
	public void setApprovalRequired(final Boolean value)
	{
		setApprovalRequired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravellerProfile.approvalRequired</code> attribute. 
	 * @param value the approvalRequired
	 */
	public void setApprovalRequired(final SessionContext ctx, final boolean value)
	{
		setApprovalRequired( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravellerProfile.approvalRequired</code> attribute. 
	 * @param value the approvalRequired
	 */
	public void setApprovalRequired(final boolean value)
	{
		setApprovalRequired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravellerProfile.costCentreCode</code> attribute.
	 * @return the costCentreCode
	 */
	public CostCentre getCostCentreCode(final SessionContext ctx)
	{
		return (CostCentre)getProperty( ctx, COSTCENTRECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravellerProfile.costCentreCode</code> attribute.
	 * @return the costCentreCode
	 */
	public CostCentre getCostCentreCode()
	{
		return getCostCentreCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravellerProfile.costCentreCode</code> attribute. 
	 * @param value the costCentreCode
	 */
	public void setCostCentreCode(final SessionContext ctx, final CostCentre value)
	{
		setProperty(ctx, COSTCENTRECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravellerProfile.costCentreCode</code> attribute. 
	 * @param value the costCentreCode
	 */
	public void setCostCentreCode(final CostCentre value)
	{
		setCostCentreCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravellerProfile.employeeId</code> attribute.
	 * @return the employeeId
	 */
	public String getEmployeeId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMPLOYEEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravellerProfile.employeeId</code> attribute.
	 * @return the employeeId
	 */
	public String getEmployeeId()
	{
		return getEmployeeId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravellerProfile.employeeId</code> attribute. 
	 * @param value the employeeId
	 */
	public void setEmployeeId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMPLOYEEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravellerProfile.employeeId</code> attribute. 
	 * @param value the employeeId
	 */
	public void setEmployeeId(final String value)
	{
		setEmployeeId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravellerProfile.location</code> attribute.
	 * @return the location
	 */
	public Location getLocation(final SessionContext ctx)
	{
		return (Location)getProperty( ctx, LOCATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravellerProfile.location</code> attribute.
	 * @return the location
	 */
	public Location getLocation()
	{
		return getLocation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravellerProfile.location</code> attribute. 
	 * @param value the location
	 */
	public void setLocation(final SessionContext ctx, final Location value)
	{
		setProperty(ctx, LOCATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravellerProfile.location</code> attribute. 
	 * @param value the location
	 */
	public void setLocation(final Location value)
	{
		setLocation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravellerProfile.lockedBy</code> attribute.
	 * @return the lockedBy
	 */
	public Employee getLockedBy(final SessionContext ctx)
	{
		return (Employee)getProperty( ctx, LOCKEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravellerProfile.lockedBy</code> attribute.
	 * @return the lockedBy
	 */
	public Employee getLockedBy()
	{
		return getLockedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravellerProfile.lockedBy</code> attribute. 
	 * @param value the lockedBy
	 */
	public void setLockedBy(final SessionContext ctx, final Employee value)
	{
		setProperty(ctx, LOCKEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravellerProfile.lockedBy</code> attribute. 
	 * @param value the lockedBy
	 */
	public void setLockedBy(final Employee value)
	{
		setLockedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravellerProfile.personalTravelAllowed</code> attribute.
	 * @return the personalTravelAllowed
	 */
	public Boolean isPersonalTravelAllowed(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERSONALTRAVELALLOWED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravellerProfile.personalTravelAllowed</code> attribute.
	 * @return the personalTravelAllowed
	 */
	public Boolean isPersonalTravelAllowed()
	{
		return isPersonalTravelAllowed( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravellerProfile.personalTravelAllowed</code> attribute. 
	 * @return the personalTravelAllowed
	 */
	public boolean isPersonalTravelAllowedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPersonalTravelAllowed( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravellerProfile.personalTravelAllowed</code> attribute. 
	 * @return the personalTravelAllowed
	 */
	public boolean isPersonalTravelAllowedAsPrimitive()
	{
		return isPersonalTravelAllowedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravellerProfile.personalTravelAllowed</code> attribute. 
	 * @param value the personalTravelAllowed
	 */
	public void setPersonalTravelAllowed(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERSONALTRAVELALLOWED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravellerProfile.personalTravelAllowed</code> attribute. 
	 * @param value the personalTravelAllowed
	 */
	public void setPersonalTravelAllowed(final Boolean value)
	{
		setPersonalTravelAllowed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravellerProfile.personalTravelAllowed</code> attribute. 
	 * @param value the personalTravelAllowed
	 */
	public void setPersonalTravelAllowed(final SessionContext ctx, final boolean value)
	{
		setPersonalTravelAllowed( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravellerProfile.personalTravelAllowed</code> attribute. 
	 * @param value the personalTravelAllowed
	 */
	public void setPersonalTravelAllowed(final boolean value)
	{
		setPersonalTravelAllowed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravellerProfile.projectCode</code> attribute.
	 * @return the projectCode
	 */
	public Project getProjectCode(final SessionContext ctx)
	{
		return (Project)getProperty( ctx, PROJECTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravellerProfile.projectCode</code> attribute.
	 * @return the projectCode
	 */
	public Project getProjectCode()
	{
		return getProjectCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravellerProfile.projectCode</code> attribute. 
	 * @param value the projectCode
	 */
	public void setProjectCode(final SessionContext ctx, final Project value)
	{
		setProperty(ctx, PROJECTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravellerProfile.projectCode</code> attribute. 
	 * @param value the projectCode
	 */
	public void setProjectCode(final Project value)
	{
		setProjectCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravellerProfile.reportingManager</code> attribute.
	 * @return the reportingManager
	 */
	public TravellerProfile getReportingManager(final SessionContext ctx)
	{
		return (TravellerProfile)getProperty( ctx, REPORTINGMANAGER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravellerProfile.reportingManager</code> attribute.
	 * @return the reportingManager
	 */
	public TravellerProfile getReportingManager()
	{
		return getReportingManager( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravellerProfile.reportingManager</code> attribute. 
	 * @param value the reportingManager
	 */
	public void setReportingManager(final SessionContext ctx, final TravellerProfile value)
	{
		setProperty(ctx, REPORTINGMANAGER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravellerProfile.reportingManager</code> attribute. 
	 * @param value the reportingManager
	 */
	public void setReportingManager(final TravellerProfile value)
	{
		setReportingManager( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravellerProfile.selfBookingToolUser</code> attribute.
	 * @return the selfBookingToolUser
	 */
	public Boolean isSelfBookingToolUser(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SELFBOOKINGTOOLUSER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravellerProfile.selfBookingToolUser</code> attribute.
	 * @return the selfBookingToolUser
	 */
	public Boolean isSelfBookingToolUser()
	{
		return isSelfBookingToolUser( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravellerProfile.selfBookingToolUser</code> attribute. 
	 * @return the selfBookingToolUser
	 */
	public boolean isSelfBookingToolUserAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSelfBookingToolUser( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravellerProfile.selfBookingToolUser</code> attribute. 
	 * @return the selfBookingToolUser
	 */
	public boolean isSelfBookingToolUserAsPrimitive()
	{
		return isSelfBookingToolUserAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravellerProfile.selfBookingToolUser</code> attribute. 
	 * @param value the selfBookingToolUser
	 */
	public void setSelfBookingToolUser(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SELFBOOKINGTOOLUSER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravellerProfile.selfBookingToolUser</code> attribute. 
	 * @param value the selfBookingToolUser
	 */
	public void setSelfBookingToolUser(final Boolean value)
	{
		setSelfBookingToolUser( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravellerProfile.selfBookingToolUser</code> attribute. 
	 * @param value the selfBookingToolUser
	 */
	public void setSelfBookingToolUser(final SessionContext ctx, final boolean value)
	{
		setSelfBookingToolUser( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravellerProfile.selfBookingToolUser</code> attribute. 
	 * @param value the selfBookingToolUser
	 */
	public void setSelfBookingToolUser(final boolean value)
	{
		setSelfBookingToolUser( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravellerProfile.userId</code> attribute.
	 * @return the userId
	 */
	public String getUserId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, USERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravellerProfile.userId</code> attribute.
	 * @return the userId
	 */
	public String getUserId()
	{
		return getUserId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravellerProfile.userId</code> attribute. 
	 * @param value the userId
	 */
	public void setUserId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, USERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravellerProfile.userId</code> attribute. 
	 * @param value the userId
	 */
	public void setUserId(final String value)
	{
		setUserId( getSession().getSessionContext(), value );
	}
	
}
