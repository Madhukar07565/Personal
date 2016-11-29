/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.AbstractCriteria AbstractCriteria}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractCriteria extends GenericItem
{
	/** Qualifier of the <code>AbstractCriteria.criteriaName</code> attribute **/
	public static final String CRITERIANAME = "criteriaName";
	/** Qualifier of the <code>AbstractCriteria.approvalRequired</code> attribute **/
	public static final String APPROVALREQUIRED = "approvalRequired";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CRITERIANAME, AttributeMode.INITIAL);
		tmp.put(APPROVALREQUIRED, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCriteria.approvalRequired</code> attribute.
	 * @return the approvalRequired
	 */
	public Boolean isApprovalRequired(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, APPROVALREQUIRED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCriteria.approvalRequired</code> attribute.
	 * @return the approvalRequired
	 */
	public Boolean isApprovalRequired()
	{
		return isApprovalRequired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCriteria.approvalRequired</code> attribute. 
	 * @return the approvalRequired
	 */
	public boolean isApprovalRequiredAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isApprovalRequired( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCriteria.approvalRequired</code> attribute. 
	 * @return the approvalRequired
	 */
	public boolean isApprovalRequiredAsPrimitive()
	{
		return isApprovalRequiredAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCriteria.approvalRequired</code> attribute. 
	 * @param value the approvalRequired
	 */
	public void setApprovalRequired(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, APPROVALREQUIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCriteria.approvalRequired</code> attribute. 
	 * @param value the approvalRequired
	 */
	public void setApprovalRequired(final Boolean value)
	{
		setApprovalRequired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCriteria.approvalRequired</code> attribute. 
	 * @param value the approvalRequired
	 */
	public void setApprovalRequired(final SessionContext ctx, final boolean value)
	{
		setApprovalRequired( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCriteria.approvalRequired</code> attribute. 
	 * @param value the approvalRequired
	 */
	public void setApprovalRequired(final boolean value)
	{
		setApprovalRequired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCriteria.criteriaName</code> attribute.
	 * @return the criteriaName - Client Document Handling Criteria Name
	 */
	public EnumerationValue getCriteriaName(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CRITERIANAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCriteria.criteriaName</code> attribute.
	 * @return the criteriaName - Client Document Handling Criteria Name
	 */
	public EnumerationValue getCriteriaName()
	{
		return getCriteriaName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCriteria.criteriaName</code> attribute. 
	 * @param value the criteriaName - Client Document Handling Criteria Name
	 */
	public void setCriteriaName(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CRITERIANAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCriteria.criteriaName</code> attribute. 
	 * @param value the criteriaName - Client Document Handling Criteria Name
	 */
	public void setCriteriaName(final EnumerationValue value)
	{
		setCriteriaName( getSession().getSessionContext(), value );
	}
	
}
