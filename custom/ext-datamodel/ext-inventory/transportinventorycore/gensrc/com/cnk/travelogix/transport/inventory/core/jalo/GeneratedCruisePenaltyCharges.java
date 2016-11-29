/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transport.inventory.core.jalo;

import com.cnk.travelogix.product.common.core.jalo.Cabin;
import com.cnk.travelogix.product.common.core.jalo.Deck;
import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transport.inventory.core.jalo.CruiseCompanyAdvanceDefinition;
import com.cnk.travelogix.transport.inventory.core.jalo.CruiseCompanyPenaltyCharges;
import com.cnk.travelogix.transportinventory.core.jalo.CruiseCutOffsAndCharges;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.StandardDateRange;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.transport.inventory.core.jalo.CruisePenaltyCharges CruisePenaltyCharges}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCruisePenaltyCharges extends CruiseCompanyPenaltyCharges
{
	/** Qualifier of the <code>CruisePenaltyCharges.definedBy</code> attribute **/
	public static final String DEFINEDBY = "definedBy";
	/** Qualifier of the <code>CruisePenaltyCharges.deck</code> attribute **/
	public static final String DECK = "deck";
	/** Qualifier of the <code>CruisePenaltyCharges.cabin</code> attribute **/
	public static final String CABIN = "cabin";
	/** Qualifier of the <code>CruisePenaltyCharges.minimumUtilizationThreshold</code> attribute **/
	public static final String MINIMUMUTILIZATIONTHRESHOLD = "minimumUtilizationThreshold";
	/** Qualifier of the <code>CruisePenaltyCharges.specificDates</code> attribute **/
	public static final String SPECIFICDATES = "specificDates";
	/** Qualifier of the <code>CruisePenaltyCharges.dateRange</code> attribute **/
	public static final String DATERANGE = "dateRange";
	/** Qualifier of the <code>CruisePenaltyCharges.companyAdvanceDefinition</code> attribute **/
	public static final String COMPANYADVANCEDEFINITION = "companyAdvanceDefinition";
	/** Qualifier of the <code>CruisePenaltyCharges.charges</code> attribute **/
	public static final String CHARGES = "charges";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n COMPANYADVANCEDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCruisePenaltyCharges> COMPANYADVANCEDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedCruisePenaltyCharges>(
	TransportinventorycoreConstants.TC.CRUISEPENALTYCHARGES,
	false,
	"companyAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CHARGES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CruiseCutOffsAndCharges> CHARGESHANDLER = new OneToManyHandler<CruiseCutOffsAndCharges>(
	TransportinventorycoreConstants.TC.CRUISECUTOFFSANDCHARGES,
	false,
	"cruisePenaltyCharges",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CruiseCompanyPenaltyCharges.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DEFINEDBY, AttributeMode.INITIAL);
		tmp.put(DECK, AttributeMode.INITIAL);
		tmp.put(CABIN, AttributeMode.INITIAL);
		tmp.put(MINIMUMUTILIZATIONTHRESHOLD, AttributeMode.INITIAL);
		tmp.put(SPECIFICDATES, AttributeMode.INITIAL);
		tmp.put(DATERANGE, AttributeMode.INITIAL);
		tmp.put(COMPANYADVANCEDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePenaltyCharges.cabin</code> attribute.
	 * @return the cabin - Cabin
	 */
	public Cabin getCabin(final SessionContext ctx)
	{
		return (Cabin)getProperty( ctx, CABIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePenaltyCharges.cabin</code> attribute.
	 * @return the cabin - Cabin
	 */
	public Cabin getCabin()
	{
		return getCabin( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePenaltyCharges.cabin</code> attribute. 
	 * @param value the cabin - Cabin
	 */
	public void setCabin(final SessionContext ctx, final Cabin value)
	{
		setProperty(ctx, CABIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePenaltyCharges.cabin</code> attribute. 
	 * @param value the cabin - Cabin
	 */
	public void setCabin(final Cabin value)
	{
		setCabin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePenaltyCharges.charges</code> attribute.
	 * @return the charges
	 */
	public Collection<CruiseCutOffsAndCharges> getCharges(final SessionContext ctx)
	{
		return CHARGESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePenaltyCharges.charges</code> attribute.
	 * @return the charges
	 */
	public Collection<CruiseCutOffsAndCharges> getCharges()
	{
		return getCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePenaltyCharges.charges</code> attribute. 
	 * @param value the charges
	 */
	public void setCharges(final SessionContext ctx, final Collection<CruiseCutOffsAndCharges> value)
	{
		CHARGESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePenaltyCharges.charges</code> attribute. 
	 * @param value the charges
	 */
	public void setCharges(final Collection<CruiseCutOffsAndCharges> value)
	{
		setCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to charges. 
	 * @param value the item to add to charges
	 */
	public void addToCharges(final SessionContext ctx, final CruiseCutOffsAndCharges value)
	{
		CHARGESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to charges. 
	 * @param value the item to add to charges
	 */
	public void addToCharges(final CruiseCutOffsAndCharges value)
	{
		addToCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from charges. 
	 * @param value the item to remove from charges
	 */
	public void removeFromCharges(final SessionContext ctx, final CruiseCutOffsAndCharges value)
	{
		CHARGESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from charges. 
	 * @param value the item to remove from charges
	 */
	public void removeFromCharges(final CruiseCutOffsAndCharges value)
	{
		removeFromCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePenaltyCharges.companyAdvanceDefinition</code> attribute.
	 * @return the companyAdvanceDefinition
	 */
	public CruiseCompanyAdvanceDefinition getCompanyAdvanceDefinition(final SessionContext ctx)
	{
		return (CruiseCompanyAdvanceDefinition)getProperty( ctx, COMPANYADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePenaltyCharges.companyAdvanceDefinition</code> attribute.
	 * @return the companyAdvanceDefinition
	 */
	public CruiseCompanyAdvanceDefinition getCompanyAdvanceDefinition()
	{
		return getCompanyAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePenaltyCharges.companyAdvanceDefinition</code> attribute. 
	 * @param value the companyAdvanceDefinition
	 */
	public void setCompanyAdvanceDefinition(final SessionContext ctx, final CruiseCompanyAdvanceDefinition value)
	{
		COMPANYADVANCEDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePenaltyCharges.companyAdvanceDefinition</code> attribute. 
	 * @param value the companyAdvanceDefinition
	 */
	public void setCompanyAdvanceDefinition(final CruiseCompanyAdvanceDefinition value)
	{
		setCompanyAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		COMPANYADVANCEDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePenaltyCharges.dateRange</code> attribute.
	 * @return the dateRange - Block out dates
	 */
	public Set<StandardDateRange> getDateRange(final SessionContext ctx)
	{
		Set<StandardDateRange> coll = (Set<StandardDateRange>)getProperty( ctx, DATERANGE);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePenaltyCharges.dateRange</code> attribute.
	 * @return the dateRange - Block out dates
	 */
	public Set<StandardDateRange> getDateRange()
	{
		return getDateRange( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePenaltyCharges.dateRange</code> attribute. 
	 * @param value the dateRange - Block out dates
	 */
	public void setDateRange(final SessionContext ctx, final Set<StandardDateRange> value)
	{
		setProperty(ctx, DATERANGE,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePenaltyCharges.dateRange</code> attribute. 
	 * @param value the dateRange - Block out dates
	 */
	public void setDateRange(final Set<StandardDateRange> value)
	{
		setDateRange( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePenaltyCharges.deck</code> attribute.
	 * @return the deck - Deck
	 */
	public Deck getDeck(final SessionContext ctx)
	{
		return (Deck)getProperty( ctx, DECK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePenaltyCharges.deck</code> attribute.
	 * @return the deck - Deck
	 */
	public Deck getDeck()
	{
		return getDeck( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePenaltyCharges.deck</code> attribute. 
	 * @param value the deck - Deck
	 */
	public void setDeck(final SessionContext ctx, final Deck value)
	{
		setProperty(ctx, DECK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePenaltyCharges.deck</code> attribute. 
	 * @param value the deck - Deck
	 */
	public void setDeck(final Deck value)
	{
		setDeck( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePenaltyCharges.definedBy</code> attribute.
	 * @return the definedBy - Cruise defined by
	 */
	public EnumerationValue getDefinedBy(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DEFINEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePenaltyCharges.definedBy</code> attribute.
	 * @return the definedBy - Cruise defined by
	 */
	public EnumerationValue getDefinedBy()
	{
		return getDefinedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePenaltyCharges.definedBy</code> attribute. 
	 * @param value the definedBy - Cruise defined by
	 */
	public void setDefinedBy(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DEFINEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePenaltyCharges.definedBy</code> attribute. 
	 * @param value the definedBy - Cruise defined by
	 */
	public void setDefinedBy(final EnumerationValue value)
	{
		setDefinedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePenaltyCharges.minimumUtilizationThreshold</code> attribute.
	 * @return the minimumUtilizationThreshold - Minimum utilization threshold
	 */
	public Long getMinimumUtilizationThreshold(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, MINIMUMUTILIZATIONTHRESHOLD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePenaltyCharges.minimumUtilizationThreshold</code> attribute.
	 * @return the minimumUtilizationThreshold - Minimum utilization threshold
	 */
	public Long getMinimumUtilizationThreshold()
	{
		return getMinimumUtilizationThreshold( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePenaltyCharges.minimumUtilizationThreshold</code> attribute. 
	 * @return the minimumUtilizationThreshold - Minimum utilization threshold
	 */
	public long getMinimumUtilizationThresholdAsPrimitive(final SessionContext ctx)
	{
		Long value = getMinimumUtilizationThreshold( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePenaltyCharges.minimumUtilizationThreshold</code> attribute. 
	 * @return the minimumUtilizationThreshold - Minimum utilization threshold
	 */
	public long getMinimumUtilizationThresholdAsPrimitive()
	{
		return getMinimumUtilizationThresholdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePenaltyCharges.minimumUtilizationThreshold</code> attribute. 
	 * @param value the minimumUtilizationThreshold - Minimum utilization threshold
	 */
	public void setMinimumUtilizationThreshold(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, MINIMUMUTILIZATIONTHRESHOLD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePenaltyCharges.minimumUtilizationThreshold</code> attribute. 
	 * @param value the minimumUtilizationThreshold - Minimum utilization threshold
	 */
	public void setMinimumUtilizationThreshold(final Long value)
	{
		setMinimumUtilizationThreshold( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePenaltyCharges.minimumUtilizationThreshold</code> attribute. 
	 * @param value the minimumUtilizationThreshold - Minimum utilization threshold
	 */
	public void setMinimumUtilizationThreshold(final SessionContext ctx, final long value)
	{
		setMinimumUtilizationThreshold( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePenaltyCharges.minimumUtilizationThreshold</code> attribute. 
	 * @param value the minimumUtilizationThreshold - Minimum utilization threshold
	 */
	public void setMinimumUtilizationThreshold(final long value)
	{
		setMinimumUtilizationThreshold( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePenaltyCharges.specificDates</code> attribute.
	 * @return the specificDates - specific date
	 */
	public Collection<Date> getSpecificDates(final SessionContext ctx)
	{
		Collection<Date> coll = (Collection<Date>)getProperty( ctx, SPECIFICDATES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePenaltyCharges.specificDates</code> attribute.
	 * @return the specificDates - specific date
	 */
	public Collection<Date> getSpecificDates()
	{
		return getSpecificDates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePenaltyCharges.specificDates</code> attribute. 
	 * @param value the specificDates - specific date
	 */
	public void setSpecificDates(final SessionContext ctx, final Collection<Date> value)
	{
		setProperty(ctx, SPECIFICDATES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePenaltyCharges.specificDates</code> attribute. 
	 * @param value the specificDates - specific date
	 */
	public void setSpecificDates(final Collection<Date> value)
	{
		setSpecificDates( getSession().getSessionContext(), value );
	}
	
}
