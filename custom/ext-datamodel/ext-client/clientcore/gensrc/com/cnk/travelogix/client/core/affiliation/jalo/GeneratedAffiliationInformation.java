/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.affiliation.jalo;

import com.cnk.travelogix.client.core.b2bunit.jalo.TravelogixB2BUnit;
import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.affiliation.jalo.AffiliationInformation AffiliationInformation}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAffiliationInformation extends GenericItem
{
	/** Qualifier of the <code>AffiliationInformation.affiliationName</code> attribute **/
	public static final String AFFILIATIONNAME = "affiliationName";
	/** Qualifier of the <code>AffiliationInformation.affiliationSince</code> attribute **/
	public static final String AFFILIATIONSINCE = "affiliationSince";
	/** Qualifier of the <code>AffiliationInformation.registrationNo</code> attribute **/
	public static final String REGISTRATIONNO = "registrationNo";
	/** Qualifier of the <code>AffiliationInformation.remarks</code> attribute **/
	public static final String REMARKS = "remarks";
	/** Qualifier of the <code>AffiliationInformation.travelogixB2BUnit</code> attribute **/
	public static final String TRAVELOGIXB2BUNIT = "travelogixB2BUnit";
	/** Qualifier of the <code>AffiliationInformation.medias</code> attribute **/
	public static final String MEDIAS = "medias";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRAVELOGIXB2BUNIT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAffiliationInformation> TRAVELOGIXB2BUNITHANDLER = new BidirectionalOneToManyHandler<GeneratedAffiliationInformation>(
	ClientcoreConstants.TC.AFFILIATIONINFORMATION,
	false,
	"travelogixB2BUnit",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n MEDIAS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Media> MEDIASHANDLER = new OneToManyHandler<Media>(
	CoreConstants.TC.MEDIA,
	true,
	"affiliationInformation",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(AFFILIATIONNAME, AttributeMode.INITIAL);
		tmp.put(AFFILIATIONSINCE, AttributeMode.INITIAL);
		tmp.put(REGISTRATIONNO, AttributeMode.INITIAL);
		tmp.put(REMARKS, AttributeMode.INITIAL);
		tmp.put(TRAVELOGIXB2BUNIT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffiliationInformation.affiliationName</code> attribute.
	 * @return the affiliationName
	 */
	public EnumerationValue getAffiliationName(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, AFFILIATIONNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffiliationInformation.affiliationName</code> attribute.
	 * @return the affiliationName
	 */
	public EnumerationValue getAffiliationName()
	{
		return getAffiliationName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffiliationInformation.affiliationName</code> attribute. 
	 * @param value the affiliationName
	 */
	public void setAffiliationName(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, AFFILIATIONNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffiliationInformation.affiliationName</code> attribute. 
	 * @param value the affiliationName
	 */
	public void setAffiliationName(final EnumerationValue value)
	{
		setAffiliationName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffiliationInformation.affiliationSince</code> attribute.
	 * @return the affiliationSince
	 */
	public Date getAffiliationSince(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, AFFILIATIONSINCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffiliationInformation.affiliationSince</code> attribute.
	 * @return the affiliationSince
	 */
	public Date getAffiliationSince()
	{
		return getAffiliationSince( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffiliationInformation.affiliationSince</code> attribute. 
	 * @param value the affiliationSince
	 */
	public void setAffiliationSince(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, AFFILIATIONSINCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffiliationInformation.affiliationSince</code> attribute. 
	 * @param value the affiliationSince
	 */
	public void setAffiliationSince(final Date value)
	{
		setAffiliationSince( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TRAVELOGIXB2BUNITHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffiliationInformation.medias</code> attribute.
	 * @return the medias
	 */
	public Set<Media> getMedias(final SessionContext ctx)
	{
		return (Set<Media>)MEDIASHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffiliationInformation.medias</code> attribute.
	 * @return the medias
	 */
	public Set<Media> getMedias()
	{
		return getMedias( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffiliationInformation.medias</code> attribute. 
	 * @param value the medias
	 */
	public void setMedias(final SessionContext ctx, final Set<Media> value)
	{
		MEDIASHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffiliationInformation.medias</code> attribute. 
	 * @param value the medias
	 */
	public void setMedias(final Set<Media> value)
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
	 * <i>Generated method</i> - Getter of the <code>AffiliationInformation.registrationNo</code> attribute.
	 * @return the registrationNo
	 */
	public String getRegistrationNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REGISTRATIONNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffiliationInformation.registrationNo</code> attribute.
	 * @return the registrationNo
	 */
	public String getRegistrationNo()
	{
		return getRegistrationNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffiliationInformation.registrationNo</code> attribute. 
	 * @param value the registrationNo
	 */
	public void setRegistrationNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REGISTRATIONNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffiliationInformation.registrationNo</code> attribute. 
	 * @param value the registrationNo
	 */
	public void setRegistrationNo(final String value)
	{
		setRegistrationNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffiliationInformation.remarks</code> attribute.
	 * @return the remarks
	 */
	public String getRemarks(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAffiliationInformation.getRemarks requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, REMARKS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffiliationInformation.remarks</code> attribute.
	 * @return the remarks
	 */
	public String getRemarks()
	{
		return getRemarks( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffiliationInformation.remarks</code> attribute. 
	 * @return the localized remarks
	 */
	public Map<Language,String> getAllRemarks(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,REMARKS,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffiliationInformation.remarks</code> attribute. 
	 * @return the localized remarks
	 */
	public Map<Language,String> getAllRemarks()
	{
		return getAllRemarks( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffiliationInformation.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setRemarks(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAffiliationInformation.setRemarks requires a session language", 0 );
		}
		setLocalizedProperty(ctx, REMARKS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffiliationInformation.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setRemarks(final String value)
	{
		setRemarks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffiliationInformation.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setAllRemarks(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,REMARKS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffiliationInformation.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setAllRemarks(final Map<Language,String> value)
	{
		setAllRemarks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffiliationInformation.travelogixB2BUnit</code> attribute.
	 * @return the travelogixB2BUnit
	 */
	public TravelogixB2BUnit getTravelogixB2BUnit(final SessionContext ctx)
	{
		return (TravelogixB2BUnit)getProperty( ctx, TRAVELOGIXB2BUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffiliationInformation.travelogixB2BUnit</code> attribute.
	 * @return the travelogixB2BUnit
	 */
	public TravelogixB2BUnit getTravelogixB2BUnit()
	{
		return getTravelogixB2BUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffiliationInformation.travelogixB2BUnit</code> attribute. 
	 * @param value the travelogixB2BUnit
	 */
	public void setTravelogixB2BUnit(final SessionContext ctx, final TravelogixB2BUnit value)
	{
		TRAVELOGIXB2BUNITHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffiliationInformation.travelogixB2BUnit</code> attribute. 
	 * @param value the travelogixB2BUnit
	 */
	public void setTravelogixB2BUnit(final TravelogixB2BUnit value)
	{
		setTravelogixB2BUnit( getSession().getSessionContext(), value );
	}
	
}
