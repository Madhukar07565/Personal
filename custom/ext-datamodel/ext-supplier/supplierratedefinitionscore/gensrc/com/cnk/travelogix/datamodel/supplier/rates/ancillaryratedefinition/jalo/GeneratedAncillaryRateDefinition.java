/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.ancillaryratedefinition.jalo;

import com.cnk.travelogix.client.core.b2bunit.jalo.TravelogixB2BUnit;
import com.cnk.travelogix.product.transport.masters.core.jalo.CruiseItinerary;
import com.cnk.travelogix.supplier.core.market.jalo.SupplierMarket;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.AbstractAncillaryRateDetail;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.SupplierAncillaryRate;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.UserGroup;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.StandardDateRange;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.ancillaryratedefinition.jalo.AncillaryRateDefinition AncillaryRateDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAncillaryRateDefinition extends GenericItem
{
	/** Qualifier of the <code>AncillaryRateDefinition.supplierMarket</code> attribute **/
	public static final String SUPPLIERMARKET = "supplierMarket";
	/** Qualifier of the <code>AncillaryRateDefinition.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>AncillaryRateDefinition.seasonality</code> attribute **/
	public static final String SEASONALITY = "seasonality";
	/** Qualifier of the <code>AncillaryRateDefinition.travelPeriod</code> attribute **/
	public static final String TRAVELPERIOD = "travelPeriod";
	/** Qualifier of the <code>AncillaryRateDefinition.clientType</code> attribute **/
	public static final String CLIENTTYPE = "clientType";
	/** Qualifier of the <code>AncillaryRateDefinition.cruiseItinerary</code> attribute **/
	public static final String CRUISEITINERARY = "cruiseItinerary";
	/** Qualifier of the <code>AncillaryRateDefinition.client</code> attribute **/
	public static final String CLIENT = "client";
	/** Qualifier of the <code>AncillaryRateDefinition.clientGroup</code> attribute **/
	public static final String CLIENTGROUP = "clientGroup";
	/** Qualifier of the <code>AncillaryRateDefinition.abstractAncillaryRateDetails</code> attribute **/
	public static final String ABSTRACTANCILLARYRATEDETAILS = "abstractAncillaryRateDetails";
	/** Qualifier of the <code>AncillaryRateDefinition.supplierAncillaryRate</code> attribute **/
	public static final String SUPPLIERANCILLARYRATE = "supplierAncillaryRate";
	/**
	* {@link OneToManyHandler} for handling 1:n ABSTRACTANCILLARYRATEDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AbstractAncillaryRateDetail> ABSTRACTANCILLARYRATEDETAILSHANDLER = new OneToManyHandler<AbstractAncillaryRateDetail>(
	SupplierratedefinitionscoreConstants.TC.ABSTRACTANCILLARYRATEDETAIL,
	true,
	"ancillaryRateDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SUPPLIERANCILLARYRATE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAncillaryRateDefinition> SUPPLIERANCILLARYRATEHANDLER = new BidirectionalOneToManyHandler<GeneratedAncillaryRateDefinition>(
	SupplierratedefinitionscoreConstants.TC.ANCILLARYRATEDEFINITION,
	false,
	"supplierAncillaryRate",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SUPPLIERMARKET, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(SEASONALITY, AttributeMode.INITIAL);
		tmp.put(TRAVELPERIOD, AttributeMode.INITIAL);
		tmp.put(CLIENTTYPE, AttributeMode.INITIAL);
		tmp.put(CRUISEITINERARY, AttributeMode.INITIAL);
		tmp.put(CLIENT, AttributeMode.INITIAL);
		tmp.put(CLIENTGROUP, AttributeMode.INITIAL);
		tmp.put(SUPPLIERANCILLARYRATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryRateDefinition.abstractAncillaryRateDetails</code> attribute.
	 * @return the abstractAncillaryRateDetails
	 */
	public Collection<AbstractAncillaryRateDetail> getAbstractAncillaryRateDetails(final SessionContext ctx)
	{
		return ABSTRACTANCILLARYRATEDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryRateDefinition.abstractAncillaryRateDetails</code> attribute.
	 * @return the abstractAncillaryRateDetails
	 */
	public Collection<AbstractAncillaryRateDetail> getAbstractAncillaryRateDetails()
	{
		return getAbstractAncillaryRateDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryRateDefinition.abstractAncillaryRateDetails</code> attribute. 
	 * @param value the abstractAncillaryRateDetails
	 */
	public void setAbstractAncillaryRateDetails(final SessionContext ctx, final Collection<AbstractAncillaryRateDetail> value)
	{
		ABSTRACTANCILLARYRATEDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryRateDefinition.abstractAncillaryRateDetails</code> attribute. 
	 * @param value the abstractAncillaryRateDetails
	 */
	public void setAbstractAncillaryRateDetails(final Collection<AbstractAncillaryRateDetail> value)
	{
		setAbstractAncillaryRateDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to abstractAncillaryRateDetails. 
	 * @param value the item to add to abstractAncillaryRateDetails
	 */
	public void addToAbstractAncillaryRateDetails(final SessionContext ctx, final AbstractAncillaryRateDetail value)
	{
		ABSTRACTANCILLARYRATEDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to abstractAncillaryRateDetails. 
	 * @param value the item to add to abstractAncillaryRateDetails
	 */
	public void addToAbstractAncillaryRateDetails(final AbstractAncillaryRateDetail value)
	{
		addToAbstractAncillaryRateDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from abstractAncillaryRateDetails. 
	 * @param value the item to remove from abstractAncillaryRateDetails
	 */
	public void removeFromAbstractAncillaryRateDetails(final SessionContext ctx, final AbstractAncillaryRateDetail value)
	{
		ABSTRACTANCILLARYRATEDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from abstractAncillaryRateDetails. 
	 * @param value the item to remove from abstractAncillaryRateDetails
	 */
	public void removeFromAbstractAncillaryRateDetails(final AbstractAncillaryRateDetail value)
	{
		removeFromAbstractAncillaryRateDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryRateDefinition.client</code> attribute.
	 * @return the client
	 */
	public TravelogixB2BUnit getClient(final SessionContext ctx)
	{
		return (TravelogixB2BUnit)getProperty( ctx, CLIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryRateDefinition.client</code> attribute.
	 * @return the client
	 */
	public TravelogixB2BUnit getClient()
	{
		return getClient( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryRateDefinition.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final SessionContext ctx, final TravelogixB2BUnit value)
	{
		setProperty(ctx, CLIENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryRateDefinition.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final TravelogixB2BUnit value)
	{
		setClient( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryRateDefinition.clientGroup</code> attribute.
	 * @return the clientGroup
	 */
	public UserGroup getClientGroup(final SessionContext ctx)
	{
		return (UserGroup)getProperty( ctx, CLIENTGROUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryRateDefinition.clientGroup</code> attribute.
	 * @return the clientGroup
	 */
	public UserGroup getClientGroup()
	{
		return getClientGroup( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryRateDefinition.clientGroup</code> attribute. 
	 * @param value the clientGroup
	 */
	public void setClientGroup(final SessionContext ctx, final UserGroup value)
	{
		setProperty(ctx, CLIENTGROUP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryRateDefinition.clientGroup</code> attribute. 
	 * @param value the clientGroup
	 */
	public void setClientGroup(final UserGroup value)
	{
		setClientGroup( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryRateDefinition.clientType</code> attribute.
	 * @return the clientType
	 */
	public EnumerationValue getClientType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CLIENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryRateDefinition.clientType</code> attribute.
	 * @return the clientType
	 */
	public EnumerationValue getClientType()
	{
		return getClientType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryRateDefinition.clientType</code> attribute. 
	 * @param value the clientType
	 */
	public void setClientType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CLIENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryRateDefinition.clientType</code> attribute. 
	 * @param value the clientType
	 */
	public void setClientType(final EnumerationValue value)
	{
		setClientType( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		SUPPLIERANCILLARYRATEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryRateDefinition.cruiseItinerary</code> attribute.
	 * @return the cruiseItinerary
	 */
	public CruiseItinerary getCruiseItinerary(final SessionContext ctx)
	{
		return (CruiseItinerary)getProperty( ctx, CRUISEITINERARY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryRateDefinition.cruiseItinerary</code> attribute.
	 * @return the cruiseItinerary
	 */
	public CruiseItinerary getCruiseItinerary()
	{
		return getCruiseItinerary( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryRateDefinition.cruiseItinerary</code> attribute. 
	 * @param value the cruiseItinerary
	 */
	public void setCruiseItinerary(final SessionContext ctx, final CruiseItinerary value)
	{
		setProperty(ctx, CRUISEITINERARY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryRateDefinition.cruiseItinerary</code> attribute. 
	 * @param value the cruiseItinerary
	 */
	public void setCruiseItinerary(final CruiseItinerary value)
	{
		setCruiseItinerary( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryRateDefinition.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryRateDefinition.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryRateDefinition.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryRateDefinition.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryRateDefinition.seasonality</code> attribute.
	 * @return the seasonality
	 */
	public EnumerationValue getSeasonality(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SEASONALITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryRateDefinition.seasonality</code> attribute.
	 * @return the seasonality
	 */
	public EnumerationValue getSeasonality()
	{
		return getSeasonality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryRateDefinition.seasonality</code> attribute. 
	 * @param value the seasonality
	 */
	public void setSeasonality(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SEASONALITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryRateDefinition.seasonality</code> attribute. 
	 * @param value the seasonality
	 */
	public void setSeasonality(final EnumerationValue value)
	{
		setSeasonality( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryRateDefinition.supplierAncillaryRate</code> attribute.
	 * @return the supplierAncillaryRate
	 */
	public SupplierAncillaryRate getSupplierAncillaryRate(final SessionContext ctx)
	{
		return (SupplierAncillaryRate)getProperty( ctx, SUPPLIERANCILLARYRATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryRateDefinition.supplierAncillaryRate</code> attribute.
	 * @return the supplierAncillaryRate
	 */
	public SupplierAncillaryRate getSupplierAncillaryRate()
	{
		return getSupplierAncillaryRate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryRateDefinition.supplierAncillaryRate</code> attribute. 
	 * @param value the supplierAncillaryRate
	 */
	public void setSupplierAncillaryRate(final SessionContext ctx, final SupplierAncillaryRate value)
	{
		SUPPLIERANCILLARYRATEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryRateDefinition.supplierAncillaryRate</code> attribute. 
	 * @param value the supplierAncillaryRate
	 */
	public void setSupplierAncillaryRate(final SupplierAncillaryRate value)
	{
		setSupplierAncillaryRate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryRateDefinition.supplierMarket</code> attribute.
	 * @return the supplierMarket
	 */
	public SupplierMarket getSupplierMarket(final SessionContext ctx)
	{
		return (SupplierMarket)getProperty( ctx, SUPPLIERMARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryRateDefinition.supplierMarket</code> attribute.
	 * @return the supplierMarket
	 */
	public SupplierMarket getSupplierMarket()
	{
		return getSupplierMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryRateDefinition.supplierMarket</code> attribute. 
	 * @param value the supplierMarket
	 */
	public void setSupplierMarket(final SessionContext ctx, final SupplierMarket value)
	{
		setProperty(ctx, SUPPLIERMARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryRateDefinition.supplierMarket</code> attribute. 
	 * @param value the supplierMarket
	 */
	public void setSupplierMarket(final SupplierMarket value)
	{
		setSupplierMarket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryRateDefinition.travelPeriod</code> attribute.
	 * @return the travelPeriod
	 */
	public StandardDateRange getTravelPeriod(final SessionContext ctx)
	{
		return (StandardDateRange)getProperty( ctx, TRAVELPERIOD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryRateDefinition.travelPeriod</code> attribute.
	 * @return the travelPeriod
	 */
	public StandardDateRange getTravelPeriod()
	{
		return getTravelPeriod( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryRateDefinition.travelPeriod</code> attribute. 
	 * @param value the travelPeriod
	 */
	public void setTravelPeriod(final SessionContext ctx, final StandardDateRange value)
	{
		setProperty(ctx, TRAVELPERIOD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryRateDefinition.travelPeriod</code> attribute. 
	 * @param value the travelPeriod
	 */
	public void setTravelPeriod(final StandardDateRange value)
	{
		setTravelPeriod( getSession().getSessionContext(), value );
	}
	
}
