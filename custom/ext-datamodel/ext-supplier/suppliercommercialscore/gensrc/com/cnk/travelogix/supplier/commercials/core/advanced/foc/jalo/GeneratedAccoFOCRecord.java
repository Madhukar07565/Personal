/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advanced.foc.jalo;

import com.cnk.travelogix.supplier.commercials.core.advanced.foc.jalo.FOCRecord;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.CommercialRateTypeDetail;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advanced.foc.jalo.AccoFOCRecord AccoFOCRecord}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAccoFOCRecord extends FOCRecord
{
	/** Qualifier of the <code>AccoFOCRecord.roomCategory</code> attribute **/
	public static final String ROOMCATEGORY = "roomCategory";
	/** Qualifier of the <code>AccoFOCRecord.roomType</code> attribute **/
	public static final String ROOMTYPE = "roomType";
	/** Qualifier of the <code>AccoFOCRecord.noOfRoom</code> attribute **/
	public static final String NOOFROOM = "noOfRoom";
	/** Qualifier of the <code>AccoFOCRecord.rateType</code> attribute **/
	public static final String RATETYPE = "rateType";
	/** Qualifier of the <code>AccoFOCRecord.focRoom</code> attribute **/
	public static final String FOCROOM = "focRoom";
	/** Qualifier of the <code>AccoFOCRecord.focRoomCategory</code> attribute **/
	public static final String FOCROOMCATEGORY = "focRoomCategory";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(FOCRecord.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ROOMCATEGORY, AttributeMode.INITIAL);
		tmp.put(ROOMTYPE, AttributeMode.INITIAL);
		tmp.put(NOOFROOM, AttributeMode.INITIAL);
		tmp.put(RATETYPE, AttributeMode.INITIAL);
		tmp.put(FOCROOM, AttributeMode.INITIAL);
		tmp.put(FOCROOMCATEGORY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoFOCRecord.focRoom</code> attribute.
	 * @return the focRoom
	 */
	public Boolean isFocRoom(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, FOCROOM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoFOCRecord.focRoom</code> attribute.
	 * @return the focRoom
	 */
	public Boolean isFocRoom()
	{
		return isFocRoom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoFOCRecord.focRoom</code> attribute. 
	 * @return the focRoom
	 */
	public boolean isFocRoomAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isFocRoom( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoFOCRecord.focRoom</code> attribute. 
	 * @return the focRoom
	 */
	public boolean isFocRoomAsPrimitive()
	{
		return isFocRoomAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoFOCRecord.focRoom</code> attribute. 
	 * @param value the focRoom
	 */
	public void setFocRoom(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, FOCROOM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoFOCRecord.focRoom</code> attribute. 
	 * @param value the focRoom
	 */
	public void setFocRoom(final Boolean value)
	{
		setFocRoom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoFOCRecord.focRoom</code> attribute. 
	 * @param value the focRoom
	 */
	public void setFocRoom(final SessionContext ctx, final boolean value)
	{
		setFocRoom( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoFOCRecord.focRoom</code> attribute. 
	 * @param value the focRoom
	 */
	public void setFocRoom(final boolean value)
	{
		setFocRoom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoFOCRecord.focRoomCategory</code> attribute.
	 * @return the focRoomCategory
	 */
	public EnumerationValue getFocRoomCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, FOCROOMCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoFOCRecord.focRoomCategory</code> attribute.
	 * @return the focRoomCategory
	 */
	public EnumerationValue getFocRoomCategory()
	{
		return getFocRoomCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoFOCRecord.focRoomCategory</code> attribute. 
	 * @param value the focRoomCategory
	 */
	public void setFocRoomCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, FOCROOMCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoFOCRecord.focRoomCategory</code> attribute. 
	 * @param value the focRoomCategory
	 */
	public void setFocRoomCategory(final EnumerationValue value)
	{
		setFocRoomCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoFOCRecord.noOfRoom</code> attribute.
	 * @return the noOfRoom
	 */
	public Integer getNoOfRoom(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFROOM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoFOCRecord.noOfRoom</code> attribute.
	 * @return the noOfRoom
	 */
	public Integer getNoOfRoom()
	{
		return getNoOfRoom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoFOCRecord.noOfRoom</code> attribute. 
	 * @return the noOfRoom
	 */
	public int getNoOfRoomAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfRoom( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoFOCRecord.noOfRoom</code> attribute. 
	 * @return the noOfRoom
	 */
	public int getNoOfRoomAsPrimitive()
	{
		return getNoOfRoomAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoFOCRecord.noOfRoom</code> attribute. 
	 * @param value the noOfRoom
	 */
	public void setNoOfRoom(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFROOM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoFOCRecord.noOfRoom</code> attribute. 
	 * @param value the noOfRoom
	 */
	public void setNoOfRoom(final Integer value)
	{
		setNoOfRoom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoFOCRecord.noOfRoom</code> attribute. 
	 * @param value the noOfRoom
	 */
	public void setNoOfRoom(final SessionContext ctx, final int value)
	{
		setNoOfRoom( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoFOCRecord.noOfRoom</code> attribute. 
	 * @param value the noOfRoom
	 */
	public void setNoOfRoom(final int value)
	{
		setNoOfRoom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoFOCRecord.rateType</code> attribute.
	 * @return the rateType
	 */
	public CommercialRateTypeDetail getRateType(final SessionContext ctx)
	{
		return (CommercialRateTypeDetail)getProperty( ctx, RATETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoFOCRecord.rateType</code> attribute.
	 * @return the rateType
	 */
	public CommercialRateTypeDetail getRateType()
	{
		return getRateType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoFOCRecord.rateType</code> attribute. 
	 * @param value the rateType
	 */
	public void setRateType(final SessionContext ctx, final CommercialRateTypeDetail value)
	{
		setProperty(ctx, RATETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoFOCRecord.rateType</code> attribute. 
	 * @param value the rateType
	 */
	public void setRateType(final CommercialRateTypeDetail value)
	{
		setRateType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoFOCRecord.roomCategory</code> attribute.
	 * @return the roomCategory
	 */
	public EnumerationValue getRoomCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ROOMCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoFOCRecord.roomCategory</code> attribute.
	 * @return the roomCategory
	 */
	public EnumerationValue getRoomCategory()
	{
		return getRoomCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoFOCRecord.roomCategory</code> attribute. 
	 * @param value the roomCategory
	 */
	public void setRoomCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ROOMCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoFOCRecord.roomCategory</code> attribute. 
	 * @param value the roomCategory
	 */
	public void setRoomCategory(final EnumerationValue value)
	{
		setRoomCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoFOCRecord.roomType</code> attribute.
	 * @return the roomType
	 */
	public EnumerationValue getRoomType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ROOMTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoFOCRecord.roomType</code> attribute.
	 * @return the roomType
	 */
	public EnumerationValue getRoomType()
	{
		return getRoomType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoFOCRecord.roomType</code> attribute. 
	 * @param value the roomType
	 */
	public void setRoomType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ROOMTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoFOCRecord.roomType</code> attribute. 
	 * @param value the roomType
	 */
	public void setRoomType(final EnumerationValue value)
	{
		setRoomType( getSession().getSessionContext(), value );
	}
	
}
