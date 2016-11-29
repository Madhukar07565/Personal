/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.login.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.masters.core.constants.ClientmastercoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.login.jalo.PasswordConfig PasswordConfig}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPasswordConfig extends GenericItem
{
	/** Qualifier of the <code>PasswordConfig.autoExpirePasswordAfterDays</code> attribute **/
	public static final String AUTOEXPIREPASSWORDAFTERDAYS = "autoExpirePasswordAfterDays";
	/** Qualifier of the <code>PasswordConfig.autoExpiredPasswordAllowed</code> attribute **/
	public static final String AUTOEXPIREDPASSWORDALLOWED = "autoExpiredPasswordAllowed";
	/** Qualifier of the <code>PasswordConfig.secretQuestionRequired</code> attribute **/
	public static final String SECRETQUESTIONREQUIRED = "secretQuestionRequired";
	/** Qualifier of the <code>PasswordConfig.retryAfterNMinutes</code> attribute **/
	public static final String RETRYAFTERNMINUTES = "retryAfterNMinutes";
	/** Qualifier of the <code>PasswordConfig.forgetPasswordCommunicationModes</code> attribute **/
	public static final String FORGETPASSWORDCOMMUNICATIONMODES = "forgetPasswordCommunicationModes";
	/** Qualifier of the <code>PasswordConfig.reminderCommunicationModesforEnabledAccount</code> attribute **/
	public static final String REMINDERCOMMUNICATIONMODESFORENABLEDACCOUNT = "reminderCommunicationModesforEnabledAccount";
	/** Qualifier of the <code>PasswordConfig.customFields</code> attribute **/
	public static final String CUSTOMFIELDS = "customFields";
	/**
	* {@link OneToManyHandler} for handling 1:n FORGETPASSWORDCOMMUNICATIONMODES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EnumerationValue> FORGETPASSWORDCOMMUNICATIONMODESHANDLER = new OneToManyHandler<EnumerationValue>(
	ClientmastercoreConstants.TC.COMMUNICATIONMODE,
	false,
	"passwordConfig",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n REMINDERCOMMUNICATIONMODESFORENABLEDACCOUNT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EnumerationValue> REMINDERCOMMUNICATIONMODESFORENABLEDACCOUNTHANDLER = new OneToManyHandler<EnumerationValue>(
	ClientmastercoreConstants.TC.COMMUNICATIONMODE,
	false,
	"passwordConfig",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CUSTOMFIELDS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EnumerationValue> CUSTOMFIELDSHANDLER = new OneToManyHandler<EnumerationValue>(
	ClientmastercoreConstants.TC.CUSTOMFIELDS,
	false,
	"passwordConfigCustFields",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(AUTOEXPIREPASSWORDAFTERDAYS, AttributeMode.INITIAL);
		tmp.put(AUTOEXPIREDPASSWORDALLOWED, AttributeMode.INITIAL);
		tmp.put(SECRETQUESTIONREQUIRED, AttributeMode.INITIAL);
		tmp.put(RETRYAFTERNMINUTES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PasswordConfig.autoExpiredPasswordAllowed</code> attribute.
	 * @return the autoExpiredPasswordAllowed
	 */
	public Boolean isAutoExpiredPasswordAllowed(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, AUTOEXPIREDPASSWORDALLOWED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PasswordConfig.autoExpiredPasswordAllowed</code> attribute.
	 * @return the autoExpiredPasswordAllowed
	 */
	public Boolean isAutoExpiredPasswordAllowed()
	{
		return isAutoExpiredPasswordAllowed( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PasswordConfig.autoExpiredPasswordAllowed</code> attribute. 
	 * @return the autoExpiredPasswordAllowed
	 */
	public boolean isAutoExpiredPasswordAllowedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAutoExpiredPasswordAllowed( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PasswordConfig.autoExpiredPasswordAllowed</code> attribute. 
	 * @return the autoExpiredPasswordAllowed
	 */
	public boolean isAutoExpiredPasswordAllowedAsPrimitive()
	{
		return isAutoExpiredPasswordAllowedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PasswordConfig.autoExpiredPasswordAllowed</code> attribute. 
	 * @param value the autoExpiredPasswordAllowed
	 */
	public void setAutoExpiredPasswordAllowed(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, AUTOEXPIREDPASSWORDALLOWED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PasswordConfig.autoExpiredPasswordAllowed</code> attribute. 
	 * @param value the autoExpiredPasswordAllowed
	 */
	public void setAutoExpiredPasswordAllowed(final Boolean value)
	{
		setAutoExpiredPasswordAllowed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PasswordConfig.autoExpiredPasswordAllowed</code> attribute. 
	 * @param value the autoExpiredPasswordAllowed
	 */
	public void setAutoExpiredPasswordAllowed(final SessionContext ctx, final boolean value)
	{
		setAutoExpiredPasswordAllowed( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PasswordConfig.autoExpiredPasswordAllowed</code> attribute. 
	 * @param value the autoExpiredPasswordAllowed
	 */
	public void setAutoExpiredPasswordAllowed(final boolean value)
	{
		setAutoExpiredPasswordAllowed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PasswordConfig.autoExpirePasswordAfterDays</code> attribute.
	 * @return the autoExpirePasswordAfterDays
	 */
	public Integer getAutoExpirePasswordAfterDays(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, AUTOEXPIREPASSWORDAFTERDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PasswordConfig.autoExpirePasswordAfterDays</code> attribute.
	 * @return the autoExpirePasswordAfterDays
	 */
	public Integer getAutoExpirePasswordAfterDays()
	{
		return getAutoExpirePasswordAfterDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PasswordConfig.autoExpirePasswordAfterDays</code> attribute. 
	 * @return the autoExpirePasswordAfterDays
	 */
	public int getAutoExpirePasswordAfterDaysAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAutoExpirePasswordAfterDays( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PasswordConfig.autoExpirePasswordAfterDays</code> attribute. 
	 * @return the autoExpirePasswordAfterDays
	 */
	public int getAutoExpirePasswordAfterDaysAsPrimitive()
	{
		return getAutoExpirePasswordAfterDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PasswordConfig.autoExpirePasswordAfterDays</code> attribute. 
	 * @param value the autoExpirePasswordAfterDays
	 */
	public void setAutoExpirePasswordAfterDays(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, AUTOEXPIREPASSWORDAFTERDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PasswordConfig.autoExpirePasswordAfterDays</code> attribute. 
	 * @param value the autoExpirePasswordAfterDays
	 */
	public void setAutoExpirePasswordAfterDays(final Integer value)
	{
		setAutoExpirePasswordAfterDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PasswordConfig.autoExpirePasswordAfterDays</code> attribute. 
	 * @param value the autoExpirePasswordAfterDays
	 */
	public void setAutoExpirePasswordAfterDays(final SessionContext ctx, final int value)
	{
		setAutoExpirePasswordAfterDays( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PasswordConfig.autoExpirePasswordAfterDays</code> attribute. 
	 * @param value the autoExpirePasswordAfterDays
	 */
	public void setAutoExpirePasswordAfterDays(final int value)
	{
		setAutoExpirePasswordAfterDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PasswordConfig.customFields</code> attribute.
	 * @return the customFields
	 */
	public Set<EnumerationValue> getCustomFields(final SessionContext ctx)
	{
		return (Set<EnumerationValue>)CUSTOMFIELDSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PasswordConfig.customFields</code> attribute.
	 * @return the customFields
	 */
	public Set<EnumerationValue> getCustomFields()
	{
		return getCustomFields( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PasswordConfig.customFields</code> attribute. 
	 * @param value the customFields
	 */
	public void setCustomFields(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		CUSTOMFIELDSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PasswordConfig.customFields</code> attribute. 
	 * @param value the customFields
	 */
	public void setCustomFields(final Set<EnumerationValue> value)
	{
		setCustomFields( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to customFields. 
	 * @param value the item to add to customFields
	 */
	public void addToCustomFields(final SessionContext ctx, final EnumerationValue value)
	{
		CUSTOMFIELDSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to customFields. 
	 * @param value the item to add to customFields
	 */
	public void addToCustomFields(final EnumerationValue value)
	{
		addToCustomFields( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from customFields. 
	 * @param value the item to remove from customFields
	 */
	public void removeFromCustomFields(final SessionContext ctx, final EnumerationValue value)
	{
		CUSTOMFIELDSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from customFields. 
	 * @param value the item to remove from customFields
	 */
	public void removeFromCustomFields(final EnumerationValue value)
	{
		removeFromCustomFields( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PasswordConfig.forgetPasswordCommunicationModes</code> attribute.
	 * @return the forgetPasswordCommunicationModes
	 */
	public Set<EnumerationValue> getForgetPasswordCommunicationModes(final SessionContext ctx)
	{
		return (Set<EnumerationValue>)FORGETPASSWORDCOMMUNICATIONMODESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PasswordConfig.forgetPasswordCommunicationModes</code> attribute.
	 * @return the forgetPasswordCommunicationModes
	 */
	public Set<EnumerationValue> getForgetPasswordCommunicationModes()
	{
		return getForgetPasswordCommunicationModes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PasswordConfig.forgetPasswordCommunicationModes</code> attribute. 
	 * @param value the forgetPasswordCommunicationModes
	 */
	public void setForgetPasswordCommunicationModes(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		FORGETPASSWORDCOMMUNICATIONMODESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PasswordConfig.forgetPasswordCommunicationModes</code> attribute. 
	 * @param value the forgetPasswordCommunicationModes
	 */
	public void setForgetPasswordCommunicationModes(final Set<EnumerationValue> value)
	{
		setForgetPasswordCommunicationModes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to forgetPasswordCommunicationModes. 
	 * @param value the item to add to forgetPasswordCommunicationModes
	 */
	public void addToForgetPasswordCommunicationModes(final SessionContext ctx, final EnumerationValue value)
	{
		FORGETPASSWORDCOMMUNICATIONMODESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to forgetPasswordCommunicationModes. 
	 * @param value the item to add to forgetPasswordCommunicationModes
	 */
	public void addToForgetPasswordCommunicationModes(final EnumerationValue value)
	{
		addToForgetPasswordCommunicationModes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from forgetPasswordCommunicationModes. 
	 * @param value the item to remove from forgetPasswordCommunicationModes
	 */
	public void removeFromForgetPasswordCommunicationModes(final SessionContext ctx, final EnumerationValue value)
	{
		FORGETPASSWORDCOMMUNICATIONMODESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from forgetPasswordCommunicationModes. 
	 * @param value the item to remove from forgetPasswordCommunicationModes
	 */
	public void removeFromForgetPasswordCommunicationModes(final EnumerationValue value)
	{
		removeFromForgetPasswordCommunicationModes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PasswordConfig.reminderCommunicationModesforEnabledAccount</code> attribute.
	 * @return the reminderCommunicationModesforEnabledAccount
	 */
	public Set<EnumerationValue> getReminderCommunicationModesforEnabledAccount(final SessionContext ctx)
	{
		return (Set<EnumerationValue>)REMINDERCOMMUNICATIONMODESFORENABLEDACCOUNTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PasswordConfig.reminderCommunicationModesforEnabledAccount</code> attribute.
	 * @return the reminderCommunicationModesforEnabledAccount
	 */
	public Set<EnumerationValue> getReminderCommunicationModesforEnabledAccount()
	{
		return getReminderCommunicationModesforEnabledAccount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PasswordConfig.reminderCommunicationModesforEnabledAccount</code> attribute. 
	 * @param value the reminderCommunicationModesforEnabledAccount
	 */
	public void setReminderCommunicationModesforEnabledAccount(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		REMINDERCOMMUNICATIONMODESFORENABLEDACCOUNTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PasswordConfig.reminderCommunicationModesforEnabledAccount</code> attribute. 
	 * @param value the reminderCommunicationModesforEnabledAccount
	 */
	public void setReminderCommunicationModesforEnabledAccount(final Set<EnumerationValue> value)
	{
		setReminderCommunicationModesforEnabledAccount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to reminderCommunicationModesforEnabledAccount. 
	 * @param value the item to add to reminderCommunicationModesforEnabledAccount
	 */
	public void addToReminderCommunicationModesforEnabledAccount(final SessionContext ctx, final EnumerationValue value)
	{
		REMINDERCOMMUNICATIONMODESFORENABLEDACCOUNTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to reminderCommunicationModesforEnabledAccount. 
	 * @param value the item to add to reminderCommunicationModesforEnabledAccount
	 */
	public void addToReminderCommunicationModesforEnabledAccount(final EnumerationValue value)
	{
		addToReminderCommunicationModesforEnabledAccount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from reminderCommunicationModesforEnabledAccount. 
	 * @param value the item to remove from reminderCommunicationModesforEnabledAccount
	 */
	public void removeFromReminderCommunicationModesforEnabledAccount(final SessionContext ctx, final EnumerationValue value)
	{
		REMINDERCOMMUNICATIONMODESFORENABLEDACCOUNTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from reminderCommunicationModesforEnabledAccount. 
	 * @param value the item to remove from reminderCommunicationModesforEnabledAccount
	 */
	public void removeFromReminderCommunicationModesforEnabledAccount(final EnumerationValue value)
	{
		removeFromReminderCommunicationModesforEnabledAccount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PasswordConfig.retryAfterNMinutes</code> attribute.
	 * @return the retryAfterNMinutes
	 */
	public Integer getRetryAfterNMinutes(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, RETRYAFTERNMINUTES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PasswordConfig.retryAfterNMinutes</code> attribute.
	 * @return the retryAfterNMinutes
	 */
	public Integer getRetryAfterNMinutes()
	{
		return getRetryAfterNMinutes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PasswordConfig.retryAfterNMinutes</code> attribute. 
	 * @return the retryAfterNMinutes
	 */
	public int getRetryAfterNMinutesAsPrimitive(final SessionContext ctx)
	{
		Integer value = getRetryAfterNMinutes( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PasswordConfig.retryAfterNMinutes</code> attribute. 
	 * @return the retryAfterNMinutes
	 */
	public int getRetryAfterNMinutesAsPrimitive()
	{
		return getRetryAfterNMinutesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PasswordConfig.retryAfterNMinutes</code> attribute. 
	 * @param value the retryAfterNMinutes
	 */
	public void setRetryAfterNMinutes(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, RETRYAFTERNMINUTES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PasswordConfig.retryAfterNMinutes</code> attribute. 
	 * @param value the retryAfterNMinutes
	 */
	public void setRetryAfterNMinutes(final Integer value)
	{
		setRetryAfterNMinutes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PasswordConfig.retryAfterNMinutes</code> attribute. 
	 * @param value the retryAfterNMinutes
	 */
	public void setRetryAfterNMinutes(final SessionContext ctx, final int value)
	{
		setRetryAfterNMinutes( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PasswordConfig.retryAfterNMinutes</code> attribute. 
	 * @param value the retryAfterNMinutes
	 */
	public void setRetryAfterNMinutes(final int value)
	{
		setRetryAfterNMinutes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PasswordConfig.secretQuestionRequired</code> attribute.
	 * @return the secretQuestionRequired
	 */
	public Boolean isSecretQuestionRequired(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SECRETQUESTIONREQUIRED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PasswordConfig.secretQuestionRequired</code> attribute.
	 * @return the secretQuestionRequired
	 */
	public Boolean isSecretQuestionRequired()
	{
		return isSecretQuestionRequired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PasswordConfig.secretQuestionRequired</code> attribute. 
	 * @return the secretQuestionRequired
	 */
	public boolean isSecretQuestionRequiredAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSecretQuestionRequired( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PasswordConfig.secretQuestionRequired</code> attribute. 
	 * @return the secretQuestionRequired
	 */
	public boolean isSecretQuestionRequiredAsPrimitive()
	{
		return isSecretQuestionRequiredAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PasswordConfig.secretQuestionRequired</code> attribute. 
	 * @param value the secretQuestionRequired
	 */
	public void setSecretQuestionRequired(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SECRETQUESTIONREQUIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PasswordConfig.secretQuestionRequired</code> attribute. 
	 * @param value the secretQuestionRequired
	 */
	public void setSecretQuestionRequired(final Boolean value)
	{
		setSecretQuestionRequired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PasswordConfig.secretQuestionRequired</code> attribute. 
	 * @param value the secretQuestionRequired
	 */
	public void setSecretQuestionRequired(final SessionContext ctx, final boolean value)
	{
		setSecretQuestionRequired( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PasswordConfig.secretQuestionRequired</code> attribute. 
	 * @param value the secretQuestionRequired
	 */
	public void setSecretQuestionRequired(final boolean value)
	{
		setSecretQuestionRequired( getSession().getSessionContext(), value );
	}
	
}
