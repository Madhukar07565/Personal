/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.masterdata.core.contacts.jalo.AbstractContactDetails;
import com.cnk.travelogix.masterdata.core.contacts.jalo.ContactDetails;
import com.cnk.travelogix.masterdata.core.staff.jalo.StaffInformation;
import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityBrand;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityChain;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityComboProduct;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityDescription;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityProduct;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityProductSubType;
import com.cnk.travelogix.product.activity.masters.core.jalo.AdditionalActivityInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.AssociatedProperty;
import com.cnk.travelogix.product.activity.masters.core.jalo.Attraction;
import com.cnk.travelogix.product.activity.masters.core.jalo.AwardInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.DayOfOperation;
import com.cnk.travelogix.product.activity.masters.core.jalo.DiningInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.DiningTips;
import com.cnk.travelogix.product.activity.masters.core.jalo.Entertainment;
import com.cnk.travelogix.product.activity.masters.core.jalo.EventsAndTourInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.GeneralDescription;
import com.cnk.travelogix.product.activity.masters.core.jalo.Guide;
import com.cnk.travelogix.product.activity.masters.core.jalo.Inclusion;
import com.cnk.travelogix.product.activity.masters.core.jalo.MealInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.MiscellaneousInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.MiscellaneousRestriction;
import com.cnk.travelogix.product.activity.masters.core.jalo.MonthlyWeather;
import com.cnk.travelogix.product.activity.masters.core.jalo.OperationDuration;
import com.cnk.travelogix.product.activity.masters.core.jalo.OtherInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.Participant;
import com.cnk.travelogix.product.activity.masters.core.jalo.PickupAndDropOff;
import com.cnk.travelogix.product.activity.masters.core.jalo.PreArrivalInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.SeatingInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.ShoppingInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.ShowInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.SpaInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.SuggestedAccommodation;
import com.cnk.travelogix.product.activity.masters.core.jalo.TeamMemberDetails;
import com.cnk.travelogix.product.activity.masters.core.jalo.Timing;
import com.cnk.travelogix.product.activity.masters.core.jalo.TourItinerary;
import com.cnk.travelogix.product.common.core.jalo.DeactivationConfig;
import com.cnk.travelogix.product.common.core.jalo.DescriptionDetails;
import com.cnk.travelogix.product.common.core.jalo.Facility;
import com.cnk.travelogix.product.common.core.jalo.Route;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>ActivityproductmasterscoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivityproductmasterscoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("restaurantContactDetail", AttributeMode.INITIAL);
		tmp.put("restaurant", AttributeMode.INITIAL);
		tmp.put("associatedProperty", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.contacts.jalo.ContactDetails", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("associatedProperty", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.product.common.core.jalo.Route", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("activityProduct", AttributeMode.INITIAL);
		tmp.put("activityComboProduct", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.product.common.core.jalo.DeactivationConfig", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("activityProduct", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.product.common.core.jalo.Facility", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("activityProduct", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.staff.jalo.StaffInformation", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("activityComboProduct", AttributeMode.INITIAL);
		tmp.put("activityProduct", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.product.common.core.jalo.DescriptionDetails", Collections.unmodifiableMap(tmp));
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
	 * <i>Generated method</i> - Getter of the <code>DeactivationConfig.activityComboProduct</code> attribute.
	 * @return the activityComboProduct
	 */
	public ActivityComboProduct getActivityComboProduct(final SessionContext ctx, final DeactivationConfig item)
	{
		return (ActivityComboProduct)item.getProperty( ctx, ActivityproductmasterscoreConstants.Attributes.DeactivationConfig.ACTIVITYCOMBOPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivationConfig.activityComboProduct</code> attribute.
	 * @return the activityComboProduct
	 */
	public ActivityComboProduct getActivityComboProduct(final DeactivationConfig item)
	{
		return getActivityComboProduct( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivationConfig.activityComboProduct</code> attribute. 
	 * @param value the activityComboProduct
	 */
	public void setActivityComboProduct(final SessionContext ctx, final DeactivationConfig item, final ActivityComboProduct value)
	{
		item.setProperty(ctx, ActivityproductmasterscoreConstants.Attributes.DeactivationConfig.ACTIVITYCOMBOPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivationConfig.activityComboProduct</code> attribute. 
	 * @param value the activityComboProduct
	 */
	public void setActivityComboProduct(final DeactivationConfig item, final ActivityComboProduct value)
	{
		setActivityComboProduct( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DescriptionDetails.activityComboProduct</code> attribute.
	 * @return the activityComboProduct
	 */
	public ActivityComboProduct getActivityComboProduct(final SessionContext ctx, final DescriptionDetails item)
	{
		return (ActivityComboProduct)item.getProperty( ctx, ActivityproductmasterscoreConstants.Attributes.DescriptionDetails.ACTIVITYCOMBOPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DescriptionDetails.activityComboProduct</code> attribute.
	 * @return the activityComboProduct
	 */
	public ActivityComboProduct getActivityComboProduct(final DescriptionDetails item)
	{
		return getActivityComboProduct( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DescriptionDetails.activityComboProduct</code> attribute. 
	 * @param value the activityComboProduct
	 */
	public void setActivityComboProduct(final SessionContext ctx, final DescriptionDetails item, final ActivityComboProduct value)
	{
		item.setProperty(ctx, ActivityproductmasterscoreConstants.Attributes.DescriptionDetails.ACTIVITYCOMBOPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DescriptionDetails.activityComboProduct</code> attribute. 
	 * @param value the activityComboProduct
	 */
	public void setActivityComboProduct(final DescriptionDetails item, final ActivityComboProduct value)
	{
		setActivityComboProduct( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivationConfig.activityProduct</code> attribute.
	 * @return the activityProduct
	 */
	public ActivityProduct getActivityProduct(final SessionContext ctx, final DeactivationConfig item)
	{
		return (ActivityProduct)item.getProperty( ctx, ActivityproductmasterscoreConstants.Attributes.DeactivationConfig.ACTIVITYPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivationConfig.activityProduct</code> attribute.
	 * @return the activityProduct
	 */
	public ActivityProduct getActivityProduct(final DeactivationConfig item)
	{
		return getActivityProduct( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivationConfig.activityProduct</code> attribute. 
	 * @param value the activityProduct
	 */
	public void setActivityProduct(final SessionContext ctx, final DeactivationConfig item, final ActivityProduct value)
	{
		item.setProperty(ctx, ActivityproductmasterscoreConstants.Attributes.DeactivationConfig.ACTIVITYPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivationConfig.activityProduct</code> attribute. 
	 * @param value the activityProduct
	 */
	public void setActivityProduct(final DeactivationConfig item, final ActivityProduct value)
	{
		setActivityProduct( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Facility.activityProduct</code> attribute.
	 * @return the activityProduct
	 */
	public ActivityProduct getActivityProduct(final SessionContext ctx, final Facility item)
	{
		return (ActivityProduct)item.getProperty( ctx, ActivityproductmasterscoreConstants.Attributes.Facility.ACTIVITYPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Facility.activityProduct</code> attribute.
	 * @return the activityProduct
	 */
	public ActivityProduct getActivityProduct(final Facility item)
	{
		return getActivityProduct( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Facility.activityProduct</code> attribute. 
	 * @param value the activityProduct
	 */
	public void setActivityProduct(final SessionContext ctx, final Facility item, final ActivityProduct value)
	{
		item.setProperty(ctx, ActivityproductmasterscoreConstants.Attributes.Facility.ACTIVITYPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Facility.activityProduct</code> attribute. 
	 * @param value the activityProduct
	 */
	public void setActivityProduct(final Facility item, final ActivityProduct value)
	{
		setActivityProduct( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.activityProduct</code> attribute.
	 * @return the activityProduct
	 */
	public ActivityProduct getActivityProduct(final SessionContext ctx, final StaffInformation item)
	{
		return (ActivityProduct)item.getProperty( ctx, ActivityproductmasterscoreConstants.Attributes.StaffInformation.ACTIVITYPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.activityProduct</code> attribute.
	 * @return the activityProduct
	 */
	public ActivityProduct getActivityProduct(final StaffInformation item)
	{
		return getActivityProduct( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.activityProduct</code> attribute. 
	 * @param value the activityProduct
	 */
	public void setActivityProduct(final SessionContext ctx, final StaffInformation item, final ActivityProduct value)
	{
		item.setProperty(ctx, ActivityproductmasterscoreConstants.Attributes.StaffInformation.ACTIVITYPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.activityProduct</code> attribute. 
	 * @param value the activityProduct
	 */
	public void setActivityProduct(final StaffInformation item, final ActivityProduct value)
	{
		setActivityProduct( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DescriptionDetails.activityProduct</code> attribute.
	 * @return the activityProduct
	 */
	public ActivityProduct getActivityProduct(final SessionContext ctx, final DescriptionDetails item)
	{
		return (ActivityProduct)item.getProperty( ctx, ActivityproductmasterscoreConstants.Attributes.DescriptionDetails.ACTIVITYPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DescriptionDetails.activityProduct</code> attribute.
	 * @return the activityProduct
	 */
	public ActivityProduct getActivityProduct(final DescriptionDetails item)
	{
		return getActivityProduct( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DescriptionDetails.activityProduct</code> attribute. 
	 * @param value the activityProduct
	 */
	public void setActivityProduct(final SessionContext ctx, final DescriptionDetails item, final ActivityProduct value)
	{
		item.setProperty(ctx, ActivityproductmasterscoreConstants.Attributes.DescriptionDetails.ACTIVITYPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DescriptionDetails.activityProduct</code> attribute. 
	 * @param value the activityProduct
	 */
	public void setActivityProduct(final DescriptionDetails item, final ActivityProduct value)
	{
		setActivityProduct( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.associatedProperty</code> attribute.
	 * @return the associatedProperty
	 */
	public AssociatedProperty getAssociatedProperty(final SessionContext ctx, final ContactDetails item)
	{
		return (AssociatedProperty)item.getProperty( ctx, ActivityproductmasterscoreConstants.Attributes.ContactDetails.ASSOCIATEDPROPERTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.associatedProperty</code> attribute.
	 * @return the associatedProperty
	 */
	public AssociatedProperty getAssociatedProperty(final ContactDetails item)
	{
		return getAssociatedProperty( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.associatedProperty</code> attribute. 
	 * @param value the associatedProperty
	 */
	public void setAssociatedProperty(final SessionContext ctx, final ContactDetails item, final AssociatedProperty value)
	{
		item.setProperty(ctx, ActivityproductmasterscoreConstants.Attributes.ContactDetails.ASSOCIATEDPROPERTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.associatedProperty</code> attribute. 
	 * @param value the associatedProperty
	 */
	public void setAssociatedProperty(final ContactDetails item, final AssociatedProperty value)
	{
		setAssociatedProperty( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.associatedProperty</code> attribute.
	 * @return the associatedProperty
	 */
	public AssociatedProperty getAssociatedProperty(final SessionContext ctx, final Route item)
	{
		return (AssociatedProperty)item.getProperty( ctx, ActivityproductmasterscoreConstants.Attributes.Route.ASSOCIATEDPROPERTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.associatedProperty</code> attribute.
	 * @return the associatedProperty
	 */
	public AssociatedProperty getAssociatedProperty(final Route item)
	{
		return getAssociatedProperty( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.associatedProperty</code> attribute. 
	 * @param value the associatedProperty
	 */
	public void setAssociatedProperty(final SessionContext ctx, final Route item, final AssociatedProperty value)
	{
		item.setProperty(ctx, ActivityproductmasterscoreConstants.Attributes.Route.ASSOCIATEDPROPERTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.associatedProperty</code> attribute. 
	 * @param value the associatedProperty
	 */
	public void setAssociatedProperty(final Route item, final AssociatedProperty value)
	{
		setAssociatedProperty( getSession().getSessionContext(), item, value );
	}
	
	public ActivityBrand createActivityBrand(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.ACTIVITYBRAND );
			return (ActivityBrand)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ActivityBrand : "+e.getMessage(), 0 );
		}
	}
	
	public ActivityBrand createActivityBrand(final Map attributeValues)
	{
		return createActivityBrand( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivityChain createActivityChain(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.ACTIVITYCHAIN );
			return (ActivityChain)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ActivityChain : "+e.getMessage(), 0 );
		}
	}
	
	public ActivityChain createActivityChain(final Map attributeValues)
	{
		return createActivityChain( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivityComboProduct createActivityComboProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.ACTIVITYCOMBOPRODUCT );
			return (ActivityComboProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ActivityComboProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ActivityComboProduct createActivityComboProduct(final Map attributeValues)
	{
		return createActivityComboProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivityDescription createActivityDescription(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.ACTIVITYDESCRIPTION );
			return (ActivityDescription)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ActivityDescription : "+e.getMessage(), 0 );
		}
	}
	
	public ActivityDescription createActivityDescription(final Map attributeValues)
	{
		return createActivityDescription( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivityProduct createActivityProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.ACTIVITYPRODUCT );
			return (ActivityProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ActivityProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ActivityProduct createActivityProduct(final Map attributeValues)
	{
		return createActivityProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivityProductSubType createActivityProductSubType(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.ACTIVITYPRODUCTSUBTYPE );
			return (ActivityProductSubType)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ActivityProductSubType : "+e.getMessage(), 0 );
		}
	}
	
	public ActivityProductSubType createActivityProductSubType(final Map attributeValues)
	{
		return createActivityProductSubType( getSession().getSessionContext(), attributeValues );
	}
	
	public AdditionalActivityInfo createAdditionalActivityInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.ADDITIONALACTIVITYINFO );
			return (AdditionalActivityInfo)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AdditionalActivityInfo : "+e.getMessage(), 0 );
		}
	}
	
	public AdditionalActivityInfo createAdditionalActivityInfo(final Map attributeValues)
	{
		return createAdditionalActivityInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public AssociatedProperty createAssociatedProperty(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.ASSOCIATEDPROPERTY );
			return (AssociatedProperty)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AssociatedProperty : "+e.getMessage(), 0 );
		}
	}
	
	public AssociatedProperty createAssociatedProperty(final Map attributeValues)
	{
		return createAssociatedProperty( getSession().getSessionContext(), attributeValues );
	}
	
	public Attraction createAttraction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.ATTRACTION );
			return (Attraction)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Attraction : "+e.getMessage(), 0 );
		}
	}
	
	public Attraction createAttraction(final Map attributeValues)
	{
		return createAttraction( getSession().getSessionContext(), attributeValues );
	}
	
	public AwardInfo createAwardInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.AWARDINFO );
			return (AwardInfo)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AwardInfo : "+e.getMessage(), 0 );
		}
	}
	
	public AwardInfo createAwardInfo(final Map attributeValues)
	{
		return createAwardInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public DayOfOperation createDayOfOperation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.DAYOFOPERATION );
			return (DayOfOperation)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DayOfOperation : "+e.getMessage(), 0 );
		}
	}
	
	public DayOfOperation createDayOfOperation(final Map attributeValues)
	{
		return createDayOfOperation( getSession().getSessionContext(), attributeValues );
	}
	
	public DiningInfo createDiningInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.DININGINFO );
			return (DiningInfo)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DiningInfo : "+e.getMessage(), 0 );
		}
	}
	
	public DiningInfo createDiningInfo(final Map attributeValues)
	{
		return createDiningInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public DiningTips createDiningTips(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.DININGTIPS );
			return (DiningTips)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DiningTips : "+e.getMessage(), 0 );
		}
	}
	
	public DiningTips createDiningTips(final Map attributeValues)
	{
		return createDiningTips( getSession().getSessionContext(), attributeValues );
	}
	
	public Entertainment createEntertainment(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.ENTERTAINMENT );
			return (Entertainment)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Entertainment : "+e.getMessage(), 0 );
		}
	}
	
	public Entertainment createEntertainment(final Map attributeValues)
	{
		return createEntertainment( getSession().getSessionContext(), attributeValues );
	}
	
	public EventsAndTourInfo createEventsAndTourInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.EVENTSANDTOURINFO );
			return (EventsAndTourInfo)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating EventsAndTourInfo : "+e.getMessage(), 0 );
		}
	}
	
	public EventsAndTourInfo createEventsAndTourInfo(final Map attributeValues)
	{
		return createEventsAndTourInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public GeneralDescription createGeneralDescriptionInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.GENERALDESCRIPTIONINFO );
			return (GeneralDescription)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating GeneralDescriptionInfo : "+e.getMessage(), 0 );
		}
	}
	
	public GeneralDescription createGeneralDescriptionInfo(final Map attributeValues)
	{
		return createGeneralDescriptionInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public Guide createGuide(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.GUIDE );
			return (Guide)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Guide : "+e.getMessage(), 0 );
		}
	}
	
	public Guide createGuide(final Map attributeValues)
	{
		return createGuide( getSession().getSessionContext(), attributeValues );
	}
	
	public Inclusion createInclusion(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.INCLUSION );
			return (Inclusion)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Inclusion : "+e.getMessage(), 0 );
		}
	}
	
	public Inclusion createInclusion(final Map attributeValues)
	{
		return createInclusion( getSession().getSessionContext(), attributeValues );
	}
	
	public MealInfo createMealInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.MEALINFO );
			return (MealInfo)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating MealInfo : "+e.getMessage(), 0 );
		}
	}
	
	public MealInfo createMealInfo(final Map attributeValues)
	{
		return createMealInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public MiscellaneousInfo createMiscellaneousInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.MISCELLANEOUSINFO );
			return (MiscellaneousInfo)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating MiscellaneousInfo : "+e.getMessage(), 0 );
		}
	}
	
	public MiscellaneousInfo createMiscellaneousInfo(final Map attributeValues)
	{
		return createMiscellaneousInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public MiscellaneousRestriction createMiscellaneousRestriction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.MISCELLANEOUSRESTRICTION );
			return (MiscellaneousRestriction)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating MiscellaneousRestriction : "+e.getMessage(), 0 );
		}
	}
	
	public MiscellaneousRestriction createMiscellaneousRestriction(final Map attributeValues)
	{
		return createMiscellaneousRestriction( getSession().getSessionContext(), attributeValues );
	}
	
	public MonthlyWeather createMonthlyWeather(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.MONTHLYWEATHER );
			return (MonthlyWeather)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating MonthlyWeather : "+e.getMessage(), 0 );
		}
	}
	
	public MonthlyWeather createMonthlyWeather(final Map attributeValues)
	{
		return createMonthlyWeather( getSession().getSessionContext(), attributeValues );
	}
	
	public OperationDuration createOperationDuration(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.OPERATIONDURATION );
			return (OperationDuration)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating OperationDuration : "+e.getMessage(), 0 );
		}
	}
	
	public OperationDuration createOperationDuration(final Map attributeValues)
	{
		return createOperationDuration( getSession().getSessionContext(), attributeValues );
	}
	
	public OtherInfo createOtherInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.OTHERINFO );
			return (OtherInfo)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating OtherInfo : "+e.getMessage(), 0 );
		}
	}
	
	public OtherInfo createOtherInfo(final Map attributeValues)
	{
		return createOtherInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public Participant createParticipant(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.PARTICIPANT );
			return (Participant)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Participant : "+e.getMessage(), 0 );
		}
	}
	
	public Participant createParticipant(final Map attributeValues)
	{
		return createParticipant( getSession().getSessionContext(), attributeValues );
	}
	
	public PickupAndDropOff createPickupAndDropOff(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.PICKUPANDDROPOFF );
			return (PickupAndDropOff)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PickupAndDropOff : "+e.getMessage(), 0 );
		}
	}
	
	public PickupAndDropOff createPickupAndDropOff(final Map attributeValues)
	{
		return createPickupAndDropOff( getSession().getSessionContext(), attributeValues );
	}
	
	public PreArrivalInfo createPreArrivalInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.PREARRIVALINFO );
			return (PreArrivalInfo)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PreArrivalInfo : "+e.getMessage(), 0 );
		}
	}
	
	public PreArrivalInfo createPreArrivalInfo(final Map attributeValues)
	{
		return createPreArrivalInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public SeatingInfo createSeatingInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.SEATINGINFO );
			return (SeatingInfo)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SeatingInfo : "+e.getMessage(), 0 );
		}
	}
	
	public SeatingInfo createSeatingInfo(final Map attributeValues)
	{
		return createSeatingInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public ShoppingInfo createShoppingInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.SHOPPINGINFO );
			return (ShoppingInfo)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ShoppingInfo : "+e.getMessage(), 0 );
		}
	}
	
	public ShoppingInfo createShoppingInfo(final Map attributeValues)
	{
		return createShoppingInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public ShowInfo createShowInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.SHOWINFO );
			return (ShowInfo)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ShowInfo : "+e.getMessage(), 0 );
		}
	}
	
	public ShowInfo createShowInfo(final Map attributeValues)
	{
		return createShowInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public SpaInfo createSpaInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.SPAINFO );
			return (SpaInfo)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SpaInfo : "+e.getMessage(), 0 );
		}
	}
	
	public SpaInfo createSpaInfo(final Map attributeValues)
	{
		return createSpaInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public SuggestedAccommodation createSuggestedAccommodation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.SUGGESTEDACCOMMODATION );
			return (SuggestedAccommodation)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SuggestedAccommodation : "+e.getMessage(), 0 );
		}
	}
	
	public SuggestedAccommodation createSuggestedAccommodation(final Map attributeValues)
	{
		return createSuggestedAccommodation( getSession().getSessionContext(), attributeValues );
	}
	
	public TeamMemberDetails createTeamMemberDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.TEAMMEMBERDETAILS );
			return (TeamMemberDetails)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TeamMemberDetails : "+e.getMessage(), 0 );
		}
	}
	
	public TeamMemberDetails createTeamMemberDetails(final Map attributeValues)
	{
		return createTeamMemberDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public Timing createTiming(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.TIMING );
			return (Timing)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Timing : "+e.getMessage(), 0 );
		}
	}
	
	public Timing createTiming(final Map attributeValues)
	{
		return createTiming( getSession().getSessionContext(), attributeValues );
	}
	
	public TourItinerary createTourItinerary(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityproductmasterscoreConstants.TC.TOURITINERARY );
			return (TourItinerary)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TourItinerary : "+e.getMessage(), 0 );
		}
	}
	
	public TourItinerary createTourItinerary(final Map attributeValues)
	{
		return createTourItinerary( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return ActivityproductmasterscoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.restaurant</code> attribute.
	 * @return the restaurant
	 */
	public DiningInfo getRestaurant(final SessionContext ctx, final ContactDetails item)
	{
		return (DiningInfo)item.getProperty( ctx, ActivityproductmasterscoreConstants.Attributes.ContactDetails.RESTAURANT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.restaurant</code> attribute.
	 * @return the restaurant
	 */
	public DiningInfo getRestaurant(final ContactDetails item)
	{
		return getRestaurant( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.restaurant</code> attribute. 
	 * @param value the restaurant
	 */
	public void setRestaurant(final SessionContext ctx, final ContactDetails item, final DiningInfo value)
	{
		item.setProperty(ctx, ActivityproductmasterscoreConstants.Attributes.ContactDetails.RESTAURANT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.restaurant</code> attribute. 
	 * @param value the restaurant
	 */
	public void setRestaurant(final ContactDetails item, final DiningInfo value)
	{
		setRestaurant( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.restaurantContactDetail</code> attribute.
	 * @return the restaurantContactDetail
	 */
	public DiningInfo getRestaurantContactDetail(final SessionContext ctx, final ContactDetails item)
	{
		return (DiningInfo)item.getProperty( ctx, ActivityproductmasterscoreConstants.Attributes.ContactDetails.RESTAURANTCONTACTDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactDetails.restaurantContactDetail</code> attribute.
	 * @return the restaurantContactDetail
	 */
	public DiningInfo getRestaurantContactDetail(final ContactDetails item)
	{
		return getRestaurantContactDetail( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.restaurantContactDetail</code> attribute. 
	 * @param value the restaurantContactDetail
	 */
	public void setRestaurantContactDetail(final SessionContext ctx, final ContactDetails item, final DiningInfo value)
	{
		item.setProperty(ctx, ActivityproductmasterscoreConstants.Attributes.ContactDetails.RESTAURANTCONTACTDETAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactDetails.restaurantContactDetail</code> attribute. 
	 * @param value the restaurantContactDetail
	 */
	public void setRestaurantContactDetail(final ContactDetails item, final DiningInfo value)
	{
		setRestaurantContactDetail( getSession().getSessionContext(), item, value );
	}
	
}
