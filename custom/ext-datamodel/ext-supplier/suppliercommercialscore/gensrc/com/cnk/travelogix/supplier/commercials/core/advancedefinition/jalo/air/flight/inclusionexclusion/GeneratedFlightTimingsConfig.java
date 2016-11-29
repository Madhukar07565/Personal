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
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.flight.inclusionexclusion.FlightTimingsConfig FlightTimingsConfig}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFlightTimingsConfig extends AbstractAdvDefConfig
{
	/** Qualifier of the <code>FlightTimingsConfig.flightTimeFrom</code> attribute **/
	public static final String FLIGHTTIMEFROM = "flightTimeFrom";
	/** Qualifier of the <code>FlightTimingsConfig.flightTimeTo</code> attribute **/
	public static final String FLIGHTTIMETO = "flightTimeTo";
	/** Qualifier of the <code>FlightTimingsConfig.advanceDefinition</code> attribute **/
	public static final String ADVANCEDEFINITION = "advanceDefinition";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ADVANCEDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedFlightTimingsConfig> ADVANCEDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedFlightTimingsConfig>(
	SuppliercommercialscoreConstants.TC.FLIGHTTIMINGSCONFIG,
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
		tmp.put(FLIGHTTIMEFROM, AttributeMode.INITIAL);
		tmp.put(FLIGHTTIMETO, AttributeMode.INITIAL);
		tmp.put(ADVANCEDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTimingsConfig.advanceDefinition</code> attribute.
	 * @return the advanceDefinition
	 */
	public AirSupplierAdvanceDefinition getAdvanceDefinition(final SessionContext ctx)
	{
		return (AirSupplierAdvanceDefinition)getProperty( ctx, ADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTimingsConfig.advanceDefinition</code> attribute.
	 * @return the advanceDefinition
	 */
	public AirSupplierAdvanceDefinition getAdvanceDefinition()
	{
		return getAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTimingsConfig.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition
	 */
	public void setAdvanceDefinition(final SessionContext ctx, final AirSupplierAdvanceDefinition value)
	{
		ADVANCEDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTimingsConfig.advanceDefinition</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>FlightTimingsConfig.flightTimeFrom</code> attribute.
	 * @return the flightTimeFrom
	 */
	public String getFlightTimeFrom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FLIGHTTIMEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTimingsConfig.flightTimeFrom</code> attribute.
	 * @return the flightTimeFrom
	 */
	public String getFlightTimeFrom()
	{
		return getFlightTimeFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTimingsConfig.flightTimeFrom</code> attribute. 
	 * @param value the flightTimeFrom
	 */
	public void setFlightTimeFrom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FLIGHTTIMEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTimingsConfig.flightTimeFrom</code> attribute. 
	 * @param value the flightTimeFrom
	 */
	public void setFlightTimeFrom(final String value)
	{
		setFlightTimeFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTimingsConfig.flightTimeTo</code> attribute.
	 * @return the flightTimeTo
	 */
	public String getFlightTimeTo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FLIGHTTIMETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightTimingsConfig.flightTimeTo</code> attribute.
	 * @return the flightTimeTo
	 */
	public String getFlightTimeTo()
	{
		return getFlightTimeTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTimingsConfig.flightTimeTo</code> attribute. 
	 * @param value the flightTimeTo
	 */
	public void setFlightTimeTo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FLIGHTTIMETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightTimingsConfig.flightTimeTo</code> attribute. 
	 * @param value the flightTimeTo
	 */
	public void setFlightTimeTo(final String value)
	{
		setFlightTimeTo( getSession().getSessionContext(), value );
	}
	
}
