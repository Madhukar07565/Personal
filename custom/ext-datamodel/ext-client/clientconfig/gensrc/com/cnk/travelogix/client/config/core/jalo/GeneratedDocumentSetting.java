/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.jalo.AbstractProductDocument;
import com.cnk.travelogix.client.config.core.jalo.FormAndAttachment;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
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
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.DocumentSetting DocumentSetting}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDocumentSetting extends GenericItem
{
	/** Qualifier of the <code>DocumentSetting.salesStage</code> attribute **/
	public static final String SALESSTAGE = "salesStage";
	/** Qualifier of the <code>DocumentSetting.documentType</code> attribute **/
	public static final String DOCUMENTTYPE = "documentType";
	/** Qualifier of the <code>DocumentSetting.documentName</code> attribute **/
	public static final String DOCUMENTNAME = "documentName";
	/** Qualifier of the <code>DocumentSetting.documentMandatory</code> attribute **/
	public static final String DOCUMENTMANDATORY = "documentMandatory";
	/** Qualifier of the <code>DocumentSetting.handoverDocumentGeneration</code> attribute **/
	public static final String HANDOVERDOCUMENTGENERATION = "handoverDocumentGeneration";
	/** Qualifier of the <code>DocumentSetting.documentBy</code> attribute **/
	public static final String DOCUMENTBY = "documentBy";
	/** Qualifier of the <code>DocumentSetting.documentAsPer</code> attribute **/
	public static final String DOCUMENTASPER = "documentAsPer";
	/** Qualifier of the <code>DocumentSetting.documentFormat</code> attribute **/
	public static final String DOCUMENTFORMAT = "documentFormat";
	/** Qualifier of the <code>DocumentSetting.emailCommunication</code> attribute **/
	public static final String EMAILCOMMUNICATION = "emailCommunication";
	/** Qualifier of the <code>DocumentSetting.smsCommmunication</code> attribute **/
	public static final String SMSCOMMMUNICATION = "smsCommmunication";
	/** Qualifier of the <code>DocumentSetting.courierCommunication</code> attribute **/
	public static final String COURIERCOMMUNICATION = "courierCommunication";
	/** Qualifier of the <code>DocumentSetting.documentCutOffDays</code> attribute **/
	public static final String DOCUMENTCUTOFFDAYS = "documentCutOffDays";
	/** Qualifier of the <code>DocumentSetting.cutOffDaysAndHours</code> attribute **/
	public static final String CUTOFFDAYSANDHOURS = "cutOffDaysAndHours";
	/** Qualifier of the <code>DocumentSetting.cutOffDaysType</code> attribute **/
	public static final String CUTOFFDAYSTYPE = "cutOffDaysType";
	/** Qualifier of the <code>DocumentSetting.autoGenerationHandover</code> attribute **/
	public static final String AUTOGENERATIONHANDOVER = "autoGenerationHandover";
	/** Qualifier of the <code>DocumentSetting.autoGeHandoverDaysAndHours</code> attribute **/
	public static final String AUTOGEHANDOVERDAYSANDHOURS = "autoGeHandoverDaysAndHours";
	/** Qualifier of the <code>DocumentSetting.autoGenerationHandoverType</code> attribute **/
	public static final String AUTOGENERATIONHANDOVERTYPE = "autoGenerationHandoverType";
	/** Qualifier of the <code>DocumentSetting.handoverDocument</code> attribute **/
	public static final String HANDOVERDOCUMENT = "handoverDocument";
	/** Qualifier of the <code>DocumentSetting.formAndAttachment</code> attribute **/
	public static final String FORMANDATTACHMENT = "formAndAttachment";
	/** Qualifier of the <code>DocumentSetting.abstractProductDocument</code> attribute **/
	public static final String ABSTRACTPRODUCTDOCUMENT = "abstractProductDocument";
	/**
	* {@link OneToManyHandler} for handling 1:n FORMANDATTACHMENT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<FormAndAttachment> FORMANDATTACHMENTHANDLER = new OneToManyHandler<FormAndAttachment>(
	ClientconfigConstants.TC.FORMANDATTACHMENT,
	false,
	"documentSetting",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ABSTRACTPRODUCTDOCUMENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDocumentSetting> ABSTRACTPRODUCTDOCUMENTHANDLER = new BidirectionalOneToManyHandler<GeneratedDocumentSetting>(
	ClientconfigConstants.TC.DOCUMENTSETTING,
	false,
	"abstractProductDocument",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SALESSTAGE, AttributeMode.INITIAL);
		tmp.put(DOCUMENTTYPE, AttributeMode.INITIAL);
		tmp.put(DOCUMENTNAME, AttributeMode.INITIAL);
		tmp.put(DOCUMENTMANDATORY, AttributeMode.INITIAL);
		tmp.put(HANDOVERDOCUMENTGENERATION, AttributeMode.INITIAL);
		tmp.put(DOCUMENTBY, AttributeMode.INITIAL);
		tmp.put(DOCUMENTASPER, AttributeMode.INITIAL);
		tmp.put(DOCUMENTFORMAT, AttributeMode.INITIAL);
		tmp.put(EMAILCOMMUNICATION, AttributeMode.INITIAL);
		tmp.put(SMSCOMMMUNICATION, AttributeMode.INITIAL);
		tmp.put(COURIERCOMMUNICATION, AttributeMode.INITIAL);
		tmp.put(DOCUMENTCUTOFFDAYS, AttributeMode.INITIAL);
		tmp.put(CUTOFFDAYSANDHOURS, AttributeMode.INITIAL);
		tmp.put(CUTOFFDAYSTYPE, AttributeMode.INITIAL);
		tmp.put(AUTOGENERATIONHANDOVER, AttributeMode.INITIAL);
		tmp.put(AUTOGEHANDOVERDAYSANDHOURS, AttributeMode.INITIAL);
		tmp.put(AUTOGENERATIONHANDOVERTYPE, AttributeMode.INITIAL);
		tmp.put(HANDOVERDOCUMENT, AttributeMode.INITIAL);
		tmp.put(ABSTRACTPRODUCTDOCUMENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.abstractProductDocument</code> attribute.
	 * @return the abstractProductDocument
	 */
	public AbstractProductDocument getAbstractProductDocument(final SessionContext ctx)
	{
		return (AbstractProductDocument)getProperty( ctx, ABSTRACTPRODUCTDOCUMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.abstractProductDocument</code> attribute.
	 * @return the abstractProductDocument
	 */
	public AbstractProductDocument getAbstractProductDocument()
	{
		return getAbstractProductDocument( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.abstractProductDocument</code> attribute. 
	 * @param value the abstractProductDocument
	 */
	public void setAbstractProductDocument(final SessionContext ctx, final AbstractProductDocument value)
	{
		ABSTRACTPRODUCTDOCUMENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.abstractProductDocument</code> attribute. 
	 * @param value the abstractProductDocument
	 */
	public void setAbstractProductDocument(final AbstractProductDocument value)
	{
		setAbstractProductDocument( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.autoGeHandoverDaysAndHours</code> attribute.
	 * @return the autoGeHandoverDaysAndHours - Document Setting Auto Gen Handover Cut Off Days And Hours
	 */
	public EnumerationValue getAutoGeHandoverDaysAndHours(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, AUTOGEHANDOVERDAYSANDHOURS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.autoGeHandoverDaysAndHours</code> attribute.
	 * @return the autoGeHandoverDaysAndHours - Document Setting Auto Gen Handover Cut Off Days And Hours
	 */
	public EnumerationValue getAutoGeHandoverDaysAndHours()
	{
		return getAutoGeHandoverDaysAndHours( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.autoGeHandoverDaysAndHours</code> attribute. 
	 * @param value the autoGeHandoverDaysAndHours - Document Setting Auto Gen Handover Cut Off Days And Hours
	 */
	public void setAutoGeHandoverDaysAndHours(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, AUTOGEHANDOVERDAYSANDHOURS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.autoGeHandoverDaysAndHours</code> attribute. 
	 * @param value the autoGeHandoverDaysAndHours - Document Setting Auto Gen Handover Cut Off Days And Hours
	 */
	public void setAutoGeHandoverDaysAndHours(final EnumerationValue value)
	{
		setAutoGeHandoverDaysAndHours( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.autoGenerationHandover</code> attribute.
	 * @return the autoGenerationHandover
	 */
	public Boolean isAutoGenerationHandover(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, AUTOGENERATIONHANDOVER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.autoGenerationHandover</code> attribute.
	 * @return the autoGenerationHandover
	 */
	public Boolean isAutoGenerationHandover()
	{
		return isAutoGenerationHandover( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.autoGenerationHandover</code> attribute. 
	 * @return the autoGenerationHandover
	 */
	public boolean isAutoGenerationHandoverAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAutoGenerationHandover( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.autoGenerationHandover</code> attribute. 
	 * @return the autoGenerationHandover
	 */
	public boolean isAutoGenerationHandoverAsPrimitive()
	{
		return isAutoGenerationHandoverAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.autoGenerationHandover</code> attribute. 
	 * @param value the autoGenerationHandover
	 */
	public void setAutoGenerationHandover(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, AUTOGENERATIONHANDOVER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.autoGenerationHandover</code> attribute. 
	 * @param value the autoGenerationHandover
	 */
	public void setAutoGenerationHandover(final Boolean value)
	{
		setAutoGenerationHandover( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.autoGenerationHandover</code> attribute. 
	 * @param value the autoGenerationHandover
	 */
	public void setAutoGenerationHandover(final SessionContext ctx, final boolean value)
	{
		setAutoGenerationHandover( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.autoGenerationHandover</code> attribute. 
	 * @param value the autoGenerationHandover
	 */
	public void setAutoGenerationHandover(final boolean value)
	{
		setAutoGenerationHandover( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.autoGenerationHandoverType</code> attribute.
	 * @return the autoGenerationHandoverType - Document Setting Auto Gen Handover Cut Off Days Type
	 */
	public EnumerationValue getAutoGenerationHandoverType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, AUTOGENERATIONHANDOVERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.autoGenerationHandoverType</code> attribute.
	 * @return the autoGenerationHandoverType - Document Setting Auto Gen Handover Cut Off Days Type
	 */
	public EnumerationValue getAutoGenerationHandoverType()
	{
		return getAutoGenerationHandoverType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.autoGenerationHandoverType</code> attribute. 
	 * @param value the autoGenerationHandoverType - Document Setting Auto Gen Handover Cut Off Days Type
	 */
	public void setAutoGenerationHandoverType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, AUTOGENERATIONHANDOVERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.autoGenerationHandoverType</code> attribute. 
	 * @param value the autoGenerationHandoverType - Document Setting Auto Gen Handover Cut Off Days Type
	 */
	public void setAutoGenerationHandoverType(final EnumerationValue value)
	{
		setAutoGenerationHandoverType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.courierCommunication</code> attribute.
	 * @return the courierCommunication
	 */
	public Boolean isCourierCommunication(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, COURIERCOMMUNICATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.courierCommunication</code> attribute.
	 * @return the courierCommunication
	 */
	public Boolean isCourierCommunication()
	{
		return isCourierCommunication( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.courierCommunication</code> attribute. 
	 * @return the courierCommunication
	 */
	public boolean isCourierCommunicationAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isCourierCommunication( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.courierCommunication</code> attribute. 
	 * @return the courierCommunication
	 */
	public boolean isCourierCommunicationAsPrimitive()
	{
		return isCourierCommunicationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.courierCommunication</code> attribute. 
	 * @param value the courierCommunication
	 */
	public void setCourierCommunication(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, COURIERCOMMUNICATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.courierCommunication</code> attribute. 
	 * @param value the courierCommunication
	 */
	public void setCourierCommunication(final Boolean value)
	{
		setCourierCommunication( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.courierCommunication</code> attribute. 
	 * @param value the courierCommunication
	 */
	public void setCourierCommunication(final SessionContext ctx, final boolean value)
	{
		setCourierCommunication( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.courierCommunication</code> attribute. 
	 * @param value the courierCommunication
	 */
	public void setCourierCommunication(final boolean value)
	{
		setCourierCommunication( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ABSTRACTPRODUCTDOCUMENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.cutOffDaysAndHours</code> attribute.
	 * @return the cutOffDaysAndHours - Document Setting Cut Off Days And Hours
	 */
	public EnumerationValue getCutOffDaysAndHours(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CUTOFFDAYSANDHOURS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.cutOffDaysAndHours</code> attribute.
	 * @return the cutOffDaysAndHours - Document Setting Cut Off Days And Hours
	 */
	public EnumerationValue getCutOffDaysAndHours()
	{
		return getCutOffDaysAndHours( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.cutOffDaysAndHours</code> attribute. 
	 * @param value the cutOffDaysAndHours - Document Setting Cut Off Days And Hours
	 */
	public void setCutOffDaysAndHours(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CUTOFFDAYSANDHOURS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.cutOffDaysAndHours</code> attribute. 
	 * @param value the cutOffDaysAndHours - Document Setting Cut Off Days And Hours
	 */
	public void setCutOffDaysAndHours(final EnumerationValue value)
	{
		setCutOffDaysAndHours( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.cutOffDaysType</code> attribute.
	 * @return the cutOffDaysType - Document Setting Cut Off Days Type
	 */
	public EnumerationValue getCutOffDaysType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CUTOFFDAYSTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.cutOffDaysType</code> attribute.
	 * @return the cutOffDaysType - Document Setting Cut Off Days Type
	 */
	public EnumerationValue getCutOffDaysType()
	{
		return getCutOffDaysType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.cutOffDaysType</code> attribute. 
	 * @param value the cutOffDaysType - Document Setting Cut Off Days Type
	 */
	public void setCutOffDaysType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CUTOFFDAYSTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.cutOffDaysType</code> attribute. 
	 * @param value the cutOffDaysType - Document Setting Cut Off Days Type
	 */
	public void setCutOffDaysType(final EnumerationValue value)
	{
		setCutOffDaysType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.documentAsPer</code> attribute.
	 * @return the documentAsPer - Document Setting As per
	 */
	public EnumerationValue getDocumentAsPer(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DOCUMENTASPER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.documentAsPer</code> attribute.
	 * @return the documentAsPer - Document Setting As per
	 */
	public EnumerationValue getDocumentAsPer()
	{
		return getDocumentAsPer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.documentAsPer</code> attribute. 
	 * @param value the documentAsPer - Document Setting As per
	 */
	public void setDocumentAsPer(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DOCUMENTASPER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.documentAsPer</code> attribute. 
	 * @param value the documentAsPer - Document Setting As per
	 */
	public void setDocumentAsPer(final EnumerationValue value)
	{
		setDocumentAsPer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.documentBy</code> attribute.
	 * @return the documentBy - Document By Setting
	 */
	public EnumerationValue getDocumentBy(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DOCUMENTBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.documentBy</code> attribute.
	 * @return the documentBy - Document By Setting
	 */
	public EnumerationValue getDocumentBy()
	{
		return getDocumentBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.documentBy</code> attribute. 
	 * @param value the documentBy - Document By Setting
	 */
	public void setDocumentBy(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DOCUMENTBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.documentBy</code> attribute. 
	 * @param value the documentBy - Document By Setting
	 */
	public void setDocumentBy(final EnumerationValue value)
	{
		setDocumentBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.documentCutOffDays</code> attribute.
	 * @return the documentCutOffDays - Document Setting Cut Off Days
	 */
	public Integer getDocumentCutOffDays(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DOCUMENTCUTOFFDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.documentCutOffDays</code> attribute.
	 * @return the documentCutOffDays - Document Setting Cut Off Days
	 */
	public Integer getDocumentCutOffDays()
	{
		return getDocumentCutOffDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.documentCutOffDays</code> attribute. 
	 * @return the documentCutOffDays - Document Setting Cut Off Days
	 */
	public int getDocumentCutOffDaysAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDocumentCutOffDays( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.documentCutOffDays</code> attribute. 
	 * @return the documentCutOffDays - Document Setting Cut Off Days
	 */
	public int getDocumentCutOffDaysAsPrimitive()
	{
		return getDocumentCutOffDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.documentCutOffDays</code> attribute. 
	 * @param value the documentCutOffDays - Document Setting Cut Off Days
	 */
	public void setDocumentCutOffDays(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DOCUMENTCUTOFFDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.documentCutOffDays</code> attribute. 
	 * @param value the documentCutOffDays - Document Setting Cut Off Days
	 */
	public void setDocumentCutOffDays(final Integer value)
	{
		setDocumentCutOffDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.documentCutOffDays</code> attribute. 
	 * @param value the documentCutOffDays - Document Setting Cut Off Days
	 */
	public void setDocumentCutOffDays(final SessionContext ctx, final int value)
	{
		setDocumentCutOffDays( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.documentCutOffDays</code> attribute. 
	 * @param value the documentCutOffDays - Document Setting Cut Off Days
	 */
	public void setDocumentCutOffDays(final int value)
	{
		setDocumentCutOffDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.documentFormat</code> attribute.
	 * @return the documentFormat - Document Format
	 */
	public EnumerationValue getDocumentFormat(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DOCUMENTFORMAT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.documentFormat</code> attribute.
	 * @return the documentFormat - Document Format
	 */
	public EnumerationValue getDocumentFormat()
	{
		return getDocumentFormat( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.documentFormat</code> attribute. 
	 * @param value the documentFormat - Document Format
	 */
	public void setDocumentFormat(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DOCUMENTFORMAT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.documentFormat</code> attribute. 
	 * @param value the documentFormat - Document Format
	 */
	public void setDocumentFormat(final EnumerationValue value)
	{
		setDocumentFormat( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.documentMandatory</code> attribute.
	 * @return the documentMandatory
	 */
	public Boolean isDocumentMandatory(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DOCUMENTMANDATORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.documentMandatory</code> attribute.
	 * @return the documentMandatory
	 */
	public Boolean isDocumentMandatory()
	{
		return isDocumentMandatory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.documentMandatory</code> attribute. 
	 * @return the documentMandatory
	 */
	public boolean isDocumentMandatoryAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDocumentMandatory( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.documentMandatory</code> attribute. 
	 * @return the documentMandatory
	 */
	public boolean isDocumentMandatoryAsPrimitive()
	{
		return isDocumentMandatoryAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.documentMandatory</code> attribute. 
	 * @param value the documentMandatory
	 */
	public void setDocumentMandatory(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DOCUMENTMANDATORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.documentMandatory</code> attribute. 
	 * @param value the documentMandatory
	 */
	public void setDocumentMandatory(final Boolean value)
	{
		setDocumentMandatory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.documentMandatory</code> attribute. 
	 * @param value the documentMandatory
	 */
	public void setDocumentMandatory(final SessionContext ctx, final boolean value)
	{
		setDocumentMandatory( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.documentMandatory</code> attribute. 
	 * @param value the documentMandatory
	 */
	public void setDocumentMandatory(final boolean value)
	{
		setDocumentMandatory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.documentName</code> attribute.
	 * @return the documentName - Client Handling Document Name
	 */
	public EnumerationValue getDocumentName(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DOCUMENTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.documentName</code> attribute.
	 * @return the documentName - Client Handling Document Name
	 */
	public EnumerationValue getDocumentName()
	{
		return getDocumentName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.documentName</code> attribute. 
	 * @param value the documentName - Client Handling Document Name
	 */
	public void setDocumentName(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DOCUMENTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.documentName</code> attribute. 
	 * @param value the documentName - Client Handling Document Name
	 */
	public void setDocumentName(final EnumerationValue value)
	{
		setDocumentName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.documentType</code> attribute.
	 * @return the documentType - Client Handling Document Type
	 */
	public EnumerationValue getDocumentType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DOCUMENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.documentType</code> attribute.
	 * @return the documentType - Client Handling Document Type
	 */
	public EnumerationValue getDocumentType()
	{
		return getDocumentType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.documentType</code> attribute. 
	 * @param value the documentType - Client Handling Document Type
	 */
	public void setDocumentType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DOCUMENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.documentType</code> attribute. 
	 * @param value the documentType - Client Handling Document Type
	 */
	public void setDocumentType(final EnumerationValue value)
	{
		setDocumentType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.emailCommunication</code> attribute.
	 * @return the emailCommunication
	 */
	public Boolean isEmailCommunication(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, EMAILCOMMUNICATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.emailCommunication</code> attribute.
	 * @return the emailCommunication
	 */
	public Boolean isEmailCommunication()
	{
		return isEmailCommunication( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.emailCommunication</code> attribute. 
	 * @return the emailCommunication
	 */
	public boolean isEmailCommunicationAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isEmailCommunication( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.emailCommunication</code> attribute. 
	 * @return the emailCommunication
	 */
	public boolean isEmailCommunicationAsPrimitive()
	{
		return isEmailCommunicationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.emailCommunication</code> attribute. 
	 * @param value the emailCommunication
	 */
	public void setEmailCommunication(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, EMAILCOMMUNICATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.emailCommunication</code> attribute. 
	 * @param value the emailCommunication
	 */
	public void setEmailCommunication(final Boolean value)
	{
		setEmailCommunication( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.emailCommunication</code> attribute. 
	 * @param value the emailCommunication
	 */
	public void setEmailCommunication(final SessionContext ctx, final boolean value)
	{
		setEmailCommunication( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.emailCommunication</code> attribute. 
	 * @param value the emailCommunication
	 */
	public void setEmailCommunication(final boolean value)
	{
		setEmailCommunication( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.formAndAttachment</code> attribute.
	 * @return the formAndAttachment
	 */
	public Collection<FormAndAttachment> getFormAndAttachment(final SessionContext ctx)
	{
		return FORMANDATTACHMENTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.formAndAttachment</code> attribute.
	 * @return the formAndAttachment
	 */
	public Collection<FormAndAttachment> getFormAndAttachment()
	{
		return getFormAndAttachment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.formAndAttachment</code> attribute. 
	 * @param value the formAndAttachment
	 */
	public void setFormAndAttachment(final SessionContext ctx, final Collection<FormAndAttachment> value)
	{
		FORMANDATTACHMENTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.formAndAttachment</code> attribute. 
	 * @param value the formAndAttachment
	 */
	public void setFormAndAttachment(final Collection<FormAndAttachment> value)
	{
		setFormAndAttachment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to formAndAttachment. 
	 * @param value the item to add to formAndAttachment
	 */
	public void addToFormAndAttachment(final SessionContext ctx, final FormAndAttachment value)
	{
		FORMANDATTACHMENTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to formAndAttachment. 
	 * @param value the item to add to formAndAttachment
	 */
	public void addToFormAndAttachment(final FormAndAttachment value)
	{
		addToFormAndAttachment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from formAndAttachment. 
	 * @param value the item to remove from formAndAttachment
	 */
	public void removeFromFormAndAttachment(final SessionContext ctx, final FormAndAttachment value)
	{
		FORMANDATTACHMENTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from formAndAttachment. 
	 * @param value the item to remove from formAndAttachment
	 */
	public void removeFromFormAndAttachment(final FormAndAttachment value)
	{
		removeFromFormAndAttachment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.handoverDocument</code> attribute.
	 * @return the handoverDocument
	 */
	public Boolean isHandoverDocument(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, HANDOVERDOCUMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.handoverDocument</code> attribute.
	 * @return the handoverDocument
	 */
	public Boolean isHandoverDocument()
	{
		return isHandoverDocument( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.handoverDocument</code> attribute. 
	 * @return the handoverDocument
	 */
	public boolean isHandoverDocumentAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isHandoverDocument( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.handoverDocument</code> attribute. 
	 * @return the handoverDocument
	 */
	public boolean isHandoverDocumentAsPrimitive()
	{
		return isHandoverDocumentAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.handoverDocument</code> attribute. 
	 * @param value the handoverDocument
	 */
	public void setHandoverDocument(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, HANDOVERDOCUMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.handoverDocument</code> attribute. 
	 * @param value the handoverDocument
	 */
	public void setHandoverDocument(final Boolean value)
	{
		setHandoverDocument( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.handoverDocument</code> attribute. 
	 * @param value the handoverDocument
	 */
	public void setHandoverDocument(final SessionContext ctx, final boolean value)
	{
		setHandoverDocument( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.handoverDocument</code> attribute. 
	 * @param value the handoverDocument
	 */
	public void setHandoverDocument(final boolean value)
	{
		setHandoverDocument( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.handoverDocumentGeneration</code> attribute.
	 * @return the handoverDocumentGeneration
	 */
	public Boolean isHandoverDocumentGeneration(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, HANDOVERDOCUMENTGENERATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.handoverDocumentGeneration</code> attribute.
	 * @return the handoverDocumentGeneration
	 */
	public Boolean isHandoverDocumentGeneration()
	{
		return isHandoverDocumentGeneration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.handoverDocumentGeneration</code> attribute. 
	 * @return the handoverDocumentGeneration
	 */
	public boolean isHandoverDocumentGenerationAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isHandoverDocumentGeneration( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.handoverDocumentGeneration</code> attribute. 
	 * @return the handoverDocumentGeneration
	 */
	public boolean isHandoverDocumentGenerationAsPrimitive()
	{
		return isHandoverDocumentGenerationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.handoverDocumentGeneration</code> attribute. 
	 * @param value the handoverDocumentGeneration
	 */
	public void setHandoverDocumentGeneration(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, HANDOVERDOCUMENTGENERATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.handoverDocumentGeneration</code> attribute. 
	 * @param value the handoverDocumentGeneration
	 */
	public void setHandoverDocumentGeneration(final Boolean value)
	{
		setHandoverDocumentGeneration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.handoverDocumentGeneration</code> attribute. 
	 * @param value the handoverDocumentGeneration
	 */
	public void setHandoverDocumentGeneration(final SessionContext ctx, final boolean value)
	{
		setHandoverDocumentGeneration( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.handoverDocumentGeneration</code> attribute. 
	 * @param value the handoverDocumentGeneration
	 */
	public void setHandoverDocumentGeneration(final boolean value)
	{
		setHandoverDocumentGeneration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.salesStage</code> attribute.
	 * @return the salesStage - Client Handling Document Sales Stage
	 */
	public EnumerationValue getSalesStage(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SALESSTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.salesStage</code> attribute.
	 * @return the salesStage - Client Handling Document Sales Stage
	 */
	public EnumerationValue getSalesStage()
	{
		return getSalesStage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.salesStage</code> attribute. 
	 * @param value the salesStage - Client Handling Document Sales Stage
	 */
	public void setSalesStage(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SALESSTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.salesStage</code> attribute. 
	 * @param value the salesStage - Client Handling Document Sales Stage
	 */
	public void setSalesStage(final EnumerationValue value)
	{
		setSalesStage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.smsCommmunication</code> attribute.
	 * @return the smsCommmunication
	 */
	public Boolean isSmsCommmunication(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SMSCOMMMUNICATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.smsCommmunication</code> attribute.
	 * @return the smsCommmunication
	 */
	public Boolean isSmsCommmunication()
	{
		return isSmsCommmunication( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.smsCommmunication</code> attribute. 
	 * @return the smsCommmunication
	 */
	public boolean isSmsCommmunicationAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSmsCommmunication( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentSetting.smsCommmunication</code> attribute. 
	 * @return the smsCommmunication
	 */
	public boolean isSmsCommmunicationAsPrimitive()
	{
		return isSmsCommmunicationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.smsCommmunication</code> attribute. 
	 * @param value the smsCommmunication
	 */
	public void setSmsCommmunication(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SMSCOMMMUNICATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.smsCommmunication</code> attribute. 
	 * @param value the smsCommmunication
	 */
	public void setSmsCommmunication(final Boolean value)
	{
		setSmsCommmunication( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.smsCommmunication</code> attribute. 
	 * @param value the smsCommmunication
	 */
	public void setSmsCommmunication(final SessionContext ctx, final boolean value)
	{
		setSmsCommmunication( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentSetting.smsCommmunication</code> attribute. 
	 * @param value the smsCommmunication
	 */
	public void setSmsCommmunication(final boolean value)
	{
		setSmsCommmunication( getSession().getSessionContext(), value );
	}
	
}
