/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.credit.jalo;

import com.cnk.travelogix.client.credit.constants.ClientcreditConstants;
import com.cnk.travelogix.client.credit.jalo.ClientCreditDepositLimit;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.credit.jalo.BarterLimit BarterLimit}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBarterLimit extends ClientCreditDepositLimit
{
	/** Qualifier of the <code>BarterLimit.validFrom</code> attribute **/
	public static final String VALIDFROM = "validFrom";
	/** Qualifier of the <code>BarterLimit.validTo</code> attribute **/
	public static final String VALIDTO = "validTo";
	/** Qualifier of the <code>BarterLimit.barterAmount</code> attribute **/
	public static final String BARTERAMOUNT = "barterAmount";
	/** Qualifier of the <code>BarterLimit.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>BarterLimit.minProductValue</code> attribute **/
	public static final String MINPRODUCTVALUE = "minProductValue";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(ClientCreditDepositLimit.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(VALIDFROM, AttributeMode.INITIAL);
		tmp.put(VALIDTO, AttributeMode.INITIAL);
		tmp.put(BARTERAMOUNT, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(MINPRODUCTVALUE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BarterLimit.barterAmount</code> attribute.
	 * @return the barterAmount
	 */
	public Double getBarterAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, BARTERAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BarterLimit.barterAmount</code> attribute.
	 * @return the barterAmount
	 */
	public Double getBarterAmount()
	{
		return getBarterAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BarterLimit.barterAmount</code> attribute. 
	 * @return the barterAmount
	 */
	public double getBarterAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getBarterAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BarterLimit.barterAmount</code> attribute. 
	 * @return the barterAmount
	 */
	public double getBarterAmountAsPrimitive()
	{
		return getBarterAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BarterLimit.barterAmount</code> attribute. 
	 * @param value the barterAmount
	 */
	public void setBarterAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, BARTERAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BarterLimit.barterAmount</code> attribute. 
	 * @param value the barterAmount
	 */
	public void setBarterAmount(final Double value)
	{
		setBarterAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BarterLimit.barterAmount</code> attribute. 
	 * @param value the barterAmount
	 */
	public void setBarterAmount(final SessionContext ctx, final double value)
	{
		setBarterAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BarterLimit.barterAmount</code> attribute. 
	 * @param value the barterAmount
	 */
	public void setBarterAmount(final double value)
	{
		setBarterAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BarterLimit.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BarterLimit.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BarterLimit.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BarterLimit.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BarterLimit.minProductValue</code> attribute.
	 * @return the minProductValue
	 */
	public Double getMinProductValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, MINPRODUCTVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BarterLimit.minProductValue</code> attribute.
	 * @return the minProductValue
	 */
	public Double getMinProductValue()
	{
		return getMinProductValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BarterLimit.minProductValue</code> attribute. 
	 * @return the minProductValue
	 */
	public double getMinProductValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getMinProductValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BarterLimit.minProductValue</code> attribute. 
	 * @return the minProductValue
	 */
	public double getMinProductValueAsPrimitive()
	{
		return getMinProductValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BarterLimit.minProductValue</code> attribute. 
	 * @param value the minProductValue
	 */
	public void setMinProductValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, MINPRODUCTVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BarterLimit.minProductValue</code> attribute. 
	 * @param value the minProductValue
	 */
	public void setMinProductValue(final Double value)
	{
		setMinProductValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BarterLimit.minProductValue</code> attribute. 
	 * @param value the minProductValue
	 */
	public void setMinProductValue(final SessionContext ctx, final double value)
	{
		setMinProductValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BarterLimit.minProductValue</code> attribute. 
	 * @param value the minProductValue
	 */
	public void setMinProductValue(final double value)
	{
		setMinProductValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BarterLimit.validFrom</code> attribute.
	 * @return the validFrom
	 */
	public Date getValidFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BarterLimit.validFrom</code> attribute.
	 * @return the validFrom
	 */
	public Date getValidFrom()
	{
		return getValidFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BarterLimit.validFrom</code> attribute. 
	 * @param value the validFrom
	 */
	public void setValidFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BarterLimit.validFrom</code> attribute. 
	 * @param value the validFrom
	 */
	public void setValidFrom(final Date value)
	{
		setValidFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BarterLimit.validTo</code> attribute.
	 * @return the validTo
	 */
	public Date getValidTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BarterLimit.validTo</code> attribute.
	 * @return the validTo
	 */
	public Date getValidTo()
	{
		return getValidTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BarterLimit.validTo</code> attribute. 
	 * @param value the validTo
	 */
	public void setValidTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BarterLimit.validTo</code> attribute. 
	 * @param value the validTo
	 */
	public void setValidTo(final Date value)
	{
		setValidTo( getSession().getSessionContext(), value );
	}
	
}
