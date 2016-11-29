/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.accommodation.masters.core.jalo;

import com.cnk.travelogix.product.accommodation.masters.core.constants.AccoproductmasterscoreConstants;
import com.cnk.travelogix.product.accommodation.masters.core.jalo.PaxOccupancy;
import com.cnk.travelogix.product.common.core.jalo.Accommodation;
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
 * Generated class for type {@link com.cnk.travelogix.product.accommodation.masters.core.jalo.RoomPaxOccupancy RoomPaxOccupancy}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRoomPaxOccupancy extends PaxOccupancy
{
	/** Qualifier of the <code>RoomPaxOccupancy.roomType</code> attribute **/
	public static final String ROOMTYPE = "roomType";
	/** Qualifier of the <code>RoomPaxOccupancy.fromAgeForExtraBed</code> attribute **/
	public static final String FROMAGEFOREXTRABED = "fromAgeForExtraBed";
	/** Qualifier of the <code>RoomPaxOccupancy.toAgeForExtraBed</code> attribute **/
	public static final String TOAGEFOREXTRABED = "toAgeForExtraBed";
	/** Qualifier of the <code>RoomPaxOccupancy.maxPaxWithExtraBed</code> attribute **/
	public static final String MAXPAXWITHEXTRABED = "maxPaxWithExtraBed";
	/** Qualifier of the <code>RoomPaxOccupancy.fromAgeForCNB</code> attribute **/
	public static final String FROMAGEFORCNB = "fromAgeForCNB";
	/** Qualifier of the <code>RoomPaxOccupancy.toAgeForCNB</code> attribute **/
	public static final String TOAGEFORCNB = "toAgeForCNB";
	/** Qualifier of the <code>RoomPaxOccupancy.maxCNB</code> attribute **/
	public static final String MAXCNB = "maxCNB";
	/** Qualifier of the <code>RoomPaxOccupancy.fromAgeForCIOR</code> attribute **/
	public static final String FROMAGEFORCIOR = "fromAgeForCIOR";
	/** Qualifier of the <code>RoomPaxOccupancy.toAgeForCIOR</code> attribute **/
	public static final String TOAGEFORCIOR = "toAgeForCIOR";
	/** Qualifier of the <code>RoomPaxOccupancy.accommodation</code> attribute **/
	public static final String ACCOMMODATION = "accommodation";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACCOMMODATION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedRoomPaxOccupancy> ACCOMMODATIONHANDLER = new BidirectionalOneToManyHandler<GeneratedRoomPaxOccupancy>(
	AccoproductmasterscoreConstants.TC.ROOMPAXOCCUPANCY,
	false,
	"accommodation",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(PaxOccupancy.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ROOMTYPE, AttributeMode.INITIAL);
		tmp.put(FROMAGEFOREXTRABED, AttributeMode.INITIAL);
		tmp.put(TOAGEFOREXTRABED, AttributeMode.INITIAL);
		tmp.put(MAXPAXWITHEXTRABED, AttributeMode.INITIAL);
		tmp.put(FROMAGEFORCNB, AttributeMode.INITIAL);
		tmp.put(TOAGEFORCNB, AttributeMode.INITIAL);
		tmp.put(MAXCNB, AttributeMode.INITIAL);
		tmp.put(FROMAGEFORCIOR, AttributeMode.INITIAL);
		tmp.put(TOAGEFORCIOR, AttributeMode.INITIAL);
		tmp.put(ACCOMMODATION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.accommodation</code> attribute.
	 * @return the accommodation
	 */
	public Accommodation getAccommodation(final SessionContext ctx)
	{
		return (Accommodation)getProperty( ctx, ACCOMMODATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.accommodation</code> attribute.
	 * @return the accommodation
	 */
	public Accommodation getAccommodation()
	{
		return getAccommodation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.accommodation</code> attribute. 
	 * @param value the accommodation
	 */
	public void setAccommodation(final SessionContext ctx, final Accommodation value)
	{
		ACCOMMODATIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.accommodation</code> attribute. 
	 * @param value the accommodation
	 */
	public void setAccommodation(final Accommodation value)
	{
		setAccommodation( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACCOMMODATIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.fromAgeForCIOR</code> attribute.
	 * @return the fromAgeForCIOR - From Age For CIOR
	 */
	public Integer getFromAgeForCIOR(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, FROMAGEFORCIOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.fromAgeForCIOR</code> attribute.
	 * @return the fromAgeForCIOR - From Age For CIOR
	 */
	public Integer getFromAgeForCIOR()
	{
		return getFromAgeForCIOR( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.fromAgeForCIOR</code> attribute. 
	 * @return the fromAgeForCIOR - From Age For CIOR
	 */
	public int getFromAgeForCIORAsPrimitive(final SessionContext ctx)
	{
		Integer value = getFromAgeForCIOR( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.fromAgeForCIOR</code> attribute. 
	 * @return the fromAgeForCIOR - From Age For CIOR
	 */
	public int getFromAgeForCIORAsPrimitive()
	{
		return getFromAgeForCIORAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.fromAgeForCIOR</code> attribute. 
	 * @param value the fromAgeForCIOR - From Age For CIOR
	 */
	public void setFromAgeForCIOR(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, FROMAGEFORCIOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.fromAgeForCIOR</code> attribute. 
	 * @param value the fromAgeForCIOR - From Age For CIOR
	 */
	public void setFromAgeForCIOR(final Integer value)
	{
		setFromAgeForCIOR( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.fromAgeForCIOR</code> attribute. 
	 * @param value the fromAgeForCIOR - From Age For CIOR
	 */
	public void setFromAgeForCIOR(final SessionContext ctx, final int value)
	{
		setFromAgeForCIOR( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.fromAgeForCIOR</code> attribute. 
	 * @param value the fromAgeForCIOR - From Age For CIOR
	 */
	public void setFromAgeForCIOR(final int value)
	{
		setFromAgeForCIOR( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.fromAgeForCNB</code> attribute.
	 * @return the fromAgeForCNB - From Age For CNB
	 */
	public Integer getFromAgeForCNB(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, FROMAGEFORCNB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.fromAgeForCNB</code> attribute.
	 * @return the fromAgeForCNB - From Age For CNB
	 */
	public Integer getFromAgeForCNB()
	{
		return getFromAgeForCNB( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.fromAgeForCNB</code> attribute. 
	 * @return the fromAgeForCNB - From Age For CNB
	 */
	public int getFromAgeForCNBAsPrimitive(final SessionContext ctx)
	{
		Integer value = getFromAgeForCNB( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.fromAgeForCNB</code> attribute. 
	 * @return the fromAgeForCNB - From Age For CNB
	 */
	public int getFromAgeForCNBAsPrimitive()
	{
		return getFromAgeForCNBAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.fromAgeForCNB</code> attribute. 
	 * @param value the fromAgeForCNB - From Age For CNB
	 */
	public void setFromAgeForCNB(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, FROMAGEFORCNB,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.fromAgeForCNB</code> attribute. 
	 * @param value the fromAgeForCNB - From Age For CNB
	 */
	public void setFromAgeForCNB(final Integer value)
	{
		setFromAgeForCNB( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.fromAgeForCNB</code> attribute. 
	 * @param value the fromAgeForCNB - From Age For CNB
	 */
	public void setFromAgeForCNB(final SessionContext ctx, final int value)
	{
		setFromAgeForCNB( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.fromAgeForCNB</code> attribute. 
	 * @param value the fromAgeForCNB - From Age For CNB
	 */
	public void setFromAgeForCNB(final int value)
	{
		setFromAgeForCNB( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.fromAgeForExtraBed</code> attribute.
	 * @return the fromAgeForExtraBed - From Age For Extra Bed
	 */
	public Integer getFromAgeForExtraBed(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, FROMAGEFOREXTRABED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.fromAgeForExtraBed</code> attribute.
	 * @return the fromAgeForExtraBed - From Age For Extra Bed
	 */
	public Integer getFromAgeForExtraBed()
	{
		return getFromAgeForExtraBed( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.fromAgeForExtraBed</code> attribute. 
	 * @return the fromAgeForExtraBed - From Age For Extra Bed
	 */
	public int getFromAgeForExtraBedAsPrimitive(final SessionContext ctx)
	{
		Integer value = getFromAgeForExtraBed( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.fromAgeForExtraBed</code> attribute. 
	 * @return the fromAgeForExtraBed - From Age For Extra Bed
	 */
	public int getFromAgeForExtraBedAsPrimitive()
	{
		return getFromAgeForExtraBedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.fromAgeForExtraBed</code> attribute. 
	 * @param value the fromAgeForExtraBed - From Age For Extra Bed
	 */
	public void setFromAgeForExtraBed(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, FROMAGEFOREXTRABED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.fromAgeForExtraBed</code> attribute. 
	 * @param value the fromAgeForExtraBed - From Age For Extra Bed
	 */
	public void setFromAgeForExtraBed(final Integer value)
	{
		setFromAgeForExtraBed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.fromAgeForExtraBed</code> attribute. 
	 * @param value the fromAgeForExtraBed - From Age For Extra Bed
	 */
	public void setFromAgeForExtraBed(final SessionContext ctx, final int value)
	{
		setFromAgeForExtraBed( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.fromAgeForExtraBed</code> attribute. 
	 * @param value the fromAgeForExtraBed - From Age For Extra Bed
	 */
	public void setFromAgeForExtraBed(final int value)
	{
		setFromAgeForExtraBed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.maxCNB</code> attribute.
	 * @return the maxCNB - Max CNB
	 */
	public Integer getMaxCNB(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAXCNB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.maxCNB</code> attribute.
	 * @return the maxCNB - Max CNB
	 */
	public Integer getMaxCNB()
	{
		return getMaxCNB( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.maxCNB</code> attribute. 
	 * @return the maxCNB - Max CNB
	 */
	public int getMaxCNBAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaxCNB( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.maxCNB</code> attribute. 
	 * @return the maxCNB - Max CNB
	 */
	public int getMaxCNBAsPrimitive()
	{
		return getMaxCNBAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.maxCNB</code> attribute. 
	 * @param value the maxCNB - Max CNB
	 */
	public void setMaxCNB(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAXCNB,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.maxCNB</code> attribute. 
	 * @param value the maxCNB - Max CNB
	 */
	public void setMaxCNB(final Integer value)
	{
		setMaxCNB( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.maxCNB</code> attribute. 
	 * @param value the maxCNB - Max CNB
	 */
	public void setMaxCNB(final SessionContext ctx, final int value)
	{
		setMaxCNB( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.maxCNB</code> attribute. 
	 * @param value the maxCNB - Max CNB
	 */
	public void setMaxCNB(final int value)
	{
		setMaxCNB( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.maxPaxWithExtraBed</code> attribute.
	 * @return the maxPaxWithExtraBed - Max Pax With Exta Bed
	 */
	public Integer getMaxPaxWithExtraBed(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAXPAXWITHEXTRABED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.maxPaxWithExtraBed</code> attribute.
	 * @return the maxPaxWithExtraBed - Max Pax With Exta Bed
	 */
	public Integer getMaxPaxWithExtraBed()
	{
		return getMaxPaxWithExtraBed( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.maxPaxWithExtraBed</code> attribute. 
	 * @return the maxPaxWithExtraBed - Max Pax With Exta Bed
	 */
	public int getMaxPaxWithExtraBedAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaxPaxWithExtraBed( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.maxPaxWithExtraBed</code> attribute. 
	 * @return the maxPaxWithExtraBed - Max Pax With Exta Bed
	 */
	public int getMaxPaxWithExtraBedAsPrimitive()
	{
		return getMaxPaxWithExtraBedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.maxPaxWithExtraBed</code> attribute. 
	 * @param value the maxPaxWithExtraBed - Max Pax With Exta Bed
	 */
	public void setMaxPaxWithExtraBed(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAXPAXWITHEXTRABED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.maxPaxWithExtraBed</code> attribute. 
	 * @param value the maxPaxWithExtraBed - Max Pax With Exta Bed
	 */
	public void setMaxPaxWithExtraBed(final Integer value)
	{
		setMaxPaxWithExtraBed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.maxPaxWithExtraBed</code> attribute. 
	 * @param value the maxPaxWithExtraBed - Max Pax With Exta Bed
	 */
	public void setMaxPaxWithExtraBed(final SessionContext ctx, final int value)
	{
		setMaxPaxWithExtraBed( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.maxPaxWithExtraBed</code> attribute. 
	 * @param value the maxPaxWithExtraBed - Max Pax With Exta Bed
	 */
	public void setMaxPaxWithExtraBed(final int value)
	{
		setMaxPaxWithExtraBed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.roomType</code> attribute.
	 * @return the roomType - Room Type
	 */
	public EnumerationValue getRoomType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ROOMTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.roomType</code> attribute.
	 * @return the roomType - Room Type
	 */
	public EnumerationValue getRoomType()
	{
		return getRoomType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.roomType</code> attribute. 
	 * @param value the roomType - Room Type
	 */
	public void setRoomType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ROOMTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.roomType</code> attribute. 
	 * @param value the roomType - Room Type
	 */
	public void setRoomType(final EnumerationValue value)
	{
		setRoomType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.toAgeForCIOR</code> attribute.
	 * @return the toAgeForCIOR - to Age For CIOR
	 */
	public Integer getToAgeForCIOR(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TOAGEFORCIOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.toAgeForCIOR</code> attribute.
	 * @return the toAgeForCIOR - to Age For CIOR
	 */
	public Integer getToAgeForCIOR()
	{
		return getToAgeForCIOR( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.toAgeForCIOR</code> attribute. 
	 * @return the toAgeForCIOR - to Age For CIOR
	 */
	public int getToAgeForCIORAsPrimitive(final SessionContext ctx)
	{
		Integer value = getToAgeForCIOR( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.toAgeForCIOR</code> attribute. 
	 * @return the toAgeForCIOR - to Age For CIOR
	 */
	public int getToAgeForCIORAsPrimitive()
	{
		return getToAgeForCIORAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.toAgeForCIOR</code> attribute. 
	 * @param value the toAgeForCIOR - to Age For CIOR
	 */
	public void setToAgeForCIOR(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TOAGEFORCIOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.toAgeForCIOR</code> attribute. 
	 * @param value the toAgeForCIOR - to Age For CIOR
	 */
	public void setToAgeForCIOR(final Integer value)
	{
		setToAgeForCIOR( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.toAgeForCIOR</code> attribute. 
	 * @param value the toAgeForCIOR - to Age For CIOR
	 */
	public void setToAgeForCIOR(final SessionContext ctx, final int value)
	{
		setToAgeForCIOR( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.toAgeForCIOR</code> attribute. 
	 * @param value the toAgeForCIOR - to Age For CIOR
	 */
	public void setToAgeForCIOR(final int value)
	{
		setToAgeForCIOR( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.toAgeForCNB</code> attribute.
	 * @return the toAgeForCNB - To Age For CNB
	 */
	public Integer getToAgeForCNB(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TOAGEFORCNB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.toAgeForCNB</code> attribute.
	 * @return the toAgeForCNB - To Age For CNB
	 */
	public Integer getToAgeForCNB()
	{
		return getToAgeForCNB( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.toAgeForCNB</code> attribute. 
	 * @return the toAgeForCNB - To Age For CNB
	 */
	public int getToAgeForCNBAsPrimitive(final SessionContext ctx)
	{
		Integer value = getToAgeForCNB( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.toAgeForCNB</code> attribute. 
	 * @return the toAgeForCNB - To Age For CNB
	 */
	public int getToAgeForCNBAsPrimitive()
	{
		return getToAgeForCNBAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.toAgeForCNB</code> attribute. 
	 * @param value the toAgeForCNB - To Age For CNB
	 */
	public void setToAgeForCNB(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TOAGEFORCNB,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.toAgeForCNB</code> attribute. 
	 * @param value the toAgeForCNB - To Age For CNB
	 */
	public void setToAgeForCNB(final Integer value)
	{
		setToAgeForCNB( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.toAgeForCNB</code> attribute. 
	 * @param value the toAgeForCNB - To Age For CNB
	 */
	public void setToAgeForCNB(final SessionContext ctx, final int value)
	{
		setToAgeForCNB( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.toAgeForCNB</code> attribute. 
	 * @param value the toAgeForCNB - To Age For CNB
	 */
	public void setToAgeForCNB(final int value)
	{
		setToAgeForCNB( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.toAgeForExtraBed</code> attribute.
	 * @return the toAgeForExtraBed - to Age For Extra Bed
	 */
	public Integer getToAgeForExtraBed(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TOAGEFOREXTRABED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.toAgeForExtraBed</code> attribute.
	 * @return the toAgeForExtraBed - to Age For Extra Bed
	 */
	public Integer getToAgeForExtraBed()
	{
		return getToAgeForExtraBed( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.toAgeForExtraBed</code> attribute. 
	 * @return the toAgeForExtraBed - to Age For Extra Bed
	 */
	public int getToAgeForExtraBedAsPrimitive(final SessionContext ctx)
	{
		Integer value = getToAgeForExtraBed( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomPaxOccupancy.toAgeForExtraBed</code> attribute. 
	 * @return the toAgeForExtraBed - to Age For Extra Bed
	 */
	public int getToAgeForExtraBedAsPrimitive()
	{
		return getToAgeForExtraBedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.toAgeForExtraBed</code> attribute. 
	 * @param value the toAgeForExtraBed - to Age For Extra Bed
	 */
	public void setToAgeForExtraBed(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TOAGEFOREXTRABED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.toAgeForExtraBed</code> attribute. 
	 * @param value the toAgeForExtraBed - to Age For Extra Bed
	 */
	public void setToAgeForExtraBed(final Integer value)
	{
		setToAgeForExtraBed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.toAgeForExtraBed</code> attribute. 
	 * @param value the toAgeForExtraBed - to Age For Extra Bed
	 */
	public void setToAgeForExtraBed(final SessionContext ctx, final int value)
	{
		setToAgeForExtraBed( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomPaxOccupancy.toAgeForExtraBed</code> attribute. 
	 * @param value the toAgeForExtraBed - to Age For Extra Bed
	 */
	public void setToAgeForExtraBed(final int value)
	{
		setToAgeForExtraBed( getSession().getSessionContext(), value );
	}
	
}
