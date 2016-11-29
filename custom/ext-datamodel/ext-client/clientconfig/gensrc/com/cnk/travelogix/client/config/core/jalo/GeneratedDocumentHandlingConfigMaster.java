/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.jalo.AbstractProductDocument;
import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import com.cnk.travelogix.product.common.core.jalo.PointOfSale;
import com.cnk.travelogix.supplier.core.constants.SuppliercoreConstants;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.DocumentHandlingConfigMaster DocumentHandlingConfigMaster}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDocumentHandlingConfigMaster extends GenericItem
{
	/** Qualifier of the <code>DocumentHandlingConfigMaster.commonDocumentHandlingMasterId</code> attribute **/
	public static final String COMMONDOCUMENTHANDLINGMASTERID = "commonDocumentHandlingMasterId";
	/** Qualifier of the <code>DocumentHandlingConfigMaster.companyDocumentHandlingMasterId</code> attribute **/
	public static final String COMPANYDOCUMENTHANDLINGMASTERID = "companyDocumentHandlingMasterId";
	/** Qualifier of the <code>DocumentHandlingConfigMaster.copiedFrom</code> attribute **/
	public static final String COPIEDFROM = "copiedFrom";
	/** Qualifier of the <code>DocumentHandlingConfigMaster.nationality</code> attribute **/
	public static final String NATIONALITY = "nationality";
	/** Qualifier of the <code>DocumentHandlingConfigMaster.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>DocumentHandlingConfigMaster.effectiveFrom</code> attribute **/
	public static final String EFFECTIVEFROM = "effectiveFrom";
	/** Qualifier of the <code>DocumentHandlingConfigMaster.reason</code> attribute **/
	public static final String REASON = "reason";
	/** Qualifier of the <code>DocumentHandlingConfigMaster.remark</code> attribute **/
	public static final String REMARK = "remark";
	/** Qualifier of the <code>DocumentHandlingConfigMaster.pointOfSale</code> attribute **/
	public static final String POINTOFSALE = "pointOfSale";
	/** Qualifier of the <code>DocumentHandlingConfigMaster.suppliers</code> attribute **/
	public static final String SUPPLIERS = "suppliers";
	/** Qualifier of the <code>DocumentHandlingConfigMaster.abstractProductDocument</code> attribute **/
	public static final String ABSTRACTPRODUCTDOCUMENT = "abstractProductDocument";
	/**
	* {@link OneToManyHandler} for handling 1:n POINTOFSALE's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PointOfSale> POINTOFSALEHANDLER = new OneToManyHandler<PointOfSale>(
	CommonproductcoreConstants.TC.POINTOFSALE,
	false,
	"documentHandlingConfigMaster",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SUPPLIERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Supplier> SUPPLIERSHANDLER = new OneToManyHandler<Supplier>(
	SuppliercoreConstants.TC.SUPPLIER,
	false,
	"documentHandlingConfigMaster",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ABSTRACTPRODUCTDOCUMENT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AbstractProductDocument> ABSTRACTPRODUCTDOCUMENTHANDLER = new OneToManyHandler<AbstractProductDocument>(
	ClientconfigConstants.TC.ABSTRACTPRODUCTDOCUMENT,
	false,
	"documentHandlingConfigMaster",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COMMONDOCUMENTHANDLINGMASTERID, AttributeMode.INITIAL);
		tmp.put(COMPANYDOCUMENTHANDLINGMASTERID, AttributeMode.INITIAL);
		tmp.put(COPIEDFROM, AttributeMode.INITIAL);
		tmp.put(NATIONALITY, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(EFFECTIVEFROM, AttributeMode.INITIAL);
		tmp.put(REASON, AttributeMode.INITIAL);
		tmp.put(REMARK, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentHandlingConfigMaster.abstractProductDocument</code> attribute.
	 * @return the abstractProductDocument
	 */
	public Collection<AbstractProductDocument> getAbstractProductDocument(final SessionContext ctx)
	{
		return ABSTRACTPRODUCTDOCUMENTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentHandlingConfigMaster.abstractProductDocument</code> attribute.
	 * @return the abstractProductDocument
	 */
	public Collection<AbstractProductDocument> getAbstractProductDocument()
	{
		return getAbstractProductDocument( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentHandlingConfigMaster.abstractProductDocument</code> attribute. 
	 * @param value the abstractProductDocument
	 */
	public void setAbstractProductDocument(final SessionContext ctx, final Collection<AbstractProductDocument> value)
	{
		ABSTRACTPRODUCTDOCUMENTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentHandlingConfigMaster.abstractProductDocument</code> attribute. 
	 * @param value the abstractProductDocument
	 */
	public void setAbstractProductDocument(final Collection<AbstractProductDocument> value)
	{
		setAbstractProductDocument( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to abstractProductDocument. 
	 * @param value the item to add to abstractProductDocument
	 */
	public void addToAbstractProductDocument(final SessionContext ctx, final AbstractProductDocument value)
	{
		ABSTRACTPRODUCTDOCUMENTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to abstractProductDocument. 
	 * @param value the item to add to abstractProductDocument
	 */
	public void addToAbstractProductDocument(final AbstractProductDocument value)
	{
		addToAbstractProductDocument( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from abstractProductDocument. 
	 * @param value the item to remove from abstractProductDocument
	 */
	public void removeFromAbstractProductDocument(final SessionContext ctx, final AbstractProductDocument value)
	{
		ABSTRACTPRODUCTDOCUMENTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from abstractProductDocument. 
	 * @param value the item to remove from abstractProductDocument
	 */
	public void removeFromAbstractProductDocument(final AbstractProductDocument value)
	{
		removeFromAbstractProductDocument( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentHandlingConfigMaster.commonDocumentHandlingMasterId</code> attribute.
	 * @return the commonDocumentHandlingMasterId - Common Document Handling Master Id
	 */
	public String getCommonDocumentHandlingMasterId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMMONDOCUMENTHANDLINGMASTERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentHandlingConfigMaster.commonDocumentHandlingMasterId</code> attribute.
	 * @return the commonDocumentHandlingMasterId - Common Document Handling Master Id
	 */
	public String getCommonDocumentHandlingMasterId()
	{
		return getCommonDocumentHandlingMasterId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentHandlingConfigMaster.commonDocumentHandlingMasterId</code> attribute. 
	 * @param value the commonDocumentHandlingMasterId - Common Document Handling Master Id
	 */
	public void setCommonDocumentHandlingMasterId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMMONDOCUMENTHANDLINGMASTERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentHandlingConfigMaster.commonDocumentHandlingMasterId</code> attribute. 
	 * @param value the commonDocumentHandlingMasterId - Common Document Handling Master Id
	 */
	public void setCommonDocumentHandlingMasterId(final String value)
	{
		setCommonDocumentHandlingMasterId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentHandlingConfigMaster.companyDocumentHandlingMasterId</code> attribute.
	 * @return the companyDocumentHandlingMasterId - Company Document Handling Master Id
	 */
	public String getCompanyDocumentHandlingMasterId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMPANYDOCUMENTHANDLINGMASTERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentHandlingConfigMaster.companyDocumentHandlingMasterId</code> attribute.
	 * @return the companyDocumentHandlingMasterId - Company Document Handling Master Id
	 */
	public String getCompanyDocumentHandlingMasterId()
	{
		return getCompanyDocumentHandlingMasterId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentHandlingConfigMaster.companyDocumentHandlingMasterId</code> attribute. 
	 * @param value the companyDocumentHandlingMasterId - Company Document Handling Master Id
	 */
	public void setCompanyDocumentHandlingMasterId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMPANYDOCUMENTHANDLINGMASTERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentHandlingConfigMaster.companyDocumentHandlingMasterId</code> attribute. 
	 * @param value the companyDocumentHandlingMasterId - Company Document Handling Master Id
	 */
	public void setCompanyDocumentHandlingMasterId(final String value)
	{
		setCompanyDocumentHandlingMasterId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentHandlingConfigMaster.copiedFrom</code> attribute.
	 * @return the copiedFrom - Client Document Handling Copied From Id
	 */
	public String getCopiedFrom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COPIEDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentHandlingConfigMaster.copiedFrom</code> attribute.
	 * @return the copiedFrom - Client Document Handling Copied From Id
	 */
	public String getCopiedFrom()
	{
		return getCopiedFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentHandlingConfigMaster.copiedFrom</code> attribute. 
	 * @param value the copiedFrom - Client Document Handling Copied From Id
	 */
	public void setCopiedFrom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COPIEDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentHandlingConfigMaster.copiedFrom</code> attribute. 
	 * @param value the copiedFrom - Client Document Handling Copied From Id
	 */
	public void setCopiedFrom(final String value)
	{
		setCopiedFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentHandlingConfigMaster.effectiveFrom</code> attribute.
	 * @return the effectiveFrom - Client Document Handling Effective From
	 */
	public Date getEffectiveFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EFFECTIVEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentHandlingConfigMaster.effectiveFrom</code> attribute.
	 * @return the effectiveFrom - Client Document Handling Effective From
	 */
	public Date getEffectiveFrom()
	{
		return getEffectiveFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentHandlingConfigMaster.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom - Client Document Handling Effective From
	 */
	public void setEffectiveFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EFFECTIVEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentHandlingConfigMaster.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom - Client Document Handling Effective From
	 */
	public void setEffectiveFrom(final Date value)
	{
		setEffectiveFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentHandlingConfigMaster.nationality</code> attribute.
	 * @return the nationality - Client Document Handling Nationality
	 */
	public Collection<Country> getNationality(final SessionContext ctx)
	{
		Collection<Country> coll = (Collection<Country>)getProperty( ctx, NATIONALITY);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentHandlingConfigMaster.nationality</code> attribute.
	 * @return the nationality - Client Document Handling Nationality
	 */
	public Collection<Country> getNationality()
	{
		return getNationality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentHandlingConfigMaster.nationality</code> attribute. 
	 * @param value the nationality - Client Document Handling Nationality
	 */
	public void setNationality(final SessionContext ctx, final Collection<Country> value)
	{
		setProperty(ctx, NATIONALITY,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentHandlingConfigMaster.nationality</code> attribute. 
	 * @param value the nationality - Client Document Handling Nationality
	 */
	public void setNationality(final Collection<Country> value)
	{
		setNationality( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentHandlingConfigMaster.pointOfSale</code> attribute.
	 * @return the pointOfSale
	 */
	public Collection<PointOfSale> getPointOfSale(final SessionContext ctx)
	{
		return POINTOFSALEHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentHandlingConfigMaster.pointOfSale</code> attribute.
	 * @return the pointOfSale
	 */
	public Collection<PointOfSale> getPointOfSale()
	{
		return getPointOfSale( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentHandlingConfigMaster.pointOfSale</code> attribute. 
	 * @param value the pointOfSale
	 */
	public void setPointOfSale(final SessionContext ctx, final Collection<PointOfSale> value)
	{
		POINTOFSALEHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentHandlingConfigMaster.pointOfSale</code> attribute. 
	 * @param value the pointOfSale
	 */
	public void setPointOfSale(final Collection<PointOfSale> value)
	{
		setPointOfSale( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to pointOfSale. 
	 * @param value the item to add to pointOfSale
	 */
	public void addToPointOfSale(final SessionContext ctx, final PointOfSale value)
	{
		POINTOFSALEHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to pointOfSale. 
	 * @param value the item to add to pointOfSale
	 */
	public void addToPointOfSale(final PointOfSale value)
	{
		addToPointOfSale( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from pointOfSale. 
	 * @param value the item to remove from pointOfSale
	 */
	public void removeFromPointOfSale(final SessionContext ctx, final PointOfSale value)
	{
		POINTOFSALEHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from pointOfSale. 
	 * @param value the item to remove from pointOfSale
	 */
	public void removeFromPointOfSale(final PointOfSale value)
	{
		removeFromPointOfSale( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentHandlingConfigMaster.reason</code> attribute.
	 * @return the reason - Client Document Handling Status Change Reason
	 */
	public String getReason(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentHandlingConfigMaster.reason</code> attribute.
	 * @return the reason - Client Document Handling Status Change Reason
	 */
	public String getReason()
	{
		return getReason( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentHandlingConfigMaster.reason</code> attribute. 
	 * @param value the reason - Client Document Handling Status Change Reason
	 */
	public void setReason(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentHandlingConfigMaster.reason</code> attribute. 
	 * @param value the reason - Client Document Handling Status Change Reason
	 */
	public void setReason(final String value)
	{
		setReason( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentHandlingConfigMaster.remark</code> attribute.
	 * @return the remark - Client Document Handling Remark
	 */
	public String getRemark(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REMARK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentHandlingConfigMaster.remark</code> attribute.
	 * @return the remark - Client Document Handling Remark
	 */
	public String getRemark()
	{
		return getRemark( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentHandlingConfigMaster.remark</code> attribute. 
	 * @param value the remark - Client Document Handling Remark
	 */
	public void setRemark(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REMARK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentHandlingConfigMaster.remark</code> attribute. 
	 * @param value the remark - Client Document Handling Remark
	 */
	public void setRemark(final String value)
	{
		setRemark( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentHandlingConfigMaster.status</code> attribute.
	 * @return the status - Client Document Handling Status
	 */
	public EnumerationValue getStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentHandlingConfigMaster.status</code> attribute.
	 * @return the status - Client Document Handling Status
	 */
	public EnumerationValue getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentHandlingConfigMaster.status</code> attribute. 
	 * @param value the status - Client Document Handling Status
	 */
	public void setStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentHandlingConfigMaster.status</code> attribute. 
	 * @param value the status - Client Document Handling Status
	 */
	public void setStatus(final EnumerationValue value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentHandlingConfigMaster.suppliers</code> attribute.
	 * @return the suppliers
	 */
	public Collection<Supplier> getSuppliers(final SessionContext ctx)
	{
		return SUPPLIERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentHandlingConfigMaster.suppliers</code> attribute.
	 * @return the suppliers
	 */
	public Collection<Supplier> getSuppliers()
	{
		return getSuppliers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentHandlingConfigMaster.suppliers</code> attribute. 
	 * @param value the suppliers
	 */
	public void setSuppliers(final SessionContext ctx, final Collection<Supplier> value)
	{
		SUPPLIERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentHandlingConfigMaster.suppliers</code> attribute. 
	 * @param value the suppliers
	 */
	public void setSuppliers(final Collection<Supplier> value)
	{
		setSuppliers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to suppliers. 
	 * @param value the item to add to suppliers
	 */
	public void addToSuppliers(final SessionContext ctx, final Supplier value)
	{
		SUPPLIERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to suppliers. 
	 * @param value the item to add to suppliers
	 */
	public void addToSuppliers(final Supplier value)
	{
		addToSuppliers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from suppliers. 
	 * @param value the item to remove from suppliers
	 */
	public void removeFromSuppliers(final SessionContext ctx, final Supplier value)
	{
		SUPPLIERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from suppliers. 
	 * @param value the item to remove from suppliers
	 */
	public void removeFromSuppliers(final Supplier value)
	{
		removeFromSuppliers( getSession().getSessionContext(), value );
	}
	
}
