/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo.receipts;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.user.Employee;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.core.jalo.receipts.TravelogixRemarks TravelogixRemarks}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTravelogixRemarks extends GenericItem
{
	/** Qualifier of the <code>TravelogixRemarks.createdBy</code> attribute **/
	public static final String CREATEDBY = "createdBy";
	/** Qualifier of the <code>TravelogixRemarks.commentsText</code> attribute **/
	public static final String COMMENTSTEXT = "commentsText";
	/** Qualifier of the <code>TravelogixRemarks.changedStatus</code> attribute **/
	public static final String CHANGEDSTATUS = "changedStatus";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CREATEDBY, AttributeMode.INITIAL);
		tmp.put(COMMENTSTEXT, AttributeMode.INITIAL);
		tmp.put(CHANGEDSTATUS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixRemarks.changedStatus</code> attribute.
	 * @return the changedStatus
	 */
	public String getChangedStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CHANGEDSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixRemarks.changedStatus</code> attribute.
	 * @return the changedStatus
	 */
	public String getChangedStatus()
	{
		return getChangedStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixRemarks.changedStatus</code> attribute. 
	 * @param value the changedStatus
	 */
	public void setChangedStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CHANGEDSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixRemarks.changedStatus</code> attribute. 
	 * @param value the changedStatus
	 */
	public void setChangedStatus(final String value)
	{
		setChangedStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixRemarks.commentsText</code> attribute.
	 * @return the commentsText
	 */
	public String getCommentsText(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMMENTSTEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixRemarks.commentsText</code> attribute.
	 * @return the commentsText
	 */
	public String getCommentsText()
	{
		return getCommentsText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixRemarks.commentsText</code> attribute. 
	 * @param value the commentsText
	 */
	public void setCommentsText(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMMENTSTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixRemarks.commentsText</code> attribute. 
	 * @param value the commentsText
	 */
	public void setCommentsText(final String value)
	{
		setCommentsText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixRemarks.createdBy</code> attribute.
	 * @return the createdBy
	 */
	public Employee getCreatedBy(final SessionContext ctx)
	{
		return (Employee)getProperty( ctx, CREATEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixRemarks.createdBy</code> attribute.
	 * @return the createdBy
	 */
	public Employee getCreatedBy()
	{
		return getCreatedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixRemarks.createdBy</code> attribute. 
	 * @param value the createdBy
	 */
	public void setCreatedBy(final SessionContext ctx, final Employee value)
	{
		setProperty(ctx, CREATEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixRemarks.createdBy</code> attribute. 
	 * @param value the createdBy
	 */
	public void setCreatedBy(final Employee value)
	{
		setCreatedBy( getSession().getSessionContext(), value );
	}
	
}
