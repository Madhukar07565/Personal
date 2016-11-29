/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transportinventory.core.jalo;

import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.product.transport.masters.core.jalo.FlightProduct;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.transportinventory.core.jalo.AbstractCouponDetail AbstractCouponDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractCouponDetail extends AbstractTravelogixItem
{
	/** Qualifier of the <code>AbstractCouponDetail.purchaseFor</code> attribute **/
	public static final String PURCHASEFOR = "purchaseFor";
	/** Qualifier of the <code>AbstractCouponDetail.typeOfCoupon</code> attribute **/
	public static final String TYPEOFCOUPON = "typeOfCoupon";
	/** Qualifier of the <code>AbstractCouponDetail.couponSchemeName</code> attribute **/
	public static final String COUPONSCHEMENAME = "couponSchemeName";
	/** Qualifier of the <code>AbstractCouponDetail.schemeDescription</code> attribute **/
	public static final String SCHEMEDESCRIPTION = "schemeDescription";
	/** Qualifier of the <code>AbstractCouponDetail.cabinClass</code> attribute **/
	public static final String CABINCLASS = "cabinClass";
	/** Qualifier of the <code>AbstractCouponDetail.rbd</code> attribute **/
	public static final String RBD = "rbd";
	/** Qualifier of the <code>AbstractCouponDetail.unit</code> attribute **/
	public static final String UNIT = "unit";
	/** Qualifier of the <code>AbstractCouponDetail.numberOfBooklets</code> attribute **/
	public static final String NUMBEROFBOOKLETS = "numberOfBooklets";
	/** Qualifier of the <code>AbstractCouponDetail.numberOfCoupons</code> attribute **/
	public static final String NUMBEROFCOUPONS = "numberOfCoupons";
	/** Qualifier of the <code>AbstractCouponDetail.airLine</code> attribute **/
	public static final String AIRLINE = "airLine";
	/** Qualifier of the <code>AbstractCouponDetail.supplier</code> attribute **/
	public static final String SUPPLIER = "supplier";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PURCHASEFOR, AttributeMode.INITIAL);
		tmp.put(TYPEOFCOUPON, AttributeMode.INITIAL);
		tmp.put(COUPONSCHEMENAME, AttributeMode.INITIAL);
		tmp.put(SCHEMEDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(CABINCLASS, AttributeMode.INITIAL);
		tmp.put(RBD, AttributeMode.INITIAL);
		tmp.put(UNIT, AttributeMode.INITIAL);
		tmp.put(NUMBEROFBOOKLETS, AttributeMode.INITIAL);
		tmp.put(NUMBEROFCOUPONS, AttributeMode.INITIAL);
		tmp.put(AIRLINE, AttributeMode.INITIAL);
		tmp.put(SUPPLIER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.airLine</code> attribute.
	 * @return the airLine
	 */
	public FlightProduct getAirLine(final SessionContext ctx)
	{
		return (FlightProduct)getProperty( ctx, AIRLINE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.airLine</code> attribute.
	 * @return the airLine
	 */
	public FlightProduct getAirLine()
	{
		return getAirLine( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.airLine</code> attribute. 
	 * @param value the airLine
	 */
	public void setAirLine(final SessionContext ctx, final FlightProduct value)
	{
		setProperty(ctx, AIRLINE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.airLine</code> attribute. 
	 * @param value the airLine
	 */
	public void setAirLine(final FlightProduct value)
	{
		setAirLine( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.cabinClass</code> attribute.
	 * @return the cabinClass
	 */
	public EnumerationValue getCabinClass(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CABINCLASS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.cabinClass</code> attribute.
	 * @return the cabinClass
	 */
	public EnumerationValue getCabinClass()
	{
		return getCabinClass( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.cabinClass</code> attribute. 
	 * @param value the cabinClass
	 */
	public void setCabinClass(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CABINCLASS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.cabinClass</code> attribute. 
	 * @param value the cabinClass
	 */
	public void setCabinClass(final EnumerationValue value)
	{
		setCabinClass( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.couponSchemeName</code> attribute.
	 * @return the couponSchemeName
	 */
	public String getCouponSchemeName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractCouponDetail.getCouponSchemeName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, COUPONSCHEMENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.couponSchemeName</code> attribute.
	 * @return the couponSchemeName
	 */
	public String getCouponSchemeName()
	{
		return getCouponSchemeName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.couponSchemeName</code> attribute. 
	 * @return the localized couponSchemeName
	 */
	public Map<Language,String> getAllCouponSchemeName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,COUPONSCHEMENAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.couponSchemeName</code> attribute. 
	 * @return the localized couponSchemeName
	 */
	public Map<Language,String> getAllCouponSchemeName()
	{
		return getAllCouponSchemeName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.couponSchemeName</code> attribute. 
	 * @param value the couponSchemeName
	 */
	public void setCouponSchemeName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractCouponDetail.setCouponSchemeName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, COUPONSCHEMENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.couponSchemeName</code> attribute. 
	 * @param value the couponSchemeName
	 */
	public void setCouponSchemeName(final String value)
	{
		setCouponSchemeName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.couponSchemeName</code> attribute. 
	 * @param value the couponSchemeName
	 */
	public void setAllCouponSchemeName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,COUPONSCHEMENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.couponSchemeName</code> attribute. 
	 * @param value the couponSchemeName
	 */
	public void setAllCouponSchemeName(final Map<Language,String> value)
	{
		setAllCouponSchemeName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.numberOfBooklets</code> attribute.
	 * @return the numberOfBooklets
	 */
	public Integer getNumberOfBooklets(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NUMBEROFBOOKLETS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.numberOfBooklets</code> attribute.
	 * @return the numberOfBooklets
	 */
	public Integer getNumberOfBooklets()
	{
		return getNumberOfBooklets( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.numberOfBooklets</code> attribute. 
	 * @return the numberOfBooklets
	 */
	public int getNumberOfBookletsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNumberOfBooklets( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.numberOfBooklets</code> attribute. 
	 * @return the numberOfBooklets
	 */
	public int getNumberOfBookletsAsPrimitive()
	{
		return getNumberOfBookletsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.numberOfBooklets</code> attribute. 
	 * @param value the numberOfBooklets
	 */
	public void setNumberOfBooklets(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NUMBEROFBOOKLETS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.numberOfBooklets</code> attribute. 
	 * @param value the numberOfBooklets
	 */
	public void setNumberOfBooklets(final Integer value)
	{
		setNumberOfBooklets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.numberOfBooklets</code> attribute. 
	 * @param value the numberOfBooklets
	 */
	public void setNumberOfBooklets(final SessionContext ctx, final int value)
	{
		setNumberOfBooklets( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.numberOfBooklets</code> attribute. 
	 * @param value the numberOfBooklets
	 */
	public void setNumberOfBooklets(final int value)
	{
		setNumberOfBooklets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.numberOfCoupons</code> attribute.
	 * @return the numberOfCoupons
	 */
	public Integer getNumberOfCoupons(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NUMBEROFCOUPONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.numberOfCoupons</code> attribute.
	 * @return the numberOfCoupons
	 */
	public Integer getNumberOfCoupons()
	{
		return getNumberOfCoupons( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.numberOfCoupons</code> attribute. 
	 * @return the numberOfCoupons
	 */
	public int getNumberOfCouponsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNumberOfCoupons( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.numberOfCoupons</code> attribute. 
	 * @return the numberOfCoupons
	 */
	public int getNumberOfCouponsAsPrimitive()
	{
		return getNumberOfCouponsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.numberOfCoupons</code> attribute. 
	 * @param value the numberOfCoupons
	 */
	public void setNumberOfCoupons(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NUMBEROFCOUPONS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.numberOfCoupons</code> attribute. 
	 * @param value the numberOfCoupons
	 */
	public void setNumberOfCoupons(final Integer value)
	{
		setNumberOfCoupons( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.numberOfCoupons</code> attribute. 
	 * @param value the numberOfCoupons
	 */
	public void setNumberOfCoupons(final SessionContext ctx, final int value)
	{
		setNumberOfCoupons( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.numberOfCoupons</code> attribute. 
	 * @param value the numberOfCoupons
	 */
	public void setNumberOfCoupons(final int value)
	{
		setNumberOfCoupons( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.purchaseFor</code> attribute.
	 * @return the purchaseFor
	 */
	public EnumerationValue getPurchaseFor(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PURCHASEFOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.purchaseFor</code> attribute.
	 * @return the purchaseFor
	 */
	public EnumerationValue getPurchaseFor()
	{
		return getPurchaseFor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.purchaseFor</code> attribute. 
	 * @param value the purchaseFor
	 */
	public void setPurchaseFor(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PURCHASEFOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.purchaseFor</code> attribute. 
	 * @param value the purchaseFor
	 */
	public void setPurchaseFor(final EnumerationValue value)
	{
		setPurchaseFor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.rbd</code> attribute.
	 * @return the rbd
	 */
	public EnumerationValue getRbd(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RBD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.rbd</code> attribute.
	 * @return the rbd
	 */
	public EnumerationValue getRbd()
	{
		return getRbd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.rbd</code> attribute. 
	 * @param value the rbd
	 */
	public void setRbd(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RBD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.rbd</code> attribute. 
	 * @param value the rbd
	 */
	public void setRbd(final EnumerationValue value)
	{
		setRbd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.schemeDescription</code> attribute.
	 * @return the schemeDescription
	 */
	public String getSchemeDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractCouponDetail.getSchemeDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, SCHEMEDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.schemeDescription</code> attribute.
	 * @return the schemeDescription
	 */
	public String getSchemeDescription()
	{
		return getSchemeDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.schemeDescription</code> attribute. 
	 * @return the localized schemeDescription
	 */
	public Map<Language,String> getAllSchemeDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,SCHEMEDESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.schemeDescription</code> attribute. 
	 * @return the localized schemeDescription
	 */
	public Map<Language,String> getAllSchemeDescription()
	{
		return getAllSchemeDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.schemeDescription</code> attribute. 
	 * @param value the schemeDescription
	 */
	public void setSchemeDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractCouponDetail.setSchemeDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, SCHEMEDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.schemeDescription</code> attribute. 
	 * @param value the schemeDescription
	 */
	public void setSchemeDescription(final String value)
	{
		setSchemeDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.schemeDescription</code> attribute. 
	 * @param value the schemeDescription
	 */
	public void setAllSchemeDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,SCHEMEDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.schemeDescription</code> attribute. 
	 * @param value the schemeDescription
	 */
	public void setAllSchemeDescription(final Map<Language,String> value)
	{
		setAllSchemeDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, SUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier()
	{
		return getSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, SUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final Supplier value)
	{
		setSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.typeOfCoupon</code> attribute.
	 * @return the typeOfCoupon
	 */
	public EnumerationValue getTypeOfCoupon(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPEOFCOUPON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.typeOfCoupon</code> attribute.
	 * @return the typeOfCoupon
	 */
	public EnumerationValue getTypeOfCoupon()
	{
		return getTypeOfCoupon( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.typeOfCoupon</code> attribute. 
	 * @param value the typeOfCoupon
	 */
	public void setTypeOfCoupon(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPEOFCOUPON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.typeOfCoupon</code> attribute. 
	 * @param value the typeOfCoupon
	 */
	public void setTypeOfCoupon(final EnumerationValue value)
	{
		setTypeOfCoupon( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.unit</code> attribute.
	 * @return the unit
	 */
	public EnumerationValue getUnit(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, UNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCouponDetail.unit</code> attribute.
	 * @return the unit
	 */
	public EnumerationValue getUnit()
	{
		return getUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.unit</code> attribute. 
	 * @param value the unit
	 */
	public void setUnit(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, UNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCouponDetail.unit</code> attribute. 
	 * @param value the unit
	 */
	public void setUnit(final EnumerationValue value)
	{
		setUnit( getSession().getSessionContext(), value );
	}
	
}
