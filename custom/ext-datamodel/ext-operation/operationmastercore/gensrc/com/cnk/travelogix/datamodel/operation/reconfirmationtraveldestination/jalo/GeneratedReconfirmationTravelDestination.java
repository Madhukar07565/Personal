/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.operation.reconfirmationtraveldestination.jalo;

import com.cnk.travelogix.datamodel.operation.reconfirmationconfig.jalo.ReconfirmationConfig;
import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.masterdata.core.c2l.jalo.Continent;
import com.cnk.travelogix.operation.constants.OperationmastercoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.operation.reconfirmationtraveldestination.jalo.ReconfirmationTravelDestination ReconfirmationTravelDestination}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedReconfirmationTravelDestination extends GenericItem
{
	/** Qualifier of the <code>ReconfirmationTravelDestination.inclusion</code> attribute **/
	public static final String INCLUSION = "inclusion";
	/** Qualifier of the <code>ReconfirmationTravelDestination.continent</code> attribute **/
	public static final String CONTINENT = "continent";
	/** Qualifier of the <code>ReconfirmationTravelDestination.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>ReconfirmationTravelDestination.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>ReconfirmationTravelDestination.reconfirmationconfig</code> attribute **/
	public static final String RECONFIRMATIONCONFIG = "reconfirmationconfig";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n RECONFIRMATIONCONFIG's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedReconfirmationTravelDestination> RECONFIRMATIONCONFIGHANDLER = new BidirectionalOneToManyHandler<GeneratedReconfirmationTravelDestination>(
	OperationmastercoreConstants.TC.RECONFIRMATIONTRAVELDESTINATION,
	false,
	"reconfirmationconfig",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(INCLUSION, AttributeMode.INITIAL);
		tmp.put(CONTINENT, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(RECONFIRMATIONCONFIG, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationTravelDestination.city</code> attribute.
	 * @return the city
	 */
	public City getCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationTravelDestination.city</code> attribute.
	 * @return the city
	 */
	public City getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationTravelDestination.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationTravelDestination.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final City value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationTravelDestination.continent</code> attribute.
	 * @return the continent
	 */
	public Continent getContinent(final SessionContext ctx)
	{
		return (Continent)getProperty( ctx, CONTINENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationTravelDestination.continent</code> attribute.
	 * @return the continent
	 */
	public Continent getContinent()
	{
		return getContinent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationTravelDestination.continent</code> attribute. 
	 * @param value the continent
	 */
	public void setContinent(final SessionContext ctx, final Continent value)
	{
		setProperty(ctx, CONTINENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationTravelDestination.continent</code> attribute. 
	 * @param value the continent
	 */
	public void setContinent(final Continent value)
	{
		setContinent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationTravelDestination.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationTravelDestination.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationTravelDestination.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationTravelDestination.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		RECONFIRMATIONCONFIGHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationTravelDestination.inclusion</code> attribute.
	 * @return the inclusion
	 */
	public Boolean isInclusion(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, INCLUSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationTravelDestination.inclusion</code> attribute.
	 * @return the inclusion
	 */
	public Boolean isInclusion()
	{
		return isInclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationTravelDestination.inclusion</code> attribute. 
	 * @return the inclusion
	 */
	public boolean isInclusionAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isInclusion( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationTravelDestination.inclusion</code> attribute. 
	 * @return the inclusion
	 */
	public boolean isInclusionAsPrimitive()
	{
		return isInclusionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationTravelDestination.inclusion</code> attribute. 
	 * @param value the inclusion
	 */
	public void setInclusion(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, INCLUSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationTravelDestination.inclusion</code> attribute. 
	 * @param value the inclusion
	 */
	public void setInclusion(final Boolean value)
	{
		setInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationTravelDestination.inclusion</code> attribute. 
	 * @param value the inclusion
	 */
	public void setInclusion(final SessionContext ctx, final boolean value)
	{
		setInclusion( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationTravelDestination.inclusion</code> attribute. 
	 * @param value the inclusion
	 */
	public void setInclusion(final boolean value)
	{
		setInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationTravelDestination.reconfirmationconfig</code> attribute.
	 * @return the reconfirmationconfig
	 */
	public ReconfirmationConfig getReconfirmationconfig(final SessionContext ctx)
	{
		return (ReconfirmationConfig)getProperty( ctx, RECONFIRMATIONCONFIG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationTravelDestination.reconfirmationconfig</code> attribute.
	 * @return the reconfirmationconfig
	 */
	public ReconfirmationConfig getReconfirmationconfig()
	{
		return getReconfirmationconfig( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationTravelDestination.reconfirmationconfig</code> attribute. 
	 * @param value the reconfirmationconfig
	 */
	public void setReconfirmationconfig(final SessionContext ctx, final ReconfirmationConfig value)
	{
		RECONFIRMATIONCONFIGHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationTravelDestination.reconfirmationconfig</code> attribute. 
	 * @param value the reconfirmationconfig
	 */
	public void setReconfirmationconfig(final ReconfirmationConfig value)
	{
		setReconfirmationconfig( getSession().getSessionContext(), value );
	}
	
}
