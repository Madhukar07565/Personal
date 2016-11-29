/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo.receipts;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.core.jalo.receipts.ReceiptDetails ReceiptDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedReceiptDetails extends GenericItem
{
	/** Qualifier of the <code>ReceiptDetails.invoiceID</code> attribute **/
	public static final String INVOICEID = "invoiceID";
	/** Qualifier of the <code>ReceiptDetails.receiptId</code> attribute **/
	public static final String RECEIPTID = "receiptId";
	/** Qualifier of the <code>ReceiptDetails.appliedCost</code> attribute **/
	public static final String APPLIEDCOST = "appliedCost";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(INVOICEID, AttributeMode.INITIAL);
		tmp.put(RECEIPTID, AttributeMode.INITIAL);
		tmp.put(APPLIEDCOST, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReceiptDetails.appliedCost</code> attribute.
	 * @return the appliedCost - applied cost
	 */
	public Double getAppliedCost(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, APPLIEDCOST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReceiptDetails.appliedCost</code> attribute.
	 * @return the appliedCost - applied cost
	 */
	public Double getAppliedCost()
	{
		return getAppliedCost( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReceiptDetails.appliedCost</code> attribute. 
	 * @return the appliedCost - applied cost
	 */
	public double getAppliedCostAsPrimitive(final SessionContext ctx)
	{
		Double value = getAppliedCost( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReceiptDetails.appliedCost</code> attribute. 
	 * @return the appliedCost - applied cost
	 */
	public double getAppliedCostAsPrimitive()
	{
		return getAppliedCostAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReceiptDetails.appliedCost</code> attribute. 
	 * @param value the appliedCost - applied cost
	 */
	public void setAppliedCost(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, APPLIEDCOST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReceiptDetails.appliedCost</code> attribute. 
	 * @param value the appliedCost - applied cost
	 */
	public void setAppliedCost(final Double value)
	{
		setAppliedCost( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReceiptDetails.appliedCost</code> attribute. 
	 * @param value the appliedCost - applied cost
	 */
	public void setAppliedCost(final SessionContext ctx, final double value)
	{
		setAppliedCost( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReceiptDetails.appliedCost</code> attribute. 
	 * @param value the appliedCost - applied cost
	 */
	public void setAppliedCost(final double value)
	{
		setAppliedCost( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReceiptDetails.invoiceID</code> attribute.
	 * @return the invoiceID - Invoice on which receipt is applied
	 */
	public String getInvoiceID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INVOICEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReceiptDetails.invoiceID</code> attribute.
	 * @return the invoiceID - Invoice on which receipt is applied
	 */
	public String getInvoiceID()
	{
		return getInvoiceID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReceiptDetails.invoiceID</code> attribute. 
	 * @param value the invoiceID - Invoice on which receipt is applied
	 */
	public void setInvoiceID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INVOICEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReceiptDetails.invoiceID</code> attribute. 
	 * @param value the invoiceID - Invoice on which receipt is applied
	 */
	public void setInvoiceID(final String value)
	{
		setInvoiceID( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReceiptDetails.receiptId</code> attribute.
	 * @return the receiptId - Receipt Applied
	 */
	public String getReceiptId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RECEIPTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReceiptDetails.receiptId</code> attribute.
	 * @return the receiptId - Receipt Applied
	 */
	public String getReceiptId()
	{
		return getReceiptId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReceiptDetails.receiptId</code> attribute. 
	 * @param value the receiptId - Receipt Applied
	 */
	public void setReceiptId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RECEIPTID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReceiptDetails.receiptId</code> attribute. 
	 * @param value the receiptId - Receipt Applied
	 */
	public void setReceiptId(final String value)
	{
		setReceiptId( getSession().getSessionContext(), value );
	}
	
}
