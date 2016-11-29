/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.activity.inventory.core.jalo;

import com.cnk.travelogix.activity.inventory.core.constants.ActivityinventorycoreConstants;
import com.cnk.travelogix.activity.inventory.core.jalo.AbstractActivityCompanySpecificInventory;
import com.cnk.travelogix.orgstructure.core.jalo.BusinessUnit;
import com.cnk.travelogix.orgstructure.core.jalo.Market;
import com.cnk.travelogix.orgstructure.core.jalo.StrategicBusinessUnit;
import com.cnk.travelogix.orgstructure.core.sales.jalo.DistributionChannel;
import com.cnk.travelogix.orgstructure.core.sales.jalo.Division;
import com.cnk.travelogix.orgstructure.core.sales.jalo.SalesOffice;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.activity.inventory.core.jalo.ActivityWithinCompanyInventoryDistribution ActivityWithinCompanyInventoryDistribution}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivityWithinCompanyInventoryDistribution extends AbstractActivityCompanySpecificInventory
{
	/** Qualifier of the <code>ActivityWithinCompanyInventoryDistribution.sbu</code> attribute **/
	public static final String SBU = "sbu";
	/** Qualifier of the <code>ActivityWithinCompanyInventoryDistribution.bu</code> attribute **/
	public static final String BU = "bu";
	/** Qualifier of the <code>ActivityWithinCompanyInventoryDistribution.market</code> attribute **/
	public static final String MARKET = "market";
	/** Qualifier of the <code>ActivityWithinCompanyInventoryDistribution.distributionChannel</code> attribute **/
	public static final String DISTRIBUTIONCHANNEL = "distributionChannel";
	/** Qualifier of the <code>ActivityWithinCompanyInventoryDistribution.division</code> attribute **/
	public static final String DIVISION = "division";
	/** Qualifier of the <code>ActivityWithinCompanyInventoryDistribution.salesOffice</code> attribute **/
	public static final String SALESOFFICE = "salesOffice";
	/** Qualifier of the <code>ActivityWithinCompanyInventoryDistribution.settleWith</code> attribute **/
	public static final String SETTLEWITH = "settleWith";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractActivityCompanySpecificInventory.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SBU, AttributeMode.INITIAL);
		tmp.put(BU, AttributeMode.INITIAL);
		tmp.put(MARKET, AttributeMode.INITIAL);
		tmp.put(DISTRIBUTIONCHANNEL, AttributeMode.INITIAL);
		tmp.put(DIVISION, AttributeMode.INITIAL);
		tmp.put(SALESOFFICE, AttributeMode.INITIAL);
		tmp.put(SETTLEWITH, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityWithinCompanyInventoryDistribution.bu</code> attribute.
	 * @return the bu - BU
	 */
	public BusinessUnit getBu(final SessionContext ctx)
	{
		return (BusinessUnit)getProperty( ctx, BU);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityWithinCompanyInventoryDistribution.bu</code> attribute.
	 * @return the bu - BU
	 */
	public BusinessUnit getBu()
	{
		return getBu( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityWithinCompanyInventoryDistribution.bu</code> attribute. 
	 * @param value the bu - BU
	 */
	public void setBu(final SessionContext ctx, final BusinessUnit value)
	{
		setProperty(ctx, BU,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityWithinCompanyInventoryDistribution.bu</code> attribute. 
	 * @param value the bu - BU
	 */
	public void setBu(final BusinessUnit value)
	{
		setBu( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityWithinCompanyInventoryDistribution.distributionChannel</code> attribute.
	 * @return the distributionChannel - Distribution Channel
	 */
	public DistributionChannel getDistributionChannel(final SessionContext ctx)
	{
		return (DistributionChannel)getProperty( ctx, DISTRIBUTIONCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityWithinCompanyInventoryDistribution.distributionChannel</code> attribute.
	 * @return the distributionChannel - Distribution Channel
	 */
	public DistributionChannel getDistributionChannel()
	{
		return getDistributionChannel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityWithinCompanyInventoryDistribution.distributionChannel</code> attribute. 
	 * @param value the distributionChannel - Distribution Channel
	 */
	public void setDistributionChannel(final SessionContext ctx, final DistributionChannel value)
	{
		setProperty(ctx, DISTRIBUTIONCHANNEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityWithinCompanyInventoryDistribution.distributionChannel</code> attribute. 
	 * @param value the distributionChannel - Distribution Channel
	 */
	public void setDistributionChannel(final DistributionChannel value)
	{
		setDistributionChannel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityWithinCompanyInventoryDistribution.division</code> attribute.
	 * @return the division - Division
	 */
	public Division getDivision(final SessionContext ctx)
	{
		return (Division)getProperty( ctx, DIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityWithinCompanyInventoryDistribution.division</code> attribute.
	 * @return the division - Division
	 */
	public Division getDivision()
	{
		return getDivision( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityWithinCompanyInventoryDistribution.division</code> attribute. 
	 * @param value the division - Division
	 */
	public void setDivision(final SessionContext ctx, final Division value)
	{
		setProperty(ctx, DIVISION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityWithinCompanyInventoryDistribution.division</code> attribute. 
	 * @param value the division - Division
	 */
	public void setDivision(final Division value)
	{
		setDivision( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityWithinCompanyInventoryDistribution.market</code> attribute.
	 * @return the market - Market
	 */
	public Market getMarket(final SessionContext ctx)
	{
		return (Market)getProperty( ctx, MARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityWithinCompanyInventoryDistribution.market</code> attribute.
	 * @return the market - Market
	 */
	public Market getMarket()
	{
		return getMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityWithinCompanyInventoryDistribution.market</code> attribute. 
	 * @param value the market - Market
	 */
	public void setMarket(final SessionContext ctx, final Market value)
	{
		setProperty(ctx, MARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityWithinCompanyInventoryDistribution.market</code> attribute. 
	 * @param value the market - Market
	 */
	public void setMarket(final Market value)
	{
		setMarket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityWithinCompanyInventoryDistribution.salesOffice</code> attribute.
	 * @return the salesOffice - Sales Office
	 */
	public SalesOffice getSalesOffice(final SessionContext ctx)
	{
		return (SalesOffice)getProperty( ctx, SALESOFFICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityWithinCompanyInventoryDistribution.salesOffice</code> attribute.
	 * @return the salesOffice - Sales Office
	 */
	public SalesOffice getSalesOffice()
	{
		return getSalesOffice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityWithinCompanyInventoryDistribution.salesOffice</code> attribute. 
	 * @param value the salesOffice - Sales Office
	 */
	public void setSalesOffice(final SessionContext ctx, final SalesOffice value)
	{
		setProperty(ctx, SALESOFFICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityWithinCompanyInventoryDistribution.salesOffice</code> attribute. 
	 * @param value the salesOffice - Sales Office
	 */
	public void setSalesOffice(final SalesOffice value)
	{
		setSalesOffice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityWithinCompanyInventoryDistribution.sbu</code> attribute.
	 * @return the sbu - SBU
	 */
	public StrategicBusinessUnit getSbu(final SessionContext ctx)
	{
		return (StrategicBusinessUnit)getProperty( ctx, SBU);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityWithinCompanyInventoryDistribution.sbu</code> attribute.
	 * @return the sbu - SBU
	 */
	public StrategicBusinessUnit getSbu()
	{
		return getSbu( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityWithinCompanyInventoryDistribution.sbu</code> attribute. 
	 * @param value the sbu - SBU
	 */
	public void setSbu(final SessionContext ctx, final StrategicBusinessUnit value)
	{
		setProperty(ctx, SBU,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityWithinCompanyInventoryDistribution.sbu</code> attribute. 
	 * @param value the sbu - SBU
	 */
	public void setSbu(final StrategicBusinessUnit value)
	{
		setSbu( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityWithinCompanyInventoryDistribution.settleWith</code> attribute.
	 * @return the settleWith - Settle With
	 */
	public String getSettleWith(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SETTLEWITH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityWithinCompanyInventoryDistribution.settleWith</code> attribute.
	 * @return the settleWith - Settle With
	 */
	public String getSettleWith()
	{
		return getSettleWith( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityWithinCompanyInventoryDistribution.settleWith</code> attribute. 
	 * @param value the settleWith - Settle With
	 */
	public void setSettleWith(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SETTLEWITH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityWithinCompanyInventoryDistribution.settleWith</code> attribute. 
	 * @param value the settleWith - Settle With
	 */
	public void setSettleWith(final String value)
	{
		setSettleWith( getSession().getSessionContext(), value );
	}
	
}
