/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.settlementterms.core.jalo;

import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.masterdata.core.jalo.BankAccountDetail;
import com.cnk.travelogix.supplier.credentials.core.jalo.SupplierCredentials;
import com.cnk.travelogix.supplier.settlementterms.core.constants.SuppliersettlementtermscoreConstants;
import com.cnk.travelogix.supplier.settlementterms.jalo.AbstractSupplierSettlement;
import com.cnk.travelogix.supplier.settlementterms.jalo.AdvCommercialSettlementPayable;
import com.cnk.travelogix.supplier.settlementterms.jalo.CommercialSettlementReceivable;
import com.cnk.travelogix.supplier.settlementterms.jalo.CountryCreditLimit;
import com.cnk.travelogix.supplier.settlementterms.jalo.CreditCommSettlement;
import com.cnk.travelogix.supplier.settlementterms.jalo.NoCreditDepositCommSettlement;
import com.cnk.travelogix.supplier.settlementterms.jalo.NoCreditPrePaymentCommSettlement;
import com.cnk.travelogix.supplier.settlementterms.jalo.PayableAmountDetail;
import com.cnk.travelogix.supplier.settlementterms.jalo.RaiseIndentCronJob;
import com.cnk.travelogix.supplier.settlementterms.jalo.SettlementPeriod;
import com.cnk.travelogix.supplier.settlementterms.jalo.StdCommCommisionableSettlement;
import com.cnk.travelogix.supplier.settlementterms.jalo.StdCommNonComissionableSettlement;
import com.cnk.travelogix.supplier.settlementterms.jalo.SupplierSettlement;
import de.hybris.platform.cronjob.jalo.Trigger;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>SuppliersettlementtermscoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSuppliersettlementtermscoreManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n SETTLEMENTPERIODLIST's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SettlementPeriod> TRIGGER2SETTLEMENTPERIODRELSSETTLEMENTPERIODLISTHANDLER = new OneToManyHandler<SettlementPeriod>(
	SuppliersettlementtermscoreConstants.TC.SETTLEMENTPERIOD,
	false,
	"trigger",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("settlementSchedule", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.cronjob.jalo.Trigger", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("creditCommSettlement", AttributeMode.INITIAL);
		tmp.put("noCreditDepositcommisionableDetail", AttributeMode.INITIAL);
		tmp.put("noCreditPrePaymentCommSettlement", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.supplier.credentials.core.jalo.SupplierCredentials", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("supplierSettlement", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.jalo.BankAccountDetail", Collections.unmodifiableMap(tmp));
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
	
	public AbstractSupplierSettlement createAbstractSupplierSettlement(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliersettlementtermscoreConstants.TC.ABSTRACTSUPPLIERSETTLEMENT );
			return (AbstractSupplierSettlement)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AbstractSupplierSettlement : "+e.getMessage(), 0 );
		}
	}
	
	public AbstractSupplierSettlement createAbstractSupplierSettlement(final Map attributeValues)
	{
		return createAbstractSupplierSettlement( getSession().getSessionContext(), attributeValues );
	}
	
	public AdvCommercialSettlementPayable createAdvCommercialSettlementPayable(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliersettlementtermscoreConstants.TC.ADVCOMMERCIALSETTLEMENTPAYABLE );
			return (AdvCommercialSettlementPayable)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AdvCommercialSettlementPayable : "+e.getMessage(), 0 );
		}
	}
	
	public AdvCommercialSettlementPayable createAdvCommercialSettlementPayable(final Map attributeValues)
	{
		return createAdvCommercialSettlementPayable( getSession().getSessionContext(), attributeValues );
	}
	
	public CommercialSettlementReceivable createCommercialSettlementReceivable(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliersettlementtermscoreConstants.TC.COMMERCIALSETTLEMENTRECEIVABLE );
			return (CommercialSettlementReceivable)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CommercialSettlementReceivable : "+e.getMessage(), 0 );
		}
	}
	
	public CommercialSettlementReceivable createCommercialSettlementReceivable(final Map attributeValues)
	{
		return createCommercialSettlementReceivable( getSession().getSessionContext(), attributeValues );
	}
	
	public CountryCreditLimit createCountryCreditLimit(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliersettlementtermscoreConstants.TC.COUNTRYCREDITLIMIT );
			return (CountryCreditLimit)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CountryCreditLimit : "+e.getMessage(), 0 );
		}
	}
	
	public CountryCreditLimit createCountryCreditLimit(final Map attributeValues)
	{
		return createCountryCreditLimit( getSession().getSessionContext(), attributeValues );
	}
	
	public CreditCommSettlement createCreditCommSettlement(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliersettlementtermscoreConstants.TC.CREDITCOMMSETTLEMENT );
			return (CreditCommSettlement)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CreditCommSettlement : "+e.getMessage(), 0 );
		}
	}
	
	public CreditCommSettlement createCreditCommSettlement(final Map attributeValues)
	{
		return createCreditCommSettlement( getSession().getSessionContext(), attributeValues );
	}
	
	public NoCreditDepositCommSettlement createNoCreditDepositCommSettlement(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliersettlementtermscoreConstants.TC.NOCREDITDEPOSITCOMMSETTLEMENT );
			return (NoCreditDepositCommSettlement)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating NoCreditDepositCommSettlement : "+e.getMessage(), 0 );
		}
	}
	
	public NoCreditDepositCommSettlement createNoCreditDepositCommSettlement(final Map attributeValues)
	{
		return createNoCreditDepositCommSettlement( getSession().getSessionContext(), attributeValues );
	}
	
	public NoCreditPrePaymentCommSettlement createNoCreditPrePaymentCommSettlement(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliersettlementtermscoreConstants.TC.NOCREDITPREPAYMENTCOMMSETTLEMENT );
			return (NoCreditPrePaymentCommSettlement)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating NoCreditPrePaymentCommSettlement : "+e.getMessage(), 0 );
		}
	}
	
	public NoCreditPrePaymentCommSettlement createNoCreditPrePaymentCommSettlement(final Map attributeValues)
	{
		return createNoCreditPrePaymentCommSettlement( getSession().getSessionContext(), attributeValues );
	}
	
	public PayableAmountDetail createPayableAmountDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliersettlementtermscoreConstants.TC.PAYABLEAMOUNTDETAIL );
			return (PayableAmountDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PayableAmountDetail : "+e.getMessage(), 0 );
		}
	}
	
	public PayableAmountDetail createPayableAmountDetail(final Map attributeValues)
	{
		return createPayableAmountDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public RaiseIndentCronJob createRaiseIndentCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliersettlementtermscoreConstants.TC.RAISEINDENTCRONJOB );
			return (RaiseIndentCronJob)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating RaiseIndentCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public RaiseIndentCronJob createRaiseIndentCronJob(final Map attributeValues)
	{
		return createRaiseIndentCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public SettlementPeriod createSettlementPeriod(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliersettlementtermscoreConstants.TC.SETTLEMENTPERIOD );
			return (SettlementPeriod)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SettlementPeriod : "+e.getMessage(), 0 );
		}
	}
	
	public SettlementPeriod createSettlementPeriod(final Map attributeValues)
	{
		return createSettlementPeriod( getSession().getSessionContext(), attributeValues );
	}
	
	public StdCommCommisionableSettlement createStdCommCommisionableSettlement(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliersettlementtermscoreConstants.TC.STDCOMMCOMMISIONABLESETTLEMENT );
			return (StdCommCommisionableSettlement)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating StdCommCommisionableSettlement : "+e.getMessage(), 0 );
		}
	}
	
	public StdCommCommisionableSettlement createStdCommCommisionableSettlement(final Map attributeValues)
	{
		return createStdCommCommisionableSettlement( getSession().getSessionContext(), attributeValues );
	}
	
	public StdCommNonComissionableSettlement createStdCommNonComissionableSettlement(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliersettlementtermscoreConstants.TC.STDCOMMNONCOMISSIONABLESETTLEMENT );
			return (StdCommNonComissionableSettlement)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating StdCommNonComissionableSettlement : "+e.getMessage(), 0 );
		}
	}
	
	public StdCommNonComissionableSettlement createStdCommNonComissionableSettlement(final Map attributeValues)
	{
		return createStdCommNonComissionableSettlement( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierSettlement createSupplierSettlement(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliersettlementtermscoreConstants.TC.SUPPLIERSETTLEMENT );
			return (SupplierSettlement)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierSettlement : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierSettlement createSupplierSettlement(final Map attributeValues)
	{
		return createSupplierSettlement( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.creditCommSettlement</code> attribute.
	 * @return the creditCommSettlement
	 */
	public CreditCommSettlement getCreditCommSettlement(final SessionContext ctx, final SupplierCredentials item)
	{
		return (CreditCommSettlement)item.getProperty( ctx, SuppliersettlementtermscoreConstants.Attributes.SupplierCredentials.CREDITCOMMSETTLEMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.creditCommSettlement</code> attribute.
	 * @return the creditCommSettlement
	 */
	public CreditCommSettlement getCreditCommSettlement(final SupplierCredentials item)
	{
		return getCreditCommSettlement( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.creditCommSettlement</code> attribute. 
	 * @param value the creditCommSettlement
	 */
	public void setCreditCommSettlement(final SessionContext ctx, final SupplierCredentials item, final CreditCommSettlement value)
	{
		item.setProperty(ctx, SuppliersettlementtermscoreConstants.Attributes.SupplierCredentials.CREDITCOMMSETTLEMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.creditCommSettlement</code> attribute. 
	 * @param value the creditCommSettlement
	 */
	public void setCreditCommSettlement(final SupplierCredentials item, final CreditCommSettlement value)
	{
		setCreditCommSettlement( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return SuppliersettlementtermscoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.noCreditDepositcommisionableDetail</code> attribute.
	 * @return the noCreditDepositcommisionableDetail
	 */
	public NoCreditDepositCommSettlement getNoCreditDepositcommisionableDetail(final SessionContext ctx, final SupplierCredentials item)
	{
		return (NoCreditDepositCommSettlement)item.getProperty( ctx, SuppliersettlementtermscoreConstants.Attributes.SupplierCredentials.NOCREDITDEPOSITCOMMISIONABLEDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.noCreditDepositcommisionableDetail</code> attribute.
	 * @return the noCreditDepositcommisionableDetail
	 */
	public NoCreditDepositCommSettlement getNoCreditDepositcommisionableDetail(final SupplierCredentials item)
	{
		return getNoCreditDepositcommisionableDetail( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.noCreditDepositcommisionableDetail</code> attribute. 
	 * @param value the noCreditDepositcommisionableDetail
	 */
	public void setNoCreditDepositcommisionableDetail(final SessionContext ctx, final SupplierCredentials item, final NoCreditDepositCommSettlement value)
	{
		item.setProperty(ctx, SuppliersettlementtermscoreConstants.Attributes.SupplierCredentials.NOCREDITDEPOSITCOMMISIONABLEDETAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.noCreditDepositcommisionableDetail</code> attribute. 
	 * @param value the noCreditDepositcommisionableDetail
	 */
	public void setNoCreditDepositcommisionableDetail(final SupplierCredentials item, final NoCreditDepositCommSettlement value)
	{
		setNoCreditDepositcommisionableDetail( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.noCreditPrePaymentCommSettlement</code> attribute.
	 * @return the noCreditPrePaymentCommSettlement
	 */
	public NoCreditPrePaymentCommSettlement getNoCreditPrePaymentCommSettlement(final SessionContext ctx, final SupplierCredentials item)
	{
		return (NoCreditPrePaymentCommSettlement)item.getProperty( ctx, SuppliersettlementtermscoreConstants.Attributes.SupplierCredentials.NOCREDITPREPAYMENTCOMMSETTLEMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.noCreditPrePaymentCommSettlement</code> attribute.
	 * @return the noCreditPrePaymentCommSettlement
	 */
	public NoCreditPrePaymentCommSettlement getNoCreditPrePaymentCommSettlement(final SupplierCredentials item)
	{
		return getNoCreditPrePaymentCommSettlement( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.noCreditPrePaymentCommSettlement</code> attribute. 
	 * @param value the noCreditPrePaymentCommSettlement
	 */
	public void setNoCreditPrePaymentCommSettlement(final SessionContext ctx, final SupplierCredentials item, final NoCreditPrePaymentCommSettlement value)
	{
		item.setProperty(ctx, SuppliersettlementtermscoreConstants.Attributes.SupplierCredentials.NOCREDITPREPAYMENTCOMMSETTLEMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.noCreditPrePaymentCommSettlement</code> attribute. 
	 * @param value the noCreditPrePaymentCommSettlement
	 */
	public void setNoCreditPrePaymentCommSettlement(final SupplierCredentials item, final NoCreditPrePaymentCommSettlement value)
	{
		setNoCreditPrePaymentCommSettlement( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.settlementPeriodList</code> attribute.
	 * @return the settlementPeriodList
	 */
	public Collection<SettlementPeriod> getSettlementPeriodList(final SessionContext ctx, final Trigger item)
	{
		return TRIGGER2SETTLEMENTPERIODRELSSETTLEMENTPERIODLISTHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.settlementPeriodList</code> attribute.
	 * @return the settlementPeriodList
	 */
	public Collection<SettlementPeriod> getSettlementPeriodList(final Trigger item)
	{
		return getSettlementPeriodList( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Trigger.settlementPeriodList</code> attribute. 
	 * @param value the settlementPeriodList
	 */
	public void setSettlementPeriodList(final SessionContext ctx, final Trigger item, final Collection<SettlementPeriod> value)
	{
		TRIGGER2SETTLEMENTPERIODRELSSETTLEMENTPERIODLISTHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Trigger.settlementPeriodList</code> attribute. 
	 * @param value the settlementPeriodList
	 */
	public void setSettlementPeriodList(final Trigger item, final Collection<SettlementPeriod> value)
	{
		setSettlementPeriodList( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to settlementPeriodList. 
	 * @param value the item to add to settlementPeriodList
	 */
	public void addToSettlementPeriodList(final SessionContext ctx, final Trigger item, final SettlementPeriod value)
	{
		TRIGGER2SETTLEMENTPERIODRELSSETTLEMENTPERIODLISTHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to settlementPeriodList. 
	 * @param value the item to add to settlementPeriodList
	 */
	public void addToSettlementPeriodList(final Trigger item, final SettlementPeriod value)
	{
		addToSettlementPeriodList( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from settlementPeriodList. 
	 * @param value the item to remove from settlementPeriodList
	 */
	public void removeFromSettlementPeriodList(final SessionContext ctx, final Trigger item, final SettlementPeriod value)
	{
		TRIGGER2SETTLEMENTPERIODRELSSETTLEMENTPERIODLISTHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from settlementPeriodList. 
	 * @param value the item to remove from settlementPeriodList
	 */
	public void removeFromSettlementPeriodList(final Trigger item, final SettlementPeriod value)
	{
		removeFromSettlementPeriodList( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.settlementSchedule</code> attribute.
	 * @return the settlementSchedule
	 */
	public EnumerationValue getSettlementSchedule(final SessionContext ctx, final Trigger item)
	{
		return (EnumerationValue)item.getProperty( ctx, SuppliersettlementtermscoreConstants.Attributes.Trigger.SETTLEMENTSCHEDULE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.settlementSchedule</code> attribute.
	 * @return the settlementSchedule
	 */
	public EnumerationValue getSettlementSchedule(final Trigger item)
	{
		return getSettlementSchedule( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Trigger.settlementSchedule</code> attribute. 
	 * @param value the settlementSchedule
	 */
	public void setSettlementSchedule(final SessionContext ctx, final Trigger item, final EnumerationValue value)
	{
		item.setProperty(ctx, SuppliersettlementtermscoreConstants.Attributes.Trigger.SETTLEMENTSCHEDULE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Trigger.settlementSchedule</code> attribute. 
	 * @param value the settlementSchedule
	 */
	public void setSettlementSchedule(final Trigger item, final EnumerationValue value)
	{
		setSettlementSchedule( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.supplierSettlement</code> attribute.
	 * @return the supplierSettlement
	 */
	public SupplierSettlement getSupplierSettlement(final SessionContext ctx, final GenericItem item)
	{
		return (SupplierSettlement)item.getProperty( ctx, SuppliersettlementtermscoreConstants.Attributes.BankAccountDetail.SUPPLIERSETTLEMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.supplierSettlement</code> attribute.
	 * @return the supplierSettlement
	 */
	public SupplierSettlement getSupplierSettlement(final BankAccountDetail item)
	{
		return getSupplierSettlement( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.supplierSettlement</code> attribute. 
	 * @param value the supplierSettlement
	 */
	public void setSupplierSettlement(final SessionContext ctx, final GenericItem item, final SupplierSettlement value)
	{
		item.setProperty(ctx, SuppliersettlementtermscoreConstants.Attributes.BankAccountDetail.SUPPLIERSETTLEMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.supplierSettlement</code> attribute. 
	 * @param value the supplierSettlement
	 */
	public void setSupplierSettlement(final BankAccountDetail item, final SupplierSettlement value)
	{
		setSupplierSettlement( getSession().getSessionContext(), item, value );
	}
	
}
