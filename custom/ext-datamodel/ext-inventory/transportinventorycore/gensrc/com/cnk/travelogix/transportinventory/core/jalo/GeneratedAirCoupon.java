/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transportinventory.core.jalo;

import com.cnk.travelogix.masterdata.core.jalo.TravelogixPolicy;
import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transportinventory.core.jalo.AbstractCouponDetail;
import com.cnk.travelogix.transportinventory.core.jalo.AirCouponIndentRequest;
import com.cnk.travelogix.transportinventory.core.jalo.InclusionExclusion;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.StandardDateRange;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.transportinventory.core.jalo.AirCoupon AbstractAirCoupon}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAirCoupon extends AbstractCouponDetail
{
	/** Qualifier of the <code>AbstractAirCoupon.bookingValidity</code> attribute **/
	public static final String BOOKINGVALIDITY = "bookingValidity";
	/** Qualifier of the <code>AbstractAirCoupon.travelValidity</code> attribute **/
	public static final String TRAVELVALIDITY = "travelValidity";
	/** Qualifier of the <code>AbstractAirCoupon.travelBlockoutPeriod</code> attribute **/
	public static final String TRAVELBLOCKOUTPERIOD = "travelBlockoutPeriod";
	/** Qualifier of the <code>AbstractAirCoupon.totalNumberOfCoupons</code> attribute **/
	public static final String TOTALNUMBEROFCOUPONS = "totalNumberOfCoupons";
	/** Qualifier of the <code>AbstractAirCoupon.ticketNumberAvailable</code> attribute **/
	public static final String TICKETNUMBERAVAILABLE = "ticketNumberAvailable";
	/** Qualifier of the <code>AbstractAirCoupon.couponTransferable</code> attribute **/
	public static final String COUPONTRANSFERABLE = "couponTransferable";
	/** Qualifier of the <code>AbstractAirCoupon.couponRefundable</code> attribute **/
	public static final String COUPONREFUNDABLE = "couponRefundable";
	/** Qualifier of the <code>AbstractAirCoupon.indentRequest</code> attribute **/
	public static final String INDENTREQUEST = "indentRequest";
	/** Qualifier of the <code>AbstractAirCoupon.policy</code> attribute **/
	public static final String POLICY = "policy";
	/** Qualifier of the <code>AbstractAirCoupon.exclusion</code> attribute **/
	public static final String EXCLUSION = "exclusion";
	/** Qualifier of the <code>AbstractAirCoupon.inclusion</code> attribute **/
	public static final String INCLUSION = "inclusion";
	/**
	* {@link OneToManyHandler} for handling 1:n EXCLUSION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<InclusionExclusion> EXCLUSIONHANDLER = new OneToManyHandler<InclusionExclusion>(
	TransportinventorycoreConstants.TC.INCLUSIONEXCLUSION,
	true,
	"airCoupon",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n INCLUSION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<InclusionExclusion> INCLUSIONHANDLER = new OneToManyHandler<InclusionExclusion>(
	TransportinventorycoreConstants.TC.INCLUSIONEXCLUSION,
	true,
	"airCoupon",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCouponDetail.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(BOOKINGVALIDITY, AttributeMode.INITIAL);
		tmp.put(TRAVELVALIDITY, AttributeMode.INITIAL);
		tmp.put(TRAVELBLOCKOUTPERIOD, AttributeMode.INITIAL);
		tmp.put(TOTALNUMBEROFCOUPONS, AttributeMode.INITIAL);
		tmp.put(TICKETNUMBERAVAILABLE, AttributeMode.INITIAL);
		tmp.put(COUPONTRANSFERABLE, AttributeMode.INITIAL);
		tmp.put(COUPONREFUNDABLE, AttributeMode.INITIAL);
		tmp.put(INDENTREQUEST, AttributeMode.INITIAL);
		tmp.put(POLICY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.bookingValidity</code> attribute.
	 * @return the bookingValidity
	 */
	public StandardDateRange getBookingValidity(final SessionContext ctx)
	{
		return (StandardDateRange)getProperty( ctx, BOOKINGVALIDITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.bookingValidity</code> attribute.
	 * @return the bookingValidity
	 */
	public StandardDateRange getBookingValidity()
	{
		return getBookingValidity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.bookingValidity</code> attribute. 
	 * @param value the bookingValidity
	 */
	public void setBookingValidity(final SessionContext ctx, final StandardDateRange value)
	{
		setProperty(ctx, BOOKINGVALIDITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.bookingValidity</code> attribute. 
	 * @param value the bookingValidity
	 */
	public void setBookingValidity(final StandardDateRange value)
	{
		setBookingValidity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.couponRefundable</code> attribute.
	 * @return the couponRefundable
	 */
	public Boolean isCouponRefundable(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, COUPONREFUNDABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.couponRefundable</code> attribute.
	 * @return the couponRefundable
	 */
	public Boolean isCouponRefundable()
	{
		return isCouponRefundable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.couponRefundable</code> attribute. 
	 * @return the couponRefundable
	 */
	public boolean isCouponRefundableAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isCouponRefundable( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.couponRefundable</code> attribute. 
	 * @return the couponRefundable
	 */
	public boolean isCouponRefundableAsPrimitive()
	{
		return isCouponRefundableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.couponRefundable</code> attribute. 
	 * @param value the couponRefundable
	 */
	public void setCouponRefundable(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, COUPONREFUNDABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.couponRefundable</code> attribute. 
	 * @param value the couponRefundable
	 */
	public void setCouponRefundable(final Boolean value)
	{
		setCouponRefundable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.couponRefundable</code> attribute. 
	 * @param value the couponRefundable
	 */
	public void setCouponRefundable(final SessionContext ctx, final boolean value)
	{
		setCouponRefundable( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.couponRefundable</code> attribute. 
	 * @param value the couponRefundable
	 */
	public void setCouponRefundable(final boolean value)
	{
		setCouponRefundable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.couponTransferable</code> attribute.
	 * @return the couponTransferable
	 */
	public Boolean isCouponTransferable(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, COUPONTRANSFERABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.couponTransferable</code> attribute.
	 * @return the couponTransferable
	 */
	public Boolean isCouponTransferable()
	{
		return isCouponTransferable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.couponTransferable</code> attribute. 
	 * @return the couponTransferable
	 */
	public boolean isCouponTransferableAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isCouponTransferable( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.couponTransferable</code> attribute. 
	 * @return the couponTransferable
	 */
	public boolean isCouponTransferableAsPrimitive()
	{
		return isCouponTransferableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.couponTransferable</code> attribute. 
	 * @param value the couponTransferable
	 */
	public void setCouponTransferable(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, COUPONTRANSFERABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.couponTransferable</code> attribute. 
	 * @param value the couponTransferable
	 */
	public void setCouponTransferable(final Boolean value)
	{
		setCouponTransferable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.couponTransferable</code> attribute. 
	 * @param value the couponTransferable
	 */
	public void setCouponTransferable(final SessionContext ctx, final boolean value)
	{
		setCouponTransferable( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.couponTransferable</code> attribute. 
	 * @param value the couponTransferable
	 */
	public void setCouponTransferable(final boolean value)
	{
		setCouponTransferable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.exclusion</code> attribute.
	 * @return the exclusion
	 */
	public Collection<InclusionExclusion> getExclusion(final SessionContext ctx)
	{
		return EXCLUSIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.exclusion</code> attribute.
	 * @return the exclusion
	 */
	public Collection<InclusionExclusion> getExclusion()
	{
		return getExclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.exclusion</code> attribute. 
	 * @param value the exclusion
	 */
	public void setExclusion(final SessionContext ctx, final Collection<InclusionExclusion> value)
	{
		EXCLUSIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.exclusion</code> attribute. 
	 * @param value the exclusion
	 */
	public void setExclusion(final Collection<InclusionExclusion> value)
	{
		setExclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to exclusion. 
	 * @param value the item to add to exclusion
	 */
	public void addToExclusion(final SessionContext ctx, final InclusionExclusion value)
	{
		EXCLUSIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to exclusion. 
	 * @param value the item to add to exclusion
	 */
	public void addToExclusion(final InclusionExclusion value)
	{
		addToExclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from exclusion. 
	 * @param value the item to remove from exclusion
	 */
	public void removeFromExclusion(final SessionContext ctx, final InclusionExclusion value)
	{
		EXCLUSIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from exclusion. 
	 * @param value the item to remove from exclusion
	 */
	public void removeFromExclusion(final InclusionExclusion value)
	{
		removeFromExclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.inclusion</code> attribute.
	 * @return the inclusion
	 */
	public Collection<InclusionExclusion> getInclusion(final SessionContext ctx)
	{
		return INCLUSIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.inclusion</code> attribute.
	 * @return the inclusion
	 */
	public Collection<InclusionExclusion> getInclusion()
	{
		return getInclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.inclusion</code> attribute. 
	 * @param value the inclusion
	 */
	public void setInclusion(final SessionContext ctx, final Collection<InclusionExclusion> value)
	{
		INCLUSIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.inclusion</code> attribute. 
	 * @param value the inclusion
	 */
	public void setInclusion(final Collection<InclusionExclusion> value)
	{
		setInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inclusion. 
	 * @param value the item to add to inclusion
	 */
	public void addToInclusion(final SessionContext ctx, final InclusionExclusion value)
	{
		INCLUSIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inclusion. 
	 * @param value the item to add to inclusion
	 */
	public void addToInclusion(final InclusionExclusion value)
	{
		addToInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inclusion. 
	 * @param value the item to remove from inclusion
	 */
	public void removeFromInclusion(final SessionContext ctx, final InclusionExclusion value)
	{
		INCLUSIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inclusion. 
	 * @param value the item to remove from inclusion
	 */
	public void removeFromInclusion(final InclusionExclusion value)
	{
		removeFromInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.indentRequest</code> attribute.
	 * @return the indentRequest
	 */
	public AirCouponIndentRequest getIndentRequest(final SessionContext ctx)
	{
		return (AirCouponIndentRequest)getProperty( ctx, INDENTREQUEST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.indentRequest</code> attribute.
	 * @return the indentRequest
	 */
	public AirCouponIndentRequest getIndentRequest()
	{
		return getIndentRequest( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.indentRequest</code> attribute. 
	 * @param value the indentRequest
	 */
	public void setIndentRequest(final SessionContext ctx, final AirCouponIndentRequest value)
	{
		setProperty(ctx, INDENTREQUEST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.indentRequest</code> attribute. 
	 * @param value the indentRequest
	 */
	public void setIndentRequest(final AirCouponIndentRequest value)
	{
		setIndentRequest( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.policy</code> attribute.
	 * @return the policy
	 */
	public TravelogixPolicy getPolicy(final SessionContext ctx)
	{
		return (TravelogixPolicy)getProperty( ctx, POLICY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.policy</code> attribute.
	 * @return the policy
	 */
	public TravelogixPolicy getPolicy()
	{
		return getPolicy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.policy</code> attribute. 
	 * @param value the policy
	 */
	public void setPolicy(final SessionContext ctx, final TravelogixPolicy value)
	{
		setProperty(ctx, POLICY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.policy</code> attribute. 
	 * @param value the policy
	 */
	public void setPolicy(final TravelogixPolicy value)
	{
		setPolicy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.ticketNumberAvailable</code> attribute.
	 * @return the ticketNumberAvailable
	 */
	public Boolean isTicketNumberAvailable(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, TICKETNUMBERAVAILABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.ticketNumberAvailable</code> attribute.
	 * @return the ticketNumberAvailable
	 */
	public Boolean isTicketNumberAvailable()
	{
		return isTicketNumberAvailable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.ticketNumberAvailable</code> attribute. 
	 * @return the ticketNumberAvailable
	 */
	public boolean isTicketNumberAvailableAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isTicketNumberAvailable( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.ticketNumberAvailable</code> attribute. 
	 * @return the ticketNumberAvailable
	 */
	public boolean isTicketNumberAvailableAsPrimitive()
	{
		return isTicketNumberAvailableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.ticketNumberAvailable</code> attribute. 
	 * @param value the ticketNumberAvailable
	 */
	public void setTicketNumberAvailable(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, TICKETNUMBERAVAILABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.ticketNumberAvailable</code> attribute. 
	 * @param value the ticketNumberAvailable
	 */
	public void setTicketNumberAvailable(final Boolean value)
	{
		setTicketNumberAvailable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.ticketNumberAvailable</code> attribute. 
	 * @param value the ticketNumberAvailable
	 */
	public void setTicketNumberAvailable(final SessionContext ctx, final boolean value)
	{
		setTicketNumberAvailable( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.ticketNumberAvailable</code> attribute. 
	 * @param value the ticketNumberAvailable
	 */
	public void setTicketNumberAvailable(final boolean value)
	{
		setTicketNumberAvailable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.totalNumberOfCoupons</code> attribute.
	 * @return the totalNumberOfCoupons
	 */
	public Integer getTotalNumberOfCoupons(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TOTALNUMBEROFCOUPONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.totalNumberOfCoupons</code> attribute.
	 * @return the totalNumberOfCoupons
	 */
	public Integer getTotalNumberOfCoupons()
	{
		return getTotalNumberOfCoupons( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.totalNumberOfCoupons</code> attribute. 
	 * @return the totalNumberOfCoupons
	 */
	public int getTotalNumberOfCouponsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTotalNumberOfCoupons( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.totalNumberOfCoupons</code> attribute. 
	 * @return the totalNumberOfCoupons
	 */
	public int getTotalNumberOfCouponsAsPrimitive()
	{
		return getTotalNumberOfCouponsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.totalNumberOfCoupons</code> attribute. 
	 * @param value the totalNumberOfCoupons
	 */
	public void setTotalNumberOfCoupons(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TOTALNUMBEROFCOUPONS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.totalNumberOfCoupons</code> attribute. 
	 * @param value the totalNumberOfCoupons
	 */
	public void setTotalNumberOfCoupons(final Integer value)
	{
		setTotalNumberOfCoupons( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.totalNumberOfCoupons</code> attribute. 
	 * @param value the totalNumberOfCoupons
	 */
	public void setTotalNumberOfCoupons(final SessionContext ctx, final int value)
	{
		setTotalNumberOfCoupons( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.totalNumberOfCoupons</code> attribute. 
	 * @param value the totalNumberOfCoupons
	 */
	public void setTotalNumberOfCoupons(final int value)
	{
		setTotalNumberOfCoupons( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.travelBlockoutPeriod</code> attribute.
	 * @return the travelBlockoutPeriod
	 */
	public Collection<StandardDateRange> getTravelBlockoutPeriod(final SessionContext ctx)
	{
		Collection<StandardDateRange> coll = (Collection<StandardDateRange>)getProperty( ctx, TRAVELBLOCKOUTPERIOD);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.travelBlockoutPeriod</code> attribute.
	 * @return the travelBlockoutPeriod
	 */
	public Collection<StandardDateRange> getTravelBlockoutPeriod()
	{
		return getTravelBlockoutPeriod( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.travelBlockoutPeriod</code> attribute. 
	 * @param value the travelBlockoutPeriod
	 */
	public void setTravelBlockoutPeriod(final SessionContext ctx, final Collection<StandardDateRange> value)
	{
		setProperty(ctx, TRAVELBLOCKOUTPERIOD,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.travelBlockoutPeriod</code> attribute. 
	 * @param value the travelBlockoutPeriod
	 */
	public void setTravelBlockoutPeriod(final Collection<StandardDateRange> value)
	{
		setTravelBlockoutPeriod( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.travelValidity</code> attribute.
	 * @return the travelValidity
	 */
	public StandardDateRange getTravelValidity(final SessionContext ctx)
	{
		return (StandardDateRange)getProperty( ctx, TRAVELVALIDITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCoupon.travelValidity</code> attribute.
	 * @return the travelValidity
	 */
	public StandardDateRange getTravelValidity()
	{
		return getTravelValidity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.travelValidity</code> attribute. 
	 * @param value the travelValidity
	 */
	public void setTravelValidity(final SessionContext ctx, final StandardDateRange value)
	{
		setProperty(ctx, TRAVELVALIDITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCoupon.travelValidity</code> attribute. 
	 * @param value the travelValidity
	 */
	public void setTravelValidity(final StandardDateRange value)
	{
		setTravelValidity( getSession().getSessionContext(), value );
	}
	
}
