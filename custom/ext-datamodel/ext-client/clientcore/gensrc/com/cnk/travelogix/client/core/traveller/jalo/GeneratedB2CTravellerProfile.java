/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.traveller.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.traveller.general.jalo.FriendDetail;
import com.cnk.travelogix.client.core.traveller.jalo.TravellerProfile;
import com.cnk.travelogix.client.masters.core.constants.ClientmastercoreConstants;
import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import com.cnk.travelogix.product.common.core.jalo.Interest;
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
 * Generated class for type {@link com.cnk.travelogix.client.core.traveller.jalo.B2CTravellerProfile B2CTravellerProfile}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedB2CTravellerProfile extends TravellerProfile
{
	/** Qualifier of the <code>B2CTravellerProfile.companyName</code> attribute **/
	public static final String COMPANYNAME = "companyName";
	/** Qualifier of the <code>B2CTravellerProfile.interests</code> attribute **/
	public static final String INTERESTS = "interests";
	/** Qualifier of the <code>B2CTravellerProfile.Identity</code> attribute **/
	public static final String IDENTITY = "Identity";
	/** Qualifier of the <code>B2CTravellerProfile.friendDetail</code> attribute **/
	public static final String FRIENDDETAIL = "friendDetail";
	/**
	* {@link OneToManyHandler} for handling 1:n INTERESTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Interest> INTERESTSHANDLER = new OneToManyHandler<Interest>(
	CommonproductcoreConstants.TC.INTEREST,
	false,
	"b2cTravellerProfile",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n IDENTITY's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EnumerationValue> IDENTITYHANDLER = new OneToManyHandler<EnumerationValue>(
	ClientmastercoreConstants.TC.IDENTITY,
	false,
	"b2cTravellerProfile",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n FRIENDDETAIL's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<FriendDetail> FRIENDDETAILHANDLER = new OneToManyHandler<FriendDetail>(
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(TravellerProfile.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(COMPANYNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2CTravellerProfile.companyName</code> attribute.
	 * @return the companyName
	 */
	public String getCompanyName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMPANYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2CTravellerProfile.companyName</code> attribute.
	 * @return the companyName
	 */
	public String getCompanyName()
	{
		return getCompanyName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2CTravellerProfile.companyName</code> attribute. 
	 * @param value the companyName
	 */
	public void setCompanyName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMPANYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2CTravellerProfile.companyName</code> attribute. 
	 * @param value the companyName
	 */
	public void setCompanyName(final String value)
	{
		setCompanyName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2CTravellerProfile.friendDetail</code> attribute.
	 * @return the friendDetail
	 */
	public Set<FriendDetail> getFriendDetail(final SessionContext ctx)
	{
		return (Set<FriendDetail>)FRIENDDETAILHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2CTravellerProfile.friendDetail</code> attribute.
	 * @return the friendDetail
	 */
	public Set<FriendDetail> getFriendDetail()
	{
		return getFriendDetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2CTravellerProfile.friendDetail</code> attribute. 
	 * @param value the friendDetail
	 */
	public void setFriendDetail(final SessionContext ctx, final Set<FriendDetail> value)
	{
		FRIENDDETAILHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2CTravellerProfile.friendDetail</code> attribute. 
	 * @param value the friendDetail
	 */
	public void setFriendDetail(final Set<FriendDetail> value)
	{
		setFriendDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to friendDetail. 
	 * @param value the item to add to friendDetail
	 */
	public void addToFriendDetail(final SessionContext ctx, final FriendDetail value)
	{
		FRIENDDETAILHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to friendDetail. 
	 * @param value the item to add to friendDetail
	 */
	public void addToFriendDetail(final FriendDetail value)
	{
		addToFriendDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from friendDetail. 
	 * @param value the item to remove from friendDetail
	 */
	public void removeFromFriendDetail(final SessionContext ctx, final FriendDetail value)
	{
		FRIENDDETAILHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from friendDetail. 
	 * @param value the item to remove from friendDetail
	 */
	public void removeFromFriendDetail(final FriendDetail value)
	{
		removeFromFriendDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2CTravellerProfile.Identity</code> attribute.
	 * @return the Identity
	 */
	public Set<EnumerationValue> getIdentity(final SessionContext ctx)
	{
		return (Set<EnumerationValue>)IDENTITYHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2CTravellerProfile.Identity</code> attribute.
	 * @return the Identity
	 */
	public Set<EnumerationValue> getIdentity()
	{
		return getIdentity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2CTravellerProfile.Identity</code> attribute. 
	 * @param value the Identity
	 */
	public void setIdentity(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		IDENTITYHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2CTravellerProfile.Identity</code> attribute. 
	 * @param value the Identity
	 */
	public void setIdentity(final Set<EnumerationValue> value)
	{
		setIdentity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to Identity. 
	 * @param value the item to add to Identity
	 */
	public void addToIdentity(final SessionContext ctx, final EnumerationValue value)
	{
		IDENTITYHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to Identity. 
	 * @param value the item to add to Identity
	 */
	public void addToIdentity(final EnumerationValue value)
	{
		addToIdentity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from Identity. 
	 * @param value the item to remove from Identity
	 */
	public void removeFromIdentity(final SessionContext ctx, final EnumerationValue value)
	{
		IDENTITYHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from Identity. 
	 * @param value the item to remove from Identity
	 */
	public void removeFromIdentity(final EnumerationValue value)
	{
		removeFromIdentity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2CTravellerProfile.interests</code> attribute.
	 * @return the interests
	 */
	public Set<Interest> getInterests(final SessionContext ctx)
	{
		return (Set<Interest>)INTERESTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2CTravellerProfile.interests</code> attribute.
	 * @return the interests
	 */
	public Set<Interest> getInterests()
	{
		return getInterests( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2CTravellerProfile.interests</code> attribute. 
	 * @param value the interests
	 */
	public void setInterests(final SessionContext ctx, final Set<Interest> value)
	{
		INTERESTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2CTravellerProfile.interests</code> attribute. 
	 * @param value the interests
	 */
	public void setInterests(final Set<Interest> value)
	{
		setInterests( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to interests. 
	 * @param value the item to add to interests
	 */
	public void addToInterests(final SessionContext ctx, final Interest value)
	{
		INTERESTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to interests. 
	 * @param value the item to add to interests
	 */
	public void addToInterests(final Interest value)
	{
		addToInterests( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from interests. 
	 * @param value the item to remove from interests
	 */
	public void removeFromInterests(final SessionContext ctx, final Interest value)
	{
		INTERESTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from interests. 
	 * @param value the item to remove from interests
	 */
	public void removeFromInterests(final Interest value)
	{
		removeFromInterests( getSession().getSessionContext(), value );
	}
	
}
