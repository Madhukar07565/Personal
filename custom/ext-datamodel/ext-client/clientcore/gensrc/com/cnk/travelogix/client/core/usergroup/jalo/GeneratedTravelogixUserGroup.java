/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.usergroup.jalo;

import com.cnk.travelogix.client.config.core.login.jalo.LoginConfig;
import com.cnk.travelogix.client.config.core.partpayment.jalo.PartPaymentMasterConfig;
import com.cnk.travelogix.client.config.core.registration.jalo.B2BRegistrationConfig;
import com.cnk.travelogix.client.config.core.registration.jalo.B2CRegistrationConfig;
import com.cnk.travelogix.client.config.core.timelimit.jalo.TimeLimitMasterConfig;
import com.cnk.travelogix.client.core.clienttype.jalo.TravelogixClientType;
import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.user.UserGroup;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.usergroup.jalo.TravelogixUserGroup TravelogixUserGroup}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTravelogixUserGroup extends UserGroup
{
	/** Qualifier of the <code>TravelogixUserGroup.loginConfig</code> attribute **/
	public static final String LOGINCONFIG = "loginConfig";
	/** Qualifier of the <code>TravelogixUserGroup.partPaymentMasterConfig</code> attribute **/
	public static final String PARTPAYMENTMASTERCONFIG = "partPaymentMasterConfig";
	/** Qualifier of the <code>TravelogixUserGroup.timeLimitMasterConfig</code> attribute **/
	public static final String TIMELIMITMASTERCONFIG = "timeLimitMasterConfig";
	/** Qualifier of the <code>TravelogixUserGroup.b2bRegistrationConfig</code> attribute **/
	public static final String B2BREGISTRATIONCONFIG = "b2bRegistrationConfig";
	/** Qualifier of the <code>TravelogixUserGroup.b2cRegistrationConfig</code> attribute **/
	public static final String B2CREGISTRATIONCONFIG = "b2cRegistrationConfig";
	/** Qualifier of the <code>TravelogixUserGroup.trvlClientType</code> attribute **/
	public static final String TRVLCLIENTTYPE = "trvlClientType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(UserGroup.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(LOGINCONFIG, AttributeMode.INITIAL);
		tmp.put(PARTPAYMENTMASTERCONFIG, AttributeMode.INITIAL);
		tmp.put(TIMELIMITMASTERCONFIG, AttributeMode.INITIAL);
		tmp.put(B2BREGISTRATIONCONFIG, AttributeMode.INITIAL);
		tmp.put(B2CREGISTRATIONCONFIG, AttributeMode.INITIAL);
		tmp.put(TRVLCLIENTTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixUserGroup.b2bRegistrationConfig</code> attribute.
	 * @return the b2bRegistrationConfig
	 */
	public B2BRegistrationConfig getB2bRegistrationConfig(final SessionContext ctx)
	{
		return (B2BRegistrationConfig)getProperty( ctx, B2BREGISTRATIONCONFIG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixUserGroup.b2bRegistrationConfig</code> attribute.
	 * @return the b2bRegistrationConfig
	 */
	public B2BRegistrationConfig getB2bRegistrationConfig()
	{
		return getB2bRegistrationConfig( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixUserGroup.b2bRegistrationConfig</code> attribute. 
	 * @param value the b2bRegistrationConfig
	 */
	public void setB2bRegistrationConfig(final SessionContext ctx, final B2BRegistrationConfig value)
	{
		setProperty(ctx, B2BREGISTRATIONCONFIG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixUserGroup.b2bRegistrationConfig</code> attribute. 
	 * @param value the b2bRegistrationConfig
	 */
	public void setB2bRegistrationConfig(final B2BRegistrationConfig value)
	{
		setB2bRegistrationConfig( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixUserGroup.b2cRegistrationConfig</code> attribute.
	 * @return the b2cRegistrationConfig
	 */
	public B2CRegistrationConfig getB2cRegistrationConfig(final SessionContext ctx)
	{
		return (B2CRegistrationConfig)getProperty( ctx, B2CREGISTRATIONCONFIG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixUserGroup.b2cRegistrationConfig</code> attribute.
	 * @return the b2cRegistrationConfig
	 */
	public B2CRegistrationConfig getB2cRegistrationConfig()
	{
		return getB2cRegistrationConfig( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixUserGroup.b2cRegistrationConfig</code> attribute. 
	 * @param value the b2cRegistrationConfig
	 */
	public void setB2cRegistrationConfig(final SessionContext ctx, final B2CRegistrationConfig value)
	{
		setProperty(ctx, B2CREGISTRATIONCONFIG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixUserGroup.b2cRegistrationConfig</code> attribute. 
	 * @param value the b2cRegistrationConfig
	 */
	public void setB2cRegistrationConfig(final B2CRegistrationConfig value)
	{
		setB2cRegistrationConfig( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixUserGroup.loginConfig</code> attribute.
	 * @return the loginConfig
	 */
	public LoginConfig getLoginConfig(final SessionContext ctx)
	{
		return (LoginConfig)getProperty( ctx, LOGINCONFIG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixUserGroup.loginConfig</code> attribute.
	 * @return the loginConfig
	 */
	public LoginConfig getLoginConfig()
	{
		return getLoginConfig( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixUserGroup.loginConfig</code> attribute. 
	 * @param value the loginConfig
	 */
	public void setLoginConfig(final SessionContext ctx, final LoginConfig value)
	{
		setProperty(ctx, LOGINCONFIG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixUserGroup.loginConfig</code> attribute. 
	 * @param value the loginConfig
	 */
	public void setLoginConfig(final LoginConfig value)
	{
		setLoginConfig( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixUserGroup.partPaymentMasterConfig</code> attribute.
	 * @return the partPaymentMasterConfig
	 */
	public PartPaymentMasterConfig getPartPaymentMasterConfig(final SessionContext ctx)
	{
		return (PartPaymentMasterConfig)getProperty( ctx, PARTPAYMENTMASTERCONFIG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixUserGroup.partPaymentMasterConfig</code> attribute.
	 * @return the partPaymentMasterConfig
	 */
	public PartPaymentMasterConfig getPartPaymentMasterConfig()
	{
		return getPartPaymentMasterConfig( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixUserGroup.partPaymentMasterConfig</code> attribute. 
	 * @param value the partPaymentMasterConfig
	 */
	public void setPartPaymentMasterConfig(final SessionContext ctx, final PartPaymentMasterConfig value)
	{
		setProperty(ctx, PARTPAYMENTMASTERCONFIG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixUserGroup.partPaymentMasterConfig</code> attribute. 
	 * @param value the partPaymentMasterConfig
	 */
	public void setPartPaymentMasterConfig(final PartPaymentMasterConfig value)
	{
		setPartPaymentMasterConfig( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixUserGroup.timeLimitMasterConfig</code> attribute.
	 * @return the timeLimitMasterConfig
	 */
	public TimeLimitMasterConfig getTimeLimitMasterConfig(final SessionContext ctx)
	{
		return (TimeLimitMasterConfig)getProperty( ctx, TIMELIMITMASTERCONFIG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixUserGroup.timeLimitMasterConfig</code> attribute.
	 * @return the timeLimitMasterConfig
	 */
	public TimeLimitMasterConfig getTimeLimitMasterConfig()
	{
		return getTimeLimitMasterConfig( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixUserGroup.timeLimitMasterConfig</code> attribute. 
	 * @param value the timeLimitMasterConfig
	 */
	public void setTimeLimitMasterConfig(final SessionContext ctx, final TimeLimitMasterConfig value)
	{
		setProperty(ctx, TIMELIMITMASTERCONFIG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixUserGroup.timeLimitMasterConfig</code> attribute. 
	 * @param value the timeLimitMasterConfig
	 */
	public void setTimeLimitMasterConfig(final TimeLimitMasterConfig value)
	{
		setTimeLimitMasterConfig( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixUserGroup.trvlClientType</code> attribute.
	 * @return the trvlClientType
	 */
	public TravelogixClientType getTrvlClientType(final SessionContext ctx)
	{
		return (TravelogixClientType)getProperty( ctx, TRVLCLIENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixUserGroup.trvlClientType</code> attribute.
	 * @return the trvlClientType
	 */
	public TravelogixClientType getTrvlClientType()
	{
		return getTrvlClientType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixUserGroup.trvlClientType</code> attribute. 
	 * @param value the trvlClientType
	 */
	public void setTrvlClientType(final SessionContext ctx, final TravelogixClientType value)
	{
		setProperty(ctx, TRVLCLIENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixUserGroup.trvlClientType</code> attribute. 
	 * @param value the trvlClientType
	 */
	public void setTrvlClientType(final TravelogixClientType value)
	{
		setTrvlClientType( getSession().getSessionContext(), value );
	}
	
}
