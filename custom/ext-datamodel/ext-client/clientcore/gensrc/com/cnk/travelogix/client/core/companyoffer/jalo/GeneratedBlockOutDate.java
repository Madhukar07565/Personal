/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.companyoffer.jalo;

import com.cnk.travelogix.client.core.companyoffer.jalo.BookingDateValidity;
import com.cnk.travelogix.client.core.companyoffer.jalo.TravelDateValidity;
import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
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
 * Generated class for type {@link com.cnk.travelogix.client.core.companyoffer.jalo.BlockOutDate BlockOutDate}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBlockOutDate extends GenericItem
{
	/** Qualifier of the <code>BlockOutDate.blockOutDateFrom</code> attribute **/
	public static final String BLOCKOUTDATEFROM = "blockOutDateFrom";
	/** Qualifier of the <code>BlockOutDate.blockOutDateTo</code> attribute **/
	public static final String BLOCKOUTDATETO = "blockOutDateTo";
	/** Qualifier of the <code>BlockOutDate.bookingDateBlockDate</code> attribute **/
	public static final String BOOKINGDATEBLOCKDATE = "bookingDateBlockDate";
	/** Qualifier of the <code>BlockOutDate.travelDateBlockOut</code> attribute **/
	public static final String TRAVELDATEBLOCKOUT = "travelDateBlockOut";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n BOOKINGDATEBLOCKDATE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBlockOutDate> BOOKINGDATEBLOCKDATEHANDLER = new BidirectionalOneToManyHandler<GeneratedBlockOutDate>(
	ClientcoreConstants.TC.BLOCKOUTDATE,
	false,
	"bookingDateBlockDate",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRAVELDATEBLOCKOUT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBlockOutDate> TRAVELDATEBLOCKOUTHANDLER = new BidirectionalOneToManyHandler<GeneratedBlockOutDate>(
	ClientcoreConstants.TC.BLOCKOUTDATE,
	false,
	"travelDateBlockOut",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(BLOCKOUTDATEFROM, AttributeMode.INITIAL);
		tmp.put(BLOCKOUTDATETO, AttributeMode.INITIAL);
		tmp.put(BOOKINGDATEBLOCKDATE, AttributeMode.INITIAL);
		tmp.put(TRAVELDATEBLOCKOUT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BlockOutDate.blockOutDateFrom</code> attribute.
	 * @return the blockOutDateFrom
	 */
	public Date getBlockOutDateFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, BLOCKOUTDATEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BlockOutDate.blockOutDateFrom</code> attribute.
	 * @return the blockOutDateFrom
	 */
	public Date getBlockOutDateFrom()
	{
		return getBlockOutDateFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BlockOutDate.blockOutDateFrom</code> attribute. 
	 * @param value the blockOutDateFrom
	 */
	public void setBlockOutDateFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, BLOCKOUTDATEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BlockOutDate.blockOutDateFrom</code> attribute. 
	 * @param value the blockOutDateFrom
	 */
	public void setBlockOutDateFrom(final Date value)
	{
		setBlockOutDateFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BlockOutDate.blockOutDateTo</code> attribute.
	 * @return the blockOutDateTo
	 */
	public Date getBlockOutDateTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, BLOCKOUTDATETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BlockOutDate.blockOutDateTo</code> attribute.
	 * @return the blockOutDateTo
	 */
	public Date getBlockOutDateTo()
	{
		return getBlockOutDateTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BlockOutDate.blockOutDateTo</code> attribute. 
	 * @param value the blockOutDateTo
	 */
	public void setBlockOutDateTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, BLOCKOUTDATETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BlockOutDate.blockOutDateTo</code> attribute. 
	 * @param value the blockOutDateTo
	 */
	public void setBlockOutDateTo(final Date value)
	{
		setBlockOutDateTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BlockOutDate.bookingDateBlockDate</code> attribute.
	 * @return the bookingDateBlockDate
	 */
	public BookingDateValidity getBookingDateBlockDate(final SessionContext ctx)
	{
		return (BookingDateValidity)getProperty( ctx, BOOKINGDATEBLOCKDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BlockOutDate.bookingDateBlockDate</code> attribute.
	 * @return the bookingDateBlockDate
	 */
	public BookingDateValidity getBookingDateBlockDate()
	{
		return getBookingDateBlockDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BlockOutDate.bookingDateBlockDate</code> attribute. 
	 * @param value the bookingDateBlockDate
	 */
	public void setBookingDateBlockDate(final SessionContext ctx, final BookingDateValidity value)
	{
		BOOKINGDATEBLOCKDATEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BlockOutDate.bookingDateBlockDate</code> attribute. 
	 * @param value the bookingDateBlockDate
	 */
	public void setBookingDateBlockDate(final BookingDateValidity value)
	{
		setBookingDateBlockDate( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		BOOKINGDATEBLOCKDATEHANDLER.newInstance(ctx, allAttributes);
		TRAVELDATEBLOCKOUTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BlockOutDate.travelDateBlockOut</code> attribute.
	 * @return the travelDateBlockOut
	 */
	public TravelDateValidity getTravelDateBlockOut(final SessionContext ctx)
	{
		return (TravelDateValidity)getProperty( ctx, TRAVELDATEBLOCKOUT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BlockOutDate.travelDateBlockOut</code> attribute.
	 * @return the travelDateBlockOut
	 */
	public TravelDateValidity getTravelDateBlockOut()
	{
		return getTravelDateBlockOut( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BlockOutDate.travelDateBlockOut</code> attribute. 
	 * @param value the travelDateBlockOut
	 */
	public void setTravelDateBlockOut(final SessionContext ctx, final TravelDateValidity value)
	{
		TRAVELDATEBLOCKOUTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BlockOutDate.travelDateBlockOut</code> attribute. 
	 * @param value the travelDateBlockOut
	 */
	public void setTravelDateBlockOut(final TravelDateValidity value)
	{
		setTravelDateBlockOut( getSession().getSessionContext(), value );
	}
	
}
