/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.jalo.AbstractProductDocument;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.InsuranceProductDocument InsuranceProductDocument}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedInsuranceProductDocument extends AbstractProductDocument
{
	/** Qualifier of the <code>InsuranceProductDocument.insuranceProduct</code> attribute **/
	public static final String INSURANCEPRODUCT = "insuranceProduct";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractProductDocument.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(INSURANCEPRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InsuranceProductDocument.insuranceProduct</code> attribute.
	 * @return the insuranceProduct - Insurance Product Details
	 */
	public Product getInsuranceProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, INSURANCEPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InsuranceProductDocument.insuranceProduct</code> attribute.
	 * @return the insuranceProduct - Insurance Product Details
	 */
	public Product getInsuranceProduct()
	{
		return getInsuranceProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InsuranceProductDocument.insuranceProduct</code> attribute. 
	 * @param value the insuranceProduct - Insurance Product Details
	 */
	public void setInsuranceProduct(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, INSURANCEPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InsuranceProductDocument.insuranceProduct</code> attribute. 
	 * @param value the insuranceProduct - Insurance Product Details
	 */
	public void setInsuranceProduct(final Product value)
	{
		setInsuranceProduct( getSession().getSessionContext(), value );
	}
	
}
