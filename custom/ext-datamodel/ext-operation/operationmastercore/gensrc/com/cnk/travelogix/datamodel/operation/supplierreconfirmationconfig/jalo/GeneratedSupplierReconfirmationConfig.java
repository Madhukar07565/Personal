/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.operation.supplierreconfirmationconfig.jalo;

import com.cnk.travelogix.datamodel.operation.reconfirmationconfig.jalo.ReconfirmationConfig;
import com.cnk.travelogix.datamodel.operation.reconfirmationinterval.jalo.ReconfirmationInterval;
import com.cnk.travelogix.operation.constants.OperationmastercoreConstants;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.operation.supplierreconfirmationconfig.jalo.SupplierReconfirmationConfig SupplierReconfirmationConfig}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierReconfirmationConfig extends GenericItem
{
	/** Qualifier of the <code>SupplierReconfirmationConfig.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>SupplierReconfirmationConfig.supplier</code> attribute **/
	public static final String SUPPLIER = "supplier";
	/** Qualifier of the <code>SupplierReconfirmationConfig.reconfirmationTo</code> attribute **/
	public static final String RECONFIRMATIONTO = "reconfirmationTo";
	/** Qualifier of the <code>SupplierReconfirmationConfig.supplierReconfirmationInterval</code> attribute **/
	public static final String SUPPLIERRECONFIRMATIONINTERVAL = "supplierReconfirmationInterval";
	/** Qualifier of the <code>SupplierReconfirmationConfig.reconfirmationconfig</code> attribute **/
	public static final String RECONFIRMATIONCONFIG = "reconfirmationconfig";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n RECONFIRMATIONCONFIG's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSupplierReconfirmationConfig> RECONFIRMATIONCONFIGHANDLER = new BidirectionalOneToManyHandler<GeneratedSupplierReconfirmationConfig>(
	OperationmastercoreConstants.TC.SUPPLIERRECONFIRMATIONCONFIG,
	false,
	"reconfirmationconfig",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(SUPPLIER, AttributeMode.INITIAL);
		tmp.put(RECONFIRMATIONTO, AttributeMode.INITIAL);
		tmp.put(SUPPLIERRECONFIRMATIONINTERVAL, AttributeMode.INITIAL);
		tmp.put(RECONFIRMATIONCONFIG, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierReconfirmationConfig.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierReconfirmationConfig.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierReconfirmationConfig.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierReconfirmationConfig.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		RECONFIRMATIONCONFIGHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierReconfirmationConfig.reconfirmationconfig</code> attribute.
	 * @return the reconfirmationconfig
	 */
	public ReconfirmationConfig getReconfirmationconfig(final SessionContext ctx)
	{
		return (ReconfirmationConfig)getProperty( ctx, RECONFIRMATIONCONFIG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierReconfirmationConfig.reconfirmationconfig</code> attribute.
	 * @return the reconfirmationconfig
	 */
	public ReconfirmationConfig getReconfirmationconfig()
	{
		return getReconfirmationconfig( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierReconfirmationConfig.reconfirmationconfig</code> attribute. 
	 * @param value the reconfirmationconfig
	 */
	public void setReconfirmationconfig(final SessionContext ctx, final ReconfirmationConfig value)
	{
		RECONFIRMATIONCONFIGHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierReconfirmationConfig.reconfirmationconfig</code> attribute. 
	 * @param value the reconfirmationconfig
	 */
	public void setReconfirmationconfig(final ReconfirmationConfig value)
	{
		setReconfirmationconfig( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierReconfirmationConfig.reconfirmationTo</code> attribute.
	 * @return the reconfirmationTo
	 */
	public EnumerationValue getReconfirmationTo(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RECONFIRMATIONTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierReconfirmationConfig.reconfirmationTo</code> attribute.
	 * @return the reconfirmationTo
	 */
	public EnumerationValue getReconfirmationTo()
	{
		return getReconfirmationTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierReconfirmationConfig.reconfirmationTo</code> attribute. 
	 * @param value the reconfirmationTo
	 */
	public void setReconfirmationTo(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RECONFIRMATIONTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierReconfirmationConfig.reconfirmationTo</code> attribute. 
	 * @param value the reconfirmationTo
	 */
	public void setReconfirmationTo(final EnumerationValue value)
	{
		setReconfirmationTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierReconfirmationConfig.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, SUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierReconfirmationConfig.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier()
	{
		return getSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierReconfirmationConfig.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, SUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierReconfirmationConfig.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final Supplier value)
	{
		setSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierReconfirmationConfig.supplierReconfirmationInterval</code> attribute.
	 * @return the supplierReconfirmationInterval
	 */
	public ReconfirmationInterval getSupplierReconfirmationInterval(final SessionContext ctx)
	{
		return (ReconfirmationInterval)getProperty( ctx, SUPPLIERRECONFIRMATIONINTERVAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierReconfirmationConfig.supplierReconfirmationInterval</code> attribute.
	 * @return the supplierReconfirmationInterval
	 */
	public ReconfirmationInterval getSupplierReconfirmationInterval()
	{
		return getSupplierReconfirmationInterval( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierReconfirmationConfig.supplierReconfirmationInterval</code> attribute. 
	 * @param value the supplierReconfirmationInterval
	 */
	public void setSupplierReconfirmationInterval(final SessionContext ctx, final ReconfirmationInterval value)
	{
		setProperty(ctx, SUPPLIERRECONFIRMATIONINTERVAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierReconfirmationConfig.supplierReconfirmationInterval</code> attribute. 
	 * @param value the supplierReconfirmationInterval
	 */
	public void setSupplierReconfirmationInterval(final ReconfirmationInterval value)
	{
		setSupplierReconfirmationInterval( getSession().getSessionContext(), value );
	}
	
}
