/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import com.cnk.travelogix.product.transport.masters.core.jalo.CruiseItinerary;
import com.cnk.travelogix.product.transport.masters.core.jalo.CruisePort;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.transport.masters.core.jalo.ShoreExcursion ShoreExcursion}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedShoreExcursion extends GenericItem
{
	/** Qualifier of the <code>ShoreExcursion.portName</code> attribute **/
	public static final String PORTNAME = "portName";
	/** Qualifier of the <code>ShoreExcursion.excursionCode</code> attribute **/
	public static final String EXCURSIONCODE = "excursionCode";
	/** Qualifier of the <code>ShoreExcursion.excursionType</code> attribute **/
	public static final String EXCURSIONTYPE = "excursionType";
	/** Qualifier of the <code>ShoreExcursion.excursionName</code> attribute **/
	public static final String EXCURSIONNAME = "excursionName";
	/** Qualifier of the <code>ShoreExcursion.duration</code> attribute **/
	public static final String DURATION = "duration";
	/** Qualifier of the <code>ShoreExcursion.difficultyLevel</code> attribute **/
	public static final String DIFFICULTYLEVEL = "difficultyLevel";
	/** Qualifier of the <code>ShoreExcursion.saleble</code> attribute **/
	public static final String SALEBLE = "saleble";
	/** Qualifier of the <code>ShoreExcursion.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>ShoreExcursion.shoreExcursionMedias</code> attribute **/
	public static final String SHOREEXCURSIONMEDIAS = "shoreExcursionMedias";
	/** Qualifier of the <code>ShoreExcursion.itineraries</code> attribute **/
	public static final String ITINERARIES = "itineraries";
	/**
	* {@link OneToManyHandler} for handling 1:n SHOREEXCURSIONMEDIAS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Media> SHOREEXCURSIONMEDIASHANDLER = new OneToManyHandler<Media>(
	CoreConstants.TC.MEDIA,
	true,
	"shoreExcursions",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ITINERARIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CruiseItinerary> ITINERARIESHANDLER = new OneToManyHandler<CruiseItinerary>(
	TransportproductmasterscoreConstants.TC.CRUISEITINERARY,
	true,
	"shoreExcursion",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PORTNAME, AttributeMode.INITIAL);
		tmp.put(EXCURSIONCODE, AttributeMode.INITIAL);
		tmp.put(EXCURSIONTYPE, AttributeMode.INITIAL);
		tmp.put(EXCURSIONNAME, AttributeMode.INITIAL);
		tmp.put(DURATION, AttributeMode.INITIAL);
		tmp.put(DIFFICULTYLEVEL, AttributeMode.INITIAL);
		tmp.put(SALEBLE, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoreExcursion.description</code> attribute.
	 * @return the description - To show the description.
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoreExcursion.description</code> attribute.
	 * @return the description - To show the description.
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoreExcursion.description</code> attribute. 
	 * @param value the description - To show the description.
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoreExcursion.description</code> attribute. 
	 * @param value the description - To show the description.
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoreExcursion.difficultyLevel</code> attribute.
	 * @return the difficultyLevel - To show the DifficultyLevel.
	 */
	public EnumerationValue getDifficultyLevel(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DIFFICULTYLEVEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoreExcursion.difficultyLevel</code> attribute.
	 * @return the difficultyLevel - To show the DifficultyLevel.
	 */
	public EnumerationValue getDifficultyLevel()
	{
		return getDifficultyLevel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoreExcursion.difficultyLevel</code> attribute. 
	 * @param value the difficultyLevel - To show the DifficultyLevel.
	 */
	public void setDifficultyLevel(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DIFFICULTYLEVEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoreExcursion.difficultyLevel</code> attribute. 
	 * @param value the difficultyLevel - To show the DifficultyLevel.
	 */
	public void setDifficultyLevel(final EnumerationValue value)
	{
		setDifficultyLevel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoreExcursion.duration</code> attribute.
	 * @return the duration - To show the duration.
	 */
	public String getDuration(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoreExcursion.duration</code> attribute.
	 * @return the duration - To show the duration.
	 */
	public String getDuration()
	{
		return getDuration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoreExcursion.duration</code> attribute. 
	 * @param value the duration - To show the duration.
	 */
	public void setDuration(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DURATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoreExcursion.duration</code> attribute. 
	 * @param value the duration - To show the duration.
	 */
	public void setDuration(final String value)
	{
		setDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoreExcursion.excursionCode</code> attribute.
	 * @return the excursionCode - To show the excursionCode.
	 */
	public String getExcursionCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EXCURSIONCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoreExcursion.excursionCode</code> attribute.
	 * @return the excursionCode - To show the excursionCode.
	 */
	public String getExcursionCode()
	{
		return getExcursionCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoreExcursion.excursionCode</code> attribute. 
	 * @param value the excursionCode - To show the excursionCode.
	 */
	public void setExcursionCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EXCURSIONCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoreExcursion.excursionCode</code> attribute. 
	 * @param value the excursionCode - To show the excursionCode.
	 */
	public void setExcursionCode(final String value)
	{
		setExcursionCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoreExcursion.excursionName</code> attribute.
	 * @return the excursionName - To show the excursionName.
	 */
	public String getExcursionName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EXCURSIONNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoreExcursion.excursionName</code> attribute.
	 * @return the excursionName - To show the excursionName.
	 */
	public String getExcursionName()
	{
		return getExcursionName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoreExcursion.excursionName</code> attribute. 
	 * @param value the excursionName - To show the excursionName.
	 */
	public void setExcursionName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EXCURSIONNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoreExcursion.excursionName</code> attribute. 
	 * @param value the excursionName - To show the excursionName.
	 */
	public void setExcursionName(final String value)
	{
		setExcursionName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoreExcursion.excursionType</code> attribute.
	 * @return the excursionType - To show the excursionType.
	 */
	public String getExcursionType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EXCURSIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoreExcursion.excursionType</code> attribute.
	 * @return the excursionType - To show the excursionType.
	 */
	public String getExcursionType()
	{
		return getExcursionType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoreExcursion.excursionType</code> attribute. 
	 * @param value the excursionType - To show the excursionType.
	 */
	public void setExcursionType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EXCURSIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoreExcursion.excursionType</code> attribute. 
	 * @param value the excursionType - To show the excursionType.
	 */
	public void setExcursionType(final String value)
	{
		setExcursionType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoreExcursion.itineraries</code> attribute.
	 * @return the itineraries
	 */
	public Collection<CruiseItinerary> getItineraries(final SessionContext ctx)
	{
		return ITINERARIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoreExcursion.itineraries</code> attribute.
	 * @return the itineraries
	 */
	public Collection<CruiseItinerary> getItineraries()
	{
		return getItineraries( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoreExcursion.itineraries</code> attribute. 
	 * @param value the itineraries
	 */
	public void setItineraries(final SessionContext ctx, final Collection<CruiseItinerary> value)
	{
		ITINERARIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoreExcursion.itineraries</code> attribute. 
	 * @param value the itineraries
	 */
	public void setItineraries(final Collection<CruiseItinerary> value)
	{
		setItineraries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to itineraries. 
	 * @param value the item to add to itineraries
	 */
	public void addToItineraries(final SessionContext ctx, final CruiseItinerary value)
	{
		ITINERARIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to itineraries. 
	 * @param value the item to add to itineraries
	 */
	public void addToItineraries(final CruiseItinerary value)
	{
		addToItineraries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from itineraries. 
	 * @param value the item to remove from itineraries
	 */
	public void removeFromItineraries(final SessionContext ctx, final CruiseItinerary value)
	{
		ITINERARIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from itineraries. 
	 * @param value the item to remove from itineraries
	 */
	public void removeFromItineraries(final CruiseItinerary value)
	{
		removeFromItineraries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoreExcursion.portName</code> attribute.
	 * @return the portName - To show the Cruise Port.
	 */
	public CruisePort getPortName(final SessionContext ctx)
	{
		return (CruisePort)getProperty( ctx, PORTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoreExcursion.portName</code> attribute.
	 * @return the portName - To show the Cruise Port.
	 */
	public CruisePort getPortName()
	{
		return getPortName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoreExcursion.portName</code> attribute. 
	 * @param value the portName - To show the Cruise Port.
	 */
	public void setPortName(final SessionContext ctx, final CruisePort value)
	{
		setProperty(ctx, PORTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoreExcursion.portName</code> attribute. 
	 * @param value the portName - To show the Cruise Port.
	 */
	public void setPortName(final CruisePort value)
	{
		setPortName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoreExcursion.saleble</code> attribute.
	 * @return the saleble - To show the saleble.
	 */
	public Boolean isSaleble(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SALEBLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoreExcursion.saleble</code> attribute.
	 * @return the saleble - To show the saleble.
	 */
	public Boolean isSaleble()
	{
		return isSaleble( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoreExcursion.saleble</code> attribute. 
	 * @return the saleble - To show the saleble.
	 */
	public boolean isSalebleAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSaleble( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoreExcursion.saleble</code> attribute. 
	 * @return the saleble - To show the saleble.
	 */
	public boolean isSalebleAsPrimitive()
	{
		return isSalebleAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoreExcursion.saleble</code> attribute. 
	 * @param value the saleble - To show the saleble.
	 */
	public void setSaleble(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SALEBLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoreExcursion.saleble</code> attribute. 
	 * @param value the saleble - To show the saleble.
	 */
	public void setSaleble(final Boolean value)
	{
		setSaleble( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoreExcursion.saleble</code> attribute. 
	 * @param value the saleble - To show the saleble.
	 */
	public void setSaleble(final SessionContext ctx, final boolean value)
	{
		setSaleble( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoreExcursion.saleble</code> attribute. 
	 * @param value the saleble - To show the saleble.
	 */
	public void setSaleble(final boolean value)
	{
		setSaleble( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoreExcursion.shoreExcursionMedias</code> attribute.
	 * @return the shoreExcursionMedias
	 */
	public Collection<Media> getShoreExcursionMedias(final SessionContext ctx)
	{
		return SHOREEXCURSIONMEDIASHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShoreExcursion.shoreExcursionMedias</code> attribute.
	 * @return the shoreExcursionMedias
	 */
	public Collection<Media> getShoreExcursionMedias()
	{
		return getShoreExcursionMedias( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoreExcursion.shoreExcursionMedias</code> attribute. 
	 * @param value the shoreExcursionMedias
	 */
	public void setShoreExcursionMedias(final SessionContext ctx, final Collection<Media> value)
	{
		SHOREEXCURSIONMEDIASHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShoreExcursion.shoreExcursionMedias</code> attribute. 
	 * @param value the shoreExcursionMedias
	 */
	public void setShoreExcursionMedias(final Collection<Media> value)
	{
		setShoreExcursionMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to shoreExcursionMedias. 
	 * @param value the item to add to shoreExcursionMedias
	 */
	public void addToShoreExcursionMedias(final SessionContext ctx, final Media value)
	{
		SHOREEXCURSIONMEDIASHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to shoreExcursionMedias. 
	 * @param value the item to add to shoreExcursionMedias
	 */
	public void addToShoreExcursionMedias(final Media value)
	{
		addToShoreExcursionMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from shoreExcursionMedias. 
	 * @param value the item to remove from shoreExcursionMedias
	 */
	public void removeFromShoreExcursionMedias(final SessionContext ctx, final Media value)
	{
		SHOREEXCURSIONMEDIASHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from shoreExcursionMedias. 
	 * @param value the item to remove from shoreExcursionMedias
	 */
	public void removeFromShoreExcursionMedias(final Media value)
	{
		removeFromShoreExcursionMedias( getSession().getSessionContext(), value );
	}
	
}
