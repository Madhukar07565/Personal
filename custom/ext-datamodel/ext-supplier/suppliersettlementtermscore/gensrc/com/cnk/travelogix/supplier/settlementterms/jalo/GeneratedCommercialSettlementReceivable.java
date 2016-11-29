/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.settlementterms.jalo;

import com.cnk.travelogix.supplier.settlementterms.core.constants.SuppliersettlementtermscoreConstants;
import com.cnk.travelogix.supplier.settlementterms.jalo.AbstractSupplierSettlement;
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
import de.hybris.platform.util.PartOfHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.settlementterms.jalo.CommercialSettlementReceivable CommercialSettlementReceivable}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCommercialSettlementReceivable extends AbstractSupplierSettlement
{
	/** Qualifier of the <code>CommercialSettlementReceivable.supplierSettlementPeriodicity</code> attribute **/
	public static final String SUPPLIERSETTLEMENTPERIODICITY = "supplierSettlementPeriodicity";
	/** Qualifier of the <code>CommercialSettlementReceivable.settlementScheduleType</code> attribute **/
	public static final String SETTLEMENTSCHEDULETYPE = "settlementScheduleType";
	/** Qualifier of the <code>CommercialSettlementReceivable.supplierSettlement</code> attribute **/
	public static final String SUPPLIERSETTLEMENT = "supplierSettlement";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SUPPLIERSETTLEMENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCommercialSettlementReceivable> SUPPLIERSETTLEMENTHANDLER = new BidirectionalOneToManyHandler<GeneratedCommercialSettlementReceivable>(
	SuppliersettlementtermscoreConstants.TC.COMMERCIALSETTLEMENTRECEIVABLE,
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
	 * <i>Generated method</i> - Getter of the <code>CommercialSettlementReceivable.settlementScheduleType</code> attribute.
	 * @return the settlementScheduleType
	 */
	public EnumerationValue getSettlementScheduleType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SETTLEMENTSCHEDULETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialSettlementReceivable.settlementScheduleType</code> attribute.
	 * @return the settlementScheduleType
	 */
	public EnumerationValue getSettlementScheduleType()
	{
		return getSettlementScheduleType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialSettlementReceivable.settlementScheduleType</code> attribute. 
	 * @param value the settlementScheduleType
	 */
	public void setSettlementScheduleType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SETTLEMENTSCHEDULETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialSettlementReceivable.settlementScheduleType</code> attribute. 
	 * @param value the settlementScheduleType
	 */
	public void setSettlementScheduleType(final EnumerationValue value)
	{
		setSettlementScheduleType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialSettlementReceivable.supplierSettlement</code> attribute.
	 * @return the supplierSettlement
	 */
	public SupplierSettlement getSupplierSettlement(final SessionContext ctx)
	{
		return (SupplierSettlement)getProperty( ctx, SUPPLIERSETTLEMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialSettlementReceivable.supplierSettlement</code> attribute.
	 * @return the supplierSettlement
	 */
	public SupplierSettlement getSupplierSettlement()
	{
		return getSupplierSettlement( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialSettlementReceivable.supplierSettlement</code> attribute. 
	 * @param value the supplierSettlement
	 */
	public void setSupplierSettlement(final SessionContext ctx, final SupplierSettlement value)
	{
		SUPPLIERSETTLEMENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialSettlementReceivable.supplierSettlement</code> attribute. 
	 * @param value the supplierSettlement
	 */
	public void setSupplierSettlement(final SupplierSettlement value)
	{
		setSupplierSettlement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialSettlementReceivable.supplierSettlementPeriodicity</code> attribute.
	 * @return the supplierSettlementPeriodicity
	 */
	public Trigger getSupplierSettlementPeriodicity(final SessionContext ctx)
	{
		return (Trigger)getProperty( ctx, SUPPLIERSETTLEMENTPERIODICITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialSettlementReceivable.supplierSettlementPeriodicity</code> attribute.
	 * @return the supplierSettlementPeriodicity
	 */
	public Trigger getSupplierSettlementPeriodicity()
	{
		return getSupplierSettlementPeriodicity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialSettlementReceivable.supplierSettlementPeriodicity</code> attribute. 
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
	 * <i>Generated method</i> - Setter of the <code>CommercialSettlementReceivable.supplierSettlementPeriodicity</code> attribute. 
	 * @param value the supplierSettlementPeriodicity
	 */
	public void setSupplierSettlementPeriodicity(final Trigger value)
	{
		setSupplierSettlementPeriodicity( getSession().getSessionContext(), value );
	}
	
}
