/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.settlementterms.jalo;

import com.cnk.travelogix.supplier.settlementterms.core.constants.SuppliersettlementtermscoreConstants;
import com.cnk.travelogix.supplier.settlementterms.jalo.AbstractSupplierSettlement;
import com.cnk.travelogix.supplier.settlementterms.jalo.CreditCommSettlement;
import com.cnk.travelogix.supplier.settlementterms.jalo.NoCreditDepositCommSettlement;
import com.cnk.travelogix.supplier.settlementterms.jalo.SupplierSettlement;
import de.hybris.platform.cronjob.jalo.Trigger;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.PartOfHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.settlementterms.jalo.StdCommCommisionableSettlement StdCommCommisionableSettlement}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedStdCommCommisionableSettlement extends AbstractSupplierSettlement
{
	/** Qualifier of the <code>StdCommCommisionableSettlement.settlementOn</code> attribute **/
	public static final String SETTLEMENTON = "settlementOn";
	/** Qualifier of the <code>StdCommCommisionableSettlement.typeOfSettlement</code> attribute **/
	public static final String TYPEOFSETTLEMENT = "typeOfSettlement";
	/** Qualifier of the <code>StdCommCommisionableSettlement.supplierSettlementPeriodicity</code> attribute **/
	public static final String SUPPLIERSETTLEMENTPERIODICITY = "supplierSettlementPeriodicity";
	/** Qualifier of the <code>StdCommCommisionableSettlement.settlementScheduleType</code> attribute **/
	public static final String SETTLEMENTSCHEDULETYPE = "settlementScheduleType";
	/** Qualifier of the <code>StdCommCommisionableSettlement.creditDetails</code> attribute **/
	public static final String CREDITDETAILS = "creditDetails";
	/** Qualifier of the <code>StdCommCommisionableSettlement.noCreditDepositDetails</code> attribute **/
	public static final String NOCREDITDEPOSITDETAILS = "noCreditDepositDetails";
	/** Qualifier of the <code>StdCommCommisionableSettlement.supplierSettlement</code> attribute **/
	public static final String SUPPLIERSETTLEMENT = "supplierSettlement";
	/**
	* {@link OneToManyHandler} for handling 1:n CREDITDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CreditCommSettlement> CREDITDETAILSHANDLER = new OneToManyHandler<CreditCommSettlement>(
	SuppliersettlementtermscoreConstants.TC.CREDITCOMMSETTLEMENT,
	false,
	"stdCommCommisionableSettlement",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n NOCREDITDEPOSITDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<NoCreditDepositCommSettlement> NOCREDITDEPOSITDETAILSHANDLER = new OneToManyHandler<NoCreditDepositCommSettlement>(
	SuppliersettlementtermscoreConstants.TC.NOCREDITDEPOSITCOMMSETTLEMENT,
	false,
	"stdCommCommisionableSettlement",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SUPPLIERSETTLEMENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedStdCommCommisionableSettlement> SUPPLIERSETTLEMENTHANDLER = new BidirectionalOneToManyHandler<GeneratedStdCommCommisionableSettlement>(
	SuppliersettlementtermscoreConstants.TC.STDCOMMCOMMISIONABLESETTLEMENT,
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractSupplierSettlement.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SETTLEMENTON, AttributeMode.INITIAL);
		tmp.put(TYPEOFSETTLEMENT, AttributeMode.INITIAL);
		tmp.put(SUPPLIERSETTLEMENTPERIODICITY, AttributeMode.INITIAL);
		tmp.put(SETTLEMENTSCHEDULETYPE, AttributeMode.INITIAL);
		tmp.put(SUPPLIERSETTLEMENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		SUPPLIERSETTLEMENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StdCommCommisionableSettlement.creditDetails</code> attribute.
	 * @return the creditDetails
	 */
	public Collection<CreditCommSettlement> getCreditDetails(final SessionContext ctx)
	{
		return CREDITDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StdCommCommisionableSettlement.creditDetails</code> attribute.
	 * @return the creditDetails
	 */
	public Collection<CreditCommSettlement> getCreditDetails()
	{
		return getCreditDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StdCommCommisionableSettlement.creditDetails</code> attribute. 
	 * @param value the creditDetails
	 */
	public void setCreditDetails(final SessionContext ctx, final Collection<CreditCommSettlement> value)
	{
		CREDITDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StdCommCommisionableSettlement.creditDetails</code> attribute. 
	 * @param value the creditDetails
	 */
	public void setCreditDetails(final Collection<CreditCommSettlement> value)
	{
		setCreditDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to creditDetails. 
	 * @param value the item to add to creditDetails
	 */
	public void addToCreditDetails(final SessionContext ctx, final CreditCommSettlement value)
	{
		CREDITDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to creditDetails. 
	 * @param value the item to add to creditDetails
	 */
	public void addToCreditDetails(final CreditCommSettlement value)
	{
		addToCreditDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from creditDetails. 
	 * @param value the item to remove from creditDetails
	 */
	public void removeFromCreditDetails(final SessionContext ctx, final CreditCommSettlement value)
	{
		CREDITDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from creditDetails. 
	 * @param value the item to remove from creditDetails
	 */
	public void removeFromCreditDetails(final CreditCommSettlement value)
	{
		removeFromCreditDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StdCommCommisionableSettlement.noCreditDepositDetails</code> attribute.
	 * @return the noCreditDepositDetails
	 */
	public Collection<NoCreditDepositCommSettlement> getNoCreditDepositDetails(final SessionContext ctx)
	{
		return NOCREDITDEPOSITDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StdCommCommisionableSettlement.noCreditDepositDetails</code> attribute.
	 * @return the noCreditDepositDetails
	 */
	public Collection<NoCreditDepositCommSettlement> getNoCreditDepositDetails()
	{
		return getNoCreditDepositDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StdCommCommisionableSettlement.noCreditDepositDetails</code> attribute. 
	 * @param value the noCreditDepositDetails
	 */
	public void setNoCreditDepositDetails(final SessionContext ctx, final Collection<NoCreditDepositCommSettlement> value)
	{
		NOCREDITDEPOSITDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StdCommCommisionableSettlement.noCreditDepositDetails</code> attribute. 
	 * @param value the noCreditDepositDetails
	 */
	public void setNoCreditDepositDetails(final Collection<NoCreditDepositCommSettlement> value)
	{
		setNoCreditDepositDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to noCreditDepositDetails. 
	 * @param value the item to add to noCreditDepositDetails
	 */
	public void addToNoCreditDepositDetails(final SessionContext ctx, final NoCreditDepositCommSettlement value)
	{
		NOCREDITDEPOSITDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to noCreditDepositDetails. 
	 * @param value the item to add to noCreditDepositDetails
	 */
	public void addToNoCreditDepositDetails(final NoCreditDepositCommSettlement value)
	{
		addToNoCreditDepositDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from noCreditDepositDetails. 
	 * @param value the item to remove from noCreditDepositDetails
	 */
	public void removeFromNoCreditDepositDetails(final SessionContext ctx, final NoCreditDepositCommSettlement value)
	{
		NOCREDITDEPOSITDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from noCreditDepositDetails. 
	 * @param value the item to remove from noCreditDepositDetails
	 */
	public void removeFromNoCreditDepositDetails(final NoCreditDepositCommSettlement value)
	{
		removeFromNoCreditDepositDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StdCommCommisionableSettlement.settlementOn</code> attribute.
	 * @return the settlementOn
	 */
	public EnumerationValue getSettlementOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SETTLEMENTON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StdCommCommisionableSettlement.settlementOn</code> attribute.
	 * @return the settlementOn
	 */
	public EnumerationValue getSettlementOn()
	{
		return getSettlementOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StdCommCommisionableSettlement.settlementOn</code> attribute. 
	 * @param value the settlementOn
	 */
	public void setSettlementOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SETTLEMENTON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StdCommCommisionableSettlement.settlementOn</code> attribute. 
	 * @param value the settlementOn
	 */
	public void setSettlementOn(final EnumerationValue value)
	{
		setSettlementOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StdCommCommisionableSettlement.settlementScheduleType</code> attribute.
	 * @return the settlementScheduleType
	 */
	public EnumerationValue getSettlementScheduleType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SETTLEMENTSCHEDULETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StdCommCommisionableSettlement.settlementScheduleType</code> attribute.
	 * @return the settlementScheduleType
	 */
	public EnumerationValue getSettlementScheduleType()
	{
		return getSettlementScheduleType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StdCommCommisionableSettlement.settlementScheduleType</code> attribute. 
	 * @param value the settlementScheduleType
	 */
	public void setSettlementScheduleType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SETTLEMENTSCHEDULETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StdCommCommisionableSettlement.settlementScheduleType</code> attribute. 
	 * @param value the settlementScheduleType
	 */
	public void setSettlementScheduleType(final EnumerationValue value)
	{
		setSettlementScheduleType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StdCommCommisionableSettlement.supplierSettlement</code> attribute.
	 * @return the supplierSettlement
	 */
	public SupplierSettlement getSupplierSettlement(final SessionContext ctx)
	{
		return (SupplierSettlement)getProperty( ctx, SUPPLIERSETTLEMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StdCommCommisionableSettlement.supplierSettlement</code> attribute.
	 * @return the supplierSettlement
	 */
	public SupplierSettlement getSupplierSettlement()
	{
		return getSupplierSettlement( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StdCommCommisionableSettlement.supplierSettlement</code> attribute. 
	 * @param value the supplierSettlement
	 */
	public void setSupplierSettlement(final SessionContext ctx, final SupplierSettlement value)
	{
		SUPPLIERSETTLEMENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StdCommCommisionableSettlement.supplierSettlement</code> attribute. 
	 * @param value the supplierSettlement
	 */
	public void setSupplierSettlement(final SupplierSettlement value)
	{
		setSupplierSettlement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StdCommCommisionableSettlement.supplierSettlementPeriodicity</code> attribute.
	 * @return the supplierSettlementPeriodicity
	 */
	public Trigger getSupplierSettlementPeriodicity(final SessionContext ctx)
	{
		return (Trigger)getProperty( ctx, SUPPLIERSETTLEMENTPERIODICITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StdCommCommisionableSettlement.supplierSettlementPeriodicity</code> attribute.
	 * @return the supplierSettlementPeriodicity
	 */
	public Trigger getSupplierSettlementPeriodicity()
	{
		return getSupplierSettlementPeriodicity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StdCommCommisionableSettlement.supplierSettlementPeriodicity</code> attribute. 
	 * @param value the supplierSettlementPeriodicity
	 */
	public void setSupplierSettlementPeriodicity(final SessionContext ctx, final Trigger value)
	{
		new PartOfHandler<Trigger>()
		{
			@Override
			protected Trigger doGetValue(final SessionContext ctx)
			{
				return getSupplierSettlementPeriodicity( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final Trigger _value)
			{
				final Trigger value = _value;
				setProperty(ctx, SUPPLIERSETTLEMENTPERIODICITY,value);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StdCommCommisionableSettlement.supplierSettlementPeriodicity</code> attribute. 
	 * @param value the supplierSettlementPeriodicity
	 */
	public void setSupplierSettlementPeriodicity(final Trigger value)
	{
		setSupplierSettlementPeriodicity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StdCommCommisionableSettlement.typeOfSettlement</code> attribute.
	 * @return the typeOfSettlement
	 */
	public EnumerationValue getTypeOfSettlement(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPEOFSETTLEMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StdCommCommisionableSettlement.typeOfSettlement</code> attribute.
	 * @return the typeOfSettlement
	 */
	public EnumerationValue getTypeOfSettlement()
	{
		return getTypeOfSettlement( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StdCommCommisionableSettlement.typeOfSettlement</code> attribute. 
	 * @param value the typeOfSettlement
	 */
	public void setTypeOfSettlement(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPEOFSETTLEMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StdCommCommisionableSettlement.typeOfSettlement</code> attribute. 
	 * @param value the typeOfSettlement
	 */
	public void setTypeOfSettlement(final EnumerationValue value)
	{
		setTypeOfSettlement( getSession().getSessionContext(), value );
	}
	
}
