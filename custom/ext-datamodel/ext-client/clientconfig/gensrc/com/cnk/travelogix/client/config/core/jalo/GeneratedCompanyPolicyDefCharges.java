/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.jalo.PolicyFixedCharges;
import com.cnk.travelogix.client.config.core.jalo.RetainCompanyCommercials;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.CompanyPolicyDefCharges CompanyPolicyDefCharges}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCompanyPolicyDefCharges extends GenericItem
{
	/** Qualifier of the <code>CompanyPolicyDefCharges.refundable</code> attribute **/
	public static final String REFUNDABLE = "refundable";
	/** Qualifier of the <code>CompanyPolicyDefCharges.supplierChargeswithFixedCharges</code> attribute **/
	public static final String SUPPLIERCHARGESWITHFIXEDCHARGES = "supplierChargeswithFixedCharges";
	/** Qualifier of the <code>CompanyPolicyDefCharges.supplierChargewithRetainCompanyCommercials</code> attribute **/
	public static final String SUPPLIERCHARGEWITHRETAINCOMPANYCOMMERCIALS = "supplierChargewithRetainCompanyCommercials";
	/** Qualifier of the <code>CompanyPolicyDefCharges.companySpecificCharges</code> attribute **/
	public static final String COMPANYSPECIFICCHARGES = "companySpecificCharges";
	/** Qualifier of the <code>CompanyPolicyDefCharges.fixedChargesDetails</code> attribute **/
	public static final String FIXEDCHARGESDETAILS = "fixedChargesDetails";
	/** Qualifier of the <code>CompanyPolicyDefCharges.retainCompanyCommercials</code> attribute **/
	public static final String RETAINCOMPANYCOMMERCIALS = "retainCompanyCommercials";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(REFUNDABLE, AttributeMode.INITIAL);
		tmp.put(SUPPLIERCHARGESWITHFIXEDCHARGES, AttributeMode.INITIAL);
		tmp.put(SUPPLIERCHARGEWITHRETAINCOMPANYCOMMERCIALS, AttributeMode.INITIAL);
		tmp.put(COMPANYSPECIFICCHARGES, AttributeMode.INITIAL);
		tmp.put(FIXEDCHARGESDETAILS, AttributeMode.INITIAL);
		tmp.put(RETAINCOMPANYCOMMERCIALS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefCharges.companySpecificCharges</code> attribute.
	 * @return the companySpecificCharges - Company Specific Charges
	 */
	public Boolean isCompanySpecificCharges(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, COMPANYSPECIFICCHARGES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefCharges.companySpecificCharges</code> attribute.
	 * @return the companySpecificCharges - Company Specific Charges
	 */
	public Boolean isCompanySpecificCharges()
	{
		return isCompanySpecificCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefCharges.companySpecificCharges</code> attribute. 
	 * @return the companySpecificCharges - Company Specific Charges
	 */
	public boolean isCompanySpecificChargesAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isCompanySpecificCharges( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefCharges.companySpecificCharges</code> attribute. 
	 * @return the companySpecificCharges - Company Specific Charges
	 */
	public boolean isCompanySpecificChargesAsPrimitive()
	{
		return isCompanySpecificChargesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefCharges.companySpecificCharges</code> attribute. 
	 * @param value the companySpecificCharges - Company Specific Charges
	 */
	public void setCompanySpecificCharges(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, COMPANYSPECIFICCHARGES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefCharges.companySpecificCharges</code> attribute. 
	 * @param value the companySpecificCharges - Company Specific Charges
	 */
	public void setCompanySpecificCharges(final Boolean value)
	{
		setCompanySpecificCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefCharges.companySpecificCharges</code> attribute. 
	 * @param value the companySpecificCharges - Company Specific Charges
	 */
	public void setCompanySpecificCharges(final SessionContext ctx, final boolean value)
	{
		setCompanySpecificCharges( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefCharges.companySpecificCharges</code> attribute. 
	 * @param value the companySpecificCharges - Company Specific Charges
	 */
	public void setCompanySpecificCharges(final boolean value)
	{
		setCompanySpecificCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefCharges.fixedChargesDetails</code> attribute.
	 * @return the fixedChargesDetails - Company Fixed Charges Details
	 */
	public PolicyFixedCharges getFixedChargesDetails(final SessionContext ctx)
	{
		return (PolicyFixedCharges)getProperty( ctx, FIXEDCHARGESDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefCharges.fixedChargesDetails</code> attribute.
	 * @return the fixedChargesDetails - Company Fixed Charges Details
	 */
	public PolicyFixedCharges getFixedChargesDetails()
	{
		return getFixedChargesDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefCharges.fixedChargesDetails</code> attribute. 
	 * @param value the fixedChargesDetails - Company Fixed Charges Details
	 */
	public void setFixedChargesDetails(final SessionContext ctx, final PolicyFixedCharges value)
	{
		setProperty(ctx, FIXEDCHARGESDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefCharges.fixedChargesDetails</code> attribute. 
	 * @param value the fixedChargesDetails - Company Fixed Charges Details
	 */
	public void setFixedChargesDetails(final PolicyFixedCharges value)
	{
		setFixedChargesDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefCharges.refundable</code> attribute.
	 * @return the refundable - Company Policy Def
	 */
	public Boolean isRefundable(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, REFUNDABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefCharges.refundable</code> attribute.
	 * @return the refundable - Company Policy Def
	 */
	public Boolean isRefundable()
	{
		return isRefundable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefCharges.refundable</code> attribute. 
	 * @return the refundable - Company Policy Def
	 */
	public boolean isRefundableAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isRefundable( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefCharges.refundable</code> attribute. 
	 * @return the refundable - Company Policy Def
	 */
	public boolean isRefundableAsPrimitive()
	{
		return isRefundableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefCharges.refundable</code> attribute. 
	 * @param value the refundable - Company Policy Def
	 */
	public void setRefundable(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, REFUNDABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefCharges.refundable</code> attribute. 
	 * @param value the refundable - Company Policy Def
	 */
	public void setRefundable(final Boolean value)
	{
		setRefundable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefCharges.refundable</code> attribute. 
	 * @param value the refundable - Company Policy Def
	 */
	public void setRefundable(final SessionContext ctx, final boolean value)
	{
		setRefundable( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefCharges.refundable</code> attribute. 
	 * @param value the refundable - Company Policy Def
	 */
	public void setRefundable(final boolean value)
	{
		setRefundable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefCharges.retainCompanyCommercials</code> attribute.
	 * @return the retainCompanyCommercials - Company Retain Company Commercials
	 */
	public RetainCompanyCommercials getRetainCompanyCommercials(final SessionContext ctx)
	{
		return (RetainCompanyCommercials)getProperty( ctx, RETAINCOMPANYCOMMERCIALS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefCharges.retainCompanyCommercials</code> attribute.
	 * @return the retainCompanyCommercials - Company Retain Company Commercials
	 */
	public RetainCompanyCommercials getRetainCompanyCommercials()
	{
		return getRetainCompanyCommercials( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefCharges.retainCompanyCommercials</code> attribute. 
	 * @param value the retainCompanyCommercials - Company Retain Company Commercials
	 */
	public void setRetainCompanyCommercials(final SessionContext ctx, final RetainCompanyCommercials value)
	{
		setProperty(ctx, RETAINCOMPANYCOMMERCIALS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefCharges.retainCompanyCommercials</code> attribute. 
	 * @param value the retainCompanyCommercials - Company Retain Company Commercials
	 */
	public void setRetainCompanyCommercials(final RetainCompanyCommercials value)
	{
		setRetainCompanyCommercials( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefCharges.supplierChargeswithFixedCharges</code> attribute.
	 * @return the supplierChargeswithFixedCharges - Supplier Charges with Fixed Charges
	 */
	public Boolean isSupplierChargeswithFixedCharges(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SUPPLIERCHARGESWITHFIXEDCHARGES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefCharges.supplierChargeswithFixedCharges</code> attribute.
	 * @return the supplierChargeswithFixedCharges - Supplier Charges with Fixed Charges
	 */
	public Boolean isSupplierChargeswithFixedCharges()
	{
		return isSupplierChargeswithFixedCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefCharges.supplierChargeswithFixedCharges</code> attribute. 
	 * @return the supplierChargeswithFixedCharges - Supplier Charges with Fixed Charges
	 */
	public boolean isSupplierChargeswithFixedChargesAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSupplierChargeswithFixedCharges( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefCharges.supplierChargeswithFixedCharges</code> attribute. 
	 * @return the supplierChargeswithFixedCharges - Supplier Charges with Fixed Charges
	 */
	public boolean isSupplierChargeswithFixedChargesAsPrimitive()
	{
		return isSupplierChargeswithFixedChargesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefCharges.supplierChargeswithFixedCharges</code> attribute. 
	 * @param value the supplierChargeswithFixedCharges - Supplier Charges with Fixed Charges
	 */
	public void setSupplierChargeswithFixedCharges(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SUPPLIERCHARGESWITHFIXEDCHARGES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefCharges.supplierChargeswithFixedCharges</code> attribute. 
	 * @param value the supplierChargeswithFixedCharges - Supplier Charges with Fixed Charges
	 */
	public void setSupplierChargeswithFixedCharges(final Boolean value)
	{
		setSupplierChargeswithFixedCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefCharges.supplierChargeswithFixedCharges</code> attribute. 
	 * @param value the supplierChargeswithFixedCharges - Supplier Charges with Fixed Charges
	 */
	public void setSupplierChargeswithFixedCharges(final SessionContext ctx, final boolean value)
	{
		setSupplierChargeswithFixedCharges( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefCharges.supplierChargeswithFixedCharges</code> attribute. 
	 * @param value the supplierChargeswithFixedCharges - Supplier Charges with Fixed Charges
	 */
	public void setSupplierChargeswithFixedCharges(final boolean value)
	{
		setSupplierChargeswithFixedCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefCharges.supplierChargewithRetainCompanyCommercials</code> attribute.
	 * @return the supplierChargewithRetainCompanyCommercials - Supplier Charge with Retain Company Commercials
	 */
	public Boolean isSupplierChargewithRetainCompanyCommercials(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SUPPLIERCHARGEWITHRETAINCOMPANYCOMMERCIALS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefCharges.supplierChargewithRetainCompanyCommercials</code> attribute.
	 * @return the supplierChargewithRetainCompanyCommercials - Supplier Charge with Retain Company Commercials
	 */
	public Boolean isSupplierChargewithRetainCompanyCommercials()
	{
		return isSupplierChargewithRetainCompanyCommercials( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefCharges.supplierChargewithRetainCompanyCommercials</code> attribute. 
	 * @return the supplierChargewithRetainCompanyCommercials - Supplier Charge with Retain Company Commercials
	 */
	public boolean isSupplierChargewithRetainCompanyCommercialsAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSupplierChargewithRetainCompanyCommercials( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDefCharges.supplierChargewithRetainCompanyCommercials</code> attribute. 
	 * @return the supplierChargewithRetainCompanyCommercials - Supplier Charge with Retain Company Commercials
	 */
	public boolean isSupplierChargewithRetainCompanyCommercialsAsPrimitive()
	{
		return isSupplierChargewithRetainCompanyCommercialsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefCharges.supplierChargewithRetainCompanyCommercials</code> attribute. 
	 * @param value the supplierChargewithRetainCompanyCommercials - Supplier Charge with Retain Company Commercials
	 */
	public void setSupplierChargewithRetainCompanyCommercials(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SUPPLIERCHARGEWITHRETAINCOMPANYCOMMERCIALS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefCharges.supplierChargewithRetainCompanyCommercials</code> attribute. 
	 * @param value the supplierChargewithRetainCompanyCommercials - Supplier Charge with Retain Company Commercials
	 */
	public void setSupplierChargewithRetainCompanyCommercials(final Boolean value)
	{
		setSupplierChargewithRetainCompanyCommercials( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefCharges.supplierChargewithRetainCompanyCommercials</code> attribute. 
	 * @param value the supplierChargewithRetainCompanyCommercials - Supplier Charge with Retain Company Commercials
	 */
	public void setSupplierChargewithRetainCompanyCommercials(final SessionContext ctx, final boolean value)
	{
		setSupplierChargewithRetainCompanyCommercials( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDefCharges.supplierChargewithRetainCompanyCommercials</code> attribute. 
	 * @param value the supplierChargewithRetainCompanyCommercials - Supplier Charge with Retain Company Commercials
	 */
	public void setSupplierChargewithRetainCompanyCommercials(final boolean value)
	{
		setSupplierChargewithRetainCompanyCommercials( getSession().getSessionContext(), value );
	}
	
}
