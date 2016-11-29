/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.registration.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.security.Principal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.registration.jalo.B2CRegistrationConfig B2CRegistrationConfig}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedB2CRegistrationConfig extends GenericItem
{
	/** Qualifier of the <code>B2CRegistrationConfig.entityName</code> attribute **/
	public static final String ENTITYNAME = "entityName";
	/** Qualifier of the <code>B2CRegistrationConfig.activationLinkValidForDay</code> attribute **/
	public static final String ACTIVATIONLINKVALIDFORDAY = "activationLinkValidForDay";
	/** Qualifier of the <code>B2CRegistrationConfig.profileAutoActivation</code> attribute **/
	public static final String PROFILEAUTOACTIVATION = "profileAutoActivation";
	/** Qualifier of the <code>B2CRegistrationConfig.guestAccountAutoRegistraion</code> attribute **/
	public static final String GUESTACCOUNTAUTOREGISTRAION = "guestAccountAutoRegistraion";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ENTITYNAME, AttributeMode.INITIAL);
		tmp.put(ACTIVATIONLINKVALIDFORDAY, AttributeMode.INITIAL);
		tmp.put(PROFILEAUTOACTIVATION, AttributeMode.INITIAL);
		tmp.put(GUESTACCOUNTAUTOREGISTRAION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2CRegistrationConfig.activationLinkValidForDay</code> attribute.
	 * @return the activationLinkValidForDay
	 */
	public Integer getActivationLinkValidForDay(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ACTIVATIONLINKVALIDFORDAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2CRegistrationConfig.activationLinkValidForDay</code> attribute.
	 * @return the activationLinkValidForDay
	 */
	public Integer getActivationLinkValidForDay()
	{
		return getActivationLinkValidForDay( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2CRegistrationConfig.activationLinkValidForDay</code> attribute. 
	 * @return the activationLinkValidForDay
	 */
	public int getActivationLinkValidForDayAsPrimitive(final SessionContext ctx)
	{
		Integer value = getActivationLinkValidForDay( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2CRegistrationConfig.activationLinkValidForDay</code> attribute. 
	 * @return the activationLinkValidForDay
	 */
	public int getActivationLinkValidForDayAsPrimitive()
	{
		return getActivationLinkValidForDayAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2CRegistrationConfig.activationLinkValidForDay</code> attribute. 
	 * @param value the activationLinkValidForDay
	 */
	public void setActivationLinkValidForDay(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ACTIVATIONLINKVALIDFORDAY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2CRegistrationConfig.activationLinkValidForDay</code> attribute. 
	 * @param value the activationLinkValidForDay
	 */
	public void setActivationLinkValidForDay(final Integer value)
	{
		setActivationLinkValidForDay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2CRegistrationConfig.activationLinkValidForDay</code> attribute. 
	 * @param value the activationLinkValidForDay
	 */
	public void setActivationLinkValidForDay(final SessionContext ctx, final int value)
	{
		setActivationLinkValidForDay( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2CRegistrationConfig.activationLinkValidForDay</code> attribute. 
	 * @param value the activationLinkValidForDay
	 */
	public void setActivationLinkValidForDay(final int value)
	{
		setActivationLinkValidForDay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2CRegistrationConfig.entityName</code> attribute.
	 * @return the entityName
	 */
	public Principal getEntityName(final SessionContext ctx)
	{
		return (Principal)getProperty( ctx, ENTITYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2CRegistrationConfig.entityName</code> attribute.
	 * @return the entityName
	 */
	public Principal getEntityName()
	{
		return getEntityName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2CRegistrationConfig.entityName</code> attribute. 
	 * @param value the entityName
	 */
	public void setEntityName(final SessionContext ctx, final Principal value)
	{
		setProperty(ctx, ENTITYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2CRegistrationConfig.entityName</code> attribute. 
	 * @param value the entityName
	 */
	public void setEntityName(final Principal value)
	{
		setEntityName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2CRegistrationConfig.guestAccountAutoRegistraion</code> attribute.
	 * @return the guestAccountAutoRegistraion
	 */
	public Boolean isGuestAccountAutoRegistraion(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, GUESTACCOUNTAUTOREGISTRAION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2CRegistrationConfig.guestAccountAutoRegistraion</code> attribute.
	 * @return the guestAccountAutoRegistraion
	 */
	public Boolean isGuestAccountAutoRegistraion()
	{
		return isGuestAccountAutoRegistraion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2CRegistrationConfig.guestAccountAutoRegistraion</code> attribute. 
	 * @return the guestAccountAutoRegistraion
	 */
	public boolean isGuestAccountAutoRegistraionAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isGuestAccountAutoRegistraion( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2CRegistrationConfig.guestAccountAutoRegistraion</code> attribute. 
	 * @return the guestAccountAutoRegistraion
	 */
	public boolean isGuestAccountAutoRegistraionAsPrimitive()
	{
		return isGuestAccountAutoRegistraionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2CRegistrationConfig.guestAccountAutoRegistraion</code> attribute. 
	 * @param value the guestAccountAutoRegistraion
	 */
	public void setGuestAccountAutoRegistraion(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, GUESTACCOUNTAUTOREGISTRAION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2CRegistrationConfig.guestAccountAutoRegistraion</code> attribute. 
	 * @param value the guestAccountAutoRegistraion
	 */
	public void setGuestAccountAutoRegistraion(final Boolean value)
	{
		setGuestAccountAutoRegistraion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2CRegistrationConfig.guestAccountAutoRegistraion</code> attribute. 
	 * @param value the guestAccountAutoRegistraion
	 */
	public void setGuestAccountAutoRegistraion(final SessionContext ctx, final boolean value)
	{
		setGuestAccountAutoRegistraion( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2CRegistrationConfig.guestAccountAutoRegistraion</code> attribute. 
	 * @param value the guestAccountAutoRegistraion
	 */
	public void setGuestAccountAutoRegistraion(final boolean value)
	{
		setGuestAccountAutoRegistraion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2CRegistrationConfig.profileAutoActivation</code> attribute.
	 * @return the profileAutoActivation
	 */
	public Boolean isProfileAutoActivation(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PROFILEAUTOACTIVATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2CRegistrationConfig.profileAutoActivation</code> attribute.
	 * @return the profileAutoActivation
	 */
	public Boolean isProfileAutoActivation()
	{
		return isProfileAutoActivation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2CRegistrationConfig.profileAutoActivation</code> attribute. 
	 * @return the profileAutoActivation
	 */
	public boolean isProfileAutoActivationAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isProfileAutoActivation( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2CRegistrationConfig.profileAutoActivation</code> attribute. 
	 * @return the profileAutoActivation
	 */
	public boolean isProfileAutoActivationAsPrimitive()
	{
		return isProfileAutoActivationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2CRegistrationConfig.profileAutoActivation</code> attribute. 
	 * @param value the profileAutoActivation
	 */
	public void setProfileAutoActivation(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PROFILEAUTOACTIVATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2CRegistrationConfig.profileAutoActivation</code> attribute. 
	 * @param value the profileAutoActivation
	 */
	public void setProfileAutoActivation(final Boolean value)
	{
		setProfileAutoActivation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2CRegistrationConfig.profileAutoActivation</code> attribute. 
	 * @param value the profileAutoActivation
	 */
	public void setProfileAutoActivation(final SessionContext ctx, final boolean value)
	{
		setProfileAutoActivation( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2CRegistrationConfig.profileAutoActivation</code> attribute. 
	 * @param value the profileAutoActivation
	 */
	public void setProfileAutoActivation(final boolean value)
	{
		setProfileAutoActivation( getSession().getSessionContext(), value );
	}
	
}
