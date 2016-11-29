/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.credit.jalo;

import com.cnk.travelogix.client.credit.constants.ClientcreditConstants;
import com.cnk.travelogix.client.credit.jalo.CreditCardDetail;
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
 * Generated class for type {@link com.cnk.travelogix.client.credit.jalo.SecuredCreditCardLimit SecuredCreditCardLimit}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSecuredCreditCardLimit extends SecuredCreditDepositLimit
{
	/** Qualifier of the <code>SecuredCreditCardLimit.creditcards</code> attribute **/
	public static final String CREDITCARDS = "creditcards";
	/**
	* {@link OneToManyHandler} for handling 1:n CREDITCARDS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CreditCardDetail> CREDITCARDSHANDLER = new OneToManyHandler<CreditCardDetail>(
	ClientcreditConstants.TC.CREDITCARDDETAIL,
	false,
	"securedCreditCardLimit",
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
	 * <i>Generated method</i> - Getter of the <code>SecuredCreditCardLimit.creditcards</code> attribute.
	 * @return the creditcards
	 */
	public Collection<CreditCardDetail> getCreditcards(final SessionContext ctx)
	{
		return CREDITCARDSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecuredCreditCardLimit.creditcards</code> attribute.
	 * @return the creditcards
	 */
	public Collection<CreditCardDetail> getCreditcards()
	{
		return getCreditcards( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecuredCreditCardLimit.creditcards</code> attribute. 
	 * @param value the creditcards
	 */
	public void setCreditcards(final SessionContext ctx, final Collection<CreditCardDetail> value)
	{
		CREDITCARDSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecuredCreditCardLimit.creditcards</code> attribute. 
	 * @param value the creditcards
	 */
	public void setCreditcards(final Collection<CreditCardDetail> value)
	{
		setCreditcards( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to creditcards. 
	 * @param value the item to add to creditcards
	 */
	public void addToCreditcards(final SessionContext ctx, final CreditCardDetail value)
	{
		CREDITCARDSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to creditcards. 
	 * @param value the item to add to creditcards
	 */
	public void addToCreditcards(final CreditCardDetail value)
	{
		addToCreditcards( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from creditcards. 
	 * @param value the item to remove from creditcards
	 */
	public void removeFromCreditcards(final SessionContext ctx, final CreditCardDetail value)
	{
		CREDITCARDSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from creditcards. 
	 * @param value the item to remove from creditcards
	 */
	public void removeFromCreditcards(final CreditCardDetail value)
	{
		removeFromCreditcards( getSession().getSessionContext(), value );
	}
	
}
