/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.jalo;

import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.AbstractCommercialValue;
import com.cnk.travelogix.supplier.commercials.core.jalo.FixValues;
import com.cnk.travelogix.supplier.commercials.core.jalo.SlabCommercialValue;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.jalo.FixedCommercialValue FixedCommercialValue}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFixedCommercialValue extends AbstractCommercialValue
{
	/** Qualifier of the <code>FixedCommercialValue.percentage</code> attribute **/
	public static final String PERCENTAGE = "percentage";
	/** Qualifier of the <code>FixedCommercialValue.amount</code> attribute **/
	public static final String AMOUNT = "amount";
	/** Qualifier of the <code>FixedCommercialValue.slabCommercialValue</code> attribute **/
	public static final String SLABCOMMERCIALVALUE = "slabCommercialValue";
	/** Qualifier of the <code>FixedCommercialValue.fixValues</code> attribute **/
	public static final String FIXVALUES = "fixValues";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SLABCOMMERCIALVALUE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedFixedCommercialValue> SLABCOMMERCIALVALUEHANDLER = new BidirectionalOneToManyHandler<GeneratedFixedCommercialValue>(
	SuppliercommercialscoreConstants.TC.FIXEDCOMMERCIALVALUE,
	false,
	"slabCommercialValue",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n FIXVALUES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<FixValues> FIXVALUESHANDLER = new OneToManyHandler<FixValues>(
	SuppliercommercialscoreConstants.TC.FIXVALUES,
	false,
	"fixedcommvalue",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCommercialValue.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PERCENTAGE, AttributeMode.INITIAL);
		tmp.put(AMOUNT, AttributeMode.INITIAL);
		tmp.put(SLABCOMMERCIALVALUE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FixedCommercialValue.amount</code> attribute.
	 * @return the amount
	 */
	public Boolean isAmount(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, AMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FixedCommercialValue.amount</code> attribute.
	 * @return the amount
	 */
	public Boolean isAmount()
	{
		return isAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FixedCommercialValue.amount</code> attribute. 
	 * @return the amount
	 */
	public boolean isAmountAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAmount( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FixedCommercialValue.amount</code> attribute. 
	 * @return the amount
	 */
	public boolean isAmountAsPrimitive()
	{
		return isAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FixedCommercialValue.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, AMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FixedCommercialValue.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final Boolean value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FixedCommercialValue.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final boolean value)
	{
		setAmount( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FixedCommercialValue.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final boolean value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		SLABCOMMERCIALVALUEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FixedCommercialValue.fixValues</code> attribute.
	 * @return the fixValues
	 */
	public Collection<FixValues> getFixValues(final SessionContext ctx)
	{
		return FIXVALUESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FixedCommercialValue.fixValues</code> attribute.
	 * @return the fixValues
	 */
	public Collection<FixValues> getFixValues()
	{
		return getFixValues( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FixedCommercialValue.fixValues</code> attribute. 
	 * @param value the fixValues
	 */
	public void setFixValues(final SessionContext ctx, final Collection<FixValues> value)
	{
		FIXVALUESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FixedCommercialValue.fixValues</code> attribute. 
	 * @param value the fixValues
	 */
	public void setFixValues(final Collection<FixValues> value)
	{
		setFixValues( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to fixValues. 
	 * @param value the item to add to fixValues
	 */
	public void addToFixValues(final SessionContext ctx, final FixValues value)
	{
		FIXVALUESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to fixValues. 
	 * @param value the item to add to fixValues
	 */
	public void addToFixValues(final FixValues value)
	{
		addToFixValues( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from fixValues. 
	 * @param value the item to remove from fixValues
	 */
	public void removeFromFixValues(final SessionContext ctx, final FixValues value)
	{
		FIXVALUESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from fixValues. 
	 * @param value the item to remove from fixValues
	 */
	public void removeFromFixValues(final FixValues value)
	{
		removeFromFixValues( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FixedCommercialValue.percentage</code> attribute.
	 * @return the percentage
	 */
	public Boolean isPercentage(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FixedCommercialValue.percentage</code> attribute.
	 * @return the percentage
	 */
	public Boolean isPercentage()
	{
		return isPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FixedCommercialValue.percentage</code> attribute. 
	 * @return the percentage
	 */
	public boolean isPercentageAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPercentage( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FixedCommercialValue.percentage</code> attribute. 
	 * @return the percentage
	 */
	public boolean isPercentageAsPrimitive()
	{
		return isPercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FixedCommercialValue.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FixedCommercialValue.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final Boolean value)
	{
		setPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FixedCommercialValue.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final SessionContext ctx, final boolean value)
	{
		setPercentage( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FixedCommercialValue.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final boolean value)
	{
		setPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FixedCommercialValue.slabCommercialValue</code> attribute.
	 * @return the slabCommercialValue
	 */
	public SlabCommercialValue getSlabCommercialValue(final SessionContext ctx)
	{
		return (SlabCommercialValue)getProperty( ctx, SLABCOMMERCIALVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FixedCommercialValue.slabCommercialValue</code> attribute.
	 * @return the slabCommercialValue
	 */
	public SlabCommercialValue getSlabCommercialValue()
	{
		return getSlabCommercialValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FixedCommercialValue.slabCommercialValue</code> attribute. 
	 * @param value the slabCommercialValue
	 */
	public void setSlabCommercialValue(final SessionContext ctx, final SlabCommercialValue value)
	{
		SLABCOMMERCIALVALUEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FixedCommercialValue.slabCommercialValue</code> attribute. 
	 * @param value the slabCommercialValue
	 */
	public void setSlabCommercialValue(final SlabCommercialValue value)
	{
		setSlabCommercialValue( getSession().getSessionContext(), value );
	}
	
}
