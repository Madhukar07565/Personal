/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.presales.jalo;

import com.cnk.travelogix.presales.core.constants.PresalescoreConstants;
import com.cnk.travelogix.presales.jalo.Role;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.presales.jalo.ApprovalWorkFlow ApprovalWorkFlow}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedApprovalWorkFlow extends GenericItem
{
	/** Qualifier of the <code>ApprovalWorkFlow.level</code> attribute **/
	public static final String LEVEL = "level";
	/** Qualifier of the <code>ApprovalWorkFlow.role</code> attribute **/
	public static final String ROLE = "role";
	/** Qualifier of the <code>ApprovalWorkFlow.name</code> attribute **/
	public static final String NAME = "name";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(LEVEL, AttributeMode.INITIAL);
		tmp.put(ROLE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApprovalWorkFlow.level</code> attribute.
	 * @return the level - level of approver
	 */
	public Integer getLevel(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, LEVEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApprovalWorkFlow.level</code> attribute.
	 * @return the level - level of approver
	 */
	public Integer getLevel()
	{
		return getLevel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApprovalWorkFlow.level</code> attribute. 
	 * @return the level - level of approver
	 */
	public int getLevelAsPrimitive(final SessionContext ctx)
	{
		Integer value = getLevel( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApprovalWorkFlow.level</code> attribute. 
	 * @return the level - level of approver
	 */
	public int getLevelAsPrimitive()
	{
		return getLevelAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApprovalWorkFlow.level</code> attribute. 
	 * @param value the level - level of approver
	 */
	public void setLevel(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, LEVEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApprovalWorkFlow.level</code> attribute. 
	 * @param value the level - level of approver
	 */
	public void setLevel(final Integer value)
	{
		setLevel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApprovalWorkFlow.level</code> attribute. 
	 * @param value the level - level of approver
	 */
	public void setLevel(final SessionContext ctx, final int value)
	{
		setLevel( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApprovalWorkFlow.level</code> attribute. 
	 * @param value the level - level of approver
	 */
	public void setLevel(final int value)
	{
		setLevel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApprovalWorkFlow.name</code> attribute.
	 * @return the name - name of approver
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApprovalWorkFlow.name</code> attribute.
	 * @return the name - name of approver
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApprovalWorkFlow.name</code> attribute. 
	 * @param value the name - name of approver
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApprovalWorkFlow.name</code> attribute. 
	 * @param value the name - name of approver
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApprovalWorkFlow.role</code> attribute.
	 * @return the role - Role of Approver
	 */
	public Role getRole(final SessionContext ctx)
	{
		return (Role)getProperty( ctx, ROLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApprovalWorkFlow.role</code> attribute.
	 * @return the role - Role of Approver
	 */
	public Role getRole()
	{
		return getRole( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApprovalWorkFlow.role</code> attribute. 
	 * @param value the role - Role of Approver
	 */
	public void setRole(final SessionContext ctx, final Role value)
	{
		setProperty(ctx, ROLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApprovalWorkFlow.role</code> attribute. 
	 * @param value the role - Role of Approver
	 */
	public void setRole(final Role value)
	{
		setRole( getSession().getSessionContext(), value );
	}
	
}
