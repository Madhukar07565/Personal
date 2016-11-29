/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.traveller.prefernce.jalo;

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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.traveller.prefernce.jalo.Preference Preference}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPreference extends GenericItem
{
	/** Qualifier of the <code>Preference.meatGreet</code> attribute **/
	public static final String MEATGREET = "meatGreet";
	/** Qualifier of the <code>Preference.parkingAtAirport</code> attribute **/
	public static final String PARKINGATAIRPORT = "parkingAtAirport";
	/** Qualifier of the <code>Preference.airportLounge</code> attribute **/
	public static final String AIRPORTLOUNGE = "airportLounge";
	/** Qualifier of the <code>Preference.dinningInResturant</code> attribute **/
	public static final String DINNINGINRESTURANT = "dinningInResturant";
	/** Qualifier of the <code>Preference.concierge</code> attribute **/
	public static final String CONCIERGE = "concierge";
	/** Qualifier of the <code>Preference.newInsurnace</code> attribute **/
	public static final String NEWINSURNACE = "newInsurnace";
	/** Qualifier of the <code>Preference.insuranceCompany</code> attribute **/
	public static final String INSURANCECOMPANY = "insuranceCompany";
	/** Qualifier of the <code>Preference.insuranceType</code> attribute **/
	public static final String INSURANCETYPE = "insuranceType";
	/** Qualifier of the <code>Preference.coahClass</code> attribute **/
	public static final String COAHCLASS = "coahClass";
	/** Qualifier of the <code>Preference.coachType</code> attribute **/
	public static final String COACHTYPE = "coachType";
	/** Qualifier of the <code>Preference.busOperator</code> attribute **/
	public static final String BUSOPERATOR = "busOperator";
	/** Qualifier of the <code>Preference.busClass</code> attribute **/
	public static final String BUSCLASS = "busClass";
	/** Qualifier of the <code>Preference.seatingType</code> attribute **/
	public static final String SEATINGTYPE = "seatingType";
	/** Qualifier of the <code>Preference.travellerProfile</code> attribute **/
	public static final String TRAVELLERPROFILE = "travellerProfile";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRAVELLERPROFILE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPreference> TRAVELLERPROFILEHANDLER = new BidirectionalOneToManyHandler<GeneratedPreference>(
	ClientcoreConstants.TC.PREFERENCE,
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
		tmp.put(MEATGREET, AttributeMode.INITIAL);
		tmp.put(PARKINGATAIRPORT, AttributeMode.INITIAL);
		tmp.put(AIRPORTLOUNGE, AttributeMode.INITIAL);
		tmp.put(DINNINGINRESTURANT, AttributeMode.INITIAL);
		tmp.put(CONCIERGE, AttributeMode.INITIAL);
		tmp.put(NEWINSURNACE, AttributeMode.INITIAL);
		tmp.put(INSURANCECOMPANY, AttributeMode.INITIAL);
		tmp.put(INSURANCETYPE, AttributeMode.INITIAL);
		tmp.put(COAHCLASS, AttributeMode.INITIAL);
		tmp.put(COACHTYPE, AttributeMode.INITIAL);
		tmp.put(BUSOPERATOR, AttributeMode.INITIAL);
		tmp.put(BUSCLASS, AttributeMode.INITIAL);
		tmp.put(SEATINGTYPE, AttributeMode.INITIAL);
		tmp.put(TRAVELLERPROFILE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.airportLounge</code> attribute.
	 * @return the airportLounge
	 */
	public Boolean isAirportLounge(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, AIRPORTLOUNGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.airportLounge</code> attribute.
	 * @return the airportLounge
	 */
	public Boolean isAirportLounge()
	{
		return isAirportLounge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.airportLounge</code> attribute. 
	 * @return the airportLounge
	 */
	public boolean isAirportLoungeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAirportLounge( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.airportLounge</code> attribute. 
	 * @return the airportLounge
	 */
	public boolean isAirportLoungeAsPrimitive()
	{
		return isAirportLoungeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.airportLounge</code> attribute. 
	 * @param value the airportLounge
	 */
	public void setAirportLounge(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, AIRPORTLOUNGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.airportLounge</code> attribute. 
	 * @param value the airportLounge
	 */
	public void setAirportLounge(final Boolean value)
	{
		setAirportLounge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.airportLounge</code> attribute. 
	 * @param value the airportLounge
	 */
	public void setAirportLounge(final SessionContext ctx, final boolean value)
	{
		setAirportLounge( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.airportLounge</code> attribute. 
	 * @param value the airportLounge
	 */
	public void setAirportLounge(final boolean value)
	{
		setAirportLounge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.busClass</code> attribute.
	 * @return the busClass
	 */
	public EnumerationValue getBusClass(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, BUSCLASS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.busClass</code> attribute.
	 * @return the busClass
	 */
	public EnumerationValue getBusClass()
	{
		return getBusClass( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.busClass</code> attribute. 
	 * @param value the busClass
	 */
	public void setBusClass(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, BUSCLASS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.busClass</code> attribute. 
	 * @param value the busClass
	 */
	public void setBusClass(final EnumerationValue value)
	{
		setBusClass( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.busOperator</code> attribute.
	 * @return the busOperator
	 */
	public EnumerationValue getBusOperator(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, BUSOPERATOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.busOperator</code> attribute.
	 * @return the busOperator
	 */
	public EnumerationValue getBusOperator()
	{
		return getBusOperator( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.busOperator</code> attribute. 
	 * @param value the busOperator
	 */
	public void setBusOperator(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, BUSOPERATOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.busOperator</code> attribute. 
	 * @param value the busOperator
	 */
	public void setBusOperator(final EnumerationValue value)
	{
		setBusOperator( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.coachType</code> attribute.
	 * @return the coachType
	 */
	public EnumerationValue getCoachType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COACHTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.coachType</code> attribute.
	 * @return the coachType
	 */
	public EnumerationValue getCoachType()
	{
		return getCoachType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.coachType</code> attribute. 
	 * @param value the coachType
	 */
	public void setCoachType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COACHTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.coachType</code> attribute. 
	 * @param value the coachType
	 */
	public void setCoachType(final EnumerationValue value)
	{
		setCoachType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.coahClass</code> attribute.
	 * @return the coahClass
	 */
	public EnumerationValue getCoahClass(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COAHCLASS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.coahClass</code> attribute.
	 * @return the coahClass
	 */
	public EnumerationValue getCoahClass()
	{
		return getCoahClass( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.coahClass</code> attribute. 
	 * @param value the coahClass
	 */
	public void setCoahClass(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COAHCLASS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.coahClass</code> attribute. 
	 * @param value the coahClass
	 */
	public void setCoahClass(final EnumerationValue value)
	{
		setCoahClass( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.concierge</code> attribute.
	 * @return the concierge
	 */
	public Boolean isConcierge(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, CONCIERGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.concierge</code> attribute.
	 * @return the concierge
	 */
	public Boolean isConcierge()
	{
		return isConcierge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.concierge</code> attribute. 
	 * @return the concierge
	 */
	public boolean isConciergeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isConcierge( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.concierge</code> attribute. 
	 * @return the concierge
	 */
	public boolean isConciergeAsPrimitive()
	{
		return isConciergeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.concierge</code> attribute. 
	 * @param value the concierge
	 */
	public void setConcierge(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, CONCIERGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.concierge</code> attribute. 
	 * @param value the concierge
	 */
	public void setConcierge(final Boolean value)
	{
		setConcierge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.concierge</code> attribute. 
	 * @param value the concierge
	 */
	public void setConcierge(final SessionContext ctx, final boolean value)
	{
		setConcierge( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.concierge</code> attribute. 
	 * @param value the concierge
	 */
	public void setConcierge(final boolean value)
	{
		setConcierge( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TRAVELLERPROFILEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.dinningInResturant</code> attribute.
	 * @return the dinningInResturant
	 */
	public Boolean isDinningInResturant(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DINNINGINRESTURANT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.dinningInResturant</code> attribute.
	 * @return the dinningInResturant
	 */
	public Boolean isDinningInResturant()
	{
		return isDinningInResturant( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.dinningInResturant</code> attribute. 
	 * @return the dinningInResturant
	 */
	public boolean isDinningInResturantAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDinningInResturant( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.dinningInResturant</code> attribute. 
	 * @return the dinningInResturant
	 */
	public boolean isDinningInResturantAsPrimitive()
	{
		return isDinningInResturantAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.dinningInResturant</code> attribute. 
	 * @param value the dinningInResturant
	 */
	public void setDinningInResturant(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DINNINGINRESTURANT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.dinningInResturant</code> attribute. 
	 * @param value the dinningInResturant
	 */
	public void setDinningInResturant(final Boolean value)
	{
		setDinningInResturant( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.dinningInResturant</code> attribute. 
	 * @param value the dinningInResturant
	 */
	public void setDinningInResturant(final SessionContext ctx, final boolean value)
	{
		setDinningInResturant( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.dinningInResturant</code> attribute. 
	 * @param value the dinningInResturant
	 */
	public void setDinningInResturant(final boolean value)
	{
		setDinningInResturant( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.insuranceCompany</code> attribute.
	 * @return the insuranceCompany
	 */
	public EnumerationValue getInsuranceCompany(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, INSURANCECOMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.insuranceCompany</code> attribute.
	 * @return the insuranceCompany
	 */
	public EnumerationValue getInsuranceCompany()
	{
		return getInsuranceCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.insuranceCompany</code> attribute. 
	 * @param value the insuranceCompany
	 */
	public void setInsuranceCompany(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, INSURANCECOMPANY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.insuranceCompany</code> attribute. 
	 * @param value the insuranceCompany
	 */
	public void setInsuranceCompany(final EnumerationValue value)
	{
		setInsuranceCompany( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.insuranceType</code> attribute.
	 * @return the insuranceType
	 */
	public EnumerationValue getInsuranceType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, INSURANCETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.insuranceType</code> attribute.
	 * @return the insuranceType
	 */
	public EnumerationValue getInsuranceType()
	{
		return getInsuranceType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.insuranceType</code> attribute. 
	 * @param value the insuranceType
	 */
	public void setInsuranceType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, INSURANCETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.insuranceType</code> attribute. 
	 * @param value the insuranceType
	 */
	public void setInsuranceType(final EnumerationValue value)
	{
		setInsuranceType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.meatGreet</code> attribute.
	 * @return the meatGreet
	 */
	public Boolean isMeatGreet(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, MEATGREET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.meatGreet</code> attribute.
	 * @return the meatGreet
	 */
	public Boolean isMeatGreet()
	{
		return isMeatGreet( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.meatGreet</code> attribute. 
	 * @return the meatGreet
	 */
	public boolean isMeatGreetAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isMeatGreet( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.meatGreet</code> attribute. 
	 * @return the meatGreet
	 */
	public boolean isMeatGreetAsPrimitive()
	{
		return isMeatGreetAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.meatGreet</code> attribute. 
	 * @param value the meatGreet
	 */
	public void setMeatGreet(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, MEATGREET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.meatGreet</code> attribute. 
	 * @param value the meatGreet
	 */
	public void setMeatGreet(final Boolean value)
	{
		setMeatGreet( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.meatGreet</code> attribute. 
	 * @param value the meatGreet
	 */
	public void setMeatGreet(final SessionContext ctx, final boolean value)
	{
		setMeatGreet( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.meatGreet</code> attribute. 
	 * @param value the meatGreet
	 */
	public void setMeatGreet(final boolean value)
	{
		setMeatGreet( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.newInsurnace</code> attribute.
	 * @return the newInsurnace
	 */
	public Boolean isNewInsurnace(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, NEWINSURNACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.newInsurnace</code> attribute.
	 * @return the newInsurnace
	 */
	public Boolean isNewInsurnace()
	{
		return isNewInsurnace( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.newInsurnace</code> attribute. 
	 * @return the newInsurnace
	 */
	public boolean isNewInsurnaceAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isNewInsurnace( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.newInsurnace</code> attribute. 
	 * @return the newInsurnace
	 */
	public boolean isNewInsurnaceAsPrimitive()
	{
		return isNewInsurnaceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.newInsurnace</code> attribute. 
	 * @param value the newInsurnace
	 */
	public void setNewInsurnace(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, NEWINSURNACE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.newInsurnace</code> attribute. 
	 * @param value the newInsurnace
	 */
	public void setNewInsurnace(final Boolean value)
	{
		setNewInsurnace( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.newInsurnace</code> attribute. 
	 * @param value the newInsurnace
	 */
	public void setNewInsurnace(final SessionContext ctx, final boolean value)
	{
		setNewInsurnace( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.newInsurnace</code> attribute. 
	 * @param value the newInsurnace
	 */
	public void setNewInsurnace(final boolean value)
	{
		setNewInsurnace( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.parkingAtAirport</code> attribute.
	 * @return the parkingAtAirport
	 */
	public Boolean isParkingAtAirport(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PARKINGATAIRPORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.parkingAtAirport</code> attribute.
	 * @return the parkingAtAirport
	 */
	public Boolean isParkingAtAirport()
	{
		return isParkingAtAirport( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.parkingAtAirport</code> attribute. 
	 * @return the parkingAtAirport
	 */
	public boolean isParkingAtAirportAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isParkingAtAirport( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.parkingAtAirport</code> attribute. 
	 * @return the parkingAtAirport
	 */
	public boolean isParkingAtAirportAsPrimitive()
	{
		return isParkingAtAirportAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.parkingAtAirport</code> attribute. 
	 * @param value the parkingAtAirport
	 */
	public void setParkingAtAirport(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PARKINGATAIRPORT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.parkingAtAirport</code> attribute. 
	 * @param value the parkingAtAirport
	 */
	public void setParkingAtAirport(final Boolean value)
	{
		setParkingAtAirport( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.parkingAtAirport</code> attribute. 
	 * @param value the parkingAtAirport
	 */
	public void setParkingAtAirport(final SessionContext ctx, final boolean value)
	{
		setParkingAtAirport( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.parkingAtAirport</code> attribute. 
	 * @param value the parkingAtAirport
	 */
	public void setParkingAtAirport(final boolean value)
	{
		setParkingAtAirport( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.seatingType</code> attribute.
	 * @return the seatingType
	 */
	public EnumerationValue getSeatingType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SEATINGTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.seatingType</code> attribute.
	 * @return the seatingType
	 */
	public EnumerationValue getSeatingType()
	{
		return getSeatingType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.seatingType</code> attribute. 
	 * @param value the seatingType
	 */
	public void setSeatingType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SEATINGTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.seatingType</code> attribute. 
	 * @param value the seatingType
	 */
	public void setSeatingType(final EnumerationValue value)
	{
		setSeatingType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.travellerProfile</code> attribute.
	 * @return the travellerProfile
	 */
	public TravellerProfile getTravellerProfile(final SessionContext ctx)
	{
		return (TravellerProfile)getProperty( ctx, TRAVELLERPROFILE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Preference.travellerProfile</code> attribute.
	 * @return the travellerProfile
	 */
	public TravellerProfile getTravellerProfile()
	{
		return getTravellerProfile( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.travellerProfile</code> attribute. 
	 * @param value the travellerProfile
	 */
	public void setTravellerProfile(final SessionContext ctx, final TravellerProfile value)
	{
		TRAVELLERPROFILEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Preference.travellerProfile</code> attribute. 
	 * @param value the travellerProfile
	 */
	public void setTravellerProfile(final TravellerProfile value)
	{
		setTravellerProfile( getSession().getSessionContext(), value );
	}
	
}
