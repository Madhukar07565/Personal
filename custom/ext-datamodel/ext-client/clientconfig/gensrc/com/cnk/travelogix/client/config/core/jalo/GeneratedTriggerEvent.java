/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.jalo.BookingStatusCriteria;
import com.cnk.travelogix.client.config.core.jalo.EnquiryCriteria;
import com.cnk.travelogix.client.config.core.jalo.NumberOfNightsCriteria;
import com.cnk.travelogix.client.config.core.jalo.PaymentCriteria;
import com.cnk.travelogix.client.config.core.jalo.QuotationCriteria;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.TriggerEvent TriggerEvent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTriggerEvent extends GenericItem
{
	/** Qualifier of the <code>TriggerEvent.paidBookings</code> attribute **/
	public static final String PAIDBOOKINGS = "paidBookings";
	/** Qualifier of the <code>TriggerEvent.timeLimitBooking</code> attribute **/
	public static final String TIMELIMITBOOKING = "timeLimitBooking";
	/** Qualifier of the <code>TriggerEvent.criteriaType</code> attribute **/
	public static final String CRITERIATYPE = "criteriaType";
	/** Qualifier of the <code>TriggerEvent.paymentCriteria</code> attribute **/
	public static final String PAYMENTCRITERIA = "paymentCriteria";
	/** Qualifier of the <code>TriggerEvent.bookingStatusCriteria</code> attribute **/
	public static final String BOOKINGSTATUSCRITERIA = "bookingStatusCriteria";
	/** Qualifier of the <code>TriggerEvent.enquiryCriteria</code> attribute **/
	public static final String ENQUIRYCRITERIA = "enquiryCriteria";
	/** Qualifier of the <code>TriggerEvent.quotationCriteria</code> attribute **/
	public static final String QUOTATIONCRITERIA = "quotationCriteria";
	/** Qualifier of the <code>TriggerEvent.numberOfNightsCriteria</code> attribute **/
	public static final String NUMBEROFNIGHTSCRITERIA = "numberOfNightsCriteria";
	/**
	* {@link OneToManyHandler} for handling 1:n PAYMENTCRITERIA's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PaymentCriteria> PAYMENTCRITERIAHANDLER = new OneToManyHandler<PaymentCriteria>(
	ClientconfigConstants.TC.PAYMENTCRITERIA,
	false,
	"triggerEvent",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n BOOKINGSTATUSCRITERIA's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BookingStatusCriteria> BOOKINGSTATUSCRITERIAHANDLER = new OneToManyHandler<BookingStatusCriteria>(
	ClientconfigConstants.TC.BOOKINGSTATUSCRITERIA,
	false,
	"triggerEvent",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ENQUIRYCRITERIA's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EnquiryCriteria> ENQUIRYCRITERIAHANDLER = new OneToManyHandler<EnquiryCriteria>(
	ClientconfigConstants.TC.ENQUIRYCRITERIA,
	false,
	"triggerEvent",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n QUOTATIONCRITERIA's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<QuotationCriteria> QUOTATIONCRITERIAHANDLER = new OneToManyHandler<QuotationCriteria>(
	ClientconfigConstants.TC.QUOTATIONCRITERIA,
	false,
	"triggerEvent",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n NUMBEROFNIGHTSCRITERIA's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<NumberOfNightsCriteria> NUMBEROFNIGHTSCRITERIAHANDLER = new OneToManyHandler<NumberOfNightsCriteria>(
	ClientconfigConstants.TC.NUMBEROFNIGHTSCRITERIA,
	false,
	"triggerEvent",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PAIDBOOKINGS, AttributeMode.INITIAL);
		tmp.put(TIMELIMITBOOKING, AttributeMode.INITIAL);
		tmp.put(CRITERIATYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TriggerEvent.bookingStatusCriteria</code> attribute.
	 * @return the bookingStatusCriteria
	 */
	public Collection<BookingStatusCriteria> getBookingStatusCriteria(final SessionContext ctx)
	{
		return BOOKINGSTATUSCRITERIAHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TriggerEvent.bookingStatusCriteria</code> attribute.
	 * @return the bookingStatusCriteria
	 */
	public Collection<BookingStatusCriteria> getBookingStatusCriteria()
	{
		return getBookingStatusCriteria( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TriggerEvent.bookingStatusCriteria</code> attribute. 
	 * @param value the bookingStatusCriteria
	 */
	public void setBookingStatusCriteria(final SessionContext ctx, final Collection<BookingStatusCriteria> value)
	{
		BOOKINGSTATUSCRITERIAHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TriggerEvent.bookingStatusCriteria</code> attribute. 
	 * @param value the bookingStatusCriteria
	 */
	public void setBookingStatusCriteria(final Collection<BookingStatusCriteria> value)
	{
		setBookingStatusCriteria( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bookingStatusCriteria. 
	 * @param value the item to add to bookingStatusCriteria
	 */
	public void addToBookingStatusCriteria(final SessionContext ctx, final BookingStatusCriteria value)
	{
		BOOKINGSTATUSCRITERIAHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bookingStatusCriteria. 
	 * @param value the item to add to bookingStatusCriteria
	 */
	public void addToBookingStatusCriteria(final BookingStatusCriteria value)
	{
		addToBookingStatusCriteria( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bookingStatusCriteria. 
	 * @param value the item to remove from bookingStatusCriteria
	 */
	public void removeFromBookingStatusCriteria(final SessionContext ctx, final BookingStatusCriteria value)
	{
		BOOKINGSTATUSCRITERIAHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bookingStatusCriteria. 
	 * @param value the item to remove from bookingStatusCriteria
	 */
	public void removeFromBookingStatusCriteria(final BookingStatusCriteria value)
	{
		removeFromBookingStatusCriteria( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TriggerEvent.criteriaType</code> attribute.
	 * @return the criteriaType - Client Document Handling Criteria Type
	 */
	public EnumerationValue getCriteriaType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CRITERIATYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TriggerEvent.criteriaType</code> attribute.
	 * @return the criteriaType - Client Document Handling Criteria Type
	 */
	public EnumerationValue getCriteriaType()
	{
		return getCriteriaType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TriggerEvent.criteriaType</code> attribute. 
	 * @param value the criteriaType - Client Document Handling Criteria Type
	 */
	public void setCriteriaType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CRITERIATYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TriggerEvent.criteriaType</code> attribute. 
	 * @param value the criteriaType - Client Document Handling Criteria Type
	 */
	public void setCriteriaType(final EnumerationValue value)
	{
		setCriteriaType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TriggerEvent.enquiryCriteria</code> attribute.
	 * @return the enquiryCriteria
	 */
	public Collection<EnquiryCriteria> getEnquiryCriteria(final SessionContext ctx)
	{
		return ENQUIRYCRITERIAHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TriggerEvent.enquiryCriteria</code> attribute.
	 * @return the enquiryCriteria
	 */
	public Collection<EnquiryCriteria> getEnquiryCriteria()
	{
		return getEnquiryCriteria( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TriggerEvent.enquiryCriteria</code> attribute. 
	 * @param value the enquiryCriteria
	 */
	public void setEnquiryCriteria(final SessionContext ctx, final Collection<EnquiryCriteria> value)
	{
		ENQUIRYCRITERIAHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TriggerEvent.enquiryCriteria</code> attribute. 
	 * @param value the enquiryCriteria
	 */
	public void setEnquiryCriteria(final Collection<EnquiryCriteria> value)
	{
		setEnquiryCriteria( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to enquiryCriteria. 
	 * @param value the item to add to enquiryCriteria
	 */
	public void addToEnquiryCriteria(final SessionContext ctx, final EnquiryCriteria value)
	{
		ENQUIRYCRITERIAHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to enquiryCriteria. 
	 * @param value the item to add to enquiryCriteria
	 */
	public void addToEnquiryCriteria(final EnquiryCriteria value)
	{
		addToEnquiryCriteria( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from enquiryCriteria. 
	 * @param value the item to remove from enquiryCriteria
	 */
	public void removeFromEnquiryCriteria(final SessionContext ctx, final EnquiryCriteria value)
	{
		ENQUIRYCRITERIAHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from enquiryCriteria. 
	 * @param value the item to remove from enquiryCriteria
	 */
	public void removeFromEnquiryCriteria(final EnquiryCriteria value)
	{
		removeFromEnquiryCriteria( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TriggerEvent.numberOfNightsCriteria</code> attribute.
	 * @return the numberOfNightsCriteria
	 */
	public Collection<NumberOfNightsCriteria> getNumberOfNightsCriteria(final SessionContext ctx)
	{
		return NUMBEROFNIGHTSCRITERIAHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TriggerEvent.numberOfNightsCriteria</code> attribute.
	 * @return the numberOfNightsCriteria
	 */
	public Collection<NumberOfNightsCriteria> getNumberOfNightsCriteria()
	{
		return getNumberOfNightsCriteria( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TriggerEvent.numberOfNightsCriteria</code> attribute. 
	 * @param value the numberOfNightsCriteria
	 */
	public void setNumberOfNightsCriteria(final SessionContext ctx, final Collection<NumberOfNightsCriteria> value)
	{
		NUMBEROFNIGHTSCRITERIAHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TriggerEvent.numberOfNightsCriteria</code> attribute. 
	 * @param value the numberOfNightsCriteria
	 */
	public void setNumberOfNightsCriteria(final Collection<NumberOfNightsCriteria> value)
	{
		setNumberOfNightsCriteria( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to numberOfNightsCriteria. 
	 * @param value the item to add to numberOfNightsCriteria
	 */
	public void addToNumberOfNightsCriteria(final SessionContext ctx, final NumberOfNightsCriteria value)
	{
		NUMBEROFNIGHTSCRITERIAHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to numberOfNightsCriteria. 
	 * @param value the item to add to numberOfNightsCriteria
	 */
	public void addToNumberOfNightsCriteria(final NumberOfNightsCriteria value)
	{
		addToNumberOfNightsCriteria( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from numberOfNightsCriteria. 
	 * @param value the item to remove from numberOfNightsCriteria
	 */
	public void removeFromNumberOfNightsCriteria(final SessionContext ctx, final NumberOfNightsCriteria value)
	{
		NUMBEROFNIGHTSCRITERIAHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from numberOfNightsCriteria. 
	 * @param value the item to remove from numberOfNightsCriteria
	 */
	public void removeFromNumberOfNightsCriteria(final NumberOfNightsCriteria value)
	{
		removeFromNumberOfNightsCriteria( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TriggerEvent.paidBookings</code> attribute.
	 * @return the paidBookings
	 */
	public Boolean isPaidBookings(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PAIDBOOKINGS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TriggerEvent.paidBookings</code> attribute.
	 * @return the paidBookings
	 */
	public Boolean isPaidBookings()
	{
		return isPaidBookings( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TriggerEvent.paidBookings</code> attribute. 
	 * @return the paidBookings
	 */
	public boolean isPaidBookingsAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPaidBookings( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TriggerEvent.paidBookings</code> attribute. 
	 * @return the paidBookings
	 */
	public boolean isPaidBookingsAsPrimitive()
	{
		return isPaidBookingsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TriggerEvent.paidBookings</code> attribute. 
	 * @param value the paidBookings
	 */
	public void setPaidBookings(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PAIDBOOKINGS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TriggerEvent.paidBookings</code> attribute. 
	 * @param value the paidBookings
	 */
	public void setPaidBookings(final Boolean value)
	{
		setPaidBookings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TriggerEvent.paidBookings</code> attribute. 
	 * @param value the paidBookings
	 */
	public void setPaidBookings(final SessionContext ctx, final boolean value)
	{
		setPaidBookings( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TriggerEvent.paidBookings</code> attribute. 
	 * @param value the paidBookings
	 */
	public void setPaidBookings(final boolean value)
	{
		setPaidBookings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TriggerEvent.paymentCriteria</code> attribute.
	 * @return the paymentCriteria
	 */
	public Collection<PaymentCriteria> getPaymentCriteria(final SessionContext ctx)
	{
		return PAYMENTCRITERIAHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TriggerEvent.paymentCriteria</code> attribute.
	 * @return the paymentCriteria
	 */
	public Collection<PaymentCriteria> getPaymentCriteria()
	{
		return getPaymentCriteria( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TriggerEvent.paymentCriteria</code> attribute. 
	 * @param value the paymentCriteria
	 */
	public void setPaymentCriteria(final SessionContext ctx, final Collection<PaymentCriteria> value)
	{
		PAYMENTCRITERIAHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TriggerEvent.paymentCriteria</code> attribute. 
	 * @param value the paymentCriteria
	 */
	public void setPaymentCriteria(final Collection<PaymentCriteria> value)
	{
		setPaymentCriteria( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to paymentCriteria. 
	 * @param value the item to add to paymentCriteria
	 */
	public void addToPaymentCriteria(final SessionContext ctx, final PaymentCriteria value)
	{
		PAYMENTCRITERIAHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to paymentCriteria. 
	 * @param value the item to add to paymentCriteria
	 */
	public void addToPaymentCriteria(final PaymentCriteria value)
	{
		addToPaymentCriteria( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from paymentCriteria. 
	 * @param value the item to remove from paymentCriteria
	 */
	public void removeFromPaymentCriteria(final SessionContext ctx, final PaymentCriteria value)
	{
		PAYMENTCRITERIAHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from paymentCriteria. 
	 * @param value the item to remove from paymentCriteria
	 */
	public void removeFromPaymentCriteria(final PaymentCriteria value)
	{
		removeFromPaymentCriteria( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TriggerEvent.quotationCriteria</code> attribute.
	 * @return the quotationCriteria
	 */
	public Collection<QuotationCriteria> getQuotationCriteria(final SessionContext ctx)
	{
		return QUOTATIONCRITERIAHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TriggerEvent.quotationCriteria</code> attribute.
	 * @return the quotationCriteria
	 */
	public Collection<QuotationCriteria> getQuotationCriteria()
	{
		return getQuotationCriteria( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TriggerEvent.quotationCriteria</code> attribute. 
	 * @param value the quotationCriteria
	 */
	public void setQuotationCriteria(final SessionContext ctx, final Collection<QuotationCriteria> value)
	{
		QUOTATIONCRITERIAHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TriggerEvent.quotationCriteria</code> attribute. 
	 * @param value the quotationCriteria
	 */
	public void setQuotationCriteria(final Collection<QuotationCriteria> value)
	{
		setQuotationCriteria( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to quotationCriteria. 
	 * @param value the item to add to quotationCriteria
	 */
	public void addToQuotationCriteria(final SessionContext ctx, final QuotationCriteria value)
	{
		QUOTATIONCRITERIAHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to quotationCriteria. 
	 * @param value the item to add to quotationCriteria
	 */
	public void addToQuotationCriteria(final QuotationCriteria value)
	{
		addToQuotationCriteria( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from quotationCriteria. 
	 * @param value the item to remove from quotationCriteria
	 */
	public void removeFromQuotationCriteria(final SessionContext ctx, final QuotationCriteria value)
	{
		QUOTATIONCRITERIAHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from quotationCriteria. 
	 * @param value the item to remove from quotationCriteria
	 */
	public void removeFromQuotationCriteria(final QuotationCriteria value)
	{
		removeFromQuotationCriteria( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TriggerEvent.timeLimitBooking</code> attribute.
	 * @return the timeLimitBooking
	 */
	public Boolean isTimeLimitBooking(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, TIMELIMITBOOKING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TriggerEvent.timeLimitBooking</code> attribute.
	 * @return the timeLimitBooking
	 */
	public Boolean isTimeLimitBooking()
	{
		return isTimeLimitBooking( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TriggerEvent.timeLimitBooking</code> attribute. 
	 * @return the timeLimitBooking
	 */
	public boolean isTimeLimitBookingAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isTimeLimitBooking( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TriggerEvent.timeLimitBooking</code> attribute. 
	 * @return the timeLimitBooking
	 */
	public boolean isTimeLimitBookingAsPrimitive()
	{
		return isTimeLimitBookingAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TriggerEvent.timeLimitBooking</code> attribute. 
	 * @param value the timeLimitBooking
	 */
	public void setTimeLimitBooking(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, TIMELIMITBOOKING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TriggerEvent.timeLimitBooking</code> attribute. 
	 * @param value the timeLimitBooking
	 */
	public void setTimeLimitBooking(final Boolean value)
	{
		setTimeLimitBooking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TriggerEvent.timeLimitBooking</code> attribute. 
	 * @param value the timeLimitBooking
	 */
	public void setTimeLimitBooking(final SessionContext ctx, final boolean value)
	{
		setTimeLimitBooking( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TriggerEvent.timeLimitBooking</code> attribute. 
	 * @param value the timeLimitBooking
	 */
	public void setTimeLimitBooking(final boolean value)
	{
		setTimeLimitBooking( getSession().getSessionContext(), value );
	}
	
}
