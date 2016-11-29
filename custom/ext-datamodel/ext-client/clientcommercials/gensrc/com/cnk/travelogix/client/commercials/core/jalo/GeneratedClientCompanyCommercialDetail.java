/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.commercials.core.jalo;

import com.cnk.travelogix.client.commercials.constants.ClientcommercialsConstants;
import com.cnk.travelogix.client.commercials.core.jalo.BudgetMargin;
import com.cnk.travelogix.company.commercials.core.jalo.AbstractCompanyCommercial;
import com.cnk.travelogix.company.commercials.core.jalo.MarkUpCompanyCommercial;
import com.cnk.travelogix.supplier.commercials.core.jalo.AbstractCommercialDefinition;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.commercials.core.jalo.ClientCompanyCommercialDetail ClientCompanyCommercialDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedClientCompanyCommercialDetail extends GenericItem
{
	/** Qualifier of the <code>ClientCompanyCommercialDetail.commercialId</code> attribute **/
	public static final String COMMERCIALID = "commercialId";
	/** Qualifier of the <code>ClientCompanyCommercialDetail.commercialName</code> attribute **/
	public static final String COMMERCIALNAME = "commercialName";
	/** Qualifier of the <code>ClientCompanyCommercialDetail.byProduct</code> attribute **/
	public static final String BYPRODUCT = "byProduct";
	/** Qualifier of the <code>ClientCompanyCommercialDetail.iscommissionable</code> attribute **/
	public static final String ISCOMMISSIONABLE = "iscommissionable";
	/** Qualifier of the <code>ClientCompanyCommercialDetail.passAllSupplierComm</code> attribute **/
	public static final String PASSALLSUPPLIERCOMM = "passAllSupplierComm";
	/** Qualifier of the <code>ClientCompanyCommercialDetail.supplierName</code> attribute **/
	public static final String SUPPLIERNAME = "supplierName";
	/** Qualifier of the <code>ClientCompanyCommercialDetail.clientNetMarginPercentage</code> attribute **/
	public static final String CLIENTNETMARGINPERCENTAGE = "clientNetMarginPercentage";
	/** Qualifier of the <code>ClientCompanyCommercialDetail.clientNetMarginAmount</code> attribute **/
	public static final String CLIENTNETMARGINAMOUNT = "clientNetMarginAmount";
	/** Qualifier of the <code>ClientCompanyCommercialDetail.markup</code> attribute **/
	public static final String MARKUP = "markup";
	/** Qualifier of the <code>ClientCompanyCommercialDetail.retentionPayable</code> attribute **/
	public static final String RETENTIONPAYABLE = "retentionPayable";
	/** Qualifier of the <code>ClientCompanyCommercialDetail.retentionReceivable</code> attribute **/
	public static final String RETENTIONRECEIVABLE = "retentionReceivable";
	/** Qualifier of the <code>ClientCompanyCommercialDetail.additionalReceivable</code> attribute **/
	public static final String ADDITIONALRECEIVABLE = "additionalReceivable";
	/** Qualifier of the <code>ClientCompanyCommercialDetail.additionalPayable</code> attribute **/
	public static final String ADDITIONALPAYABLE = "additionalPayable";
	/** Qualifier of the <code>ClientCompanyCommercialDetail.supplierCommercial</code> attribute **/
	public static final String SUPPLIERCOMMERCIAL = "supplierCommercial";
	/** Qualifier of the <code>ClientCompanyCommercialDetail.reason</code> attribute **/
	public static final String REASON = "reason";
	/** Qualifier of the <code>ClientCompanyCommercialDetail.remark</code> attribute **/
	public static final String REMARK = "remark";
	/** Qualifier of the <code>ClientCompanyCommercialDetail.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>ClientCompanyCommercialDetail.approvalRequired</code> attribute **/
	public static final String APPROVALREQUIRED = "approvalRequired";
	/** Qualifier of the <code>ClientCompanyCommercialDetail.companyNetMarginPercentage</code> attribute **/
	public static final String COMPANYNETMARGINPERCENTAGE = "companyNetMarginPercentage";
	/** Qualifier of the <code>ClientCompanyCommercialDetail.companyNetMarginAmount</code> attribute **/
	public static final String COMPANYNETMARGINAMOUNT = "companyNetMarginAmount";
	/** Qualifier of the <code>ClientCompanyCommercialDetail.additionalPayables</code> attribute **/
	public static final String ADDITIONALPAYABLES = "additionalPayables";
	/** Qualifier of the <code>ClientCompanyCommercialDetail.additionalReceivables</code> attribute **/
	public static final String ADDITIONALRECEIVABLES = "additionalReceivables";
	/** Qualifier of the <code>ClientCompanyCommercialDetail.retentionPayables</code> attribute **/
	public static final String RETENTIONPAYABLES = "retentionPayables";
	/** Qualifier of the <code>ClientCompanyCommercialDetail.retentionReceivables</code> attribute **/
	public static final String RETENTIONRECEIVABLES = "retentionReceivables";
	/** Qualifier of the <code>ClientCompanyCommercialDetail.markups</code> attribute **/
	public static final String MARKUPS = "markups";
	/** Qualifier of the <code>ClientCompanyCommercialDetail.budgetMargin</code> attribute **/
	public static final String BUDGETMARGIN = "budgetMargin";
	/**
	* {@link OneToManyHandler} for handling 1:n ADDITIONALPAYABLES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AbstractCompanyCommercial> ADDITIONALPAYABLESHANDLER = new OneToManyHandler<AbstractCompanyCommercial>(
	ClientcommercialsConstants.TC.ABSTRACTCOMPANYCOMMERCIAL,
	false,
	"clientCompanyCommercial",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ADDITIONALRECEIVABLES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AbstractCompanyCommercial> ADDITIONALRECEIVABLESHANDLER = new OneToManyHandler<AbstractCompanyCommercial>(
	ClientcommercialsConstants.TC.ABSTRACTCOMPANYCOMMERCIAL,
	false,
	"clientCompanyCommercial",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n RETENTIONPAYABLES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AbstractCompanyCommercial> RETENTIONPAYABLESHANDLER = new OneToManyHandler<AbstractCompanyCommercial>(
	ClientcommercialsConstants.TC.ABSTRACTCOMPANYCOMMERCIAL,
	false,
	"clientCompanyCommercial",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n RETENTIONRECEIVABLES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AbstractCompanyCommercial> RETENTIONRECEIVABLESHANDLER = new OneToManyHandler<AbstractCompanyCommercial>(
	ClientcommercialsConstants.TC.ABSTRACTCOMPANYCOMMERCIAL,
	false,
	"clientCompanyCommercial",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n MARKUPS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<MarkUpCompanyCommercial> MARKUPSHANDLER = new OneToManyHandler<MarkUpCompanyCommercial>(
	ClientcommercialsConstants.TC.MARKUPCOMPANYCOMMERCIAL,
	false,
	"clientCompanyCommercialDetail",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n BUDGETMARGIN's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedClientCompanyCommercialDetail> BUDGETMARGINHANDLER = new BidirectionalOneToManyHandler<GeneratedClientCompanyCommercialDetail>(
	ClientcommercialsConstants.TC.CLIENTCOMPANYCOMMERCIALDETAIL,
	false,
	"budgetMargin",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COMMERCIALID, AttributeMode.INITIAL);
		tmp.put(COMMERCIALNAME, AttributeMode.INITIAL);
		tmp.put(BYPRODUCT, AttributeMode.INITIAL);
		tmp.put(ISCOMMISSIONABLE, AttributeMode.INITIAL);
		tmp.put(PASSALLSUPPLIERCOMM, AttributeMode.INITIAL);
		tmp.put(SUPPLIERNAME, AttributeMode.INITIAL);
		tmp.put(CLIENTNETMARGINPERCENTAGE, AttributeMode.INITIAL);
		tmp.put(CLIENTNETMARGINAMOUNT, AttributeMode.INITIAL);
		tmp.put(MARKUP, AttributeMode.INITIAL);
		tmp.put(RETENTIONPAYABLE, AttributeMode.INITIAL);
		tmp.put(RETENTIONRECEIVABLE, AttributeMode.INITIAL);
		tmp.put(ADDITIONALRECEIVABLE, AttributeMode.INITIAL);
		tmp.put(ADDITIONALPAYABLE, AttributeMode.INITIAL);
		tmp.put(SUPPLIERCOMMERCIAL, AttributeMode.INITIAL);
		tmp.put(REASON, AttributeMode.INITIAL);
		tmp.put(REMARK, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(APPROVALREQUIRED, AttributeMode.INITIAL);
		tmp.put(COMPANYNETMARGINPERCENTAGE, AttributeMode.INITIAL);
		tmp.put(COMPANYNETMARGINAMOUNT, AttributeMode.INITIAL);
		tmp.put(BUDGETMARGIN, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.additionalPayable</code> attribute.
	 * @return the additionalPayable
	 */
	public AbstractCompanyCommercial getAdditionalPayable(final SessionContext ctx)
	{
		return (AbstractCompanyCommercial)getProperty( ctx, ADDITIONALPAYABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.additionalPayable</code> attribute.
	 * @return the additionalPayable
	 */
	public AbstractCompanyCommercial getAdditionalPayable()
	{
		return getAdditionalPayable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.additionalPayable</code> attribute. 
	 * @param value the additionalPayable
	 */
	public void setAdditionalPayable(final SessionContext ctx, final AbstractCompanyCommercial value)
	{
		setProperty(ctx, ADDITIONALPAYABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.additionalPayable</code> attribute. 
	 * @param value the additionalPayable
	 */
	public void setAdditionalPayable(final AbstractCompanyCommercial value)
	{
		setAdditionalPayable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.additionalPayables</code> attribute.
	 * @return the additionalPayables
	 */
	public Collection<AbstractCompanyCommercial> getAdditionalPayables(final SessionContext ctx)
	{
		return ADDITIONALPAYABLESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.additionalPayables</code> attribute.
	 * @return the additionalPayables
	 */
	public Collection<AbstractCompanyCommercial> getAdditionalPayables()
	{
		return getAdditionalPayables( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.additionalPayables</code> attribute. 
	 * @param value the additionalPayables
	 */
	public void setAdditionalPayables(final SessionContext ctx, final Collection<AbstractCompanyCommercial> value)
	{
		ADDITIONALPAYABLESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.additionalPayables</code> attribute. 
	 * @param value the additionalPayables
	 */
	public void setAdditionalPayables(final Collection<AbstractCompanyCommercial> value)
	{
		setAdditionalPayables( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to additionalPayables. 
	 * @param value the item to add to additionalPayables
	 */
	public void addToAdditionalPayables(final SessionContext ctx, final AbstractCompanyCommercial value)
	{
		ADDITIONALPAYABLESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to additionalPayables. 
	 * @param value the item to add to additionalPayables
	 */
	public void addToAdditionalPayables(final AbstractCompanyCommercial value)
	{
		addToAdditionalPayables( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from additionalPayables. 
	 * @param value the item to remove from additionalPayables
	 */
	public void removeFromAdditionalPayables(final SessionContext ctx, final AbstractCompanyCommercial value)
	{
		ADDITIONALPAYABLESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from additionalPayables. 
	 * @param value the item to remove from additionalPayables
	 */
	public void removeFromAdditionalPayables(final AbstractCompanyCommercial value)
	{
		removeFromAdditionalPayables( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.additionalReceivable</code> attribute.
	 * @return the additionalReceivable
	 */
	public AbstractCompanyCommercial getAdditionalReceivable(final SessionContext ctx)
	{
		return (AbstractCompanyCommercial)getProperty( ctx, ADDITIONALRECEIVABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.additionalReceivable</code> attribute.
	 * @return the additionalReceivable
	 */
	public AbstractCompanyCommercial getAdditionalReceivable()
	{
		return getAdditionalReceivable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.additionalReceivable</code> attribute. 
	 * @param value the additionalReceivable
	 */
	public void setAdditionalReceivable(final SessionContext ctx, final AbstractCompanyCommercial value)
	{
		setProperty(ctx, ADDITIONALRECEIVABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.additionalReceivable</code> attribute. 
	 * @param value the additionalReceivable
	 */
	public void setAdditionalReceivable(final AbstractCompanyCommercial value)
	{
		setAdditionalReceivable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.additionalReceivables</code> attribute.
	 * @return the additionalReceivables
	 */
	public Collection<AbstractCompanyCommercial> getAdditionalReceivables(final SessionContext ctx)
	{
		return ADDITIONALRECEIVABLESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.additionalReceivables</code> attribute.
	 * @return the additionalReceivables
	 */
	public Collection<AbstractCompanyCommercial> getAdditionalReceivables()
	{
		return getAdditionalReceivables( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.additionalReceivables</code> attribute. 
	 * @param value the additionalReceivables
	 */
	public void setAdditionalReceivables(final SessionContext ctx, final Collection<AbstractCompanyCommercial> value)
	{
		ADDITIONALRECEIVABLESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.additionalReceivables</code> attribute. 
	 * @param value the additionalReceivables
	 */
	public void setAdditionalReceivables(final Collection<AbstractCompanyCommercial> value)
	{
		setAdditionalReceivables( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to additionalReceivables. 
	 * @param value the item to add to additionalReceivables
	 */
	public void addToAdditionalReceivables(final SessionContext ctx, final AbstractCompanyCommercial value)
	{
		ADDITIONALRECEIVABLESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to additionalReceivables. 
	 * @param value the item to add to additionalReceivables
	 */
	public void addToAdditionalReceivables(final AbstractCompanyCommercial value)
	{
		addToAdditionalReceivables( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from additionalReceivables. 
	 * @param value the item to remove from additionalReceivables
	 */
	public void removeFromAdditionalReceivables(final SessionContext ctx, final AbstractCompanyCommercial value)
	{
		ADDITIONALRECEIVABLESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from additionalReceivables. 
	 * @param value the item to remove from additionalReceivables
	 */
	public void removeFromAdditionalReceivables(final AbstractCompanyCommercial value)
	{
		removeFromAdditionalReceivables( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.approvalRequired</code> attribute.
	 * @return the approvalRequired
	 */
	public Boolean isApprovalRequired(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, APPROVALREQUIRED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.approvalRequired</code> attribute.
	 * @return the approvalRequired
	 */
	public Boolean isApprovalRequired()
	{
		return isApprovalRequired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.approvalRequired</code> attribute. 
	 * @return the approvalRequired
	 */
	public boolean isApprovalRequiredAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isApprovalRequired( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.approvalRequired</code> attribute. 
	 * @return the approvalRequired
	 */
	public boolean isApprovalRequiredAsPrimitive()
	{
		return isApprovalRequiredAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.approvalRequired</code> attribute. 
	 * @param value the approvalRequired
	 */
	public void setApprovalRequired(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, APPROVALREQUIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.approvalRequired</code> attribute. 
	 * @param value the approvalRequired
	 */
	public void setApprovalRequired(final Boolean value)
	{
		setApprovalRequired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.approvalRequired</code> attribute. 
	 * @param value the approvalRequired
	 */
	public void setApprovalRequired(final SessionContext ctx, final boolean value)
	{
		setApprovalRequired( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.approvalRequired</code> attribute. 
	 * @param value the approvalRequired
	 */
	public void setApprovalRequired(final boolean value)
	{
		setApprovalRequired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.budgetMargin</code> attribute.
	 * @return the budgetMargin
	 */
	public BudgetMargin getBudgetMargin(final SessionContext ctx)
	{
		return (BudgetMargin)getProperty( ctx, BUDGETMARGIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.budgetMargin</code> attribute.
	 * @return the budgetMargin
	 */
	public BudgetMargin getBudgetMargin()
	{
		return getBudgetMargin( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.budgetMargin</code> attribute. 
	 * @param value the budgetMargin
	 */
	public void setBudgetMargin(final SessionContext ctx, final BudgetMargin value)
	{
		BUDGETMARGINHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.budgetMargin</code> attribute. 
	 * @param value the budgetMargin
	 */
	public void setBudgetMargin(final BudgetMargin value)
	{
		setBudgetMargin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.byProduct</code> attribute.
	 * @return the byProduct
	 */
	public Boolean isByProduct(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, BYPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.byProduct</code> attribute.
	 * @return the byProduct
	 */
	public Boolean isByProduct()
	{
		return isByProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.byProduct</code> attribute. 
	 * @return the byProduct
	 */
	public boolean isByProductAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isByProduct( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.byProduct</code> attribute. 
	 * @return the byProduct
	 */
	public boolean isByProductAsPrimitive()
	{
		return isByProductAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.byProduct</code> attribute. 
	 * @param value the byProduct
	 */
	public void setByProduct(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, BYPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.byProduct</code> attribute. 
	 * @param value the byProduct
	 */
	public void setByProduct(final Boolean value)
	{
		setByProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.byProduct</code> attribute. 
	 * @param value the byProduct
	 */
	public void setByProduct(final SessionContext ctx, final boolean value)
	{
		setByProduct( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.byProduct</code> attribute. 
	 * @param value the byProduct
	 */
	public void setByProduct(final boolean value)
	{
		setByProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.clientNetMarginAmount</code> attribute.
	 * @return the clientNetMarginAmount
	 */
	public Double getClientNetMarginAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, CLIENTNETMARGINAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.clientNetMarginAmount</code> attribute.
	 * @return the clientNetMarginAmount
	 */
	public Double getClientNetMarginAmount()
	{
		return getClientNetMarginAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.clientNetMarginAmount</code> attribute. 
	 * @return the clientNetMarginAmount
	 */
	public double getClientNetMarginAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getClientNetMarginAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.clientNetMarginAmount</code> attribute. 
	 * @return the clientNetMarginAmount
	 */
	public double getClientNetMarginAmountAsPrimitive()
	{
		return getClientNetMarginAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.clientNetMarginAmount</code> attribute. 
	 * @param value the clientNetMarginAmount
	 */
	public void setClientNetMarginAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, CLIENTNETMARGINAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.clientNetMarginAmount</code> attribute. 
	 * @param value the clientNetMarginAmount
	 */
	public void setClientNetMarginAmount(final Double value)
	{
		setClientNetMarginAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.clientNetMarginAmount</code> attribute. 
	 * @param value the clientNetMarginAmount
	 */
	public void setClientNetMarginAmount(final SessionContext ctx, final double value)
	{
		setClientNetMarginAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.clientNetMarginAmount</code> attribute. 
	 * @param value the clientNetMarginAmount
	 */
	public void setClientNetMarginAmount(final double value)
	{
		setClientNetMarginAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.clientNetMarginPercentage</code> attribute.
	 * @return the clientNetMarginPercentage
	 */
	public Double getClientNetMarginPercentage(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, CLIENTNETMARGINPERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.clientNetMarginPercentage</code> attribute.
	 * @return the clientNetMarginPercentage
	 */
	public Double getClientNetMarginPercentage()
	{
		return getClientNetMarginPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.clientNetMarginPercentage</code> attribute. 
	 * @return the clientNetMarginPercentage
	 */
	public double getClientNetMarginPercentageAsPrimitive(final SessionContext ctx)
	{
		Double value = getClientNetMarginPercentage( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.clientNetMarginPercentage</code> attribute. 
	 * @return the clientNetMarginPercentage
	 */
	public double getClientNetMarginPercentageAsPrimitive()
	{
		return getClientNetMarginPercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.clientNetMarginPercentage</code> attribute. 
	 * @param value the clientNetMarginPercentage
	 */
	public void setClientNetMarginPercentage(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, CLIENTNETMARGINPERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.clientNetMarginPercentage</code> attribute. 
	 * @param value the clientNetMarginPercentage
	 */
	public void setClientNetMarginPercentage(final Double value)
	{
		setClientNetMarginPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.clientNetMarginPercentage</code> attribute. 
	 * @param value the clientNetMarginPercentage
	 */
	public void setClientNetMarginPercentage(final SessionContext ctx, final double value)
	{
		setClientNetMarginPercentage( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.clientNetMarginPercentage</code> attribute. 
	 * @param value the clientNetMarginPercentage
	 */
	public void setClientNetMarginPercentage(final double value)
	{
		setClientNetMarginPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.commercialId</code> attribute.
	 * @return the commercialId
	 */
	public String getCommercialId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMMERCIALID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.commercialId</code> attribute.
	 * @return the commercialId
	 */
	public String getCommercialId()
	{
		return getCommercialId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.commercialId</code> attribute. 
	 * @param value the commercialId
	 */
	public void setCommercialId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMMERCIALID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.commercialId</code> attribute. 
	 * @param value the commercialId
	 */
	public void setCommercialId(final String value)
	{
		setCommercialId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.commercialName</code> attribute.
	 * @return the commercialName
	 */
	public String getCommercialName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMMERCIALNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.commercialName</code> attribute.
	 * @return the commercialName
	 */
	public String getCommercialName()
	{
		return getCommercialName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.commercialName</code> attribute. 
	 * @param value the commercialName
	 */
	public void setCommercialName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMMERCIALNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.commercialName</code> attribute. 
	 * @param value the commercialName
	 */
	public void setCommercialName(final String value)
	{
		setCommercialName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.companyNetMarginAmount</code> attribute.
	 * @return the companyNetMarginAmount
	 */
	public Double getCompanyNetMarginAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, COMPANYNETMARGINAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.companyNetMarginAmount</code> attribute.
	 * @return the companyNetMarginAmount
	 */
	public Double getCompanyNetMarginAmount()
	{
		return getCompanyNetMarginAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.companyNetMarginAmount</code> attribute. 
	 * @return the companyNetMarginAmount
	 */
	public double getCompanyNetMarginAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getCompanyNetMarginAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.companyNetMarginAmount</code> attribute. 
	 * @return the companyNetMarginAmount
	 */
	public double getCompanyNetMarginAmountAsPrimitive()
	{
		return getCompanyNetMarginAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.companyNetMarginAmount</code> attribute. 
	 * @param value the companyNetMarginAmount
	 */
	public void setCompanyNetMarginAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, COMPANYNETMARGINAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.companyNetMarginAmount</code> attribute. 
	 * @param value the companyNetMarginAmount
	 */
	public void setCompanyNetMarginAmount(final Double value)
	{
		setCompanyNetMarginAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.companyNetMarginAmount</code> attribute. 
	 * @param value the companyNetMarginAmount
	 */
	public void setCompanyNetMarginAmount(final SessionContext ctx, final double value)
	{
		setCompanyNetMarginAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.companyNetMarginAmount</code> attribute. 
	 * @param value the companyNetMarginAmount
	 */
	public void setCompanyNetMarginAmount(final double value)
	{
		setCompanyNetMarginAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.companyNetMarginPercentage</code> attribute.
	 * @return the companyNetMarginPercentage
	 */
	public Double getCompanyNetMarginPercentage(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, COMPANYNETMARGINPERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.companyNetMarginPercentage</code> attribute.
	 * @return the companyNetMarginPercentage
	 */
	public Double getCompanyNetMarginPercentage()
	{
		return getCompanyNetMarginPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.companyNetMarginPercentage</code> attribute. 
	 * @return the companyNetMarginPercentage
	 */
	public double getCompanyNetMarginPercentageAsPrimitive(final SessionContext ctx)
	{
		Double value = getCompanyNetMarginPercentage( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.companyNetMarginPercentage</code> attribute. 
	 * @return the companyNetMarginPercentage
	 */
	public double getCompanyNetMarginPercentageAsPrimitive()
	{
		return getCompanyNetMarginPercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.companyNetMarginPercentage</code> attribute. 
	 * @param value the companyNetMarginPercentage
	 */
	public void setCompanyNetMarginPercentage(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, COMPANYNETMARGINPERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.companyNetMarginPercentage</code> attribute. 
	 * @param value the companyNetMarginPercentage
	 */
	public void setCompanyNetMarginPercentage(final Double value)
	{
		setCompanyNetMarginPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.companyNetMarginPercentage</code> attribute. 
	 * @param value the companyNetMarginPercentage
	 */
	public void setCompanyNetMarginPercentage(final SessionContext ctx, final double value)
	{
		setCompanyNetMarginPercentage( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.companyNetMarginPercentage</code> attribute. 
	 * @param value the companyNetMarginPercentage
	 */
	public void setCompanyNetMarginPercentage(final double value)
	{
		setCompanyNetMarginPercentage( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		BUDGETMARGINHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.iscommissionable</code> attribute.
	 * @return the iscommissionable
	 */
	public Boolean isIscommissionable(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISCOMMISSIONABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.iscommissionable</code> attribute.
	 * @return the iscommissionable
	 */
	public Boolean isIscommissionable()
	{
		return isIscommissionable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.iscommissionable</code> attribute. 
	 * @return the iscommissionable
	 */
	public boolean isIscommissionableAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIscommissionable( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.iscommissionable</code> attribute. 
	 * @return the iscommissionable
	 */
	public boolean isIscommissionableAsPrimitive()
	{
		return isIscommissionableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.iscommissionable</code> attribute. 
	 * @param value the iscommissionable
	 */
	public void setIscommissionable(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISCOMMISSIONABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.iscommissionable</code> attribute. 
	 * @param value the iscommissionable
	 */
	public void setIscommissionable(final Boolean value)
	{
		setIscommissionable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.iscommissionable</code> attribute. 
	 * @param value the iscommissionable
	 */
	public void setIscommissionable(final SessionContext ctx, final boolean value)
	{
		setIscommissionable( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.iscommissionable</code> attribute. 
	 * @param value the iscommissionable
	 */
	public void setIscommissionable(final boolean value)
	{
		setIscommissionable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.markup</code> attribute.
	 * @return the markup
	 */
	public MarkUpCompanyCommercial getMarkup(final SessionContext ctx)
	{
		return (MarkUpCompanyCommercial)getProperty( ctx, MARKUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.markup</code> attribute.
	 * @return the markup
	 */
	public MarkUpCompanyCommercial getMarkup()
	{
		return getMarkup( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.markup</code> attribute. 
	 * @param value the markup
	 */
	public void setMarkup(final SessionContext ctx, final MarkUpCompanyCommercial value)
	{
		setProperty(ctx, MARKUP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.markup</code> attribute. 
	 * @param value the markup
	 */
	public void setMarkup(final MarkUpCompanyCommercial value)
	{
		setMarkup( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.markups</code> attribute.
	 * @return the markups
	 */
	public Collection<MarkUpCompanyCommercial> getMarkups(final SessionContext ctx)
	{
		return MARKUPSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.markups</code> attribute.
	 * @return the markups
	 */
	public Collection<MarkUpCompanyCommercial> getMarkups()
	{
		return getMarkups( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.markups</code> attribute. 
	 * @param value the markups
	 */
	public void setMarkups(final SessionContext ctx, final Collection<MarkUpCompanyCommercial> value)
	{
		MARKUPSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.markups</code> attribute. 
	 * @param value the markups
	 */
	public void setMarkups(final Collection<MarkUpCompanyCommercial> value)
	{
		setMarkups( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to markups. 
	 * @param value the item to add to markups
	 */
	public void addToMarkups(final SessionContext ctx, final MarkUpCompanyCommercial value)
	{
		MARKUPSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to markups. 
	 * @param value the item to add to markups
	 */
	public void addToMarkups(final MarkUpCompanyCommercial value)
	{
		addToMarkups( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from markups. 
	 * @param value the item to remove from markups
	 */
	public void removeFromMarkups(final SessionContext ctx, final MarkUpCompanyCommercial value)
	{
		MARKUPSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from markups. 
	 * @param value the item to remove from markups
	 */
	public void removeFromMarkups(final MarkUpCompanyCommercial value)
	{
		removeFromMarkups( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.passAllSupplierComm</code> attribute.
	 * @return the passAllSupplierComm
	 */
	public Boolean isPassAllSupplierComm(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PASSALLSUPPLIERCOMM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.passAllSupplierComm</code> attribute.
	 * @return the passAllSupplierComm
	 */
	public Boolean isPassAllSupplierComm()
	{
		return isPassAllSupplierComm( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.passAllSupplierComm</code> attribute. 
	 * @return the passAllSupplierComm
	 */
	public boolean isPassAllSupplierCommAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPassAllSupplierComm( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.passAllSupplierComm</code> attribute. 
	 * @return the passAllSupplierComm
	 */
	public boolean isPassAllSupplierCommAsPrimitive()
	{
		return isPassAllSupplierCommAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.passAllSupplierComm</code> attribute. 
	 * @param value the passAllSupplierComm
	 */
	public void setPassAllSupplierComm(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PASSALLSUPPLIERCOMM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.passAllSupplierComm</code> attribute. 
	 * @param value the passAllSupplierComm
	 */
	public void setPassAllSupplierComm(final Boolean value)
	{
		setPassAllSupplierComm( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.passAllSupplierComm</code> attribute. 
	 * @param value the passAllSupplierComm
	 */
	public void setPassAllSupplierComm(final SessionContext ctx, final boolean value)
	{
		setPassAllSupplierComm( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.passAllSupplierComm</code> attribute. 
	 * @param value the passAllSupplierComm
	 */
	public void setPassAllSupplierComm(final boolean value)
	{
		setPassAllSupplierComm( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.reason</code> attribute.
	 * @return the reason
	 */
	public String getReason(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedClientCompanyCommercialDetail.getReason requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, REASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.reason</code> attribute.
	 * @return the reason
	 */
	public String getReason()
	{
		return getReason( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.reason</code> attribute. 
	 * @return the localized reason
	 */
	public Map<Language,String> getAllReason(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,REASON,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.reason</code> attribute. 
	 * @return the localized reason
	 */
	public Map<Language,String> getAllReason()
	{
		return getAllReason( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.reason</code> attribute. 
	 * @param value the reason
	 */
	public void setReason(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedClientCompanyCommercialDetail.setReason requires a session language", 0 );
		}
		setLocalizedProperty(ctx, REASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.reason</code> attribute. 
	 * @param value the reason
	 */
	public void setReason(final String value)
	{
		setReason( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.reason</code> attribute. 
	 * @param value the reason
	 */
	public void setAllReason(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,REASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.reason</code> attribute. 
	 * @param value the reason
	 */
	public void setAllReason(final Map<Language,String> value)
	{
		setAllReason( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.remark</code> attribute.
	 * @return the remark
	 */
	public String getRemark(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REMARK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.remark</code> attribute.
	 * @return the remark
	 */
	public String getRemark()
	{
		return getRemark( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.remark</code> attribute. 
	 * @param value the remark
	 */
	public void setRemark(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REMARK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.remark</code> attribute. 
	 * @param value the remark
	 */
	public void setRemark(final String value)
	{
		setRemark( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.retentionPayable</code> attribute.
	 * @return the retentionPayable
	 */
	public AbstractCompanyCommercial getRetentionPayable(final SessionContext ctx)
	{
		return (AbstractCompanyCommercial)getProperty( ctx, RETENTIONPAYABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.retentionPayable</code> attribute.
	 * @return the retentionPayable
	 */
	public AbstractCompanyCommercial getRetentionPayable()
	{
		return getRetentionPayable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.retentionPayable</code> attribute. 
	 * @param value the retentionPayable
	 */
	public void setRetentionPayable(final SessionContext ctx, final AbstractCompanyCommercial value)
	{
		setProperty(ctx, RETENTIONPAYABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.retentionPayable</code> attribute. 
	 * @param value the retentionPayable
	 */
	public void setRetentionPayable(final AbstractCompanyCommercial value)
	{
		setRetentionPayable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.retentionPayables</code> attribute.
	 * @return the retentionPayables
	 */
	public Collection<AbstractCompanyCommercial> getRetentionPayables(final SessionContext ctx)
	{
		return RETENTIONPAYABLESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.retentionPayables</code> attribute.
	 * @return the retentionPayables
	 */
	public Collection<AbstractCompanyCommercial> getRetentionPayables()
	{
		return getRetentionPayables( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.retentionPayables</code> attribute. 
	 * @param value the retentionPayables
	 */
	public void setRetentionPayables(final SessionContext ctx, final Collection<AbstractCompanyCommercial> value)
	{
		RETENTIONPAYABLESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.retentionPayables</code> attribute. 
	 * @param value the retentionPayables
	 */
	public void setRetentionPayables(final Collection<AbstractCompanyCommercial> value)
	{
		setRetentionPayables( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to retentionPayables. 
	 * @param value the item to add to retentionPayables
	 */
	public void addToRetentionPayables(final SessionContext ctx, final AbstractCompanyCommercial value)
	{
		RETENTIONPAYABLESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to retentionPayables. 
	 * @param value the item to add to retentionPayables
	 */
	public void addToRetentionPayables(final AbstractCompanyCommercial value)
	{
		addToRetentionPayables( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from retentionPayables. 
	 * @param value the item to remove from retentionPayables
	 */
	public void removeFromRetentionPayables(final SessionContext ctx, final AbstractCompanyCommercial value)
	{
		RETENTIONPAYABLESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from retentionPayables. 
	 * @param value the item to remove from retentionPayables
	 */
	public void removeFromRetentionPayables(final AbstractCompanyCommercial value)
	{
		removeFromRetentionPayables( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.retentionReceivable</code> attribute.
	 * @return the retentionReceivable
	 */
	public AbstractCompanyCommercial getRetentionReceivable(final SessionContext ctx)
	{
		return (AbstractCompanyCommercial)getProperty( ctx, RETENTIONRECEIVABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.retentionReceivable</code> attribute.
	 * @return the retentionReceivable
	 */
	public AbstractCompanyCommercial getRetentionReceivable()
	{
		return getRetentionReceivable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.retentionReceivable</code> attribute. 
	 * @param value the retentionReceivable
	 */
	public void setRetentionReceivable(final SessionContext ctx, final AbstractCompanyCommercial value)
	{
		setProperty(ctx, RETENTIONRECEIVABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.retentionReceivable</code> attribute. 
	 * @param value the retentionReceivable
	 */
	public void setRetentionReceivable(final AbstractCompanyCommercial value)
	{
		setRetentionReceivable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.retentionReceivables</code> attribute.
	 * @return the retentionReceivables
	 */
	public Collection<AbstractCompanyCommercial> getRetentionReceivables(final SessionContext ctx)
	{
		return RETENTIONRECEIVABLESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.retentionReceivables</code> attribute.
	 * @return the retentionReceivables
	 */
	public Collection<AbstractCompanyCommercial> getRetentionReceivables()
	{
		return getRetentionReceivables( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.retentionReceivables</code> attribute. 
	 * @param value the retentionReceivables
	 */
	public void setRetentionReceivables(final SessionContext ctx, final Collection<AbstractCompanyCommercial> value)
	{
		RETENTIONRECEIVABLESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.retentionReceivables</code> attribute. 
	 * @param value the retentionReceivables
	 */
	public void setRetentionReceivables(final Collection<AbstractCompanyCommercial> value)
	{
		setRetentionReceivables( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to retentionReceivables. 
	 * @param value the item to add to retentionReceivables
	 */
	public void addToRetentionReceivables(final SessionContext ctx, final AbstractCompanyCommercial value)
	{
		RETENTIONRECEIVABLESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to retentionReceivables. 
	 * @param value the item to add to retentionReceivables
	 */
	public void addToRetentionReceivables(final AbstractCompanyCommercial value)
	{
		addToRetentionReceivables( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from retentionReceivables. 
	 * @param value the item to remove from retentionReceivables
	 */
	public void removeFromRetentionReceivables(final SessionContext ctx, final AbstractCompanyCommercial value)
	{
		RETENTIONRECEIVABLESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from retentionReceivables. 
	 * @param value the item to remove from retentionReceivables
	 */
	public void removeFromRetentionReceivables(final AbstractCompanyCommercial value)
	{
		removeFromRetentionReceivables( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final EnumerationValue value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.supplierCommercial</code> attribute.
	 * @return the supplierCommercial
	 */
	public AbstractCommercialDefinition getSupplierCommercial(final SessionContext ctx)
	{
		return (AbstractCommercialDefinition)getProperty( ctx, SUPPLIERCOMMERCIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.supplierCommercial</code> attribute.
	 * @return the supplierCommercial
	 */
	public AbstractCommercialDefinition getSupplierCommercial()
	{
		return getSupplierCommercial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.supplierCommercial</code> attribute. 
	 * @param value the supplierCommercial
	 */
	public void setSupplierCommercial(final SessionContext ctx, final AbstractCommercialDefinition value)
	{
		setProperty(ctx, SUPPLIERCOMMERCIAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.supplierCommercial</code> attribute. 
	 * @param value the supplierCommercial
	 */
	public void setSupplierCommercial(final AbstractCommercialDefinition value)
	{
		setSupplierCommercial( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.supplierName</code> attribute.
	 * @return the supplierName
	 */
	public Supplier getSupplierName(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, SUPPLIERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCompanyCommercialDetail.supplierName</code> attribute.
	 * @return the supplierName
	 */
	public Supplier getSupplierName()
	{
		return getSupplierName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.supplierName</code> attribute. 
	 * @param value the supplierName
	 */
	public void setSupplierName(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, SUPPLIERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCompanyCommercialDetail.supplierName</code> attribute. 
	 * @param value the supplierName
	 */
	public void setSupplierName(final Supplier value)
	{
		setSupplierName( getSession().getSessionContext(), value );
	}
	
}
