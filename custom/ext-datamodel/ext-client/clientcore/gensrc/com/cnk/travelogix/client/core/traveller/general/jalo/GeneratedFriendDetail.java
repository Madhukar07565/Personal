/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.traveller.general.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.traveller.jalo.B2CTravellerProfile;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.traveller.general.jalo.FriendDetail FriendDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFriendDetail extends GenericItem
{
	/** Qualifier of the <code>FriendDetail.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>FriendDetail.address</code> attribute **/
	public static final String ADDRESS = "address";
	/** Qualifier of the <code>FriendDetail.telephone</code> attribute **/
	public static final String TELEPHONE = "telephone";
	/** Qualifier of the <code>FriendDetail.mobile</code> attribute **/
	public static final String MOBILE = "mobile";
	/** Qualifier of the <code>FriendDetail.emails</code> attribute **/
	public static final String EMAILS = "emails";
	/** Qualifier of the <code>FriendDetail.b2cTravellerProfile</code> attribute **/
	public static final String B2CTRAVELLERPROFILE = "b2cTravellerProfile";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n B2CTRAVELLERPROFILE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedFriendDetail> B2CTRAVELLERPROFILEHANDLER = new BidirectionalOneToManyHandler<GeneratedFriendDetail>(
	ClientcoreConstants.TC.FRIENDDETAIL,
	false,
	"b2cTravellerProfile",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(ADDRESS, AttributeMode.INITIAL);
		tmp.put(TELEPHONE, AttributeMode.INITIAL);
		tmp.put(MOBILE, AttributeMode.INITIAL);
		tmp.put(EMAILS, AttributeMode.INITIAL);
		tmp.put(B2CTRAVELLERPROFILE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FriendDetail.address</code> attribute.
	 * @return the address
	 */
	public String getAddress(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FriendDetail.address</code> attribute.
	 * @return the address
	 */
	public String getAddress()
	{
		return getAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FriendDetail.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FriendDetail.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final String value)
	{
		setAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FriendDetail.b2cTravellerProfile</code> attribute.
	 * @return the b2cTravellerProfile
	 */
	public B2CTravellerProfile getB2cTravellerProfile(final SessionContext ctx)
	{
		return (B2CTravellerProfile)getProperty( ctx, B2CTRAVELLERPROFILE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FriendDetail.b2cTravellerProfile</code> attribute.
	 * @return the b2cTravellerProfile
	 */
	public B2CTravellerProfile getB2cTravellerProfile()
	{
		return getB2cTravellerProfile( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FriendDetail.b2cTravellerProfile</code> attribute. 
	 * @param value the b2cTravellerProfile
	 */
	public void setB2cTravellerProfile(final SessionContext ctx, final B2CTravellerProfile value)
	{
		B2CTRAVELLERPROFILEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FriendDetail.b2cTravellerProfile</code> attribute. 
	 * @param value the b2cTravellerProfile
	 */
	public void setB2cTravellerProfile(final B2CTravellerProfile value)
	{
		setB2cTravellerProfile( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		B2CTRAVELLERPROFILEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FriendDetail.emails</code> attribute.
	 * @return the emails
	 */
	public Collection<String> getEmails(final SessionContext ctx)
	{
		Collection<String> coll = (Collection<String>)getProperty( ctx, EMAILS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FriendDetail.emails</code> attribute.
	 * @return the emails
	 */
	public Collection<String> getEmails()
	{
		return getEmails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FriendDetail.emails</code> attribute. 
	 * @param value the emails
	 */
	public void setEmails(final SessionContext ctx, final Collection<String> value)
	{
		setProperty(ctx, EMAILS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FriendDetail.emails</code> attribute. 
	 * @param value the emails
	 */
	public void setEmails(final Collection<String> value)
	{
		setEmails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FriendDetail.mobile</code> attribute.
	 * @return the mobile
	 */
	public String getMobile(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MOBILE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FriendDetail.mobile</code> attribute.
	 * @return the mobile
	 */
	public String getMobile()
	{
		return getMobile( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FriendDetail.mobile</code> attribute. 
	 * @param value the mobile
	 */
	public void setMobile(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MOBILE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FriendDetail.mobile</code> attribute. 
	 * @param value the mobile
	 */
	public void setMobile(final String value)
	{
		setMobile( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FriendDetail.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FriendDetail.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FriendDetail.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FriendDetail.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FriendDetail.telephone</code> attribute.
	 * @return the telephone
	 */
	public String getTelephone(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TELEPHONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FriendDetail.telephone</code> attribute.
	 * @return the telephone
	 */
	public String getTelephone()
	{
		return getTelephone( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FriendDetail.telephone</code> attribute. 
	 * @param value the telephone
	 */
	public void setTelephone(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TELEPHONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FriendDetail.telephone</code> attribute. 
	 * @param value the telephone
	 */
	public void setTelephone(final String value)
	{
		setTelephone( getSession().getSessionContext(), value );
	}
	
}
