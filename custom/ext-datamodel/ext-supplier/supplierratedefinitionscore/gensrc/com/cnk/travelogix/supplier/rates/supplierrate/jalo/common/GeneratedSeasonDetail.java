/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.supplierrate.jalo.common;

import com.cnk.travelogix.datamodel.supplier.rates.dateRange.jalo.DateRangeRestriction;
import com.cnk.travelogix.product.transport.masters.core.jalo.CruiseItinerary;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import com.cnk.travelogix.supplier.rates.jalo.AbstractSupplierRate;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.SupplierAncillaryRate;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.SeasonDetail SeasonDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSeasonDetail extends GenericItem
{
	/** Qualifier of the <code>SeasonDetail.seasonality</code> attribute **/
	public static final String SEASONALITY = "seasonality";
	/** Qualifier of the <code>SeasonDetail.itinerary</code> attribute **/
	public static final String ITINERARY = "itinerary";
	/** Qualifier of the <code>SeasonDetail.supplierRate</code> attribute **/
	public static final String SUPPLIERRATE = "supplierRate";
	/** Qualifier of the <code>SeasonDetail.supplierAncillaryRate</code> attribute **/
	public static final String SUPPLIERANCILLARYRATE = "supplierAncillaryRate";
	/** Qualifier of the <code>SeasonDetail.travelDate</code> attribute **/
	public static final String TRAVELDATE = "travelDate";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SUPPLIERRATE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSeasonDetail> SUPPLIERRATEHANDLER = new BidirectionalOneToManyHandler<GeneratedSeasonDetail>(
	SupplierratedefinitionscoreConstants.TC.SEASONDETAIL,
	false,
	"supplierRate",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SUPPLIERANCILLARYRATE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSeasonDetail> SUPPLIERANCILLARYRATEHANDLER = new BidirectionalOneToManyHandler<GeneratedSeasonDetail>(
	SupplierratedefinitionscoreConstants.TC.SEASONDETAIL,
	false,
	"supplierAncillaryRate",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n TRAVELDATE's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DateRangeRestriction> TRAVELDATEHANDLER = new OneToManyHandler<DateRangeRestriction>(
	SupplierratedefinitionscoreConstants.TC.DATERANGERESTRICTION,
	true,
	"seasonDetail",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SEASONALITY, AttributeMode.INITIAL);
		tmp.put(ITINERARY, AttributeMode.INITIAL);
		tmp.put(SUPPLIERRATE, AttributeMode.INITIAL);
		tmp.put(SUPPLIERANCILLARYRATE, AttributeMode.INITIAL);
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
		SUPPLIERRATEHANDLER.newInstance(ctx, allAttributes);
		SUPPLIERANCILLARYRATEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeasonDetail.itinerary</code> attribute.
	 * @return the itinerary
	 */
	public CruiseItinerary getItinerary(final SessionContext ctx)
	{
		return (CruiseItinerary)getProperty( ctx, ITINERARY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeasonDetail.itinerary</code> attribute.
	 * @return the itinerary
	 */
	public CruiseItinerary getItinerary()
	{
		return getItinerary( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeasonDetail.itinerary</code> attribute. 
	 * @param value the itinerary
	 */
	public void setItinerary(final SessionContext ctx, final CruiseItinerary value)
	{
		setProperty(ctx, ITINERARY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeasonDetail.itinerary</code> attribute. 
	 * @param value the itinerary
	 */
	public void setItinerary(final CruiseItinerary value)
	{
		setItinerary( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeasonDetail.seasonality</code> attribute.
	 * @return the seasonality
	 */
	public String getSeasonality(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SEASONALITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeasonDetail.seasonality</code> attribute.
	 * @return the seasonality
	 */
	public String getSeasonality()
	{
		return getSeasonality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeasonDetail.seasonality</code> attribute. 
	 * @param value the seasonality
	 */
	public void setSeasonality(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SEASONALITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeasonDetail.seasonality</code> attribute. 
	 * @param value the seasonality
	 */
	public void setSeasonality(final String value)
	{
		setSeasonality( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeasonDetail.supplierAncillaryRate</code> attribute.
	 * @return the supplierAncillaryRate
	 */
	public SupplierAncillaryRate getSupplierAncillaryRate(final SessionContext ctx)
	{
		return (SupplierAncillaryRate)getProperty( ctx, SUPPLIERANCILLARYRATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeasonDetail.supplierAncillaryRate</code> attribute.
	 * @return the supplierAncillaryRate
	 */
	public SupplierAncillaryRate getSupplierAncillaryRate()
	{
		return getSupplierAncillaryRate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeasonDetail.supplierAncillaryRate</code> attribute. 
	 * @param value the supplierAncillaryRate
	 */
	public void setSupplierAncillaryRate(final SessionContext ctx, final SupplierAncillaryRate value)
	{
		SUPPLIERANCILLARYRATEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeasonDetail.supplierAncillaryRate</code> attribute. 
	 * @param value the supplierAncillaryRate
	 */
	public void setSupplierAncillaryRate(final SupplierAncillaryRate value)
	{
		setSupplierAncillaryRate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeasonDetail.supplierRate</code> attribute.
	 * @return the supplierRate
	 */
	public AbstractSupplierRate getSupplierRate(final SessionContext ctx)
	{
		return (AbstractSupplierRate)getProperty( ctx, SUPPLIERRATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeasonDetail.supplierRate</code> attribute.
	 * @return the supplierRate
	 */
	public AbstractSupplierRate getSupplierRate()
	{
		return getSupplierRate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeasonDetail.supplierRate</code> attribute. 
	 * @param value the supplierRate
	 */
	public void setSupplierRate(final SessionContext ctx, final AbstractSupplierRate value)
	{
		SUPPLIERRATEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeasonDetail.supplierRate</code> attribute. 
	 * @param value the supplierRate
	 */
	public void setSupplierRate(final AbstractSupplierRate value)
	{
		setSupplierRate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeasonDetail.travelDate</code> attribute.
	 * @return the travelDate
	 */
	public Set<DateRangeRestriction> getTravelDate(final SessionContext ctx)
	{
		return (Set<DateRangeRestriction>)TRAVELDATEHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SeasonDetail.travelDate</code> attribute.
	 * @return the travelDate
	 */
	public Set<DateRangeRestriction> getTravelDate()
	{
		return getTravelDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeasonDetail.travelDate</code> attribute. 
	 * @param value the travelDate
	 */
	public void setTravelDate(final SessionContext ctx, final Set<DateRangeRestriction> value)
	{
		TRAVELDATEHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SeasonDetail.travelDate</code> attribute. 
	 * @param value the travelDate
	 */
	public void setTravelDate(final Set<DateRangeRestriction> value)
	{
		setTravelDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travelDate. 
	 * @param value the item to add to travelDate
	 */
	public void addToTravelDate(final SessionContext ctx, final DateRangeRestriction value)
	{
		TRAVELDATEHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travelDate. 
	 * @param value the item to add to travelDate
	 */
	public void addToTravelDate(final DateRangeRestriction value)
	{
		addToTravelDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travelDate. 
	 * @param value the item to remove from travelDate
	 */
	public void removeFromTravelDate(final SessionContext ctx, final DateRangeRestriction value)
	{
		TRAVELDATEHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travelDate. 
	 * @param value the item to remove from travelDate
	 */
	public void removeFromTravelDate(final DateRangeRestriction value)
	{
		removeFromTravelDate( getSession().getSessionContext(), value );
	}
	
}
