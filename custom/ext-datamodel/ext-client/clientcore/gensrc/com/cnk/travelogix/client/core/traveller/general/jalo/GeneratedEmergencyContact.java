/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.traveller.general.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
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
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.traveller.general.jalo.EmergencyContact EmergencyContact}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEmergencyContact extends GenericItem
{
	/** Qualifier of the <code>EmergencyContact.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>EmergencyContact.address</code> attribute **/
	public static final String ADDRESS = "address";
	/** Qualifier of the <code>EmergencyContact.telephoneBusinessHr</code> attribute **/
	public static final String TELEPHONEBUSINESSHR = "telephoneBusinessHr";
	/** Qualifier of the <code>EmergencyContact.telephoneAfterHr</code> attribute **/
	public static final String TELEPHONEAFTERHR = "telephoneAfterHr";
	/** Qualifier of the <code>EmergencyContact.mobileNunber</code> attribute **/
	public static final String MOBILENUNBER = "mobileNunber";
	/** Qualifier of the <code>EmergencyContact.emails</code> attribute **/
	public static final String EMAILS = "emails";
	/** Qualifier of the <code>EmergencyContact.relationShip</code> attribute **/
	public static final String RELATIONSHIP = "relationShip";
	/** Qualifier of the <code>EmergencyContact.travellerProfile</code> attribute **/
	public static final String TRAVELLERPROFILE = "travellerProfile";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRAVELLERPROFILE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedEmergencyContact> TRAVELLERPROFILEHANDLER = new BidirectionalOneToManyHandler<GeneratedEmergencyContact>(
	ClientcoreConstants.TC.EMERGENCYCONTACT,
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
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(ADDRESS, AttributeMode.INITIAL);
		tmp.put(TELEPHONEBUSINESSHR, AttributeMode.INITIAL);
		tmp.put(TELEPHONEAFTERHR, AttributeMode.INITIAL);
		tmp.put(MOBILENUNBER, AttributeMode.INITIAL);
		tmp.put(EMAILS, AttributeMode.INITIAL);
		tmp.put(RELATIONSHIP, AttributeMode.INITIAL);
		tmp.put(TRAVELLERPROFILE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmergencyContact.address</code> attribute.
	 * @return the address
	 */
	public String getAddress(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmergencyContact.address</code> attribute.
	 * @return the address
	 */
	public String getAddress()
	{
		return getAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmergencyContact.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmergencyContact.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final String value)
	{
		setAddress( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TRAVELLERPROFILEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmergencyContact.emails</code> attribute.
	 * @return the emails
	 */
	public Collection<String> getEmails(final SessionContext ctx)
	{
		Collection<String> coll = (Collection<String>)getProperty( ctx, EMAILS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmergencyContact.emails</code> attribute.
	 * @return the emails
	 */
	public Collection<String> getEmails()
	{
		return getEmails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmergencyContact.emails</code> attribute. 
	 * @param value the emails
	 */
	public void setEmails(final SessionContext ctx, final Collection<String> value)
	{
		setProperty(ctx, EMAILS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmergencyContact.emails</code> attribute. 
	 * @param value the emails
	 */
	public void setEmails(final Collection<String> value)
	{
		setEmails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmergencyContact.mobileNunber</code> attribute.
	 * @return the mobileNunber
	 */
	public String getMobileNunber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MOBILENUNBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmergencyContact.mobileNunber</code> attribute.
	 * @return the mobileNunber
	 */
	public String getMobileNunber()
	{
		return getMobileNunber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmergencyContact.mobileNunber</code> attribute. 
	 * @param value the mobileNunber
	 */
	public void setMobileNunber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MOBILENUNBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmergencyContact.mobileNunber</code> attribute. 
	 * @param value the mobileNunber
	 */
	public void setMobileNunber(final String value)
	{
		setMobileNunber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmergencyContact.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmergencyContact.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmergencyContact.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmergencyContact.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmergencyContact.relationShip</code> attribute.
	 * @return the relationShip
	 */
	public EnumerationValue getRelationShip(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RELATIONSHIP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmergencyContact.relationShip</code> attribute.
	 * @return the relationShip
	 */
	public EnumerationValue getRelationShip()
	{
		return getRelationShip( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmergencyContact.relationShip</code> attribute. 
	 * @param value the relationShip
	 */
	public void setRelationShip(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RELATIONSHIP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmergencyContact.relationShip</code> attribute. 
	 * @param value the relationShip
	 */
	public void setRelationShip(final EnumerationValue value)
	{
		setRelationShip( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmergencyContact.telephoneAfterHr</code> attribute.
	 * @return the telephoneAfterHr
	 */
	public String getTelephoneAfterHr(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TELEPHONEAFTERHR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmergencyContact.telephoneAfterHr</code> attribute.
	 * @return the telephoneAfterHr
	 */
	public String getTelephoneAfterHr()
	{
		return getTelephoneAfterHr( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmergencyContact.telephoneAfterHr</code> attribute. 
	 * @param value the telephoneAfterHr
	 */
	public void setTelephoneAfterHr(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TELEPHONEAFTERHR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmergencyContact.telephoneAfterHr</code> attribute. 
	 * @param value the telephoneAfterHr
	 */
	public void setTelephoneAfterHr(final String value)
	{
		setTelephoneAfterHr( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmergencyContact.telephoneBusinessHr</code> attribute.
	 * @return the telephoneBusinessHr
	 */
	public String getTelephoneBusinessHr(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TELEPHONEBUSINESSHR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmergencyContact.telephoneBusinessHr</code> attribute.
	 * @return the telephoneBusinessHr
	 */
	public String getTelephoneBusinessHr()
	{
		return getTelephoneBusinessHr( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmergencyContact.telephoneBusinessHr</code> attribute. 
	 * @param value the telephoneBusinessHr
	 */
	public void setTelephoneBusinessHr(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TELEPHONEBUSINESSHR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmergencyContact.telephoneBusinessHr</code> attribute. 
	 * @param value the telephoneBusinessHr
	 */
	public void setTelephoneBusinessHr(final String value)
	{
		setTelephoneBusinessHr( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmergencyContact.travellerProfile</code> attribute.
	 * @return the travellerProfile
	 */
	public TravellerProfile getTravellerProfile(final SessionContext ctx)
	{
		return (TravellerProfile)getProperty( ctx, TRAVELLERPROFILE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmergencyContact.travellerProfile</code> attribute.
	 * @return the travellerProfile
	 */
	public TravellerProfile getTravellerProfile()
	{
		return getTravellerProfile( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmergencyContact.travellerProfile</code> attribute. 
	 * @param value the travellerProfile
	 */
	public void setTravellerProfile(final SessionContext ctx, final TravellerProfile value)
	{
		TRAVELLERPROFILEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmergencyContact.travellerProfile</code> attribute. 
	 * @param value the travellerProfile
	 */
	public void setTravellerProfile(final TravellerProfile value)
	{
		setTravellerProfile( getSession().getSessionContext(), value );
	}
	
}
