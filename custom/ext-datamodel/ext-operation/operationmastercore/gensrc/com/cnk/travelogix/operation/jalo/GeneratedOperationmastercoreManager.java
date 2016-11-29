/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.operation.jalo;

import com.cnk.travelogix.client.config.core.jalo.DocumentSetting;
import com.cnk.travelogix.client.config.core.timelimit.jalo.TimeLimitMasterConfig;
import com.cnk.travelogix.client.core.b2bunit.jalo.TravelogixB2BUnit;
import com.cnk.travelogix.common.core.jalo.receipts.TravelogixPaymentReceipt;
import com.cnk.travelogix.datamodel.model.operation.process.TimeLimitBookingProcess;
import com.cnk.travelogix.datamodel.operation.clientreconfirmationconfig.jalo.ClientReconfirmationConfig;
import com.cnk.travelogix.datamodel.operation.components.jalo.ToDoDetailComponent;
import com.cnk.travelogix.datamodel.operation.components.jalo.ToDoListComponent;
import com.cnk.travelogix.datamodel.operation.reconfirmationconfig.jalo.ReconfirmationConfig;
import com.cnk.travelogix.datamodel.operation.reconfirmationinterval.jalo.ReconfirmationInterval;
import com.cnk.travelogix.datamodel.operation.reconfirmationtraveldestination.jalo.ReconfirmationTravelDestination;
import com.cnk.travelogix.datamodel.operation.supplierreconfirmationconfig.jalo.SupplierReconfirmationConfig;
import com.cnk.travelogix.operation.constants.OperationmastercoreConstants;
import com.cnk.travelogix.operation.serviceorder.jalo.PaymentAdvice;
import com.cnk.travelogix.operation.serviceorder.jalo.PaymentDetails;
import com.cnk.travelogix.operation.serviceorder.jalo.ServiceOrder;
import com.cnk.travelogix.operation.serviceorder.jalo.SupplierInvoice;
import com.cnk.travelogix.operation.serviceorder.jalo.SupplierLiability;
import com.cnk.travelogix.operation.tds.jalo.AbstractTDSRule;
import com.cnk.travelogix.operation.tds.jalo.ClientTDSRule;
import com.cnk.travelogix.operation.tds.jalo.SupplierTDSRule;
import com.cnk.travelogix.operation.tds.jalo.TDSCompanyType;
import com.cnk.travelogix.operation.tds.jalo.TDSExemption;
import com.cnk.travelogix.operation.tds.jalo.TDSMaster;
import com.cnk.travelogix.operation.tds.jalo.TDSTaxComponent;
import com.cnk.travelogix.presales.jalo.Role;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.flexiblesearch.SavedQuery;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.order.AbstractOrder;
import de.hybris.platform.jalo.order.AbstractOrderEntry;
import de.hybris.platform.jalo.order.Order;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Employee;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>OperationmastercoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOperationmastercoreManager extends Extension
{
	/** Relation ordering override parameter constants for Order2DocumentSettingREL from ((operationmastercore))*/
	protected static String ORDER2DOCUMENTSETTINGREL_SRC_ORDERED = "relation.Order2DocumentSettingREL.source.ordered";
	protected static String ORDER2DOCUMENTSETTINGREL_TGT_ORDERED = "relation.Order2DocumentSettingREL.target.ordered";
	/** Relation disable markmodifed parameter constants for Order2DocumentSettingREL from ((operationmastercore))*/
	protected static String ORDER2DOCUMENTSETTINGREL_MARKMODIFIED = "relation.Order2DocumentSettingREL.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("contactEmail", AttributeMode.INITIAL);
		tmp.put("firstName", AttributeMode.INITIAL);
		tmp.put("middleName", AttributeMode.INITIAL);
		tmp.put("lastName", AttributeMode.INITIAL);
		tmp.put("mobileNumber", AttributeMode.INITIAL);
		tmp.put("designation", AttributeMode.INITIAL);
		tmp.put("functionalRole", AttributeMode.INITIAL);
		tmp.put("reportingManager", AttributeMode.INITIAL);
		tmp.put("isManager", AttributeMode.INITIAL);
		tmp.put("secondaryUser", AttributeMode.INITIAL);
		tmp.put("roles", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Employee", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("docReceivedDate", AttributeMode.INITIAL);
		tmp.put("docStatus", AttributeMode.INITIAL);
		tmp.put("remarks", AttributeMode.INITIAL);
		tmp.put("timeLimitMasterConfig", AttributeMode.INITIAL);
		tmp.put("tempTimeLimit", AttributeMode.INITIAL);
		tmp.put("financialControlId", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.Order", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("employee", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.flexiblesearch.SavedQuery", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("latestServiceOrder", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.AbstractOrderEntry", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("client", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.common.core.jalo.receipts.TravelogixPaymentReceipt", Collections.unmodifiableMap(tmp));
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
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.client</code> attribute.
	 * @return the client
	 */
	public TravelogixB2BUnit getClient(final SessionContext ctx, final TravelogixPaymentReceipt item)
	{
		return (TravelogixB2BUnit)item.getProperty( ctx, OperationmastercoreConstants.Attributes.TravelogixPaymentReceipt.CLIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.client</code> attribute.
	 * @return the client
	 */
	public TravelogixB2BUnit getClient(final TravelogixPaymentReceipt item)
	{
		return getClient( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final SessionContext ctx, final TravelogixPaymentReceipt item, final TravelogixB2BUnit value)
	{
		item.setProperty(ctx, OperationmastercoreConstants.Attributes.TravelogixPaymentReceipt.CLIENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final TravelogixPaymentReceipt item, final TravelogixB2BUnit value)
	{
		setClient( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.contactEmail</code> attribute.
	 * @return the contactEmail
	 */
	public String getContactEmail(final SessionContext ctx, final Employee item)
	{
		return (String)item.getProperty( ctx, OperationmastercoreConstants.Attributes.Employee.CONTACTEMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.contactEmail</code> attribute.
	 * @return the contactEmail
	 */
	public String getContactEmail(final Employee item)
	{
		return getContactEmail( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.contactEmail</code> attribute. 
	 * @param value the contactEmail
	 */
	public void setContactEmail(final SessionContext ctx, final Employee item, final String value)
	{
		item.setProperty(ctx, OperationmastercoreConstants.Attributes.Employee.CONTACTEMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.contactEmail</code> attribute. 
	 * @param value the contactEmail
	 */
	public void setContactEmail(final Employee item, final String value)
	{
		setContactEmail( getSession().getSessionContext(), item, value );
	}
	
	public AbstractTDSRule createAbstractTDSRule(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OperationmastercoreConstants.TC.ABSTRACTTDSRULE );
			return (AbstractTDSRule)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AbstractTDSRule : "+e.getMessage(), 0 );
		}
	}
	
	public AbstractTDSRule createAbstractTDSRule(final Map attributeValues)
	{
		return createAbstractTDSRule( getSession().getSessionContext(), attributeValues );
	}
	
	public ClientReconfirmationConfig createClientReconfirmationConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OperationmastercoreConstants.TC.CLIENTRECONFIRMATIONCONFIG );
			return (ClientReconfirmationConfig)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ClientReconfirmationConfig : "+e.getMessage(), 0 );
		}
	}
	
	public ClientReconfirmationConfig createClientReconfirmationConfig(final Map attributeValues)
	{
		return createClientReconfirmationConfig( getSession().getSessionContext(), attributeValues );
	}
	
	public ClientTDSRule createClientTDSRule(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OperationmastercoreConstants.TC.CLIENTTDSRULE );
			return (ClientTDSRule)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ClientTDSRule : "+e.getMessage(), 0 );
		}
	}
	
	public ClientTDSRule createClientTDSRule(final Map attributeValues)
	{
		return createClientTDSRule( getSession().getSessionContext(), attributeValues );
	}
	
	public PaymentAdvice createPaymentAdvice(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OperationmastercoreConstants.TC.PAYMENTADVICE );
			return (PaymentAdvice)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PaymentAdvice : "+e.getMessage(), 0 );
		}
	}
	
	public PaymentAdvice createPaymentAdvice(final Map attributeValues)
	{
		return createPaymentAdvice( getSession().getSessionContext(), attributeValues );
	}
	
	public PaymentDetails createPaymentDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OperationmastercoreConstants.TC.PAYMENTDETAILS );
			return (PaymentDetails)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PaymentDetails : "+e.getMessage(), 0 );
		}
	}
	
	public PaymentDetails createPaymentDetails(final Map attributeValues)
	{
		return createPaymentDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public ReconfirmationConfig createReconfirmationConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OperationmastercoreConstants.TC.RECONFIRMATIONCONFIG );
			return (ReconfirmationConfig)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ReconfirmationConfig : "+e.getMessage(), 0 );
		}
	}
	
	public ReconfirmationConfig createReconfirmationConfig(final Map attributeValues)
	{
		return createReconfirmationConfig( getSession().getSessionContext(), attributeValues );
	}
	
	public ReconfirmationInterval createReconfirmationInterval(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OperationmastercoreConstants.TC.RECONFIRMATIONINTERVAL );
			return (ReconfirmationInterval)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ReconfirmationInterval : "+e.getMessage(), 0 );
		}
	}
	
	public ReconfirmationInterval createReconfirmationInterval(final Map attributeValues)
	{
		return createReconfirmationInterval( getSession().getSessionContext(), attributeValues );
	}
	
	public ReconfirmationTravelDestination createReconfirmationTravelDestination(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OperationmastercoreConstants.TC.RECONFIRMATIONTRAVELDESTINATION );
			return (ReconfirmationTravelDestination)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ReconfirmationTravelDestination : "+e.getMessage(), 0 );
		}
	}
	
	public ReconfirmationTravelDestination createReconfirmationTravelDestination(final Map attributeValues)
	{
		return createReconfirmationTravelDestination( getSession().getSessionContext(), attributeValues );
	}
	
	public ServiceOrder createServiceOrder(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OperationmastercoreConstants.TC.SERVICEORDER );
			return (ServiceOrder)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ServiceOrder : "+e.getMessage(), 0 );
		}
	}
	
	public ServiceOrder createServiceOrder(final Map attributeValues)
	{
		return createServiceOrder( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierInvoice createSupplierInvoice(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OperationmastercoreConstants.TC.SUPPLIERINVOICE );
			return (SupplierInvoice)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierInvoice : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierInvoice createSupplierInvoice(final Map attributeValues)
	{
		return createSupplierInvoice( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierLiability createSupplierLiability(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OperationmastercoreConstants.TC.SUPPLIERLIABILITY );
			return (SupplierLiability)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierLiability : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierLiability createSupplierLiability(final Map attributeValues)
	{
		return createSupplierLiability( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierReconfirmationConfig createSupplierReconfirmationConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OperationmastercoreConstants.TC.SUPPLIERRECONFIRMATIONCONFIG );
			return (SupplierReconfirmationConfig)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierReconfirmationConfig : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierReconfirmationConfig createSupplierReconfirmationConfig(final Map attributeValues)
	{
		return createSupplierReconfirmationConfig( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierTDSRule createSupplierTDSRule(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OperationmastercoreConstants.TC.SUPPLIERTDSRULE );
			return (SupplierTDSRule)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierTDSRule : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierTDSRule createSupplierTDSRule(final Map attributeValues)
	{
		return createSupplierTDSRule( getSession().getSessionContext(), attributeValues );
	}
	
	public TDSCompanyType createTDSCompanyType(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OperationmastercoreConstants.TC.TDSCOMPANYTYPE );
			return (TDSCompanyType)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TDSCompanyType : "+e.getMessage(), 0 );
		}
	}
	
	public TDSCompanyType createTDSCompanyType(final Map attributeValues)
	{
		return createTDSCompanyType( getSession().getSessionContext(), attributeValues );
	}
	
	public TDSExemption createTDSExemption(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OperationmastercoreConstants.TC.TDSEXEMPTION );
			return (TDSExemption)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TDSExemption : "+e.getMessage(), 0 );
		}
	}
	
	public TDSExemption createTDSExemption(final Map attributeValues)
	{
		return createTDSExemption( getSession().getSessionContext(), attributeValues );
	}
	
	public TDSMaster createTDSMaster(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OperationmastercoreConstants.TC.TDSMASTER );
			return (TDSMaster)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TDSMaster : "+e.getMessage(), 0 );
		}
	}
	
	public TDSMaster createTDSMaster(final Map attributeValues)
	{
		return createTDSMaster( getSession().getSessionContext(), attributeValues );
	}
	
	public TDSTaxComponent createTDSTaxComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OperationmastercoreConstants.TC.TDSTAXCOMPONENT );
			return (TDSTaxComponent)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TDSTaxComponent : "+e.getMessage(), 0 );
		}
	}
	
	public TDSTaxComponent createTDSTaxComponent(final Map attributeValues)
	{
		return createTDSTaxComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public TimeLimitBookingProcess createTimeLimitBookingProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OperationmastercoreConstants.TC.TIMELIMITBOOKINGPROCESS );
			return (TimeLimitBookingProcess)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TimeLimitBookingProcess : "+e.getMessage(), 0 );
		}
	}
	
	public TimeLimitBookingProcess createTimeLimitBookingProcess(final Map attributeValues)
	{
		return createTimeLimitBookingProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public ToDoDetailComponent createToDoDetailComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OperationmastercoreConstants.TC.TODODETAILCOMPONENT );
			return (ToDoDetailComponent)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ToDoDetailComponent : "+e.getMessage(), 0 );
		}
	}
	
	public ToDoDetailComponent createToDoDetailComponent(final Map attributeValues)
	{
		return createToDoDetailComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ToDoListComponent createToDoListComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OperationmastercoreConstants.TC.TODOLISTCOMPONENT );
			return (ToDoListComponent)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ToDoListComponent : "+e.getMessage(), 0 );
		}
	}
	
	public ToDoListComponent createToDoListComponent(final Map attributeValues)
	{
		return createToDoListComponent( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.designation</code> attribute.
	 * @return the designation
	 */
	public String getDesignation(final SessionContext ctx, final Employee item)
	{
		return (String)item.getProperty( ctx, OperationmastercoreConstants.Attributes.Employee.DESIGNATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.designation</code> attribute.
	 * @return the designation
	 */
	public String getDesignation(final Employee item)
	{
		return getDesignation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.designation</code> attribute. 
	 * @param value the designation
	 */
	public void setDesignation(final SessionContext ctx, final Employee item, final String value)
	{
		item.setProperty(ctx, OperationmastercoreConstants.Attributes.Employee.DESIGNATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.designation</code> attribute. 
	 * @param value the designation
	 */
	public void setDesignation(final Employee item, final String value)
	{
		setDesignation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.docReceivedDate</code> attribute.
	 * @return the docReceivedDate
	 */
	public Date getDocReceivedDate(final SessionContext ctx, final Order item)
	{
		return (Date)item.getProperty( ctx, OperationmastercoreConstants.Attributes.Order.DOCRECEIVEDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.docReceivedDate</code> attribute.
	 * @return the docReceivedDate
	 */
	public Date getDocReceivedDate(final Order item)
	{
		return getDocReceivedDate( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.docReceivedDate</code> attribute. 
	 * @param value the docReceivedDate
	 */
	public void setDocReceivedDate(final SessionContext ctx, final Order item, final Date value)
	{
		item.setProperty(ctx, OperationmastercoreConstants.Attributes.Order.DOCRECEIVEDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.docReceivedDate</code> attribute. 
	 * @param value the docReceivedDate
	 */
	public void setDocReceivedDate(final Order item, final Date value)
	{
		setDocReceivedDate( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.docStatus</code> attribute.
	 * @return the docStatus
	 */
	public EnumerationValue getDocStatus(final SessionContext ctx, final Order item)
	{
		return (EnumerationValue)item.getProperty( ctx, OperationmastercoreConstants.Attributes.Order.DOCSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.docStatus</code> attribute.
	 * @return the docStatus
	 */
	public EnumerationValue getDocStatus(final Order item)
	{
		return getDocStatus( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.docStatus</code> attribute. 
	 * @param value the docStatus
	 */
	public void setDocStatus(final SessionContext ctx, final Order item, final EnumerationValue value)
	{
		item.setProperty(ctx, OperationmastercoreConstants.Attributes.Order.DOCSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.docStatus</code> attribute. 
	 * @param value the docStatus
	 */
	public void setDocStatus(final Order item, final EnumerationValue value)
	{
		setDocStatus( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.documentSettings</code> attribute.
	 * @return the documentSettings
	 */
	public Collection<DocumentSetting> getDocumentSettings(final SessionContext ctx, final Order item)
	{
		final List<DocumentSetting> items = item.getLinkedItems( 
			ctx,
			true,
			OperationmastercoreConstants.Relations.ORDER2DOCUMENTSETTINGREL,
			"DocumentSetting",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.documentSettings</code> attribute.
	 * @return the documentSettings
	 */
	public Collection<DocumentSetting> getDocumentSettings(final Order item)
	{
		return getDocumentSettings( getSession().getSessionContext(), item );
	}
	
	public long getDocumentSettingsCount(final SessionContext ctx, final Order item)
	{
		return item.getLinkedItemsCount(
			ctx,
			true,
			OperationmastercoreConstants.Relations.ORDER2DOCUMENTSETTINGREL,
			"DocumentSetting",
			null
		);
	}
	
	public long getDocumentSettingsCount(final Order item)
	{
		return getDocumentSettingsCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.documentSettings</code> attribute. 
	 * @param value the documentSettings
	 */
	public void setDocumentSettings(final SessionContext ctx, final Order item, final Collection<DocumentSetting> value)
	{
		item.setLinkedItems( 
			ctx,
			true,
			OperationmastercoreConstants.Relations.ORDER2DOCUMENTSETTINGREL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ORDER2DOCUMENTSETTINGREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.documentSettings</code> attribute. 
	 * @param value the documentSettings
	 */
	public void setDocumentSettings(final Order item, final Collection<DocumentSetting> value)
	{
		setDocumentSettings( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to documentSettings. 
	 * @param value the item to add to documentSettings
	 */
	public void addToDocumentSettings(final SessionContext ctx, final Order item, final DocumentSetting value)
	{
		item.addLinkedItems( 
			ctx,
			true,
			OperationmastercoreConstants.Relations.ORDER2DOCUMENTSETTINGREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ORDER2DOCUMENTSETTINGREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to documentSettings. 
	 * @param value the item to add to documentSettings
	 */
	public void addToDocumentSettings(final Order item, final DocumentSetting value)
	{
		addToDocumentSettings( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from documentSettings. 
	 * @param value the item to remove from documentSettings
	 */
	public void removeFromDocumentSettings(final SessionContext ctx, final Order item, final DocumentSetting value)
	{
		item.removeLinkedItems( 
			ctx,
			true,
			OperationmastercoreConstants.Relations.ORDER2DOCUMENTSETTINGREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ORDER2DOCUMENTSETTINGREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from documentSettings. 
	 * @param value the item to remove from documentSettings
	 */
	public void removeFromDocumentSettings(final Order item, final DocumentSetting value)
	{
		removeFromDocumentSettings( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SavedQuery.employee</code> attribute.
	 * @return the employee
	 */
	public Employee getEmployee(final SessionContext ctx, final SavedQuery item)
	{
		return (Employee)item.getProperty( ctx, OperationmastercoreConstants.Attributes.SavedQuery.EMPLOYEE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SavedQuery.employee</code> attribute.
	 * @return the employee
	 */
	public Employee getEmployee(final SavedQuery item)
	{
		return getEmployee( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SavedQuery.employee</code> attribute. 
	 * @param value the employee
	 */
	public void setEmployee(final SessionContext ctx, final SavedQuery item, final Employee value)
	{
		item.setProperty(ctx, OperationmastercoreConstants.Attributes.SavedQuery.EMPLOYEE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SavedQuery.employee</code> attribute. 
	 * @param value the employee
	 */
	public void setEmployee(final SavedQuery item, final Employee value)
	{
		setEmployee( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.financialControlId</code> attribute.
	 * @return the financialControlId
	 */
	public String getFinancialControlId(final SessionContext ctx, final Order item)
	{
		return (String)item.getProperty( ctx, OperationmastercoreConstants.Attributes.Order.FINANCIALCONTROLID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.financialControlId</code> attribute.
	 * @return the financialControlId
	 */
	public String getFinancialControlId(final Order item)
	{
		return getFinancialControlId( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.financialControlId</code> attribute. 
	 * @param value the financialControlId
	 */
	public void setFinancialControlId(final SessionContext ctx, final Order item, final String value)
	{
		item.setProperty(ctx, OperationmastercoreConstants.Attributes.Order.FINANCIALCONTROLID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.financialControlId</code> attribute. 
	 * @param value the financialControlId
	 */
	public void setFinancialControlId(final Order item, final String value)
	{
		setFinancialControlId( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName(final SessionContext ctx, final Employee item)
	{
		return (String)item.getProperty( ctx, OperationmastercoreConstants.Attributes.Employee.FIRSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName(final Employee item)
	{
		return getFirstName( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final SessionContext ctx, final Employee item, final String value)
	{
		item.setProperty(ctx, OperationmastercoreConstants.Attributes.Employee.FIRSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final Employee item, final String value)
	{
		setFirstName( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.functionalRole</code> attribute.
	 * @return the functionalRole
	 */
	public Role getFunctionalRole(final SessionContext ctx, final Employee item)
	{
		return (Role)item.getProperty( ctx, OperationmastercoreConstants.Attributes.Employee.FUNCTIONALROLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.functionalRole</code> attribute.
	 * @return the functionalRole
	 */
	public Role getFunctionalRole(final Employee item)
	{
		return getFunctionalRole( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.functionalRole</code> attribute. 
	 * @param value the functionalRole
	 */
	public void setFunctionalRole(final SessionContext ctx, final Employee item, final Role value)
	{
		item.setProperty(ctx, OperationmastercoreConstants.Attributes.Employee.FUNCTIONALROLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.functionalRole</code> attribute. 
	 * @param value the functionalRole
	 */
	public void setFunctionalRole(final Employee item, final Role value)
	{
		setFunctionalRole( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return OperationmastercoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.isManager</code> attribute.
	 * @return the isManager
	 */
	public Boolean isIsManager(final SessionContext ctx, final Employee item)
	{
		return (Boolean)item.getProperty( ctx, OperationmastercoreConstants.Attributes.Employee.ISMANAGER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.isManager</code> attribute.
	 * @return the isManager
	 */
	public Boolean isIsManager(final Employee item)
	{
		return isIsManager( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.isManager</code> attribute. 
	 * @return the isManager
	 */
	public boolean isIsManagerAsPrimitive(final SessionContext ctx, final Employee item)
	{
		Boolean value = isIsManager( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.isManager</code> attribute. 
	 * @return the isManager
	 */
	public boolean isIsManagerAsPrimitive(final Employee item)
	{
		return isIsManagerAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.isManager</code> attribute. 
	 * @param value the isManager
	 */
	public void setIsManager(final SessionContext ctx, final Employee item, final Boolean value)
	{
		item.setProperty(ctx, OperationmastercoreConstants.Attributes.Employee.ISMANAGER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.isManager</code> attribute. 
	 * @param value the isManager
	 */
	public void setIsManager(final Employee item, final Boolean value)
	{
		setIsManager( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.isManager</code> attribute. 
	 * @param value the isManager
	 */
	public void setIsManager(final SessionContext ctx, final Employee item, final boolean value)
	{
		setIsManager( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.isManager</code> attribute. 
	 * @param value the isManager
	 */
	public void setIsManager(final Employee item, final boolean value)
	{
		setIsManager( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName(final SessionContext ctx, final Employee item)
	{
		return (String)item.getProperty( ctx, OperationmastercoreConstants.Attributes.Employee.LASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName(final Employee item)
	{
		return getLastName( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final SessionContext ctx, final Employee item, final String value)
	{
		item.setProperty(ctx, OperationmastercoreConstants.Attributes.Employee.LASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final Employee item, final String value)
	{
		setLastName( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.latestServiceOrder</code> attribute.
	 * @return the latestServiceOrder
	 */
	public ServiceOrder getLatestServiceOrder(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (ServiceOrder)item.getProperty( ctx, OperationmastercoreConstants.Attributes.AbstractOrderEntry.LATESTSERVICEORDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.latestServiceOrder</code> attribute.
	 * @return the latestServiceOrder
	 */
	public ServiceOrder getLatestServiceOrder(final AbstractOrderEntry item)
	{
		return getLatestServiceOrder( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.latestServiceOrder</code> attribute. 
	 * @param value the latestServiceOrder
	 */
	public void setLatestServiceOrder(final SessionContext ctx, final AbstractOrderEntry item, final ServiceOrder value)
	{
		item.setProperty(ctx, OperationmastercoreConstants.Attributes.AbstractOrderEntry.LATESTSERVICEORDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.latestServiceOrder</code> attribute. 
	 * @param value the latestServiceOrder
	 */
	public void setLatestServiceOrder(final AbstractOrderEntry item, final ServiceOrder value)
	{
		setLatestServiceOrder( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.middleName</code> attribute.
	 * @return the middleName
	 */
	public String getMiddleName(final SessionContext ctx, final Employee item)
	{
		return (String)item.getProperty( ctx, OperationmastercoreConstants.Attributes.Employee.MIDDLENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.middleName</code> attribute.
	 * @return the middleName
	 */
	public String getMiddleName(final Employee item)
	{
		return getMiddleName( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.middleName</code> attribute. 
	 * @param value the middleName
	 */
	public void setMiddleName(final SessionContext ctx, final Employee item, final String value)
	{
		item.setProperty(ctx, OperationmastercoreConstants.Attributes.Employee.MIDDLENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.middleName</code> attribute. 
	 * @param value the middleName
	 */
	public void setMiddleName(final Employee item, final String value)
	{
		setMiddleName( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.mobileNumber</code> attribute.
	 * @return the mobileNumber
	 */
	public String getMobileNumber(final SessionContext ctx, final Employee item)
	{
		return (String)item.getProperty( ctx, OperationmastercoreConstants.Attributes.Employee.MOBILENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.mobileNumber</code> attribute.
	 * @return the mobileNumber
	 */
	public String getMobileNumber(final Employee item)
	{
		return getMobileNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.mobileNumber</code> attribute. 
	 * @param value the mobileNumber
	 */
	public void setMobileNumber(final SessionContext ctx, final Employee item, final String value)
	{
		item.setProperty(ctx, OperationmastercoreConstants.Attributes.Employee.MOBILENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.mobileNumber</code> attribute. 
	 * @param value the mobileNumber
	 */
	public void setMobileNumber(final Employee item, final String value)
	{
		setMobileNumber( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.order</code> attribute.
	 * @return the order
	 */
	public Collection<Order> getOrder(final SessionContext ctx, final DocumentSetting item)
	{
		final List<Order> items = item.getLinkedItems( 
			ctx,
			false,
			OperationmastercoreConstants.Relations.ORDER2DOCUMENTSETTINGREL,
			"Order",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.order</code> attribute.
	 * @return the order
	 */
	public Collection<Order> getOrder(final DocumentSetting item)
	{
		return getOrder( getSession().getSessionContext(), item );
	}
	
	public long getOrderCount(final SessionContext ctx, final DocumentSetting item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			OperationmastercoreConstants.Relations.ORDER2DOCUMENTSETTINGREL,
			"Order",
			null
		);
	}
	
	public long getOrderCount(final DocumentSetting item)
	{
		return getOrderCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.order</code> attribute. 
	 * @param value the order
	 */
	public void setOrder(final SessionContext ctx, final DocumentSetting item, final Collection<Order> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			OperationmastercoreConstants.Relations.ORDER2DOCUMENTSETTINGREL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ORDER2DOCUMENTSETTINGREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.order</code> attribute. 
	 * @param value the order
	 */
	public void setOrder(final DocumentSetting item, final Collection<Order> value)
	{
		setOrder( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to order. 
	 * @param value the item to add to order
	 */
	public void addToOrder(final SessionContext ctx, final DocumentSetting item, final Order value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			OperationmastercoreConstants.Relations.ORDER2DOCUMENTSETTINGREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ORDER2DOCUMENTSETTINGREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to order. 
	 * @param value the item to add to order
	 */
	public void addToOrder(final DocumentSetting item, final Order value)
	{
		addToOrder( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from order. 
	 * @param value the item to remove from order
	 */
	public void removeFromOrder(final SessionContext ctx, final DocumentSetting item, final Order value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			OperationmastercoreConstants.Relations.ORDER2DOCUMENTSETTINGREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ORDER2DOCUMENTSETTINGREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from order. 
	 * @param value the item to remove from order
	 */
	public void removeFromOrder(final DocumentSetting item, final Order value)
	{
		removeFromOrder( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.remarks</code> attribute.
	 * @return the remarks
	 */
	public String getRemarks(final SessionContext ctx, final Order item)
	{
		return (String)item.getProperty( ctx, OperationmastercoreConstants.Attributes.Order.REMARKS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.remarks</code> attribute.
	 * @return the remarks
	 */
	public String getRemarks(final Order item)
	{
		return getRemarks( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setRemarks(final SessionContext ctx, final Order item, final String value)
	{
		item.setProperty(ctx, OperationmastercoreConstants.Attributes.Order.REMARKS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setRemarks(final Order item, final String value)
	{
		setRemarks( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.reportingManager</code> attribute.
	 * @return the reportingManager
	 */
	public Employee getReportingManager(final SessionContext ctx, final Employee item)
	{
		return (Employee)item.getProperty( ctx, OperationmastercoreConstants.Attributes.Employee.REPORTINGMANAGER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.reportingManager</code> attribute.
	 * @return the reportingManager
	 */
	public Employee getReportingManager(final Employee item)
	{
		return getReportingManager( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.reportingManager</code> attribute. 
	 * @param value the reportingManager
	 */
	public void setReportingManager(final SessionContext ctx, final Employee item, final Employee value)
	{
		item.setProperty(ctx, OperationmastercoreConstants.Attributes.Employee.REPORTINGMANAGER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.reportingManager</code> attribute. 
	 * @param value the reportingManager
	 */
	public void setReportingManager(final Employee item, final Employee value)
	{
		setReportingManager( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.roles</code> attribute.
	 * @return the roles
	 */
	public List<Role> getRoles(final SessionContext ctx, final Employee item)
	{
		List<Role> coll = (List<Role>)item.getProperty( ctx, OperationmastercoreConstants.Attributes.Employee.ROLES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.roles</code> attribute.
	 * @return the roles
	 */
	public List<Role> getRoles(final Employee item)
	{
		return getRoles( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.roles</code> attribute. 
	 * @param value the roles
	 */
	public void setRoles(final SessionContext ctx, final Employee item, final List<Role> value)
	{
		item.setProperty(ctx, OperationmastercoreConstants.Attributes.Employee.ROLES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.roles</code> attribute. 
	 * @param value the roles
	 */
	public void setRoles(final Employee item, final List<Role> value)
	{
		setRoles( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.secondaryUser</code> attribute.
	 * @return the secondaryUser
	 */
	public Employee getSecondaryUser(final SessionContext ctx, final Employee item)
	{
		return (Employee)item.getProperty( ctx, OperationmastercoreConstants.Attributes.Employee.SECONDARYUSER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.secondaryUser</code> attribute.
	 * @return the secondaryUser
	 */
	public Employee getSecondaryUser(final Employee item)
	{
		return getSecondaryUser( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.secondaryUser</code> attribute. 
	 * @param value the secondaryUser
	 */
	public void setSecondaryUser(final SessionContext ctx, final Employee item, final Employee value)
	{
		item.setProperty(ctx, OperationmastercoreConstants.Attributes.Employee.SECONDARYUSER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.secondaryUser</code> attribute. 
	 * @param value the secondaryUser
	 */
	public void setSecondaryUser(final Employee item, final Employee value)
	{
		setSecondaryUser( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.tempTimeLimit</code> attribute.
	 * @return the tempTimeLimit
	 */
	public Date getTempTimeLimit(final SessionContext ctx, final Order item)
	{
		return (Date)item.getProperty( ctx, OperationmastercoreConstants.Attributes.Order.TEMPTIMELIMIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.tempTimeLimit</code> attribute.
	 * @return the tempTimeLimit
	 */
	public Date getTempTimeLimit(final Order item)
	{
		return getTempTimeLimit( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.tempTimeLimit</code> attribute. 
	 * @param value the tempTimeLimit
	 */
	public void setTempTimeLimit(final SessionContext ctx, final Order item, final Date value)
	{
		item.setProperty(ctx, OperationmastercoreConstants.Attributes.Order.TEMPTIMELIMIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.tempTimeLimit</code> attribute. 
	 * @param value the tempTimeLimit
	 */
	public void setTempTimeLimit(final Order item, final Date value)
	{
		setTempTimeLimit( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.timeLimitMasterConfig</code> attribute.
	 * @return the timeLimitMasterConfig
	 */
	public TimeLimitMasterConfig getTimeLimitMasterConfig(final SessionContext ctx, final Order item)
	{
		return (TimeLimitMasterConfig)item.getProperty( ctx, OperationmastercoreConstants.Attributes.Order.TIMELIMITMASTERCONFIG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.timeLimitMasterConfig</code> attribute.
	 * @return the timeLimitMasterConfig
	 */
	public TimeLimitMasterConfig getTimeLimitMasterConfig(final Order item)
	{
		return getTimeLimitMasterConfig( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.timeLimitMasterConfig</code> attribute. 
	 * @param value the timeLimitMasterConfig
	 */
	public void setTimeLimitMasterConfig(final SessionContext ctx, final Order item, final TimeLimitMasterConfig value)
	{
		item.setProperty(ctx, OperationmastercoreConstants.Attributes.Order.TIMELIMITMASTERCONFIG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.timeLimitMasterConfig</code> attribute. 
	 * @param value the timeLimitMasterConfig
	 */
	public void setTimeLimitMasterConfig(final Order item, final TimeLimitMasterConfig value)
	{
		setTimeLimitMasterConfig( getSession().getSessionContext(), item, value );
	}
	
}
