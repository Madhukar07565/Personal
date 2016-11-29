/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.masterdata.core.iata.jalo.Airport;
import com.cnk.travelogix.orgstructure.core.jalo.Market;
import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import com.cnk.travelogix.product.transport.masters.core.jalo.FlightProduct;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.transport.masters.core.jalo.MarketSpecificLogo MarketSpecificLogo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMarketSpecificLogo extends GenericItem
{
	/** Qualifier of the <code>MarketSpecificLogo.market</code> attribute **/
	public static final String MARKET = "market";
	/** Qualifier of the <code>MarketSpecificLogo.sectorFrom</code> attribute **/
	public static final String SECTORFROM = "sectorFrom";
	/** Qualifier of the <code>MarketSpecificLogo.sectorTo</code> attribute **/
	public static final String SECTORTO = "sectorTo";
	/** Qualifier of the <code>MarketSpecificLogo.cabinClass</code> attribute **/
	public static final String CABINCLASS = "cabinClass";
	/** Qualifier of the <code>MarketSpecificLogo.logo</code> attribute **/
	public static final String LOGO = "logo";
	/** Qualifier of the <code>MarketSpecificLogo.flightProduct</code> attribute **/
	public static final String FLIGHTPRODUCT = "flightProduct";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n FLIGHTPRODUCT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedMarketSpecificLogo> FLIGHTPRODUCTHANDLER = new BidirectionalOneToManyHandler<GeneratedMarketSpecificLogo>(
	TransportproductmasterscoreConstants.TC.MARKETSPECIFICLOGO,
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
		tmp.put(SECTORFROM, AttributeMode.INITIAL);
		tmp.put(SECTORTO, AttributeMode.INITIAL);
		tmp.put(CABINCLASS, AttributeMode.INITIAL);
		tmp.put(LOGO, AttributeMode.INITIAL);
		tmp.put(FLIGHTPRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketSpecificLogo.cabinClass</code> attribute.
	 * @return the cabinClass - To show cabin Class.
	 */
	public EnumerationValue getCabinClass(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CABINCLASS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketSpecificLogo.cabinClass</code> attribute.
	 * @return the cabinClass - To show cabin Class.
	 */
	public EnumerationValue getCabinClass()
	{
		return getCabinClass( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketSpecificLogo.cabinClass</code> attribute. 
	 * @param value the cabinClass - To show cabin Class.
	 */
	public void setCabinClass(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CABINCLASS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketSpecificLogo.cabinClass</code> attribute. 
	 * @param value the cabinClass - To show cabin Class.
	 */
	public void setCabinClass(final EnumerationValue value)
	{
		setCabinClass( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		FLIGHTPRODUCTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketSpecificLogo.flightProduct</code> attribute.
	 * @return the flightProduct
	 */
	public FlightProduct getFlightProduct(final SessionContext ctx)
	{
		return (FlightProduct)getProperty( ctx, FLIGHTPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketSpecificLogo.flightProduct</code> attribute.
	 * @return the flightProduct
	 */
	public FlightProduct getFlightProduct()
	{
		return getFlightProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketSpecificLogo.flightProduct</code> attribute. 
	 * @param value the flightProduct
	 */
	public void setFlightProduct(final SessionContext ctx, final FlightProduct value)
	{
		FLIGHTPRODUCTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketSpecificLogo.flightProduct</code> attribute. 
	 * @param value the flightProduct
	 */
	public void setFlightProduct(final FlightProduct value)
	{
		setFlightProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketSpecificLogo.logo</code> attribute.
	 * @return the logo - To show logo.
	 */
	public Media getLogo(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedMarketSpecificLogo.getLogo requires a session language", 0 );
		}
		return (Media)getLocalizedProperty( ctx, LOGO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketSpecificLogo.logo</code> attribute.
	 * @return the logo - To show logo.
	 */
	public Media getLogo()
	{
		return getLogo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketSpecificLogo.logo</code> attribute. 
	 * @return the localized logo - To show logo.
	 */
	public Map<Language,Media> getAllLogo(final SessionContext ctx)
	{
		return (Map<Language,Media>)getAllLocalizedProperties(ctx,LOGO,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketSpecificLogo.logo</code> attribute. 
	 * @return the localized logo - To show logo.
	 */
	public Map<Language,Media> getAllLogo()
	{
		return getAllLogo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketSpecificLogo.logo</code> attribute. 
	 * @param value the logo - To show logo.
	 */
	public void setLogo(final SessionContext ctx, final Media value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedMarketSpecificLogo.setLogo requires a session language", 0 );
		}
		setLocalizedProperty(ctx, LOGO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketSpecificLogo.logo</code> attribute. 
	 * @param value the logo - To show logo.
	 */
	public void setLogo(final Media value)
	{
		setLogo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketSpecificLogo.logo</code> attribute. 
	 * @param value the logo - To show logo.
	 */
	public void setAllLogo(final SessionContext ctx, final Map<Language,Media> value)
	{
		setAllLocalizedProperties(ctx,LOGO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketSpecificLogo.logo</code> attribute. 
	 * @param value the logo - To show logo.
	 */
	public void setAllLogo(final Map<Language,Media> value)
	{
		setAllLogo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketSpecificLogo.market</code> attribute.
	 * @return the market - To show Market.
	 */
	public Market getMarket(final SessionContext ctx)
	{
		return (Market)getProperty( ctx, MARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketSpecificLogo.market</code> attribute.
	 * @return the market - To show Market.
	 */
	public Market getMarket()
	{
		return getMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketSpecificLogo.market</code> attribute. 
	 * @param value the market - To show Market.
	 */
	public void setMarket(final SessionContext ctx, final Market value)
	{
		setProperty(ctx, MARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketSpecificLogo.market</code> attribute. 
	 * @param value the market - To show Market.
	 */
	public void setMarket(final Market value)
	{
		setMarket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketSpecificLogo.sectorFrom</code> attribute.
	 * @return the sectorFrom - To show sector From.
	 */
	public Airport getSectorFrom(final SessionContext ctx)
	{
		return (Airport)getProperty( ctx, SECTORFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketSpecificLogo.sectorFrom</code> attribute.
	 * @return the sectorFrom - To show sector From.
	 */
	public Airport getSectorFrom()
	{
		return getSectorFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketSpecificLogo.sectorFrom</code> attribute. 
	 * @param value the sectorFrom - To show sector From.
	 */
	public void setSectorFrom(final SessionContext ctx, final Airport value)
	{
		setProperty(ctx, SECTORFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketSpecificLogo.sectorFrom</code> attribute. 
	 * @param value the sectorFrom - To show sector From.
	 */
	public void setSectorFrom(final Airport value)
	{
		setSectorFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketSpecificLogo.sectorTo</code> attribute.
	 * @return the sectorTo - To show sector To.
	 */
	public Airport getSectorTo(final SessionContext ctx)
	{
		return (Airport)getProperty( ctx, SECTORTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketSpecificLogo.sectorTo</code> attribute.
	 * @return the sectorTo - To show sector To.
	 */
	public Airport getSectorTo()
	{
		return getSectorTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketSpecificLogo.sectorTo</code> attribute. 
	 * @param value the sectorTo - To show sector To.
	 */
	public void setSectorTo(final SessionContext ctx, final Airport value)
	{
		setProperty(ctx, SECTORTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketSpecificLogo.sectorTo</code> attribute. 
	 * @param value the sectorTo - To show sector To.
	 */
	public void setSectorTo(final Airport value)
	{
		setSectorTo( getSession().getSessionContext(), value );
	}
	
}
