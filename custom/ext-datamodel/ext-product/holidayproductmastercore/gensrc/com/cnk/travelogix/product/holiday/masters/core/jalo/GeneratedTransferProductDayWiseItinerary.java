/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.holiday.masters.core.jalo;

import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.product.common.core.jalo.AbstractDayWiseItinerary;
import com.cnk.travelogix.product.holiday.master.core.constants.HolidayproductmastercoreConstants;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.holiday.masters.core.jalo.TransferProductDayWiseItinerary TransferProductDayWiseItinerary}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTransferProductDayWiseItinerary extends AbstractDayWiseItinerary
{
	/** Qualifier of the <code>TransferProductDayWiseItinerary.category</code> attribute **/
	public static final String CATEGORY = "category";
	/** Qualifier of the <code>TransferProductDayWiseItinerary.journeyType</code> attribute **/
	public static final String JOURNEYTYPE = "journeyType";
	/** Qualifier of the <code>TransferProductDayWiseItinerary.rateDefinedFor</code> attribute **/
	public static final String RATEDEFINEDFOR = "rateDefinedFor";
	/** Qualifier of the <code>TransferProductDayWiseItinerary.transferType</code> attribute **/
	public static final String TRANSFERTYPE = "transferType";
	/** Qualifier of the <code>TransferProductDayWiseItinerary.pickUpPointType</code> attribute **/
	public static final String PICKUPPOINTTYPE = "pickUpPointType";
	/** Qualifier of the <code>TransferProductDayWiseItinerary.pickUpPointName</code> attribute **/
	public static final String PICKUPPOINTNAME = "pickUpPointName";
	/** Qualifier of the <code>TransferProductDayWiseItinerary.dropOffPointName</code> attribute **/
	public static final String DROPOFFPOINTNAME = "dropOffPointName";
	/** Qualifier of the <code>TransferProductDayWiseItinerary.dropOffPointType</code> attribute **/
	public static final String DROPOFFPOINTTYPE = "dropOffPointType";
	/** Qualifier of the <code>TransferProductDayWiseItinerary.dropOffTime</code> attribute **/
	public static final String DROPOFFTIME = "dropOffTime";
	/** Qualifier of the <code>TransferProductDayWiseItinerary.pickUpTime</code> attribute **/
	public static final String PICKUPTIME = "pickUpTime";
	/** Qualifier of the <code>TransferProductDayWiseItinerary.sessionName</code> attribute **/
	public static final String SESSIONNAME = "sessionName";
	/** Qualifier of the <code>TransferProductDayWiseItinerary.meetAndGreet</code> attribute **/
	public static final String MEETANDGREET = "meetAndGreet";
	/** Qualifier of the <code>TransferProductDayWiseItinerary.returnDay</code> attribute **/
	public static final String RETURNDAY = "returnDay";
	/** Qualifier of the <code>TransferProductDayWiseItinerary.returnSequence</code> attribute **/
	public static final String RETURNSEQUENCE = "returnSequence";
	/** Qualifier of the <code>TransferProductDayWiseItinerary.toCity</code> attribute **/
	public static final String TOCITY = "toCity";
	/** Qualifier of the <code>TransferProductDayWiseItinerary.fromCity</code> attribute **/
	public static final String FROMCITY = "fromCity";
	/** Qualifier of the <code>TransferProductDayWiseItinerary.enRouteCity</code> attribute **/
	public static final String ENROUTECITY = "enRouteCity";
	/** Qualifier of the <code>TransferProductDayWiseItinerary.overNight</code> attribute **/
	public static final String OVERNIGHT = "overNight";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractDayWiseItinerary.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CATEGORY, AttributeMode.INITIAL);
		tmp.put(JOURNEYTYPE, AttributeMode.INITIAL);
		tmp.put(RATEDEFINEDFOR, AttributeMode.INITIAL);
		tmp.put(TRANSFERTYPE, AttributeMode.INITIAL);
		tmp.put(PICKUPPOINTTYPE, AttributeMode.INITIAL);
		tmp.put(PICKUPPOINTNAME, AttributeMode.INITIAL);
		tmp.put(DROPOFFPOINTNAME, AttributeMode.INITIAL);
		tmp.put(DROPOFFPOINTTYPE, AttributeMode.INITIAL);
		tmp.put(DROPOFFTIME, AttributeMode.INITIAL);
		tmp.put(PICKUPTIME, AttributeMode.INITIAL);
		tmp.put(SESSIONNAME, AttributeMode.INITIAL);
		tmp.put(MEETANDGREET, AttributeMode.INITIAL);
		tmp.put(RETURNDAY, AttributeMode.INITIAL);
		tmp.put(RETURNSEQUENCE, AttributeMode.INITIAL);
		tmp.put(TOCITY, AttributeMode.INITIAL);
		tmp.put(FROMCITY, AttributeMode.INITIAL);
		tmp.put(ENROUTECITY, AttributeMode.INITIAL);
		tmp.put(OVERNIGHT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.category</code> attribute.
	 * @return the category - Category
	 */
	public EnumerationValue getCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.category</code> attribute.
	 * @return the category - Category
	 */
	public EnumerationValue getCategory()
	{
		return getCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.category</code> attribute. 
	 * @param value the category - Category
	 */
	public void setCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.category</code> attribute. 
	 * @param value the category - Category
	 */
	public void setCategory(final EnumerationValue value)
	{
		setCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.dropOffPointName</code> attribute.
	 * @return the dropOffPointName - Drop off point name
	 */
	public Item getDropOffPointName(final SessionContext ctx)
	{
		return (Item)getProperty( ctx, DROPOFFPOINTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.dropOffPointName</code> attribute.
	 * @return the dropOffPointName - Drop off point name
	 */
	public Item getDropOffPointName()
	{
		return getDropOffPointName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.dropOffPointName</code> attribute. 
	 * @param value the dropOffPointName - Drop off point name
	 */
	public void setDropOffPointName(final SessionContext ctx, final Item value)
	{
		setProperty(ctx, DROPOFFPOINTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.dropOffPointName</code> attribute. 
	 * @param value the dropOffPointName - Drop off point name
	 */
	public void setDropOffPointName(final Item value)
	{
		setDropOffPointName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.dropOffPointType</code> attribute.
	 * @return the dropOffPointType - Drop off point type
	 */
	public EnumerationValue getDropOffPointType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DROPOFFPOINTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.dropOffPointType</code> attribute.
	 * @return the dropOffPointType - Drop off point type
	 */
	public EnumerationValue getDropOffPointType()
	{
		return getDropOffPointType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.dropOffPointType</code> attribute. 
	 * @param value the dropOffPointType - Drop off point type
	 */
	public void setDropOffPointType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DROPOFFPOINTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.dropOffPointType</code> attribute. 
	 * @param value the dropOffPointType - Drop off point type
	 */
	public void setDropOffPointType(final EnumerationValue value)
	{
		setDropOffPointType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.dropOffTime</code> attribute.
	 * @return the dropOffTime - Drop off time
	 */
	public String getDropOffTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DROPOFFTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.dropOffTime</code> attribute.
	 * @return the dropOffTime - Drop off time
	 */
	public String getDropOffTime()
	{
		return getDropOffTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.dropOffTime</code> attribute. 
	 * @param value the dropOffTime - Drop off time
	 */
	public void setDropOffTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DROPOFFTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.dropOffTime</code> attribute. 
	 * @param value the dropOffTime - Drop off time
	 */
	public void setDropOffTime(final String value)
	{
		setDropOffTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.enRouteCity</code> attribute.
	 * @return the enRouteCity - To city
	 */
	public City getEnRouteCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, ENROUTECITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.enRouteCity</code> attribute.
	 * @return the enRouteCity - To city
	 */
	public City getEnRouteCity()
	{
		return getEnRouteCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.enRouteCity</code> attribute. 
	 * @param value the enRouteCity - To city
	 */
	public void setEnRouteCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, ENROUTECITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.enRouteCity</code> attribute. 
	 * @param value the enRouteCity - To city
	 */
	public void setEnRouteCity(final City value)
	{
		setEnRouteCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.fromCity</code> attribute.
	 * @return the fromCity - From city
	 */
	public City getFromCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, FROMCITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.fromCity</code> attribute.
	 * @return the fromCity - From city
	 */
	public City getFromCity()
	{
		return getFromCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.fromCity</code> attribute. 
	 * @param value the fromCity - From city
	 */
	public void setFromCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, FROMCITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.fromCity</code> attribute. 
	 * @param value the fromCity - From city
	 */
	public void setFromCity(final City value)
	{
		setFromCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.journeyType</code> attribute.
	 * @return the journeyType - Journey type
	 */
	public EnumerationValue getJourneyType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, JOURNEYTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.journeyType</code> attribute.
	 * @return the journeyType - Journey type
	 */
	public EnumerationValue getJourneyType()
	{
		return getJourneyType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.journeyType</code> attribute. 
	 * @param value the journeyType - Journey type
	 */
	public void setJourneyType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, JOURNEYTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.journeyType</code> attribute. 
	 * @param value the journeyType - Journey type
	 */
	public void setJourneyType(final EnumerationValue value)
	{
		setJourneyType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.meetAndGreet</code> attribute.
	 * @return the meetAndGreet - Meet and greet
	 */
	public Boolean isMeetAndGreet(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, MEETANDGREET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.meetAndGreet</code> attribute.
	 * @return the meetAndGreet - Meet and greet
	 */
	public Boolean isMeetAndGreet()
	{
		return isMeetAndGreet( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.meetAndGreet</code> attribute. 
	 * @return the meetAndGreet - Meet and greet
	 */
	public boolean isMeetAndGreetAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isMeetAndGreet( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.meetAndGreet</code> attribute. 
	 * @return the meetAndGreet - Meet and greet
	 */
	public boolean isMeetAndGreetAsPrimitive()
	{
		return isMeetAndGreetAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.meetAndGreet</code> attribute. 
	 * @param value the meetAndGreet - Meet and greet
	 */
	public void setMeetAndGreet(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, MEETANDGREET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.meetAndGreet</code> attribute. 
	 * @param value the meetAndGreet - Meet and greet
	 */
	public void setMeetAndGreet(final Boolean value)
	{
		setMeetAndGreet( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.meetAndGreet</code> attribute. 
	 * @param value the meetAndGreet - Meet and greet
	 */
	public void setMeetAndGreet(final SessionContext ctx, final boolean value)
	{
		setMeetAndGreet( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.meetAndGreet</code> attribute. 
	 * @param value the meetAndGreet - Meet and greet
	 */
	public void setMeetAndGreet(final boolean value)
	{
		setMeetAndGreet( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.overNight</code> attribute.
	 * @return the overNight - Is over night
	 */
	public Boolean isOverNight(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, OVERNIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.overNight</code> attribute.
	 * @return the overNight - Is over night
	 */
	public Boolean isOverNight()
	{
		return isOverNight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.overNight</code> attribute. 
	 * @return the overNight - Is over night
	 */
	public boolean isOverNightAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isOverNight( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.overNight</code> attribute. 
	 * @return the overNight - Is over night
	 */
	public boolean isOverNightAsPrimitive()
	{
		return isOverNightAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.overNight</code> attribute. 
	 * @param value the overNight - Is over night
	 */
	public void setOverNight(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, OVERNIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.overNight</code> attribute. 
	 * @param value the overNight - Is over night
	 */
	public void setOverNight(final Boolean value)
	{
		setOverNight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.overNight</code> attribute. 
	 * @param value the overNight - Is over night
	 */
	public void setOverNight(final SessionContext ctx, final boolean value)
	{
		setOverNight( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.overNight</code> attribute. 
	 * @param value the overNight - Is over night
	 */
	public void setOverNight(final boolean value)
	{
		setOverNight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.pickUpPointName</code> attribute.
	 * @return the pickUpPointName - Pickup point name
	 */
	public Item getPickUpPointName(final SessionContext ctx)
	{
		return (Item)getProperty( ctx, PICKUPPOINTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.pickUpPointName</code> attribute.
	 * @return the pickUpPointName - Pickup point name
	 */
	public Item getPickUpPointName()
	{
		return getPickUpPointName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.pickUpPointName</code> attribute. 
	 * @param value the pickUpPointName - Pickup point name
	 */
	public void setPickUpPointName(final SessionContext ctx, final Item value)
	{
		setProperty(ctx, PICKUPPOINTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.pickUpPointName</code> attribute. 
	 * @param value the pickUpPointName - Pickup point name
	 */
	public void setPickUpPointName(final Item value)
	{
		setPickUpPointName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.pickUpPointType</code> attribute.
	 * @return the pickUpPointType - Pickup point type
	 */
	public EnumerationValue getPickUpPointType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PICKUPPOINTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.pickUpPointType</code> attribute.
	 * @return the pickUpPointType - Pickup point type
	 */
	public EnumerationValue getPickUpPointType()
	{
		return getPickUpPointType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.pickUpPointType</code> attribute. 
	 * @param value the pickUpPointType - Pickup point type
	 */
	public void setPickUpPointType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PICKUPPOINTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.pickUpPointType</code> attribute. 
	 * @param value the pickUpPointType - Pickup point type
	 */
	public void setPickUpPointType(final EnumerationValue value)
	{
		setPickUpPointType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.pickUpTime</code> attribute.
	 * @return the pickUpTime - Pick up time
	 */
	public String getPickUpTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PICKUPTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.pickUpTime</code> attribute.
	 * @return the pickUpTime - Pick up time
	 */
	public String getPickUpTime()
	{
		return getPickUpTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.pickUpTime</code> attribute. 
	 * @param value the pickUpTime - Pick up time
	 */
	public void setPickUpTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PICKUPTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.pickUpTime</code> attribute. 
	 * @param value the pickUpTime - Pick up time
	 */
	public void setPickUpTime(final String value)
	{
		setPickUpTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.rateDefinedFor</code> attribute.
	 * @return the rateDefinedFor - Rate defined for type
	 */
	public EnumerationValue getRateDefinedFor(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RATEDEFINEDFOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.rateDefinedFor</code> attribute.
	 * @return the rateDefinedFor - Rate defined for type
	 */
	public EnumerationValue getRateDefinedFor()
	{
		return getRateDefinedFor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.rateDefinedFor</code> attribute. 
	 * @param value the rateDefinedFor - Rate defined for type
	 */
	public void setRateDefinedFor(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RATEDEFINEDFOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.rateDefinedFor</code> attribute. 
	 * @param value the rateDefinedFor - Rate defined for type
	 */
	public void setRateDefinedFor(final EnumerationValue value)
	{
		setRateDefinedFor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.returnDay</code> attribute.
	 * @return the returnDay - Return day
	 */
	public Integer getReturnDay(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, RETURNDAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.returnDay</code> attribute.
	 * @return the returnDay - Return day
	 */
	public Integer getReturnDay()
	{
		return getReturnDay( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.returnDay</code> attribute. 
	 * @return the returnDay - Return day
	 */
	public int getReturnDayAsPrimitive(final SessionContext ctx)
	{
		Integer value = getReturnDay( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.returnDay</code> attribute. 
	 * @return the returnDay - Return day
	 */
	public int getReturnDayAsPrimitive()
	{
		return getReturnDayAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.returnDay</code> attribute. 
	 * @param value the returnDay - Return day
	 */
	public void setReturnDay(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, RETURNDAY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.returnDay</code> attribute. 
	 * @param value the returnDay - Return day
	 */
	public void setReturnDay(final Integer value)
	{
		setReturnDay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.returnDay</code> attribute. 
	 * @param value the returnDay - Return day
	 */
	public void setReturnDay(final SessionContext ctx, final int value)
	{
		setReturnDay( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.returnDay</code> attribute. 
	 * @param value the returnDay - Return day
	 */
	public void setReturnDay(final int value)
	{
		setReturnDay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.returnSequence</code> attribute.
	 * @return the returnSequence - Return day sequence
	 */
	public Integer getReturnSequence(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, RETURNSEQUENCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.returnSequence</code> attribute.
	 * @return the returnSequence - Return day sequence
	 */
	public Integer getReturnSequence()
	{
		return getReturnSequence( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.returnSequence</code> attribute. 
	 * @return the returnSequence - Return day sequence
	 */
	public int getReturnSequenceAsPrimitive(final SessionContext ctx)
	{
		Integer value = getReturnSequence( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.returnSequence</code> attribute. 
	 * @return the returnSequence - Return day sequence
	 */
	public int getReturnSequenceAsPrimitive()
	{
		return getReturnSequenceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.returnSequence</code> attribute. 
	 * @param value the returnSequence - Return day sequence
	 */
	public void setReturnSequence(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, RETURNSEQUENCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.returnSequence</code> attribute. 
	 * @param value the returnSequence - Return day sequence
	 */
	public void setReturnSequence(final Integer value)
	{
		setReturnSequence( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.returnSequence</code> attribute. 
	 * @param value the returnSequence - Return day sequence
	 */
	public void setReturnSequence(final SessionContext ctx, final int value)
	{
		setReturnSequence( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.returnSequence</code> attribute. 
	 * @param value the returnSequence - Return day sequence
	 */
	public void setReturnSequence(final int value)
	{
		setReturnSequence( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.sessionName</code> attribute.
	 * @return the sessionName - Session
	 */
	public EnumerationValue getSessionName(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SESSIONNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.sessionName</code> attribute.
	 * @return the sessionName - Session
	 */
	public EnumerationValue getSessionName()
	{
		return getSessionName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.sessionName</code> attribute. 
	 * @param value the sessionName - Session
	 */
	public void setSessionName(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SESSIONNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.sessionName</code> attribute. 
	 * @param value the sessionName - Session
	 */
	public void setSessionName(final EnumerationValue value)
	{
		setSessionName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.toCity</code> attribute.
	 * @return the toCity - To city
	 */
	public City getToCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, TOCITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.toCity</code> attribute.
	 * @return the toCity - To city
	 */
	public City getToCity()
	{
		return getToCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.toCity</code> attribute. 
	 * @param value the toCity - To city
	 */
	public void setToCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, TOCITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.toCity</code> attribute. 
	 * @param value the toCity - To city
	 */
	public void setToCity(final City value)
	{
		setToCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.transferType</code> attribute.
	 * @return the transferType - Transfer type
	 */
	public EnumerationValue getTransferType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TRANSFERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferProductDayWiseItinerary.transferType</code> attribute.
	 * @return the transferType - Transfer type
	 */
	public EnumerationValue getTransferType()
	{
		return getTransferType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.transferType</code> attribute. 
	 * @param value the transferType - Transfer type
	 */
	public void setTransferType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TRANSFERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferProductDayWiseItinerary.transferType</code> attribute. 
	 * @param value the transferType - Transfer type
	 */
	public void setTransferType(final EnumerationValue value)
	{
		setTransferType( getSession().getSessionContext(), value );
	}
	
}
