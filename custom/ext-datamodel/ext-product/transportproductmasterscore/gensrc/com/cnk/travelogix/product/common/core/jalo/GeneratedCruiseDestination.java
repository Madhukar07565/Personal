/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.masterdata.core.c2l.jalo.Continent;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.CruiseDestination CruiseDestination}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCruiseDestination extends AbstractTravelogixItem
{
	/** Qualifier of the <code>CruiseDestination.destinationName</code> attribute **/
	public static final String DESTINATIONNAME = "destinationName";
	/** Qualifier of the <code>CruiseDestination.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>CruiseDestination.cruiseDestinationCommonID</code> attribute **/
	public static final String CRUISEDESTINATIONCOMMONID = "cruiseDestinationCommonID";
	/** Qualifier of the <code>CruiseDestination.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>CruiseDestination.continent</code> attribute **/
	public static final String CONTINENT = "continent";
	/** Qualifier of the <code>CruiseDestination.copiedFrom</code> attribute **/
	public static final String COPIEDFROM = "copiedFrom";
	/** Qualifier of the <code>CruiseDestination.onlineDate</code> attribute **/
	public static final String ONLINEDATE = "onlineDate";
	/** Qualifier of the <code>CruiseDestination.offlineDate</code> attribute **/
	public static final String OFFLINEDATE = "offlineDate";
	/** Qualifier of the <code>CruiseDestination.destinationMedias</code> attribute **/
	public static final String DESTINATIONMEDIAS = "destinationMedias";
	/**
	* {@link OneToManyHandler} for handling 1:n DESTINATIONMEDIAS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Media> DESTINATIONMEDIASHANDLER = new OneToManyHandler<Media>(
	CoreConstants.TC.MEDIA,
	true,
	"cruiseDestination",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DESTINATIONNAME, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(CRUISEDESTINATIONCOMMONID, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(CONTINENT, AttributeMode.INITIAL);
		tmp.put(COPIEDFROM, AttributeMode.INITIAL);
		tmp.put(ONLINEDATE, AttributeMode.INITIAL);
		tmp.put(OFFLINEDATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseDestination.continent</code> attribute.
	 * @return the continent - Continent
	 */
	public Continent getContinent(final SessionContext ctx)
	{
		return (Continent)getProperty( ctx, CONTINENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseDestination.continent</code> attribute.
	 * @return the continent - Continent
	 */
	public Continent getContinent()
	{
		return getContinent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseDestination.continent</code> attribute. 
	 * @param value the continent - Continent
	 */
	public void setContinent(final SessionContext ctx, final Continent value)
	{
		setProperty(ctx, CONTINENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseDestination.continent</code> attribute. 
	 * @param value the continent - Continent
	 */
	public void setContinent(final Continent value)
	{
		setContinent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseDestination.copiedFrom</code> attribute.
	 * @return the copiedFrom - Copied From
	 */
	public String getCopiedFrom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COPIEDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseDestination.copiedFrom</code> attribute.
	 * @return the copiedFrom - Copied From
	 */
	public String getCopiedFrom()
	{
		return getCopiedFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseDestination.copiedFrom</code> attribute. 
	 * @param value the copiedFrom - Copied From
	 */
	public void setCopiedFrom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COPIEDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseDestination.copiedFrom</code> attribute. 
	 * @param value the copiedFrom - Copied From
	 */
	public void setCopiedFrom(final String value)
	{
		setCopiedFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseDestination.country</code> attribute.
	 * @return the country - Country
	 */
	public Collection<Country> getCountry(final SessionContext ctx)
	{
		Collection<Country> coll = (Collection<Country>)getProperty( ctx, COUNTRY);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseDestination.country</code> attribute.
	 * @return the country - Country
	 */
	public Collection<Country> getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseDestination.country</code> attribute. 
	 * @param value the country - Country
	 */
	public void setCountry(final SessionContext ctx, final Collection<Country> value)
	{
		setProperty(ctx, COUNTRY,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseDestination.country</code> attribute. 
	 * @param value the country - Country
	 */
	public void setCountry(final Collection<Country> value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseDestination.cruiseDestinationCommonID</code> attribute.
	 * @return the cruiseDestinationCommonID - Cruise Destination Common ID
	 */
	public String getCruiseDestinationCommonID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CRUISEDESTINATIONCOMMONID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseDestination.cruiseDestinationCommonID</code> attribute.
	 * @return the cruiseDestinationCommonID - Cruise Destination Common ID
	 */
	public String getCruiseDestinationCommonID()
	{
		return getCruiseDestinationCommonID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseDestination.cruiseDestinationCommonID</code> attribute. 
	 * @param value the cruiseDestinationCommonID - Cruise Destination Common ID
	 */
	public void setCruiseDestinationCommonID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CRUISEDESTINATIONCOMMONID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseDestination.cruiseDestinationCommonID</code> attribute. 
	 * @param value the cruiseDestinationCommonID - Cruise Destination Common ID
	 */
	public void setCruiseDestinationCommonID(final String value)
	{
		setCruiseDestinationCommonID( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseDestination.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseDestination.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseDestination.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseDestination.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseDestination.destinationMedias</code> attribute.
	 * @return the destinationMedias
	 */
	public Collection<Media> getDestinationMedias(final SessionContext ctx)
	{
		return DESTINATIONMEDIASHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseDestination.destinationMedias</code> attribute.
	 * @return the destinationMedias
	 */
	public Collection<Media> getDestinationMedias()
	{
		return getDestinationMedias( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseDestination.destinationMedias</code> attribute. 
	 * @param value the destinationMedias
	 */
	public void setDestinationMedias(final SessionContext ctx, final Collection<Media> value)
	{
		DESTINATIONMEDIASHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseDestination.destinationMedias</code> attribute. 
	 * @param value the destinationMedias
	 */
	public void setDestinationMedias(final Collection<Media> value)
	{
		setDestinationMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to destinationMedias. 
	 * @param value the item to add to destinationMedias
	 */
	public void addToDestinationMedias(final SessionContext ctx, final Media value)
	{
		DESTINATIONMEDIASHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to destinationMedias. 
	 * @param value the item to add to destinationMedias
	 */
	public void addToDestinationMedias(final Media value)
	{
		addToDestinationMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from destinationMedias. 
	 * @param value the item to remove from destinationMedias
	 */
	public void removeFromDestinationMedias(final SessionContext ctx, final Media value)
	{
		DESTINATIONMEDIASHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from destinationMedias. 
	 * @param value the item to remove from destinationMedias
	 */
	public void removeFromDestinationMedias(final Media value)
	{
		removeFromDestinationMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseDestination.destinationName</code> attribute.
	 * @return the destinationName - Cruise Destination Name
	 */
	public Continent getDestinationName(final SessionContext ctx)
	{
		return (Continent)getProperty( ctx, DESTINATIONNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseDestination.destinationName</code> attribute.
	 * @return the destinationName - Cruise Destination Name
	 */
	public Continent getDestinationName()
	{
		return getDestinationName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseDestination.destinationName</code> attribute. 
	 * @param value the destinationName - Cruise Destination Name
	 */
	public void setDestinationName(final SessionContext ctx, final Continent value)
	{
		setProperty(ctx, DESTINATIONNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseDestination.destinationName</code> attribute. 
	 * @param value the destinationName - Cruise Destination Name
	 */
	public void setDestinationName(final Continent value)
	{
		setDestinationName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseDestination.offlineDate</code> attribute.
	 * @return the offlineDate - Offline Date
	 */
	public Date getOfflineDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, OFFLINEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseDestination.offlineDate</code> attribute.
	 * @return the offlineDate - Offline Date
	 */
	public Date getOfflineDate()
	{
		return getOfflineDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseDestination.offlineDate</code> attribute. 
	 * @param value the offlineDate - Offline Date
	 */
	public void setOfflineDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, OFFLINEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseDestination.offlineDate</code> attribute. 
	 * @param value the offlineDate - Offline Date
	 */
	public void setOfflineDate(final Date value)
	{
		setOfflineDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseDestination.onlineDate</code> attribute.
	 * @return the onlineDate - Online Date
	 */
	public Date getOnlineDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ONLINEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseDestination.onlineDate</code> attribute.
	 * @return the onlineDate - Online Date
	 */
	public Date getOnlineDate()
	{
		return getOnlineDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseDestination.onlineDate</code> attribute. 
	 * @param value the onlineDate - Online Date
	 */
	public void setOnlineDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ONLINEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseDestination.onlineDate</code> attribute. 
	 * @param value the onlineDate - Online Date
	 */
	public void setOnlineDate(final Date value)
	{
		setOnlineDate( getSession().getSessionContext(), value );
	}
	
}
