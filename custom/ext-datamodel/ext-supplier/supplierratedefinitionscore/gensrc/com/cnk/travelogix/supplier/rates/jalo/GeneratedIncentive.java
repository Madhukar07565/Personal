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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.jalo.Incentive Incentive}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedIncentive extends GenericItem
{
	/** Qualifier of the <code>Incentive.division</code> attribute **/
	public static final String DIVISION = "division";
	/** Qualifier of the <code>Incentive.bu</code> attribute **/
	public static final String BU = "bu";
	/** Qualifier of the <code>Incentive.market</code> attribute **/
	public static final String MARKET = "market";
	/** Qualifier of the <code>Incentive.year</code> attribute **/
	public static final String YEAR = "year";
	/** Qualifier of the <code>Incentive.season</code> attribute **/
	public static final String SEASON = "season";
	/** Qualifier of the <code>Incentive.location</code> attribute **/
	public static final String LOCATION = "location";
	/** Qualifier of the <code>Incentive.discountAllocated</code> attribute **/
	public static final String DISCOUNTALLOCATED = "discountAllocated";
	/** Qualifier of the <code>Incentive.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>Incentive.company</code> attribute **/
	public static final String COMPANY = "company";
	/** Qualifier of the <code>Incentive.pos</code> attribute **/
	public static final String POS = "pos";
	/** Qualifier of the <code>Incentive.totalDiscountAllocated</code> attribute **/
	public static final String TOTALDISCOUNTALLOCATED = "totalDiscountAllocated";
	/** Qualifier of the <code>Incentive.unallocatedDiscount</code> attribute **/
	public static final String UNALLOCATEDDISCOUNT = "unallocatedDiscount";
	/** Qualifier of the <code>Incentive.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>Incentive.bookingFrom</code> attribute **/
	public static final String BOOKINGFROM = "bookingFrom";
	/** Qualifier of the <code>Incentive.bookingTo</code> attribute **/
	public static final String BOOKINGTO = "bookingTo";
	/** Qualifier of the <code>Incentive.bookingValidityFrom</code> attribute **/
	public static final String BOOKINGVALIDITYFROM = "bookingValidityFrom";
	/** Qualifier of the <code>Incentive.bookingValidityTo</code> attribute **/
	public static final String BOOKINGVALIDITYTO = "bookingValidityTo";
	/** Qualifier of the <code>Incentive.travelDateValidityFrom</code> attribute **/
	public static final String TRAVELDATEVALIDITYFROM = "travelDateValidityFrom";
	/** Qualifier of the <code>Incentive.travelDateValidityTo</code> attribute **/
	public static final String TRAVELDATEVALIDITYTO = "travelDateValidityTo";
	/** Qualifier of the <code>Incentive.ratesWithDiscount</code> attribute **/
	public static final String RATESWITHDISCOUNT = "ratesWithDiscount";
	/** Qualifier of the <code>Incentive.ratesWithoutDiscount</code> attribute **/
	public static final String RATESWITHOUTDISCOUNT = "ratesWithoutDiscount";
	/** Qualifier of the <code>Incentive.lockedBy</code> attribute **/
	public static final String LOCKEDBY = "lockedBy";
	/** Qualifier of the <code>Incentive.userGroup</code> attribute **/
	public static final String USERGROUP = "userGroup";
	/** Qualifier of the <code>Incentive.employee</code> attribute **/
	public static final String EMPLOYEE = "employee";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n USERGROUP's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedIncentive> USERGROUPHANDLER = new BidirectionalOneToManyHandler<GeneratedIncentive>(
	SupplierratedefinitionscoreConstants.TC.INCENTIVE,
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
	protected static final BidirectionalOneToManyHandler<GeneratedIncentive> EMPLOYEEHANDLER = new BidirectionalOneToManyHandler<GeneratedIncentive>(
	SupplierratedefinitionscoreConstants.TC.INCENTIVE,
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
		tmp.put(BOOKINGFROM, AttributeMode.INITIAL);
		tmp.put(BOOKINGTO, AttributeMode.INITIAL);
		tmp.put(BOOKINGVALIDITYFROM, AttributeMode.INITIAL);
		tmp.put(BOOKINGVALIDITYTO, AttributeMode.INITIAL);
		tmp.put(TRAVELDATEVALIDITYFROM, AttributeMode.INITIAL);
		tmp.put(TRAVELDATEVALIDITYTO, AttributeMode.INITIAL);
		tmp.put(RATESWITHDISCOUNT, AttributeMode.INITIAL);
		tmp.put(RATESWITHOUTDISCOUNT, AttributeMode.INITIAL);
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
	 * <i>Generated method</i> - Getter of the <code>Incentive.bookingFrom</code> attribute.
	 * @return the bookingFrom - Booking From
	 */
	public Date getBookingFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, BOOKINGFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.bookingFrom</code> attribute.
	 * @return the bookingFrom - Booking From
	 */
	public Date getBookingFrom()
	{
		return getBookingFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.bookingFrom</code> attribute. 
	 * @param value the bookingFrom - Booking From
	 */
	public void setBookingFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, BOOKINGFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.bookingFrom</code> attribute. 
	 * @param value the bookingFrom - Booking From
	 */
	public void setBookingFrom(final Date value)
	{
		setBookingFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.bookingTo</code> attribute.
	 * @return the bookingTo - Booking To
	 */
	public Date getBookingTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, BOOKINGTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.bookingTo</code> attribute.
	 * @return the bookingTo - Booking To
	 */
	public Date getBookingTo()
	{
		return getBookingTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.bookingTo</code> attribute. 
	 * @param value the bookingTo - Booking To
	 */
	public void setBookingTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, BOOKINGTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.bookingTo</code> attribute. 
	 * @param value the bookingTo - Booking To
	 */
	public void setBookingTo(final Date value)
	{
		setBookingTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.bookingValidityFrom</code> attribute.
	 * @return the bookingValidityFrom - Booking Validity From
	 */
	public Date getBookingValidityFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, BOOKINGVALIDITYFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.bookingValidityFrom</code> attribute.
	 * @return the bookingValidityFrom - Booking Validity From
	 */
	public Date getBookingValidityFrom()
	{
		return getBookingValidityFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.bookingValidityFrom</code> attribute. 
	 * @param value the bookingValidityFrom - Booking Validity From
	 */
	public void setBookingValidityFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, BOOKINGVALIDITYFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.bookingValidityFrom</code> attribute. 
	 * @param value the bookingValidityFrom - Booking Validity From
	 */
	public void setBookingValidityFrom(final Date value)
	{
		setBookingValidityFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.bookingValidityTo</code> attribute.
	 * @return the bookingValidityTo - Booking Validity To
	 */
	public Date getBookingValidityTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, BOOKINGVALIDITYTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.bookingValidityTo</code> attribute.
	 * @return the bookingValidityTo - Booking Validity To
	 */
	public Date getBookingValidityTo()
	{
		return getBookingValidityTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.bookingValidityTo</code> attribute. 
	 * @param value the bookingValidityTo - Booking Validity To
	 */
	public void setBookingValidityTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, BOOKINGVALIDITYTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.bookingValidityTo</code> attribute. 
	 * @param value the bookingValidityTo - Booking Validity To
	 */
	public void setBookingValidityTo(final Date value)
	{
		setBookingValidityTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.bu</code> attribute.
	 * @return the bu - Business Unit
	 */
	public BusinessUnit getBu(final SessionContext ctx)
	{
		return (BusinessUnit)getProperty( ctx, BU);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.bu</code> attribute.
	 * @return the bu - Business Unit
	 */
	public BusinessUnit getBu()
	{
		return getBu( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.bu</code> attribute. 
	 * @param value the bu - Business Unit
	 */
	public void setBu(final SessionContext ctx, final BusinessUnit value)
	{
		setProperty(ctx, BU,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.bu</code> attribute. 
	 * @param value the bu - Business Unit
	 */
	public void setBu(final BusinessUnit value)
	{
		setBu( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.company</code> attribute.
	 * @return the company - company
	 */
	public Company getCompany(final SessionContext ctx)
	{
		return (Company)getProperty( ctx, COMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.company</code> attribute.
	 * @return the company - company
	 */
	public Company getCompany()
	{
		return getCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.company</code> attribute. 
	 * @param value the company - company
	 */
	public void setCompany(final SessionContext ctx, final Company value)
	{
		setProperty(ctx, COMPANY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.company</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>Incentive.discountAllocated</code> attribute.
	 * @return the discountAllocated - Discount allocated
	 */
	public Double getDiscountAllocated(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, DISCOUNTALLOCATED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.discountAllocated</code> attribute.
	 * @return the discountAllocated - Discount allocated
	 */
	public Double getDiscountAllocated()
	{
		return getDiscountAllocated( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.discountAllocated</code> attribute. 
	 * @return the discountAllocated - Discount allocated
	 */
	public double getDiscountAllocatedAsPrimitive(final SessionContext ctx)
	{
		Double value = getDiscountAllocated( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.discountAllocated</code> attribute. 
	 * @return the discountAllocated - Discount allocated
	 */
	public double getDiscountAllocatedAsPrimitive()
	{
		return getDiscountAllocatedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.discountAllocated</code> attribute. 
	 * @param value the discountAllocated - Discount allocated
	 */
	public void setDiscountAllocated(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, DISCOUNTALLOCATED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.discountAllocated</code> attribute. 
	 * @param value the discountAllocated - Discount allocated
	 */
	public void setDiscountAllocated(final Double value)
	{
		setDiscountAllocated( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.discountAllocated</code> attribute. 
	 * @param value the discountAllocated - Discount allocated
	 */
	public void setDiscountAllocated(final SessionContext ctx, final double value)
	{
		setDiscountAllocated( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.discountAllocated</code> attribute. 
	 * @param value the discountAllocated - Discount allocated
	 */
	public void setDiscountAllocated(final double value)
	{
		setDiscountAllocated( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.division</code> attribute.
	 * @return the division - Version Remark
	 */
	public Division getDivision(final SessionContext ctx)
	{
		return (Division)getProperty( ctx, DIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.division</code> attribute.
	 * @return the division - Version Remark
	 */
	public Division getDivision()
	{
		return getDivision( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.division</code> attribute. 
	 * @param value the division - Version Remark
	 */
	public void setDivision(final SessionContext ctx, final Division value)
	{
		setProperty(ctx, DIVISION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.division</code> attribute. 
	 * @param value the division - Version Remark
	 */
	public void setDivision(final Division value)
	{
		setDivision( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.employee</code> attribute.
	 * @return the employee
	 */
	public Employee getEmployee(final SessionContext ctx)
	{
		return (Employee)getProperty( ctx, EMPLOYEE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.employee</code> attribute.
	 * @return the employee
	 */
	public Employee getEmployee()
	{
		return getEmployee( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.employee</code> attribute. 
	 * @param value the employee
	 */
	public void setEmployee(final SessionContext ctx, final Employee value)
	{
		EMPLOYEEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.employee</code> attribute. 
	 * @param value the employee
	 */
	public void setEmployee(final Employee value)
	{
		setEmployee( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.location</code> attribute.
	 * @return the location - Destination
	 */
	public Location getLocation(final SessionContext ctx)
	{
		return (Location)getProperty( ctx, LOCATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.location</code> attribute.
	 * @return the location - Destination
	 */
	public Location getLocation()
	{
		return getLocation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.location</code> attribute. 
	 * @param value the location - Destination
	 */
	public void setLocation(final SessionContext ctx, final Location value)
	{
		setProperty(ctx, LOCATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.location</code> attribute. 
	 * @param value the location - Destination
	 */
	public void setLocation(final Location value)
	{
		setLocation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.lockedBy</code> attribute.
	 * @return the lockedBy - LockedBy
	 */
	public Employee getLockedBy(final SessionContext ctx)
	{
		return (Employee)getProperty( ctx, LOCKEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.lockedBy</code> attribute.
	 * @return the lockedBy - LockedBy
	 */
	public Employee getLockedBy()
	{
		return getLockedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.lockedBy</code> attribute. 
	 * @param value the lockedBy - LockedBy
	 */
	public void setLockedBy(final SessionContext ctx, final Employee value)
	{
		setProperty(ctx, LOCKEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.lockedBy</code> attribute. 
	 * @param value the lockedBy - LockedBy
	 */
	public void setLockedBy(final Employee value)
	{
		setLockedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.market</code> attribute.
	 * @return the market - Market
	 */
	public Market getMarket(final SessionContext ctx)
	{
		return (Market)getProperty( ctx, MARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.market</code> attribute.
	 * @return the market - Market
	 */
	public Market getMarket()
	{
		return getMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.market</code> attribute. 
	 * @param value the market - Market
	 */
	public void setMarket(final SessionContext ctx, final Market value)
	{
		setProperty(ctx, MARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.market</code> attribute. 
	 * @param value the market - Market
	 */
	public void setMarket(final Market value)
	{
		setMarket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.pos</code> attribute.
	 * @return the pos - pos
	 */
	public PointOfSale getPos(final SessionContext ctx)
	{
		return (PointOfSale)getProperty( ctx, POS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.pos</code> attribute.
	 * @return the pos - pos
	 */
	public PointOfSale getPos()
	{
		return getPos( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.pos</code> attribute. 
	 * @param value the pos - pos
	 */
	public void setPos(final SessionContext ctx, final PointOfSale value)
	{
		setProperty(ctx, POS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.pos</code> attribute. 
	 * @param value the pos - pos
	 */
	public void setPos(final PointOfSale value)
	{
		setPos( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.product</code> attribute.
	 * @return the product - product
	 */
	public Product getProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.product</code> attribute.
	 * @return the product - product
	 */
	public Product getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.product</code> attribute. 
	 * @param value the product - product
	 */
	public void setProduct(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.product</code> attribute. 
	 * @param value the product - product
	 */
	public void setProduct(final Product value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.ratesWithDiscount</code> attribute.
	 * @return the ratesWithDiscount - Rates With Discount
	 */
	public Double getRatesWithDiscount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, RATESWITHDISCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.ratesWithDiscount</code> attribute.
	 * @return the ratesWithDiscount - Rates With Discount
	 */
	public Double getRatesWithDiscount()
	{
		return getRatesWithDiscount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.ratesWithDiscount</code> attribute. 
	 * @return the ratesWithDiscount - Rates With Discount
	 */
	public double getRatesWithDiscountAsPrimitive(final SessionContext ctx)
	{
		Double value = getRatesWithDiscount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.ratesWithDiscount</code> attribute. 
	 * @return the ratesWithDiscount - Rates With Discount
	 */
	public double getRatesWithDiscountAsPrimitive()
	{
		return getRatesWithDiscountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.ratesWithDiscount</code> attribute. 
	 * @param value the ratesWithDiscount - Rates With Discount
	 */
	public void setRatesWithDiscount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, RATESWITHDISCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.ratesWithDiscount</code> attribute. 
	 * @param value the ratesWithDiscount - Rates With Discount
	 */
	public void setRatesWithDiscount(final Double value)
	{
		setRatesWithDiscount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.ratesWithDiscount</code> attribute. 
	 * @param value the ratesWithDiscount - Rates With Discount
	 */
	public void setRatesWithDiscount(final SessionContext ctx, final double value)
	{
		setRatesWithDiscount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.ratesWithDiscount</code> attribute. 
	 * @param value the ratesWithDiscount - Rates With Discount
	 */
	public void setRatesWithDiscount(final double value)
	{
		setRatesWithDiscount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.ratesWithoutDiscount</code> attribute.
	 * @return the ratesWithoutDiscount - Rates Without Discount
	 */
	public Double getRatesWithoutDiscount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, RATESWITHOUTDISCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.ratesWithoutDiscount</code> attribute.
	 * @return the ratesWithoutDiscount - Rates Without Discount
	 */
	public Double getRatesWithoutDiscount()
	{
		return getRatesWithoutDiscount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.ratesWithoutDiscount</code> attribute. 
	 * @return the ratesWithoutDiscount - Rates Without Discount
	 */
	public double getRatesWithoutDiscountAsPrimitive(final SessionContext ctx)
	{
		Double value = getRatesWithoutDiscount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.ratesWithoutDiscount</code> attribute. 
	 * @return the ratesWithoutDiscount - Rates Without Discount
	 */
	public double getRatesWithoutDiscountAsPrimitive()
	{
		return getRatesWithoutDiscountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.ratesWithoutDiscount</code> attribute. 
	 * @param value the ratesWithoutDiscount - Rates Without Discount
	 */
	public void setRatesWithoutDiscount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, RATESWITHOUTDISCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.ratesWithoutDiscount</code> attribute. 
	 * @param value the ratesWithoutDiscount - Rates Without Discount
	 */
	public void setRatesWithoutDiscount(final Double value)
	{
		setRatesWithoutDiscount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.ratesWithoutDiscount</code> attribute. 
	 * @param value the ratesWithoutDiscount - Rates Without Discount
	 */
	public void setRatesWithoutDiscount(final SessionContext ctx, final double value)
	{
		setRatesWithoutDiscount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.ratesWithoutDiscount</code> attribute. 
	 * @param value the ratesWithoutDiscount - Rates Without Discount
	 */
	public void setRatesWithoutDiscount(final double value)
	{
		setRatesWithoutDiscount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.season</code> attribute.
	 * @return the season - Season
	 */
	public EnumerationValue getSeason(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SEASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.season</code> attribute.
	 * @return the season - Season
	 */
	public EnumerationValue getSeason()
	{
		return getSeason( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.season</code> attribute. 
	 * @param value the season - Season
	 */
	public void setSeason(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SEASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.season</code> attribute. 
	 * @param value the season - Season
	 */
	public void setSeason(final EnumerationValue value)
	{
		setSeason( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.status</code> attribute.
	 * @return the status - status
	 */
	public EnumerationValue getStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.status</code> attribute.
	 * @return the status - status
	 */
	public EnumerationValue getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.status</code> attribute. 
	 * @param value the status - status
	 */
	public void setStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.status</code> attribute. 
	 * @param value the status - status
	 */
	public void setStatus(final EnumerationValue value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.totalDiscountAllocated</code> attribute.
	 * @return the totalDiscountAllocated - Total Discount Allocated
	 */
	public Double getTotalDiscountAllocated(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TOTALDISCOUNTALLOCATED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.totalDiscountAllocated</code> attribute.
	 * @return the totalDiscountAllocated - Total Discount Allocated
	 */
	public Double getTotalDiscountAllocated()
	{
		return getTotalDiscountAllocated( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.totalDiscountAllocated</code> attribute. 
	 * @return the totalDiscountAllocated - Total Discount Allocated
	 */
	public double getTotalDiscountAllocatedAsPrimitive(final SessionContext ctx)
	{
		Double value = getTotalDiscountAllocated( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.totalDiscountAllocated</code> attribute. 
	 * @return the totalDiscountAllocated - Total Discount Allocated
	 */
	public double getTotalDiscountAllocatedAsPrimitive()
	{
		return getTotalDiscountAllocatedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.totalDiscountAllocated</code> attribute. 
	 * @param value the totalDiscountAllocated - Total Discount Allocated
	 */
	public void setTotalDiscountAllocated(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TOTALDISCOUNTALLOCATED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.totalDiscountAllocated</code> attribute. 
	 * @param value the totalDiscountAllocated - Total Discount Allocated
	 */
	public void setTotalDiscountAllocated(final Double value)
	{
		setTotalDiscountAllocated( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.totalDiscountAllocated</code> attribute. 
	 * @param value the totalDiscountAllocated - Total Discount Allocated
	 */
	public void setTotalDiscountAllocated(final SessionContext ctx, final double value)
	{
		setTotalDiscountAllocated( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.totalDiscountAllocated</code> attribute. 
	 * @param value the totalDiscountAllocated - Total Discount Allocated
	 */
	public void setTotalDiscountAllocated(final double value)
	{
		setTotalDiscountAllocated( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.travelDateValidityFrom</code> attribute.
	 * @return the travelDateValidityFrom - Travel Date Validity
	 */
	public Date getTravelDateValidityFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, TRAVELDATEVALIDITYFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.travelDateValidityFrom</code> attribute.
	 * @return the travelDateValidityFrom - Travel Date Validity
	 */
	public Date getTravelDateValidityFrom()
	{
		return getTravelDateValidityFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.travelDateValidityFrom</code> attribute. 
	 * @param value the travelDateValidityFrom - Travel Date Validity
	 */
	public void setTravelDateValidityFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, TRAVELDATEVALIDITYFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.travelDateValidityFrom</code> attribute. 
	 * @param value the travelDateValidityFrom - Travel Date Validity
	 */
	public void setTravelDateValidityFrom(final Date value)
	{
		setTravelDateValidityFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.travelDateValidityTo</code> attribute.
	 * @return the travelDateValidityTo - Travel Date Validity
	 */
	public Date getTravelDateValidityTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, TRAVELDATEVALIDITYTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.travelDateValidityTo</code> attribute.
	 * @return the travelDateValidityTo - Travel Date Validity
	 */
	public Date getTravelDateValidityTo()
	{
		return getTravelDateValidityTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.travelDateValidityTo</code> attribute. 
	 * @param value the travelDateValidityTo - Travel Date Validity
	 */
	public void setTravelDateValidityTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, TRAVELDATEVALIDITYTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.travelDateValidityTo</code> attribute. 
	 * @param value the travelDateValidityTo - Travel Date Validity
	 */
	public void setTravelDateValidityTo(final Date value)
	{
		setTravelDateValidityTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.unallocatedDiscount</code> attribute.
	 * @return the unallocatedDiscount - Unallocated Discount
	 */
	public Double getUnallocatedDiscount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, UNALLOCATEDDISCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.unallocatedDiscount</code> attribute.
	 * @return the unallocatedDiscount - Unallocated Discount
	 */
	public Double getUnallocatedDiscount()
	{
		return getUnallocatedDiscount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.unallocatedDiscount</code> attribute. 
	 * @return the unallocatedDiscount - Unallocated Discount
	 */
	public double getUnallocatedDiscountAsPrimitive(final SessionContext ctx)
	{
		Double value = getUnallocatedDiscount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.unallocatedDiscount</code> attribute. 
	 * @return the unallocatedDiscount - Unallocated Discount
	 */
	public double getUnallocatedDiscountAsPrimitive()
	{
		return getUnallocatedDiscountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.unallocatedDiscount</code> attribute. 
	 * @param value the unallocatedDiscount - Unallocated Discount
	 */
	public void setUnallocatedDiscount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, UNALLOCATEDDISCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.unallocatedDiscount</code> attribute. 
	 * @param value the unallocatedDiscount - Unallocated Discount
	 */
	public void setUnallocatedDiscount(final Double value)
	{
		setUnallocatedDiscount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.unallocatedDiscount</code> attribute. 
	 * @param value the unallocatedDiscount - Unallocated Discount
	 */
	public void setUnallocatedDiscount(final SessionContext ctx, final double value)
	{
		setUnallocatedDiscount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.unallocatedDiscount</code> attribute. 
	 * @param value the unallocatedDiscount - Unallocated Discount
	 */
	public void setUnallocatedDiscount(final double value)
	{
		setUnallocatedDiscount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.userGroup</code> attribute.
	 * @return the userGroup
	 */
	public UserGroup getUserGroup(final SessionContext ctx)
	{
		return (UserGroup)getProperty( ctx, USERGROUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.userGroup</code> attribute.
	 * @return the userGroup
	 */
	public UserGroup getUserGroup()
	{
		return getUserGroup( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.userGroup</code> attribute. 
	 * @param value the userGroup
	 */
	public void setUserGroup(final SessionContext ctx, final UserGroup value)
	{
		USERGROUPHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.userGroup</code> attribute. 
	 * @param value the userGroup
	 */
	public void setUserGroup(final UserGroup value)
	{
		setUserGroup( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.year</code> attribute.
	 * @return the year - year
	 */
	public String getYear(final SessionContext ctx)
	{
		return (String)getProperty( ctx, YEAR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Incentive.year</code> attribute.
	 * @return the year - year
	 */
	public String getYear()
	{
		return getYear( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.year</code> attribute. 
	 * @param value the year - year
	 */
	public void setYear(final SessionContext ctx, final String value)
	{
		setProperty(ctx, YEAR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Incentive.year</code> attribute. 
	 * @param value the year - year
	 */
	public void setYear(final String value)
	{
		setYear( getSession().getSessionContext(), value );
	}
	
}
