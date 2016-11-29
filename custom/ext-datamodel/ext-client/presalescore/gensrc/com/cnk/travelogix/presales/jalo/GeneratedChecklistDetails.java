/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.presales.jalo;

import com.cnk.travelogix.masterdata.core.staff.jalo.StaffInformation;
import com.cnk.travelogix.presales.core.constants.PresalescoreConstants;
import com.cnk.travelogix.presales.jalo.Checklist;
import com.cnk.travelogix.presales.jalo.Role;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.presales.jalo.ChecklistDetails ChecklistDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedChecklistDetails extends GenericItem
{
	/** Qualifier of the <code>ChecklistDetails.department</code> attribute **/
	public static final String DEPARTMENT = "department";
	/** Qualifier of the <code>ChecklistDetails.role</code> attribute **/
	public static final String ROLE = "role";
	/** Qualifier of the <code>ChecklistDetails.resource</code> attribute **/
	public static final String RESOURCE = "resource";
	/** Qualifier of the <code>ChecklistDetails.taskDueDate</code> attribute **/
	public static final String TASKDUEDATE = "taskDueDate";
	/** Qualifier of the <code>ChecklistDetails.actualCompletionDate</code> attribute **/
	public static final String ACTUALCOMPLETIONDATE = "actualCompletionDate";
	/** Qualifier of the <code>ChecklistDetails.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>ChecklistDetails.remarks</code> attribute **/
	public static final String REMARKS = "remarks";
	/** Qualifier of the <code>ChecklistDetails.checklistMedia</code> attribute **/
	public static final String CHECKLISTMEDIA = "checklistMedia";
	/** Qualifier of the <code>ChecklistDetails.checklist</code> attribute **/
	public static final String CHECKLIST = "checklist";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CHECKLIST's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedChecklistDetails> CHECKLISTHANDLER = new BidirectionalOneToManyHandler<GeneratedChecklistDetails>(
	PresalescoreConstants.TC.CHECKLISTDETAILS,
	false,
	"checklist",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DEPARTMENT, AttributeMode.INITIAL);
		tmp.put(ROLE, AttributeMode.INITIAL);
		tmp.put(RESOURCE, AttributeMode.INITIAL);
		tmp.put(TASKDUEDATE, AttributeMode.INITIAL);
		tmp.put(ACTUALCOMPLETIONDATE, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(REMARKS, AttributeMode.INITIAL);
		tmp.put(CHECKLISTMEDIA, AttributeMode.INITIAL);
		tmp.put(CHECKLIST, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChecklistDetails.actualCompletionDate</code> attribute.
	 * @return the actualCompletionDate - Actual Completion Date.
	 */
	public Date getActualCompletionDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ACTUALCOMPLETIONDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChecklistDetails.actualCompletionDate</code> attribute.
	 * @return the actualCompletionDate - Actual Completion Date.
	 */
	public Date getActualCompletionDate()
	{
		return getActualCompletionDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChecklistDetails.actualCompletionDate</code> attribute. 
	 * @param value the actualCompletionDate - Actual Completion Date.
	 */
	public void setActualCompletionDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ACTUALCOMPLETIONDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChecklistDetails.actualCompletionDate</code> attribute. 
	 * @param value the actualCompletionDate - Actual Completion Date.
	 */
	public void setActualCompletionDate(final Date value)
	{
		setActualCompletionDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChecklistDetails.checklist</code> attribute.
	 * @return the checklist
	 */
	public Checklist getChecklist(final SessionContext ctx)
	{
		return (Checklist)getProperty( ctx, CHECKLIST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChecklistDetails.checklist</code> attribute.
	 * @return the checklist
	 */
	public Checklist getChecklist()
	{
		return getChecklist( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChecklistDetails.checklist</code> attribute. 
	 * @param value the checklist
	 */
	public void setChecklist(final SessionContext ctx, final Checklist value)
	{
		CHECKLISTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChecklistDetails.checklist</code> attribute. 
	 * @param value the checklist
	 */
	public void setChecklist(final Checklist value)
	{
		setChecklist( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChecklistDetails.checklistMedia</code> attribute.
	 * @return the checklistMedia - Checklist Media.
	 */
	public Media getChecklistMedia(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, CHECKLISTMEDIA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChecklistDetails.checklistMedia</code> attribute.
	 * @return the checklistMedia - Checklist Media.
	 */
	public Media getChecklistMedia()
	{
		return getChecklistMedia( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChecklistDetails.checklistMedia</code> attribute. 
	 * @param value the checklistMedia - Checklist Media.
	 */
	public void setChecklistMedia(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, CHECKLISTMEDIA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChecklistDetails.checklistMedia</code> attribute. 
	 * @param value the checklistMedia - Checklist Media.
	 */
	public void setChecklistMedia(final Media value)
	{
		setChecklistMedia( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CHECKLISTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChecklistDetails.department</code> attribute.
	 * @return the department - Implementation Checklist To Department.
	 */
	public EnumerationValue getDepartment(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DEPARTMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChecklistDetails.department</code> attribute.
	 * @return the department - Implementation Checklist To Department.
	 */
	public EnumerationValue getDepartment()
	{
		return getDepartment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChecklistDetails.department</code> attribute. 
	 * @param value the department - Implementation Checklist To Department.
	 */
	public void setDepartment(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DEPARTMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChecklistDetails.department</code> attribute. 
	 * @param value the department - Implementation Checklist To Department.
	 */
	public void setDepartment(final EnumerationValue value)
	{
		setDepartment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChecklistDetails.remarks</code> attribute.
	 * @return the remarks - Remarks.
	 */
	public String getRemarks(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REMARKS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChecklistDetails.remarks</code> attribute.
	 * @return the remarks - Remarks.
	 */
	public String getRemarks()
	{
		return getRemarks( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChecklistDetails.remarks</code> attribute. 
	 * @param value the remarks - Remarks.
	 */
	public void setRemarks(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REMARKS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChecklistDetails.remarks</code> attribute. 
	 * @param value the remarks - Remarks.
	 */
	public void setRemarks(final String value)
	{
		setRemarks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChecklistDetails.resource</code> attribute.
	 * @return the resource - Implementation Checklist To UserName.
	 */
	public StaffInformation getResource(final SessionContext ctx)
	{
		return (StaffInformation)getProperty( ctx, RESOURCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChecklistDetails.resource</code> attribute.
	 * @return the resource - Implementation Checklist To UserName.
	 */
	public StaffInformation getResource()
	{
		return getResource( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChecklistDetails.resource</code> attribute. 
	 * @param value the resource - Implementation Checklist To UserName.
	 */
	public void setResource(final SessionContext ctx, final StaffInformation value)
	{
		setProperty(ctx, RESOURCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChecklistDetails.resource</code> attribute. 
	 * @param value the resource - Implementation Checklist To UserName.
	 */
	public void setResource(final StaffInformation value)
	{
		setResource( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChecklistDetails.role</code> attribute.
	 * @return the role - Implementation Checklist To Role.
	 */
	public Role getRole(final SessionContext ctx)
	{
		return (Role)getProperty( ctx, ROLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChecklistDetails.role</code> attribute.
	 * @return the role - Implementation Checklist To Role.
	 */
	public Role getRole()
	{
		return getRole( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChecklistDetails.role</code> attribute. 
	 * @param value the role - Implementation Checklist To Role.
	 */
	public void setRole(final SessionContext ctx, final Role value)
	{
		setProperty(ctx, ROLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChecklistDetails.role</code> attribute. 
	 * @param value the role - Implementation Checklist To Role.
	 */
	public void setRole(final Role value)
	{
		setRole( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChecklistDetails.status</code> attribute.
	 * @return the status - Status.
	 */
	public EnumerationValue getStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChecklistDetails.status</code> attribute.
	 * @return the status - Status.
	 */
	public EnumerationValue getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChecklistDetails.status</code> attribute. 
	 * @param value the status - Status.
	 */
	public void setStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChecklistDetails.status</code> attribute. 
	 * @param value the status - Status.
	 */
	public void setStatus(final EnumerationValue value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChecklistDetails.taskDueDate</code> attribute.
	 * @return the taskDueDate - Task Due Date.
	 */
	public Date getTaskDueDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, TASKDUEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChecklistDetails.taskDueDate</code> attribute.
	 * @return the taskDueDate - Task Due Date.
	 */
	public Date getTaskDueDate()
	{
		return getTaskDueDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChecklistDetails.taskDueDate</code> attribute. 
	 * @param value the taskDueDate - Task Due Date.
	 */
	public void setTaskDueDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, TASKDUEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChecklistDetails.taskDueDate</code> attribute. 
	 * @param value the taskDueDate - Task Due Date.
	 */
	public void setTaskDueDate(final Date value)
	{
		setTaskDueDate( getSession().getSessionContext(), value );
	}
	
}
