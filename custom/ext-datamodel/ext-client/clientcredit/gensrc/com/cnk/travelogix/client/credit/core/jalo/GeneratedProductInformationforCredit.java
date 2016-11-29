/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.credit.core.jalo;

import com.cnk.travelogix.client.config.core.partpayment.jalo.ProductInformation;
import com.cnk.travelogix.client.credit.constants.ClientcreditConstants;
import com.cnk.travelogix.client.credit.core.jalo.ClientCreditDetails;
import com.cnk.travelogix.client.credit.core.jalo.CreditLimitInfo;
import com.cnk.travelogix.client.credit.core.jalo.ThresholdInformation;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.Employee;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.variants.jalo.VariantProduct;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.credit.core.jalo.ProductInformationforCredit ProductInformationforCredit}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedProductInformationforCredit extends ProductInformation
{
	/** Qualifier of the <code>ProductInformationforCredit.productName</code> attribute **/
	public static final String PRODUCTNAME = "productName";
	/** Qualifier of the <code>ProductInformationforCredit.productNameSubType</code> attribute **/
	public static final String PRODUCTNAMESUBTYPE = "productNameSubType";
	/** Qualifier of the <code>ProductInformationforCredit.thresholdInfo</code> attribute **/
	public static final String THRESHOLDINFO = "thresholdInfo";
	/** Qualifier of the <code>ProductInformationforCredit.creditLimitInfo</code> attribute **/
	public static final String CREDITLIMITINFO = "creditLimitInfo";
	/** Qualifier of the <code>ProductInformationforCredit.employeeName</code> attribute **/
	public static final String EMPLOYEENAME = "employeeName";
	/** Qualifier of the <code>ProductInformationforCredit.clientCreditDetails</code> attribute **/
	public static final String CLIENTCREDITDETAILS = "clientCreditDetails";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CLIENTCREDITDETAILS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedProductInformationforCredit> CLIENTCREDITDETAILSHANDLER = new BidirectionalOneToManyHandler<GeneratedProductInformationforCredit>(
	ClientcreditConstants.TC.PRODUCTINFORMATIONFORCREDIT,
	false,
	"clientCreditDetails",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(ProductInformation.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRODUCTNAME, AttributeMode.INITIAL);
		tmp.put(PRODUCTNAMESUBTYPE, AttributeMode.INITIAL);
		tmp.put(THRESHOLDINFO, AttributeMode.INITIAL);
		tmp.put(CREDITLIMITINFO, AttributeMode.INITIAL);
		tmp.put(EMPLOYEENAME, AttributeMode.INITIAL);
		tmp.put(CLIENTCREDITDETAILS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductInformationforCredit.clientCreditDetails</code> attribute.
	 * @return the clientCreditDetails
	 */
	public ClientCreditDetails getClientCreditDetails(final SessionContext ctx)
	{
		return (ClientCreditDetails)getProperty( ctx, CLIENTCREDITDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductInformationforCredit.clientCreditDetails</code> attribute.
	 * @return the clientCreditDetails
	 */
	public ClientCreditDetails getClientCreditDetails()
	{
		return getClientCreditDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductInformationforCredit.clientCreditDetails</code> attribute. 
	 * @param value the clientCreditDetails
	 */
	public void setClientCreditDetails(final SessionContext ctx, final ClientCreditDetails value)
	{
		CLIENTCREDITDETAILSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductInformationforCredit.clientCreditDetails</code> attribute. 
	 * @param value the clientCreditDetails
	 */
	public void setClientCreditDetails(final ClientCreditDetails value)
	{
		setClientCreditDetails( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CLIENTCREDITDETAILSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductInformationforCredit.creditLimitInfo</code> attribute.
	 * @return the creditLimitInfo - Credit Limit Information
	 */
	public CreditLimitInfo getCreditLimitInfo(final SessionContext ctx)
	{
		return (CreditLimitInfo)getProperty( ctx, CREDITLIMITINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductInformationforCredit.creditLimitInfo</code> attribute.
	 * @return the creditLimitInfo - Credit Limit Information
	 */
	public CreditLimitInfo getCreditLimitInfo()
	{
		return getCreditLimitInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductInformationforCredit.creditLimitInfo</code> attribute. 
	 * @param value the creditLimitInfo - Credit Limit Information
	 */
	public void setCreditLimitInfo(final SessionContext ctx, final CreditLimitInfo value)
	{
		setProperty(ctx, CREDITLIMITINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductInformationforCredit.creditLimitInfo</code> attribute. 
	 * @param value the creditLimitInfo - Credit Limit Information
	 */
	public void setCreditLimitInfo(final CreditLimitInfo value)
	{
		setCreditLimitInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductInformationforCredit.employeeName</code> attribute.
	 * @return the employeeName - Employee Name
	 */
	public Employee getEmployeeName(final SessionContext ctx)
	{
		return (Employee)getProperty( ctx, EMPLOYEENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductInformationforCredit.employeeName</code> attribute.
	 * @return the employeeName - Employee Name
	 */
	public Employee getEmployeeName()
	{
		return getEmployeeName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductInformationforCredit.employeeName</code> attribute. 
	 * @param value the employeeName - Employee Name
	 */
	public void setEmployeeName(final SessionContext ctx, final Employee value)
	{
		setProperty(ctx, EMPLOYEENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductInformationforCredit.employeeName</code> attribute. 
	 * @param value the employeeName - Employee Name
	 */
	public void setEmployeeName(final Employee value)
	{
		setEmployeeName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductInformationforCredit.productName</code> attribute.
	 * @return the productName - Product Name
	 */
	public Product getProductName(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductInformationforCredit.productName</code> attribute.
	 * @return the productName - Product Name
	 */
	public Product getProductName()
	{
		return getProductName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductInformationforCredit.productName</code> attribute. 
	 * @param value the productName - Product Name
	 */
	public void setProductName(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, PRODUCTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductInformationforCredit.productName</code> attribute. 
	 * @param value the productName - Product Name
	 */
	public void setProductName(final Product value)
	{
		setProductName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductInformationforCredit.productNameSubType</code> attribute.
	 * @return the productNameSubType - Product Name SubType
	 */
	public VariantProduct getProductNameSubType(final SessionContext ctx)
	{
		return (VariantProduct)getProperty( ctx, PRODUCTNAMESUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductInformationforCredit.productNameSubType</code> attribute.
	 * @return the productNameSubType - Product Name SubType
	 */
	public VariantProduct getProductNameSubType()
	{
		return getProductNameSubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductInformationforCredit.productNameSubType</code> attribute. 
	 * @param value the productNameSubType - Product Name SubType
	 */
	public void setProductNameSubType(final SessionContext ctx, final VariantProduct value)
	{
		setProperty(ctx, PRODUCTNAMESUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductInformationforCredit.productNameSubType</code> attribute. 
	 * @param value the productNameSubType - Product Name SubType
	 */
	public void setProductNameSubType(final VariantProduct value)
	{
		setProductNameSubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductInformationforCredit.thresholdInfo</code> attribute.
	 * @return the thresholdInfo - Threshold Information
	 */
	public ThresholdInformation getThresholdInfo(final SessionContext ctx)
	{
		return (ThresholdInformation)getProperty( ctx, THRESHOLDINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductInformationforCredit.thresholdInfo</code> attribute.
	 * @return the thresholdInfo - Threshold Information
	 */
	public ThresholdInformation getThresholdInfo()
	{
		return getThresholdInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductInformationforCredit.thresholdInfo</code> attribute. 
	 * @param value the thresholdInfo - Threshold Information
	 */
	public void setThresholdInfo(final SessionContext ctx, final ThresholdInformation value)
	{
		setProperty(ctx, THRESHOLDINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductInformationforCredit.thresholdInfo</code> attribute. 
	 * @param value the thresholdInfo - Threshold Information
	 */
	public void setThresholdInfo(final ThresholdInformation value)
	{
		setThresholdInfo( getSession().getSessionContext(), value );
	}
	
}
