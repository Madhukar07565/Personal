/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.masterdata.core.staff.jalo;

import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.department.jalo.Department;
import com.cnk.travelogix.masterdata.core.i18n.jalo.TimeZone;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.jalo.user.Employee;
import de.hybris.platform.jalo.user.Title;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.masterdata.core.staff.jalo.StaffInformation StaffInformation}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedStaffInformation extends GenericItem
{
	/** Qualifier of the <code>StaffInformation.uid</code> attribute **/
	public static final String UID = "uid";
	/** Qualifier of the <code>StaffInformation.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>StaffInformation.firstName</code> attribute **/
	public static final String FIRSTNAME = "firstName";
	/** Qualifier of the <code>StaffInformation.middleName</code> attribute **/
	public static final String MIDDLENAME = "middleName";
	/** Qualifier of the <code>StaffInformation.lastName</code> attribute **/
	public static final String LASTNAME = "lastName";
	/** Qualifier of the <code>StaffInformation.department</code> attribute **/
	public static final String DEPARTMENT = "department";
	/** Qualifier of the <code>StaffInformation.designation</code> attribute **/
	public static final String DESIGNATION = "designation";
	/** Qualifier of the <code>StaffInformation.role</code> attribute **/
	public static final String ROLE = "role";
	/** Qualifier of the <code>StaffInformation.responsibilities</code> attribute **/
	public static final String RESPONSIBILITIES = "responsibilities";
	/** Qualifier of the <code>StaffInformation.gender</code> attribute **/
	public static final String GENDER = "gender";
	/** Qualifier of the <code>StaffInformation.birthDate</code> attribute **/
	public static final String BIRTHDATE = "birthDate";
	/** Qualifier of the <code>StaffInformation.anniversaryDate</code> attribute **/
	public static final String ANNIVERSARYDATE = "anniversaryDate";
	/** Qualifier of the <code>StaffInformation.internalText</code> attribute **/
	public static final String INTERNALTEXT = "internalText";
	/** Qualifier of the <code>StaffInformation.addresses</code> attribute **/
	public static final String ADDRESSES = "addresses";
	/** Qualifier of the <code>StaffInformation.timeZone</code> attribute **/
	public static final String TIMEZONE = "timeZone";
	/** Qualifier of the <code>StaffInformation.availabilityTimeFrom</code> attribute **/
	public static final String AVAILABILITYTIMEFROM = "availabilityTimeFrom";
	/** Qualifier of the <code>StaffInformation.availabilityTimeTo</code> attribute **/
	public static final String AVAILABILITYTIMETO = "availabilityTimeTo";
	/** Qualifier of the <code>StaffInformation.media</code> attribute **/
	public static final String MEDIA = "media";
	/** Qualifier of the <code>StaffInformation.notes</code> attribute **/
	public static final String NOTES = "notes";
	/** Qualifier of the <code>StaffInformation.lockedBy</code> attribute **/
	public static final String LOCKEDBY = "lockedBy";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(UID, AttributeMode.INITIAL);
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(FIRSTNAME, AttributeMode.INITIAL);
		tmp.put(MIDDLENAME, AttributeMode.INITIAL);
		tmp.put(LASTNAME, AttributeMode.INITIAL);
		tmp.put(DEPARTMENT, AttributeMode.INITIAL);
		tmp.put(DESIGNATION, AttributeMode.INITIAL);
		tmp.put(ROLE, AttributeMode.INITIAL);
		tmp.put(RESPONSIBILITIES, AttributeMode.INITIAL);
		tmp.put(GENDER, AttributeMode.INITIAL);
		tmp.put(BIRTHDATE, AttributeMode.INITIAL);
		tmp.put(ANNIVERSARYDATE, AttributeMode.INITIAL);
		tmp.put(INTERNALTEXT, AttributeMode.INITIAL);
		tmp.put(ADDRESSES, AttributeMode.INITIAL);
		tmp.put(TIMEZONE, AttributeMode.INITIAL);
		tmp.put(AVAILABILITYTIMEFROM, AttributeMode.INITIAL);
		tmp.put(AVAILABILITYTIMETO, AttributeMode.INITIAL);
		tmp.put(MEDIA, AttributeMode.INITIAL);
		tmp.put(NOTES, AttributeMode.INITIAL);
		tmp.put(LOCKEDBY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.addresses</code> attribute.
	 * @return the addresses
	 */
	public Collection<Address> getAddresses(final SessionContext ctx)
	{
		Collection<Address> coll = (Collection<Address>)getProperty( ctx, ADDRESSES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.addresses</code> attribute.
	 * @return the addresses
	 */
	public Collection<Address> getAddresses()
	{
		return getAddresses( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.addresses</code> attribute. 
	 * @param value the addresses
	 */
	public void setAddresses(final SessionContext ctx, final Collection<Address> value)
	{
		setProperty(ctx, ADDRESSES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.addresses</code> attribute. 
	 * @param value the addresses
	 */
	public void setAddresses(final Collection<Address> value)
	{
		setAddresses( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.anniversaryDate</code> attribute.
	 * @return the anniversaryDate
	 */
	public Date getAnniversaryDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ANNIVERSARYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.anniversaryDate</code> attribute.
	 * @return the anniversaryDate
	 */
	public Date getAnniversaryDate()
	{
		return getAnniversaryDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.anniversaryDate</code> attribute. 
	 * @param value the anniversaryDate
	 */
	public void setAnniversaryDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ANNIVERSARYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.anniversaryDate</code> attribute. 
	 * @param value the anniversaryDate
	 */
	public void setAnniversaryDate(final Date value)
	{
		setAnniversaryDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.availabilityTimeFrom</code> attribute.
	 * @return the availabilityTimeFrom
	 */
	public Map<EnumerationValue,String> getAllAvailabilityTimeFrom(final SessionContext ctx)
	{
		Map<EnumerationValue,String> map = (Map<EnumerationValue,String>)getProperty( ctx, AVAILABILITYTIMEFROM);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.availabilityTimeFrom</code> attribute.
	 * @return the availabilityTimeFrom
	 */
	public Map<EnumerationValue,String> getAllAvailabilityTimeFrom()
	{
		return getAllAvailabilityTimeFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.availabilityTimeFrom</code> attribute. 
	 * @param value the availabilityTimeFrom
	 */
	public void setAllAvailabilityTimeFrom(final SessionContext ctx, final Map<EnumerationValue,String> value)
	{
		setProperty(ctx, AVAILABILITYTIMEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.availabilityTimeFrom</code> attribute. 
	 * @param value the availabilityTimeFrom
	 */
	public void setAllAvailabilityTimeFrom(final Map<EnumerationValue,String> value)
	{
		setAllAvailabilityTimeFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.availabilityTimeTo</code> attribute.
	 * @return the availabilityTimeTo
	 */
	public Map<EnumerationValue,String> getAllAvailabilityTimeTo(final SessionContext ctx)
	{
		Map<EnumerationValue,String> map = (Map<EnumerationValue,String>)getProperty( ctx, AVAILABILITYTIMETO);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.availabilityTimeTo</code> attribute.
	 * @return the availabilityTimeTo
	 */
	public Map<EnumerationValue,String> getAllAvailabilityTimeTo()
	{
		return getAllAvailabilityTimeTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.availabilityTimeTo</code> attribute. 
	 * @param value the availabilityTimeTo
	 */
	public void setAllAvailabilityTimeTo(final SessionContext ctx, final Map<EnumerationValue,String> value)
	{
		setProperty(ctx, AVAILABILITYTIMETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.availabilityTimeTo</code> attribute. 
	 * @param value the availabilityTimeTo
	 */
	public void setAllAvailabilityTimeTo(final Map<EnumerationValue,String> value)
	{
		setAllAvailabilityTimeTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.birthDate</code> attribute.
	 * @return the birthDate
	 */
	public Date getBirthDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, BIRTHDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.birthDate</code> attribute.
	 * @return the birthDate
	 */
	public Date getBirthDate()
	{
		return getBirthDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.birthDate</code> attribute. 
	 * @param value the birthDate
	 */
	public void setBirthDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, BIRTHDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.birthDate</code> attribute. 
	 * @param value the birthDate
	 */
	public void setBirthDate(final Date value)
	{
		setBirthDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.department</code> attribute.
	 * @return the department
	 */
	public Department getDepartment(final SessionContext ctx)
	{
		return (Department)getProperty( ctx, DEPARTMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.department</code> attribute.
	 * @return the department
	 */
	public Department getDepartment()
	{
		return getDepartment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.department</code> attribute. 
	 * @param value the department
	 */
	public void setDepartment(final SessionContext ctx, final Department value)
	{
		setProperty(ctx, DEPARTMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.department</code> attribute. 
	 * @param value the department
	 */
	public void setDepartment(final Department value)
	{
		setDepartment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.designation</code> attribute.
	 * @return the designation
	 */
	public String getDesignation(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESIGNATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.designation</code> attribute.
	 * @return the designation
	 */
	public String getDesignation()
	{
		return getDesignation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.designation</code> attribute. 
	 * @param value the designation
	 */
	public void setDesignation(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESIGNATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.designation</code> attribute. 
	 * @param value the designation
	 */
	public void setDesignation(final String value)
	{
		setDesignation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FIRSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return getFirstName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FIRSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final String value)
	{
		setFirstName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.gender</code> attribute.
	 * @return the gender
	 */
	public EnumerationValue getGender(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, GENDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.gender</code> attribute.
	 * @return the gender
	 */
	public EnumerationValue getGender()
	{
		return getGender( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.gender</code> attribute. 
	 * @param value the gender
	 */
	public void setGender(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, GENDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.gender</code> attribute. 
	 * @param value the gender
	 */
	public void setGender(final EnumerationValue value)
	{
		setGender( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.internalText</code> attribute.
	 * @return the internalText
	 */
	public String getInternalText(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INTERNALTEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.internalText</code> attribute.
	 * @return the internalText
	 */
	public String getInternalText()
	{
		return getInternalText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.internalText</code> attribute. 
	 * @param value the internalText
	 */
	public void setInternalText(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INTERNALTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.internalText</code> attribute. 
	 * @param value the internalText
	 */
	public void setInternalText(final String value)
	{
		setInternalText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName()
	{
		return getLastName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final String value)
	{
		setLastName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.lockedBy</code> attribute.
	 * @return the lockedBy
	 */
	public Employee getLockedBy(final SessionContext ctx)
	{
		return (Employee)getProperty( ctx, LOCKEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.lockedBy</code> attribute.
	 * @return the lockedBy
	 */
	public Employee getLockedBy()
	{
		return getLockedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.lockedBy</code> attribute. 
	 * @param value the lockedBy
	 */
	public void setLockedBy(final SessionContext ctx, final Employee value)
	{
		setProperty(ctx, LOCKEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.lockedBy</code> attribute. 
	 * @param value the lockedBy
	 */
	public void setLockedBy(final Employee value)
	{
		setLockedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.media</code> attribute.
	 * @return the media
	 */
	public Media getMedia(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, MEDIA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.media</code> attribute.
	 * @return the media
	 */
	public Media getMedia()
	{
		return getMedia( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.media</code> attribute. 
	 * @param value the media
	 */
	public void setMedia(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, MEDIA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.media</code> attribute. 
	 * @param value the media
	 */
	public void setMedia(final Media value)
	{
		setMedia( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.middleName</code> attribute.
	 * @return the middleName
	 */
	public String getMiddleName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MIDDLENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.middleName</code> attribute.
	 * @return the middleName
	 */
	public String getMiddleName()
	{
		return getMiddleName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.middleName</code> attribute. 
	 * @param value the middleName
	 */
	public void setMiddleName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MIDDLENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.middleName</code> attribute. 
	 * @param value the middleName
	 */
	public void setMiddleName(final String value)
	{
		setMiddleName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.notes</code> attribute.
	 * @return the notes
	 */
	public String getNotes(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOTES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.notes</code> attribute.
	 * @return the notes
	 */
	public String getNotes()
	{
		return getNotes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.notes</code> attribute. 
	 * @param value the notes
	 */
	public void setNotes(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOTES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.notes</code> attribute. 
	 * @param value the notes
	 */
	public void setNotes(final String value)
	{
		setNotes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.responsibilities</code> attribute.
	 * @return the responsibilities
	 */
	public String getResponsibilities(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RESPONSIBILITIES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.responsibilities</code> attribute.
	 * @return the responsibilities
	 */
	public String getResponsibilities()
	{
		return getResponsibilities( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.responsibilities</code> attribute. 
	 * @param value the responsibilities
	 */
	public void setResponsibilities(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RESPONSIBILITIES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.responsibilities</code> attribute. 
	 * @param value the responsibilities
	 */
	public void setResponsibilities(final String value)
	{
		setResponsibilities( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.role</code> attribute.
	 * @return the role
	 */
	public String getRole(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ROLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.role</code> attribute.
	 * @return the role
	 */
	public String getRole()
	{
		return getRole( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.role</code> attribute. 
	 * @param value the role
	 */
	public void setRole(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ROLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.role</code> attribute. 
	 * @param value the role
	 */
	public void setRole(final String value)
	{
		setRole( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.timeZone</code> attribute.
	 * @return the timeZone
	 */
	public TimeZone getTimeZone(final SessionContext ctx)
	{
		return (TimeZone)getProperty( ctx, TIMEZONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.timeZone</code> attribute.
	 * @return the timeZone
	 */
	public TimeZone getTimeZone()
	{
		return getTimeZone( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.timeZone</code> attribute. 
	 * @param value the timeZone
	 */
	public void setTimeZone(final SessionContext ctx, final TimeZone value)
	{
		setProperty(ctx, TIMEZONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.timeZone</code> attribute. 
	 * @param value the timeZone
	 */
	public void setTimeZone(final TimeZone value)
	{
		setTimeZone( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.title</code> attribute.
	 * @return the title
	 */
	public Title getTitle(final SessionContext ctx)
	{
		return (Title)getProperty( ctx, TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.title</code> attribute.
	 * @return the title
	 */
	public Title getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final SessionContext ctx, final Title value)
	{
		setProperty(ctx, TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final Title value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.uid</code> attribute.
	 * @return the uid
	 */
	public String getUid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.uid</code> attribute.
	 * @return the uid
	 */
	public String getUid()
	{
		return getUid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.uid</code> attribute. 
	 * @param value the uid
	 */
	public void setUid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.uid</code> attribute. 
	 * @param value the uid
	 */
	public void setUid(final String value)
	{
		setUid( getSession().getSessionContext(), value );
	}
	
}
