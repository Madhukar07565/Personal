/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.supplierrate.jalo.common;

import com.cnk.travelogix.orgstructure.core.jalo.BusinessUnit;
import com.cnk.travelogix.orgstructure.core.jalo.Market;
import com.cnk.travelogix.orgstructure.core.jalo.StrategicBusinessUnit;
import com.cnk.travelogix.supplier.mappings.market.jalo.MarketMapping;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import com.cnk.travelogix.supplier.rates.jalo.AbstractSupplierRate;
import de.hybris.platform.catalog.jalo.Company;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.RateRestriction CompanyRateInvRestriction}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRateRestriction extends GenericItem
{
	/** Qualifier of the <code>CompanyRateInvRestriction.company</code> attribute **/
	public static final String COMPANY = "company";
	/** Qualifier of the <code>CompanyRateInvRestriction.activeDateRange</code> attribute **/
	public static final String ACTIVEDATERANGE = "activeDateRange";
	/** Qualifier of the <code>CompanyRateInvRestriction.active</code> attribute **/
	public static final String ACTIVE = "active";
	/** Qualifier of the <code>CompanyRateInvRestriction.bu</code> attribute **/
	public static final String BU = "bu";
	/** Qualifier of the <code>CompanyRateInvRestriction.sbu</code> attribute **/
	public static final String SBU = "sbu";
	/** Qualifier of the <code>CompanyRateInvRestriction.companyMarket</code> attribute **/
	public static final String COMPANYMARKET = "companyMarket";
	/** Qualifier of the <code>CompanyRateInvRestriction.reason</code> attribute **/
	public static final String REASON = "reason";
	/** Qualifier of the <code>CompanyRateInvRestriction.marketMapping</code> attribute **/
	public static final String MARKETMAPPING = "marketMapping";
	/** Qualifier of the <code>CompanyRateInvRestriction.supplierRate</code> attribute **/
	public static final String SUPPLIERRATE = "supplierRate";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n MARKETMAPPING's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedRateRestriction> MARKETMAPPINGHANDLER = new BidirectionalOneToManyHandler<GeneratedRateRestriction>(
	SupplierratedefinitionscoreConstants.TC.COMPANYRATEINVRESTRICTION,
	false,
	"marketMapping",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SUPPLIERRATE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedRateRestriction> SUPPLIERRATEHANDLER = new BidirectionalOneToManyHandler<GeneratedRateRestriction>(
	SupplierratedefinitionscoreConstants.TC.COMPANYRATEINVRESTRICTION,
	false,
	"supplierRate",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COMPANY, AttributeMode.INITIAL);
		tmp.put(ACTIVEDATERANGE, AttributeMode.INITIAL);
		tmp.put(ACTIVE, AttributeMode.INITIAL);
		tmp.put(BU, AttributeMode.INITIAL);
		tmp.put(SBU, AttributeMode.INITIAL);
		tmp.put(COMPANYMARKET, AttributeMode.INITIAL);
		tmp.put(REASON, AttributeMode.INITIAL);
		tmp.put(MARKETMAPPING, AttributeMode.INITIAL);
		tmp.put(SUPPLIERRATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyRateInvRestriction.active</code> attribute.
	 * @return the active
	 */
	public Boolean isActive(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ACTIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyRateInvRestriction.active</code> attribute.
	 * @return the active
	 */
	public Boolean isActive()
	{
		return isActive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyRateInvRestriction.active</code> attribute. 
	 * @return the active
	 */
	public boolean isActiveAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isActive( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyRateInvRestriction.active</code> attribute. 
	 * @return the active
	 */
	public boolean isActiveAsPrimitive()
	{
		return isActiveAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyRateInvRestriction.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ACTIVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyRateInvRestriction.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final Boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyRateInvRestriction.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final SessionContext ctx, final boolean value)
	{
		setActive( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyRateInvRestriction.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyRateInvRestriction.activeDateRange</code> attribute.
	 * @return the activeDateRange
	 */
	public Date getActiveDateRange(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ACTIVEDATERANGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyRateInvRestriction.activeDateRange</code> attribute.
	 * @return the activeDateRange
	 */
	public Date getActiveDateRange()
	{
		return getActiveDateRange( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyRateInvRestriction.activeDateRange</code> attribute. 
	 * @param value the activeDateRange
	 */
	public void setActiveDateRange(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ACTIVEDATERANGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyRateInvRestriction.activeDateRange</code> attribute. 
	 * @param value the activeDateRange
	 */
	public void setActiveDateRange(final Date value)
	{
		setActiveDateRange( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyRateInvRestriction.bu</code> attribute.
	 * @return the bu
	 */
	public BusinessUnit getBu(final SessionContext ctx)
	{
		return (BusinessUnit)getProperty( ctx, BU);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyRateInvRestriction.bu</code> attribute.
	 * @return the bu
	 */
	public BusinessUnit getBu()
	{
		return getBu( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyRateInvRestriction.bu</code> attribute. 
	 * @param value the bu
	 */
	public void setBu(final SessionContext ctx, final BusinessUnit value)
	{
		setProperty(ctx, BU,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyRateInvRestriction.bu</code> attribute. 
	 * @param value the bu
	 */
	public void setBu(final BusinessUnit value)
	{
		setBu( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyRateInvRestriction.company</code> attribute.
	 * @return the company
	 */
	public Company getCompany(final SessionContext ctx)
	{
		return (Company)getProperty( ctx, COMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyRateInvRestriction.company</code> attribute.
	 * @return the company
	 */
	public Company getCompany()
	{
		return getCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyRateInvRestriction.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final SessionContext ctx, final Company value)
	{
		setProperty(ctx, COMPANY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyRateInvRestriction.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final Company value)
	{
		setCompany( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyRateInvRestriction.companyMarket</code> attribute.
	 * @return the companyMarket
	 */
	public Market getCompanyMarket(final SessionContext ctx)
	{
		return (Market)getProperty( ctx, COMPANYMARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyRateInvRestriction.companyMarket</code> attribute.
	 * @return the companyMarket
	 */
	public Market getCompanyMarket()
	{
		return getCompanyMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyRateInvRestriction.companyMarket</code> attribute. 
	 * @param value the companyMarket
	 */
	public void setCompanyMarket(final SessionContext ctx, final Market value)
	{
		setProperty(ctx, COMPANYMARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyRateInvRestriction.companyMarket</code> attribute. 
	 * @param value the companyMarket
	 */
	public void setCompanyMarket(final Market value)
	{
		setCompanyMarket( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		MARKETMAPPINGHANDLER.newInstance(ctx, allAttributes);
		SUPPLIERRATEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyRateInvRestriction.marketMapping</code> attribute.
	 * @return the marketMapping
	 */
	public MarketMapping getMarketMapping(final SessionContext ctx)
	{
		return (MarketMapping)getProperty( ctx, MARKETMAPPING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyRateInvRestriction.marketMapping</code> attribute.
	 * @return the marketMapping
	 */
	public MarketMapping getMarketMapping()
	{
		return getMarketMapping( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyRateInvRestriction.marketMapping</code> attribute. 
	 * @param value the marketMapping
	 */
	public void setMarketMapping(final SessionContext ctx, final MarketMapping value)
	{
		MARKETMAPPINGHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyRateInvRestriction.marketMapping</code> attribute. 
	 * @param value the marketMapping
	 */
	public void setMarketMapping(final MarketMapping value)
	{
		setMarketMapping( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyRateInvRestriction.reason</code> attribute.
	 * @return the reason
	 */
	public String getReason(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyRateInvRestriction.reason</code> attribute.
	 * @return the reason
	 */
	public String getReason()
	{
		return getReason( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyRateInvRestriction.reason</code> attribute. 
	 * @param value the reason
	 */
	public void setReason(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyRateInvRestriction.reason</code> attribute. 
	 * @param value the reason
	 */
	public void setReason(final String value)
	{
		setReason( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyRateInvRestriction.sbu</code> attribute.
	 * @return the sbu
	 */
	public StrategicBusinessUnit getSbu(final SessionContext ctx)
	{
		return (StrategicBusinessUnit)getProperty( ctx, SBU);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyRateInvRestriction.sbu</code> attribute.
	 * @return the sbu
	 */
	public StrategicBusinessUnit getSbu()
	{
		return getSbu( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyRateInvRestriction.sbu</code> attribute. 
	 * @param value the sbu
	 */
	public void setSbu(final SessionContext ctx, final StrategicBusinessUnit value)
	{
		setProperty(ctx, SBU,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyRateInvRestriction.sbu</code> attribute. 
	 * @param value the sbu
	 */
	public void setSbu(final StrategicBusinessUnit value)
	{
		setSbu( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyRateInvRestriction.supplierRate</code> attribute.
	 * @return the supplierRate
	 */
	public AbstractSupplierRate getSupplierRate(final SessionContext ctx)
	{
		return (AbstractSupplierRate)getProperty( ctx, SUPPLIERRATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyRateInvRestriction.supplierRate</code> attribute.
	 * @return the supplierRate
	 */
	public AbstractSupplierRate getSupplierRate()
	{
		return getSupplierRate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyRateInvRestriction.supplierRate</code> attribute. 
	 * @param value the supplierRate
	 */
	public void setSupplierRate(final SessionContext ctx, final AbstractSupplierRate value)
	{
		SUPPLIERRATEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyRateInvRestriction.supplierRate</code> attribute. 
	 * @param value the supplierRate
	 */
	public void setSupplierRate(final AbstractSupplierRate value)
	{
		setSupplierRate( getSession().getSessionContext(), value );
	}
	
}
