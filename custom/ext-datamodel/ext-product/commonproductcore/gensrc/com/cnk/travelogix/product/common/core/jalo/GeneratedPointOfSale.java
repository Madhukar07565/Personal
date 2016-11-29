/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import com.cnk.travelogix.product.common.core.jalo.CombinationProduct;
import de.hybris.platform.jalo.GenericItem;
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
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.PointOfSale PointOfSale}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPointOfSale extends GenericItem
{
	/** Qualifier of the <code>PointOfSale.pointOfSale</code> attribute **/
	public static final String POINTOFSALE = "pointOfSale";
	/** Qualifier of the <code>PointOfSale.combinationProduct</code> attribute **/
	public static final String COMBINATIONPRODUCT = "combinationProduct";
	/** Relation ordering override parameter constants for CombinationProductToPointOfSale from ((commonproductcore))*/
	protected static String COMBINATIONPRODUCTTOPOINTOFSALE_SRC_ORDERED = "relation.CombinationProductToPointOfSale.source.ordered";
	protected static String COMBINATIONPRODUCTTOPOINTOFSALE_TGT_ORDERED = "relation.CombinationProductToPointOfSale.target.ordered";
	/** Relation disable markmodifed parameter constants for CombinationProductToPointOfSale from ((commonproductcore))*/
	protected static String COMBINATIONPRODUCTTOPOINTOFSALE_MARKMODIFIED = "relation.CombinationProductToPointOfSale.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(POINTOFSALE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PointOfSale.combinationProduct</code> attribute.
	 * @return the combinationProduct
	 */
	public Collection<CombinationProduct> getCombinationProduct(final SessionContext ctx)
	{
		final List<CombinationProduct> items = getLinkedItems( 
			ctx,
			false,
			CommonproductcoreConstants.Relations.COMBINATIONPRODUCTTOPOINTOFSALE,
			"CombinationProduct",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PointOfSale.combinationProduct</code> attribute.
	 * @return the combinationProduct
	 */
	public Collection<CombinationProduct> getCombinationProduct()
	{
		return getCombinationProduct( getSession().getSessionContext() );
	}
	
	public long getCombinationProductCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			CommonproductcoreConstants.Relations.COMBINATIONPRODUCTTOPOINTOFSALE,
			"CombinationProduct",
			null
		);
	}
	
	public long getCombinationProductCount()
	{
		return getCombinationProductCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PointOfSale.combinationProduct</code> attribute. 
	 * @param value the combinationProduct
	 */
	public void setCombinationProduct(final SessionContext ctx, final Collection<CombinationProduct> value)
	{
		setLinkedItems( 
			ctx,
			false,
			CommonproductcoreConstants.Relations.COMBINATIONPRODUCTTOPOINTOFSALE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(COMBINATIONPRODUCTTOPOINTOFSALE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PointOfSale.combinationProduct</code> attribute. 
	 * @param value the combinationProduct
	 */
	public void setCombinationProduct(final Collection<CombinationProduct> value)
	{
		setCombinationProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to combinationProduct. 
	 * @param value the item to add to combinationProduct
	 */
	public void addToCombinationProduct(final SessionContext ctx, final CombinationProduct value)
	{
		addLinkedItems( 
			ctx,
			false,
			CommonproductcoreConstants.Relations.COMBINATIONPRODUCTTOPOINTOFSALE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(COMBINATIONPRODUCTTOPOINTOFSALE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to combinationProduct. 
	 * @param value the item to add to combinationProduct
	 */
	public void addToCombinationProduct(final CombinationProduct value)
	{
		addToCombinationProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from combinationProduct. 
	 * @param value the item to remove from combinationProduct
	 */
	public void removeFromCombinationProduct(final SessionContext ctx, final CombinationProduct value)
	{
		removeLinkedItems( 
			ctx,
			false,
			CommonproductcoreConstants.Relations.COMBINATIONPRODUCTTOPOINTOFSALE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(COMBINATIONPRODUCTTOPOINTOFSALE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from combinationProduct. 
	 * @param value the item to remove from combinationProduct
	 */
	public void removeFromCombinationProduct(final CombinationProduct value)
	{
		removeFromCombinationProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PointOfSale.pointOfSale</code> attribute.
	 * @return the pointOfSale - Whether the attached product is to be included/excluded on front end
	 */
	public EnumerationValue getPointOfSale(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, POINTOFSALE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PointOfSale.pointOfSale</code> attribute.
	 * @return the pointOfSale - Whether the attached product is to be included/excluded on front end
	 */
	public EnumerationValue getPointOfSale()
	{
		return getPointOfSale( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PointOfSale.pointOfSale</code> attribute. 
	 * @param value the pointOfSale - Whether the attached product is to be included/excluded on front end
	 */
	public void setPointOfSale(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, POINTOFSALE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PointOfSale.pointOfSale</code> attribute. 
	 * @param value the pointOfSale - Whether the attached product is to be included/excluded on front end
	 */
	public void setPointOfSale(final EnumerationValue value)
	{
		setPointOfSale( getSession().getSessionContext(), value );
	}
	
}
