/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.jalo;

import com.cnk.travelogix.masterdata.core.c2l.jalo.Location;
import com.cnk.travelogix.orgstructure.core.jalo.BusinessUnit;
import com.cnk.travelogix.orgstructure.core.jalo.Market;
import com.cnk.travelogix.orgstructure.core.sales.jalo.Division;
import com.cnk.travelogix.product.common.core.jalo.PointOfSale;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import de.hybris.platform.catalog.jalo.Company;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.Employee;
import de.hybris.platform.jalo.user.UserGroup;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.jalo.DiscretionaryDiscount DiscretionaryDiscount}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDiscretionaryDiscount extends GenericItem
{
	/** Qualifier of the <code>DiscretionaryDiscount.division</code> attribute **/
	public static final String DIVISION = "division";
	/** Qualifier of the <code>DiscretionaryDiscount.bu</code> attribute **/
	public static final String BU = "bu";
	/** Qualifier of the <code>DiscretionaryDiscount.market</code> attribute **/
	public static final String MARKET = "market";
	/** Qualifier of the <code>DiscretionaryDiscount.year</code> attribute **/
	public static final String YEAR = "year";
	/** Qualifier of the <code>DiscretionaryDiscount.season</code> attribute **/
	public static final String SEASON = "season";
	/** Qualifier of the <code>DiscretionaryDiscount.location</code> attribute **/
	public static final String LOCATION = "location";
	/** Qualifier of the <code>DiscretionaryDiscount.discountAllocated</code> attribute **/
	public static final String DISCOUNTALLOCATED = "discountAllocated";
	/** Qualifier of the <code>DiscretionaryDiscount.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>DiscretionaryDiscount.company</code> attribute **/
	public static final String COMPANY = "company";
	/** Qualifier of the <code>DiscretionaryDiscount.pos</code> attribute **/
	public static final String POS = "pos";
	/** Qualifier of the <code>DiscretionaryDiscount.totalDiscountAllocated</code> attribute **/
	public static final String TOTALDISCOUNTALLOCATED = "totalDiscountAllocated";
	/** Qualifier of the <code>DiscretionaryDiscount.unallocatedDiscount</code> attribute **/
	public static final String UNALLOCATEDDISCOUNT = "unallocatedDiscount";
	/** Qualifier of the <code>DiscretionaryDiscount.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>DiscretionaryDiscount.salesOfficer</code> attribute **/
	public static final String SALESOFFICER = "salesOfficer";
	/** Qualifier of the <code>DiscretionaryDiscount.lockedBy</code> attribute **/
	public static final String LOCKEDBY = "lockedBy";
	/** Qualifier of the <code>DiscretionaryDiscount.userGroup</code> attribute **/
	public static final String USERGROUP = "userGroup";
	/** Qualifier of the <code>DiscretionaryDiscount.employee</code> attribute **/
	public static final String EMPLOYEE = "employee";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n USERGROUP's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDiscretionaryDiscount> USERGROUPHANDLER = new BidirectionalOneToManyHandler<GeneratedDiscretionaryDiscount>(
	SupplierratedefinitionscoreConstants.TC.DISCRETIONARYDISCOUNT,
	false,
	"userGroup",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n EMPLOYEE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDiscretionaryDiscount> EMPLOYEEHANDLER = new BidirectionalOneToManyHandler<GeneratedDiscretionaryDiscount>(
	SupplierratedefinitionscoreConstants.TC.DISCRETIONARYDISCOUNT,
	false,
	"employee",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DIVISION, AttributeMode.INITIAL);
		tmp.put(BU, AttributeMode.INITIAL);
		tmp.put(MARKET, AttributeMode.INITIAL);
		tmp.put(YEAR, AttributeMode.INITIAL);
		tmp.put(SEASON, AttributeMode.INITIAL);
		tmp.put(LOCATION, AttributeMode.INITIAL);
		tmp.put(DISCOUNTALLOCATED, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(COMPANY, AttributeMode.INITIAL);
		tmp.put(POS, AttributeMode.INITIAL);
		tmp.put(TOTALDISCOUNTALLOCATED, AttributeMode.INITIAL);
		tmp.put(UNALLOCATEDDISCOUNT, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		tmp.put(SALESOFFICER, AttributeMode.INITIAL);
		tmp.put(LOCKEDBY, AttributeMode.INITIAL);
		tmp.put(USERGROUP, AttributeMode.INITIAL);
		tmp.put(EMPLOYEE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.bu</code> attribute.
	 * @return the bu - Business Unit
	 */
	public BusinessUnit getBu(final SessionContext ctx)
	{
		return (BusinessUnit)getProperty( ctx, BU);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.bu</code> attribute.
	 * @return the bu - Business Unit
	 */
	public BusinessUnit getBu()
	{
		return getBu( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.bu</code> attribute. 
	 * @param value the bu - Business Unit
	 */
	public void setBu(final SessionContext ctx, final BusinessUnit value)
	{
		setProperty(ctx, BU,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.bu</code> attribute. 
	 * @param value the bu - Business Unit
	 */
	public void setBu(final BusinessUnit value)
	{
		setBu( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.company</code> attribute.
	 * @return the company - company
	 */
	public Company getCompany(final SessionContext ctx)
	{
		return (Company)getProperty( ctx, COMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.company</code> attribute.
	 * @return the company - company
	 */
	public Company getCompany()
	{
		return getCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.company</code> attribute. 
	 * @param value the company - company
	 */
	public void setCompany(final SessionContext ctx, final Company value)
	{
		setProperty(ctx, COMPANY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.company</code> attribute. 
	 * @param value the company - company
	 */
	public void setCompany(final Company value)
	{
		setCompany( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		USERGROUPHANDLER.newInstance(ctx, allAttributes);
		EMPLOYEEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.discountAllocated</code> attribute.
	 * @return the discountAllocated - Discount allocated
	 */
	public Double getDiscountAllocated(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, DISCOUNTALLOCATED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.discountAllocated</code> attribute.
	 * @return the discountAllocated - Discount allocated
	 */
	public Double getDiscountAllocated()
	{
		return getDiscountAllocated( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.discountAllocated</code> attribute. 
	 * @return the discountAllocated - Discount allocated
	 */
	public double getDiscountAllocatedAsPrimitive(final SessionContext ctx)
	{
		Double value = getDiscountAllocated( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.discountAllocated</code> attribute. 
	 * @return the discountAllocated - Discount allocated
	 */
	public double getDiscountAllocatedAsPrimitive()
	{
		return getDiscountAllocatedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.discountAllocated</code> attribute. 
	 * @param value the discountAllocated - Discount allocated
	 */
	public void setDiscountAllocated(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, DISCOUNTALLOCATED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.discountAllocated</code> attribute. 
	 * @param value the discountAllocated - Discount allocated
	 */
	public void setDiscountAllocated(final Double value)
	{
		setDiscountAllocated( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.discountAllocated</code> attribute. 
	 * @param value the discountAllocated - Discount allocated
	 */
	public void setDiscountAllocated(final SessionContext ctx, final double value)
	{
		setDiscountAllocated( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.discountAllocated</code> attribute. 
	 * @param value the discountAllocated - Discount allocated
	 */
	public void setDiscountAllocated(final double value)
	{
		setDiscountAllocated( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.division</code> attribute.
	 * @return the division - Version Remark
	 */
	public Division getDivision(final SessionContext ctx)
	{
		return (Division)getProperty( ctx, DIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.division</code> attribute.
	 * @return the division - Version Remark
	 */
	public Division getDivision()
	{
		return getDivision( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.division</code> attribute. 
	 * @param value the division - Version Remark
	 */
	public void setDivision(final SessionContext ctx, final Division value)
	{
		setProperty(ctx, DIVISION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.division</code> attribute. 
	 * @param value the division - Version Remark
	 */
	public void setDivision(final Division value)
	{
		setDivision( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.employee</code> attribute.
	 * @return the employee
	 */
	public Employee getEmployee(final SessionContext ctx)
	{
		return (Employee)getProperty( ctx, EMPLOYEE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.employee</code> attribute.
	 * @return the employee
	 */
	public Employee getEmployee()
	{
		return getEmployee( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.employee</code> attribute. 
	 * @param value the employee
	 */
	public void setEmployee(final SessionContext ctx, final Employee value)
	{
		EMPLOYEEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.employee</code> attribute. 
	 * @param value the employee
	 */
	public void setEmployee(final Employee value)
	{
		setEmployee( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.location</code> attribute.
	 * @return the location - Destination
	 */
	public Location getLocation(final SessionContext ctx)
	{
		return (Location)getProperty( ctx, LOCATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.location</code> attribute.
	 * @return the location - Destination
	 */
	public Location getLocation()
	{
		return getLocation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.location</code> attribute. 
	 * @param value the location - Destination
	 */
	public void setLocation(final SessionContext ctx, final Location value)
	{
		setProperty(ctx, LOCATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.location</code> attribute. 
	 * @param value the location - Destination
	 */
	public void setLocation(final Location value)
	{
		setLocation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.lockedBy</code> attribute.
	 * @return the lockedBy - LockedBy
	 */
	public Employee getLockedBy(final SessionContext ctx)
	{
		return (Employee)getProperty( ctx, LOCKEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.lockedBy</code> attribute.
	 * @return the lockedBy - LockedBy
	 */
	public Employee getLockedBy()
	{
		return getLockedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.lockedBy</code> attribute. 
	 * @param value the lockedBy - LockedBy
	 */
	public void setLockedBy(final SessionContext ctx, final Employee value)
	{
		setProperty(ctx, LOCKEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.lockedBy</code> attribute. 
	 * @param value the lockedBy - LockedBy
	 */
	public void setLockedBy(final Employee value)
	{
		setLockedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.market</code> attribute.
	 * @return the market - Market
	 */
	public Market getMarket(final SessionContext ctx)
	{
		return (Market)getProperty( ctx, MARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.market</code> attribute.
	 * @return the market - Market
	 */
	public Market getMarket()
	{
		return getMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.market</code> attribute. 
	 * @param value the market - Market
	 */
	public void setMarket(final SessionContext ctx, final Market value)
	{
		setProperty(ctx, MARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.market</code> attribute. 
	 * @param value the market - Market
	 */
	public void setMarket(final Market value)
	{
		setMarket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.pos</code> attribute.
	 * @return the pos - pos
	 */
	public PointOfSale getPos(final SessionContext ctx)
	{
		return (PointOfSale)getProperty( ctx, POS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.pos</code> attribute.
	 * @return the pos - pos
	 */
	public PointOfSale getPos()
	{
		return getPos( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.pos</code> attribute. 
	 * @param value the pos - pos
	 */
	public void setPos(final SessionContext ctx, final PointOfSale value)
	{
		setProperty(ctx, POS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.pos</code> attribute. 
	 * @param value the pos - pos
	 */
	public void setPos(final PointOfSale value)
	{
		setPos( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.product</code> attribute.
	 * @return the product - product
	 */
	public Product getProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.product</code> attribute.
	 * @return the product - product
	 */
	public Product getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.product</code> attribute. 
	 * @param value the product - product
	 */
	public void setProduct(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.product</code> attribute. 
	 * @param value the product - product
	 */
	public void setProduct(final Product value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.salesOfficer</code> attribute.
	 * @return the salesOfficer - Sales Officer
	 */
	public Employee getSalesOfficer(final SessionContext ctx)
	{
		return (Employee)getProperty( ctx, SALESOFFICER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.salesOfficer</code> attribute.
	 * @return the salesOfficer - Sales Officer
	 */
	public Employee getSalesOfficer()
	{
		return getSalesOfficer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.salesOfficer</code> attribute. 
	 * @param value the salesOfficer - Sales Officer
	 */
	public void setSalesOfficer(final SessionContext ctx, final Employee value)
	{
		setProperty(ctx, SALESOFFICER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.salesOfficer</code> attribute. 
	 * @param value the salesOfficer - Sales Officer
	 */
	public void setSalesOfficer(final Employee value)
	{
		setSalesOfficer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.season</code> attribute.
	 * @return the season - Season
	 */
	public EnumerationValue getSeason(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SEASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.season</code> attribute.
	 * @return the season - Season
	 */
	public EnumerationValue getSeason()
	{
		return getSeason( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.season</code> attribute. 
	 * @param value the season - Season
	 */
	public void setSeason(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SEASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.season</code> attribute. 
	 * @param value the season - Season
	 */
	public void setSeason(final EnumerationValue value)
	{
		setSeason( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.status</code> attribute.
	 * @return the status - status
	 */
	public EnumerationValue getStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.status</code> attribute.
	 * @return the status - status
	 */
	public EnumerationValue getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.status</code> attribute. 
	 * @param value the status - status
	 */
	public void setStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.status</code> attribute. 
	 * @param value the status - status
	 */
	public void setStatus(final EnumerationValue value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.totalDiscountAllocated</code> attribute.
	 * @return the totalDiscountAllocated - Total Discount Allocated
	 */
	public Double getTotalDiscountAllocated(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TOTALDISCOUNTALLOCATED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.totalDiscountAllocated</code> attribute.
	 * @return the totalDiscountAllocated - Total Discount Allocated
	 */
	public Double getTotalDiscountAllocated()
	{
		return getTotalDiscountAllocated( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.totalDiscountAllocated</code> attribute. 
	 * @return the totalDiscountAllocated - Total Discount Allocated
	 */
	public double getTotalDiscountAllocatedAsPrimitive(final SessionContext ctx)
	{
		Double value = getTotalDiscountAllocated( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.totalDiscountAllocated</code> attribute. 
	 * @return the totalDiscountAllocated - Total Discount Allocated
	 */
	public double getTotalDiscountAllocatedAsPrimitive()
	{
		return getTotalDiscountAllocatedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.totalDiscountAllocated</code> attribute. 
	 * @param value the totalDiscountAllocated - Total Discount Allocated
	 */
	public void setTotalDiscountAllocated(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TOTALDISCOUNTALLOCATED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.totalDiscountAllocated</code> attribute. 
	 * @param value the totalDiscountAllocated - Total Discount Allocated
	 */
	public void setTotalDiscountAllocated(final Double value)
	{
		setTotalDiscountAllocated( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.totalDiscountAllocated</code> attribute. 
	 * @param value the totalDiscountAllocated - Total Discount Allocated
	 */
	public void setTotalDiscountAllocated(final SessionContext ctx, final double value)
	{
		setTotalDiscountAllocated( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.totalDiscountAllocated</code> attribute. 
	 * @param value the totalDiscountAllocated - Total Discount Allocated
	 */
	public void setTotalDiscountAllocated(final double value)
	{
		setTotalDiscountAllocated( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.unallocatedDiscount</code> attribute.
	 * @return the unallocatedDiscount - Unallocated Discount
	 */
	public Double getUnallocatedDiscount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, UNALLOCATEDDISCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.unallocatedDiscount</code> attribute.
	 * @return the unallocatedDiscount - Unallocated Discount
	 */
	public Double getUnallocatedDiscount()
	{
		return getUnallocatedDiscount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.unallocatedDiscount</code> attribute. 
	 * @return the unallocatedDiscount - Unallocated Discount
	 */
	public double getUnallocatedDiscountAsPrimitive(final SessionContext ctx)
	{
		Double value = getUnallocatedDiscount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.unallocatedDiscount</code> attribute. 
	 * @return the unallocatedDiscount - Unallocated Discount
	 */
	public double getUnallocatedDiscountAsPrimitive()
	{
		return getUnallocatedDiscountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.unallocatedDiscount</code> attribute. 
	 * @param value the unallocatedDiscount - Unallocated Discount
	 */
	public void setUnallocatedDiscount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, UNALLOCATEDDISCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.unallocatedDiscount</code> attribute. 
	 * @param value the unallocatedDiscount - Unallocated Discount
	 */
	public void setUnallocatedDiscount(final Double value)
	{
		setUnallocatedDiscount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.unallocatedDiscount</code> attribute. 
	 * @param value the unallocatedDiscount - Unallocated Discount
	 */
	public void setUnallocatedDiscount(final SessionContext ctx, final double value)
	{
		setUnallocatedDiscount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.unallocatedDiscount</code> attribute. 
	 * @param value the unallocatedDiscount - Unallocated Discount
	 */
	public void setUnallocatedDiscount(final double value)
	{
		setUnallocatedDiscount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.userGroup</code> attribute.
	 * @return the userGroup
	 */
	public UserGroup getUserGroup(final SessionContext ctx)
	{
		return (UserGroup)getProperty( ctx, USERGROUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.userGroup</code> attribute.
	 * @return the userGroup
	 */
	public UserGroup getUserGroup()
	{
		return getUserGroup( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.userGroup</code> attribute. 
	 * @param value the userGroup
	 */
	public void setUserGroup(final SessionContext ctx, final UserGroup value)
	{
		USERGROUPHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.userGroup</code> attribute. 
	 * @param value the userGroup
	 */
	public void setUserGroup(final UserGroup value)
	{
		setUserGroup( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.year</code> attribute.
	 * @return the year - year
	 */
	public String getYear(final SessionContext ctx)
	{
		return (String)getProperty( ctx, YEAR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscretionaryDiscount.year</code> attribute.
	 * @return the year - year
	 */
	public String getYear()
	{
		return getYear( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.year</code> attribute. 
	 * @param value the year - year
	 */
	public void setYear(final SessionContext ctx, final String value)
	{
		setProperty(ctx, YEAR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscretionaryDiscount.year</code> attribute. 
	 * @param value the year - year
	 */
	public void setYear(final String value)
	{
		setYear( getSession().getSessionContext(), value );
	}
	
}
