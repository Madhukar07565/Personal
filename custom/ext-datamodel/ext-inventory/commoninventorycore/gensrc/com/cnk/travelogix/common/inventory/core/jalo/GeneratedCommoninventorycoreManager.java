/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.inventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.PaymentSchedule;
import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import com.cnk.travelogix.common.inventory.core.jalo.AbstractInventoryDefinition;
import com.cnk.travelogix.common.inventory.core.jalo.AssociateInventory;
import com.cnk.travelogix.common.inventory.core.jalo.AssociatedCompanies;
import com.cnk.travelogix.common.inventory.core.jalo.ChangeRequestCutOffsAndCharges;
import com.cnk.travelogix.common.inventory.core.jalo.ChangeRequestPenaltyCharges;
import com.cnk.travelogix.common.inventory.core.jalo.CutOffForFreeSale;
import com.cnk.travelogix.common.inventory.core.jalo.CutOffsAndCharges;
import com.cnk.travelogix.common.inventory.core.jalo.FreeOfCostSeatsOrTickets;
import com.cnk.travelogix.common.inventory.core.jalo.InventoryPaymentAdvice;
import com.cnk.travelogix.common.inventory.core.jalo.NamingListCutOffs;
import com.cnk.travelogix.common.inventory.core.jalo.PaymentDetailsVmpd;
import com.cnk.travelogix.common.inventory.core.jalo.PaymentInformation;
import com.cnk.travelogix.common.inventory.core.jalo.PrePaymentDetail;
import com.cnk.travelogix.common.inventory.jalo.AbstractInventoryRequest;
import com.cnk.travelogix.common.inventory.jalo.CompanyInventoryRestriction;
import com.cnk.travelogix.common.inventory.jalo.InitialInvReqSupplierDetail;
import com.cnk.travelogix.common.inventory.jalo.OverBookingLimit;
import com.cnk.travelogix.masterdata.core.version.jalo.VersionDetail;
import com.cnk.travelogix.product.activity.masters.core.jalo.OperationDuration;
import com.cnk.travelogix.product.activity.masters.core.jalo.PickupAndDropOff;
import com.cnk.travelogix.product.transport.masters.core.jalo.VehicleDetails;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.media.AbstractMedia;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>CommoninventorycoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCommoninventorycoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("supplierName", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.product.activity.masters.core.jalo.OperationDuration", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("supplierName", AttributeMode.INITIAL);
		tmp.put("vehicleDetails", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.product.activity.masters.core.jalo.PickupAndDropOff", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("inventoryRequestPOS", AttributeMode.INITIAL);
		tmp.put("inventoryRequest", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.version.jalo.VersionDetail", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("abstractInventoryDefinition", AttributeMode.INITIAL);
		tmp.put("inventoryPaymentAdvice", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.media.Media", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.abstractInventoryDefinition</code> attribute.
	 * @return the abstractInventoryDefinition
	 */
	public AbstractInventoryDefinition getAbstractInventoryDefinition(final SessionContext ctx, final Media item)
	{
		return (AbstractInventoryDefinition)item.getProperty( ctx, CommoninventorycoreConstants.Attributes.Media.ABSTRACTINVENTORYDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.abstractInventoryDefinition</code> attribute.
	 * @return the abstractInventoryDefinition
	 */
	public AbstractInventoryDefinition getAbstractInventoryDefinition(final Media item)
	{
		return getAbstractInventoryDefinition( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.abstractInventoryDefinition</code> attribute. 
	 * @param value the abstractInventoryDefinition
	 */
	public void setAbstractInventoryDefinition(final SessionContext ctx, final Media item, final AbstractInventoryDefinition value)
	{
		item.setProperty(ctx, CommoninventorycoreConstants.Attributes.Media.ABSTRACTINVENTORYDEFINITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.abstractInventoryDefinition</code> attribute. 
	 * @param value the abstractInventoryDefinition
	 */
	public void setAbstractInventoryDefinition(final Media item, final AbstractInventoryDefinition value)
	{
		setAbstractInventoryDefinition( getSession().getSessionContext(), item, value );
	}
	
	public AssociatedCompanies createAssociatedCompanies(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommoninventorycoreConstants.TC.ASSOCIATEDCOMPANIES );
			return (AssociatedCompanies)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AssociatedCompanies : "+e.getMessage(), 0 );
		}
	}
	
	public AssociatedCompanies createAssociatedCompanies(final Map attributeValues)
	{
		return createAssociatedCompanies( getSession().getSessionContext(), attributeValues );
	}
	
	public AssociateInventory createAssociateInventory(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommoninventorycoreConstants.TC.ASSOCIATEINVENTORY );
			return (AssociateInventory)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AssociateInventory : "+e.getMessage(), 0 );
		}
	}
	
	public AssociateInventory createAssociateInventory(final Map attributeValues)
	{
		return createAssociateInventory( getSession().getSessionContext(), attributeValues );
	}
	
	public ChangeRequestCutOffsAndCharges createChangeRequestCutOffsAndCharges(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommoninventorycoreConstants.TC.CHANGEREQUESTCUTOFFSANDCHARGES );
			return (ChangeRequestCutOffsAndCharges)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ChangeRequestCutOffsAndCharges : "+e.getMessage(), 0 );
		}
	}
	
	public ChangeRequestCutOffsAndCharges createChangeRequestCutOffsAndCharges(final Map attributeValues)
	{
		return createChangeRequestCutOffsAndCharges( getSession().getSessionContext(), attributeValues );
	}
	
	public ChangeRequestPenaltyCharges createChangeRequestPenaltyCharges(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommoninventorycoreConstants.TC.CHANGEREQUESTPENALTYCHARGES );
			return (ChangeRequestPenaltyCharges)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ChangeRequestPenaltyCharges : "+e.getMessage(), 0 );
		}
	}
	
	public ChangeRequestPenaltyCharges createChangeRequestPenaltyCharges(final Map attributeValues)
	{
		return createChangeRequestPenaltyCharges( getSession().getSessionContext(), attributeValues );
	}
	
	public CompanyInventoryRestriction createCompanyInventoryRestriction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommoninventorycoreConstants.TC.COMPANYINVENTORYRESTRICTION );
			return (CompanyInventoryRestriction)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CompanyInventoryRestriction : "+e.getMessage(), 0 );
		}
	}
	
	public CompanyInventoryRestriction createCompanyInventoryRestriction(final Map attributeValues)
	{
		return createCompanyInventoryRestriction( getSession().getSessionContext(), attributeValues );
	}
	
	public CutOffForFreeSale createCutOffForFreeSale(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommoninventorycoreConstants.TC.CUTOFFFORFREESALE );
			return (CutOffForFreeSale)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CutOffForFreeSale : "+e.getMessage(), 0 );
		}
	}
	
	public CutOffForFreeSale createCutOffForFreeSale(final Map attributeValues)
	{
		return createCutOffForFreeSale( getSession().getSessionContext(), attributeValues );
	}
	
	public CutOffsAndCharges createCutOffsAndCharges(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommoninventorycoreConstants.TC.CUTOFFSANDCHARGES );
			return (CutOffsAndCharges)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CutOffsAndCharges : "+e.getMessage(), 0 );
		}
	}
	
	public CutOffsAndCharges createCutOffsAndCharges(final Map attributeValues)
	{
		return createCutOffsAndCharges( getSession().getSessionContext(), attributeValues );
	}
	
	public FreeOfCostSeatsOrTickets createFreeOfCostSeatsOrTickets(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommoninventorycoreConstants.TC.FREEOFCOSTSEATSORTICKETS );
			return (FreeOfCostSeatsOrTickets)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating FreeOfCostSeatsOrTickets : "+e.getMessage(), 0 );
		}
	}
	
	public FreeOfCostSeatsOrTickets createFreeOfCostSeatsOrTickets(final Map attributeValues)
	{
		return createFreeOfCostSeatsOrTickets( getSession().getSessionContext(), attributeValues );
	}
	
	public InitialInvReqSupplierDetail createInitialInvReqSupplierDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommoninventorycoreConstants.TC.INITIALINVREQSUPPLIERDETAIL );
			return (InitialInvReqSupplierDetail)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating InitialInvReqSupplierDetail : "+e.getMessage(), 0 );
		}
	}
	
	public InitialInvReqSupplierDetail createInitialInvReqSupplierDetail(final Map attributeValues)
	{
		return createInitialInvReqSupplierDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public InventoryPaymentAdvice createInventoryPaymentAdvice(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommoninventorycoreConstants.TC.INVENTORYPAYMENTADVICE );
			return (InventoryPaymentAdvice)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating InventoryPaymentAdvice : "+e.getMessage(), 0 );
		}
	}
	
	public InventoryPaymentAdvice createInventoryPaymentAdvice(final Map attributeValues)
	{
		return createInventoryPaymentAdvice( getSession().getSessionContext(), attributeValues );
	}
	
	public NamingListCutOffs createNamingListCutOffs(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommoninventorycoreConstants.TC.NAMINGLISTCUTOFFS );
			return (NamingListCutOffs)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating NamingListCutOffs : "+e.getMessage(), 0 );
		}
	}
	
	public NamingListCutOffs createNamingListCutOffs(final Map attributeValues)
	{
		return createNamingListCutOffs( getSession().getSessionContext(), attributeValues );
	}
	
	public OverBookingLimit createOverBookingLimit(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommoninventorycoreConstants.TC.OVERBOOKINGLIMIT );
			return (OverBookingLimit)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating OverBookingLimit : "+e.getMessage(), 0 );
		}
	}
	
	public OverBookingLimit createOverBookingLimit(final Map attributeValues)
	{
		return createOverBookingLimit( getSession().getSessionContext(), attributeValues );
	}
	
	public PaymentDetailsVmpd createPaymentDetailsVmpd(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommoninventorycoreConstants.TC.PAYMENTDETAILSVMPD );
			return (PaymentDetailsVmpd)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating PaymentDetailsVmpd : "+e.getMessage(), 0 );
		}
	}
	
	public PaymentDetailsVmpd createPaymentDetailsVmpd(final Map attributeValues)
	{
		return createPaymentDetailsVmpd( getSession().getSessionContext(), attributeValues );
	}
	
	public PaymentInformation createPaymentInformation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommoninventorycoreConstants.TC.PAYMENTINFORMATION );
			return (PaymentInformation)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating PaymentInformation : "+e.getMessage(), 0 );
		}
	}
	
	public PaymentInformation createPaymentInformation(final Map attributeValues)
	{
		return createPaymentInformation( getSession().getSessionContext(), attributeValues );
	}
	
	public PaymentSchedule createPaymentSchedule(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommoninventorycoreConstants.TC.PAYMENTSCHEDULE );
			return (PaymentSchedule)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating PaymentSchedule : "+e.getMessage(), 0 );
		}
	}
	
	public PaymentSchedule createPaymentSchedule(final Map attributeValues)
	{
		return createPaymentSchedule( getSession().getSessionContext(), attributeValues );
	}
	
	public PrePaymentDetail createPrePaymentDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommoninventorycoreConstants.TC.PREPAYMENTDETAIL );
			return (PrePaymentDetail)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating PrePaymentDetail : "+e.getMessage(), 0 );
		}
	}
	
	public PrePaymentDetail createPrePaymentDetail(final Map attributeValues)
	{
		return createPrePaymentDetail( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return CommoninventorycoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.inventoryPaymentAdvice</code> attribute.
	 * @return the inventoryPaymentAdvice
	 */
	public InventoryPaymentAdvice getInventoryPaymentAdvice(final SessionContext ctx, final Media item)
	{
		return (InventoryPaymentAdvice)item.getProperty( ctx, CommoninventorycoreConstants.Attributes.Media.INVENTORYPAYMENTADVICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.inventoryPaymentAdvice</code> attribute.
	 * @return the inventoryPaymentAdvice
	 */
	public InventoryPaymentAdvice getInventoryPaymentAdvice(final Media item)
	{
		return getInventoryPaymentAdvice( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.inventoryPaymentAdvice</code> attribute. 
	 * @param value the inventoryPaymentAdvice
	 */
	public void setInventoryPaymentAdvice(final SessionContext ctx, final Media item, final InventoryPaymentAdvice value)
	{
		item.setProperty(ctx, CommoninventorycoreConstants.Attributes.Media.INVENTORYPAYMENTADVICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.inventoryPaymentAdvice</code> attribute. 
	 * @param value the inventoryPaymentAdvice
	 */
	public void setInventoryPaymentAdvice(final Media item, final InventoryPaymentAdvice value)
	{
		setInventoryPaymentAdvice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VersionDetail.inventoryRequest</code> attribute.
	 * @return the inventoryRequest
	 */
	public AbstractInventoryRequest getInventoryRequest(final SessionContext ctx, final VersionDetail item)
	{
		return (AbstractInventoryRequest)item.getProperty( ctx, CommoninventorycoreConstants.Attributes.VersionDetail.INVENTORYREQUEST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VersionDetail.inventoryRequest</code> attribute.
	 * @return the inventoryRequest
	 */
	public AbstractInventoryRequest getInventoryRequest(final VersionDetail item)
	{
		return getInventoryRequest( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VersionDetail.inventoryRequest</code> attribute. 
	 * @param value the inventoryRequest
	 */
	public void setInventoryRequest(final SessionContext ctx, final VersionDetail item, final AbstractInventoryRequest value)
	{
		item.setProperty(ctx, CommoninventorycoreConstants.Attributes.VersionDetail.INVENTORYREQUEST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VersionDetail.inventoryRequest</code> attribute. 
	 * @param value the inventoryRequest
	 */
	public void setInventoryRequest(final VersionDetail item, final AbstractInventoryRequest value)
	{
		setInventoryRequest( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VersionDetail.inventoryRequestPOS</code> attribute.
	 * @return the inventoryRequestPOS
	 */
	 Integer getInventoryRequestPOS(final SessionContext ctx, final VersionDetail item)
	{
		return (Integer)item.getProperty( ctx, CommoninventorycoreConstants.Attributes.VersionDetail.INVENTORYREQUESTPOS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VersionDetail.inventoryRequestPOS</code> attribute.
	 * @return the inventoryRequestPOS
	 */
	 Integer getInventoryRequestPOS(final VersionDetail item)
	{
		return getInventoryRequestPOS( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VersionDetail.inventoryRequestPOS</code> attribute. 
	 * @return the inventoryRequestPOS
	 */
	 int getInventoryRequestPOSAsPrimitive(final SessionContext ctx, final VersionDetail item)
	{
		Integer value = getInventoryRequestPOS( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VersionDetail.inventoryRequestPOS</code> attribute. 
	 * @return the inventoryRequestPOS
	 */
	 int getInventoryRequestPOSAsPrimitive(final VersionDetail item)
	{
		return getInventoryRequestPOSAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VersionDetail.inventoryRequestPOS</code> attribute. 
	 * @param value the inventoryRequestPOS
	 */
	 void setInventoryRequestPOS(final SessionContext ctx, final VersionDetail item, final Integer value)
	{
		item.setProperty(ctx, CommoninventorycoreConstants.Attributes.VersionDetail.INVENTORYREQUESTPOS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VersionDetail.inventoryRequestPOS</code> attribute. 
	 * @param value the inventoryRequestPOS
	 */
	 void setInventoryRequestPOS(final VersionDetail item, final Integer value)
	{
		setInventoryRequestPOS( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VersionDetail.inventoryRequestPOS</code> attribute. 
	 * @param value the inventoryRequestPOS
	 */
	 void setInventoryRequestPOS(final SessionContext ctx, final VersionDetail item, final int value)
	{
		setInventoryRequestPOS( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VersionDetail.inventoryRequestPOS</code> attribute. 
	 * @param value the inventoryRequestPOS
	 */
	 void setInventoryRequestPOS(final VersionDetail item, final int value)
	{
		setInventoryRequestPOS( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OperationDuration.supplierName</code> attribute.
	 * @return the supplierName - Supplier Name
	 */
	public Supplier getSupplierName(final SessionContext ctx, final OperationDuration item)
	{
		return (Supplier)item.getProperty( ctx, CommoninventorycoreConstants.Attributes.OperationDuration.SUPPLIERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OperationDuration.supplierName</code> attribute.
	 * @return the supplierName - Supplier Name
	 */
	public Supplier getSupplierName(final OperationDuration item)
	{
		return getSupplierName( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OperationDuration.supplierName</code> attribute. 
	 * @param value the supplierName - Supplier Name
	 */
	public void setSupplierName(final SessionContext ctx, final OperationDuration item, final Supplier value)
	{
		item.setProperty(ctx, CommoninventorycoreConstants.Attributes.OperationDuration.SUPPLIERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OperationDuration.supplierName</code> attribute. 
	 * @param value the supplierName - Supplier Name
	 */
	public void setSupplierName(final OperationDuration item, final Supplier value)
	{
		setSupplierName( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupAndDropOff.supplierName</code> attribute.
	 * @return the supplierName - Supplier Name
	 */
	public Supplier getSupplierName(final SessionContext ctx, final PickupAndDropOff item)
	{
		return (Supplier)item.getProperty( ctx, CommoninventorycoreConstants.Attributes.PickupAndDropOff.SUPPLIERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupAndDropOff.supplierName</code> attribute.
	 * @return the supplierName - Supplier Name
	 */
	public Supplier getSupplierName(final PickupAndDropOff item)
	{
		return getSupplierName( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupAndDropOff.supplierName</code> attribute. 
	 * @param value the supplierName - Supplier Name
	 */
	public void setSupplierName(final SessionContext ctx, final PickupAndDropOff item, final Supplier value)
	{
		item.setProperty(ctx, CommoninventorycoreConstants.Attributes.PickupAndDropOff.SUPPLIERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupAndDropOff.supplierName</code> attribute. 
	 * @param value the supplierName - Supplier Name
	 */
	public void setSupplierName(final PickupAndDropOff item, final Supplier value)
	{
		setSupplierName( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupAndDropOff.vehicleDetails</code> attribute.
	 * @return the vehicleDetails - Vehicle Details
	 */
	public VehicleDetails getVehicleDetails(final SessionContext ctx, final PickupAndDropOff item)
	{
		return (VehicleDetails)item.getProperty( ctx, CommoninventorycoreConstants.Attributes.PickupAndDropOff.VEHICLEDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupAndDropOff.vehicleDetails</code> attribute.
	 * @return the vehicleDetails - Vehicle Details
	 */
	public VehicleDetails getVehicleDetails(final PickupAndDropOff item)
	{
		return getVehicleDetails( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupAndDropOff.vehicleDetails</code> attribute. 
	 * @param value the vehicleDetails - Vehicle Details
	 */
	public void setVehicleDetails(final SessionContext ctx, final PickupAndDropOff item, final VehicleDetails value)
	{
		item.setProperty(ctx, CommoninventorycoreConstants.Attributes.PickupAndDropOff.VEHICLEDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupAndDropOff.vehicleDetails</code> attribute. 
	 * @param value the vehicleDetails - Vehicle Details
	 */
	public void setVehicleDetails(final PickupAndDropOff item, final VehicleDetails value)
	{
		setVehicleDetails( getSession().getSessionContext(), item, value );
	}
	
}
