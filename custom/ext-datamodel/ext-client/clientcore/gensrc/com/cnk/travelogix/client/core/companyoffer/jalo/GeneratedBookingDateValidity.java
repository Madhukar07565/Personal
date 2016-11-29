/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.companyoffer.jalo;

import com.cnk.travelogix.client.core.companyoffer.jalo.BlockOutDate;
import com.cnk.travelogix.client.core.companyoffer.jalo.CompanyOffers;
import com.cnk.travelogix.client.core.companyoffer.jalo.CompanyTarget;
import com.cnk.travelogix.client.core.companyoffer.jalo.RedemptionCompanyOffers;
import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.companyoffer.jalo.BookingDateValidity BookingDateValidity}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBookingDateValidity extends GenericItem
{
	/** Qualifier of the <code>BookingDateValidity.bookingDateFrom</code> attribute **/
	public static final String BOOKINGDATEFROM = "bookingDateFrom";
	/** Qualifier of the <code>BookingDateValidity.bookingDateTo</code> attribute **/
	public static final String BOOKINGDATETO = "bookingDateTo";
	/** Qualifier of the <code>BookingDateValidity.daysValid</code> attribute **/
	public static final String DAYSVALID = "daysValid";
	/** Qualifier of the <code>BookingDateValidity.bookingTimeFrom</code> attribute **/
	public static final String BOOKINGTIMEFROM = "bookingTimeFrom";
	/** Qualifier of the <code>BookingDateValidity.bookingTimeTo</code> attribute **/
	public static final String BOOKINGTIMETO = "bookingTimeTo";
	/** Qualifier of the <code>BookingDateValidity.companyTarget</code> attribute **/
	public static final String COMPANYTARGET = "companyTarget";
	/** Qualifier of the <code>BookingDateValidity.companyBookingDateValidity</code> attribute **/
	public static final String COMPANYBOOKINGDATEVALIDITY = "companyBookingDateValidity";
	/** Qualifier of the <code>BookingDateValidity.redempOffersBookingDateValidity</code> attribute **/
	public static final String REDEMPOFFERSBOOKINGDATEVALIDITY = "redempOffersBookingDateValidity";
	/** Qualifier of the <code>BookingDateValidity.blockOutDatesBooking</code> attribute **/
	public static final String BLOCKOUTDATESBOOKING = "blockOutDatesBooking";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n COMPANYBOOKINGDATEVALIDITY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBookingDateValidity> COMPANYBOOKINGDATEVALIDITYHANDLER = new BidirectionalOneToManyHandler<GeneratedBookingDateValidity>(
	ClientcoreConstants.TC.BOOKINGDATEVALIDITY,
	false,
	"companyBookingDateValidity",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n REDEMPOFFERSBOOKINGDATEVALIDITY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBookingDateValidity> REDEMPOFFERSBOOKINGDATEVALIDITYHANDLER = new BidirectionalOneToManyHandler<GeneratedBookingDateValidity>(
	ClientcoreConstants.TC.BOOKINGDATEVALIDITY,
	false,
	"redempOffersBookingDateValidity",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n BLOCKOUTDATESBOOKING's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BlockOutDate> BLOCKOUTDATESBOOKINGHANDLER = new OneToManyHandler<BlockOutDate>(
	ClientcoreConstants.TC.BLOCKOUTDATE,
	false,
	"bookingDateBlockDate",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(BOOKINGDATEFROM, AttributeMode.INITIAL);
		tmp.put(BOOKINGDATETO, AttributeMode.INITIAL);
		tmp.put(DAYSVALID, AttributeMode.INITIAL);
		tmp.put(BOOKINGTIMEFROM, AttributeMode.INITIAL);
		tmp.put(BOOKINGTIMETO, AttributeMode.INITIAL);
		tmp.put(COMPANYTARGET, AttributeMode.INITIAL);
		tmp.put(COMPANYBOOKINGDATEVALIDITY, AttributeMode.INITIAL);
		tmp.put(REDEMPOFFERSBOOKINGDATEVALIDITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingDateValidity.blockOutDatesBooking</code> attribute.
	 * @return the blockOutDatesBooking
	 */
	public Collection<BlockOutDate> getBlockOutDatesBooking(final SessionContext ctx)
	{
		return BLOCKOUTDATESBOOKINGHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingDateValidity.blockOutDatesBooking</code> attribute.
	 * @return the blockOutDatesBooking
	 */
	public Collection<BlockOutDate> getBlockOutDatesBooking()
	{
		return getBlockOutDatesBooking( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingDateValidity.blockOutDatesBooking</code> attribute. 
	 * @param value the blockOutDatesBooking
	 */
	public void setBlockOutDatesBooking(final SessionContext ctx, final Collection<BlockOutDate> value)
	{
		BLOCKOUTDATESBOOKINGHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingDateValidity.blockOutDatesBooking</code> attribute. 
	 * @param value the blockOutDatesBooking
	 */
	public void setBlockOutDatesBooking(final Collection<BlockOutDate> value)
	{
		setBlockOutDatesBooking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to blockOutDatesBooking. 
	 * @param value the item to add to blockOutDatesBooking
	 */
	public void addToBlockOutDatesBooking(final SessionContext ctx, final BlockOutDate value)
	{
		BLOCKOUTDATESBOOKINGHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to blockOutDatesBooking. 
	 * @param value the item to add to blockOutDatesBooking
	 */
	public void addToBlockOutDatesBooking(final BlockOutDate value)
	{
		addToBlockOutDatesBooking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from blockOutDatesBooking. 
	 * @param value the item to remove from blockOutDatesBooking
	 */
	public void removeFromBlockOutDatesBooking(final SessionContext ctx, final BlockOutDate value)
	{
		BLOCKOUTDATESBOOKINGHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from blockOutDatesBooking. 
	 * @param value the item to remove from blockOutDatesBooking
	 */
	public void removeFromBlockOutDatesBooking(final BlockOutDate value)
	{
		removeFromBlockOutDatesBooking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingDateValidity.bookingDateFrom</code> attribute.
	 * @return the bookingDateFrom
	 */
	public Date getBookingDateFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, BOOKINGDATEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingDateValidity.bookingDateFrom</code> attribute.
	 * @return the bookingDateFrom
	 */
	public Date getBookingDateFrom()
	{
		return getBookingDateFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingDateValidity.bookingDateFrom</code> attribute. 
	 * @param value the bookingDateFrom
	 */
	public void setBookingDateFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, BOOKINGDATEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingDateValidity.bookingDateFrom</code> attribute. 
	 * @param value the bookingDateFrom
	 */
	public void setBookingDateFrom(final Date value)
	{
		setBookingDateFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingDateValidity.bookingDateTo</code> attribute.
	 * @return the bookingDateTo
	 */
	public Date getBookingDateTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, BOOKINGDATETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingDateValidity.bookingDateTo</code> attribute.
	 * @return the bookingDateTo
	 */
	public Date getBookingDateTo()
	{
		return getBookingDateTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingDateValidity.bookingDateTo</code> attribute. 
	 * @param value the bookingDateTo
	 */
	public void setBookingDateTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, BOOKINGDATETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingDateValidity.bookingDateTo</code> attribute. 
	 * @param value the bookingDateTo
	 */
	public void setBookingDateTo(final Date value)
	{
		setBookingDateTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingDateValidity.bookingTimeFrom</code> attribute.
	 * @return the bookingTimeFrom
	 */
	public String getBookingTimeFrom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BOOKINGTIMEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingDateValidity.bookingTimeFrom</code> attribute.
	 * @return the bookingTimeFrom
	 */
	public String getBookingTimeFrom()
	{
		return getBookingTimeFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingDateValidity.bookingTimeFrom</code> attribute. 
	 * @param value the bookingTimeFrom
	 */
	public void setBookingTimeFrom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BOOKINGTIMEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingDateValidity.bookingTimeFrom</code> attribute. 
	 * @param value the bookingTimeFrom
	 */
	public void setBookingTimeFrom(final String value)
	{
		setBookingTimeFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingDateValidity.bookingTimeTo</code> attribute.
	 * @return the bookingTimeTo
	 */
	public String getBookingTimeTo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BOOKINGTIMETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingDateValidity.bookingTimeTo</code> attribute.
	 * @return the bookingTimeTo
	 */
	public String getBookingTimeTo()
	{
		return getBookingTimeTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingDateValidity.bookingTimeTo</code> attribute. 
	 * @param value the bookingTimeTo
	 */
	public void setBookingTimeTo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BOOKINGTIMETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingDateValidity.bookingTimeTo</code> attribute. 
	 * @param value the bookingTimeTo
	 */
	public void setBookingTimeTo(final String value)
	{
		setBookingTimeTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingDateValidity.companyBookingDateValidity</code> attribute.
	 * @return the companyBookingDateValidity
	 */
	public CompanyOffers getCompanyBookingDateValidity(final SessionContext ctx)
	{
		return (CompanyOffers)getProperty( ctx, COMPANYBOOKINGDATEVALIDITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingDateValidity.companyBookingDateValidity</code> attribute.
	 * @return the companyBookingDateValidity
	 */
	public CompanyOffers getCompanyBookingDateValidity()
	{
		return getCompanyBookingDateValidity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingDateValidity.companyBookingDateValidity</code> attribute. 
	 * @param value the companyBookingDateValidity
	 */
	public void setCompanyBookingDateValidity(final SessionContext ctx, final CompanyOffers value)
	{
		COMPANYBOOKINGDATEVALIDITYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingDateValidity.companyBookingDateValidity</code> attribute. 
	 * @param value the companyBookingDateValidity
	 */
	public void setCompanyBookingDateValidity(final CompanyOffers value)
	{
		setCompanyBookingDateValidity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingDateValidity.companyTarget</code> attribute.
	 * @return the companyTarget
	 */
	public CompanyTarget getCompanyTarget(final SessionContext ctx)
	{
		return (CompanyTarget)getProperty( ctx, COMPANYTARGET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingDateValidity.companyTarget</code> attribute.
	 * @return the companyTarget
	 */
	public CompanyTarget getCompanyTarget()
	{
		return getCompanyTarget( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingDateValidity.companyTarget</code> attribute. 
	 * @param value the companyTarget
	 */
	public void setCompanyTarget(final SessionContext ctx, final CompanyTarget value)
	{
		setProperty(ctx, COMPANYTARGET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingDateValidity.companyTarget</code> attribute. 
	 * @param value the companyTarget
	 */
	public void setCompanyTarget(final CompanyTarget value)
	{
		setCompanyTarget( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		COMPANYBOOKINGDATEVALIDITYHANDLER.newInstance(ctx, allAttributes);
		REDEMPOFFERSBOOKINGDATEVALIDITYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingDateValidity.daysValid</code> attribute.
	 * @return the daysValid
	 */
	public EnumerationValue getDaysValid(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DAYSVALID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingDateValidity.daysValid</code> attribute.
	 * @return the daysValid
	 */
	public EnumerationValue getDaysValid()
	{
		return getDaysValid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingDateValidity.daysValid</code> attribute. 
	 * @param value the daysValid
	 */
	public void setDaysValid(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DAYSVALID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingDateValidity.daysValid</code> attribute. 
	 * @param value the daysValid
	 */
	public void setDaysValid(final EnumerationValue value)
	{
		setDaysValid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingDateValidity.redempOffersBookingDateValidity</code> attribute.
	 * @return the redempOffersBookingDateValidity
	 */
	public RedemptionCompanyOffers getRedempOffersBookingDateValidity(final SessionContext ctx)
	{
		return (RedemptionCompanyOffers)getProperty( ctx, REDEMPOFFERSBOOKINGDATEVALIDITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingDateValidity.redempOffersBookingDateValidity</code> attribute.
	 * @return the redempOffersBookingDateValidity
	 */
	public RedemptionCompanyOffers getRedempOffersBookingDateValidity()
	{
		return getRedempOffersBookingDateValidity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingDateValidity.redempOffersBookingDateValidity</code> attribute. 
	 * @param value the redempOffersBookingDateValidity
	 */
	public void setRedempOffersBookingDateValidity(final SessionContext ctx, final RedemptionCompanyOffers value)
	{
		REDEMPOFFERSBOOKINGDATEVALIDITYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingDateValidity.redempOffersBookingDateValidity</code> attribute. 
	 * @param value the redempOffersBookingDateValidity
	 */
	public void setRedempOffersBookingDateValidity(final RedemptionCompanyOffers value)
	{
		setRedempOffersBookingDateValidity( getSession().getSessionContext(), value );
	}
	
}
