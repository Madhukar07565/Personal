/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.company.commercials.core.jalo;

import com.cnk.travelogix.client.commercials.constants.ClientcommercialsConstants;
import com.cnk.travelogix.company.commercials.core.jalo.AbstractCompanyCommercial;
import com.cnk.travelogix.company.commercials.core.jalo.Fees;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.company.commercials.core.jalo.OtherFeeCompanyCommercial OtherFeeCompanyCommercial}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOtherFeeCompanyCommercial extends AbstractCompanyCommercial
{
	/** Qualifier of the <code>OtherFeeCompanyCommercial.refundable</code> attribute **/
	public static final String REFUNDABLE = "refundable";
	/** Qualifier of the <code>OtherFeeCompanyCommercial.oneTime</code> attribute **/
	public static final String ONETIME = "oneTime";
	/** Qualifier of the <code>OtherFeeCompanyCommercial.fixed</code> attribute **/
	public static final String FIXED = "fixed";
	/** Qualifier of the <code>OtherFeeCompanyCommercial.perDay</code> attribute **/
	public static final String PERDAY = "perDay";
	/** Qualifier of the <code>OtherFeeCompanyCommercial.fees</code> attribute **/
	public static final String FEES = "fees";
	/**
	* {@link OneToManyHandler} for handling 1:n FEES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Fees> FEESHANDLER = new OneToManyHandler<Fees>(
	ClientcommercialsConstants.TC.FEES,
	false,
	"otherFee",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCompanyCommercial.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(REFUNDABLE, AttributeMode.INITIAL);
		tmp.put(ONETIME, AttributeMode.INITIAL);
		tmp.put(FIXED, AttributeMode.INITIAL);
		tmp.put(PERDAY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherFeeCompanyCommercial.fees</code> attribute.
	 * @return the fees
	 */
	public Collection<Fees> getFees(final SessionContext ctx)
	{
		return FEESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherFeeCompanyCommercial.fees</code> attribute.
	 * @return the fees
	 */
	public Collection<Fees> getFees()
	{
		return getFees( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherFeeCompanyCommercial.fees</code> attribute. 
	 * @param value the fees
	 */
	public void setFees(final SessionContext ctx, final Collection<Fees> value)
	{
		FEESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherFeeCompanyCommercial.fees</code> attribute. 
	 * @param value the fees
	 */
	public void setFees(final Collection<Fees> value)
	{
		setFees( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to fees. 
	 * @param value the item to add to fees
	 */
	public void addToFees(final SessionContext ctx, final Fees value)
	{
		FEESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to fees. 
	 * @param value the item to add to fees
	 */
	public void addToFees(final Fees value)
	{
		addToFees( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from fees. 
	 * @param value the item to remove from fees
	 */
	public void removeFromFees(final SessionContext ctx, final Fees value)
	{
		FEESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from fees. 
	 * @param value the item to remove from fees
	 */
	public void removeFromFees(final Fees value)
	{
		removeFromFees( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherFeeCompanyCommercial.fixed</code> attribute.
	 * @return the fixed
	 */
	public Boolean isFixed(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, FIXED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherFeeCompanyCommercial.fixed</code> attribute.
	 * @return the fixed
	 */
	public Boolean isFixed()
	{
		return isFixed( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherFeeCompanyCommercial.fixed</code> attribute. 
	 * @return the fixed
	 */
	public boolean isFixedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isFixed( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherFeeCompanyCommercial.fixed</code> attribute. 
	 * @return the fixed
	 */
	public boolean isFixedAsPrimitive()
	{
		return isFixedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherFeeCompanyCommercial.fixed</code> attribute. 
	 * @param value the fixed
	 */
	public void setFixed(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, FIXED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherFeeCompanyCommercial.fixed</code> attribute. 
	 * @param value the fixed
	 */
	public void setFixed(final Boolean value)
	{
		setFixed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherFeeCompanyCommercial.fixed</code> attribute. 
	 * @param value the fixed
	 */
	public void setFixed(final SessionContext ctx, final boolean value)
	{
		setFixed( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherFeeCompanyCommercial.fixed</code> attribute. 
	 * @param value the fixed
	 */
	public void setFixed(final boolean value)
	{
		setFixed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherFeeCompanyCommercial.oneTime</code> attribute.
	 * @return the oneTime
	 */
	public Boolean isOneTime(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ONETIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherFeeCompanyCommercial.oneTime</code> attribute.
	 * @return the oneTime
	 */
	public Boolean isOneTime()
	{
		return isOneTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherFeeCompanyCommercial.oneTime</code> attribute. 
	 * @return the oneTime
	 */
	public boolean isOneTimeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isOneTime( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherFeeCompanyCommercial.oneTime</code> attribute. 
	 * @return the oneTime
	 */
	public boolean isOneTimeAsPrimitive()
	{
		return isOneTimeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherFeeCompanyCommercial.oneTime</code> attribute. 
	 * @param value the oneTime
	 */
	public void setOneTime(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ONETIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherFeeCompanyCommercial.oneTime</code> attribute. 
	 * @param value the oneTime
	 */
	public void setOneTime(final Boolean value)
	{
		setOneTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherFeeCompanyCommercial.oneTime</code> attribute. 
	 * @param value the oneTime
	 */
	public void setOneTime(final SessionContext ctx, final boolean value)
	{
		setOneTime( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherFeeCompanyCommercial.oneTime</code> attribute. 
	 * @param value the oneTime
	 */
	public void setOneTime(final boolean value)
	{
		setOneTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherFeeCompanyCommercial.perDay</code> attribute.
	 * @return the perDay
	 */
	public Boolean isPerDay(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERDAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherFeeCompanyCommercial.perDay</code> attribute.
	 * @return the perDay
	 */
	public Boolean isPerDay()
	{
		return isPerDay( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherFeeCompanyCommercial.perDay</code> attribute. 
	 * @return the perDay
	 */
	public boolean isPerDayAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPerDay( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherFeeCompanyCommercial.perDay</code> attribute. 
	 * @return the perDay
	 */
	public boolean isPerDayAsPrimitive()
	{
		return isPerDayAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherFeeCompanyCommercial.perDay</code> attribute. 
	 * @param value the perDay
	 */
	public void setPerDay(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERDAY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherFeeCompanyCommercial.perDay</code> attribute. 
	 * @param value the perDay
	 */
	public void setPerDay(final Boolean value)
	{
		setPerDay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherFeeCompanyCommercial.perDay</code> attribute. 
	 * @param value the perDay
	 */
	public void setPerDay(final SessionContext ctx, final boolean value)
	{
		setPerDay( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherFeeCompanyCommercial.perDay</code> attribute. 
	 * @param value the perDay
	 */
	public void setPerDay(final boolean value)
	{
		setPerDay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherFeeCompanyCommercial.refundable</code> attribute.
	 * @return the refundable
	 */
	public Boolean isRefundable(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, REFUNDABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherFeeCompanyCommercial.refundable</code> attribute.
	 * @return the refundable
	 */
	public Boolean isRefundable()
	{
		return isRefundable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherFeeCompanyCommercial.refundable</code> attribute. 
	 * @return the refundable
	 */
	public boolean isRefundableAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isRefundable( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherFeeCompanyCommercial.refundable</code> attribute. 
	 * @return the refundable
	 */
	public boolean isRefundableAsPrimitive()
	{
		return isRefundableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherFeeCompanyCommercial.refundable</code> attribute. 
	 * @param value the refundable
	 */
	public void setRefundable(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, REFUNDABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherFeeCompanyCommercial.refundable</code> attribute. 
	 * @param value the refundable
	 */
	public void setRefundable(final Boolean value)
	{
		setRefundable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherFeeCompanyCommercial.refundable</code> attribute. 
	 * @param value the refundable
	 */
	public void setRefundable(final SessionContext ctx, final boolean value)
	{
		setRefundable( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherFeeCompanyCommercial.refundable</code> attribute. 
	 * @param value the refundable
	 */
	public void setRefundable(final boolean value)
	{
		setRefundable( getSession().getSessionContext(), value );
	}
	
}
