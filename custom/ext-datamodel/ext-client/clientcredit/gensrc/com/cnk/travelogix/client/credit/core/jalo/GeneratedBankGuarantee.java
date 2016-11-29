/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.credit.core.jalo;

import com.cnk.travelogix.client.credit.constants.ClientcreditConstants;
import com.cnk.travelogix.client.credit.core.jalo.BankInformation;
import com.cnk.travelogix.client.credit.core.jalo.ClientCreditDetails;
import com.cnk.travelogix.client.credit.core.jalo.CreditLimitInfo;
import com.cnk.travelogix.client.credit.core.jalo.ThresholdInformation;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.credit.core.jalo.BankGuarantee BankGuarantee}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBankGuarantee extends GenericItem
{
	/** Qualifier of the <code>BankGuarantee.bgRefNumber</code> attribute **/
	public static final String BGREFNUMBER = "bgRefNumber";
	/** Qualifier of the <code>BankGuarantee.bgIssueDate</code> attribute **/
	public static final String BGISSUEDATE = "bgIssueDate";
	/** Qualifier of the <code>BankGuarantee.bgExpiryDate</code> attribute **/
	public static final String BGEXPIRYDATE = "bgExpiryDate";
	/** Qualifier of the <code>BankGuarantee.bgClaimPeriod</code> attribute **/
	public static final String BGCLAIMPERIOD = "bgClaimPeriod";
	/** Qualifier of the <code>BankGuarantee.bgAmount</code> attribute **/
	public static final String BGAMOUNT = "bgAmount";
	/** Qualifier of the <code>BankGuarantee.bankInformation</code> attribute **/
	public static final String BANKINFORMATION = "bankInformation";
	/** Qualifier of the <code>BankGuarantee.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>BankGuarantee.thresholdInfo</code> attribute **/
	public static final String THRESHOLDINFO = "thresholdInfo";
	/** Qualifier of the <code>BankGuarantee.creditLimitInfo</code> attribute **/
	public static final String CREDITLIMITINFO = "creditLimitInfo";
	/** Qualifier of the <code>BankGuarantee.clientCreditDetails</code> attribute **/
	public static final String CLIENTCREDITDETAILS = "clientCreditDetails";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CLIENTCREDITDETAILS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBankGuarantee> CLIENTCREDITDETAILSHANDLER = new BidirectionalOneToManyHandler<GeneratedBankGuarantee>(
	ClientcreditConstants.TC.BANKGUARANTEE,
	false,
	"clientCreditDetails",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(BGREFNUMBER, AttributeMode.INITIAL);
		tmp.put(BGISSUEDATE, AttributeMode.INITIAL);
		tmp.put(BGEXPIRYDATE, AttributeMode.INITIAL);
		tmp.put(BGCLAIMPERIOD, AttributeMode.INITIAL);
		tmp.put(BGAMOUNT, AttributeMode.INITIAL);
		tmp.put(BANKINFORMATION, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(THRESHOLDINFO, AttributeMode.INITIAL);
		tmp.put(CREDITLIMITINFO, AttributeMode.INITIAL);
		tmp.put(CLIENTCREDITDETAILS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarantee.bankInformation</code> attribute.
	 * @return the bankInformation - Bank Information
	 */
	public BankInformation getBankInformation(final SessionContext ctx)
	{
		return (BankInformation)getProperty( ctx, BANKINFORMATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarantee.bankInformation</code> attribute.
	 * @return the bankInformation - Bank Information
	 */
	public BankInformation getBankInformation()
	{
		return getBankInformation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarantee.bankInformation</code> attribute. 
	 * @param value the bankInformation - Bank Information
	 */
	public void setBankInformation(final SessionContext ctx, final BankInformation value)
	{
		setProperty(ctx, BANKINFORMATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarantee.bankInformation</code> attribute. 
	 * @param value the bankInformation - Bank Information
	 */
	public void setBankInformation(final BankInformation value)
	{
		setBankInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarantee.bgAmount</code> attribute.
	 * @return the bgAmount - Bg amount
	 */
	public BigDecimal getBgAmount(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, BGAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarantee.bgAmount</code> attribute.
	 * @return the bgAmount - Bg amount
	 */
	public BigDecimal getBgAmount()
	{
		return getBgAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarantee.bgAmount</code> attribute. 
	 * @param value the bgAmount - Bg amount
	 */
	public void setBgAmount(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, BGAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarantee.bgAmount</code> attribute. 
	 * @param value the bgAmount - Bg amount
	 */
	public void setBgAmount(final BigDecimal value)
	{
		setBgAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarantee.bgClaimPeriod</code> attribute.
	 * @return the bgClaimPeriod - BankClaimPeriod
	 */
	public Integer getBgClaimPeriod(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, BGCLAIMPERIOD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarantee.bgClaimPeriod</code> attribute.
	 * @return the bgClaimPeriod - BankClaimPeriod
	 */
	public Integer getBgClaimPeriod()
	{
		return getBgClaimPeriod( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarantee.bgClaimPeriod</code> attribute. 
	 * @return the bgClaimPeriod - BankClaimPeriod
	 */
	public int getBgClaimPeriodAsPrimitive(final SessionContext ctx)
	{
		Integer value = getBgClaimPeriod( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarantee.bgClaimPeriod</code> attribute. 
	 * @return the bgClaimPeriod - BankClaimPeriod
	 */
	public int getBgClaimPeriodAsPrimitive()
	{
		return getBgClaimPeriodAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarantee.bgClaimPeriod</code> attribute. 
	 * @param value the bgClaimPeriod - BankClaimPeriod
	 */
	public void setBgClaimPeriod(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, BGCLAIMPERIOD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarantee.bgClaimPeriod</code> attribute. 
	 * @param value the bgClaimPeriod - BankClaimPeriod
	 */
	public void setBgClaimPeriod(final Integer value)
	{
		setBgClaimPeriod( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarantee.bgClaimPeriod</code> attribute. 
	 * @param value the bgClaimPeriod - BankClaimPeriod
	 */
	public void setBgClaimPeriod(final SessionContext ctx, final int value)
	{
		setBgClaimPeriod( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarantee.bgClaimPeriod</code> attribute. 
	 * @param value the bgClaimPeriod - BankClaimPeriod
	 */
	public void setBgClaimPeriod(final int value)
	{
		setBgClaimPeriod( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarantee.bgExpiryDate</code> attribute.
	 * @return the bgExpiryDate - BankExpiryDate
	 */
	public Date getBgExpiryDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, BGEXPIRYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarantee.bgExpiryDate</code> attribute.
	 * @return the bgExpiryDate - BankExpiryDate
	 */
	public Date getBgExpiryDate()
	{
		return getBgExpiryDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarantee.bgExpiryDate</code> attribute. 
	 * @param value the bgExpiryDate - BankExpiryDate
	 */
	public void setBgExpiryDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, BGEXPIRYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarantee.bgExpiryDate</code> attribute. 
	 * @param value the bgExpiryDate - BankExpiryDate
	 */
	public void setBgExpiryDate(final Date value)
	{
		setBgExpiryDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarantee.bgIssueDate</code> attribute.
	 * @return the bgIssueDate - BankIssueDate
	 */
	public Date getBgIssueDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, BGISSUEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarantee.bgIssueDate</code> attribute.
	 * @return the bgIssueDate - BankIssueDate
	 */
	public Date getBgIssueDate()
	{
		return getBgIssueDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarantee.bgIssueDate</code> attribute. 
	 * @param value the bgIssueDate - BankIssueDate
	 */
	public void setBgIssueDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, BGISSUEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarantee.bgIssueDate</code> attribute. 
	 * @param value the bgIssueDate - BankIssueDate
	 */
	public void setBgIssueDate(final Date value)
	{
		setBgIssueDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarantee.bgRefNumber</code> attribute.
	 * @return the bgRefNumber - BankRefNo
	 */
	public String getBgRefNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BGREFNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarantee.bgRefNumber</code> attribute.
	 * @return the bgRefNumber - BankRefNo
	 */
	public String getBgRefNumber()
	{
		return getBgRefNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarantee.bgRefNumber</code> attribute. 
	 * @param value the bgRefNumber - BankRefNo
	 */
	public void setBgRefNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BGREFNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarantee.bgRefNumber</code> attribute. 
	 * @param value the bgRefNumber - BankRefNo
	 */
	public void setBgRefNumber(final String value)
	{
		setBgRefNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarantee.clientCreditDetails</code> attribute.
	 * @return the clientCreditDetails
	 */
	public ClientCreditDetails getClientCreditDetails(final SessionContext ctx)
	{
		return (ClientCreditDetails)getProperty( ctx, CLIENTCREDITDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarantee.clientCreditDetails</code> attribute.
	 * @return the clientCreditDetails
	 */
	public ClientCreditDetails getClientCreditDetails()
	{
		return getClientCreditDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarantee.clientCreditDetails</code> attribute. 
	 * @param value the clientCreditDetails
	 */
	public void setClientCreditDetails(final SessionContext ctx, final ClientCreditDetails value)
	{
		CLIENTCREDITDETAILSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarantee.clientCreditDetails</code> attribute. 
	 * @param value the clientCreditDetails
	 */
	public void setClientCreditDetails(final ClientCreditDetails value)
	{
		setClientCreditDetails( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CLIENTCREDITDETAILSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarantee.creditLimitInfo</code> attribute.
	 * @return the creditLimitInfo - Credit limit info
	 */
	public CreditLimitInfo getCreditLimitInfo(final SessionContext ctx)
	{
		return (CreditLimitInfo)getProperty( ctx, CREDITLIMITINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarantee.creditLimitInfo</code> attribute.
	 * @return the creditLimitInfo - Credit limit info
	 */
	public CreditLimitInfo getCreditLimitInfo()
	{
		return getCreditLimitInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarantee.creditLimitInfo</code> attribute. 
	 * @param value the creditLimitInfo - Credit limit info
	 */
	public void setCreditLimitInfo(final SessionContext ctx, final CreditLimitInfo value)
	{
		setProperty(ctx, CREDITLIMITINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarantee.creditLimitInfo</code> attribute. 
	 * @param value the creditLimitInfo - Credit limit info
	 */
	public void setCreditLimitInfo(final CreditLimitInfo value)
	{
		setCreditLimitInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarantee.currency</code> attribute.
	 * @return the currency - Currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarantee.currency</code> attribute.
	 * @return the currency - Currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarantee.currency</code> attribute. 
	 * @param value the currency - Currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarantee.currency</code> attribute. 
	 * @param value the currency - Currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarantee.thresholdInfo</code> attribute.
	 * @return the thresholdInfo - Threshold Information
	 */
	public ThresholdInformation getThresholdInfo(final SessionContext ctx)
	{
		return (ThresholdInformation)getProperty( ctx, THRESHOLDINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarantee.thresholdInfo</code> attribute.
	 * @return the thresholdInfo - Threshold Information
	 */
	public ThresholdInformation getThresholdInfo()
	{
		return getThresholdInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarantee.thresholdInfo</code> attribute. 
	 * @param value the thresholdInfo - Threshold Information
	 */
	public void setThresholdInfo(final SessionContext ctx, final ThresholdInformation value)
	{
		setProperty(ctx, THRESHOLDINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarantee.thresholdInfo</code> attribute. 
	 * @param value the thresholdInfo - Threshold Information
	 */
	public void setThresholdInfo(final ThresholdInformation value)
	{
		setThresholdInfo( getSession().getSessionContext(), value );
	}
	
}
