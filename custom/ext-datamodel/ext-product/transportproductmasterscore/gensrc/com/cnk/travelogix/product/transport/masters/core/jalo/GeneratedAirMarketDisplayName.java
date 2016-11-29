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
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.transport.masters.core.jalo.AirMarketDisplayName AirMarketDisplayName}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAirMarketDisplayName extends GenericItem
{
	/** Qualifier of the <code>AirMarketDisplayName.market</code> attribute **/
	public static final String MARKET = "market";
	/** Qualifier of the <code>AirMarketDisplayName.displayName</code> attribute **/
	public static final String DISPLAYNAME = "displayName";
	/** Qualifier of the <code>AirMarketDisplayName.flightProduct</code> attribute **/
	public static final String FLIGHTPRODUCT = "flightProduct";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n FLIGHTPRODUCT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAirMarketDisplayName> FLIGHTPRODUCTHANDLER = new BidirectionalOneToManyHandler<GeneratedAirMarketDisplayName>(
	TransportproductmasterscoreConstants.TC.AIRMARKETDISPLAYNAME,
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
		tmp.put(DISPLAYNAME, AttributeMode.INITIAL);
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
	 * <i>Generated method</i> - Getter of the <code>AirMarketDisplayName.displayName</code> attribute.
	 * @return the displayName - To show display Name.
	 */
	public String getDisplayName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAirMarketDisplayName.getDisplayName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DISPLAYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirMarketDisplayName.displayName</code> attribute.
	 * @return the displayName - To show display Name.
	 */
	public String getDisplayName()
	{
		return getDisplayName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirMarketDisplayName.displayName</code> attribute. 
	 * @return the localized displayName - To show display Name.
	 */
	public Map<Language,String> getAllDisplayName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DISPLAYNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirMarketDisplayName.displayName</code> attribute. 
	 * @return the localized displayName - To show display Name.
	 */
	public Map<Language,String> getAllDisplayName()
	{
		return getAllDisplayName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirMarketDisplayName.displayName</code> attribute. 
	 * @param value the displayName - To show display Name.
	 */
	public void setDisplayName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAirMarketDisplayName.setDisplayName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DISPLAYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirMarketDisplayName.displayName</code> attribute. 
	 * @param value the displayName - To show display Name.
	 */
	public void setDisplayName(final String value)
	{
		setDisplayName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirMarketDisplayName.displayName</code> attribute. 
	 * @param value the displayName - To show display Name.
	 */
	public void setAllDisplayName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DISPLAYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirMarketDisplayName.displayName</code> attribute. 
	 * @param value the displayName - To show display Name.
	 */
	public void setAllDisplayName(final Map<Language,String> value)
	{
		setAllDisplayName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirMarketDisplayName.flightProduct</code> attribute.
	 * @return the flightProduct
	 */
	public FlightProduct getFlightProduct(final SessionContext ctx)
	{
		return (FlightProduct)getProperty( ctx, FLIGHTPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirMarketDisplayName.flightProduct</code> attribute.
	 * @return the flightProduct
	 */
	public FlightProduct getFlightProduct()
	{
		return getFlightProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirMarketDisplayName.flightProduct</code> attribute. 
	 * @param value the flightProduct
	 */
	public void setFlightProduct(final SessionContext ctx, final FlightProduct value)
	{
		FLIGHTPRODUCTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirMarketDisplayName.flightProduct</code> attribute. 
	 * @param value the flightProduct
	 */
	public void setFlightProduct(final FlightProduct value)
	{
		setFlightProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirMarketDisplayName.market</code> attribute.
	 * @return the market - To show Market.
	 */
	public Market getMarket(final SessionContext ctx)
	{
		return (Market)getProperty( ctx, MARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirMarketDisplayName.market</code> attribute.
	 * @return the market - To show Market.
	 */
	public Market getMarket()
	{
		return getMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirMarketDisplayName.market</code> attribute. 
	 * @param value the market - To show Market.
	 */
	public void setMarket(final SessionContext ctx, final Market value)
	{
		setProperty(ctx, MARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirMarketDisplayName.market</code> attribute. 
	 * @param value the market - To show Market.
	 */
	public void setMarket(final Market value)
	{
		setMarket( getSession().getSessionContext(), value );
	}
	
}
