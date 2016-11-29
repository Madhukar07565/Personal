/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.company.commercials.core.jalo.definition;

import com.cnk.travelogix.client.commercials.constants.ClientcommercialsConstants;
import com.cnk.travelogix.company.commercials.core.jalo.definition.FlightClientCompanyAdvanceDefinition;
import com.cnk.travelogix.masterdata.core.fare.jalo.FareBasis;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.company.commercials.core.jalo.definition.FareDetail FareDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFareDetail extends GenericItem
{
	/** Qualifier of the <code>FareDetail.fareBasis</code> attribute **/
	public static final String FAREBASIS = "fareBasis";
	/** Qualifier of the <code>FareDetail.fareValue</code> attribute **/
	public static final String FAREVALUE = "fareValue";
	/** Qualifier of the <code>FareDetail.flightCompAdvDefFare</code> attribute **/
	public static final String FLIGHTCOMPADVDEFFARE = "flightCompAdvDefFare";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n FLIGHTCOMPADVDEFFARE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedFareDetail> FLIGHTCOMPADVDEFFAREHANDLER = new BidirectionalOneToManyHandler<GeneratedFareDetail>(
	ClientcommercialsConstants.TC.FAREDETAIL,
	false,
	"flightCompAdvDefFare",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(FAREBASIS, AttributeMode.INITIAL);
		tmp.put(FAREVALUE, AttributeMode.INITIAL);
		tmp.put(FLIGHTCOMPADVDEFFARE, AttributeMode.INITIAL);
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
		FLIGHTCOMPADVDEFFAREHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FareDetail.fareBasis</code> attribute.
	 * @return the fareBasis
	 */
	public FareBasis getFareBasis(final SessionContext ctx)
	{
		return (FareBasis)getProperty( ctx, FAREBASIS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FareDetail.fareBasis</code> attribute.
	 * @return the fareBasis
	 */
	public FareBasis getFareBasis()
	{
		return getFareBasis( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FareDetail.fareBasis</code> attribute. 
	 * @param value the fareBasis
	 */
	public void setFareBasis(final SessionContext ctx, final FareBasis value)
	{
		setProperty(ctx, FAREBASIS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FareDetail.fareBasis</code> attribute. 
	 * @param value the fareBasis
	 */
	public void setFareBasis(final FareBasis value)
	{
		setFareBasis( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FareDetail.fareValue</code> attribute.
	 * @return the fareValue
	 */
	public String getFareValue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FAREVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FareDetail.fareValue</code> attribute.
	 * @return the fareValue
	 */
	public String getFareValue()
	{
		return getFareValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FareDetail.fareValue</code> attribute. 
	 * @param value the fareValue
	 */
	public void setFareValue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FAREVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FareDetail.fareValue</code> attribute. 
	 * @param value the fareValue
	 */
	public void setFareValue(final String value)
	{
		setFareValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FareDetail.flightCompAdvDefFare</code> attribute.
	 * @return the flightCompAdvDefFare
	 */
	public FlightClientCompanyAdvanceDefinition getFlightCompAdvDefFare(final SessionContext ctx)
	{
		return (FlightClientCompanyAdvanceDefinition)getProperty( ctx, FLIGHTCOMPADVDEFFARE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FareDetail.flightCompAdvDefFare</code> attribute.
	 * @return the flightCompAdvDefFare
	 */
	public FlightClientCompanyAdvanceDefinition getFlightCompAdvDefFare()
	{
		return getFlightCompAdvDefFare( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FareDetail.flightCompAdvDefFare</code> attribute. 
	 * @param value the flightCompAdvDefFare
	 */
	public void setFlightCompAdvDefFare(final SessionContext ctx, final FlightClientCompanyAdvanceDefinition value)
	{
		FLIGHTCOMPADVDEFFAREHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FareDetail.flightCompAdvDefFare</code> attribute. 
	 * @param value the flightCompAdvDefFare
	 */
	public void setFlightCompAdvDefFare(final FlightClientCompanyAdvanceDefinition value)
	{
		setFlightCompAdvDefFare( getSession().getSessionContext(), value );
	}
	
}
