/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.credit.core.jalo;

import com.cnk.travelogix.client.credit.constants.ClientcreditConstants;
import com.cnk.travelogix.masterdata.core.financials.jalo.Bank;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.credit.core.jalo.BankInformation BankInformation}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBankInformation extends GenericItem
{
	/** Qualifier of the <code>BankInformation.bankName</code> attribute **/
	public static final String BANKNAME = "bankName";
	/** Qualifier of the <code>BankInformation.branchName</code> attribute **/
	public static final String BRANCHNAME = "branchName";
	/** Qualifier of the <code>BankInformation.contactNumber</code> attribute **/
	public static final String CONTACTNUMBER = "contactNumber";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(BANKNAME, AttributeMode.INITIAL);
		tmp.put(BRANCHNAME, AttributeMode.INITIAL);
		tmp.put(CONTACTNUMBER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInformation.bankName</code> attribute.
	 * @return the bankName - Bank Name
	 */
	public Bank getBankName(final SessionContext ctx)
	{
		return (Bank)getProperty( ctx, BANKNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInformation.bankName</code> attribute.
	 * @return the bankName - Bank Name
	 */
	public Bank getBankName()
	{
		return getBankName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInformation.bankName</code> attribute. 
	 * @param value the bankName - Bank Name
	 */
	public void setBankName(final SessionContext ctx, final Bank value)
	{
		setProperty(ctx, BANKNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInformation.bankName</code> attribute. 
	 * @param value the bankName - Bank Name
	 */
	public void setBankName(final Bank value)
	{
		setBankName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInformation.branchName</code> attribute.
	 * @return the branchName - Branch Name
	 */
	public String getBranchName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BRANCHNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInformation.branchName</code> attribute.
	 * @return the branchName - Branch Name
	 */
	public String getBranchName()
	{
		return getBranchName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInformation.branchName</code> attribute. 
	 * @param value the branchName - Branch Name
	 */
	public void setBranchName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BRANCHNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInformation.branchName</code> attribute. 
	 * @param value the branchName - Branch Name
	 */
	public void setBranchName(final String value)
	{
		setBranchName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInformation.contactNumber</code> attribute.
	 * @return the contactNumber - ContactNumber
	 */
	public String getContactNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTACTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankInformation.contactNumber</code> attribute.
	 * @return the contactNumber - ContactNumber
	 */
	public String getContactNumber()
	{
		return getContactNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInformation.contactNumber</code> attribute. 
	 * @param value the contactNumber - ContactNumber
	 */
	public void setContactNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTACTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankInformation.contactNumber</code> attribute. 
	 * @param value the contactNumber - ContactNumber
	 */
	public void setContactNumber(final String value)
	{
		setContactNumber( getSession().getSessionContext(), value );
	}
	
}
