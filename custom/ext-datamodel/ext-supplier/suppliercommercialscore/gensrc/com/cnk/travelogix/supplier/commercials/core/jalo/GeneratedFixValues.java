/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.jalo;

import com.cnk.travelogix.masterdata.core.products.jalo.FareComponent;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.FixedCommercialValue;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.jalo.FixValues FixValues}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFixValues extends GenericItem
{
	/** Qualifier of the <code>FixValues.percentage</code> attribute **/
	public static final String PERCENTAGE = "percentage";
	/** Qualifier of the <code>FixValues.amountValue</code> attribute **/
	public static final String AMOUNTVALUE = "amountValue";
	/** Qualifier of the <code>FixValues.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>FixValues.fareComponent</code> attribute **/
	public static final String FARECOMPONENT = "fareComponent";
	/** Qualifier of the <code>FixValues.fixedcommvalue</code> attribute **/
	public static final String FIXEDCOMMVALUE = "fixedcommvalue";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n FIXEDCOMMVALUE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedFixValues> FIXEDCOMMVALUEHANDLER = new BidirectionalOneToManyHandler<GeneratedFixValues>(
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PERCENTAGE, AttributeMode.INITIAL);
		tmp.put(AMOUNTVALUE, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(FARECOMPONENT, AttributeMode.INITIAL);
		tmp.put(FIXEDCOMMVALUE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FixValues.amountValue</code> attribute.
	 * @return the amountValue
	 */
	public Double getAmountValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, AMOUNTVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FixValues.amountValue</code> attribute.
	 * @return the amountValue
	 */
	public Double getAmountValue()
	{
		return getAmountValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FixValues.amountValue</code> attribute. 
	 * @return the amountValue
	 */
	public double getAmountValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getAmountValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FixValues.amountValue</code> attribute. 
	 * @return the amountValue
	 */
	public double getAmountValueAsPrimitive()
	{
		return getAmountValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FixValues.amountValue</code> attribute. 
	 * @param value the amountValue
	 */
	public void setAmountValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, AMOUNTVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FixValues.amountValue</code> attribute. 
	 * @param value the amountValue
	 */
	public void setAmountValue(final Double value)
	{
		setAmountValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FixValues.amountValue</code> attribute. 
	 * @param value the amountValue
	 */
	public void setAmountValue(final SessionContext ctx, final double value)
	{
		setAmountValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FixValues.amountValue</code> attribute. 
	 * @param value the amountValue
	 */
	public void setAmountValue(final double value)
	{
		setAmountValue( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		FIXEDCOMMVALUEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FixValues.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FixValues.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FixValues.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FixValues.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FixValues.fareComponent</code> attribute.
	 * @return the fareComponent
	 */
	public FareComponent getFareComponent(final SessionContext ctx)
	{
		return (FareComponent)getProperty( ctx, FARECOMPONENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FixValues.fareComponent</code> attribute.
	 * @return the fareComponent
	 */
	public FareComponent getFareComponent()
	{
		return getFareComponent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FixValues.fareComponent</code> attribute. 
	 * @param value the fareComponent
	 */
	public void setFareComponent(final SessionContext ctx, final FareComponent value)
	{
		setProperty(ctx, FARECOMPONENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FixValues.fareComponent</code> attribute. 
	 * @param value the fareComponent
	 */
	public void setFareComponent(final FareComponent value)
	{
		setFareComponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FixValues.fixedcommvalue</code> attribute.
	 * @return the fixedcommvalue
	 */
	public FixedCommercialValue getFixedcommvalue(final SessionContext ctx)
	{
		return (FixedCommercialValue)getProperty( ctx, FIXEDCOMMVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FixValues.fixedcommvalue</code> attribute.
	 * @return the fixedcommvalue
	 */
	public FixedCommercialValue getFixedcommvalue()
	{
		return getFixedcommvalue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FixValues.fixedcommvalue</code> attribute. 
	 * @param value the fixedcommvalue
	 */
	public void setFixedcommvalue(final SessionContext ctx, final FixedCommercialValue value)
	{
		FIXEDCOMMVALUEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FixValues.fixedcommvalue</code> attribute. 
	 * @param value the fixedcommvalue
	 */
	public void setFixedcommvalue(final FixedCommercialValue value)
	{
		setFixedcommvalue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FixValues.percentage</code> attribute.
	 * @return the percentage
	 */
	public Double getPercentage(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, PERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FixValues.percentage</code> attribute.
	 * @return the percentage
	 */
	public Double getPercentage()
	{
		return getPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FixValues.percentage</code> attribute. 
	 * @return the percentage
	 */
	public double getPercentageAsPrimitive(final SessionContext ctx)
	{
		Double value = getPercentage( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FixValues.percentage</code> attribute. 
	 * @return the percentage
	 */
	public double getPercentageAsPrimitive()
	{
		return getPercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FixValues.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, PERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FixValues.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final Double value)
	{
		setPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FixValues.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final SessionContext ctx, final double value)
	{
		setPercentage( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FixValues.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final double value)
	{
		setPercentage( getSession().getSessionContext(), value );
	}
	
}
