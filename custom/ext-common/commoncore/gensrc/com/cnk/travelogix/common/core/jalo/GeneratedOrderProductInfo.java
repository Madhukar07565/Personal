/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.PriceInfo;
import com.cnk.travelogix.common.core.jalo.SupplierPriceDetails;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import com.cnk.travelogix.supplier.credentials.core.jalo.SupplierCredentials;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem OrderProductInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOrderProductInfo extends GenericItem
{
	/** Qualifier of the <code>OrderProductInfo.priceInfo</code> attribute **/
	public static final String PRICEINFO = "priceInfo";
	/** Qualifier of the <code>OrderProductInfo.maxQuantity</code> attribute **/
	public static final String MAXQUANTITY = "maxQuantity";
	/** Qualifier of the <code>OrderProductInfo.groupId</code> attribute **/
	public static final String GROUPID = "groupId";
	/** Qualifier of the <code>OrderProductInfo.timeLimitDate</code> attribute **/
	public static final String TIMELIMITDATE = "timeLimitDate";
	/** Qualifier of the <code>OrderProductInfo.sourceSupplier</code> attribute **/
	public static final String SOURCESUPPLIER = "sourceSupplier";
	/** Qualifier of the <code>OrderProductInfo.enablerSupplier</code> attribute **/
	public static final String ENABLERSUPPLIER = "enablerSupplier";
	/** Qualifier of the <code>OrderProductInfo.supplierCredentials</code> attribute **/
	public static final String SUPPLIERCREDENTIALS = "supplierCredentials";
	/** Qualifier of the <code>OrderProductInfo.supplierPriceDetails</code> attribute **/
	public static final String SUPPLIERPRICEDETAILS = "supplierPriceDetails";
	/** Qualifier of the <code>OrderProductInfo.supplierProvisionalBookingId</code> attribute **/
	public static final String SUPPLIERPROVISIONALBOOKINGID = "supplierProvisionalBookingId";
	/** Qualifier of the <code>OrderProductInfo.supplierBookingId</code> attribute **/
	public static final String SUPPLIERBOOKINGID = "supplierBookingId";
	/** Qualifier of the <code>OrderProductInfo.orderStatus</code> attribute **/
	public static final String ORDERSTATUS = "orderStatus";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PRICEINFO, AttributeMode.INITIAL);
		tmp.put(MAXQUANTITY, AttributeMode.INITIAL);
		tmp.put(GROUPID, AttributeMode.INITIAL);
		tmp.put(TIMELIMITDATE, AttributeMode.INITIAL);
		tmp.put(SOURCESUPPLIER, AttributeMode.INITIAL);
		tmp.put(ENABLERSUPPLIER, AttributeMode.INITIAL);
		tmp.put(SUPPLIERCREDENTIALS, AttributeMode.INITIAL);
		tmp.put(SUPPLIERPRICEDETAILS, AttributeMode.INITIAL);
		tmp.put(SUPPLIERPROVISIONALBOOKINGID, AttributeMode.INITIAL);
		tmp.put(SUPPLIERBOOKINGID, AttributeMode.INITIAL);
		tmp.put(ORDERSTATUS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProductInfo.enablerSupplier</code> attribute.
	 * @return the enablerSupplier
	 */
	public Supplier getEnablerSupplier(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, ENABLERSUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProductInfo.enablerSupplier</code> attribute.
	 * @return the enablerSupplier
	 */
	public Supplier getEnablerSupplier()
	{
		return getEnablerSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProductInfo.enablerSupplier</code> attribute. 
	 * @param value the enablerSupplier
	 */
	public void setEnablerSupplier(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, ENABLERSUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProductInfo.enablerSupplier</code> attribute. 
	 * @param value the enablerSupplier
	 */
	public void setEnablerSupplier(final Supplier value)
	{
		setEnablerSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProductInfo.groupId</code> attribute.
	 * @return the groupId
	 */
	public String getGroupId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GROUPID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProductInfo.groupId</code> attribute.
	 * @return the groupId
	 */
	public String getGroupId()
	{
		return getGroupId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProductInfo.groupId</code> attribute. 
	 * @param value the groupId
	 */
	public void setGroupId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GROUPID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProductInfo.groupId</code> attribute. 
	 * @param value the groupId
	 */
	public void setGroupId(final String value)
	{
		setGroupId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProductInfo.maxQuantity</code> attribute.
	 * @return the maxQuantity - Max allowed quantity
	 */
	public Integer getMaxQuantity(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAXQUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProductInfo.maxQuantity</code> attribute.
	 * @return the maxQuantity - Max allowed quantity
	 */
	public Integer getMaxQuantity()
	{
		return getMaxQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProductInfo.maxQuantity</code> attribute. 
	 * @return the maxQuantity - Max allowed quantity
	 */
	public int getMaxQuantityAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaxQuantity( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProductInfo.maxQuantity</code> attribute. 
	 * @return the maxQuantity - Max allowed quantity
	 */
	public int getMaxQuantityAsPrimitive()
	{
		return getMaxQuantityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProductInfo.maxQuantity</code> attribute. 
	 * @param value the maxQuantity - Max allowed quantity
	 */
	public void setMaxQuantity(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAXQUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProductInfo.maxQuantity</code> attribute. 
	 * @param value the maxQuantity - Max allowed quantity
	 */
	public void setMaxQuantity(final Integer value)
	{
		setMaxQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProductInfo.maxQuantity</code> attribute. 
	 * @param value the maxQuantity - Max allowed quantity
	 */
	public void setMaxQuantity(final SessionContext ctx, final int value)
	{
		setMaxQuantity( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProductInfo.maxQuantity</code> attribute. 
	 * @param value the maxQuantity - Max allowed quantity
	 */
	public void setMaxQuantity(final int value)
	{
		setMaxQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProductInfo.orderStatus</code> attribute.
	 * @return the orderStatus
	 */
	public EnumerationValue getOrderStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ORDERSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProductInfo.orderStatus</code> attribute.
	 * @return the orderStatus
	 */
	public EnumerationValue getOrderStatus()
	{
		return getOrderStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProductInfo.orderStatus</code> attribute. 
	 * @param value the orderStatus
	 */
	public void setOrderStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ORDERSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProductInfo.orderStatus</code> attribute. 
	 * @param value the orderStatus
	 */
	public void setOrderStatus(final EnumerationValue value)
	{
		setOrderStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProductInfo.priceInfo</code> attribute.
	 * @return the priceInfo
	 */
	public PriceInfo getPriceInfo(final SessionContext ctx)
	{
		return (PriceInfo)getProperty( ctx, PRICEINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProductInfo.priceInfo</code> attribute.
	 * @return the priceInfo
	 */
	public PriceInfo getPriceInfo()
	{
		return getPriceInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProductInfo.priceInfo</code> attribute. 
	 * @param value the priceInfo
	 */
	public void setPriceInfo(final SessionContext ctx, final PriceInfo value)
	{
		setProperty(ctx, PRICEINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProductInfo.priceInfo</code> attribute. 
	 * @param value the priceInfo
	 */
	public void setPriceInfo(final PriceInfo value)
	{
		setPriceInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProductInfo.sourceSupplier</code> attribute.
	 * @return the sourceSupplier
	 */
	public Supplier getSourceSupplier(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, SOURCESUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProductInfo.sourceSupplier</code> attribute.
	 * @return the sourceSupplier
	 */
	public Supplier getSourceSupplier()
	{
		return getSourceSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProductInfo.sourceSupplier</code> attribute. 
	 * @param value the sourceSupplier
	 */
	public void setSourceSupplier(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, SOURCESUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProductInfo.sourceSupplier</code> attribute. 
	 * @param value the sourceSupplier
	 */
	public void setSourceSupplier(final Supplier value)
	{
		setSourceSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProductInfo.supplierBookingId</code> attribute.
	 * @return the supplierBookingId
	 */
	public String getSupplierBookingId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUPPLIERBOOKINGID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProductInfo.supplierBookingId</code> attribute.
	 * @return the supplierBookingId
	 */
	public String getSupplierBookingId()
	{
		return getSupplierBookingId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProductInfo.supplierBookingId</code> attribute. 
	 * @param value the supplierBookingId
	 */
	public void setSupplierBookingId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUPPLIERBOOKINGID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProductInfo.supplierBookingId</code> attribute. 
	 * @param value the supplierBookingId
	 */
	public void setSupplierBookingId(final String value)
	{
		setSupplierBookingId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProductInfo.supplierCredentials</code> attribute.
	 * @return the supplierCredentials
	 */
	public SupplierCredentials getSupplierCredentials(final SessionContext ctx)
	{
		return (SupplierCredentials)getProperty( ctx, SUPPLIERCREDENTIALS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProductInfo.supplierCredentials</code> attribute.
	 * @return the supplierCredentials
	 */
	public SupplierCredentials getSupplierCredentials()
	{
		return getSupplierCredentials( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProductInfo.supplierCredentials</code> attribute. 
	 * @param value the supplierCredentials
	 */
	public void setSupplierCredentials(final SessionContext ctx, final SupplierCredentials value)
	{
		setProperty(ctx, SUPPLIERCREDENTIALS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProductInfo.supplierCredentials</code> attribute. 
	 * @param value the supplierCredentials
	 */
	public void setSupplierCredentials(final SupplierCredentials value)
	{
		setSupplierCredentials( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProductInfo.supplierPriceDetails</code> attribute.
	 * @return the supplierPriceDetails
	 */
	public SupplierPriceDetails getSupplierPriceDetails(final SessionContext ctx)
	{
		return (SupplierPriceDetails)getProperty( ctx, SUPPLIERPRICEDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProductInfo.supplierPriceDetails</code> attribute.
	 * @return the supplierPriceDetails
	 */
	public SupplierPriceDetails getSupplierPriceDetails()
	{
		return getSupplierPriceDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProductInfo.supplierPriceDetails</code> attribute. 
	 * @param value the supplierPriceDetails
	 */
	public void setSupplierPriceDetails(final SessionContext ctx, final SupplierPriceDetails value)
	{
		setProperty(ctx, SUPPLIERPRICEDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProductInfo.supplierPriceDetails</code> attribute. 
	 * @param value the supplierPriceDetails
	 */
	public void setSupplierPriceDetails(final SupplierPriceDetails value)
	{
		setSupplierPriceDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProductInfo.supplierProvisionalBookingId</code> attribute.
	 * @return the supplierProvisionalBookingId
	 */
	public String getSupplierProvisionalBookingId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUPPLIERPROVISIONALBOOKINGID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProductInfo.supplierProvisionalBookingId</code> attribute.
	 * @return the supplierProvisionalBookingId
	 */
	public String getSupplierProvisionalBookingId()
	{
		return getSupplierProvisionalBookingId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProductInfo.supplierProvisionalBookingId</code> attribute. 
	 * @param value the supplierProvisionalBookingId
	 */
	public void setSupplierProvisionalBookingId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUPPLIERPROVISIONALBOOKINGID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProductInfo.supplierProvisionalBookingId</code> attribute. 
	 * @param value the supplierProvisionalBookingId
	 */
	public void setSupplierProvisionalBookingId(final String value)
	{
		setSupplierProvisionalBookingId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProductInfo.timeLimitDate</code> attribute.
	 * @return the timeLimitDate - If user checked timelimit checkbox.
	 */
	public Date getTimeLimitDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, TIMELIMITDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProductInfo.timeLimitDate</code> attribute.
	 * @return the timeLimitDate - If user checked timelimit checkbox.
	 */
	public Date getTimeLimitDate()
	{
		return getTimeLimitDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProductInfo.timeLimitDate</code> attribute. 
	 * @param value the timeLimitDate - If user checked timelimit checkbox.
	 */
	public void setTimeLimitDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, TIMELIMITDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProductInfo.timeLimitDate</code> attribute. 
	 * @param value the timeLimitDate - If user checked timelimit checkbox.
	 */
	public void setTimeLimitDate(final Date value)
	{
		setTimeLimitDate( getSession().getSessionContext(), value );
	}
	
}
