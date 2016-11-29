/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.masterdata.core.products.jalo.FareComponent;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.CommonPolicyCharges CommonPolicyCharges}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCommonPolicyCharges extends GenericItem
{
	/** Qualifier of the <code>CommonPolicyCharges.policyDefinedBY</code> attribute **/
	public static final String POLICYDEFINEDBY = "policyDefinedBY";
	/** Qualifier of the <code>CommonPolicyCharges.percentage</code> attribute **/
	public static final String PERCENTAGE = "percentage";
	/** Qualifier of the <code>CommonPolicyCharges.amount</code> attribute **/
	public static final String AMOUNT = "amount";
	/** Qualifier of the <code>CommonPolicyCharges.value</code> attribute **/
	public static final String VALUE = "value";
	/** Qualifier of the <code>CommonPolicyCharges.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>CommonPolicyCharges.sellingPriceComponent</code> attribute **/
	public static final String SELLINGPRICECOMPONENT = "sellingPriceComponent";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(POLICYDEFINEDBY, AttributeMode.INITIAL);
		tmp.put(PERCENTAGE, AttributeMode.INITIAL);
		tmp.put(AMOUNT, AttributeMode.INITIAL);
		tmp.put(VALUE, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(SELLINGPRICECOMPONENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonPolicyCharges.amount</code> attribute.
	 * @return the amount - Policy Charges Amount
	 */
	public Boolean isAmount(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, AMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonPolicyCharges.amount</code> attribute.
	 * @return the amount - Policy Charges Amount
	 */
	public Boolean isAmount()
	{
		return isAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonPolicyCharges.amount</code> attribute. 
	 * @return the amount - Policy Charges Amount
	 */
	public boolean isAmountAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAmount( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonPolicyCharges.amount</code> attribute. 
	 * @return the amount - Policy Charges Amount
	 */
	public boolean isAmountAsPrimitive()
	{
		return isAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonPolicyCharges.amount</code> attribute. 
	 * @param value the amount - Policy Charges Amount
	 */
	public void setAmount(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, AMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonPolicyCharges.amount</code> attribute. 
	 * @param value the amount - Policy Charges Amount
	 */
	public void setAmount(final Boolean value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonPolicyCharges.amount</code> attribute. 
	 * @param value the amount - Policy Charges Amount
	 */
	public void setAmount(final SessionContext ctx, final boolean value)
	{
		setAmount( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonPolicyCharges.amount</code> attribute. 
	 * @param value the amount - Policy Charges Amount
	 */
	public void setAmount(final boolean value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonPolicyCharges.currency</code> attribute.
	 * @return the currency - Policy Charges Currency Details
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonPolicyCharges.currency</code> attribute.
	 * @return the currency - Policy Charges Currency Details
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonPolicyCharges.currency</code> attribute. 
	 * @param value the currency - Policy Charges Currency Details
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonPolicyCharges.currency</code> attribute. 
	 * @param value the currency - Policy Charges Currency Details
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonPolicyCharges.percentage</code> attribute.
	 * @return the percentage - Policy Charges percentage
	 */
	public Boolean isPercentage(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonPolicyCharges.percentage</code> attribute.
	 * @return the percentage - Policy Charges percentage
	 */
	public Boolean isPercentage()
	{
		return isPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonPolicyCharges.percentage</code> attribute. 
	 * @return the percentage - Policy Charges percentage
	 */
	public boolean isPercentageAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPercentage( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonPolicyCharges.percentage</code> attribute. 
	 * @return the percentage - Policy Charges percentage
	 */
	public boolean isPercentageAsPrimitive()
	{
		return isPercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonPolicyCharges.percentage</code> attribute. 
	 * @param value the percentage - Policy Charges percentage
	 */
	public void setPercentage(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonPolicyCharges.percentage</code> attribute. 
	 * @param value the percentage - Policy Charges percentage
	 */
	public void setPercentage(final Boolean value)
	{
		setPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonPolicyCharges.percentage</code> attribute. 
	 * @param value the percentage - Policy Charges percentage
	 */
	public void setPercentage(final SessionContext ctx, final boolean value)
	{
		setPercentage( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonPolicyCharges.percentage</code> attribute. 
	 * @param value the percentage - Policy Charges percentage
	 */
	public void setPercentage(final boolean value)
	{
		setPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonPolicyCharges.policyDefinedBY</code> attribute.
	 * @return the policyDefinedBY - Policy Defined BY
	 */
	public EnumerationValue getPolicyDefinedBY(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, POLICYDEFINEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonPolicyCharges.policyDefinedBY</code> attribute.
	 * @return the policyDefinedBY - Policy Defined BY
	 */
	public EnumerationValue getPolicyDefinedBY()
	{
		return getPolicyDefinedBY( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonPolicyCharges.policyDefinedBY</code> attribute. 
	 * @param value the policyDefinedBY - Policy Defined BY
	 */
	public void setPolicyDefinedBY(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, POLICYDEFINEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonPolicyCharges.policyDefinedBY</code> attribute. 
	 * @param value the policyDefinedBY - Policy Defined BY
	 */
	public void setPolicyDefinedBY(final EnumerationValue value)
	{
		setPolicyDefinedBY( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonPolicyCharges.sellingPriceComponent</code> attribute.
	 * @return the sellingPriceComponent - Policy Charges Selling Price Component
	 */
	public FareComponent getSellingPriceComponent(final SessionContext ctx)
	{
		return (FareComponent)getProperty( ctx, SELLINGPRICECOMPONENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonPolicyCharges.sellingPriceComponent</code> attribute.
	 * @return the sellingPriceComponent - Policy Charges Selling Price Component
	 */
	public FareComponent getSellingPriceComponent()
	{
		return getSellingPriceComponent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonPolicyCharges.sellingPriceComponent</code> attribute. 
	 * @param value the sellingPriceComponent - Policy Charges Selling Price Component
	 */
	public void setSellingPriceComponent(final SessionContext ctx, final FareComponent value)
	{
		setProperty(ctx, SELLINGPRICECOMPONENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonPolicyCharges.sellingPriceComponent</code> attribute. 
	 * @param value the sellingPriceComponent - Policy Charges Selling Price Component
	 */
	public void setSellingPriceComponent(final FareComponent value)
	{
		setSellingPriceComponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonPolicyCharges.value</code> attribute.
	 * @return the value - Policy Charges Value
	 */
	public String getValue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonPolicyCharges.value</code> attribute.
	 * @return the value - Policy Charges Value
	 */
	public String getValue()
	{
		return getValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonPolicyCharges.value</code> attribute. 
	 * @param value the value - Policy Charges Value
	 */
	public void setValue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonPolicyCharges.value</code> attribute. 
	 * @param value the value - Policy Charges Value
	 */
	public void setValue(final String value)
	{
		setValue( getSession().getSessionContext(), value );
	}
	
}
