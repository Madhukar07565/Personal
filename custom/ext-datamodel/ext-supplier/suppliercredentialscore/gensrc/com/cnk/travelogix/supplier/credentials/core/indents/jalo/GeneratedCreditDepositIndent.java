/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.credentials.core.indents.jalo;

import com.cnk.travelogix.supplier.credentials.core.constants.SuppliercredentialscoreConstants;
import com.cnk.travelogix.supplier.credentials.core.indents.jalo.AbstractIndent;
import com.cnk.travelogix.supplier.credentials.core.jalo.SupplierCredentials;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.util.Utilities;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.credentials.core.indents.jalo.CreditDepositIndent CreditDepositIndent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCreditDepositIndent extends AbstractIndent
{
	/** Qualifier of the <code>CreditDepositIndent.modeOfSecurity</code> attribute **/
	public static final String MODEOFSECURITY = "modeOfSecurity";
	/** Qualifier of the <code>CreditDepositIndent.amount</code> attribute **/
	public static final String AMOUNT = "amount";
	/** Qualifier of the <code>CreditDepositIndent.paymentRemark</code> attribute **/
	public static final String PAYMENTREMARK = "paymentRemark";
	/** Qualifier of the <code>CreditDepositIndent.amountPaid</code> attribute **/
	public static final String AMOUNTPAID = "amountPaid";
	/** Qualifier of the <code>CreditDepositIndent.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>CreditDepositIndent.credentials</code> attribute **/
	public static final String CREDENTIALS = "credentials";
	/** Relation ordering override parameter constants for CreditDepositIndent2CredentialsRel from ((suppliercredentialscore))*/
	protected static String CREDITDEPOSITINDENT2CREDENTIALSREL_SRC_ORDERED = "relation.CreditDepositIndent2CredentialsRel.source.ordered";
	protected static String CREDITDEPOSITINDENT2CREDENTIALSREL_TGT_ORDERED = "relation.CreditDepositIndent2CredentialsRel.target.ordered";
	/** Relation disable markmodifed parameter constants for CreditDepositIndent2CredentialsRel from ((suppliercredentialscore))*/
	protected static String CREDITDEPOSITINDENT2CREDENTIALSREL_MARKMODIFIED = "relation.CreditDepositIndent2CredentialsRel.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractIndent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MODEOFSECURITY, AttributeMode.INITIAL);
		tmp.put(AMOUNT, AttributeMode.INITIAL);
		tmp.put(PAYMENTREMARK, AttributeMode.INITIAL);
		tmp.put(AMOUNTPAID, AttributeMode.INITIAL);
		tmp.put(DATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditDepositIndent.amount</code> attribute.
	 * @return the amount
	 */
	public Double getAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, AMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditDepositIndent.amount</code> attribute.
	 * @return the amount
	 */
	public Double getAmount()
	{
		return getAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditDepositIndent.amount</code> attribute. 
	 * @return the amount
	 */
	public double getAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditDepositIndent.amount</code> attribute. 
	 * @return the amount
	 */
	public double getAmountAsPrimitive()
	{
		return getAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditDepositIndent.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, AMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditDepositIndent.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final Double value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditDepositIndent.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final double value)
	{
		setAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditDepositIndent.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final double value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditDepositIndent.amountPaid</code> attribute.
	 * @return the amountPaid
	 */
	public BigDecimal getAmountPaid(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, AMOUNTPAID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditDepositIndent.amountPaid</code> attribute.
	 * @return the amountPaid
	 */
	public BigDecimal getAmountPaid()
	{
		return getAmountPaid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditDepositIndent.amountPaid</code> attribute. 
	 * @param value the amountPaid
	 */
	public void setAmountPaid(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, AMOUNTPAID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditDepositIndent.amountPaid</code> attribute. 
	 * @param value the amountPaid
	 */
	public void setAmountPaid(final BigDecimal value)
	{
		setAmountPaid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditDepositIndent.credentials</code> attribute.
	 * @return the credentials
	 */
	public Collection<SupplierCredentials> getCredentials(final SessionContext ctx)
	{
		final List<SupplierCredentials> items = getLinkedItems( 
			ctx,
			true,
			SuppliercredentialscoreConstants.Relations.CREDITDEPOSITINDENT2CREDENTIALSREL,
			"SupplierCredentials",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditDepositIndent.credentials</code> attribute.
	 * @return the credentials
	 */
	public Collection<SupplierCredentials> getCredentials()
	{
		return getCredentials( getSession().getSessionContext() );
	}
	
	public long getCredentialsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SuppliercredentialscoreConstants.Relations.CREDITDEPOSITINDENT2CREDENTIALSREL,
			"SupplierCredentials",
			null
		);
	}
	
	public long getCredentialsCount()
	{
		return getCredentialsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditDepositIndent.credentials</code> attribute. 
	 * @param value the credentials
	 */
	public void setCredentials(final SessionContext ctx, final Collection<SupplierCredentials> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SuppliercredentialscoreConstants.Relations.CREDITDEPOSITINDENT2CREDENTIALSREL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(CREDITDEPOSITINDENT2CREDENTIALSREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditDepositIndent.credentials</code> attribute. 
	 * @param value the credentials
	 */
	public void setCredentials(final Collection<SupplierCredentials> value)
	{
		setCredentials( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to credentials. 
	 * @param value the item to add to credentials
	 */
	public void addToCredentials(final SessionContext ctx, final SupplierCredentials value)
	{
		addLinkedItems( 
			ctx,
			true,
			SuppliercredentialscoreConstants.Relations.CREDITDEPOSITINDENT2CREDENTIALSREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CREDITDEPOSITINDENT2CREDENTIALSREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to credentials. 
	 * @param value the item to add to credentials
	 */
	public void addToCredentials(final SupplierCredentials value)
	{
		addToCredentials( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from credentials. 
	 * @param value the item to remove from credentials
	 */
	public void removeFromCredentials(final SessionContext ctx, final SupplierCredentials value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SuppliercredentialscoreConstants.Relations.CREDITDEPOSITINDENT2CREDENTIALSREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CREDITDEPOSITINDENT2CREDENTIALSREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from credentials. 
	 * @param value the item to remove from credentials
	 */
	public void removeFromCredentials(final SupplierCredentials value)
	{
		removeFromCredentials( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditDepositIndent.date</code> attribute.
	 * @return the date
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditDepositIndent.date</code> attribute.
	 * @return the date
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditDepositIndent.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditDepositIndent.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditDepositIndent.modeOfSecurity</code> attribute.
	 * @return the modeOfSecurity
	 */
	public EnumerationValue getModeOfSecurity(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MODEOFSECURITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditDepositIndent.modeOfSecurity</code> attribute.
	 * @return the modeOfSecurity
	 */
	public EnumerationValue getModeOfSecurity()
	{
		return getModeOfSecurity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditDepositIndent.modeOfSecurity</code> attribute. 
	 * @param value the modeOfSecurity
	 */
	public void setModeOfSecurity(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MODEOFSECURITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditDepositIndent.modeOfSecurity</code> attribute. 
	 * @param value the modeOfSecurity
	 */
	public void setModeOfSecurity(final EnumerationValue value)
	{
		setModeOfSecurity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditDepositIndent.paymentRemark</code> attribute.
	 * @return the paymentRemark
	 */
	public String getPaymentRemark(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PAYMENTREMARK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditDepositIndent.paymentRemark</code> attribute.
	 * @return the paymentRemark
	 */
	public String getPaymentRemark()
	{
		return getPaymentRemark( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditDepositIndent.paymentRemark</code> attribute. 
	 * @param value the paymentRemark
	 */
	public void setPaymentRemark(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PAYMENTREMARK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditDepositIndent.paymentRemark</code> attribute. 
	 * @param value the paymentRemark
	 */
	public void setPaymentRemark(final String value)
	{
		setPaymentRemark( getSession().getSessionContext(), value );
	}
	
}
