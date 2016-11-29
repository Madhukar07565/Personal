/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.inventory.jalo;

import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.inventory.jalo.InitialInvReqSupplierDetail InitialInvReqSupplierDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedInitialInvReqSupplierDetail extends GenericItem
{
	/** Qualifier of the <code>InitialInvReqSupplierDetail.supplierName</code> attribute **/
	public static final String SUPPLIERNAME = "supplierName";
	/** Qualifier of the <code>InitialInvReqSupplierDetail.emailId</code> attribute **/
	public static final String EMAILID = "emailId";
	/** Qualifier of the <code>InitialInvReqSupplierDetail.faxNum</code> attribute **/
	public static final String FAXNUM = "faxNum";
	/** Qualifier of the <code>InitialInvReqSupplierDetail.sendToSupplier</code> attribute **/
	public static final String SENDTOSUPPLIER = "sendToSupplier";
	/** Qualifier of the <code>InitialInvReqSupplierDetail.supplierCode</code> attribute **/
	public static final String SUPPLIERCODE = "supplierCode";
	/** Qualifier of the <code>InitialInvReqSupplierDetail.supplierType</code> attribute **/
	public static final String SUPPLIERTYPE = "supplierType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SUPPLIERNAME, AttributeMode.INITIAL);
		tmp.put(EMAILID, AttributeMode.INITIAL);
		tmp.put(FAXNUM, AttributeMode.INITIAL);
		tmp.put(SENDTOSUPPLIER, AttributeMode.INITIAL);
		tmp.put(SUPPLIERCODE, AttributeMode.INITIAL);
		tmp.put(SUPPLIERTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InitialInvReqSupplierDetail.emailId</code> attribute.
	 * @return the emailId - Email Id
	 */
	public String getEmailId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAILID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InitialInvReqSupplierDetail.emailId</code> attribute.
	 * @return the emailId - Email Id
	 */
	public String getEmailId()
	{
		return getEmailId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InitialInvReqSupplierDetail.emailId</code> attribute. 
	 * @param value the emailId - Email Id
	 */
	public void setEmailId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAILID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InitialInvReqSupplierDetail.emailId</code> attribute. 
	 * @param value the emailId - Email Id
	 */
	public void setEmailId(final String value)
	{
		setEmailId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InitialInvReqSupplierDetail.faxNum</code> attribute.
	 * @return the faxNum - Fax Num
	 */
	public String getFaxNum(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FAXNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InitialInvReqSupplierDetail.faxNum</code> attribute.
	 * @return the faxNum - Fax Num
	 */
	public String getFaxNum()
	{
		return getFaxNum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InitialInvReqSupplierDetail.faxNum</code> attribute. 
	 * @param value the faxNum - Fax Num
	 */
	public void setFaxNum(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FAXNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InitialInvReqSupplierDetail.faxNum</code> attribute. 
	 * @param value the faxNum - Fax Num
	 */
	public void setFaxNum(final String value)
	{
		setFaxNum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InitialInvReqSupplierDetail.sendToSupplier</code> attribute.
	 * @return the sendToSupplier - Send To Supplier
	 */
	public Boolean isSendToSupplier(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SENDTOSUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InitialInvReqSupplierDetail.sendToSupplier</code> attribute.
	 * @return the sendToSupplier - Send To Supplier
	 */
	public Boolean isSendToSupplier()
	{
		return isSendToSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InitialInvReqSupplierDetail.sendToSupplier</code> attribute. 
	 * @return the sendToSupplier - Send To Supplier
	 */
	public boolean isSendToSupplierAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSendToSupplier( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InitialInvReqSupplierDetail.sendToSupplier</code> attribute. 
	 * @return the sendToSupplier - Send To Supplier
	 */
	public boolean isSendToSupplierAsPrimitive()
	{
		return isSendToSupplierAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InitialInvReqSupplierDetail.sendToSupplier</code> attribute. 
	 * @param value the sendToSupplier - Send To Supplier
	 */
	public void setSendToSupplier(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SENDTOSUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InitialInvReqSupplierDetail.sendToSupplier</code> attribute. 
	 * @param value the sendToSupplier - Send To Supplier
	 */
	public void setSendToSupplier(final Boolean value)
	{
		setSendToSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InitialInvReqSupplierDetail.sendToSupplier</code> attribute. 
	 * @param value the sendToSupplier - Send To Supplier
	 */
	public void setSendToSupplier(final SessionContext ctx, final boolean value)
	{
		setSendToSupplier( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InitialInvReqSupplierDetail.sendToSupplier</code> attribute. 
	 * @param value the sendToSupplier - Send To Supplier
	 */
	public void setSendToSupplier(final boolean value)
	{
		setSendToSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InitialInvReqSupplierDetail.supplierCode</code> attribute.
	 * @return the supplierCode - Supplier Code
	 */
	public String getSupplierCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUPPLIERCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InitialInvReqSupplierDetail.supplierCode</code> attribute.
	 * @return the supplierCode - Supplier Code
	 */
	public String getSupplierCode()
	{
		return getSupplierCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InitialInvReqSupplierDetail.supplierCode</code> attribute. 
	 * @param value the supplierCode - Supplier Code
	 */
	public void setSupplierCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUPPLIERCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InitialInvReqSupplierDetail.supplierCode</code> attribute. 
	 * @param value the supplierCode - Supplier Code
	 */
	public void setSupplierCode(final String value)
	{
		setSupplierCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InitialInvReqSupplierDetail.supplierName</code> attribute.
	 * @return the supplierName - Supplier Name
	 */
	public String getSupplierName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUPPLIERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InitialInvReqSupplierDetail.supplierName</code> attribute.
	 * @return the supplierName - Supplier Name
	 */
	public String getSupplierName()
	{
		return getSupplierName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InitialInvReqSupplierDetail.supplierName</code> attribute. 
	 * @param value the supplierName - Supplier Name
	 */
	public void setSupplierName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUPPLIERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InitialInvReqSupplierDetail.supplierName</code> attribute. 
	 * @param value the supplierName - Supplier Name
	 */
	public void setSupplierName(final String value)
	{
		setSupplierName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InitialInvReqSupplierDetail.supplierType</code> attribute.
	 * @return the supplierType - Supplier Code
	 */
	public EnumerationValue getSupplierType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SUPPLIERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InitialInvReqSupplierDetail.supplierType</code> attribute.
	 * @return the supplierType - Supplier Code
	 */
	public EnumerationValue getSupplierType()
	{
		return getSupplierType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InitialInvReqSupplierDetail.supplierType</code> attribute. 
	 * @param value the supplierType - Supplier Code
	 */
	public void setSupplierType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SUPPLIERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InitialInvReqSupplierDetail.supplierType</code> attribute. 
	 * @param value the supplierType - Supplier Code
	 */
	public void setSupplierType(final EnumerationValue value)
	{
		setSupplierType( getSession().getSessionContext(), value );
	}
	
}
