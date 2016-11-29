/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.core.jalo;

import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.contact.jalo.ContactNumberInfo;
import com.cnk.travelogix.masterdata.core.contact.jalo.SocialContactInfo;
import com.cnk.travelogix.masterdata.core.contacts.jalo.AbstractContactDetails;
import com.cnk.travelogix.masterdata.core.contacts.jalo.ContactDetails;
import com.cnk.travelogix.masterdata.core.general.jalo.LanguageSkillInfo;
import com.cnk.travelogix.masterdata.core.staff.jalo.StaffInformation;
import com.cnk.travelogix.supplier.core.constants.SuppliercoreConstants;
import com.cnk.travelogix.supplier.core.contact.jalo.SupplierEmergencyContact;
import com.cnk.travelogix.supplier.core.market.jalo.SupplierMarket;
import com.cnk.travelogix.supplier.core.supplier.jalo.ProductCategoryInfo;
import com.cnk.travelogix.supplier.core.supplier.jalo.ROE;
import com.cnk.travelogix.supplier.core.supplier.jalo.ROEDetails;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import com.cnk.travelogix.supplier.core.supplier.jalo.SupplierBrand;
import com.cnk.travelogix.supplier.core.supplier.jalo.TravelogixROE;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.cronjob.jalo.Trigger;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.media.AbstractMedia;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type <code>SuppliercoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSuppliercoreManager extends Extension
{
	/** Relation ordering override parameter constants for EmergencyContact2ProdCatSubTyp from ((suppliercore))*/
	protected static String EMERGENCYCONTACT2PRODCATSUBTYP_SRC_ORDERED = "relation.EmergencyContact2ProdCatSubTyp.source.ordered";
	protected static String EMERGENCYCONTACT2PRODCATSUBTYP_TGT_ORDERED = "relation.EmergencyContact2ProdCatSubTyp.target.ordered";
	/** Relation disable markmodifed parameter constants for EmergencyContact2ProdCatSubTyp from ((suppliercore))*/
	protected static String EMERGENCYCONTACT2PRODCATSUBTYP_MARKMODIFIED = "relation.EmergencyContact2ProdCatSubTyp.markmodified";
	/** Relation ordering override parameter constants for Supplier2ProductCategorySubType from ((suppliercore))*/
	protected static String SUPPLIER2PRODUCTCATEGORYSUBTYPE_SRC_ORDERED = "relation.Supplier2ProductCategorySubType.source.ordered";
	protected static String SUPPLIER2PRODUCTCATEGORYSUBTYPE_TGT_ORDERED = "relation.Supplier2ProductCategorySubType.target.ordered";
	/** Relation disable markmodifed parameter constants for Supplier2ProductCategorySubType from ((suppliercore))*/
	protected static String SUPPLIER2PRODUCTCATEGORYSUBTYPE_MARKMODIFIED = "relation.Supplier2ProductCategorySubType.markmodified";
	/** Relation ordering override parameter constants for Supplier2SupplierEnablerCategory from ((suppliercore))*/
	protected static String SUPPLIER2SUPPLIERENABLERCATEGORY_SRC_ORDERED = "relation.Supplier2SupplierEnablerCategory.source.ordered";
	protected static String SUPPLIER2SUPPLIERENABLERCATEGORY_TGT_ORDERED = "relation.Supplier2SupplierEnablerCategory.target.ordered";
	/** Relation disable markmodifed parameter constants for Supplier2SupplierEnablerCategory from ((suppliercore))*/
	protected static String SUPPLIER2SUPPLIERENABLERCATEGORY_MARKMODIFIED = "relation.Supplier2SupplierEnablerCategory.markmodified";
	/** Relation ordering override parameter constants for Supplier2SupliersLOB from ((suppliercore))*/
	protected static String SUPPLIER2SUPLIERSLOB_SRC_ORDERED = "relation.Supplier2SupliersLOB.source.ordered";
	protected static String SUPPLIER2SUPLIERSLOB_TGT_ORDERED = "relation.Supplier2SupliersLOB.target.ordered";
	/** Relation disable markmodifed parameter constants for Supplier2SupliersLOB from ((suppliercore))*/
	protected static String SUPPLIER2SUPLIERSLOB_MARKMODIFIED = "relation.Supplier2SupliersLOB.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n CONTACTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ContactNumberInfo> STAFFINFO2CONTNOINFOCONTACTSHANDLER = new OneToManyHandler<ContactNumberInfo>(
	MasterdatacoreConstants.TC.CONTACTNUMBERINFO,
	true,
	"staffInformation",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SOCIALCONTACTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SocialContactInfo> STAFFINFORMATION2SOCIALCONTACTSOCIALCONTACTSHANDLER = new OneToManyHandler<SocialContactInfo>(
	MasterdatacoreConstants.TC.SOCIALCONTACTINFO,
	true,
	"staffInformation",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n LANGUAGESKILLS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<LanguageSkillInfo> STAFFINFORMATION2LANGUAGESKILLLANGUAGESKILLSHANDLER = new OneToManyHandler<LanguageSkillInfo>(
	MasterdatacoreConstants.TC.LANGUAGESKILLINFO,
	true,
	"staffInformation",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("months", AttributeMode.INITIAL);
		tmp.put("day1", AttributeMode.INITIAL);
		tmp.put("monthsWeek", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.cronjob.jalo.Trigger", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("supplier", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.supplier.core.contact.jalo.SupplierEmergencyContact", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("supplier", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.media.Media", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("staffInformation", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.contact.jalo.ContactNumberInfo", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("staffInformation", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.contact.jalo.SocialContactInfo", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("staffInformation", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.general.jalo.LanguageSkillInfo", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.contacts</code> attribute.
	 * @return the contacts
	 */
	public Set<ContactNumberInfo> getContacts(final SessionContext ctx, final StaffInformation item)
	{
		return (Set<ContactNumberInfo>)STAFFINFO2CONTNOINFOCONTACTSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.contacts</code> attribute.
	 * @return the contacts
	 */
	public Set<ContactNumberInfo> getContacts(final StaffInformation item)
	{
		return getContacts( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.contacts</code> attribute. 
	 * @param value the contacts
	 */
	public void setContacts(final SessionContext ctx, final StaffInformation item, final Set<ContactNumberInfo> value)
	{
		STAFFINFO2CONTNOINFOCONTACTSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.contacts</code> attribute. 
	 * @param value the contacts
	 */
	public void setContacts(final StaffInformation item, final Set<ContactNumberInfo> value)
	{
		setContacts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to contacts. 
	 * @param value the item to add to contacts
	 */
	public void addToContacts(final SessionContext ctx, final StaffInformation item, final ContactNumberInfo value)
	{
		STAFFINFO2CONTNOINFOCONTACTSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to contacts. 
	 * @param value the item to add to contacts
	 */
	public void addToContacts(final StaffInformation item, final ContactNumberInfo value)
	{
		addToContacts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from contacts. 
	 * @param value the item to remove from contacts
	 */
	public void removeFromContacts(final SessionContext ctx, final StaffInformation item, final ContactNumberInfo value)
	{
		STAFFINFO2CONTNOINFOCONTACTSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from contacts. 
	 * @param value the item to remove from contacts
	 */
	public void removeFromContacts(final StaffInformation item, final ContactNumberInfo value)
	{
		removeFromContacts( getSession().getSessionContext(), item, value );
	}
	
	public ProductCategoryInfo createProductCategoryInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercoreConstants.TC.PRODUCTCATEGORYINFO );
			return (ProductCategoryInfo)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductCategoryInfo : "+e.getMessage(), 0 );
		}
	}
	
	public ProductCategoryInfo createProductCategoryInfo(final Map attributeValues)
	{
		return createProductCategoryInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public ROE createROE(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercoreConstants.TC.ROE );
			return (ROE)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ROE : "+e.getMessage(), 0 );
		}
	}
	
	public ROE createROE(final Map attributeValues)
	{
		return createROE( getSession().getSessionContext(), attributeValues );
	}
	
	public ROEDetails createROEDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercoreConstants.TC.ROEDETAILS );
			return (ROEDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ROEDetails : "+e.getMessage(), 0 );
		}
	}
	
	public ROEDetails createROEDetails(final Map attributeValues)
	{
		return createROEDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public Supplier createSupplier(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercoreConstants.TC.SUPPLIER );
			return (Supplier)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Supplier : "+e.getMessage(), 0 );
		}
	}
	
	public Supplier createSupplier(final Map attributeValues)
	{
		return createSupplier( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierBrand createSupplierBrand(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercoreConstants.TC.SUPPLIERBRAND );
			return (SupplierBrand)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SupplierBrand : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierBrand createSupplierBrand(final Map attributeValues)
	{
		return createSupplierBrand( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierMarket createSupplierMarket(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercoreConstants.TC.SUPPLIERMARKET );
			return (SupplierMarket)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SupplierMarket : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierMarket createSupplierMarket(final Map attributeValues)
	{
		return createSupplierMarket( getSession().getSessionContext(), attributeValues );
	}
	
	public TravelogixROE createTravelogixROE(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercoreConstants.TC.TRAVELOGIXROE );
			return (TravelogixROE)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating TravelogixROE : "+e.getMessage(), 0 );
		}
	}
	
	public TravelogixROE createTravelogixROE(final Map attributeValues)
	{
		return createTravelogixROE( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.day1</code> attribute.
	 * @return the day1
	 */
	public Integer getDay1(final SessionContext ctx, final Trigger item)
	{
		return (Integer)item.getProperty( ctx, SuppliercoreConstants.Attributes.Trigger.DAY1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.day1</code> attribute.
	 * @return the day1
	 */
	public Integer getDay1(final Trigger item)
	{
		return getDay1( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.day1</code> attribute. 
	 * @return the day1
	 */
	public int getDay1AsPrimitive(final SessionContext ctx, final Trigger item)
	{
		Integer value = getDay1( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.day1</code> attribute. 
	 * @return the day1
	 */
	public int getDay1AsPrimitive(final Trigger item)
	{
		return getDay1AsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Trigger.day1</code> attribute. 
	 * @param value the day1
	 */
	public void setDay1(final SessionContext ctx, final Trigger item, final Integer value)
	{
		item.setProperty(ctx, SuppliercoreConstants.Attributes.Trigger.DAY1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Trigger.day1</code> attribute. 
	 * @param value the day1
	 */
	public void setDay1(final Trigger item, final Integer value)
	{
		setDay1( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Trigger.day1</code> attribute. 
	 * @param value the day1
	 */
	public void setDay1(final SessionContext ctx, final Trigger item, final int value)
	{
		setDay1( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Trigger.day1</code> attribute. 
	 * @param value the day1
	 */
	public void setDay1(final Trigger item, final int value)
	{
		setDay1( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return SuppliercoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.languageSkills</code> attribute.
	 * @return the languageSkills
	 */
	public Set<LanguageSkillInfo> getLanguageSkills(final SessionContext ctx, final StaffInformation item)
	{
		return (Set<LanguageSkillInfo>)STAFFINFORMATION2LANGUAGESKILLLANGUAGESKILLSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.languageSkills</code> attribute.
	 * @return the languageSkills
	 */
	public Set<LanguageSkillInfo> getLanguageSkills(final StaffInformation item)
	{
		return getLanguageSkills( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.languageSkills</code> attribute. 
	 * @param value the languageSkills
	 */
	public void setLanguageSkills(final SessionContext ctx, final StaffInformation item, final Set<LanguageSkillInfo> value)
	{
		STAFFINFORMATION2LANGUAGESKILLLANGUAGESKILLSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.languageSkills</code> attribute. 
	 * @param value the languageSkills
	 */
	public void setLanguageSkills(final StaffInformation item, final Set<LanguageSkillInfo> value)
	{
		setLanguageSkills( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to languageSkills. 
	 * @param value the item to add to languageSkills
	 */
	public void addToLanguageSkills(final SessionContext ctx, final StaffInformation item, final LanguageSkillInfo value)
	{
		STAFFINFORMATION2LANGUAGESKILLLANGUAGESKILLSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to languageSkills. 
	 * @param value the item to add to languageSkills
	 */
	public void addToLanguageSkills(final StaffInformation item, final LanguageSkillInfo value)
	{
		addToLanguageSkills( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from languageSkills. 
	 * @param value the item to remove from languageSkills
	 */
	public void removeFromLanguageSkills(final SessionContext ctx, final StaffInformation item, final LanguageSkillInfo value)
	{
		STAFFINFORMATION2LANGUAGESKILLLANGUAGESKILLSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from languageSkills. 
	 * @param value the item to remove from languageSkills
	 */
	public void removeFromLanguageSkills(final StaffInformation item, final LanguageSkillInfo value)
	{
		removeFromLanguageSkills( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.months</code> attribute.
	 * @return the months
	 */
	public EnumerationValue getMonths(final SessionContext ctx, final Trigger item)
	{
		return (EnumerationValue)item.getProperty( ctx, SuppliercoreConstants.Attributes.Trigger.MONTHS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.months</code> attribute.
	 * @return the months
	 */
	public EnumerationValue getMonths(final Trigger item)
	{
		return getMonths( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Trigger.months</code> attribute. 
	 * @param value the months
	 */
	public void setMonths(final SessionContext ctx, final Trigger item, final EnumerationValue value)
	{
		item.setProperty(ctx, SuppliercoreConstants.Attributes.Trigger.MONTHS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Trigger.months</code> attribute. 
	 * @param value the months
	 */
	public void setMonths(final Trigger item, final EnumerationValue value)
	{
		setMonths( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.monthsWeek</code> attribute.
	 * @return the monthsWeek
	 */
	public EnumerationValue getMonthsWeek(final SessionContext ctx, final Trigger item)
	{
		return (EnumerationValue)item.getProperty( ctx, SuppliercoreConstants.Attributes.Trigger.MONTHSWEEK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.monthsWeek</code> attribute.
	 * @return the monthsWeek
	 */
	public EnumerationValue getMonthsWeek(final Trigger item)
	{
		return getMonthsWeek( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Trigger.monthsWeek</code> attribute. 
	 * @param value the monthsWeek
	 */
	public void setMonthsWeek(final SessionContext ctx, final Trigger item, final EnumerationValue value)
	{
		item.setProperty(ctx, SuppliercoreConstants.Attributes.Trigger.MONTHSWEEK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Trigger.monthsWeek</code> attribute. 
	 * @param value the monthsWeek
	 */
	public void setMonthsWeek(final Trigger item, final EnumerationValue value)
	{
		setMonthsWeek( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEmergencyContact.productCatSubType</code> attribute.
	 * @return the productCatSubType
	 */
	public Set<ProductCategorySubType> getProductCatSubType(final SessionContext ctx, final SupplierEmergencyContact item)
	{
		final List<ProductCategorySubType> items = item.getLinkedItems( 
			ctx,
			true,
			SuppliercoreConstants.Relations.EMERGENCYCONTACT2PRODCATSUBTYP,
			"ProductCategorySubType",
			null,
			false,
			false
		);
		return new LinkedHashSet<ProductCategorySubType>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEmergencyContact.productCatSubType</code> attribute.
	 * @return the productCatSubType
	 */
	public Set<ProductCategorySubType> getProductCatSubType(final SupplierEmergencyContact item)
	{
		return getProductCatSubType( getSession().getSessionContext(), item );
	}
	
	public long getProductCatSubTypeCount(final SessionContext ctx, final SupplierEmergencyContact item)
	{
		return item.getLinkedItemsCount(
			ctx,
			true,
			SuppliercoreConstants.Relations.EMERGENCYCONTACT2PRODCATSUBTYP,
			"ProductCategorySubType",
			null
		);
	}
	
	public long getProductCatSubTypeCount(final SupplierEmergencyContact item)
	{
		return getProductCatSubTypeCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEmergencyContact.productCatSubType</code> attribute. 
	 * @param value the productCatSubType
	 */
	public void setProductCatSubType(final SessionContext ctx, final SupplierEmergencyContact item, final Set<ProductCategorySubType> value)
	{
		item.setLinkedItems( 
			ctx,
			true,
			SuppliercoreConstants.Relations.EMERGENCYCONTACT2PRODCATSUBTYP,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2PRODCATSUBTYP_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEmergencyContact.productCatSubType</code> attribute. 
	 * @param value the productCatSubType
	 */
	public void setProductCatSubType(final SupplierEmergencyContact item, final Set<ProductCategorySubType> value)
	{
		setProductCatSubType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productCatSubType. 
	 * @param value the item to add to productCatSubType
	 */
	public void addToProductCatSubType(final SessionContext ctx, final SupplierEmergencyContact item, final ProductCategorySubType value)
	{
		item.addLinkedItems( 
			ctx,
			true,
			SuppliercoreConstants.Relations.EMERGENCYCONTACT2PRODCATSUBTYP,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2PRODCATSUBTYP_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productCatSubType. 
	 * @param value the item to add to productCatSubType
	 */
	public void addToProductCatSubType(final SupplierEmergencyContact item, final ProductCategorySubType value)
	{
		addToProductCatSubType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productCatSubType. 
	 * @param value the item to remove from productCatSubType
	 */
	public void removeFromProductCatSubType(final SessionContext ctx, final SupplierEmergencyContact item, final ProductCategorySubType value)
	{
		item.removeLinkedItems( 
			ctx,
			true,
			SuppliercoreConstants.Relations.EMERGENCYCONTACT2PRODCATSUBTYP,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2PRODCATSUBTYP_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productCatSubType. 
	 * @param value the item to remove from productCatSubType
	 */
	public void removeFromProductCatSubType(final SupplierEmergencyContact item, final ProductCategorySubType value)
	{
		removeFromProductCatSubType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.socialContacts</code> attribute.
	 * @return the socialContacts
	 */
	public Set<SocialContactInfo> getSocialContacts(final SessionContext ctx, final StaffInformation item)
	{
		return (Set<SocialContactInfo>)STAFFINFORMATION2SOCIALCONTACTSOCIALCONTACTSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.socialContacts</code> attribute.
	 * @return the socialContacts
	 */
	public Set<SocialContactInfo> getSocialContacts(final StaffInformation item)
	{
		return getSocialContacts( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.socialContacts</code> attribute. 
	 * @param value the socialContacts
	 */
	public void setSocialContacts(final SessionContext ctx, final StaffInformation item, final Set<SocialContactInfo> value)
	{
		STAFFINFORMATION2SOCIALCONTACTSOCIALCONTACTSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.socialContacts</code> attribute. 
	 * @param value the socialContacts
	 */
	public void setSocialContacts(final StaffInformation item, final Set<SocialContactInfo> value)
	{
		setSocialContacts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to socialContacts. 
	 * @param value the item to add to socialContacts
	 */
	public void addToSocialContacts(final SessionContext ctx, final StaffInformation item, final SocialContactInfo value)
	{
		STAFFINFORMATION2SOCIALCONTACTSOCIALCONTACTSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to socialContacts. 
	 * @param value the item to add to socialContacts
	 */
	public void addToSocialContacts(final StaffInformation item, final SocialContactInfo value)
	{
		addToSocialContacts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from socialContacts. 
	 * @param value the item to remove from socialContacts
	 */
	public void removeFromSocialContacts(final SessionContext ctx, final StaffInformation item, final SocialContactInfo value)
	{
		STAFFINFORMATION2SOCIALCONTACTSOCIALCONTACTSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from socialContacts. 
	 * @param value the item to remove from socialContacts
	 */
	public void removeFromSocialContacts(final StaffInformation item, final SocialContactInfo value)
	{
		removeFromSocialContacts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactNumberInfo.staffInformation</code> attribute.
	 * @return the staffInformation
	 */
	public StaffInformation getStaffInformation(final SessionContext ctx, final ContactNumberInfo item)
	{
		return (StaffInformation)item.getProperty( ctx, SuppliercoreConstants.Attributes.ContactNumberInfo.STAFFINFORMATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactNumberInfo.staffInformation</code> attribute.
	 * @return the staffInformation
	 */
	public StaffInformation getStaffInformation(final ContactNumberInfo item)
	{
		return getStaffInformation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactNumberInfo.staffInformation</code> attribute. 
	 * @param value the staffInformation
	 */
	public void setStaffInformation(final SessionContext ctx, final ContactNumberInfo item, final StaffInformation value)
	{
		item.setProperty(ctx, SuppliercoreConstants.Attributes.ContactNumberInfo.STAFFINFORMATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactNumberInfo.staffInformation</code> attribute. 
	 * @param value the staffInformation
	 */
	public void setStaffInformation(final ContactNumberInfo item, final StaffInformation value)
	{
		setStaffInformation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SocialContactInfo.staffInformation</code> attribute.
	 * @return the staffInformation
	 */
	public StaffInformation getStaffInformation(final SessionContext ctx, final SocialContactInfo item)
	{
		return (StaffInformation)item.getProperty( ctx, SuppliercoreConstants.Attributes.SocialContactInfo.STAFFINFORMATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SocialContactInfo.staffInformation</code> attribute.
	 * @return the staffInformation
	 */
	public StaffInformation getStaffInformation(final SocialContactInfo item)
	{
		return getStaffInformation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SocialContactInfo.staffInformation</code> attribute. 
	 * @param value the staffInformation
	 */
	public void setStaffInformation(final SessionContext ctx, final SocialContactInfo item, final StaffInformation value)
	{
		item.setProperty(ctx, SuppliercoreConstants.Attributes.SocialContactInfo.STAFFINFORMATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SocialContactInfo.staffInformation</code> attribute. 
	 * @param value the staffInformation
	 */
	public void setStaffInformation(final SocialContactInfo item, final StaffInformation value)
	{
		setStaffInformation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LanguageSkillInfo.staffInformation</code> attribute.
	 * @return the staffInformation
	 */
	public StaffInformation getStaffInformation(final SessionContext ctx, final LanguageSkillInfo item)
	{
		return (StaffInformation)item.getProperty( ctx, SuppliercoreConstants.Attributes.LanguageSkillInfo.STAFFINFORMATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LanguageSkillInfo.staffInformation</code> attribute.
	 * @return the staffInformation
	 */
	public StaffInformation getStaffInformation(final LanguageSkillInfo item)
	{
		return getStaffInformation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LanguageSkillInfo.staffInformation</code> attribute. 
	 * @param value the staffInformation
	 */
	public void setStaffInformation(final SessionContext ctx, final LanguageSkillInfo item, final StaffInformation value)
	{
		item.setProperty(ctx, SuppliercoreConstants.Attributes.LanguageSkillInfo.STAFFINFORMATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LanguageSkillInfo.staffInformation</code> attribute. 
	 * @param value the staffInformation
	 */
	public void setStaffInformation(final LanguageSkillInfo item, final StaffInformation value)
	{
		setStaffInformation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEmergencyContact.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier(final SessionContext ctx, final SupplierEmergencyContact item)
	{
		return (Supplier)item.getProperty( ctx, SuppliercoreConstants.Attributes.SupplierEmergencyContact.SUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEmergencyContact.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier(final SupplierEmergencyContact item)
	{
		return getSupplier( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEmergencyContact.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final SessionContext ctx, final SupplierEmergencyContact item, final Supplier value)
	{
		item.setProperty(ctx, SuppliercoreConstants.Attributes.SupplierEmergencyContact.SUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEmergencyContact.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final SupplierEmergencyContact item, final Supplier value)
	{
		setSupplier( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier(final SessionContext ctx, final Media item)
	{
		return (Supplier)item.getProperty( ctx, SuppliercoreConstants.Attributes.Media.SUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier(final Media item)
	{
		return getSupplier( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final SessionContext ctx, final Media item, final Supplier value)
	{
		item.setProperty(ctx, SuppliercoreConstants.Attributes.Media.SUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final Media item, final Supplier value)
	{
		setSupplier( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCategorySubType.supplierEmergencycontacts</code> attribute.
	 * @return the supplierEmergencycontacts
	 */
	public Set<SupplierEmergencyContact> getSupplierEmergencycontacts(final SessionContext ctx, final ProductCategorySubType item)
	{
		final List<SupplierEmergencyContact> items = item.getLinkedItems( 
			ctx,
			false,
			SuppliercoreConstants.Relations.EMERGENCYCONTACT2PRODCATSUBTYP,
			"SupplierEmergencyContact",
			null,
			false,
			false
		);
		return new LinkedHashSet<SupplierEmergencyContact>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCategorySubType.supplierEmergencycontacts</code> attribute.
	 * @return the supplierEmergencycontacts
	 */
	public Set<SupplierEmergencyContact> getSupplierEmergencycontacts(final ProductCategorySubType item)
	{
		return getSupplierEmergencycontacts( getSession().getSessionContext(), item );
	}
	
	public long getSupplierEmergencycontactsCount(final SessionContext ctx, final ProductCategorySubType item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			SuppliercoreConstants.Relations.EMERGENCYCONTACT2PRODCATSUBTYP,
			"SupplierEmergencyContact",
			null
		);
	}
	
	public long getSupplierEmergencycontactsCount(final ProductCategorySubType item)
	{
		return getSupplierEmergencycontactsCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCategorySubType.supplierEmergencycontacts</code> attribute. 
	 * @param value the supplierEmergencycontacts
	 */
	public void setSupplierEmergencycontacts(final SessionContext ctx, final ProductCategorySubType item, final Set<SupplierEmergencyContact> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			SuppliercoreConstants.Relations.EMERGENCYCONTACT2PRODCATSUBTYP,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2PRODCATSUBTYP_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCategorySubType.supplierEmergencycontacts</code> attribute. 
	 * @param value the supplierEmergencycontacts
	 */
	public void setSupplierEmergencycontacts(final ProductCategorySubType item, final Set<SupplierEmergencyContact> value)
	{
		setSupplierEmergencycontacts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierEmergencycontacts. 
	 * @param value the item to add to supplierEmergencycontacts
	 */
	public void addToSupplierEmergencycontacts(final SessionContext ctx, final ProductCategorySubType item, final SupplierEmergencyContact value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			SuppliercoreConstants.Relations.EMERGENCYCONTACT2PRODCATSUBTYP,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2PRODCATSUBTYP_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierEmergencycontacts. 
	 * @param value the item to add to supplierEmergencycontacts
	 */
	public void addToSupplierEmergencycontacts(final ProductCategorySubType item, final SupplierEmergencyContact value)
	{
		addToSupplierEmergencycontacts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierEmergencycontacts. 
	 * @param value the item to remove from supplierEmergencycontacts
	 */
	public void removeFromSupplierEmergencycontacts(final SessionContext ctx, final ProductCategorySubType item, final SupplierEmergencyContact value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			SuppliercoreConstants.Relations.EMERGENCYCONTACT2PRODCATSUBTYP,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2PRODCATSUBTYP_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierEmergencycontacts. 
	 * @param value the item to remove from supplierEmergencycontacts
	 */
	public void removeFromSupplierEmergencycontacts(final ProductCategorySubType item, final SupplierEmergencyContact value)
	{
		removeFromSupplierEmergencycontacts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCategorySubType.suppliers</code> attribute.
	 * @return the suppliers
	 */
	public Set<Supplier> getSuppliers(final SessionContext ctx, final ProductCategorySubType item)
	{
		final List<Supplier> items = item.getLinkedItems( 
			ctx,
			false,
			SuppliercoreConstants.Relations.SUPPLIER2PRODUCTCATEGORYSUBTYPE,
			"Supplier",
			null,
			false,
			false
		);
		return new LinkedHashSet<Supplier>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCategorySubType.suppliers</code> attribute.
	 * @return the suppliers
	 */
	public Set<Supplier> getSuppliers(final ProductCategorySubType item)
	{
		return getSuppliers( getSession().getSessionContext(), item );
	}
	
	public long getSuppliersCount(final SessionContext ctx, final ProductCategorySubType item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			SuppliercoreConstants.Relations.SUPPLIER2PRODUCTCATEGORYSUBTYPE,
			"Supplier",
			null
		);
	}
	
	public long getSuppliersCount(final ProductCategorySubType item)
	{
		return getSuppliersCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCategorySubType.suppliers</code> attribute. 
	 * @param value the suppliers
	 */
	public void setSuppliers(final SessionContext ctx, final ProductCategorySubType item, final Set<Supplier> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			SuppliercoreConstants.Relations.SUPPLIER2PRODUCTCATEGORYSUBTYPE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2PRODUCTCATEGORYSUBTYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCategorySubType.suppliers</code> attribute. 
	 * @param value the suppliers
	 */
	public void setSuppliers(final ProductCategorySubType item, final Set<Supplier> value)
	{
		setSuppliers( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to suppliers. 
	 * @param value the item to add to suppliers
	 */
	public void addToSuppliers(final SessionContext ctx, final ProductCategorySubType item, final Supplier value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			SuppliercoreConstants.Relations.SUPPLIER2PRODUCTCATEGORYSUBTYPE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2PRODUCTCATEGORYSUBTYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to suppliers. 
	 * @param value the item to add to suppliers
	 */
	public void addToSuppliers(final ProductCategorySubType item, final Supplier value)
	{
		addToSuppliers( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from suppliers. 
	 * @param value the item to remove from suppliers
	 */
	public void removeFromSuppliers(final SessionContext ctx, final ProductCategorySubType item, final Supplier value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			SuppliercoreConstants.Relations.SUPPLIER2PRODUCTCATEGORYSUBTYPE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2PRODUCTCATEGORYSUBTYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from suppliers. 
	 * @param value the item to remove from suppliers
	 */
	public void removeFromSuppliers(final ProductCategorySubType item, final Supplier value)
	{
		removeFromSuppliers( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEnablerCategory.suppliersForEnablerCategory</code> attribute.
	 * @return the suppliersForEnablerCategory
	 */
	public Set<Supplier> getSuppliersForEnablerCategory(final SessionContext ctx, final EnumerationValue item)
	{
		final List<Supplier> items = item.getLinkedItems( 
			ctx,
			false,
			SuppliercoreConstants.Relations.SUPPLIER2SUPPLIERENABLERCATEGORY,
			"Supplier",
			null,
			false,
			false
		);
		return new LinkedHashSet<Supplier>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEnablerCategory.suppliersForEnablerCategory</code> attribute.
	 * @return the suppliersForEnablerCategory
	 */
	public Set<Supplier> getSuppliersForEnablerCategory(final EnumerationValue item)
	{
		return getSuppliersForEnablerCategory( getSession().getSessionContext(), item );
	}
	
	public long getSuppliersForEnablerCategoryCount(final SessionContext ctx, final EnumerationValue item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			SuppliercoreConstants.Relations.SUPPLIER2SUPPLIERENABLERCATEGORY,
			"Supplier",
			null
		);
	}
	
	public long getSuppliersForEnablerCategoryCount(final EnumerationValue item)
	{
		return getSuppliersForEnablerCategoryCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEnablerCategory.suppliersForEnablerCategory</code> attribute. 
	 * @param value the suppliersForEnablerCategory
	 */
	public void setSuppliersForEnablerCategory(final SessionContext ctx, final EnumerationValue item, final Set<Supplier> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			SuppliercoreConstants.Relations.SUPPLIER2SUPPLIERENABLERCATEGORY,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2SUPPLIERENABLERCATEGORY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEnablerCategory.suppliersForEnablerCategory</code> attribute. 
	 * @param value the suppliersForEnablerCategory
	 */
	public void setSuppliersForEnablerCategory(final EnumerationValue item, final Set<Supplier> value)
	{
		setSuppliersForEnablerCategory( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to suppliersForEnablerCategory. 
	 * @param value the item to add to suppliersForEnablerCategory
	 */
	public void addToSuppliersForEnablerCategory(final SessionContext ctx, final EnumerationValue item, final Supplier value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			SuppliercoreConstants.Relations.SUPPLIER2SUPPLIERENABLERCATEGORY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2SUPPLIERENABLERCATEGORY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to suppliersForEnablerCategory. 
	 * @param value the item to add to suppliersForEnablerCategory
	 */
	public void addToSuppliersForEnablerCategory(final EnumerationValue item, final Supplier value)
	{
		addToSuppliersForEnablerCategory( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from suppliersForEnablerCategory. 
	 * @param value the item to remove from suppliersForEnablerCategory
	 */
	public void removeFromSuppliersForEnablerCategory(final SessionContext ctx, final EnumerationValue item, final Supplier value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			SuppliercoreConstants.Relations.SUPPLIER2SUPPLIERENABLERCATEGORY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2SUPPLIERENABLERCATEGORY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from suppliersForEnablerCategory. 
	 * @param value the item to remove from suppliersForEnablerCategory
	 */
	public void removeFromSuppliersForEnablerCategory(final EnumerationValue item, final Supplier value)
	{
		removeFromSuppliersForEnablerCategory( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SuppliersLOB.suppliersForLOB</code> attribute.
	 * @return the suppliersForLOB
	 */
	public Set<Supplier> getSuppliersForLOB(final SessionContext ctx, final EnumerationValue item)
	{
		final List<Supplier> items = item.getLinkedItems( 
			ctx,
			false,
			SuppliercoreConstants.Relations.SUPPLIER2SUPLIERSLOB,
			"Supplier",
			null,
			false,
			false
		);
		return new LinkedHashSet<Supplier>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SuppliersLOB.suppliersForLOB</code> attribute.
	 * @return the suppliersForLOB
	 */
	public Set<Supplier> getSuppliersForLOB(final EnumerationValue item)
	{
		return getSuppliersForLOB( getSession().getSessionContext(), item );
	}
	
	public long getSuppliersForLOBCount(final SessionContext ctx, final EnumerationValue item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			SuppliercoreConstants.Relations.SUPPLIER2SUPLIERSLOB,
			"Supplier",
			null
		);
	}
	
	public long getSuppliersForLOBCount(final EnumerationValue item)
	{
		return getSuppliersForLOBCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SuppliersLOB.suppliersForLOB</code> attribute. 
	 * @param value the suppliersForLOB
	 */
	public void setSuppliersForLOB(final SessionContext ctx, final EnumerationValue item, final Set<Supplier> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			SuppliercoreConstants.Relations.SUPPLIER2SUPLIERSLOB,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2SUPLIERSLOB_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SuppliersLOB.suppliersForLOB</code> attribute. 
	 * @param value the suppliersForLOB
	 */
	public void setSuppliersForLOB(final EnumerationValue item, final Set<Supplier> value)
	{
		setSuppliersForLOB( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to suppliersForLOB. 
	 * @param value the item to add to suppliersForLOB
	 */
	public void addToSuppliersForLOB(final SessionContext ctx, final EnumerationValue item, final Supplier value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			SuppliercoreConstants.Relations.SUPPLIER2SUPLIERSLOB,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2SUPLIERSLOB_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to suppliersForLOB. 
	 * @param value the item to add to suppliersForLOB
	 */
	public void addToSuppliersForLOB(final EnumerationValue item, final Supplier value)
	{
		addToSuppliersForLOB( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from suppliersForLOB. 
	 * @param value the item to remove from suppliersForLOB
	 */
	public void removeFromSuppliersForLOB(final SessionContext ctx, final EnumerationValue item, final Supplier value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			SuppliercoreConstants.Relations.SUPPLIER2SUPLIERSLOB,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2SUPLIERSLOB_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from suppliersForLOB. 
	 * @param value the item to remove from suppliersForLOB
	 */
	public void removeFromSuppliersForLOB(final EnumerationValue item, final Supplier value)
	{
		removeFromSuppliersForLOB( getSession().getSessionContext(), item, value );
	}
	
}
