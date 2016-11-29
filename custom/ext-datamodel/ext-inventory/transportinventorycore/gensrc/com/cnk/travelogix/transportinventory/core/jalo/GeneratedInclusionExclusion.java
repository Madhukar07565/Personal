/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transportinventory.core.jalo;

import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transportinventory.core.jalo.AirCoupon;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.transportinventory.core.jalo.InclusionExclusion InclusionExclusion}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedInclusionExclusion extends GenericItem
{
	/** Qualifier of the <code>InclusionExclusion.fromCountry</code> attribute **/
	public static final String FROMCOUNTRY = "fromCountry";
	/** Qualifier of the <code>InclusionExclusion.toCountry</code> attribute **/
	public static final String TOCOUNTRY = "toCountry";
	/** Qualifier of the <code>InclusionExclusion.fromCity</code> attribute **/
	public static final String FROMCITY = "fromCity";
	/** Qualifier of the <code>InclusionExclusion.toCity</code> attribute **/
	public static final String TOCITY = "toCity";
	/** Qualifier of the <code>InclusionExclusion.isReturn</code> attribute **/
	public static final String ISRETURN = "isReturn";
	/** Qualifier of the <code>InclusionExclusion.airCoupon</code> attribute **/
	public static final String AIRCOUPON = "airCoupon";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n AIRCOUPON's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedInclusionExclusion> AIRCOUPONHANDLER = new BidirectionalOneToManyHandler<GeneratedInclusionExclusion>(
	TransportinventorycoreConstants.TC.INCLUSIONEXCLUSION,
	false,
	"airCoupon",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(FROMCOUNTRY, AttributeMode.INITIAL);
		tmp.put(TOCOUNTRY, AttributeMode.INITIAL);
		tmp.put(FROMCITY, AttributeMode.INITIAL);
		tmp.put(TOCITY, AttributeMode.INITIAL);
		tmp.put(ISRETURN, AttributeMode.INITIAL);
		tmp.put(AIRCOUPON, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InclusionExclusion.airCoupon</code> attribute.
	 * @return the airCoupon
	 */
	public AirCoupon getAirCoupon(final SessionContext ctx)
	{
		return (AirCoupon)getProperty( ctx, AIRCOUPON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InclusionExclusion.airCoupon</code> attribute.
	 * @return the airCoupon
	 */
	public AirCoupon getAirCoupon()
	{
		return getAirCoupon( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InclusionExclusion.airCoupon</code> attribute. 
	 * @param value the airCoupon
	 */
	public void setAirCoupon(final SessionContext ctx, final AirCoupon value)
	{
		AIRCOUPONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InclusionExclusion.airCoupon</code> attribute. 
	 * @param value the airCoupon
	 */
	public void setAirCoupon(final AirCoupon value)
	{
		setAirCoupon( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		AIRCOUPONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InclusionExclusion.fromCity</code> attribute.
	 * @return the fromCity
	 */
	public City getFromCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, FROMCITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InclusionExclusion.fromCity</code> attribute.
	 * @return the fromCity
	 */
	public City getFromCity()
	{
		return getFromCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InclusionExclusion.fromCity</code> attribute. 
	 * @param value the fromCity
	 */
	public void setFromCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, FROMCITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InclusionExclusion.fromCity</code> attribute. 
	 * @param value the fromCity
	 */
	public void setFromCity(final City value)
	{
		setFromCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InclusionExclusion.fromCountry</code> attribute.
	 * @return the fromCountry
	 */
	public Country getFromCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, FROMCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InclusionExclusion.fromCountry</code> attribute.
	 * @return the fromCountry
	 */
	public Country getFromCountry()
	{
		return getFromCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InclusionExclusion.fromCountry</code> attribute. 
	 * @param value the fromCountry
	 */
	public void setFromCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, FROMCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InclusionExclusion.fromCountry</code> attribute. 
	 * @param value the fromCountry
	 */
	public void setFromCountry(final Country value)
	{
		setFromCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InclusionExclusion.isReturn</code> attribute.
	 * @return the isReturn
	 */
	public Boolean isIsReturn(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISRETURN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InclusionExclusion.isReturn</code> attribute.
	 * @return the isReturn
	 */
	public Boolean isIsReturn()
	{
		return isIsReturn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InclusionExclusion.isReturn</code> attribute. 
	 * @return the isReturn
	 */
	public boolean isIsReturnAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsReturn( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InclusionExclusion.isReturn</code> attribute. 
	 * @return the isReturn
	 */
	public boolean isIsReturnAsPrimitive()
	{
		return isIsReturnAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InclusionExclusion.isReturn</code> attribute. 
	 * @param value the isReturn
	 */
	public void setIsReturn(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISRETURN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InclusionExclusion.isReturn</code> attribute. 
	 * @param value the isReturn
	 */
	public void setIsReturn(final Boolean value)
	{
		setIsReturn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InclusionExclusion.isReturn</code> attribute. 
	 * @param value the isReturn
	 */
	public void setIsReturn(final SessionContext ctx, final boolean value)
	{
		setIsReturn( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InclusionExclusion.isReturn</code> attribute. 
	 * @param value the isReturn
	 */
	public void setIsReturn(final boolean value)
	{
		setIsReturn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InclusionExclusion.toCity</code> attribute.
	 * @return the toCity
	 */
	public City getToCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, TOCITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InclusionExclusion.toCity</code> attribute.
	 * @return the toCity
	 */
	public City getToCity()
	{
		return getToCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InclusionExclusion.toCity</code> attribute. 
	 * @param value the toCity
	 */
	public void setToCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, TOCITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InclusionExclusion.toCity</code> attribute. 
	 * @param value the toCity
	 */
	public void setToCity(final City value)
	{
		setToCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InclusionExclusion.toCountry</code> attribute.
	 * @return the toCountry
	 */
	public Country getToCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, TOCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InclusionExclusion.toCountry</code> attribute.
	 * @return the toCountry
	 */
	public Country getToCountry()
	{
		return getToCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InclusionExclusion.toCountry</code> attribute. 
	 * @param value the toCountry
	 */
	public void setToCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, TOCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InclusionExclusion.toCountry</code> attribute. 
	 * @param value the toCountry
	 */
	public void setToCountry(final Country value)
	{
		setToCountry( getSession().getSessionContext(), value );
	}
	
}
