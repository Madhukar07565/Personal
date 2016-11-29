/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.flight.inclusionexclusion;

import com.cnk.travelogix.supplier.commercials.core.advancedefinition.config.jalo.AbstractAdvDefConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.AirSupplierAdvanceDefinition;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
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
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.flight.inclusionexclusion.FlightNumbersConfig FlightNumbersConfig}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFlightNumbersConfig extends AbstractAdvDefConfig
{
	/** Qualifier of the <code>FlightNumbersConfig.flightnumberFrom</code> attribute **/
	public static final String FLIGHTNUMBERFROM = "flightnumberFrom";
	/** Qualifier of the <code>FlightNumbersConfig.flightNumberTo</code> attribute **/
	public static final String FLIGHTNUMBERTO = "flightNumberTo";
	/** Qualifier of the <code>FlightNumbersConfig.advanceDefinition</code> attribute **/
	public static final String ADVANCEDEFINITION = "advanceDefinition";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ADVANCEDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedFlightNumbersConfig> ADVANCEDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedFlightNumbersConfig>(
	SuppliercommercialscoreConstants.TC.FLIGHTNUMBERSCONFIG,
	false,
	"advanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractAdvDefConfig.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(FLIGHTNUMBERFROM, AttributeMode.INITIAL);
		tmp.put(FLIGHTNUMBERTO, AttributeMode.INITIAL);
		tmp.put(ADVANCEDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightNumbersConfig.advanceDefinition</code> attribute.
	 * @return the advanceDefinition
	 */
	public AirSupplierAdvanceDefinition getAdvanceDefinition(final SessionContext ctx)
	{
		return (AirSupplierAdvanceDefinition)getProperty( ctx, ADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightNumbersConfig.advanceDefinition</code> attribute.
	 * @return the advanceDefinition
	 */
	public AirSupplierAdvanceDefinition getAdvanceDefinition()
	{
		return getAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightNumbersConfig.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition
	 */
	public void setAdvanceDefinition(final SessionContext ctx, final AirSupplierAdvanceDefinition value)
	{
		ADVANCEDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightNumbersConfig.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition
	 */
	public void setAdvanceDefinition(final AirSupplierAdvanceDefinition value)
	{
		setAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ADVANCEDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightNumbersConfig.flightnumberFrom</code> attribute.
	 * @return the flightnumberFrom
	 */
	public String getFlightnumberFrom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FLIGHTNUMBERFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightNumbersConfig.flightnumberFrom</code> attribute.
	 * @return the flightnumberFrom
	 */
	public String getFlightnumberFrom()
	{
		return getFlightnumberFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightNumbersConfig.flightnumberFrom</code> attribute. 
	 * @param value the flightnumberFrom
	 */
	public void setFlightnumberFrom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FLIGHTNUMBERFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightNumbersConfig.flightnumberFrom</code> attribute. 
	 * @param value the flightnumberFrom
	 */
	public void setFlightnumberFrom(final String value)
	{
		setFlightnumberFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightNumbersConfig.flightNumberTo</code> attribute.
	 * @return the flightNumberTo
	 */
	public String getFlightNumberTo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FLIGHTNUMBERTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightNumbersConfig.flightNumberTo</code> attribute.
	 * @return the flightNumberTo
	 */
	public String getFlightNumberTo()
	{
		return getFlightNumberTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightNumbersConfig.flightNumberTo</code> attribute. 
	 * @param value the flightNumberTo
	 */
	public void setFlightNumberTo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FLIGHTNUMBERTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightNumbersConfig.flightNumberTo</code> attribute. 
	 * @param value the flightNumberTo
	 */
	public void setFlightNumberTo(final String value)
	{
		setFlightNumberTo( getSession().getSessionContext(), value );
	}
	
}
