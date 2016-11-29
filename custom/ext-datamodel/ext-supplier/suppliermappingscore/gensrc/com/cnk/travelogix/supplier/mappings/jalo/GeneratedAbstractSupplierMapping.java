/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.mappings.jalo;

import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.supplier.mappings.core.constants.SuppliermappingscoreConstants;
import com.cnk.travelogix.supplier.mappings.dump.jalo.AbstractSupplierDumpItem;
import de.hybris.platform.category.jalo.Category;
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
 * Generated class for type {@link com.cnk.travelogix.supplier.mappings.jalo.AbstractSupplierMapping AbstractSupplierMapping}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractSupplierMapping extends AbstractTravelogixItem
{
	/** Qualifier of the <code>AbstractSupplierMapping.workFlowStatus</code> attribute **/
	public static final String WORKFLOWSTATUS = "workFlowStatus";
	/** Qualifier of the <code>AbstractSupplierMapping.dumpItems</code> attribute **/
	public static final String DUMPITEMS = "dumpItems";
	/** Relation ordering override parameter constants for SupplierMapping2DumRel from ((suppliermappingscore))*/
	protected static String SUPPLIERMAPPING2DUMREL_SRC_ORDERED = "relation.SupplierMapping2DumRel.source.ordered";
	protected static String SUPPLIERMAPPING2DUMREL_TGT_ORDERED = "relation.SupplierMapping2DumRel.target.ordered";
	/** Relation disable markmodifed parameter constants for SupplierMapping2DumRel from ((suppliermappingscore))*/
	protected static String SUPPLIERMAPPING2DUMREL_MARKMODIFIED = "relation.SupplierMapping2DumRel.markmodified";
	/** Qualifier of the <code>AbstractSupplierMapping.categoriesForMapping</code> attribute **/
	public static final String CATEGORIESFORMAPPING = "categoriesForMapping";
	/** Relation ordering override parameter constants for SupplierMapping2CategoryRel from ((suppliermappingscore))*/
	protected static String SUPPLIERMAPPING2CATEGORYREL_SRC_ORDERED = "relation.SupplierMapping2CategoryRel.source.ordered";
	protected static String SUPPLIERMAPPING2CATEGORYREL_TGT_ORDERED = "relation.SupplierMapping2CategoryRel.target.ordered";
	/** Relation disable markmodifed parameter constants for SupplierMapping2CategoryRel from ((suppliermappingscore))*/
	protected static String SUPPLIERMAPPING2CATEGORYREL_MARKMODIFIED = "relation.SupplierMapping2CategoryRel.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(WORKFLOWSTATUS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierMapping.categoriesForMapping</code> attribute.
	 * @return the categoriesForMapping
	 */
	public Collection<Category> getCategoriesForMapping(final SessionContext ctx)
	{
		final List<Category> items = getLinkedItems( 
			ctx,
			true,
			SuppliermappingscoreConstants.Relations.SUPPLIERMAPPING2CATEGORYREL,
			"Category",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierMapping.categoriesForMapping</code> attribute.
	 * @return the categoriesForMapping
	 */
	public Collection<Category> getCategoriesForMapping()
	{
		return getCategoriesForMapping( getSession().getSessionContext() );
	}
	
	public long getCategoriesForMappingCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SuppliermappingscoreConstants.Relations.SUPPLIERMAPPING2CATEGORYREL,
			"Category",
			null
		);
	}
	
	public long getCategoriesForMappingCount()
	{
		return getCategoriesForMappingCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierMapping.categoriesForMapping</code> attribute. 
	 * @param value the categoriesForMapping
	 */
	public void setCategoriesForMapping(final SessionContext ctx, final Collection<Category> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SuppliermappingscoreConstants.Relations.SUPPLIERMAPPING2CATEGORYREL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIERMAPPING2CATEGORYREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierMapping.categoriesForMapping</code> attribute. 
	 * @param value the categoriesForMapping
	 */
	public void setCategoriesForMapping(final Collection<Category> value)
	{
		setCategoriesForMapping( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to categoriesForMapping. 
	 * @param value the item to add to categoriesForMapping
	 */
	public void addToCategoriesForMapping(final SessionContext ctx, final Category value)
	{
		addLinkedItems( 
			ctx,
			true,
			SuppliermappingscoreConstants.Relations.SUPPLIERMAPPING2CATEGORYREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIERMAPPING2CATEGORYREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to categoriesForMapping. 
	 * @param value the item to add to categoriesForMapping
	 */
	public void addToCategoriesForMapping(final Category value)
	{
		addToCategoriesForMapping( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from categoriesForMapping. 
	 * @param value the item to remove from categoriesForMapping
	 */
	public void removeFromCategoriesForMapping(final SessionContext ctx, final Category value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SuppliermappingscoreConstants.Relations.SUPPLIERMAPPING2CATEGORYREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIERMAPPING2CATEGORYREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from categoriesForMapping. 
	 * @param value the item to remove from categoriesForMapping
	 */
	public void removeFromCategoriesForMapping(final Category value)
	{
		removeFromCategoriesForMapping( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierMapping.dumpItems</code> attribute.
	 * @return the dumpItems
	 */
	public Collection<AbstractSupplierDumpItem> getDumpItems(final SessionContext ctx)
	{
		final List<AbstractSupplierDumpItem> items = getLinkedItems( 
			ctx,
			true,
			SuppliermappingscoreConstants.Relations.SUPPLIERMAPPING2DUMREL,
			"AbstractSupplierDumpItem",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierMapping.dumpItems</code> attribute.
	 * @return the dumpItems
	 */
	public Collection<AbstractSupplierDumpItem> getDumpItems()
	{
		return getDumpItems( getSession().getSessionContext() );
	}
	
	public long getDumpItemsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SuppliermappingscoreConstants.Relations.SUPPLIERMAPPING2DUMREL,
			"AbstractSupplierDumpItem",
			null
		);
	}
	
	public long getDumpItemsCount()
	{
		return getDumpItemsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierMapping.dumpItems</code> attribute. 
	 * @param value the dumpItems
	 */
	public void setDumpItems(final SessionContext ctx, final Collection<AbstractSupplierDumpItem> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SuppliermappingscoreConstants.Relations.SUPPLIERMAPPING2DUMREL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIERMAPPING2DUMREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierMapping.dumpItems</code> attribute. 
	 * @param value the dumpItems
	 */
	public void setDumpItems(final Collection<AbstractSupplierDumpItem> value)
	{
		setDumpItems( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to dumpItems. 
	 * @param value the item to add to dumpItems
	 */
	public void addToDumpItems(final SessionContext ctx, final AbstractSupplierDumpItem value)
	{
		addLinkedItems( 
			ctx,
			true,
			SuppliermappingscoreConstants.Relations.SUPPLIERMAPPING2DUMREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIERMAPPING2DUMREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to dumpItems. 
	 * @param value the item to add to dumpItems
	 */
	public void addToDumpItems(final AbstractSupplierDumpItem value)
	{
		addToDumpItems( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from dumpItems. 
	 * @param value the item to remove from dumpItems
	 */
	public void removeFromDumpItems(final SessionContext ctx, final AbstractSupplierDumpItem value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SuppliermappingscoreConstants.Relations.SUPPLIERMAPPING2DUMREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIERMAPPING2DUMREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from dumpItems. 
	 * @param value the item to remove from dumpItems
	 */
	public void removeFromDumpItems(final AbstractSupplierDumpItem value)
	{
		removeFromDumpItems( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierMapping.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, WORKFLOWSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierMapping.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus()
	{
		return getWorkFlowStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierMapping.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, WORKFLOWSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierMapping.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final EnumerationValue value)
	{
		setWorkFlowStatus( getSession().getSessionContext(), value );
	}
	
}
