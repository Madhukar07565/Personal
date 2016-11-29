/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.masterdata.core.jalo;

import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.contacts.jalo.ContactDetails;
import com.cnk.travelogix.masterdata.core.financials.jalo.Bank;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.user.Address;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem BankAccountDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBankAccountDetail extends GenericItem
{
	/** Qualifier of the <code>BankAccountDetail.bankAccountId</code> attribute **/
	public static final String BANKACCOUNTID = "bankAccountId";
	/** Qualifier of the <code>BankAccountDetail.acquirerAccCode</code> attribute **/
	public static final String ACQUIRERACCCODE = "acquirerAccCode";
	/** Qualifier of the <code>BankAccountDetail.bank</code> attribute **/
	public static final String BANK = "bank";
	/** Qualifier of the <code>BankAccountDetail.accountNumber</code> attribute **/
	public static final String ACCOUNTNUMBER = "accountNumber";
	/** Qualifier of the <code>BankAccountDetail.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>BankAccountDetail.address</code> attribute **/
	public static final String ADDRESS = "address";
	/** Qualifier of the <code>BankAccountDetail.branchCode</code> attribute **/
	public static final String BRANCHCODE = "branchCode";
	/** Qualifier of the <code>BankAccountDetail.intermediaryBranchCode</code> attribute **/
	public static final String INTERMEDIARYBRANCHCODE = "intermediaryBranchCode";
	/** Qualifier of the <code>BankAccountDetail.branchName</code> attribute **/
	public static final String BRANCHNAME = "branchName";
	/** Qualifier of the <code>BankAccountDetail.bankType</code> attribute **/
	public static final String BANKTYPE = "bankType";
	/** Qualifier of the <code>BankAccountDetail.sapFinancialId</code> attribute **/
	public static final String SAPFINANCIALID = "sapFinancialId";
	/** Qualifier of the <code>BankAccountDetail.accountType</code> attribute **/
	public static final String ACCOUNTTYPE = "accountType";
	/** Qualifier of the <code>BankAccountDetail.swiftCode</code> attribute **/
	public static final String SWIFTCODE = "swiftCode";
	/** Qualifier of the <code>BankAccountDetail.sortCode</code> attribute **/
	public static final String SORTCODE = "sortCode";
	/** Qualifier of the <code>BankAccountDetail.ifscCode</code> attribute **/
	public static final String IFSCCODE = "ifscCode";
	/** Qualifier of the <code>BankAccountDetail.bsrCode</code> attribute **/
	public static final String BSRCODE = "bsrCode";
	/** Qualifier of the <code>BankAccountDetail.micrCode</code> attribute **/
	public static final String MICRCODE = "micrCode";
	/** Qualifier of the <code>BankAccountDetail.active</code> attribute **/
	public static final String ACTIVE = "active";
	/** Qualifier of the <code>BankAccountDetail.contactDetails</code> attribute **/
	public static final String CONTACTDETAILS = "contactDetails";
	/** Qualifier of the <code>BankAccountDetail.bankAddress</code> attribute **/
	public static final String BANKADDRESS = "bankAddress";
	/** Qualifier of the <code>BankAccountDetail.bankName</code> attribute **/
	public static final String BANKNAME = "bankName";
	/** Qualifier of the <code>BankAccountDetail.holderAccountType</code> attribute **/
	public static final String HOLDERACCOUNTTYPE = "holderAccountType";
	/** Qualifier of the <code>BankAccountDetail.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>BankAccountDetail.state</code> attribute **/
	public static final String STATE = "state";
	/** Qualifier of the <code>BankAccountDetail.country</code> attribute **/
	public static final String COUNTRY = "country";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(BANKACCOUNTID, AttributeMode.INITIAL);
		tmp.put(ACQUIRERACCCODE, AttributeMode.INITIAL);
		tmp.put(BANK, AttributeMode.INITIAL);
		tmp.put(ACCOUNTNUMBER, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(ADDRESS, AttributeMode.INITIAL);
		tmp.put(BRANCHCODE, AttributeMode.INITIAL);
		tmp.put(INTERMEDIARYBRANCHCODE, AttributeMode.INITIAL);
		tmp.put(BRANCHNAME, AttributeMode.INITIAL);
		tmp.put(BANKTYPE, AttributeMode.INITIAL);
		tmp.put(SAPFINANCIALID, AttributeMode.INITIAL);
		tmp.put(ACCOUNTTYPE, AttributeMode.INITIAL);
		tmp.put(SWIFTCODE, AttributeMode.INITIAL);
		tmp.put(SORTCODE, AttributeMode.INITIAL);
		tmp.put(IFSCCODE, AttributeMode.INITIAL);
		tmp.put(BSRCODE, AttributeMode.INITIAL);
		tmp.put(MICRCODE, AttributeMode.INITIAL);
		tmp.put(ACTIVE, AttributeMode.INITIAL);
		tmp.put(CONTACTDETAILS, AttributeMode.INITIAL);
		tmp.put(BANKADDRESS, AttributeMode.INITIAL);
		tmp.put(BANKNAME, AttributeMode.INITIAL);
		tmp.put(HOLDERACCOUNTTYPE, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(STATE, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.accountNumber</code> attribute.
	 * @return the accountNumber
	 */
	public String getAccountNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ACCOUNTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.accountNumber</code> attribute.
	 * @return the accountNumber
	 */
	public String getAccountNumber()
	{
		return getAccountNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.accountNumber</code> attribute. 
	 * @param value the accountNumber
	 */
	public void setAccountNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ACCOUNTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.accountNumber</code> attribute. 
	 * @param value the accountNumber
	 */
	public void setAccountNumber(final String value)
	{
		setAccountNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.accountType</code> attribute.
	 * @return the accountType
	 */
	public EnumerationValue getAccountType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ACCOUNTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.accountType</code> attribute.
	 * @return the accountType
	 */
	public EnumerationValue getAccountType()
	{
		return getAccountType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.accountType</code> attribute. 
	 * @param value the accountType
	 */
	public void setAccountType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ACCOUNTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.accountType</code> attribute. 
	 * @param value the accountType
	 */
	public void setAccountType(final EnumerationValue value)
	{
		setAccountType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.acquirerAccCode</code> attribute.
	 * @return the acquirerAccCode
	 */
	public String getAcquirerAccCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ACQUIRERACCCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.acquirerAccCode</code> attribute.
	 * @return the acquirerAccCode
	 */
	public String getAcquirerAccCode()
	{
		return getAcquirerAccCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.acquirerAccCode</code> attribute. 
	 * @param value the acquirerAccCode
	 */
	public void setAcquirerAccCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ACQUIRERACCCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.acquirerAccCode</code> attribute. 
	 * @param value the acquirerAccCode
	 */
	public void setAcquirerAccCode(final String value)
	{
		setAcquirerAccCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.active</code> attribute.
	 * @return the active
	 */
	public Boolean isActive(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ACTIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.active</code> attribute.
	 * @return the active
	 */
	public Boolean isActive()
	{
		return isActive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.active</code> attribute. 
	 * @return the active
	 */
	public boolean isActiveAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isActive( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.active</code> attribute. 
	 * @return the active
	 */
	public boolean isActiveAsPrimitive()
	{
		return isActiveAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ACTIVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final Boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final SessionContext ctx, final boolean value)
	{
		setActive( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.address</code> attribute.
	 * @return the address
	 */
	public String getAddress(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.address</code> attribute.
	 * @return the address
	 */
	public String getAddress()
	{
		return getAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final String value)
	{
		setAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.bank</code> attribute.
	 * @return the bank
	 */
	public Bank getBank(final SessionContext ctx)
	{
		return (Bank)getProperty( ctx, BANK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.bank</code> attribute.
	 * @return the bank
	 */
	public Bank getBank()
	{
		return getBank( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.bank</code> attribute. 
	 * @param value the bank
	 */
	public void setBank(final SessionContext ctx, final Bank value)
	{
		setProperty(ctx, BANK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.bank</code> attribute. 
	 * @param value the bank
	 */
	public void setBank(final Bank value)
	{
		setBank( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.bankAccountId</code> attribute.
	 * @return the bankAccountId
	 */
	public String getBankAccountId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BANKACCOUNTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.bankAccountId</code> attribute.
	 * @return the bankAccountId
	 */
	public String getBankAccountId()
	{
		return getBankAccountId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.bankAccountId</code> attribute. 
	 * @param value the bankAccountId
	 */
	public void setBankAccountId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BANKACCOUNTID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.bankAccountId</code> attribute. 
	 * @param value the bankAccountId
	 */
	public void setBankAccountId(final String value)
	{
		setBankAccountId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.bankAddress</code> attribute.
	 * @return the bankAddress
	 */
	public Address getBankAddress(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, BANKADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.bankAddress</code> attribute.
	 * @return the bankAddress
	 */
	public Address getBankAddress()
	{
		return getBankAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.bankAddress</code> attribute. 
	 * @param value the bankAddress
	 */
	public void setBankAddress(final SessionContext ctx, final Address value)
	{
		setProperty(ctx, BANKADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.bankAddress</code> attribute. 
	 * @param value the bankAddress
	 */
	public void setBankAddress(final Address value)
	{
		setBankAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.bankName</code> attribute.
	 * @return the bankName
	 */
	public String getBankName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BANKNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.bankName</code> attribute.
	 * @return the bankName
	 */
	public String getBankName()
	{
		return getBankName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.bankName</code> attribute. 
	 * @param value the bankName
	 */
	public void setBankName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BANKNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.bankName</code> attribute. 
	 * @param value the bankName
	 */
	public void setBankName(final String value)
	{
		setBankName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.bankType</code> attribute.
	 * @return the bankType
	 */
	public EnumerationValue getBankType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, BANKTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.bankType</code> attribute.
	 * @return the bankType
	 */
	public EnumerationValue getBankType()
	{
		return getBankType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.bankType</code> attribute. 
	 * @param value the bankType
	 */
	public void setBankType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, BANKTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.bankType</code> attribute. 
	 * @param value the bankType
	 */
	public void setBankType(final EnumerationValue value)
	{
		setBankType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.branchCode</code> attribute.
	 * @return the branchCode
	 */
	public String getBranchCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BRANCHCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.branchCode</code> attribute.
	 * @return the branchCode
	 */
	public String getBranchCode()
	{
		return getBranchCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.branchCode</code> attribute. 
	 * @param value the branchCode
	 */
	public void setBranchCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BRANCHCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.branchCode</code> attribute. 
	 * @param value the branchCode
	 */
	public void setBranchCode(final String value)
	{
		setBranchCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.branchName</code> attribute.
	 * @return the branchName
	 */
	public String getBranchName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BRANCHNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.branchName</code> attribute.
	 * @return the branchName
	 */
	public String getBranchName()
	{
		return getBranchName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.branchName</code> attribute. 
	 * @param value the branchName
	 */
	public void setBranchName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BRANCHNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.branchName</code> attribute. 
	 * @param value the branchName
	 */
	public void setBranchName(final String value)
	{
		setBranchName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.bsrCode</code> attribute.
	 * @return the bsrCode
	 */
	public String getBsrCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BSRCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.bsrCode</code> attribute.
	 * @return the bsrCode
	 */
	public String getBsrCode()
	{
		return getBsrCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.bsrCode</code> attribute. 
	 * @param value the bsrCode
	 */
	public void setBsrCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BSRCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.bsrCode</code> attribute. 
	 * @param value the bsrCode
	 */
	public void setBsrCode(final String value)
	{
		setBsrCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.city</code> attribute.
	 * @return the city
	 */
	public String getCity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.city</code> attribute.
	 * @return the city
	 */
	public String getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final String value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.contactDetails</code> attribute.
	 * @return the contactDetails
	 */
	public ContactDetails getContactDetails(final SessionContext ctx)
	{
		return (ContactDetails)getProperty( ctx, CONTACTDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.contactDetails</code> attribute.
	 * @return the contactDetails
	 */
	public ContactDetails getContactDetails()
	{
		return getContactDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.contactDetails</code> attribute. 
	 * @param value the contactDetails
	 */
	public void setContactDetails(final SessionContext ctx, final ContactDetails value)
	{
		setProperty(ctx, CONTACTDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.contactDetails</code> attribute. 
	 * @param value the contactDetails
	 */
	public void setContactDetails(final ContactDetails value)
	{
		setContactDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.country</code> attribute.
	 * @return the country
	 */
	public String getCountry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.country</code> attribute.
	 * @return the country
	 */
	public String getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final String value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.holderAccountType</code> attribute.
	 * @return the holderAccountType
	 */
	public EnumerationValue getHolderAccountType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, HOLDERACCOUNTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.holderAccountType</code> attribute.
	 * @return the holderAccountType
	 */
	public EnumerationValue getHolderAccountType()
	{
		return getHolderAccountType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.holderAccountType</code> attribute. 
	 * @param value the holderAccountType
	 */
	public void setHolderAccountType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, HOLDERACCOUNTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.holderAccountType</code> attribute. 
	 * @param value the holderAccountType
	 */
	public void setHolderAccountType(final EnumerationValue value)
	{
		setHolderAccountType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.ifscCode</code> attribute.
	 * @return the ifscCode
	 */
	public String getIfscCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, IFSCCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.ifscCode</code> attribute.
	 * @return the ifscCode
	 */
	public String getIfscCode()
	{
		return getIfscCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.ifscCode</code> attribute. 
	 * @param value the ifscCode
	 */
	public void setIfscCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, IFSCCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.ifscCode</code> attribute. 
	 * @param value the ifscCode
	 */
	public void setIfscCode(final String value)
	{
		setIfscCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.intermediaryBranchCode</code> attribute.
	 * @return the intermediaryBranchCode
	 */
	public String getIntermediaryBranchCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INTERMEDIARYBRANCHCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.intermediaryBranchCode</code> attribute.
	 * @return the intermediaryBranchCode
	 */
	public String getIntermediaryBranchCode()
	{
		return getIntermediaryBranchCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.intermediaryBranchCode</code> attribute. 
	 * @param value the intermediaryBranchCode
	 */
	public void setIntermediaryBranchCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INTERMEDIARYBRANCHCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.intermediaryBranchCode</code> attribute. 
	 * @param value the intermediaryBranchCode
	 */
	public void setIntermediaryBranchCode(final String value)
	{
		setIntermediaryBranchCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.micrCode</code> attribute.
	 * @return the micrCode
	 */
	public String getMicrCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MICRCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.micrCode</code> attribute.
	 * @return the micrCode
	 */
	public String getMicrCode()
	{
		return getMicrCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.micrCode</code> attribute. 
	 * @param value the micrCode
	 */
	public void setMicrCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MICRCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.micrCode</code> attribute. 
	 * @param value the micrCode
	 */
	public void setMicrCode(final String value)
	{
		setMicrCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.sapFinancialId</code> attribute.
	 * @return the sapFinancialId
	 */
	public String getSapFinancialId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPFINANCIALID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.sapFinancialId</code> attribute.
	 * @return the sapFinancialId
	 */
	public String getSapFinancialId()
	{
		return getSapFinancialId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.sapFinancialId</code> attribute. 
	 * @param value the sapFinancialId
	 */
	public void setSapFinancialId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPFINANCIALID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.sapFinancialId</code> attribute. 
	 * @param value the sapFinancialId
	 */
	public void setSapFinancialId(final String value)
	{
		setSapFinancialId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.sortCode</code> attribute.
	 * @return the sortCode
	 */
	public String getSortCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SORTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.sortCode</code> attribute.
	 * @return the sortCode
	 */
	public String getSortCode()
	{
		return getSortCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.sortCode</code> attribute. 
	 * @param value the sortCode
	 */
	public void setSortCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SORTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.sortCode</code> attribute. 
	 * @param value the sortCode
	 */
	public void setSortCode(final String value)
	{
		setSortCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.state</code> attribute.
	 * @return the state
	 */
	public String getState(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.state</code> attribute.
	 * @return the state
	 */
	public String getState()
	{
		return getState( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.state</code> attribute. 
	 * @param value the state
	 */
	public void setState(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.state</code> attribute. 
	 * @param value the state
	 */
	public void setState(final String value)
	{
		setState( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.swiftCode</code> attribute.
	 * @return the swiftCode
	 */
	public String getSwiftCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SWIFTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.swiftCode</code> attribute.
	 * @return the swiftCode
	 */
	public String getSwiftCode()
	{
		return getSwiftCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.swiftCode</code> attribute. 
	 * @param value the swiftCode
	 */
	public void setSwiftCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SWIFTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.swiftCode</code> attribute. 
	 * @param value the swiftCode
	 */
	public void setSwiftCode(final String value)
	{
		setSwiftCode( getSession().getSessionContext(), value );
	}
	
}
