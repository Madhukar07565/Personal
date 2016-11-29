/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.mappings.dump.jalo;

import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import com.cnk.travelogix.supplier.mappings.core.constants.SuppliermappingscoreConstants;
import com.cnk.travelogix.supplier.mappings.jalo.AbstractSupplierMapping;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.mappings.dump.jalo.AbstractSupplierDumpItem AbstractSupplierDumpItem}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractSupplierDumpItem extends GenericItem
{
	/** Qualifier of the <code>AbstractSupplierDumpItem.supplier</code> attribute **/
	public static final String SUPPLIER = "supplier";
	/** Qualifier of the <code>AbstractSupplierDumpItem.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>AbstractSupplierDumpItem.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>AbstractSupplierDumpItem.active</code> attribute **/
	public static final String ACTIVE = "active";
	/** Qualifier of the <code>AbstractSupplierDumpItem.mappings</code> attribute **/
	public static final String MAPPINGS = "mappings";
	/** Relation ordering override parameter constants for SupplierMapping2DumRel from ((suppliermappingscore))*/
	protected static String SUPPLIERMAPPING2DUMREL_SRC_ORDERED = "relation.SupplierMapping2DumRel.source.ordered";
	protected static String SUPPLIERMAPPING2DUMREL_TGT_ORDERED = "relation.SupplierMapping2DumRel.target.ordered";
	/** Relation disable markmodifed parameter constants for SupplierMapping2DumRel from ((suppliermappingscore))*/
	protected static String SUPPLIERMAPPING2DUMREL_MARKMODIFIED = "relation.SupplierMapping2DumRel.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SUPPLIER, AttributeMode.INITIAL);
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(ACTIVE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierDumpItem.active</code> attribute.
	 * @return the active
	 */
	public Boolean isActive(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ACTIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierDumpItem.active</code> attribute.
	 * @return the active
	 */
	public Boolean isActive()
	{
		return isActive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierDumpItem.active</code> attribute. 
	 * @return the active
	 */
	public boolean isActiveAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isActive( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierDumpItem.active</code> attribute. 
	 * @return the active
	 */
	public boolean isActiveAsPrimitive()
	{
		return isActiveAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierDumpItem.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ACTIVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierDumpItem.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final Boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierDumpItem.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final SessionContext ctx, final boolean value)
	{
		setActive( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierDumpItem.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierDumpItem.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierDumpItem.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierDumpItem.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierDumpItem.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierDumpItem.mappings</code> attribute.
	 * @return the mappings
	 */
	public Collection<AbstractSupplierMapping> getMappings(final SessionContext ctx)
	{
		final List<AbstractSupplierMapping> items = getLinkedItems( 
			ctx,
			false,
			SuppliermappingscoreConstants.Relations.SUPPLIERMAPPING2DUMREL,
			"AbstractSupplierMapping",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierDumpItem.mappings</code> attribute.
	 * @return the mappings
	 */
	public Collection<AbstractSupplierMapping> getMappings()
	{
		return getMappings( getSession().getSessionContext() );
	}
	
	public long getMappingsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			SuppliermappingscoreConstants.Relations.SUPPLIERMAPPING2DUMREL,
			"AbstractSupplierMapping",
			null
		);
	}
	
	public long getMappingsCount()
	{
		return getMappingsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierDumpItem.mappings</code> attribute. 
	 * @param value the mappings
	 */
	public void setMappings(final SessionContext ctx, final Collection<AbstractSupplierMapping> value)
	{
		setLinkedItems( 
			ctx,
			false,
			SuppliermappingscoreConstants.Relations.SUPPLIERMAPPING2DUMREL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIERMAPPING2DUMREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierDumpItem.mappings</code> attribute. 
	 * @param value the mappings
	 */
	public void setMappings(final Collection<AbstractSupplierMapping> value)
	{
		setMappings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to mappings. 
	 * @param value the item to add to mappings
	 */
	public void addToMappings(final SessionContext ctx, final AbstractSupplierMapping value)
	{
		addLinkedItems( 
			ctx,
			false,
			SuppliermappingscoreConstants.Relations.SUPPLIERMAPPING2DUMREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIERMAPPING2DUMREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to mappings. 
	 * @param value the item to add to mappings
	 */
	public void addToMappings(final AbstractSupplierMapping value)
	{
		addToMappings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from mappings. 
	 * @param value the item to remove from mappings
	 */
	public void removeFromMappings(final SessionContext ctx, final AbstractSupplierMapping value)
	{
		removeLinkedItems( 
			ctx,
			false,
			SuppliermappingscoreConstants.Relations.SUPPLIERMAPPING2DUMREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIERMAPPING2DUMREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from mappings. 
	 * @param value the item to remove from mappings
	 */
	public void removeFromMappings(final AbstractSupplierMapping value)
	{
		removeFromMappings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierDumpItem.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierDumpItem.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierDumpItem.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierDumpItem.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierDumpItem.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, SUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierDumpItem.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier()
	{
		return getSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierDumpItem.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, SUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierDumpItem.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final Supplier value)
	{
		setSupplier( getSession().getSessionContext(), value );
	}
	
}
