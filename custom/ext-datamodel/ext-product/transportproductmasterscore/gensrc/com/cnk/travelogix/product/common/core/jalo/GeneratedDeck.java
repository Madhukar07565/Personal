/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.product.common.core.jalo.Ship;
import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import com.cnk.travelogix.product.transport.masters.core.jalo.FacilityDetail;
import de.hybris.platform.jalo.ConsistencyCheckException;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.PartOfHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.Deck Deck}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDeck extends GenericItem
{
	/** Qualifier of the <code>Deck.deckName</code> attribute **/
	public static final String DECKNAME = "deckName";
	/** Qualifier of the <code>Deck.deckLevel</code> attribute **/
	public static final String DECKLEVEL = "deckLevel";
	/** Qualifier of the <code>Deck.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>Deck.deckFacilities</code> attribute **/
	public static final String DECKFACILITIES = "deckFacilities";
	/** Relation ordering override parameter constants for DeckToFacilities from ((transportproductmasterscore))*/
	protected static String DECKTOFACILITIES_SRC_ORDERED = "relation.DeckToFacilities.source.ordered";
	protected static String DECKTOFACILITIES_TGT_ORDERED = "relation.DeckToFacilities.target.ordered";
	/** Relation disable markmodifed parameter constants for DeckToFacilities from ((transportproductmasterscore))*/
	protected static String DECKTOFACILITIES_MARKMODIFIED = "relation.DeckToFacilities.markmodified";
	/** Qualifier of the <code>Deck.ship</code> attribute **/
	public static final String SHIP = "ship";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SHIP's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDeck> SHIPHANDLER = new BidirectionalOneToManyHandler<GeneratedDeck>(
	TransportproductmasterscoreConstants.TC.DECK,
	false,
	"ship",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DECKNAME, AttributeMode.INITIAL);
		tmp.put(DECKLEVEL, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(SHIP, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		SHIPHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Deck.deckFacilities</code> attribute.
	 * @return the deckFacilities
	 */
	public Collection<FacilityDetail> getDeckFacilities(final SessionContext ctx)
	{
		final List<FacilityDetail> items = getLinkedItems( 
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.DECKTOFACILITIES,
			"FacilityDetail",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Deck.deckFacilities</code> attribute.
	 * @return the deckFacilities
	 */
	public Collection<FacilityDetail> getDeckFacilities()
	{
		return getDeckFacilities( getSession().getSessionContext() );
	}
	
	public long getDeckFacilitiesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.DECKTOFACILITIES,
			"FacilityDetail",
			null
		);
	}
	
	public long getDeckFacilitiesCount()
	{
		return getDeckFacilitiesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Deck.deckFacilities</code> attribute. 
	 * @param value the deckFacilities
	 */
	public void setDeckFacilities(final SessionContext ctx, final Collection<FacilityDetail> value)
	{
		new PartOfHandler<Collection<FacilityDetail>>()
		{
			@Override
			protected Collection<FacilityDetail> doGetValue(final SessionContext ctx)
			{
				return getDeckFacilities( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final Collection<FacilityDetail> _value)
			{
				final Collection<FacilityDetail> value = _value;
				setLinkedItems( 
					ctx,
					true,
					TransportproductmasterscoreConstants.Relations.DECKTOFACILITIES,
					null,
					value,
					false,
					false,
					Utilities.getMarkModifiedOverride(DECKTOFACILITIES_MARKMODIFIED)
				);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Deck.deckFacilities</code> attribute. 
	 * @param value the deckFacilities
	 */
	public void setDeckFacilities(final Collection<FacilityDetail> value)
	{
		setDeckFacilities( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to deckFacilities. 
	 * @param value the item to add to deckFacilities
	 */
	public void addToDeckFacilities(final SessionContext ctx, final FacilityDetail value)
	{
		addLinkedItems( 
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.DECKTOFACILITIES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DECKTOFACILITIES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to deckFacilities. 
	 * @param value the item to add to deckFacilities
	 */
	public void addToDeckFacilities(final FacilityDetail value)
	{
		addToDeckFacilities( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from deckFacilities. 
	 * @param value the item to remove from deckFacilities
	 */
	public void removeFromDeckFacilities(final SessionContext ctx, final FacilityDetail value)
	{
		removeLinkedItems( 
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.DECKTOFACILITIES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DECKTOFACILITIES_MARKMODIFIED)
		);
		if( !getLinkedItems( ctx, true,TransportproductmasterscoreConstants.Relations.DECKTOFACILITIES,null).contains( value ) )
		{
			try
			{
				value.remove( ctx );
			}
			catch( ConsistencyCheckException e )
			{
				throw new JaloSystemException(e);
			}
		}
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from deckFacilities. 
	 * @param value the item to remove from deckFacilities
	 */
	public void removeFromDeckFacilities(final FacilityDetail value)
	{
		removeFromDeckFacilities( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Deck.deckLevel</code> attribute.
	 * @return the deckLevel - Deck Level
	 */
	public String getDeckLevel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DECKLEVEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Deck.deckLevel</code> attribute.
	 * @return the deckLevel - Deck Level
	 */
	public String getDeckLevel()
	{
		return getDeckLevel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Deck.deckLevel</code> attribute. 
	 * @param value the deckLevel - Deck Level
	 */
	public void setDeckLevel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DECKLEVEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Deck.deckLevel</code> attribute. 
	 * @param value the deckLevel - Deck Level
	 */
	public void setDeckLevel(final String value)
	{
		setDeckLevel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Deck.deckName</code> attribute.
	 * @return the deckName - Deck Name
	 */
	public String getDeckName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DECKNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Deck.deckName</code> attribute.
	 * @return the deckName - Deck Name
	 */
	public String getDeckName()
	{
		return getDeckName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Deck.deckName</code> attribute. 
	 * @param value the deckName - Deck Name
	 */
	public void setDeckName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DECKNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Deck.deckName</code> attribute. 
	 * @param value the deckName - Deck Name
	 */
	public void setDeckName(final String value)
	{
		setDeckName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Deck.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDeck.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Deck.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Deck.description</code> attribute. 
	 * @return the localized description - Description
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Deck.description</code> attribute. 
	 * @return the localized description - Description
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Deck.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDeck.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Deck.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Deck.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Deck.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Deck.ship</code> attribute.
	 * @return the ship
	 */
	public Ship getShip(final SessionContext ctx)
	{
		return (Ship)getProperty( ctx, SHIP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Deck.ship</code> attribute.
	 * @return the ship
	 */
	public Ship getShip()
	{
		return getShip( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Deck.ship</code> attribute. 
	 * @param value the ship
	 */
	public void setShip(final SessionContext ctx, final Ship value)
	{
		SHIPHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Deck.ship</code> attribute. 
	 * @param value the ship
	 */
	public void setShip(final Ship value)
	{
		setShip( getSession().getSessionContext(), value );
	}
	
}
