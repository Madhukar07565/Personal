/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transportinventory.core.jalo;

import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transportinventory.core.jalo.AirCoupon;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.transportinventory.core.jalo.ECoupon ECoupon}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedECoupon extends AirCoupon
{
	/** Qualifier of the <code>ECoupon.issueDate</code> attribute **/
	public static final String ISSUEDATE = "issueDate";
	/** Qualifier of the <code>ECoupon.notValidAfter</code> attribute **/
	public static final String NOTVALIDAFTER = "notValidAfter";
	/** Qualifier of the <code>ECoupon.couponNumberFrom</code> attribute **/
	public static final String COUPONNUMBERFROM = "couponNumberFrom";
	/** Qualifier of the <code>ECoupon.couponNumberTo</code> attribute **/
	public static final String COUPONNUMBERTO = "couponNumberTo";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AirCoupon.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ISSUEDATE, AttributeMode.INITIAL);
		tmp.put(NOTVALIDAFTER, AttributeMode.INITIAL);
		tmp.put(COUPONNUMBERFROM, AttributeMode.INITIAL);
		tmp.put(COUPONNUMBERTO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECoupon.couponNumberFrom</code> attribute.
	 * @return the couponNumberFrom
	 */
	public BigDecimal getCouponNumberFrom(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, COUPONNUMBERFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECoupon.couponNumberFrom</code> attribute.
	 * @return the couponNumberFrom
	 */
	public BigDecimal getCouponNumberFrom()
	{
		return getCouponNumberFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECoupon.couponNumberFrom</code> attribute. 
	 * @param value the couponNumberFrom
	 */
	public void setCouponNumberFrom(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, COUPONNUMBERFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECoupon.couponNumberFrom</code> attribute. 
	 * @param value the couponNumberFrom
	 */
	public void setCouponNumberFrom(final BigDecimal value)
	{
		setCouponNumberFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECoupon.couponNumberTo</code> attribute.
	 * @return the couponNumberTo
	 */
	public BigDecimal getCouponNumberTo(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, COUPONNUMBERTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECoupon.couponNumberTo</code> attribute.
	 * @return the couponNumberTo
	 */
	public BigDecimal getCouponNumberTo()
	{
		return getCouponNumberTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECoupon.couponNumberTo</code> attribute. 
	 * @param value the couponNumberTo
	 */
	public void setCouponNumberTo(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, COUPONNUMBERTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECoupon.couponNumberTo</code> attribute. 
	 * @param value the couponNumberTo
	 */
	public void setCouponNumberTo(final BigDecimal value)
	{
		setCouponNumberTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECoupon.issueDate</code> attribute.
	 * @return the issueDate
	 */
	public Date getIssueDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ISSUEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECoupon.issueDate</code> attribute.
	 * @return the issueDate
	 */
	public Date getIssueDate()
	{
		return getIssueDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECoupon.issueDate</code> attribute. 
	 * @param value the issueDate
	 */
	public void setIssueDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ISSUEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECoupon.issueDate</code> attribute. 
	 * @param value the issueDate
	 */
	public void setIssueDate(final Date value)
	{
		setIssueDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECoupon.notValidAfter</code> attribute.
	 * @return the notValidAfter
	 */
	public Date getNotValidAfter(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, NOTVALIDAFTER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECoupon.notValidAfter</code> attribute.
	 * @return the notValidAfter
	 */
	public Date getNotValidAfter()
	{
		return getNotValidAfter( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECoupon.notValidAfter</code> attribute. 
	 * @param value the notValidAfter
	 */
	public void setNotValidAfter(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, NOTVALIDAFTER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECoupon.notValidAfter</code> attribute. 
	 * @param value the notValidAfter
	 */
	public void setNotValidAfter(final Date value)
	{
		setNotValidAfter( getSession().getSessionContext(), value );
	}
	
}
