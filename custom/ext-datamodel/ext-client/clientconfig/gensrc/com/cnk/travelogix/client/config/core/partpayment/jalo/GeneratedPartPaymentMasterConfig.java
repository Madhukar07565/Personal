/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.partpayment.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.partpayment.jalo.PartPaymentSchedule;
import com.cnk.travelogix.client.config.core.partpayment.jalo.ProductInformation;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import com.cnk.travelogix.product.common.core.jalo.PointOfSale;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.partpayment.jalo.PartPaymentMasterConfig PartPaymentMasterConfig}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPartPaymentMasterConfig extends AbstractTravelogixItem
{
	/** Qualifier of the <code>PartPaymentMasterConfig.partPaymentId</code> attribute **/
	public static final String PARTPAYMENTID = "partPaymentId";
	/** Qualifier of the <code>PartPaymentMasterConfig.effectiveFrom</code> attribute **/
	public static final String EFFECTIVEFROM = "effectiveFrom";
	/** Qualifier of the <code>PartPaymentMasterConfig.entityName</code> attribute **/
	public static final String ENTITYNAME = "entityName";
	/** Qualifier of the <code>PartPaymentMasterConfig.pointOfSale</code> attribute **/
	public static final String POINTOFSALE = "pointOfSale";
	/** Qualifier of the <code>PartPaymentMasterConfig.productInformation</code> attribute **/
	public static final String PRODUCTINFORMATION = "productInformation";
	/** Qualifier of the <code>PartPaymentMasterConfig.partPaymentSchedule</code> attribute **/
	public static final String PARTPAYMENTSCHEDULE = "partPaymentSchedule";
	/**
	* {@link OneToManyHandler} for handling 1:n POINTOFSALE's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PointOfSale> POINTOFSALEHANDLER = new OneToManyHandler<PointOfSale>(
	CommonproductcoreConstants.TC.POINTOFSALE,
	false,
	"partPaymentMasterConfig",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PRODUCTINFORMATION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ProductInformation> PRODUCTINFORMATIONHANDLER = new OneToManyHandler<ProductInformation>(
	ClientconfigConstants.TC.PRODUCTINFORMATION,
	false,
	"partPaymentMasterConfig",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PARTPAYMENTSCHEDULE's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PartPaymentSchedule> PARTPAYMENTSCHEDULEHANDLER = new OneToManyHandler<PartPaymentSchedule>(
	ClientconfigConstants.TC.PARTPAYMENTSCHEDULE,
	false,
	"partPaymentMasterConfig",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PARTPAYMENTID, AttributeMode.INITIAL);
		tmp.put(EFFECTIVEFROM, AttributeMode.INITIAL);
		tmp.put(ENTITYNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentMasterConfig.effectiveFrom</code> attribute.
	 * @return the effectiveFrom - Effective from Date
	 */
	public Date getEffectiveFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EFFECTIVEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentMasterConfig.effectiveFrom</code> attribute.
	 * @return the effectiveFrom - Effective from Date
	 */
	public Date getEffectiveFrom()
	{
		return getEffectiveFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentMasterConfig.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom - Effective from Date
	 */
	public void setEffectiveFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EFFECTIVEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentMasterConfig.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom - Effective from Date
	 */
	public void setEffectiveFrom(final Date value)
	{
		setEffectiveFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentMasterConfig.entityName</code> attribute.
	 * @return the entityName
	 */
	public Principal getEntityName(final SessionContext ctx)
	{
		return (Principal)getProperty( ctx, ENTITYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentMasterConfig.entityName</code> attribute.
	 * @return the entityName
	 */
	public Principal getEntityName()
	{
		return getEntityName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentMasterConfig.entityName</code> attribute. 
	 * @param value the entityName
	 */
	public void setEntityName(final SessionContext ctx, final Principal value)
	{
		setProperty(ctx, ENTITYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentMasterConfig.entityName</code> attribute. 
	 * @param value the entityName
	 */
	public void setEntityName(final Principal value)
	{
		setEntityName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentMasterConfig.partPaymentId</code> attribute.
	 * @return the partPaymentId
	 */
	public String getPartPaymentId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PARTPAYMENTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentMasterConfig.partPaymentId</code> attribute.
	 * @return the partPaymentId
	 */
	public String getPartPaymentId()
	{
		return getPartPaymentId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentMasterConfig.partPaymentId</code> attribute. 
	 * @param value the partPaymentId
	 */
	public void setPartPaymentId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PARTPAYMENTID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentMasterConfig.partPaymentId</code> attribute. 
	 * @param value the partPaymentId
	 */
	public void setPartPaymentId(final String value)
	{
		setPartPaymentId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentMasterConfig.partPaymentSchedule</code> attribute.
	 * @return the partPaymentSchedule
	 */
	public Set<PartPaymentSchedule> getPartPaymentSchedule(final SessionContext ctx)
	{
		return (Set<PartPaymentSchedule>)PARTPAYMENTSCHEDULEHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentMasterConfig.partPaymentSchedule</code> attribute.
	 * @return the partPaymentSchedule
	 */
	public Set<PartPaymentSchedule> getPartPaymentSchedule()
	{
		return getPartPaymentSchedule( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentMasterConfig.partPaymentSchedule</code> attribute. 
	 * @param value the partPaymentSchedule
	 */
	public void setPartPaymentSchedule(final SessionContext ctx, final Set<PartPaymentSchedule> value)
	{
		PARTPAYMENTSCHEDULEHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentMasterConfig.partPaymentSchedule</code> attribute. 
	 * @param value the partPaymentSchedule
	 */
	public void setPartPaymentSchedule(final Set<PartPaymentSchedule> value)
	{
		setPartPaymentSchedule( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to partPaymentSchedule. 
	 * @param value the item to add to partPaymentSchedule
	 */
	public void addToPartPaymentSchedule(final SessionContext ctx, final PartPaymentSchedule value)
	{
		PARTPAYMENTSCHEDULEHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to partPaymentSchedule. 
	 * @param value the item to add to partPaymentSchedule
	 */
	public void addToPartPaymentSchedule(final PartPaymentSchedule value)
	{
		addToPartPaymentSchedule( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from partPaymentSchedule. 
	 * @param value the item to remove from partPaymentSchedule
	 */
	public void removeFromPartPaymentSchedule(final SessionContext ctx, final PartPaymentSchedule value)
	{
		PARTPAYMENTSCHEDULEHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from partPaymentSchedule. 
	 * @param value the item to remove from partPaymentSchedule
	 */
	public void removeFromPartPaymentSchedule(final PartPaymentSchedule value)
	{
		removeFromPartPaymentSchedule( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentMasterConfig.pointOfSale</code> attribute.
	 * @return the pointOfSale
	 */
	public Collection<PointOfSale> getPointOfSale(final SessionContext ctx)
	{
		return POINTOFSALEHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentMasterConfig.pointOfSale</code> attribute.
	 * @return the pointOfSale
	 */
	public Collection<PointOfSale> getPointOfSale()
	{
		return getPointOfSale( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentMasterConfig.pointOfSale</code> attribute. 
	 * @param value the pointOfSale
	 */
	public void setPointOfSale(final SessionContext ctx, final Collection<PointOfSale> value)
	{
		POINTOFSALEHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentMasterConfig.pointOfSale</code> attribute. 
	 * @param value the pointOfSale
	 */
	public void setPointOfSale(final Collection<PointOfSale> value)
	{
		setPointOfSale( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to pointOfSale. 
	 * @param value the item to add to pointOfSale
	 */
	public void addToPointOfSale(final SessionContext ctx, final PointOfSale value)
	{
		POINTOFSALEHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to pointOfSale. 
	 * @param value the item to add to pointOfSale
	 */
	public void addToPointOfSale(final PointOfSale value)
	{
		addToPointOfSale( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from pointOfSale. 
	 * @param value the item to remove from pointOfSale
	 */
	public void removeFromPointOfSale(final SessionContext ctx, final PointOfSale value)
	{
		POINTOFSALEHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from pointOfSale. 
	 * @param value the item to remove from pointOfSale
	 */
	public void removeFromPointOfSale(final PointOfSale value)
	{
		removeFromPointOfSale( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentMasterConfig.productInformation</code> attribute.
	 * @return the productInformation
	 */
	public Set<ProductInformation> getProductInformation(final SessionContext ctx)
	{
		return (Set<ProductInformation>)PRODUCTINFORMATIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentMasterConfig.productInformation</code> attribute.
	 * @return the productInformation
	 */
	public Set<ProductInformation> getProductInformation()
	{
		return getProductInformation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentMasterConfig.productInformation</code> attribute. 
	 * @param value the productInformation
	 */
	public void setProductInformation(final SessionContext ctx, final Set<ProductInformation> value)
	{
		PRODUCTINFORMATIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentMasterConfig.productInformation</code> attribute. 
	 * @param value the productInformation
	 */
	public void setProductInformation(final Set<ProductInformation> value)
	{
		setProductInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productInformation. 
	 * @param value the item to add to productInformation
	 */
	public void addToProductInformation(final SessionContext ctx, final ProductInformation value)
	{
		PRODUCTINFORMATIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productInformation. 
	 * @param value the item to add to productInformation
	 */
	public void addToProductInformation(final ProductInformation value)
	{
		addToProductInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productInformation. 
	 * @param value the item to remove from productInformation
	 */
	public void removeFromProductInformation(final SessionContext ctx, final ProductInformation value)
	{
		PRODUCTINFORMATIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productInformation. 
	 * @param value the item to remove from productInformation
	 */
	public void removeFromProductInformation(final ProductInformation value)
	{
		removeFromProductInformation( getSession().getSessionContext(), value );
	}
	
}
