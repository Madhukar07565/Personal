/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.VisaInfo;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.order.AbstractOrderEntry;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.Title;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Traveller}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTraveller extends GenericItem
{
	/** Qualifier of the <code>Traveller.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>Traveller.firstName</code> attribute **/
	public static final String FIRSTNAME = "firstName";
	/** Qualifier of the <code>Traveller.middleName</code> attribute **/
	public static final String MIDDLENAME = "middleName";
	/** Qualifier of the <code>Traveller.lastName</code> attribute **/
	public static final String LASTNAME = "lastName";
	/** Qualifier of the <code>Traveller.dateOfBirth</code> attribute **/
	public static final String DATEOFBIRTH = "dateOfBirth";
	/** Qualifier of the <code>Traveller.passportNumber</code> attribute **/
	public static final String PASSPORTNUMBER = "passportNumber";
	/** Qualifier of the <code>Traveller.passportExpDate</code> attribute **/
	public static final String PASSPORTEXPDATE = "passportExpDate";
	/** Qualifier of the <code>Traveller.issueCountry</code> attribute **/
	public static final String ISSUECOUNTRY = "issueCountry";
	/** Qualifier of the <code>Traveller.placeOfIssue</code> attribute **/
	public static final String PLACEOFISSUE = "placeOfIssue";
	/** Qualifier of the <code>Traveller.nationality</code> attribute **/
	public static final String NATIONALITY = "nationality";
	/** Qualifier of the <code>Traveller.mobileNumber</code> attribute **/
	public static final String MOBILENUMBER = "mobileNumber";
	/** Qualifier of the <code>Traveller.countryCode</code> attribute **/
	public static final String COUNTRYCODE = "countryCode";
	/** Qualifier of the <code>Traveller.email</code> attribute **/
	public static final String EMAIL = "email";
	/** Qualifier of the <code>Traveller.address</code> attribute **/
	public static final String ADDRESS = "address";
	/** Qualifier of the <code>Traveller.photo</code> attribute **/
	public static final String PHOTO = "photo";
	/** Qualifier of the <code>Traveller.visaInfos</code> attribute **/
	public static final String VISAINFOS = "visaInfos";
	/** Qualifier of the <code>Traveller.customer</code> attribute **/
	public static final String CUSTOMER = "customer";
	/** Qualifier of the <code>Traveller.abstractOrderEntry</code> attribute **/
	public static final String ABSTRACTORDERENTRY = "abstractOrderEntry";
	/**
	* {@link OneToManyHandler} for handling 1:n VISAINFOS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<VisaInfo> VISAINFOSHANDLER = new OneToManyHandler<VisaInfo>(
	CommonCoreConstants.TC.VISAINFO,
	false,
	"traveller",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CUSTOMER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedTraveller> CUSTOMERHANDLER = new BidirectionalOneToManyHandler<GeneratedTraveller>(
	CommonCoreConstants.TC.TRAVELLER,
	false,
	"customer",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ABSTRACTORDERENTRY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedTraveller> ABSTRACTORDERENTRYHANDLER = new BidirectionalOneToManyHandler<GeneratedTraveller>(
	CommonCoreConstants.TC.TRAVELLER,
	false,
	"abstractOrderEntry",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(FIRSTNAME, AttributeMode.INITIAL);
		tmp.put(MIDDLENAME, AttributeMode.INITIAL);
		tmp.put(LASTNAME, AttributeMode.INITIAL);
		tmp.put(DATEOFBIRTH, AttributeMode.INITIAL);
		tmp.put(PASSPORTNUMBER, AttributeMode.INITIAL);
		tmp.put(PASSPORTEXPDATE, AttributeMode.INITIAL);
		tmp.put(ISSUECOUNTRY, AttributeMode.INITIAL);
		tmp.put(PLACEOFISSUE, AttributeMode.INITIAL);
		tmp.put(NATIONALITY, AttributeMode.INITIAL);
		tmp.put(MOBILENUMBER, AttributeMode.INITIAL);
		tmp.put(COUNTRYCODE, AttributeMode.INITIAL);
		tmp.put(EMAIL, AttributeMode.INITIAL);
		tmp.put(ADDRESS, AttributeMode.INITIAL);
		tmp.put(PHOTO, AttributeMode.INITIAL);
		tmp.put(CUSTOMER, AttributeMode.INITIAL);
		tmp.put(ABSTRACTORDERENTRY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.abstractOrderEntry</code> attribute.
	 * @return the abstractOrderEntry
	 */
	public AbstractOrderEntry getAbstractOrderEntry(final SessionContext ctx)
	{
		return (AbstractOrderEntry)getProperty( ctx, ABSTRACTORDERENTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.abstractOrderEntry</code> attribute.
	 * @return the abstractOrderEntry
	 */
	public AbstractOrderEntry getAbstractOrderEntry()
	{
		return getAbstractOrderEntry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.abstractOrderEntry</code> attribute. 
	 * @param value the abstractOrderEntry
	 */
	public void setAbstractOrderEntry(final SessionContext ctx, final AbstractOrderEntry value)
	{
		ABSTRACTORDERENTRYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.abstractOrderEntry</code> attribute. 
	 * @param value the abstractOrderEntry
	 */
	public void setAbstractOrderEntry(final AbstractOrderEntry value)
	{
		setAbstractOrderEntry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.address</code> attribute.
	 * @return the address
	 */
	public Address getAddress(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, ADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.address</code> attribute.
	 * @return the address
	 */
	public Address getAddress()
	{
		return getAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final SessionContext ctx, final Address value)
	{
		setProperty(ctx, ADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final Address value)
	{
		setAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.countryCode</code> attribute.
	 * @return the countryCode
	 */
	public String getCountryCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTRYCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.countryCode</code> attribute.
	 * @return the countryCode
	 */
	public String getCountryCode()
	{
		return getCountryCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.countryCode</code> attribute. 
	 * @param value the countryCode
	 */
	public void setCountryCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTRYCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.countryCode</code> attribute. 
	 * @param value the countryCode
	 */
	public void setCountryCode(final String value)
	{
		setCountryCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CUSTOMERHANDLER.newInstance(ctx, allAttributes);
		ABSTRACTORDERENTRYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.customer</code> attribute.
	 * @return the customer
	 */
	public Customer getCustomer(final SessionContext ctx)
	{
		return (Customer)getProperty( ctx, CUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.customer</code> attribute.
	 * @return the customer
	 */
	public Customer getCustomer()
	{
		return getCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.customer</code> attribute. 
	 * @param value the customer
	 */
	public void setCustomer(final SessionContext ctx, final Customer value)
	{
		CUSTOMERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.customer</code> attribute. 
	 * @param value the customer
	 */
	public void setCustomer(final Customer value)
	{
		setCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.dateOfBirth</code> attribute.
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATEOFBIRTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.dateOfBirth</code> attribute.
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth()
	{
		return getDateOfBirth( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.dateOfBirth</code> attribute. 
	 * @param value the dateOfBirth
	 */
	public void setDateOfBirth(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATEOFBIRTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.dateOfBirth</code> attribute. 
	 * @param value the dateOfBirth
	 */
	public void setDateOfBirth(final Date value)
	{
		setDateOfBirth( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.email</code> attribute.
	 * @return the email
	 */
	public String getEmail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.email</code> attribute.
	 * @return the email
	 */
	public String getEmail()
	{
		return getEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final String value)
	{
		setEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FIRSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return getFirstName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FIRSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final String value)
	{
		setFirstName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.issueCountry</code> attribute.
	 * @return the issueCountry
	 */
	public Country getIssueCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, ISSUECOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.issueCountry</code> attribute.
	 * @return the issueCountry
	 */
	public Country getIssueCountry()
	{
		return getIssueCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.issueCountry</code> attribute. 
	 * @param value the issueCountry
	 */
	public void setIssueCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, ISSUECOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.issueCountry</code> attribute. 
	 * @param value the issueCountry
	 */
	public void setIssueCountry(final Country value)
	{
		setIssueCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName()
	{
		return getLastName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final String value)
	{
		setLastName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.middleName</code> attribute.
	 * @return the middleName
	 */
	public String getMiddleName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MIDDLENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.middleName</code> attribute.
	 * @return the middleName
	 */
	public String getMiddleName()
	{
		return getMiddleName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.middleName</code> attribute. 
	 * @param value the middleName
	 */
	public void setMiddleName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MIDDLENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.middleName</code> attribute. 
	 * @param value the middleName
	 */
	public void setMiddleName(final String value)
	{
		setMiddleName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.mobileNumber</code> attribute.
	 * @return the mobileNumber
	 */
	public String getMobileNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MOBILENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.mobileNumber</code> attribute.
	 * @return the mobileNumber
	 */
	public String getMobileNumber()
	{
		return getMobileNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.mobileNumber</code> attribute. 
	 * @param value the mobileNumber
	 */
	public void setMobileNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MOBILENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.mobileNumber</code> attribute. 
	 * @param value the mobileNumber
	 */
	public void setMobileNumber(final String value)
	{
		setMobileNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.nationality</code> attribute.
	 * @return the nationality
	 */
	public String getNationality(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NATIONALITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.nationality</code> attribute.
	 * @return the nationality
	 */
	public String getNationality()
	{
		return getNationality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.nationality</code> attribute. 
	 * @param value the nationality
	 */
	public void setNationality(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NATIONALITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.nationality</code> attribute. 
	 * @param value the nationality
	 */
	public void setNationality(final String value)
	{
		setNationality( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.passportExpDate</code> attribute.
	 * @return the passportExpDate
	 */
	public Date getPassportExpDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, PASSPORTEXPDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.passportExpDate</code> attribute.
	 * @return the passportExpDate
	 */
	public Date getPassportExpDate()
	{
		return getPassportExpDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.passportExpDate</code> attribute. 
	 * @param value the passportExpDate
	 */
	public void setPassportExpDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, PASSPORTEXPDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.passportExpDate</code> attribute. 
	 * @param value the passportExpDate
	 */
	public void setPassportExpDate(final Date value)
	{
		setPassportExpDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.passportNumber</code> attribute.
	 * @return the passportNumber
	 */
	public String getPassportNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PASSPORTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.passportNumber</code> attribute.
	 * @return the passportNumber
	 */
	public String getPassportNumber()
	{
		return getPassportNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.passportNumber</code> attribute. 
	 * @param value the passportNumber
	 */
	public void setPassportNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PASSPORTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.passportNumber</code> attribute. 
	 * @param value the passportNumber
	 */
	public void setPassportNumber(final String value)
	{
		setPassportNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.photo</code> attribute.
	 * @return the photo
	 */
	public Media getPhoto(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, PHOTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.photo</code> attribute.
	 * @return the photo
	 */
	public Media getPhoto()
	{
		return getPhoto( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.photo</code> attribute. 
	 * @param value the photo
	 */
	public void setPhoto(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, PHOTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.photo</code> attribute. 
	 * @param value the photo
	 */
	public void setPhoto(final Media value)
	{
		setPhoto( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.placeOfIssue</code> attribute.
	 * @return the placeOfIssue
	 */
	public String getPlaceOfIssue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PLACEOFISSUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.placeOfIssue</code> attribute.
	 * @return the placeOfIssue
	 */
	public String getPlaceOfIssue()
	{
		return getPlaceOfIssue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.placeOfIssue</code> attribute. 
	 * @param value the placeOfIssue
	 */
	public void setPlaceOfIssue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PLACEOFISSUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.placeOfIssue</code> attribute. 
	 * @param value the placeOfIssue
	 */
	public void setPlaceOfIssue(final String value)
	{
		setPlaceOfIssue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.title</code> attribute.
	 * @return the title
	 */
	public Title getTitle(final SessionContext ctx)
	{
		return (Title)getProperty( ctx, TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.title</code> attribute.
	 * @return the title
	 */
	public Title getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final SessionContext ctx, final Title value)
	{
		setProperty(ctx, TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final Title value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.visaInfos</code> attribute.
	 * @return the visaInfos
	 */
	public Set<VisaInfo> getVisaInfos(final SessionContext ctx)
	{
		return (Set<VisaInfo>)VISAINFOSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Traveller.visaInfos</code> attribute.
	 * @return the visaInfos
	 */
	public Set<VisaInfo> getVisaInfos()
	{
		return getVisaInfos( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.visaInfos</code> attribute. 
	 * @param value the visaInfos
	 */
	public void setVisaInfos(final SessionContext ctx, final Set<VisaInfo> value)
	{
		VISAINFOSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Traveller.visaInfos</code> attribute. 
	 * @param value the visaInfos
	 */
	public void setVisaInfos(final Set<VisaInfo> value)
	{
		setVisaInfos( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to visaInfos. 
	 * @param value the item to add to visaInfos
	 */
	public void addToVisaInfos(final SessionContext ctx, final VisaInfo value)
	{
		VISAINFOSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to visaInfos. 
	 * @param value the item to add to visaInfos
	 */
	public void addToVisaInfos(final VisaInfo value)
	{
		addToVisaInfos( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from visaInfos. 
	 * @param value the item to remove from visaInfos
	 */
	public void removeFromVisaInfos(final SessionContext ctx, final VisaInfo value)
	{
		VISAINFOSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from visaInfos. 
	 * @param value the item to remove from visaInfos
	 */
	public void removeFromVisaInfos(final VisaInfo value)
	{
		removeFromVisaInfos( getSession().getSessionContext(), value );
	}
	
}
