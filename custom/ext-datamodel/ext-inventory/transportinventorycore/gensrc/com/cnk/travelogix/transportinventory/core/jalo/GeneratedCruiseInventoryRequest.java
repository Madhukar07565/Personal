/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transportinventory.core.jalo;

import com.cnk.travelogix.common.inventory.jalo.AbstractInventoryRequest;
import com.cnk.travelogix.product.common.core.jalo.CruiseBrand;
import com.cnk.travelogix.product.common.core.jalo.CruiseCompany;
import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.transportinventory.core.jalo.CruiseInventoryRequest CruiseInventoryRequest}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCruiseInventoryRequest extends AbstractInventoryRequest
{
	/** Qualifier of the <code>CruiseInventoryRequest.cruiseCompanyName</code> attribute **/
	public static final String CRUISECOMPANYNAME = "cruiseCompanyName";
	/** Qualifier of the <code>CruiseInventoryRequest.cruiseBrandname</code> attribute **/
	public static final String CRUISEBRANDNAME = "cruiseBrandname";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractInventoryRequest.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CRUISECOMPANYNAME, AttributeMode.INITIAL);
		tmp.put(CRUISEBRANDNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseInventoryRequest.cruiseBrandname</code> attribute.
	 * @return the cruiseBrandname - Cruise Brand Name
	 */
	public CruiseBrand getCruiseBrandname(final SessionContext ctx)
	{
		return (CruiseBrand)getProperty( ctx, CRUISEBRANDNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseInventoryRequest.cruiseBrandname</code> attribute.
	 * @return the cruiseBrandname - Cruise Brand Name
	 */
	public CruiseBrand getCruiseBrandname()
	{
		return getCruiseBrandname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseInventoryRequest.cruiseBrandname</code> attribute. 
	 * @param value the cruiseBrandname - Cruise Brand Name
	 */
	public void setCruiseBrandname(final SessionContext ctx, final CruiseBrand value)
	{
		setProperty(ctx, CRUISEBRANDNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseInventoryRequest.cruiseBrandname</code> attribute. 
	 * @param value the cruiseBrandname - Cruise Brand Name
	 */
	public void setCruiseBrandname(final CruiseBrand value)
	{
		setCruiseBrandname( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseInventoryRequest.cruiseCompanyName</code> attribute.
	 * @return the cruiseCompanyName - Cruise Company Name
	 */
	public CruiseCompany getCruiseCompanyName(final SessionContext ctx)
	{
		return (CruiseCompany)getProperty( ctx, CRUISECOMPANYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseInventoryRequest.cruiseCompanyName</code> attribute.
	 * @return the cruiseCompanyName - Cruise Company Name
	 */
	public CruiseCompany getCruiseCompanyName()
	{
		return getCruiseCompanyName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseInventoryRequest.cruiseCompanyName</code> attribute. 
	 * @param value the cruiseCompanyName - Cruise Company Name
	 */
	public void setCruiseCompanyName(final SessionContext ctx, final CruiseCompany value)
	{
		setProperty(ctx, CRUISECOMPANYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseInventoryRequest.cruiseCompanyName</code> attribute. 
	 * @param value the cruiseCompanyName - Cruise Company Name
	 */
	public void setCruiseCompanyName(final CruiseCompany value)
	{
		setCruiseCompanyName( getSession().getSessionContext(), value );
	}
	
}
