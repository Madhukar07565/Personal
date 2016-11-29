/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import com.cnk.travelogix.product.common.core.jalo.Route;
import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import com.cnk.travelogix.product.transport.masters.core.jalo.CruisePlaceDescription;
import com.cnk.travelogix.product.transport.masters.core.jalo.PortInfo;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.transport.masters.core.jalo.CruisePort CruisePort}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCruisePort extends AbstractTravelogixItem
{
	/** Qualifier of the <code>CruisePort.portOfCall</code> attribute **/
	public static final String PORTOFCALL = "portOfCall";
	/** Qualifier of the <code>CruisePort.portCommonID</code> attribute **/
	public static final String PORTCOMMONID = "portCommonID";
	/** Qualifier of the <code>CruisePort.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>CruisePort.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>CruisePort.portType</code> attribute **/
	public static final String PORTTYPE = "portType";
	/** Qualifier of the <code>CruisePort.portAlias</code> attribute **/
	public static final String PORTALIAS = "portAlias";
	/** Qualifier of the <code>CruisePort.portShortName</code> attribute **/
	public static final String PORTSHORTNAME = "portShortName";
	/** Qualifier of the <code>CruisePort.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>CruisePort.localLanguage</code> attribute **/
	public static final String LOCALLANGUAGE = "localLanguage";
	/** Qualifier of the <code>CruisePort.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>CruisePort.onlineDate</code> attribute **/
	public static final String ONLINEDATE = "onlineDate";
	/** Qualifier of the <code>CruisePort.offlineDate</code> attribute **/
	public static final String OFFLINEDATE = "offlineDate";
	/** Qualifier of the <code>CruisePort.copiedFrom</code> attribute **/
	public static final String COPIEDFROM = "copiedFrom";
	/** Qualifier of the <code>CruisePort.address</code> attribute **/
	public static final String ADDRESS = "address";
	/** Qualifier of the <code>CruisePort.medias</code> attribute **/
	public static final String MEDIAS = "medias";
	/** Qualifier of the <code>CruisePort.portInfos</code> attribute **/
	public static final String PORTINFOS = "portInfos";
	/** Qualifier of the <code>CruisePort.inAndAnround</code> attribute **/
	public static final String INANDANROUND = "inAndAnround";
	/** Qualifier of the <code>CruisePort.routes</code> attribute **/
	public static final String ROUTES = "routes";
	/**
	* {@link OneToManyHandler} for handling 1:n PORTINFOS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PortInfo> PORTINFOSHANDLER = new OneToManyHandler<PortInfo>(
	TransportproductmasterscoreConstants.TC.PORTINFO,
	true,
	"cruisePort",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n INANDANROUND's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CruisePlaceDescription> INANDANROUNDHANDLER = new OneToManyHandler<CruisePlaceDescription>(
	TransportproductmasterscoreConstants.TC.CRUISEPLACEDESCRIPTION,
	true,
	"cruisePort",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ROUTES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Route> ROUTESHANDLER = new OneToManyHandler<Route>(
	CommonproductcoreConstants.TC.ROUTE,
	true,
	"cruisePort",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PORTOFCALL, AttributeMode.INITIAL);
		tmp.put(PORTCOMMONID, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(PORTTYPE, AttributeMode.INITIAL);
		tmp.put(PORTALIAS, AttributeMode.INITIAL);
		tmp.put(PORTSHORTNAME, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(LOCALLANGUAGE, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(ONLINEDATE, AttributeMode.INITIAL);
		tmp.put(OFFLINEDATE, AttributeMode.INITIAL);
		tmp.put(COPIEDFROM, AttributeMode.INITIAL);
		tmp.put(ADDRESS, AttributeMode.INITIAL);
		tmp.put(MEDIAS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.address</code> attribute.
	 * @return the address - Address
	 */
	public Address getAddress(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, ADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.address</code> attribute.
	 * @return the address - Address
	 */
	public Address getAddress()
	{
		return getAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.address</code> attribute. 
	 * @param value the address - Address
	 */
	public void setAddress(final SessionContext ctx, final Address value)
	{
		setProperty(ctx, ADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.address</code> attribute. 
	 * @param value the address - Address
	 */
	public void setAddress(final Address value)
	{
		setAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.city</code> attribute.
	 * @return the city - City
	 */
	public City getCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.city</code> attribute.
	 * @return the city - City
	 */
	public City getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.city</code> attribute. 
	 * @param value the city - City
	 */
	public void setCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.city</code> attribute. 
	 * @param value the city - City
	 */
	public void setCity(final City value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.copiedFrom</code> attribute.
	 * @return the copiedFrom - Copied From
	 */
	public String getCopiedFrom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COPIEDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.copiedFrom</code> attribute.
	 * @return the copiedFrom - Copied From
	 */
	public String getCopiedFrom()
	{
		return getCopiedFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.copiedFrom</code> attribute. 
	 * @param value the copiedFrom - Copied From
	 */
	public void setCopiedFrom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COPIEDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.copiedFrom</code> attribute. 
	 * @param value the copiedFrom - Copied From
	 */
	public void setCopiedFrom(final String value)
	{
		setCopiedFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.country</code> attribute.
	 * @return the country - Country
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.country</code> attribute.
	 * @return the country - Country
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.country</code> attribute. 
	 * @param value the country - Country
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.country</code> attribute. 
	 * @param value the country - Country
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.currency</code> attribute.
	 * @return the currency - Currency
	 */
	public List<Currency> getCurrency(final SessionContext ctx)
	{
		List<Currency> coll = (List<Currency>)getProperty( ctx, CURRENCY);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.currency</code> attribute.
	 * @return the currency - Currency
	 */
	public List<Currency> getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.currency</code> attribute. 
	 * @param value the currency - Currency
	 */
	public void setCurrency(final SessionContext ctx, final List<Currency> value)
	{
		setProperty(ctx, CURRENCY,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.currency</code> attribute. 
	 * @param value the currency - Currency
	 */
	public void setCurrency(final List<Currency> value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.inAndAnround</code> attribute.
	 * @return the inAndAnround
	 */
	public Collection<CruisePlaceDescription> getInAndAnround(final SessionContext ctx)
	{
		return INANDANROUNDHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.inAndAnround</code> attribute.
	 * @return the inAndAnround
	 */
	public Collection<CruisePlaceDescription> getInAndAnround()
	{
		return getInAndAnround( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.inAndAnround</code> attribute. 
	 * @param value the inAndAnround
	 */
	public void setInAndAnround(final SessionContext ctx, final Collection<CruisePlaceDescription> value)
	{
		INANDANROUNDHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.inAndAnround</code> attribute. 
	 * @param value the inAndAnround
	 */
	public void setInAndAnround(final Collection<CruisePlaceDescription> value)
	{
		setInAndAnround( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inAndAnround. 
	 * @param value the item to add to inAndAnround
	 */
	public void addToInAndAnround(final SessionContext ctx, final CruisePlaceDescription value)
	{
		INANDANROUNDHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inAndAnround. 
	 * @param value the item to add to inAndAnround
	 */
	public void addToInAndAnround(final CruisePlaceDescription value)
	{
		addToInAndAnround( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inAndAnround. 
	 * @param value the item to remove from inAndAnround
	 */
	public void removeFromInAndAnround(final SessionContext ctx, final CruisePlaceDescription value)
	{
		INANDANROUNDHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inAndAnround. 
	 * @param value the item to remove from inAndAnround
	 */
	public void removeFromInAndAnround(final CruisePlaceDescription value)
	{
		removeFromInAndAnround( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.localLanguage</code> attribute.
	 * @return the localLanguage - local Language
	 */
	public Collection<Language> getLocalLanguage(final SessionContext ctx)
	{
		Collection<Language> coll = (Collection<Language>)getProperty( ctx, LOCALLANGUAGE);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.localLanguage</code> attribute.
	 * @return the localLanguage - local Language
	 */
	public Collection<Language> getLocalLanguage()
	{
		return getLocalLanguage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.localLanguage</code> attribute. 
	 * @param value the localLanguage - local Language
	 */
	public void setLocalLanguage(final SessionContext ctx, final Collection<Language> value)
	{
		setProperty(ctx, LOCALLANGUAGE,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.localLanguage</code> attribute. 
	 * @param value the localLanguage - local Language
	 */
	public void setLocalLanguage(final Collection<Language> value)
	{
		setLocalLanguage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.medias</code> attribute.
	 * @return the medias - Collection Of Media
	 */
	public Collection<Media> getMedias(final SessionContext ctx)
	{
		Collection<Media> coll = (Collection<Media>)getProperty( ctx, MEDIAS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.medias</code> attribute.
	 * @return the medias - Collection Of Media
	 */
	public Collection<Media> getMedias()
	{
		return getMedias( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.medias</code> attribute. 
	 * @param value the medias - Collection Of Media
	 */
	public void setMedias(final SessionContext ctx, final Collection<Media> value)
	{
		setProperty(ctx, MEDIAS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.medias</code> attribute. 
	 * @param value the medias - Collection Of Media
	 */
	public void setMedias(final Collection<Media> value)
	{
		setMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.offlineDate</code> attribute.
	 * @return the offlineDate - Offline Date
	 */
	public Date getOfflineDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, OFFLINEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.offlineDate</code> attribute.
	 * @return the offlineDate - Offline Date
	 */
	public Date getOfflineDate()
	{
		return getOfflineDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.offlineDate</code> attribute. 
	 * @param value the offlineDate - Offline Date
	 */
	public void setOfflineDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, OFFLINEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.offlineDate</code> attribute. 
	 * @param value the offlineDate - Offline Date
	 */
	public void setOfflineDate(final Date value)
	{
		setOfflineDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.onlineDate</code> attribute.
	 * @return the onlineDate - Online Date
	 */
	public Date getOnlineDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ONLINEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.onlineDate</code> attribute.
	 * @return the onlineDate - Online Date
	 */
	public Date getOnlineDate()
	{
		return getOnlineDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.onlineDate</code> attribute. 
	 * @param value the onlineDate - Online Date
	 */
	public void setOnlineDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ONLINEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.onlineDate</code> attribute. 
	 * @param value the onlineDate - Online Date
	 */
	public void setOnlineDate(final Date value)
	{
		setOnlineDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.portAlias</code> attribute.
	 * @return the portAlias - Port Alias
	 */
	public String getPortAlias(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PORTALIAS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.portAlias</code> attribute.
	 * @return the portAlias - Port Alias
	 */
	public String getPortAlias()
	{
		return getPortAlias( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.portAlias</code> attribute. 
	 * @param value the portAlias - Port Alias
	 */
	public void setPortAlias(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PORTALIAS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.portAlias</code> attribute. 
	 * @param value the portAlias - Port Alias
	 */
	public void setPortAlias(final String value)
	{
		setPortAlias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.portCommonID</code> attribute.
	 * @return the portCommonID - Port Common ID
	 */
	public String getPortCommonID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PORTCOMMONID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.portCommonID</code> attribute.
	 * @return the portCommonID - Port Common ID
	 */
	public String getPortCommonID()
	{
		return getPortCommonID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.portCommonID</code> attribute. 
	 * @param value the portCommonID - Port Common ID
	 */
	public void setPortCommonID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PORTCOMMONID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.portCommonID</code> attribute. 
	 * @param value the portCommonID - Port Common ID
	 */
	public void setPortCommonID(final String value)
	{
		setPortCommonID( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.portInfos</code> attribute.
	 * @return the portInfos
	 */
	public Collection<PortInfo> getPortInfos(final SessionContext ctx)
	{
		return PORTINFOSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.portInfos</code> attribute.
	 * @return the portInfos
	 */
	public Collection<PortInfo> getPortInfos()
	{
		return getPortInfos( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.portInfos</code> attribute. 
	 * @param value the portInfos
	 */
	public void setPortInfos(final SessionContext ctx, final Collection<PortInfo> value)
	{
		PORTINFOSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.portInfos</code> attribute. 
	 * @param value the portInfos
	 */
	public void setPortInfos(final Collection<PortInfo> value)
	{
		setPortInfos( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to portInfos. 
	 * @param value the item to add to portInfos
	 */
	public void addToPortInfos(final SessionContext ctx, final PortInfo value)
	{
		PORTINFOSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to portInfos. 
	 * @param value the item to add to portInfos
	 */
	public void addToPortInfos(final PortInfo value)
	{
		addToPortInfos( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from portInfos. 
	 * @param value the item to remove from portInfos
	 */
	public void removeFromPortInfos(final SessionContext ctx, final PortInfo value)
	{
		PORTINFOSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from portInfos. 
	 * @param value the item to remove from portInfos
	 */
	public void removeFromPortInfos(final PortInfo value)
	{
		removeFromPortInfos( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.portOfCall</code> attribute.
	 * @return the portOfCall - Port Of Call
	 */
	public String getPortOfCall(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PORTOFCALL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.portOfCall</code> attribute.
	 * @return the portOfCall - Port Of Call
	 */
	public String getPortOfCall()
	{
		return getPortOfCall( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.portOfCall</code> attribute. 
	 * @param value the portOfCall - Port Of Call
	 */
	public void setPortOfCall(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PORTOFCALL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.portOfCall</code> attribute. 
	 * @param value the portOfCall - Port Of Call
	 */
	public void setPortOfCall(final String value)
	{
		setPortOfCall( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.portShortName</code> attribute.
	 * @return the portShortName - Port Short Name
	 */
	public String getPortShortName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PORTSHORTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.portShortName</code> attribute.
	 * @return the portShortName - Port Short Name
	 */
	public String getPortShortName()
	{
		return getPortShortName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.portShortName</code> attribute. 
	 * @param value the portShortName - Port Short Name
	 */
	public void setPortShortName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PORTSHORTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.portShortName</code> attribute. 
	 * @param value the portShortName - Port Short Name
	 */
	public void setPortShortName(final String value)
	{
		setPortShortName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.portType</code> attribute.
	 * @return the portType - Port Type
	 */
	public EnumerationValue getPortType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PORTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.portType</code> attribute.
	 * @return the portType - Port Type
	 */
	public EnumerationValue getPortType()
	{
		return getPortType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.portType</code> attribute. 
	 * @param value the portType - Port Type
	 */
	public void setPortType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PORTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.portType</code> attribute. 
	 * @param value the portType - Port Type
	 */
	public void setPortType(final EnumerationValue value)
	{
		setPortType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.routes</code> attribute.
	 * @return the routes
	 */
	public Collection<Route> getRoutes(final SessionContext ctx)
	{
		return ROUTESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePort.routes</code> attribute.
	 * @return the routes
	 */
	public Collection<Route> getRoutes()
	{
		return getRoutes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.routes</code> attribute. 
	 * @param value the routes
	 */
	public void setRoutes(final SessionContext ctx, final Collection<Route> value)
	{
		ROUTESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePort.routes</code> attribute. 
	 * @param value the routes
	 */
	public void setRoutes(final Collection<Route> value)
	{
		setRoutes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to routes. 
	 * @param value the item to add to routes
	 */
	public void addToRoutes(final SessionContext ctx, final Route value)
	{
		ROUTESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to routes. 
	 * @param value the item to add to routes
	 */
	public void addToRoutes(final Route value)
	{
		addToRoutes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from routes. 
	 * @param value the item to remove from routes
	 */
	public void removeFromRoutes(final SessionContext ctx, final Route value)
	{
		ROUTESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from routes. 
	 * @param value the item to remove from routes
	 */
	public void removeFromRoutes(final Route value)
	{
		removeFromRoutes( getSession().getSessionContext(), value );
	}
	
}
