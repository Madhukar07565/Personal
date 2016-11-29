/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.BaseEnquiry;
import com.cnk.travelogix.common.core.jalo.UserJourneyPhone;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.util.PartOfHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem EnquiryClickToCall}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEnquiryClickToCall extends BaseEnquiry
{
	/** Qualifier of the <code>EnquiryClickToCall.preferredWayToCall</code> attribute **/
	public static final String PREFERREDWAYTOCALL = "preferredWayToCall";
	/** Qualifier of the <code>EnquiryClickToCall.residentialPhoneNo</code> attribute **/
	public static final String RESIDENTIALPHONENO = "residentialPhoneNo";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(BaseEnquiry.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PREFERREDWAYTOCALL, AttributeMode.INITIAL);
		tmp.put(RESIDENTIALPHONENO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryClickToCall.preferredWayToCall</code> attribute.
	 * @return the preferredWayToCall
	 */
	public String getPreferredWayToCall(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PREFERREDWAYTOCALL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryClickToCall.preferredWayToCall</code> attribute.
	 * @return the preferredWayToCall
	 */
	public String getPreferredWayToCall()
	{
		return getPreferredWayToCall( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryClickToCall.preferredWayToCall</code> attribute. 
	 * @param value the preferredWayToCall
	 */
	public void setPreferredWayToCall(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PREFERREDWAYTOCALL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryClickToCall.preferredWayToCall</code> attribute. 
	 * @param value the preferredWayToCall
	 */
	public void setPreferredWayToCall(final String value)
	{
		setPreferredWayToCall( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryClickToCall.residentialPhoneNo</code> attribute.
	 * @return the residentialPhoneNo
	 */
	public UserJourneyPhone getResidentialPhoneNo(final SessionContext ctx)
	{
		return (UserJourneyPhone)getProperty( ctx, RESIDENTIALPHONENO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryClickToCall.residentialPhoneNo</code> attribute.
	 * @return the residentialPhoneNo
	 */
	public UserJourneyPhone getResidentialPhoneNo()
	{
		return getResidentialPhoneNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryClickToCall.residentialPhoneNo</code> attribute. 
	 * @param value the residentialPhoneNo
	 */
	public void setResidentialPhoneNo(final SessionContext ctx, final UserJourneyPhone value)
	{
		new PartOfHandler<UserJourneyPhone>()
		{
			@Override
			protected UserJourneyPhone doGetValue(final SessionContext ctx)
			{
				return getResidentialPhoneNo( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final UserJourneyPhone _value)
			{
				final UserJourneyPhone value = _value;
				setProperty(ctx, RESIDENTIALPHONENO,value);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryClickToCall.residentialPhoneNo</code> attribute. 
	 * @param value the residentialPhoneNo
	 */
	public void setResidentialPhoneNo(final UserJourneyPhone value)
	{
		setResidentialPhoneNo( getSession().getSessionContext(), value );
	}
	
}
