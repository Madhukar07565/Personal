/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.jalo;

import com.cnk.travelogix.constants.NotificationsConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.jalo.SMSContext SMSContext}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSMSContext extends GenericItem
{
	/** Qualifier of the <code>SMSContext.smsNotification</code> attribute **/
	public static final String SMSNOTIFICATION = "smsNotification";
	/** Qualifier of the <code>SMSContext.toMobileNumber</code> attribute **/
	public static final String TOMOBILENUMBER = "toMobileNumber";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SMSNOTIFICATION, AttributeMode.INITIAL);
		tmp.put(TOMOBILENUMBER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SMSContext.smsNotification</code> attribute.
	 * @return the smsNotification - Notification
	 */
	public String getSmsNotification(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SMSNOTIFICATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SMSContext.smsNotification</code> attribute.
	 * @return the smsNotification - Notification
	 */
	public String getSmsNotification()
	{
		return getSmsNotification( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SMSContext.smsNotification</code> attribute. 
	 * @param value the smsNotification - Notification
	 */
	public void setSmsNotification(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SMSNOTIFICATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SMSContext.smsNotification</code> attribute. 
	 * @param value the smsNotification - Notification
	 */
	public void setSmsNotification(final String value)
	{
		setSmsNotification( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SMSContext.toMobileNumber</code> attribute.
	 * @return the toMobileNumber - Notification
	 */
	public String getToMobileNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TOMOBILENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SMSContext.toMobileNumber</code> attribute.
	 * @return the toMobileNumber - Notification
	 */
	public String getToMobileNumber()
	{
		return getToMobileNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SMSContext.toMobileNumber</code> attribute. 
	 * @param value the toMobileNumber - Notification
	 */
	public void setToMobileNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TOMOBILENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SMSContext.toMobileNumber</code> attribute. 
	 * @param value the toMobileNumber - Notification
	 */
	public void setToMobileNumber(final String value)
	{
		setToMobileNumber( getSession().getSessionContext(), value );
	}
	
}
