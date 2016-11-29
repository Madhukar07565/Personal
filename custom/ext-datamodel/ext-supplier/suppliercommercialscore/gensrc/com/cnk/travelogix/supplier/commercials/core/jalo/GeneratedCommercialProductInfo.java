/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.jalo;

import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.GeneralCommercialRecord;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.jalo.CommercialProductInfo CommercialProductInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCommercialProductInfo extends GenericItem
{
	/** Qualifier of the <code>CommercialProductInfo.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>CommercialProductInfo.commercials</code> attribute **/
	public static final String COMMERCIALS = "commercials";
	/** Relation ordering override parameter constants for genCommercialrcd2ProductInfos from ((suppliercommercialscore))*/
	protected static String GENCOMMERCIALRCD2PRODUCTINFOS_SRC_ORDERED = "relation.genCommercialrcd2ProductInfos.source.ordered";
	protected static String GENCOMMERCIALRCD2PRODUCTINFOS_TGT_ORDERED = "relation.genCommercialrcd2ProductInfos.target.ordered";
	/** Relation disable markmodifed parameter constants for genCommercialrcd2ProductInfos from ((suppliercommercialscore))*/
	protected static String GENCOMMERCIALRCD2PRODUCTINFOS_MARKMODIFIED = "relation.genCommercialrcd2ProductInfos.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialProductInfo.commercials</code> attribute.
	 * @return the commercials
	 */
	public Set<GeneralCommercialRecord> getCommercials(final SessionContext ctx)
	{
		final List<GeneralCommercialRecord> items = getLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.GENCOMMERCIALRCD2PRODUCTINFOS,
			"GeneralCommercialRecord",
			null,
			false,
			false
		);
		return new LinkedHashSet<GeneralCommercialRecord>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialProductInfo.commercials</code> attribute.
	 * @return the commercials
	 */
	public Set<GeneralCommercialRecord> getCommercials()
	{
		return getCommercials( getSession().getSessionContext() );
	}
	
	public long getCommercialsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.GENCOMMERCIALRCD2PRODUCTINFOS,
			"GeneralCommercialRecord",
			null
		);
	}
	
	public long getCommercialsCount()
	{
		return getCommercialsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialProductInfo.commercials</code> attribute. 
	 * @param value the commercials
	 */
	public void setCommercials(final SessionContext ctx, final Set<GeneralCommercialRecord> value)
	{
		setLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.GENCOMMERCIALRCD2PRODUCTINFOS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(GENCOMMERCIALRCD2PRODUCTINFOS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialProductInfo.commercials</code> attribute. 
	 * @param value the commercials
	 */
	public void setCommercials(final Set<GeneralCommercialRecord> value)
	{
		setCommercials( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to commercials. 
	 * @param value the item to add to commercials
	 */
	public void addToCommercials(final SessionContext ctx, final GeneralCommercialRecord value)
	{
		addLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.GENCOMMERCIALRCD2PRODUCTINFOS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(GENCOMMERCIALRCD2PRODUCTINFOS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to commercials. 
	 * @param value the item to add to commercials
	 */
	public void addToCommercials(final GeneralCommercialRecord value)
	{
		addToCommercials( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from commercials. 
	 * @param value the item to remove from commercials
	 */
	public void removeFromCommercials(final SessionContext ctx, final GeneralCommercialRecord value)
	{
		removeLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.GENCOMMERCIALRCD2PRODUCTINFOS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(GENCOMMERCIALRCD2PRODUCTINFOS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from commercials. 
	 * @param value the item to remove from commercials
	 */
	public void removeFromCommercials(final GeneralCommercialRecord value)
	{
		removeFromCommercials( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialProductInfo.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialProductInfo.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialProductInfo.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialProductInfo.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final Product value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
}
