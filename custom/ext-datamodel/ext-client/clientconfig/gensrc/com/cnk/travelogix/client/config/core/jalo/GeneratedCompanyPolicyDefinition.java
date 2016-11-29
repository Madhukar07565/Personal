/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.orgstructure.core.jalo.Market;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.security.Principal;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.CompanyPolicyDefinition CompanyPolicyDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCompanyPolicyDefinition extends GenericItem
{
	/** Qualifier of the <code>CompanyPolicyDefinition.companymarket</code> attribute **/
	public static final String COMPANYMARKET = "companymarket";
	/** Qualifier of the <code>CompanyPolicyDefinition.entityType</code> attribute **/
	public static final String ENTITYTYPE = "entityType";
	/** Qualifier of the <code>CompanyPolicyDefinition.entityName</code> attribute **/
	public static final String ENTITYNAME = "entityName";
	/** Qualifier of the <code>CompanyPolicyDefinition.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>CompanyPolicyDefinition.effectiveFrom</code> attribute **/
	public static final String EFFECTIVEFROM = "effectiveFrom";
	/** Qualifier of the <code>CompanyPolicyDefinition.reason</code> attribute **/
	public static final String REASON = "reason";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COMPANYMARKET, AttributeMode.INITIAL);
		tmp.put(ENTITYTYPE, AttributeMode.INITIAL);
		tmp.put(ENTITYNAME, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(EFFECTIVEFROM, AttributeMode.INITIAL);
		tmp.put(REASON, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefinition.companymarket</code> attribute.
	 * @return the companymarket - Company Policy Market
	 */
	public Market getCompanymarket(final SessionContext ctx)
	{
		return (Market)getProperty( ctx, COMPANYMARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefinition.companymarket</code> attribute.
	 * @return the companymarket - Company Policy Market
	 */
	public Market getCompanymarket()
	{
		return getCompanymarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefinition.companymarket</code> attribute. 
	 * @param value the companymarket - Company Policy Market
	 */
	public void setCompanymarket(final SessionContext ctx, final Market value)
	{
		setProperty(ctx, COMPANYMARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefinition.companymarket</code> attribute. 
	 * @param value the companymarket - Company Policy Market
	 */
	public void setCompanymarket(final Market value)
	{
		setCompanymarket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefinition.effectiveFrom</code> attribute.
	 * @return the effectiveFrom - Company Policy Effective date
	 */
	public Date getEffectiveFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EFFECTIVEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefinition.effectiveFrom</code> attribute.
	 * @return the effectiveFrom - Company Policy Effective date
	 */
	public Date getEffectiveFrom()
	{
		return getEffectiveFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefinition.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom - Company Policy Effective date
	 */
	public void setEffectiveFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EFFECTIVEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefinition.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom - Company Policy Effective date
	 */
	public void setEffectiveFrom(final Date value)
	{
		setEffectiveFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefinition.entityName</code> attribute.
	 * @return the entityName - Company Policy Entity Name
	 */
	public Principal getEntityName(final SessionContext ctx)
	{
		return (Principal)getProperty( ctx, ENTITYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefinition.entityName</code> attribute.
	 * @return the entityName - Company Policy Entity Name
	 */
	public Principal getEntityName()
	{
		return getEntityName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefinition.entityName</code> attribute. 
	 * @param value the entityName - Company Policy Entity Name
	 */
	public void setEntityName(final SessionContext ctx, final Principal value)
	{
		setProperty(ctx, ENTITYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefinition.entityName</code> attribute. 
	 * @param value the entityName - Company Policy Entity Name
	 */
	public void setEntityName(final Principal value)
	{
		setEntityName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefinition.entityType</code> attribute.
	 * @return the entityType - Company Policy Entity Type
	 */
	public Principal getEntityType(final SessionContext ctx)
	{
		return (Principal)getProperty( ctx, ENTITYTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefinition.entityType</code> attribute.
	 * @return the entityType - Company Policy Entity Type
	 */
	public Principal getEntityType()
	{
		return getEntityType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefinition.entityType</code> attribute. 
	 * @param value the entityType - Company Policy Entity Type
	 */
	public void setEntityType(final SessionContext ctx, final Principal value)
	{
		setProperty(ctx, ENTITYTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefinition.entityType</code> attribute. 
	 * @param value the entityType - Company Policy Entity Type
	 */
	public void setEntityType(final Principal value)
	{
		setEntityType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefinition.reason</code> attribute.
	 * @return the reason - Company Policy Changing Reason
	 */
	public String getReason(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefinition.reason</code> attribute.
	 * @return the reason - Company Policy Changing Reason
	 */
	public String getReason()
	{
		return getReason( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefinition.reason</code> attribute. 
	 * @param value the reason - Company Policy Changing Reason
	 */
	public void setReason(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefinition.reason</code> attribute. 
	 * @param value the reason - Company Policy Changing Reason
	 */
	public void setReason(final String value)
	{
		setReason( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefinition.status</code> attribute.
	 * @return the status - Company Policy Status
	 */
	public EnumerationValue getStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefinition.status</code> attribute.
	 * @return the status - Company Policy Status
	 */
	public EnumerationValue getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefinition.status</code> attribute. 
	 * @param value the status - Company Policy Status
	 */
	public void setStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefinition.status</code> attribute. 
	 * @param value the status - Company Policy Status
	 */
	public void setStatus(final EnumerationValue value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
}
