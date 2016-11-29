/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.masterdata.core.fiancials.jalo;

import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.masterdata.core.fiancials.jalo.ServiceTaxDetails ServiceTaxDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedServiceTaxDetails extends GenericItem
{
	/** Qualifier of the <code>ServiceTaxDetails.serviceTaxEligibilty</code> attribute **/
	public static final String SERVICETAXELIGIBILTY = "serviceTaxEligibilty";
	/** Qualifier of the <code>ServiceTaxDetails.serviceTaxNo</code> attribute **/
	public static final String SERVICETAXNO = "serviceTaxNo";
	/** Qualifier of the <code>ServiceTaxDetails.documentType</code> attribute **/
	public static final String DOCUMENTTYPE = "documentType";
	/** Qualifier of the <code>ServiceTaxDetails.medias</code> attribute **/
	public static final String MEDIAS = "medias";
	/**
	* {@link OneToManyHandler} for handling 1:n MEDIAS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Media> MEDIASHANDLER = new OneToManyHandler<Media>(
	CoreConstants.TC.MEDIA,
	true,
	"serviceTaxDetails",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SERVICETAXELIGIBILTY, AttributeMode.INITIAL);
		tmp.put(SERVICETAXNO, AttributeMode.INITIAL);
		tmp.put(DOCUMENTTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceTaxDetails.documentType</code> attribute.
	 * @return the documentType
	 */
	public String getDocumentType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DOCUMENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceTaxDetails.documentType</code> attribute.
	 * @return the documentType
	 */
	public String getDocumentType()
	{
		return getDocumentType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceTaxDetails.documentType</code> attribute. 
	 * @param value the documentType
	 */
	public void setDocumentType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DOCUMENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceTaxDetails.documentType</code> attribute. 
	 * @param value the documentType
	 */
	public void setDocumentType(final String value)
	{
		setDocumentType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceTaxDetails.medias</code> attribute.
	 * @return the medias
	 */
	public Collection<Media> getMedias(final SessionContext ctx)
	{
		return MEDIASHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceTaxDetails.medias</code> attribute.
	 * @return the medias
	 */
	public Collection<Media> getMedias()
	{
		return getMedias( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceTaxDetails.medias</code> attribute. 
	 * @param value the medias
	 */
	public void setMedias(final SessionContext ctx, final Collection<Media> value)
	{
		MEDIASHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceTaxDetails.medias</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>ServiceTaxDetails.serviceTaxEligibilty</code> attribute.
	 * @return the serviceTaxEligibilty
	 */
	public Boolean isServiceTaxEligibilty(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SERVICETAXELIGIBILTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceTaxDetails.serviceTaxEligibilty</code> attribute.
	 * @return the serviceTaxEligibilty
	 */
	public Boolean isServiceTaxEligibilty()
	{
		return isServiceTaxEligibilty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceTaxDetails.serviceTaxEligibilty</code> attribute. 
	 * @return the serviceTaxEligibilty
	 */
	public boolean isServiceTaxEligibiltyAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isServiceTaxEligibilty( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceTaxDetails.serviceTaxEligibilty</code> attribute. 
	 * @return the serviceTaxEligibilty
	 */
	public boolean isServiceTaxEligibiltyAsPrimitive()
	{
		return isServiceTaxEligibiltyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceTaxDetails.serviceTaxEligibilty</code> attribute. 
	 * @param value the serviceTaxEligibilty
	 */
	public void setServiceTaxEligibilty(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SERVICETAXELIGIBILTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceTaxDetails.serviceTaxEligibilty</code> attribute. 
	 * @param value the serviceTaxEligibilty
	 */
	public void setServiceTaxEligibilty(final Boolean value)
	{
		setServiceTaxEligibilty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceTaxDetails.serviceTaxEligibilty</code> attribute. 
	 * @param value the serviceTaxEligibilty
	 */
	public void setServiceTaxEligibilty(final SessionContext ctx, final boolean value)
	{
		setServiceTaxEligibilty( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceTaxDetails.serviceTaxEligibilty</code> attribute. 
	 * @param value the serviceTaxEligibilty
	 */
	public void setServiceTaxEligibilty(final boolean value)
	{
		setServiceTaxEligibilty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceTaxDetails.serviceTaxNo</code> attribute.
	 * @return the serviceTaxNo
	 */
	public String getServiceTaxNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SERVICETAXNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceTaxDetails.serviceTaxNo</code> attribute.
	 * @return the serviceTaxNo
	 */
	public String getServiceTaxNo()
	{
		return getServiceTaxNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceTaxDetails.serviceTaxNo</code> attribute. 
	 * @param value the serviceTaxNo
	 */
	public void setServiceTaxNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SERVICETAXNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceTaxDetails.serviceTaxNo</code> attribute. 
	 * @param value the serviceTaxNo
	 */
	public void setServiceTaxNo(final String value)
	{
		setServiceTaxNo( getSession().getSessionContext(), value );
	}
	
}
