/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.product.common.core.jalo.Affiliation;
import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import com.cnk.travelogix.product.transport.masters.core.jalo.SocialNetworkingDetails;
import de.hybris.platform.acceleratorservices.constants.AcceleratorServicesConstants;
import de.hybris.platform.acceleratorservices.jalo.email.EmailAddress;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.transport.masters.core.jalo.AbstractCruiseItem AbstractCruiseItem}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractCruiseItem extends AbstractTravelogixItem
{
	/** Qualifier of the <code>AbstractCruiseItem.commonID</code> attribute **/
	public static final String COMMONID = "commonID";
	/** Qualifier of the <code>AbstractCruiseItem.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>AbstractCruiseItem.financeControlID</code> attribute **/
	public static final String FINANCECONTROLID = "financeControlID";
	/** Qualifier of the <code>AbstractCruiseItem.notes</code> attribute **/
	public static final String NOTES = "notes";
	/** Qualifier of the <code>AbstractCruiseItem.copiedFrom</code> attribute **/
	public static final String COPIEDFROM = "copiedFrom";
	/** Qualifier of the <code>AbstractCruiseItem.affiliation</code> attribute **/
	public static final String AFFILIATION = "affiliation";
	/** Qualifier of the <code>AbstractCruiseItem.effectiveFromDate</code> attribute **/
	public static final String EFFECTIVEFROMDATE = "effectiveFromDate";
	/** Qualifier of the <code>AbstractCruiseItem.address</code> attribute **/
	public static final String ADDRESS = "address";
	/** Qualifier of the <code>AbstractCruiseItem.socialNetworkingDetails</code> attribute **/
	public static final String SOCIALNETWORKINGDETAILS = "socialNetworkingDetails";
	/** Qualifier of the <code>AbstractCruiseItem.emailAddressDetails</code> attribute **/
	public static final String EMAILADDRESSDETAILS = "emailAddressDetails";
	/** Qualifier of the <code>AbstractCruiseItem.medias</code> attribute **/
	public static final String MEDIAS = "medias";
	/**
	* {@link OneToManyHandler} for handling 1:n SOCIALNETWORKINGDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SocialNetworkingDetails> SOCIALNETWORKINGDETAILSHANDLER = new OneToManyHandler<SocialNetworkingDetails>(
	TransportproductmasterscoreConstants.TC.SOCIALNETWORKINGDETAILS,
	true,
	"company",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n EMAILADDRESSDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EmailAddress> EMAILADDRESSDETAILSHANDLER = new OneToManyHandler<EmailAddress>(
	AcceleratorServicesConstants.TC.EMAILADDRESS,
	true,
	"company",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n MEDIAS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Media> MEDIASHANDLER = new OneToManyHandler<Media>(
	CoreConstants.TC.MEDIA,
	false,
	"company",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(COMMONID, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(FINANCECONTROLID, AttributeMode.INITIAL);
		tmp.put(NOTES, AttributeMode.INITIAL);
		tmp.put(COPIEDFROM, AttributeMode.INITIAL);
		tmp.put(AFFILIATION, AttributeMode.INITIAL);
		tmp.put(EFFECTIVEFROMDATE, AttributeMode.INITIAL);
		tmp.put(ADDRESS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseItem.address</code> attribute.
	 * @return the address - Address
	 */
	public Address getAddress(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, ADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseItem.address</code> attribute.
	 * @return the address - Address
	 */
	public Address getAddress()
	{
		return getAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseItem.address</code> attribute. 
	 * @param value the address - Address
	 */
	public void setAddress(final SessionContext ctx, final Address value)
	{
		setProperty(ctx, ADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseItem.address</code> attribute. 
	 * @param value the address - Address
	 */
	public void setAddress(final Address value)
	{
		setAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseItem.affiliation</code> attribute.
	 * @return the affiliation - Affiliation
	 */
	public Affiliation getAffiliation(final SessionContext ctx)
	{
		return (Affiliation)getProperty( ctx, AFFILIATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseItem.affiliation</code> attribute.
	 * @return the affiliation - Affiliation
	 */
	public Affiliation getAffiliation()
	{
		return getAffiliation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseItem.affiliation</code> attribute. 
	 * @param value the affiliation - Affiliation
	 */
	public void setAffiliation(final SessionContext ctx, final Affiliation value)
	{
		setProperty(ctx, AFFILIATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseItem.affiliation</code> attribute. 
	 * @param value the affiliation - Affiliation
	 */
	public void setAffiliation(final Affiliation value)
	{
		setAffiliation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseItem.commonID</code> attribute.
	 * @return the commonID - Cruise Item Common Id
	 */
	public String getCommonID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMMONID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseItem.commonID</code> attribute.
	 * @return the commonID - Cruise Item Common Id
	 */
	public String getCommonID()
	{
		return getCommonID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseItem.commonID</code> attribute. 
	 * @param value the commonID - Cruise Item Common Id
	 */
	public void setCommonID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMMONID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseItem.commonID</code> attribute. 
	 * @param value the commonID - Cruise Item Common Id
	 */
	public void setCommonID(final String value)
	{
		setCommonID( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseItem.copiedFrom</code> attribute.
	 * @return the copiedFrom - Copied From
	 */
	public String getCopiedFrom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COPIEDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseItem.copiedFrom</code> attribute.
	 * @return the copiedFrom - Copied From
	 */
	public String getCopiedFrom()
	{
		return getCopiedFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseItem.copiedFrom</code> attribute. 
	 * @param value the copiedFrom - Copied From
	 */
	public void setCopiedFrom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COPIEDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseItem.copiedFrom</code> attribute. 
	 * @param value the copiedFrom - Copied From
	 */
	public void setCopiedFrom(final String value)
	{
		setCopiedFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseItem.effectiveFromDate</code> attribute.
	 * @return the effectiveFromDate - Effective Date
	 */
	public Date getEffectiveFromDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EFFECTIVEFROMDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseItem.effectiveFromDate</code> attribute.
	 * @return the effectiveFromDate - Effective Date
	 */
	public Date getEffectiveFromDate()
	{
		return getEffectiveFromDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseItem.effectiveFromDate</code> attribute. 
	 * @param value the effectiveFromDate - Effective Date
	 */
	public void setEffectiveFromDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EFFECTIVEFROMDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseItem.effectiveFromDate</code> attribute. 
	 * @param value the effectiveFromDate - Effective Date
	 */
	public void setEffectiveFromDate(final Date value)
	{
		setEffectiveFromDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseItem.emailAddressDetails</code> attribute.
	 * @return the emailAddressDetails
	 */
	public Collection<EmailAddress> getEmailAddressDetails(final SessionContext ctx)
	{
		return EMAILADDRESSDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseItem.emailAddressDetails</code> attribute.
	 * @return the emailAddressDetails
	 */
	public Collection<EmailAddress> getEmailAddressDetails()
	{
		return getEmailAddressDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseItem.emailAddressDetails</code> attribute. 
	 * @param value the emailAddressDetails
	 */
	public void setEmailAddressDetails(final SessionContext ctx, final Collection<EmailAddress> value)
	{
		EMAILADDRESSDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseItem.emailAddressDetails</code> attribute. 
	 * @param value the emailAddressDetails
	 */
	public void setEmailAddressDetails(final Collection<EmailAddress> value)
	{
		setEmailAddressDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to emailAddressDetails. 
	 * @param value the item to add to emailAddressDetails
	 */
	public void addToEmailAddressDetails(final SessionContext ctx, final EmailAddress value)
	{
		EMAILADDRESSDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to emailAddressDetails. 
	 * @param value the item to add to emailAddressDetails
	 */
	public void addToEmailAddressDetails(final EmailAddress value)
	{
		addToEmailAddressDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from emailAddressDetails. 
	 * @param value the item to remove from emailAddressDetails
	 */
	public void removeFromEmailAddressDetails(final SessionContext ctx, final EmailAddress value)
	{
		EMAILADDRESSDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from emailAddressDetails. 
	 * @param value the item to remove from emailAddressDetails
	 */
	public void removeFromEmailAddressDetails(final EmailAddress value)
	{
		removeFromEmailAddressDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseItem.financeControlID</code> attribute.
	 * @return the financeControlID - Finance Control Id
	 */
	public String getFinanceControlID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FINANCECONTROLID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseItem.financeControlID</code> attribute.
	 * @return the financeControlID - Finance Control Id
	 */
	public String getFinanceControlID()
	{
		return getFinanceControlID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseItem.financeControlID</code> attribute. 
	 * @param value the financeControlID - Finance Control Id
	 */
	public void setFinanceControlID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FINANCECONTROLID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseItem.financeControlID</code> attribute. 
	 * @param value the financeControlID - Finance Control Id
	 */
	public void setFinanceControlID(final String value)
	{
		setFinanceControlID( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseItem.medias</code> attribute.
	 * @return the medias
	 */
	public Collection<Media> getMedias(final SessionContext ctx)
	{
		return MEDIASHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseItem.medias</code> attribute.
	 * @return the medias
	 */
	public Collection<Media> getMedias()
	{
		return getMedias( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseItem.medias</code> attribute. 
	 * @param value the medias
	 */
	public void setMedias(final SessionContext ctx, final Collection<Media> value)
	{
		MEDIASHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseItem.medias</code> attribute. 
	 * @param value the medias
	 */
	public void setMedias(final Collection<Media> value)
	{
		setMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to medias. 
	 * @param value the item to add to medias
	 */
	public void addToMedias(final SessionContext ctx, final Media value)
	{
		MEDIASHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to medias. 
	 * @param value the item to add to medias
	 */
	public void addToMedias(final Media value)
	{
		addToMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from medias. 
	 * @param value the item to remove from medias
	 */
	public void removeFromMedias(final SessionContext ctx, final Media value)
	{
		MEDIASHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from medias. 
	 * @param value the item to remove from medias
	 */
	public void removeFromMedias(final Media value)
	{
		removeFromMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseItem.name</code> attribute.
	 * @return the name - Cruise Item Name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseItem.name</code> attribute.
	 * @return the name - Cruise Item Name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseItem.name</code> attribute. 
	 * @param value the name - Cruise Item Name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseItem.name</code> attribute. 
	 * @param value the name - Cruise Item Name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseItem.notes</code> attribute.
	 * @return the notes - Notes
	 */
	public String getNotes(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOTES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseItem.notes</code> attribute.
	 * @return the notes - Notes
	 */
	public String getNotes()
	{
		return getNotes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseItem.notes</code> attribute. 
	 * @param value the notes - Notes
	 */
	public void setNotes(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOTES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseItem.notes</code> attribute. 
	 * @param value the notes - Notes
	 */
	public void setNotes(final String value)
	{
		setNotes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseItem.socialNetworkingDetails</code> attribute.
	 * @return the socialNetworkingDetails
	 */
	public Collection<SocialNetworkingDetails> getSocialNetworkingDetails(final SessionContext ctx)
	{
		return SOCIALNETWORKINGDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseItem.socialNetworkingDetails</code> attribute.
	 * @return the socialNetworkingDetails
	 */
	public Collection<SocialNetworkingDetails> getSocialNetworkingDetails()
	{
		return getSocialNetworkingDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseItem.socialNetworkingDetails</code> attribute. 
	 * @param value the socialNetworkingDetails
	 */
	public void setSocialNetworkingDetails(final SessionContext ctx, final Collection<SocialNetworkingDetails> value)
	{
		SOCIALNETWORKINGDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseItem.socialNetworkingDetails</code> attribute. 
	 * @param value the socialNetworkingDetails
	 */
	public void setSocialNetworkingDetails(final Collection<SocialNetworkingDetails> value)
	{
		setSocialNetworkingDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to socialNetworkingDetails. 
	 * @param value the item to add to socialNetworkingDetails
	 */
	public void addToSocialNetworkingDetails(final SessionContext ctx, final SocialNetworkingDetails value)
	{
		SOCIALNETWORKINGDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to socialNetworkingDetails. 
	 * @param value the item to add to socialNetworkingDetails
	 */
	public void addToSocialNetworkingDetails(final SocialNetworkingDetails value)
	{
		addToSocialNetworkingDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from socialNetworkingDetails. 
	 * @param value the item to remove from socialNetworkingDetails
	 */
	public void removeFromSocialNetworkingDetails(final SessionContext ctx, final SocialNetworkingDetails value)
	{
		SOCIALNETWORKINGDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from socialNetworkingDetails. 
	 * @param value the item to remove from socialNetworkingDetails
	 */
	public void removeFromSocialNetworkingDetails(final SocialNetworkingDetails value)
	{
		removeFromSocialNetworkingDetails( getSession().getSessionContext(), value );
	}
	
}
