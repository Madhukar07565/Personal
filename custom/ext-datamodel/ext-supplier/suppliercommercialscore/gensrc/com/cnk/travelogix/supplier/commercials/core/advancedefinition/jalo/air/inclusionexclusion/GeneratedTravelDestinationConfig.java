/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.inclusionexclusion;

import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.masterdata.core.c2l.jalo.Continent;
import com.cnk.travelogix.product.transport.masters.core.jalo.FlightProduct;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.config.jalo.AbstractAdvDefConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.SupplierCommercialAdvanceDefinition;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.c2l.Region;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.inclusionexclusion.TravelDestinationConfig TravelDestinationConfig}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTravelDestinationConfig extends AbstractAdvDefConfig
{
	/** Qualifier of the <code>TravelDestinationConfig.toContinent</code> attribute **/
	public static final String TOCONTINENT = "toContinent";
	/** Qualifier of the <code>TravelDestinationConfig.toCountry</code> attribute **/
	public static final String TOCOUNTRY = "toCountry";
	/** Qualifier of the <code>TravelDestinationConfig.toCity</code> attribute **/
	public static final String TOCITY = "toCity";
	/** Qualifier of the <code>TravelDestinationConfig.state</code> attribute **/
	public static final String STATE = "state";
	/** Qualifier of the <code>TravelDestinationConfig.products</code> attribute **/
	public static final String PRODUCTS = "products";
	/** Relation ordering override parameter constants for TravelDestinationConfig2ProductRel from ((suppliercommercialscore))*/
	protected static String TRAVELDESTINATIONCONFIG2PRODUCTREL_SRC_ORDERED = "relation.TravelDestinationConfig2ProductRel.source.ordered";
	protected static String TRAVELDESTINATIONCONFIG2PRODUCTREL_TGT_ORDERED = "relation.TravelDestinationConfig2ProductRel.target.ordered";
	/** Relation disable markmodifed parameter constants for TravelDestinationConfig2ProductRel from ((suppliercommercialscore))*/
	protected static String TRAVELDESTINATIONCONFIG2PRODUCTREL_MARKMODIFIED = "relation.TravelDestinationConfig2ProductRel.markmodified";
	/** Qualifier of the <code>TravelDestinationConfig.advanceDefinition</code> attribute **/
	public static final String ADVANCEDEFINITION = "advanceDefinition";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ADVANCEDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedTravelDestinationConfig> ADVANCEDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedTravelDestinationConfig>(
	SuppliercommercialscoreConstants.TC.TRAVELDESTINATIONCONFIG,
	false,
	"advanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractAdvDefConfig.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(TOCONTINENT, AttributeMode.INITIAL);
		tmp.put(TOCOUNTRY, AttributeMode.INITIAL);
		tmp.put(TOCITY, AttributeMode.INITIAL);
		tmp.put(STATE, AttributeMode.INITIAL);
		tmp.put(ADVANCEDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDestinationConfig.advanceDefinition</code> attribute.
	 * @return the advanceDefinition
	 */
	public SupplierCommercialAdvanceDefinition getAdvanceDefinition(final SessionContext ctx)
	{
		return (SupplierCommercialAdvanceDefinition)getProperty( ctx, ADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDestinationConfig.advanceDefinition</code> attribute.
	 * @return the advanceDefinition
	 */
	public SupplierCommercialAdvanceDefinition getAdvanceDefinition()
	{
		return getAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDestinationConfig.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition
	 */
	public void setAdvanceDefinition(final SessionContext ctx, final SupplierCommercialAdvanceDefinition value)
	{
		ADVANCEDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDestinationConfig.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition
	 */
	public void setAdvanceDefinition(final SupplierCommercialAdvanceDefinition value)
	{
		setAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ADVANCEDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDestinationConfig.products</code> attribute.
	 * @return the products
	 */
	public List<FlightProduct> getProducts(final SessionContext ctx)
	{
		final List<FlightProduct> items = getLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.TRAVELDESTINATIONCONFIG2PRODUCTREL,
			"FlightProduct",
			null,
			Utilities.getRelationOrderingOverride(TRAVELDESTINATIONCONFIG2PRODUCTREL_SRC_ORDERED, true),
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDestinationConfig.products</code> attribute.
	 * @return the products
	 */
	public List<FlightProduct> getProducts()
	{
		return getProducts( getSession().getSessionContext() );
	}
	
	public long getProductsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.TRAVELDESTINATIONCONFIG2PRODUCTREL,
			"FlightProduct",
			null
		);
	}
	
	public long getProductsCount()
	{
		return getProductsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDestinationConfig.products</code> attribute. 
	 * @param value the products
	 */
	public void setProducts(final SessionContext ctx, final List<FlightProduct> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.TRAVELDESTINATIONCONFIG2PRODUCTREL,
			null,
			value,
			Utilities.getRelationOrderingOverride(TRAVELDESTINATIONCONFIG2PRODUCTREL_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(TRAVELDESTINATIONCONFIG2PRODUCTREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDestinationConfig.products</code> attribute. 
	 * @param value the products
	 */
	public void setProducts(final List<FlightProduct> value)
	{
		setProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to products. 
	 * @param value the item to add to products
	 */
	public void addToProducts(final SessionContext ctx, final FlightProduct value)
	{
		addLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.TRAVELDESTINATIONCONFIG2PRODUCTREL,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(TRAVELDESTINATIONCONFIG2PRODUCTREL_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(TRAVELDESTINATIONCONFIG2PRODUCTREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to products. 
	 * @param value the item to add to products
	 */
	public void addToProducts(final FlightProduct value)
	{
		addToProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from products. 
	 * @param value the item to remove from products
	 */
	public void removeFromProducts(final SessionContext ctx, final FlightProduct value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.TRAVELDESTINATIONCONFIG2PRODUCTREL,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(TRAVELDESTINATIONCONFIG2PRODUCTREL_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(TRAVELDESTINATIONCONFIG2PRODUCTREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from products. 
	 * @param value the item to remove from products
	 */
	public void removeFromProducts(final FlightProduct value)
	{
		removeFromProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDestinationConfig.state</code> attribute.
	 * @return the state
	 */
	public Region getState(final SessionContext ctx)
	{
		return (Region)getProperty( ctx, STATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDestinationConfig.state</code> attribute.
	 * @return the state
	 */
	public Region getState()
	{
		return getState( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDestinationConfig.state</code> attribute. 
	 * @param value the state
	 */
	public void setState(final SessionContext ctx, final Region value)
	{
		setProperty(ctx, STATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDestinationConfig.state</code> attribute. 
	 * @param value the state
	 */
	public void setState(final Region value)
	{
		setState( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDestinationConfig.toCity</code> attribute.
	 * @return the toCity
	 */
	public City getToCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, TOCITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDestinationConfig.toCity</code> attribute.
	 * @return the toCity
	 */
	public City getToCity()
	{
		return getToCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDestinationConfig.toCity</code> attribute. 
	 * @param value the toCity
	 */
	public void setToCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, TOCITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDestinationConfig.toCity</code> attribute. 
	 * @param value the toCity
	 */
	public void setToCity(final City value)
	{
		setToCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDestinationConfig.toContinent</code> attribute.
	 * @return the toContinent
	 */
	public Continent getToContinent(final SessionContext ctx)
	{
		return (Continent)getProperty( ctx, TOCONTINENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDestinationConfig.toContinent</code> attribute.
	 * @return the toContinent
	 */
	public Continent getToContinent()
	{
		return getToContinent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDestinationConfig.toContinent</code> attribute. 
	 * @param value the toContinent
	 */
	public void setToContinent(final SessionContext ctx, final Continent value)
	{
		setProperty(ctx, TOCONTINENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDestinationConfig.toContinent</code> attribute. 
	 * @param value the toContinent
	 */
	public void setToContinent(final Continent value)
	{
		setToContinent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDestinationConfig.toCountry</code> attribute.
	 * @return the toCountry
	 */
	public Country getToCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, TOCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDestinationConfig.toCountry</code> attribute.
	 * @return the toCountry
	 */
	public Country getToCountry()
	{
		return getToCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDestinationConfig.toCountry</code> attribute. 
	 * @param value the toCountry
	 */
	public void setToCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, TOCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDestinationConfig.toCountry</code> attribute. 
	 * @param value the toCountry
	 */
	public void setToCountry(final Country value)
	{
		setToCountry( getSession().getSessionContext(), value );
	}
	
}
