/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.settlementterms.jalo;

import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.masterdata.core.jalo.BankAccountDetail;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import com.cnk.travelogix.supplier.settlementterms.core.constants.SuppliersettlementtermscoreConstants;
import com.cnk.travelogix.supplier.settlementterms.jalo.AdvCommercialSettlementPayable;
import com.cnk.travelogix.supplier.settlementterms.jalo.CommercialSettlementReceivable;
import com.cnk.travelogix.supplier.settlementterms.jalo.StdCommCommisionableSettlement;
import com.cnk.travelogix.supplier.settlementterms.jalo.StdCommNonComissionableSettlement;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.settlementterms.jalo.SupplierSettlement SupplierSettlement}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierSettlement extends AbstractTravelogixItem
{
	/** Qualifier of the <code>SupplierSettlement.supplier</code> attribute **/
	public static final String SUPPLIER = "supplier";
	/** Qualifier of the <code>SupplierSettlement.workFlowStatus</code> attribute **/
	public static final String WORKFLOWSTATUS = "workFlowStatus";
	/** Qualifier of the <code>SupplierSettlement.bankDetailList</code> attribute **/
	public static final String BANKDETAILLIST = "bankDetailList";
	/** Qualifier of the <code>SupplierSettlement.advCommercialSettlementPayable</code> attribute **/
	public static final String ADVCOMMERCIALSETTLEMENTPAYABLE = "advCommercialSettlementPayable";
	/** Qualifier of the <code>SupplierSettlement.commercialSettlementReceivable</code> attribute **/
	public static final String COMMERCIALSETTLEMENTRECEIVABLE = "commercialSettlementReceivable";
	/** Qualifier of the <code>SupplierSettlement.stdCommCommisionableSettlement</code> attribute **/
	public static final String STDCOMMCOMMISIONABLESETTLEMENT = "stdCommCommisionableSettlement";
	/** Qualifier of the <code>SupplierSettlement.stdCommNonComissionableSettlement</code> attribute **/
	public static final String STDCOMMNONCOMISSIONABLESETTLEMENT = "stdCommNonComissionableSettlement";
	/**
	* {@link OneToManyHandler} for handling 1:n BANKDETAILLIST's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BankAccountDetail> BANKDETAILLISTHANDLER = new OneToManyHandler<BankAccountDetail>(
	MasterdatacoreConstants.TC.BANKACCOUNTDETAIL,
	false,
	"supplierSettlement",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ADVCOMMERCIALSETTLEMENTPAYABLE's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AdvCommercialSettlementPayable> ADVCOMMERCIALSETTLEMENTPAYABLEHANDLER = new OneToManyHandler<AdvCommercialSettlementPayable>(
	SuppliersettlementtermscoreConstants.TC.ADVCOMMERCIALSETTLEMENTPAYABLE,
	false,
	"supplierSettlement",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n COMMERCIALSETTLEMENTRECEIVABLE's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CommercialSettlementReceivable> COMMERCIALSETTLEMENTRECEIVABLEHANDLER = new OneToManyHandler<CommercialSettlementReceivable>(
	SuppliersettlementtermscoreConstants.TC.COMMERCIALSETTLEMENTRECEIVABLE,
	false,
	"supplierSettlement",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n STDCOMMCOMMISIONABLESETTLEMENT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<StdCommCommisionableSettlement> STDCOMMCOMMISIONABLESETTLEMENTHANDLER = new OneToManyHandler<StdCommCommisionableSettlement>(
	SuppliersettlementtermscoreConstants.TC.STDCOMMCOMMISIONABLESETTLEMENT,
	false,
	"supplierSettlement",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n STDCOMMNONCOMISSIONABLESETTLEMENT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<StdCommNonComissionableSettlement> STDCOMMNONCOMISSIONABLESETTLEMENTHANDLER = new OneToManyHandler<StdCommNonComissionableSettlement>(
	SuppliersettlementtermscoreConstants.TC.STDCOMMNONCOMISSIONABLESETTLEMENT,
	false,
	"supplierSettlement",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SUPPLIER, AttributeMode.INITIAL);
		tmp.put(WORKFLOWSTATUS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierSettlement.advCommercialSettlementPayable</code> attribute.
	 * @return the advCommercialSettlementPayable
	 */
	public Collection<AdvCommercialSettlementPayable> getAdvCommercialSettlementPayable(final SessionContext ctx)
	{
		return ADVCOMMERCIALSETTLEMENTPAYABLEHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierSettlement.advCommercialSettlementPayable</code> attribute.
	 * @return the advCommercialSettlementPayable
	 */
	public Collection<AdvCommercialSettlementPayable> getAdvCommercialSettlementPayable()
	{
		return getAdvCommercialSettlementPayable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierSettlement.advCommercialSettlementPayable</code> attribute. 
	 * @param value the advCommercialSettlementPayable
	 */
	public void setAdvCommercialSettlementPayable(final SessionContext ctx, final Collection<AdvCommercialSettlementPayable> value)
	{
		ADVCOMMERCIALSETTLEMENTPAYABLEHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierSettlement.advCommercialSettlementPayable</code> attribute. 
	 * @param value the advCommercialSettlementPayable
	 */
	public void setAdvCommercialSettlementPayable(final Collection<AdvCommercialSettlementPayable> value)
	{
		setAdvCommercialSettlementPayable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to advCommercialSettlementPayable. 
	 * @param value the item to add to advCommercialSettlementPayable
	 */
	public void addToAdvCommercialSettlementPayable(final SessionContext ctx, final AdvCommercialSettlementPayable value)
	{
		ADVCOMMERCIALSETTLEMENTPAYABLEHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to advCommercialSettlementPayable. 
	 * @param value the item to add to advCommercialSettlementPayable
	 */
	public void addToAdvCommercialSettlementPayable(final AdvCommercialSettlementPayable value)
	{
		addToAdvCommercialSettlementPayable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from advCommercialSettlementPayable. 
	 * @param value the item to remove from advCommercialSettlementPayable
	 */
	public void removeFromAdvCommercialSettlementPayable(final SessionContext ctx, final AdvCommercialSettlementPayable value)
	{
		ADVCOMMERCIALSETTLEMENTPAYABLEHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from advCommercialSettlementPayable. 
	 * @param value the item to remove from advCommercialSettlementPayable
	 */
	public void removeFromAdvCommercialSettlementPayable(final AdvCommercialSettlementPayable value)
	{
		removeFromAdvCommercialSettlementPayable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierSettlement.bankDetailList</code> attribute.
	 * @return the bankDetailList
	 */
	public Collection<BankAccountDetail> getBankDetailList(final SessionContext ctx)
	{
		return BANKDETAILLISTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierSettlement.bankDetailList</code> attribute.
	 * @return the bankDetailList
	 */
	public Collection<BankAccountDetail> getBankDetailList()
	{
		return getBankDetailList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierSettlement.bankDetailList</code> attribute. 
	 * @param value the bankDetailList
	 */
	public void setBankDetailList(final SessionContext ctx, final Collection<BankAccountDetail> value)
	{
		BANKDETAILLISTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierSettlement.bankDetailList</code> attribute. 
	 * @param value the bankDetailList
	 */
	public void setBankDetailList(final Collection<BankAccountDetail> value)
	{
		setBankDetailList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bankDetailList. 
	 * @param value the item to add to bankDetailList
	 */
	public void addToBankDetailList(final SessionContext ctx, final BankAccountDetail value)
	{
		BANKDETAILLISTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bankDetailList. 
	 * @param value the item to add to bankDetailList
	 */
	public void addToBankDetailList(final BankAccountDetail value)
	{
		addToBankDetailList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bankDetailList. 
	 * @param value the item to remove from bankDetailList
	 */
	public void removeFromBankDetailList(final SessionContext ctx, final BankAccountDetail value)
	{
		BANKDETAILLISTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bankDetailList. 
	 * @param value the item to remove from bankDetailList
	 */
	public void removeFromBankDetailList(final BankAccountDetail value)
	{
		removeFromBankDetailList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierSettlement.commercialSettlementReceivable</code> attribute.
	 * @return the commercialSettlementReceivable
	 */
	public Collection<CommercialSettlementReceivable> getCommercialSettlementReceivable(final SessionContext ctx)
	{
		return COMMERCIALSETTLEMENTRECEIVABLEHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierSettlement.commercialSettlementReceivable</code> attribute.
	 * @return the commercialSettlementReceivable
	 */
	public Collection<CommercialSettlementReceivable> getCommercialSettlementReceivable()
	{
		return getCommercialSettlementReceivable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierSettlement.commercialSettlementReceivable</code> attribute. 
	 * @param value the commercialSettlementReceivable
	 */
	public void setCommercialSettlementReceivable(final SessionContext ctx, final Collection<CommercialSettlementReceivable> value)
	{
		COMMERCIALSETTLEMENTRECEIVABLEHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierSettlement.commercialSettlementReceivable</code> attribute. 
	 * @param value the commercialSettlementReceivable
	 */
	public void setCommercialSettlementReceivable(final Collection<CommercialSettlementReceivable> value)
	{
		setCommercialSettlementReceivable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to commercialSettlementReceivable. 
	 * @param value the item to add to commercialSettlementReceivable
	 */
	public void addToCommercialSettlementReceivable(final SessionContext ctx, final CommercialSettlementReceivable value)
	{
		COMMERCIALSETTLEMENTRECEIVABLEHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to commercialSettlementReceivable. 
	 * @param value the item to add to commercialSettlementReceivable
	 */
	public void addToCommercialSettlementReceivable(final CommercialSettlementReceivable value)
	{
		addToCommercialSettlementReceivable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from commercialSettlementReceivable. 
	 * @param value the item to remove from commercialSettlementReceivable
	 */
	public void removeFromCommercialSettlementReceivable(final SessionContext ctx, final CommercialSettlementReceivable value)
	{
		COMMERCIALSETTLEMENTRECEIVABLEHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from commercialSettlementReceivable. 
	 * @param value the item to remove from commercialSettlementReceivable
	 */
	public void removeFromCommercialSettlementReceivable(final CommercialSettlementReceivable value)
	{
		removeFromCommercialSettlementReceivable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierSettlement.stdCommCommisionableSettlement</code> attribute.
	 * @return the stdCommCommisionableSettlement
	 */
	public Collection<StdCommCommisionableSettlement> getStdCommCommisionableSettlement(final SessionContext ctx)
	{
		return STDCOMMCOMMISIONABLESETTLEMENTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierSettlement.stdCommCommisionableSettlement</code> attribute.
	 * @return the stdCommCommisionableSettlement
	 */
	public Collection<StdCommCommisionableSettlement> getStdCommCommisionableSettlement()
	{
		return getStdCommCommisionableSettlement( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierSettlement.stdCommCommisionableSettlement</code> attribute. 
	 * @param value the stdCommCommisionableSettlement
	 */
	public void setStdCommCommisionableSettlement(final SessionContext ctx, final Collection<StdCommCommisionableSettlement> value)
	{
		STDCOMMCOMMISIONABLESETTLEMENTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierSettlement.stdCommCommisionableSettlement</code> attribute. 
	 * @param value the stdCommCommisionableSettlement
	 */
	public void setStdCommCommisionableSettlement(final Collection<StdCommCommisionableSettlement> value)
	{
		setStdCommCommisionableSettlement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stdCommCommisionableSettlement. 
	 * @param value the item to add to stdCommCommisionableSettlement
	 */
	public void addToStdCommCommisionableSettlement(final SessionContext ctx, final StdCommCommisionableSettlement value)
	{
		STDCOMMCOMMISIONABLESETTLEMENTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stdCommCommisionableSettlement. 
	 * @param value the item to add to stdCommCommisionableSettlement
	 */
	public void addToStdCommCommisionableSettlement(final StdCommCommisionableSettlement value)
	{
		addToStdCommCommisionableSettlement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stdCommCommisionableSettlement. 
	 * @param value the item to remove from stdCommCommisionableSettlement
	 */
	public void removeFromStdCommCommisionableSettlement(final SessionContext ctx, final StdCommCommisionableSettlement value)
	{
		STDCOMMCOMMISIONABLESETTLEMENTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stdCommCommisionableSettlement. 
	 * @param value the item to remove from stdCommCommisionableSettlement
	 */
	public void removeFromStdCommCommisionableSettlement(final StdCommCommisionableSettlement value)
	{
		removeFromStdCommCommisionableSettlement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierSettlement.stdCommNonComissionableSettlement</code> attribute.
	 * @return the stdCommNonComissionableSettlement
	 */
	public Collection<StdCommNonComissionableSettlement> getStdCommNonComissionableSettlement(final SessionContext ctx)
	{
		return STDCOMMNONCOMISSIONABLESETTLEMENTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierSettlement.stdCommNonComissionableSettlement</code> attribute.
	 * @return the stdCommNonComissionableSettlement
	 */
	public Collection<StdCommNonComissionableSettlement> getStdCommNonComissionableSettlement()
	{
		return getStdCommNonComissionableSettlement( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierSettlement.stdCommNonComissionableSettlement</code> attribute. 
	 * @param value the stdCommNonComissionableSettlement
	 */
	public void setStdCommNonComissionableSettlement(final SessionContext ctx, final Collection<StdCommNonComissionableSettlement> value)
	{
		STDCOMMNONCOMISSIONABLESETTLEMENTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierSettlement.stdCommNonComissionableSettlement</code> attribute. 
	 * @param value the stdCommNonComissionableSettlement
	 */
	public void setStdCommNonComissionableSettlement(final Collection<StdCommNonComissionableSettlement> value)
	{
		setStdCommNonComissionableSettlement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stdCommNonComissionableSettlement. 
	 * @param value the item to add to stdCommNonComissionableSettlement
	 */
	public void addToStdCommNonComissionableSettlement(final SessionContext ctx, final StdCommNonComissionableSettlement value)
	{
		STDCOMMNONCOMISSIONABLESETTLEMENTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stdCommNonComissionableSettlement. 
	 * @param value the item to add to stdCommNonComissionableSettlement
	 */
	public void addToStdCommNonComissionableSettlement(final StdCommNonComissionableSettlement value)
	{
		addToStdCommNonComissionableSettlement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stdCommNonComissionableSettlement. 
	 * @param value the item to remove from stdCommNonComissionableSettlement
	 */
	public void removeFromStdCommNonComissionableSettlement(final SessionContext ctx, final StdCommNonComissionableSettlement value)
	{
		STDCOMMNONCOMISSIONABLESETTLEMENTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stdCommNonComissionableSettlement. 
	 * @param value the item to remove from stdCommNonComissionableSettlement
	 */
	public void removeFromStdCommNonComissionableSettlement(final StdCommNonComissionableSettlement value)
	{
		removeFromStdCommNonComissionableSettlement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierSettlement.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, SUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierSettlement.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier()
	{
		return getSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierSettlement.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, SUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierSettlement.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final Supplier value)
	{
		setSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierSettlement.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, WORKFLOWSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierSettlement.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus()
	{
		return getWorkFlowStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierSettlement.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, WORKFLOWSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierSettlement.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final EnumerationValue value)
	{
		setWorkFlowStatus( getSession().getSessionContext(), value );
	}
	
}
