/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.contacts.jalo.ContactDetails;
import com.cnk.travelogix.masterdata.core.jalo.TravelogixPolicy;
import com.cnk.travelogix.masterdata.core.staff.jalo.StaffInformation;
import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityBrand;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityChain;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityDescription;
import com.cnk.travelogix.product.activity.masters.core.jalo.AdditionalActivityInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.AssociatedProperty;
import com.cnk.travelogix.product.activity.masters.core.jalo.DiningInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.EventsAndTourInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.GeneralDescription;
import com.cnk.travelogix.product.activity.masters.core.jalo.MiscellaneousInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.MonthlyWeather;
import com.cnk.travelogix.product.activity.masters.core.jalo.PreArrivalInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.ShoppingInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.SuggestedAccommodation;
import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import com.cnk.travelogix.product.common.core.jalo.Affiliation;
import com.cnk.travelogix.product.common.core.jalo.DeactivationConfig;
import com.cnk.travelogix.product.common.core.jalo.DescriptionDetails;
import com.cnk.travelogix.product.common.core.jalo.Facility;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.ActivityProduct ActivityProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivityProduct extends Product
{
	/** Qualifier of the <code>ActivityProduct.chain</code> attribute **/
	public static final String CHAIN = "chain";
	/** Qualifier of the <code>ActivityProduct.brand</code> attribute **/
	public static final String BRAND = "brand";
	/** Qualifier of the <code>ActivityProduct.affiliation</code> attribute **/
	public static final String AFFILIATION = "affiliation";
	/** Qualifier of the <code>ActivityProduct.modeOfTransport</code> attribute **/
	public static final String MODEOFTRANSPORT = "modeOfTransport";
	/** Qualifier of the <code>ActivityProduct.miscellaneousInfo</code> attribute **/
	public static final String MISCELLANEOUSINFO = "miscellaneousInfo";
	/** Qualifier of the <code>ActivityProduct.attachedPolicies</code> attribute **/
	public static final String ATTACHEDPOLICIES = "attachedPolicies";
	/** Qualifier of the <code>ActivityProduct.parkMap</code> attribute **/
	public static final String PARKMAP = "parkMap";
	/** Qualifier of the <code>ActivityProduct.associatedProperty</code> attribute **/
	public static final String ASSOCIATEDPROPERTY = "associatedProperty";
	/** Qualifier of the <code>ActivityProduct.contactDetail</code> attribute **/
	public static final String CONTACTDETAIL = "contactDetail";
	/** Qualifier of the <code>ActivityProduct.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>ActivityProduct.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>ActivityProduct.eventsAndTourInfo</code> attribute **/
	public static final String EVENTSANDTOURINFO = "eventsAndTourInfo";
	/** Qualifier of the <code>ActivityProduct.preArrivalInfo</code> attribute **/
	public static final String PREARRIVALINFO = "preArrivalInfo";
	/** Qualifier of the <code>ActivityProduct.otherInfo</code> attribute **/
	public static final String OTHERINFO = "otherInfo";
	/** Qualifier of the <code>ActivityProduct.productDeactivationConfigs</code> attribute **/
	public static final String PRODUCTDEACTIVATIONCONFIGS = "productDeactivationConfigs";
	/** Qualifier of the <code>ActivityProduct.shoppingInfo</code> attribute **/
	public static final String SHOPPINGINFO = "shoppingInfo";
	/** Qualifier of the <code>ActivityProduct.facilities</code> attribute **/
	public static final String FACILITIES = "facilities";
	/** Qualifier of the <code>ActivityProduct.suggestedAccommodations</code> attribute **/
	public static final String SUGGESTEDACCOMMODATIONS = "suggestedAccommodations";
	/** Qualifier of the <code>ActivityProduct.generalDescription</code> attribute **/
	public static final String GENERALDESCRIPTION = "generalDescription";
	/** Qualifier of the <code>ActivityProduct.staffInformation</code> attribute **/
	public static final String STAFFINFORMATION = "staffInformation";
	/** Qualifier of the <code>ActivityProduct.monthlyWeather</code> attribute **/
	public static final String MONTHLYWEATHER = "monthlyWeather";
	/** Qualifier of the <code>ActivityProduct.supplierUpdates</code> attribute **/
	public static final String SUPPLIERUPDATES = "supplierUpdates";
	/** Qualifier of the <code>ActivityProduct.restaurants</code> attribute **/
	public static final String RESTAURANTS = "restaurants";
	/** Relation ordering override parameter constants for ActivityProductToDiningInfo from ((activityproductmasterscore))*/
	protected static String ACTIVITYPRODUCTTODININGINFO_SRC_ORDERED = "relation.ActivityProductToDiningInfo.source.ordered";
	protected static String ACTIVITYPRODUCTTODININGINFO_TGT_ORDERED = "relation.ActivityProductToDiningInfo.target.ordered";
	/** Relation disable markmodifed parameter constants for ActivityProductToDiningInfo from ((activityproductmasterscore))*/
	protected static String ACTIVITYPRODUCTTODININGINFO_MARKMODIFIED = "relation.ActivityProductToDiningInfo.markmodified";
	/** Qualifier of the <code>ActivityProduct.activityDescriptions</code> attribute **/
	public static final String ACTIVITYDESCRIPTIONS = "activityDescriptions";
	/**
	* {@link OneToManyHandler} for handling 1:n EVENTSANDTOURINFO's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EventsAndTourInfo> EVENTSANDTOURINFOHANDLER = new OneToManyHandler<EventsAndTourInfo>(
	ActivityproductmasterscoreConstants.TC.EVENTSANDTOURINFO,
	false,
	"activityProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PREARRIVALINFO's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PreArrivalInfo> PREARRIVALINFOHANDLER = new OneToManyHandler<PreArrivalInfo>(
	ActivityproductmasterscoreConstants.TC.PREARRIVALINFO,
	false,
	"activityProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n OTHERINFO's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AdditionalActivityInfo> OTHERINFOHANDLER = new OneToManyHandler<AdditionalActivityInfo>(
	ActivityproductmasterscoreConstants.TC.ADDITIONALACTIVITYINFO,
	false,
	"activityProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PRODUCTDEACTIVATIONCONFIGS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DeactivationConfig> PRODUCTDEACTIVATIONCONFIGSHANDLER = new OneToManyHandler<DeactivationConfig>(
	CommonproductcoreConstants.TC.DEACTIVATIONCONFIG,
	false,
	"activityProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SHOPPINGINFO's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ShoppingInfo> SHOPPINGINFOHANDLER = new OneToManyHandler<ShoppingInfo>(
	ActivityproductmasterscoreConstants.TC.SHOPPINGINFO,
	false,
	"activityProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n FACILITIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Facility> FACILITIESHANDLER = new OneToManyHandler<Facility>(
	CommonproductcoreConstants.TC.FACILITY,
	false,
	"activityProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SUGGESTEDACCOMMODATIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SuggestedAccommodation> SUGGESTEDACCOMMODATIONSHANDLER = new OneToManyHandler<SuggestedAccommodation>(
	ActivityproductmasterscoreConstants.TC.SUGGESTEDACCOMMODATION,
	false,
	"activityProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n GENERALDESCRIPTION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<GeneralDescription> GENERALDESCRIPTIONHANDLER = new OneToManyHandler<GeneralDescription>(
	ActivityproductmasterscoreConstants.TC.GENERALDESCRIPTIONINFO,
	false,
	"activityProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n STAFFINFORMATION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<StaffInformation> STAFFINFORMATIONHANDLER = new OneToManyHandler<StaffInformation>(
	MasterdatacoreConstants.TC.STAFFINFORMATION,
	false,
	"activityProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n MONTHLYWEATHER's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<MonthlyWeather> MONTHLYWEATHERHANDLER = new OneToManyHandler<MonthlyWeather>(
	ActivityproductmasterscoreConstants.TC.MONTHLYWEATHER,
	false,
	"activityProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SUPPLIERUPDATES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DescriptionDetails> SUPPLIERUPDATESHANDLER = new OneToManyHandler<DescriptionDetails>(
	CommonproductcoreConstants.TC.DESCRIPTIONDETAILS,
	false,
	"activityProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ACTIVITYDESCRIPTIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ActivityDescription> ACTIVITYDESCRIPTIONSHANDLER = new OneToManyHandler<ActivityDescription>(
	ActivityproductmasterscoreConstants.TC.ACTIVITYDESCRIPTION,
	false,
	"activityProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CHAIN, AttributeMode.INITIAL);
		tmp.put(BRAND, AttributeMode.INITIAL);
		tmp.put(AFFILIATION, AttributeMode.INITIAL);
		tmp.put(MODEOFTRANSPORT, AttributeMode.INITIAL);
		tmp.put(MISCELLANEOUSINFO, AttributeMode.INITIAL);
		tmp.put(ATTACHEDPOLICIES, AttributeMode.INITIAL);
		tmp.put(PARKMAP, AttributeMode.INITIAL);
		tmp.put(ASSOCIATEDPROPERTY, AttributeMode.INITIAL);
		tmp.put(CONTACTDETAIL, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.activityDescriptions</code> attribute.
	 * @return the activityDescriptions
	 */
	public Collection<ActivityDescription> getActivityDescriptions(final SessionContext ctx)
	{
		return ACTIVITYDESCRIPTIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.activityDescriptions</code> attribute.
	 * @return the activityDescriptions
	 */
	public Collection<ActivityDescription> getActivityDescriptions()
	{
		return getActivityDescriptions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.activityDescriptions</code> attribute. 
	 * @param value the activityDescriptions
	 */
	public void setActivityDescriptions(final SessionContext ctx, final Collection<ActivityDescription> value)
	{
		ACTIVITYDESCRIPTIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.activityDescriptions</code> attribute. 
	 * @param value the activityDescriptions
	 */
	public void setActivityDescriptions(final Collection<ActivityDescription> value)
	{
		setActivityDescriptions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to activityDescriptions. 
	 * @param value the item to add to activityDescriptions
	 */
	public void addToActivityDescriptions(final SessionContext ctx, final ActivityDescription value)
	{
		ACTIVITYDESCRIPTIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to activityDescriptions. 
	 * @param value the item to add to activityDescriptions
	 */
	public void addToActivityDescriptions(final ActivityDescription value)
	{
		addToActivityDescriptions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from activityDescriptions. 
	 * @param value the item to remove from activityDescriptions
	 */
	public void removeFromActivityDescriptions(final SessionContext ctx, final ActivityDescription value)
	{
		ACTIVITYDESCRIPTIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from activityDescriptions. 
	 * @param value the item to remove from activityDescriptions
	 */
	public void removeFromActivityDescriptions(final ActivityDescription value)
	{
		removeFromActivityDescriptions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.affiliation</code> attribute.
	 * @return the affiliation - Affiliation.
	 */
	public Affiliation getAffiliation(final SessionContext ctx)
	{
		return (Affiliation)getProperty( ctx, AFFILIATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.affiliation</code> attribute.
	 * @return the affiliation - Affiliation.
	 */
	public Affiliation getAffiliation()
	{
		return getAffiliation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.affiliation</code> attribute. 
	 * @param value the affiliation - Affiliation.
	 */
	public void setAffiliation(final SessionContext ctx, final Affiliation value)
	{
		setProperty(ctx, AFFILIATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.affiliation</code> attribute. 
	 * @param value the affiliation - Affiliation.
	 */
	public void setAffiliation(final Affiliation value)
	{
		setAffiliation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.associatedProperty</code> attribute.
	 * @return the associatedProperty - Associated Accommodation
	 */
	public AssociatedProperty getAssociatedProperty(final SessionContext ctx)
	{
		return (AssociatedProperty)getProperty( ctx, ASSOCIATEDPROPERTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.associatedProperty</code> attribute.
	 * @return the associatedProperty - Associated Accommodation
	 */
	public AssociatedProperty getAssociatedProperty()
	{
		return getAssociatedProperty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.associatedProperty</code> attribute. 
	 * @param value the associatedProperty - Associated Accommodation
	 */
	public void setAssociatedProperty(final SessionContext ctx, final AssociatedProperty value)
	{
		setProperty(ctx, ASSOCIATEDPROPERTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.associatedProperty</code> attribute. 
	 * @param value the associatedProperty - Associated Accommodation
	 */
	public void setAssociatedProperty(final AssociatedProperty value)
	{
		setAssociatedProperty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.attachedPolicies</code> attribute.
	 * @return the attachedPolicies - Attached Policies
	 */
	public Collection<TravelogixPolicy> getAttachedPolicies(final SessionContext ctx)
	{
		Collection<TravelogixPolicy> coll = (Collection<TravelogixPolicy>)getProperty( ctx, ATTACHEDPOLICIES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.attachedPolicies</code> attribute.
	 * @return the attachedPolicies - Attached Policies
	 */
	public Collection<TravelogixPolicy> getAttachedPolicies()
	{
		return getAttachedPolicies( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.attachedPolicies</code> attribute. 
	 * @param value the attachedPolicies - Attached Policies
	 */
	public void setAttachedPolicies(final SessionContext ctx, final Collection<TravelogixPolicy> value)
	{
		setProperty(ctx, ATTACHEDPOLICIES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.attachedPolicies</code> attribute. 
	 * @param value the attachedPolicies - Attached Policies
	 */
	public void setAttachedPolicies(final Collection<TravelogixPolicy> value)
	{
		setAttachedPolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.brand</code> attribute.
	 * @return the brand - Brand.
	 */
	public ActivityBrand getBrand(final SessionContext ctx)
	{
		return (ActivityBrand)getProperty( ctx, BRAND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.brand</code> attribute.
	 * @return the brand - Brand.
	 */
	public ActivityBrand getBrand()
	{
		return getBrand( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.brand</code> attribute. 
	 * @param value the brand - Brand.
	 */
	public void setBrand(final SessionContext ctx, final ActivityBrand value)
	{
		setProperty(ctx, BRAND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.brand</code> attribute. 
	 * @param value the brand - Brand.
	 */
	public void setBrand(final ActivityBrand value)
	{
		setBrand( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.chain</code> attribute.
	 * @return the chain - To show the Chain.
	 */
	public ActivityChain getChain(final SessionContext ctx)
	{
		return (ActivityChain)getProperty( ctx, CHAIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.chain</code> attribute.
	 * @return the chain - To show the Chain.
	 */
	public ActivityChain getChain()
	{
		return getChain( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.chain</code> attribute. 
	 * @param value the chain - To show the Chain.
	 */
	public void setChain(final SessionContext ctx, final ActivityChain value)
	{
		setProperty(ctx, CHAIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.chain</code> attribute. 
	 * @param value the chain - To show the Chain.
	 */
	public void setChain(final ActivityChain value)
	{
		setChain( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.city</code> attribute.
	 * @return the city - City
	 */
	public City getCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.city</code> attribute.
	 * @return the city - City
	 */
	public City getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.city</code> attribute. 
	 * @param value the city - City
	 */
	public void setCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.city</code> attribute. 
	 * @param value the city - City
	 */
	public void setCity(final City value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.contactDetail</code> attribute.
	 * @return the contactDetail - Product Contact Details
	 */
	public ContactDetails getContactDetail(final SessionContext ctx)
	{
		return (ContactDetails)getProperty( ctx, CONTACTDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.contactDetail</code> attribute.
	 * @return the contactDetail - Product Contact Details
	 */
	public ContactDetails getContactDetail()
	{
		return getContactDetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.contactDetail</code> attribute. 
	 * @param value the contactDetail - Product Contact Details
	 */
	public void setContactDetail(final SessionContext ctx, final ContactDetails value)
	{
		setProperty(ctx, CONTACTDETAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.contactDetail</code> attribute. 
	 * @param value the contactDetail - Product Contact Details
	 */
	public void setContactDetail(final ContactDetails value)
	{
		setContactDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.country</code> attribute.
	 * @return the country - Country
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.country</code> attribute.
	 * @return the country - Country
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.country</code> attribute. 
	 * @param value the country - Country
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.country</code> attribute. 
	 * @param value the country - Country
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.eventsAndTourInfo</code> attribute.
	 * @return the eventsAndTourInfo
	 */
	public Collection<EventsAndTourInfo> getEventsAndTourInfo(final SessionContext ctx)
	{
		return EVENTSANDTOURINFOHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.eventsAndTourInfo</code> attribute.
	 * @return the eventsAndTourInfo
	 */
	public Collection<EventsAndTourInfo> getEventsAndTourInfo()
	{
		return getEventsAndTourInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.eventsAndTourInfo</code> attribute. 
	 * @param value the eventsAndTourInfo
	 */
	public void setEventsAndTourInfo(final SessionContext ctx, final Collection<EventsAndTourInfo> value)
	{
		EVENTSANDTOURINFOHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.eventsAndTourInfo</code> attribute. 
	 * @param value the eventsAndTourInfo
	 */
	public void setEventsAndTourInfo(final Collection<EventsAndTourInfo> value)
	{
		setEventsAndTourInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to eventsAndTourInfo. 
	 * @param value the item to add to eventsAndTourInfo
	 */
	public void addToEventsAndTourInfo(final SessionContext ctx, final EventsAndTourInfo value)
	{
		EVENTSANDTOURINFOHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to eventsAndTourInfo. 
	 * @param value the item to add to eventsAndTourInfo
	 */
	public void addToEventsAndTourInfo(final EventsAndTourInfo value)
	{
		addToEventsAndTourInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from eventsAndTourInfo. 
	 * @param value the item to remove from eventsAndTourInfo
	 */
	public void removeFromEventsAndTourInfo(final SessionContext ctx, final EventsAndTourInfo value)
	{
		EVENTSANDTOURINFOHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from eventsAndTourInfo. 
	 * @param value the item to remove from eventsAndTourInfo
	 */
	public void removeFromEventsAndTourInfo(final EventsAndTourInfo value)
	{
		removeFromEventsAndTourInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.facilities</code> attribute.
	 * @return the facilities
	 */
	public Collection<Facility> getFacilities(final SessionContext ctx)
	{
		return FACILITIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.facilities</code> attribute.
	 * @return the facilities
	 */
	public Collection<Facility> getFacilities()
	{
		return getFacilities( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.facilities</code> attribute. 
	 * @param value the facilities
	 */
	public void setFacilities(final SessionContext ctx, final Collection<Facility> value)
	{
		FACILITIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.facilities</code> attribute. 
	 * @param value the facilities
	 */
	public void setFacilities(final Collection<Facility> value)
	{
		setFacilities( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to facilities. 
	 * @param value the item to add to facilities
	 */
	public void addToFacilities(final SessionContext ctx, final Facility value)
	{
		FACILITIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to facilities. 
	 * @param value the item to add to facilities
	 */
	public void addToFacilities(final Facility value)
	{
		addToFacilities( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from facilities. 
	 * @param value the item to remove from facilities
	 */
	public void removeFromFacilities(final SessionContext ctx, final Facility value)
	{
		FACILITIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from facilities. 
	 * @param value the item to remove from facilities
	 */
	public void removeFromFacilities(final Facility value)
	{
		removeFromFacilities( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.generalDescription</code> attribute.
	 * @return the generalDescription
	 */
	public Collection<GeneralDescription> getGeneralDescription(final SessionContext ctx)
	{
		return GENERALDESCRIPTIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.generalDescription</code> attribute.
	 * @return the generalDescription
	 */
	public Collection<GeneralDescription> getGeneralDescription()
	{
		return getGeneralDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.generalDescription</code> attribute. 
	 * @param value the generalDescription
	 */
	public void setGeneralDescription(final SessionContext ctx, final Collection<GeneralDescription> value)
	{
		GENERALDESCRIPTIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.generalDescription</code> attribute. 
	 * @param value the generalDescription
	 */
	public void setGeneralDescription(final Collection<GeneralDescription> value)
	{
		setGeneralDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to generalDescription. 
	 * @param value the item to add to generalDescription
	 */
	public void addToGeneralDescription(final SessionContext ctx, final GeneralDescription value)
	{
		GENERALDESCRIPTIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to generalDescription. 
	 * @param value the item to add to generalDescription
	 */
	public void addToGeneralDescription(final GeneralDescription value)
	{
		addToGeneralDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from generalDescription. 
	 * @param value the item to remove from generalDescription
	 */
	public void removeFromGeneralDescription(final SessionContext ctx, final GeneralDescription value)
	{
		GENERALDESCRIPTIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from generalDescription. 
	 * @param value the item to remove from generalDescription
	 */
	public void removeFromGeneralDescription(final GeneralDescription value)
	{
		removeFromGeneralDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.miscellaneousInfo</code> attribute.
	 * @return the miscellaneousInfo - Miscellaneous Info
	 */
	public MiscellaneousInfo getMiscellaneousInfo(final SessionContext ctx)
	{
		return (MiscellaneousInfo)getProperty( ctx, MISCELLANEOUSINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.miscellaneousInfo</code> attribute.
	 * @return the miscellaneousInfo - Miscellaneous Info
	 */
	public MiscellaneousInfo getMiscellaneousInfo()
	{
		return getMiscellaneousInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.miscellaneousInfo</code> attribute. 
	 * @param value the miscellaneousInfo - Miscellaneous Info
	 */
	public void setMiscellaneousInfo(final SessionContext ctx, final MiscellaneousInfo value)
	{
		setProperty(ctx, MISCELLANEOUSINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.miscellaneousInfo</code> attribute. 
	 * @param value the miscellaneousInfo - Miscellaneous Info
	 */
	public void setMiscellaneousInfo(final MiscellaneousInfo value)
	{
		setMiscellaneousInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.modeOfTransport</code> attribute.
	 * @return the modeOfTransport - ModeOfTransport.
	 */
	public EnumerationValue getModeOfTransport(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MODEOFTRANSPORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.modeOfTransport</code> attribute.
	 * @return the modeOfTransport - ModeOfTransport.
	 */
	public EnumerationValue getModeOfTransport()
	{
		return getModeOfTransport( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.modeOfTransport</code> attribute. 
	 * @param value the modeOfTransport - ModeOfTransport.
	 */
	public void setModeOfTransport(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MODEOFTRANSPORT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.modeOfTransport</code> attribute. 
	 * @param value the modeOfTransport - ModeOfTransport.
	 */
	public void setModeOfTransport(final EnumerationValue value)
	{
		setModeOfTransport( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.monthlyWeather</code> attribute.
	 * @return the monthlyWeather
	 */
	public Collection<MonthlyWeather> getMonthlyWeather(final SessionContext ctx)
	{
		return MONTHLYWEATHERHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.monthlyWeather</code> attribute.
	 * @return the monthlyWeather
	 */
	public Collection<MonthlyWeather> getMonthlyWeather()
	{
		return getMonthlyWeather( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.monthlyWeather</code> attribute. 
	 * @param value the monthlyWeather
	 */
	public void setMonthlyWeather(final SessionContext ctx, final Collection<MonthlyWeather> value)
	{
		MONTHLYWEATHERHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.monthlyWeather</code> attribute. 
	 * @param value the monthlyWeather
	 */
	public void setMonthlyWeather(final Collection<MonthlyWeather> value)
	{
		setMonthlyWeather( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to monthlyWeather. 
	 * @param value the item to add to monthlyWeather
	 */
	public void addToMonthlyWeather(final SessionContext ctx, final MonthlyWeather value)
	{
		MONTHLYWEATHERHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to monthlyWeather. 
	 * @param value the item to add to monthlyWeather
	 */
	public void addToMonthlyWeather(final MonthlyWeather value)
	{
		addToMonthlyWeather( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from monthlyWeather. 
	 * @param value the item to remove from monthlyWeather
	 */
	public void removeFromMonthlyWeather(final SessionContext ctx, final MonthlyWeather value)
	{
		MONTHLYWEATHERHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from monthlyWeather. 
	 * @param value the item to remove from monthlyWeather
	 */
	public void removeFromMonthlyWeather(final MonthlyWeather value)
	{
		removeFromMonthlyWeather( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.otherInfo</code> attribute.
	 * @return the otherInfo
	 */
	public Collection<AdditionalActivityInfo> getOtherInfo(final SessionContext ctx)
	{
		return OTHERINFOHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.otherInfo</code> attribute.
	 * @return the otherInfo
	 */
	public Collection<AdditionalActivityInfo> getOtherInfo()
	{
		return getOtherInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.otherInfo</code> attribute. 
	 * @param value the otherInfo
	 */
	public void setOtherInfo(final SessionContext ctx, final Collection<AdditionalActivityInfo> value)
	{
		OTHERINFOHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.otherInfo</code> attribute. 
	 * @param value the otherInfo
	 */
	public void setOtherInfo(final Collection<AdditionalActivityInfo> value)
	{
		setOtherInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to otherInfo. 
	 * @param value the item to add to otherInfo
	 */
	public void addToOtherInfo(final SessionContext ctx, final AdditionalActivityInfo value)
	{
		OTHERINFOHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to otherInfo. 
	 * @param value the item to add to otherInfo
	 */
	public void addToOtherInfo(final AdditionalActivityInfo value)
	{
		addToOtherInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from otherInfo. 
	 * @param value the item to remove from otherInfo
	 */
	public void removeFromOtherInfo(final SessionContext ctx, final AdditionalActivityInfo value)
	{
		OTHERINFOHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from otherInfo. 
	 * @param value the item to remove from otherInfo
	 */
	public void removeFromOtherInfo(final AdditionalActivityInfo value)
	{
		removeFromOtherInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.parkMap</code> attribute.
	 * @return the parkMap - Park Map.
	 */
	public Collection<Media> getParkMap(final SessionContext ctx)
	{
		Collection<Media> coll = (Collection<Media>)getProperty( ctx, PARKMAP);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.parkMap</code> attribute.
	 * @return the parkMap - Park Map.
	 */
	public Collection<Media> getParkMap()
	{
		return getParkMap( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.parkMap</code> attribute. 
	 * @param value the parkMap - Park Map.
	 */
	public void setParkMap(final SessionContext ctx, final Collection<Media> value)
	{
		setProperty(ctx, PARKMAP,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.parkMap</code> attribute. 
	 * @param value the parkMap - Park Map.
	 */
	public void setParkMap(final Collection<Media> value)
	{
		setParkMap( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.preArrivalInfo</code> attribute.
	 * @return the preArrivalInfo
	 */
	public Collection<PreArrivalInfo> getPreArrivalInfo(final SessionContext ctx)
	{
		return PREARRIVALINFOHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.preArrivalInfo</code> attribute.
	 * @return the preArrivalInfo
	 */
	public Collection<PreArrivalInfo> getPreArrivalInfo()
	{
		return getPreArrivalInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.preArrivalInfo</code> attribute. 
	 * @param value the preArrivalInfo
	 */
	public void setPreArrivalInfo(final SessionContext ctx, final Collection<PreArrivalInfo> value)
	{
		PREARRIVALINFOHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.preArrivalInfo</code> attribute. 
	 * @param value the preArrivalInfo
	 */
	public void setPreArrivalInfo(final Collection<PreArrivalInfo> value)
	{
		setPreArrivalInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to preArrivalInfo. 
	 * @param value the item to add to preArrivalInfo
	 */
	public void addToPreArrivalInfo(final SessionContext ctx, final PreArrivalInfo value)
	{
		PREARRIVALINFOHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to preArrivalInfo. 
	 * @param value the item to add to preArrivalInfo
	 */
	public void addToPreArrivalInfo(final PreArrivalInfo value)
	{
		addToPreArrivalInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from preArrivalInfo. 
	 * @param value the item to remove from preArrivalInfo
	 */
	public void removeFromPreArrivalInfo(final SessionContext ctx, final PreArrivalInfo value)
	{
		PREARRIVALINFOHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from preArrivalInfo. 
	 * @param value the item to remove from preArrivalInfo
	 */
	public void removeFromPreArrivalInfo(final PreArrivalInfo value)
	{
		removeFromPreArrivalInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.productDeactivationConfigs</code> attribute.
	 * @return the productDeactivationConfigs
	 */
	public Collection<DeactivationConfig> getProductDeactivationConfigs(final SessionContext ctx)
	{
		return PRODUCTDEACTIVATIONCONFIGSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.productDeactivationConfigs</code> attribute.
	 * @return the productDeactivationConfigs
	 */
	public Collection<DeactivationConfig> getProductDeactivationConfigs()
	{
		return getProductDeactivationConfigs( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.productDeactivationConfigs</code> attribute. 
	 * @param value the productDeactivationConfigs
	 */
	public void setProductDeactivationConfigs(final SessionContext ctx, final Collection<DeactivationConfig> value)
	{
		PRODUCTDEACTIVATIONCONFIGSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.productDeactivationConfigs</code> attribute. 
	 * @param value the productDeactivationConfigs
	 */
	public void setProductDeactivationConfigs(final Collection<DeactivationConfig> value)
	{
		setProductDeactivationConfigs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productDeactivationConfigs. 
	 * @param value the item to add to productDeactivationConfigs
	 */
	public void addToProductDeactivationConfigs(final SessionContext ctx, final DeactivationConfig value)
	{
		PRODUCTDEACTIVATIONCONFIGSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productDeactivationConfigs. 
	 * @param value the item to add to productDeactivationConfigs
	 */
	public void addToProductDeactivationConfigs(final DeactivationConfig value)
	{
		addToProductDeactivationConfigs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productDeactivationConfigs. 
	 * @param value the item to remove from productDeactivationConfigs
	 */
	public void removeFromProductDeactivationConfigs(final SessionContext ctx, final DeactivationConfig value)
	{
		PRODUCTDEACTIVATIONCONFIGSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productDeactivationConfigs. 
	 * @param value the item to remove from productDeactivationConfigs
	 */
	public void removeFromProductDeactivationConfigs(final DeactivationConfig value)
	{
		removeFromProductDeactivationConfigs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.restaurants</code> attribute.
	 * @return the restaurants
	 */
	public Collection<DiningInfo> getRestaurants(final SessionContext ctx)
	{
		final List<DiningInfo> items = getLinkedItems( 
			ctx,
			true,
			ActivityproductmasterscoreConstants.Relations.ACTIVITYPRODUCTTODININGINFO,
			"DiningInfo",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.restaurants</code> attribute.
	 * @return the restaurants
	 */
	public Collection<DiningInfo> getRestaurants()
	{
		return getRestaurants( getSession().getSessionContext() );
	}
	
	public long getRestaurantsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			ActivityproductmasterscoreConstants.Relations.ACTIVITYPRODUCTTODININGINFO,
			"DiningInfo",
			null
		);
	}
	
	public long getRestaurantsCount()
	{
		return getRestaurantsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.restaurants</code> attribute. 
	 * @param value the restaurants
	 */
	public void setRestaurants(final SessionContext ctx, final Collection<DiningInfo> value)
	{
		setLinkedItems( 
			ctx,
			true,
			ActivityproductmasterscoreConstants.Relations.ACTIVITYPRODUCTTODININGINFO,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ACTIVITYPRODUCTTODININGINFO_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.restaurants</code> attribute. 
	 * @param value the restaurants
	 */
	public void setRestaurants(final Collection<DiningInfo> value)
	{
		setRestaurants( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to restaurants. 
	 * @param value the item to add to restaurants
	 */
	public void addToRestaurants(final SessionContext ctx, final DiningInfo value)
	{
		addLinkedItems( 
			ctx,
			true,
			ActivityproductmasterscoreConstants.Relations.ACTIVITYPRODUCTTODININGINFO,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ACTIVITYPRODUCTTODININGINFO_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to restaurants. 
	 * @param value the item to add to restaurants
	 */
	public void addToRestaurants(final DiningInfo value)
	{
		addToRestaurants( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from restaurants. 
	 * @param value the item to remove from restaurants
	 */
	public void removeFromRestaurants(final SessionContext ctx, final DiningInfo value)
	{
		removeLinkedItems( 
			ctx,
			true,
			ActivityproductmasterscoreConstants.Relations.ACTIVITYPRODUCTTODININGINFO,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ACTIVITYPRODUCTTODININGINFO_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from restaurants. 
	 * @param value the item to remove from restaurants
	 */
	public void removeFromRestaurants(final DiningInfo value)
	{
		removeFromRestaurants( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.shoppingInfo</code> attribute.
	 * @return the shoppingInfo
	 */
	public Collection<ShoppingInfo> getShoppingInfo(final SessionContext ctx)
	{
		return SHOPPINGINFOHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.shoppingInfo</code> attribute.
	 * @return the shoppingInfo
	 */
	public Collection<ShoppingInfo> getShoppingInfo()
	{
		return getShoppingInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.shoppingInfo</code> attribute. 
	 * @param value the shoppingInfo
	 */
	public void setShoppingInfo(final SessionContext ctx, final Collection<ShoppingInfo> value)
	{
		SHOPPINGINFOHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.shoppingInfo</code> attribute. 
	 * @param value the shoppingInfo
	 */
	public void setShoppingInfo(final Collection<ShoppingInfo> value)
	{
		setShoppingInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to shoppingInfo. 
	 * @param value the item to add to shoppingInfo
	 */
	public void addToShoppingInfo(final SessionContext ctx, final ShoppingInfo value)
	{
		SHOPPINGINFOHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to shoppingInfo. 
	 * @param value the item to add to shoppingInfo
	 */
	public void addToShoppingInfo(final ShoppingInfo value)
	{
		addToShoppingInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from shoppingInfo. 
	 * @param value the item to remove from shoppingInfo
	 */
	public void removeFromShoppingInfo(final SessionContext ctx, final ShoppingInfo value)
	{
		SHOPPINGINFOHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from shoppingInfo. 
	 * @param value the item to remove from shoppingInfo
	 */
	public void removeFromShoppingInfo(final ShoppingInfo value)
	{
		removeFromShoppingInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.staffInformation</code> attribute.
	 * @return the staffInformation
	 */
	public Collection<StaffInformation> getStaffInformation(final SessionContext ctx)
	{
		return STAFFINFORMATIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.staffInformation</code> attribute.
	 * @return the staffInformation
	 */
	public Collection<StaffInformation> getStaffInformation()
	{
		return getStaffInformation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.staffInformation</code> attribute. 
	 * @param value the staffInformation
	 */
	public void setStaffInformation(final SessionContext ctx, final Collection<StaffInformation> value)
	{
		STAFFINFORMATIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.staffInformation</code> attribute. 
	 * @param value the staffInformation
	 */
	public void setStaffInformation(final Collection<StaffInformation> value)
	{
		setStaffInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to staffInformation. 
	 * @param value the item to add to staffInformation
	 */
	public void addToStaffInformation(final SessionContext ctx, final StaffInformation value)
	{
		STAFFINFORMATIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to staffInformation. 
	 * @param value the item to add to staffInformation
	 */
	public void addToStaffInformation(final StaffInformation value)
	{
		addToStaffInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from staffInformation. 
	 * @param value the item to remove from staffInformation
	 */
	public void removeFromStaffInformation(final SessionContext ctx, final StaffInformation value)
	{
		STAFFINFORMATIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from staffInformation. 
	 * @param value the item to remove from staffInformation
	 */
	public void removeFromStaffInformation(final StaffInformation value)
	{
		removeFromStaffInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.suggestedAccommodations</code> attribute.
	 * @return the suggestedAccommodations
	 */
	public Collection<SuggestedAccommodation> getSuggestedAccommodations(final SessionContext ctx)
	{
		return SUGGESTEDACCOMMODATIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.suggestedAccommodations</code> attribute.
	 * @return the suggestedAccommodations
	 */
	public Collection<SuggestedAccommodation> getSuggestedAccommodations()
	{
		return getSuggestedAccommodations( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.suggestedAccommodations</code> attribute. 
	 * @param value the suggestedAccommodations
	 */
	public void setSuggestedAccommodations(final SessionContext ctx, final Collection<SuggestedAccommodation> value)
	{
		SUGGESTEDACCOMMODATIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.suggestedAccommodations</code> attribute. 
	 * @param value the suggestedAccommodations
	 */
	public void setSuggestedAccommodations(final Collection<SuggestedAccommodation> value)
	{
		setSuggestedAccommodations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to suggestedAccommodations. 
	 * @param value the item to add to suggestedAccommodations
	 */
	public void addToSuggestedAccommodations(final SessionContext ctx, final SuggestedAccommodation value)
	{
		SUGGESTEDACCOMMODATIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to suggestedAccommodations. 
	 * @param value the item to add to suggestedAccommodations
	 */
	public void addToSuggestedAccommodations(final SuggestedAccommodation value)
	{
		addToSuggestedAccommodations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from suggestedAccommodations. 
	 * @param value the item to remove from suggestedAccommodations
	 */
	public void removeFromSuggestedAccommodations(final SessionContext ctx, final SuggestedAccommodation value)
	{
		SUGGESTEDACCOMMODATIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from suggestedAccommodations. 
	 * @param value the item to remove from suggestedAccommodations
	 */
	public void removeFromSuggestedAccommodations(final SuggestedAccommodation value)
	{
		removeFromSuggestedAccommodations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.supplierUpdates</code> attribute.
	 * @return the supplierUpdates
	 */
	public Collection<DescriptionDetails> getSupplierUpdates(final SessionContext ctx)
	{
		return SUPPLIERUPDATESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.supplierUpdates</code> attribute.
	 * @return the supplierUpdates
	 */
	public Collection<DescriptionDetails> getSupplierUpdates()
	{
		return getSupplierUpdates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.supplierUpdates</code> attribute. 
	 * @param value the supplierUpdates
	 */
	public void setSupplierUpdates(final SessionContext ctx, final Collection<DescriptionDetails> value)
	{
		SUPPLIERUPDATESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.supplierUpdates</code> attribute. 
	 * @param value the supplierUpdates
	 */
	public void setSupplierUpdates(final Collection<DescriptionDetails> value)
	{
		setSupplierUpdates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierUpdates. 
	 * @param value the item to add to supplierUpdates
	 */
	public void addToSupplierUpdates(final SessionContext ctx, final DescriptionDetails value)
	{
		SUPPLIERUPDATESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierUpdates. 
	 * @param value the item to add to supplierUpdates
	 */
	public void addToSupplierUpdates(final DescriptionDetails value)
	{
		addToSupplierUpdates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierUpdates. 
	 * @param value the item to remove from supplierUpdates
	 */
	public void removeFromSupplierUpdates(final SessionContext ctx, final DescriptionDetails value)
	{
		SUPPLIERUPDATESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierUpdates. 
	 * @param value the item to remove from supplierUpdates
	 */
	public void removeFromSupplierUpdates(final DescriptionDetails value)
	{
		removeFromSupplierUpdates( getSession().getSessionContext(), value );
	}
	
}
