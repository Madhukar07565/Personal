/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityProduct;
import com.cnk.travelogix.product.activity.masters.core.jalo.DayOfOperation;
import com.cnk.travelogix.product.common.core.jalo.Interest;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.EventsAndTourInfo EventsAndTourInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEventsAndTourInfo extends GenericItem
{
	/** Qualifier of the <code>EventsAndTourInfo.type</code> attribute **/
	public static final String TYPE = "type";
	/** Qualifier of the <code>EventsAndTourInfo.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>EventsAndTourInfo.duration</code> attribute **/
	public static final String DURATION = "duration";
	/** Qualifier of the <code>EventsAndTourInfo.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>EventsAndTourInfo.whereAbouts</code> attribute **/
	public static final String WHEREABOUTS = "whereAbouts";
	/** Qualifier of the <code>EventsAndTourInfo.location</code> attribute **/
	public static final String LOCATION = "location";
	/** Qualifier of the <code>EventsAndTourInfo.reservation</code> attribute **/
	public static final String RESERVATION = "reservation";
	/** Qualifier of the <code>EventsAndTourInfo.contactNumber</code> attribute **/
	public static final String CONTACTNUMBER = "contactNumber";
	/** Qualifier of the <code>EventsAndTourInfo.interest</code> attribute **/
	public static final String INTEREST = "interest";
	/** Qualifier of the <code>EventsAndTourInfo.guestPolicies</code> attribute **/
	public static final String GUESTPOLICIES = "guestPolicies";
	/** Qualifier of the <code>EventsAndTourInfo.unit</code> attribute **/
	public static final String UNIT = "unit";
	/** Qualifier of the <code>EventsAndTourInfo.guestHeight</code> attribute **/
	public static final String GUESTHEIGHT = "guestHeight";
	/** Qualifier of the <code>EventsAndTourInfo.ageRangeFromYear</code> attribute **/
	public static final String AGERANGEFROMYEAR = "ageRangeFromYear";
	/** Qualifier of the <code>EventsAndTourInfo.ageRangeFromMonth</code> attribute **/
	public static final String AGERANGEFROMMONTH = "ageRangeFromMonth";
	/** Qualifier of the <code>EventsAndTourInfo.ageRangeToYear</code> attribute **/
	public static final String AGERANGETOYEAR = "ageRangeToYear";
	/** Qualifier of the <code>EventsAndTourInfo.ageRangeToMonth</code> attribute **/
	public static final String AGERANGETOMONTH = "ageRangeToMonth";
	/** Qualifier of the <code>EventsAndTourInfo.thrillLevels</code> attribute **/
	public static final String THRILLLEVELS = "thrillLevels";
	/** Qualifier of the <code>EventsAndTourInfo.accessibility</code> attribute **/
	public static final String ACCESSIBILITY = "accessibility";
	/** Qualifier of the <code>EventsAndTourInfo.knowBeforeYouGo</code> attribute **/
	public static final String KNOWBEFOREYOUGO = "knowBeforeYouGo";
	/** Qualifier of the <code>EventsAndTourInfo.remark</code> attribute **/
	public static final String REMARK = "remark";
	/** Qualifier of the <code>EventsAndTourInfo.media</code> attribute **/
	public static final String MEDIA = "media";
	/** Qualifier of the <code>EventsAndTourInfo.activityProduct</code> attribute **/
	public static final String ACTIVITYPRODUCT = "activityProduct";
	/** Qualifier of the <code>EventsAndTourInfo.eventDaysOfOperation</code> attribute **/
	public static final String EVENTDAYSOFOPERATION = "eventDaysOfOperation";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACTIVITYPRODUCT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedEventsAndTourInfo> ACTIVITYPRODUCTHANDLER = new BidirectionalOneToManyHandler<GeneratedEventsAndTourInfo>(
	ActivityproductmasterscoreConstants.TC.EVENTSANDTOURINFO,
	false,
	"activityProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n EVENTDAYSOFOPERATION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DayOfOperation> EVENTDAYSOFOPERATIONHANDLER = new OneToManyHandler<DayOfOperation>(
	ActivityproductmasterscoreConstants.TC.DAYOFOPERATION,
	true,
	"eventsAndTourInfo",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TYPE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(DURATION, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(WHEREABOUTS, AttributeMode.INITIAL);
		tmp.put(LOCATION, AttributeMode.INITIAL);
		tmp.put(RESERVATION, AttributeMode.INITIAL);
		tmp.put(CONTACTNUMBER, AttributeMode.INITIAL);
		tmp.put(INTEREST, AttributeMode.INITIAL);
		tmp.put(GUESTPOLICIES, AttributeMode.INITIAL);
		tmp.put(UNIT, AttributeMode.INITIAL);
		tmp.put(GUESTHEIGHT, AttributeMode.INITIAL);
		tmp.put(AGERANGEFROMYEAR, AttributeMode.INITIAL);
		tmp.put(AGERANGEFROMMONTH, AttributeMode.INITIAL);
		tmp.put(AGERANGETOYEAR, AttributeMode.INITIAL);
		tmp.put(AGERANGETOMONTH, AttributeMode.INITIAL);
		tmp.put(THRILLLEVELS, AttributeMode.INITIAL);
		tmp.put(ACCESSIBILITY, AttributeMode.INITIAL);
		tmp.put(KNOWBEFOREYOUGO, AttributeMode.INITIAL);
		tmp.put(REMARK, AttributeMode.INITIAL);
		tmp.put(MEDIA, AttributeMode.INITIAL);
		tmp.put(ACTIVITYPRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.accessibility</code> attribute.
	 * @return the accessibility - Accessibility
	 */
	public String getAccessibility(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ACCESSIBILITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.accessibility</code> attribute.
	 * @return the accessibility - Accessibility
	 */
	public String getAccessibility()
	{
		return getAccessibility( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.accessibility</code> attribute. 
	 * @param value the accessibility - Accessibility
	 */
	public void setAccessibility(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ACCESSIBILITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.accessibility</code> attribute. 
	 * @param value the accessibility - Accessibility
	 */
	public void setAccessibility(final String value)
	{
		setAccessibility( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.activityProduct</code> attribute.
	 * @return the activityProduct
	 */
	public ActivityProduct getActivityProduct(final SessionContext ctx)
	{
		return (ActivityProduct)getProperty( ctx, ACTIVITYPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.activityProduct</code> attribute.
	 * @return the activityProduct
	 */
	public ActivityProduct getActivityProduct()
	{
		return getActivityProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.activityProduct</code> attribute. 
	 * @param value the activityProduct
	 */
	public void setActivityProduct(final SessionContext ctx, final ActivityProduct value)
	{
		ACTIVITYPRODUCTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.activityProduct</code> attribute. 
	 * @param value the activityProduct
	 */
	public void setActivityProduct(final ActivityProduct value)
	{
		setActivityProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.ageRangeFromMonth</code> attribute.
	 * @return the ageRangeFromMonth - Age Range From Month
	 */
	public EnumerationValue getAgeRangeFromMonth(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, AGERANGEFROMMONTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.ageRangeFromMonth</code> attribute.
	 * @return the ageRangeFromMonth - Age Range From Month
	 */
	public EnumerationValue getAgeRangeFromMonth()
	{
		return getAgeRangeFromMonth( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.ageRangeFromMonth</code> attribute. 
	 * @param value the ageRangeFromMonth - Age Range From Month
	 */
	public void setAgeRangeFromMonth(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, AGERANGEFROMMONTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.ageRangeFromMonth</code> attribute. 
	 * @param value the ageRangeFromMonth - Age Range From Month
	 */
	public void setAgeRangeFromMonth(final EnumerationValue value)
	{
		setAgeRangeFromMonth( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.ageRangeFromYear</code> attribute.
	 * @return the ageRangeFromYear - Age Range From Year.
	 */
	public String getAgeRangeFromYear(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AGERANGEFROMYEAR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.ageRangeFromYear</code> attribute.
	 * @return the ageRangeFromYear - Age Range From Year.
	 */
	public String getAgeRangeFromYear()
	{
		return getAgeRangeFromYear( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.ageRangeFromYear</code> attribute. 
	 * @param value the ageRangeFromYear - Age Range From Year.
	 */
	public void setAgeRangeFromYear(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AGERANGEFROMYEAR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.ageRangeFromYear</code> attribute. 
	 * @param value the ageRangeFromYear - Age Range From Year.
	 */
	public void setAgeRangeFromYear(final String value)
	{
		setAgeRangeFromYear( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.ageRangeToMonth</code> attribute.
	 * @return the ageRangeToMonth - Age Range To Month
	 */
	public EnumerationValue getAgeRangeToMonth(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, AGERANGETOMONTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.ageRangeToMonth</code> attribute.
	 * @return the ageRangeToMonth - Age Range To Month
	 */
	public EnumerationValue getAgeRangeToMonth()
	{
		return getAgeRangeToMonth( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.ageRangeToMonth</code> attribute. 
	 * @param value the ageRangeToMonth - Age Range To Month
	 */
	public void setAgeRangeToMonth(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, AGERANGETOMONTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.ageRangeToMonth</code> attribute. 
	 * @param value the ageRangeToMonth - Age Range To Month
	 */
	public void setAgeRangeToMonth(final EnumerationValue value)
	{
		setAgeRangeToMonth( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.ageRangeToYear</code> attribute.
	 * @return the ageRangeToYear - Age Range To Year
	 */
	public String getAgeRangeToYear(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AGERANGETOYEAR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.ageRangeToYear</code> attribute.
	 * @return the ageRangeToYear - Age Range To Year
	 */
	public String getAgeRangeToYear()
	{
		return getAgeRangeToYear( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.ageRangeToYear</code> attribute. 
	 * @param value the ageRangeToYear - Age Range To Year
	 */
	public void setAgeRangeToYear(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AGERANGETOYEAR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.ageRangeToYear</code> attribute. 
	 * @param value the ageRangeToYear - Age Range To Year
	 */
	public void setAgeRangeToYear(final String value)
	{
		setAgeRangeToYear( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.contactNumber</code> attribute.
	 * @return the contactNumber - Contact Number.
	 */
	public String getContactNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTACTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.contactNumber</code> attribute.
	 * @return the contactNumber - Contact Number.
	 */
	public String getContactNumber()
	{
		return getContactNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.contactNumber</code> attribute. 
	 * @param value the contactNumber - Contact Number.
	 */
	public void setContactNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTACTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.contactNumber</code> attribute. 
	 * @param value the contactNumber - Contact Number.
	 */
	public void setContactNumber(final String value)
	{
		setContactNumber( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACTIVITYPRODUCTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedEventsAndTourInfo.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.description</code> attribute. 
	 * @return the localized description - Description
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.description</code> attribute. 
	 * @return the localized description - Description
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedEventsAndTourInfo.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.duration</code> attribute.
	 * @return the duration - Duration.
	 */
	public String getDuration(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.duration</code> attribute.
	 * @return the duration - Duration.
	 */
	public String getDuration()
	{
		return getDuration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.duration</code> attribute. 
	 * @param value the duration - Duration.
	 */
	public void setDuration(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DURATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.duration</code> attribute. 
	 * @param value the duration - Duration.
	 */
	public void setDuration(final String value)
	{
		setDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.eventDaysOfOperation</code> attribute.
	 * @return the eventDaysOfOperation
	 */
	public Collection<DayOfOperation> getEventDaysOfOperation(final SessionContext ctx)
	{
		return EVENTDAYSOFOPERATIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.eventDaysOfOperation</code> attribute.
	 * @return the eventDaysOfOperation
	 */
	public Collection<DayOfOperation> getEventDaysOfOperation()
	{
		return getEventDaysOfOperation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.eventDaysOfOperation</code> attribute. 
	 * @param value the eventDaysOfOperation
	 */
	public void setEventDaysOfOperation(final SessionContext ctx, final Collection<DayOfOperation> value)
	{
		EVENTDAYSOFOPERATIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.eventDaysOfOperation</code> attribute. 
	 * @param value the eventDaysOfOperation
	 */
	public void setEventDaysOfOperation(final Collection<DayOfOperation> value)
	{
		setEventDaysOfOperation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to eventDaysOfOperation. 
	 * @param value the item to add to eventDaysOfOperation
	 */
	public void addToEventDaysOfOperation(final SessionContext ctx, final DayOfOperation value)
	{
		EVENTDAYSOFOPERATIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to eventDaysOfOperation. 
	 * @param value the item to add to eventDaysOfOperation
	 */
	public void addToEventDaysOfOperation(final DayOfOperation value)
	{
		addToEventDaysOfOperation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from eventDaysOfOperation. 
	 * @param value the item to remove from eventDaysOfOperation
	 */
	public void removeFromEventDaysOfOperation(final SessionContext ctx, final DayOfOperation value)
	{
		EVENTDAYSOFOPERATIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from eventDaysOfOperation. 
	 * @param value the item to remove from eventDaysOfOperation
	 */
	public void removeFromEventDaysOfOperation(final DayOfOperation value)
	{
		removeFromEventDaysOfOperation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.guestHeight</code> attribute.
	 * @return the guestHeight - Guest Height.
	 */
	public String getGuestHeight(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GUESTHEIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.guestHeight</code> attribute.
	 * @return the guestHeight - Guest Height.
	 */
	public String getGuestHeight()
	{
		return getGuestHeight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.guestHeight</code> attribute. 
	 * @param value the guestHeight - Guest Height.
	 */
	public void setGuestHeight(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GUESTHEIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.guestHeight</code> attribute. 
	 * @param value the guestHeight - Guest Height.
	 */
	public void setGuestHeight(final String value)
	{
		setGuestHeight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.guestPolicies</code> attribute.
	 * @return the guestPolicies - Guest Policies.
	 */
	public String getGuestPolicies(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GUESTPOLICIES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.guestPolicies</code> attribute.
	 * @return the guestPolicies - Guest Policies.
	 */
	public String getGuestPolicies()
	{
		return getGuestPolicies( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.guestPolicies</code> attribute. 
	 * @param value the guestPolicies - Guest Policies.
	 */
	public void setGuestPolicies(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GUESTPOLICIES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.guestPolicies</code> attribute. 
	 * @param value the guestPolicies - Guest Policies.
	 */
	public void setGuestPolicies(final String value)
	{
		setGuestPolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.interest</code> attribute.
	 * @return the interest - Interest.
	 */
	public Interest getInterest(final SessionContext ctx)
	{
		return (Interest)getProperty( ctx, INTEREST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.interest</code> attribute.
	 * @return the interest - Interest.
	 */
	public Interest getInterest()
	{
		return getInterest( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.interest</code> attribute. 
	 * @param value the interest - Interest.
	 */
	public void setInterest(final SessionContext ctx, final Interest value)
	{
		setProperty(ctx, INTEREST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.interest</code> attribute. 
	 * @param value the interest - Interest.
	 */
	public void setInterest(final Interest value)
	{
		setInterest( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.knowBeforeYouGo</code> attribute.
	 * @return the knowBeforeYouGo - Know Before You Go
	 */
	public String getKnowBeforeYouGo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, KNOWBEFOREYOUGO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.knowBeforeYouGo</code> attribute.
	 * @return the knowBeforeYouGo - Know Before You Go
	 */
	public String getKnowBeforeYouGo()
	{
		return getKnowBeforeYouGo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.knowBeforeYouGo</code> attribute. 
	 * @param value the knowBeforeYouGo - Know Before You Go
	 */
	public void setKnowBeforeYouGo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, KNOWBEFOREYOUGO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.knowBeforeYouGo</code> attribute. 
	 * @param value the knowBeforeYouGo - Know Before You Go
	 */
	public void setKnowBeforeYouGo(final String value)
	{
		setKnowBeforeYouGo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.location</code> attribute.
	 * @return the location - Location.
	 */
	public String getLocation(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LOCATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.location</code> attribute.
	 * @return the location - Location.
	 */
	public String getLocation()
	{
		return getLocation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.location</code> attribute. 
	 * @param value the location - Location.
	 */
	public void setLocation(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LOCATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.location</code> attribute. 
	 * @param value the location - Location.
	 */
	public void setLocation(final String value)
	{
		setLocation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.media</code> attribute.
	 * @return the media - Media
	 */
	public Collection<Media> getMedia(final SessionContext ctx)
	{
		Collection<Media> coll = (Collection<Media>)getProperty( ctx, MEDIA);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.media</code> attribute.
	 * @return the media - Media
	 */
	public Collection<Media> getMedia()
	{
		return getMedia( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.media</code> attribute. 
	 * @param value the media - Media
	 */
	public void setMedia(final SessionContext ctx, final Collection<Media> value)
	{
		setProperty(ctx, MEDIA,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.media</code> attribute. 
	 * @param value the media - Media
	 */
	public void setMedia(final Collection<Media> value)
	{
		setMedia( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.name</code> attribute.
	 * @return the name - Duration.
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedEventsAndTourInfo.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.name</code> attribute.
	 * @return the name - Duration.
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.name</code> attribute. 
	 * @return the localized name - Duration.
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.name</code> attribute. 
	 * @return the localized name - Duration.
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.name</code> attribute. 
	 * @param value the name - Duration.
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedEventsAndTourInfo.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.name</code> attribute. 
	 * @param value the name - Duration.
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.name</code> attribute. 
	 * @param value the name - Duration.
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.name</code> attribute. 
	 * @param value the name - Duration.
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.remark</code> attribute.
	 * @return the remark - Remark
	 */
	public String getRemark(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REMARK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.remark</code> attribute.
	 * @return the remark - Remark
	 */
	public String getRemark()
	{
		return getRemark( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.remark</code> attribute. 
	 * @param value the remark - Remark
	 */
	public void setRemark(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REMARK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.remark</code> attribute. 
	 * @param value the remark - Remark
	 */
	public void setRemark(final String value)
	{
		setRemark( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.reservation</code> attribute.
	 * @return the reservation - Reservation.
	 */
	public Boolean isReservation(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, RESERVATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.reservation</code> attribute.
	 * @return the reservation - Reservation.
	 */
	public Boolean isReservation()
	{
		return isReservation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.reservation</code> attribute. 
	 * @return the reservation - Reservation.
	 */
	public boolean isReservationAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isReservation( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.reservation</code> attribute. 
	 * @return the reservation - Reservation.
	 */
	public boolean isReservationAsPrimitive()
	{
		return isReservationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.reservation</code> attribute. 
	 * @param value the reservation - Reservation.
	 */
	public void setReservation(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, RESERVATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.reservation</code> attribute. 
	 * @param value the reservation - Reservation.
	 */
	public void setReservation(final Boolean value)
	{
		setReservation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.reservation</code> attribute. 
	 * @param value the reservation - Reservation.
	 */
	public void setReservation(final SessionContext ctx, final boolean value)
	{
		setReservation( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.reservation</code> attribute. 
	 * @param value the reservation - Reservation.
	 */
	public void setReservation(final boolean value)
	{
		setReservation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.thrillLevels</code> attribute.
	 * @return the thrillLevels - Thrill Levels
	 */
	public String getThrillLevels(final SessionContext ctx)
	{
		return (String)getProperty( ctx, THRILLLEVELS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.thrillLevels</code> attribute.
	 * @return the thrillLevels - Thrill Levels
	 */
	public String getThrillLevels()
	{
		return getThrillLevels( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.thrillLevels</code> attribute. 
	 * @param value the thrillLevels - Thrill Levels
	 */
	public void setThrillLevels(final SessionContext ctx, final String value)
	{
		setProperty(ctx, THRILLLEVELS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.thrillLevels</code> attribute. 
	 * @param value the thrillLevels - Thrill Levels
	 */
	public void setThrillLevels(final String value)
	{
		setThrillLevels( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.type</code> attribute.
	 * @return the type - Event And Tour Type
	 */
	public EnumerationValue getType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.type</code> attribute.
	 * @return the type - Event And Tour Type
	 */
	public EnumerationValue getType()
	{
		return getType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.type</code> attribute. 
	 * @param value the type - Event And Tour Type
	 */
	public void setType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.type</code> attribute. 
	 * @param value the type - Event And Tour Type
	 */
	public void setType(final EnumerationValue value)
	{
		setType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.unit</code> attribute.
	 * @return the unit - Unit
	 */
	public EnumerationValue getUnit(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, UNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.unit</code> attribute.
	 * @return the unit - Unit
	 */
	public EnumerationValue getUnit()
	{
		return getUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.unit</code> attribute. 
	 * @param value the unit - Unit
	 */
	public void setUnit(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, UNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.unit</code> attribute. 
	 * @param value the unit - Unit
	 */
	public void setUnit(final EnumerationValue value)
	{
		setUnit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.whereAbouts</code> attribute.
	 * @return the whereAbouts - Where Abouts
	 */
	public String getWhereAbouts(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WHEREABOUTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.whereAbouts</code> attribute.
	 * @return the whereAbouts - Where Abouts
	 */
	public String getWhereAbouts()
	{
		return getWhereAbouts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.whereAbouts</code> attribute. 
	 * @param value the whereAbouts - Where Abouts
	 */
	public void setWhereAbouts(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WHEREABOUTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.whereAbouts</code> attribute. 
	 * @param value the whereAbouts - Where Abouts
	 */
	public void setWhereAbouts(final String value)
	{
		setWhereAbouts( getSession().getSessionContext(), value );
	}
	
}
