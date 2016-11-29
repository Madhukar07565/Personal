/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.credit.jalo;

import com.cnk.travelogix.client.credit.constants.ClientcreditConstants;
import com.cnk.travelogix.client.credit.jalo.SecuredBankGuarantee;
import com.cnk.travelogix.masterdata.core.financials.jalo.Bank;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.credit.jalo.BankInfo BankInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBankInfo extends GenericItem
{
	/** Qualifier of the <code>BankInfo.bank</code> attribute **/
	public static final String BANK = "bank";
	/** Qualifier of the <code>BankInfo.branchName</code> attribute **/
	public static final String BRANCHNAME = "branchName";
	/** Qualifier of the <code>BankInfo.contactNumber</code> attribute **/
	public static final String CONTACTNUMBER = "contactNumber";
	/** Qualifier of the <code>BankInfo.bgRefNumber</code> attribute **/
	public static final String BGREFNUMBER = "bgRefNumber";
	/** Qualifier of the <code>BankInfo.bgIssueDate</code> attribute **/
	public static final String BGISSUEDATE = "bgIssueDate";
	/** Qualifier of the <code>BankInfo.bgExpiryDate</code> attribute **/
	public static final String BGEXPIRYDATE = "bgExpiryDate";
	/** Qualifier of the <code>BankInfo.bgClaimPeriod</code> attribute **/
	public static final String BGCLAIMPERIOD = "bgClaimPeriod";
	/** Qualifier of the <code>BankInfo.bgAmount</code> attribute **/
	public static final String BGAMOUNT = "bgAmount";
	/** Qualifier of the <code>BankInfo.thresholdIn</code> attribute **/
	public static final String THRESHOLDIN = "thresholdIn";
	/** Qualifier of the <code>BankInfo.thresholdValue</code> attribute **/
	public static final String THRESHOLDVALUE = "thresholdValue";
	/** Qualifier of the <code>BankInfo.creditLimit</code> attribute **/
	public static final String CREDITLIMIT = "creditLimit";
	/** Qualifier of the <code>BankInfo.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>BankInfo.securedBankGuarantee</code> attribute **/
	public static final String SECUREDBANKGUARANTEE = "securedBankGuarantee";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SECUREDBANKGUARANTEE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBankInfo> SECUREDBANKGUARANTEEHANDLER = new BidirectionalOneToManyHandler<GeneratedBankInfo>(
	ClientcreditConstants.TC.BANKINFO,
	false,
	"securedBankGuarantee",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(BANK, AttributeMode.INITIAL);
		tmp.put(BRANCHNAME, AttributeMode.INITIAL);
		tmp.put(CONTACTNUMBER, AttributeMode.INITIAL);
		tmp.put(BGREFNUMBER, AttributeMode.INITIAL);
		tmp.put(BGISSUEDATE, AttributeMode.INITIAL);
		tmp.put(BGEXPIRYDATE, AttributeMode.INITIAL);
		tmp.put(BGCLAIMPERIOD, AttributeMode.INITIAL);
		tmp.put(BGAMOUNT, AttributeMode.INITIAL);
		tmp.put(THRESHOLDIN, AttributeMode.INITIAL);
		tmp.put(THRESHOLDVALUE, AttributeMode.INITIAL);
		tmp.put(CREDITLIMIT, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(SECUREDBANKGUARANTEE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.bank</code> attribute.
	 * @return the bank
	 */
	public Bank getBank(final SessionContext ctx)
	{
		return (Bank)getProperty( ctx, BANK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.bank</code> attribute.
	 * @return the bank
	 */
	public Bank getBank()
	{
		return getBank( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.bank</code> attribute. 
	 * @param value the bank
	 */
	public void setBank(final SessionContext ctx, final Bank value)
	{
		setProperty(ctx, BANK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.bank</code> attribute. 
	 * @param value the bank
	 */
	public void setBank(final Bank value)
	{
		setBank( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.bgAmount</code> attribute.
	 * @return the bgAmount
	 */
	public Double getBgAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, BGAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.bgAmount</code> attribute.
	 * @return the bgAmount
	 */
	public Double getBgAmount()
	{
		return getBgAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.bgAmount</code> attribute. 
	 * @return the bgAmount
	 */
	public double getBgAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getBgAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.bgAmount</code> attribute. 
	 * @return the bgAmount
	 */
	public double getBgAmountAsPrimitive()
	{
		return getBgAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.bgAmount</code> attribute. 
	 * @param value the bgAmount
	 */
	public void setBgAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, BGAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.bgAmount</code> attribute. 
	 * @param value the bgAmount
	 */
	public void setBgAmount(final Double value)
	{
		setBgAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.bgAmount</code> attribute. 
	 * @param value the bgAmount
	 */
	public void setBgAmount(final SessionContext ctx, final double value)
	{
		setBgAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.bgAmount</code> attribute. 
	 * @param value the bgAmount
	 */
	public void setBgAmount(final double value)
	{
		setBgAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.bgClaimPeriod</code> attribute.
	 * @return the bgClaimPeriod
	 */
	public Integer getBgClaimPeriod(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, BGCLAIMPERIOD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.bgClaimPeriod</code> attribute.
	 * @return the bgClaimPeriod
	 */
	public Integer getBgClaimPeriod()
	{
		return getBgClaimPeriod( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.bgClaimPeriod</code> attribute. 
	 * @return the bgClaimPeriod
	 */
	public int getBgClaimPeriodAsPrimitive(final SessionContext ctx)
	{
		Integer value = getBgClaimPeriod( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.bgClaimPeriod</code> attribute. 
	 * @return the bgClaimPeriod
	 */
	public int getBgClaimPeriodAsPrimitive()
	{
		return getBgClaimPeriodAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.bgClaimPeriod</code> attribute. 
	 * @param value the bgClaimPeriod
	 */
	public void setBgClaimPeriod(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, BGCLAIMPERIOD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.bgClaimPeriod</code> attribute. 
	 * @param value the bgClaimPeriod
	 */
	public void setBgClaimPeriod(final Integer value)
	{
		setBgClaimPeriod( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.bgClaimPeriod</code> attribute. 
	 * @param value the bgClaimPeriod
	 */
	public void setBgClaimPeriod(final SessionContext ctx, final int value)
	{
		setBgClaimPeriod( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.bgClaimPeriod</code> attribute. 
	 * @param value the bgClaimPeriod
	 */
	public void setBgClaimPeriod(final int value)
	{
		setBgClaimPeriod( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.bgExpiryDate</code> attribute.
	 * @return the bgExpiryDate
	 */
	public Date getBgExpiryDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, BGEXPIRYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.bgExpiryDate</code> attribute.
	 * @return the bgExpiryDate
	 */
	public Date getBgExpiryDate()
	{
		return getBgExpiryDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.bgExpiryDate</code> attribute. 
	 * @param value the bgExpiryDate
	 */
	public void setBgExpiryDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, BGEXPIRYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.bgExpiryDate</code> attribute. 
	 * @param value the bgExpiryDate
	 */
	public void setBgExpiryDate(final Date value)
	{
		setBgExpiryDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.bgIssueDate</code> attribute.
	 * @return the bgIssueDate
	 */
	public Date getBgIssueDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, BGISSUEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.bgIssueDate</code> attribute.
	 * @return the bgIssueDate
	 */
	public Date getBgIssueDate()
	{
		return getBgIssueDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.bgIssueDate</code> attribute. 
	 * @param value the bgIssueDate
	 */
	public void setBgIssueDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, BGISSUEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.bgIssueDate</code> attribute. 
	 * @param value the bgIssueDate
	 */
	public void setBgIssueDate(final Date value)
	{
		setBgIssueDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.bgRefNumber</code> attribute.
	 * @return the bgRefNumber
	 */
	public String getBgRefNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BGREFNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.bgRefNumber</code> attribute.
	 * @return the bgRefNumber
	 */
	public String getBgRefNumber()
	{
		return getBgRefNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.bgRefNumber</code> attribute. 
	 * @param value the bgRefNumber
	 */
	public void setBgRefNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BGREFNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.bgRefNumber</code> attribute. 
	 * @param value the bgRefNumber
	 */
	public void setBgRefNumber(final String value)
	{
		setBgRefNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.branchName</code> attribute.
	 * @return the branchName
	 */
	public String getBranchName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BRANCHNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.branchName</code> attribute.
	 * @return the branchName
	 */
	public String getBranchName()
	{
		return getBranchName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.branchName</code> attribute. 
	 * @param value the branchName
	 */
	public void setBranchName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BRANCHNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.branchName</code> attribute. 
	 * @param value the branchName
	 */
	public void setBranchName(final String value)
	{
		setBranchName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.contactNumber</code> attribute.
	 * @return the contactNumber
	 */
	public String getContactNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTACTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.contactNumber</code> attribute.
	 * @return the contactNumber
	 */
	public String getContactNumber()
	{
		return getContactNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.contactNumber</code> attribute. 
	 * @param value the contactNumber
	 */
	public void setContactNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTACTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.contactNumber</code> attribute. 
	 * @param value the contactNumber
	 */
	public void setContactNumber(final String value)
	{
		setContactNumber( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		SECUREDBANKGUARANTEEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.creditLimit</code> attribute.
	 * @return the creditLimit
	 */
	public Double getCreditLimit(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, CREDITLIMIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.creditLimit</code> attribute.
	 * @return the creditLimit
	 */
	public Double getCreditLimit()
	{
		return getCreditLimit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.creditLimit</code> attribute. 
	 * @return the creditLimit
	 */
	public double getCreditLimitAsPrimitive(final SessionContext ctx)
	{
		Double value = getCreditLimit( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.creditLimit</code> attribute. 
	 * @return the creditLimit
	 */
	public double getCreditLimitAsPrimitive()
	{
		return getCreditLimitAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.creditLimit</code> attribute. 
	 * @param value the creditLimit
	 */
	public void setCreditLimit(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, CREDITLIMIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.creditLimit</code> attribute. 
	 * @param value the creditLimit
	 */
	public void setCreditLimit(final Double value)
	{
		setCreditLimit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.creditLimit</code> attribute. 
	 * @param value the creditLimit
	 */
	public void setCreditLimit(final SessionContext ctx, final double value)
	{
		setCreditLimit( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.creditLimit</code> attribute. 
	 * @param value the creditLimit
	 */
	public void setCreditLimit(final double value)
	{
		setCreditLimit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.securedBankGuarantee</code> attribute.
	 * @return the securedBankGuarantee
	 */
	public SecuredBankGuarantee getSecuredBankGuarantee(final SessionContext ctx)
	{
		return (SecuredBankGuarantee)getProperty( ctx, SECUREDBANKGUARANTEE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.securedBankGuarantee</code> attribute.
	 * @return the securedBankGuarantee
	 */
	public SecuredBankGuarantee getSecuredBankGuarantee()
	{
		return getSecuredBankGuarantee( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.securedBankGuarantee</code> attribute. 
	 * @param value the securedBankGuarantee
	 */
	public void setSecuredBankGuarantee(final SessionContext ctx, final SecuredBankGuarantee value)
	{
		SECUREDBANKGUARANTEEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.securedBankGuarantee</code> attribute. 
	 * @param value the securedBankGuarantee
	 */
	public void setSecuredBankGuarantee(final SecuredBankGuarantee value)
	{
		setSecuredBankGuarantee( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.thresholdIn</code> attribute.
	 * @return the thresholdIn
	 */
	public EnumerationValue getThresholdIn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, THRESHOLDIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.thresholdIn</code> attribute.
	 * @return the thresholdIn
	 */
	public EnumerationValue getThresholdIn()
	{
		return getThresholdIn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.thresholdIn</code> attribute. 
	 * @param value the thresholdIn
	 */
	public void setThresholdIn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, THRESHOLDIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.thresholdIn</code> attribute. 
	 * @param value the thresholdIn
	 */
	public void setThresholdIn(final EnumerationValue value)
	{
		setThresholdIn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.thresholdValue</code> attribute.
	 * @return the thresholdValue
	 */
	public Double getThresholdValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, THRESHOLDVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.thresholdValue</code> attribute.
	 * @return the thresholdValue
	 */
	public Double getThresholdValue()
	{
		return getThresholdValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.thresholdValue</code> attribute. 
	 * @return the thresholdValue
	 */
	public double getThresholdValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getThresholdValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInfo.thresholdValue</code> attribute. 
	 * @return the thresholdValue
	 */
	public double getThresholdValueAsPrimitive()
	{
		return getThresholdValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.thresholdValue</code> attribute. 
	 * @param value the thresholdValue
	 */
	public void setThresholdValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, THRESHOLDVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.thresholdValue</code> attribute. 
	 * @param value the thresholdValue
	 */
	public void setThresholdValue(final Double value)
	{
		setThresholdValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.thresholdValue</code> attribute. 
	 * @param value the thresholdValue
	 */
	public void setThresholdValue(final SessionContext ctx, final double value)
	{
		setThresholdValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInfo.thresholdValue</code> attribute. 
	 * @param value the thresholdValue
	 */
	public void setThresholdValue(final double value)
	{
		setThresholdValue( getSession().getSessionContext(), value );
	}
	
}
