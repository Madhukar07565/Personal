/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.mappings.product.jalo;

import com.cnk.travelogix.supplier.mappings.core.constants.SuppliermappingscoreConstants;
import com.cnk.travelogix.supplier.mappings.jalo.AbstractSupplierMapping;
import com.cnk.travelogix.supplier.mappings.product.jalo.SupplierProduct;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.mappings.product.jalo.SupplierProductMapping SupplierProductMapping}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierProductMapping extends AbstractSupplierMapping
{
	/** Qualifier of the <code>SupplierProductMapping.supplierProduct</code> attribute **/
	public static final String SUPPLIERPRODUCT = "supplierProduct";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractSupplierMapping.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SUPPLIERPRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierProductMapping.supplierProduct</code> attribute.
	 * @return the supplierProduct
	 */
	public SupplierProduct getSupplierProduct(final SessionContext ctx)
	{
		return (SupplierProduct)getProperty( ctx, SUPPLIERPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierProductMapping.supplierProduct</code> attribute.
	 * @return the supplierProduct
	 */
	public SupplierProduct getSupplierProduct()
	{
		return getSupplierProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierProductMapping.supplierProduct</code> attribute. 
	 * @param value the supplierProduct
	 */
	public void setSupplierProduct(final SessionContext ctx, final SupplierProduct value)
	{
		setProperty(ctx, SUPPLIERPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierProductMapping.supplierProduct</code> attribute. 
	 * @param value the supplierProduct
	 */
	public void setSupplierProduct(final SupplierProduct value)
	{
		setSupplierProduct( getSession().getSessionContext(), value );
	}
	
}
