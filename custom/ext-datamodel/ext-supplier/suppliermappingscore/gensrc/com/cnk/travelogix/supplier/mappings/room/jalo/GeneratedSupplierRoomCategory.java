/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.mappings.room.jalo;

import com.cnk.travelogix.supplier.mappings.core.constants.SuppliermappingscoreConstants;
import com.cnk.travelogix.supplier.mappings.dump.jalo.AbstractSupplierDumpItem;
import com.cnk.travelogix.supplier.mappings.room.jalo.SupplierRoomMapping;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.mappings.room.jalo.SupplierRoomCategory SupplierRoomCategory}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierRoomCategory extends AbstractSupplierDumpItem
{
	/** Qualifier of the <code>SupplierRoomCategory.hotelId</code> attribute **/
	public static final String HOTELID = "hotelId";
	/** Qualifier of the <code>SupplierRoomCategory.roomCategory</code> attribute **/
	public static final String ROOMCATEGORY = "roomCategory";
	/** Qualifier of the <code>SupplierRoomCategory.roomType</code> attribute **/
	public static final String ROOMTYPE = "roomType";
	/** Qualifier of the <code>SupplierRoomCategory.roomMappings</code> attribute **/
	public static final String ROOMMAPPINGS = "roomMappings";
	/** Relation ordering override parameter constants for SupplierRoomMappingRel from ((suppliermappingscore))*/
	protected static String SUPPLIERROOMMAPPINGREL_SRC_ORDERED = "relation.SupplierRoomMappingRel.source.ordered";
	protected static String SUPPLIERROOMMAPPINGREL_TGT_ORDERED = "relation.SupplierRoomMappingRel.target.ordered";
	/** Relation disable markmodifed parameter constants for SupplierRoomMappingRel from ((suppliermappingscore))*/
	protected static String SUPPLIERROOMMAPPINGREL_MARKMODIFIED = "relation.SupplierRoomMappingRel.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractSupplierDumpItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(HOTELID, AttributeMode.INITIAL);
		tmp.put(ROOMCATEGORY, AttributeMode.INITIAL);
		tmp.put(ROOMTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRoomCategory.hotelId</code> attribute.
	 * @return the hotelId
	 */
	public String getHotelId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HOTELID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRoomCategory.hotelId</code> attribute.
	 * @return the hotelId
	 */
	public String getHotelId()
	{
		return getHotelId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRoomCategory.hotelId</code> attribute. 
	 * @param value the hotelId
	 */
	public void setHotelId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HOTELID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRoomCategory.hotelId</code> attribute. 
	 * @param value the hotelId
	 */
	public void setHotelId(final String value)
	{
		setHotelId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRoomCategory.roomCategory</code> attribute.
	 * @return the roomCategory
	 */
	public String getRoomCategory(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ROOMCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRoomCategory.roomCategory</code> attribute.
	 * @return the roomCategory
	 */
	public String getRoomCategory()
	{
		return getRoomCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRoomCategory.roomCategory</code> attribute. 
	 * @param value the roomCategory
	 */
	public void setRoomCategory(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ROOMCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRoomCategory.roomCategory</code> attribute. 
	 * @param value the roomCategory
	 */
	public void setRoomCategory(final String value)
	{
		setRoomCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRoomCategory.roomMappings</code> attribute.
	 * @return the roomMappings
	 */
	public Collection<SupplierRoomMapping> getRoomMappings(final SessionContext ctx)
	{
		final List<SupplierRoomMapping> items = getLinkedItems( 
			ctx,
			false,
			SuppliermappingscoreConstants.Relations.SUPPLIERROOMMAPPINGREL,
			"SupplierRoomMapping",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRoomCategory.roomMappings</code> attribute.
	 * @return the roomMappings
	 */
	public Collection<SupplierRoomMapping> getRoomMappings()
	{
		return getRoomMappings( getSession().getSessionContext() );
	}
	
	public long getRoomMappingsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			SuppliermappingscoreConstants.Relations.SUPPLIERROOMMAPPINGREL,
			"SupplierRoomMapping",
			null
		);
	}
	
	public long getRoomMappingsCount()
	{
		return getRoomMappingsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRoomCategory.roomMappings</code> attribute. 
	 * @param value the roomMappings
	 */
	public void setRoomMappings(final SessionContext ctx, final Collection<SupplierRoomMapping> value)
	{
		setLinkedItems( 
			ctx,
			false,
			SuppliermappingscoreConstants.Relations.SUPPLIERROOMMAPPINGREL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIERROOMMAPPINGREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRoomCategory.roomMappings</code> attribute. 
	 * @param value the roomMappings
	 */
	public void setRoomMappings(final Collection<SupplierRoomMapping> value)
	{
		setRoomMappings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to roomMappings. 
	 * @param value the item to add to roomMappings
	 */
	public void addToRoomMappings(final SessionContext ctx, final SupplierRoomMapping value)
	{
		addLinkedItems( 
			ctx,
			false,
			SuppliermappingscoreConstants.Relations.SUPPLIERROOMMAPPINGREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIERROOMMAPPINGREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to roomMappings. 
	 * @param value the item to add to roomMappings
	 */
	public void addToRoomMappings(final SupplierRoomMapping value)
	{
		addToRoomMappings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from roomMappings. 
	 * @param value the item to remove from roomMappings
	 */
	public void removeFromRoomMappings(final SessionContext ctx, final SupplierRoomMapping value)
	{
		removeLinkedItems( 
			ctx,
			false,
			SuppliermappingscoreConstants.Relations.SUPPLIERROOMMAPPINGREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIERROOMMAPPINGREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from roomMappings. 
	 * @param value the item to remove from roomMappings
	 */
	public void removeFromRoomMappings(final SupplierRoomMapping value)
	{
		removeFromRoomMappings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRoomCategory.roomType</code> attribute.
	 * @return the roomType
	 */
	public String getRoomType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ROOMTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRoomCategory.roomType</code> attribute.
	 * @return the roomType
	 */
	public String getRoomType()
	{
		return getRoomType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRoomCategory.roomType</code> attribute. 
	 * @param value the roomType
	 */
	public void setRoomType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ROOMTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRoomCategory.roomType</code> attribute. 
	 * @param value the roomType
	 */
	public void setRoomType(final String value)
	{
		setRoomType( getSession().getSessionContext(), value );
	}
	
}
