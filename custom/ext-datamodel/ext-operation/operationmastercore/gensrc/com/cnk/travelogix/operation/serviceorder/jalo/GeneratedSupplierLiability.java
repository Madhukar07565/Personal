/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.operation.serviceorder.jalo;

import com.cnk.travelogix.operation.constants.OperationmastercoreConstants;
import com.cnk.travelogix.operation.serviceorder.jalo.ServiceOrder;
import com.cnk.travelogix.operation.serviceorder.jalo.SupplierLiability;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.operation.serviceorder.jalo.SupplierLiability SupplierLiability}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierLiability extends GenericItem
{
	/** Qualifier of the <code>SupplierLiability.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>SupplierLiability.type</code> attribute **/
	public static final String TYPE = "type";
	/** Qualifier of the <code>SupplierLiability.fsl</code> attribute **/
	public static final String FSL = "fsl";
	/** Qualifier of the <code>SupplierLiability.supplierLiabilityStatus</code> attribute **/
	public static final String SUPPLIERLIABILITYSTATUS = "supplierLiabilityStatus";
	/** Qualifier of the <code>SupplierLiability.serviceOrder</code> attribute **/
	public static final String SERVICEORDER = "serviceOrder";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(TYPE, AttributeMode.INITIAL);
		tmp.put(FSL, AttributeMode.INITIAL);
		tmp.put(SUPPLIERLIABILITYSTATUS, AttributeMode.INITIAL);
		tmp.put(SERVICEORDER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLiability.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLiability.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLiability.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLiability.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLiability.fsl</code> attribute.
	 * @return the fsl
	 */
	public SupplierLiability getFsl(final SessionContext ctx)
	{
		return (SupplierLiability)getProperty( ctx, FSL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLiability.fsl</code> attribute.
	 * @return the fsl
	 */
	public SupplierLiability getFsl()
	{
		return getFsl( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLiability.fsl</code> attribute. 
	 * @param value the fsl
	 */
	public void setFsl(final SessionContext ctx, final SupplierLiability value)
	{
		setProperty(ctx, FSL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLiability.fsl</code> attribute. 
	 * @param value the fsl
	 */
	public void setFsl(final SupplierLiability value)
	{
		setFsl( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLiability.serviceOrder</code> attribute.
	 * @return the serviceOrder
	 */
	public ServiceOrder getServiceOrder(final SessionContext ctx)
	{
		return (ServiceOrder)getProperty( ctx, SERVICEORDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLiability.serviceOrder</code> attribute.
	 * @return the serviceOrder
	 */
	public ServiceOrder getServiceOrder()
	{
		return getServiceOrder( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLiability.serviceOrder</code> attribute. 
	 * @param value the serviceOrder
	 */
	public void setServiceOrder(final SessionContext ctx, final ServiceOrder value)
	{
		setProperty(ctx, SERVICEORDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLiability.serviceOrder</code> attribute. 
	 * @param value the serviceOrder
	 */
	public void setServiceOrder(final ServiceOrder value)
	{
		setServiceOrder( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLiability.supplierLiabilityStatus</code> attribute.
	 * @return the supplierLiabilityStatus
	 */
	public EnumerationValue getSupplierLiabilityStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SUPPLIERLIABILITYSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLiability.supplierLiabilityStatus</code> attribute.
	 * @return the supplierLiabilityStatus
	 */
	public EnumerationValue getSupplierLiabilityStatus()
	{
		return getSupplierLiabilityStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLiability.supplierLiabilityStatus</code> attribute. 
	 * @param value the supplierLiabilityStatus
	 */
	public void setSupplierLiabilityStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SUPPLIERLIABILITYSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLiability.supplierLiabilityStatus</code> attribute. 
	 * @param value the supplierLiabilityStatus
	 */
	public void setSupplierLiabilityStatus(final EnumerationValue value)
	{
		setSupplierLiabilityStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLiability.type</code> attribute.
	 * @return the type
	 */
	public EnumerationValue getType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLiability.type</code> attribute.
	 * @return the type
	 */
	public EnumerationValue getType()
	{
		return getType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLiability.type</code> attribute. 
	 * @param value the type
	 */
	public void setType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLiability.type</code> attribute. 
	 * @param value the type
	 */
	public void setType(final EnumerationValue value)
	{
		setType( getSession().getSessionContext(), value );
	}
	
}
