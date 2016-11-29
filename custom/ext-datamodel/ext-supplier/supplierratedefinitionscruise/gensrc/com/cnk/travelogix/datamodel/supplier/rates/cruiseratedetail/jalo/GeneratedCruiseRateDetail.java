/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.cruiseratedetail.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.cruiseratedefinition.jalo.CruiseRateDefinition;
import com.cnk.travelogix.datamodel.supplier.rates.occupancydetail.jalo.OccupancyDetail;
import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer;
import com.cnk.travelogix.product.common.core.jalo.Cabin;
import com.cnk.travelogix.product.common.core.jalo.Deck;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscruiseConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractRateAdvDefinition;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.cruiseratedetail.jalo.CruiseRateDetail CruiseRateDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCruiseRateDetail extends GenericItem
{
	/** Qualifier of the <code>CruiseRateDetail.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>CruiseRateDetail.deck</code> attribute **/
	public static final String DECK = "deck";
	/** Qualifier of the <code>CruiseRateDetail.cabin</code> attribute **/
	public static final String CABIN = "cabin";
	/** Qualifier of the <code>CruiseRateDetail.abstractRateAdvDefinition</code> attribute **/
	public static final String ABSTRACTRATEADVDEFINITION = "abstractRateAdvDefinition";
	/** Qualifier of the <code>CruiseRateDetail.occupancyDetails</code> attribute **/
	public static final String OCCUPANCYDETAILS = "occupancyDetails";
	/** Qualifier of the <code>CruiseRateDetail.cruiseratedefinition</code> attribute **/
	public static final String CRUISERATEDEFINITION = "cruiseratedefinition";
	/** Qualifier of the <code>CruiseRateDetail.absTravelogixSupplierOffers</code> attribute **/
	public static final String ABSTRAVELOGIXSUPPLIEROFFERS = "absTravelogixSupplierOffers";
	/**
	* {@link OneToManyHandler} for handling 1:n OCCUPANCYDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<OccupancyDetail> OCCUPANCYDETAILSHANDLER = new OneToManyHandler<OccupancyDetail>(
	SupplierratedefinitionscruiseConstants.TC.OCCUPANCYDETAIL,
	true,
	"cruiseratedetail",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CRUISERATEDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCruiseRateDetail> CRUISERATEDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedCruiseRateDetail>(
	SupplierratedefinitionscruiseConstants.TC.CRUISERATEDETAIL,
	false,
	"cruiseratedefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ABSTRAVELOGIXSUPPLIEROFFERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AbstractTravelogixSupplierOffer> ABSTRAVELOGIXSUPPLIEROFFERSHANDLER = new OneToManyHandler<AbstractTravelogixSupplierOffer>(
	SupplierratedefinitionscoreConstants.TC.ABSTRACTTRAVELOGIXSUPPLIEROFFER,
	false,
	"cruiseratedetail",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(DECK, AttributeMode.INITIAL);
		tmp.put(CABIN, AttributeMode.INITIAL);
		tmp.put(ABSTRACTRATEADVDEFINITION, AttributeMode.INITIAL);
		tmp.put(CRUISERATEDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDetail.abstractRateAdvDefinition</code> attribute.
	 * @return the abstractRateAdvDefinition
	 */
	public AbstractRateAdvDefinition getAbstractRateAdvDefinition(final SessionContext ctx)
	{
		return (AbstractRateAdvDefinition)getProperty( ctx, ABSTRACTRATEADVDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDetail.abstractRateAdvDefinition</code> attribute.
	 * @return the abstractRateAdvDefinition
	 */
	public AbstractRateAdvDefinition getAbstractRateAdvDefinition()
	{
		return getAbstractRateAdvDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDetail.abstractRateAdvDefinition</code> attribute. 
	 * @param value the abstractRateAdvDefinition
	 */
	public void setAbstractRateAdvDefinition(final SessionContext ctx, final AbstractRateAdvDefinition value)
	{
		setProperty(ctx, ABSTRACTRATEADVDEFINITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDetail.abstractRateAdvDefinition</code> attribute. 
	 * @param value the abstractRateAdvDefinition
	 */
	public void setAbstractRateAdvDefinition(final AbstractRateAdvDefinition value)
	{
		setAbstractRateAdvDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDetail.absTravelogixSupplierOffers</code> attribute.
	 * @return the absTravelogixSupplierOffers
	 */
	public Collection<AbstractTravelogixSupplierOffer> getAbsTravelogixSupplierOffers(final SessionContext ctx)
	{
		return ABSTRAVELOGIXSUPPLIEROFFERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDetail.absTravelogixSupplierOffers</code> attribute.
	 * @return the absTravelogixSupplierOffers
	 */
	public Collection<AbstractTravelogixSupplierOffer> getAbsTravelogixSupplierOffers()
	{
		return getAbsTravelogixSupplierOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDetail.absTravelogixSupplierOffers</code> attribute. 
	 * @param value the absTravelogixSupplierOffers
	 */
	public void setAbsTravelogixSupplierOffers(final SessionContext ctx, final Collection<AbstractTravelogixSupplierOffer> value)
	{
		ABSTRAVELOGIXSUPPLIEROFFERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDetail.absTravelogixSupplierOffers</code> attribute. 
	 * @param value the absTravelogixSupplierOffers
	 */
	public void setAbsTravelogixSupplierOffers(final Collection<AbstractTravelogixSupplierOffer> value)
	{
		setAbsTravelogixSupplierOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to absTravelogixSupplierOffers. 
	 * @param value the item to add to absTravelogixSupplierOffers
	 */
	public void addToAbsTravelogixSupplierOffers(final SessionContext ctx, final AbstractTravelogixSupplierOffer value)
	{
		ABSTRAVELOGIXSUPPLIEROFFERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to absTravelogixSupplierOffers. 
	 * @param value the item to add to absTravelogixSupplierOffers
	 */
	public void addToAbsTravelogixSupplierOffers(final AbstractTravelogixSupplierOffer value)
	{
		addToAbsTravelogixSupplierOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from absTravelogixSupplierOffers. 
	 * @param value the item to remove from absTravelogixSupplierOffers
	 */
	public void removeFromAbsTravelogixSupplierOffers(final SessionContext ctx, final AbstractTravelogixSupplierOffer value)
	{
		ABSTRAVELOGIXSUPPLIEROFFERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from absTravelogixSupplierOffers. 
	 * @param value the item to remove from absTravelogixSupplierOffers
	 */
	public void removeFromAbsTravelogixSupplierOffers(final AbstractTravelogixSupplierOffer value)
	{
		removeFromAbsTravelogixSupplierOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDetail.cabin</code> attribute.
	 * @return the cabin
	 */
	public Cabin getCabin(final SessionContext ctx)
	{
		return (Cabin)getProperty( ctx, CABIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDetail.cabin</code> attribute.
	 * @return the cabin
	 */
	public Cabin getCabin()
	{
		return getCabin( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDetail.cabin</code> attribute. 
	 * @param value the cabin
	 */
	public void setCabin(final SessionContext ctx, final Cabin value)
	{
		setProperty(ctx, CABIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDetail.cabin</code> attribute. 
	 * @param value the cabin
	 */
	public void setCabin(final Cabin value)
	{
		setCabin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDetail.code</code> attribute.
	 * @return the code
	 */
	public Integer getCode(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDetail.code</code> attribute.
	 * @return the code
	 */
	public Integer getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDetail.code</code> attribute. 
	 * @return the code
	 */
	public int getCodeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCode( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDetail.code</code> attribute. 
	 * @return the code
	 */
	public int getCodeAsPrimitive()
	{
		return getCodeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDetail.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDetail.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final Integer value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDetail.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final int value)
	{
		setCode( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDetail.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final int value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CRUISERATEDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDetail.cruiseratedefinition</code> attribute.
	 * @return the cruiseratedefinition
	 */
	public CruiseRateDefinition getCruiseratedefinition(final SessionContext ctx)
	{
		return (CruiseRateDefinition)getProperty( ctx, CRUISERATEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDetail.cruiseratedefinition</code> attribute.
	 * @return the cruiseratedefinition
	 */
	public CruiseRateDefinition getCruiseratedefinition()
	{
		return getCruiseratedefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDetail.cruiseratedefinition</code> attribute. 
	 * @param value the cruiseratedefinition
	 */
	public void setCruiseratedefinition(final SessionContext ctx, final CruiseRateDefinition value)
	{
		CRUISERATEDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDetail.cruiseratedefinition</code> attribute. 
	 * @param value the cruiseratedefinition
	 */
	public void setCruiseratedefinition(final CruiseRateDefinition value)
	{
		setCruiseratedefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDetail.deck</code> attribute.
	 * @return the deck
	 */
	public Deck getDeck(final SessionContext ctx)
	{
		return (Deck)getProperty( ctx, DECK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDetail.deck</code> attribute.
	 * @return the deck
	 */
	public Deck getDeck()
	{
		return getDeck( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDetail.deck</code> attribute. 
	 * @param value the deck
	 */
	public void setDeck(final SessionContext ctx, final Deck value)
	{
		setProperty(ctx, DECK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDetail.deck</code> attribute. 
	 * @param value the deck
	 */
	public void setDeck(final Deck value)
	{
		setDeck( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDetail.occupancyDetails</code> attribute.
	 * @return the occupancyDetails
	 */
	public Collection<OccupancyDetail> getOccupancyDetails(final SessionContext ctx)
	{
		return OCCUPANCYDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDetail.occupancyDetails</code> attribute.
	 * @return the occupancyDetails
	 */
	public Collection<OccupancyDetail> getOccupancyDetails()
	{
		return getOccupancyDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDetail.occupancyDetails</code> attribute. 
	 * @param value the occupancyDetails
	 */
	public void setOccupancyDetails(final SessionContext ctx, final Collection<OccupancyDetail> value)
	{
		OCCUPANCYDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDetail.occupancyDetails</code> attribute. 
	 * @param value the occupancyDetails
	 */
	public void setOccupancyDetails(final Collection<OccupancyDetail> value)
	{
		setOccupancyDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to occupancyDetails. 
	 * @param value the item to add to occupancyDetails
	 */
	public void addToOccupancyDetails(final SessionContext ctx, final OccupancyDetail value)
	{
		OCCUPANCYDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to occupancyDetails. 
	 * @param value the item to add to occupancyDetails
	 */
	public void addToOccupancyDetails(final OccupancyDetail value)
	{
		addToOccupancyDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from occupancyDetails. 
	 * @param value the item to remove from occupancyDetails
	 */
	public void removeFromOccupancyDetails(final SessionContext ctx, final OccupancyDetail value)
	{
		OCCUPANCYDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from occupancyDetails. 
	 * @param value the item to remove from occupancyDetails
	 */
	public void removeFromOccupancyDetails(final OccupancyDetail value)
	{
		removeFromOccupancyDetails( getSession().getSessionContext(), value );
	}
	
}
