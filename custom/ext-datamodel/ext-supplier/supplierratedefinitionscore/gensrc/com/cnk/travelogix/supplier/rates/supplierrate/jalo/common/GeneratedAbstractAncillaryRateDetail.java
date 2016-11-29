/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.supplierrate.jalo.common;

import com.cnk.travelogix.datamodel.supplier.rates.ancillaryratedefinition.jalo.AncillaryRateDefinition;
import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer;
import com.cnk.travelogix.masterdata.core.jalo.TravelogixPolicy;
import com.cnk.travelogix.product.common.core.jalo.Ancillary;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractRateAdvDefinition;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
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
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.AbstractAncillaryRateDetail AbstractAncillaryRateDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractAncillaryRateDetail extends GenericItem
{
	/** Qualifier of the <code>AbstractAncillaryRateDetail.ancillary</code> attribute **/
	public static final String ANCILLARY = "ancillary";
	/** Qualifier of the <code>AbstractAncillaryRateDetail.ancillaryDetails</code> attribute **/
	public static final String ANCILLARYDETAILS = "ancillaryDetails";
	/** Qualifier of the <code>AbstractAncillaryRateDetail.daysOfWeek</code> attribute **/
	public static final String DAYSOFWEEK = "daysOfWeek";
	/** Qualifier of the <code>AbstractAncillaryRateDetail.cost</code> attribute **/
	public static final String COST = "cost";
	/** Qualifier of the <code>AbstractAncillaryRateDetail.taxPercentage</code> attribute **/
	public static final String TAXPERCENTAGE = "taxPercentage";
	/** Qualifier of the <code>AbstractAncillaryRateDetail.net</code> attribute **/
	public static final String NET = "net";
	/** Qualifier of the <code>AbstractAncillaryRateDetail.commissionValue</code> attribute **/
	public static final String COMMISSIONVALUE = "commissionValue";
	/** Qualifier of the <code>AbstractAncillaryRateDetail.commissionThreshold</code> attribute **/
	public static final String COMMISSIONTHRESHOLD = "commissionThreshold";
	/** Qualifier of the <code>AbstractAncillaryRateDetail.definition</code> attribute **/
	public static final String DEFINITION = "definition";
	/** Qualifier of the <code>AbstractAncillaryRateDetail.payOnArrival</code> attribute **/
	public static final String PAYONARRIVAL = "payOnArrival";
	/** Qualifier of the <code>AbstractAncillaryRateDetail.ancillaryRateDefinition</code> attribute **/
	public static final String ANCILLARYRATEDEFINITION = "ancillaryRateDefinition";
	/** Qualifier of the <code>AbstractAncillaryRateDetail.travelogixPolicies</code> attribute **/
	public static final String TRAVELOGIXPOLICIES = "travelogixPolicies";
	/** Relation ordering override parameter constants for AbstractAncillaryRateDetail2TravelogixPolicyRelation from ((supplierratedefinitionscore))*/
	protected static String ABSTRACTANCILLARYRATEDETAIL2TRAVELOGIXPOLICYRELATION_SRC_ORDERED = "relation.AbstractAncillaryRateDetail2TravelogixPolicyRelation.source.ordered";
	protected static String ABSTRACTANCILLARYRATEDETAIL2TRAVELOGIXPOLICYRELATION_TGT_ORDERED = "relation.AbstractAncillaryRateDetail2TravelogixPolicyRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for AbstractAncillaryRateDetail2TravelogixPolicyRelation from ((supplierratedefinitionscore))*/
	protected static String ABSTRACTANCILLARYRATEDETAIL2TRAVELOGIXPOLICYRELATION_MARKMODIFIED = "relation.AbstractAncillaryRateDetail2TravelogixPolicyRelation.markmodified";
	/** Qualifier of the <code>AbstractAncillaryRateDetail.absTravelogixSupplierOffers</code> attribute **/
	public static final String ABSTRAVELOGIXSUPPLIEROFFERS = "absTravelogixSupplierOffers";
	/** Relation ordering override parameter constants for AbstractAncillaryRateDetail2AbsTravelogixSupplierOfferRelation from ((supplierratedefinitionscore))*/
	protected static String ABSTRACTANCILLARYRATEDETAIL2ABSTRAVELOGIXSUPPLIEROFFERRELATION_SRC_ORDERED = "relation.AbstractAncillaryRateDetail2AbsTravelogixSupplierOfferRelation.source.ordered";
	protected static String ABSTRACTANCILLARYRATEDETAIL2ABSTRAVELOGIXSUPPLIEROFFERRELATION_TGT_ORDERED = "relation.AbstractAncillaryRateDetail2AbsTravelogixSupplierOfferRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for AbstractAncillaryRateDetail2AbsTravelogixSupplierOfferRelation from ((supplierratedefinitionscore))*/
	protected static String ABSTRACTANCILLARYRATEDETAIL2ABSTRAVELOGIXSUPPLIEROFFERRELATION_MARKMODIFIED = "relation.AbstractAncillaryRateDetail2AbsTravelogixSupplierOfferRelation.markmodified";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ANCILLARYRATEDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAbstractAncillaryRateDetail> ANCILLARYRATEDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedAbstractAncillaryRateDetail>(
	SupplierratedefinitionscoreConstants.TC.ABSTRACTANCILLARYRATEDETAIL,
	false,
	"ancillaryRateDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ANCILLARY, AttributeMode.INITIAL);
		tmp.put(ANCILLARYDETAILS, AttributeMode.INITIAL);
		tmp.put(DAYSOFWEEK, AttributeMode.INITIAL);
		tmp.put(COST, AttributeMode.INITIAL);
		tmp.put(TAXPERCENTAGE, AttributeMode.INITIAL);
		tmp.put(NET, AttributeMode.INITIAL);
		tmp.put(COMMISSIONVALUE, AttributeMode.INITIAL);
		tmp.put(COMMISSIONTHRESHOLD, AttributeMode.INITIAL);
		tmp.put(DEFINITION, AttributeMode.INITIAL);
		tmp.put(PAYONARRIVAL, AttributeMode.INITIAL);
		tmp.put(ANCILLARYRATEDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.absTravelogixSupplierOffers</code> attribute.
	 * @return the absTravelogixSupplierOffers
	 */
	public Collection<AbstractTravelogixSupplierOffer> getAbsTravelogixSupplierOffers(final SessionContext ctx)
	{
		final List<AbstractTravelogixSupplierOffer> items = getLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTANCILLARYRATEDETAIL2ABSTRAVELOGIXSUPPLIEROFFERRELATION,
			"AbstractTravelogixSupplierOffer",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.absTravelogixSupplierOffers</code> attribute.
	 * @return the absTravelogixSupplierOffers
	 */
	public Collection<AbstractTravelogixSupplierOffer> getAbsTravelogixSupplierOffers()
	{
		return getAbsTravelogixSupplierOffers( getSession().getSessionContext() );
	}
	
	public long getAbsTravelogixSupplierOffersCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTANCILLARYRATEDETAIL2ABSTRAVELOGIXSUPPLIEROFFERRELATION,
			"AbstractTravelogixSupplierOffer",
			null
		);
	}
	
	public long getAbsTravelogixSupplierOffersCount()
	{
		return getAbsTravelogixSupplierOffersCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.absTravelogixSupplierOffers</code> attribute. 
	 * @param value the absTravelogixSupplierOffers
	 */
	public void setAbsTravelogixSupplierOffers(final SessionContext ctx, final Collection<AbstractTravelogixSupplierOffer> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTANCILLARYRATEDETAIL2ABSTRAVELOGIXSUPPLIEROFFERRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTANCILLARYRATEDETAIL2ABSTRAVELOGIXSUPPLIEROFFERRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.absTravelogixSupplierOffers</code> attribute. 
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
		addLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTANCILLARYRATEDETAIL2ABSTRAVELOGIXSUPPLIEROFFERRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTANCILLARYRATEDETAIL2ABSTRAVELOGIXSUPPLIEROFFERRELATION_MARKMODIFIED)
		);
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
		removeLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTANCILLARYRATEDETAIL2ABSTRAVELOGIXSUPPLIEROFFERRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTANCILLARYRATEDETAIL2ABSTRAVELOGIXSUPPLIEROFFERRELATION_MARKMODIFIED)
		);
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
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.ancillary</code> attribute.
	 * @return the ancillary
	 */
	public Ancillary getAncillary(final SessionContext ctx)
	{
		return (Ancillary)getProperty( ctx, ANCILLARY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.ancillary</code> attribute.
	 * @return the ancillary
	 */
	public Ancillary getAncillary()
	{
		return getAncillary( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.ancillary</code> attribute. 
	 * @param value the ancillary
	 */
	public void setAncillary(final SessionContext ctx, final Ancillary value)
	{
		setProperty(ctx, ANCILLARY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.ancillary</code> attribute. 
	 * @param value the ancillary
	 */
	public void setAncillary(final Ancillary value)
	{
		setAncillary( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.ancillaryDetails</code> attribute.
	 * @return the ancillaryDetails
	 */
	public String getAncillaryDetails(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ANCILLARYDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.ancillaryDetails</code> attribute.
	 * @return the ancillaryDetails
	 */
	public String getAncillaryDetails()
	{
		return getAncillaryDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.ancillaryDetails</code> attribute. 
	 * @param value the ancillaryDetails
	 */
	public void setAncillaryDetails(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ANCILLARYDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.ancillaryDetails</code> attribute. 
	 * @param value the ancillaryDetails
	 */
	public void setAncillaryDetails(final String value)
	{
		setAncillaryDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.ancillaryRateDefinition</code> attribute.
	 * @return the ancillaryRateDefinition
	 */
	public AncillaryRateDefinition getAncillaryRateDefinition(final SessionContext ctx)
	{
		return (AncillaryRateDefinition)getProperty( ctx, ANCILLARYRATEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.ancillaryRateDefinition</code> attribute.
	 * @return the ancillaryRateDefinition
	 */
	public AncillaryRateDefinition getAncillaryRateDefinition()
	{
		return getAncillaryRateDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.ancillaryRateDefinition</code> attribute. 
	 * @param value the ancillaryRateDefinition
	 */
	public void setAncillaryRateDefinition(final SessionContext ctx, final AncillaryRateDefinition value)
	{
		ANCILLARYRATEDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.ancillaryRateDefinition</code> attribute. 
	 * @param value the ancillaryRateDefinition
	 */
	public void setAncillaryRateDefinition(final AncillaryRateDefinition value)
	{
		setAncillaryRateDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.commissionThreshold</code> attribute.
	 * @return the commissionThreshold
	 */
	public EnumerationValue getCommissionThreshold(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMMISSIONTHRESHOLD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.commissionThreshold</code> attribute.
	 * @return the commissionThreshold
	 */
	public EnumerationValue getCommissionThreshold()
	{
		return getCommissionThreshold( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.commissionThreshold</code> attribute. 
	 * @param value the commissionThreshold
	 */
	public void setCommissionThreshold(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMMISSIONTHRESHOLD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.commissionThreshold</code> attribute. 
	 * @param value the commissionThreshold
	 */
	public void setCommissionThreshold(final EnumerationValue value)
	{
		setCommissionThreshold( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.commissionValue</code> attribute.
	 * @return the commissionValue
	 */
	public Double getCommissionValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, COMMISSIONVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.commissionValue</code> attribute.
	 * @return the commissionValue
	 */
	public Double getCommissionValue()
	{
		return getCommissionValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.commissionValue</code> attribute. 
	 * @return the commissionValue
	 */
	public double getCommissionValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getCommissionValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.commissionValue</code> attribute. 
	 * @return the commissionValue
	 */
	public double getCommissionValueAsPrimitive()
	{
		return getCommissionValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.commissionValue</code> attribute. 
	 * @param value the commissionValue
	 */
	public void setCommissionValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, COMMISSIONVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.commissionValue</code> attribute. 
	 * @param value the commissionValue
	 */
	public void setCommissionValue(final Double value)
	{
		setCommissionValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.commissionValue</code> attribute. 
	 * @param value the commissionValue
	 */
	public void setCommissionValue(final SessionContext ctx, final double value)
	{
		setCommissionValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.commissionValue</code> attribute. 
	 * @param value the commissionValue
	 */
	public void setCommissionValue(final double value)
	{
		setCommissionValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.cost</code> attribute.
	 * @return the cost
	 */
	public Double getCost(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, COST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.cost</code> attribute.
	 * @return the cost
	 */
	public Double getCost()
	{
		return getCost( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.cost</code> attribute. 
	 * @return the cost
	 */
	public double getCostAsPrimitive(final SessionContext ctx)
	{
		Double value = getCost( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.cost</code> attribute. 
	 * @return the cost
	 */
	public double getCostAsPrimitive()
	{
		return getCostAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.cost</code> attribute. 
	 * @param value the cost
	 */
	public void setCost(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, COST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.cost</code> attribute. 
	 * @param value the cost
	 */
	public void setCost(final Double value)
	{
		setCost( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.cost</code> attribute. 
	 * @param value the cost
	 */
	public void setCost(final SessionContext ctx, final double value)
	{
		setCost( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.cost</code> attribute. 
	 * @param value the cost
	 */
	public void setCost(final double value)
	{
		setCost( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ANCILLARYRATEDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.daysOfWeek</code> attribute.
	 * @return the daysOfWeek
	 */
	public EnumerationValue getDaysOfWeek(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DAYSOFWEEK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.daysOfWeek</code> attribute.
	 * @return the daysOfWeek
	 */
	public EnumerationValue getDaysOfWeek()
	{
		return getDaysOfWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek
	 */
	public void setDaysOfWeek(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DAYSOFWEEK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek
	 */
	public void setDaysOfWeek(final EnumerationValue value)
	{
		setDaysOfWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.definition</code> attribute.
	 * @return the definition
	 */
	public AbstractRateAdvDefinition getDefinition(final SessionContext ctx)
	{
		return (AbstractRateAdvDefinition)getProperty( ctx, DEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.definition</code> attribute.
	 * @return the definition
	 */
	public AbstractRateAdvDefinition getDefinition()
	{
		return getDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.definition</code> attribute. 
	 * @param value the definition
	 */
	public void setDefinition(final SessionContext ctx, final AbstractRateAdvDefinition value)
	{
		new PartOfHandler<AbstractRateAdvDefinition>()
		{
			@Override
			protected AbstractRateAdvDefinition doGetValue(final SessionContext ctx)
			{
				return getDefinition( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final AbstractRateAdvDefinition _value)
			{
				final AbstractRateAdvDefinition value = _value;
				setProperty(ctx, DEFINITION,value);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.definition</code> attribute. 
	 * @param value the definition
	 */
	public void setDefinition(final AbstractRateAdvDefinition value)
	{
		setDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.net</code> attribute.
	 * @return the net
	 */
	public Boolean isNet(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, NET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.net</code> attribute.
	 * @return the net
	 */
	public Boolean isNet()
	{
		return isNet( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.net</code> attribute. 
	 * @return the net
	 */
	public boolean isNetAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isNet( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.net</code> attribute. 
	 * @return the net
	 */
	public boolean isNetAsPrimitive()
	{
		return isNetAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.net</code> attribute. 
	 * @param value the net
	 */
	public void setNet(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, NET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.net</code> attribute. 
	 * @param value the net
	 */
	public void setNet(final Boolean value)
	{
		setNet( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.net</code> attribute. 
	 * @param value the net
	 */
	public void setNet(final SessionContext ctx, final boolean value)
	{
		setNet( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.net</code> attribute. 
	 * @param value the net
	 */
	public void setNet(final boolean value)
	{
		setNet( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.payOnArrival</code> attribute.
	 * @return the payOnArrival
	 */
	public Boolean isPayOnArrival(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PAYONARRIVAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.payOnArrival</code> attribute.
	 * @return the payOnArrival
	 */
	public Boolean isPayOnArrival()
	{
		return isPayOnArrival( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.payOnArrival</code> attribute. 
	 * @return the payOnArrival
	 */
	public boolean isPayOnArrivalAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPayOnArrival( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.payOnArrival</code> attribute. 
	 * @return the payOnArrival
	 */
	public boolean isPayOnArrivalAsPrimitive()
	{
		return isPayOnArrivalAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PAYONARRIVAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final Boolean value)
	{
		setPayOnArrival( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final SessionContext ctx, final boolean value)
	{
		setPayOnArrival( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final boolean value)
	{
		setPayOnArrival( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.taxPercentage</code> attribute.
	 * @return the taxPercentage
	 */
	public Double getTaxPercentage(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TAXPERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.taxPercentage</code> attribute.
	 * @return the taxPercentage
	 */
	public Double getTaxPercentage()
	{
		return getTaxPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.taxPercentage</code> attribute. 
	 * @return the taxPercentage
	 */
	public double getTaxPercentageAsPrimitive(final SessionContext ctx)
	{
		Double value = getTaxPercentage( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.taxPercentage</code> attribute. 
	 * @return the taxPercentage
	 */
	public double getTaxPercentageAsPrimitive()
	{
		return getTaxPercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.taxPercentage</code> attribute. 
	 * @param value the taxPercentage
	 */
	public void setTaxPercentage(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TAXPERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.taxPercentage</code> attribute. 
	 * @param value the taxPercentage
	 */
	public void setTaxPercentage(final Double value)
	{
		setTaxPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.taxPercentage</code> attribute. 
	 * @param value the taxPercentage
	 */
	public void setTaxPercentage(final SessionContext ctx, final double value)
	{
		setTaxPercentage( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.taxPercentage</code> attribute. 
	 * @param value the taxPercentage
	 */
	public void setTaxPercentage(final double value)
	{
		setTaxPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.travelogixPolicies</code> attribute.
	 * @return the travelogixPolicies
	 */
	public Collection<TravelogixPolicy> getTravelogixPolicies(final SessionContext ctx)
	{
		final List<TravelogixPolicy> items = getLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTANCILLARYRATEDETAIL2TRAVELOGIXPOLICYRELATION,
			"TravelogixPolicy",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAncillaryRateDetail.travelogixPolicies</code> attribute.
	 * @return the travelogixPolicies
	 */
	public Collection<TravelogixPolicy> getTravelogixPolicies()
	{
		return getTravelogixPolicies( getSession().getSessionContext() );
	}
	
	public long getTravelogixPoliciesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTANCILLARYRATEDETAIL2TRAVELOGIXPOLICYRELATION,
			"TravelogixPolicy",
			null
		);
	}
	
	public long getTravelogixPoliciesCount()
	{
		return getTravelogixPoliciesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.travelogixPolicies</code> attribute. 
	 * @param value the travelogixPolicies
	 */
	public void setTravelogixPolicies(final SessionContext ctx, final Collection<TravelogixPolicy> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTANCILLARYRATEDETAIL2TRAVELOGIXPOLICYRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTANCILLARYRATEDETAIL2TRAVELOGIXPOLICYRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAncillaryRateDetail.travelogixPolicies</code> attribute. 
	 * @param value the travelogixPolicies
	 */
	public void setTravelogixPolicies(final Collection<TravelogixPolicy> value)
	{
		setTravelogixPolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travelogixPolicies. 
	 * @param value the item to add to travelogixPolicies
	 */
	public void addToTravelogixPolicies(final SessionContext ctx, final TravelogixPolicy value)
	{
		addLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTANCILLARYRATEDETAIL2TRAVELOGIXPOLICYRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTANCILLARYRATEDETAIL2TRAVELOGIXPOLICYRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travelogixPolicies. 
	 * @param value the item to add to travelogixPolicies
	 */
	public void addToTravelogixPolicies(final TravelogixPolicy value)
	{
		addToTravelogixPolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travelogixPolicies. 
	 * @param value the item to remove from travelogixPolicies
	 */
	public void removeFromTravelogixPolicies(final SessionContext ctx, final TravelogixPolicy value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTANCILLARYRATEDETAIL2TRAVELOGIXPOLICYRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTANCILLARYRATEDETAIL2TRAVELOGIXPOLICYRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travelogixPolicies. 
	 * @param value the item to remove from travelogixPolicies
	 */
	public void removeFromTravelogixPolicies(final TravelogixPolicy value)
	{
		removeFromTravelogixPolicies( getSession().getSessionContext(), value );
	}
	
}
