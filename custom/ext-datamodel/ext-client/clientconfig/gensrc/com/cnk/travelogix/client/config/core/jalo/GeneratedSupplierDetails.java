/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.masterdata.core.proucts.jalo.RateCode;
import com.cnk.travelogix.masterdata.core.proucts.jalo.RateType;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.SupplierDetails SupplierDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierDetails extends GenericItem
{
	/** Qualifier of the <code>SupplierDetails.includeorExclude</code> attribute **/
	public static final String INCLUDEOREXCLUDE = "includeorExclude";
	/** Qualifier of the <code>SupplierDetails.supplierName</code> attribute **/
	public static final String SUPPLIERNAME = "supplierName";
	/** Qualifier of the <code>SupplierDetails.credentialName</code> attribute **/
	public static final String CREDENTIALNAME = "credentialName";
	/** Qualifier of the <code>SupplierDetails.supplierRateType</code> attribute **/
	public static final String SUPPLIERRATETYPE = "supplierRateType";
	/** Qualifier of the <code>SupplierDetails.supplierRateCode</code> attribute **/
	public static final String SUPPLIERRATECODE = "supplierRateCode";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(INCLUDEOREXCLUDE, AttributeMode.INITIAL);
		tmp.put(SUPPLIERNAME, AttributeMode.INITIAL);
		tmp.put(CREDENTIALNAME, AttributeMode.INITIAL);
		tmp.put(SUPPLIERRATETYPE, AttributeMode.INITIAL);
		tmp.put(SUPPLIERRATECODE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierDetails.credentialName</code> attribute.
	 * @return the credentialName - Company Policy Credential Name
	 */
	public String getCredentialName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CREDENTIALNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierDetails.credentialName</code> attribute.
	 * @return the credentialName - Company Policy Credential Name
	 */
	public String getCredentialName()
	{
		return getCredentialName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierDetails.credentialName</code> attribute. 
	 * @param value the credentialName - Company Policy Credential Name
	 */
	public void setCredentialName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CREDENTIALNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierDetails.credentialName</code> attribute. 
	 * @param value the credentialName - Company Policy Credential Name
	 */
	public void setCredentialName(final String value)
	{
		setCredentialName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierDetails.includeorExclude</code> attribute.
	 * @return the includeorExclude - Company Policy include or Exclude
	 */
	public Boolean isIncludeorExclude(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, INCLUDEOREXCLUDE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierDetails.includeorExclude</code> attribute.
	 * @return the includeorExclude - Company Policy include or Exclude
	 */
	public Boolean isIncludeorExclude()
	{
		return isIncludeorExclude( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierDetails.includeorExclude</code> attribute. 
	 * @return the includeorExclude - Company Policy include or Exclude
	 */
	public boolean isIncludeorExcludeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIncludeorExclude( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierDetails.includeorExclude</code> attribute. 
	 * @return the includeorExclude - Company Policy include or Exclude
	 */
	public boolean isIncludeorExcludeAsPrimitive()
	{
		return isIncludeorExcludeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierDetails.includeorExclude</code> attribute. 
	 * @param value the includeorExclude - Company Policy include or Exclude
	 */
	public void setIncludeorExclude(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, INCLUDEOREXCLUDE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierDetails.includeorExclude</code> attribute. 
	 * @param value the includeorExclude - Company Policy include or Exclude
	 */
	public void setIncludeorExclude(final Boolean value)
	{
		setIncludeorExclude( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierDetails.includeorExclude</code> attribute. 
	 * @param value the includeorExclude - Company Policy include or Exclude
	 */
	public void setIncludeorExclude(final SessionContext ctx, final boolean value)
	{
		setIncludeorExclude( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierDetails.includeorExclude</code> attribute. 
	 * @param value the includeorExclude - Company Policy include or Exclude
	 */
	public void setIncludeorExclude(final boolean value)
	{
		setIncludeorExclude( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierDetails.supplierName</code> attribute.
	 * @return the supplierName - Company Policy Supplier Name
	 */
	public Supplier getSupplierName(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, SUPPLIERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierDetails.supplierName</code> attribute.
	 * @return the supplierName - Company Policy Supplier Name
	 */
	public Supplier getSupplierName()
	{
		return getSupplierName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierDetails.supplierName</code> attribute. 
	 * @param value the supplierName - Company Policy Supplier Name
	 */
	public void setSupplierName(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, SUPPLIERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierDetails.supplierName</code> attribute. 
	 * @param value the supplierName - Company Policy Supplier Name
	 */
	public void setSupplierName(final Supplier value)
	{
		setSupplierName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierDetails.supplierRateCode</code> attribute.
	 * @return the supplierRateCode - Company Policy Supplier Rate Code
	 */
	public RateCode getSupplierRateCode(final SessionContext ctx)
	{
		return (RateCode)getProperty( ctx, SUPPLIERRATECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierDetails.supplierRateCode</code> attribute.
	 * @return the supplierRateCode - Company Policy Supplier Rate Code
	 */
	public RateCode getSupplierRateCode()
	{
		return getSupplierRateCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierDetails.supplierRateCode</code> attribute. 
	 * @param value the supplierRateCode - Company Policy Supplier Rate Code
	 */
	public void setSupplierRateCode(final SessionContext ctx, final RateCode value)
	{
		setProperty(ctx, SUPPLIERRATECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierDetails.supplierRateCode</code> attribute. 
	 * @param value the supplierRateCode - Company Policy Supplier Rate Code
	 */
	public void setSupplierRateCode(final RateCode value)
	{
		setSupplierRateCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierDetails.supplierRateType</code> attribute.
	 * @return the supplierRateType - Company Policy Supplier Rate Type
	 */
	public RateType getSupplierRateType(final SessionContext ctx)
	{
		return (RateType)getProperty( ctx, SUPPLIERRATETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierDetails.supplierRateType</code> attribute.
	 * @return the supplierRateType - Company Policy Supplier Rate Type
	 */
	public RateType getSupplierRateType()
	{
		return getSupplierRateType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierDetails.supplierRateType</code> attribute. 
	 * @param value the supplierRateType - Company Policy Supplier Rate Type
	 */
	public void setSupplierRateType(final SessionContext ctx, final RateType value)
	{
		setProperty(ctx, SUPPLIERRATETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierDetails.supplierRateType</code> attribute. 
	 * @param value the supplierRateType - Company Policy Supplier Rate Type
	 */
	public void setSupplierRateType(final RateType value)
	{
		setSupplierRateType( getSession().getSessionContext(), value );
	}
	
}
