/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.mappings.product.jalo;

import com.cnk.travelogix.product.common.core.jalo.Accommodation;
import com.cnk.travelogix.supplier.mappings.core.constants.SuppliermappingscoreConstants;
import com.cnk.travelogix.supplier.mappings.product.jalo.SupplierProductMapping;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.mappings.product.jalo.SupplierAccommodationMapping SupplierAccommodationMapping}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierAccommodationMapping extends SupplierProductMapping
{
	/** Qualifier of the <code>SupplierAccommodationMapping.accommodation</code> attribute **/
	public static final String ACCOMMODATION = "accommodation";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SupplierProductMapping.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ACCOMMODATION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierAccommodationMapping.accommodation</code> attribute.
	 * @return the accommodation
	 */
	public Accommodation getAccommodation(final SessionContext ctx)
	{
		return (Accommodation)getProperty( ctx, ACCOMMODATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierAccommodationMapping.accommodation</code> attribute.
	 * @return the accommodation
	 */
	public Accommodation getAccommodation()
	{
		return getAccommodation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierAccommodationMapping.accommodation</code> attribute. 
	 * @param value the accommodation
	 */
	public void setAccommodation(final SessionContext ctx, final Accommodation value)
	{
		setProperty(ctx, ACCOMMODATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierAccommodationMapping.accommodation</code> attribute. 
	 * @param value the accommodation
	 */
	public void setAccommodation(final Accommodation value)
	{
		setAccommodation( getSession().getSessionContext(), value );
	}
	
}
