/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.company.commercials.core.jalo.definition;

import com.cnk.travelogix.client.commercials.constants.ClientcommercialsConstants;
import com.cnk.travelogix.client.commercials.core.jalo.definition.AbstractClientCompanyAdvanceDefinition;
import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.masterdata.core.c2l.jalo.Continent;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.c2l.Region;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.company.commercials.core.jalo.definition.TravelDestination TravelDestination}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTravelDestination extends GenericItem
{
	/** Qualifier of the <code>TravelDestination.continent</code> attribute **/
	public static final String CONTINENT = "continent";
	/** Qualifier of the <code>TravelDestination.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>TravelDestination.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>TravelDestination.state</code> attribute **/
	public static final String STATE = "state";
	/** Qualifier of the <code>TravelDestination.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>TravelDestination.abstcompclntAdvDefTravelDest</code> attribute **/
	public static final String ABSTCOMPCLNTADVDEFTRAVELDEST = "abstcompclntAdvDefTravelDest";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ABSTCOMPCLNTADVDEFTRAVELDEST's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedTravelDestination> ABSTCOMPCLNTADVDEFTRAVELDESTHANDLER = new BidirectionalOneToManyHandler<GeneratedTravelDestination>(
	ClientcommercialsConstants.TC.TRAVELDESTINATION,
	false,
	"abstcompclntAdvDefTravelDest",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CONTINENT, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(STATE, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		tmp.put(ABSTCOMPCLNTADVDEFTRAVELDEST, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDestination.abstcompclntAdvDefTravelDest</code> attribute.
	 * @return the abstcompclntAdvDefTravelDest
	 */
	public AbstractClientCompanyAdvanceDefinition getAbstcompclntAdvDefTravelDest(final SessionContext ctx)
	{
		return (AbstractClientCompanyAdvanceDefinition)getProperty( ctx, ABSTCOMPCLNTADVDEFTRAVELDEST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDestination.abstcompclntAdvDefTravelDest</code> attribute.
	 * @return the abstcompclntAdvDefTravelDest
	 */
	public AbstractClientCompanyAdvanceDefinition getAbstcompclntAdvDefTravelDest()
	{
		return getAbstcompclntAdvDefTravelDest( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDestination.abstcompclntAdvDefTravelDest</code> attribute. 
	 * @param value the abstcompclntAdvDefTravelDest
	 */
	public void setAbstcompclntAdvDefTravelDest(final SessionContext ctx, final AbstractClientCompanyAdvanceDefinition value)
	{
		ABSTCOMPCLNTADVDEFTRAVELDESTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDestination.abstcompclntAdvDefTravelDest</code> attribute. 
	 * @param value the abstcompclntAdvDefTravelDest
	 */
	public void setAbstcompclntAdvDefTravelDest(final AbstractClientCompanyAdvanceDefinition value)
	{
		setAbstcompclntAdvDefTravelDest( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDestination.city</code> attribute.
	 * @return the city
	 */
	public City getCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDestination.city</code> attribute.
	 * @return the city
	 */
	public City getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDestination.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDestination.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final City value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDestination.continent</code> attribute.
	 * @return the continent
	 */
	public Continent getContinent(final SessionContext ctx)
	{
		return (Continent)getProperty( ctx, CONTINENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDestination.continent</code> attribute.
	 * @return the continent
	 */
	public Continent getContinent()
	{
		return getContinent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDestination.continent</code> attribute. 
	 * @param value the continent
	 */
	public void setContinent(final SessionContext ctx, final Continent value)
	{
		setProperty(ctx, CONTINENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDestination.continent</code> attribute. 
	 * @param value the continent
	 */
	public void setContinent(final Continent value)
	{
		setContinent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDestination.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDestination.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDestination.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDestination.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ABSTCOMPCLNTADVDEFTRAVELDESTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDestination.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDestination.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDestination.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDestination.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final Product value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDestination.state</code> attribute.
	 * @return the state
	 */
	public Region getState(final SessionContext ctx)
	{
		return (Region)getProperty( ctx, STATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDestination.state</code> attribute.
	 * @return the state
	 */
	public Region getState()
	{
		return getState( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDestination.state</code> attribute. 
	 * @param value the state
	 */
	public void setState(final SessionContext ctx, final Region value)
	{
		setProperty(ctx, STATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDestination.state</code> attribute. 
	 * @param value the state
	 */
	public void setState(final Region value)
	{
		setState( getSession().getSessionContext(), value );
	}
	
}
