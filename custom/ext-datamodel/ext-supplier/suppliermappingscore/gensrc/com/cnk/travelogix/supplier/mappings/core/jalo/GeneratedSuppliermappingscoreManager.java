/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.mappings.core.jalo;

import com.cnk.travelogix.supplier.mappings.city.jalo.SupplierCity;
import com.cnk.travelogix.supplier.mappings.city.jalo.SupplierCityMapping;
import com.cnk.travelogix.supplier.mappings.compositesupplier.jalo.CompositeSupplier;
import com.cnk.travelogix.supplier.mappings.core.constants.SuppliermappingscoreConstants;
import com.cnk.travelogix.supplier.mappings.country.jalo.SupplierCountry;
import com.cnk.travelogix.supplier.mappings.country.jalo.SupplierCountryMapping;
import com.cnk.travelogix.supplier.mappings.enablers.jalo.SupplierEnablersMapping;
import com.cnk.travelogix.supplier.mappings.jalo.AbstractSupplierMapping;
import com.cnk.travelogix.supplier.mappings.market.jalo.MarketMapping;
import com.cnk.travelogix.supplier.mappings.product.jalo.SupplierAccommodationMapping;
import com.cnk.travelogix.supplier.mappings.product.jalo.SupplierProduct;
import com.cnk.travelogix.supplier.mappings.room.jalo.SupplierRoomCategory;
import com.cnk.travelogix.supplier.mappings.room.jalo.SupplierRoomMapping;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>SuppliermappingscoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSuppliermappingscoreManager extends Extension
{
	/** Relation ordering override parameter constants for SupplierMapping2CategoryRel from ((suppliermappingscore))*/
	protected static String SUPPLIERMAPPING2CATEGORYREL_SRC_ORDERED = "relation.SupplierMapping2CategoryRel.source.ordered";
	protected static String SUPPLIERMAPPING2CATEGORYREL_TGT_ORDERED = "relation.SupplierMapping2CategoryRel.target.ordered";
	/** Relation disable markmodifed parameter constants for SupplierMapping2CategoryRel from ((suppliermappingscore))*/
	protected static String SUPPLIERMAPPING2CATEGORYREL_MARKMODIFIED = "relation.SupplierMapping2CategoryRel.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public CompositeSupplier createCompositeSupplier(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliermappingscoreConstants.TC.COMPOSITESUPPLIER );
			return (CompositeSupplier)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CompositeSupplier : "+e.getMessage(), 0 );
		}
	}
	
	public CompositeSupplier createCompositeSupplier(final Map attributeValues)
	{
		return createCompositeSupplier( getSession().getSessionContext(), attributeValues );
	}
	
	public MarketMapping createMarketMapping(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliermappingscoreConstants.TC.MARKETMAPPING );
			return (MarketMapping)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating MarketMapping : "+e.getMessage(), 0 );
		}
	}
	
	public MarketMapping createMarketMapping(final Map attributeValues)
	{
		return createMarketMapping( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierAccommodationMapping createSupplierAccommodationMapping(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliermappingscoreConstants.TC.SUPPLIERACCOMMODATIONMAPPING );
			return (SupplierAccommodationMapping)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SupplierAccommodationMapping : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierAccommodationMapping createSupplierAccommodationMapping(final Map attributeValues)
	{
		return createSupplierAccommodationMapping( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierCity createSupplierCity(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliermappingscoreConstants.TC.SUPPLIERCITY );
			return (SupplierCity)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SupplierCity : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierCity createSupplierCity(final Map attributeValues)
	{
		return createSupplierCity( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierCityMapping createSupplierCityMapping(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliermappingscoreConstants.TC.SUPPLIERCITYMAPPING );
			return (SupplierCityMapping)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SupplierCityMapping : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierCityMapping createSupplierCityMapping(final Map attributeValues)
	{
		return createSupplierCityMapping( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierCountry createSupplierCountry(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliermappingscoreConstants.TC.SUPPLIERCOUNTRY );
			return (SupplierCountry)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SupplierCountry : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierCountry createSupplierCountry(final Map attributeValues)
	{
		return createSupplierCountry( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierCountryMapping createSupplierCountryMapping(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliermappingscoreConstants.TC.SUPPLIERCOUNTRYMAPPING );
			return (SupplierCountryMapping)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SupplierCountryMapping : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierCountryMapping createSupplierCountryMapping(final Map attributeValues)
	{
		return createSupplierCountryMapping( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierEnablersMapping createSupplierEnablersMapping(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliermappingscoreConstants.TC.SUPPLIERENABLERSMAPPING );
			return (SupplierEnablersMapping)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SupplierEnablersMapping : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierEnablersMapping createSupplierEnablersMapping(final Map attributeValues)
	{
		return createSupplierEnablersMapping( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierProduct createSupplierProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliermappingscoreConstants.TC.SUPPLIERPRODUCT );
			return (SupplierProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SupplierProduct : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierProduct createSupplierProduct(final Map attributeValues)
	{
		return createSupplierProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierRoomCategory createSupplierRoomCategory(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliermappingscoreConstants.TC.SUPPLIERROOMCATEGORY );
			return (SupplierRoomCategory)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SupplierRoomCategory : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierRoomCategory createSupplierRoomCategory(final Map attributeValues)
	{
		return createSupplierRoomCategory( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierRoomMapping createSupplierRoomMapping(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliermappingscoreConstants.TC.SUPPLIERROOMMAPPING );
			return (SupplierRoomMapping)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SupplierRoomMapping : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierRoomMapping createSupplierRoomMapping(final Map attributeValues)
	{
		return createSupplierRoomMapping( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return SuppliermappingscoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.mappingsForCategory</code> attribute.
	 * @return the mappingsForCategory
	 */
	public Collection<AbstractSupplierMapping> getMappingsForCategory(final SessionContext ctx, final Category item)
	{
		final List<AbstractSupplierMapping> items = item.getLinkedItems( 
			ctx,
			false,
			SuppliermappingscoreConstants.Relations.SUPPLIERMAPPING2CATEGORYREL,
			"AbstractSupplierMapping",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.mappingsForCategory</code> attribute.
	 * @return the mappingsForCategory
	 */
	public Collection<AbstractSupplierMapping> getMappingsForCategory(final Category item)
	{
		return getMappingsForCategory( getSession().getSessionContext(), item );
	}
	
	public long getMappingsForCategoryCount(final SessionContext ctx, final Category item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			SuppliermappingscoreConstants.Relations.SUPPLIERMAPPING2CATEGORYREL,
			"AbstractSupplierMapping",
			null
		);
	}
	
	public long getMappingsForCategoryCount(final Category item)
	{
		return getMappingsForCategoryCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.mappingsForCategory</code> attribute. 
	 * @param value the mappingsForCategory
	 */
	public void setMappingsForCategory(final SessionContext ctx, final Category item, final Collection<AbstractSupplierMapping> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			SuppliermappingscoreConstants.Relations.SUPPLIERMAPPING2CATEGORYREL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIERMAPPING2CATEGORYREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.mappingsForCategory</code> attribute. 
	 * @param value the mappingsForCategory
	 */
	public void setMappingsForCategory(final Category item, final Collection<AbstractSupplierMapping> value)
	{
		setMappingsForCategory( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to mappingsForCategory. 
	 * @param value the item to add to mappingsForCategory
	 */
	public void addToMappingsForCategory(final SessionContext ctx, final Category item, final AbstractSupplierMapping value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			SuppliermappingscoreConstants.Relations.SUPPLIERMAPPING2CATEGORYREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIERMAPPING2CATEGORYREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to mappingsForCategory. 
	 * @param value the item to add to mappingsForCategory
	 */
	public void addToMappingsForCategory(final Category item, final AbstractSupplierMapping value)
	{
		addToMappingsForCategory( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from mappingsForCategory. 
	 * @param value the item to remove from mappingsForCategory
	 */
	public void removeFromMappingsForCategory(final SessionContext ctx, final Category item, final AbstractSupplierMapping value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			SuppliermappingscoreConstants.Relations.SUPPLIERMAPPING2CATEGORYREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIERMAPPING2CATEGORYREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from mappingsForCategory. 
	 * @param value the item to remove from mappingsForCategory
	 */
	public void removeFromMappingsForCategory(final Category item, final AbstractSupplierMapping value)
	{
		removeFromMappingsForCategory( getSession().getSessionContext(), item, value );
	}
	
}
