/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.Inclusion;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.Attraction Attraction}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAttraction extends GenericItem
{
	/** Qualifier of the <code>Attraction.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Attraction.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>Attraction.panaromic</code> attribute **/
	public static final String PANAROMIC = "panaromic";
	/** Qualifier of the <code>Attraction.sightSeeing</code> attribute **/
	public static final String SIGHTSEEING = "sightSeeing";
	/** Qualifier of the <code>Attraction.photoSpot</code> attribute **/
	public static final String PHOTOSPOT = "photoSpot";
	/** Qualifier of the <code>Attraction.duration</code> attribute **/
	public static final String DURATION = "duration";
	/** Qualifier of the <code>Attraction.media</code> attribute **/
	public static final String MEDIA = "media";
	/** Qualifier of the <code>Attraction.arrivalTime</code> attribute **/
	public static final String ARRIVALTIME = "arrivalTime";
	/** Qualifier of the <code>Attraction.depTime</code> attribute **/
	public static final String DEPTIME = "depTime";
	/** Qualifier of the <code>Attraction.inclusionAttractions</code> attribute **/
	public static final String INCLUSIONATTRACTIONS = "inclusionAttractions";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n INCLUSIONATTRACTIONS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAttraction> INCLUSIONATTRACTIONSHANDLER = new BidirectionalOneToManyHandler<GeneratedAttraction>(
	ActivityproductmasterscoreConstants.TC.ATTRACTION,
	false,
	"inclusionAttractions",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(PANAROMIC, AttributeMode.INITIAL);
		tmp.put(SIGHTSEEING, AttributeMode.INITIAL);
		tmp.put(PHOTOSPOT, AttributeMode.INITIAL);
		tmp.put(DURATION, AttributeMode.INITIAL);
		tmp.put(MEDIA, AttributeMode.INITIAL);
		tmp.put(ARRIVALTIME, AttributeMode.INITIAL);
		tmp.put(DEPTIME, AttributeMode.INITIAL);
		tmp.put(INCLUSIONATTRACTIONS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Attraction.arrivalTime</code> attribute.
	 * @return the arrivalTime - Arrival time
	 */
	public String getArrivalTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ARRIVALTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Attraction.arrivalTime</code> attribute.
	 * @return the arrivalTime - Arrival time
	 */
	public String getArrivalTime()
	{
		return getArrivalTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Attraction.arrivalTime</code> attribute. 
	 * @param value the arrivalTime - Arrival time
	 */
	public void setArrivalTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ARRIVALTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Attraction.arrivalTime</code> attribute. 
	 * @param value the arrivalTime - Arrival time
	 */
	public void setArrivalTime(final String value)
	{
		setArrivalTime( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		INCLUSIONATTRACTIONSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Attraction.depTime</code> attribute.
	 * @return the depTime - Departure time
	 */
	public String getDepTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DEPTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Attraction.depTime</code> attribute.
	 * @return the depTime - Departure time
	 */
	public String getDepTime()
	{
		return getDepTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Attraction.depTime</code> attribute. 
	 * @param value the depTime - Departure time
	 */
	public void setDepTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DEPTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Attraction.depTime</code> attribute. 
	 * @param value the depTime - Departure time
	 */
	public void setDepTime(final String value)
	{
		setDepTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Attraction.description</code> attribute.
	 * @return the description - Entertainment description
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Attraction.description</code> attribute.
	 * @return the description - Entertainment description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Attraction.description</code> attribute. 
	 * @param value the description - Entertainment description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Attraction.description</code> attribute. 
	 * @param value the description - Entertainment description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Attraction.duration</code> attribute.
	 * @return the duration - Duration
	 */
	public String getDuration(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Attraction.duration</code> attribute.
	 * @return the duration - Duration
	 */
	public String getDuration()
	{
		return getDuration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Attraction.duration</code> attribute. 
	 * @param value the duration - Duration
	 */
	public void setDuration(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DURATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Attraction.duration</code> attribute. 
	 * @param value the duration - Duration
	 */
	public void setDuration(final String value)
	{
		setDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Attraction.inclusionAttractions</code> attribute.
	 * @return the inclusionAttractions
	 */
	public Inclusion getInclusionAttractions(final SessionContext ctx)
	{
		return (Inclusion)getProperty( ctx, INCLUSIONATTRACTIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Attraction.inclusionAttractions</code> attribute.
	 * @return the inclusionAttractions
	 */
	public Inclusion getInclusionAttractions()
	{
		return getInclusionAttractions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Attraction.inclusionAttractions</code> attribute. 
	 * @param value the inclusionAttractions
	 */
	public void setInclusionAttractions(final SessionContext ctx, final Inclusion value)
	{
		INCLUSIONATTRACTIONSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Attraction.inclusionAttractions</code> attribute. 
	 * @param value the inclusionAttractions
	 */
	public void setInclusionAttractions(final Inclusion value)
	{
		setInclusionAttractions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Attraction.media</code> attribute.
	 * @return the media - Is Driver Media
	 */
	public Collection<Media> getMedia(final SessionContext ctx)
	{
		Collection<Media> coll = (Collection<Media>)getProperty( ctx, MEDIA);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Attraction.media</code> attribute.
	 * @return the media - Is Driver Media
	 */
	public Collection<Media> getMedia()
	{
		return getMedia( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Attraction.media</code> attribute. 
	 * @param value the media - Is Driver Media
	 */
	public void setMedia(final SessionContext ctx, final Collection<Media> value)
	{
		setProperty(ctx, MEDIA,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Attraction.media</code> attribute. 
	 * @param value the media - Is Driver Media
	 */
	public void setMedia(final Collection<Media> value)
	{
		setMedia( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Attraction.name</code> attribute.
	 * @return the name - Entertainment name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Attraction.name</code> attribute.
	 * @return the name - Entertainment name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Attraction.name</code> attribute. 
	 * @param value the name - Entertainment name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Attraction.name</code> attribute. 
	 * @param value the name - Entertainment name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Attraction.panaromic</code> attribute.
	 * @return the panaromic - Panaromic
	 */
	public Boolean isPanaromic(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PANAROMIC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Attraction.panaromic</code> attribute.
	 * @return the panaromic - Panaromic
	 */
	public Boolean isPanaromic()
	{
		return isPanaromic( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Attraction.panaromic</code> attribute. 
	 * @return the panaromic - Panaromic
	 */
	public boolean isPanaromicAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPanaromic( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Attraction.panaromic</code> attribute. 
	 * @return the panaromic - Panaromic
	 */
	public boolean isPanaromicAsPrimitive()
	{
		return isPanaromicAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Attraction.panaromic</code> attribute. 
	 * @param value the panaromic - Panaromic
	 */
	public void setPanaromic(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PANAROMIC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Attraction.panaromic</code> attribute. 
	 * @param value the panaromic - Panaromic
	 */
	public void setPanaromic(final Boolean value)
	{
		setPanaromic( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Attraction.panaromic</code> attribute. 
	 * @param value the panaromic - Panaromic
	 */
	public void setPanaromic(final SessionContext ctx, final boolean value)
	{
		setPanaromic( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Attraction.panaromic</code> attribute. 
	 * @param value the panaromic - Panaromic
	 */
	public void setPanaromic(final boolean value)
	{
		setPanaromic( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Attraction.photoSpot</code> attribute.
	 * @return the photoSpot - Photo Spot
	 */
	public Boolean isPhotoSpot(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PHOTOSPOT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Attraction.photoSpot</code> attribute.
	 * @return the photoSpot - Photo Spot
	 */
	public Boolean isPhotoSpot()
	{
		return isPhotoSpot( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Attraction.photoSpot</code> attribute. 
	 * @return the photoSpot - Photo Spot
	 */
	public boolean isPhotoSpotAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPhotoSpot( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Attraction.photoSpot</code> attribute. 
	 * @return the photoSpot - Photo Spot
	 */
	public boolean isPhotoSpotAsPrimitive()
	{
		return isPhotoSpotAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Attraction.photoSpot</code> attribute. 
	 * @param value the photoSpot - Photo Spot
	 */
	public void setPhotoSpot(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PHOTOSPOT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Attraction.photoSpot</code> attribute. 
	 * @param value the photoSpot - Photo Spot
	 */
	public void setPhotoSpot(final Boolean value)
	{
		setPhotoSpot( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Attraction.photoSpot</code> attribute. 
	 * @param value the photoSpot - Photo Spot
	 */
	public void setPhotoSpot(final SessionContext ctx, final boolean value)
	{
		setPhotoSpot( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Attraction.photoSpot</code> attribute. 
	 * @param value the photoSpot - Photo Spot
	 */
	public void setPhotoSpot(final boolean value)
	{
		setPhotoSpot( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Attraction.sightSeeing</code> attribute.
	 * @return the sightSeeing - Sight Seeing
	 */
	public Boolean isSightSeeing(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SIGHTSEEING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Attraction.sightSeeing</code> attribute.
	 * @return the sightSeeing - Sight Seeing
	 */
	public Boolean isSightSeeing()
	{
		return isSightSeeing( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Attraction.sightSeeing</code> attribute. 
	 * @return the sightSeeing - Sight Seeing
	 */
	public boolean isSightSeeingAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSightSeeing( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Attraction.sightSeeing</code> attribute. 
	 * @return the sightSeeing - Sight Seeing
	 */
	public boolean isSightSeeingAsPrimitive()
	{
		return isSightSeeingAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Attraction.sightSeeing</code> attribute. 
	 * @param value the sightSeeing - Sight Seeing
	 */
	public void setSightSeeing(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SIGHTSEEING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Attraction.sightSeeing</code> attribute. 
	 * @param value the sightSeeing - Sight Seeing
	 */
	public void setSightSeeing(final Boolean value)
	{
		setSightSeeing( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Attraction.sightSeeing</code> attribute. 
	 * @param value the sightSeeing - Sight Seeing
	 */
	public void setSightSeeing(final SessionContext ctx, final boolean value)
	{
		setSightSeeing( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Attraction.sightSeeing</code> attribute. 
	 * @param value the sightSeeing - Sight Seeing
	 */
	public void setSightSeeing(final boolean value)
	{
		setSightSeeing( getSession().getSessionContext(), value );
	}
	
}
