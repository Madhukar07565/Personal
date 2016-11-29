/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.supplierrate.jalo.common;

import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionsaccommodationConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.accommodation.CommonRateAdvDefinition;
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
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.SupplierRoomOffer SupplierRoomOffer}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierRoomOffer extends GenericItem
{
	/** Qualifier of the <code>SupplierRoomOffer.roomCategory</code> attribute **/
	public static final String ROOMCATEGORY = "roomCategory";
	/** Qualifier of the <code>SupplierRoomOffer.roomType</code> attribute **/
	public static final String ROOMTYPE = "roomType";
	/** Qualifier of the <code>SupplierRoomOffer.maxNoOfRooms</code> attribute **/
	public static final String MAXNOOFROOMS = "maxNoOfRooms";
	/** Qualifier of the <code>SupplierRoomOffer.commonRateAdvDef</code> attribute **/
	public static final String COMMONRATEADVDEF = "commonRateAdvDef";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n COMMONRATEADVDEF's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSupplierRoomOffer> COMMONRATEADVDEFHANDLER = new BidirectionalOneToManyHandler<GeneratedSupplierRoomOffer>(
	SupplierratedefinitionsaccommodationConstants.TC.SUPPLIERROOMOFFER,
	false,
	"commonRateAdvDef",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ROOMCATEGORY, AttributeMode.INITIAL);
		tmp.put(ROOMTYPE, AttributeMode.INITIAL);
		tmp.put(MAXNOOFROOMS, AttributeMode.INITIAL);
		tmp.put(COMMONRATEADVDEF, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRoomOffer.commonRateAdvDef</code> attribute.
	 * @return the commonRateAdvDef
	 */
	public CommonRateAdvDefinition getCommonRateAdvDef(final SessionContext ctx)
	{
		return (CommonRateAdvDefinition)getProperty( ctx, COMMONRATEADVDEF);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRoomOffer.commonRateAdvDef</code> attribute.
	 * @return the commonRateAdvDef
	 */
	public CommonRateAdvDefinition getCommonRateAdvDef()
	{
		return getCommonRateAdvDef( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRoomOffer.commonRateAdvDef</code> attribute. 
	 * @param value the commonRateAdvDef
	 */
	public void setCommonRateAdvDef(final SessionContext ctx, final CommonRateAdvDefinition value)
	{
		COMMONRATEADVDEFHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRoomOffer.commonRateAdvDef</code> attribute. 
	 * @param value the commonRateAdvDef
	 */
	public void setCommonRateAdvDef(final CommonRateAdvDefinition value)
	{
		setCommonRateAdvDef( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		COMMONRATEADVDEFHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRoomOffer.maxNoOfRooms</code> attribute.
	 * @return the maxNoOfRooms
	 */
	public Integer getMaxNoOfRooms(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAXNOOFROOMS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRoomOffer.maxNoOfRooms</code> attribute.
	 * @return the maxNoOfRooms
	 */
	public Integer getMaxNoOfRooms()
	{
		return getMaxNoOfRooms( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRoomOffer.maxNoOfRooms</code> attribute. 
	 * @return the maxNoOfRooms
	 */
	public int getMaxNoOfRoomsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaxNoOfRooms( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRoomOffer.maxNoOfRooms</code> attribute. 
	 * @return the maxNoOfRooms
	 */
	public int getMaxNoOfRoomsAsPrimitive()
	{
		return getMaxNoOfRoomsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRoomOffer.maxNoOfRooms</code> attribute. 
	 * @param value the maxNoOfRooms
	 */
	public void setMaxNoOfRooms(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAXNOOFROOMS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRoomOffer.maxNoOfRooms</code> attribute. 
	 * @param value the maxNoOfRooms
	 */
	public void setMaxNoOfRooms(final Integer value)
	{
		setMaxNoOfRooms( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRoomOffer.maxNoOfRooms</code> attribute. 
	 * @param value the maxNoOfRooms
	 */
	public void setMaxNoOfRooms(final SessionContext ctx, final int value)
	{
		setMaxNoOfRooms( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRoomOffer.maxNoOfRooms</code> attribute. 
	 * @param value the maxNoOfRooms
	 */
	public void setMaxNoOfRooms(final int value)
	{
		setMaxNoOfRooms( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRoomOffer.roomCategory</code> attribute.
	 * @return the roomCategory
	 */
	public EnumerationValue getRoomCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ROOMCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRoomOffer.roomCategory</code> attribute.
	 * @return the roomCategory
	 */
	public EnumerationValue getRoomCategory()
	{
		return getRoomCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRoomOffer.roomCategory</code> attribute. 
	 * @param value the roomCategory
	 */
	public void setRoomCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ROOMCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRoomOffer.roomCategory</code> attribute. 
	 * @param value the roomCategory
	 */
	public void setRoomCategory(final EnumerationValue value)
	{
		setRoomCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRoomOffer.roomType</code> attribute.
	 * @return the roomType
	 */
	public EnumerationValue getRoomType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ROOMTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRoomOffer.roomType</code> attribute.
	 * @return the roomType
	 */
	public EnumerationValue getRoomType()
	{
		return getRoomType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRoomOffer.roomType</code> attribute. 
	 * @param value the roomType
	 */
	public void setRoomType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ROOMTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRoomOffer.roomType</code> attribute. 
	 * @param value the roomType
	 */
	public void setRoomType(final EnumerationValue value)
	{
		setRoomType( getSession().getSessionContext(), value );
	}
	
}
