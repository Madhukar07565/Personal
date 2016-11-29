/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advanced.termination.jalo;

import com.cnk.travelogix.supplier.commercials.core.advanced.termination.jalo.ReturnOfPayable;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.AbstractCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierTerminationFeeCommercial;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advanced.termination.jalo.SupplierTerminationFeeCommercialRecord SupplierTerminationFeeCommercialRecord}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierTerminationFeeCommercialRecord extends AbstractCommercialRecord
{
	/** Qualifier of the <code>SupplierTerminationFeeCommercialRecord.fixed</code> attribute **/
	public static final String FIXED = "fixed";
	/** Qualifier of the <code>SupplierTerminationFeeCommercialRecord.returnsOfPayable</code> attribute **/
	public static final String RETURNSOFPAYABLE = "returnsOfPayable";
	/** Qualifier of the <code>SupplierTerminationFeeCommercialRecord.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>SupplierTerminationFeeCommercialRecord.value</code> attribute **/
	public static final String VALUE = "value";
	/** Qualifier of the <code>SupplierTerminationFeeCommercialRecord.returnOfPayables</code> attribute **/
	public static final String RETURNOFPAYABLES = "returnOfPayables";
	/** Qualifier of the <code>SupplierTerminationFeeCommercialRecord.terminationFeeCommercial</code> attribute **/
	public static final String TERMINATIONFEECOMMERCIAL = "terminationFeeCommercial";
	/**
	* {@link OneToManyHandler} for handling 1:n RETURNOFPAYABLES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ReturnOfPayable> RETURNOFPAYABLESHANDLER = new OneToManyHandler<ReturnOfPayable>(
	SuppliercommercialscoreConstants.TC.RETURNOFPAYABLE,
	true,
	"commercial",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TERMINATIONFEECOMMERCIAL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSupplierTerminationFeeCommercialRecord> TERMINATIONFEECOMMERCIALHANDLER = new BidirectionalOneToManyHandler<GeneratedSupplierTerminationFeeCommercialRecord>(
	SuppliercommercialscoreConstants.TC.SUPPLIERTERMINATIONFEECOMMERCIALRECORD,
	false,
	"terminationFeeCommercial",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCommercialRecord.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(FIXED, AttributeMode.INITIAL);
		tmp.put(RETURNSOFPAYABLE, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(VALUE, AttributeMode.INITIAL);
		tmp.put(TERMINATIONFEECOMMERCIAL, AttributeMode.INITIAL);
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
		TERMINATIONFEECOMMERCIALHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierTerminationFeeCommercialRecord.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierTerminationFeeCommercialRecord.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierTerminationFeeCommercialRecord.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierTerminationFeeCommercialRecord.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierTerminationFeeCommercialRecord.fixed</code> attribute.
	 * @return the fixed
	 */
	public Boolean isFixed(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, FIXED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierTerminationFeeCommercialRecord.fixed</code> attribute.
	 * @return the fixed
	 */
	public Boolean isFixed()
	{
		return isFixed( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierTerminationFeeCommercialRecord.fixed</code> attribute. 
	 * @return the fixed
	 */
	public boolean isFixedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isFixed( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierTerminationFeeCommercialRecord.fixed</code> attribute. 
	 * @return the fixed
	 */
	public boolean isFixedAsPrimitive()
	{
		return isFixedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierTerminationFeeCommercialRecord.fixed</code> attribute. 
	 * @param value the fixed
	 */
	public void setFixed(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, FIXED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierTerminationFeeCommercialRecord.fixed</code> attribute. 
	 * @param value the fixed
	 */
	public void setFixed(final Boolean value)
	{
		setFixed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierTerminationFeeCommercialRecord.fixed</code> attribute. 
	 * @param value the fixed
	 */
	public void setFixed(final SessionContext ctx, final boolean value)
	{
		setFixed( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierTerminationFeeCommercialRecord.fixed</code> attribute. 
	 * @param value the fixed
	 */
	public void setFixed(final boolean value)
	{
		setFixed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierTerminationFeeCommercialRecord.returnOfPayables</code> attribute.
	 * @return the returnOfPayables
	 */
	public Collection<ReturnOfPayable> getReturnOfPayables(final SessionContext ctx)
	{
		return RETURNOFPAYABLESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierTerminationFeeCommercialRecord.returnOfPayables</code> attribute.
	 * @return the returnOfPayables
	 */
	public Collection<ReturnOfPayable> getReturnOfPayables()
	{
		return getReturnOfPayables( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierTerminationFeeCommercialRecord.returnOfPayables</code> attribute. 
	 * @param value the returnOfPayables
	 */
	public void setReturnOfPayables(final SessionContext ctx, final Collection<ReturnOfPayable> value)
	{
		RETURNOFPAYABLESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierTerminationFeeCommercialRecord.returnOfPayables</code> attribute. 
	 * @param value the returnOfPayables
	 */
	public void setReturnOfPayables(final Collection<ReturnOfPayable> value)
	{
		setReturnOfPayables( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to returnOfPayables. 
	 * @param value the item to add to returnOfPayables
	 */
	public void addToReturnOfPayables(final SessionContext ctx, final ReturnOfPayable value)
	{
		RETURNOFPAYABLESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to returnOfPayables. 
	 * @param value the item to add to returnOfPayables
	 */
	public void addToReturnOfPayables(final ReturnOfPayable value)
	{
		addToReturnOfPayables( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from returnOfPayables. 
	 * @param value the item to remove from returnOfPayables
	 */
	public void removeFromReturnOfPayables(final SessionContext ctx, final ReturnOfPayable value)
	{
		RETURNOFPAYABLESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from returnOfPayables. 
	 * @param value the item to remove from returnOfPayables
	 */
	public void removeFromReturnOfPayables(final ReturnOfPayable value)
	{
		removeFromReturnOfPayables( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierTerminationFeeCommercialRecord.returnsOfPayable</code> attribute.
	 * @return the returnsOfPayable
	 */
	public Boolean isReturnsOfPayable(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, RETURNSOFPAYABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierTerminationFeeCommercialRecord.returnsOfPayable</code> attribute.
	 * @return the returnsOfPayable
	 */
	public Boolean isReturnsOfPayable()
	{
		return isReturnsOfPayable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierTerminationFeeCommercialRecord.returnsOfPayable</code> attribute. 
	 * @return the returnsOfPayable
	 */
	public boolean isReturnsOfPayableAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isReturnsOfPayable( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierTerminationFeeCommercialRecord.returnsOfPayable</code> attribute. 
	 * @return the returnsOfPayable
	 */
	public boolean isReturnsOfPayableAsPrimitive()
	{
		return isReturnsOfPayableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierTerminationFeeCommercialRecord.returnsOfPayable</code> attribute. 
	 * @param value the returnsOfPayable
	 */
	public void setReturnsOfPayable(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, RETURNSOFPAYABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierTerminationFeeCommercialRecord.returnsOfPayable</code> attribute. 
	 * @param value the returnsOfPayable
	 */
	public void setReturnsOfPayable(final Boolean value)
	{
		setReturnsOfPayable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierTerminationFeeCommercialRecord.returnsOfPayable</code> attribute. 
	 * @param value the returnsOfPayable
	 */
	public void setReturnsOfPayable(final SessionContext ctx, final boolean value)
	{
		setReturnsOfPayable( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierTerminationFeeCommercialRecord.returnsOfPayable</code> attribute. 
	 * @param value the returnsOfPayable
	 */
	public void setReturnsOfPayable(final boolean value)
	{
		setReturnsOfPayable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierTerminationFeeCommercialRecord.terminationFeeCommercial</code> attribute.
	 * @return the terminationFeeCommercial
	 */
	public SupplierTerminationFeeCommercial getTerminationFeeCommercial(final SessionContext ctx)
	{
		return (SupplierTerminationFeeCommercial)getProperty( ctx, TERMINATIONFEECOMMERCIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierTerminationFeeCommercialRecord.terminationFeeCommercial</code> attribute.
	 * @return the terminationFeeCommercial
	 */
	public SupplierTerminationFeeCommercial getTerminationFeeCommercial()
	{
		return getTerminationFeeCommercial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierTerminationFeeCommercialRecord.terminationFeeCommercial</code> attribute. 
	 * @param value the terminationFeeCommercial
	 */
	public void setTerminationFeeCommercial(final SessionContext ctx, final SupplierTerminationFeeCommercial value)
	{
		TERMINATIONFEECOMMERCIALHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierTerminationFeeCommercialRecord.terminationFeeCommercial</code> attribute. 
	 * @param value the terminationFeeCommercial
	 */
	public void setTerminationFeeCommercial(final SupplierTerminationFeeCommercial value)
	{
		setTerminationFeeCommercial( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierTerminationFeeCommercialRecord.value</code> attribute.
	 * @return the value
	 */
	public Double getValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, VALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierTerminationFeeCommercialRecord.value</code> attribute.
	 * @return the value
	 */
	public Double getValue()
	{
		return getValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierTerminationFeeCommercialRecord.value</code> attribute. 
	 * @return the value
	 */
	public double getValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierTerminationFeeCommercialRecord.value</code> attribute. 
	 * @return the value
	 */
	public double getValueAsPrimitive()
	{
		return getValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierTerminationFeeCommercialRecord.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, VALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierTerminationFeeCommercialRecord.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final Double value)
	{
		setValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierTerminationFeeCommercialRecord.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final SessionContext ctx, final double value)
	{
		setValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierTerminationFeeCommercialRecord.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final double value)
	{
		setValue( getSession().getSessionContext(), value );
	}
	
}
