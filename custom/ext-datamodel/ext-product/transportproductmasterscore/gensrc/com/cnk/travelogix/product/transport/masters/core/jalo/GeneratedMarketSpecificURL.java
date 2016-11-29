/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.orgstructure.core.jalo.Market;
import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import com.cnk.travelogix.product.transport.masters.core.jalo.FlightProduct;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.transport.masters.core.jalo.MarketSpecificURL MarketSpecificURL}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMarketSpecificURL extends GenericItem
{
	/** Qualifier of the <code>MarketSpecificURL.market</code> attribute **/
	public static final String MARKET = "market";
	/** Qualifier of the <code>MarketSpecificURL.url</code> attribute **/
	public static final String URL = "url";
	/** Qualifier of the <code>MarketSpecificURL.urlType</code> attribute **/
	public static final String URLTYPE = "urlType";
	/** Qualifier of the <code>MarketSpecificURL.flightProduct</code> attribute **/
	public static final String FLIGHTPRODUCT = "flightProduct";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n FLIGHTPRODUCT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedMarketSpecificURL> FLIGHTPRODUCTHANDLER = new BidirectionalOneToManyHandler<GeneratedMarketSpecificURL>(
	TransportproductmasterscoreConstants.TC.MARKETSPECIFICURL,
	false,
	"flightProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(MARKET, AttributeMode.INITIAL);
		tmp.put(URL, AttributeMode.INITIAL);
		tmp.put(URLTYPE, AttributeMode.INITIAL);
		tmp.put(FLIGHTPRODUCT, AttributeMode.INITIAL);
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
		FLIGHTPRODUCTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketSpecificURL.flightProduct</code> attribute.
	 * @return the flightProduct
	 */
	public FlightProduct getFlightProduct(final SessionContext ctx)
	{
		return (FlightProduct)getProperty( ctx, FLIGHTPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketSpecificURL.flightProduct</code> attribute.
	 * @return the flightProduct
	 */
	public FlightProduct getFlightProduct()
	{
		return getFlightProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketSpecificURL.flightProduct</code> attribute. 
	 * @param value the flightProduct
	 */
	public void setFlightProduct(final SessionContext ctx, final FlightProduct value)
	{
		FLIGHTPRODUCTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketSpecificURL.flightProduct</code> attribute. 
	 * @param value the flightProduct
	 */
	public void setFlightProduct(final FlightProduct value)
	{
		setFlightProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketSpecificURL.market</code> attribute.
	 * @return the market - To show Market.
	 */
	public Market getMarket(final SessionContext ctx)
	{
		return (Market)getProperty( ctx, MARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketSpecificURL.market</code> attribute.
	 * @return the market - To show Market.
	 */
	public Market getMarket()
	{
		return getMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketSpecificURL.market</code> attribute. 
	 * @param value the market - To show Market.
	 */
	public void setMarket(final SessionContext ctx, final Market value)
	{
		setProperty(ctx, MARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketSpecificURL.market</code> attribute. 
	 * @param value the market - To show Market.
	 */
	public void setMarket(final Market value)
	{
		setMarket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketSpecificURL.url</code> attribute.
	 * @return the url - To show the Traveler Program ID
	 */
	public String getUrl(final SessionContext ctx)
	{
		return (String)getProperty( ctx, URL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketSpecificURL.url</code> attribute.
	 * @return the url - To show the Traveler Program ID
	 */
	public String getUrl()
	{
		return getUrl( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketSpecificURL.url</code> attribute. 
	 * @param value the url - To show the Traveler Program ID
	 */
	public void setUrl(final SessionContext ctx, final String value)
	{
		setProperty(ctx, URL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketSpecificURL.url</code> attribute. 
	 * @param value the url - To show the Traveler Program ID
	 */
	public void setUrl(final String value)
	{
		setUrl( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketSpecificURL.urlType</code> attribute.
	 * @return the urlType - To show the Traveler Program Localized Name
	 */
	public EnumerationValue getUrlType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, URLTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketSpecificURL.urlType</code> attribute.
	 * @return the urlType - To show the Traveler Program Localized Name
	 */
	public EnumerationValue getUrlType()
	{
		return getUrlType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketSpecificURL.urlType</code> attribute. 
	 * @param value the urlType - To show the Traveler Program Localized Name
	 */
	public void setUrlType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, URLTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketSpecificURL.urlType</code> attribute. 
	 * @param value the urlType - To show the Traveler Program Localized Name
	 */
	public void setUrlType(final EnumerationValue value)
	{
		setUrlType( getSession().getSessionContext(), value );
	}
	
}
