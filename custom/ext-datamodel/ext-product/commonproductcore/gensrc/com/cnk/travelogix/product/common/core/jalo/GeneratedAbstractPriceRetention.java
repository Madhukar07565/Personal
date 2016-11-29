/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.AbstractPriceRetention AbstractPriceRetention}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractPriceRetention extends GenericItem
{
	/** Qualifier of the <code>AbstractPriceRetention.retentionFactor</code> attribute **/
	public static final String RETENTIONFACTOR = "retentionFactor";
	/** Qualifier of the <code>AbstractPriceRetention.value</code> attribute **/
	public static final String VALUE = "value";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(RETENTIONFACTOR, AttributeMode.INITIAL);
		tmp.put(VALUE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPriceRetention.retentionFactor</code> attribute.
	 * @return the retentionFactor - Whether retention factor is AMOUNT or PERCENTAGE
	 */
	public EnumerationValue getRetentionFactor(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RETENTIONFACTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPriceRetention.retentionFactor</code> attribute.
	 * @return the retentionFactor - Whether retention factor is AMOUNT or PERCENTAGE
	 */
	public EnumerationValue getRetentionFactor()
	{
		return getRetentionFactor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractPriceRetention.retentionFactor</code> attribute. 
	 * @param value the retentionFactor - Whether retention factor is AMOUNT or PERCENTAGE
	 */
	public void setRetentionFactor(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RETENTIONFACTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractPriceRetention.retentionFactor</code> attribute. 
	 * @param value the retentionFactor - Whether retention factor is AMOUNT or PERCENTAGE
	 */
	public void setRetentionFactor(final EnumerationValue value)
	{
		setRetentionFactor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPriceRetention.value</code> attribute.
	 * @return the value - Amount value or percentage value
	 */
	public BigDecimal getValue(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, VALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPriceRetention.value</code> attribute.
	 * @return the value - Amount value or percentage value
	 */
	public BigDecimal getValue()
	{
		return getValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractPriceRetention.value</code> attribute. 
	 * @param value the value - Amount value or percentage value
	 */
	public void setValue(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, VALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractPriceRetention.value</code> attribute. 
	 * @param value the value - Amount value or percentage value
	 */
	public void setValue(final BigDecimal value)
	{
		setValue( getSession().getSessionContext(), value );
	}
	
}
