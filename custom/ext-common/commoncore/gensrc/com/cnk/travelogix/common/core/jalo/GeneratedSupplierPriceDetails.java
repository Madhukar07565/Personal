/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem SupplierPriceDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierPriceDetails extends GenericItem
{
	/** Qualifier of the <code>SupplierPriceDetails.netPayableToSupplier</code> attribute **/
	public static final String NETPAYABLETOSUPPLIER = "netPayableToSupplier";
	/** Qualifier of the <code>SupplierPriceDetails.supplierCancellationCharges</code> attribute **/
	public static final String SUPPLIERCANCELLATIONCHARGES = "supplierCancellationCharges";
	/** Qualifier of the <code>SupplierPriceDetails.supplierAmendmentCharges</code> attribute **/
	public static final String SUPPLIERAMENDMENTCHARGES = "supplierAmendmentCharges";
	/** Qualifier of the <code>SupplierPriceDetails.totalNetPayableToSupplier</code> attribute **/
	public static final String TOTALNETPAYABLETOSUPPLIER = "totalNetPayableToSupplier";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NETPAYABLETOSUPPLIER, AttributeMode.INITIAL);
		tmp.put(SUPPLIERCANCELLATIONCHARGES, AttributeMode.INITIAL);
		tmp.put(SUPPLIERAMENDMENTCHARGES, AttributeMode.INITIAL);
		tmp.put(TOTALNETPAYABLETOSUPPLIER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierPriceDetails.netPayableToSupplier</code> attribute.
	 * @return the netPayableToSupplier - Net Payable To Supplier
	 */
	public Double getNetPayableToSupplier(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, NETPAYABLETOSUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierPriceDetails.netPayableToSupplier</code> attribute.
	 * @return the netPayableToSupplier - Net Payable To Supplier
	 */
	public Double getNetPayableToSupplier()
	{
		return getNetPayableToSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierPriceDetails.netPayableToSupplier</code> attribute. 
	 * @return the netPayableToSupplier - Net Payable To Supplier
	 */
	public double getNetPayableToSupplierAsPrimitive(final SessionContext ctx)
	{
		Double value = getNetPayableToSupplier( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierPriceDetails.netPayableToSupplier</code> attribute. 
	 * @return the netPayableToSupplier - Net Payable To Supplier
	 */
	public double getNetPayableToSupplierAsPrimitive()
	{
		return getNetPayableToSupplierAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierPriceDetails.netPayableToSupplier</code> attribute. 
	 * @param value the netPayableToSupplier - Net Payable To Supplier
	 */
	public void setNetPayableToSupplier(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, NETPAYABLETOSUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierPriceDetails.netPayableToSupplier</code> attribute. 
	 * @param value the netPayableToSupplier - Net Payable To Supplier
	 */
	public void setNetPayableToSupplier(final Double value)
	{
		setNetPayableToSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierPriceDetails.netPayableToSupplier</code> attribute. 
	 * @param value the netPayableToSupplier - Net Payable To Supplier
	 */
	public void setNetPayableToSupplier(final SessionContext ctx, final double value)
	{
		setNetPayableToSupplier( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierPriceDetails.netPayableToSupplier</code> attribute. 
	 * @param value the netPayableToSupplier - Net Payable To Supplier
	 */
	public void setNetPayableToSupplier(final double value)
	{
		setNetPayableToSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierPriceDetails.supplierAmendmentCharges</code> attribute.
	 * @return the supplierAmendmentCharges - Supplier Amendment Charges
	 */
	public Double getSupplierAmendmentCharges(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, SUPPLIERAMENDMENTCHARGES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierPriceDetails.supplierAmendmentCharges</code> attribute.
	 * @return the supplierAmendmentCharges - Supplier Amendment Charges
	 */
	public Double getSupplierAmendmentCharges()
	{
		return getSupplierAmendmentCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierPriceDetails.supplierAmendmentCharges</code> attribute. 
	 * @return the supplierAmendmentCharges - Supplier Amendment Charges
	 */
	public double getSupplierAmendmentChargesAsPrimitive(final SessionContext ctx)
	{
		Double value = getSupplierAmendmentCharges( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierPriceDetails.supplierAmendmentCharges</code> attribute. 
	 * @return the supplierAmendmentCharges - Supplier Amendment Charges
	 */
	public double getSupplierAmendmentChargesAsPrimitive()
	{
		return getSupplierAmendmentChargesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierPriceDetails.supplierAmendmentCharges</code> attribute. 
	 * @param value the supplierAmendmentCharges - Supplier Amendment Charges
	 */
	public void setSupplierAmendmentCharges(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, SUPPLIERAMENDMENTCHARGES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierPriceDetails.supplierAmendmentCharges</code> attribute. 
	 * @param value the supplierAmendmentCharges - Supplier Amendment Charges
	 */
	public void setSupplierAmendmentCharges(final Double value)
	{
		setSupplierAmendmentCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierPriceDetails.supplierAmendmentCharges</code> attribute. 
	 * @param value the supplierAmendmentCharges - Supplier Amendment Charges
	 */
	public void setSupplierAmendmentCharges(final SessionContext ctx, final double value)
	{
		setSupplierAmendmentCharges( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierPriceDetails.supplierAmendmentCharges</code> attribute. 
	 * @param value the supplierAmendmentCharges - Supplier Amendment Charges
	 */
	public void setSupplierAmendmentCharges(final double value)
	{
		setSupplierAmendmentCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierPriceDetails.supplierCancellationCharges</code> attribute.
	 * @return the supplierCancellationCharges - Supplier Cancellation Charges
	 */
	public Double getSupplierCancellationCharges(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, SUPPLIERCANCELLATIONCHARGES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierPriceDetails.supplierCancellationCharges</code> attribute.
	 * @return the supplierCancellationCharges - Supplier Cancellation Charges
	 */
	public Double getSupplierCancellationCharges()
	{
		return getSupplierCancellationCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierPriceDetails.supplierCancellationCharges</code> attribute. 
	 * @return the supplierCancellationCharges - Supplier Cancellation Charges
	 */
	public double getSupplierCancellationChargesAsPrimitive(final SessionContext ctx)
	{
		Double value = getSupplierCancellationCharges( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierPriceDetails.supplierCancellationCharges</code> attribute. 
	 * @return the supplierCancellationCharges - Supplier Cancellation Charges
	 */
	public double getSupplierCancellationChargesAsPrimitive()
	{
		return getSupplierCancellationChargesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierPriceDetails.supplierCancellationCharges</code> attribute. 
	 * @param value the supplierCancellationCharges - Supplier Cancellation Charges
	 */
	public void setSupplierCancellationCharges(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, SUPPLIERCANCELLATIONCHARGES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierPriceDetails.supplierCancellationCharges</code> attribute. 
	 * @param value the supplierCancellationCharges - Supplier Cancellation Charges
	 */
	public void setSupplierCancellationCharges(final Double value)
	{
		setSupplierCancellationCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierPriceDetails.supplierCancellationCharges</code> attribute. 
	 * @param value the supplierCancellationCharges - Supplier Cancellation Charges
	 */
	public void setSupplierCancellationCharges(final SessionContext ctx, final double value)
	{
		setSupplierCancellationCharges( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierPriceDetails.supplierCancellationCharges</code> attribute. 
	 * @param value the supplierCancellationCharges - Supplier Cancellation Charges
	 */
	public void setSupplierCancellationCharges(final double value)
	{
		setSupplierCancellationCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierPriceDetails.totalNetPayableToSupplier</code> attribute.
	 * @return the totalNetPayableToSupplier - Total Net Payable To Supplier
	 */
	public Double getTotalNetPayableToSupplier(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TOTALNETPAYABLETOSUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierPriceDetails.totalNetPayableToSupplier</code> attribute.
	 * @return the totalNetPayableToSupplier - Total Net Payable To Supplier
	 */
	public Double getTotalNetPayableToSupplier()
	{
		return getTotalNetPayableToSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierPriceDetails.totalNetPayableToSupplier</code> attribute. 
	 * @return the totalNetPayableToSupplier - Total Net Payable To Supplier
	 */
	public double getTotalNetPayableToSupplierAsPrimitive(final SessionContext ctx)
	{
		Double value = getTotalNetPayableToSupplier( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierPriceDetails.totalNetPayableToSupplier</code> attribute. 
	 * @return the totalNetPayableToSupplier - Total Net Payable To Supplier
	 */
	public double getTotalNetPayableToSupplierAsPrimitive()
	{
		return getTotalNetPayableToSupplierAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierPriceDetails.totalNetPayableToSupplier</code> attribute. 
	 * @param value the totalNetPayableToSupplier - Total Net Payable To Supplier
	 */
	public void setTotalNetPayableToSupplier(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TOTALNETPAYABLETOSUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierPriceDetails.totalNetPayableToSupplier</code> attribute. 
	 * @param value the totalNetPayableToSupplier - Total Net Payable To Supplier
	 */
	public void setTotalNetPayableToSupplier(final Double value)
	{
		setTotalNetPayableToSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierPriceDetails.totalNetPayableToSupplier</code> attribute. 
	 * @param value the totalNetPayableToSupplier - Total Net Payable To Supplier
	 */
	public void setTotalNetPayableToSupplier(final SessionContext ctx, final double value)
	{
		setTotalNetPayableToSupplier( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierPriceDetails.totalNetPayableToSupplier</code> attribute. 
	 * @param value the totalNetPayableToSupplier - Total Net Payable To Supplier
	 */
	public void setTotalNetPayableToSupplier(final double value)
	{
		setTotalNetPayableToSupplier( getSession().getSessionContext(), value );
	}
	
}
