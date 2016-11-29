/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transportinventory.core.jalo;

import com.cnk.travelogix.masterdata.core.products.jalo.FareComponent;
import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transportinventory.core.jalo.AirCouponIndentRequest;
import de.hybris.platform.europe1.jalo.PriceRow;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.transportinventory.core.jalo.CouponPriceRow CouponPriceRow}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCouponPriceRow extends PriceRow
{
	/** Qualifier of the <code>CouponPriceRow.fareComponent</code> attribute **/
	public static final String FARECOMPONENT = "fareComponent";
	/** Qualifier of the <code>CouponPriceRow.value</code> attribute **/
	public static final String VALUE = "value";
	/** Qualifier of the <code>CouponPriceRow.airCouponIndentRequest</code> attribute **/
	public static final String AIRCOUPONINDENTREQUEST = "airCouponIndentRequest";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n AIRCOUPONINDENTREQUEST's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCouponPriceRow> AIRCOUPONINDENTREQUESTHANDLER = new BidirectionalOneToManyHandler<GeneratedCouponPriceRow>(
	TransportinventorycoreConstants.TC.COUPONPRICEROW,
	false,
	"airCouponIndentRequest",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(PriceRow.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(FARECOMPONENT, AttributeMode.INITIAL);
		tmp.put(VALUE, AttributeMode.INITIAL);
		tmp.put(AIRCOUPONINDENTREQUEST, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CouponPriceRow.airCouponIndentRequest</code> attribute.
	 * @return the airCouponIndentRequest
	 */
	public AirCouponIndentRequest getAirCouponIndentRequest(final SessionContext ctx)
	{
		return (AirCouponIndentRequest)getProperty( ctx, AIRCOUPONINDENTREQUEST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CouponPriceRow.airCouponIndentRequest</code> attribute.
	 * @return the airCouponIndentRequest
	 */
	public AirCouponIndentRequest getAirCouponIndentRequest()
	{
		return getAirCouponIndentRequest( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CouponPriceRow.airCouponIndentRequest</code> attribute. 
	 * @param value the airCouponIndentRequest
	 */
	public void setAirCouponIndentRequest(final SessionContext ctx, final AirCouponIndentRequest value)
	{
		AIRCOUPONINDENTREQUESTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CouponPriceRow.airCouponIndentRequest</code> attribute. 
	 * @param value the airCouponIndentRequest
	 */
	public void setAirCouponIndentRequest(final AirCouponIndentRequest value)
	{
		setAirCouponIndentRequest( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		AIRCOUPONINDENTREQUESTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CouponPriceRow.fareComponent</code> attribute.
	 * @return the fareComponent
	 */
	public FareComponent getFareComponent(final SessionContext ctx)
	{
		return (FareComponent)getProperty( ctx, FARECOMPONENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CouponPriceRow.fareComponent</code> attribute.
	 * @return the fareComponent
	 */
	public FareComponent getFareComponent()
	{
		return getFareComponent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CouponPriceRow.fareComponent</code> attribute. 
	 * @param value the fareComponent
	 */
	public void setFareComponent(final SessionContext ctx, final FareComponent value)
	{
		setProperty(ctx, FARECOMPONENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CouponPriceRow.fareComponent</code> attribute. 
	 * @param value the fareComponent
	 */
	public void setFareComponent(final FareComponent value)
	{
		setFareComponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CouponPriceRow.value</code> attribute.
	 * @return the value - Value
	 */
	public Double getValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, VALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CouponPriceRow.value</code> attribute.
	 * @return the value - Value
	 */
	public Double getValue()
	{
		return getValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CouponPriceRow.value</code> attribute. 
	 * @return the value - Value
	 */
	public double getValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CouponPriceRow.value</code> attribute. 
	 * @return the value - Value
	 */
	public double getValueAsPrimitive()
	{
		return getValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CouponPriceRow.value</code> attribute. 
	 * @param value the value - Value
	 */
	public void setValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, VALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CouponPriceRow.value</code> attribute. 
	 * @param value the value - Value
	 */
	public void setValue(final Double value)
	{
		setValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CouponPriceRow.value</code> attribute. 
	 * @param value the value - Value
	 */
	public void setValue(final SessionContext ctx, final double value)
	{
		setValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CouponPriceRow.value</code> attribute. 
	 * @param value the value - Value
	 */
	public void setValue(final double value)
	{
		setValue( getSession().getSessionContext(), value );
	}
	
}
