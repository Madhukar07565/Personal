/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.holiday.inventory.core.jalo;

import com.cnk.travelogix.datamodel.holiday.inventory.jalo.HolidayInventoryDetail;
import com.cnk.travelogix.holiday.inventory.core.constants.HolidayinventorycoreConstants;
import com.cnk.travelogix.holiday.inventory.core.jalo.HolidayInventoryDefinition;
import com.cnk.travelogix.orgstructure.core.jalo.BusinessUnit;
import com.cnk.travelogix.orgstructure.core.jalo.Market;
import com.cnk.travelogix.orgstructure.core.jalo.StrategicBusinessUnit;
import com.cnk.travelogix.orgstructure.core.sales.jalo.DistributionChannel;
import com.cnk.travelogix.orgstructure.core.sales.jalo.Division;
import com.cnk.travelogix.orgstructure.core.sales.jalo.SalesOffice;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.holiday.inventory.core.jalo.HolidayCompanySpecificInventory HolidayCompanySpecificInventory}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHolidayCompanySpecificInventory extends HolidayInventoryDetail
{
	/** Qualifier of the <code>HolidayCompanySpecificInventory.sbu</code> attribute **/
	public static final String SBU = "sbu";
	/** Qualifier of the <code>HolidayCompanySpecificInventory.bu</code> attribute **/
	public static final String BU = "bu";
	/** Qualifier of the <code>HolidayCompanySpecificInventory.market</code> attribute **/
	public static final String MARKET = "market";
	/** Qualifier of the <code>HolidayCompanySpecificInventory.distributionChannel</code> attribute **/
	public static final String DISTRIBUTIONCHANNEL = "distributionChannel";
	/** Qualifier of the <code>HolidayCompanySpecificInventory.division</code> attribute **/
	public static final String DIVISION = "division";
	/** Qualifier of the <code>HolidayCompanySpecificInventory.salesOffice</code> attribute **/
	public static final String SALESOFFICE = "salesOffice";
	/** Qualifier of the <code>HolidayCompanySpecificInventory.stopSales</code> attribute **/
	public static final String STOPSALES = "stopSales";
	/** Qualifier of the <code>HolidayCompanySpecificInventory.liabilityOnUtilization</code> attribute **/
	public static final String LIABILITYONUTILIZATION = "liabilityOnUtilization";
	/** Qualifier of the <code>HolidayCompanySpecificInventory.holidayInventoryDefinition</code> attribute **/
	public static final String HOLIDAYINVENTORYDEFINITION = "holidayInventoryDefinition";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n HOLIDAYINVENTORYDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedHolidayCompanySpecificInventory> HOLIDAYINVENTORYDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedHolidayCompanySpecificInventory>(
	HolidayinventorycoreConstants.TC.HOLIDAYCOMPANYSPECIFICINVENTORY,
	false,
	"holidayInventoryDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(HolidayInventoryDetail.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SBU, AttributeMode.INITIAL);
		tmp.put(BU, AttributeMode.INITIAL);
		tmp.put(MARKET, AttributeMode.INITIAL);
		tmp.put(DISTRIBUTIONCHANNEL, AttributeMode.INITIAL);
		tmp.put(DIVISION, AttributeMode.INITIAL);
		tmp.put(SALESOFFICE, AttributeMode.INITIAL);
		tmp.put(STOPSALES, AttributeMode.INITIAL);
		tmp.put(LIABILITYONUTILIZATION, AttributeMode.INITIAL);
		tmp.put(HOLIDAYINVENTORYDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayCompanySpecificInventory.bu</code> attribute.
	 * @return the bu - BU
	 */
	public BusinessUnit getBu(final SessionContext ctx)
	{
		return (BusinessUnit)getProperty( ctx, BU);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayCompanySpecificInventory.bu</code> attribute.
	 * @return the bu - BU
	 */
	public BusinessUnit getBu()
	{
		return getBu( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayCompanySpecificInventory.bu</code> attribute. 
	 * @param value the bu - BU
	 */
	public void setBu(final SessionContext ctx, final BusinessUnit value)
	{
		setProperty(ctx, BU,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayCompanySpecificInventory.bu</code> attribute. 
	 * @param value the bu - BU
	 */
	public void setBu(final BusinessUnit value)
	{
		setBu( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		HOLIDAYINVENTORYDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayCompanySpecificInventory.distributionChannel</code> attribute.
	 * @return the distributionChannel - Distribution channel
	 */
	public DistributionChannel getDistributionChannel(final SessionContext ctx)
	{
		return (DistributionChannel)getProperty( ctx, DISTRIBUTIONCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayCompanySpecificInventory.distributionChannel</code> attribute.
	 * @return the distributionChannel - Distribution channel
	 */
	public DistributionChannel getDistributionChannel()
	{
		return getDistributionChannel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayCompanySpecificInventory.distributionChannel</code> attribute. 
	 * @param value the distributionChannel - Distribution channel
	 */
	public void setDistributionChannel(final SessionContext ctx, final DistributionChannel value)
	{
		setProperty(ctx, DISTRIBUTIONCHANNEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayCompanySpecificInventory.distributionChannel</code> attribute. 
	 * @param value the distributionChannel - Distribution channel
	 */
	public void setDistributionChannel(final DistributionChannel value)
	{
		setDistributionChannel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayCompanySpecificInventory.division</code> attribute.
	 * @return the division - Division
	 */
	public Division getDivision(final SessionContext ctx)
	{
		return (Division)getProperty( ctx, DIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayCompanySpecificInventory.division</code> attribute.
	 * @return the division - Division
	 */
	public Division getDivision()
	{
		return getDivision( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayCompanySpecificInventory.division</code> attribute. 
	 * @param value the division - Division
	 */
	public void setDivision(final SessionContext ctx, final Division value)
	{
		setProperty(ctx, DIVISION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayCompanySpecificInventory.division</code> attribute. 
	 * @param value the division - Division
	 */
	public void setDivision(final Division value)
	{
		setDivision( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayCompanySpecificInventory.holidayInventoryDefinition</code> attribute.
	 * @return the holidayInventoryDefinition
	 */
	public HolidayInventoryDefinition getHolidayInventoryDefinition(final SessionContext ctx)
	{
		return (HolidayInventoryDefinition)getProperty( ctx, HOLIDAYINVENTORYDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayCompanySpecificInventory.holidayInventoryDefinition</code> attribute.
	 * @return the holidayInventoryDefinition
	 */
	public HolidayInventoryDefinition getHolidayInventoryDefinition()
	{
		return getHolidayInventoryDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayCompanySpecificInventory.holidayInventoryDefinition</code> attribute. 
	 * @param value the holidayInventoryDefinition
	 */
	public void setHolidayInventoryDefinition(final SessionContext ctx, final HolidayInventoryDefinition value)
	{
		HOLIDAYINVENTORYDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayCompanySpecificInventory.holidayInventoryDefinition</code> attribute. 
	 * @param value the holidayInventoryDefinition
	 */
	public void setHolidayInventoryDefinition(final HolidayInventoryDefinition value)
	{
		setHolidayInventoryDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayCompanySpecificInventory.liabilityOnUtilization</code> attribute.
	 * @return the liabilityOnUtilization - Liability On Utilization
	 */
	public Double getLiabilityOnUtilization(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, LIABILITYONUTILIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayCompanySpecificInventory.liabilityOnUtilization</code> attribute.
	 * @return the liabilityOnUtilization - Liability On Utilization
	 */
	public Double getLiabilityOnUtilization()
	{
		return getLiabilityOnUtilization( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayCompanySpecificInventory.liabilityOnUtilization</code> attribute. 
	 * @return the liabilityOnUtilization - Liability On Utilization
	 */
	public double getLiabilityOnUtilizationAsPrimitive(final SessionContext ctx)
	{
		Double value = getLiabilityOnUtilization( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayCompanySpecificInventory.liabilityOnUtilization</code> attribute. 
	 * @return the liabilityOnUtilization - Liability On Utilization
	 */
	public double getLiabilityOnUtilizationAsPrimitive()
	{
		return getLiabilityOnUtilizationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayCompanySpecificInventory.liabilityOnUtilization</code> attribute. 
	 * @param value the liabilityOnUtilization - Liability On Utilization
	 */
	public void setLiabilityOnUtilization(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, LIABILITYONUTILIZATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayCompanySpecificInventory.liabilityOnUtilization</code> attribute. 
	 * @param value the liabilityOnUtilization - Liability On Utilization
	 */
	public void setLiabilityOnUtilization(final Double value)
	{
		setLiabilityOnUtilization( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayCompanySpecificInventory.liabilityOnUtilization</code> attribute. 
	 * @param value the liabilityOnUtilization - Liability On Utilization
	 */
	public void setLiabilityOnUtilization(final SessionContext ctx, final double value)
	{
		setLiabilityOnUtilization( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayCompanySpecificInventory.liabilityOnUtilization</code> attribute. 
	 * @param value the liabilityOnUtilization - Liability On Utilization
	 */
	public void setLiabilityOnUtilization(final double value)
	{
		setLiabilityOnUtilization( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayCompanySpecificInventory.market</code> attribute.
	 * @return the market - Market
	 */
	public Market getMarket(final SessionContext ctx)
	{
		return (Market)getProperty( ctx, MARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayCompanySpecificInventory.market</code> attribute.
	 * @return the market - Market
	 */
	public Market getMarket()
	{
		return getMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayCompanySpecificInventory.market</code> attribute. 
	 * @param value the market - Market
	 */
	public void setMarket(final SessionContext ctx, final Market value)
	{
		setProperty(ctx, MARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayCompanySpecificInventory.market</code> attribute. 
	 * @param value the market - Market
	 */
	public void setMarket(final Market value)
	{
		setMarket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayCompanySpecificInventory.salesOffice</code> attribute.
	 * @return the salesOffice - Sales office
	 */
	public SalesOffice getSalesOffice(final SessionContext ctx)
	{
		return (SalesOffice)getProperty( ctx, SALESOFFICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayCompanySpecificInventory.salesOffice</code> attribute.
	 * @return the salesOffice - Sales office
	 */
	public SalesOffice getSalesOffice()
	{
		return getSalesOffice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayCompanySpecificInventory.salesOffice</code> attribute. 
	 * @param value the salesOffice - Sales office
	 */
	public void setSalesOffice(final SessionContext ctx, final SalesOffice value)
	{
		setProperty(ctx, SALESOFFICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayCompanySpecificInventory.salesOffice</code> attribute. 
	 * @param value the salesOffice - Sales office
	 */
	public void setSalesOffice(final SalesOffice value)
	{
		setSalesOffice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayCompanySpecificInventory.sbu</code> attribute.
	 * @return the sbu - SBU
	 */
	public StrategicBusinessUnit getSbu(final SessionContext ctx)
	{
		return (StrategicBusinessUnit)getProperty( ctx, SBU);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayCompanySpecificInventory.sbu</code> attribute.
	 * @return the sbu - SBU
	 */
	public StrategicBusinessUnit getSbu()
	{
		return getSbu( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayCompanySpecificInventory.sbu</code> attribute. 
	 * @param value the sbu - SBU
	 */
	public void setSbu(final SessionContext ctx, final StrategicBusinessUnit value)
	{
		setProperty(ctx, SBU,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayCompanySpecificInventory.sbu</code> attribute. 
	 * @param value the sbu - SBU
	 */
	public void setSbu(final StrategicBusinessUnit value)
	{
		setSbu( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayCompanySpecificInventory.stopSales</code> attribute.
	 * @return the stopSales - Stop Sales
	 */
	public Boolean isStopSales(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, STOPSALES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayCompanySpecificInventory.stopSales</code> attribute.
	 * @return the stopSales - Stop Sales
	 */
	public Boolean isStopSales()
	{
		return isStopSales( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayCompanySpecificInventory.stopSales</code> attribute. 
	 * @return the stopSales - Stop Sales
	 */
	public boolean isStopSalesAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isStopSales( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayCompanySpecificInventory.stopSales</code> attribute. 
	 * @return the stopSales - Stop Sales
	 */
	public boolean isStopSalesAsPrimitive()
	{
		return isStopSalesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayCompanySpecificInventory.stopSales</code> attribute. 
	 * @param value the stopSales - Stop Sales
	 */
	public void setStopSales(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, STOPSALES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayCompanySpecificInventory.stopSales</code> attribute. 
	 * @param value the stopSales - Stop Sales
	 */
	public void setStopSales(final Boolean value)
	{
		setStopSales( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayCompanySpecificInventory.stopSales</code> attribute. 
	 * @param value the stopSales - Stop Sales
	 */
	public void setStopSales(final SessionContext ctx, final boolean value)
	{
		setStopSales( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayCompanySpecificInventory.stopSales</code> attribute. 
	 * @param value the stopSales - Stop Sales
	 */
	public void setStopSales(final boolean value)
	{
		setStopSales( getSession().getSessionContext(), value );
	}
	
}
