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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem EnquiryCallBack}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEnquiryCallBack extends BaseEnquiry
{
	/** Qualifier of the <code>EnquiryCallBack.residentialPhoneNo</code> attribute **/
	public static final String RESIDENTIALPHONENO = "residentialPhoneNo";
	/** Qualifier of the <code>EnquiryCallBack.departureCity</code> attribute **/
	public static final String DEPARTURECITY = "departureCity";
	/** Qualifier of the <code>EnquiryCallBack.preferredWayToCall</code> attribute **/
	public static final String PREFERREDWAYTOCALL = "preferredWayToCall";
	/** Qualifier of the <code>EnquiryCallBack.preferredContactTime</code> attribute **/
	public static final String PREFERREDCONTACTTIME = "preferredContactTime";
	/** Qualifier of the <code>EnquiryCallBack.contactDate</code> attribute **/
	public static final String CONTACTDATE = "contactDate";
	/** Qualifier of the <code>EnquiryCallBack.contactTime</code> attribute **/
	public static final String CONTACTTIME = "contactTime";
	/** Qualifier of the <code>EnquiryCallBack.remark</code> attribute **/
	public static final String REMARK = "remark";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(BaseEnquiry.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(RESIDENTIALPHONENO, AttributeMode.INITIAL);
		tmp.put(DEPARTURECITY, AttributeMode.INITIAL);
		tmp.put(PREFERREDWAYTOCALL, AttributeMode.INITIAL);
		tmp.put(PREFERREDCONTACTTIME, AttributeMode.INITIAL);
		tmp.put(CONTACTDATE, AttributeMode.INITIAL);
		tmp.put(CONTACTTIME, AttributeMode.INITIAL);
		tmp.put(REMARK, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryCallBack.contactDate</code> attribute.
	 * @return the contactDate
	 */
	public Date getContactDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CONTACTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryCallBack.contactDate</code> attribute.
	 * @return the contactDate
	 */
	public Date getContactDate()
	{
		return getContactDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryCallBack.contactDate</code> attribute. 
	 * @param value the contactDate
	 */
	public void setContactDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CONTACTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryCallBack.contactDate</code> attribute. 
	 * @param value the contactDate
	 */
	public void setContactDate(final Date value)
	{
		setContactDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryCallBack.contactTime</code> attribute.
	 * @return the contactTime
	 */
	public Date getContactTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CONTACTTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryCallBack.contactTime</code> attribute.
	 * @return the contactTime
	 */
	public Date getContactTime()
	{
		return getContactTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryCallBack.contactTime</code> attribute. 
	 * @param value the contactTime
	 */
	public void setContactTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CONTACTTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryCallBack.contactTime</code> attribute. 
	 * @param value the contactTime
	 */
	public void setContactTime(final Date value)
	{
		setContactTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryCallBack.departureCity</code> attribute.
	 * @return the departureCity
	 */
	public String getDepartureCity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DEPARTURECITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryCallBack.departureCity</code> attribute.
	 * @return the departureCity
	 */
	public String getDepartureCity()
	{
		return getDepartureCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryCallBack.departureCity</code> attribute. 
	 * @param value the departureCity
	 */
	public void setDepartureCity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DEPARTURECITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryCallBack.departureCity</code> attribute. 
	 * @param value the departureCity
	 */
	public void setDepartureCity(final String value)
	{
		setDepartureCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryCallBack.preferredContactTime</code> attribute.
	 * @return the preferredContactTime
	 */
	public String getPreferredContactTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PREFERREDCONTACTTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryCallBack.preferredContactTime</code> attribute.
	 * @return the preferredContactTime
	 */
	public String getPreferredContactTime()
	{
		return getPreferredContactTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryCallBack.preferredContactTime</code> attribute. 
	 * @param value the preferredContactTime
	 */
	public void setPreferredContactTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PREFERREDCONTACTTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryCallBack.preferredContactTime</code> attribute. 
	 * @param value the preferredContactTime
	 */
	public void setPreferredContactTime(final String value)
	{
		setPreferredContactTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryCallBack.preferredWayToCall</code> attribute.
	 * @return the preferredWayToCall
	 */
	public String getPreferredWayToCall(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PREFERREDWAYTOCALL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryCallBack.preferredWayToCall</code> attribute.
	 * @return the preferredWayToCall
	 */
	public String getPreferredWayToCall()
	{
		return getPreferredWayToCall( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryCallBack.preferredWayToCall</code> attribute. 
	 * @param value the preferredWayToCall
	 */
	public void setPreferredWayToCall(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PREFERREDWAYTOCALL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryCallBack.preferredWayToCall</code> attribute. 
	 * @param value the preferredWayToCall
	 */
	public void setPreferredWayToCall(final String value)
	{
		setPreferredWayToCall( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryCallBack.remark</code> attribute.
	 * @return the remark
	 */
	public String getRemark(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REMARK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryCallBack.remark</code> attribute.
	 * @return the remark
	 */
	public String getRemark()
	{
		return getRemark( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryCallBack.remark</code> attribute. 
	 * @param value the remark
	 */
	public void setRemark(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REMARK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryCallBack.remark</code> attribute. 
	 * @param value the remark
	 */
	public void setRemark(final String value)
	{
		setRemark( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryCallBack.residentialPhoneNo</code> attribute.
	 * @return the residentialPhoneNo
	 */
	public UserJourneyPhone getResidentialPhoneNo(final SessionContext ctx)
	{
		return (UserJourneyPhone)getProperty( ctx, RESIDENTIALPHONENO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryCallBack.residentialPhoneNo</code> attribute.
	 * @return the residentialPhoneNo
	 */
	public UserJourneyPhone getResidentialPhoneNo()
	{
		return getResidentialPhoneNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryCallBack.residentialPhoneNo</code> attribute. 
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
	 * <i>Generated method</i> - Setter of the <code>EnquiryCallBack.residentialPhoneNo</code> attribute. 
	 * @param value the residentialPhoneNo
	 */
	public void setResidentialPhoneNo(final UserJourneyPhone value)
	{
		setResidentialPhoneNo( getSession().getSessionContext(), value );
	}
	
}
