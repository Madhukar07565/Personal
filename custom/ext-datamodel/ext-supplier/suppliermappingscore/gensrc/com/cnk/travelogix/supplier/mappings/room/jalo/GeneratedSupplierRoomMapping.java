/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.mappings.room.jalo;

import com.cnk.travelogix.product.common.core.jalo.Accommodation;
import com.cnk.travelogix.supplier.mappings.core.constants.SuppliermappingscoreConstants;
import com.cnk.travelogix.supplier.mappings.jalo.AbstractSupplierMapping;
import com.cnk.travelogix.supplier.mappings.room.jalo.SupplierRoomCategory;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.mappings.room.jalo.SupplierRoomMapping SupplierRoomMapping}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierRoomMapping extends AbstractSupplierMapping
{
	/** Qualifier of the <code>SupplierRoomMapping.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>SupplierRoomMapping.roomCategory</code> attribute **/
	public static final String ROOMCATEGORY = "roomCategory";
	/** Qualifier of the <code>SupplierRoomMapping.roomType</code> attribute **/
	public static final String ROOMTYPE = "roomType";
	/** Qualifier of the <code>SupplierRoomMapping.supplierRoomCategory</code> attribute **/
	public static final String SUPPLIERROOMCATEGORY = "supplierRoomCategory";
	/** Relation ordering override parameter constants for SupplierRoomMappingRel from ((suppliermappingscore))*/
	protected static String SUPPLIERROOMMAPPINGREL_SRC_ORDERED = "relation.SupplierRoomMappingRel.source.ordered";
	protected static String SUPPLIERROOMMAPPINGREL_TGT_ORDERED = "relation.SupplierRoomMappingRel.target.ordered";
	/** Relation disable markmodifed parameter constants for SupplierRoomMappingRel from ((suppliermappingscore))*/
	protected static String SUPPLIERROOMMAPPINGREL_MARKMODIFIED = "relation.SupplierRoomMappingRel.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractSupplierMapping.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
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
	 * <i>Generated method</i> - Getter of the <code>SupplierRoomMapping.product</code> attribute.
	 * @return the product
	 */
	public Accommodation getProduct(final SessionContext ctx)
	{
		return (Accommodation)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRoomMapping.product</code> attribute.
	 * @return the product
	 */
	public Accommodation getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRoomMapping.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final Accommodation value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRoomMapping.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final Accommodation value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRoomMapping.roomCategory</code> attribute.
	 * @return the roomCategory
	 */
	public EnumerationValue getRoomCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ROOMCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRoomMapping.roomCategory</code> attribute.
	 * @return the roomCategory
	 */
	public EnumerationValue getRoomCategory()
	{
		return getRoomCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRoomMapping.roomCategory</code> attribute. 
	 * @param value the roomCategory
	 */
	public void setRoomCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ROOMCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRoomMapping.roomCategory</code> attribute. 
	 * @param value the roomCategory
	 */
	public void setRoomCategory(final EnumerationValue value)
	{
		setRoomCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRoomMapping.roomType</code> attribute.
	 * @return the roomType
	 */
	public EnumerationValue getRoomType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ROOMTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRoomMapping.roomType</code> attribute.
	 * @return the roomType
	 */
	public EnumerationValue getRoomType()
	{
		return getRoomType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRoomMapping.roomType</code> attribute. 
	 * @param value the roomType
	 */
	public void setRoomType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ROOMTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRoomMapping.roomType</code> attribute. 
	 * @param value the roomType
	 */
	public void setRoomType(final EnumerationValue value)
	{
		setRoomType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRoomMapping.supplierRoomCategory</code> attribute.
	 * @return the supplierRoomCategory
	 */
	public Collection<SupplierRoomCategory> getSupplierRoomCategory(final SessionContext ctx)
	{
		final List<SupplierRoomCategory> items = getLinkedItems( 
			ctx,
			true,
			SuppliermappingscoreConstants.Relations.SUPPLIERROOMMAPPINGREL,
			"SupplierRoomCategory",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRoomMapping.supplierRoomCategory</code> attribute.
	 * @return the supplierRoomCategory
	 */
	public Collection<SupplierRoomCategory> getSupplierRoomCategory()
	{
		return getSupplierRoomCategory( getSession().getSessionContext() );
	}
	
	public long getSupplierRoomCategoryCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SuppliermappingscoreConstants.Relations.SUPPLIERROOMMAPPINGREL,
			"SupplierRoomCategory",
			null
		);
	}
	
	public long getSupplierRoomCategoryCount()
	{
		return getSupplierRoomCategoryCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRoomMapping.supplierRoomCategory</code> attribute. 
	 * @param value the supplierRoomCategory
	 */
	public void setSupplierRoomCategory(final SessionContext ctx, final Collection<SupplierRoomCategory> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SuppliermappingscoreConstants.Relations.SUPPLIERROOMMAPPINGREL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIERROOMMAPPINGREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRoomMapping.supplierRoomCategory</code> attribute. 
	 * @param value the supplierRoomCategory
	 */
	public void setSupplierRoomCategory(final Collection<SupplierRoomCategory> value)
	{
		setSupplierRoomCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierRoomCategory. 
	 * @param value the item to add to supplierRoomCategory
	 */
	public void addToSupplierRoomCategory(final SessionContext ctx, final SupplierRoomCategory value)
	{
		addLinkedItems( 
			ctx,
			true,
			SuppliermappingscoreConstants.Relations.SUPPLIERROOMMAPPINGREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIERROOMMAPPINGREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierRoomCategory. 
	 * @param value the item to add to supplierRoomCategory
	 */
	public void addToSupplierRoomCategory(final SupplierRoomCategory value)
	{
		addToSupplierRoomCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierRoomCategory. 
	 * @param value the item to remove from supplierRoomCategory
	 */
	public void removeFromSupplierRoomCategory(final SessionContext ctx, final SupplierRoomCategory value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SuppliermappingscoreConstants.Relations.SUPPLIERROOMMAPPINGREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIERROOMMAPPINGREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierRoomCategory. 
	 * @param value the item to remove from supplierRoomCategory
	 */
	public void removeFromSupplierRoomCategory(final SupplierRoomCategory value)
	{
		removeFromSupplierRoomCategory( getSession().getSessionContext(), value );
	}
	
}
