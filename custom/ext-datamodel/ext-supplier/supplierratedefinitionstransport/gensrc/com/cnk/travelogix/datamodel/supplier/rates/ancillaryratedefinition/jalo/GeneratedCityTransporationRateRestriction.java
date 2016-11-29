/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.ancillaryratedefinition.jalo;

import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionstransportConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.ancillaryratedefinition.jalo.CityTransporationRateRestriction CityTransporationRateRestriction}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCityTransporationRateRestriction extends GenericItem
{
	/** Qualifier of the <code>CityTransporationRateRestriction.cities</code> attribute **/
	public static final String CITIES = "cities";
	/**
	* {@link OneToManyHandler} for handling 1:n CITIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<City> CITIESHANDLER = new OneToManyHandler<City>(
	MasterdatacoreConstants.TC.CITY,
	false,
	"cityTransporationRateRestriction",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CityTransporationRateRestriction.cities</code> attribute.
	 * @return the cities
	 */
	public Set<City> getCities(final SessionContext ctx)
	{
		return (Set<City>)CITIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CityTransporationRateRestriction.cities</code> attribute.
	 * @return the cities
	 */
	public Set<City> getCities()
	{
		return getCities( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CityTransporationRateRestriction.cities</code> attribute. 
	 * @param value the cities
	 */
	public void setCities(final SessionContext ctx, final Set<City> value)
	{
		CITIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CityTransporationRateRestriction.cities</code> attribute. 
	 * @param value the cities
	 */
	public void setCities(final Set<City> value)
	{
		setCities( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cities. 
	 * @param value the item to add to cities
	 */
	public void addToCities(final SessionContext ctx, final City value)
	{
		CITIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cities. 
	 * @param value the item to add to cities
	 */
	public void addToCities(final City value)
	{
		addToCities( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cities. 
	 * @param value the item to remove from cities
	 */
	public void removeFromCities(final SessionContext ctx, final City value)
	{
		CITIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cities. 
	 * @param value the item to remove from cities
	 */
	public void removeFromCities(final City value)
	{
		removeFromCities( getSession().getSessionContext(), value );
	}
	
}
