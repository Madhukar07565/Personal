/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.presales.jalo;

import com.cnk.travelogix.presales.core.constants.PresalescoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.presales.jalo.LeadStatus LeadStatus}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedLeadStatus extends GenericItem
{
	/** Qualifier of the <code>LeadStatus.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>LeadStatus.leadReason</code> attribute **/
	public static final String LEADREASON = "leadReason";
	/** Qualifier of the <code>LeadStatus.leadStatus</code> attribute **/
	public static final String LEADSTATUS = "leadStatus";
	/** Qualifier of the <code>LeadStatus.remarks</code> attribute **/
	public static final String REMARKS = "remarks";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(LEADREASON, AttributeMode.INITIAL);
		tmp.put(LEADSTATUS, AttributeMode.INITIAL);
		tmp.put(REMARKS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LeadStatus.code</code> attribute.
	 * @return the code - unique id for Lead Status
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LeadStatus.code</code> attribute.
	 * @return the code - unique id for Lead Status
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LeadStatus.code</code> attribute. 
	 * @param value the code - unique id for Lead Status
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LeadStatus.code</code> attribute. 
	 * @param value the code - unique id for Lead Status
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LeadStatus.leadReason</code> attribute.
	 * @return the leadReason - Defines ReasonType
	 */
	public EnumerationValue getLeadReason(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, LEADREASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LeadStatus.leadReason</code> attribute.
	 * @return the leadReason - Defines ReasonType
	 */
	public EnumerationValue getLeadReason()
	{
		return getLeadReason( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LeadStatus.leadReason</code> attribute. 
	 * @param value the leadReason - Defines ReasonType
	 */
	public void setLeadReason(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, LEADREASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LeadStatus.leadReason</code> attribute. 
	 * @param value the leadReason - Defines ReasonType
	 */
	public void setLeadReason(final EnumerationValue value)
	{
		setLeadReason( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LeadStatus.leadStatus</code> attribute.
	 * @return the leadStatus - Defines status
	 */
	public EnumerationValue getLeadStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, LEADSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LeadStatus.leadStatus</code> attribute.
	 * @return the leadStatus - Defines status
	 */
	public EnumerationValue getLeadStatus()
	{
		return getLeadStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LeadStatus.leadStatus</code> attribute. 
	 * @param value the leadStatus - Defines status
	 */
	public void setLeadStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, LEADSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LeadStatus.leadStatus</code> attribute. 
	 * @param value the leadStatus - Defines status
	 */
	public void setLeadStatus(final EnumerationValue value)
	{
		setLeadStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LeadStatus.remarks</code> attribute.
	 * @return the remarks - Remarks
	 */
	public String getRemarks(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REMARKS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LeadStatus.remarks</code> attribute.
	 * @return the remarks - Remarks
	 */
	public String getRemarks()
	{
		return getRemarks( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LeadStatus.remarks</code> attribute. 
	 * @param value the remarks - Remarks
	 */
	public void setRemarks(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REMARKS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LeadStatus.remarks</code> attribute. 
	 * @param value the remarks - Remarks
	 */
	public void setRemarks(final String value)
	{
		setRemarks( getSession().getSessionContext(), value );
	}
	
}
