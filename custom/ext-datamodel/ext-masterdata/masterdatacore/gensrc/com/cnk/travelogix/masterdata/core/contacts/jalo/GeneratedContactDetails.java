/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.masterdata.core.contacts.jalo;

import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.contacts.jalo.AbstractContactDetails;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.masterdata.core.contacts.jalo.ContactDetails ContactDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedContactDetails extends AbstractContactDetails
{
	/** Qualifier of the <code>ContactDetails.cityCode</code> attribute **/
	public static final String CITYCODE = "cityCode";
	/** Qualifier of the <code>ContactDetails.countryCode</code> attribute **/
	public static final String COUNTRYCODE = "countryCode";
	/** Qualifier of the <code>ContactDetails.telephone</code> attribute **/
	public static final String TELEPHONE = "telephone";
	/** Qualifier of the <code>ContactDetails.fax</code> attribute **/
	public static final String FAX = "fax";
	/** Qualifier of the <code>ContactDetails.email</code> attribute **/
	public static final String EMAIL = "email";
	/** Qualifier of the <code>ContactDetails.websiteUrl</code> attribute **/
	public static final String WEBSITEURL = "websiteUrl";
	/** Qualifier of the <code>ContactDetails.alternateEmail</code> attribute **/
	public static final String ALTERNATEEMAIL = "alternateEmail";
	/** Qualifier of the <code>ContactDetails.category</code> attribute **/
	public static final String CATEGORY = "category";
	/** Qualifier of the <code>ContactDetails.productCategorySubType</code> attribute **/
	public static final String PRODUCTCATEGORYSUBTYPE = "productCategorySubType";
	/** Qualifier of the <code>ContactDetails.contactType</code> attribute **/
	public static final String CONTACTTYPE = "contactType";
	/** Qualifier of the <code>ContactDetails.contactDetailType</code> attribute **/
	public static final String CONTACTDETAILTYPE = "contactDetailType";
	/** Qualifier of the <code>ContactDetails.acceptWalkIn</code> attribute **/
	public static final String ACCEPTWALKIN = "acceptWalkIn";
	/** Qualifier of the <code>ContactDetails.reservationRequired</code> attribute **/
	public static final String RESERVATIONREQUIRED = "reservationRequired";
	/** Qualifier of the <code>ContactDetails.reservationFor</code> attribute **/
	public static final String RESERVATIONFOR = "reservationFor";
	/** Qualifier of the <code>ContactDetails.notesOnReservations</code> attribute **/
	public static final String NOTESONRESERVATIONS = "notesOnReservations";
	/** Qualifier of the <code>ContactDetails.note</code> attribute **/
	public static final String NOTE = "note";
	/** Qualifier of the <code>ContactDetails.phone_1</code> attribute **/
	public static final String PHONE_1 = "phone_1";
	/** Qualifier of the <code>ContactDetails.phone_2</code> attribute **/
	public static final String PHONE_2 = "phone_2";
	/** Qualifier of the <code>ContactDetails.personName</code> attribute **/
	public static final String PERSONNAME = "personName";
	/** Qualifier of the <code>ContactDetails.designation</code> attribute **/
	public static final String DESIGNATION = "designation";
	/** Qualifier of the <code>ContactDetails.address</code> attribute **/
	public static final String ADDRESS = "address";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ADDRESS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedContactDetails> ADDRESSHANDLER = new BidirectionalOneToManyHandler<GeneratedContactDetails>(
	MasterdatacoreConstants.TC.CONTACTDETAILS,
	false,
	"address",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractContactDetails.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CITYCODE, AttributeMode.INITIAL);
		tmp.put(COUNTRYCODE, AttributeMode.INITIAL);
		tmp.put(TELEPHONE, AttributeMode.INITIAL);
		tmp.put(FAX, AttributeMode.INITIAL);
		tmp.put(EMAIL, AttributeMode.INITIAL);
		tmp.put(WEBSITEURL, AttributeMode.INITIAL);
		tmp.put(ALTERNATEEMAIL, AttributeMode.INITIAL);
		tmp.put(CATEGORY, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORYSUBTYPE, AttributeMode.INITIAL);
		tmp.put(CONTACTTYPE, AttributeMode.INITIAL);
		tmp.put(CONTACTDETAILTYPE, AttributeMode.INITIAL);
		tmp.put(ACCEPTWALKIN, AttributeMode.INITIAL);
		tmp.put(RESERVATIONREQUIRED, AttributeMode.INITIAL);
		tmp.put(RESERVATIONFOR, AttributeMode.INITIAL);
		tmp.put(NOTESONRESERVATIONS, AttributeMode.INITIAL);
		tmp.put(NOTE, AttributeMode.INITIAL);
		tmp.put(PHONE_1, AttributeMode.INITIAL);
		tmp.put(PHONE_2, AttributeMode.INITIAL);
		tmp.put(PERSONNAME, AttributeMode.INITIAL);
		tmp.put(DESIGNATION, AttributeMode.INITIAL);
		tmp.put(ADDRESS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.acceptWalkIn</code> attribute.
	 * @return the acceptWalkIn - Accept walkin
	 */
	public Boolean isAcceptWalkIn(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ACCEPTWALKIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.acceptWalkIn</code> attribute.
	 * @return the acceptWalkIn - Accept walkin
	 */
	public Boolean isAcceptWalkIn()
	{
		return isAcceptWalkIn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.acceptWalkIn</code> attribute. 
	 * @return the acceptWalkIn - Accept walkin
	 */
	public boolean isAcceptWalkInAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAcceptWalkIn( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.acceptWalkIn</code> attribute. 
	 * @return the acceptWalkIn - Accept walkin
	 */
	public boolean isAcceptWalkInAsPrimitive()
	{
		return isAcceptWalkInAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.acceptWalkIn</code> attribute. 
	 * @param value the acceptWalkIn - Accept walkin
	 */
	public void setAcceptWalkIn(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ACCEPTWALKIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.acceptWalkIn</code> attribute. 
	 * @param value the acceptWalkIn - Accept walkin
	 */
	public void setAcceptWalkIn(final Boolean value)
	{
		setAcceptWalkIn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.acceptWalkIn</code> attribute. 
	 * @param value the acceptWalkIn - Accept walkin
	 */
	public void setAcceptWalkIn(final SessionContext ctx, final boolean value)
	{
		setAcceptWalkIn( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.acceptWalkIn</code> attribute. 
	 * @param value the acceptWalkIn - Accept walkin
	 */
	public void setAcceptWalkIn(final boolean value)
	{
		setAcceptWalkIn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.address</code> attribute.
	 * @return the address
	 */
	public Address getAddress(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, ADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.address</code> attribute.
	 * @return the address
	 */
	public Address getAddress()
	{
		return getAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final SessionContext ctx, final Address value)
	{
		ADDRESSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final Address value)
	{
		setAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.alternateEmail</code> attribute.
	 * @return the alternateEmail
	 */
	public String getAlternateEmail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ALTERNATEEMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.alternateEmail</code> attribute.
	 * @return the alternateEmail
	 */
	public String getAlternateEmail()
	{
		return getAlternateEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.alternateEmail</code> attribute. 
	 * @param value the alternateEmail
	 */
	public void setAlternateEmail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ALTERNATEEMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.alternateEmail</code> attribute. 
	 * @param value the alternateEmail
	 */
	public void setAlternateEmail(final String value)
	{
		setAlternateEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.category</code> attribute.
	 * @return the category
	 */
	public Category getCategory(final SessionContext ctx)
	{
		return (Category)getProperty( ctx, CATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.category</code> attribute.
	 * @return the category
	 */
	public Category getCategory()
	{
		return getCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final SessionContext ctx, final Category value)
	{
		setProperty(ctx, CATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final Category value)
	{
		setCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.cityCode</code> attribute.
	 * @return the cityCode
	 */
	public String getCityCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CITYCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.cityCode</code> attribute.
	 * @return the cityCode
	 */
	public String getCityCode()
	{
		return getCityCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.cityCode</code> attribute. 
	 * @param value the cityCode
	 */
	public void setCityCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CITYCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.cityCode</code> attribute. 
	 * @param value the cityCode
	 */
	public void setCityCode(final String value)
	{
		setCityCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.contactDetailType</code> attribute.
	 * @return the contactDetailType
	 */
	public EnumerationValue getContactDetailType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CONTACTDETAILTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.contactDetailType</code> attribute.
	 * @return the contactDetailType
	 */
	public EnumerationValue getContactDetailType()
	{
		return getContactDetailType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.contactDetailType</code> attribute. 
	 * @param value the contactDetailType
	 */
	public void setContactDetailType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CONTACTDETAILTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.contactDetailType</code> attribute. 
	 * @param value the contactDetailType
	 */
	public void setContactDetailType(final EnumerationValue value)
	{
		setContactDetailType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.contactType</code> attribute.
	 * @return the contactType
	 */
	public EnumerationValue getContactType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CONTACTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.contactType</code> attribute.
	 * @return the contactType
	 */
	public EnumerationValue getContactType()
	{
		return getContactType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.contactType</code> attribute. 
	 * @param value the contactType
	 */
	public void setContactType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CONTACTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.contactType</code> attribute. 
	 * @param value the contactType
	 */
	public void setContactType(final EnumerationValue value)
	{
		setContactType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.countryCode</code> attribute.
	 * @return the countryCode
	 */
	public String getCountryCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTRYCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.countryCode</code> attribute.
	 * @return the countryCode
	 */
	public String getCountryCode()
	{
		return getCountryCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.countryCode</code> attribute. 
	 * @param value the countryCode
	 */
	public void setCountryCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTRYCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.countryCode</code> attribute. 
	 * @param value the countryCode
	 */
	public void setCountryCode(final String value)
	{
		setCountryCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ADDRESSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.designation</code> attribute.
	 * @return the designation
	 */
	public String getDesignation(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESIGNATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.designation</code> attribute.
	 * @return the designation
	 */
	public String getDesignation()
	{
		return getDesignation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.designation</code> attribute. 
	 * @param value the designation
	 */
	public void setDesignation(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESIGNATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.designation</code> attribute. 
	 * @param value the designation
	 */
	public void setDesignation(final String value)
	{
		setDesignation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.email</code> attribute.
	 * @return the email
	 */
	public String getEmail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.email</code> attribute.
	 * @return the email
	 */
	public String getEmail()
	{
		return getEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final String value)
	{
		setEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.fax</code> attribute.
	 * @return the fax
	 */
	public String getFax(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FAX);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.fax</code> attribute.
	 * @return the fax
	 */
	public String getFax()
	{
		return getFax( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.fax</code> attribute. 
	 * @param value the fax
	 */
	public void setFax(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FAX,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.fax</code> attribute. 
	 * @param value the fax
	 */
	public void setFax(final String value)
	{
		setFax( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.note</code> attribute.
	 * @return the note - General note
	 */
	public String getNote(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOTE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.note</code> attribute.
	 * @return the note - General note
	 */
	public String getNote()
	{
		return getNote( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.note</code> attribute. 
	 * @param value the note - General note
	 */
	public void setNote(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOTE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.note</code> attribute. 
	 * @param value the note - General note
	 */
	public void setNote(final String value)
	{
		setNote( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.notesOnReservations</code> attribute.
	 * @return the notesOnReservations - Notes on Reservation
	 */
	public String getNotesOnReservations(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOTESONRESERVATIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.notesOnReservations</code> attribute.
	 * @return the notesOnReservations - Notes on Reservation
	 */
	public String getNotesOnReservations()
	{
		return getNotesOnReservations( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.notesOnReservations</code> attribute. 
	 * @param value the notesOnReservations - Notes on Reservation
	 */
	public void setNotesOnReservations(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOTESONRESERVATIONS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.notesOnReservations</code> attribute. 
	 * @param value the notesOnReservations - Notes on Reservation
	 */
	public void setNotesOnReservations(final String value)
	{
		setNotesOnReservations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.personName</code> attribute.
	 * @return the personName
	 */
	public String getPersonName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PERSONNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.personName</code> attribute.
	 * @return the personName
	 */
	public String getPersonName()
	{
		return getPersonName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.personName</code> attribute. 
	 * @param value the personName
	 */
	public void setPersonName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PERSONNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.personName</code> attribute. 
	 * @param value the personName
	 */
	public void setPersonName(final String value)
	{
		setPersonName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.phone_1</code> attribute.
	 * @return the phone_1
	 */
	public String getPhone_1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PHONE_1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.phone_1</code> attribute.
	 * @return the phone_1
	 */
	public String getPhone_1()
	{
		return getPhone_1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.phone_1</code> attribute. 
	 * @param value the phone_1
	 */
	public void setPhone_1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PHONE_1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.phone_1</code> attribute. 
	 * @param value the phone_1
	 */
	public void setPhone_1(final String value)
	{
		setPhone_1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.phone_2</code> attribute.
	 * @return the phone_2
	 */
	public String getPhone_2(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PHONE_2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.phone_2</code> attribute.
	 * @return the phone_2
	 */
	public String getPhone_2()
	{
		return getPhone_2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.phone_2</code> attribute. 
	 * @param value the phone_2
	 */
	public void setPhone_2(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PHONE_2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.phone_2</code> attribute. 
	 * @param value the phone_2
	 */
	public void setPhone_2(final String value)
	{
		setPhone_2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.productCategorySubType</code> attribute.
	 * @return the productCategorySubType
	 */
	public ProductCategorySubType getProductCategorySubType(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, PRODUCTCATEGORYSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.productCategorySubType</code> attribute.
	 * @return the productCategorySubType
	 */
	public ProductCategorySubType getProductCategorySubType()
	{
		return getProductCategorySubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType
	 */
	public void setProductCategorySubType(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, PRODUCTCATEGORYSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType
	 */
	public void setProductCategorySubType(final ProductCategorySubType value)
	{
		setProductCategorySubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.reservationFor</code> attribute.
	 * @return the reservationFor - Reservation For
	 */
	public EnumerationValue getReservationFor(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RESERVATIONFOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.reservationFor</code> attribute.
	 * @return the reservationFor - Reservation For
	 */
	public EnumerationValue getReservationFor()
	{
		return getReservationFor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.reservationFor</code> attribute. 
	 * @param value the reservationFor - Reservation For
	 */
	public void setReservationFor(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RESERVATIONFOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.reservationFor</code> attribute. 
	 * @param value the reservationFor - Reservation For
	 */
	public void setReservationFor(final EnumerationValue value)
	{
		setReservationFor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.reservationRequired</code> attribute.
	 * @return the reservationRequired - Reservation Required
	 */
	public Boolean isReservationRequired(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, RESERVATIONREQUIRED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.reservationRequired</code> attribute.
	 * @return the reservationRequired - Reservation Required
	 */
	public Boolean isReservationRequired()
	{
		return isReservationRequired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.reservationRequired</code> attribute. 
	 * @return the reservationRequired - Reservation Required
	 */
	public boolean isReservationRequiredAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isReservationRequired( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.reservationRequired</code> attribute. 
	 * @return the reservationRequired - Reservation Required
	 */
	public boolean isReservationRequiredAsPrimitive()
	{
		return isReservationRequiredAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.reservationRequired</code> attribute. 
	 * @param value the reservationRequired - Reservation Required
	 */
	public void setReservationRequired(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, RESERVATIONREQUIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.reservationRequired</code> attribute. 
	 * @param value the reservationRequired - Reservation Required
	 */
	public void setReservationRequired(final Boolean value)
	{
		setReservationRequired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.reservationRequired</code> attribute. 
	 * @param value the reservationRequired - Reservation Required
	 */
	public void setReservationRequired(final SessionContext ctx, final boolean value)
	{
		setReservationRequired( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.reservationRequired</code> attribute. 
	 * @param value the reservationRequired - Reservation Required
	 */
	public void setReservationRequired(final boolean value)
	{
		setReservationRequired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.telephone</code> attribute.
	 * @return the telephone
	 */
	public String getTelephone(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TELEPHONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.telephone</code> attribute.
	 * @return the telephone
	 */
	public String getTelephone()
	{
		return getTelephone( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.telephone</code> attribute. 
	 * @param value the telephone
	 */
	public void setTelephone(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TELEPHONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.telephone</code> attribute. 
	 * @param value the telephone
	 */
	public void setTelephone(final String value)
	{
		setTelephone( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.websiteUrl</code> attribute.
	 * @return the websiteUrl
	 */
	public String getWebsiteUrl(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WEBSITEURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.websiteUrl</code> attribute.
	 * @return the websiteUrl
	 */
	public String getWebsiteUrl()
	{
		return getWebsiteUrl( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.websiteUrl</code> attribute. 
	 * @param value the websiteUrl
	 */
	public void setWebsiteUrl(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WEBSITEURL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.websiteUrl</code> attribute. 
	 * @param value the websiteUrl
	 */
	public void setWebsiteUrl(final String value)
	{
		setWebsiteUrl( getSession().getSessionContext(), value );
	}
	
}
