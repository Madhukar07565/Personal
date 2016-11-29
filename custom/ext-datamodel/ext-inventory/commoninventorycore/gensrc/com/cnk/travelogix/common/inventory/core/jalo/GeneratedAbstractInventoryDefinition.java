/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.inventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.PaymentSchedule;
import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import com.cnk.travelogix.common.inventory.core.jalo.AssociatedCompanies;
import com.cnk.travelogix.common.inventory.core.jalo.NamingListCutOffs;
import com.cnk.travelogix.common.inventory.jalo.AbstractInventoryRequest;
import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.inventory.core.jalo.AbstractInventoryDefinition AbstractInventoryDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractInventoryDefinition extends AbstractTravelogixItem
{
	/** Qualifier of the <code>AbstractInventoryDefinition.supplier</code> attribute **/
	public static final String SUPPLIER = "supplier";
	/** Qualifier of the <code>AbstractInventoryDefinition.productCategorySubtype</code> attribute **/
	public static final String PRODUCTCATEGORYSUBTYPE = "productCategorySubtype";
	/** Qualifier of the <code>AbstractInventoryDefinition.inventoryType</code> attribute **/
	public static final String INVENTORYTYPE = "inventoryType";
	/** Qualifier of the <code>AbstractInventoryDefinition.excelUpload</code> attribute **/
	public static final String EXCELUPLOAD = "excelUpload";
	/** Qualifier of the <code>AbstractInventoryDefinition.bulkUpload</code> attribute **/
	public static final String BULKUPLOAD = "bulkUpload";
	/** Qualifier of the <code>AbstractInventoryDefinition.companies</code> attribute **/
	public static final String COMPANIES = "companies";
	/** Qualifier of the <code>AbstractInventoryDefinition.paymentSchedules</code> attribute **/
	public static final String PAYMENTSCHEDULES = "paymentSchedules";
	/** Qualifier of the <code>AbstractInventoryDefinition.inventoryRequest</code> attribute **/
	public static final String INVENTORYREQUEST = "inventoryRequest";
	/** Qualifier of the <code>AbstractInventoryDefinition.listCutOffs</code> attribute **/
	public static final String LISTCUTOFFS = "listCutOffs";
	/** Qualifier of the <code>AbstractInventoryDefinition.medias</code> attribute **/
	public static final String MEDIAS = "medias";
	/**
	* {@link OneToManyHandler} for handling 1:n COMPANIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AssociatedCompanies> COMPANIESHANDLER = new OneToManyHandler<AssociatedCompanies>(
	CommoninventorycoreConstants.TC.ASSOCIATEDCOMPANIES,
	false,
	"abstractInventoryDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PAYMENTSCHEDULES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PaymentSchedule> PAYMENTSCHEDULESHANDLER = new OneToManyHandler<PaymentSchedule>(
	CommoninventorycoreConstants.TC.PAYMENTSCHEDULE,
	false,
	"abstractInventoryDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n INVENTORYREQUEST's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAbstractInventoryDefinition> INVENTORYREQUESTHANDLER = new BidirectionalOneToManyHandler<GeneratedAbstractInventoryDefinition>(
	CommoninventorycoreConstants.TC.ABSTRACTINVENTORYDEFINITION,
	false,
	"inventoryRequest",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n LISTCUTOFFS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<NamingListCutOffs> LISTCUTOFFSHANDLER = new OneToManyHandler<NamingListCutOffs>(
	CommoninventorycoreConstants.TC.NAMINGLISTCUTOFFS,
	false,
	"abstractInventoryDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n MEDIAS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Media> MEDIASHANDLER = new OneToManyHandler<Media>(
	CoreConstants.TC.MEDIA,
	false,
	"abstractInventoryDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SUPPLIER, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORYSUBTYPE, AttributeMode.INITIAL);
		tmp.put(INVENTORYTYPE, AttributeMode.INITIAL);
		tmp.put(EXCELUPLOAD, AttributeMode.INITIAL);
		tmp.put(BULKUPLOAD, AttributeMode.INITIAL);
		tmp.put(INVENTORYREQUEST, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDefinition.bulkUpload</code> attribute.
	 * @return the bulkUpload - Bulk Upload
	 */
	public Boolean isBulkUpload(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, BULKUPLOAD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDefinition.bulkUpload</code> attribute.
	 * @return the bulkUpload - Bulk Upload
	 */
	public Boolean isBulkUpload()
	{
		return isBulkUpload( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDefinition.bulkUpload</code> attribute. 
	 * @return the bulkUpload - Bulk Upload
	 */
	public boolean isBulkUploadAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isBulkUpload( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDefinition.bulkUpload</code> attribute. 
	 * @return the bulkUpload - Bulk Upload
	 */
	public boolean isBulkUploadAsPrimitive()
	{
		return isBulkUploadAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDefinition.bulkUpload</code> attribute. 
	 * @param value the bulkUpload - Bulk Upload
	 */
	public void setBulkUpload(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, BULKUPLOAD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDefinition.bulkUpload</code> attribute. 
	 * @param value the bulkUpload - Bulk Upload
	 */
	public void setBulkUpload(final Boolean value)
	{
		setBulkUpload( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDefinition.bulkUpload</code> attribute. 
	 * @param value the bulkUpload - Bulk Upload
	 */
	public void setBulkUpload(final SessionContext ctx, final boolean value)
	{
		setBulkUpload( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDefinition.bulkUpload</code> attribute. 
	 * @param value the bulkUpload - Bulk Upload
	 */
	public void setBulkUpload(final boolean value)
	{
		setBulkUpload( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDefinition.companies</code> attribute.
	 * @return the companies
	 */
	public Collection<AssociatedCompanies> getCompanies(final SessionContext ctx)
	{
		return COMPANIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDefinition.companies</code> attribute.
	 * @return the companies
	 */
	public Collection<AssociatedCompanies> getCompanies()
	{
		return getCompanies( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDefinition.companies</code> attribute. 
	 * @param value the companies
	 */
	public void setCompanies(final SessionContext ctx, final Collection<AssociatedCompanies> value)
	{
		COMPANIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDefinition.companies</code> attribute. 
	 * @param value the companies
	 */
	public void setCompanies(final Collection<AssociatedCompanies> value)
	{
		setCompanies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to companies. 
	 * @param value the item to add to companies
	 */
	public void addToCompanies(final SessionContext ctx, final AssociatedCompanies value)
	{
		COMPANIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to companies. 
	 * @param value the item to add to companies
	 */
	public void addToCompanies(final AssociatedCompanies value)
	{
		addToCompanies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from companies. 
	 * @param value the item to remove from companies
	 */
	public void removeFromCompanies(final SessionContext ctx, final AssociatedCompanies value)
	{
		COMPANIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from companies. 
	 * @param value the item to remove from companies
	 */
	public void removeFromCompanies(final AssociatedCompanies value)
	{
		removeFromCompanies( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		INVENTORYREQUESTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDefinition.excelUpload</code> attribute.
	 * @return the excelUpload - Excel Upload
	 */
	public Media getExcelUpload(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, EXCELUPLOAD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDefinition.excelUpload</code> attribute.
	 * @return the excelUpload - Excel Upload
	 */
	public Media getExcelUpload()
	{
		return getExcelUpload( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDefinition.excelUpload</code> attribute. 
	 * @param value the excelUpload - Excel Upload
	 */
	public void setExcelUpload(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, EXCELUPLOAD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDefinition.excelUpload</code> attribute. 
	 * @param value the excelUpload - Excel Upload
	 */
	public void setExcelUpload(final Media value)
	{
		setExcelUpload( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDefinition.inventoryRequest</code> attribute.
	 * @return the inventoryRequest
	 */
	public AbstractInventoryRequest getInventoryRequest(final SessionContext ctx)
	{
		return (AbstractInventoryRequest)getProperty( ctx, INVENTORYREQUEST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDefinition.inventoryRequest</code> attribute.
	 * @return the inventoryRequest
	 */
	public AbstractInventoryRequest getInventoryRequest()
	{
		return getInventoryRequest( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDefinition.inventoryRequest</code> attribute. 
	 * @param value the inventoryRequest
	 */
	public void setInventoryRequest(final SessionContext ctx, final AbstractInventoryRequest value)
	{
		INVENTORYREQUESTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDefinition.inventoryRequest</code> attribute. 
	 * @param value the inventoryRequest
	 */
	public void setInventoryRequest(final AbstractInventoryRequest value)
	{
		setInventoryRequest( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDefinition.inventoryType</code> attribute.
	 * @return the inventoryType - Inventory Type
	 */
	public EnumerationValue getInventoryType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, INVENTORYTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDefinition.inventoryType</code> attribute.
	 * @return the inventoryType - Inventory Type
	 */
	public EnumerationValue getInventoryType()
	{
		return getInventoryType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDefinition.inventoryType</code> attribute. 
	 * @param value the inventoryType - Inventory Type
	 */
	public void setInventoryType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, INVENTORYTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDefinition.inventoryType</code> attribute. 
	 * @param value the inventoryType - Inventory Type
	 */
	public void setInventoryType(final EnumerationValue value)
	{
		setInventoryType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDefinition.listCutOffs</code> attribute.
	 * @return the listCutOffs
	 */
	public Collection<NamingListCutOffs> getListCutOffs(final SessionContext ctx)
	{
		return LISTCUTOFFSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDefinition.listCutOffs</code> attribute.
	 * @return the listCutOffs
	 */
	public Collection<NamingListCutOffs> getListCutOffs()
	{
		return getListCutOffs( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDefinition.listCutOffs</code> attribute. 
	 * @param value the listCutOffs
	 */
	public void setListCutOffs(final SessionContext ctx, final Collection<NamingListCutOffs> value)
	{
		LISTCUTOFFSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDefinition.listCutOffs</code> attribute. 
	 * @param value the listCutOffs
	 */
	public void setListCutOffs(final Collection<NamingListCutOffs> value)
	{
		setListCutOffs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to listCutOffs. 
	 * @param value the item to add to listCutOffs
	 */
	public void addToListCutOffs(final SessionContext ctx, final NamingListCutOffs value)
	{
		LISTCUTOFFSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to listCutOffs. 
	 * @param value the item to add to listCutOffs
	 */
	public void addToListCutOffs(final NamingListCutOffs value)
	{
		addToListCutOffs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from listCutOffs. 
	 * @param value the item to remove from listCutOffs
	 */
	public void removeFromListCutOffs(final SessionContext ctx, final NamingListCutOffs value)
	{
		LISTCUTOFFSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from listCutOffs. 
	 * @param value the item to remove from listCutOffs
	 */
	public void removeFromListCutOffs(final NamingListCutOffs value)
	{
		removeFromListCutOffs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDefinition.medias</code> attribute.
	 * @return the medias
	 */
	public Collection<Media> getMedias(final SessionContext ctx)
	{
		return MEDIASHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDefinition.medias</code> attribute.
	 * @return the medias
	 */
	public Collection<Media> getMedias()
	{
		return getMedias( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDefinition.medias</code> attribute. 
	 * @param value the medias
	 */
	public void setMedias(final SessionContext ctx, final Collection<Media> value)
	{
		MEDIASHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDefinition.medias</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDefinition.paymentSchedules</code> attribute.
	 * @return the paymentSchedules
	 */
	public Collection<PaymentSchedule> getPaymentSchedules(final SessionContext ctx)
	{
		return PAYMENTSCHEDULESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDefinition.paymentSchedules</code> attribute.
	 * @return the paymentSchedules
	 */
	public Collection<PaymentSchedule> getPaymentSchedules()
	{
		return getPaymentSchedules( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDefinition.paymentSchedules</code> attribute. 
	 * @param value the paymentSchedules
	 */
	public void setPaymentSchedules(final SessionContext ctx, final Collection<PaymentSchedule> value)
	{
		PAYMENTSCHEDULESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDefinition.paymentSchedules</code> attribute. 
	 * @param value the paymentSchedules
	 */
	public void setPaymentSchedules(final Collection<PaymentSchedule> value)
	{
		setPaymentSchedules( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to paymentSchedules. 
	 * @param value the item to add to paymentSchedules
	 */
	public void addToPaymentSchedules(final SessionContext ctx, final PaymentSchedule value)
	{
		PAYMENTSCHEDULESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to paymentSchedules. 
	 * @param value the item to add to paymentSchedules
	 */
	public void addToPaymentSchedules(final PaymentSchedule value)
	{
		addToPaymentSchedules( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from paymentSchedules. 
	 * @param value the item to remove from paymentSchedules
	 */
	public void removeFromPaymentSchedules(final SessionContext ctx, final PaymentSchedule value)
	{
		PAYMENTSCHEDULESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from paymentSchedules. 
	 * @param value the item to remove from paymentSchedules
	 */
	public void removeFromPaymentSchedules(final PaymentSchedule value)
	{
		removeFromPaymentSchedules( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDefinition.productCategorySubtype</code> attribute.
	 * @return the productCategorySubtype - Product Category Sub type
	 */
	public ProductCategorySubType getProductCategorySubtype(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, PRODUCTCATEGORYSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDefinition.productCategorySubtype</code> attribute.
	 * @return the productCategorySubtype - Product Category Sub type
	 */
	public ProductCategorySubType getProductCategorySubtype()
	{
		return getProductCategorySubtype( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDefinition.productCategorySubtype</code> attribute. 
	 * @param value the productCategorySubtype - Product Category Sub type
	 */
	public void setProductCategorySubtype(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, PRODUCTCATEGORYSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDefinition.productCategorySubtype</code> attribute. 
	 * @param value the productCategorySubtype - Product Category Sub type
	 */
	public void setProductCategorySubtype(final ProductCategorySubType value)
	{
		setProductCategorySubtype( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDefinition.supplier</code> attribute.
	 * @return the supplier - Supplier.
	 */
	public Supplier getSupplier(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, SUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDefinition.supplier</code> attribute.
	 * @return the supplier - Supplier.
	 */
	public Supplier getSupplier()
	{
		return getSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDefinition.supplier</code> attribute. 
	 * @param value the supplier - Supplier.
	 */
	public void setSupplier(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, SUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDefinition.supplier</code> attribute. 
	 * @param value the supplier - Supplier.
	 */
	public void setSupplier(final Supplier value)
	{
		setSupplier( getSession().getSessionContext(), value );
	}
	
}
