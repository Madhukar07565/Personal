/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.credit.jalo;

import com.cnk.travelogix.client.credit.constants.ClientcreditConstants;
import com.cnk.travelogix.client.credit.jalo.BankInfo;
import com.cnk.travelogix.client.credit.jalo.SecuredCreditDepositLimit;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.credit.jalo.SecuredBankGuarantee SecuredBankGuarantee}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSecuredBankGuarantee extends SecuredCreditDepositLimit
{
	/** Qualifier of the <code>SecuredBankGuarantee.banks</code> attribute **/
	public static final String BANKS = "banks";
	/**
	* {@link OneToManyHandler} for handling 1:n BANKS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BankInfo> BANKSHANDLER = new OneToManyHandler<BankInfo>(
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SecuredCreditDepositLimit.DEFAULT_INITIAL_ATTRIBUTES);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecuredBankGuarantee.banks</code> attribute.
	 * @return the banks
	 */
	public Collection<BankInfo> getBanks(final SessionContext ctx)
	{
		return BANKSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecuredBankGuarantee.banks</code> attribute.
	 * @return the banks
	 */
	public Collection<BankInfo> getBanks()
	{
		return getBanks( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecuredBankGuarantee.banks</code> attribute. 
	 * @param value the banks
	 */
	public void setBanks(final SessionContext ctx, final Collection<BankInfo> value)
	{
		BANKSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecuredBankGuarantee.banks</code> attribute. 
	 * @param value the banks
	 */
	public void setBanks(final Collection<BankInfo> value)
	{
		setBanks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to banks. 
	 * @param value the item to add to banks
	 */
	public void addToBanks(final SessionContext ctx, final BankInfo value)
	{
		BANKSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to banks. 
	 * @param value the item to add to banks
	 */
	public void addToBanks(final BankInfo value)
	{
		addToBanks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from banks. 
	 * @param value the item to remove from banks
	 */
	public void removeFromBanks(final SessionContext ctx, final BankInfo value)
	{
		BANKSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from banks. 
	 * @param value the item to remove from banks
	 */
	public void removeFromBanks(final BankInfo value)
	{
		removeFromBanks( getSession().getSessionContext(), value );
	}
	
}
