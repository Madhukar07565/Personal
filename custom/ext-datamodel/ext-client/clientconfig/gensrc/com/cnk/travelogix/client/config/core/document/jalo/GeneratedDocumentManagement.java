/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.document.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.version.jalo.VersionDetail;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.user.Employee;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.document.jalo.DocumentManagement DocumentManagement}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDocumentManagement extends GenericItem
{
	/** Qualifier of the <code>DocumentManagement.entityName</code> attribute **/
	public static final String ENTITYNAME = "entityName";
	/** Qualifier of the <code>DocumentManagement.documentId</code> attribute **/
	public static final String DOCUMENTID = "documentId";
	/** Qualifier of the <code>DocumentManagement.documentName</code> attribute **/
	public static final String DOCUMENTNAME = "documentName";
	/** Qualifier of the <code>DocumentManagement.documentType</code> attribute **/
	public static final String DOCUMENTTYPE = "documentType";
	/** Qualifier of the <code>DocumentManagement.documentCategory</code> attribute **/
	public static final String DOCUMENTCATEGORY = "documentCategory";
	/** Qualifier of the <code>DocumentManagement.documentDescription</code> attribute **/
	public static final String DOCUMENTDESCRIPTION = "documentDescription";
	/** Qualifier of the <code>DocumentManagement.documentSignedOn</code> attribute **/
	public static final String DOCUMENTSIGNEDON = "documentSignedOn";
	/** Qualifier of the <code>DocumentManagement.documentMedia</code> attribute **/
	public static final String DOCUMENTMEDIA = "documentMedia";
	/** Qualifier of the <code>DocumentManagement.lockedBy</code> attribute **/
	public static final String LOCKEDBY = "lockedBy";
	/** Qualifier of the <code>DocumentManagement.versionDetail</code> attribute **/
	public static final String VERSIONDETAIL = "versionDetail";
	/**
	* {@link OneToManyHandler} for handling 1:n VERSIONDETAIL's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<VersionDetail> VERSIONDETAILHANDLER = new OneToManyHandler<VersionDetail>(
	MasterdatacoreConstants.TC.VERSIONDETAIL,
	false,
	"documentManagement",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ENTITYNAME, AttributeMode.INITIAL);
		tmp.put(DOCUMENTID, AttributeMode.INITIAL);
		tmp.put(DOCUMENTNAME, AttributeMode.INITIAL);
		tmp.put(DOCUMENTTYPE, AttributeMode.INITIAL);
		tmp.put(DOCUMENTCATEGORY, AttributeMode.INITIAL);
		tmp.put(DOCUMENTDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(DOCUMENTSIGNEDON, AttributeMode.INITIAL);
		tmp.put(DOCUMENTMEDIA, AttributeMode.INITIAL);
		tmp.put(LOCKEDBY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentManagement.documentCategory</code> attribute.
	 * @return the documentCategory
	 */
	public EnumerationValue getDocumentCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DOCUMENTCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentManagement.documentCategory</code> attribute.
	 * @return the documentCategory
	 */
	public EnumerationValue getDocumentCategory()
	{
		return getDocumentCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentManagement.documentCategory</code> attribute. 
	 * @param value the documentCategory
	 */
	public void setDocumentCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DOCUMENTCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentManagement.documentCategory</code> attribute. 
	 * @param value the documentCategory
	 */
	public void setDocumentCategory(final EnumerationValue value)
	{
		setDocumentCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentManagement.documentDescription</code> attribute.
	 * @return the documentDescription
	 */
	public String getDocumentDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DOCUMENTDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentManagement.documentDescription</code> attribute.
	 * @return the documentDescription
	 */
	public String getDocumentDescription()
	{
		return getDocumentDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentManagement.documentDescription</code> attribute. 
	 * @param value the documentDescription
	 */
	public void setDocumentDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DOCUMENTDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentManagement.documentDescription</code> attribute. 
	 * @param value the documentDescription
	 */
	public void setDocumentDescription(final String value)
	{
		setDocumentDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentManagement.documentId</code> attribute.
	 * @return the documentId
	 */
	public String getDocumentId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DOCUMENTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentManagement.documentId</code> attribute.
	 * @return the documentId
	 */
	public String getDocumentId()
	{
		return getDocumentId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentManagement.documentId</code> attribute. 
	 * @param value the documentId
	 */
	public void setDocumentId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DOCUMENTID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentManagement.documentId</code> attribute. 
	 * @param value the documentId
	 */
	public void setDocumentId(final String value)
	{
		setDocumentId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentManagement.documentMedia</code> attribute.
	 * @return the documentMedia
	 */
	public Media getDocumentMedia(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, DOCUMENTMEDIA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentManagement.documentMedia</code> attribute.
	 * @return the documentMedia
	 */
	public Media getDocumentMedia()
	{
		return getDocumentMedia( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentManagement.documentMedia</code> attribute. 
	 * @param value the documentMedia
	 */
	public void setDocumentMedia(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, DOCUMENTMEDIA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentManagement.documentMedia</code> attribute. 
	 * @param value the documentMedia
	 */
	public void setDocumentMedia(final Media value)
	{
		setDocumentMedia( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentManagement.documentName</code> attribute.
	 * @return the documentName
	 */
	public EnumerationValue getDocumentName(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DOCUMENTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentManagement.documentName</code> attribute.
	 * @return the documentName
	 */
	public EnumerationValue getDocumentName()
	{
		return getDocumentName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentManagement.documentName</code> attribute. 
	 * @param value the documentName
	 */
	public void setDocumentName(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DOCUMENTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentManagement.documentName</code> attribute. 
	 * @param value the documentName
	 */
	public void setDocumentName(final EnumerationValue value)
	{
		setDocumentName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentManagement.documentSignedOn</code> attribute.
	 * @return the documentSignedOn
	 */
	public Date getDocumentSignedOn(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DOCUMENTSIGNEDON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentManagement.documentSignedOn</code> attribute.
	 * @return the documentSignedOn
	 */
	public Date getDocumentSignedOn()
	{
		return getDocumentSignedOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentManagement.documentSignedOn</code> attribute. 
	 * @param value the documentSignedOn
	 */
	public void setDocumentSignedOn(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DOCUMENTSIGNEDON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentManagement.documentSignedOn</code> attribute. 
	 * @param value the documentSignedOn
	 */
	public void setDocumentSignedOn(final Date value)
	{
		setDocumentSignedOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentManagement.documentType</code> attribute.
	 * @return the documentType
	 */
	public EnumerationValue getDocumentType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DOCUMENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentManagement.documentType</code> attribute.
	 * @return the documentType
	 */
	public EnumerationValue getDocumentType()
	{
		return getDocumentType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentManagement.documentType</code> attribute. 
	 * @param value the documentType
	 */
	public void setDocumentType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DOCUMENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentManagement.documentType</code> attribute. 
	 * @param value the documentType
	 */
	public void setDocumentType(final EnumerationValue value)
	{
		setDocumentType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentManagement.entityName</code> attribute.
	 * @return the entityName
	 */
	public Principal getEntityName(final SessionContext ctx)
	{
		return (Principal)getProperty( ctx, ENTITYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentManagement.entityName</code> attribute.
	 * @return the entityName
	 */
	public Principal getEntityName()
	{
		return getEntityName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentManagement.entityName</code> attribute. 
	 * @param value the entityName
	 */
	public void setEntityName(final SessionContext ctx, final Principal value)
	{
		setProperty(ctx, ENTITYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentManagement.entityName</code> attribute. 
	 * @param value the entityName
	 */
	public void setEntityName(final Principal value)
	{
		setEntityName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentManagement.lockedBy</code> attribute.
	 * @return the lockedBy
	 */
	public Employee getLockedBy(final SessionContext ctx)
	{
		return (Employee)getProperty( ctx, LOCKEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentManagement.lockedBy</code> attribute.
	 * @return the lockedBy
	 */
	public Employee getLockedBy()
	{
		return getLockedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentManagement.lockedBy</code> attribute. 
	 * @param value the lockedBy
	 */
	public void setLockedBy(final SessionContext ctx, final Employee value)
	{
		setProperty(ctx, LOCKEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentManagement.lockedBy</code> attribute. 
	 * @param value the lockedBy
	 */
	public void setLockedBy(final Employee value)
	{
		setLockedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentManagement.versionDetail</code> attribute.
	 * @return the versionDetail
	 */
	public Set<VersionDetail> getVersionDetail(final SessionContext ctx)
	{
		return (Set<VersionDetail>)VERSIONDETAILHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentManagement.versionDetail</code> attribute.
	 * @return the versionDetail
	 */
	public Set<VersionDetail> getVersionDetail()
	{
		return getVersionDetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentManagement.versionDetail</code> attribute. 
	 * @param value the versionDetail
	 */
	public void setVersionDetail(final SessionContext ctx, final Set<VersionDetail> value)
	{
		VERSIONDETAILHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentManagement.versionDetail</code> attribute. 
	 * @param value the versionDetail
	 */
	public void setVersionDetail(final Set<VersionDetail> value)
	{
		setVersionDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to versionDetail. 
	 * @param value the item to add to versionDetail
	 */
	public void addToVersionDetail(final SessionContext ctx, final VersionDetail value)
	{
		VERSIONDETAILHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to versionDetail. 
	 * @param value the item to add to versionDetail
	 */
	public void addToVersionDetail(final VersionDetail value)
	{
		addToVersionDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from versionDetail. 
	 * @param value the item to remove from versionDetail
	 */
	public void removeFromVersionDetail(final SessionContext ctx, final VersionDetail value)
	{
		VERSIONDETAILHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from versionDetail. 
	 * @param value the item to remove from versionDetail
	 */
	public void removeFromVersionDetail(final VersionDetail value)
	{
		removeFromVersionDetail( getSession().getSessionContext(), value );
	}
	
}
