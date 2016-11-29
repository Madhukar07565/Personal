/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.clientsettlementterms.jalo;

import com.cnk.travelogix.client.settlementterms.constants.ClientsettlementtermscoreConstants;
import com.cnk.travelogix.clientsettlementterms.jalo.AbstractClientCommercial;
import com.cnk.travelogix.clientsettlementterms.jalo.AbstractClientSettlement;
import com.cnk.travelogix.orgstructure.core.jalo.Market;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.clientsettlementterms.jalo.ClientSettlement ClientSettlement}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedClientSettlement extends AbstractClientSettlement
{
	/** Qualifier of the <code>ClientSettlement.commercial</code> attribute **/
	public static final String COMMERCIAL = "commercial";
	/** Qualifier of the <code>ClientSettlement.companyMarket</code> attribute **/
	public static final String COMPANYMARKET = "companyMarket";
	/** Qualifier of the <code>ClientSettlement.CommercialType</code> attribute **/
	public static final String COMMERCIALTYPE = "CommercialType";
	/** Qualifier of the <code>ClientSettlement.settlementtermId</code> attribute **/
	public static final String SETTLEMENTTERMID = "settlementtermId";
	/** Qualifier of the <code>ClientSettlement.client</code> attribute **/
	public static final String CLIENT = "client";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CLIENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedClientSettlement> CLIENTHANDLER = new BidirectionalOneToManyHandler<GeneratedClientSettlement>(
	ClientsettlementtermscoreConstants.TC.CLIENTSETTLEMENT,
	false,
	"client",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractClientSettlement.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(COMMERCIAL, AttributeMode.INITIAL);
		tmp.put(COMPANYMARKET, AttributeMode.INITIAL);
		tmp.put(COMMERCIALTYPE, AttributeMode.INITIAL);
		tmp.put(SETTLEMENTTERMID, AttributeMode.INITIAL);
		tmp.put(CLIENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientSettlement.client</code> attribute.
	 * @return the client
	 */
	public Principal getClient(final SessionContext ctx)
	{
		return (Principal)getProperty( ctx, CLIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientSettlement.client</code> attribute.
	 * @return the client
	 */
	public Principal getClient()
	{
		return getClient( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientSettlement.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final SessionContext ctx, final Principal value)
	{
		CLIENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientSettlement.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final Principal value)
	{
		setClient( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientSettlement.commercial</code> attribute.
	 * @return the commercial - Abstract Client Commercial
	 */
	public AbstractClientCommercial getCommercial(final SessionContext ctx)
	{
		return (AbstractClientCommercial)getProperty( ctx, COMMERCIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientSettlement.commercial</code> attribute.
	 * @return the commercial - Abstract Client Commercial
	 */
	public AbstractClientCommercial getCommercial()
	{
		return getCommercial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientSettlement.commercial</code> attribute. 
	 * @param value the commercial - Abstract Client Commercial
	 */
	public void setCommercial(final SessionContext ctx, final AbstractClientCommercial value)
	{
		setProperty(ctx, COMMERCIAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientSettlement.commercial</code> attribute. 
	 * @param value the commercial - Abstract Client Commercial
	 */
	public void setCommercial(final AbstractClientCommercial value)
	{
		setCommercial( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientSettlement.CommercialType</code> attribute.
	 * @return the CommercialType - Commercial Type
	 */
	public EnumerationValue getCommercialType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMMERCIALTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientSettlement.CommercialType</code> attribute.
	 * @return the CommercialType - Commercial Type
	 */
	public EnumerationValue getCommercialType()
	{
		return getCommercialType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientSettlement.CommercialType</code> attribute. 
	 * @param value the CommercialType - Commercial Type
	 */
	public void setCommercialType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMMERCIALTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientSettlement.CommercialType</code> attribute. 
	 * @param value the CommercialType - Commercial Type
	 */
	public void setCommercialType(final EnumerationValue value)
	{
		setCommercialType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientSettlement.companyMarket</code> attribute.
	 * @return the companyMarket - Company Market
	 */
	public Market getCompanyMarket(final SessionContext ctx)
	{
		return (Market)getProperty( ctx, COMPANYMARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientSettlement.companyMarket</code> attribute.
	 * @return the companyMarket - Company Market
	 */
	public Market getCompanyMarket()
	{
		return getCompanyMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientSettlement.companyMarket</code> attribute. 
	 * @param value the companyMarket - Company Market
	 */
	public void setCompanyMarket(final SessionContext ctx, final Market value)
	{
		setProperty(ctx, COMPANYMARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientSettlement.companyMarket</code> attribute. 
	 * @param value the companyMarket - Company Market
	 */
	public void setCompanyMarket(final Market value)
	{
		setCompanyMarket( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CLIENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientSettlement.settlementtermId</code> attribute.
	 * @return the settlementtermId - Settlement Term Id
	 */
	public String getSettlementtermId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SETTLEMENTTERMID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientSettlement.settlementtermId</code> attribute.
	 * @return the settlementtermId - Settlement Term Id
	 */
	public String getSettlementtermId()
	{
		return getSettlementtermId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientSettlement.settlementtermId</code> attribute. 
	 * @param value the settlementtermId - Settlement Term Id
	 */
	public void setSettlementtermId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SETTLEMENTTERMID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientSettlement.settlementtermId</code> attribute. 
	 * @param value the settlementtermId - Settlement Term Id
	 */
	public void setSettlementtermId(final String value)
	{
		setSettlementtermId( getSession().getSessionContext(), value );
	}
	
}
