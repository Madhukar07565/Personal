/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityProduct;
import com.cnk.travelogix.product.activity.masters.core.jalo.EventsAndTourInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.PickupAndDropOff;
import com.cnk.travelogix.supplier.masterdata.core.policy.AbstractDynamicPolicy;
import com.cnk.travelogix.supplier.masterdata.core.policy.ActivityDynamicPolicy;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionsactivitiesConstants;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.ActivitiesSupplierRate;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.ActivityInventory;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.ActivityRateAdvDefinition;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.ActivityRateDetailDefinition;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.ActivityRates;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.ActivitySupplierRateDefinition;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.ActivitySurchargeSuppDetail;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.DiscountOnActivitiesPurchased;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.FreeActivitiesOffer;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.GuideSurchargeDetail;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.MealSupplementDetail;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.NightOrActivityAncillaryDiscountOffer;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.OfferRate;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.OtherSurcharge;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.TwoForPriceOfOneOffer;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.UpgardeTourOffer;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.UpgradeSeatingOffer;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.UpgradeVehicleOffer;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>SupplierratedefinitionsactivitiesManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierratedefinitionsactivitiesManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("supplierRateDef", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.supplier.masterdata.core.policy.ActivityDynamicPolicy", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("supplierRateDef", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("supplierRateDef", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.product.activity.masters.core.jalo.PickupAndDropOff", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("rateDetailDef", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.product.activity.masters.core.jalo.EventsAndTourInfo", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("upgardetouroffer", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.product.activity.masters.core.jalo.ActivityProduct", Collections.unmodifiableMap(tmp));
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
	
	public ActivitiesSupplierRate createActivitiesSupplierRate(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionsactivitiesConstants.TC.ACTIVITIESSUPPLIERRATE );
			return (ActivitiesSupplierRate)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ActivitiesSupplierRate : "+e.getMessage(), 0 );
		}
	}
	
	public ActivitiesSupplierRate createActivitiesSupplierRate(final Map attributeValues)
	{
		return createActivitiesSupplierRate( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivityInventory createActivityInventory(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionsactivitiesConstants.TC.ACTIVITYINVENTORY );
			return (ActivityInventory)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ActivityInventory : "+e.getMessage(), 0 );
		}
	}
	
	public ActivityInventory createActivityInventory(final Map attributeValues)
	{
		return createActivityInventory( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivityRateAdvDefinition createActivityRateAdvDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionsactivitiesConstants.TC.ACTIVITYRATEADVDEFINITION );
			return (ActivityRateAdvDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ActivityRateAdvDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public ActivityRateAdvDefinition createActivityRateAdvDefinition(final Map attributeValues)
	{
		return createActivityRateAdvDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivityRateDetailDefinition createActivityRateDetailDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionsactivitiesConstants.TC.ACTIVITYRATEDETAILDEFINITION );
			return (ActivityRateDetailDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ActivityRateDetailDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public ActivityRateDetailDefinition createActivityRateDetailDefinition(final Map attributeValues)
	{
		return createActivityRateDetailDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivityRates createActivityRates(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionsactivitiesConstants.TC.ACTIVITYRATES );
			return (ActivityRates)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ActivityRates : "+e.getMessage(), 0 );
		}
	}
	
	public ActivityRates createActivityRates(final Map attributeValues)
	{
		return createActivityRates( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivitySupplierRateDefinition createActivitySupplierRateDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionsactivitiesConstants.TC.ACTIVITYSUPPLIERRATEDEFINITION );
			return (ActivitySupplierRateDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ActivitySupplierRateDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public ActivitySupplierRateDefinition createActivitySupplierRateDefinition(final Map attributeValues)
	{
		return createActivitySupplierRateDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivitySurchargeSuppDetail createActivitySurchargeSuppDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionsactivitiesConstants.TC.ACTIVITYSURCHARGESUPPDETAIL );
			return (ActivitySurchargeSuppDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ActivitySurchargeSuppDetail : "+e.getMessage(), 0 );
		}
	}
	
	public ActivitySurchargeSuppDetail createActivitySurchargeSuppDetail(final Map attributeValues)
	{
		return createActivitySurchargeSuppDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public DiscountOnActivitiesPurchased createDiscountOnActivitiesPurchased(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionsactivitiesConstants.TC.DISCOUNTONACTIVITIESPURCHASED );
			return (DiscountOnActivitiesPurchased)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DiscountOnActivitiesPurchased : "+e.getMessage(), 0 );
		}
	}
	
	public DiscountOnActivitiesPurchased createDiscountOnActivitiesPurchased(final Map attributeValues)
	{
		return createDiscountOnActivitiesPurchased( getSession().getSessionContext(), attributeValues );
	}
	
	public FreeActivitiesOffer createFreeActivitiesOffer(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionsactivitiesConstants.TC.FREEACTIVITIESOFFER );
			return (FreeActivitiesOffer)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating FreeActivitiesOffer : "+e.getMessage(), 0 );
		}
	}
	
	public FreeActivitiesOffer createFreeActivitiesOffer(final Map attributeValues)
	{
		return createFreeActivitiesOffer( getSession().getSessionContext(), attributeValues );
	}
	
	public GuideSurchargeDetail createGuideSurchargeDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionsactivitiesConstants.TC.GUIDESURCHARGEDETAIL );
			return (GuideSurchargeDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating GuideSurchargeDetail : "+e.getMessage(), 0 );
		}
	}
	
	public GuideSurchargeDetail createGuideSurchargeDetail(final Map attributeValues)
	{
		return createGuideSurchargeDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public MealSupplementDetail createMealSupplementDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionsactivitiesConstants.TC.MEALSUPPLEMENTDETAIL );
			return (MealSupplementDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating MealSupplementDetail : "+e.getMessage(), 0 );
		}
	}
	
	public MealSupplementDetail createMealSupplementDetail(final Map attributeValues)
	{
		return createMealSupplementDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public NightOrActivityAncillaryDiscountOffer createNightOrActivityAncillaryDiscountOffer(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionsactivitiesConstants.TC.NIGHTORACTIVITYANCILLARYDISCOUNTOFFER );
			return (NightOrActivityAncillaryDiscountOffer)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating NightOrActivityAncillaryDiscountOffer : "+e.getMessage(), 0 );
		}
	}
	
	public NightOrActivityAncillaryDiscountOffer createNightOrActivityAncillaryDiscountOffer(final Map attributeValues)
	{
		return createNightOrActivityAncillaryDiscountOffer( getSession().getSessionContext(), attributeValues );
	}
	
	public OfferRate createOfferRate(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionsactivitiesConstants.TC.OFFERRATE );
			return (OfferRate)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating OfferRate : "+e.getMessage(), 0 );
		}
	}
	
	public OfferRate createOfferRate(final Map attributeValues)
	{
		return createOfferRate( getSession().getSessionContext(), attributeValues );
	}
	
	public OtherSurcharge createOtherSurcharge(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionsactivitiesConstants.TC.OTHERSURCHARGE );
			return (OtherSurcharge)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating OtherSurcharge : "+e.getMessage(), 0 );
		}
	}
	
	public OtherSurcharge createOtherSurcharge(final Map attributeValues)
	{
		return createOtherSurcharge( getSession().getSessionContext(), attributeValues );
	}
	
	public TwoForPriceOfOneOffer createTwoForPriceOfOneOffer(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionsactivitiesConstants.TC.TWOFORPRICEOFONEOFFER );
			return (TwoForPriceOfOneOffer)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TwoForPriceOfOneOffer : "+e.getMessage(), 0 );
		}
	}
	
	public TwoForPriceOfOneOffer createTwoForPriceOfOneOffer(final Map attributeValues)
	{
		return createTwoForPriceOfOneOffer( getSession().getSessionContext(), attributeValues );
	}
	
	public UpgardeTourOffer createUpgardeTourOffer(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionsactivitiesConstants.TC.UPGARDETOUROFFER );
			return (UpgardeTourOffer)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating UpgardeTourOffer : "+e.getMessage(), 0 );
		}
	}
	
	public UpgardeTourOffer createUpgardeTourOffer(final Map attributeValues)
	{
		return createUpgardeTourOffer( getSession().getSessionContext(), attributeValues );
	}
	
	public UpgradeSeatingOffer createUpgradeSeatingOffer(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionsactivitiesConstants.TC.UPGRADESEATINGOFFER );
			return (UpgradeSeatingOffer)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating UpgradeSeatingOffer : "+e.getMessage(), 0 );
		}
	}
	
	public UpgradeSeatingOffer createUpgradeSeatingOffer(final Map attributeValues)
	{
		return createUpgradeSeatingOffer( getSession().getSessionContext(), attributeValues );
	}
	
	public UpgradeVehicleOffer createUpgradeVehicleOffer(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionsactivitiesConstants.TC.UPGRADEVEHICLEOFFER );
			return (UpgradeVehicleOffer)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating UpgradeVehicleOffer : "+e.getMessage(), 0 );
		}
	}
	
	public UpgradeVehicleOffer createUpgradeVehicleOffer(final Map attributeValues)
	{
		return createUpgradeVehicleOffer( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return SupplierratedefinitionsactivitiesConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.rateDetailDef</code> attribute.
	 * @return the rateDetailDef
	 */
	public ActivityRateDetailDefinition getRateDetailDef(final SessionContext ctx, final EventsAndTourInfo item)
	{
		return (ActivityRateDetailDefinition)item.getProperty( ctx, SupplierratedefinitionsactivitiesConstants.Attributes.EventsAndTourInfo.RATEDETAILDEF);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndTourInfo.rateDetailDef</code> attribute.
	 * @return the rateDetailDef
	 */
	public ActivityRateDetailDefinition getRateDetailDef(final EventsAndTourInfo item)
	{
		return getRateDetailDef( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.rateDetailDef</code> attribute. 
	 * @param value the rateDetailDef
	 */
	public void setRateDetailDef(final SessionContext ctx, final EventsAndTourInfo item, final ActivityRateDetailDefinition value)
	{
		item.setProperty(ctx, SupplierratedefinitionsactivitiesConstants.Attributes.EventsAndTourInfo.RATEDETAILDEF,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndTourInfo.rateDetailDef</code> attribute. 
	 * @param value the rateDetailDef
	 */
	public void setRateDetailDef(final EventsAndTourInfo item, final ActivityRateDetailDefinition value)
	{
		setRateDetailDef( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDynamicPolicy.supplierRateDef</code> attribute.
	 * @return the supplierRateDef
	 */
	public ActivitySupplierRateDefinition getSupplierRateDef(final SessionContext ctx, final ActivityDynamicPolicy item)
	{
		return (ActivitySupplierRateDefinition)item.getProperty( ctx, SupplierratedefinitionsactivitiesConstants.Attributes.ActivityDynamicPolicy.SUPPLIERRATEDEF);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDynamicPolicy.supplierRateDef</code> attribute.
	 * @return the supplierRateDef
	 */
	public ActivitySupplierRateDefinition getSupplierRateDef(final ActivityDynamicPolicy item)
	{
		return getSupplierRateDef( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDynamicPolicy.supplierRateDef</code> attribute. 
	 * @param value the supplierRateDef
	 */
	public void setSupplierRateDef(final SessionContext ctx, final ActivityDynamicPolicy item, final ActivitySupplierRateDefinition value)
	{
		item.setProperty(ctx, SupplierratedefinitionsactivitiesConstants.Attributes.ActivityDynamicPolicy.SUPPLIERRATEDEF,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDynamicPolicy.supplierRateDef</code> attribute. 
	 * @param value the supplierRateDef
	 */
	public void setSupplierRateDef(final ActivityDynamicPolicy item, final ActivitySupplierRateDefinition value)
	{
		setSupplierRateDef( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.supplierRateDef</code> attribute.
	 * @return the supplierRateDef
	 */
	public ActivitySupplierRateDefinition getSupplierRateDef(final SessionContext ctx, final AbstractTravelogixSupplierOffer item)
	{
		return (ActivitySupplierRateDefinition)item.getProperty( ctx, SupplierratedefinitionsactivitiesConstants.Attributes.AbstractTravelogixSupplierOffer.SUPPLIERRATEDEF);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.supplierRateDef</code> attribute.
	 * @return the supplierRateDef
	 */
	public ActivitySupplierRateDefinition getSupplierRateDef(final AbstractTravelogixSupplierOffer item)
	{
		return getSupplierRateDef( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.supplierRateDef</code> attribute. 
	 * @param value the supplierRateDef
	 */
	public void setSupplierRateDef(final SessionContext ctx, final AbstractTravelogixSupplierOffer item, final ActivitySupplierRateDefinition value)
	{
		item.setProperty(ctx, SupplierratedefinitionsactivitiesConstants.Attributes.AbstractTravelogixSupplierOffer.SUPPLIERRATEDEF,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.supplierRateDef</code> attribute. 
	 * @param value the supplierRateDef
	 */
	public void setSupplierRateDef(final AbstractTravelogixSupplierOffer item, final ActivitySupplierRateDefinition value)
	{
		setSupplierRateDef( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupAndDropOff.supplierRateDef</code> attribute.
	 * @return the supplierRateDef
	 */
	public ActivityRateDetailDefinition getSupplierRateDef(final SessionContext ctx, final PickupAndDropOff item)
	{
		return (ActivityRateDetailDefinition)item.getProperty( ctx, SupplierratedefinitionsactivitiesConstants.Attributes.PickupAndDropOff.SUPPLIERRATEDEF);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupAndDropOff.supplierRateDef</code> attribute.
	 * @return the supplierRateDef
	 */
	public ActivityRateDetailDefinition getSupplierRateDef(final PickupAndDropOff item)
	{
		return getSupplierRateDef( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupAndDropOff.supplierRateDef</code> attribute. 
	 * @param value the supplierRateDef
	 */
	public void setSupplierRateDef(final SessionContext ctx, final PickupAndDropOff item, final ActivityRateDetailDefinition value)
	{
		item.setProperty(ctx, SupplierratedefinitionsactivitiesConstants.Attributes.PickupAndDropOff.SUPPLIERRATEDEF,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupAndDropOff.supplierRateDef</code> attribute. 
	 * @param value the supplierRateDef
	 */
	public void setSupplierRateDef(final PickupAndDropOff item, final ActivityRateDetailDefinition value)
	{
		setSupplierRateDef( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.upgardetouroffer</code> attribute.
	 * @return the upgardetouroffer
	 */
	public UpgardeTourOffer getUpgardetouroffer(final SessionContext ctx, final ActivityProduct item)
	{
		return (UpgardeTourOffer)item.getProperty( ctx, SupplierratedefinitionsactivitiesConstants.Attributes.ActivityProduct.UPGARDETOUROFFER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityProduct.upgardetouroffer</code> attribute.
	 * @return the upgardetouroffer
	 */
	public UpgardeTourOffer getUpgardetouroffer(final ActivityProduct item)
	{
		return getUpgardetouroffer( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.upgardetouroffer</code> attribute. 
	 * @param value the upgardetouroffer
	 */
	public void setUpgardetouroffer(final SessionContext ctx, final ActivityProduct item, final UpgardeTourOffer value)
	{
		item.setProperty(ctx, SupplierratedefinitionsactivitiesConstants.Attributes.ActivityProduct.UPGARDETOUROFFER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityProduct.upgardetouroffer</code> attribute. 
	 * @param value the upgardetouroffer
	 */
	public void setUpgardetouroffer(final ActivityProduct item, final UpgardeTourOffer value)
	{
		setUpgardetouroffer( getSession().getSessionContext(), item, value );
	}
	
}
