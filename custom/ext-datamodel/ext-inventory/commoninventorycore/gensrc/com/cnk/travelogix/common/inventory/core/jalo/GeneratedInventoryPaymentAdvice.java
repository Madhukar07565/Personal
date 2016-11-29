/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.inventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import com.cnk.travelogix.common.inventory.core.jalo.AbstractInventoryDefinition;
import com.cnk.travelogix.common.inventory.core.jalo.PaymentDetailsVmpd;
import com.cnk.travelogix.common.inventory.core.jalo.PaymentInformation;
import com.cnk.travelogix.common.inventory.core.jalo.PrePaymentDetail;
import com.cnk.travelogix.orgstructure.core.jalo.BusinessUnit;
import com.cnk.travelogix.orgstructure.core.jalo.StrategicBusinessUnit;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import de.hybris.platform.catalog.jalo.Company;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.inventory.core.jalo.InventoryPaymentAdvice InventoryPaymentAdvice}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedInventoryPaymentAdvice extends GenericItem
{
	/** Qualifier of the <code>InventoryPaymentAdvice.company</code> attribute **/
	public static final String COMPANY = "company";
	/** Qualifier of the <code>InventoryPaymentAdvice.paymentAdviceNo</code> attribute **/
	public static final String PAYMENTADVICENO = "paymentAdviceNo";
	/** Qualifier of the <code>InventoryPaymentAdvice.paymentAdviceStatus</code> attribute **/
	public static final String PAYMENTADVICESTATUS = "paymentAdviceStatus";
	/** Qualifier of the <code>InventoryPaymentAdvice.inventoryID</code> attribute **/
	public static final String INVENTORYID = "inventoryID";
	/** Qualifier of the <code>InventoryPaymentAdvice.sbu</code> attribute **/
	public static final String SBU = "sbu";
	/** Qualifier of the <code>InventoryPaymentAdvice.bu</code> attribute **/
	public static final String BU = "bu";
	/** Qualifier of the <code>InventoryPaymentAdvice.supplierName</code> attribute **/
	public static final String SUPPLIERNAME = "supplierName";
	/** Qualifier of the <code>InventoryPaymentAdvice.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>InventoryPaymentAdvice.paymentInformation</code> attribute **/
	public static final String PAYMENTINFORMATION = "paymentInformation";
	/** Qualifier of the <code>InventoryPaymentAdvice.contractedFare</code> attribute **/
	public static final String CONTRACTEDFARE = "contractedFare";
	/** Qualifier of the <code>InventoryPaymentAdvice.medias</code> attribute **/
	public static final String MEDIAS = "medias";
	/** Qualifier of the <code>InventoryPaymentAdvice.prePaymentDetails</code> attribute **/
	public static final String PREPAYMENTDETAILS = "prePaymentDetails";
	/** Qualifier of the <code>InventoryPaymentAdvice.vmpdPaymentDetails</code> attribute **/
	public static final String VMPDPAYMENTDETAILS = "vmpdPaymentDetails";
	/**
	* {@link OneToManyHandler} for handling 1:n MEDIAS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Media> MEDIASHANDLER = new OneToManyHandler<Media>(
	CoreConstants.TC.MEDIA,
	true,
	"inventoryPaymentAdvice",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PREPAYMENTDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PrePaymentDetail> PREPAYMENTDETAILSHANDLER = new OneToManyHandler<PrePaymentDetail>(
	CommoninventorycoreConstants.TC.PREPAYMENTDETAIL,
	false,
	"inventoryPaymentAdvice",
	"inventoryPaymentAdvicePOS",
	true,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n VMPDPAYMENTDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PaymentDetailsVmpd> VMPDPAYMENTDETAILSHANDLER = new OneToManyHandler<PaymentDetailsVmpd>(
	CommoninventorycoreConstants.TC.PAYMENTDETAILSVMPD,
	false,
	"inventoryPaymentAdvice",
	"inventoryPaymentAdvicePOS",
	true,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COMPANY, AttributeMode.INITIAL);
		tmp.put(PAYMENTADVICENO, AttributeMode.INITIAL);
		tmp.put(PAYMENTADVICESTATUS, AttributeMode.INITIAL);
		tmp.put(INVENTORYID, AttributeMode.INITIAL);
		tmp.put(SBU, AttributeMode.INITIAL);
		tmp.put(BU, AttributeMode.INITIAL);
		tmp.put(SUPPLIERNAME, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(PAYMENTINFORMATION, AttributeMode.INITIAL);
		tmp.put(CONTRACTEDFARE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryPaymentAdvice.bu</code> attribute.
	 * @return the bu - BU
	 */
	public BusinessUnit getBu(final SessionContext ctx)
	{
		return (BusinessUnit)getProperty( ctx, BU);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryPaymentAdvice.bu</code> attribute.
	 * @return the bu - BU
	 */
	public BusinessUnit getBu()
	{
		return getBu( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryPaymentAdvice.bu</code> attribute. 
	 * @param value the bu - BU
	 */
	public void setBu(final SessionContext ctx, final BusinessUnit value)
	{
		setProperty(ctx, BU,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryPaymentAdvice.bu</code> attribute. 
	 * @param value the bu - BU
	 */
	public void setBu(final BusinessUnit value)
	{
		setBu( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryPaymentAdvice.company</code> attribute.
	 * @return the company - Company
	 */
	public Company getCompany(final SessionContext ctx)
	{
		return (Company)getProperty( ctx, COMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryPaymentAdvice.company</code> attribute.
	 * @return the company - Company
	 */
	public Company getCompany()
	{
		return getCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryPaymentAdvice.company</code> attribute. 
	 * @param value the company - Company
	 */
	public void setCompany(final SessionContext ctx, final Company value)
	{
		setProperty(ctx, COMPANY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryPaymentAdvice.company</code> attribute. 
	 * @param value the company - Company
	 */
	public void setCompany(final Company value)
	{
		setCompany( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryPaymentAdvice.contractedFare</code> attribute.
	 * @return the contractedFare - Contracted Fare
	 */
	public Double getContractedFare(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, CONTRACTEDFARE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryPaymentAdvice.contractedFare</code> attribute.
	 * @return the contractedFare - Contracted Fare
	 */
	public Double getContractedFare()
	{
		return getContractedFare( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryPaymentAdvice.contractedFare</code> attribute. 
	 * @return the contractedFare - Contracted Fare
	 */
	public double getContractedFareAsPrimitive(final SessionContext ctx)
	{
		Double value = getContractedFare( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryPaymentAdvice.contractedFare</code> attribute. 
	 * @return the contractedFare - Contracted Fare
	 */
	public double getContractedFareAsPrimitive()
	{
		return getContractedFareAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryPaymentAdvice.contractedFare</code> attribute. 
	 * @param value the contractedFare - Contracted Fare
	 */
	public void setContractedFare(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, CONTRACTEDFARE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryPaymentAdvice.contractedFare</code> attribute. 
	 * @param value the contractedFare - Contracted Fare
	 */
	public void setContractedFare(final Double value)
	{
		setContractedFare( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryPaymentAdvice.contractedFare</code> attribute. 
	 * @param value the contractedFare - Contracted Fare
	 */
	public void setContractedFare(final SessionContext ctx, final double value)
	{
		setContractedFare( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryPaymentAdvice.contractedFare</code> attribute. 
	 * @param value the contractedFare - Contracted Fare
	 */
	public void setContractedFare(final double value)
	{
		setContractedFare( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryPaymentAdvice.country</code> attribute.
	 * @return the country - Country
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryPaymentAdvice.country</code> attribute.
	 * @return the country - Country
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryPaymentAdvice.country</code> attribute. 
	 * @param value the country - Country
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryPaymentAdvice.country</code> attribute. 
	 * @param value the country - Country
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryPaymentAdvice.inventoryID</code> attribute.
	 * @return the inventoryID - Represents Inventory ID.
	 */
	public AbstractInventoryDefinition getInventoryID(final SessionContext ctx)
	{
		return (AbstractInventoryDefinition)getProperty( ctx, INVENTORYID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryPaymentAdvice.inventoryID</code> attribute.
	 * @return the inventoryID - Represents Inventory ID.
	 */
	public AbstractInventoryDefinition getInventoryID()
	{
		return getInventoryID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryPaymentAdvice.inventoryID</code> attribute. 
	 * @param value the inventoryID - Represents Inventory ID.
	 */
	public void setInventoryID(final SessionContext ctx, final AbstractInventoryDefinition value)
	{
		setProperty(ctx, INVENTORYID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryPaymentAdvice.inventoryID</code> attribute. 
	 * @param value the inventoryID - Represents Inventory ID.
	 */
	public void setInventoryID(final AbstractInventoryDefinition value)
	{
		setInventoryID( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryPaymentAdvice.medias</code> attribute.
	 * @return the medias
	 */
	public Collection<Media> getMedias(final SessionContext ctx)
	{
		return MEDIASHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryPaymentAdvice.medias</code> attribute.
	 * @return the medias
	 */
	public Collection<Media> getMedias()
	{
		return getMedias( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryPaymentAdvice.medias</code> attribute. 
	 * @param value the medias
	 */
	public void setMedias(final SessionContext ctx, final Collection<Media> value)
	{
		MEDIASHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryPaymentAdvice.medias</code> attribute. 
	 * @param value the medias
	 */
	public void setMedias(final Collection<Media> value)
	{
		setMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to medias. 
	 * @param value the item to add to medias
	 */
	public void addToMedias(final SessionContext ctx, final Media value)
	{
		MEDIASHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to medias. 
	 * @param value the item to add to medias
	 */
	public void addToMedias(final Media value)
	{
		addToMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from medias. 
	 * @param value the item to remove from medias
	 */
	public void removeFromMedias(final SessionContext ctx, final Media value)
	{
		MEDIASHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from medias. 
	 * @param value the item to remove from medias
	 */
	public void removeFromMedias(final Media value)
	{
		removeFromMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryPaymentAdvice.paymentAdviceNo</code> attribute.
	 * @return the paymentAdviceNo - To show payment advice no.
	 */
	public String getPaymentAdviceNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PAYMENTADVICENO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryPaymentAdvice.paymentAdviceNo</code> attribute.
	 * @return the paymentAdviceNo - To show payment advice no.
	 */
	public String getPaymentAdviceNo()
	{
		return getPaymentAdviceNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryPaymentAdvice.paymentAdviceNo</code> attribute. 
	 * @param value the paymentAdviceNo - To show payment advice no.
	 */
	public void setPaymentAdviceNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PAYMENTADVICENO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryPaymentAdvice.paymentAdviceNo</code> attribute. 
	 * @param value the paymentAdviceNo - To show payment advice no.
	 */
	public void setPaymentAdviceNo(final String value)
	{
		setPaymentAdviceNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryPaymentAdvice.paymentAdviceStatus</code> attribute.
	 * @return the paymentAdviceStatus - To show payment status.
	 */
	public EnumerationValue getPaymentAdviceStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PAYMENTADVICESTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryPaymentAdvice.paymentAdviceStatus</code> attribute.
	 * @return the paymentAdviceStatus - To show payment status.
	 */
	public EnumerationValue getPaymentAdviceStatus()
	{
		return getPaymentAdviceStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryPaymentAdvice.paymentAdviceStatus</code> attribute. 
	 * @param value the paymentAdviceStatus - To show payment status.
	 */
	public void setPaymentAdviceStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PAYMENTADVICESTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryPaymentAdvice.paymentAdviceStatus</code> attribute. 
	 * @param value the paymentAdviceStatus - To show payment status.
	 */
	public void setPaymentAdviceStatus(final EnumerationValue value)
	{
		setPaymentAdviceStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryPaymentAdvice.paymentInformation</code> attribute.
	 * @return the paymentInformation - Payment Information
	 */
	public PaymentInformation getPaymentInformation(final SessionContext ctx)
	{
		return (PaymentInformation)getProperty( ctx, PAYMENTINFORMATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryPaymentAdvice.paymentInformation</code> attribute.
	 * @return the paymentInformation - Payment Information
	 */
	public PaymentInformation getPaymentInformation()
	{
		return getPaymentInformation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryPaymentAdvice.paymentInformation</code> attribute. 
	 * @param value the paymentInformation - Payment Information
	 */
	public void setPaymentInformation(final SessionContext ctx, final PaymentInformation value)
	{
		setProperty(ctx, PAYMENTINFORMATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryPaymentAdvice.paymentInformation</code> attribute. 
	 * @param value the paymentInformation - Payment Information
	 */
	public void setPaymentInformation(final PaymentInformation value)
	{
		setPaymentInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryPaymentAdvice.prePaymentDetails</code> attribute.
	 * @return the prePaymentDetails
	 */
	public Collection<PrePaymentDetail> getPrePaymentDetails(final SessionContext ctx)
	{
		return PREPAYMENTDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryPaymentAdvice.prePaymentDetails</code> attribute.
	 * @return the prePaymentDetails
	 */
	public Collection<PrePaymentDetail> getPrePaymentDetails()
	{
		return getPrePaymentDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryPaymentAdvice.prePaymentDetails</code> attribute. 
	 * @param value the prePaymentDetails
	 */
	public void setPrePaymentDetails(final SessionContext ctx, final Collection<PrePaymentDetail> value)
	{
		PREPAYMENTDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryPaymentAdvice.prePaymentDetails</code> attribute. 
	 * @param value the prePaymentDetails
	 */
	public void setPrePaymentDetails(final Collection<PrePaymentDetail> value)
	{
		setPrePaymentDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to prePaymentDetails. 
	 * @param value the item to add to prePaymentDetails
	 */
	public void addToPrePaymentDetails(final SessionContext ctx, final PrePaymentDetail value)
	{
		PREPAYMENTDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to prePaymentDetails. 
	 * @param value the item to add to prePaymentDetails
	 */
	public void addToPrePaymentDetails(final PrePaymentDetail value)
	{
		addToPrePaymentDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from prePaymentDetails. 
	 * @param value the item to remove from prePaymentDetails
	 */
	public void removeFromPrePaymentDetails(final SessionContext ctx, final PrePaymentDetail value)
	{
		PREPAYMENTDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from prePaymentDetails. 
	 * @param value the item to remove from prePaymentDetails
	 */
	public void removeFromPrePaymentDetails(final PrePaymentDetail value)
	{
		removeFromPrePaymentDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryPaymentAdvice.sbu</code> attribute.
	 * @return the sbu - SBU
	 */
	public StrategicBusinessUnit getSbu(final SessionContext ctx)
	{
		return (StrategicBusinessUnit)getProperty( ctx, SBU);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryPaymentAdvice.sbu</code> attribute.
	 * @return the sbu - SBU
	 */
	public StrategicBusinessUnit getSbu()
	{
		return getSbu( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryPaymentAdvice.sbu</code> attribute. 
	 * @param value the sbu - SBU
	 */
	public void setSbu(final SessionContext ctx, final StrategicBusinessUnit value)
	{
		setProperty(ctx, SBU,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryPaymentAdvice.sbu</code> attribute. 
	 * @param value the sbu - SBU
	 */
	public void setSbu(final StrategicBusinessUnit value)
	{
		setSbu( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryPaymentAdvice.supplierName</code> attribute.
	 * @return the supplierName - Supplier name
	 */
	public Supplier getSupplierName(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, SUPPLIERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryPaymentAdvice.supplierName</code> attribute.
	 * @return the supplierName - Supplier name
	 */
	public Supplier getSupplierName()
	{
		return getSupplierName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryPaymentAdvice.supplierName</code> attribute. 
	 * @param value the supplierName - Supplier name
	 */
	public void setSupplierName(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, SUPPLIERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryPaymentAdvice.supplierName</code> attribute. 
	 * @param value the supplierName - Supplier name
	 */
	public void setSupplierName(final Supplier value)
	{
		setSupplierName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryPaymentAdvice.vmpdPaymentDetails</code> attribute.
	 * @return the vmpdPaymentDetails
	 */
	public Collection<PaymentDetailsVmpd> getVmpdPaymentDetails(final SessionContext ctx)
	{
		return VMPDPAYMENTDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InventoryPaymentAdvice.vmpdPaymentDetails</code> attribute.
	 * @return the vmpdPaymentDetails
	 */
	public Collection<PaymentDetailsVmpd> getVmpdPaymentDetails()
	{
		return getVmpdPaymentDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryPaymentAdvice.vmpdPaymentDetails</code> attribute. 
	 * @param value the vmpdPaymentDetails
	 */
	public void setVmpdPaymentDetails(final SessionContext ctx, final Collection<PaymentDetailsVmpd> value)
	{
		VMPDPAYMENTDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>InventoryPaymentAdvice.vmpdPaymentDetails</code> attribute. 
	 * @param value the vmpdPaymentDetails
	 */
	public void setVmpdPaymentDetails(final Collection<PaymentDetailsVmpd> value)
	{
		setVmpdPaymentDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to vmpdPaymentDetails. 
	 * @param value the item to add to vmpdPaymentDetails
	 */
	public void addToVmpdPaymentDetails(final SessionContext ctx, final PaymentDetailsVmpd value)
	{
		VMPDPAYMENTDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to vmpdPaymentDetails. 
	 * @param value the item to add to vmpdPaymentDetails
	 */
	public void addToVmpdPaymentDetails(final PaymentDetailsVmpd value)
	{
		addToVmpdPaymentDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from vmpdPaymentDetails. 
	 * @param value the item to remove from vmpdPaymentDetails
	 */
	public void removeFromVmpdPaymentDetails(final SessionContext ctx, final PaymentDetailsVmpd value)
	{
		VMPDPAYMENTDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from vmpdPaymentDetails. 
	 * @param value the item to remove from vmpdPaymentDetails
	 */
	public void removeFromVmpdPaymentDetails(final PaymentDetailsVmpd value)
	{
		removeFromVmpdPaymentDetails( getSession().getSessionContext(), value );
	}
	
}
