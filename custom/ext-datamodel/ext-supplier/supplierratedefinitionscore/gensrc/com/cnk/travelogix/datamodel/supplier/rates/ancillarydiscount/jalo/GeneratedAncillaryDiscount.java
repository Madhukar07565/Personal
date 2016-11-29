/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.ancillarydiscount.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.ancillarydiscount.jalo.AncillaryDiscount AncillaryDiscount}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAncillaryDiscount extends AbstractTravelogixSupplierOffer
{
	/** Qualifier of the <code>AncillaryDiscount.bookingCount</code> attribute **/
	public static final String BOOKINGCOUNT = "bookingCount";
	/** Qualifier of the <code>AncillaryDiscount.discountedBooking</code> attribute **/
	public static final String DISCOUNTEDBOOKING = "discountedBooking";
	/** Qualifier of the <code>AncillaryDiscount.appliedOnAll</code> attribute **/
	public static final String APPLIEDONALL = "appliedOnAll";
	/** Qualifier of the <code>AncillaryDiscount.ancillaryComponentType</code> attribute **/
	public static final String ANCILLARYCOMPONENTTYPE = "ancillaryComponentType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixSupplierOffer.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(BOOKINGCOUNT, AttributeMode.INITIAL);
		tmp.put(DISCOUNTEDBOOKING, AttributeMode.INITIAL);
		tmp.put(APPLIEDONALL, AttributeMode.INITIAL);
		tmp.put(ANCILLARYCOMPONENTTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryDiscount.ancillaryComponentType</code> attribute.
	 * @return the ancillaryComponentType
	 */
	public EnumerationValue getAncillaryComponentType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ANCILLARYCOMPONENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryDiscount.ancillaryComponentType</code> attribute.
	 * @return the ancillaryComponentType
	 */
	public EnumerationValue getAncillaryComponentType()
	{
		return getAncillaryComponentType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryDiscount.ancillaryComponentType</code> attribute. 
	 * @param value the ancillaryComponentType
	 */
	public void setAncillaryComponentType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ANCILLARYCOMPONENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryDiscount.ancillaryComponentType</code> attribute. 
	 * @param value the ancillaryComponentType
	 */
	public void setAncillaryComponentType(final EnumerationValue value)
	{
		setAncillaryComponentType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryDiscount.appliedOnAll</code> attribute.
	 * @return the appliedOnAll
	 */
	public Boolean isAppliedOnAll(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, APPLIEDONALL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryDiscount.appliedOnAll</code> attribute.
	 * @return the appliedOnAll
	 */
	public Boolean isAppliedOnAll()
	{
		return isAppliedOnAll( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryDiscount.appliedOnAll</code> attribute. 
	 * @return the appliedOnAll
	 */
	public boolean isAppliedOnAllAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAppliedOnAll( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryDiscount.appliedOnAll</code> attribute. 
	 * @return the appliedOnAll
	 */
	public boolean isAppliedOnAllAsPrimitive()
	{
		return isAppliedOnAllAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryDiscount.appliedOnAll</code> attribute. 
	 * @param value the appliedOnAll
	 */
	public void setAppliedOnAll(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, APPLIEDONALL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryDiscount.appliedOnAll</code> attribute. 
	 * @param value the appliedOnAll
	 */
	public void setAppliedOnAll(final Boolean value)
	{
		setAppliedOnAll( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryDiscount.appliedOnAll</code> attribute. 
	 * @param value the appliedOnAll
	 */
	public void setAppliedOnAll(final SessionContext ctx, final boolean value)
	{
		setAppliedOnAll( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryDiscount.appliedOnAll</code> attribute. 
	 * @param value the appliedOnAll
	 */
	public void setAppliedOnAll(final boolean value)
	{
		setAppliedOnAll( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryDiscount.bookingCount</code> attribute.
	 * @return the bookingCount
	 */
	public Integer getBookingCount(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, BOOKINGCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryDiscount.bookingCount</code> attribute.
	 * @return the bookingCount
	 */
	public Integer getBookingCount()
	{
		return getBookingCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryDiscount.bookingCount</code> attribute. 
	 * @return the bookingCount
	 */
	public int getBookingCountAsPrimitive(final SessionContext ctx)
	{
		Integer value = getBookingCount( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryDiscount.bookingCount</code> attribute. 
	 * @return the bookingCount
	 */
	public int getBookingCountAsPrimitive()
	{
		return getBookingCountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryDiscount.bookingCount</code> attribute. 
	 * @param value the bookingCount
	 */
	public void setBookingCount(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, BOOKINGCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryDiscount.bookingCount</code> attribute. 
	 * @param value the bookingCount
	 */
	public void setBookingCount(final Integer value)
	{
		setBookingCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryDiscount.bookingCount</code> attribute. 
	 * @param value the bookingCount
	 */
	public void setBookingCount(final SessionContext ctx, final int value)
	{
		setBookingCount( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryDiscount.bookingCount</code> attribute. 
	 * @param value the bookingCount
	 */
	public void setBookingCount(final int value)
	{
		setBookingCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryDiscount.discountedBooking</code> attribute.
	 * @return the discountedBooking
	 */
	public Integer getDiscountedBooking(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DISCOUNTEDBOOKING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryDiscount.discountedBooking</code> attribute.
	 * @return the discountedBooking
	 */
	public Integer getDiscountedBooking()
	{
		return getDiscountedBooking( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryDiscount.discountedBooking</code> attribute. 
	 * @return the discountedBooking
	 */
	public int getDiscountedBookingAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDiscountedBooking( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryDiscount.discountedBooking</code> attribute. 
	 * @return the discountedBooking
	 */
	public int getDiscountedBookingAsPrimitive()
	{
		return getDiscountedBookingAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryDiscount.discountedBooking</code> attribute. 
	 * @param value the discountedBooking
	 */
	public void setDiscountedBooking(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DISCOUNTEDBOOKING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryDiscount.discountedBooking</code> attribute. 
	 * @param value the discountedBooking
	 */
	public void setDiscountedBooking(final Integer value)
	{
		setDiscountedBooking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryDiscount.discountedBooking</code> attribute. 
	 * @param value the discountedBooking
	 */
	public void setDiscountedBooking(final SessionContext ctx, final int value)
	{
		setDiscountedBooking( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryDiscount.discountedBooking</code> attribute. 
	 * @param value the discountedBooking
	 */
	public void setDiscountedBooking(final int value)
	{
		setDiscountedBooking( getSession().getSessionContext(), value );
	}
	
}
