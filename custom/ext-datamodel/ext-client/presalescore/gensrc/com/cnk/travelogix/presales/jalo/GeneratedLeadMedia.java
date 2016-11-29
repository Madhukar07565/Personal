/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.presales.jalo;

import com.cnk.travelogix.presales.core.constants.PresalescoreConstants;
import com.cnk.travelogix.presales.jalo.Lead;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.GenericItem;
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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.presales.jalo.LeadMedia LeadMedia}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedLeadMedia extends GenericItem
{
	/** Qualifier of the <code>LeadMedia.documentUid</code> attribute **/
	public static final String DOCUMENTUID = "documentUid";
	/** Qualifier of the <code>LeadMedia.documentType</code> attribute **/
	public static final String DOCUMENTTYPE = "documentType";
	/** Qualifier of the <code>LeadMedia.documentCategory</code> attribute **/
	public static final String DOCUMENTCATEGORY = "documentCategory";
	/** Qualifier of the <code>LeadMedia.documentDescription</code> attribute **/
	public static final String DOCUMENTDESCRIPTION = "documentDescription";
	/** Qualifier of the <code>LeadMedia.documentSignedOn</code> attribute **/
	public static final String DOCUMENTSIGNEDON = "documentSignedOn";
	/** Qualifier of the <code>LeadMedia.documentUploads</code> attribute **/
	public static final String DOCUMENTUPLOADS = "documentUploads";
	/** Qualifier of the <code>LeadMedia.lead</code> attribute **/
	public static final String LEAD = "lead";
	/**
	* {@link OneToManyHandler} for handling 1:n DOCUMENTUPLOADS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Media> DOCUMENTUPLOADSHANDLER = new OneToManyHandler<Media>(
	CoreConstants.TC.MEDIA,
	false,
	"leadMedia",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n LEAD's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedLeadMedia> LEADHANDLER = new BidirectionalOneToManyHandler<GeneratedLeadMedia>(
	PresalescoreConstants.TC.LEADMEDIA,
	false,
	"lead",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DOCUMENTUID, AttributeMode.INITIAL);
		tmp.put(DOCUMENTTYPE, AttributeMode.INITIAL);
		tmp.put(DOCUMENTCATEGORY, AttributeMode.INITIAL);
		tmp.put(DOCUMENTDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(DOCUMENTSIGNEDON, AttributeMode.INITIAL);
		tmp.put(LEAD, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		LEADHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LeadMedia.documentCategory</code> attribute.
	 * @return the documentCategory - Document Category for LeadMedia
	 */
	public EnumerationValue getDocumentCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DOCUMENTCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LeadMedia.documentCategory</code> attribute.
	 * @return the documentCategory - Document Category for LeadMedia
	 */
	public EnumerationValue getDocumentCategory()
	{
		return getDocumentCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LeadMedia.documentCategory</code> attribute. 
	 * @param value the documentCategory - Document Category for LeadMedia
	 */
	public void setDocumentCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DOCUMENTCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LeadMedia.documentCategory</code> attribute. 
	 * @param value the documentCategory - Document Category for LeadMedia
	 */
	public void setDocumentCategory(final EnumerationValue value)
	{
		setDocumentCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LeadMedia.documentDescription</code> attribute.
	 * @return the documentDescription - Document Description for LeadMedia
	 */
	public String getDocumentDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DOCUMENTDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LeadMedia.documentDescription</code> attribute.
	 * @return the documentDescription - Document Description for LeadMedia
	 */
	public String getDocumentDescription()
	{
		return getDocumentDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LeadMedia.documentDescription</code> attribute. 
	 * @param value the documentDescription - Document Description for LeadMedia
	 */
	public void setDocumentDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DOCUMENTDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LeadMedia.documentDescription</code> attribute. 
	 * @param value the documentDescription - Document Description for LeadMedia
	 */
	public void setDocumentDescription(final String value)
	{
		setDocumentDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LeadMedia.documentSignedOn</code> attribute.
	 * @return the documentSignedOn - Document Signed On Date
	 */
	public Date getDocumentSignedOn(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DOCUMENTSIGNEDON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LeadMedia.documentSignedOn</code> attribute.
	 * @return the documentSignedOn - Document Signed On Date
	 */
	public Date getDocumentSignedOn()
	{
		return getDocumentSignedOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LeadMedia.documentSignedOn</code> attribute. 
	 * @param value the documentSignedOn - Document Signed On Date
	 */
	public void setDocumentSignedOn(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DOCUMENTSIGNEDON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LeadMedia.documentSignedOn</code> attribute. 
	 * @param value the documentSignedOn - Document Signed On Date
	 */
	public void setDocumentSignedOn(final Date value)
	{
		setDocumentSignedOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LeadMedia.documentType</code> attribute.
	 * @return the documentType - Document Type for Lead Media
	 */
	public EnumerationValue getDocumentType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DOCUMENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LeadMedia.documentType</code> attribute.
	 * @return the documentType - Document Type for Lead Media
	 */
	public EnumerationValue getDocumentType()
	{
		return getDocumentType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LeadMedia.documentType</code> attribute. 
	 * @param value the documentType - Document Type for Lead Media
	 */
	public void setDocumentType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DOCUMENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LeadMedia.documentType</code> attribute. 
	 * @param value the documentType - Document Type for Lead Media
	 */
	public void setDocumentType(final EnumerationValue value)
	{
		setDocumentType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LeadMedia.documentUid</code> attribute.
	 * @return the documentUid - Id of Document
	 */
	public String getDocumentUid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DOCUMENTUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LeadMedia.documentUid</code> attribute.
	 * @return the documentUid - Id of Document
	 */
	public String getDocumentUid()
	{
		return getDocumentUid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LeadMedia.documentUid</code> attribute. 
	 * @param value the documentUid - Id of Document
	 */
	public void setDocumentUid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DOCUMENTUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LeadMedia.documentUid</code> attribute. 
	 * @param value the documentUid - Id of Document
	 */
	public void setDocumentUid(final String value)
	{
		setDocumentUid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LeadMedia.documentUploads</code> attribute.
	 * @return the documentUploads
	 */
	public Collection<Media> getDocumentUploads(final SessionContext ctx)
	{
		return DOCUMENTUPLOADSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LeadMedia.documentUploads</code> attribute.
	 * @return the documentUploads
	 */
	public Collection<Media> getDocumentUploads()
	{
		return getDocumentUploads( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LeadMedia.documentUploads</code> attribute. 
	 * @param value the documentUploads
	 */
	public void setDocumentUploads(final SessionContext ctx, final Collection<Media> value)
	{
		DOCUMENTUPLOADSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LeadMedia.documentUploads</code> attribute. 
	 * @param value the documentUploads
	 */
	public void setDocumentUploads(final Collection<Media> value)
	{
		setDocumentUploads( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to documentUploads. 
	 * @param value the item to add to documentUploads
	 */
	public void addToDocumentUploads(final SessionContext ctx, final Media value)
	{
		DOCUMENTUPLOADSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to documentUploads. 
	 * @param value the item to add to documentUploads
	 */
	public void addToDocumentUploads(final Media value)
	{
		addToDocumentUploads( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from documentUploads. 
	 * @param value the item to remove from documentUploads
	 */
	public void removeFromDocumentUploads(final SessionContext ctx, final Media value)
	{
		DOCUMENTUPLOADSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from documentUploads. 
	 * @param value the item to remove from documentUploads
	 */
	public void removeFromDocumentUploads(final Media value)
	{
		removeFromDocumentUploads( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LeadMedia.lead</code> attribute.
	 * @return the lead
	 */
	public Lead getLead(final SessionContext ctx)
	{
		return (Lead)getProperty( ctx, LEAD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LeadMedia.lead</code> attribute.
	 * @return the lead
	 */
	public Lead getLead()
	{
		return getLead( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LeadMedia.lead</code> attribute. 
	 * @param value the lead
	 */
	public void setLead(final SessionContext ctx, final Lead value)
	{
		LEADHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LeadMedia.lead</code> attribute. 
	 * @param value the lead
	 */
	public void setLead(final Lead value)
	{
		setLead( getSession().getSessionContext(), value );
	}
	
}
