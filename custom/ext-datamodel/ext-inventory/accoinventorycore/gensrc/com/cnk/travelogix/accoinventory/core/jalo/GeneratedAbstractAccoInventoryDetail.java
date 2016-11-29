/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.accoinventory.core.jalo;

import com.cnk.travelogix.acco.inventory.core.constants.AccoinventorycoreConstants;
import com.cnk.travelogix.acco.inventory.core.jalo.AccoInventoryGrid;
import com.cnk.travelogix.accoinventory.core.jalo.InventoryRoomInfo;
import com.cnk.travelogix.common.inventory.jalo.AbstractInventoryDetail;
import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.product.common.core.jalo.Accommodation;
import com.cnk.travelogix.product.common.core.jalo.AccommodationChain;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.accoinventory.core.jalo.AbstractAccoInventoryDetail AbstractAccoInventoryDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractAccoInventoryDetail extends AbstractInventoryDetail
{
	/** Qualifier of the <code>AbstractAccoInventoryDetail.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>AbstractAccoInventoryDetail.travelChain</code> attribute **/
	public static final String TRAVELCHAIN = "travelChain";
	/** Qualifier of the <code>AbstractAccoInventoryDetail.hotelCategory</code> attribute **/
	public static final String HOTELCATEGORY = "hotelCategory";
	/** Qualifier of the <code>AbstractAccoInventoryDetail.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>AbstractAccoInventoryDetail.priceRangeFrom</code> attribute **/
	public static final String PRICERANGEFROM = "priceRangeFrom";
	/** Qualifier of the <code>AbstractAccoInventoryDetail.priceRangeTo</code> attribute **/
	public static final String PRICERANGETO = "priceRangeTo";
	/** Qualifier of the <code>AbstractAccoInventoryDetail.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>AbstractAccoInventoryDetail.remark</code> attribute **/
	public static final String REMARK = "remark";
	/** Qualifier of the <code>AbstractAccoInventoryDetail.inventoryRoomInfos</code> attribute **/
	public static final String INVENTORYROOMINFOS = "inventoryRoomInfos";
	/** Qualifier of the <code>AbstractAccoInventoryDetail.accoInventoryGrid</code> attribute **/
	public static final String ACCOINVENTORYGRID = "accoInventoryGrid";
	/** Qualifier of the <code>AbstractAccoInventoryDetail.products</code> attribute **/
	public static final String PRODUCTS = "products";
	/** Relation ordering override parameter constants for AbstractAccoInventoryDetailToAccommodation from ((accoinventorycore))*/
	protected static String ABSTRACTACCOINVENTORYDETAILTOACCOMMODATION_SRC_ORDERED = "relation.AbstractAccoInventoryDetailToAccommodation.source.ordered";
	protected static String ABSTRACTACCOINVENTORYDETAILTOACCOMMODATION_TGT_ORDERED = "relation.AbstractAccoInventoryDetailToAccommodation.target.ordered";
	/** Relation disable markmodifed parameter constants for AbstractAccoInventoryDetailToAccommodation from ((accoinventorycore))*/
	protected static String ABSTRACTACCOINVENTORYDETAILTOACCOMMODATION_MARKMODIFIED = "relation.AbstractAccoInventoryDetailToAccommodation.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n INVENTORYROOMINFOS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<InventoryRoomInfo> INVENTORYROOMINFOSHANDLER = new OneToManyHandler<InventoryRoomInfo>(
	AccoinventorycoreConstants.TC.INVENTORYROOMINFO,
	false,
	"abstractAccoInventoryDetail",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACCOINVENTORYGRID's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAbstractAccoInventoryDetail> ACCOINVENTORYGRIDHANDLER = new BidirectionalOneToManyHandler<GeneratedAbstractAccoInventoryDetail>(
	AccoinventorycoreConstants.TC.ABSTRACTACCOINVENTORYDETAIL,
	false,
	"accoInventoryGrid",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractInventoryDetail.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(TRAVELCHAIN, AttributeMode.INITIAL);
		tmp.put(HOTELCATEGORY, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(PRICERANGEFROM, AttributeMode.INITIAL);
		tmp.put(PRICERANGETO, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		tmp.put(REMARK, AttributeMode.INITIAL);
		tmp.put(ACCOINVENTORYGRID, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAccoInventoryDetail.accoInventoryGrid</code> attribute.
	 * @return the accoInventoryGrid
	 */
	public AccoInventoryGrid getAccoInventoryGrid(final SessionContext ctx)
	{
		return (AccoInventoryGrid)getProperty( ctx, ACCOINVENTORYGRID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAccoInventoryDetail.accoInventoryGrid</code> attribute.
	 * @return the accoInventoryGrid
	 */
	public AccoInventoryGrid getAccoInventoryGrid()
	{
		return getAccoInventoryGrid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAccoInventoryDetail.accoInventoryGrid</code> attribute. 
	 * @param value the accoInventoryGrid
	 */
	public void setAccoInventoryGrid(final SessionContext ctx, final AccoInventoryGrid value)
	{
		ACCOINVENTORYGRIDHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAccoInventoryDetail.accoInventoryGrid</code> attribute. 
	 * @param value the accoInventoryGrid
	 */
	public void setAccoInventoryGrid(final AccoInventoryGrid value)
	{
		setAccoInventoryGrid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAccoInventoryDetail.city</code> attribute.
	 * @return the city - City
	 */
	public City getCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAccoInventoryDetail.city</code> attribute.
	 * @return the city - City
	 */
	public City getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAccoInventoryDetail.city</code> attribute. 
	 * @param value the city - City
	 */
	public void setCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAccoInventoryDetail.city</code> attribute. 
	 * @param value the city - City
	 */
	public void setCity(final City value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACCOINVENTORYGRIDHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAccoInventoryDetail.currency</code> attribute.
	 * @return the currency - Currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAccoInventoryDetail.currency</code> attribute.
	 * @return the currency - Currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAccoInventoryDetail.currency</code> attribute. 
	 * @param value the currency - Currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAccoInventoryDetail.currency</code> attribute. 
	 * @param value the currency - Currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAccoInventoryDetail.hotelCategory</code> attribute.
	 * @return the hotelCategory - Hotel Category
	 */
	public List<EnumerationValue> getHotelCategory(final SessionContext ctx)
	{
		List<EnumerationValue> coll = (List<EnumerationValue>)getProperty( ctx, HOTELCATEGORY);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAccoInventoryDetail.hotelCategory</code> attribute.
	 * @return the hotelCategory - Hotel Category
	 */
	public List<EnumerationValue> getHotelCategory()
	{
		return getHotelCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAccoInventoryDetail.hotelCategory</code> attribute. 
	 * @param value the hotelCategory - Hotel Category
	 */
	public void setHotelCategory(final SessionContext ctx, final List<EnumerationValue> value)
	{
		setProperty(ctx, HOTELCATEGORY,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAccoInventoryDetail.hotelCategory</code> attribute. 
	 * @param value the hotelCategory - Hotel Category
	 */
	public void setHotelCategory(final List<EnumerationValue> value)
	{
		setHotelCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAccoInventoryDetail.inventoryRoomInfos</code> attribute.
	 * @return the inventoryRoomInfos
	 */
	public Collection<InventoryRoomInfo> getInventoryRoomInfos(final SessionContext ctx)
	{
		return INVENTORYROOMINFOSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAccoInventoryDetail.inventoryRoomInfos</code> attribute.
	 * @return the inventoryRoomInfos
	 */
	public Collection<InventoryRoomInfo> getInventoryRoomInfos()
	{
		return getInventoryRoomInfos( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAccoInventoryDetail.inventoryRoomInfos</code> attribute. 
	 * @param value the inventoryRoomInfos
	 */
	public void setInventoryRoomInfos(final SessionContext ctx, final Collection<InventoryRoomInfo> value)
	{
		INVENTORYROOMINFOSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAccoInventoryDetail.inventoryRoomInfos</code> attribute. 
	 * @param value the inventoryRoomInfos
	 */
	public void setInventoryRoomInfos(final Collection<InventoryRoomInfo> value)
	{
		setInventoryRoomInfos( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inventoryRoomInfos. 
	 * @param value the item to add to inventoryRoomInfos
	 */
	public void addToInventoryRoomInfos(final SessionContext ctx, final InventoryRoomInfo value)
	{
		INVENTORYROOMINFOSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inventoryRoomInfos. 
	 * @param value the item to add to inventoryRoomInfos
	 */
	public void addToInventoryRoomInfos(final InventoryRoomInfo value)
	{
		addToInventoryRoomInfos( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inventoryRoomInfos. 
	 * @param value the item to remove from inventoryRoomInfos
	 */
	public void removeFromInventoryRoomInfos(final SessionContext ctx, final InventoryRoomInfo value)
	{
		INVENTORYROOMINFOSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inventoryRoomInfos. 
	 * @param value the item to remove from inventoryRoomInfos
	 */
	public void removeFromInventoryRoomInfos(final InventoryRoomInfo value)
	{
		removeFromInventoryRoomInfos( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAccoInventoryDetail.priceRangeFrom</code> attribute.
	 * @return the priceRangeFrom - Price Range From
	 */
	public BigDecimal getPriceRangeFrom(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, PRICERANGEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAccoInventoryDetail.priceRangeFrom</code> attribute.
	 * @return the priceRangeFrom - Price Range From
	 */
	public BigDecimal getPriceRangeFrom()
	{
		return getPriceRangeFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAccoInventoryDetail.priceRangeFrom</code> attribute. 
	 * @param value the priceRangeFrom - Price Range From
	 */
	public void setPriceRangeFrom(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, PRICERANGEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAccoInventoryDetail.priceRangeFrom</code> attribute. 
	 * @param value the priceRangeFrom - Price Range From
	 */
	public void setPriceRangeFrom(final BigDecimal value)
	{
		setPriceRangeFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAccoInventoryDetail.priceRangeTo</code> attribute.
	 * @return the priceRangeTo - Price Range From
	 */
	public BigDecimal getPriceRangeTo(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, PRICERANGETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAccoInventoryDetail.priceRangeTo</code> attribute.
	 * @return the priceRangeTo - Price Range From
	 */
	public BigDecimal getPriceRangeTo()
	{
		return getPriceRangeTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAccoInventoryDetail.priceRangeTo</code> attribute. 
	 * @param value the priceRangeTo - Price Range From
	 */
	public void setPriceRangeTo(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, PRICERANGETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAccoInventoryDetail.priceRangeTo</code> attribute. 
	 * @param value the priceRangeTo - Price Range From
	 */
	public void setPriceRangeTo(final BigDecimal value)
	{
		setPriceRangeTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAccoInventoryDetail.product</code> attribute.
	 * @return the product - Accommodation product
	 */
	public Accommodation getProduct(final SessionContext ctx)
	{
		return (Accommodation)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAccoInventoryDetail.product</code> attribute.
	 * @return the product - Accommodation product
	 */
	public Accommodation getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAccoInventoryDetail.product</code> attribute. 
	 * @param value the product - Accommodation product
	 */
	public void setProduct(final SessionContext ctx, final Accommodation value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAccoInventoryDetail.product</code> attribute. 
	 * @param value the product - Accommodation product
	 */
	public void setProduct(final Accommodation value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAccoInventoryDetail.products</code> attribute.
	 * @return the products
	 */
	public Collection<Accommodation> getProducts(final SessionContext ctx)
	{
		final List<Accommodation> items = getLinkedItems( 
			ctx,
			true,
			AccoinventorycoreConstants.Relations.ABSTRACTACCOINVENTORYDETAILTOACCOMMODATION,
			"Accommodation",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAccoInventoryDetail.products</code> attribute.
	 * @return the products
	 */
	public Collection<Accommodation> getProducts()
	{
		return getProducts( getSession().getSessionContext() );
	}
	
	public long getProductsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			AccoinventorycoreConstants.Relations.ABSTRACTACCOINVENTORYDETAILTOACCOMMODATION,
			"Accommodation",
			null
		);
	}
	
	public long getProductsCount()
	{
		return getProductsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAccoInventoryDetail.products</code> attribute. 
	 * @param value the products
	 */
	public void setProducts(final SessionContext ctx, final Collection<Accommodation> value)
	{
		setLinkedItems( 
			ctx,
			true,
			AccoinventorycoreConstants.Relations.ABSTRACTACCOINVENTORYDETAILTOACCOMMODATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTACCOINVENTORYDETAILTOACCOMMODATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAccoInventoryDetail.products</code> attribute. 
	 * @param value the products
	 */
	public void setProducts(final Collection<Accommodation> value)
	{
		setProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to products. 
	 * @param value the item to add to products
	 */
	public void addToProducts(final SessionContext ctx, final Accommodation value)
	{
		addLinkedItems( 
			ctx,
			true,
			AccoinventorycoreConstants.Relations.ABSTRACTACCOINVENTORYDETAILTOACCOMMODATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTACCOINVENTORYDETAILTOACCOMMODATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to products. 
	 * @param value the item to add to products
	 */
	public void addToProducts(final Accommodation value)
	{
		addToProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from products. 
	 * @param value the item to remove from products
	 */
	public void removeFromProducts(final SessionContext ctx, final Accommodation value)
	{
		removeLinkedItems( 
			ctx,
			true,
			AccoinventorycoreConstants.Relations.ABSTRACTACCOINVENTORYDETAILTOACCOMMODATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTACCOINVENTORYDETAILTOACCOMMODATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from products. 
	 * @param value the item to remove from products
	 */
	public void removeFromProducts(final Accommodation value)
	{
		removeFromProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAccoInventoryDetail.remark</code> attribute.
	 * @return the remark - Remark
	 */
	public String getRemark(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REMARK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAccoInventoryDetail.remark</code> attribute.
	 * @return the remark - Remark
	 */
	public String getRemark()
	{
		return getRemark( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAccoInventoryDetail.remark</code> attribute. 
	 * @param value the remark - Remark
	 */
	public void setRemark(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REMARK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAccoInventoryDetail.remark</code> attribute. 
	 * @param value the remark - Remark
	 */
	public void setRemark(final String value)
	{
		setRemark( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAccoInventoryDetail.travelChain</code> attribute.
	 * @return the travelChain - Travel Chain
	 */
	public AccommodationChain getTravelChain(final SessionContext ctx)
	{
		return (AccommodationChain)getProperty( ctx, TRAVELCHAIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAccoInventoryDetail.travelChain</code> attribute.
	 * @return the travelChain - Travel Chain
	 */
	public AccommodationChain getTravelChain()
	{
		return getTravelChain( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAccoInventoryDetail.travelChain</code> attribute. 
	 * @param value the travelChain - Travel Chain
	 */
	public void setTravelChain(final SessionContext ctx, final AccommodationChain value)
	{
		setProperty(ctx, TRAVELCHAIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAccoInventoryDetail.travelChain</code> attribute. 
	 * @param value the travelChain - Travel Chain
	 */
	public void setTravelChain(final AccommodationChain value)
	{
		setTravelChain( getSession().getSessionContext(), value );
	}
	
}
