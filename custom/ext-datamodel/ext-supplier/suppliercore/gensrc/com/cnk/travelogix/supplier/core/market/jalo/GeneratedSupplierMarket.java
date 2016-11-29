/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.core.market.jalo;

import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.supplier.core.constants.SuppliercoreConstants;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.core.market.jalo.SupplierMarket SupplierMarket}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierMarket extends AbstractTravelogixItem
{
	/** Qualifier of the <code>SupplierMarket.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>SupplierMarket.suppliersForMarket</code> attribute **/
	public static final String SUPPLIERSFORMARKET = "suppliersForMarket";
	/** Relation ordering override parameter constants for Supplier2SupplierMarketRelation from ((suppliercore))*/
	protected static String SUPPLIER2SUPPLIERMARKETRELATION_SRC_ORDERED = "relation.Supplier2SupplierMarketRelation.source.ordered";
	protected static String SUPPLIER2SUPPLIERMARKETRELATION_TGT_ORDERED = "relation.Supplier2SupplierMarketRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for Supplier2SupplierMarketRelation from ((suppliercore))*/
	protected static String SUPPLIER2SUPPLIERMARKETRELATION_MARKMODIFIED = "relation.Supplier2SupplierMarketRelation.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(NAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMarket.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSupplierMarket.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMarket.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMarket.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMarket.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMarket.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSupplierMarket.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMarket.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMarket.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMarket.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMarket.suppliersForMarket</code> attribute.
	 * @return the suppliersForMarket
	 */
	public Set<Supplier> getSuppliersForMarket(final SessionContext ctx)
	{
		final List<Supplier> items = getLinkedItems( 
			ctx,
			false,
			SuppliercoreConstants.Relations.SUPPLIER2SUPPLIERMARKETRELATION,
			"Supplier",
			null,
			false,
			false
		);
		return new LinkedHashSet<Supplier>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMarket.suppliersForMarket</code> attribute.
	 * @return the suppliersForMarket
	 */
	public Set<Supplier> getSuppliersForMarket()
	{
		return getSuppliersForMarket( getSession().getSessionContext() );
	}
	
	public long getSuppliersForMarketCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			SuppliercoreConstants.Relations.SUPPLIER2SUPPLIERMARKETRELATION,
			"Supplier",
			null
		);
	}
	
	public long getSuppliersForMarketCount()
	{
		return getSuppliersForMarketCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMarket.suppliersForMarket</code> attribute. 
	 * @param value the suppliersForMarket
	 */
	public void setSuppliersForMarket(final SessionContext ctx, final Set<Supplier> value)
	{
		setLinkedItems( 
			ctx,
			false,
			SuppliercoreConstants.Relations.SUPPLIER2SUPPLIERMARKETRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2SUPPLIERMARKETRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMarket.suppliersForMarket</code> attribute. 
	 * @param value the suppliersForMarket
	 */
	public void setSuppliersForMarket(final Set<Supplier> value)
	{
		setSuppliersForMarket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to suppliersForMarket. 
	 * @param value the item to add to suppliersForMarket
	 */
	public void addToSuppliersForMarket(final SessionContext ctx, final Supplier value)
	{
		addLinkedItems( 
			ctx,
			false,
			SuppliercoreConstants.Relations.SUPPLIER2SUPPLIERMARKETRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2SUPPLIERMARKETRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to suppliersForMarket. 
	 * @param value the item to add to suppliersForMarket
	 */
	public void addToSuppliersForMarket(final Supplier value)
	{
		addToSuppliersForMarket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from suppliersForMarket. 
	 * @param value the item to remove from suppliersForMarket
	 */
	public void removeFromSuppliersForMarket(final SessionContext ctx, final Supplier value)
	{
		removeLinkedItems( 
			ctx,
			false,
			SuppliercoreConstants.Relations.SUPPLIER2SUPPLIERMARKETRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2SUPPLIERMARKETRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from suppliersForMarket. 
	 * @param value the item to remove from suppliersForMarket
	 */
	public void removeFromSuppliersForMarket(final Supplier value)
	{
		removeFromSuppliersForMarket( getSession().getSessionContext(), value );
	}
	
}
