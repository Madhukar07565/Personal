/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.masterdata.core.contact.jalo;

import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.contacts.jalo.AbstractContactDetails;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.masterdata.core.contact.jalo.SocialContactInfo SocialContactInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSocialContactInfo extends AbstractContactDetails
{
	/** Qualifier of the <code>SocialContactInfo.socialNetwork</code> attribute **/
	public static final String SOCIALNETWORK = "socialNetwork";
	/** Qualifier of the <code>SocialContactInfo.idOrLoginOrHandleOrAddress</code> attribute **/
	public static final String IDORLOGINORHANDLEORADDRESS = "idOrLoginOrHandleOrAddress";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractContactDetails.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SOCIALNETWORK, AttributeMode.INITIAL);
		tmp.put(IDORLOGINORHANDLEORADDRESS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SocialContactInfo.idOrLoginOrHandleOrAddress</code> attribute.
	 * @return the idOrLoginOrHandleOrAddress
	 */
	public String getIdOrLoginOrHandleOrAddress(final SessionContext ctx)
	{
		return (String)getProperty( ctx, IDORLOGINORHANDLEORADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SocialContactInfo.idOrLoginOrHandleOrAddress</code> attribute.
	 * @return the idOrLoginOrHandleOrAddress
	 */
	public String getIdOrLoginOrHandleOrAddress()
	{
		return getIdOrLoginOrHandleOrAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SocialContactInfo.idOrLoginOrHandleOrAddress</code> attribute. 
	 * @param value the idOrLoginOrHandleOrAddress
	 */
	public void setIdOrLoginOrHandleOrAddress(final SessionContext ctx, final String value)
	{
		setProperty(ctx, IDORLOGINORHANDLEORADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SocialContactInfo.idOrLoginOrHandleOrAddress</code> attribute. 
	 * @param value the idOrLoginOrHandleOrAddress
	 */
	public void setIdOrLoginOrHandleOrAddress(final String value)
	{
		setIdOrLoginOrHandleOrAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SocialContactInfo.socialNetwork</code> attribute.
	 * @return the socialNetwork
	 */
	public String getSocialNetwork(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOCIALNETWORK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SocialContactInfo.socialNetwork</code> attribute.
	 * @return the socialNetwork
	 */
	public String getSocialNetwork()
	{
		return getSocialNetwork( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SocialContactInfo.socialNetwork</code> attribute. 
	 * @param value the socialNetwork
	 */
	public void setSocialNetwork(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOCIALNETWORK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SocialContactInfo.socialNetwork</code> attribute. 
	 * @param value the socialNetwork
	 */
	public void setSocialNetwork(final String value)
	{
		setSocialNetwork( getSession().getSessionContext(), value );
	}
	
}
