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
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.ShoppingInfo ShoppingInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedShoppingInfo extends GenericItem
{
	/** Qualifier of the <code>ShoppingInfo.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>ShoppingInfo.nameOfShop</code> attribute **/
	public static final String NAMEOFSHOP = "nameOfShop";
	/** Qualifier of the <code>ShoppingInfo.typeOfMerchandise</code> attribute **/
	public static final String TYPEOFMERCHANDISE = "typeOfMerchandise";
	/** Qualifier of the <code>ShoppingInfo.nameOfItem</code> attribute **/
	public static final String NAMEOFITEM = "nameOfItem";
	/** Qualifier of the <code>ShoppingInfo.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>ShoppingInfo.location</code> attribute **/
	public static final String LOCATION = "location";
	/** Qualifier of the <code>ShoppingInfo.whereAbout</code> attribute **/
	public static final String WHEREABOUT = "whereAbout";
	/** Qualifier of the <code>ShoppingInfo.paymentDetails</code> attribute **/
	public static final String PAYMENTDETAILS = "paymentDetails";
	/** Qualifier of the <code>ShoppingInfo.reservation</code> attribute **/
	public static final String RESERVATION = "reservation";
	/** Qualifier of the <code>ShoppingInfo.contactNumber</code> attribute **/
	public static final String CONTACTNUMBER = "contactNumber";
	/** Qualifier of the <code>ShoppingInfo.reservationInfo</code> attribute **/
	public static final String RESERVATIONINFO = "reservationInfo";
	/** Qualifier of the <code>ShoppingInfo.notesOnOpeningTime</code> attribute **/
	public static final String NOTESONOPENINGTIME = "notesOnOpeningTime";
	/** Qualifier of the <code>ShoppingInfo.notesOnClosingTime</code> attribute **/
	public static final String NOTESONCLOSINGTIME = "notesOnClosingTime";
	/** Qualifier of the <code>ShoppingInfo.activityProduct</code> attribute **/
	public static final String ACTIVITYPRODUCT = "activityProduct";
	/** Qualifier of the <code>ShoppingInfo.shoppingDaysOfOperation</code> attribute **/
	public static final String SHOPPINGDAYSOFOPERATION = "shoppingDaysOfOperation";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACTIVITYPRODUCT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedShoppingInfo> ACTIVITYPRODUCTHANDLER = new BidirectionalOneToManyHandler<GeneratedShoppingInfo>(
	ActivityproductmasterscoreConstants.TC.SHOPPINGINFO,
	false,
	"activityProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SHOPPINGDAYSOFOPERATION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DayOfOperation> SHOPPINGDAYSOFOPERATIONHANDLER = new OneToManyHandler<DayOfOperation>(
	ActivityproductmasterscoreConstants.TC.DAYOFOPERATION,
	true,
	"shoppingInfo",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAMEOFSHOP, AttributeMode.INITIAL);
		tmp.put(TYPEOFMERCHANDISE, AttributeMode.INITIAL);
		tmp.put(NAMEOFITEM, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(LOCATION, AttributeMode.INITIAL);
		tmp.put(WHEREABOUT, AttributeMode.INITIAL);
		tmp.put(PAYMENTDETAILS, AttributeMode.INITIAL);
		tmp.put(RESERVATION, AttributeMode.INITIAL);
		tmp.put(CONTACTNUMBER, AttributeMode.INITIAL);
		tmp.put(RESERVATIONINFO, AttributeMode.INITIAL);
		tmp.put(NOTESONOPENINGTIME, AttributeMode.INITIAL);
		tmp.put(NOTESONCLOSINGTIME, AttributeMode.INITIAL);
		tmp.put(ACTIVITYPRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.activityProduct</code> attribute.
	 * @return the activityProduct
	 */
	public ActivityProduct getActivityProduct(final SessionContext ctx)
	{
		return (ActivityProduct)getProperty( ctx, ACTIVITYPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.activityProduct</code> attribute.
	 * @return the activityProduct
	 */
	public ActivityProduct getActivityProduct()
	{
		return getActivityProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.activityProduct</code> attribute. 
	 * @param value the activityProduct
	 */
	public void setActivityProduct(final SessionContext ctx, final ActivityProduct value)
	{
		ACTIVITYPRODUCTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.activityProduct</code> attribute. 
	 * @param value the activityProduct
	 */
	public void setActivityProduct(final ActivityProduct value)
	{
		setActivityProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.contactNumber</code> attribute.
	 * @return the contactNumber - Contact Number.
	 */
	public String getContactNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTACTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.contactNumber</code> attribute.
	 * @return the contactNumber - Contact Number.
	 */
	public String getContactNumber()
	{
		return getContactNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.contactNumber</code> attribute. 
	 * @param value the contactNumber - Contact Number.
	 */
	public void setContactNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTACTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.contactNumber</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedShoppingInfo.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.description</code> attribute. 
	 * @return the localized description - Description
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.description</code> attribute. 
	 * @return the localized description - Description
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedShoppingInfo.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.location</code> attribute.
	 * @return the location - Location
	 */
	public String getLocation(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LOCATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.location</code> attribute.
	 * @return the location - Location
	 */
	public String getLocation()
	{
		return getLocation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.location</code> attribute. 
	 * @param value the location - Location
	 */
	public void setLocation(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LOCATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.location</code> attribute. 
	 * @param value the location - Location
	 */
	public void setLocation(final String value)
	{
		setLocation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.nameOfItem</code> attribute.
	 * @return the nameOfItem - Name Of Item.
	 */
	public String getNameOfItem(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedShoppingInfo.getNameOfItem requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAMEOFITEM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.nameOfItem</code> attribute.
	 * @return the nameOfItem - Name Of Item.
	 */
	public String getNameOfItem()
	{
		return getNameOfItem( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.nameOfItem</code> attribute. 
	 * @return the localized nameOfItem - Name Of Item.
	 */
	public Map<Language,String> getAllNameOfItem(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAMEOFITEM,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.nameOfItem</code> attribute. 
	 * @return the localized nameOfItem - Name Of Item.
	 */
	public Map<Language,String> getAllNameOfItem()
	{
		return getAllNameOfItem( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.nameOfItem</code> attribute. 
	 * @param value the nameOfItem - Name Of Item.
	 */
	public void setNameOfItem(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedShoppingInfo.setNameOfItem requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAMEOFITEM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.nameOfItem</code> attribute. 
	 * @param value the nameOfItem - Name Of Item.
	 */
	public void setNameOfItem(final String value)
	{
		setNameOfItem( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.nameOfItem</code> attribute. 
	 * @param value the nameOfItem - Name Of Item.
	 */
	public void setAllNameOfItem(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAMEOFITEM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.nameOfItem</code> attribute. 
	 * @param value the nameOfItem - Name Of Item.
	 */
	public void setAllNameOfItem(final Map<Language,String> value)
	{
		setAllNameOfItem( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.nameOfShop</code> attribute.
	 * @return the nameOfShop - Name Of Shop.
	 */
	public String getNameOfShop(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedShoppingInfo.getNameOfShop requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAMEOFSHOP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.nameOfShop</code> attribute.
	 * @return the nameOfShop - Name Of Shop.
	 */
	public String getNameOfShop()
	{
		return getNameOfShop( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.nameOfShop</code> attribute. 
	 * @return the localized nameOfShop - Name Of Shop.
	 */
	public Map<Language,String> getAllNameOfShop(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAMEOFSHOP,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.nameOfShop</code> attribute. 
	 * @return the localized nameOfShop - Name Of Shop.
	 */
	public Map<Language,String> getAllNameOfShop()
	{
		return getAllNameOfShop( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.nameOfShop</code> attribute. 
	 * @param value the nameOfShop - Name Of Shop.
	 */
	public void setNameOfShop(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedShoppingInfo.setNameOfShop requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAMEOFSHOP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.nameOfShop</code> attribute. 
	 * @param value the nameOfShop - Name Of Shop.
	 */
	public void setNameOfShop(final String value)
	{
		setNameOfShop( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.nameOfShop</code> attribute. 
	 * @param value the nameOfShop - Name Of Shop.
	 */
	public void setAllNameOfShop(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAMEOFSHOP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.nameOfShop</code> attribute. 
	 * @param value the nameOfShop - Name Of Shop.
	 */
	public void setAllNameOfShop(final Map<Language,String> value)
	{
		setAllNameOfShop( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.notesOnClosingTime</code> attribute.
	 * @return the notesOnClosingTime - Notes On Closing Time.
	 */
	public String getNotesOnClosingTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOTESONCLOSINGTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.notesOnClosingTime</code> attribute.
	 * @return the notesOnClosingTime - Notes On Closing Time.
	 */
	public String getNotesOnClosingTime()
	{
		return getNotesOnClosingTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.notesOnClosingTime</code> attribute. 
	 * @param value the notesOnClosingTime - Notes On Closing Time.
	 */
	public void setNotesOnClosingTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOTESONCLOSINGTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.notesOnClosingTime</code> attribute. 
	 * @param value the notesOnClosingTime - Notes On Closing Time.
	 */
	public void setNotesOnClosingTime(final String value)
	{
		setNotesOnClosingTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.notesOnOpeningTime</code> attribute.
	 * @return the notesOnOpeningTime - Notes On Opening Time.
	 */
	public String getNotesOnOpeningTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOTESONOPENINGTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.notesOnOpeningTime</code> attribute.
	 * @return the notesOnOpeningTime - Notes On Opening Time.
	 */
	public String getNotesOnOpeningTime()
	{
		return getNotesOnOpeningTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.notesOnOpeningTime</code> attribute. 
	 * @param value the notesOnOpeningTime - Notes On Opening Time.
	 */
	public void setNotesOnOpeningTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOTESONOPENINGTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.notesOnOpeningTime</code> attribute. 
	 * @param value the notesOnOpeningTime - Notes On Opening Time.
	 */
	public void setNotesOnOpeningTime(final String value)
	{
		setNotesOnOpeningTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.paymentDetails</code> attribute.
	 * @return the paymentDetails - Payment Details.
	 */
	public String getPaymentDetails(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PAYMENTDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.paymentDetails</code> attribute.
	 * @return the paymentDetails - Payment Details.
	 */
	public String getPaymentDetails()
	{
		return getPaymentDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.paymentDetails</code> attribute. 
	 * @param value the paymentDetails - Payment Details.
	 */
	public void setPaymentDetails(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PAYMENTDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.paymentDetails</code> attribute. 
	 * @param value the paymentDetails - Payment Details.
	 */
	public void setPaymentDetails(final String value)
	{
		setPaymentDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.reservation</code> attribute.
	 * @return the reservation - Reservation.
	 */
	public Boolean isReservation(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, RESERVATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.reservation</code> attribute.
	 * @return the reservation - Reservation.
	 */
	public Boolean isReservation()
	{
		return isReservation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.reservation</code> attribute. 
	 * @return the reservation - Reservation.
	 */
	public boolean isReservationAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isReservation( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.reservation</code> attribute. 
	 * @return the reservation - Reservation.
	 */
	public boolean isReservationAsPrimitive()
	{
		return isReservationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.reservation</code> attribute. 
	 * @param value the reservation - Reservation.
	 */
	public void setReservation(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, RESERVATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.reservation</code> attribute. 
	 * @param value the reservation - Reservation.
	 */
	public void setReservation(final Boolean value)
	{
		setReservation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.reservation</code> attribute. 
	 * @param value the reservation - Reservation.
	 */
	public void setReservation(final SessionContext ctx, final boolean value)
	{
		setReservation( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.reservation</code> attribute. 
	 * @param value the reservation - Reservation.
	 */
	public void setReservation(final boolean value)
	{
		setReservation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.reservationInfo</code> attribute.
	 * @return the reservationInfo - Reservation Info.
	 */
	public String getReservationInfo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RESERVATIONINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.reservationInfo</code> attribute.
	 * @return the reservationInfo - Reservation Info.
	 */
	public String getReservationInfo()
	{
		return getReservationInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.reservationInfo</code> attribute. 
	 * @param value the reservationInfo - Reservation Info.
	 */
	public void setReservationInfo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RESERVATIONINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.reservationInfo</code> attribute. 
	 * @param value the reservationInfo - Reservation Info.
	 */
	public void setReservationInfo(final String value)
	{
		setReservationInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.shoppingDaysOfOperation</code> attribute.
	 * @return the shoppingDaysOfOperation
	 */
	public Collection<DayOfOperation> getShoppingDaysOfOperation(final SessionContext ctx)
	{
		return SHOPPINGDAYSOFOPERATIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.shoppingDaysOfOperation</code> attribute.
	 * @return the shoppingDaysOfOperation
	 */
	public Collection<DayOfOperation> getShoppingDaysOfOperation()
	{
		return getShoppingDaysOfOperation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.shoppingDaysOfOperation</code> attribute. 
	 * @param value the shoppingDaysOfOperation
	 */
	public void setShoppingDaysOfOperation(final SessionContext ctx, final Collection<DayOfOperation> value)
	{
		SHOPPINGDAYSOFOPERATIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.shoppingDaysOfOperation</code> attribute. 
	 * @param value the shoppingDaysOfOperation
	 */
	public void setShoppingDaysOfOperation(final Collection<DayOfOperation> value)
	{
		setShoppingDaysOfOperation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to shoppingDaysOfOperation. 
	 * @param value the item to add to shoppingDaysOfOperation
	 */
	public void addToShoppingDaysOfOperation(final SessionContext ctx, final DayOfOperation value)
	{
		SHOPPINGDAYSOFOPERATIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to shoppingDaysOfOperation. 
	 * @param value the item to add to shoppingDaysOfOperation
	 */
	public void addToShoppingDaysOfOperation(final DayOfOperation value)
	{
		addToShoppingDaysOfOperation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from shoppingDaysOfOperation. 
	 * @param value the item to remove from shoppingDaysOfOperation
	 */
	public void removeFromShoppingDaysOfOperation(final SessionContext ctx, final DayOfOperation value)
	{
		SHOPPINGDAYSOFOPERATIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from shoppingDaysOfOperation. 
	 * @param value the item to remove from shoppingDaysOfOperation
	 */
	public void removeFromShoppingDaysOfOperation(final DayOfOperation value)
	{
		removeFromShoppingDaysOfOperation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.typeOfMerchandise</code> attribute.
	 * @return the typeOfMerchandise - Type Of Merchandise.
	 */
	public String getTypeOfMerchandise(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TYPEOFMERCHANDISE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.typeOfMerchandise</code> attribute.
	 * @return the typeOfMerchandise - Type Of Merchandise.
	 */
	public String getTypeOfMerchandise()
	{
		return getTypeOfMerchandise( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.typeOfMerchandise</code> attribute. 
	 * @param value the typeOfMerchandise - Type Of Merchandise.
	 */
	public void setTypeOfMerchandise(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TYPEOFMERCHANDISE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.typeOfMerchandise</code> attribute. 
	 * @param value the typeOfMerchandise - Type Of Merchandise.
	 */
	public void setTypeOfMerchandise(final String value)
	{
		setTypeOfMerchandise( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.whereAbout</code> attribute.
	 * @return the whereAbout - Where About.
	 */
	public String getWhereAbout(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WHEREABOUT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoppingInfo.whereAbout</code> attribute.
	 * @return the whereAbout - Where About.
	 */
	public String getWhereAbout()
	{
		return getWhereAbout( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.whereAbout</code> attribute. 
	 * @param value the whereAbout - Where About.
	 */
	public void setWhereAbout(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WHEREABOUT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoppingInfo.whereAbout</code> attribute. 
	 * @param value the whereAbout - Where About.
	 */
	public void setWhereAbout(final String value)
	{
		setWhereAbout( getSession().getSessionContext(), value );
	}
	
}
