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
 * Generated class for type {@link com.cnk.travelogix.client.config.core.registration.jalo.B2BRegistrationConfig B2BRegistrationConfig}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedB2BRegistrationConfig extends GenericItem
{
	/** Qualifier of the <code>B2BRegistrationConfig.entityName</code> attribute **/
	public static final String ENTITYNAME = "entityName";
	/** Qualifier of the <code>B2BRegistrationConfig.verificationLinkValidForDays</code> attribute **/
	public static final String VERIFICATIONLINKVALIDFORDAYS = "verificationLinkValidForDays";
	/** Qualifier of the <code>B2BRegistrationConfig.accountVerificationReq</code> attribute **/
	public static final String ACCOUNTVERIFICATIONREQ = "accountVerificationReq";
	/** Qualifier of the <code>B2BRegistrationConfig.profileAutoActivationEnabled</code> attribute **/
	public static final String PROFILEAUTOACTIVATIONENABLED = "profileAutoActivationEnabled";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ENTITYNAME, AttributeMode.INITIAL);
		tmp.put(VERIFICATIONLINKVALIDFORDAYS, AttributeMode.INITIAL);
		tmp.put(ACCOUNTVERIFICATIONREQ, AttributeMode.INITIAL);
		tmp.put(PROFILEAUTOACTIVATIONENABLED, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BRegistrationConfig.accountVerificationReq</code> attribute.
	 * @return the accountVerificationReq
	 */
	public Boolean isAccountVerificationReq(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ACCOUNTVERIFICATIONREQ);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BRegistrationConfig.accountVerificationReq</code> attribute.
	 * @return the accountVerificationReq
	 */
	public Boolean isAccountVerificationReq()
	{
		return isAccountVerificationReq( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BRegistrationConfig.accountVerificationReq</code> attribute. 
	 * @return the accountVerificationReq
	 */
	public boolean isAccountVerificationReqAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAccountVerificationReq( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BRegistrationConfig.accountVerificationReq</code> attribute. 
	 * @return the accountVerificationReq
	 */
	public boolean isAccountVerificationReqAsPrimitive()
	{
		return isAccountVerificationReqAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BRegistrationConfig.accountVerificationReq</code> attribute. 
	 * @param value the accountVerificationReq
	 */
	public void setAccountVerificationReq(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ACCOUNTVERIFICATIONREQ,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BRegistrationConfig.accountVerificationReq</code> attribute. 
	 * @param value the accountVerificationReq
	 */
	public void setAccountVerificationReq(final Boolean value)
	{
		setAccountVerificationReq( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BRegistrationConfig.accountVerificationReq</code> attribute. 
	 * @param value the accountVerificationReq
	 */
	public void setAccountVerificationReq(final SessionContext ctx, final boolean value)
	{
		setAccountVerificationReq( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BRegistrationConfig.accountVerificationReq</code> attribute. 
	 * @param value the accountVerificationReq
	 */
	public void setAccountVerificationReq(final boolean value)
	{
		setAccountVerificationReq( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BRegistrationConfig.entityName</code> attribute.
	 * @return the entityName
	 */
	public Principal getEntityName(final SessionContext ctx)
	{
		return (Principal)getProperty( ctx, ENTITYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BRegistrationConfig.entityName</code> attribute.
	 * @return the entityName
	 */
	public Principal getEntityName()
	{
		return getEntityName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BRegistrationConfig.entityName</code> attribute. 
	 * @param value the entityName
	 */
	public void setEntityName(final SessionContext ctx, final Principal value)
	{
		setProperty(ctx, ENTITYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BRegistrationConfig.entityName</code> attribute. 
	 * @param value the entityName
	 */
	public void setEntityName(final Principal value)
	{
		setEntityName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BRegistrationConfig.profileAutoActivationEnabled</code> attribute.
	 * @return the profileAutoActivationEnabled
	 */
	public Boolean isProfileAutoActivationEnabled(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PROFILEAUTOACTIVATIONENABLED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BRegistrationConfig.profileAutoActivationEnabled</code> attribute.
	 * @return the profileAutoActivationEnabled
	 */
	public Boolean isProfileAutoActivationEnabled()
	{
		return isProfileAutoActivationEnabled( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BRegistrationConfig.profileAutoActivationEnabled</code> attribute. 
	 * @return the profileAutoActivationEnabled
	 */
	public boolean isProfileAutoActivationEnabledAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isProfileAutoActivationEnabled( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BRegistrationConfig.profileAutoActivationEnabled</code> attribute. 
	 * @return the profileAutoActivationEnabled
	 */
	public boolean isProfileAutoActivationEnabledAsPrimitive()
	{
		return isProfileAutoActivationEnabledAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BRegistrationConfig.profileAutoActivationEnabled</code> attribute. 
	 * @param value the profileAutoActivationEnabled
	 */
	public void setProfileAutoActivationEnabled(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PROFILEAUTOACTIVATIONENABLED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BRegistrationConfig.profileAutoActivationEnabled</code> attribute. 
	 * @param value the profileAutoActivationEnabled
	 */
	public void setProfileAutoActivationEnabled(final Boolean value)
	{
		setProfileAutoActivationEnabled( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BRegistrationConfig.profileAutoActivationEnabled</code> attribute. 
	 * @param value the profileAutoActivationEnabled
	 */
	public void setProfileAutoActivationEnabled(final SessionContext ctx, final boolean value)
	{
		setProfileAutoActivationEnabled( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BRegistrationConfig.profileAutoActivationEnabled</code> attribute. 
	 * @param value the profileAutoActivationEnabled
	 */
	public void setProfileAutoActivationEnabled(final boolean value)
	{
		setProfileAutoActivationEnabled( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BRegistrationConfig.verificationLinkValidForDays</code> attribute.
	 * @return the verificationLinkValidForDays
	 */
	public Integer getVerificationLinkValidForDays(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, VERIFICATIONLINKVALIDFORDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BRegistrationConfig.verificationLinkValidForDays</code> attribute.
	 * @return the verificationLinkValidForDays
	 */
	public Integer getVerificationLinkValidForDays()
	{
		return getVerificationLinkValidForDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BRegistrationConfig.verificationLinkValidForDays</code> attribute. 
	 * @return the verificationLinkValidForDays
	 */
	public int getVerificationLinkValidForDaysAsPrimitive(final SessionContext ctx)
	{
		Integer value = getVerificationLinkValidForDays( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BRegistrationConfig.verificationLinkValidForDays</code> attribute. 
	 * @return the verificationLinkValidForDays
	 */
	public int getVerificationLinkValidForDaysAsPrimitive()
	{
		return getVerificationLinkValidForDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BRegistrationConfig.verificationLinkValidForDays</code> attribute. 
	 * @param value the verificationLinkValidForDays
	 */
	public void setVerificationLinkValidForDays(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, VERIFICATIONLINKVALIDFORDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BRegistrationConfig.verificationLinkValidForDays</code> attribute. 
	 * @param value the verificationLinkValidForDays
	 */
	public void setVerificationLinkValidForDays(final Integer value)
	{
		setVerificationLinkValidForDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BRegistrationConfig.verificationLinkValidForDays</code> attribute. 
	 * @param value the verificationLinkValidForDays
	 */
	public void setVerificationLinkValidForDays(final SessionContext ctx, final int value)
	{
		setVerificationLinkValidForDays( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BRegistrationConfig.verificationLinkValidForDays</code> attribute. 
	 * @param value the verificationLinkValidForDays
	 */
	public void setVerificationLinkValidForDays(final int value)
	{
		setVerificationLinkValidForDays( getSession().getSessionContext(), value );
	}
	
}
