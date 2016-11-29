/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.accoinventory.core.jalo;

import com.cnk.travelogix.acco.inventory.core.constants.AccoinventorycoreConstants;
import com.cnk.travelogix.accoinventory.core.jalo.AbstractAccoInventoryDetail;
import com.cnk.travelogix.accoinventory.core.jalo.AccoInventoryDetail;
import com.cnk.travelogix.common.inventory.core.jalo.AccoAssociateInventory;
import com.cnk.travelogix.masterdata.core.proucts.jalo.RateType;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.accoinventory.core.jalo.InventoryRoomInfo InventoryRoomInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedInventoryRoomInfo extends GenericItem
{
	/** Qualifier of the <code>InventoryRoomInfo.roomCategory</code> attribute **/
	public static final String ROOMCATEGORY = "roomCategory";
	/** Qualifier of the <code>InventoryRoomInfo.roomType</code> attribute **/
	public static final String ROOMTYPE = "roomType";
	/** Qualifier of the <code>InventoryRoomInfo.noOfRoomRequested</code> attribute **/
	public static final String NOOFROOMREQUESTED = "noOfRoomRequested";
	/** Qualifier of the <code>InventoryRoomInfo.supplierReferenceNumber</code> attribute **/
	public static final String SUPPLIERREFERENCENUMBER = "supplierReferenceNumber";
	/** Qualifier of the <code>InventoryRoomInfo.rateCode</code> attribute **/
	public static final String RATECODE = "rateCode";
	/** Qualifier of the <code>InventoryRoomInfo.rateType</code> attribute **/
	public static final String RATETYPE = "rateType";
	/** Qualifier of the <code>InventoryRoomInfo.inventoryAssociation</code> attribute **/
	public static final String INVENTORYASSOCIATION = "inventoryAssociation";
	/** Qualifier of the <code>InventoryRoomInfo.daysOfWeek</code> attribute **/
	public static final String DAYSOFWEEK = "daysOfWeek";
	/** Qualifier of the <code>InventoryRoomInfo.distressSalesUtilizationThreshhold</code> attribute **/
	public static final String DISTRESSSALESUTILIZATIONTHRESHHOLD = "distressSalesUtilizationThreshhold";
	/** Qualifier of the <code>InventoryRoomInfo.distressSalesThreshholdCutOffDays</code> attribute **/
	public static final String DISTRESSSALESTHRESHHOLDCUTOFFDAYS = "distressSalesThreshholdCutOffDays";
	/** Qualifier of the <code>InventoryRoomInfo.requestedQuantity</code> attribute **/
	public static final String REQUESTEDQUANTITY = "requestedQuantity";
	/** Qualifier of the <code>InventoryRoomInfo.distributedQuantity</code> attribute **/
	public static final String DISTRIBUTEDQUANTITY = "distributedQuantity";
	/** Qualifier of the <code>InventoryRoomInfo.availableQuantity</code> attribute **/
	public static final String AVAILABLEQUANTITY = "availableQuantity";
	/** Qualifier of the <code>InventoryRoomInfo.reservedQuantity</code> attribute **/
	public static final String RESERVEDQUANTITY = "reservedQuantity";
	/** Qualifier of the <code>InventoryRoomInfo.cutOffDaysForBlockedQuantity</code> attribute **/
	public static final String CUTOFFDAYSFORBLOCKEDQUANTITY = "cutOffDaysForBlockedQuantity";
	/** Qualifier of the <code>InventoryRoomInfo.stopSales</code> attribute **/
	public static final String STOPSALES = "stopSales";
	/** Qualifier of the <code>InventoryRoomInfo.liabilityOnUtilization</code> attribute **/
	public static final String LIABILITYONUTILIZATION = "liabilityOnUtilization";
	/** Qualifier of the <code>InventoryRoomInfo.accoInventoryDetail</code> attribute **/
	public static final String ACCOINVENTORYDETAIL = "accoInventoryDetail";
	/** Qualifier of the <code>InventoryRoomInfo.abstractAccoInventoryDetail</code> attribute **/
	public static final String ABSTRACTACCOINVENTORYDETAIL = "abstractAccoInventoryDetail";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACCOINVENTORYDETAIL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedInventoryRoomInfo> ACCOINVENTORYDETAILHANDLER = new BidirectionalOneToManyHandler<GeneratedInventoryRoomInfo>(
	AccoinventorycoreConstants.TC.INVENTORYROOMINFO,
	false,
	"accoInventoryDetail",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ABSTRACTACCOINVENTORYDETAIL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedInventoryRoomInfo> ABSTRACTACCOINVENTORYDETAILHANDLER = new BidirectionalOneToManyHandler<GeneratedInventoryRoomInfo>(
	AccoinventorycoreConstants.TC.INVENTORYROOMINFO,
	false,
	"abstractAccoInventoryDetail",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ROOMCATEGORY, AttributeMode.INITIAL);
		tmp.put(ROOMTYPE, AttributeMode.INITIAL);
		tmp.put(NOOFROOMREQUESTED, AttributeMode.INITIAL);
		tmp.put(SUPPLIERREFERENCENUMBER, AttributeMode.INITIAL);
		tmp.put(RATECODE, AttributeMode.INITIAL);
		tmp.put(RATETYPE, AttributeMode.INITIAL);
		tmp.put(INVENTORYASSOCIATION, AttributeMode.INITIAL);
		tmp.put(DAYSOFWEEK, AttributeMode.INITIAL);
		tmp.put(DISTRESSSALESUTILIZATIONTHRESHHOLD, AttributeMode.INITIAL);
		tmp.put(DISTRESSSALESTHRESHHOLDCUTOFFDAYS, AttributeMode.INITIAL);
		tmp.put(REQUESTEDQUANTITY, AttributeMode.INITIAL);
		tmp.put(DISTRIBUTEDQUANTITY, AttributeMode.INITIAL);
		tmp.put(AVAILABLEQUANTITY, AttributeMode.INITIAL);
		tmp.put(RESERVEDQUANTITY, AttributeMode.INITIAL);
		tmp.put(CUTOFFDAYSFORBLOCKEDQUANTITY, AttributeMode.INITIAL);
		tmp.put(STOPSALES, AttributeMode.INITIAL);
		tmp.put(LIABILITYONUTILIZATION, AttributeMode.INITIAL);
		tmp.put(ACCOINVENTORYDETAIL, AttributeMode.INITIAL);
		tmp.put(ABSTRACTACCOINVENTORYDETAIL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.abstractAccoInventoryDetail</code> attribute.
	 * @return the abstractAccoInventoryDetail
	 */
	public AbstractAccoInventoryDetail getAbstractAccoInventoryDetail(final SessionContext ctx)
	{
		return (AbstractAccoInventoryDetail)getProperty( ctx, ABSTRACTACCOINVENTORYDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.abstractAccoInventoryDetail</code> attribute.
	 * @return the abstractAccoInventoryDetail
	 */
	public AbstractAccoInventoryDetail getAbstractAccoInventoryDetail()
	{
		return getAbstractAccoInventoryDetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.abstractAccoInventoryDetail</code> attribute. 
	 * @param value the abstractAccoInventoryDetail
	 */
	public void setAbstractAccoInventoryDetail(final SessionContext ctx, final AbstractAccoInventoryDetail value)
	{
		ABSTRACTACCOINVENTORYDETAILHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.abstractAccoInventoryDetail</code> attribute. 
	 * @param value the abstractAccoInventoryDetail
	 */
	public void setAbstractAccoInventoryDetail(final AbstractAccoInventoryDetail value)
	{
		setAbstractAccoInventoryDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.accoInventoryDetail</code> attribute.
	 * @return the accoInventoryDetail
	 */
	public AccoInventoryDetail getAccoInventoryDetail(final SessionContext ctx)
	{
		return (AccoInventoryDetail)getProperty( ctx, ACCOINVENTORYDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.accoInventoryDetail</code> attribute.
	 * @return the accoInventoryDetail
	 */
	public AccoInventoryDetail getAccoInventoryDetail()
	{
		return getAccoInventoryDetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.accoInventoryDetail</code> attribute. 
	 * @param value the accoInventoryDetail
	 */
	public void setAccoInventoryDetail(final SessionContext ctx, final AccoInventoryDetail value)
	{
		ACCOINVENTORYDETAILHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.accoInventoryDetail</code> attribute. 
	 * @param value the accoInventoryDetail
	 */
	public void setAccoInventoryDetail(final AccoInventoryDetail value)
	{
		setAccoInventoryDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.availableQuantity</code> attribute.
	 * @return the availableQuantity - Available  Quantity
	 */
	public Long getAvailableQuantity(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, AVAILABLEQUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.availableQuantity</code> attribute.
	 * @return the availableQuantity - Available  Quantity
	 */
	public Long getAvailableQuantity()
	{
		return getAvailableQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.availableQuantity</code> attribute. 
	 * @return the availableQuantity - Available  Quantity
	 */
	public long getAvailableQuantityAsPrimitive(final SessionContext ctx)
	{
		Long value = getAvailableQuantity( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.availableQuantity</code> attribute. 
	 * @return the availableQuantity - Available  Quantity
	 */
	public long getAvailableQuantityAsPrimitive()
	{
		return getAvailableQuantityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.availableQuantity</code> attribute. 
	 * @param value the availableQuantity - Available  Quantity
	 */
	public void setAvailableQuantity(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, AVAILABLEQUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.availableQuantity</code> attribute. 
	 * @param value the availableQuantity - Available  Quantity
	 */
	public void setAvailableQuantity(final Long value)
	{
		setAvailableQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.availableQuantity</code> attribute. 
	 * @param value the availableQuantity - Available  Quantity
	 */
	public void setAvailableQuantity(final SessionContext ctx, final long value)
	{
		setAvailableQuantity( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.availableQuantity</code> attribute. 
	 * @param value the availableQuantity - Available  Quantity
	 */
	public void setAvailableQuantity(final long value)
	{
		setAvailableQuantity( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACCOINVENTORYDETAILHANDLER.newInstance(ctx, allAttributes);
		ABSTRACTACCOINVENTORYDETAILHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.cutOffDaysForBlockedQuantity</code> attribute.
	 * @return the cutOffDaysForBlockedQuantity - Reserved Quantity
	 */
	public Long getCutOffDaysForBlockedQuantity(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, CUTOFFDAYSFORBLOCKEDQUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.cutOffDaysForBlockedQuantity</code> attribute.
	 * @return the cutOffDaysForBlockedQuantity - Reserved Quantity
	 */
	public Long getCutOffDaysForBlockedQuantity()
	{
		return getCutOffDaysForBlockedQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.cutOffDaysForBlockedQuantity</code> attribute. 
	 * @return the cutOffDaysForBlockedQuantity - Reserved Quantity
	 */
	public long getCutOffDaysForBlockedQuantityAsPrimitive(final SessionContext ctx)
	{
		Long value = getCutOffDaysForBlockedQuantity( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.cutOffDaysForBlockedQuantity</code> attribute. 
	 * @return the cutOffDaysForBlockedQuantity - Reserved Quantity
	 */
	public long getCutOffDaysForBlockedQuantityAsPrimitive()
	{
		return getCutOffDaysForBlockedQuantityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.cutOffDaysForBlockedQuantity</code> attribute. 
	 * @param value the cutOffDaysForBlockedQuantity - Reserved Quantity
	 */
	public void setCutOffDaysForBlockedQuantity(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, CUTOFFDAYSFORBLOCKEDQUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.cutOffDaysForBlockedQuantity</code> attribute. 
	 * @param value the cutOffDaysForBlockedQuantity - Reserved Quantity
	 */
	public void setCutOffDaysForBlockedQuantity(final Long value)
	{
		setCutOffDaysForBlockedQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.cutOffDaysForBlockedQuantity</code> attribute. 
	 * @param value the cutOffDaysForBlockedQuantity - Reserved Quantity
	 */
	public void setCutOffDaysForBlockedQuantity(final SessionContext ctx, final long value)
	{
		setCutOffDaysForBlockedQuantity( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.cutOffDaysForBlockedQuantity</code> attribute. 
	 * @param value the cutOffDaysForBlockedQuantity - Reserved Quantity
	 */
	public void setCutOffDaysForBlockedQuantity(final long value)
	{
		setCutOffDaysForBlockedQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.daysOfWeek</code> attribute.
	 * @return the daysOfWeek - Days Of Week
	 */
	public Collection<EnumerationValue> getDaysOfWeek(final SessionContext ctx)
	{
		Collection<EnumerationValue> coll = (Collection<EnumerationValue>)getProperty( ctx, DAYSOFWEEK);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.daysOfWeek</code> attribute.
	 * @return the daysOfWeek - Days Of Week
	 */
	public Collection<EnumerationValue> getDaysOfWeek()
	{
		return getDaysOfWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek - Days Of Week
	 */
	public void setDaysOfWeek(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		setProperty(ctx, DAYSOFWEEK,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek - Days Of Week
	 */
	public void setDaysOfWeek(final Collection<EnumerationValue> value)
	{
		setDaysOfWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.distressSalesThreshholdCutOffDays</code> attribute.
	 * @return the distressSalesThreshholdCutOffDays - Threshold CutOff Days
	 */
	public Long getDistressSalesThreshholdCutOffDays(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, DISTRESSSALESTHRESHHOLDCUTOFFDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.distressSalesThreshholdCutOffDays</code> attribute.
	 * @return the distressSalesThreshholdCutOffDays - Threshold CutOff Days
	 */
	public Long getDistressSalesThreshholdCutOffDays()
	{
		return getDistressSalesThreshholdCutOffDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.distressSalesThreshholdCutOffDays</code> attribute. 
	 * @return the distressSalesThreshholdCutOffDays - Threshold CutOff Days
	 */
	public long getDistressSalesThreshholdCutOffDaysAsPrimitive(final SessionContext ctx)
	{
		Long value = getDistressSalesThreshholdCutOffDays( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.distressSalesThreshholdCutOffDays</code> attribute. 
	 * @return the distressSalesThreshholdCutOffDays - Threshold CutOff Days
	 */
	public long getDistressSalesThreshholdCutOffDaysAsPrimitive()
	{
		return getDistressSalesThreshholdCutOffDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.distressSalesThreshholdCutOffDays</code> attribute. 
	 * @param value the distressSalesThreshholdCutOffDays - Threshold CutOff Days
	 */
	public void setDistressSalesThreshholdCutOffDays(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, DISTRESSSALESTHRESHHOLDCUTOFFDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.distressSalesThreshholdCutOffDays</code> attribute. 
	 * @param value the distressSalesThreshholdCutOffDays - Threshold CutOff Days
	 */
	public void setDistressSalesThreshholdCutOffDays(final Long value)
	{
		setDistressSalesThreshholdCutOffDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.distressSalesThreshholdCutOffDays</code> attribute. 
	 * @param value the distressSalesThreshholdCutOffDays - Threshold CutOff Days
	 */
	public void setDistressSalesThreshholdCutOffDays(final SessionContext ctx, final long value)
	{
		setDistressSalesThreshholdCutOffDays( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.distressSalesThreshholdCutOffDays</code> attribute. 
	 * @param value the distressSalesThreshholdCutOffDays - Threshold CutOff Days
	 */
	public void setDistressSalesThreshholdCutOffDays(final long value)
	{
		setDistressSalesThreshholdCutOffDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.distressSalesUtilizationThreshhold</code> attribute.
	 * @return the distressSalesUtilizationThreshhold - Minimum Utilization Threshold
	 */
	public Long getDistressSalesUtilizationThreshhold(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, DISTRESSSALESUTILIZATIONTHRESHHOLD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.distressSalesUtilizationThreshhold</code> attribute.
	 * @return the distressSalesUtilizationThreshhold - Minimum Utilization Threshold
	 */
	public Long getDistressSalesUtilizationThreshhold()
	{
		return getDistressSalesUtilizationThreshhold( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.distressSalesUtilizationThreshhold</code> attribute. 
	 * @return the distressSalesUtilizationThreshhold - Minimum Utilization Threshold
	 */
	public long getDistressSalesUtilizationThreshholdAsPrimitive(final SessionContext ctx)
	{
		Long value = getDistressSalesUtilizationThreshhold( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.distressSalesUtilizationThreshhold</code> attribute. 
	 * @return the distressSalesUtilizationThreshhold - Minimum Utilization Threshold
	 */
	public long getDistressSalesUtilizationThreshholdAsPrimitive()
	{
		return getDistressSalesUtilizationThreshholdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.distressSalesUtilizationThreshhold</code> attribute. 
	 * @param value the distressSalesUtilizationThreshhold - Minimum Utilization Threshold
	 */
	public void setDistressSalesUtilizationThreshhold(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, DISTRESSSALESUTILIZATIONTHRESHHOLD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.distressSalesUtilizationThreshhold</code> attribute. 
	 * @param value the distressSalesUtilizationThreshhold - Minimum Utilization Threshold
	 */
	public void setDistressSalesUtilizationThreshhold(final Long value)
	{
		setDistressSalesUtilizationThreshhold( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.distressSalesUtilizationThreshhold</code> attribute. 
	 * @param value the distressSalesUtilizationThreshhold - Minimum Utilization Threshold
	 */
	public void setDistressSalesUtilizationThreshhold(final SessionContext ctx, final long value)
	{
		setDistressSalesUtilizationThreshhold( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.distressSalesUtilizationThreshhold</code> attribute. 
	 * @param value the distressSalesUtilizationThreshhold - Minimum Utilization Threshold
	 */
	public void setDistressSalesUtilizationThreshhold(final long value)
	{
		setDistressSalesUtilizationThreshhold( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.distributedQuantity</code> attribute.
	 * @return the distributedQuantity - Distributed Quantity
	 */
	public Long getDistributedQuantity(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, DISTRIBUTEDQUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.distributedQuantity</code> attribute.
	 * @return the distributedQuantity - Distributed Quantity
	 */
	public Long getDistributedQuantity()
	{
		return getDistributedQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.distributedQuantity</code> attribute. 
	 * @return the distributedQuantity - Distributed Quantity
	 */
	public long getDistributedQuantityAsPrimitive(final SessionContext ctx)
	{
		Long value = getDistributedQuantity( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.distributedQuantity</code> attribute. 
	 * @return the distributedQuantity - Distributed Quantity
	 */
	public long getDistributedQuantityAsPrimitive()
	{
		return getDistributedQuantityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.distributedQuantity</code> attribute. 
	 * @param value the distributedQuantity - Distributed Quantity
	 */
	public void setDistributedQuantity(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, DISTRIBUTEDQUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.distributedQuantity</code> attribute. 
	 * @param value the distributedQuantity - Distributed Quantity
	 */
	public void setDistributedQuantity(final Long value)
	{
		setDistributedQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.distributedQuantity</code> attribute. 
	 * @param value the distributedQuantity - Distributed Quantity
	 */
	public void setDistributedQuantity(final SessionContext ctx, final long value)
	{
		setDistributedQuantity( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.distributedQuantity</code> attribute. 
	 * @param value the distributedQuantity - Distributed Quantity
	 */
	public void setDistributedQuantity(final long value)
	{
		setDistributedQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.inventoryAssociation</code> attribute.
	 * @return the inventoryAssociation - Inventory Association
	 */
	public AccoAssociateInventory getInventoryAssociation(final SessionContext ctx)
	{
		return (AccoAssociateInventory)getProperty( ctx, INVENTORYASSOCIATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.inventoryAssociation</code> attribute.
	 * @return the inventoryAssociation - Inventory Association
	 */
	public AccoAssociateInventory getInventoryAssociation()
	{
		return getInventoryAssociation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.inventoryAssociation</code> attribute. 
	 * @param value the inventoryAssociation - Inventory Association
	 */
	public void setInventoryAssociation(final SessionContext ctx, final AccoAssociateInventory value)
	{
		setProperty(ctx, INVENTORYASSOCIATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.inventoryAssociation</code> attribute. 
	 * @param value the inventoryAssociation - Inventory Association
	 */
	public void setInventoryAssociation(final AccoAssociateInventory value)
	{
		setInventoryAssociation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.liabilityOnUtilization</code> attribute.
	 * @return the liabilityOnUtilization - Liability On Utilization
	 */
	public Double getLiabilityOnUtilization(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, LIABILITYONUTILIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.liabilityOnUtilization</code> attribute.
	 * @return the liabilityOnUtilization - Liability On Utilization
	 */
	public Double getLiabilityOnUtilization()
	{
		return getLiabilityOnUtilization( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.liabilityOnUtilization</code> attribute. 
	 * @return the liabilityOnUtilization - Liability On Utilization
	 */
	public double getLiabilityOnUtilizationAsPrimitive(final SessionContext ctx)
	{
		Double value = getLiabilityOnUtilization( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.liabilityOnUtilization</code> attribute. 
	 * @return the liabilityOnUtilization - Liability On Utilization
	 */
	public double getLiabilityOnUtilizationAsPrimitive()
	{
		return getLiabilityOnUtilizationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.liabilityOnUtilization</code> attribute. 
	 * @param value the liabilityOnUtilization - Liability On Utilization
	 */
	public void setLiabilityOnUtilization(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, LIABILITYONUTILIZATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.liabilityOnUtilization</code> attribute. 
	 * @param value the liabilityOnUtilization - Liability On Utilization
	 */
	public void setLiabilityOnUtilization(final Double value)
	{
		setLiabilityOnUtilization( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.liabilityOnUtilization</code> attribute. 
	 * @param value the liabilityOnUtilization - Liability On Utilization
	 */
	public void setLiabilityOnUtilization(final SessionContext ctx, final double value)
	{
		setLiabilityOnUtilization( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.liabilityOnUtilization</code> attribute. 
	 * @param value the liabilityOnUtilization - Liability On Utilization
	 */
	public void setLiabilityOnUtilization(final double value)
	{
		setLiabilityOnUtilization( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.noOfRoomRequested</code> attribute.
	 * @return the noOfRoomRequested - No Of Room Requested
	 */
	public Integer getNoOfRoomRequested(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFROOMREQUESTED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.noOfRoomRequested</code> attribute.
	 * @return the noOfRoomRequested - No Of Room Requested
	 */
	public Integer getNoOfRoomRequested()
	{
		return getNoOfRoomRequested( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.noOfRoomRequested</code> attribute. 
	 * @return the noOfRoomRequested - No Of Room Requested
	 */
	public int getNoOfRoomRequestedAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfRoomRequested( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.noOfRoomRequested</code> attribute. 
	 * @return the noOfRoomRequested - No Of Room Requested
	 */
	public int getNoOfRoomRequestedAsPrimitive()
	{
		return getNoOfRoomRequestedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.noOfRoomRequested</code> attribute. 
	 * @param value the noOfRoomRequested - No Of Room Requested
	 */
	public void setNoOfRoomRequested(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFROOMREQUESTED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.noOfRoomRequested</code> attribute. 
	 * @param value the noOfRoomRequested - No Of Room Requested
	 */
	public void setNoOfRoomRequested(final Integer value)
	{
		setNoOfRoomRequested( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.noOfRoomRequested</code> attribute. 
	 * @param value the noOfRoomRequested - No Of Room Requested
	 */
	public void setNoOfRoomRequested(final SessionContext ctx, final int value)
	{
		setNoOfRoomRequested( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.noOfRoomRequested</code> attribute. 
	 * @param value the noOfRoomRequested - No Of Room Requested
	 */
	public void setNoOfRoomRequested(final int value)
	{
		setNoOfRoomRequested( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.rateCode</code> attribute.
	 * @return the rateCode - Rate Code
	 */
	public String getRateCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RATECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.rateCode</code> attribute.
	 * @return the rateCode - Rate Code
	 */
	public String getRateCode()
	{
		return getRateCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.rateCode</code> attribute. 
	 * @param value the rateCode - Rate Code
	 */
	public void setRateCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RATECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.rateCode</code> attribute. 
	 * @param value the rateCode - Rate Code
	 */
	public void setRateCode(final String value)
	{
		setRateCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.rateType</code> attribute.
	 * @return the rateType - Rate Type
	 */
	public RateType getRateType(final SessionContext ctx)
	{
		return (RateType)getProperty( ctx, RATETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.rateType</code> attribute.
	 * @return the rateType - Rate Type
	 */
	public RateType getRateType()
	{
		return getRateType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.rateType</code> attribute. 
	 * @param value the rateType - Rate Type
	 */
	public void setRateType(final SessionContext ctx, final RateType value)
	{
		setProperty(ctx, RATETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.rateType</code> attribute. 
	 * @param value the rateType - Rate Type
	 */
	public void setRateType(final RateType value)
	{
		setRateType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.requestedQuantity</code> attribute.
	 * @return the requestedQuantity - Requested
	 */
	public Long getRequestedQuantity(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, REQUESTEDQUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.requestedQuantity</code> attribute.
	 * @return the requestedQuantity - Requested
	 */
	public Long getRequestedQuantity()
	{
		return getRequestedQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.requestedQuantity</code> attribute. 
	 * @return the requestedQuantity - Requested
	 */
	public long getRequestedQuantityAsPrimitive(final SessionContext ctx)
	{
		Long value = getRequestedQuantity( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.requestedQuantity</code> attribute. 
	 * @return the requestedQuantity - Requested
	 */
	public long getRequestedQuantityAsPrimitive()
	{
		return getRequestedQuantityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.requestedQuantity</code> attribute. 
	 * @param value the requestedQuantity - Requested
	 */
	public void setRequestedQuantity(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, REQUESTEDQUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.requestedQuantity</code> attribute. 
	 * @param value the requestedQuantity - Requested
	 */
	public void setRequestedQuantity(final Long value)
	{
		setRequestedQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.requestedQuantity</code> attribute. 
	 * @param value the requestedQuantity - Requested
	 */
	public void setRequestedQuantity(final SessionContext ctx, final long value)
	{
		setRequestedQuantity( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.requestedQuantity</code> attribute. 
	 * @param value the requestedQuantity - Requested
	 */
	public void setRequestedQuantity(final long value)
	{
		setRequestedQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.reservedQuantity</code> attribute.
	 * @return the reservedQuantity - Reserved Quantity
	 */
	public Long getReservedQuantity(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, RESERVEDQUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.reservedQuantity</code> attribute.
	 * @return the reservedQuantity - Reserved Quantity
	 */
	public Long getReservedQuantity()
	{
		return getReservedQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.reservedQuantity</code> attribute. 
	 * @return the reservedQuantity - Reserved Quantity
	 */
	public long getReservedQuantityAsPrimitive(final SessionContext ctx)
	{
		Long value = getReservedQuantity( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.reservedQuantity</code> attribute. 
	 * @return the reservedQuantity - Reserved Quantity
	 */
	public long getReservedQuantityAsPrimitive()
	{
		return getReservedQuantityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.reservedQuantity</code> attribute. 
	 * @param value the reservedQuantity - Reserved Quantity
	 */
	public void setReservedQuantity(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, RESERVEDQUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.reservedQuantity</code> attribute. 
	 * @param value the reservedQuantity - Reserved Quantity
	 */
	public void setReservedQuantity(final Long value)
	{
		setReservedQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.reservedQuantity</code> attribute. 
	 * @param value the reservedQuantity - Reserved Quantity
	 */
	public void setReservedQuantity(final SessionContext ctx, final long value)
	{
		setReservedQuantity( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.reservedQuantity</code> attribute. 
	 * @param value the reservedQuantity - Reserved Quantity
	 */
	public void setReservedQuantity(final long value)
	{
		setReservedQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.roomCategory</code> attribute.
	 * @return the roomCategory - Room Category
	 */
	public EnumerationValue getRoomCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ROOMCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.roomCategory</code> attribute.
	 * @return the roomCategory - Room Category
	 */
	public EnumerationValue getRoomCategory()
	{
		return getRoomCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.roomCategory</code> attribute. 
	 * @param value the roomCategory - Room Category
	 */
	public void setRoomCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ROOMCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.roomCategory</code> attribute. 
	 * @param value the roomCategory - Room Category
	 */
	public void setRoomCategory(final EnumerationValue value)
	{
		setRoomCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.roomType</code> attribute.
	 * @return the roomType - Room Type
	 */
	public EnumerationValue getRoomType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ROOMTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.roomType</code> attribute.
	 * @return the roomType - Room Type
	 */
	public EnumerationValue getRoomType()
	{
		return getRoomType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.roomType</code> attribute. 
	 * @param value the roomType - Room Type
	 */
	public void setRoomType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ROOMTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.roomType</code> attribute. 
	 * @param value the roomType - Room Type
	 */
	public void setRoomType(final EnumerationValue value)
	{
		setRoomType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.stopSales</code> attribute.
	 * @return the stopSales - Steps Sales
	 */
	public Boolean isStopSales(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, STOPSALES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.stopSales</code> attribute.
	 * @return the stopSales - Steps Sales
	 */
	public Boolean isStopSales()
	{
		return isStopSales( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.stopSales</code> attribute. 
	 * @return the stopSales - Steps Sales
	 */
	public boolean isStopSalesAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isStopSales( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.stopSales</code> attribute. 
	 * @return the stopSales - Steps Sales
	 */
	public boolean isStopSalesAsPrimitive()
	{
		return isStopSalesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.stopSales</code> attribute. 
	 * @param value the stopSales - Steps Sales
	 */
	public void setStopSales(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, STOPSALES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.stopSales</code> attribute. 
	 * @param value the stopSales - Steps Sales
	 */
	public void setStopSales(final Boolean value)
	{
		setStopSales( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.stopSales</code> attribute. 
	 * @param value the stopSales - Steps Sales
	 */
	public void setStopSales(final SessionContext ctx, final boolean value)
	{
		setStopSales( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.stopSales</code> attribute. 
	 * @param value the stopSales - Steps Sales
	 */
	public void setStopSales(final boolean value)
	{
		setStopSales( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.supplierReferenceNumber</code> attribute.
	 * @return the supplierReferenceNumber - Supplier Reference Number
	 */
	public String getSupplierReferenceNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUPPLIERREFERENCENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryRoomInfo.supplierReferenceNumber</code> attribute.
	 * @return the supplierReferenceNumber - Supplier Reference Number
	 */
	public String getSupplierReferenceNumber()
	{
		return getSupplierReferenceNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.supplierReferenceNumber</code> attribute. 
	 * @param value the supplierReferenceNumber - Supplier Reference Number
	 */
	public void setSupplierReferenceNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUPPLIERREFERENCENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryRoomInfo.supplierReferenceNumber</code> attribute. 
	 * @param value the supplierReferenceNumber - Supplier Reference Number
	 */
	public void setSupplierReferenceNumber(final String value)
	{
		setSupplierReferenceNumber( getSession().getSessionContext(), value );
	}
	
}
