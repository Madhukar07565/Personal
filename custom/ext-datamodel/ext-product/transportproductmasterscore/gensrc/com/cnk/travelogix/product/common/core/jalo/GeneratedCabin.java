/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.product.common.core.jalo.Deck;
import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import com.cnk.travelogix.product.transport.masters.core.jalo.CabinOccupancy;
import com.cnk.travelogix.product.transport.masters.core.jalo.FacilityDetail;
import de.hybris.platform.jalo.ConsistencyCheckException;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.util.PartOfHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.Cabin Cabin}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCabin extends GenericItem
{
	/** Qualifier of the <code>Cabin.cabinType</code> attribute **/
	public static final String CABINTYPE = "cabinType";
	/** Qualifier of the <code>Cabin.cabinCategory</code> attribute **/
	public static final String CABINCATEGORY = "cabinCategory";
	/** Qualifier of the <code>Cabin.deck</code> attribute **/
	public static final String DECK = "deck";
	/** Qualifier of the <code>Cabin.numberOfCabin</code> attribute **/
	public static final String NUMBEROFCABIN = "numberOfCabin";
	/** Qualifier of the <code>Cabin.cabinSize</code> attribute **/
	public static final String CABINSIZE = "cabinSize";
	/** Qualifier of the <code>Cabin.unit</code> attribute **/
	public static final String UNIT = "unit";
	/** Qualifier of the <code>Cabin.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>Cabin.cabinOccupancies</code> attribute **/
	public static final String CABINOCCUPANCIES = "cabinOccupancies";
	/** Relation ordering override parameter constants for CabinToCabinOccupancies from ((transportproductmasterscore))*/
	protected static String CABINTOCABINOCCUPANCIES_SRC_ORDERED = "relation.CabinToCabinOccupancies.source.ordered";
	protected static String CABINTOCABINOCCUPANCIES_TGT_ORDERED = "relation.CabinToCabinOccupancies.target.ordered";
	/** Relation disable markmodifed parameter constants for CabinToCabinOccupancies from ((transportproductmasterscore))*/
	protected static String CABINTOCABINOCCUPANCIES_MARKMODIFIED = "relation.CabinToCabinOccupancies.markmodified";
	/** Qualifier of the <code>Cabin.cabinFacilities</code> attribute **/
	public static final String CABINFACILITIES = "cabinFacilities";
	/** Relation ordering override parameter constants for CabinToCabinFacilities from ((transportproductmasterscore))*/
	protected static String CABINTOCABINFACILITIES_SRC_ORDERED = "relation.CabinToCabinFacilities.source.ordered";
	protected static String CABINTOCABINFACILITIES_TGT_ORDERED = "relation.CabinToCabinFacilities.target.ordered";
	/** Relation disable markmodifed parameter constants for CabinToCabinFacilities from ((transportproductmasterscore))*/
	protected static String CABINTOCABINFACILITIES_MARKMODIFIED = "relation.CabinToCabinFacilities.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CABINTYPE, AttributeMode.INITIAL);
		tmp.put(CABINCATEGORY, AttributeMode.INITIAL);
		tmp.put(DECK, AttributeMode.INITIAL);
		tmp.put(NUMBEROFCABIN, AttributeMode.INITIAL);
		tmp.put(CABINSIZE, AttributeMode.INITIAL);
		tmp.put(UNIT, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cabin.cabinCategory</code> attribute.
	 * @return the cabinCategory - Cabin Category
	 */
	public EnumerationValue getCabinCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CABINCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cabin.cabinCategory</code> attribute.
	 * @return the cabinCategory - Cabin Category
	 */
	public EnumerationValue getCabinCategory()
	{
		return getCabinCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cabin.cabinCategory</code> attribute. 
	 * @param value the cabinCategory - Cabin Category
	 */
	public void setCabinCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CABINCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cabin.cabinCategory</code> attribute. 
	 * @param value the cabinCategory - Cabin Category
	 */
	public void setCabinCategory(final EnumerationValue value)
	{
		setCabinCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cabin.cabinFacilities</code> attribute.
	 * @return the cabinFacilities
	 */
	public Collection<FacilityDetail> getCabinFacilities(final SessionContext ctx)
	{
		final List<FacilityDetail> items = getLinkedItems( 
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.CABINTOCABINFACILITIES,
			"FacilityDetail",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cabin.cabinFacilities</code> attribute.
	 * @return the cabinFacilities
	 */
	public Collection<FacilityDetail> getCabinFacilities()
	{
		return getCabinFacilities( getSession().getSessionContext() );
	}
	
	public long getCabinFacilitiesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.CABINTOCABINFACILITIES,
			"FacilityDetail",
			null
		);
	}
	
	public long getCabinFacilitiesCount()
	{
		return getCabinFacilitiesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cabin.cabinFacilities</code> attribute. 
	 * @param value the cabinFacilities
	 */
	public void setCabinFacilities(final SessionContext ctx, final Collection<FacilityDetail> value)
	{
		new PartOfHandler<Collection<FacilityDetail>>()
		{
			@Override
			protected Collection<FacilityDetail> doGetValue(final SessionContext ctx)
			{
				return getCabinFacilities( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final Collection<FacilityDetail> _value)
			{
				final Collection<FacilityDetail> value = _value;
				setLinkedItems( 
					ctx,
					true,
					TransportproductmasterscoreConstants.Relations.CABINTOCABINFACILITIES,
					null,
					value,
					false,
					false,
					Utilities.getMarkModifiedOverride(CABINTOCABINFACILITIES_MARKMODIFIED)
				);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cabin.cabinFacilities</code> attribute. 
	 * @param value the cabinFacilities
	 */
	public void setCabinFacilities(final Collection<FacilityDetail> value)
	{
		setCabinFacilities( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cabinFacilities. 
	 * @param value the item to add to cabinFacilities
	 */
	public void addToCabinFacilities(final SessionContext ctx, final FacilityDetail value)
	{
		addLinkedItems( 
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.CABINTOCABINFACILITIES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CABINTOCABINFACILITIES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cabinFacilities. 
	 * @param value the item to add to cabinFacilities
	 */
	public void addToCabinFacilities(final FacilityDetail value)
	{
		addToCabinFacilities( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cabinFacilities. 
	 * @param value the item to remove from cabinFacilities
	 */
	public void removeFromCabinFacilities(final SessionContext ctx, final FacilityDetail value)
	{
		removeLinkedItems( 
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.CABINTOCABINFACILITIES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CABINTOCABINFACILITIES_MARKMODIFIED)
		);
		if( !getLinkedItems( ctx, true,TransportproductmasterscoreConstants.Relations.CABINTOCABINFACILITIES,null).contains( value ) )
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
	 * <i>Generated method</i> - Removes <code>value</code> from cabinFacilities. 
	 * @param value the item to remove from cabinFacilities
	 */
	public void removeFromCabinFacilities(final FacilityDetail value)
	{
		removeFromCabinFacilities( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cabin.cabinOccupancies</code> attribute.
	 * @return the cabinOccupancies
	 */
	public Collection<CabinOccupancy> getCabinOccupancies(final SessionContext ctx)
	{
		final List<CabinOccupancy> items = getLinkedItems( 
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.CABINTOCABINOCCUPANCIES,
			"CabinOccupancy",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cabin.cabinOccupancies</code> attribute.
	 * @return the cabinOccupancies
	 */
	public Collection<CabinOccupancy> getCabinOccupancies()
	{
		return getCabinOccupancies( getSession().getSessionContext() );
	}
	
	public long getCabinOccupanciesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.CABINTOCABINOCCUPANCIES,
			"CabinOccupancy",
			null
		);
	}
	
	public long getCabinOccupanciesCount()
	{
		return getCabinOccupanciesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cabin.cabinOccupancies</code> attribute. 
	 * @param value the cabinOccupancies
	 */
	public void setCabinOccupancies(final SessionContext ctx, final Collection<CabinOccupancy> value)
	{
		new PartOfHandler<Collection<CabinOccupancy>>()
		{
			@Override
			protected Collection<CabinOccupancy> doGetValue(final SessionContext ctx)
			{
				return getCabinOccupancies( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final Collection<CabinOccupancy> _value)
			{
				final Collection<CabinOccupancy> value = _value;
				setLinkedItems( 
					ctx,
					true,
					TransportproductmasterscoreConstants.Relations.CABINTOCABINOCCUPANCIES,
					null,
					value,
					false,
					false,
					Utilities.getMarkModifiedOverride(CABINTOCABINOCCUPANCIES_MARKMODIFIED)
				);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cabin.cabinOccupancies</code> attribute. 
	 * @param value the cabinOccupancies
	 */
	public void setCabinOccupancies(final Collection<CabinOccupancy> value)
	{
		setCabinOccupancies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cabinOccupancies. 
	 * @param value the item to add to cabinOccupancies
	 */
	public void addToCabinOccupancies(final SessionContext ctx, final CabinOccupancy value)
	{
		addLinkedItems( 
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.CABINTOCABINOCCUPANCIES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CABINTOCABINOCCUPANCIES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cabinOccupancies. 
	 * @param value the item to add to cabinOccupancies
	 */
	public void addToCabinOccupancies(final CabinOccupancy value)
	{
		addToCabinOccupancies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cabinOccupancies. 
	 * @param value the item to remove from cabinOccupancies
	 */
	public void removeFromCabinOccupancies(final SessionContext ctx, final CabinOccupancy value)
	{
		removeLinkedItems( 
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.CABINTOCABINOCCUPANCIES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CABINTOCABINOCCUPANCIES_MARKMODIFIED)
		);
		if( !getLinkedItems( ctx, true,TransportproductmasterscoreConstants.Relations.CABINTOCABINOCCUPANCIES,null).contains( value ) )
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
	 * <i>Generated method</i> - Removes <code>value</code> from cabinOccupancies. 
	 * @param value the item to remove from cabinOccupancies
	 */
	public void removeFromCabinOccupancies(final CabinOccupancy value)
	{
		removeFromCabinOccupancies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cabin.cabinSize</code> attribute.
	 * @return the cabinSize - Cabin Size
	 */
	public Integer getCabinSize(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, CABINSIZE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cabin.cabinSize</code> attribute.
	 * @return the cabinSize - Cabin Size
	 */
	public Integer getCabinSize()
	{
		return getCabinSize( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cabin.cabinSize</code> attribute. 
	 * @return the cabinSize - Cabin Size
	 */
	public int getCabinSizeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCabinSize( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cabin.cabinSize</code> attribute. 
	 * @return the cabinSize - Cabin Size
	 */
	public int getCabinSizeAsPrimitive()
	{
		return getCabinSizeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cabin.cabinSize</code> attribute. 
	 * @param value the cabinSize - Cabin Size
	 */
	public void setCabinSize(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, CABINSIZE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cabin.cabinSize</code> attribute. 
	 * @param value the cabinSize - Cabin Size
	 */
	public void setCabinSize(final Integer value)
	{
		setCabinSize( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cabin.cabinSize</code> attribute. 
	 * @param value the cabinSize - Cabin Size
	 */
	public void setCabinSize(final SessionContext ctx, final int value)
	{
		setCabinSize( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cabin.cabinSize</code> attribute. 
	 * @param value the cabinSize - Cabin Size
	 */
	public void setCabinSize(final int value)
	{
		setCabinSize( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cabin.cabinType</code> attribute.
	 * @return the cabinType - Cabin Type
	 */
	public EnumerationValue getCabinType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CABINTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cabin.cabinType</code> attribute.
	 * @return the cabinType - Cabin Type
	 */
	public EnumerationValue getCabinType()
	{
		return getCabinType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cabin.cabinType</code> attribute. 
	 * @param value the cabinType - Cabin Type
	 */
	public void setCabinType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CABINTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cabin.cabinType</code> attribute. 
	 * @param value the cabinType - Cabin Type
	 */
	public void setCabinType(final EnumerationValue value)
	{
		setCabinType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cabin.deck</code> attribute.
	 * @return the deck - Deck
	 */
	public Deck getDeck(final SessionContext ctx)
	{
		return (Deck)getProperty( ctx, DECK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cabin.deck</code> attribute.
	 * @return the deck - Deck
	 */
	public Deck getDeck()
	{
		return getDeck( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cabin.deck</code> attribute. 
	 * @param value the deck - Deck
	 */
	public void setDeck(final SessionContext ctx, final Deck value)
	{
		setProperty(ctx, DECK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cabin.deck</code> attribute. 
	 * @param value the deck - Deck
	 */
	public void setDeck(final Deck value)
	{
		setDeck( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cabin.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cabin.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cabin.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cabin.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cabin.numberOfCabin</code> attribute.
	 * @return the numberOfCabin - Number Of Cabin
	 */
	public Integer getNumberOfCabin(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NUMBEROFCABIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cabin.numberOfCabin</code> attribute.
	 * @return the numberOfCabin - Number Of Cabin
	 */
	public Integer getNumberOfCabin()
	{
		return getNumberOfCabin( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cabin.numberOfCabin</code> attribute. 
	 * @return the numberOfCabin - Number Of Cabin
	 */
	public int getNumberOfCabinAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNumberOfCabin( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cabin.numberOfCabin</code> attribute. 
	 * @return the numberOfCabin - Number Of Cabin
	 */
	public int getNumberOfCabinAsPrimitive()
	{
		return getNumberOfCabinAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cabin.numberOfCabin</code> attribute. 
	 * @param value the numberOfCabin - Number Of Cabin
	 */
	public void setNumberOfCabin(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NUMBEROFCABIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cabin.numberOfCabin</code> attribute. 
	 * @param value the numberOfCabin - Number Of Cabin
	 */
	public void setNumberOfCabin(final Integer value)
	{
		setNumberOfCabin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cabin.numberOfCabin</code> attribute. 
	 * @param value the numberOfCabin - Number Of Cabin
	 */
	public void setNumberOfCabin(final SessionContext ctx, final int value)
	{
		setNumberOfCabin( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cabin.numberOfCabin</code> attribute. 
	 * @param value the numberOfCabin - Number Of Cabin
	 */
	public void setNumberOfCabin(final int value)
	{
		setNumberOfCabin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cabin.unit</code> attribute.
	 * @return the unit - Unit
	 */
	public EnumerationValue getUnit(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, UNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cabin.unit</code> attribute.
	 * @return the unit - Unit
	 */
	public EnumerationValue getUnit()
	{
		return getUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cabin.unit</code> attribute. 
	 * @param value the unit - Unit
	 */
	public void setUnit(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, UNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cabin.unit</code> attribute. 
	 * @param value the unit - Unit
	 */
	public void setUnit(final EnumerationValue value)
	{
		setUnit( getSession().getSessionContext(), value );
	}
	
}
