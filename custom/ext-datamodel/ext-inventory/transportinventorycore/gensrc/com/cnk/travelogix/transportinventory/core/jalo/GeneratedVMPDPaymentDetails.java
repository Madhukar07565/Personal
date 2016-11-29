/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transportinventory.core.jalo;

import com.cnk.travelogix.masterdata.core.paymentinfo.jalo.AbstractPaymentDetail;
import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.transportinventory.core.jalo.VMPDPaymentDetails VMPDPaymentDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedVMPDPaymentDetails extends AbstractPaymentDetail
{
	/** Qualifier of the <code>VMPDPaymentDetails.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>VMPDPaymentDetails.vmpdNumber</code> attribute **/
	public static final String VMPDNUMBER = "vmpdNumber";
	/** Qualifier of the <code>VMPDPaymentDetails.vmpdGenerationDate</code> attribute **/
	public static final String VMPDGENERATIONDATE = "vmpdGenerationDate";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractPaymentDetail.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(VMPDNUMBER, AttributeMode.INITIAL);
		tmp.put(VMPDGENERATIONDATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VMPDPaymentDetails.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VMPDPaymentDetails.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VMPDPaymentDetails.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VMPDPaymentDetails.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VMPDPaymentDetails.vmpdGenerationDate</code> attribute.
	 * @return the vmpdGenerationDate
	 */
	public Date getVmpdGenerationDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VMPDGENERATIONDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VMPDPaymentDetails.vmpdGenerationDate</code> attribute.
	 * @return the vmpdGenerationDate
	 */
	public Date getVmpdGenerationDate()
	{
		return getVmpdGenerationDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VMPDPaymentDetails.vmpdGenerationDate</code> attribute. 
	 * @param value the vmpdGenerationDate
	 */
	public void setVmpdGenerationDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VMPDGENERATIONDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VMPDPaymentDetails.vmpdGenerationDate</code> attribute. 
	 * @param value the vmpdGenerationDate
	 */
	public void setVmpdGenerationDate(final Date value)
	{
		setVmpdGenerationDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VMPDPaymentDetails.vmpdNumber</code> attribute.
	 * @return the vmpdNumber
	 */
	public String getVmpdNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VMPDNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VMPDPaymentDetails.vmpdNumber</code> attribute.
	 * @return the vmpdNumber
	 */
	public String getVmpdNumber()
	{
		return getVmpdNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VMPDPaymentDetails.vmpdNumber</code> attribute. 
	 * @param value the vmpdNumber
	 */
	public void setVmpdNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VMPDNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VMPDPaymentDetails.vmpdNumber</code> attribute. 
	 * @param value the vmpdNumber
	 */
	public void setVmpdNumber(final String value)
	{
		setVmpdNumber( getSession().getSessionContext(), value );
	}
	
}
