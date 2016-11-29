/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.masters.core.jalo;

import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.masterdata.core.c2l.jalo.Continent;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.masterdata.core.jalo.TravelogixPolicy;
import com.cnk.travelogix.supplier.core.contact.jalo.SupplierEmergencyContact;
import com.cnk.travelogix.supplier.masterdata.core.policy.AbstractDynamicPolicy;
import com.cnk.travelogix.supplier.masterdata.core.policy.AccoDynamicPolicy;
import com.cnk.travelogix.supplier.masterdata.core.policy.ActivityDynamicPolicy;
import com.cnk.travelogix.supplier.masterdata.core.policy.CruiseDynamicPolicy;
import com.cnk.travelogix.supplier.masterdata.core.policy.FlightsDynamicPolicy;
import com.cnk.travelogix.supplier.masterdata.core.policy.HolidaysDynamicPolicy;
import com.cnk.travelogix.supplier.masterdata.core.policy.TransportationDynamicPolicy;
import com.cnk.travelogix.supplier.masters.core.constants.SuppliermasterscoreConstants;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LItem;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.c2l.Region;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type <code>SuppliermasterscoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSuppliermasterscoreManager extends Extension
{
	/** Relation ordering override parameter constants for EmergencyContact2Country from ((suppliermasterscore))*/
	protected static String EMERGENCYCONTACT2COUNTRY_SRC_ORDERED = "relation.EmergencyContact2Country.source.ordered";
	protected static String EMERGENCYCONTACT2COUNTRY_TGT_ORDERED = "relation.EmergencyContact2Country.target.ordered";
	/** Relation disable markmodifed parameter constants for EmergencyContact2Country from ((suppliermasterscore))*/
	protected static String EMERGENCYCONTACT2COUNTRY_MARKMODIFIED = "relation.EmergencyContact2Country.markmodified";
	/** Relation ordering override parameter constants for EmergencyContact2Continent from ((suppliermasterscore))*/
	protected static String EMERGENCYCONTACT2CONTINENT_SRC_ORDERED = "relation.EmergencyContact2Continent.source.ordered";
	protected static String EMERGENCYCONTACT2CONTINENT_TGT_ORDERED = "relation.EmergencyContact2Continent.target.ordered";
	/** Relation disable markmodifed parameter constants for EmergencyContact2Continent from ((suppliermasterscore))*/
	protected static String EMERGENCYCONTACT2CONTINENT_MARKMODIFIED = "relation.EmergencyContact2Continent.markmodified";
	/** Relation ordering override parameter constants for EmergencyContact2Region from ((suppliermasterscore))*/
	protected static String EMERGENCYCONTACT2REGION_SRC_ORDERED = "relation.EmergencyContact2Region.source.ordered";
	protected static String EMERGENCYCONTACT2REGION_TGT_ORDERED = "relation.EmergencyContact2Region.target.ordered";
	/** Relation disable markmodifed parameter constants for EmergencyContact2Region from ((suppliermasterscore))*/
	protected static String EMERGENCYCONTACT2REGION_MARKMODIFIED = "relation.EmergencyContact2Region.markmodified";
	/** Relation ordering override parameter constants for EmergencyContact2City from ((suppliermasterscore))*/
	protected static String EMERGENCYCONTACT2CITY_SRC_ORDERED = "relation.EmergencyContact2City.source.ordered";
	protected static String EMERGENCYCONTACT2CITY_TGT_ORDERED = "relation.EmergencyContact2City.target.ordered";
	/** Relation disable markmodifed parameter constants for EmergencyContact2City from ((suppliermasterscore))*/
	protected static String EMERGENCYCONTACT2CITY_MARKMODIFIED = "relation.EmergencyContact2City.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n CANORAMNDPOLICIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AbstractDynamicPolicy> POLICY2DYNAMICPOLICYCANORAMNDPOLICIESHANDLER = new OneToManyHandler<AbstractDynamicPolicy>(
	SuppliermasterscoreConstants.TC.ABSTRACTDYNAMICPOLICY,
	true,
	"policy",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
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
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.canOrAmndPolicies</code> attribute.
	 * @return the canOrAmndPolicies
	 */
	public Collection<AbstractDynamicPolicy> getCanOrAmndPolicies(final SessionContext ctx, final TravelogixPolicy item)
	{
		return POLICY2DYNAMICPOLICYCANORAMNDPOLICIESHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.canOrAmndPolicies</code> attribute.
	 * @return the canOrAmndPolicies
	 */
	public Collection<AbstractDynamicPolicy> getCanOrAmndPolicies(final TravelogixPolicy item)
	{
		return getCanOrAmndPolicies( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.canOrAmndPolicies</code> attribute. 
	 * @param value the canOrAmndPolicies
	 */
	public void setCanOrAmndPolicies(final SessionContext ctx, final TravelogixPolicy item, final Collection<AbstractDynamicPolicy> value)
	{
		POLICY2DYNAMICPOLICYCANORAMNDPOLICIESHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.canOrAmndPolicies</code> attribute. 
	 * @param value the canOrAmndPolicies
	 */
	public void setCanOrAmndPolicies(final TravelogixPolicy item, final Collection<AbstractDynamicPolicy> value)
	{
		setCanOrAmndPolicies( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to canOrAmndPolicies. 
	 * @param value the item to add to canOrAmndPolicies
	 */
	public void addToCanOrAmndPolicies(final SessionContext ctx, final TravelogixPolicy item, final AbstractDynamicPolicy value)
	{
		POLICY2DYNAMICPOLICYCANORAMNDPOLICIESHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to canOrAmndPolicies. 
	 * @param value the item to add to canOrAmndPolicies
	 */
	public void addToCanOrAmndPolicies(final TravelogixPolicy item, final AbstractDynamicPolicy value)
	{
		addToCanOrAmndPolicies( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from canOrAmndPolicies. 
	 * @param value the item to remove from canOrAmndPolicies
	 */
	public void removeFromCanOrAmndPolicies(final SessionContext ctx, final TravelogixPolicy item, final AbstractDynamicPolicy value)
	{
		POLICY2DYNAMICPOLICYCANORAMNDPOLICIESHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from canOrAmndPolicies. 
	 * @param value the item to remove from canOrAmndPolicies
	 */
	public void removeFromCanOrAmndPolicies(final TravelogixPolicy item, final AbstractDynamicPolicy value)
	{
		removeFromCanOrAmndPolicies( getSession().getSessionContext(), item, value );
	}
	
	public AccoDynamicPolicy createAccoDynamicPolicy(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliermasterscoreConstants.TC.ACCODYNAMICPOLICY );
			return (AccoDynamicPolicy)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AccoDynamicPolicy : "+e.getMessage(), 0 );
		}
	}
	
	public AccoDynamicPolicy createAccoDynamicPolicy(final Map attributeValues)
	{
		return createAccoDynamicPolicy( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivityDynamicPolicy createActivityDynamicPolicy(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliermasterscoreConstants.TC.ACTIVITYDYNAMICPOLICY );
			return (ActivityDynamicPolicy)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ActivityDynamicPolicy : "+e.getMessage(), 0 );
		}
	}
	
	public ActivityDynamicPolicy createActivityDynamicPolicy(final Map attributeValues)
	{
		return createActivityDynamicPolicy( getSession().getSessionContext(), attributeValues );
	}
	
	public CruiseDynamicPolicy createCruiseDynamicPolicy(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliermasterscoreConstants.TC.CRUISEDYNAMICPOLICY );
			return (CruiseDynamicPolicy)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CruiseDynamicPolicy : "+e.getMessage(), 0 );
		}
	}
	
	public CruiseDynamicPolicy createCruiseDynamicPolicy(final Map attributeValues)
	{
		return createCruiseDynamicPolicy( getSession().getSessionContext(), attributeValues );
	}
	
	public FlightsDynamicPolicy createFlightsDynamicPolicy(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliermasterscoreConstants.TC.FLIGHTSDYNAMICPOLICY );
			return (FlightsDynamicPolicy)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating FlightsDynamicPolicy : "+e.getMessage(), 0 );
		}
	}
	
	public FlightsDynamicPolicy createFlightsDynamicPolicy(final Map attributeValues)
	{
		return createFlightsDynamicPolicy( getSession().getSessionContext(), attributeValues );
	}
	
	public HolidaysDynamicPolicy createHolidaysDynamicPolicy(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliermasterscoreConstants.TC.HOLIDAYSDYNAMICPOLICY );
			return (HolidaysDynamicPolicy)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating HolidaysDynamicPolicy : "+e.getMessage(), 0 );
		}
	}
	
	public HolidaysDynamicPolicy createHolidaysDynamicPolicy(final Map attributeValues)
	{
		return createHolidaysDynamicPolicy( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierEmergencyContact createSupplierEmergencyContact(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliermasterscoreConstants.TC.SUPPLIEREMERGENCYCONTACT );
			return (SupplierEmergencyContact)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierEmergencyContact : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierEmergencyContact createSupplierEmergencyContact(final Map attributeValues)
	{
		return createSupplierEmergencyContact( getSession().getSessionContext(), attributeValues );
	}
	
	public TransportationDynamicPolicy createTransportationDynamicPolicy(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliermasterscoreConstants.TC.TRANSPORTATIONDYNAMICPOLICY );
			return (TransportationDynamicPolicy)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TransportationDynamicPolicy : "+e.getMessage(), 0 );
		}
	}
	
	public TransportationDynamicPolicy createTransportationDynamicPolicy(final Map attributeValues)
	{
		return createTransportationDynamicPolicy( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return SuppliermasterscoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Country.supplierEmergencycontacts</code> attribute.
	 * @return the supplierEmergencycontacts
	 */
	public Set<SupplierEmergencyContact> getSupplierEmergencycontacts(final SessionContext ctx, final Country item)
	{
		final List<SupplierEmergencyContact> items = item.getLinkedItems( 
			ctx,
			false,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2COUNTRY,
			"SupplierEmergencyContact",
			null,
			false,
			false
		);
		return new LinkedHashSet<SupplierEmergencyContact>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Country.supplierEmergencycontacts</code> attribute.
	 * @return the supplierEmergencycontacts
	 */
	public Set<SupplierEmergencyContact> getSupplierEmergencycontacts(final Country item)
	{
		return getSupplierEmergencycontacts( getSession().getSessionContext(), item );
	}
	
	public long getSupplierEmergencycontactsCount(final SessionContext ctx, final Country item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2COUNTRY,
			"SupplierEmergencyContact",
			null
		);
	}
	
	public long getSupplierEmergencycontactsCount(final Country item)
	{
		return getSupplierEmergencycontactsCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Country.supplierEmergencycontacts</code> attribute. 
	 * @param value the supplierEmergencycontacts
	 */
	public void setSupplierEmergencycontacts(final SessionContext ctx, final Country item, final Set<SupplierEmergencyContact> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2COUNTRY,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2COUNTRY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Country.supplierEmergencycontacts</code> attribute. 
	 * @param value the supplierEmergencycontacts
	 */
	public void setSupplierEmergencycontacts(final Country item, final Set<SupplierEmergencyContact> value)
	{
		setSupplierEmergencycontacts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierEmergencycontacts. 
	 * @param value the item to add to supplierEmergencycontacts
	 */
	public void addToSupplierEmergencycontacts(final SessionContext ctx, final Country item, final SupplierEmergencyContact value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2COUNTRY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2COUNTRY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierEmergencycontacts. 
	 * @param value the item to add to supplierEmergencycontacts
	 */
	public void addToSupplierEmergencycontacts(final Country item, final SupplierEmergencyContact value)
	{
		addToSupplierEmergencycontacts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierEmergencycontacts. 
	 * @param value the item to remove from supplierEmergencycontacts
	 */
	public void removeFromSupplierEmergencycontacts(final SessionContext ctx, final Country item, final SupplierEmergencyContact value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2COUNTRY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2COUNTRY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierEmergencycontacts. 
	 * @param value the item to remove from supplierEmergencycontacts
	 */
	public void removeFromSupplierEmergencycontacts(final Country item, final SupplierEmergencyContact value)
	{
		removeFromSupplierEmergencycontacts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Continent.supplierEmergencycontacts</code> attribute.
	 * @return the supplierEmergencycontacts
	 */
	public Set<SupplierEmergencyContact> getSupplierEmergencycontacts(final SessionContext ctx, final Continent item)
	{
		final List<SupplierEmergencyContact> items = item.getLinkedItems( 
			ctx,
			false,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2CONTINENT,
			"SupplierEmergencyContact",
			null,
			false,
			false
		);
		return new LinkedHashSet<SupplierEmergencyContact>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Continent.supplierEmergencycontacts</code> attribute.
	 * @return the supplierEmergencycontacts
	 */
	public Set<SupplierEmergencyContact> getSupplierEmergencycontacts(final Continent item)
	{
		return getSupplierEmergencycontacts( getSession().getSessionContext(), item );
	}
	
	public long getSupplierEmergencycontactsCount(final SessionContext ctx, final Continent item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2CONTINENT,
			"SupplierEmergencyContact",
			null
		);
	}
	
	public long getSupplierEmergencycontactsCount(final Continent item)
	{
		return getSupplierEmergencycontactsCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Continent.supplierEmergencycontacts</code> attribute. 
	 * @param value the supplierEmergencycontacts
	 */
	public void setSupplierEmergencycontacts(final SessionContext ctx, final Continent item, final Set<SupplierEmergencyContact> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2CONTINENT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2CONTINENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Continent.supplierEmergencycontacts</code> attribute. 
	 * @param value the supplierEmergencycontacts
	 */
	public void setSupplierEmergencycontacts(final Continent item, final Set<SupplierEmergencyContact> value)
	{
		setSupplierEmergencycontacts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierEmergencycontacts. 
	 * @param value the item to add to supplierEmergencycontacts
	 */
	public void addToSupplierEmergencycontacts(final SessionContext ctx, final Continent item, final SupplierEmergencyContact value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2CONTINENT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2CONTINENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierEmergencycontacts. 
	 * @param value the item to add to supplierEmergencycontacts
	 */
	public void addToSupplierEmergencycontacts(final Continent item, final SupplierEmergencyContact value)
	{
		addToSupplierEmergencycontacts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierEmergencycontacts. 
	 * @param value the item to remove from supplierEmergencycontacts
	 */
	public void removeFromSupplierEmergencycontacts(final SessionContext ctx, final Continent item, final SupplierEmergencyContact value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2CONTINENT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2CONTINENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierEmergencycontacts. 
	 * @param value the item to remove from supplierEmergencycontacts
	 */
	public void removeFromSupplierEmergencycontacts(final Continent item, final SupplierEmergencyContact value)
	{
		removeFromSupplierEmergencycontacts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Region.supplierEmergencycontacts</code> attribute.
	 * @return the supplierEmergencycontacts
	 */
	public Set<SupplierEmergencyContact> getSupplierEmergencycontacts(final SessionContext ctx, final Region item)
	{
		final List<SupplierEmergencyContact> items = item.getLinkedItems( 
			ctx,
			false,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2REGION,
			"SupplierEmergencyContact",
			null,
			false,
			false
		);
		return new LinkedHashSet<SupplierEmergencyContact>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Region.supplierEmergencycontacts</code> attribute.
	 * @return the supplierEmergencycontacts
	 */
	public Set<SupplierEmergencyContact> getSupplierEmergencycontacts(final Region item)
	{
		return getSupplierEmergencycontacts( getSession().getSessionContext(), item );
	}
	
	public long getSupplierEmergencycontactsCount(final SessionContext ctx, final Region item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2REGION,
			"SupplierEmergencyContact",
			null
		);
	}
	
	public long getSupplierEmergencycontactsCount(final Region item)
	{
		return getSupplierEmergencycontactsCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Region.supplierEmergencycontacts</code> attribute. 
	 * @param value the supplierEmergencycontacts
	 */
	public void setSupplierEmergencycontacts(final SessionContext ctx, final Region item, final Set<SupplierEmergencyContact> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2REGION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2REGION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Region.supplierEmergencycontacts</code> attribute. 
	 * @param value the supplierEmergencycontacts
	 */
	public void setSupplierEmergencycontacts(final Region item, final Set<SupplierEmergencyContact> value)
	{
		setSupplierEmergencycontacts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierEmergencycontacts. 
	 * @param value the item to add to supplierEmergencycontacts
	 */
	public void addToSupplierEmergencycontacts(final SessionContext ctx, final Region item, final SupplierEmergencyContact value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2REGION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2REGION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierEmergencycontacts. 
	 * @param value the item to add to supplierEmergencycontacts
	 */
	public void addToSupplierEmergencycontacts(final Region item, final SupplierEmergencyContact value)
	{
		addToSupplierEmergencycontacts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierEmergencycontacts. 
	 * @param value the item to remove from supplierEmergencycontacts
	 */
	public void removeFromSupplierEmergencycontacts(final SessionContext ctx, final Region item, final SupplierEmergencyContact value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2REGION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2REGION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierEmergencycontacts. 
	 * @param value the item to remove from supplierEmergencycontacts
	 */
	public void removeFromSupplierEmergencycontacts(final Region item, final SupplierEmergencyContact value)
	{
		removeFromSupplierEmergencycontacts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>City.supplierEmergencycontacts</code> attribute.
	 * @return the supplierEmergencycontacts
	 */
	public Set<SupplierEmergencyContact> getSupplierEmergencycontacts(final SessionContext ctx, final City item)
	{
		final List<SupplierEmergencyContact> items = item.getLinkedItems( 
			ctx,
			false,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2CITY,
			"SupplierEmergencyContact",
			null,
			false,
			false
		);
		return new LinkedHashSet<SupplierEmergencyContact>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>City.supplierEmergencycontacts</code> attribute.
	 * @return the supplierEmergencycontacts
	 */
	public Set<SupplierEmergencyContact> getSupplierEmergencycontacts(final City item)
	{
		return getSupplierEmergencycontacts( getSession().getSessionContext(), item );
	}
	
	public long getSupplierEmergencycontactsCount(final SessionContext ctx, final City item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2CITY,
			"SupplierEmergencyContact",
			null
		);
	}
	
	public long getSupplierEmergencycontactsCount(final City item)
	{
		return getSupplierEmergencycontactsCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>City.supplierEmergencycontacts</code> attribute. 
	 * @param value the supplierEmergencycontacts
	 */
	public void setSupplierEmergencycontacts(final SessionContext ctx, final City item, final Set<SupplierEmergencyContact> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2CITY,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2CITY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>City.supplierEmergencycontacts</code> attribute. 
	 * @param value the supplierEmergencycontacts
	 */
	public void setSupplierEmergencycontacts(final City item, final Set<SupplierEmergencyContact> value)
	{
		setSupplierEmergencycontacts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierEmergencycontacts. 
	 * @param value the item to add to supplierEmergencycontacts
	 */
	public void addToSupplierEmergencycontacts(final SessionContext ctx, final City item, final SupplierEmergencyContact value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2CITY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2CITY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierEmergencycontacts. 
	 * @param value the item to add to supplierEmergencycontacts
	 */
	public void addToSupplierEmergencycontacts(final City item, final SupplierEmergencyContact value)
	{
		addToSupplierEmergencycontacts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierEmergencycontacts. 
	 * @param value the item to remove from supplierEmergencycontacts
	 */
	public void removeFromSupplierEmergencycontacts(final SessionContext ctx, final City item, final SupplierEmergencyContact value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			SuppliermasterscoreConstants.Relations.EMERGENCYCONTACT2CITY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMERGENCYCONTACT2CITY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierEmergencycontacts. 
	 * @param value the item to remove from supplierEmergencycontacts
	 */
	public void removeFromSupplierEmergencycontacts(final City item, final SupplierEmergencyContact value)
	{
		removeFromSupplierEmergencycontacts( getSession().getSessionContext(), item, value );
	}
	
}
