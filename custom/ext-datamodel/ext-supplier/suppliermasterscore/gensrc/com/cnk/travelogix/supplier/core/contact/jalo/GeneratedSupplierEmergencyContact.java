/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.core.contact.jalo;

import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.masterdata.core.c2l.jalo.Continent;
import com.cnk.travelogix.masterdata.core.contacts.jalo.ContactDetails;
import com.cnk.travelogix.supplier.masters.core.constants.SuppliermasterscoreConstants;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.c2l.Region;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.core.contact.jalo.SupplierEmergencyContact SupplierEmergencyContact}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierEmergencyContact extends ContactDetails
{
	/** Qualifier of the <code>SupplierEmergencyContact.contactPerson</code> attribute **/
	public static final String CONTACTPERSON = "contactPerson";
	/** Qualifier of the <code>SupplierEmergencyContact.displayInTravelDocuments</code> attribute **/
	public static final String DISPLAYINTRAVELDOCUMENTS = "displayInTravelDocuments";
	/** Qualifier of the <code>SupplierEmergencyContact.productCategory</code> attribute **/
	public static final String PRODUCTCATEGORY = "productCategory";
	/** Qualifier of the <code>SupplierEmergencyContact.countries</code> attribute **/
	public static final String COUNTRIES = "countries";
	/** Relation ordering override parameter constants for EmergencyContact2Country from ((suppliermasterscore))*/
	protected static String EMERGENCYCONTACT2COUNTRY_SRC_ORDERED = "relation.EmergencyContact2Country.source.ordered";
	protected static String EMERGENCYCONTACT2COUNTRY_TGT_ORDERED = "relation.EmergencyContact2Country.target.ordered";
	/** Relation disable markmodifed parameter constants for EmergencyContact2Country from ((suppliermasterscore))*/
	protected static String EMERGENCYCONTACT2COUNTRY_MARKMODIFIED = "relation.EmergencyContact2Country.markmodified";
	/** Qualifier of the <code>SupplierEmergencyContact.continents</code> attribute **/
	public static final String CONTINENTS = "continents";
	/** Relation ordering override parameter constants for EmergencyContact2Continent from ((suppliermasterscore))*/
	protected static String EMERGENCYCONTACT2CONTINENT_SRC_ORDERED = "relation.EmergencyContact2Continent.source.ordered";
	protected static String EMERGENCYCONTACT2CONTINENT_TGT_ORDERED = "relation.EmergencyContact2Continent.target.ordered";
	/** Relation disable markmodifed parameter constants for EmergencyContact2Continent from ((suppliermasterscore))*/
	protected static String EMERGENCYCONTACT2CONTINENT_MARKMODIFIED = "relation.EmergencyContact2Continent.markmodified";
	/** Qualifier of the <code>SupplierEmergencyContact.regions</code> attribute **/
	public static final String REGIONS = "regions";
	/** Relation ordering override parameter constants for EmergencyContact2Region from ((suppliermasterscore))*/
	protected static String EMERGENCYCONTACT2REGION_SRC_ORDERED = "relation.EmergencyContact2Region.source.ordered";
	protected static String EMERGENCYCONTACT2REGION_TGT_ORDERED = "relation.EmergencyContact2Region.target.ordered";
	/** Relation disable markmodifed parameter constants for EmergencyContact2Region from ((suppliermasterscore))*/
	protected static String EMERGENCYCONTACT2REGION_MARKMODIFIED = "relation.EmergencyContact2Region.markmodified";
	/** Qualifier of the <code>SupplierEmergencyContact.cities</code> attribute **/
	public static final String CITIES = "cities";
	/** Relation ordering override parameter constants for EmergencyContact2City from ((suppliermasterscore))*/
	protected static String EMERGENCYCONTACT2CITY_SRC_ORDERED = "relation.EmergencyContact2City.source.ordered";
	protected static String EMERGENCYCONTACT2CITY_TGT_ORDERED = "relation.EmergencyContact2City.target.ordered";
	/** Relation disable markmodifed parameter constants for EmergencyContact2City from ((suppliermasterscore))*/
	protected static String EMERGENCYCONTACT2CITY_MARKMODIFIED = "relation.EmergencyContact2City.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(ContactDetails.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CONTACTPERSON, AttributeMode.INITIAL);
		tmp.put(DISPLAYINTRAVELDOCUMENTS, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEmergencyContact.cities</code> attribute.
	 * @return the cities
	 */
	public Set<City> getCities(final SessionContext ctx)
	{
		final List<City> items = getLinkedItems( 
			ctx,
			true,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2CITY,
			"City",
			null,
			false,
			false
		);
		return new LinkedHashSet<City>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEmergencyContact.cities</code> attribute.
	 * @return the cities
	 */
	public Set<City> getCities()
	{
		return getCities( getSession().getSessionContext() );
	}
	
	public long getCitiesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2CITY,
			"City",
			null
		);
	}
	
	public long getCitiesCount()
	{
		return getCitiesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEmergencyContact.cities</code> attribute. 
	 * @param value the cities
	 */
	public void setCities(final SessionContext ctx, final Set<City> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2CITY,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2CITY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEmergencyContact.cities</code> attribute. 
	 * @param value the cities
	 */
	public void setCities(final Set<City> value)
	{
		setCities( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cities. 
	 * @param value the item to add to cities
	 */
	public void addToCities(final SessionContext ctx, final City value)
	{
		addLinkedItems( 
			ctx,
			true,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2CITY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2CITY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cities. 
	 * @param value the item to add to cities
	 */
	public void addToCities(final City value)
	{
		addToCities( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cities. 
	 * @param value the item to remove from cities
	 */
	public void removeFromCities(final SessionContext ctx, final City value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2CITY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2CITY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cities. 
	 * @param value the item to remove from cities
	 */
	public void removeFromCities(final City value)
	{
		removeFromCities( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEmergencyContact.contactPerson</code> attribute.
	 * @return the contactPerson
	 */
	public String getContactPerson(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTACTPERSON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEmergencyContact.contactPerson</code> attribute.
	 * @return the contactPerson
	 */
	public String getContactPerson()
	{
		return getContactPerson( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEmergencyContact.contactPerson</code> attribute. 
	 * @param value the contactPerson
	 */
	public void setContactPerson(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTACTPERSON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEmergencyContact.contactPerson</code> attribute. 
	 * @param value the contactPerson
	 */
	public void setContactPerson(final String value)
	{
		setContactPerson( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEmergencyContact.continents</code> attribute.
	 * @return the continents
	 */
	public Set<Continent> getContinents(final SessionContext ctx)
	{
		final List<Continent> items = getLinkedItems( 
			ctx,
			true,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2CONTINENT,
			"Continent",
			null,
			false,
			false
		);
		return new LinkedHashSet<Continent>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEmergencyContact.continents</code> attribute.
	 * @return the continents
	 */
	public Set<Continent> getContinents()
	{
		return getContinents( getSession().getSessionContext() );
	}
	
	public long getContinentsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2CONTINENT,
			"Continent",
			null
		);
	}
	
	public long getContinentsCount()
	{
		return getContinentsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEmergencyContact.continents</code> attribute. 
	 * @param value the continents
	 */
	public void setContinents(final SessionContext ctx, final Set<Continent> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2CONTINENT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2CONTINENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEmergencyContact.continents</code> attribute. 
	 * @param value the continents
	 */
	public void setContinents(final Set<Continent> value)
	{
		setContinents( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to continents. 
	 * @param value the item to add to continents
	 */
	public void addToContinents(final SessionContext ctx, final Continent value)
	{
		addLinkedItems( 
			ctx,
			true,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2CONTINENT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2CONTINENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to continents. 
	 * @param value the item to add to continents
	 */
	public void addToContinents(final Continent value)
	{
		addToContinents( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from continents. 
	 * @param value the item to remove from continents
	 */
	public void removeFromContinents(final SessionContext ctx, final Continent value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2CONTINENT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2CONTINENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from continents. 
	 * @param value the item to remove from continents
	 */
	public void removeFromContinents(final Continent value)
	{
		removeFromContinents( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEmergencyContact.countries</code> attribute.
	 * @return the countries
	 */
	public Set<Country> getCountries(final SessionContext ctx)
	{
		final List<Country> items = getLinkedItems( 
			ctx,
			true,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2COUNTRY,
			"Country",
			null,
			false,
			false
		);
		return new LinkedHashSet<Country>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEmergencyContact.countries</code> attribute.
	 * @return the countries
	 */
	public Set<Country> getCountries()
	{
		return getCountries( getSession().getSessionContext() );
	}
	
	public long getCountriesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2COUNTRY,
			"Country",
			null
		);
	}
	
	public long getCountriesCount()
	{
		return getCountriesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEmergencyContact.countries</code> attribute. 
	 * @param value the countries
	 */
	public void setCountries(final SessionContext ctx, final Set<Country> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2COUNTRY,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2COUNTRY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEmergencyContact.countries</code> attribute. 
	 * @param value the countries
	 */
	public void setCountries(final Set<Country> value)
	{
		setCountries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to countries. 
	 * @param value the item to add to countries
	 */
	public void addToCountries(final SessionContext ctx, final Country value)
	{
		addLinkedItems( 
			ctx,
			true,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2COUNTRY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2COUNTRY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to countries. 
	 * @param value the item to add to countries
	 */
	public void addToCountries(final Country value)
	{
		addToCountries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from countries. 
	 * @param value the item to remove from countries
	 */
	public void removeFromCountries(final SessionContext ctx, final Country value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2COUNTRY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2COUNTRY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from countries. 
	 * @param value the item to remove from countries
	 */
	public void removeFromCountries(final Country value)
	{
		removeFromCountries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEmergencyContact.displayInTravelDocuments</code> attribute.
	 * @return the displayInTravelDocuments
	 */
	public Boolean isDisplayInTravelDocuments(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DISPLAYINTRAVELDOCUMENTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEmergencyContact.displayInTravelDocuments</code> attribute.
	 * @return the displayInTravelDocuments
	 */
	public Boolean isDisplayInTravelDocuments()
	{
		return isDisplayInTravelDocuments( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEmergencyContact.displayInTravelDocuments</code> attribute. 
	 * @return the displayInTravelDocuments
	 */
	public boolean isDisplayInTravelDocumentsAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDisplayInTravelDocuments( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEmergencyContact.displayInTravelDocuments</code> attribute. 
	 * @return the displayInTravelDocuments
	 */
	public boolean isDisplayInTravelDocumentsAsPrimitive()
	{
		return isDisplayInTravelDocumentsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEmergencyContact.displayInTravelDocuments</code> attribute. 
	 * @param value the displayInTravelDocuments
	 */
	public void setDisplayInTravelDocuments(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DISPLAYINTRAVELDOCUMENTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEmergencyContact.displayInTravelDocuments</code> attribute. 
	 * @param value the displayInTravelDocuments
	 */
	public void setDisplayInTravelDocuments(final Boolean value)
	{
		setDisplayInTravelDocuments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEmergencyContact.displayInTravelDocuments</code> attribute. 
	 * @param value the displayInTravelDocuments
	 */
	public void setDisplayInTravelDocuments(final SessionContext ctx, final boolean value)
	{
		setDisplayInTravelDocuments( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEmergencyContact.displayInTravelDocuments</code> attribute. 
	 * @param value the displayInTravelDocuments
	 */
	public void setDisplayInTravelDocuments(final boolean value)
	{
		setDisplayInTravelDocuments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEmergencyContact.productCategory</code> attribute.
	 * @return the productCategory
	 */
	public Collection<Category> getProductCategory(final SessionContext ctx)
	{
		Collection<Category> coll = (Collection<Category>)getProperty( ctx, PRODUCTCATEGORY);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEmergencyContact.productCategory</code> attribute.
	 * @return the productCategory
	 */
	public Collection<Category> getProductCategory()
	{
		return getProductCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEmergencyContact.productCategory</code> attribute. 
	 * @param value the productCategory
	 */
	public void setProductCategory(final SessionContext ctx, final Collection<Category> value)
	{
		setProperty(ctx, PRODUCTCATEGORY,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEmergencyContact.productCategory</code> attribute. 
	 * @param value the productCategory
	 */
	public void setProductCategory(final Collection<Category> value)
	{
		setProductCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEmergencyContact.regions</code> attribute.
	 * @return the regions
	 */
	public Set<Region> getRegions(final SessionContext ctx)
	{
		final List<Region> items = getLinkedItems( 
			ctx,
			true,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2REGION,
			"Region",
			null,
			false,
			false
		);
		return new LinkedHashSet<Region>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEmergencyContact.regions</code> attribute.
	 * @return the regions
	 */
	public Set<Region> getRegions()
	{
		return getRegions( getSession().getSessionContext() );
	}
	
	public long getRegionsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2REGION,
			"Region",
			null
		);
	}
	
	public long getRegionsCount()
	{
		return getRegionsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEmergencyContact.regions</code> attribute. 
	 * @param value the regions
	 */
	public void setRegions(final SessionContext ctx, final Set<Region> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2REGION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2REGION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEmergencyContact.regions</code> attribute. 
	 * @param value the regions
	 */
	public void setRegions(final Set<Region> value)
	{
		setRegions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to regions. 
	 * @param value the item to add to regions
	 */
	public void addToRegions(final SessionContext ctx, final Region value)
	{
		addLinkedItems( 
			ctx,
			true,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2REGION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2REGION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to regions. 
	 * @param value the item to add to regions
	 */
	public void addToRegions(final Region value)
	{
		addToRegions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from regions. 
	 * @param value the item to remove from regions
	 */
	public void removeFromRegions(final SessionContext ctx, final Region value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2REGION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2REGION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from regions. 
	 * @param value the item to remove from regions
	 */
	public void removeFromRegions(final Region value)
	{
		removeFromRegions( getSession().getSessionContext(), value );
	}
	
}
