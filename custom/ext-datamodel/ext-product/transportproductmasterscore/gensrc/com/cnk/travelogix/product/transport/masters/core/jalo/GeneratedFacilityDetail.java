/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.product.common.core.jalo.Cabin;
import com.cnk.travelogix.product.common.core.jalo.Deck;
import com.cnk.travelogix.product.common.core.jalo.Ship;
import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import com.cnk.travelogix.product.transport.masters.core.jalo.AbstractFacility;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.transport.masters.core.jalo.FacilityDetail FacilityDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFacilityDetail extends AbstractFacility
{
	/** Qualifier of the <code>FacilityDetail.medias</code> attribute **/
	public static final String MEDIAS = "medias";
	/** Qualifier of the <code>FacilityDetail.ship</code> attribute **/
	public static final String SHIP = "ship";
	/** Relation ordering override parameter constants for ShipToFacilities from ((transportproductmasterscore))*/
	protected static String SHIPTOFACILITIES_SRC_ORDERED = "relation.ShipToFacilities.source.ordered";
	protected static String SHIPTOFACILITIES_TGT_ORDERED = "relation.ShipToFacilities.target.ordered";
	/** Relation disable markmodifed parameter constants for ShipToFacilities from ((transportproductmasterscore))*/
	protected static String SHIPTOFACILITIES_MARKMODIFIED = "relation.ShipToFacilities.markmodified";
	/** Qualifier of the <code>FacilityDetail.cabin</code> attribute **/
	public static final String CABIN = "cabin";
	/** Relation ordering override parameter constants for CabinToCabinFacilities from ((transportproductmasterscore))*/
	protected static String CABINTOCABINFACILITIES_SRC_ORDERED = "relation.CabinToCabinFacilities.source.ordered";
	protected static String CABINTOCABINFACILITIES_TGT_ORDERED = "relation.CabinToCabinFacilities.target.ordered";
	/** Relation disable markmodifed parameter constants for CabinToCabinFacilities from ((transportproductmasterscore))*/
	protected static String CABINTOCABINFACILITIES_MARKMODIFIED = "relation.CabinToCabinFacilities.markmodified";
	/** Qualifier of the <code>FacilityDetail.deck</code> attribute **/
	public static final String DECK = "deck";
	/** Relation ordering override parameter constants for DeckToFacilities from ((transportproductmasterscore))*/
	protected static String DECKTOFACILITIES_SRC_ORDERED = "relation.DeckToFacilities.source.ordered";
	protected static String DECKTOFACILITIES_TGT_ORDERED = "relation.DeckToFacilities.target.ordered";
	/** Relation disable markmodifed parameter constants for DeckToFacilities from ((transportproductmasterscore))*/
	protected static String DECKTOFACILITIES_MARKMODIFIED = "relation.DeckToFacilities.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractFacility.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MEDIAS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FacilityDetail.cabin</code> attribute.
	 * @return the cabin
	 */
	public Collection<Cabin> getCabin(final SessionContext ctx)
	{
		final List<Cabin> items = getLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.CABINTOCABINFACILITIES,
			"Cabin",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FacilityDetail.cabin</code> attribute.
	 * @return the cabin
	 */
	public Collection<Cabin> getCabin()
	{
		return getCabin( getSession().getSessionContext() );
	}
	
	public long getCabinCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.CABINTOCABINFACILITIES,
			"Cabin",
			null
		);
	}
	
	public long getCabinCount()
	{
		return getCabinCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FacilityDetail.cabin</code> attribute. 
	 * @param value the cabin
	 */
	public void setCabin(final SessionContext ctx, final Collection<Cabin> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.CABINTOCABINFACILITIES,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(CABINTOCABINFACILITIES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FacilityDetail.cabin</code> attribute. 
	 * @param value the cabin
	 */
	public void setCabin(final Collection<Cabin> value)
	{
		setCabin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cabin. 
	 * @param value the item to add to cabin
	 */
	public void addToCabin(final SessionContext ctx, final Cabin value)
	{
		addLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.CABINTOCABINFACILITIES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CABINTOCABINFACILITIES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cabin. 
	 * @param value the item to add to cabin
	 */
	public void addToCabin(final Cabin value)
	{
		addToCabin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cabin. 
	 * @param value the item to remove from cabin
	 */
	public void removeFromCabin(final SessionContext ctx, final Cabin value)
	{
		removeLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.CABINTOCABINFACILITIES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CABINTOCABINFACILITIES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cabin. 
	 * @param value the item to remove from cabin
	 */
	public void removeFromCabin(final Cabin value)
	{
		removeFromCabin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FacilityDetail.deck</code> attribute.
	 * @return the deck
	 */
	public Collection<Deck> getDeck(final SessionContext ctx)
	{
		final List<Deck> items = getLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.DECKTOFACILITIES,
			"Deck",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FacilityDetail.deck</code> attribute.
	 * @return the deck
	 */
	public Collection<Deck> getDeck()
	{
		return getDeck( getSession().getSessionContext() );
	}
	
	public long getDeckCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.DECKTOFACILITIES,
			"Deck",
			null
		);
	}
	
	public long getDeckCount()
	{
		return getDeckCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FacilityDetail.deck</code> attribute. 
	 * @param value the deck
	 */
	public void setDeck(final SessionContext ctx, final Collection<Deck> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.DECKTOFACILITIES,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(DECKTOFACILITIES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FacilityDetail.deck</code> attribute. 
	 * @param value the deck
	 */
	public void setDeck(final Collection<Deck> value)
	{
		setDeck( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to deck. 
	 * @param value the item to add to deck
	 */
	public void addToDeck(final SessionContext ctx, final Deck value)
	{
		addLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.DECKTOFACILITIES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DECKTOFACILITIES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to deck. 
	 * @param value the item to add to deck
	 */
	public void addToDeck(final Deck value)
	{
		addToDeck( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from deck. 
	 * @param value the item to remove from deck
	 */
	public void removeFromDeck(final SessionContext ctx, final Deck value)
	{
		removeLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.DECKTOFACILITIES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DECKTOFACILITIES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from deck. 
	 * @param value the item to remove from deck
	 */
	public void removeFromDeck(final Deck value)
	{
		removeFromDeck( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FacilityDetail.medias</code> attribute.
	 * @return the medias - Media Collections
	 */
	public Collection<Media> getMedias(final SessionContext ctx)
	{
		Collection<Media> coll = (Collection<Media>)getProperty( ctx, MEDIAS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FacilityDetail.medias</code> attribute.
	 * @return the medias - Media Collections
	 */
	public Collection<Media> getMedias()
	{
		return getMedias( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FacilityDetail.medias</code> attribute. 
	 * @param value the medias - Media Collections
	 */
	public void setMedias(final SessionContext ctx, final Collection<Media> value)
	{
		setProperty(ctx, MEDIAS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FacilityDetail.medias</code> attribute. 
	 * @param value the medias - Media Collections
	 */
	public void setMedias(final Collection<Media> value)
	{
		setMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FacilityDetail.ship</code> attribute.
	 * @return the ship
	 */
	public Collection<Ship> getShip(final SessionContext ctx)
	{
		final List<Ship> items = getLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.SHIPTOFACILITIES,
			"Ship",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FacilityDetail.ship</code> attribute.
	 * @return the ship
	 */
	public Collection<Ship> getShip()
	{
		return getShip( getSession().getSessionContext() );
	}
	
	public long getShipCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.SHIPTOFACILITIES,
			"Ship",
			null
		);
	}
	
	public long getShipCount()
	{
		return getShipCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FacilityDetail.ship</code> attribute. 
	 * @param value the ship
	 */
	public void setShip(final SessionContext ctx, final Collection<Ship> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.SHIPTOFACILITIES,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SHIPTOFACILITIES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FacilityDetail.ship</code> attribute. 
	 * @param value the ship
	 */
	public void setShip(final Collection<Ship> value)
	{
		setShip( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ship. 
	 * @param value the item to add to ship
	 */
	public void addToShip(final SessionContext ctx, final Ship value)
	{
		addLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.SHIPTOFACILITIES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SHIPTOFACILITIES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ship. 
	 * @param value the item to add to ship
	 */
	public void addToShip(final Ship value)
	{
		addToShip( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ship. 
	 * @param value the item to remove from ship
	 */
	public void removeFromShip(final SessionContext ctx, final Ship value)
	{
		removeLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.SHIPTOFACILITIES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SHIPTOFACILITIES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ship. 
	 * @param value the item to remove from ship
	 */
	public void removeFromShip(final Ship value)
	{
		removeFromShip( getSession().getSessionContext(), value );
	}
	
}
