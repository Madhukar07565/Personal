/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.credentials.core.indents.jalo;

import com.cnk.travelogix.masterdata.core.paymentinfo.jalo.AbstractPaymentDetail;
import com.cnk.travelogix.supplier.credentials.core.constants.SuppliercredentialscoreConstants;
import com.cnk.travelogix.supplier.credentials.core.indents.jalo.AbstractIndent;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.credentials.core.indents.jalo.BankGuarenteeInfo BankGuarenteeInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBankGuarenteeInfo extends AbstractPaymentDetail
{
	/** Qualifier of the <code>BankGuarenteeInfo.bankGuarenteeNumber</code> attribute **/
	public static final String BANKGUARENTEENUMBER = "bankGuarenteeNumber";
	/** Qualifier of the <code>BankGuarenteeInfo.validFrom</code> attribute **/
	public static final String VALIDFROM = "validFrom";
	/** Qualifier of the <code>BankGuarenteeInfo.validTo</code> attribute **/
	public static final String VALIDTO = "validTo";
	/** Qualifier of the <code>BankGuarenteeInfo.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>BankGuarenteeInfo.indent</code> attribute **/
	public static final String INDENT = "indent";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n INDENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBankGuarenteeInfo> INDENTHANDLER = new BidirectionalOneToManyHandler<GeneratedBankGuarenteeInfo>(
	SuppliercredentialscoreConstants.TC.BANKGUARENTEEINFO,
	false,
	"indent",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractPaymentDetail.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(BANKGUARENTEENUMBER, AttributeMode.INITIAL);
		tmp.put(VALIDFROM, AttributeMode.INITIAL);
		tmp.put(VALIDTO, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(INDENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarenteeInfo.bankGuarenteeNumber</code> attribute.
	 * @return the bankGuarenteeNumber
	 */
	public String getBankGuarenteeNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BANKGUARENTEENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarenteeInfo.bankGuarenteeNumber</code> attribute.
	 * @return the bankGuarenteeNumber
	 */
	public String getBankGuarenteeNumber()
	{
		return getBankGuarenteeNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarenteeInfo.bankGuarenteeNumber</code> attribute. 
	 * @param value the bankGuarenteeNumber
	 */
	public void setBankGuarenteeNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BANKGUARENTEENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarenteeInfo.bankGuarenteeNumber</code> attribute. 
	 * @param value the bankGuarenteeNumber
	 */
	public void setBankGuarenteeNumber(final String value)
	{
		setBankGuarenteeNumber( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		INDENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarenteeInfo.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarenteeInfo.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarenteeInfo.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarenteeInfo.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarenteeInfo.indent</code> attribute.
	 * @return the indent
	 */
	public AbstractIndent getIndent(final SessionContext ctx)
	{
		return (AbstractIndent)getProperty( ctx, INDENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarenteeInfo.indent</code> attribute.
	 * @return the indent
	 */
	public AbstractIndent getIndent()
	{
		return getIndent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarenteeInfo.indent</code> attribute. 
	 * @param value the indent
	 */
	public void setIndent(final SessionContext ctx, final AbstractIndent value)
	{
		INDENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarenteeInfo.indent</code> attribute. 
	 * @param value the indent
	 */
	public void setIndent(final AbstractIndent value)
	{
		setIndent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarenteeInfo.validFrom</code> attribute.
	 * @return the validFrom
	 */
	public Date getValidFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarenteeInfo.validFrom</code> attribute.
	 * @return the validFrom
	 */
	public Date getValidFrom()
	{
		return getValidFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarenteeInfo.validFrom</code> attribute. 
	 * @param value the validFrom
	 */
	public void setValidFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarenteeInfo.validFrom</code> attribute. 
	 * @param value the validFrom
	 */
	public void setValidFrom(final Date value)
	{
		setValidFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarenteeInfo.validTo</code> attribute.
	 * @return the validTo
	 */
	public Date getValidTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankGuarenteeInfo.validTo</code> attribute.
	 * @return the validTo
	 */
	public Date getValidTo()
	{
		return getValidTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarenteeInfo.validTo</code> attribute. 
	 * @param value the validTo
	 */
	public void setValidTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankGuarenteeInfo.validTo</code> attribute. 
	 * @param value the validTo
	 */
	public void setValidTo(final Date value)
	{
		setValidTo( getSession().getSessionContext(), value );
	}
	
}
