/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.accommodation.masters.core.jalo;

import com.cnk.travelogix.acco.inventory.core.jalo.FamilyDetail;
import com.cnk.travelogix.masterdata.core.amenity.jalo.AmenityType;
import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.masterdata.core.c2l.jalo.Location;
import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.contacts.jalo.AbstractContactDetails;
import com.cnk.travelogix.masterdata.core.contacts.jalo.ContactDetails;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractCommonMasterType;
import com.cnk.travelogix.masterdata.core.staff.jalo.StaffInformation;
import com.cnk.travelogix.product.accommodation.masters.core.constants.AccoproductmasterscoreConstants;
import com.cnk.travelogix.product.accommodation.masters.core.jalo.PaxOccupancy;
import com.cnk.travelogix.product.accommodation.masters.core.jalo.RoomInfo;
import com.cnk.travelogix.product.accommodation.masters.core.jalo.RoomPaxOccupancy;
import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import com.cnk.travelogix.product.common.core.jalo.Accommodation;
import com.cnk.travelogix.product.common.core.jalo.Facility;
import com.cnk.travelogix.product.common.core.jalo.HealthAndSafety;
import com.cnk.travelogix.product.common.core.jalo.PlaceDescription;
import com.cnk.travelogix.product.common.core.jalo.Route;
import com.cnk.travelogix.product.common.core.jalo.RuleInfo;
import de.hybris.platform.acceleratorservices.jalo.email.EmailAddress;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LItem;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>AccoproductmasterscoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAccoproductmasterscoreManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n ROUTES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Route> ACCOMMODATIONTOROUTESROUTESHANDLER = new OneToManyHandler<Route>(
	CommonproductcoreConstants.TC.ROUTE,
	true,
	"accommodation",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n INANDARROUND's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PlaceDescription> ACCOMMODATIONTOINANDARROUNDINANDARROUNDHANDLER = new OneToManyHandler<PlaceDescription>(
	CommonproductcoreConstants.TC.PLACEDESCRIPTION,
	true,
	"accommodation",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n FAMILYDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<FamilyDetail> ACCOMMODATIONTOFAMILYDETAILFAMILYDETAILSHANDLER = new OneToManyHandler<FamilyDetail>(
	AccoproductmasterscoreConstants.TC.FAMILYDETAIL,
	true,
	"accommodation",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n LANDMARKS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PlaceDescription> ACCOMMODATIONTOLANDMARKSLANDMARKSHANDLER = new OneToManyHandler<PlaceDescription>(
	CommonproductcoreConstants.TC.PLACEDESCRIPTION,
	true,
	"accommodation",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n RULEINFOS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<RuleInfo> ACCOMMODATIONTORULEINFOSRULEINFOSHANDLER = new OneToManyHandler<RuleInfo>(
	CommonproductcoreConstants.TC.RULEINFO,
	true,
	"accommodation",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ROOMINFOS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<RoomInfo> ACCOMMODATIONTOROOMINFOSROOMINFOSHANDLER = new OneToManyHandler<RoomInfo>(
	AccoproductmasterscoreConstants.TC.ROOMINFO,
	true,
	"accommodation",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PAXOCCUPANCIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<RoomPaxOccupancy> ACCOMMODATIONTOPAXOCCUPANCIESPAXOCCUPANCIESHANDLER = new OneToManyHandler<RoomPaxOccupancy>(
	AccoproductmasterscoreConstants.TC.ROOMPAXOCCUPANCY,
	true,
	"accommodation",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n HEALTHANDSAFETIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<HealthAndSafety> ACCOMMODATIONTOHEALTHANDSAFETIESHEALTHANDSAFETIESHANDLER = new OneToManyHandler<HealthAndSafety>(
	CommonproductcoreConstants.TC.HEALTHANDSAFETY,
	true,
	"accommodation",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CONTACTDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ContactDetails> ACCOMMODATIONTOCONTACTDETAILSCONTACTDETAILSHANDLER = new OneToManyHandler<ContactDetails>(
	MasterdatacoreConstants.TC.CONTACTDETAILS,
	true,
	"accommodation",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n FACILITIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Facility> ACCOMMODATIONTOFACILITIESFACILITIESHANDLER = new OneToManyHandler<Facility>(
	CommonproductcoreConstants.TC.FACILITY,
	true,
	"accommodation",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n STAFFINFORMATION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<StaffInformation> ACCOMMODATIONTOSTAFFINFOSTAFFINFORMATIONHANDLER = new OneToManyHandler<StaffInformation>(
	MasterdatacoreConstants.TC.STAFFINFORMATION,
	true,
	"accommodation",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("newsLetterRequired", AttributeMode.INITIAL);
		tmp.put("emailAddressType", AttributeMode.INITIAL);
		tmp.put("webpageAddress", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.acceleratorservices.jalo.email.EmailAddress", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("mysteryCountry", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.c2l.Country", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("mysteryCity", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.c2l.jalo.City", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("mysteryLocation", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.c2l.jalo.Location", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("accommodation", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.product.common.core.jalo.Route", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("accommodation", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.product.common.core.jalo.PlaceDescription", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("accommodation", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.product.common.core.jalo.RuleInfo", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("roomInfo", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.amenity.jalo.AmenityType", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("accommodation", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.product.common.core.jalo.HealthAndSafety", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("accommodation", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.contacts.jalo.ContactDetails", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("accommodation", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.product.common.core.jalo.Facility", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("accommodation", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.staff.jalo.StaffInformation", Collections.unmodifiableMap(tmp));
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
	 * <i>Generated method</i> - Getter of the <code>Route.accommodation</code> attribute.
	 * @return the accommodation
	 */
	public Accommodation getAccommodation(final SessionContext ctx, final Route item)
	{
		return (Accommodation)item.getProperty( ctx, AccoproductmasterscoreConstants.Attributes.Route.ACCOMMODATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.accommodation</code> attribute.
	 * @return the accommodation
	 */
	public Accommodation getAccommodation(final Route item)
	{
		return getAccommodation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.accommodation</code> attribute. 
	 * @param value the accommodation
	 */
	public void setAccommodation(final SessionContext ctx, final Route item, final Accommodation value)
	{
		item.setProperty(ctx, AccoproductmasterscoreConstants.Attributes.Route.ACCOMMODATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.accommodation</code> attribute. 
	 * @param value the accommodation
	 */
	public void setAccommodation(final Route item, final Accommodation value)
	{
		setAccommodation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PlaceDescription.accommodation</code> attribute.
	 * @return the accommodation
	 */
	public Accommodation getAccommodation(final SessionContext ctx, final PlaceDescription item)
	{
		return (Accommodation)item.getProperty( ctx, AccoproductmasterscoreConstants.Attributes.PlaceDescription.ACCOMMODATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PlaceDescription.accommodation</code> attribute.
	 * @return the accommodation
	 */
	public Accommodation getAccommodation(final PlaceDescription item)
	{
		return getAccommodation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PlaceDescription.accommodation</code> attribute. 
	 * @param value the accommodation
	 */
	public void setAccommodation(final SessionContext ctx, final PlaceDescription item, final Accommodation value)
	{
		item.setProperty(ctx, AccoproductmasterscoreConstants.Attributes.PlaceDescription.ACCOMMODATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PlaceDescription.accommodation</code> attribute. 
	 * @param value the accommodation
	 */
	public void setAccommodation(final PlaceDescription item, final Accommodation value)
	{
		setAccommodation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RuleInfo.accommodation</code> attribute.
	 * @return the accommodation
	 */
	public Accommodation getAccommodation(final SessionContext ctx, final RuleInfo item)
	{
		return (Accommodation)item.getProperty( ctx, AccoproductmasterscoreConstants.Attributes.RuleInfo.ACCOMMODATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RuleInfo.accommodation</code> attribute.
	 * @return the accommodation
	 */
	public Accommodation getAccommodation(final RuleInfo item)
	{
		return getAccommodation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RuleInfo.accommodation</code> attribute. 
	 * @param value the accommodation
	 */
	public void setAccommodation(final SessionContext ctx, final RuleInfo item, final Accommodation value)
	{
		item.setProperty(ctx, AccoproductmasterscoreConstants.Attributes.RuleInfo.ACCOMMODATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RuleInfo.accommodation</code> attribute. 
	 * @param value the accommodation
	 */
	public void setAccommodation(final RuleInfo item, final Accommodation value)
	{
		setAccommodation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HealthAndSafety.accommodation</code> attribute.
	 * @return the accommodation
	 */
	public Accommodation getAccommodation(final SessionContext ctx, final HealthAndSafety item)
	{
		return (Accommodation)item.getProperty( ctx, AccoproductmasterscoreConstants.Attributes.HealthAndSafety.ACCOMMODATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HealthAndSafety.accommodation</code> attribute.
	 * @return the accommodation
	 */
	public Accommodation getAccommodation(final HealthAndSafety item)
	{
		return getAccommodation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HealthAndSafety.accommodation</code> attribute. 
	 * @param value the accommodation
	 */
	public void setAccommodation(final SessionContext ctx, final HealthAndSafety item, final Accommodation value)
	{
		item.setProperty(ctx, AccoproductmasterscoreConstants.Attributes.HealthAndSafety.ACCOMMODATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HealthAndSafety.accommodation</code> attribute. 
	 * @param value the accommodation
	 */
	public void setAccommodation(final HealthAndSafety item, final Accommodation value)
	{
		setAccommodation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.accommodation</code> attribute.
	 * @return the accommodation
	 */
	public Accommodation getAccommodation(final SessionContext ctx, final ContactDetails item)
	{
		return (Accommodation)item.getProperty( ctx, AccoproductmasterscoreConstants.Attributes.ContactDetails.ACCOMMODATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.accommodation</code> attribute.
	 * @return the accommodation
	 */
	public Accommodation getAccommodation(final ContactDetails item)
	{
		return getAccommodation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.accommodation</code> attribute. 
	 * @param value the accommodation
	 */
	public void setAccommodation(final SessionContext ctx, final ContactDetails item, final Accommodation value)
	{
		item.setProperty(ctx, AccoproductmasterscoreConstants.Attributes.ContactDetails.ACCOMMODATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.accommodation</code> attribute. 
	 * @param value the accommodation
	 */
	public void setAccommodation(final ContactDetails item, final Accommodation value)
	{
		setAccommodation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Facility.accommodation</code> attribute.
	 * @return the accommodation
	 */
	public Accommodation getAccommodation(final SessionContext ctx, final Facility item)
	{
		return (Accommodation)item.getProperty( ctx, AccoproductmasterscoreConstants.Attributes.Facility.ACCOMMODATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Facility.accommodation</code> attribute.
	 * @return the accommodation
	 */
	public Accommodation getAccommodation(final Facility item)
	{
		return getAccommodation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Facility.accommodation</code> attribute. 
	 * @param value the accommodation
	 */
	public void setAccommodation(final SessionContext ctx, final Facility item, final Accommodation value)
	{
		item.setProperty(ctx, AccoproductmasterscoreConstants.Attributes.Facility.ACCOMMODATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Facility.accommodation</code> attribute. 
	 * @param value the accommodation
	 */
	public void setAccommodation(final Facility item, final Accommodation value)
	{
		setAccommodation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.accommodation</code> attribute.
	 * @return the accommodation
	 */
	public Accommodation getAccommodation(final SessionContext ctx, final StaffInformation item)
	{
		return (Accommodation)item.getProperty( ctx, AccoproductmasterscoreConstants.Attributes.StaffInformation.ACCOMMODATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.accommodation</code> attribute.
	 * @return the accommodation
	 */
	public Accommodation getAccommodation(final StaffInformation item)
	{
		return getAccommodation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.accommodation</code> attribute. 
	 * @param value the accommodation
	 */
	public void setAccommodation(final SessionContext ctx, final StaffInformation item, final Accommodation value)
	{
		item.setProperty(ctx, AccoproductmasterscoreConstants.Attributes.StaffInformation.ACCOMMODATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.accommodation</code> attribute. 
	 * @param value the accommodation
	 */
	public void setAccommodation(final StaffInformation item, final Accommodation value)
	{
		setAccommodation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.contactDetails</code> attribute.
	 * @return the contactDetails
	 */
	public Collection<ContactDetails> getContactDetails(final SessionContext ctx, final Accommodation item)
	{
		return ACCOMMODATIONTOCONTACTDETAILSCONTACTDETAILSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.contactDetails</code> attribute.
	 * @return the contactDetails
	 */
	public Collection<ContactDetails> getContactDetails(final Accommodation item)
	{
		return getContactDetails( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.contactDetails</code> attribute. 
	 * @param value the contactDetails
	 */
	public void setContactDetails(final SessionContext ctx, final Accommodation item, final Collection<ContactDetails> value)
	{
		ACCOMMODATIONTOCONTACTDETAILSCONTACTDETAILSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.contactDetails</code> attribute. 
	 * @param value the contactDetails
	 */
	public void setContactDetails(final Accommodation item, final Collection<ContactDetails> value)
	{
		setContactDetails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to contactDetails. 
	 * @param value the item to add to contactDetails
	 */
	public void addToContactDetails(final SessionContext ctx, final Accommodation item, final ContactDetails value)
	{
		ACCOMMODATIONTOCONTACTDETAILSCONTACTDETAILSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to contactDetails. 
	 * @param value the item to add to contactDetails
	 */
	public void addToContactDetails(final Accommodation item, final ContactDetails value)
	{
		addToContactDetails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from contactDetails. 
	 * @param value the item to remove from contactDetails
	 */
	public void removeFromContactDetails(final SessionContext ctx, final Accommodation item, final ContactDetails value)
	{
		ACCOMMODATIONTOCONTACTDETAILSCONTACTDETAILSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from contactDetails. 
	 * @param value the item to remove from contactDetails
	 */
	public void removeFromContactDetails(final Accommodation item, final ContactDetails value)
	{
		removeFromContactDetails( getSession().getSessionContext(), item, value );
	}
	
	public FamilyDetail createFamilyDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AccoproductmasterscoreConstants.TC.FAMILYDETAIL );
			return (FamilyDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating FamilyDetail : "+e.getMessage(), 0 );
		}
	}
	
	public FamilyDetail createFamilyDetail(final Map attributeValues)
	{
		return createFamilyDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public PaxOccupancy createPaxOccupancy(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AccoproductmasterscoreConstants.TC.PAXOCCUPANCY );
			return (PaxOccupancy)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PaxOccupancy : "+e.getMessage(), 0 );
		}
	}
	
	public PaxOccupancy createPaxOccupancy(final Map attributeValues)
	{
		return createPaxOccupancy( getSession().getSessionContext(), attributeValues );
	}
	
	public RoomInfo createRoomInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AccoproductmasterscoreConstants.TC.ROOMINFO );
			return (RoomInfo)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating RoomInfo : "+e.getMessage(), 0 );
		}
	}
	
	public RoomInfo createRoomInfo(final Map attributeValues)
	{
		return createRoomInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public RoomPaxOccupancy createRoomPaxOccupancy(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AccoproductmasterscoreConstants.TC.ROOMPAXOCCUPANCY );
			return (RoomPaxOccupancy)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating RoomPaxOccupancy : "+e.getMessage(), 0 );
		}
	}
	
	public RoomPaxOccupancy createRoomPaxOccupancy(final Map attributeValues)
	{
		return createRoomPaxOccupancy( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAddress.emailAddressType</code> attribute.
	 * @return the emailAddressType - Email Address Types
	 */
	public EnumerationValue getEmailAddressType(final SessionContext ctx, final EmailAddress item)
	{
		return (EnumerationValue)item.getProperty( ctx, AccoproductmasterscoreConstants.Attributes.EmailAddress.EMAILADDRESSTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAddress.emailAddressType</code> attribute.
	 * @return the emailAddressType - Email Address Types
	 */
	public EnumerationValue getEmailAddressType(final EmailAddress item)
	{
		return getEmailAddressType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailAddress.emailAddressType</code> attribute. 
	 * @param value the emailAddressType - Email Address Types
	 */
	public void setEmailAddressType(final SessionContext ctx, final EmailAddress item, final EnumerationValue value)
	{
		item.setProperty(ctx, AccoproductmasterscoreConstants.Attributes.EmailAddress.EMAILADDRESSTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailAddress.emailAddressType</code> attribute. 
	 * @param value the emailAddressType - Email Address Types
	 */
	public void setEmailAddressType(final EmailAddress item, final EnumerationValue value)
	{
		setEmailAddressType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.facilities</code> attribute.
	 * @return the facilities
	 */
	public Collection<Facility> getFacilities(final SessionContext ctx, final Accommodation item)
	{
		return ACCOMMODATIONTOFACILITIESFACILITIESHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.facilities</code> attribute.
	 * @return the facilities
	 */
	public Collection<Facility> getFacilities(final Accommodation item)
	{
		return getFacilities( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.facilities</code> attribute. 
	 * @param value the facilities
	 */
	public void setFacilities(final SessionContext ctx, final Accommodation item, final Collection<Facility> value)
	{
		ACCOMMODATIONTOFACILITIESFACILITIESHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.facilities</code> attribute. 
	 * @param value the facilities
	 */
	public void setFacilities(final Accommodation item, final Collection<Facility> value)
	{
		setFacilities( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to facilities. 
	 * @param value the item to add to facilities
	 */
	public void addToFacilities(final SessionContext ctx, final Accommodation item, final Facility value)
	{
		ACCOMMODATIONTOFACILITIESFACILITIESHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to facilities. 
	 * @param value the item to add to facilities
	 */
	public void addToFacilities(final Accommodation item, final Facility value)
	{
		addToFacilities( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from facilities. 
	 * @param value the item to remove from facilities
	 */
	public void removeFromFacilities(final SessionContext ctx, final Accommodation item, final Facility value)
	{
		ACCOMMODATIONTOFACILITIESFACILITIESHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from facilities. 
	 * @param value the item to remove from facilities
	 */
	public void removeFromFacilities(final Accommodation item, final Facility value)
	{
		removeFromFacilities( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.familyDetails</code> attribute.
	 * @return the familyDetails
	 */
	public Collection<FamilyDetail> getFamilyDetails(final SessionContext ctx, final Accommodation item)
	{
		return ACCOMMODATIONTOFAMILYDETAILFAMILYDETAILSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.familyDetails</code> attribute.
	 * @return the familyDetails
	 */
	public Collection<FamilyDetail> getFamilyDetails(final Accommodation item)
	{
		return getFamilyDetails( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.familyDetails</code> attribute. 
	 * @param value the familyDetails
	 */
	public void setFamilyDetails(final SessionContext ctx, final Accommodation item, final Collection<FamilyDetail> value)
	{
		ACCOMMODATIONTOFAMILYDETAILFAMILYDETAILSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.familyDetails</code> attribute. 
	 * @param value the familyDetails
	 */
	public void setFamilyDetails(final Accommodation item, final Collection<FamilyDetail> value)
	{
		setFamilyDetails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to familyDetails. 
	 * @param value the item to add to familyDetails
	 */
	public void addToFamilyDetails(final SessionContext ctx, final Accommodation item, final FamilyDetail value)
	{
		ACCOMMODATIONTOFAMILYDETAILFAMILYDETAILSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to familyDetails. 
	 * @param value the item to add to familyDetails
	 */
	public void addToFamilyDetails(final Accommodation item, final FamilyDetail value)
	{
		addToFamilyDetails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from familyDetails. 
	 * @param value the item to remove from familyDetails
	 */
	public void removeFromFamilyDetails(final SessionContext ctx, final Accommodation item, final FamilyDetail value)
	{
		ACCOMMODATIONTOFAMILYDETAILFAMILYDETAILSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from familyDetails. 
	 * @param value the item to remove from familyDetails
	 */
	public void removeFromFamilyDetails(final Accommodation item, final FamilyDetail value)
	{
		removeFromFamilyDetails( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return AccoproductmasterscoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.healthAndSafeties</code> attribute.
	 * @return the healthAndSafeties
	 */
	public Collection<HealthAndSafety> getHealthAndSafeties(final SessionContext ctx, final Accommodation item)
	{
		return ACCOMMODATIONTOHEALTHANDSAFETIESHEALTHANDSAFETIESHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.healthAndSafeties</code> attribute.
	 * @return the healthAndSafeties
	 */
	public Collection<HealthAndSafety> getHealthAndSafeties(final Accommodation item)
	{
		return getHealthAndSafeties( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.healthAndSafeties</code> attribute. 
	 * @param value the healthAndSafeties
	 */
	public void setHealthAndSafeties(final SessionContext ctx, final Accommodation item, final Collection<HealthAndSafety> value)
	{
		ACCOMMODATIONTOHEALTHANDSAFETIESHEALTHANDSAFETIESHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.healthAndSafeties</code> attribute. 
	 * @param value the healthAndSafeties
	 */
	public void setHealthAndSafeties(final Accommodation item, final Collection<HealthAndSafety> value)
	{
		setHealthAndSafeties( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to healthAndSafeties. 
	 * @param value the item to add to healthAndSafeties
	 */
	public void addToHealthAndSafeties(final SessionContext ctx, final Accommodation item, final HealthAndSafety value)
	{
		ACCOMMODATIONTOHEALTHANDSAFETIESHEALTHANDSAFETIESHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to healthAndSafeties. 
	 * @param value the item to add to healthAndSafeties
	 */
	public void addToHealthAndSafeties(final Accommodation item, final HealthAndSafety value)
	{
		addToHealthAndSafeties( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from healthAndSafeties. 
	 * @param value the item to remove from healthAndSafeties
	 */
	public void removeFromHealthAndSafeties(final SessionContext ctx, final Accommodation item, final HealthAndSafety value)
	{
		ACCOMMODATIONTOHEALTHANDSAFETIESHEALTHANDSAFETIESHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from healthAndSafeties. 
	 * @param value the item to remove from healthAndSafeties
	 */
	public void removeFromHealthAndSafeties(final Accommodation item, final HealthAndSafety value)
	{
		removeFromHealthAndSafeties( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.inAndArround</code> attribute.
	 * @return the inAndArround
	 */
	public Collection<PlaceDescription> getInAndArround(final SessionContext ctx, final Accommodation item)
	{
		return ACCOMMODATIONTOINANDARROUNDINANDARROUNDHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.inAndArround</code> attribute.
	 * @return the inAndArround
	 */
	public Collection<PlaceDescription> getInAndArround(final Accommodation item)
	{
		return getInAndArround( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.inAndArround</code> attribute. 
	 * @param value the inAndArround
	 */
	public void setInAndArround(final SessionContext ctx, final Accommodation item, final Collection<PlaceDescription> value)
	{
		ACCOMMODATIONTOINANDARROUNDINANDARROUNDHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.inAndArround</code> attribute. 
	 * @param value the inAndArround
	 */
	public void setInAndArround(final Accommodation item, final Collection<PlaceDescription> value)
	{
		setInAndArround( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inAndArround. 
	 * @param value the item to add to inAndArround
	 */
	public void addToInAndArround(final SessionContext ctx, final Accommodation item, final PlaceDescription value)
	{
		ACCOMMODATIONTOINANDARROUNDINANDARROUNDHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inAndArround. 
	 * @param value the item to add to inAndArround
	 */
	public void addToInAndArround(final Accommodation item, final PlaceDescription value)
	{
		addToInAndArround( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inAndArround. 
	 * @param value the item to remove from inAndArround
	 */
	public void removeFromInAndArround(final SessionContext ctx, final Accommodation item, final PlaceDescription value)
	{
		ACCOMMODATIONTOINANDARROUNDINANDARROUNDHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inAndArround. 
	 * @param value the item to remove from inAndArround
	 */
	public void removeFromInAndArround(final Accommodation item, final PlaceDescription value)
	{
		removeFromInAndArround( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.landmarks</code> attribute.
	 * @return the landmarks
	 */
	public Collection<PlaceDescription> getLandmarks(final SessionContext ctx, final Accommodation item)
	{
		return ACCOMMODATIONTOLANDMARKSLANDMARKSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.landmarks</code> attribute.
	 * @return the landmarks
	 */
	public Collection<PlaceDescription> getLandmarks(final Accommodation item)
	{
		return getLandmarks( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.landmarks</code> attribute. 
	 * @param value the landmarks
	 */
	public void setLandmarks(final SessionContext ctx, final Accommodation item, final Collection<PlaceDescription> value)
	{
		ACCOMMODATIONTOLANDMARKSLANDMARKSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.landmarks</code> attribute. 
	 * @param value the landmarks
	 */
	public void setLandmarks(final Accommodation item, final Collection<PlaceDescription> value)
	{
		setLandmarks( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to landmarks. 
	 * @param value the item to add to landmarks
	 */
	public void addToLandmarks(final SessionContext ctx, final Accommodation item, final PlaceDescription value)
	{
		ACCOMMODATIONTOLANDMARKSLANDMARKSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to landmarks. 
	 * @param value the item to add to landmarks
	 */
	public void addToLandmarks(final Accommodation item, final PlaceDescription value)
	{
		addToLandmarks( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from landmarks. 
	 * @param value the item to remove from landmarks
	 */
	public void removeFromLandmarks(final SessionContext ctx, final Accommodation item, final PlaceDescription value)
	{
		ACCOMMODATIONTOLANDMARKSLANDMARKSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from landmarks. 
	 * @param value the item to remove from landmarks
	 */
	public void removeFromLandmarks(final Accommodation item, final PlaceDescription value)
	{
		removeFromLandmarks( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>City.mysteryCity</code> attribute.
	 * @return the mysteryCity - Mystery City
	 */
	public Boolean isMysteryCity(final SessionContext ctx, final City item)
	{
		return (Boolean)item.getProperty( ctx, AccoproductmasterscoreConstants.Attributes.City.MYSTERYCITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>City.mysteryCity</code> attribute.
	 * @return the mysteryCity - Mystery City
	 */
	public Boolean isMysteryCity(final City item)
	{
		return isMysteryCity( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>City.mysteryCity</code> attribute. 
	 * @return the mysteryCity - Mystery City
	 */
	public boolean isMysteryCityAsPrimitive(final SessionContext ctx, final City item)
	{
		Boolean value = isMysteryCity( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>City.mysteryCity</code> attribute. 
	 * @return the mysteryCity - Mystery City
	 */
	public boolean isMysteryCityAsPrimitive(final City item)
	{
		return isMysteryCityAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>City.mysteryCity</code> attribute. 
	 * @param value the mysteryCity - Mystery City
	 */
	public void setMysteryCity(final SessionContext ctx, final City item, final Boolean value)
	{
		item.setProperty(ctx, AccoproductmasterscoreConstants.Attributes.City.MYSTERYCITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>City.mysteryCity</code> attribute. 
	 * @param value the mysteryCity - Mystery City
	 */
	public void setMysteryCity(final City item, final Boolean value)
	{
		setMysteryCity( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>City.mysteryCity</code> attribute. 
	 * @param value the mysteryCity - Mystery City
	 */
	public void setMysteryCity(final SessionContext ctx, final City item, final boolean value)
	{
		setMysteryCity( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>City.mysteryCity</code> attribute. 
	 * @param value the mysteryCity - Mystery City
	 */
	public void setMysteryCity(final City item, final boolean value)
	{
		setMysteryCity( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Country.mysteryCountry</code> attribute.
	 * @return the mysteryCountry - Mystery Country
	 */
	public Boolean isMysteryCountry(final SessionContext ctx, final Country item)
	{
		return (Boolean)item.getProperty( ctx, AccoproductmasterscoreConstants.Attributes.Country.MYSTERYCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Country.mysteryCountry</code> attribute.
	 * @return the mysteryCountry - Mystery Country
	 */
	public Boolean isMysteryCountry(final Country item)
	{
		return isMysteryCountry( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Country.mysteryCountry</code> attribute. 
	 * @return the mysteryCountry - Mystery Country
	 */
	public boolean isMysteryCountryAsPrimitive(final SessionContext ctx, final Country item)
	{
		Boolean value = isMysteryCountry( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Country.mysteryCountry</code> attribute. 
	 * @return the mysteryCountry - Mystery Country
	 */
	public boolean isMysteryCountryAsPrimitive(final Country item)
	{
		return isMysteryCountryAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Country.mysteryCountry</code> attribute. 
	 * @param value the mysteryCountry - Mystery Country
	 */
	public void setMysteryCountry(final SessionContext ctx, final Country item, final Boolean value)
	{
		item.setProperty(ctx, AccoproductmasterscoreConstants.Attributes.Country.MYSTERYCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Country.mysteryCountry</code> attribute. 
	 * @param value the mysteryCountry - Mystery Country
	 */
	public void setMysteryCountry(final Country item, final Boolean value)
	{
		setMysteryCountry( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Country.mysteryCountry</code> attribute. 
	 * @param value the mysteryCountry - Mystery Country
	 */
	public void setMysteryCountry(final SessionContext ctx, final Country item, final boolean value)
	{
		setMysteryCountry( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Country.mysteryCountry</code> attribute. 
	 * @param value the mysteryCountry - Mystery Country
	 */
	public void setMysteryCountry(final Country item, final boolean value)
	{
		setMysteryCountry( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.mysteryLocation</code> attribute.
	 * @return the mysteryLocation - Mystery Location
	 */
	public Boolean isMysteryLocation(final SessionContext ctx, final Location item)
	{
		return (Boolean)item.getProperty( ctx, AccoproductmasterscoreConstants.Attributes.Location.MYSTERYLOCATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.mysteryLocation</code> attribute.
	 * @return the mysteryLocation - Mystery Location
	 */
	public Boolean isMysteryLocation(final Location item)
	{
		return isMysteryLocation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.mysteryLocation</code> attribute. 
	 * @return the mysteryLocation - Mystery Location
	 */
	public boolean isMysteryLocationAsPrimitive(final SessionContext ctx, final Location item)
	{
		Boolean value = isMysteryLocation( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.mysteryLocation</code> attribute. 
	 * @return the mysteryLocation - Mystery Location
	 */
	public boolean isMysteryLocationAsPrimitive(final Location item)
	{
		return isMysteryLocationAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.mysteryLocation</code> attribute. 
	 * @param value the mysteryLocation - Mystery Location
	 */
	public void setMysteryLocation(final SessionContext ctx, final Location item, final Boolean value)
	{
		item.setProperty(ctx, AccoproductmasterscoreConstants.Attributes.Location.MYSTERYLOCATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.mysteryLocation</code> attribute. 
	 * @param value the mysteryLocation - Mystery Location
	 */
	public void setMysteryLocation(final Location item, final Boolean value)
	{
		setMysteryLocation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.mysteryLocation</code> attribute. 
	 * @param value the mysteryLocation - Mystery Location
	 */
	public void setMysteryLocation(final SessionContext ctx, final Location item, final boolean value)
	{
		setMysteryLocation( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.mysteryLocation</code> attribute. 
	 * @param value the mysteryLocation - Mystery Location
	 */
	public void setMysteryLocation(final Location item, final boolean value)
	{
		setMysteryLocation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAddress.newsLetterRequired</code> attribute.
	 * @return the newsLetterRequired - News Letter
	 */
	public Boolean isNewsLetterRequired(final SessionContext ctx, final EmailAddress item)
	{
		return (Boolean)item.getProperty( ctx, AccoproductmasterscoreConstants.Attributes.EmailAddress.NEWSLETTERREQUIRED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAddress.newsLetterRequired</code> attribute.
	 * @return the newsLetterRequired - News Letter
	 */
	public Boolean isNewsLetterRequired(final EmailAddress item)
	{
		return isNewsLetterRequired( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAddress.newsLetterRequired</code> attribute. 
	 * @return the newsLetterRequired - News Letter
	 */
	public boolean isNewsLetterRequiredAsPrimitive(final SessionContext ctx, final EmailAddress item)
	{
		Boolean value = isNewsLetterRequired( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAddress.newsLetterRequired</code> attribute. 
	 * @return the newsLetterRequired - News Letter
	 */
	public boolean isNewsLetterRequiredAsPrimitive(final EmailAddress item)
	{
		return isNewsLetterRequiredAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailAddress.newsLetterRequired</code> attribute. 
	 * @param value the newsLetterRequired - News Letter
	 */
	public void setNewsLetterRequired(final SessionContext ctx, final EmailAddress item, final Boolean value)
	{
		item.setProperty(ctx, AccoproductmasterscoreConstants.Attributes.EmailAddress.NEWSLETTERREQUIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailAddress.newsLetterRequired</code> attribute. 
	 * @param value the newsLetterRequired - News Letter
	 */
	public void setNewsLetterRequired(final EmailAddress item, final Boolean value)
	{
		setNewsLetterRequired( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailAddress.newsLetterRequired</code> attribute. 
	 * @param value the newsLetterRequired - News Letter
	 */
	public void setNewsLetterRequired(final SessionContext ctx, final EmailAddress item, final boolean value)
	{
		setNewsLetterRequired( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailAddress.newsLetterRequired</code> attribute. 
	 * @param value the newsLetterRequired - News Letter
	 */
	public void setNewsLetterRequired(final EmailAddress item, final boolean value)
	{
		setNewsLetterRequired( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.paxOccupancies</code> attribute.
	 * @return the paxOccupancies
	 */
	public Collection<RoomPaxOccupancy> getPaxOccupancies(final SessionContext ctx, final Accommodation item)
	{
		return ACCOMMODATIONTOPAXOCCUPANCIESPAXOCCUPANCIESHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.paxOccupancies</code> attribute.
	 * @return the paxOccupancies
	 */
	public Collection<RoomPaxOccupancy> getPaxOccupancies(final Accommodation item)
	{
		return getPaxOccupancies( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.paxOccupancies</code> attribute. 
	 * @param value the paxOccupancies
	 */
	public void setPaxOccupancies(final SessionContext ctx, final Accommodation item, final Collection<RoomPaxOccupancy> value)
	{
		ACCOMMODATIONTOPAXOCCUPANCIESPAXOCCUPANCIESHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.paxOccupancies</code> attribute. 
	 * @param value the paxOccupancies
	 */
	public void setPaxOccupancies(final Accommodation item, final Collection<RoomPaxOccupancy> value)
	{
		setPaxOccupancies( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to paxOccupancies. 
	 * @param value the item to add to paxOccupancies
	 */
	public void addToPaxOccupancies(final SessionContext ctx, final Accommodation item, final RoomPaxOccupancy value)
	{
		ACCOMMODATIONTOPAXOCCUPANCIESPAXOCCUPANCIESHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to paxOccupancies. 
	 * @param value the item to add to paxOccupancies
	 */
	public void addToPaxOccupancies(final Accommodation item, final RoomPaxOccupancy value)
	{
		addToPaxOccupancies( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from paxOccupancies. 
	 * @param value the item to remove from paxOccupancies
	 */
	public void removeFromPaxOccupancies(final SessionContext ctx, final Accommodation item, final RoomPaxOccupancy value)
	{
		ACCOMMODATIONTOPAXOCCUPANCIESPAXOCCUPANCIESHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from paxOccupancies. 
	 * @param value the item to remove from paxOccupancies
	 */
	public void removeFromPaxOccupancies(final Accommodation item, final RoomPaxOccupancy value)
	{
		removeFromPaxOccupancies( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AmenityType.roomInfo</code> attribute.
	 * @return the roomInfo
	 */
	public RoomInfo getRoomInfo(final SessionContext ctx, final AmenityType item)
	{
		return (RoomInfo)item.getProperty( ctx, AccoproductmasterscoreConstants.Attributes.AmenityType.ROOMINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AmenityType.roomInfo</code> attribute.
	 * @return the roomInfo
	 */
	public RoomInfo getRoomInfo(final AmenityType item)
	{
		return getRoomInfo( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AmenityType.roomInfo</code> attribute. 
	 * @param value the roomInfo
	 */
	public void setRoomInfo(final SessionContext ctx, final AmenityType item, final RoomInfo value)
	{
		item.setProperty(ctx, AccoproductmasterscoreConstants.Attributes.AmenityType.ROOMINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AmenityType.roomInfo</code> attribute. 
	 * @param value the roomInfo
	 */
	public void setRoomInfo(final AmenityType item, final RoomInfo value)
	{
		setRoomInfo( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.roomInfos</code> attribute.
	 * @return the roomInfos
	 */
	public Collection<RoomInfo> getRoomInfos(final SessionContext ctx, final Accommodation item)
	{
		return ACCOMMODATIONTOROOMINFOSROOMINFOSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.roomInfos</code> attribute.
	 * @return the roomInfos
	 */
	public Collection<RoomInfo> getRoomInfos(final Accommodation item)
	{
		return getRoomInfos( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.roomInfos</code> attribute. 
	 * @param value the roomInfos
	 */
	public void setRoomInfos(final SessionContext ctx, final Accommodation item, final Collection<RoomInfo> value)
	{
		ACCOMMODATIONTOROOMINFOSROOMINFOSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.roomInfos</code> attribute. 
	 * @param value the roomInfos
	 */
	public void setRoomInfos(final Accommodation item, final Collection<RoomInfo> value)
	{
		setRoomInfos( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to roomInfos. 
	 * @param value the item to add to roomInfos
	 */
	public void addToRoomInfos(final SessionContext ctx, final Accommodation item, final RoomInfo value)
	{
		ACCOMMODATIONTOROOMINFOSROOMINFOSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to roomInfos. 
	 * @param value the item to add to roomInfos
	 */
	public void addToRoomInfos(final Accommodation item, final RoomInfo value)
	{
		addToRoomInfos( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from roomInfos. 
	 * @param value the item to remove from roomInfos
	 */
	public void removeFromRoomInfos(final SessionContext ctx, final Accommodation item, final RoomInfo value)
	{
		ACCOMMODATIONTOROOMINFOSROOMINFOSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from roomInfos. 
	 * @param value the item to remove from roomInfos
	 */
	public void removeFromRoomInfos(final Accommodation item, final RoomInfo value)
	{
		removeFromRoomInfos( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.routes</code> attribute.
	 * @return the routes
	 */
	public Collection<Route> getRoutes(final SessionContext ctx, final Accommodation item)
	{
		return ACCOMMODATIONTOROUTESROUTESHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.routes</code> attribute.
	 * @return the routes
	 */
	public Collection<Route> getRoutes(final Accommodation item)
	{
		return getRoutes( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.routes</code> attribute. 
	 * @param value the routes
	 */
	public void setRoutes(final SessionContext ctx, final Accommodation item, final Collection<Route> value)
	{
		ACCOMMODATIONTOROUTESROUTESHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.routes</code> attribute. 
	 * @param value the routes
	 */
	public void setRoutes(final Accommodation item, final Collection<Route> value)
	{
		setRoutes( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to routes. 
	 * @param value the item to add to routes
	 */
	public void addToRoutes(final SessionContext ctx, final Accommodation item, final Route value)
	{
		ACCOMMODATIONTOROUTESROUTESHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to routes. 
	 * @param value the item to add to routes
	 */
	public void addToRoutes(final Accommodation item, final Route value)
	{
		addToRoutes( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from routes. 
	 * @param value the item to remove from routes
	 */
	public void removeFromRoutes(final SessionContext ctx, final Accommodation item, final Route value)
	{
		ACCOMMODATIONTOROUTESROUTESHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from routes. 
	 * @param value the item to remove from routes
	 */
	public void removeFromRoutes(final Accommodation item, final Route value)
	{
		removeFromRoutes( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.ruleInfos</code> attribute.
	 * @return the ruleInfos
	 */
	public Collection<RuleInfo> getRuleInfos(final SessionContext ctx, final Accommodation item)
	{
		return ACCOMMODATIONTORULEINFOSRULEINFOSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.ruleInfos</code> attribute.
	 * @return the ruleInfos
	 */
	public Collection<RuleInfo> getRuleInfos(final Accommodation item)
	{
		return getRuleInfos( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.ruleInfos</code> attribute. 
	 * @param value the ruleInfos
	 */
	public void setRuleInfos(final SessionContext ctx, final Accommodation item, final Collection<RuleInfo> value)
	{
		ACCOMMODATIONTORULEINFOSRULEINFOSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.ruleInfos</code> attribute. 
	 * @param value the ruleInfos
	 */
	public void setRuleInfos(final Accommodation item, final Collection<RuleInfo> value)
	{
		setRuleInfos( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ruleInfos. 
	 * @param value the item to add to ruleInfos
	 */
	public void addToRuleInfos(final SessionContext ctx, final Accommodation item, final RuleInfo value)
	{
		ACCOMMODATIONTORULEINFOSRULEINFOSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ruleInfos. 
	 * @param value the item to add to ruleInfos
	 */
	public void addToRuleInfos(final Accommodation item, final RuleInfo value)
	{
		addToRuleInfos( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ruleInfos. 
	 * @param value the item to remove from ruleInfos
	 */
	public void removeFromRuleInfos(final SessionContext ctx, final Accommodation item, final RuleInfo value)
	{
		ACCOMMODATIONTORULEINFOSRULEINFOSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ruleInfos. 
	 * @param value the item to remove from ruleInfos
	 */
	public void removeFromRuleInfos(final Accommodation item, final RuleInfo value)
	{
		removeFromRuleInfos( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.staffInformation</code> attribute.
	 * @return the staffInformation
	 */
	public Collection<StaffInformation> getStaffInformation(final SessionContext ctx, final Accommodation item)
	{
		return ACCOMMODATIONTOSTAFFINFOSTAFFINFORMATIONHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.staffInformation</code> attribute.
	 * @return the staffInformation
	 */
	public Collection<StaffInformation> getStaffInformation(final Accommodation item)
	{
		return getStaffInformation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.staffInformation</code> attribute. 
	 * @param value the staffInformation
	 */
	public void setStaffInformation(final SessionContext ctx, final Accommodation item, final Collection<StaffInformation> value)
	{
		ACCOMMODATIONTOSTAFFINFOSTAFFINFORMATIONHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.staffInformation</code> attribute. 
	 * @param value the staffInformation
	 */
	public void setStaffInformation(final Accommodation item, final Collection<StaffInformation> value)
	{
		setStaffInformation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to staffInformation. 
	 * @param value the item to add to staffInformation
	 */
	public void addToStaffInformation(final SessionContext ctx, final Accommodation item, final StaffInformation value)
	{
		ACCOMMODATIONTOSTAFFINFOSTAFFINFORMATIONHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to staffInformation. 
	 * @param value the item to add to staffInformation
	 */
	public void addToStaffInformation(final Accommodation item, final StaffInformation value)
	{
		addToStaffInformation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from staffInformation. 
	 * @param value the item to remove from staffInformation
	 */
	public void removeFromStaffInformation(final SessionContext ctx, final Accommodation item, final StaffInformation value)
	{
		ACCOMMODATIONTOSTAFFINFOSTAFFINFORMATIONHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from staffInformation. 
	 * @param value the item to remove from staffInformation
	 */
	public void removeFromStaffInformation(final Accommodation item, final StaffInformation value)
	{
		removeFromStaffInformation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAddress.webpageAddress</code> attribute.
	 * @return the webpageAddress - web page Address
	 */
	public String getWebpageAddress(final SessionContext ctx, final EmailAddress item)
	{
		return (String)item.getProperty( ctx, AccoproductmasterscoreConstants.Attributes.EmailAddress.WEBPAGEADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAddress.webpageAddress</code> attribute.
	 * @return the webpageAddress - web page Address
	 */
	public String getWebpageAddress(final EmailAddress item)
	{
		return getWebpageAddress( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailAddress.webpageAddress</code> attribute. 
	 * @param value the webpageAddress - web page Address
	 */
	public void setWebpageAddress(final SessionContext ctx, final EmailAddress item, final String value)
	{
		item.setProperty(ctx, AccoproductmasterscoreConstants.Attributes.EmailAddress.WEBPAGEADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailAddress.webpageAddress</code> attribute. 
	 * @param value the webpageAddress - web page Address
	 */
	public void setWebpageAddress(final EmailAddress item, final String value)
	{
		setWebpageAddress( getSession().getSessionContext(), item, value );
	}
	
}
