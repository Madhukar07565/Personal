/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advanced.otherfee.jalo;

import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.supplier.commercials.core.advanced.otherfee.jalo.DynamicFeeConfig;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.AbstractCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierOtherFeeCommercial;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advanced.otherfee.jalo.SupplierOtherFeeCommercialRecord SupplierOtherFeeCommercialRecord}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierOtherFeeCommercialRecord extends AbstractCommercialRecord
{
	/** Qualifier of the <code>SupplierOtherFeeCommercialRecord.refundable</code> attribute **/
	public static final String REFUNDABLE = "refundable";
	/** Qualifier of the <code>SupplierOtherFeeCommercialRecord.recurring</code> attribute **/
	public static final String RECURRING = "recurring";
	/** Qualifier of the <code>SupplierOtherFeeCommercialRecord.onDemand</code> attribute **/
	public static final String ONDEMAND = "onDemand";
	/** Qualifier of the <code>SupplierOtherFeeCommercialRecord.percentage</code> attribute **/
	public static final String PERCENTAGE = "percentage";
	/** Qualifier of the <code>SupplierOtherFeeCommercialRecord.value</code> attribute **/
	public static final String VALUE = "value";
	/** Qualifier of the <code>SupplierOtherFeeCommercialRecord.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>SupplierOtherFeeCommercialRecord.percentages</code> attribute **/
	public static final String PERCENTAGES = "percentages";
	/** Qualifier of the <code>SupplierOtherFeeCommercialRecord.applyOn</code> attribute **/
	public static final String APPLYON = "applyOn";
	/** Relation ordering override parameter constants for OtherFee2ProdCatSubType from ((suppliercommercialscore))*/
	protected static String OTHERFEE2PRODCATSUBTYPE_SRC_ORDERED = "relation.OtherFee2ProdCatSubType.source.ordered";
	protected static String OTHERFEE2PRODCATSUBTYPE_TGT_ORDERED = "relation.OtherFee2ProdCatSubType.target.ordered";
	/** Relation disable markmodifed parameter constants for OtherFee2ProdCatSubType from ((suppliercommercialscore))*/
	protected static String OTHERFEE2PRODCATSUBTYPE_MARKMODIFIED = "relation.OtherFee2ProdCatSubType.markmodified";
	/** Qualifier of the <code>SupplierOtherFeeCommercialRecord.otherFeeCommercial</code> attribute **/
	public static final String OTHERFEECOMMERCIAL = "otherFeeCommercial";
	/**
	* {@link OneToManyHandler} for handling 1:n PERCENTAGES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DynamicFeeConfig> PERCENTAGESHANDLER = new OneToManyHandler<DynamicFeeConfig>(
	SuppliercommercialscoreConstants.TC.DYNAMICFEECONFIG,
	true,
	"commercial",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n OTHERFEECOMMERCIAL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSupplierOtherFeeCommercialRecord> OTHERFEECOMMERCIALHANDLER = new BidirectionalOneToManyHandler<GeneratedSupplierOtherFeeCommercialRecord>(
	SuppliercommercialscoreConstants.TC.SUPPLIEROTHERFEECOMMERCIALRECORD,
	false,
	"otherFeeCommercial",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCommercialRecord.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(REFUNDABLE, AttributeMode.INITIAL);
		tmp.put(RECURRING, AttributeMode.INITIAL);
		tmp.put(ONDEMAND, AttributeMode.INITIAL);
		tmp.put(PERCENTAGE, AttributeMode.INITIAL);
		tmp.put(VALUE, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(OTHERFEECOMMERCIAL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercialRecord.applyOn</code> attribute.
	 * @return the applyOn
	 */
	public Set<ProductCategorySubType> getApplyOn(final SessionContext ctx)
	{
		final List<ProductCategorySubType> items = getLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.OTHERFEE2PRODCATSUBTYPE,
			"ProductCategorySubType",
			null,
			false,
			false
		);
		return new LinkedHashSet<ProductCategorySubType>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercialRecord.applyOn</code> attribute.
	 * @return the applyOn
	 */
	public Set<ProductCategorySubType> getApplyOn()
	{
		return getApplyOn( getSession().getSessionContext() );
	}
	
	public long getApplyOnCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.OTHERFEE2PRODCATSUBTYPE,
			"ProductCategorySubType",
			null
		);
	}
	
	public long getApplyOnCount()
	{
		return getApplyOnCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercialRecord.applyOn</code> attribute. 
	 * @param value the applyOn
	 */
	public void setApplyOn(final SessionContext ctx, final Set<ProductCategorySubType> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.OTHERFEE2PRODCATSUBTYPE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(OTHERFEE2PRODCATSUBTYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercialRecord.applyOn</code> attribute. 
	 * @param value the applyOn
	 */
	public void setApplyOn(final Set<ProductCategorySubType> value)
	{
		setApplyOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to applyOn. 
	 * @param value the item to add to applyOn
	 */
	public void addToApplyOn(final SessionContext ctx, final ProductCategorySubType value)
	{
		addLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.OTHERFEE2PRODCATSUBTYPE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(OTHERFEE2PRODCATSUBTYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to applyOn. 
	 * @param value the item to add to applyOn
	 */
	public void addToApplyOn(final ProductCategorySubType value)
	{
		addToApplyOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from applyOn. 
	 * @param value the item to remove from applyOn
	 */
	public void removeFromApplyOn(final SessionContext ctx, final ProductCategorySubType value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.OTHERFEE2PRODCATSUBTYPE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(OTHERFEE2PRODCATSUBTYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from applyOn. 
	 * @param value the item to remove from applyOn
	 */
	public void removeFromApplyOn(final ProductCategorySubType value)
	{
		removeFromApplyOn( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		OTHERFEECOMMERCIALHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercialRecord.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercialRecord.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercialRecord.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercialRecord.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercialRecord.onDemand</code> attribute.
	 * @return the onDemand
	 */
	public Boolean isOnDemand(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ONDEMAND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercialRecord.onDemand</code> attribute.
	 * @return the onDemand
	 */
	public Boolean isOnDemand()
	{
		return isOnDemand( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercialRecord.onDemand</code> attribute. 
	 * @return the onDemand
	 */
	public boolean isOnDemandAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isOnDemand( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercialRecord.onDemand</code> attribute. 
	 * @return the onDemand
	 */
	public boolean isOnDemandAsPrimitive()
	{
		return isOnDemandAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercialRecord.onDemand</code> attribute. 
	 * @param value the onDemand
	 */
	public void setOnDemand(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ONDEMAND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercialRecord.onDemand</code> attribute. 
	 * @param value the onDemand
	 */
	public void setOnDemand(final Boolean value)
	{
		setOnDemand( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercialRecord.onDemand</code> attribute. 
	 * @param value the onDemand
	 */
	public void setOnDemand(final SessionContext ctx, final boolean value)
	{
		setOnDemand( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercialRecord.onDemand</code> attribute. 
	 * @param value the onDemand
	 */
	public void setOnDemand(final boolean value)
	{
		setOnDemand( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercialRecord.otherFeeCommercial</code> attribute.
	 * @return the otherFeeCommercial
	 */
	public SupplierOtherFeeCommercial getOtherFeeCommercial(final SessionContext ctx)
	{
		return (SupplierOtherFeeCommercial)getProperty( ctx, OTHERFEECOMMERCIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercialRecord.otherFeeCommercial</code> attribute.
	 * @return the otherFeeCommercial
	 */
	public SupplierOtherFeeCommercial getOtherFeeCommercial()
	{
		return getOtherFeeCommercial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercialRecord.otherFeeCommercial</code> attribute. 
	 * @param value the otherFeeCommercial
	 */
	public void setOtherFeeCommercial(final SessionContext ctx, final SupplierOtherFeeCommercial value)
	{
		OTHERFEECOMMERCIALHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercialRecord.otherFeeCommercial</code> attribute. 
	 * @param value the otherFeeCommercial
	 */
	public void setOtherFeeCommercial(final SupplierOtherFeeCommercial value)
	{
		setOtherFeeCommercial( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercialRecord.percentage</code> attribute.
	 * @return the percentage
	 */
	public Boolean isPercentage(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercialRecord.percentage</code> attribute.
	 * @return the percentage
	 */
	public Boolean isPercentage()
	{
		return isPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercialRecord.percentage</code> attribute. 
	 * @return the percentage
	 */
	public boolean isPercentageAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPercentage( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercialRecord.percentage</code> attribute. 
	 * @return the percentage
	 */
	public boolean isPercentageAsPrimitive()
	{
		return isPercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercialRecord.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercialRecord.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final Boolean value)
	{
		setPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercialRecord.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final SessionContext ctx, final boolean value)
	{
		setPercentage( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercialRecord.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final boolean value)
	{
		setPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercialRecord.percentages</code> attribute.
	 * @return the percentages
	 */
	public Collection<DynamicFeeConfig> getPercentages(final SessionContext ctx)
	{
		return PERCENTAGESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercialRecord.percentages</code> attribute.
	 * @return the percentages
	 */
	public Collection<DynamicFeeConfig> getPercentages()
	{
		return getPercentages( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercialRecord.percentages</code> attribute. 
	 * @param value the percentages
	 */
	public void setPercentages(final SessionContext ctx, final Collection<DynamicFeeConfig> value)
	{
		PERCENTAGESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercialRecord.percentages</code> attribute. 
	 * @param value the percentages
	 */
	public void setPercentages(final Collection<DynamicFeeConfig> value)
	{
		setPercentages( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to percentages. 
	 * @param value the item to add to percentages
	 */
	public void addToPercentages(final SessionContext ctx, final DynamicFeeConfig value)
	{
		PERCENTAGESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to percentages. 
	 * @param value the item to add to percentages
	 */
	public void addToPercentages(final DynamicFeeConfig value)
	{
		addToPercentages( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from percentages. 
	 * @param value the item to remove from percentages
	 */
	public void removeFromPercentages(final SessionContext ctx, final DynamicFeeConfig value)
	{
		PERCENTAGESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from percentages. 
	 * @param value the item to remove from percentages
	 */
	public void removeFromPercentages(final DynamicFeeConfig value)
	{
		removeFromPercentages( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercialRecord.recurring</code> attribute.
	 * @return the recurring
	 */
	public Boolean isRecurring(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, RECURRING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercialRecord.recurring</code> attribute.
	 * @return the recurring
	 */
	public Boolean isRecurring()
	{
		return isRecurring( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercialRecord.recurring</code> attribute. 
	 * @return the recurring
	 */
	public boolean isRecurringAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isRecurring( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercialRecord.recurring</code> attribute. 
	 * @return the recurring
	 */
	public boolean isRecurringAsPrimitive()
	{
		return isRecurringAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercialRecord.recurring</code> attribute. 
	 * @param value the recurring
	 */
	public void setRecurring(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, RECURRING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercialRecord.recurring</code> attribute. 
	 * @param value the recurring
	 */
	public void setRecurring(final Boolean value)
	{
		setRecurring( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercialRecord.recurring</code> attribute. 
	 * @param value the recurring
	 */
	public void setRecurring(final SessionContext ctx, final boolean value)
	{
		setRecurring( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercialRecord.recurring</code> attribute. 
	 * @param value the recurring
	 */
	public void setRecurring(final boolean value)
	{
		setRecurring( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercialRecord.refundable</code> attribute.
	 * @return the refundable
	 */
	public Boolean isRefundable(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, REFUNDABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercialRecord.refundable</code> attribute.
	 * @return the refundable
	 */
	public Boolean isRefundable()
	{
		return isRefundable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercialRecord.refundable</code> attribute. 
	 * @return the refundable
	 */
	public boolean isRefundableAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isRefundable( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercialRecord.refundable</code> attribute. 
	 * @return the refundable
	 */
	public boolean isRefundableAsPrimitive()
	{
		return isRefundableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercialRecord.refundable</code> attribute. 
	 * @param value the refundable
	 */
	public void setRefundable(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, REFUNDABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercialRecord.refundable</code> attribute. 
	 * @param value the refundable
	 */
	public void setRefundable(final Boolean value)
	{
		setRefundable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercialRecord.refundable</code> attribute. 
	 * @param value the refundable
	 */
	public void setRefundable(final SessionContext ctx, final boolean value)
	{
		setRefundable( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercialRecord.refundable</code> attribute. 
	 * @param value the refundable
	 */
	public void setRefundable(final boolean value)
	{
		setRefundable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercialRecord.value</code> attribute.
	 * @return the value
	 */
	public Double getValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, VALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercialRecord.value</code> attribute.
	 * @return the value
	 */
	public Double getValue()
	{
		return getValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercialRecord.value</code> attribute. 
	 * @return the value
	 */
	public double getValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercialRecord.value</code> attribute. 
	 * @return the value
	 */
	public double getValueAsPrimitive()
	{
		return getValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercialRecord.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, VALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercialRecord.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final Double value)
	{
		setValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercialRecord.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final SessionContext ctx, final double value)
	{
		setValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercialRecord.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final double value)
	{
		setValue( getSession().getSessionContext(), value );
	}
	
}
