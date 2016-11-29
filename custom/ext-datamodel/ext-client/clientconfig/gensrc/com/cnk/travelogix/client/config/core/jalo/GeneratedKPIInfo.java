/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.jalo.KPIDefinition;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.user.Employee;
import de.hybris.platform.jalo.user.UserGroup;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.KPIInfo KPIInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedKPIInfo extends GenericItem
{
	/** Qualifier of the <code>KPIInfo.kpiId</code> attribute **/
	public static final String KPIID = "kpiId";
	/** Qualifier of the <code>KPIInfo.functionalRole</code> attribute **/
	public static final String FUNCTIONALROLE = "functionalRole";
	/** Qualifier of the <code>KPIInfo.roleName</code> attribute **/
	public static final String ROLENAME = "roleName";
	/** Qualifier of the <code>KPIInfo.userName</code> attribute **/
	public static final String USERNAME = "userName";
	/** Qualifier of the <code>KPIInfo.effectiveFrom</code> attribute **/
	public static final String EFFECTIVEFROM = "effectiveFrom";
	/** Qualifier of the <code>KPIInfo.effectiveTo</code> attribute **/
	public static final String EFFECTIVETO = "effectiveTo";
	/** Qualifier of the <code>KPIInfo.lockedBy</code> attribute **/
	public static final String LOCKEDBY = "lockedBy";
	/** Qualifier of the <code>KPIInfo.kpiDefinitions</code> attribute **/
	public static final String KPIDEFINITIONS = "kpiDefinitions";
	/**
	* {@link OneToManyHandler} for handling 1:n KPIDEFINITIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<KPIDefinition> KPIDEFINITIONSHANDLER = new OneToManyHandler<KPIDefinition>(
	ClientconfigConstants.TC.KPIDEFINITION,
	false,
	"kpiInfo",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(KPIID, AttributeMode.INITIAL);
		tmp.put(FUNCTIONALROLE, AttributeMode.INITIAL);
		tmp.put(ROLENAME, AttributeMode.INITIAL);
		tmp.put(USERNAME, AttributeMode.INITIAL);
		tmp.put(EFFECTIVEFROM, AttributeMode.INITIAL);
		tmp.put(EFFECTIVETO, AttributeMode.INITIAL);
		tmp.put(LOCKEDBY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIInfo.effectiveFrom</code> attribute.
	 * @return the effectiveFrom - Effective from Date
	 */
	public Date getEffectiveFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EFFECTIVEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIInfo.effectiveFrom</code> attribute.
	 * @return the effectiveFrom - Effective from Date
	 */
	public Date getEffectiveFrom()
	{
		return getEffectiveFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIInfo.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom - Effective from Date
	 */
	public void setEffectiveFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EFFECTIVEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIInfo.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom - Effective from Date
	 */
	public void setEffectiveFrom(final Date value)
	{
		setEffectiveFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIInfo.effectiveTo</code> attribute.
	 * @return the effectiveTo - Effective To Date
	 */
	public Date getEffectiveTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EFFECTIVETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIInfo.effectiveTo</code> attribute.
	 * @return the effectiveTo - Effective To Date
	 */
	public Date getEffectiveTo()
	{
		return getEffectiveTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIInfo.effectiveTo</code> attribute. 
	 * @param value the effectiveTo - Effective To Date
	 */
	public void setEffectiveTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EFFECTIVETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIInfo.effectiveTo</code> attribute. 
	 * @param value the effectiveTo - Effective To Date
	 */
	public void setEffectiveTo(final Date value)
	{
		setEffectiveTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIInfo.functionalRole</code> attribute.
	 * @return the functionalRole - Functional role
	 */
	public UserGroup getFunctionalRole(final SessionContext ctx)
	{
		return (UserGroup)getProperty( ctx, FUNCTIONALROLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIInfo.functionalRole</code> attribute.
	 * @return the functionalRole - Functional role
	 */
	public UserGroup getFunctionalRole()
	{
		return getFunctionalRole( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIInfo.functionalRole</code> attribute. 
	 * @param value the functionalRole - Functional role
	 */
	public void setFunctionalRole(final SessionContext ctx, final UserGroup value)
	{
		setProperty(ctx, FUNCTIONALROLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIInfo.functionalRole</code> attribute. 
	 * @param value the functionalRole - Functional role
	 */
	public void setFunctionalRole(final UserGroup value)
	{
		setFunctionalRole( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIInfo.kpiDefinitions</code> attribute.
	 * @return the kpiDefinitions
	 */
	public Collection<KPIDefinition> getKpiDefinitions(final SessionContext ctx)
	{
		return KPIDEFINITIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIInfo.kpiDefinitions</code> attribute.
	 * @return the kpiDefinitions
	 */
	public Collection<KPIDefinition> getKpiDefinitions()
	{
		return getKpiDefinitions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIInfo.kpiDefinitions</code> attribute. 
	 * @param value the kpiDefinitions
	 */
	public void setKpiDefinitions(final SessionContext ctx, final Collection<KPIDefinition> value)
	{
		KPIDEFINITIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIInfo.kpiDefinitions</code> attribute. 
	 * @param value the kpiDefinitions
	 */
	public void setKpiDefinitions(final Collection<KPIDefinition> value)
	{
		setKpiDefinitions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to kpiDefinitions. 
	 * @param value the item to add to kpiDefinitions
	 */
	public void addToKpiDefinitions(final SessionContext ctx, final KPIDefinition value)
	{
		KPIDEFINITIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to kpiDefinitions. 
	 * @param value the item to add to kpiDefinitions
	 */
	public void addToKpiDefinitions(final KPIDefinition value)
	{
		addToKpiDefinitions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from kpiDefinitions. 
	 * @param value the item to remove from kpiDefinitions
	 */
	public void removeFromKpiDefinitions(final SessionContext ctx, final KPIDefinition value)
	{
		KPIDEFINITIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from kpiDefinitions. 
	 * @param value the item to remove from kpiDefinitions
	 */
	public void removeFromKpiDefinitions(final KPIDefinition value)
	{
		removeFromKpiDefinitions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIInfo.kpiId</code> attribute.
	 * @return the kpiId - KPI ID
	 */
	public String getKpiId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, KPIID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIInfo.kpiId</code> attribute.
	 * @return the kpiId - KPI ID
	 */
	public String getKpiId()
	{
		return getKpiId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIInfo.kpiId</code> attribute. 
	 * @param value the kpiId - KPI ID
	 */
	public void setKpiId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, KPIID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIInfo.kpiId</code> attribute. 
	 * @param value the kpiId - KPI ID
	 */
	public void setKpiId(final String value)
	{
		setKpiId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIInfo.lockedBy</code> attribute.
	 * @return the lockedBy
	 */
	public Employee getLockedBy(final SessionContext ctx)
	{
		return (Employee)getProperty( ctx, LOCKEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIInfo.lockedBy</code> attribute.
	 * @return the lockedBy
	 */
	public Employee getLockedBy()
	{
		return getLockedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIInfo.lockedBy</code> attribute. 
	 * @param value the lockedBy
	 */
	public void setLockedBy(final SessionContext ctx, final Employee value)
	{
		setProperty(ctx, LOCKEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIInfo.lockedBy</code> attribute. 
	 * @param value the lockedBy
	 */
	public void setLockedBy(final Employee value)
	{
		setLockedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIInfo.roleName</code> attribute.
	 * @return the roleName - Role name
	 */
	public UserGroup getRoleName(final SessionContext ctx)
	{
		return (UserGroup)getProperty( ctx, ROLENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIInfo.roleName</code> attribute.
	 * @return the roleName - Role name
	 */
	public UserGroup getRoleName()
	{
		return getRoleName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIInfo.roleName</code> attribute. 
	 * @param value the roleName - Role name
	 */
	public void setRoleName(final SessionContext ctx, final UserGroup value)
	{
		setProperty(ctx, ROLENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIInfo.roleName</code> attribute. 
	 * @param value the roleName - Role name
	 */
	public void setRoleName(final UserGroup value)
	{
		setRoleName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIInfo.userName</code> attribute.
	 * @return the userName - User Name
	 */
	public Employee getUserName(final SessionContext ctx)
	{
		return (Employee)getProperty( ctx, USERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIInfo.userName</code> attribute.
	 * @return the userName - User Name
	 */
	public Employee getUserName()
	{
		return getUserName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIInfo.userName</code> attribute. 
	 * @param value the userName - User Name
	 */
	public void setUserName(final SessionContext ctx, final Employee value)
	{
		setProperty(ctx, USERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIInfo.userName</code> attribute. 
	 * @param value the userName - User Name
	 */
	public void setUserName(final Employee value)
	{
		setUserName( getSession().getSessionContext(), value );
	}
	
}
