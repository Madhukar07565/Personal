/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.masterdata.core.jalo;

import com.cnk.travelogix.masterdata.core.amenity.jalo.AmenityType;
import com.cnk.travelogix.masterdata.core.bath.jalo.BathType;
import com.cnk.travelogix.masterdata.core.c2l.jalo.Area;
import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.masterdata.core.c2l.jalo.Continent;
import com.cnk.travelogix.masterdata.core.c2l.jalo.Location;
import com.cnk.travelogix.masterdata.core.c2l.jalo.Suburb;
import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.contact.jalo.ContactNumberInfo;
import com.cnk.travelogix.masterdata.core.contact.jalo.EContactInfo;
import com.cnk.travelogix.masterdata.core.contact.jalo.SocialContactInfo;
import com.cnk.travelogix.masterdata.core.contacts.jalo.ContactDetails;
import com.cnk.travelogix.masterdata.core.deals.jalo.DealCode;
import com.cnk.travelogix.masterdata.core.department.jalo.Department;
import com.cnk.travelogix.masterdata.core.fare.jalo.FareBasis;
import com.cnk.travelogix.masterdata.core.fiancials.jalo.ServiceTaxDetails;
import com.cnk.travelogix.masterdata.core.financials.jalo.Bank;
import com.cnk.travelogix.masterdata.core.general.jalo.LanguageSkillInfo;
import com.cnk.travelogix.masterdata.core.i18n.jalo.TimeZone;
import com.cnk.travelogix.masterdata.core.iata.jalo.AirlineIATAItem;
import com.cnk.travelogix.masterdata.core.iata.jalo.Airport;
import com.cnk.travelogix.masterdata.core.jalo.ActivitiesPolicy;
import com.cnk.travelogix.masterdata.core.jalo.BankAccountDetail;
import com.cnk.travelogix.masterdata.core.jalo.ProductType;
import com.cnk.travelogix.masterdata.core.jalo.TravellerProgram;
import com.cnk.travelogix.masterdata.core.jalo.TravelogixPolicy;
import com.cnk.travelogix.masterdata.core.paymentinfo.jalo.BankPaymentDetail;
import com.cnk.travelogix.masterdata.core.products.jalo.CarGroup;
import com.cnk.travelogix.masterdata.core.products.jalo.FareComponent;
import com.cnk.travelogix.masterdata.core.products.jalo.Station;
import com.cnk.travelogix.masterdata.core.proucts.jalo.BusOperator;
import com.cnk.travelogix.masterdata.core.proucts.jalo.BusRoute;
import com.cnk.travelogix.masterdata.core.proucts.jalo.RailPass;
import com.cnk.travelogix.masterdata.core.proucts.jalo.RateCode;
import com.cnk.travelogix.masterdata.core.proucts.jalo.RateType;
import com.cnk.travelogix.masterdata.core.proucts.jalo.Train;
import com.cnk.travelogix.masterdata.core.staff.jalo.StaffInformation;
import com.cnk.travelogix.masterdata.core.tours.jalo.TourType;
import com.cnk.travelogix.masterdata.core.version.jalo.VersionDetail;
import de.hybris.platform.basecommerce.constants.BasecommerceConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LItem;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.c2l.Region;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.media.AbstractMedia;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.storelocator.jalo.OpeningSchedule;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type <code>MasterdatacoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMasterdatacoreManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n CONTACTDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ContactDetails> ADDRESS2CONTACTDETAILSCONTACTDETAILSHANDLER = new OneToManyHandler<ContactDetails>(
	MasterdatacoreConstants.TC.CONTACTDETAILS,
	true,
	"address",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n OPENINGSCHEDULE's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<OpeningSchedule> ADDRESS2OPENINGSCHEDULEOPENINGSCHEDULEHANDLER = new OneToManyHandler<OpeningSchedule>(
	BasecommerceConstants.TC.OPENINGSCHEDULE,
	false,
	"address",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CITIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<City> CITYCOUNTRYRELATIONCITIESHANDLER = new OneToManyHandler<City>(
	MasterdatacoreConstants.TC.CITY,
	false,
	"country",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CITIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<City> CITYREGIONRELATIONCITIESHANDLER = new OneToManyHandler<City>(
	MasterdatacoreConstants.TC.CITY,
	false,
	"region",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("street3", AttributeMode.INITIAL);
		tmp.put("street4", AttributeMode.INITIAL);
		tmp.put("street5", AttributeMode.INITIAL);
		tmp.put("city", AttributeMode.INITIAL);
		tmp.put("suburbDowntown", AttributeMode.INITIAL);
		tmp.put("relation", AttributeMode.INITIAL);
		tmp.put("employeeId", AttributeMode.INITIAL);
		tmp.put("state", AttributeMode.INITIAL);
		tmp.put("area", AttributeMode.INITIAL);
		tmp.put("location", AttributeMode.INITIAL);
		tmp.put("latitude", AttributeMode.INITIAL);
		tmp.put("longitude", AttributeMode.INITIAL);
		tmp.put("addressType", AttributeMode.INITIAL);
		tmp.put("branchName", AttributeMode.INITIAL);
		tmp.put("branch", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Address", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("fileCategory", AttributeMode.INITIAL);
		tmp.put("serviceTaxDetails", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.media.Media", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("continent", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.c2l.Country", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("address", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.storelocator.jalo.OpeningSchedule", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OpeningSchedule.address</code> attribute.
	 * @return the address
	 */
	public Address getAddress(final SessionContext ctx, final OpeningSchedule item)
	{
		return (Address)item.getProperty( ctx, MasterdatacoreConstants.Attributes.OpeningSchedule.ADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OpeningSchedule.address</code> attribute.
	 * @return the address
	 */
	public Address getAddress(final OpeningSchedule item)
	{
		return getAddress( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OpeningSchedule.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final SessionContext ctx, final OpeningSchedule item, final Address value)
	{
		item.setProperty(ctx, MasterdatacoreConstants.Attributes.OpeningSchedule.ADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OpeningSchedule.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final OpeningSchedule item, final Address value)
	{
		setAddress( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.addressType</code> attribute.
	 * @return the addressType
	 */
	public EnumerationValue getAddressType(final SessionContext ctx, final Address item)
	{
		return (EnumerationValue)item.getProperty( ctx, MasterdatacoreConstants.Attributes.Address.ADDRESSTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.addressType</code> attribute.
	 * @return the addressType
	 */
	public EnumerationValue getAddressType(final Address item)
	{
		return getAddressType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.addressType</code> attribute. 
	 * @param value the addressType
	 */
	public void setAddressType(final SessionContext ctx, final Address item, final EnumerationValue value)
	{
		item.setProperty(ctx, MasterdatacoreConstants.Attributes.Address.ADDRESSTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.addressType</code> attribute. 
	 * @param value the addressType
	 */
	public void setAddressType(final Address item, final EnumerationValue value)
	{
		setAddressType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.area</code> attribute.
	 * @return the area
	 */
	public Area getArea(final SessionContext ctx, final Address item)
	{
		return (Area)item.getProperty( ctx, MasterdatacoreConstants.Attributes.Address.AREA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.area</code> attribute.
	 * @return the area
	 */
	public Area getArea(final Address item)
	{
		return getArea( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.area</code> attribute. 
	 * @param value the area
	 */
	public void setArea(final SessionContext ctx, final Address item, final Area value)
	{
		item.setProperty(ctx, MasterdatacoreConstants.Attributes.Address.AREA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.area</code> attribute. 
	 * @param value the area
	 */
	public void setArea(final Address item, final Area value)
	{
		setArea( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.branch</code> attribute.
	 * @return the branch
	 */
	public Boolean isBranch(final SessionContext ctx, final Address item)
	{
		return (Boolean)item.getProperty( ctx, MasterdatacoreConstants.Attributes.Address.BRANCH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.branch</code> attribute.
	 * @return the branch
	 */
	public Boolean isBranch(final Address item)
	{
		return isBranch( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.branch</code> attribute. 
	 * @return the branch
	 */
	public boolean isBranchAsPrimitive(final SessionContext ctx, final Address item)
	{
		Boolean value = isBranch( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.branch</code> attribute. 
	 * @return the branch
	 */
	public boolean isBranchAsPrimitive(final Address item)
	{
		return isBranchAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.branch</code> attribute. 
	 * @param value the branch
	 */
	public void setBranch(final SessionContext ctx, final Address item, final Boolean value)
	{
		item.setProperty(ctx, MasterdatacoreConstants.Attributes.Address.BRANCH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.branch</code> attribute. 
	 * @param value the branch
	 */
	public void setBranch(final Address item, final Boolean value)
	{
		setBranch( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.branch</code> attribute. 
	 * @param value the branch
	 */
	public void setBranch(final SessionContext ctx, final Address item, final boolean value)
	{
		setBranch( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.branch</code> attribute. 
	 * @param value the branch
	 */
	public void setBranch(final Address item, final boolean value)
	{
		setBranch( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.branchName</code> attribute.
	 * @return the branchName
	 */
	public EnumerationValue getBranchName(final SessionContext ctx, final Address item)
	{
		return (EnumerationValue)item.getProperty( ctx, MasterdatacoreConstants.Attributes.Address.BRANCHNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.branchName</code> attribute.
	 * @return the branchName
	 */
	public EnumerationValue getBranchName(final Address item)
	{
		return getBranchName( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.branchName</code> attribute. 
	 * @param value the branchName
	 */
	public void setBranchName(final SessionContext ctx, final Address item, final EnumerationValue value)
	{
		item.setProperty(ctx, MasterdatacoreConstants.Attributes.Address.BRANCHNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.branchName</code> attribute. 
	 * @param value the branchName
	 */
	public void setBranchName(final Address item, final EnumerationValue value)
	{
		setBranchName( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Country.cities</code> attribute.
	 * @return the cities
	 */
	public Set<City> getCities(final SessionContext ctx, final Country item)
	{
		return (Set<City>)CITYCOUNTRYRELATIONCITIESHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Country.cities</code> attribute.
	 * @return the cities
	 */
	public Set<City> getCities(final Country item)
	{
		return getCities( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Country.cities</code> attribute. 
	 * @param value the cities
	 */
	public void setCities(final SessionContext ctx, final Country item, final Set<City> value)
	{
		CITYCOUNTRYRELATIONCITIESHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Country.cities</code> attribute. 
	 * @param value the cities
	 */
	public void setCities(final Country item, final Set<City> value)
	{
		setCities( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cities. 
	 * @param value the item to add to cities
	 */
	public void addToCities(final SessionContext ctx, final Country item, final City value)
	{
		CITYCOUNTRYRELATIONCITIESHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cities. 
	 * @param value the item to add to cities
	 */
	public void addToCities(final Country item, final City value)
	{
		addToCities( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cities. 
	 * @param value the item to remove from cities
	 */
	public void removeFromCities(final SessionContext ctx, final Country item, final City value)
	{
		CITYCOUNTRYRELATIONCITIESHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cities. 
	 * @param value the item to remove from cities
	 */
	public void removeFromCities(final Country item, final City value)
	{
		removeFromCities( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Region.cities</code> attribute.
	 * @return the cities
	 */
	public Set<City> getCities(final SessionContext ctx, final Region item)
	{
		return (Set<City>)CITYREGIONRELATIONCITIESHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Region.cities</code> attribute.
	 * @return the cities
	 */
	public Set<City> getCities(final Region item)
	{
		return getCities( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Region.cities</code> attribute. 
	 * @param value the cities
	 */
	public void setCities(final SessionContext ctx, final Region item, final Set<City> value)
	{
		CITYREGIONRELATIONCITIESHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Region.cities</code> attribute. 
	 * @param value the cities
	 */
	public void setCities(final Region item, final Set<City> value)
	{
		setCities( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cities. 
	 * @param value the item to add to cities
	 */
	public void addToCities(final SessionContext ctx, final Region item, final City value)
	{
		CITYREGIONRELATIONCITIESHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cities. 
	 * @param value the item to add to cities
	 */
	public void addToCities(final Region item, final City value)
	{
		addToCities( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cities. 
	 * @param value the item to remove from cities
	 */
	public void removeFromCities(final SessionContext ctx, final Region item, final City value)
	{
		CITYREGIONRELATIONCITIESHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cities. 
	 * @param value the item to remove from cities
	 */
	public void removeFromCities(final Region item, final City value)
	{
		removeFromCities( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.city</code> attribute.
	 * @return the city
	 */
	public City getCity(final SessionContext ctx, final Address item)
	{
		return (City)item.getProperty( ctx, MasterdatacoreConstants.Attributes.Address.CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.city</code> attribute.
	 * @return the city
	 */
	public City getCity(final Address item)
	{
		return getCity( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final SessionContext ctx, final Address item, final City value)
	{
		item.setProperty(ctx, MasterdatacoreConstants.Attributes.Address.CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final Address item, final City value)
	{
		setCity( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.contactDetails</code> attribute.
	 * @return the contactDetails
	 */
	public Set<ContactDetails> getContactDetails(final SessionContext ctx, final Address item)
	{
		return (Set<ContactDetails>)ADDRESS2CONTACTDETAILSCONTACTDETAILSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.contactDetails</code> attribute.
	 * @return the contactDetails
	 */
	public Set<ContactDetails> getContactDetails(final Address item)
	{
		return getContactDetails( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.contactDetails</code> attribute. 
	 * @param value the contactDetails
	 */
	public void setContactDetails(final SessionContext ctx, final Address item, final Set<ContactDetails> value)
	{
		ADDRESS2CONTACTDETAILSCONTACTDETAILSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.contactDetails</code> attribute. 
	 * @param value the contactDetails
	 */
	public void setContactDetails(final Address item, final Set<ContactDetails> value)
	{
		setContactDetails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to contactDetails. 
	 * @param value the item to add to contactDetails
	 */
	public void addToContactDetails(final SessionContext ctx, final Address item, final ContactDetails value)
	{
		ADDRESS2CONTACTDETAILSCONTACTDETAILSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to contactDetails. 
	 * @param value the item to add to contactDetails
	 */
	public void addToContactDetails(final Address item, final ContactDetails value)
	{
		addToContactDetails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from contactDetails. 
	 * @param value the item to remove from contactDetails
	 */
	public void removeFromContactDetails(final SessionContext ctx, final Address item, final ContactDetails value)
	{
		ADDRESS2CONTACTDETAILSCONTACTDETAILSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from contactDetails. 
	 * @param value the item to remove from contactDetails
	 */
	public void removeFromContactDetails(final Address item, final ContactDetails value)
	{
		removeFromContactDetails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Country.continent</code> attribute.
	 * @return the continent
	 */
	public Continent getContinent(final SessionContext ctx, final Country item)
	{
		return (Continent)item.getProperty( ctx, MasterdatacoreConstants.Attributes.Country.CONTINENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Country.continent</code> attribute.
	 * @return the continent
	 */
	public Continent getContinent(final Country item)
	{
		return getContinent( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Country.continent</code> attribute. 
	 * @param value the continent
	 */
	public void setContinent(final SessionContext ctx, final Country item, final Continent value)
	{
		item.setProperty(ctx, MasterdatacoreConstants.Attributes.Country.CONTINENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Country.continent</code> attribute. 
	 * @param value the continent
	 */
	public void setContinent(final Country item, final Continent value)
	{
		setContinent( getSession().getSessionContext(), item, value );
	}
	
	public ActivitiesPolicy createActivitiesPolicy(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.ACTIVITIESPOLICY );
			return (ActivitiesPolicy)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ActivitiesPolicy : "+e.getMessage(), 0 );
		}
	}
	
	public ActivitiesPolicy createActivitiesPolicy(final Map attributeValues)
	{
		return createActivitiesPolicy( getSession().getSessionContext(), attributeValues );
	}
	
	public AirlineIATAItem createAirlineIATAItem(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.AIRLINEIATAITEM );
			return (AirlineIATAItem)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AirlineIATAItem : "+e.getMessage(), 0 );
		}
	}
	
	public AirlineIATAItem createAirlineIATAItem(final Map attributeValues)
	{
		return createAirlineIATAItem( getSession().getSessionContext(), attributeValues );
	}
	
	public Airport createAirport(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.AIRPORT );
			return (Airport)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Airport : "+e.getMessage(), 0 );
		}
	}
	
	public Airport createAirport(final Map attributeValues)
	{
		return createAirport( getSession().getSessionContext(), attributeValues );
	}
	
	public AmenityType createAmenityType(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.AMENITYTYPE );
			return (AmenityType)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AmenityType : "+e.getMessage(), 0 );
		}
	}
	
	public AmenityType createAmenityType(final Map attributeValues)
	{
		return createAmenityType( getSession().getSessionContext(), attributeValues );
	}
	
	public Area createArea(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.AREA );
			return (Area)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Area : "+e.getMessage(), 0 );
		}
	}
	
	public Area createArea(final Map attributeValues)
	{
		return createArea( getSession().getSessionContext(), attributeValues );
	}
	
	public Bank createBank(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.BANK );
			return (Bank)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Bank : "+e.getMessage(), 0 );
		}
	}
	
	public Bank createBank(final Map attributeValues)
	{
		return createBank( getSession().getSessionContext(), attributeValues );
	}
	
	public BankAccountDetail createBankAccountDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.BANKACCOUNTDETAIL );
			return (BankAccountDetail)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating BankAccountDetail : "+e.getMessage(), 0 );
		}
	}
	
	public BankAccountDetail createBankAccountDetail(final Map attributeValues)
	{
		return createBankAccountDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public BankPaymentDetail createBankPaymentDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.BANKPAYMENTDETAIL );
			return (BankPaymentDetail)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating BankPaymentDetail : "+e.getMessage(), 0 );
		}
	}
	
	public BankPaymentDetail createBankPaymentDetail(final Map attributeValues)
	{
		return createBankPaymentDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public BathType createBathType(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.BATHTYPE );
			return (BathType)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating BathType : "+e.getMessage(), 0 );
		}
	}
	
	public BathType createBathType(final Map attributeValues)
	{
		return createBathType( getSession().getSessionContext(), attributeValues );
	}
	
	public BusOperator createBusOperator(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.BUSOPERATOR );
			return (BusOperator)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating BusOperator : "+e.getMessage(), 0 );
		}
	}
	
	public BusOperator createBusOperator(final Map attributeValues)
	{
		return createBusOperator( getSession().getSessionContext(), attributeValues );
	}
	
	public BusRoute createBusRoute(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.BUSROUTE );
			return (BusRoute)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating BusRoute : "+e.getMessage(), 0 );
		}
	}
	
	public BusRoute createBusRoute(final Map attributeValues)
	{
		return createBusRoute( getSession().getSessionContext(), attributeValues );
	}
	
	public CarGroup createCarGroup(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.CARGROUP );
			return (CarGroup)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CarGroup : "+e.getMessage(), 0 );
		}
	}
	
	public CarGroup createCarGroup(final Map attributeValues)
	{
		return createCarGroup( getSession().getSessionContext(), attributeValues );
	}
	
	public City createCity(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.CITY );
			return (City)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating City : "+e.getMessage(), 0 );
		}
	}
	
	public City createCity(final Map attributeValues)
	{
		return createCity( getSession().getSessionContext(), attributeValues );
	}
	
	public ContactDetails createContactDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.CONTACTDETAILS );
			return (ContactDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ContactDetails : "+e.getMessage(), 0 );
		}
	}
	
	public ContactDetails createContactDetails(final Map attributeValues)
	{
		return createContactDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public ContactNumberInfo createContactNumberInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.CONTACTNUMBERINFO );
			return (ContactNumberInfo)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ContactNumberInfo : "+e.getMessage(), 0 );
		}
	}
	
	public ContactNumberInfo createContactNumberInfo(final Map attributeValues)
	{
		return createContactNumberInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public Continent createContinent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.CONTINENT );
			return (Continent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Continent : "+e.getMessage(), 0 );
		}
	}
	
	public Continent createContinent(final Map attributeValues)
	{
		return createContinent( getSession().getSessionContext(), attributeValues );
	}
	
	public DealCode createDealCode(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.DEALCODE );
			return (DealCode)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating DealCode : "+e.getMessage(), 0 );
		}
	}
	
	public DealCode createDealCode(final Map attributeValues)
	{
		return createDealCode( getSession().getSessionContext(), attributeValues );
	}
	
	public Department createDepartment(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.DEPARTMENT );
			return (Department)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Department : "+e.getMessage(), 0 );
		}
	}
	
	public Department createDepartment(final Map attributeValues)
	{
		return createDepartment( getSession().getSessionContext(), attributeValues );
	}
	
	public EContactInfo createEContactInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.ECONTACTINFO );
			return (EContactInfo)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating EContactInfo : "+e.getMessage(), 0 );
		}
	}
	
	public EContactInfo createEContactInfo(final Map attributeValues)
	{
		return createEContactInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public FareBasis createFareBasis(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.FAREBASIS );
			return (FareBasis)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating FareBasis : "+e.getMessage(), 0 );
		}
	}
	
	public FareBasis createFareBasis(final Map attributeValues)
	{
		return createFareBasis( getSession().getSessionContext(), attributeValues );
	}
	
	public FareComponent createFareComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.FARECOMPONENT );
			return (FareComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating FareComponent : "+e.getMessage(), 0 );
		}
	}
	
	public FareComponent createFareComponent(final Map attributeValues)
	{
		return createFareComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public LanguageSkillInfo createLanguageSkillInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.LANGUAGESKILLINFO );
			return (LanguageSkillInfo)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating LanguageSkillInfo : "+e.getMessage(), 0 );
		}
	}
	
	public LanguageSkillInfo createLanguageSkillInfo(final Map attributeValues)
	{
		return createLanguageSkillInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public Location createLocation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.LOCATION );
			return (Location)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Location : "+e.getMessage(), 0 );
		}
	}
	
	public Location createLocation(final Map attributeValues)
	{
		return createLocation( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductCategorySubType createProductCategorySubType(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.PRODUCTCATEGORYSUBTYPE );
			return (ProductCategorySubType)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductCategorySubType : "+e.getMessage(), 0 );
		}
	}
	
	public ProductCategorySubType createProductCategorySubType(final Map attributeValues)
	{
		return createProductCategorySubType( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductType createProductType(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.PRODUCTTYPE );
			return (ProductType)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductType : "+e.getMessage(), 0 );
		}
	}
	
	public ProductType createProductType(final Map attributeValues)
	{
		return createProductType( getSession().getSessionContext(), attributeValues );
	}
	
	public RailPass createRailPass(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.RAILPASS );
			return (RailPass)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating RailPass : "+e.getMessage(), 0 );
		}
	}
	
	public RailPass createRailPass(final Map attributeValues)
	{
		return createRailPass( getSession().getSessionContext(), attributeValues );
	}
	
	public RateCode createRateCode(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.RATECODE );
			return (RateCode)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating RateCode : "+e.getMessage(), 0 );
		}
	}
	
	public RateCode createRateCode(final Map attributeValues)
	{
		return createRateCode( getSession().getSessionContext(), attributeValues );
	}
	
	public RateType createRateType(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.RATETYPE );
			return (RateType)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating RateType : "+e.getMessage(), 0 );
		}
	}
	
	public RateType createRateType(final Map attributeValues)
	{
		return createRateType( getSession().getSessionContext(), attributeValues );
	}
	
	public ServiceTaxDetails createServiceTaxDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.SERVICETAXDETAILS );
			return (ServiceTaxDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ServiceTaxDetails : "+e.getMessage(), 0 );
		}
	}
	
	public ServiceTaxDetails createServiceTaxDetails(final Map attributeValues)
	{
		return createServiceTaxDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public SocialContactInfo createSocialContactInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.SOCIALCONTACTINFO );
			return (SocialContactInfo)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SocialContactInfo : "+e.getMessage(), 0 );
		}
	}
	
	public SocialContactInfo createSocialContactInfo(final Map attributeValues)
	{
		return createSocialContactInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public StaffInformation createStaffInformation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.STAFFINFORMATION );
			return (StaffInformation)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating StaffInformation : "+e.getMessage(), 0 );
		}
	}
	
	public StaffInformation createStaffInformation(final Map attributeValues)
	{
		return createStaffInformation( getSession().getSessionContext(), attributeValues );
	}
	
	public Station createStation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.STATION );
			return (Station)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Station : "+e.getMessage(), 0 );
		}
	}
	
	public Station createStation(final Map attributeValues)
	{
		return createStation( getSession().getSessionContext(), attributeValues );
	}
	
	public Suburb createSuburb(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.SUBURB );
			return (Suburb)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Suburb : "+e.getMessage(), 0 );
		}
	}
	
	public Suburb createSuburb(final Map attributeValues)
	{
		return createSuburb( getSession().getSessionContext(), attributeValues );
	}
	
	public TimeZone createTimeZone(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.TIMEZONE );
			return (TimeZone)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating TimeZone : "+e.getMessage(), 0 );
		}
	}
	
	public TimeZone createTimeZone(final Map attributeValues)
	{
		return createTimeZone( getSession().getSessionContext(), attributeValues );
	}
	
	public TourType createTourType(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.TOURTYPE );
			return (TourType)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating TourType : "+e.getMessage(), 0 );
		}
	}
	
	public TourType createTourType(final Map attributeValues)
	{
		return createTourType( getSession().getSessionContext(), attributeValues );
	}
	
	public Train createTrain(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.TRAIN );
			return (Train)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Train : "+e.getMessage(), 0 );
		}
	}
	
	public Train createTrain(final Map attributeValues)
	{
		return createTrain( getSession().getSessionContext(), attributeValues );
	}
	
	public TravellerProgram createTravellerProgram(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.TRAVELLERPROGRAM );
			return (TravellerProgram)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating TravellerProgram : "+e.getMessage(), 0 );
		}
	}
	
	public TravellerProgram createTravellerProgram(final Map attributeValues)
	{
		return createTravellerProgram( getSession().getSessionContext(), attributeValues );
	}
	
	public TravelogixPolicy createTravelogixPolicy(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.TRAVELOGIXPOLICY );
			return (TravelogixPolicy)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating TravelogixPolicy : "+e.getMessage(), 0 );
		}
	}
	
	public TravelogixPolicy createTravelogixPolicy(final Map attributeValues)
	{
		return createTravelogixPolicy( getSession().getSessionContext(), attributeValues );
	}
	
	public VersionDetail createVersionDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MasterdatacoreConstants.TC.VERSIONDETAIL );
			return (VersionDetail)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating VersionDetail : "+e.getMessage(), 0 );
		}
	}
	
	public VersionDetail createVersionDetail(final Map attributeValues)
	{
		return createVersionDetail( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.employeeId</code> attribute.
	 * @return the employeeId
	 */
	public String getEmployeeId(final SessionContext ctx, final Address item)
	{
		return (String)item.getProperty( ctx, MasterdatacoreConstants.Attributes.Address.EMPLOYEEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.employeeId</code> attribute.
	 * @return the employeeId
	 */
	public String getEmployeeId(final Address item)
	{
		return getEmployeeId( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.employeeId</code> attribute. 
	 * @param value the employeeId
	 */
	public void setEmployeeId(final SessionContext ctx, final Address item, final String value)
	{
		item.setProperty(ctx, MasterdatacoreConstants.Attributes.Address.EMPLOYEEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.employeeId</code> attribute. 
	 * @param value the employeeId
	 */
	public void setEmployeeId(final Address item, final String value)
	{
		setEmployeeId( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.fileCategory</code> attribute.
	 * @return the fileCategory
	 */
	public EnumerationValue getFileCategory(final SessionContext ctx, final Media item)
	{
		return (EnumerationValue)item.getProperty( ctx, MasterdatacoreConstants.Attributes.Media.FILECATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.fileCategory</code> attribute.
	 * @return the fileCategory
	 */
	public EnumerationValue getFileCategory(final Media item)
	{
		return getFileCategory( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.fileCategory</code> attribute. 
	 * @param value the fileCategory
	 */
	public void setFileCategory(final SessionContext ctx, final Media item, final EnumerationValue value)
	{
		item.setProperty(ctx, MasterdatacoreConstants.Attributes.Media.FILECATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.fileCategory</code> attribute. 
	 * @param value the fileCategory
	 */
	public void setFileCategory(final Media item, final EnumerationValue value)
	{
		setFileCategory( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return MasterdatacoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.latitude</code> attribute.
	 * @return the latitude
	 */
	public String getLatitude(final SessionContext ctx, final Address item)
	{
		return (String)item.getProperty( ctx, MasterdatacoreConstants.Attributes.Address.LATITUDE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.latitude</code> attribute.
	 * @return the latitude
	 */
	public String getLatitude(final Address item)
	{
		return getLatitude( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.latitude</code> attribute. 
	 * @param value the latitude
	 */
	public void setLatitude(final SessionContext ctx, final Address item, final String value)
	{
		item.setProperty(ctx, MasterdatacoreConstants.Attributes.Address.LATITUDE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.latitude</code> attribute. 
	 * @param value the latitude
	 */
	public void setLatitude(final Address item, final String value)
	{
		setLatitude( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.location</code> attribute.
	 * @return the location
	 */
	public Location getLocation(final SessionContext ctx, final Address item)
	{
		return (Location)item.getProperty( ctx, MasterdatacoreConstants.Attributes.Address.LOCATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.location</code> attribute.
	 * @return the location
	 */
	public Location getLocation(final Address item)
	{
		return getLocation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.location</code> attribute. 
	 * @param value the location
	 */
	public void setLocation(final SessionContext ctx, final Address item, final Location value)
	{
		item.setProperty(ctx, MasterdatacoreConstants.Attributes.Address.LOCATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.location</code> attribute. 
	 * @param value the location
	 */
	public void setLocation(final Address item, final Location value)
	{
		setLocation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.longitude</code> attribute.
	 * @return the longitude
	 */
	public String getLongitude(final SessionContext ctx, final Address item)
	{
		return (String)item.getProperty( ctx, MasterdatacoreConstants.Attributes.Address.LONGITUDE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.longitude</code> attribute.
	 * @return the longitude
	 */
	public String getLongitude(final Address item)
	{
		return getLongitude( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.longitude</code> attribute. 
	 * @param value the longitude
	 */
	public void setLongitude(final SessionContext ctx, final Address item, final String value)
	{
		item.setProperty(ctx, MasterdatacoreConstants.Attributes.Address.LONGITUDE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.longitude</code> attribute. 
	 * @param value the longitude
	 */
	public void setLongitude(final Address item, final String value)
	{
		setLongitude( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.openingSchedule</code> attribute.
	 * @return the openingSchedule
	 */
	public Set<OpeningSchedule> getOpeningSchedule(final SessionContext ctx, final Address item)
	{
		return (Set<OpeningSchedule>)ADDRESS2OPENINGSCHEDULEOPENINGSCHEDULEHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.openingSchedule</code> attribute.
	 * @return the openingSchedule
	 */
	public Set<OpeningSchedule> getOpeningSchedule(final Address item)
	{
		return getOpeningSchedule( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.openingSchedule</code> attribute. 
	 * @param value the openingSchedule
	 */
	public void setOpeningSchedule(final SessionContext ctx, final Address item, final Set<OpeningSchedule> value)
	{
		ADDRESS2OPENINGSCHEDULEOPENINGSCHEDULEHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.openingSchedule</code> attribute. 
	 * @param value the openingSchedule
	 */
	public void setOpeningSchedule(final Address item, final Set<OpeningSchedule> value)
	{
		setOpeningSchedule( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to openingSchedule. 
	 * @param value the item to add to openingSchedule
	 */
	public void addToOpeningSchedule(final SessionContext ctx, final Address item, final OpeningSchedule value)
	{
		ADDRESS2OPENINGSCHEDULEOPENINGSCHEDULEHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to openingSchedule. 
	 * @param value the item to add to openingSchedule
	 */
	public void addToOpeningSchedule(final Address item, final OpeningSchedule value)
	{
		addToOpeningSchedule( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from openingSchedule. 
	 * @param value the item to remove from openingSchedule
	 */
	public void removeFromOpeningSchedule(final SessionContext ctx, final Address item, final OpeningSchedule value)
	{
		ADDRESS2OPENINGSCHEDULEOPENINGSCHEDULEHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from openingSchedule. 
	 * @param value the item to remove from openingSchedule
	 */
	public void removeFromOpeningSchedule(final Address item, final OpeningSchedule value)
	{
		removeFromOpeningSchedule( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.relation</code> attribute.
	 * @return the relation
	 */
	public EnumerationValue getRelation(final SessionContext ctx, final Address item)
	{
		return (EnumerationValue)item.getProperty( ctx, MasterdatacoreConstants.Attributes.Address.RELATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.relation</code> attribute.
	 * @return the relation
	 */
	public EnumerationValue getRelation(final Address item)
	{
		return getRelation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.relation</code> attribute. 
	 * @param value the relation
	 */
	public void setRelation(final SessionContext ctx, final Address item, final EnumerationValue value)
	{
		item.setProperty(ctx, MasterdatacoreConstants.Attributes.Address.RELATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.relation</code> attribute. 
	 * @param value the relation
	 */
	public void setRelation(final Address item, final EnumerationValue value)
	{
		setRelation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.serviceTaxDetails</code> attribute.
	 * @return the serviceTaxDetails
	 */
	public ServiceTaxDetails getServiceTaxDetails(final SessionContext ctx, final Media item)
	{
		return (ServiceTaxDetails)item.getProperty( ctx, MasterdatacoreConstants.Attributes.Media.SERVICETAXDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.serviceTaxDetails</code> attribute.
	 * @return the serviceTaxDetails
	 */
	public ServiceTaxDetails getServiceTaxDetails(final Media item)
	{
		return getServiceTaxDetails( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.serviceTaxDetails</code> attribute. 
	 * @param value the serviceTaxDetails
	 */
	public void setServiceTaxDetails(final SessionContext ctx, final Media item, final ServiceTaxDetails value)
	{
		item.setProperty(ctx, MasterdatacoreConstants.Attributes.Media.SERVICETAXDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.serviceTaxDetails</code> attribute. 
	 * @param value the serviceTaxDetails
	 */
	public void setServiceTaxDetails(final Media item, final ServiceTaxDetails value)
	{
		setServiceTaxDetails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.state</code> attribute.
	 * @return the state
	 */
	public Region getState(final SessionContext ctx, final Address item)
	{
		return (Region)item.getProperty( ctx, MasterdatacoreConstants.Attributes.Address.STATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.state</code> attribute.
	 * @return the state
	 */
	public Region getState(final Address item)
	{
		return getState( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.state</code> attribute. 
	 * @param value the state
	 */
	public void setState(final SessionContext ctx, final Address item, final Region value)
	{
		item.setProperty(ctx, MasterdatacoreConstants.Attributes.Address.STATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.state</code> attribute. 
	 * @param value the state
	 */
	public void setState(final Address item, final Region value)
	{
		setState( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.street3</code> attribute.
	 * @return the street3
	 */
	public String getStreet3(final SessionContext ctx, final Address item)
	{
		return (String)item.getProperty( ctx, MasterdatacoreConstants.Attributes.Address.STREET3);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.street3</code> attribute.
	 * @return the street3
	 */
	public String getStreet3(final Address item)
	{
		return getStreet3( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.street3</code> attribute. 
	 * @param value the street3
	 */
	public void setStreet3(final SessionContext ctx, final Address item, final String value)
	{
		item.setProperty(ctx, MasterdatacoreConstants.Attributes.Address.STREET3,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.street3</code> attribute. 
	 * @param value the street3
	 */
	public void setStreet3(final Address item, final String value)
	{
		setStreet3( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.street4</code> attribute.
	 * @return the street4
	 */
	public String getStreet4(final SessionContext ctx, final Address item)
	{
		return (String)item.getProperty( ctx, MasterdatacoreConstants.Attributes.Address.STREET4);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.street4</code> attribute.
	 * @return the street4
	 */
	public String getStreet4(final Address item)
	{
		return getStreet4( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.street4</code> attribute. 
	 * @param value the street4
	 */
	public void setStreet4(final SessionContext ctx, final Address item, final String value)
	{
		item.setProperty(ctx, MasterdatacoreConstants.Attributes.Address.STREET4,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.street4</code> attribute. 
	 * @param value the street4
	 */
	public void setStreet4(final Address item, final String value)
	{
		setStreet4( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.street5</code> attribute.
	 * @return the street5
	 */
	public String getStreet5(final SessionContext ctx, final Address item)
	{
		return (String)item.getProperty( ctx, MasterdatacoreConstants.Attributes.Address.STREET5);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.street5</code> attribute.
	 * @return the street5
	 */
	public String getStreet5(final Address item)
	{
		return getStreet5( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.street5</code> attribute. 
	 * @param value the street5
	 */
	public void setStreet5(final SessionContext ctx, final Address item, final String value)
	{
		item.setProperty(ctx, MasterdatacoreConstants.Attributes.Address.STREET5,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.street5</code> attribute. 
	 * @param value the street5
	 */
	public void setStreet5(final Address item, final String value)
	{
		setStreet5( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.suburbDowntown</code> attribute.
	 * @return the suburbDowntown
	 */
	public Suburb getSuburbDowntown(final SessionContext ctx, final Address item)
	{
		return (Suburb)item.getProperty( ctx, MasterdatacoreConstants.Attributes.Address.SUBURBDOWNTOWN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.suburbDowntown</code> attribute.
	 * @return the suburbDowntown
	 */
	public Suburb getSuburbDowntown(final Address item)
	{
		return getSuburbDowntown( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.suburbDowntown</code> attribute. 
	 * @param value the suburbDowntown
	 */
	public void setSuburbDowntown(final SessionContext ctx, final Address item, final Suburb value)
	{
		item.setProperty(ctx, MasterdatacoreConstants.Attributes.Address.SUBURBDOWNTOWN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.suburbDowntown</code> attribute. 
	 * @param value the suburbDowntown
	 */
	public void setSuburbDowntown(final Address item, final Suburb value)
	{
		setSuburbDowntown( getSession().getSessionContext(), item, value );
	}
	
}
