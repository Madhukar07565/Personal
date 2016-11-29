/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.masterdata.core.jalo;

import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractCommonMasterType;
import com.cnk.travelogix.masterdata.core.iata.jalo.AirlineIATAItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.masterdata.core.jalo.TravellerProgram TravellerProgram}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTravellerProgram extends AbstractCommonMasterType
{
	/** Qualifier of the <code>TravellerProgram.airline</code> attribute **/
	public static final String AIRLINE = "airline";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCommonMasterType.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(AIRLINE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProgram.airline</code> attribute.
	 * @return the airline
	 */
	public AirlineIATAItem getAirline(final SessionContext ctx)
	{
		return (AirlineIATAItem)getProperty( ctx, AIRLINE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProgram.airline</code> attribute.
	 * @return the airline
	 */
	public AirlineIATAItem getAirline()
	{
		return getAirline( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProgram.airline</code> attribute. 
	 * @param value the airline
	 */
	public void setAirline(final SessionContext ctx, final AirlineIATAItem value)
	{
		setProperty(ctx, AIRLINE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProgram.airline</code> attribute. 
	 * @param value the airline
	 */
	public void setAirline(final AirlineIATAItem value)
	{
		setAirline( getSession().getSessionContext(), value );
	}
	
}
