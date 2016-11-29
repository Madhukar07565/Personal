/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.presales.jalo;

import com.cnk.travelogix.presales.core.constants.PresalescoreConstants;
import com.cnk.travelogix.presales.jalo.ChecklistDetails;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.user.Employee;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.presales.jalo.Checklist Checklist}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedChecklist extends GenericItem
{
	/** Qualifier of the <code>Checklist.lockedBy</code> attribute **/
	public static final String LOCKEDBY = "lockedBy";
	/** Qualifier of the <code>Checklist.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>Checklist.implementationChecklistId</code> attribute **/
	public static final String IMPLEMENTATIONCHECKLISTID = "implementationChecklistId";
	/** Qualifier of the <code>Checklist.onlineDate</code> attribute **/
	public static final String ONLINEDATE = "onlineDate";
	/** Qualifier of the <code>Checklist.checklistDetails</code> attribute **/
	public static final String CHECKLISTDETAILS = "checklistDetails";
	/**
	* {@link OneToManyHandler} for handling 1:n CHECKLISTDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ChecklistDetails> CHECKLISTDETAILSHANDLER = new OneToManyHandler<ChecklistDetails>(
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
		tmp.put(LOCKEDBY, AttributeMode.INITIAL);
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(IMPLEMENTATIONCHECKLISTID, AttributeMode.INITIAL);
		tmp.put(ONLINEDATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Checklist.checklistDetails</code> attribute.
	 * @return the checklistDetails
	 */
	public Collection<ChecklistDetails> getChecklistDetails(final SessionContext ctx)
	{
		return CHECKLISTDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Checklist.checklistDetails</code> attribute.
	 * @return the checklistDetails
	 */
	public Collection<ChecklistDetails> getChecklistDetails()
	{
		return getChecklistDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Checklist.checklistDetails</code> attribute. 
	 * @param value the checklistDetails
	 */
	public void setChecklistDetails(final SessionContext ctx, final Collection<ChecklistDetails> value)
	{
		CHECKLISTDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Checklist.checklistDetails</code> attribute. 
	 * @param value the checklistDetails
	 */
	public void setChecklistDetails(final Collection<ChecklistDetails> value)
	{
		setChecklistDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to checklistDetails. 
	 * @param value the item to add to checklistDetails
	 */
	public void addToChecklistDetails(final SessionContext ctx, final ChecklistDetails value)
	{
		CHECKLISTDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to checklistDetails. 
	 * @param value the item to add to checklistDetails
	 */
	public void addToChecklistDetails(final ChecklistDetails value)
	{
		addToChecklistDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from checklistDetails. 
	 * @param value the item to remove from checklistDetails
	 */
	public void removeFromChecklistDetails(final SessionContext ctx, final ChecklistDetails value)
	{
		CHECKLISTDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from checklistDetails. 
	 * @param value the item to remove from checklistDetails
	 */
	public void removeFromChecklistDetails(final ChecklistDetails value)
	{
		removeFromChecklistDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Checklist.implementationChecklistId</code> attribute.
	 * @return the implementationChecklistId - Implementation Checklist Id.
	 */
	public String getImplementationChecklistId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, IMPLEMENTATIONCHECKLISTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Checklist.implementationChecklistId</code> attribute.
	 * @return the implementationChecklistId - Implementation Checklist Id.
	 */
	public String getImplementationChecklistId()
	{
		return getImplementationChecklistId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Checklist.implementationChecklistId</code> attribute. 
	 * @param value the implementationChecklistId - Implementation Checklist Id.
	 */
	public void setImplementationChecklistId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, IMPLEMENTATIONCHECKLISTID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Checklist.implementationChecklistId</code> attribute. 
	 * @param value the implementationChecklistId - Implementation Checklist Id.
	 */
	public void setImplementationChecklistId(final String value)
	{
		setImplementationChecklistId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Checklist.lockedBy</code> attribute.
	 * @return the lockedBy
	 */
	public Employee getLockedBy(final SessionContext ctx)
	{
		return (Employee)getProperty( ctx, LOCKEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Checklist.lockedBy</code> attribute.
	 * @return the lockedBy
	 */
	public Employee getLockedBy()
	{
		return getLockedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Checklist.lockedBy</code> attribute. 
	 * @param value the lockedBy
	 */
	public void setLockedBy(final SessionContext ctx, final Employee value)
	{
		setProperty(ctx, LOCKEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Checklist.lockedBy</code> attribute. 
	 * @param value the lockedBy
	 */
	public void setLockedBy(final Employee value)
	{
		setLockedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Checklist.onlineDate</code> attribute.
	 * @return the onlineDate - Go live Date.
	 */
	public Date getOnlineDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ONLINEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Checklist.onlineDate</code> attribute.
	 * @return the onlineDate - Go live Date.
	 */
	public Date getOnlineDate()
	{
		return getOnlineDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Checklist.onlineDate</code> attribute. 
	 * @param value the onlineDate - Go live Date.
	 */
	public void setOnlineDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ONLINEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Checklist.onlineDate</code> attribute. 
	 * @param value the onlineDate - Go live Date.
	 */
	public void setOnlineDate(final Date value)
	{
		setOnlineDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Checklist.title</code> attribute.
	 * @return the title - Title.
	 */
	public EnumerationValue getTitle(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Checklist.title</code> attribute.
	 * @return the title - Title.
	 */
	public EnumerationValue getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Checklist.title</code> attribute. 
	 * @param value the title - Title.
	 */
	public void setTitle(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Checklist.title</code> attribute. 
	 * @param value the title - Title.
	 */
	public void setTitle(final EnumerationValue value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
}
