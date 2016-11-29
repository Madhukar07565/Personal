/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent;

import com.cnk.travelogix.masterdata.core.products.jalo.FareComponent;
import com.cnk.travelogix.masterdata.core.proucts.jalo.RateCode;
import com.cnk.travelogix.masterdata.core.proucts.jalo.RateType;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import com.cnk.travelogix.supplier.rates.jalo.AbstractSupplierRate;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.PaymentTypeDetails;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractSurchargeSuppDetail;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.UserGroup;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.StandardDateRange;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractRateDefinition AbstractRateDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractRateDefinition extends GenericItem
{
	/** Qualifier of the <code>AbstractRateDefinition.supplierRateType</code> attribute **/
	public static final String SUPPLIERRATETYPE = "supplierRateType";
	/** Qualifier of the <code>AbstractRateDefinition.supplierRateCode</code> attribute **/
	public static final String SUPPLIERRATECODE = "supplierRateCode";
	/** Qualifier of the <code>AbstractRateDefinition.companyType</code> attribute **/
	public static final String COMPANYTYPE = "companyType";
	/** Qualifier of the <code>AbstractRateDefinition.companyRateCode</code> attribute **/
	public static final String COMPANYRATECODE = "companyRateCode";
	/** Qualifier of the <code>AbstractRateDefinition.rateTypeApplicableFor</code> attribute **/
	public static final String RATETYPEAPPLICABLEFOR = "rateTypeApplicableFor";
	/** Qualifier of the <code>AbstractRateDefinition.clientType</code> attribute **/
	public static final String CLIENTTYPE = "clientType";
	/** Qualifier of the <code>AbstractRateDefinition.clientOrClientGroup</code> attribute **/
	public static final String CLIENTORCLIENTGROUP = "clientOrClientGroup";
	/** Qualifier of the <code>AbstractRateDefinition.seasonality</code> attribute **/
	public static final String SEASONALITY = "seasonality";
	/** Qualifier of the <code>AbstractRateDefinition.travelDate</code> attribute **/
	public static final String TRAVELDATE = "travelDate";
	/** Qualifier of the <code>AbstractRateDefinition.net</code> attribute **/
	public static final String NET = "net";
	/** Qualifier of the <code>AbstractRateDefinition.commissionValue</code> attribute **/
	public static final String COMMISSIONVALUE = "commissionValue";
	/** Qualifier of the <code>AbstractRateDefinition.commissionThreshold</code> attribute **/
	public static final String COMMISSIONTHRESHOLD = "commissionThreshold";
	/** Qualifier of the <code>AbstractRateDefinition.surchargeSuppDetails</code> attribute **/
	public static final String SURCHARGESUPPDETAILS = "surchargeSuppDetails";
	/** Qualifier of the <code>AbstractRateDefinition.paymentTypeDetails</code> attribute **/
	public static final String PAYMENTTYPEDETAILS = "paymentTypeDetails";
	/** Qualifier of the <code>AbstractRateDefinition.absSupplierRate</code> attribute **/
	public static final String ABSSUPPLIERRATE = "absSupplierRate";
	/** Qualifier of the <code>AbstractRateDefinition.priceComponent</code> attribute **/
	public static final String PRICECOMPONENT = "priceComponent";
	/** Relation ordering override parameter constants for AbstractRateDefinition2FareComponentRelation from ((supplierratedefinitionscore))*/
	protected static String ABSTRACTRATEDEFINITION2FARECOMPONENTRELATION_SRC_ORDERED = "relation.AbstractRateDefinition2FareComponentRelation.source.ordered";
	protected static String ABSTRACTRATEDEFINITION2FARECOMPONENTRELATION_TGT_ORDERED = "relation.AbstractRateDefinition2FareComponentRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for AbstractRateDefinition2FareComponentRelation from ((supplierratedefinitionscore))*/
	protected static String ABSTRACTRATEDEFINITION2FARECOMPONENTRELATION_MARKMODIFIED = "relation.AbstractRateDefinition2FareComponentRelation.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n SURCHARGESUPPDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AbstractSurchargeSuppDetail> SURCHARGESUPPDETAILSHANDLER = new OneToManyHandler<AbstractSurchargeSuppDetail>(
	SupplierratedefinitionscoreConstants.TC.ABSTRACTSURCHARGESUPPDETAIL,
	true,
	"supplierRate",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PAYMENTTYPEDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PaymentTypeDetails> PAYMENTTYPEDETAILSHANDLER = new OneToManyHandler<PaymentTypeDetails>(
	SupplierratedefinitionscoreConstants.TC.PAYMENTTYPEDETAILS,
	true,
	"rateDefinition",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ABSSUPPLIERRATE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAbstractRateDefinition> ABSSUPPLIERRATEHANDLER = new BidirectionalOneToManyHandler<GeneratedAbstractRateDefinition>(
	SupplierratedefinitionscoreConstants.TC.ABSTRACTRATEDEFINITION,
	false,
	"absSupplierRate",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SUPPLIERRATETYPE, AttributeMode.INITIAL);
		tmp.put(SUPPLIERRATECODE, AttributeMode.INITIAL);
		tmp.put(COMPANYTYPE, AttributeMode.INITIAL);
		tmp.put(COMPANYRATECODE, AttributeMode.INITIAL);
		tmp.put(RATETYPEAPPLICABLEFOR, AttributeMode.INITIAL);
		tmp.put(CLIENTTYPE, AttributeMode.INITIAL);
		tmp.put(CLIENTORCLIENTGROUP, AttributeMode.INITIAL);
		tmp.put(SEASONALITY, AttributeMode.INITIAL);
		tmp.put(TRAVELDATE, AttributeMode.INITIAL);
		tmp.put(NET, AttributeMode.INITIAL);
		tmp.put(COMMISSIONVALUE, AttributeMode.INITIAL);
		tmp.put(COMMISSIONTHRESHOLD, AttributeMode.INITIAL);
		tmp.put(ABSSUPPLIERRATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.absSupplierRate</code> attribute.
	 * @return the absSupplierRate
	 */
	public AbstractSupplierRate getAbsSupplierRate(final SessionContext ctx)
	{
		return (AbstractSupplierRate)getProperty( ctx, ABSSUPPLIERRATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.absSupplierRate</code> attribute.
	 * @return the absSupplierRate
	 */
	public AbstractSupplierRate getAbsSupplierRate()
	{
		return getAbsSupplierRate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.absSupplierRate</code> attribute. 
	 * @param value the absSupplierRate
	 */
	public void setAbsSupplierRate(final SessionContext ctx, final AbstractSupplierRate value)
	{
		ABSSUPPLIERRATEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.absSupplierRate</code> attribute. 
	 * @param value the absSupplierRate
	 */
	public void setAbsSupplierRate(final AbstractSupplierRate value)
	{
		setAbsSupplierRate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.clientOrClientGroup</code> attribute.
	 * @return the clientOrClientGroup
	 */
	public UserGroup getClientOrClientGroup(final SessionContext ctx)
	{
		return (UserGroup)getProperty( ctx, CLIENTORCLIENTGROUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.clientOrClientGroup</code> attribute.
	 * @return the clientOrClientGroup
	 */
	public UserGroup getClientOrClientGroup()
	{
		return getClientOrClientGroup( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.clientOrClientGroup</code> attribute. 
	 * @param value the clientOrClientGroup
	 */
	public void setClientOrClientGroup(final SessionContext ctx, final UserGroup value)
	{
		setProperty(ctx, CLIENTORCLIENTGROUP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.clientOrClientGroup</code> attribute. 
	 * @param value the clientOrClientGroup
	 */
	public void setClientOrClientGroup(final UserGroup value)
	{
		setClientOrClientGroup( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.clientType</code> attribute.
	 * @return the clientType
	 */
	public EnumerationValue getClientType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CLIENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.clientType</code> attribute.
	 * @return the clientType
	 */
	public EnumerationValue getClientType()
	{
		return getClientType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.clientType</code> attribute. 
	 * @param value the clientType
	 */
	public void setClientType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CLIENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.clientType</code> attribute. 
	 * @param value the clientType
	 */
	public void setClientType(final EnumerationValue value)
	{
		setClientType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.commissionThreshold</code> attribute.
	 * @return the commissionThreshold
	 */
	public EnumerationValue getCommissionThreshold(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMMISSIONTHRESHOLD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.commissionThreshold</code> attribute.
	 * @return the commissionThreshold
	 */
	public EnumerationValue getCommissionThreshold()
	{
		return getCommissionThreshold( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.commissionThreshold</code> attribute. 
	 * @param value the commissionThreshold
	 */
	public void setCommissionThreshold(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMMISSIONTHRESHOLD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.commissionThreshold</code> attribute. 
	 * @param value the commissionThreshold
	 */
	public void setCommissionThreshold(final EnumerationValue value)
	{
		setCommissionThreshold( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.commissionValue</code> attribute.
	 * @return the commissionValue
	 */
	public Double getCommissionValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, COMMISSIONVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.commissionValue</code> attribute.
	 * @return the commissionValue
	 */
	public Double getCommissionValue()
	{
		return getCommissionValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.commissionValue</code> attribute. 
	 * @return the commissionValue
	 */
	public double getCommissionValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getCommissionValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.commissionValue</code> attribute. 
	 * @return the commissionValue
	 */
	public double getCommissionValueAsPrimitive()
	{
		return getCommissionValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.commissionValue</code> attribute. 
	 * @param value the commissionValue
	 */
	public void setCommissionValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, COMMISSIONVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.commissionValue</code> attribute. 
	 * @param value the commissionValue
	 */
	public void setCommissionValue(final Double value)
	{
		setCommissionValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.commissionValue</code> attribute. 
	 * @param value the commissionValue
	 */
	public void setCommissionValue(final SessionContext ctx, final double value)
	{
		setCommissionValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.commissionValue</code> attribute. 
	 * @param value the commissionValue
	 */
	public void setCommissionValue(final double value)
	{
		setCommissionValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.companyRateCode</code> attribute.
	 * @return the companyRateCode
	 */
	public RateCode getCompanyRateCode(final SessionContext ctx)
	{
		return (RateCode)getProperty( ctx, COMPANYRATECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.companyRateCode</code> attribute.
	 * @return the companyRateCode
	 */
	public RateCode getCompanyRateCode()
	{
		return getCompanyRateCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.companyRateCode</code> attribute. 
	 * @param value the companyRateCode
	 */
	public void setCompanyRateCode(final SessionContext ctx, final RateCode value)
	{
		setProperty(ctx, COMPANYRATECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.companyRateCode</code> attribute. 
	 * @param value the companyRateCode
	 */
	public void setCompanyRateCode(final RateCode value)
	{
		setCompanyRateCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.companyType</code> attribute.
	 * @return the companyType
	 */
	public RateType getCompanyType(final SessionContext ctx)
	{
		return (RateType)getProperty( ctx, COMPANYTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.companyType</code> attribute.
	 * @return the companyType
	 */
	public RateType getCompanyType()
	{
		return getCompanyType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.companyType</code> attribute. 
	 * @param value the companyType
	 */
	public void setCompanyType(final SessionContext ctx, final RateType value)
	{
		setProperty(ctx, COMPANYTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.companyType</code> attribute. 
	 * @param value the companyType
	 */
	public void setCompanyType(final RateType value)
	{
		setCompanyType( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ABSSUPPLIERRATEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.net</code> attribute.
	 * @return the net
	 */
	public Boolean isNet(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, NET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.net</code> attribute.
	 * @return the net
	 */
	public Boolean isNet()
	{
		return isNet( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.net</code> attribute. 
	 * @return the net
	 */
	public boolean isNetAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isNet( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.net</code> attribute. 
	 * @return the net
	 */
	public boolean isNetAsPrimitive()
	{
		return isNetAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.net</code> attribute. 
	 * @param value the net
	 */
	public void setNet(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, NET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.net</code> attribute. 
	 * @param value the net
	 */
	public void setNet(final Boolean value)
	{
		setNet( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.net</code> attribute. 
	 * @param value the net
	 */
	public void setNet(final SessionContext ctx, final boolean value)
	{
		setNet( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.net</code> attribute. 
	 * @param value the net
	 */
	public void setNet(final boolean value)
	{
		setNet( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.paymentTypeDetails</code> attribute.
	 * @return the paymentTypeDetails
	 */
	public Set<PaymentTypeDetails> getPaymentTypeDetails(final SessionContext ctx)
	{
		return (Set<PaymentTypeDetails>)PAYMENTTYPEDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.paymentTypeDetails</code> attribute.
	 * @return the paymentTypeDetails
	 */
	public Set<PaymentTypeDetails> getPaymentTypeDetails()
	{
		return getPaymentTypeDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.paymentTypeDetails</code> attribute. 
	 * @param value the paymentTypeDetails
	 */
	public void setPaymentTypeDetails(final SessionContext ctx, final Set<PaymentTypeDetails> value)
	{
		PAYMENTTYPEDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.paymentTypeDetails</code> attribute. 
	 * @param value the paymentTypeDetails
	 */
	public void setPaymentTypeDetails(final Set<PaymentTypeDetails> value)
	{
		setPaymentTypeDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to paymentTypeDetails. 
	 * @param value the item to add to paymentTypeDetails
	 */
	public void addToPaymentTypeDetails(final SessionContext ctx, final PaymentTypeDetails value)
	{
		PAYMENTTYPEDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to paymentTypeDetails. 
	 * @param value the item to add to paymentTypeDetails
	 */
	public void addToPaymentTypeDetails(final PaymentTypeDetails value)
	{
		addToPaymentTypeDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from paymentTypeDetails. 
	 * @param value the item to remove from paymentTypeDetails
	 */
	public void removeFromPaymentTypeDetails(final SessionContext ctx, final PaymentTypeDetails value)
	{
		PAYMENTTYPEDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from paymentTypeDetails. 
	 * @param value the item to remove from paymentTypeDetails
	 */
	public void removeFromPaymentTypeDetails(final PaymentTypeDetails value)
	{
		removeFromPaymentTypeDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.priceComponent</code> attribute.
	 * @return the priceComponent
	 */
	public Set<FareComponent> getPriceComponent(final SessionContext ctx)
	{
		final List<FareComponent> items = getLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTRATEDEFINITION2FARECOMPONENTRELATION,
			"FareComponent",
			null,
			false,
			false
		);
		return new LinkedHashSet<FareComponent>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.priceComponent</code> attribute.
	 * @return the priceComponent
	 */
	public Set<FareComponent> getPriceComponent()
	{
		return getPriceComponent( getSession().getSessionContext() );
	}
	
	public long getPriceComponentCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTRATEDEFINITION2FARECOMPONENTRELATION,
			"FareComponent",
			null
		);
	}
	
	public long getPriceComponentCount()
	{
		return getPriceComponentCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.priceComponent</code> attribute. 
	 * @param value the priceComponent
	 */
	public void setPriceComponent(final SessionContext ctx, final Set<FareComponent> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTRATEDEFINITION2FARECOMPONENTRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTRATEDEFINITION2FARECOMPONENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.priceComponent</code> attribute. 
	 * @param value the priceComponent
	 */
	public void setPriceComponent(final Set<FareComponent> value)
	{
		setPriceComponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to priceComponent. 
	 * @param value the item to add to priceComponent
	 */
	public void addToPriceComponent(final SessionContext ctx, final FareComponent value)
	{
		addLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTRATEDEFINITION2FARECOMPONENTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTRATEDEFINITION2FARECOMPONENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to priceComponent. 
	 * @param value the item to add to priceComponent
	 */
	public void addToPriceComponent(final FareComponent value)
	{
		addToPriceComponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from priceComponent. 
	 * @param value the item to remove from priceComponent
	 */
	public void removeFromPriceComponent(final SessionContext ctx, final FareComponent value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTRATEDEFINITION2FARECOMPONENTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTRATEDEFINITION2FARECOMPONENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from priceComponent. 
	 * @param value the item to remove from priceComponent
	 */
	public void removeFromPriceComponent(final FareComponent value)
	{
		removeFromPriceComponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.rateTypeApplicableFor</code> attribute.
	 * @return the rateTypeApplicableFor
	 */
	public EnumerationValue getRateTypeApplicableFor(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RATETYPEAPPLICABLEFOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.rateTypeApplicableFor</code> attribute.
	 * @return the rateTypeApplicableFor
	 */
	public EnumerationValue getRateTypeApplicableFor()
	{
		return getRateTypeApplicableFor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.rateTypeApplicableFor</code> attribute. 
	 * @param value the rateTypeApplicableFor
	 */
	public void setRateTypeApplicableFor(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RATETYPEAPPLICABLEFOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.rateTypeApplicableFor</code> attribute. 
	 * @param value the rateTypeApplicableFor
	 */
	public void setRateTypeApplicableFor(final EnumerationValue value)
	{
		setRateTypeApplicableFor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.seasonality</code> attribute.
	 * @return the seasonality
	 */
	public EnumerationValue getSeasonality(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SEASONALITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.seasonality</code> attribute.
	 * @return the seasonality
	 */
	public EnumerationValue getSeasonality()
	{
		return getSeasonality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.seasonality</code> attribute. 
	 * @param value the seasonality
	 */
	public void setSeasonality(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SEASONALITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.seasonality</code> attribute. 
	 * @param value the seasonality
	 */
	public void setSeasonality(final EnumerationValue value)
	{
		setSeasonality( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.supplierRateCode</code> attribute.
	 * @return the supplierRateCode
	 */
	public RateCode getSupplierRateCode(final SessionContext ctx)
	{
		return (RateCode)getProperty( ctx, SUPPLIERRATECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.supplierRateCode</code> attribute.
	 * @return the supplierRateCode
	 */
	public RateCode getSupplierRateCode()
	{
		return getSupplierRateCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.supplierRateCode</code> attribute. 
	 * @param value the supplierRateCode
	 */
	public void setSupplierRateCode(final SessionContext ctx, final RateCode value)
	{
		setProperty(ctx, SUPPLIERRATECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.supplierRateCode</code> attribute. 
	 * @param value the supplierRateCode
	 */
	public void setSupplierRateCode(final RateCode value)
	{
		setSupplierRateCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.supplierRateType</code> attribute.
	 * @return the supplierRateType
	 */
	public RateType getSupplierRateType(final SessionContext ctx)
	{
		return (RateType)getProperty( ctx, SUPPLIERRATETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.supplierRateType</code> attribute.
	 * @return the supplierRateType
	 */
	public RateType getSupplierRateType()
	{
		return getSupplierRateType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.supplierRateType</code> attribute. 
	 * @param value the supplierRateType
	 */
	public void setSupplierRateType(final SessionContext ctx, final RateType value)
	{
		setProperty(ctx, SUPPLIERRATETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.supplierRateType</code> attribute. 
	 * @param value the supplierRateType
	 */
	public void setSupplierRateType(final RateType value)
	{
		setSupplierRateType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.surchargeSuppDetails</code> attribute.
	 * @return the surchargeSuppDetails
	 */
	public Set<AbstractSurchargeSuppDetail> getSurchargeSuppDetails(final SessionContext ctx)
	{
		return (Set<AbstractSurchargeSuppDetail>)SURCHARGESUPPDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.surchargeSuppDetails</code> attribute.
	 * @return the surchargeSuppDetails
	 */
	public Set<AbstractSurchargeSuppDetail> getSurchargeSuppDetails()
	{
		return getSurchargeSuppDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.surchargeSuppDetails</code> attribute. 
	 * @param value the surchargeSuppDetails
	 */
	public void setSurchargeSuppDetails(final SessionContext ctx, final Set<AbstractSurchargeSuppDetail> value)
	{
		SURCHARGESUPPDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.surchargeSuppDetails</code> attribute. 
	 * @param value the surchargeSuppDetails
	 */
	public void setSurchargeSuppDetails(final Set<AbstractSurchargeSuppDetail> value)
	{
		setSurchargeSuppDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to surchargeSuppDetails. 
	 * @param value the item to add to surchargeSuppDetails
	 */
	public void addToSurchargeSuppDetails(final SessionContext ctx, final AbstractSurchargeSuppDetail value)
	{
		SURCHARGESUPPDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to surchargeSuppDetails. 
	 * @param value the item to add to surchargeSuppDetails
	 */
	public void addToSurchargeSuppDetails(final AbstractSurchargeSuppDetail value)
	{
		addToSurchargeSuppDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from surchargeSuppDetails. 
	 * @param value the item to remove from surchargeSuppDetails
	 */
	public void removeFromSurchargeSuppDetails(final SessionContext ctx, final AbstractSurchargeSuppDetail value)
	{
		SURCHARGESUPPDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from surchargeSuppDetails. 
	 * @param value the item to remove from surchargeSuppDetails
	 */
	public void removeFromSurchargeSuppDetails(final AbstractSurchargeSuppDetail value)
	{
		removeFromSurchargeSuppDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.travelDate</code> attribute.
	 * @return the travelDate
	 */
	public StandardDateRange getTravelDate(final SessionContext ctx)
	{
		return (StandardDateRange)getProperty( ctx, TRAVELDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateDefinition.travelDate</code> attribute.
	 * @return the travelDate
	 */
	public StandardDateRange getTravelDate()
	{
		return getTravelDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.travelDate</code> attribute. 
	 * @param value the travelDate
	 */
	public void setTravelDate(final SessionContext ctx, final StandardDateRange value)
	{
		setProperty(ctx, TRAVELDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateDefinition.travelDate</code> attribute. 
	 * @param value the travelDate
	 */
	public void setTravelDate(final StandardDateRange value)
	{
		setTravelDate( getSession().getSessionContext(), value );
	}
	
}
