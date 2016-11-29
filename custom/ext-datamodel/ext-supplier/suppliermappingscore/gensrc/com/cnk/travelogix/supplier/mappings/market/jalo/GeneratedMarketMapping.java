/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.mappings.market.jalo;

import com.cnk.travelogix.orgstructure.core.jalo.Market;
import com.cnk.travelogix.supplier.core.market.jalo.SupplierMarket;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import com.cnk.travelogix.supplier.mappings.core.constants.SuppliermappingscoreConstants;
import com.cnk.travelogix.supplier.mappings.jalo.AbstractSupplierMapping;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.mappings.market.jalo.MarketMapping MarketMapping}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMarketMapping extends AbstractSupplierMapping
{
	/** Qualifier of the <code>MarketMapping.supplier</code> attribute **/
	public static final String SUPPLIER = "supplier";
	/** Qualifier of the <code>MarketMapping.clientType</code> attribute **/
	public static final String CLIENTTYPE = "clientType";
	/** Qualifier of the <code>MarketMapping.supplierMarket</code> attribute **/
	public static final String SUPPLIERMARKET = "supplierMarket";
	/** Qualifier of the <code>MarketMapping.companyMarket</code> attribute **/
	public static final String COMPANYMARKET = "companyMarket";
	/** Qualifier of the <code>MarketMapping.effectiveFrom</code> attribute **/
	public static final String EFFECTIVEFROM = "effectiveFrom";
	/** Qualifier of the <code>MarketMapping.marketMappingExist</code> attribute **/
	public static final String MARKETMAPPINGEXIST = "marketMappingExist";
	/** Qualifier of the <code>MarketMapping.ratesDefined</code> attribute **/
	public static final String RATESDEFINED = "ratesDefined";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractSupplierMapping.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SUPPLIER, AttributeMode.INITIAL);
		tmp.put(CLIENTTYPE, AttributeMode.INITIAL);
		tmp.put(SUPPLIERMARKET, AttributeMode.INITIAL);
		tmp.put(COMPANYMARKET, AttributeMode.INITIAL);
		tmp.put(EFFECTIVEFROM, AttributeMode.INITIAL);
		tmp.put(MARKETMAPPINGEXIST, AttributeMode.INITIAL);
		tmp.put(RATESDEFINED, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketMapping.clientType</code> attribute.
	 * @return the clientType
	 */
	public EnumerationValue getClientType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CLIENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketMapping.clientType</code> attribute.
	 * @return the clientType
	 */
	public EnumerationValue getClientType()
	{
		return getClientType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketMapping.clientType</code> attribute. 
	 * @param value the clientType
	 */
	public void setClientType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CLIENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketMapping.clientType</code> attribute. 
	 * @param value the clientType
	 */
	public void setClientType(final EnumerationValue value)
	{
		setClientType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketMapping.companyMarket</code> attribute.
	 * @return the companyMarket
	 */
	public Market getCompanyMarket(final SessionContext ctx)
	{
		return (Market)getProperty( ctx, COMPANYMARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketMapping.companyMarket</code> attribute.
	 * @return the companyMarket
	 */
	public Market getCompanyMarket()
	{
		return getCompanyMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketMapping.companyMarket</code> attribute. 
	 * @param value the companyMarket
	 */
	public void setCompanyMarket(final SessionContext ctx, final Market value)
	{
		setProperty(ctx, COMPANYMARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketMapping.companyMarket</code> attribute. 
	 * @param value the companyMarket
	 */
	public void setCompanyMarket(final Market value)
	{
		setCompanyMarket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketMapping.effectiveFrom</code> attribute.
	 * @return the effectiveFrom
	 */
	public Date getEffectiveFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EFFECTIVEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketMapping.effectiveFrom</code> attribute.
	 * @return the effectiveFrom
	 */
	public Date getEffectiveFrom()
	{
		return getEffectiveFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketMapping.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom
	 */
	public void setEffectiveFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EFFECTIVEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketMapping.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom
	 */
	public void setEffectiveFrom(final Date value)
	{
		setEffectiveFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketMapping.marketMappingExist</code> attribute.
	 * @return the marketMappingExist
	 */
	public Boolean isMarketMappingExist(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, MARKETMAPPINGEXIST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketMapping.marketMappingExist</code> attribute.
	 * @return the marketMappingExist
	 */
	public Boolean isMarketMappingExist()
	{
		return isMarketMappingExist( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketMapping.marketMappingExist</code> attribute. 
	 * @return the marketMappingExist
	 */
	public boolean isMarketMappingExistAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isMarketMappingExist( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketMapping.marketMappingExist</code> attribute. 
	 * @return the marketMappingExist
	 */
	public boolean isMarketMappingExistAsPrimitive()
	{
		return isMarketMappingExistAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketMapping.marketMappingExist</code> attribute. 
	 * @param value the marketMappingExist
	 */
	public void setMarketMappingExist(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, MARKETMAPPINGEXIST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketMapping.marketMappingExist</code> attribute. 
	 * @param value the marketMappingExist
	 */
	public void setMarketMappingExist(final Boolean value)
	{
		setMarketMappingExist( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketMapping.marketMappingExist</code> attribute. 
	 * @param value the marketMappingExist
	 */
	public void setMarketMappingExist(final SessionContext ctx, final boolean value)
	{
		setMarketMappingExist( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketMapping.marketMappingExist</code> attribute. 
	 * @param value the marketMappingExist
	 */
	public void setMarketMappingExist(final boolean value)
	{
		setMarketMappingExist( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketMapping.ratesDefined</code> attribute.
	 * @return the ratesDefined
	 */
	public Boolean isRatesDefined(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, RATESDEFINED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketMapping.ratesDefined</code> attribute.
	 * @return the ratesDefined
	 */
	public Boolean isRatesDefined()
	{
		return isRatesDefined( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketMapping.ratesDefined</code> attribute. 
	 * @return the ratesDefined
	 */
	public boolean isRatesDefinedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isRatesDefined( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketMapping.ratesDefined</code> attribute. 
	 * @return the ratesDefined
	 */
	public boolean isRatesDefinedAsPrimitive()
	{
		return isRatesDefinedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketMapping.ratesDefined</code> attribute. 
	 * @param value the ratesDefined
	 */
	public void setRatesDefined(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, RATESDEFINED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketMapping.ratesDefined</code> attribute. 
	 * @param value the ratesDefined
	 */
	public void setRatesDefined(final Boolean value)
	{
		setRatesDefined( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketMapping.ratesDefined</code> attribute. 
	 * @param value the ratesDefined
	 */
	public void setRatesDefined(final SessionContext ctx, final boolean value)
	{
		setRatesDefined( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketMapping.ratesDefined</code> attribute. 
	 * @param value the ratesDefined
	 */
	public void setRatesDefined(final boolean value)
	{
		setRatesDefined( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketMapping.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, SUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketMapping.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier()
	{
		return getSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketMapping.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, SUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketMapping.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final Supplier value)
	{
		setSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketMapping.supplierMarket</code> attribute.
	 * @return the supplierMarket
	 */
	public SupplierMarket getSupplierMarket(final SessionContext ctx)
	{
		return (SupplierMarket)getProperty( ctx, SUPPLIERMARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketMapping.supplierMarket</code> attribute.
	 * @return the supplierMarket
	 */
	public SupplierMarket getSupplierMarket()
	{
		return getSupplierMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketMapping.supplierMarket</code> attribute. 
	 * @param value the supplierMarket
	 */
	public void setSupplierMarket(final SessionContext ctx, final SupplierMarket value)
	{
		setProperty(ctx, SUPPLIERMARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketMapping.supplierMarket</code> attribute. 
	 * @param value the supplierMarket
	 */
	public void setSupplierMarket(final SupplierMarket value)
	{
		setSupplierMarket( getSession().getSessionContext(), value );
	}
	
}
