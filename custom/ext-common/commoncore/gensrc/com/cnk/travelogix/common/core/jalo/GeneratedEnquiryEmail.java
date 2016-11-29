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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem EnquiryEmail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEnquiryEmail extends BaseEnquiry
{
	/** Qualifier of the <code>EnquiryEmail.preferredLandline</code> attribute **/
	public static final String PREFERREDLANDLINE = "preferredLandline";
	/** Qualifier of the <code>EnquiryEmail.residentialPhoneNo</code> attribute **/
	public static final String RESIDENTIALPHONENO = "residentialPhoneNo";
	/** Qualifier of the <code>EnquiryEmail.officePhoneNo</code> attribute **/
	public static final String OFFICEPHONENO = "officePhoneNo";
	/** Qualifier of the <code>EnquiryEmail.remark</code> attribute **/
	public static final String REMARK = "remark";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(BaseEnquiry.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PREFERREDLANDLINE, AttributeMode.INITIAL);
		tmp.put(RESIDENTIALPHONENO, AttributeMode.INITIAL);
		tmp.put(OFFICEPHONENO, AttributeMode.INITIAL);
		tmp.put(REMARK, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryEmail.officePhoneNo</code> attribute.
	 * @return the officePhoneNo
	 */
	public UserJourneyPhone getOfficePhoneNo(final SessionContext ctx)
	{
		return (UserJourneyPhone)getProperty( ctx, OFFICEPHONENO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryEmail.officePhoneNo</code> attribute.
	 * @return the officePhoneNo
	 */
	public UserJourneyPhone getOfficePhoneNo()
	{
		return getOfficePhoneNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryEmail.officePhoneNo</code> attribute. 
	 * @param value the officePhoneNo
	 */
	public void setOfficePhoneNo(final SessionContext ctx, final UserJourneyPhone value)
	{
		new PartOfHandler<UserJourneyPhone>()
		{
			@Override
			protected UserJourneyPhone doGetValue(final SessionContext ctx)
			{
				return getOfficePhoneNo( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final UserJourneyPhone _value)
			{
				final UserJourneyPhone value = _value;
				setProperty(ctx, OFFICEPHONENO,value);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryEmail.officePhoneNo</code> attribute. 
	 * @param value the officePhoneNo
	 */
	public void setOfficePhoneNo(final UserJourneyPhone value)
	{
		setOfficePhoneNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryEmail.preferredLandline</code> attribute.
	 * @return the preferredLandline
	 */
	public String getPreferredLandline(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PREFERREDLANDLINE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryEmail.preferredLandline</code> attribute.
	 * @return the preferredLandline
	 */
	public String getPreferredLandline()
	{
		return getPreferredLandline( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryEmail.preferredLandline</code> attribute. 
	 * @param value the preferredLandline
	 */
	public void setPreferredLandline(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PREFERREDLANDLINE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryEmail.preferredLandline</code> attribute. 
	 * @param value the preferredLandline
	 */
	public void setPreferredLandline(final String value)
	{
		setPreferredLandline( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryEmail.remark</code> attribute.
	 * @return the remark
	 */
	public String getRemark(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REMARK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryEmail.remark</code> attribute.
	 * @return the remark
	 */
	public String getRemark()
	{
		return getRemark( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryEmail.remark</code> attribute. 
	 * @param value the remark
	 */
	public void setRemark(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REMARK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryEmail.remark</code> attribute. 
	 * @param value the remark
	 */
	public void setRemark(final String value)
	{
		setRemark( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryEmail.residentialPhoneNo</code> attribute.
	 * @return the residentialPhoneNo
	 */
	public UserJourneyPhone getResidentialPhoneNo(final SessionContext ctx)
	{
		return (UserJourneyPhone)getProperty( ctx, RESIDENTIALPHONENO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryEmail.residentialPhoneNo</code> attribute.
	 * @return the residentialPhoneNo
	 */
	public UserJourneyPhone getResidentialPhoneNo()
	{
		return getResidentialPhoneNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryEmail.residentialPhoneNo</code> attribute. 
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
	 * <i>Generated method</i> - Setter of the <code>EnquiryEmail.residentialPhoneNo</code> attribute. 
	 * @param value the residentialPhoneNo
	 */
	public void setResidentialPhoneNo(final UserJourneyPhone value)
	{
		setResidentialPhoneNo( getSession().getSessionContext(), value );
	}
	
}
