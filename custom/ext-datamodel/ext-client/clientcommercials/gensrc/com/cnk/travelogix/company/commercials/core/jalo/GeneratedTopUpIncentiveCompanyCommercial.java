/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.company.commercials.core.jalo;

import com.cnk.travelogix.client.commercials.constants.ClientcommercialsConstants;
import com.cnk.travelogix.company.commercials.core.jalo.AbstractCompanyCommercial;
import com.cnk.travelogix.masterdata.core.financials.jalo.Bank;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.storelocator.jalo.OpeningSchedule;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.company.commercials.core.jalo.TopUpIncentiveCompanyCommercial TopUpIncentiveCompanyCommercial}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTopUpIncentiveCompanyCommercial extends AbstractCompanyCommercial
{
	/** Qualifier of the <code>TopUpIncentiveCompanyCommercial.modeOfPayment</code> attribute **/
	public static final String MODEOFPAYMENT = "modeOfPayment";
	/** Qualifier of the <code>TopUpIncentiveCompanyCommercial.bankName</code> attribute **/
	public static final String BANKNAME = "bankName";
	/** Qualifier of the <code>TopUpIncentiveCompanyCommercial.singleTopUp</code> attribute **/
	public static final String SINGLETOPUP = "singleTopUp";
	/** Qualifier of the <code>TopUpIncentiveCompanyCommercial.topUpPeriod</code> attribute **/
	public static final String TOPUPPERIOD = "topUpPeriod";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCompanyCommercial.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MODEOFPAYMENT, AttributeMode.INITIAL);
		tmp.put(BANKNAME, AttributeMode.INITIAL);
		tmp.put(SINGLETOPUP, AttributeMode.INITIAL);
		tmp.put(TOPUPPERIOD, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TopUpIncentiveCompanyCommercial.bankName</code> attribute.
	 * @return the bankName
	 */
	public Bank getBankName(final SessionContext ctx)
	{
		return (Bank)getProperty( ctx, BANKNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TopUpIncentiveCompanyCommercial.bankName</code> attribute.
	 * @return the bankName
	 */
	public Bank getBankName()
	{
		return getBankName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TopUpIncentiveCompanyCommercial.bankName</code> attribute. 
	 * @param value the bankName
	 */
	public void setBankName(final SessionContext ctx, final Bank value)
	{
		setProperty(ctx, BANKNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TopUpIncentiveCompanyCommercial.bankName</code> attribute. 
	 * @param value the bankName
	 */
	public void setBankName(final Bank value)
	{
		setBankName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TopUpIncentiveCompanyCommercial.modeOfPayment</code> attribute.
	 * @return the modeOfPayment
	 */
	public EnumerationValue getModeOfPayment(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MODEOFPAYMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TopUpIncentiveCompanyCommercial.modeOfPayment</code> attribute.
	 * @return the modeOfPayment
	 */
	public EnumerationValue getModeOfPayment()
	{
		return getModeOfPayment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TopUpIncentiveCompanyCommercial.modeOfPayment</code> attribute. 
	 * @param value the modeOfPayment
	 */
	public void setModeOfPayment(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MODEOFPAYMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TopUpIncentiveCompanyCommercial.modeOfPayment</code> attribute. 
	 * @param value the modeOfPayment
	 */
	public void setModeOfPayment(final EnumerationValue value)
	{
		setModeOfPayment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TopUpIncentiveCompanyCommercial.singleTopUp</code> attribute.
	 * @return the singleTopUp
	 */
	public Boolean isSingleTopUp(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SINGLETOPUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TopUpIncentiveCompanyCommercial.singleTopUp</code> attribute.
	 * @return the singleTopUp
	 */
	public Boolean isSingleTopUp()
	{
		return isSingleTopUp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TopUpIncentiveCompanyCommercial.singleTopUp</code> attribute. 
	 * @return the singleTopUp
	 */
	public boolean isSingleTopUpAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSingleTopUp( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TopUpIncentiveCompanyCommercial.singleTopUp</code> attribute. 
	 * @return the singleTopUp
	 */
	public boolean isSingleTopUpAsPrimitive()
	{
		return isSingleTopUpAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TopUpIncentiveCompanyCommercial.singleTopUp</code> attribute. 
	 * @param value the singleTopUp
	 */
	public void setSingleTopUp(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SINGLETOPUP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TopUpIncentiveCompanyCommercial.singleTopUp</code> attribute. 
	 * @param value the singleTopUp
	 */
	public void setSingleTopUp(final Boolean value)
	{
		setSingleTopUp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TopUpIncentiveCompanyCommercial.singleTopUp</code> attribute. 
	 * @param value the singleTopUp
	 */
	public void setSingleTopUp(final SessionContext ctx, final boolean value)
	{
		setSingleTopUp( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TopUpIncentiveCompanyCommercial.singleTopUp</code> attribute. 
	 * @param value the singleTopUp
	 */
	public void setSingleTopUp(final boolean value)
	{
		setSingleTopUp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TopUpIncentiveCompanyCommercial.topUpPeriod</code> attribute.
	 * @return the topUpPeriod
	 */
	public OpeningSchedule getTopUpPeriod(final SessionContext ctx)
	{
		return (OpeningSchedule)getProperty( ctx, TOPUPPERIOD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TopUpIncentiveCompanyCommercial.topUpPeriod</code> attribute.
	 * @return the topUpPeriod
	 */
	public OpeningSchedule getTopUpPeriod()
	{
		return getTopUpPeriod( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TopUpIncentiveCompanyCommercial.topUpPeriod</code> attribute. 
	 * @param value the topUpPeriod
	 */
	public void setTopUpPeriod(final SessionContext ctx, final OpeningSchedule value)
	{
		setProperty(ctx, TOPUPPERIOD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TopUpIncentiveCompanyCommercial.topUpPeriod</code> attribute. 
	 * @param value the topUpPeriod
	 */
	public void setTopUpPeriod(final OpeningSchedule value)
	{
		setTopUpPeriod( getSession().getSessionContext(), value );
	}
	
}
