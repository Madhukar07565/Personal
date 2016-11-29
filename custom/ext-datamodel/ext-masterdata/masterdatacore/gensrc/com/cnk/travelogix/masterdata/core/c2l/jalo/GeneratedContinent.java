/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.masterdata.core.c2l.jalo;

import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LItem;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.masterdata.core.c2l.jalo.Continent Continent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedContinent extends C2LItem
{
	/** Qualifier of the <code>Continent.countries</code> attribute **/
	public static final String COUNTRIES = "countries";
	/**
	* {@link OneToManyHandler} for handling 1:n COUNTRIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Country> COUNTRIESHANDLER = new OneToManyHandler<Country>(
	CoreConstants.TC.COUNTRY,
	false,
	"continent",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(C2LItem.DEFAULT_INITIAL_ATTRIBUTES);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Continent.countries</code> attribute.
	 * @return the countries
	 */
	public Set<Country> getCountries(final SessionContext ctx)
	{
		return (Set<Country>)COUNTRIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Continent.countries</code> attribute.
	 * @return the countries
	 */
	public Set<Country> getCountries()
	{
		return getCountries( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Continent.countries</code> attribute. 
	 * @param value the countries
	 */
	public void setCountries(final SessionContext ctx, final Set<Country> value)
	{
		COUNTRIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Continent.countries</code> attribute. 
	 * @param value the countries
	 */
	public void setCountries(final Set<Country> value)
	{
		setCountries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to countries. 
	 * @param value the item to add to countries
	 */
	public void addToCountries(final SessionContext ctx, final Country value)
	{
		COUNTRIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to countries. 
	 * @param value the item to add to countries
	 */
	public void addToCountries(final Country value)
	{
		addToCountries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from countries. 
	 * @param value the item to remove from countries
	 */
	public void removeFromCountries(final SessionContext ctx, final Country value)
	{
		COUNTRIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from countries. 
	 * @param value the item to remove from countries
	 */
	public void removeFromCountries(final Country value)
	{
		removeFromCountries( getSession().getSessionContext(), value );
	}
	
}
