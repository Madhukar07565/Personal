/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.jalo.DocumentSetting;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.FormAndAttachment FormAndAttachment}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFormAndAttachment extends GenericItem
{
	/** Qualifier of the <code>FormAndAttachment.uploadForm</code> attribute **/
	public static final String UPLOADFORM = "uploadForm";
	/** Qualifier of the <code>FormAndAttachment.attachTemplate</code> attribute **/
	public static final String ATTACHTEMPLATE = "attachTemplate";
	/** Qualifier of the <code>FormAndAttachment.filePath</code> attribute **/
	public static final String FILEPATH = "filePath";
	/** Qualifier of the <code>FormAndAttachment.documentSetting</code> attribute **/
	public static final String DOCUMENTSETTING = "documentSetting";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n DOCUMENTSETTING's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedFormAndAttachment> DOCUMENTSETTINGHANDLER = new BidirectionalOneToManyHandler<GeneratedFormAndAttachment>(
	ClientconfigConstants.TC.FORMANDATTACHMENT,
	false,
	"documentSetting",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(UPLOADFORM, AttributeMode.INITIAL);
		tmp.put(ATTACHTEMPLATE, AttributeMode.INITIAL);
		tmp.put(FILEPATH, AttributeMode.INITIAL);
		tmp.put(DOCUMENTSETTING, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FormAndAttachment.attachTemplate</code> attribute.
	 * @return the attachTemplate
	 */
	public Boolean isAttachTemplate(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ATTACHTEMPLATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FormAndAttachment.attachTemplate</code> attribute.
	 * @return the attachTemplate
	 */
	public Boolean isAttachTemplate()
	{
		return isAttachTemplate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FormAndAttachment.attachTemplate</code> attribute. 
	 * @return the attachTemplate
	 */
	public boolean isAttachTemplateAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAttachTemplate( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FormAndAttachment.attachTemplate</code> attribute. 
	 * @return the attachTemplate
	 */
	public boolean isAttachTemplateAsPrimitive()
	{
		return isAttachTemplateAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FormAndAttachment.attachTemplate</code> attribute. 
	 * @param value the attachTemplate
	 */
	public void setAttachTemplate(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ATTACHTEMPLATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FormAndAttachment.attachTemplate</code> attribute. 
	 * @param value the attachTemplate
	 */
	public void setAttachTemplate(final Boolean value)
	{
		setAttachTemplate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FormAndAttachment.attachTemplate</code> attribute. 
	 * @param value the attachTemplate
	 */
	public void setAttachTemplate(final SessionContext ctx, final boolean value)
	{
		setAttachTemplate( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FormAndAttachment.attachTemplate</code> attribute. 
	 * @param value the attachTemplate
	 */
	public void setAttachTemplate(final boolean value)
	{
		setAttachTemplate( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		DOCUMENTSETTINGHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FormAndAttachment.documentSetting</code> attribute.
	 * @return the documentSetting
	 */
	public DocumentSetting getDocumentSetting(final SessionContext ctx)
	{
		return (DocumentSetting)getProperty( ctx, DOCUMENTSETTING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FormAndAttachment.documentSetting</code> attribute.
	 * @return the documentSetting
	 */
	public DocumentSetting getDocumentSetting()
	{
		return getDocumentSetting( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FormAndAttachment.documentSetting</code> attribute. 
	 * @param value the documentSetting
	 */
	public void setDocumentSetting(final SessionContext ctx, final DocumentSetting value)
	{
		DOCUMENTSETTINGHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FormAndAttachment.documentSetting</code> attribute. 
	 * @param value the documentSetting
	 */
	public void setDocumentSetting(final DocumentSetting value)
	{
		setDocumentSetting( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FormAndAttachment.filePath</code> attribute.
	 * @return the filePath - Client Document Handling File Path
	 */
	public Media getFilePath(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, FILEPATH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FormAndAttachment.filePath</code> attribute.
	 * @return the filePath - Client Document Handling File Path
	 */
	public Media getFilePath()
	{
		return getFilePath( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FormAndAttachment.filePath</code> attribute. 
	 * @param value the filePath - Client Document Handling File Path
	 */
	public void setFilePath(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, FILEPATH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FormAndAttachment.filePath</code> attribute. 
	 * @param value the filePath - Client Document Handling File Path
	 */
	public void setFilePath(final Media value)
	{
		setFilePath( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FormAndAttachment.uploadForm</code> attribute.
	 * @return the uploadForm
	 */
	public Boolean isUploadForm(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, UPLOADFORM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FormAndAttachment.uploadForm</code> attribute.
	 * @return the uploadForm
	 */
	public Boolean isUploadForm()
	{
		return isUploadForm( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FormAndAttachment.uploadForm</code> attribute. 
	 * @return the uploadForm
	 */
	public boolean isUploadFormAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isUploadForm( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FormAndAttachment.uploadForm</code> attribute. 
	 * @return the uploadForm
	 */
	public boolean isUploadFormAsPrimitive()
	{
		return isUploadFormAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FormAndAttachment.uploadForm</code> attribute. 
	 * @param value the uploadForm
	 */
	public void setUploadForm(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, UPLOADFORM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FormAndAttachment.uploadForm</code> attribute. 
	 * @param value the uploadForm
	 */
	public void setUploadForm(final Boolean value)
	{
		setUploadForm( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FormAndAttachment.uploadForm</code> attribute. 
	 * @param value the uploadForm
	 */
	public void setUploadForm(final SessionContext ctx, final boolean value)
	{
		setUploadForm( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FormAndAttachment.uploadForm</code> attribute. 
	 * @param value the uploadForm
	 */
	public void setUploadForm(final boolean value)
	{
		setUploadForm( getSession().getSessionContext(), value );
	}
	
}
