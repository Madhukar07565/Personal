/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.product.common.core.jalo.PlaceDescription;
import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import com.cnk.travelogix.product.transport.masters.core.jalo.CruisePort;
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
 * Generated class for type {@link com.cnk.travelogix.product.transport.masters.core.jalo.CruisePlaceDescription CruisePlaceDescription}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCruisePlaceDescription extends PlaceDescription
{
	/** Qualifier of the <code>CruisePlaceDescription.medias</code> attribute **/
	public static final String MEDIAS = "medias";
	/** Qualifier of the <code>CruisePlaceDescription.cruisePort</code> attribute **/
	public static final String CRUISEPORT = "cruisePort";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CRUISEPORT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCruisePlaceDescription> CRUISEPORTHANDLER = new BidirectionalOneToManyHandler<GeneratedCruisePlaceDescription>(
	TransportproductmasterscoreConstants.TC.CRUISEPLACEDESCRIPTION,
	false,
	"cruisePort",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(PlaceDescription.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MEDIAS, AttributeMode.INITIAL);
		tmp.put(CRUISEPORT, AttributeMode.INITIAL);
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
		CRUISEPORTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePlaceDescription.cruisePort</code> attribute.
	 * @return the cruisePort
	 */
	public CruisePort getCruisePort(final SessionContext ctx)
	{
		return (CruisePort)getProperty( ctx, CRUISEPORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePlaceDescription.cruisePort</code> attribute.
	 * @return the cruisePort
	 */
	public CruisePort getCruisePort()
	{
		return getCruisePort( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePlaceDescription.cruisePort</code> attribute. 
	 * @param value the cruisePort
	 */
	public void setCruisePort(final SessionContext ctx, final CruisePort value)
	{
		CRUISEPORTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePlaceDescription.cruisePort</code> attribute. 
	 * @param value the cruisePort
	 */
	public void setCruisePort(final CruisePort value)
	{
		setCruisePort( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePlaceDescription.medias</code> attribute.
	 * @return the medias - Medias
	 */
	public Collection<Media> getMedias(final SessionContext ctx)
	{
		Collection<Media> coll = (Collection<Media>)getProperty( ctx, MEDIAS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePlaceDescription.medias</code> attribute.
	 * @return the medias - Medias
	 */
	public Collection<Media> getMedias()
	{
		return getMedias( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePlaceDescription.medias</code> attribute. 
	 * @param value the medias - Medias
	 */
	public void setMedias(final SessionContext ctx, final Collection<Media> value)
	{
		setProperty(ctx, MEDIAS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePlaceDescription.medias</code> attribute. 
	 * @param value the medias - Medias
	 */
	public void setMedias(final Collection<Media> value)
	{
		setMedias( getSession().getSessionContext(), value );
	}
	
}
