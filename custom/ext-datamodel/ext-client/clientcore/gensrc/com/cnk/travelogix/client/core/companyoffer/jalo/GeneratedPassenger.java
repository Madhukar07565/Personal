/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.companyoffer.jalo;

import com.cnk.travelogix.client.core.companyoffer.jalo.FreeOrDiscountedOfferType;
import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
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
 * Generated class for type {@link com.cnk.travelogix.client.core.companyoffer.jalo.Passenger Passenger}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPassenger extends GenericItem
{
	/** Qualifier of the <code>Passenger.passengerType</code> attribute **/
	public static final String PASSENGERTYPE = "passengerType";
	/** Qualifier of the <code>Passenger.minimumAge</code> attribute **/
	public static final String MINIMUMAGE = "minimumAge";
	/** Qualifier of the <code>Passenger.childWithBed</code> attribute **/
	public static final String CHILDWITHBED = "childWithBed";
	/** Qualifier of the <code>Passenger.miximumAge</code> attribute **/
	public static final String MIXIMUMAGE = "miximumAge";
	/** Qualifier of the <code>Passenger.childWithoutBed</code> attribute **/
	public static final String CHILDWITHOUTBED = "childWithoutBed";
	/** Qualifier of the <code>Passenger.freePassengers</code> attribute **/
	public static final String FREEPASSENGERS = "freePassengers";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n FREEPASSENGERS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPassenger> FREEPASSENGERSHANDLER = new BidirectionalOneToManyHandler<GeneratedPassenger>(
	ClientcoreConstants.TC.PASSENGER,
	false,
	"freePassengers",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PASSENGERTYPE, AttributeMode.INITIAL);
		tmp.put(MINIMUMAGE, AttributeMode.INITIAL);
		tmp.put(CHILDWITHBED, AttributeMode.INITIAL);
		tmp.put(MIXIMUMAGE, AttributeMode.INITIAL);
		tmp.put(CHILDWITHOUTBED, AttributeMode.INITIAL);
		tmp.put(FREEPASSENGERS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.childWithBed</code> attribute.
	 * @return the childWithBed
	 */
	public Boolean isChildWithBed(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, CHILDWITHBED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.childWithBed</code> attribute.
	 * @return the childWithBed
	 */
	public Boolean isChildWithBed()
	{
		return isChildWithBed( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.childWithBed</code> attribute. 
	 * @return the childWithBed
	 */
	public boolean isChildWithBedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isChildWithBed( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.childWithBed</code> attribute. 
	 * @return the childWithBed
	 */
	public boolean isChildWithBedAsPrimitive()
	{
		return isChildWithBedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.childWithBed</code> attribute. 
	 * @param value the childWithBed
	 */
	public void setChildWithBed(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, CHILDWITHBED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.childWithBed</code> attribute. 
	 * @param value the childWithBed
	 */
	public void setChildWithBed(final Boolean value)
	{
		setChildWithBed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.childWithBed</code> attribute. 
	 * @param value the childWithBed
	 */
	public void setChildWithBed(final SessionContext ctx, final boolean value)
	{
		setChildWithBed( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.childWithBed</code> attribute. 
	 * @param value the childWithBed
	 */
	public void setChildWithBed(final boolean value)
	{
		setChildWithBed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.childWithoutBed</code> attribute.
	 * @return the childWithoutBed
	 */
	public Boolean isChildWithoutBed(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, CHILDWITHOUTBED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.childWithoutBed</code> attribute.
	 * @return the childWithoutBed
	 */
	public Boolean isChildWithoutBed()
	{
		return isChildWithoutBed( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.childWithoutBed</code> attribute. 
	 * @return the childWithoutBed
	 */
	public boolean isChildWithoutBedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isChildWithoutBed( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.childWithoutBed</code> attribute. 
	 * @return the childWithoutBed
	 */
	public boolean isChildWithoutBedAsPrimitive()
	{
		return isChildWithoutBedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.childWithoutBed</code> attribute. 
	 * @param value the childWithoutBed
	 */
	public void setChildWithoutBed(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, CHILDWITHOUTBED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.childWithoutBed</code> attribute. 
	 * @param value the childWithoutBed
	 */
	public void setChildWithoutBed(final Boolean value)
	{
		setChildWithoutBed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.childWithoutBed</code> attribute. 
	 * @param value the childWithoutBed
	 */
	public void setChildWithoutBed(final SessionContext ctx, final boolean value)
	{
		setChildWithoutBed( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.childWithoutBed</code> attribute. 
	 * @param value the childWithoutBed
	 */
	public void setChildWithoutBed(final boolean value)
	{
		setChildWithoutBed( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		FREEPASSENGERSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.freePassengers</code> attribute.
	 * @return the freePassengers
	 */
	public FreeOrDiscountedOfferType getFreePassengers(final SessionContext ctx)
	{
		return (FreeOrDiscountedOfferType)getProperty( ctx, FREEPASSENGERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.freePassengers</code> attribute.
	 * @return the freePassengers
	 */
	public FreeOrDiscountedOfferType getFreePassengers()
	{
		return getFreePassengers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.freePassengers</code> attribute. 
	 * @param value the freePassengers
	 */
	public void setFreePassengers(final SessionContext ctx, final FreeOrDiscountedOfferType value)
	{
		FREEPASSENGERSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.freePassengers</code> attribute. 
	 * @param value the freePassengers
	 */
	public void setFreePassengers(final FreeOrDiscountedOfferType value)
	{
		setFreePassengers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.minimumAge</code> attribute.
	 * @return the minimumAge
	 */
	public Integer getMinimumAge(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MINIMUMAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.minimumAge</code> attribute.
	 * @return the minimumAge
	 */
	public Integer getMinimumAge()
	{
		return getMinimumAge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.minimumAge</code> attribute. 
	 * @return the minimumAge
	 */
	public int getMinimumAgeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMinimumAge( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.minimumAge</code> attribute. 
	 * @return the minimumAge
	 */
	public int getMinimumAgeAsPrimitive()
	{
		return getMinimumAgeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.minimumAge</code> attribute. 
	 * @param value the minimumAge
	 */
	public void setMinimumAge(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MINIMUMAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.minimumAge</code> attribute. 
	 * @param value the minimumAge
	 */
	public void setMinimumAge(final Integer value)
	{
		setMinimumAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.minimumAge</code> attribute. 
	 * @param value the minimumAge
	 */
	public void setMinimumAge(final SessionContext ctx, final int value)
	{
		setMinimumAge( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.minimumAge</code> attribute. 
	 * @param value the minimumAge
	 */
	public void setMinimumAge(final int value)
	{
		setMinimumAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.miximumAge</code> attribute.
	 * @return the miximumAge
	 */
	public Integer getMiximumAge(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MIXIMUMAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.miximumAge</code> attribute.
	 * @return the miximumAge
	 */
	public Integer getMiximumAge()
	{
		return getMiximumAge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.miximumAge</code> attribute. 
	 * @return the miximumAge
	 */
	public int getMiximumAgeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMiximumAge( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.miximumAge</code> attribute. 
	 * @return the miximumAge
	 */
	public int getMiximumAgeAsPrimitive()
	{
		return getMiximumAgeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.miximumAge</code> attribute. 
	 * @param value the miximumAge
	 */
	public void setMiximumAge(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MIXIMUMAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.miximumAge</code> attribute. 
	 * @param value the miximumAge
	 */
	public void setMiximumAge(final Integer value)
	{
		setMiximumAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.miximumAge</code> attribute. 
	 * @param value the miximumAge
	 */
	public void setMiximumAge(final SessionContext ctx, final int value)
	{
		setMiximumAge( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.miximumAge</code> attribute. 
	 * @param value the miximumAge
	 */
	public void setMiximumAge(final int value)
	{
		setMiximumAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PASSENGERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType()
	{
		return getPassengerType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PASSENGERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final EnumerationValue value)
	{
		setPassengerType( getSession().getSessionContext(), value );
	}
	
}
