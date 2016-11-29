/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.transport.masters.core.jalo.Vehicle Vehicle}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedVehicle extends Product
{
	/** Qualifier of the <code>Vehicle.vehicleCategory</code> attribute **/
	public static final String VEHICLECATEGORY = "vehicleCategory";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(VEHICLECATEGORY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.vehicleCategory</code> attribute.
	 * @return the vehicleCategory - Vehicle Category
	 */
	public EnumerationValue getVehicleCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, VEHICLECATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.vehicleCategory</code> attribute.
	 * @return the vehicleCategory - Vehicle Category
	 */
	public EnumerationValue getVehicleCategory()
	{
		return getVehicleCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.vehicleCategory</code> attribute. 
	 * @param value the vehicleCategory - Vehicle Category
	 */
	public void setVehicleCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, VEHICLECATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.vehicleCategory</code> attribute. 
	 * @param value the vehicleCategory - Vehicle Category
	 */
	public void setVehicleCategory(final EnumerationValue value)
	{
		setVehicleCategory( getSession().getSessionContext(), value );
	}
	
}
