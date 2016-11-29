/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem PaymentFee}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPaymentFee extends GenericItem
{
	/** Qualifier of the <code>PaymentFee.pgEnablerCost</code> attribute **/
	public static final String PGENABLERCOST = "pgEnablerCost";
	/** Qualifier of the <code>PaymentFee.pgEnablerFeeType</code> attribute **/
	public static final String PGENABLERFEETYPE = "pgEnablerFeeType";
	/** Qualifier of the <code>PaymentFee.pgAcquirerCost</code> attribute **/
	public static final String PGACQUIRERCOST = "pgAcquirerCost";
	/** Qualifier of the <code>PaymentFee.pgAcquirerFeeType</code> attribute **/
	public static final String PGACQUIRERFEETYPE = "pgAcquirerFeeType";
	/** Qualifier of the <code>PaymentFee.pgClientCost</code> attribute **/
	public static final String PGCLIENTCOST = "pgClientCost";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PGENABLERCOST, AttributeMode.INITIAL);
		tmp.put(PGENABLERFEETYPE, AttributeMode.INITIAL);
		tmp.put(PGACQUIRERCOST, AttributeMode.INITIAL);
		tmp.put(PGACQUIRERFEETYPE, AttributeMode.INITIAL);
		tmp.put(PGCLIENTCOST, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentFee.pgAcquirerCost</code> attribute.
	 * @return the pgAcquirerCost
	 */
	public Double getPgAcquirerCost(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, PGACQUIRERCOST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentFee.pgAcquirerCost</code> attribute.
	 * @return the pgAcquirerCost
	 */
	public Double getPgAcquirerCost()
	{
		return getPgAcquirerCost( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentFee.pgAcquirerCost</code> attribute. 
	 * @return the pgAcquirerCost
	 */
	public double getPgAcquirerCostAsPrimitive(final SessionContext ctx)
	{
		Double value = getPgAcquirerCost( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentFee.pgAcquirerCost</code> attribute. 
	 * @return the pgAcquirerCost
	 */
	public double getPgAcquirerCostAsPrimitive()
	{
		return getPgAcquirerCostAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentFee.pgAcquirerCost</code> attribute. 
	 * @param value the pgAcquirerCost
	 */
	public void setPgAcquirerCost(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, PGACQUIRERCOST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentFee.pgAcquirerCost</code> attribute. 
	 * @param value the pgAcquirerCost
	 */
	public void setPgAcquirerCost(final Double value)
	{
		setPgAcquirerCost( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentFee.pgAcquirerCost</code> attribute. 
	 * @param value the pgAcquirerCost
	 */
	public void setPgAcquirerCost(final SessionContext ctx, final double value)
	{
		setPgAcquirerCost( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentFee.pgAcquirerCost</code> attribute. 
	 * @param value the pgAcquirerCost
	 */
	public void setPgAcquirerCost(final double value)
	{
		setPgAcquirerCost( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentFee.pgAcquirerFeeType</code> attribute.
	 * @return the pgAcquirerFeeType
	 */
	public String getPgAcquirerFeeType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PGACQUIRERFEETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentFee.pgAcquirerFeeType</code> attribute.
	 * @return the pgAcquirerFeeType
	 */
	public String getPgAcquirerFeeType()
	{
		return getPgAcquirerFeeType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentFee.pgAcquirerFeeType</code> attribute. 
	 * @param value the pgAcquirerFeeType
	 */
	public void setPgAcquirerFeeType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PGACQUIRERFEETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentFee.pgAcquirerFeeType</code> attribute. 
	 * @param value the pgAcquirerFeeType
	 */
	public void setPgAcquirerFeeType(final String value)
	{
		setPgAcquirerFeeType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentFee.pgClientCost</code> attribute.
	 * @return the pgClientCost
	 */
	public Double getPgClientCost(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, PGCLIENTCOST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentFee.pgClientCost</code> attribute.
	 * @return the pgClientCost
	 */
	public Double getPgClientCost()
	{
		return getPgClientCost( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentFee.pgClientCost</code> attribute. 
	 * @return the pgClientCost
	 */
	public double getPgClientCostAsPrimitive(final SessionContext ctx)
	{
		Double value = getPgClientCost( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentFee.pgClientCost</code> attribute. 
	 * @return the pgClientCost
	 */
	public double getPgClientCostAsPrimitive()
	{
		return getPgClientCostAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentFee.pgClientCost</code> attribute. 
	 * @param value the pgClientCost
	 */
	public void setPgClientCost(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, PGCLIENTCOST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentFee.pgClientCost</code> attribute. 
	 * @param value the pgClientCost
	 */
	public void setPgClientCost(final Double value)
	{
		setPgClientCost( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentFee.pgClientCost</code> attribute. 
	 * @param value the pgClientCost
	 */
	public void setPgClientCost(final SessionContext ctx, final double value)
	{
		setPgClientCost( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentFee.pgClientCost</code> attribute. 
	 * @param value the pgClientCost
	 */
	public void setPgClientCost(final double value)
	{
		setPgClientCost( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentFee.pgEnablerCost</code> attribute.
	 * @return the pgEnablerCost
	 */
	public Double getPgEnablerCost(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, PGENABLERCOST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentFee.pgEnablerCost</code> attribute.
	 * @return the pgEnablerCost
	 */
	public Double getPgEnablerCost()
	{
		return getPgEnablerCost( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentFee.pgEnablerCost</code> attribute. 
	 * @return the pgEnablerCost
	 */
	public double getPgEnablerCostAsPrimitive(final SessionContext ctx)
	{
		Double value = getPgEnablerCost( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentFee.pgEnablerCost</code> attribute. 
	 * @return the pgEnablerCost
	 */
	public double getPgEnablerCostAsPrimitive()
	{
		return getPgEnablerCostAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentFee.pgEnablerCost</code> attribute. 
	 * @param value the pgEnablerCost
	 */
	public void setPgEnablerCost(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, PGENABLERCOST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentFee.pgEnablerCost</code> attribute. 
	 * @param value the pgEnablerCost
	 */
	public void setPgEnablerCost(final Double value)
	{
		setPgEnablerCost( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentFee.pgEnablerCost</code> attribute. 
	 * @param value the pgEnablerCost
	 */
	public void setPgEnablerCost(final SessionContext ctx, final double value)
	{
		setPgEnablerCost( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentFee.pgEnablerCost</code> attribute. 
	 * @param value the pgEnablerCost
	 */
	public void setPgEnablerCost(final double value)
	{
		setPgEnablerCost( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentFee.pgEnablerFeeType</code> attribute.
	 * @return the pgEnablerFeeType
	 */
	public String getPgEnablerFeeType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PGENABLERFEETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentFee.pgEnablerFeeType</code> attribute.
	 * @return the pgEnablerFeeType
	 */
	public String getPgEnablerFeeType()
	{
		return getPgEnablerFeeType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentFee.pgEnablerFeeType</code> attribute. 
	 * @param value the pgEnablerFeeType
	 */
	public void setPgEnablerFeeType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PGENABLERFEETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentFee.pgEnablerFeeType</code> attribute. 
	 * @param value the pgEnablerFeeType
	 */
	public void setPgEnablerFeeType(final String value)
	{
		setPgEnablerFeeType( getSession().getSessionContext(), value );
	}
	
}
