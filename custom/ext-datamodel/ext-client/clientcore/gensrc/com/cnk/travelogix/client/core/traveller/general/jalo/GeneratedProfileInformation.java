/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.traveller.general.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.traveller.general.jalo.ProfileInformation;
import com.cnk.travelogix.client.core.traveller.jalo.TravellerProfile;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.traveller.general.jalo.ProfileInformation TravellerFamilyDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedProfileInformation extends GenericItem
{
	/** Qualifier of the <code>TravellerFamilyDetails.relationShip</code> attribute **/
	public static final String RELATIONSHIP = "relationShip";
	/** Qualifier of the <code>TravellerFamilyDetails.profileInformation</code> attribute **/
	public static final String PROFILEINFORMATION = "profileInformation";
	/** Qualifier of the <code>TravellerFamilyDetails.travellerProfile</code> attribute **/
	public static final String TRAVELLERPROFILE = "travellerProfile";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRAVELLERPROFILE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedProfileInformation> TRAVELLERPROFILEHANDLER = new BidirectionalOneToManyHandler<GeneratedProfileInformation>(
	ClientcoreConstants.TC.TRAVELLERFAMILYDETAILS,
	false,
	"travellerProfile",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(RELATIONSHIP, AttributeMode.INITIAL);
		tmp.put(PROFILEINFORMATION, AttributeMode.INITIAL);
		tmp.put(TRAVELLERPROFILE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TRAVELLERPROFILEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerFamilyDetails.profileInformation</code> attribute.
	 * @return the profileInformation
	 */
	public ProfileInformation getProfileInformation(final SessionContext ctx)
	{
		return (ProfileInformation)getProperty( ctx, PROFILEINFORMATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerFamilyDetails.profileInformation</code> attribute.
	 * @return the profileInformation
	 */
	public ProfileInformation getProfileInformation()
	{
		return getProfileInformation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerFamilyDetails.profileInformation</code> attribute. 
	 * @param value the profileInformation
	 */
	public void setProfileInformation(final SessionContext ctx, final ProfileInformation value)
	{
		setProperty(ctx, PROFILEINFORMATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerFamilyDetails.profileInformation</code> attribute. 
	 * @param value the profileInformation
	 */
	public void setProfileInformation(final ProfileInformation value)
	{
		setProfileInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerFamilyDetails.relationShip</code> attribute.
	 * @return the relationShip
	 */
	public EnumerationValue getRelationShip(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RELATIONSHIP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerFamilyDetails.relationShip</code> attribute.
	 * @return the relationShip
	 */
	public EnumerationValue getRelationShip()
	{
		return getRelationShip( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerFamilyDetails.relationShip</code> attribute. 
	 * @param value the relationShip
	 */
	public void setRelationShip(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RELATIONSHIP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerFamilyDetails.relationShip</code> attribute. 
	 * @param value the relationShip
	 */
	public void setRelationShip(final EnumerationValue value)
	{
		setRelationShip( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerFamilyDetails.travellerProfile</code> attribute.
	 * @return the travellerProfile
	 */
	public TravellerProfile getTravellerProfile(final SessionContext ctx)
	{
		return (TravellerProfile)getProperty( ctx, TRAVELLERPROFILE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerFamilyDetails.travellerProfile</code> attribute.
	 * @return the travellerProfile
	 */
	public TravellerProfile getTravellerProfile()
	{
		return getTravellerProfile( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerFamilyDetails.travellerProfile</code> attribute. 
	 * @param value the travellerProfile
	 */
	public void setTravellerProfile(final SessionContext ctx, final TravellerProfile value)
	{
		TRAVELLERPROFILEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerFamilyDetails.travellerProfile</code> attribute. 
	 * @param value the travellerProfile
	 */
	public void setTravellerProfile(final TravellerProfile value)
	{
		setTravellerProfile( getSession().getSessionContext(), value );
	}
	
}
