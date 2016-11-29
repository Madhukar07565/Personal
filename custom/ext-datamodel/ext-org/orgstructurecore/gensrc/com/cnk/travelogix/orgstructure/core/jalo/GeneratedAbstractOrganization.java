/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.orgstructure.core.jalo;

import com.cnk.travelogix.orgstructure.core.constants.OrgstructurecoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.user.Employee;
import de.hybris.platform.jalo.user.UserGroup;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.orgstructure.core.jalo.AbstractOrganization AbstractOrganization}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractOrganization extends UserGroup
{
	/** Qualifier of the <code>AbstractOrganization.reason</code> attribute **/
	public static final String REASON = "reason";
	/** Qualifier of the <code>AbstractOrganization.activeFrom</code> attribute **/
	public static final String ACTIVEFROM = "activeFrom";
	/** Qualifier of the <code>AbstractOrganization.activeTo</code> attribute **/
	public static final String ACTIVETO = "activeTo";
	/** Qualifier of the <code>AbstractOrganization.active</code> attribute **/
	public static final String ACTIVE = "active";
	/** Qualifier of the <code>AbstractOrganization.remarks</code> attribute **/
	public static final String REMARKS = "remarks";
	/** Qualifier of the <code>AbstractOrganization.approvalStatus</code> attribute **/
	public static final String APPROVALSTATUS = "approvalStatus";
	/** Qualifier of the <code>AbstractOrganization.lockedBy</code> attribute **/
	public static final String LOCKEDBY = "lockedBy";
	/** Qualifier of the <code>AbstractOrganization.workFlowStatus</code> attribute **/
	public static final String WORKFLOWSTATUS = "workFlowStatus";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(UserGroup.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(REASON, AttributeMode.INITIAL);
		tmp.put(ACTIVEFROM, AttributeMode.INITIAL);
		tmp.put(ACTIVETO, AttributeMode.INITIAL);
		tmp.put(ACTIVE, AttributeMode.INITIAL);
		tmp.put(REMARKS, AttributeMode.INITIAL);
		tmp.put(APPROVALSTATUS, AttributeMode.INITIAL);
		tmp.put(LOCKEDBY, AttributeMode.INITIAL);
		tmp.put(WORKFLOWSTATUS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrganization.active</code> attribute.
	 * @return the active
	 */
	public Boolean isActive(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ACTIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrganization.active</code> attribute.
	 * @return the active
	 */
	public Boolean isActive()
	{
		return isActive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrganization.active</code> attribute. 
	 * @return the active
	 */
	public boolean isActiveAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isActive( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrganization.active</code> attribute. 
	 * @return the active
	 */
	public boolean isActiveAsPrimitive()
	{
		return isActiveAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrganization.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ACTIVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrganization.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final Boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrganization.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final SessionContext ctx, final boolean value)
	{
		setActive( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrganization.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrganization.activeFrom</code> attribute.
	 * @return the activeFrom
	 */
	public Date getActiveFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ACTIVEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrganization.activeFrom</code> attribute.
	 * @return the activeFrom
	 */
	public Date getActiveFrom()
	{
		return getActiveFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrganization.activeFrom</code> attribute. 
	 * @param value the activeFrom
	 */
	public void setActiveFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ACTIVEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrganization.activeFrom</code> attribute. 
	 * @param value the activeFrom
	 */
	public void setActiveFrom(final Date value)
	{
		setActiveFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrganization.activeTo</code> attribute.
	 * @return the activeTo
	 */
	public Date getActiveTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ACTIVETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrganization.activeTo</code> attribute.
	 * @return the activeTo
	 */
	public Date getActiveTo()
	{
		return getActiveTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrganization.activeTo</code> attribute. 
	 * @param value the activeTo
	 */
	public void setActiveTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ACTIVETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrganization.activeTo</code> attribute. 
	 * @param value the activeTo
	 */
	public void setActiveTo(final Date value)
	{
		setActiveTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrganization.approvalStatus</code> attribute.
	 * @return the approvalStatus
	 */
	public EnumerationValue getApprovalStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, APPROVALSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrganization.approvalStatus</code> attribute.
	 * @return the approvalStatus
	 */
	public EnumerationValue getApprovalStatus()
	{
		return getApprovalStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrganization.approvalStatus</code> attribute. 
	 * @param value the approvalStatus
	 */
	public void setApprovalStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, APPROVALSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrganization.approvalStatus</code> attribute. 
	 * @param value the approvalStatus
	 */
	public void setApprovalStatus(final EnumerationValue value)
	{
		setApprovalStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrganization.lockedBy</code> attribute.
	 * @return the lockedBy
	 */
	public Employee getLockedBy(final SessionContext ctx)
	{
		return (Employee)getProperty( ctx, LOCKEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrganization.lockedBy</code> attribute.
	 * @return the lockedBy
	 */
	public Employee getLockedBy()
	{
		return getLockedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrganization.lockedBy</code> attribute. 
	 * @param value the lockedBy
	 */
	public void setLockedBy(final SessionContext ctx, final Employee value)
	{
		setProperty(ctx, LOCKEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrganization.lockedBy</code> attribute. 
	 * @param value the lockedBy
	 */
	public void setLockedBy(final Employee value)
	{
		setLockedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrganization.reason</code> attribute.
	 * @return the reason
	 */
	public String getReason(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrganization.reason</code> attribute.
	 * @return the reason
	 */
	public String getReason()
	{
		return getReason( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrganization.reason</code> attribute. 
	 * @param value the reason
	 */
	public void setReason(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrganization.reason</code> attribute. 
	 * @param value the reason
	 */
	public void setReason(final String value)
	{
		setReason( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrganization.remarks</code> attribute.
	 * @return the remarks
	 */
	public String getRemarks(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REMARKS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrganization.remarks</code> attribute.
	 * @return the remarks
	 */
	public String getRemarks()
	{
		return getRemarks( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrganization.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setRemarks(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REMARKS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrganization.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setRemarks(final String value)
	{
		setRemarks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrganization.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, WORKFLOWSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrganization.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus()
	{
		return getWorkFlowStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrganization.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, WORKFLOWSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrganization.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final EnumerationValue value)
	{
		setWorkFlowStatus( getSession().getSessionContext(), value );
	}
	
}
