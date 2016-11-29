/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.masterdata.core.jalo;

import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.jalo.ProductType;
import com.cnk.travelogix.masterdata.core.jalo.TravelogixPolicy;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.masterdata.core.jalo.ActivitiesPolicy ActivitiesPolicy}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivitiesPolicy extends TravelogixPolicy
{
	/** Qualifier of the <code>ActivitiesPolicy.productType</code> attribute **/
	public static final String PRODUCTTYPE = "productType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(TravelogixPolicy.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRODUCTTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitiesPolicy.productType</code> attribute.
	 * @return the productType
	 */
	public ProductType getProductType(final SessionContext ctx)
	{
		return (ProductType)getProperty( ctx, PRODUCTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitiesPolicy.productType</code> attribute.
	 * @return the productType
	 */
	public ProductType getProductType()
	{
		return getProductType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitiesPolicy.productType</code> attribute. 
	 * @param value the productType
	 */
	public void setProductType(final SessionContext ctx, final ProductType value)
	{
		setProperty(ctx, PRODUCTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitiesPolicy.productType</code> attribute. 
	 * @param value the productType
	 */
	public void setProductType(final ProductType value)
	{
		setProductType( getSession().getSessionContext(), value );
	}
	
}
