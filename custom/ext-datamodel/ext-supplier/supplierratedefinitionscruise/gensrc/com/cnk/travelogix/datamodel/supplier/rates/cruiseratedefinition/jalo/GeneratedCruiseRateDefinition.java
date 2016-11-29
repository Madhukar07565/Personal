/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.cruiseratedefinition.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.cruiseratedetail.jalo.CruiseRateDetail;
import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.jalo.TravelogixPolicy;
import com.cnk.travelogix.product.transport.masters.core.jalo.CruiseItinerary;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscruiseConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractRateDefinition;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.cruiseratedefinition.jalo.CruiseRateDefinition CruiseRateDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCruiseRateDefinition extends AbstractRateDefinition
{
	/** Qualifier of the <code>CruiseRateDefinition.itinerary</code> attribute **/
	public static final String ITINERARY = "itinerary";
	/** Qualifier of the <code>CruiseRateDefinition.priceApplicability</code> attribute **/
	public static final String PRICEAPPLICABILITY = "priceApplicability";
	/** Qualifier of the <code>CruiseRateDefinition.cabins</code> attribute **/
	public static final String CABINS = "cabins";
	/** Qualifier of the <code>CruiseRateDefinition.comparator</code> attribute **/
	public static final String COMPARATOR = "comparator";
	/** Qualifier of the <code>CruiseRateDefinition.cruiseRateDetails</code> attribute **/
	public static final String CRUISERATEDETAILS = "cruiseRateDetails";
	/** Qualifier of the <code>CruiseRateDefinition.travelogixPolicies</code> attribute **/
	public static final String TRAVELOGIXPOLICIES = "travelogixPolicies";
	/**
	* {@link OneToManyHandler} for handling 1:n CRUISERATEDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CruiseRateDetail> CRUISERATEDETAILSHANDLER = new OneToManyHandler<CruiseRateDetail>(
	SupplierratedefinitionscruiseConstants.TC.CRUISERATEDETAIL,
	true,
	"cruiseratedefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n TRAVELOGIXPOLICIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TravelogixPolicy> TRAVELOGIXPOLICIESHANDLER = new OneToManyHandler<TravelogixPolicy>(
	MasterdatacoreConstants.TC.TRAVELOGIXPOLICY,
	false,
	"cruiseratedefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractRateDefinition.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ITINERARY, AttributeMode.INITIAL);
		tmp.put(PRICEAPPLICABILITY, AttributeMode.INITIAL);
		tmp.put(CABINS, AttributeMode.INITIAL);
		tmp.put(COMPARATOR, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDefinition.cabins</code> attribute.
	 * @return the cabins
	 */
	public Integer getCabins(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, CABINS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDefinition.cabins</code> attribute.
	 * @return the cabins
	 */
	public Integer getCabins()
	{
		return getCabins( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDefinition.cabins</code> attribute. 
	 * @return the cabins
	 */
	public int getCabinsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCabins( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDefinition.cabins</code> attribute. 
	 * @return the cabins
	 */
	public int getCabinsAsPrimitive()
	{
		return getCabinsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDefinition.cabins</code> attribute. 
	 * @param value the cabins
	 */
	public void setCabins(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, CABINS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDefinition.cabins</code> attribute. 
	 * @param value the cabins
	 */
	public void setCabins(final Integer value)
	{
		setCabins( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDefinition.cabins</code> attribute. 
	 * @param value the cabins
	 */
	public void setCabins(final SessionContext ctx, final int value)
	{
		setCabins( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDefinition.cabins</code> attribute. 
	 * @param value the cabins
	 */
	public void setCabins(final int value)
	{
		setCabins( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDefinition.comparator</code> attribute.
	 * @return the comparator
	 */
	public EnumerationValue getComparator(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMPARATOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDefinition.comparator</code> attribute.
	 * @return the comparator
	 */
	public EnumerationValue getComparator()
	{
		return getComparator( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDefinition.comparator</code> attribute. 
	 * @param value the comparator
	 */
	public void setComparator(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMPARATOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDefinition.comparator</code> attribute. 
	 * @param value the comparator
	 */
	public void setComparator(final EnumerationValue value)
	{
		setComparator( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDefinition.cruiseRateDetails</code> attribute.
	 * @return the cruiseRateDetails
	 */
	public Collection<CruiseRateDetail> getCruiseRateDetails(final SessionContext ctx)
	{
		return CRUISERATEDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDefinition.cruiseRateDetails</code> attribute.
	 * @return the cruiseRateDetails
	 */
	public Collection<CruiseRateDetail> getCruiseRateDetails()
	{
		return getCruiseRateDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDefinition.cruiseRateDetails</code> attribute. 
	 * @param value the cruiseRateDetails
	 */
	public void setCruiseRateDetails(final SessionContext ctx, final Collection<CruiseRateDetail> value)
	{
		CRUISERATEDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDefinition.cruiseRateDetails</code> attribute. 
	 * @param value the cruiseRateDetails
	 */
	public void setCruiseRateDetails(final Collection<CruiseRateDetail> value)
	{
		setCruiseRateDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cruiseRateDetails. 
	 * @param value the item to add to cruiseRateDetails
	 */
	public void addToCruiseRateDetails(final SessionContext ctx, final CruiseRateDetail value)
	{
		CRUISERATEDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cruiseRateDetails. 
	 * @param value the item to add to cruiseRateDetails
	 */
	public void addToCruiseRateDetails(final CruiseRateDetail value)
	{
		addToCruiseRateDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cruiseRateDetails. 
	 * @param value the item to remove from cruiseRateDetails
	 */
	public void removeFromCruiseRateDetails(final SessionContext ctx, final CruiseRateDetail value)
	{
		CRUISERATEDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cruiseRateDetails. 
	 * @param value the item to remove from cruiseRateDetails
	 */
	public void removeFromCruiseRateDetails(final CruiseRateDetail value)
	{
		removeFromCruiseRateDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDefinition.itinerary</code> attribute.
	 * @return the itinerary
	 */
	public CruiseItinerary getItinerary(final SessionContext ctx)
	{
		return (CruiseItinerary)getProperty( ctx, ITINERARY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDefinition.itinerary</code> attribute.
	 * @return the itinerary
	 */
	public CruiseItinerary getItinerary()
	{
		return getItinerary( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDefinition.itinerary</code> attribute. 
	 * @param value the itinerary
	 */
	public void setItinerary(final SessionContext ctx, final CruiseItinerary value)
	{
		setProperty(ctx, ITINERARY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDefinition.itinerary</code> attribute. 
	 * @param value the itinerary
	 */
	public void setItinerary(final CruiseItinerary value)
	{
		setItinerary( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDefinition.priceApplicability</code> attribute.
	 * @return the priceApplicability
	 */
	public EnumerationValue getPriceApplicability(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PRICEAPPLICABILITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDefinition.priceApplicability</code> attribute.
	 * @return the priceApplicability
	 */
	public EnumerationValue getPriceApplicability()
	{
		return getPriceApplicability( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDefinition.priceApplicability</code> attribute. 
	 * @param value the priceApplicability
	 */
	public void setPriceApplicability(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PRICEAPPLICABILITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDefinition.priceApplicability</code> attribute. 
	 * @param value the priceApplicability
	 */
	public void setPriceApplicability(final EnumerationValue value)
	{
		setPriceApplicability( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDefinition.travelogixPolicies</code> attribute.
	 * @return the travelogixPolicies
	 */
	public Collection<TravelogixPolicy> getTravelogixPolicies(final SessionContext ctx)
	{
		return TRAVELOGIXPOLICIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateDefinition.travelogixPolicies</code> attribute.
	 * @return the travelogixPolicies
	 */
	public Collection<TravelogixPolicy> getTravelogixPolicies()
	{
		return getTravelogixPolicies( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDefinition.travelogixPolicies</code> attribute. 
	 * @param value the travelogixPolicies
	 */
	public void setTravelogixPolicies(final SessionContext ctx, final Collection<TravelogixPolicy> value)
	{
		TRAVELOGIXPOLICIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateDefinition.travelogixPolicies</code> attribute. 
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
		TRAVELOGIXPOLICIESHANDLER.addValue( ctx, this, value );
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
		TRAVELOGIXPOLICIESHANDLER.removeValue( ctx, this, value );
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
