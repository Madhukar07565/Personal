/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.masterdata.core.paymentinfo.jalo;

import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.financials.jalo.Bank;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.masterdata.core.paymentinfo.jalo.AbstractPaymentDetail AbstractPaymentDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractPaymentDetail extends GenericItem
{
	/** Qualifier of the <code>AbstractPaymentDetail.drawnOn</code> attribute **/
	public static final String DRAWNON = "drawnOn";
	/** Qualifier of the <code>AbstractPaymentDetail.amount</code> attribute **/
	public static final String AMOUNT = "amount";
	/** Qualifier of the <code>AbstractPaymentDetail.remarks</code> attribute **/
	public static final String REMARKS = "remarks";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DRAWNON, AttributeMode.INITIAL);
		tmp.put(AMOUNT, AttributeMode.INITIAL);
		tmp.put(REMARKS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPaymentDetail.amount</code> attribute.
	 * @return the amount
	 */
	public BigDecimal getAmount(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, AMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPaymentDetail.amount</code> attribute.
	 * @return the amount
	 */
	public BigDecimal getAmount()
	{
		return getAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractPaymentDetail.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, AMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractPaymentDetail.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final BigDecimal value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPaymentDetail.drawnOn</code> attribute.
	 * @return the drawnOn
	 */
	public Bank getDrawnOn(final SessionContext ctx)
	{
		return (Bank)getProperty( ctx, DRAWNON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPaymentDetail.drawnOn</code> attribute.
	 * @return the drawnOn
	 */
	public Bank getDrawnOn()
	{
		return getDrawnOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractPaymentDetail.drawnOn</code> attribute. 
	 * @param value the drawnOn
	 */
	public void setDrawnOn(final SessionContext ctx, final Bank value)
	{
		setProperty(ctx, DRAWNON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractPaymentDetail.drawnOn</code> attribute. 
	 * @param value the drawnOn
	 */
	public void setDrawnOn(final Bank value)
	{
		setDrawnOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPaymentDetail.remarks</code> attribute.
	 * @return the remarks
	 */
	public String getRemarks(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REMARKS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPaymentDetail.remarks</code> attribute.
	 * @return the remarks
	 */
	public String getRemarks()
	{
		return getRemarks( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractPaymentDetail.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setRemarks(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REMARKS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractPaymentDetail.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setRemarks(final String value)
	{
		setRemarks( getSession().getSessionContext(), value );
	}
	
}
