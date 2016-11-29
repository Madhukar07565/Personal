/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.traveller.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.corporate.jalo.Designation;
import com.cnk.travelogix.client.core.traveller.general.jalo.EmergencyContact;
import com.cnk.travelogix.client.core.traveller.general.jalo.LoyalityProgramInformation;
import com.cnk.travelogix.client.core.traveller.general.jalo.PassportDetails;
import com.cnk.travelogix.client.core.traveller.general.jalo.ProfileInformation;
import com.cnk.travelogix.client.core.traveller.general.jalo.VisaDetails;
import com.cnk.travelogix.client.core.traveller.prefernce.jalo.CarPreference;
import com.cnk.travelogix.client.core.traveller.prefernce.jalo.FlightPrefernce;
import com.cnk.travelogix.client.core.traveller.prefernce.jalo.HotelPreference;
import com.cnk.travelogix.client.core.traveller.prefernce.jalo.Preference;
import com.cnk.travelogix.masterdata.core.department.jalo.Department;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.PartOfHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.traveller.jalo.TravellerProfile TravellerProfile}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTravellerProfile extends GenericItem
{
	/** Qualifier of the <code>TravellerProfile.clientName</code> attribute **/
	public static final String CLIENTNAME = "clientName";
	/** Qualifier of the <code>TravellerProfile.profileInformation</code> attribute **/
	public static final String PROFILEINFORMATION = "profileInformation";
	/** Qualifier of the <code>TravellerProfile.personalEmailId</code> attribute **/
	public static final String PERSONALEMAILID = "personalEmailId";
	/** Qualifier of the <code>TravellerProfile.number</code> attribute **/
	public static final String NUMBER = "number";
	/** Qualifier of the <code>TravellerProfile.married</code> attribute **/
	public static final String MARRIED = "married";
	/** Qualifier of the <code>TravellerProfile.anniversaryDate</code> attribute **/
	public static final String ANNIVERSARYDATE = "anniversaryDate";
	/** Qualifier of the <code>TravellerProfile.nationalIdentificationType</code> attribute **/
	public static final String NATIONALIDENTIFICATIONTYPE = "nationalIdentificationType";
	/** Qualifier of the <code>TravellerProfile.corporateAddress</code> attribute **/
	public static final String CORPORATEADDRESS = "corporateAddress";
	/** Qualifier of the <code>TravellerProfile.residentalAddress</code> attribute **/
	public static final String RESIDENTALADDRESS = "residentalAddress";
	/** Qualifier of the <code>TravellerProfile.permanentAddress</code> attribute **/
	public static final String PERMANENTADDRESS = "permanentAddress";
	/** Qualifier of the <code>TravellerProfile.preference</code> attribute **/
	public static final String PREFERENCE = "preference";
	/** Qualifier of the <code>TravellerProfile.grade</code> attribute **/
	public static final String GRADE = "grade";
	/** Qualifier of the <code>TravellerProfile.designation</code> attribute **/
	public static final String DESIGNATION = "designation";
	/** Qualifier of the <code>TravellerProfile.department</code> attribute **/
	public static final String DEPARTMENT = "department";
	/** Qualifier of the <code>TravellerProfile.employeeStatus</code> attribute **/
	public static final String EMPLOYEESTATUS = "employeeStatus";
	/** Qualifier of the <code>TravellerProfile.offEmailId</code> attribute **/
	public static final String OFFEMAILID = "offEmailId";
	/** Qualifier of the <code>TravellerProfile.joiningDate</code> attribute **/
	public static final String JOININGDATE = "joiningDate";
	/** Qualifier of the <code>TravellerProfile.profileType</code> attribute **/
	public static final String PROFILETYPE = "profileType";
	/** Qualifier of the <code>TravellerProfile.otherAddress</code> attribute **/
	public static final String OTHERADDRESS = "otherAddress";
	/** Qualifier of the <code>TravellerProfile.emergencyContact</code> attribute **/
	public static final String EMERGENCYCONTACT = "emergencyContact";
	/** Qualifier of the <code>TravellerProfile.loyalityProgramInformation</code> attribute **/
	public static final String LOYALITYPROGRAMINFORMATION = "loyalityProgramInformation";
	/** Qualifier of the <code>TravellerProfile.visaDetails</code> attribute **/
	public static final String VISADETAILS = "visaDetails";
	/** Qualifier of the <code>TravellerProfile.passportDetails</code> attribute **/
	public static final String PASSPORTDETAILS = "passportDetails";
	/** Qualifier of the <code>TravellerProfile.preferences</code> attribute **/
	public static final String PREFERENCES = "preferences";
	/** Qualifier of the <code>TravellerProfile.carPreferences</code> attribute **/
	public static final String CARPREFERENCES = "carPreferences";
	/** Qualifier of the <code>TravellerProfile.hotelPreferences</code> attribute **/
	public static final String HOTELPREFERENCES = "hotelPreferences";
	/** Qualifier of the <code>TravellerProfile.flightPreferences</code> attribute **/
	public static final String FLIGHTPREFERENCES = "flightPreferences";
	/** Qualifier of the <code>TravellerProfile.travellerFamilyDetails</code> attribute **/
	public static final String TRAVELLERFAMILYDETAILS = "travellerFamilyDetails";
	/** Qualifier of the <code>TravellerProfile.medias</code> attribute **/
	public static final String MEDIAS = "medias";
	/**
	* {@link OneToManyHandler} for handling 1:n OTHERADDRESS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Address> OTHERADDRESSHANDLER = new OneToManyHandler<Address>(
	CoreConstants.TC.ADDRESS,
	false,
	"travellerProfile",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n EMERGENCYCONTACT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EmergencyContact> EMERGENCYCONTACTHANDLER = new OneToManyHandler<EmergencyContact>(
	ClientcoreConstants.TC.EMERGENCYCONTACT,
	false,
	"travellerProfile",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n LOYALITYPROGRAMINFORMATION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<LoyalityProgramInformation> LOYALITYPROGRAMINFORMATIONHANDLER = new OneToManyHandler<LoyalityProgramInformation>(
	ClientcoreConstants.TC.LOYALITYPROGRAMINFORMATION,
	false,
	"travellerProfile",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n VISADETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<VisaDetails> VISADETAILSHANDLER = new OneToManyHandler<VisaDetails>(
	ClientcoreConstants.TC.VISADETAILS,
	false,
	"travellerProfile",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PASSPORTDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PassportDetails> PASSPORTDETAILSHANDLER = new OneToManyHandler<PassportDetails>(
	ClientcoreConstants.TC.PASSPORTDETAILS,
	false,
	"travellerProfile",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PREFERENCES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Preference> PREFERENCESHANDLER = new OneToManyHandler<Preference>(
	ClientcoreConstants.TC.PREFERENCE,
	false,
	"travellerProfile",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CARPREFERENCES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CarPreference> CARPREFERENCESHANDLER = new OneToManyHandler<CarPreference>(
	ClientcoreConstants.TC.CARPREFERENCE,
	false,
	"travellerProfile",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n HOTELPREFERENCES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<HotelPreference> HOTELPREFERENCESHANDLER = new OneToManyHandler<HotelPreference>(
	ClientcoreConstants.TC.HOTELPREFERENCE,
	false,
	"travellerProfile",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n FLIGHTPREFERENCES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<FlightPrefernce> FLIGHTPREFERENCESHANDLER = new OneToManyHandler<FlightPrefernce>(
	ClientcoreConstants.TC.FLIGHTPREFERNCE,
	false,
	"travellerProfile",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n TRAVELLERFAMILYDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ProfileInformation> TRAVELLERFAMILYDETAILSHANDLER = new OneToManyHandler<ProfileInformation>(
	ClientcoreConstants.TC.TRAVELLERFAMILYDETAILS,
	false,
	"travellerProfile",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n MEDIAS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Media> MEDIASHANDLER = new OneToManyHandler<Media>(
	CoreConstants.TC.MEDIA,
	true,
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
		tmp.put(CLIENTNAME, AttributeMode.INITIAL);
		tmp.put(PROFILEINFORMATION, AttributeMode.INITIAL);
		tmp.put(PERSONALEMAILID, AttributeMode.INITIAL);
		tmp.put(NUMBER, AttributeMode.INITIAL);
		tmp.put(MARRIED, AttributeMode.INITIAL);
		tmp.put(ANNIVERSARYDATE, AttributeMode.INITIAL);
		tmp.put(NATIONALIDENTIFICATIONTYPE, AttributeMode.INITIAL);
		tmp.put(CORPORATEADDRESS, AttributeMode.INITIAL);
		tmp.put(RESIDENTALADDRESS, AttributeMode.INITIAL);
		tmp.put(PERMANENTADDRESS, AttributeMode.INITIAL);
		tmp.put(PREFERENCE, AttributeMode.INITIAL);
		tmp.put(GRADE, AttributeMode.INITIAL);
		tmp.put(DESIGNATION, AttributeMode.INITIAL);
		tmp.put(DEPARTMENT, AttributeMode.INITIAL);
		tmp.put(EMPLOYEESTATUS, AttributeMode.INITIAL);
		tmp.put(OFFEMAILID, AttributeMode.INITIAL);
		tmp.put(JOININGDATE, AttributeMode.INITIAL);
		tmp.put(PROFILETYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.anniversaryDate</code> attribute.
	 * @return the anniversaryDate
	 */
	public Date getAnniversaryDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ANNIVERSARYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.anniversaryDate</code> attribute.
	 * @return the anniversaryDate
	 */
	public Date getAnniversaryDate()
	{
		return getAnniversaryDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.anniversaryDate</code> attribute. 
	 * @param value the anniversaryDate
	 */
	public void setAnniversaryDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ANNIVERSARYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.anniversaryDate</code> attribute. 
	 * @param value the anniversaryDate
	 */
	public void setAnniversaryDate(final Date value)
	{
		setAnniversaryDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.carPreferences</code> attribute.
	 * @return the carPreferences
	 */
	public Set<CarPreference> getCarPreferences(final SessionContext ctx)
	{
		return (Set<CarPreference>)CARPREFERENCESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.carPreferences</code> attribute.
	 * @return the carPreferences
	 */
	public Set<CarPreference> getCarPreferences()
	{
		return getCarPreferences( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.carPreferences</code> attribute. 
	 * @param value the carPreferences
	 */
	public void setCarPreferences(final SessionContext ctx, final Set<CarPreference> value)
	{
		CARPREFERENCESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.carPreferences</code> attribute. 
	 * @param value the carPreferences
	 */
	public void setCarPreferences(final Set<CarPreference> value)
	{
		setCarPreferences( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to carPreferences. 
	 * @param value the item to add to carPreferences
	 */
	public void addToCarPreferences(final SessionContext ctx, final CarPreference value)
	{
		CARPREFERENCESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to carPreferences. 
	 * @param value the item to add to carPreferences
	 */
	public void addToCarPreferences(final CarPreference value)
	{
		addToCarPreferences( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from carPreferences. 
	 * @param value the item to remove from carPreferences
	 */
	public void removeFromCarPreferences(final SessionContext ctx, final CarPreference value)
	{
		CARPREFERENCESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from carPreferences. 
	 * @param value the item to remove from carPreferences
	 */
	public void removeFromCarPreferences(final CarPreference value)
	{
		removeFromCarPreferences( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.clientName</code> attribute.
	 * @return the clientName
	 */
	public Principal getClientName(final SessionContext ctx)
	{
		return (Principal)getProperty( ctx, CLIENTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.clientName</code> attribute.
	 * @return the clientName
	 */
	public Principal getClientName()
	{
		return getClientName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.clientName</code> attribute. 
	 * @param value the clientName
	 */
	public void setClientName(final SessionContext ctx, final Principal value)
	{
		setProperty(ctx, CLIENTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.clientName</code> attribute. 
	 * @param value the clientName
	 */
	public void setClientName(final Principal value)
	{
		setClientName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.corporateAddress</code> attribute.
	 * @return the corporateAddress
	 */
	public Address getCorporateAddress(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, CORPORATEADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.corporateAddress</code> attribute.
	 * @return the corporateAddress
	 */
	public Address getCorporateAddress()
	{
		return getCorporateAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.corporateAddress</code> attribute. 
	 * @param value the corporateAddress
	 */
	public void setCorporateAddress(final SessionContext ctx, final Address value)
	{
		setProperty(ctx, CORPORATEADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.corporateAddress</code> attribute. 
	 * @param value the corporateAddress
	 */
	public void setCorporateAddress(final Address value)
	{
		setCorporateAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.department</code> attribute.
	 * @return the department
	 */
	public Department getDepartment(final SessionContext ctx)
	{
		return (Department)getProperty( ctx, DEPARTMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.department</code> attribute.
	 * @return the department
	 */
	public Department getDepartment()
	{
		return getDepartment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.department</code> attribute. 
	 * @param value the department
	 */
	public void setDepartment(final SessionContext ctx, final Department value)
	{
		setProperty(ctx, DEPARTMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.department</code> attribute. 
	 * @param value the department
	 */
	public void setDepartment(final Department value)
	{
		setDepartment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.designation</code> attribute.
	 * @return the designation
	 */
	public Designation getDesignation(final SessionContext ctx)
	{
		return (Designation)getProperty( ctx, DESIGNATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.designation</code> attribute.
	 * @return the designation
	 */
	public Designation getDesignation()
	{
		return getDesignation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.designation</code> attribute. 
	 * @param value the designation
	 */
	public void setDesignation(final SessionContext ctx, final Designation value)
	{
		setProperty(ctx, DESIGNATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.designation</code> attribute. 
	 * @param value the designation
	 */
	public void setDesignation(final Designation value)
	{
		setDesignation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.emergencyContact</code> attribute.
	 * @return the emergencyContact
	 */
	public Set<EmergencyContact> getEmergencyContact(final SessionContext ctx)
	{
		return (Set<EmergencyContact>)EMERGENCYCONTACTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.emergencyContact</code> attribute.
	 * @return the emergencyContact
	 */
	public Set<EmergencyContact> getEmergencyContact()
	{
		return getEmergencyContact( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.emergencyContact</code> attribute. 
	 * @param value the emergencyContact
	 */
	public void setEmergencyContact(final SessionContext ctx, final Set<EmergencyContact> value)
	{
		EMERGENCYCONTACTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.emergencyContact</code> attribute. 
	 * @param value the emergencyContact
	 */
	public void setEmergencyContact(final Set<EmergencyContact> value)
	{
		setEmergencyContact( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to emergencyContact. 
	 * @param value the item to add to emergencyContact
	 */
	public void addToEmergencyContact(final SessionContext ctx, final EmergencyContact value)
	{
		EMERGENCYCONTACTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to emergencyContact. 
	 * @param value the item to add to emergencyContact
	 */
	public void addToEmergencyContact(final EmergencyContact value)
	{
		addToEmergencyContact( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from emergencyContact. 
	 * @param value the item to remove from emergencyContact
	 */
	public void removeFromEmergencyContact(final SessionContext ctx, final EmergencyContact value)
	{
		EMERGENCYCONTACTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from emergencyContact. 
	 * @param value the item to remove from emergencyContact
	 */
	public void removeFromEmergencyContact(final EmergencyContact value)
	{
		removeFromEmergencyContact( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.employeeStatus</code> attribute.
	 * @return the employeeStatus
	 */
	public EnumerationValue getEmployeeStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, EMPLOYEESTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.employeeStatus</code> attribute.
	 * @return the employeeStatus
	 */
	public EnumerationValue getEmployeeStatus()
	{
		return getEmployeeStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.employeeStatus</code> attribute. 
	 * @param value the employeeStatus
	 */
	public void setEmployeeStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, EMPLOYEESTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.employeeStatus</code> attribute. 
	 * @param value the employeeStatus
	 */
	public void setEmployeeStatus(final EnumerationValue value)
	{
		setEmployeeStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.flightPreferences</code> attribute.
	 * @return the flightPreferences
	 */
	public Set<FlightPrefernce> getFlightPreferences(final SessionContext ctx)
	{
		return (Set<FlightPrefernce>)FLIGHTPREFERENCESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.flightPreferences</code> attribute.
	 * @return the flightPreferences
	 */
	public Set<FlightPrefernce> getFlightPreferences()
	{
		return getFlightPreferences( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.flightPreferences</code> attribute. 
	 * @param value the flightPreferences
	 */
	public void setFlightPreferences(final SessionContext ctx, final Set<FlightPrefernce> value)
	{
		FLIGHTPREFERENCESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.flightPreferences</code> attribute. 
	 * @param value the flightPreferences
	 */
	public void setFlightPreferences(final Set<FlightPrefernce> value)
	{
		setFlightPreferences( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to flightPreferences. 
	 * @param value the item to add to flightPreferences
	 */
	public void addToFlightPreferences(final SessionContext ctx, final FlightPrefernce value)
	{
		FLIGHTPREFERENCESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to flightPreferences. 
	 * @param value the item to add to flightPreferences
	 */
	public void addToFlightPreferences(final FlightPrefernce value)
	{
		addToFlightPreferences( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from flightPreferences. 
	 * @param value the item to remove from flightPreferences
	 */
	public void removeFromFlightPreferences(final SessionContext ctx, final FlightPrefernce value)
	{
		FLIGHTPREFERENCESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from flightPreferences. 
	 * @param value the item to remove from flightPreferences
	 */
	public void removeFromFlightPreferences(final FlightPrefernce value)
	{
		removeFromFlightPreferences( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.grade</code> attribute.
	 * @return the grade
	 */
	public EnumerationValue getGrade(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, GRADE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.grade</code> attribute.
	 * @return the grade
	 */
	public EnumerationValue getGrade()
	{
		return getGrade( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.grade</code> attribute. 
	 * @param value the grade
	 */
	public void setGrade(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, GRADE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.grade</code> attribute. 
	 * @param value the grade
	 */
	public void setGrade(final EnumerationValue value)
	{
		setGrade( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.hotelPreferences</code> attribute.
	 * @return the hotelPreferences
	 */
	public Set<HotelPreference> getHotelPreferences(final SessionContext ctx)
	{
		return (Set<HotelPreference>)HOTELPREFERENCESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.hotelPreferences</code> attribute.
	 * @return the hotelPreferences
	 */
	public Set<HotelPreference> getHotelPreferences()
	{
		return getHotelPreferences( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.hotelPreferences</code> attribute. 
	 * @param value the hotelPreferences
	 */
	public void setHotelPreferences(final SessionContext ctx, final Set<HotelPreference> value)
	{
		HOTELPREFERENCESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.hotelPreferences</code> attribute. 
	 * @param value the hotelPreferences
	 */
	public void setHotelPreferences(final Set<HotelPreference> value)
	{
		setHotelPreferences( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to hotelPreferences. 
	 * @param value the item to add to hotelPreferences
	 */
	public void addToHotelPreferences(final SessionContext ctx, final HotelPreference value)
	{
		HOTELPREFERENCESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to hotelPreferences. 
	 * @param value the item to add to hotelPreferences
	 */
	public void addToHotelPreferences(final HotelPreference value)
	{
		addToHotelPreferences( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from hotelPreferences. 
	 * @param value the item to remove from hotelPreferences
	 */
	public void removeFromHotelPreferences(final SessionContext ctx, final HotelPreference value)
	{
		HOTELPREFERENCESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from hotelPreferences. 
	 * @param value the item to remove from hotelPreferences
	 */
	public void removeFromHotelPreferences(final HotelPreference value)
	{
		removeFromHotelPreferences( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.joiningDate</code> attribute.
	 * @return the joiningDate
	 */
	public Date getJoiningDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, JOININGDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.joiningDate</code> attribute.
	 * @return the joiningDate
	 */
	public Date getJoiningDate()
	{
		return getJoiningDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.joiningDate</code> attribute. 
	 * @param value the joiningDate
	 */
	public void setJoiningDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, JOININGDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.joiningDate</code> attribute. 
	 * @param value the joiningDate
	 */
	public void setJoiningDate(final Date value)
	{
		setJoiningDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.loyalityProgramInformation</code> attribute.
	 * @return the loyalityProgramInformation
	 */
	public Set<LoyalityProgramInformation> getLoyalityProgramInformation(final SessionContext ctx)
	{
		return (Set<LoyalityProgramInformation>)LOYALITYPROGRAMINFORMATIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.loyalityProgramInformation</code> attribute.
	 * @return the loyalityProgramInformation
	 */
	public Set<LoyalityProgramInformation> getLoyalityProgramInformation()
	{
		return getLoyalityProgramInformation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.loyalityProgramInformation</code> attribute. 
	 * @param value the loyalityProgramInformation
	 */
	public void setLoyalityProgramInformation(final SessionContext ctx, final Set<LoyalityProgramInformation> value)
	{
		LOYALITYPROGRAMINFORMATIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.loyalityProgramInformation</code> attribute. 
	 * @param value the loyalityProgramInformation
	 */
	public void setLoyalityProgramInformation(final Set<LoyalityProgramInformation> value)
	{
		setLoyalityProgramInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to loyalityProgramInformation. 
	 * @param value the item to add to loyalityProgramInformation
	 */
	public void addToLoyalityProgramInformation(final SessionContext ctx, final LoyalityProgramInformation value)
	{
		LOYALITYPROGRAMINFORMATIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to loyalityProgramInformation. 
	 * @param value the item to add to loyalityProgramInformation
	 */
	public void addToLoyalityProgramInformation(final LoyalityProgramInformation value)
	{
		addToLoyalityProgramInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from loyalityProgramInformation. 
	 * @param value the item to remove from loyalityProgramInformation
	 */
	public void removeFromLoyalityProgramInformation(final SessionContext ctx, final LoyalityProgramInformation value)
	{
		LOYALITYPROGRAMINFORMATIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from loyalityProgramInformation. 
	 * @param value the item to remove from loyalityProgramInformation
	 */
	public void removeFromLoyalityProgramInformation(final LoyalityProgramInformation value)
	{
		removeFromLoyalityProgramInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.married</code> attribute.
	 * @return the married
	 */
	public Boolean isMarried(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, MARRIED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.married</code> attribute.
	 * @return the married
	 */
	public Boolean isMarried()
	{
		return isMarried( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.married</code> attribute. 
	 * @return the married
	 */
	public boolean isMarriedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isMarried( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.married</code> attribute. 
	 * @return the married
	 */
	public boolean isMarriedAsPrimitive()
	{
		return isMarriedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.married</code> attribute. 
	 * @param value the married
	 */
	public void setMarried(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, MARRIED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.married</code> attribute. 
	 * @param value the married
	 */
	public void setMarried(final Boolean value)
	{
		setMarried( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.married</code> attribute. 
	 * @param value the married
	 */
	public void setMarried(final SessionContext ctx, final boolean value)
	{
		setMarried( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.married</code> attribute. 
	 * @param value the married
	 */
	public void setMarried(final boolean value)
	{
		setMarried( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.medias</code> attribute.
	 * @return the medias
	 */
	public Set<Media> getMedias(final SessionContext ctx)
	{
		return (Set<Media>)MEDIASHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.medias</code> attribute.
	 * @return the medias
	 */
	public Set<Media> getMedias()
	{
		return getMedias( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.medias</code> attribute. 
	 * @param value the medias
	 */
	public void setMedias(final SessionContext ctx, final Set<Media> value)
	{
		MEDIASHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.medias</code> attribute. 
	 * @param value the medias
	 */
	public void setMedias(final Set<Media> value)
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
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.nationalIdentificationType</code> attribute.
	 * @return the nationalIdentificationType
	 */
	public EnumerationValue getNationalIdentificationType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, NATIONALIDENTIFICATIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.nationalIdentificationType</code> attribute.
	 * @return the nationalIdentificationType
	 */
	public EnumerationValue getNationalIdentificationType()
	{
		return getNationalIdentificationType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.nationalIdentificationType</code> attribute. 
	 * @param value the nationalIdentificationType
	 */
	public void setNationalIdentificationType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, NATIONALIDENTIFICATIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.nationalIdentificationType</code> attribute. 
	 * @param value the nationalIdentificationType
	 */
	public void setNationalIdentificationType(final EnumerationValue value)
	{
		setNationalIdentificationType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.number</code> attribute.
	 * @return the number
	 */
	public String getNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.number</code> attribute.
	 * @return the number
	 */
	public String getNumber()
	{
		return getNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.number</code> attribute. 
	 * @param value the number
	 */
	public void setNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.number</code> attribute. 
	 * @param value the number
	 */
	public void setNumber(final String value)
	{
		setNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.offEmailId</code> attribute.
	 * @return the offEmailId
	 */
	public String getOffEmailId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OFFEMAILID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.offEmailId</code> attribute.
	 * @return the offEmailId
	 */
	public String getOffEmailId()
	{
		return getOffEmailId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.offEmailId</code> attribute. 
	 * @param value the offEmailId
	 */
	public void setOffEmailId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OFFEMAILID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.offEmailId</code> attribute. 
	 * @param value the offEmailId
	 */
	public void setOffEmailId(final String value)
	{
		setOffEmailId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.otherAddress</code> attribute.
	 * @return the otherAddress
	 */
	public Set<Address> getOtherAddress(final SessionContext ctx)
	{
		return (Set<Address>)OTHERADDRESSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.otherAddress</code> attribute.
	 * @return the otherAddress
	 */
	public Set<Address> getOtherAddress()
	{
		return getOtherAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.otherAddress</code> attribute. 
	 * @param value the otherAddress
	 */
	public void setOtherAddress(final SessionContext ctx, final Set<Address> value)
	{
		OTHERADDRESSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.otherAddress</code> attribute. 
	 * @param value the otherAddress
	 */
	public void setOtherAddress(final Set<Address> value)
	{
		setOtherAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to otherAddress. 
	 * @param value the item to add to otherAddress
	 */
	public void addToOtherAddress(final SessionContext ctx, final Address value)
	{
		OTHERADDRESSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to otherAddress. 
	 * @param value the item to add to otherAddress
	 */
	public void addToOtherAddress(final Address value)
	{
		addToOtherAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from otherAddress. 
	 * @param value the item to remove from otherAddress
	 */
	public void removeFromOtherAddress(final SessionContext ctx, final Address value)
	{
		OTHERADDRESSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from otherAddress. 
	 * @param value the item to remove from otherAddress
	 */
	public void removeFromOtherAddress(final Address value)
	{
		removeFromOtherAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.passportDetails</code> attribute.
	 * @return the passportDetails
	 */
	public Set<PassportDetails> getPassportDetails(final SessionContext ctx)
	{
		return (Set<PassportDetails>)PASSPORTDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.passportDetails</code> attribute.
	 * @return the passportDetails
	 */
	public Set<PassportDetails> getPassportDetails()
	{
		return getPassportDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.passportDetails</code> attribute. 
	 * @param value the passportDetails
	 */
	public void setPassportDetails(final SessionContext ctx, final Set<PassportDetails> value)
	{
		PASSPORTDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.passportDetails</code> attribute. 
	 * @param value the passportDetails
	 */
	public void setPassportDetails(final Set<PassportDetails> value)
	{
		setPassportDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to passportDetails. 
	 * @param value the item to add to passportDetails
	 */
	public void addToPassportDetails(final SessionContext ctx, final PassportDetails value)
	{
		PASSPORTDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to passportDetails. 
	 * @param value the item to add to passportDetails
	 */
	public void addToPassportDetails(final PassportDetails value)
	{
		addToPassportDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from passportDetails. 
	 * @param value the item to remove from passportDetails
	 */
	public void removeFromPassportDetails(final SessionContext ctx, final PassportDetails value)
	{
		PASSPORTDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from passportDetails. 
	 * @param value the item to remove from passportDetails
	 */
	public void removeFromPassportDetails(final PassportDetails value)
	{
		removeFromPassportDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.permanentAddress</code> attribute.
	 * @return the permanentAddress
	 */
	public Address getPermanentAddress(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, PERMANENTADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.permanentAddress</code> attribute.
	 * @return the permanentAddress
	 */
	public Address getPermanentAddress()
	{
		return getPermanentAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.permanentAddress</code> attribute. 
	 * @param value the permanentAddress
	 */
	public void setPermanentAddress(final SessionContext ctx, final Address value)
	{
		setProperty(ctx, PERMANENTADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.permanentAddress</code> attribute. 
	 * @param value the permanentAddress
	 */
	public void setPermanentAddress(final Address value)
	{
		setPermanentAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.personalEmailId</code> attribute.
	 * @return the personalEmailId
	 */
	public String getPersonalEmailId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PERSONALEMAILID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.personalEmailId</code> attribute.
	 * @return the personalEmailId
	 */
	public String getPersonalEmailId()
	{
		return getPersonalEmailId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.personalEmailId</code> attribute. 
	 * @param value the personalEmailId
	 */
	public void setPersonalEmailId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PERSONALEMAILID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.personalEmailId</code> attribute. 
	 * @param value the personalEmailId
	 */
	public void setPersonalEmailId(final String value)
	{
		setPersonalEmailId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.preference</code> attribute.
	 * @return the preference
	 */
	public Preference getPreference(final SessionContext ctx)
	{
		return (Preference)getProperty( ctx, PREFERENCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.preference</code> attribute.
	 * @return the preference
	 */
	public Preference getPreference()
	{
		return getPreference( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.preference</code> attribute. 
	 * @param value the preference
	 */
	public void setPreference(final SessionContext ctx, final Preference value)
	{
		new PartOfHandler<Preference>()
		{
			@Override
			protected Preference doGetValue(final SessionContext ctx)
			{
				return getPreference( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final Preference _value)
			{
				final Preference value = _value;
				setProperty(ctx, PREFERENCE,value);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.preference</code> attribute. 
	 * @param value the preference
	 */
	public void setPreference(final Preference value)
	{
		setPreference( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.preferences</code> attribute.
	 * @return the preferences
	 */
	public Set<Preference> getPreferences(final SessionContext ctx)
	{
		return (Set<Preference>)PREFERENCESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.preferences</code> attribute.
	 * @return the preferences
	 */
	public Set<Preference> getPreferences()
	{
		return getPreferences( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.preferences</code> attribute. 
	 * @param value the preferences
	 */
	public void setPreferences(final SessionContext ctx, final Set<Preference> value)
	{
		PREFERENCESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.preferences</code> attribute. 
	 * @param value the preferences
	 */
	public void setPreferences(final Set<Preference> value)
	{
		setPreferences( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to preferences. 
	 * @param value the item to add to preferences
	 */
	public void addToPreferences(final SessionContext ctx, final Preference value)
	{
		PREFERENCESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to preferences. 
	 * @param value the item to add to preferences
	 */
	public void addToPreferences(final Preference value)
	{
		addToPreferences( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from preferences. 
	 * @param value the item to remove from preferences
	 */
	public void removeFromPreferences(final SessionContext ctx, final Preference value)
	{
		PREFERENCESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from preferences. 
	 * @param value the item to remove from preferences
	 */
	public void removeFromPreferences(final Preference value)
	{
		removeFromPreferences( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.profileInformation</code> attribute.
	 * @return the profileInformation
	 */
	public ProfileInformation getProfileInformation(final SessionContext ctx)
	{
		return (ProfileInformation)getProperty( ctx, PROFILEINFORMATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.profileInformation</code> attribute.
	 * @return the profileInformation
	 */
	public ProfileInformation getProfileInformation()
	{
		return getProfileInformation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.profileInformation</code> attribute. 
	 * @param value the profileInformation
	 */
	public void setProfileInformation(final SessionContext ctx, final ProfileInformation value)
	{
		setProperty(ctx, PROFILEINFORMATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.profileInformation</code> attribute. 
	 * @param value the profileInformation
	 */
	public void setProfileInformation(final ProfileInformation value)
	{
		setProfileInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.profileType</code> attribute.
	 * @return the profileType
	 */
	public EnumerationValue getProfileType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PROFILETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.profileType</code> attribute.
	 * @return the profileType
	 */
	public EnumerationValue getProfileType()
	{
		return getProfileType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.profileType</code> attribute. 
	 * @param value the profileType
	 */
	public void setProfileType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PROFILETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.profileType</code> attribute. 
	 * @param value the profileType
	 */
	public void setProfileType(final EnumerationValue value)
	{
		setProfileType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.residentalAddress</code> attribute.
	 * @return the residentalAddress
	 */
	public Address getResidentalAddress(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, RESIDENTALADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.residentalAddress</code> attribute.
	 * @return the residentalAddress
	 */
	public Address getResidentalAddress()
	{
		return getResidentalAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.residentalAddress</code> attribute. 
	 * @param value the residentalAddress
	 */
	public void setResidentalAddress(final SessionContext ctx, final Address value)
	{
		setProperty(ctx, RESIDENTALADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.residentalAddress</code> attribute. 
	 * @param value the residentalAddress
	 */
	public void setResidentalAddress(final Address value)
	{
		setResidentalAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.travellerFamilyDetails</code> attribute.
	 * @return the travellerFamilyDetails
	 */
	public Set<ProfileInformation> getTravellerFamilyDetails(final SessionContext ctx)
	{
		return (Set<ProfileInformation>)TRAVELLERFAMILYDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.travellerFamilyDetails</code> attribute.
	 * @return the travellerFamilyDetails
	 */
	public Set<ProfileInformation> getTravellerFamilyDetails()
	{
		return getTravellerFamilyDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.travellerFamilyDetails</code> attribute. 
	 * @param value the travellerFamilyDetails
	 */
	public void setTravellerFamilyDetails(final SessionContext ctx, final Set<ProfileInformation> value)
	{
		TRAVELLERFAMILYDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.travellerFamilyDetails</code> attribute. 
	 * @param value the travellerFamilyDetails
	 */
	public void setTravellerFamilyDetails(final Set<ProfileInformation> value)
	{
		setTravellerFamilyDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travellerFamilyDetails. 
	 * @param value the item to add to travellerFamilyDetails
	 */
	public void addToTravellerFamilyDetails(final SessionContext ctx, final ProfileInformation value)
	{
		TRAVELLERFAMILYDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travellerFamilyDetails. 
	 * @param value the item to add to travellerFamilyDetails
	 */
	public void addToTravellerFamilyDetails(final ProfileInformation value)
	{
		addToTravellerFamilyDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travellerFamilyDetails. 
	 * @param value the item to remove from travellerFamilyDetails
	 */
	public void removeFromTravellerFamilyDetails(final SessionContext ctx, final ProfileInformation value)
	{
		TRAVELLERFAMILYDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travellerFamilyDetails. 
	 * @param value the item to remove from travellerFamilyDetails
	 */
	public void removeFromTravellerFamilyDetails(final ProfileInformation value)
	{
		removeFromTravellerFamilyDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.visaDetails</code> attribute.
	 * @return the visaDetails
	 */
	public Set<VisaDetails> getVisaDetails(final SessionContext ctx)
	{
		return (Set<VisaDetails>)VISADETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProfile.visaDetails</code> attribute.
	 * @return the visaDetails
	 */
	public Set<VisaDetails> getVisaDetails()
	{
		return getVisaDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.visaDetails</code> attribute. 
	 * @param value the visaDetails
	 */
	public void setVisaDetails(final SessionContext ctx, final Set<VisaDetails> value)
	{
		VISADETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProfile.visaDetails</code> attribute. 
	 * @param value the visaDetails
	 */
	public void setVisaDetails(final Set<VisaDetails> value)
	{
		setVisaDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to visaDetails. 
	 * @param value the item to add to visaDetails
	 */
	public void addToVisaDetails(final SessionContext ctx, final VisaDetails value)
	{
		VISADETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to visaDetails. 
	 * @param value the item to add to visaDetails
	 */
	public void addToVisaDetails(final VisaDetails value)
	{
		addToVisaDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from visaDetails. 
	 * @param value the item to remove from visaDetails
	 */
	public void removeFromVisaDetails(final SessionContext ctx, final VisaDetails value)
	{
		VISADETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from visaDetails. 
	 * @param value the item to remove from visaDetails
	 */
	public void removeFromVisaDetails(final VisaDetails value)
	{
		removeFromVisaDetails( getSession().getSessionContext(), value );
	}
	
}
