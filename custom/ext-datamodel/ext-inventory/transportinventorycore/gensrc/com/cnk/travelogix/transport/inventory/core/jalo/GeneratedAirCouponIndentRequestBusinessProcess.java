/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transport.inventory.core.jalo;

import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transportinventory.core.jalo.AirCouponIndentRequest;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.processengine.jalo.BusinessProcess;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.processengine.jalo.BusinessProcess AirCouponIndentRequestBusinessProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAirCouponIndentRequestBusinessProcess extends BusinessProcess
{
	/** Qualifier of the <code>AirCouponIndentRequestBusinessProcess.airCouponIndentRequest</code> attribute **/
	public static final String AIRCOUPONINDENTREQUEST = "airCouponIndentRequest";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(BusinessProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(AIRCOUPONINDENTREQUEST, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentRequestBusinessProcess.airCouponIndentRequest</code> attribute.
	 * @return the airCouponIndentRequest
	 */
	public AirCouponIndentRequest getAirCouponIndentRequest(final SessionContext ctx)
	{
		return (AirCouponIndentRequest)getProperty( ctx, AIRCOUPONINDENTREQUEST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentRequestBusinessProcess.airCouponIndentRequest</code> attribute.
	 * @return the airCouponIndentRequest
	 */
	public AirCouponIndentRequest getAirCouponIndentRequest()
	{
		return getAirCouponIndentRequest( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentRequestBusinessProcess.airCouponIndentRequest</code> attribute. 
	 * @param value the airCouponIndentRequest
	 */
	public void setAirCouponIndentRequest(final SessionContext ctx, final AirCouponIndentRequest value)
	{
		setProperty(ctx, AIRCOUPONINDENTREQUEST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentRequestBusinessProcess.airCouponIndentRequest</code> attribute. 
	 * @param value the airCouponIndentRequest
	 */
	public void setAirCouponIndentRequest(final AirCouponIndentRequest value)
	{
		setAirCouponIndentRequest( getSession().getSessionContext(), value );
	}
	
}
