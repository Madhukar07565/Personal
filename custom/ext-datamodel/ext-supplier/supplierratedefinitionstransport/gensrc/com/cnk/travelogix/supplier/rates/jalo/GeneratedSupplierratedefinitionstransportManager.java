/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.ancillaryratedefinition.jalo.AbstractAncillaryRateDeviations;
import com.cnk.travelogix.datamodel.supplier.rates.ancillaryratedefinition.jalo.CityTransporationRateRestriction;
import com.cnk.travelogix.datamodel.supplier.rates.ancillaryratedefinition.jalo.TransportationAncillaryRate;
import com.cnk.travelogix.datamodel.supplier.rates.ancillaryratedefinition.jalo.VehicleTransporationRateRestriction;
import com.cnk.travelogix.datamodel.supplier.rates.carGroupupgrade.jalo.CarGroupUpgrade;
import com.cnk.travelogix.datamodel.supplier.rates.cardtyperestriction.jalo.CardTypeRestriction;
import com.cnk.travelogix.datamodel.supplier.rates.driverallowancecharge.jalo.DriverAllowanceCharge;
import com.cnk.travelogix.datamodel.supplier.rates.driverinformation.jalo.DriverInformation;
import com.cnk.travelogix.datamodel.supplier.rates.dropoffchargesdetail.jalo.DropOffChargesDetail;
import com.cnk.travelogix.datamodel.supplier.rates.paxapplicability.jalo.PaxApplicability;
import com.cnk.travelogix.datamodel.supplier.rates.perpersonapplicability.jalo.PerPersonApplicability;
import com.cnk.travelogix.datamodel.supplier.rates.pervehicleapplicability.jalo.PerVehicleApplicability;
import com.cnk.travelogix.datamodel.supplier.rates.pickuplocation.jalo.PickupLocation;
import com.cnk.travelogix.datamodel.supplier.rates.sIPPcodeupgrade.jalo.SIPPCodeUpgrade;
import com.cnk.travelogix.datamodel.supplier.rates.transportationofferancillaryAdvdefinition.jalo.TransportationOfferAncillaryAdvDefinition;
import com.cnk.travelogix.datamodel.supplier.rates.transportationoffers.jalo.CityTransporationOfferRestriction;
import com.cnk.travelogix.datamodel.supplier.rates.transportationoffers.jalo.OfferBookingValidityRestriction;
import com.cnk.travelogix.datamodel.supplier.rates.transportationoffers.jalo.TransportationOffers;
import com.cnk.travelogix.datamodel.supplier.rates.transportationoffers.jalo.VehicleTransporationOfferRestriction;
import com.cnk.travelogix.datamodel.supplier.rates.transportationratedefinition.jalo.PeakHours;
import com.cnk.travelogix.datamodel.supplier.rates.transportationratedefinition.jalo.TimeSlot;
import com.cnk.travelogix.datamodel.supplier.rates.transportationratedefinition.jalo.TransportationRateAdvDefinition;
import com.cnk.travelogix.datamodel.supplier.rates.transportationratedefinition.jalo.TransportationRateDefinition;
import com.cnk.travelogix.datamodel.supplier.rates.transportationratedetail.jalo.TransportationRateDetail;
import com.cnk.travelogix.datamodel.supplier.rates.transportationsupplierrate.jalo.TransportationSupplierRate;
import com.cnk.travelogix.datamodel.supplier.rates.transportationsurchargedetail.jalo.TransportationSurchargeSuppDetail;
import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer;
import com.cnk.travelogix.datamodel.supplier.rates.vehiclecharge.jalo.VehicleCharge;
import com.cnk.travelogix.datamodel.supplier.rates.vehicleupgrade.jalo.VehicleUpgrade;
import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractCommonMasterType;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.masterdata.core.jalo.TravelogixPolicy;
import com.cnk.travelogix.masterdata.core.products.jalo.CarGroup;
import com.cnk.travelogix.product.transport.masters.core.jalo.Vehicle;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionstransportConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.ChildAgeDetail;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LItem;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.order.price.Tax;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>SupplierratedefinitionstransportManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierratedefinitionstransportManager extends Extension
{
	/** Relation ordering override parameter constants for TransportRateDet2TravelogixpolicyRelation from ((supplierratedefinitionstransport))*/
	protected static String TRANSPORTRATEDET2TRAVELOGIXPOLICYRELATION_SRC_ORDERED = "relation.TransportRateDet2TravelogixpolicyRelation.source.ordered";
	protected static String TRANSPORTRATEDET2TRAVELOGIXPOLICYRELATION_TGT_ORDERED = "relation.TransportRateDet2TravelogixpolicyRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for TransportRateDet2TravelogixpolicyRelation from ((supplierratedefinitionstransport))*/
	protected static String TRANSPORTRATEDET2TRAVELOGIXPOLICYRELATION_MARKMODIFIED = "relation.TransportRateDet2TravelogixpolicyRelation.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("paxapplicability", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.ChildAgeDetail", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("transportationRateDefinition", AttributeMode.INITIAL);
		tmp.put("transportationRateDetail", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.price.Tax", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("cityTransporationRateRestriction", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.c2l.jalo.City", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("vehicleTransporationRateRestriction", AttributeMode.INITIAL);
		tmp.put("vehicleTransporationOfferRestriction", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.product.transport.masters.core.jalo.Vehicle", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("vehicleTransporationRateRestriction", AttributeMode.INITIAL);
		tmp.put("vehicleTransporationOfferRestriction", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.enumeration.EnumerationValue", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("vehicleTransporationRateRestriction", AttributeMode.INITIAL);
		tmp.put("vehicleTransporationOfferRestriction", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.products.jalo.CarGroup", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("transportationRateDetail", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer", Collections.unmodifiableMap(tmp));
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
	 * <i>Generated method</i> - Getter of the <code>City.cityTransporationRateRestriction</code> attribute.
	 * @return the cityTransporationRateRestriction
	 */
	public CityTransporationRateRestriction getCityTransporationRateRestriction(final SessionContext ctx, final City item)
	{
		return (CityTransporationRateRestriction)item.getProperty( ctx, SupplierratedefinitionstransportConstants.Attributes.City.CITYTRANSPORATIONRATERESTRICTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>City.cityTransporationRateRestriction</code> attribute.
	 * @return the cityTransporationRateRestriction
	 */
	public CityTransporationRateRestriction getCityTransporationRateRestriction(final City item)
	{
		return getCityTransporationRateRestriction( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>City.cityTransporationRateRestriction</code> attribute. 
	 * @param value the cityTransporationRateRestriction
	 */
	public void setCityTransporationRateRestriction(final SessionContext ctx, final City item, final CityTransporationRateRestriction value)
	{
		item.setProperty(ctx, SupplierratedefinitionstransportConstants.Attributes.City.CITYTRANSPORATIONRATERESTRICTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>City.cityTransporationRateRestriction</code> attribute. 
	 * @param value the cityTransporationRateRestriction
	 */
	public void setCityTransporationRateRestriction(final City item, final CityTransporationRateRestriction value)
	{
		setCityTransporationRateRestriction( getSession().getSessionContext(), item, value );
	}
	
	public AbstractAncillaryRateDeviations createAbstractTransportationRateRestriction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionstransportConstants.TC.ABSTRACTTRANSPORTATIONRATERESTRICTION );
			return (AbstractAncillaryRateDeviations)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AbstractTransportationRateRestriction : "+e.getMessage(), 0 );
		}
	}
	
	public AbstractAncillaryRateDeviations createAbstractTransportationRateRestriction(final Map attributeValues)
	{
		return createAbstractTransportationRateRestriction( getSession().getSessionContext(), attributeValues );
	}
	
	public CardTypeRestriction createCardTypeRestriction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionstransportConstants.TC.CARDTYPERESTRICTION );
			return (CardTypeRestriction)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CardTypeRestriction : "+e.getMessage(), 0 );
		}
	}
	
	public CardTypeRestriction createCardTypeRestriction(final Map attributeValues)
	{
		return createCardTypeRestriction( getSession().getSessionContext(), attributeValues );
	}
	
	public CarGroupUpgrade createCarGroupUpgrade(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionstransportConstants.TC.CARGROUPUPGRADE );
			return (CarGroupUpgrade)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CarGroupUpgrade : "+e.getMessage(), 0 );
		}
	}
	
	public CarGroupUpgrade createCarGroupUpgrade(final Map attributeValues)
	{
		return createCarGroupUpgrade( getSession().getSessionContext(), attributeValues );
	}
	
	public CityTransporationOfferRestriction createCityTransporationOfferRestriction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionstransportConstants.TC.CITYTRANSPORATIONOFFERRESTRICTION );
			return (CityTransporationOfferRestriction)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CityTransporationOfferRestriction : "+e.getMessage(), 0 );
		}
	}
	
	public CityTransporationOfferRestriction createCityTransporationOfferRestriction(final Map attributeValues)
	{
		return createCityTransporationOfferRestriction( getSession().getSessionContext(), attributeValues );
	}
	
	public CityTransporationRateRestriction createCityTransporationRateRestriction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionstransportConstants.TC.CITYTRANSPORATIONRATERESTRICTION );
			return (CityTransporationRateRestriction)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CityTransporationRateRestriction : "+e.getMessage(), 0 );
		}
	}
	
	public CityTransporationRateRestriction createCityTransporationRateRestriction(final Map attributeValues)
	{
		return createCityTransporationRateRestriction( getSession().getSessionContext(), attributeValues );
	}
	
	public DriverAllowanceCharge createDriverAllowanceCharge(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionstransportConstants.TC.DRIVERALLOWANCECHARGE );
			return (DriverAllowanceCharge)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DriverAllowanceCharge : "+e.getMessage(), 0 );
		}
	}
	
	public DriverAllowanceCharge createDriverAllowanceCharge(final Map attributeValues)
	{
		return createDriverAllowanceCharge( getSession().getSessionContext(), attributeValues );
	}
	
	public DriverInformation createDriverInformation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionstransportConstants.TC.DRIVERINFORMATION );
			return (DriverInformation)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DriverInformation : "+e.getMessage(), 0 );
		}
	}
	
	public DriverInformation createDriverInformation(final Map attributeValues)
	{
		return createDriverInformation( getSession().getSessionContext(), attributeValues );
	}
	
	public DropOffChargesDetail createDropOffChargesDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionstransportConstants.TC.DROPOFFCHARGESDETAIL );
			return (DropOffChargesDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DropOffChargesDetail : "+e.getMessage(), 0 );
		}
	}
	
	public DropOffChargesDetail createDropOffChargesDetail(final Map attributeValues)
	{
		return createDropOffChargesDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public OfferBookingValidityRestriction createOfferBookingValidityRestriction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionstransportConstants.TC.OFFERBOOKINGVALIDITYRESTRICTION );
			return (OfferBookingValidityRestriction)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating OfferBookingValidityRestriction : "+e.getMessage(), 0 );
		}
	}
	
	public OfferBookingValidityRestriction createOfferBookingValidityRestriction(final Map attributeValues)
	{
		return createOfferBookingValidityRestriction( getSession().getSessionContext(), attributeValues );
	}
	
	public PaxApplicability createPaxApplicability(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionstransportConstants.TC.PAXAPPLICABILITY );
			return (PaxApplicability)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PaxApplicability : "+e.getMessage(), 0 );
		}
	}
	
	public PaxApplicability createPaxApplicability(final Map attributeValues)
	{
		return createPaxApplicability( getSession().getSessionContext(), attributeValues );
	}
	
	public PeakHours createPeakHours(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionstransportConstants.TC.PEAKHOURS );
			return (PeakHours)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PeakHours : "+e.getMessage(), 0 );
		}
	}
	
	public PeakHours createPeakHours(final Map attributeValues)
	{
		return createPeakHours( getSession().getSessionContext(), attributeValues );
	}
	
	public PerPersonApplicability createPerPersonApplicability(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionstransportConstants.TC.PERPERSONAPPLICABILITY );
			return (PerPersonApplicability)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PerPersonApplicability : "+e.getMessage(), 0 );
		}
	}
	
	public PerPersonApplicability createPerPersonApplicability(final Map attributeValues)
	{
		return createPerPersonApplicability( getSession().getSessionContext(), attributeValues );
	}
	
	public PerVehicleApplicability createPerVehicleApplicability(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionstransportConstants.TC.PERVEHICLEAPPLICABILITY );
			return (PerVehicleApplicability)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PerVehicleApplicability : "+e.getMessage(), 0 );
		}
	}
	
	public PerVehicleApplicability createPerVehicleApplicability(final Map attributeValues)
	{
		return createPerVehicleApplicability( getSession().getSessionContext(), attributeValues );
	}
	
	public PickupLocation createPickupLocation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionstransportConstants.TC.PICKUPLOCATION );
			return (PickupLocation)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PickupLocation : "+e.getMessage(), 0 );
		}
	}
	
	public PickupLocation createPickupLocation(final Map attributeValues)
	{
		return createPickupLocation( getSession().getSessionContext(), attributeValues );
	}
	
	public SIPPCodeUpgrade createSIPPCodeUpgrade(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionstransportConstants.TC.SIPPCODEUPGRADE );
			return (SIPPCodeUpgrade)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SIPPCodeUpgrade : "+e.getMessage(), 0 );
		}
	}
	
	public SIPPCodeUpgrade createSIPPCodeUpgrade(final Map attributeValues)
	{
		return createSIPPCodeUpgrade( getSession().getSessionContext(), attributeValues );
	}
	
	public TimeSlot createTimeSlot(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionstransportConstants.TC.TIMESLOT );
			return (TimeSlot)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TimeSlot : "+e.getMessage(), 0 );
		}
	}
	
	public TimeSlot createTimeSlot(final Map attributeValues)
	{
		return createTimeSlot( getSession().getSessionContext(), attributeValues );
	}
	
	public TransportationAncillaryRate createTransportationAncillaryRate(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionstransportConstants.TC.TRANSPORTATIONANCILLARYRATE );
			return (TransportationAncillaryRate)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TransportationAncillaryRate : "+e.getMessage(), 0 );
		}
	}
	
	public TransportationAncillaryRate createTransportationAncillaryRate(final Map attributeValues)
	{
		return createTransportationAncillaryRate( getSession().getSessionContext(), attributeValues );
	}
	
	public TransportationOfferAncillaryAdvDefinition createTransportationOfferAncillaryAdvDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionstransportConstants.TC.TRANSPORTATIONOFFERANCILLARYADVDEFINITION );
			return (TransportationOfferAncillaryAdvDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TransportationOfferAncillaryAdvDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public TransportationOfferAncillaryAdvDefinition createTransportationOfferAncillaryAdvDefinition(final Map attributeValues)
	{
		return createTransportationOfferAncillaryAdvDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public TransportationOffers createTransportationOffers(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionstransportConstants.TC.TRANSPORTATIONOFFERS );
			return (TransportationOffers)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TransportationOffers : "+e.getMessage(), 0 );
		}
	}
	
	public TransportationOffers createTransportationOffers(final Map attributeValues)
	{
		return createTransportationOffers( getSession().getSessionContext(), attributeValues );
	}
	
	public TransportationRateAdvDefinition createTransportationRateAdvDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionstransportConstants.TC.TRANSPORTATIONRATEADVDEFINITION );
			return (TransportationRateAdvDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TransportationRateAdvDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public TransportationRateAdvDefinition createTransportationRateAdvDefinition(final Map attributeValues)
	{
		return createTransportationRateAdvDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public TransportationRateDefinition createTransportationRateDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionstransportConstants.TC.TRANSPORTATIONRATEDEFINITION );
			return (TransportationRateDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TransportationRateDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public TransportationRateDefinition createTransportationRateDefinition(final Map attributeValues)
	{
		return createTransportationRateDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public TransportationRateDetail createTransportationRateDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionstransportConstants.TC.TRANSPORTATIONRATEDETAIL );
			return (TransportationRateDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TransportationRateDetail : "+e.getMessage(), 0 );
		}
	}
	
	public TransportationRateDetail createTransportationRateDetail(final Map attributeValues)
	{
		return createTransportationRateDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public TransportationSupplierRate createTransportationSupplierRate(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionstransportConstants.TC.TRANSPORTATIONSUPPLIERRATE );
			return (TransportationSupplierRate)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TransportationSupplierRate : "+e.getMessage(), 0 );
		}
	}
	
	public TransportationSupplierRate createTransportationSupplierRate(final Map attributeValues)
	{
		return createTransportationSupplierRate( getSession().getSessionContext(), attributeValues );
	}
	
	public TransportationSurchargeSuppDetail createTransportationSurchargeSuppDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionstransportConstants.TC.TRANSPORTATIONSURCHARGESUPPDETAIL );
			return (TransportationSurchargeSuppDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TransportationSurchargeSuppDetail : "+e.getMessage(), 0 );
		}
	}
	
	public TransportationSurchargeSuppDetail createTransportationSurchargeSuppDetail(final Map attributeValues)
	{
		return createTransportationSurchargeSuppDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public VehicleCharge createVehicleCharge(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionstransportConstants.TC.VEHICLECHARGE );
			return (VehicleCharge)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating VehicleCharge : "+e.getMessage(), 0 );
		}
	}
	
	public VehicleCharge createVehicleCharge(final Map attributeValues)
	{
		return createVehicleCharge( getSession().getSessionContext(), attributeValues );
	}
	
	public VehicleTransporationOfferRestriction createVehicleTransporationOfferRestriction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionstransportConstants.TC.VEHICLETRANSPORATIONOFFERRESTRICTION );
			return (VehicleTransporationOfferRestriction)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating VehicleTransporationOfferRestriction : "+e.getMessage(), 0 );
		}
	}
	
	public VehicleTransporationOfferRestriction createVehicleTransporationOfferRestriction(final Map attributeValues)
	{
		return createVehicleTransporationOfferRestriction( getSession().getSessionContext(), attributeValues );
	}
	
	public VehicleTransporationRateRestriction createVehicleTransporationRateRestriction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionstransportConstants.TC.VEHICLETRANSPORATIONRATERESTRICTION );
			return (VehicleTransporationRateRestriction)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating VehicleTransporationRateRestriction : "+e.getMessage(), 0 );
		}
	}
	
	public VehicleTransporationRateRestriction createVehicleTransporationRateRestriction(final Map attributeValues)
	{
		return createVehicleTransporationRateRestriction( getSession().getSessionContext(), attributeValues );
	}
	
	public VehicleUpgrade createVehicleUpgrade(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionstransportConstants.TC.VEHICLEUPGRADE );
			return (VehicleUpgrade)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating VehicleUpgrade : "+e.getMessage(), 0 );
		}
	}
	
	public VehicleUpgrade createVehicleUpgrade(final Map attributeValues)
	{
		return createVehicleUpgrade( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return SupplierratedefinitionstransportConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChildAgeDetail.paxapplicability</code> attribute.
	 * @return the paxapplicability
	 */
	public PaxApplicability getPaxapplicability(final SessionContext ctx, final ChildAgeDetail item)
	{
		return (PaxApplicability)item.getProperty( ctx, SupplierratedefinitionstransportConstants.Attributes.ChildAgeDetail.PAXAPPLICABILITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChildAgeDetail.paxapplicability</code> attribute.
	 * @return the paxapplicability
	 */
	public PaxApplicability getPaxapplicability(final ChildAgeDetail item)
	{
		return getPaxapplicability( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChildAgeDetail.paxapplicability</code> attribute. 
	 * @param value the paxapplicability
	 */
	public void setPaxapplicability(final SessionContext ctx, final ChildAgeDetail item, final PaxApplicability value)
	{
		item.setProperty(ctx, SupplierratedefinitionstransportConstants.Attributes.ChildAgeDetail.PAXAPPLICABILITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChildAgeDetail.paxapplicability</code> attribute. 
	 * @param value the paxapplicability
	 */
	public void setPaxapplicability(final ChildAgeDetail item, final PaxApplicability value)
	{
		setPaxapplicability( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Tax.transportationRateDefinition</code> attribute.
	 * @return the transportationRateDefinition
	 */
	public TransportationRateDefinition getTransportationRateDefinition(final SessionContext ctx, final Tax item)
	{
		return (TransportationRateDefinition)item.getProperty( ctx, SupplierratedefinitionstransportConstants.Attributes.Tax.TRANSPORTATIONRATEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Tax.transportationRateDefinition</code> attribute.
	 * @return the transportationRateDefinition
	 */
	public TransportationRateDefinition getTransportationRateDefinition(final Tax item)
	{
		return getTransportationRateDefinition( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Tax.transportationRateDefinition</code> attribute. 
	 * @param value the transportationRateDefinition
	 */
	public void setTransportationRateDefinition(final SessionContext ctx, final Tax item, final TransportationRateDefinition value)
	{
		item.setProperty(ctx, SupplierratedefinitionstransportConstants.Attributes.Tax.TRANSPORTATIONRATEDEFINITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Tax.transportationRateDefinition</code> attribute. 
	 * @param value the transportationRateDefinition
	 */
	public void setTransportationRateDefinition(final Tax item, final TransportationRateDefinition value)
	{
		setTransportationRateDefinition( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Tax.transportationRateDetail</code> attribute.
	 * @return the transportationRateDetail
	 */
	public TransportationRateDetail getTransportationRateDetail(final SessionContext ctx, final Tax item)
	{
		return (TransportationRateDetail)item.getProperty( ctx, SupplierratedefinitionstransportConstants.Attributes.Tax.TRANSPORTATIONRATEDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Tax.transportationRateDetail</code> attribute.
	 * @return the transportationRateDetail
	 */
	public TransportationRateDetail getTransportationRateDetail(final Tax item)
	{
		return getTransportationRateDetail( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Tax.transportationRateDetail</code> attribute. 
	 * @param value the transportationRateDetail
	 */
	public void setTransportationRateDetail(final SessionContext ctx, final Tax item, final TransportationRateDetail value)
	{
		item.setProperty(ctx, SupplierratedefinitionstransportConstants.Attributes.Tax.TRANSPORTATIONRATEDETAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Tax.transportationRateDetail</code> attribute. 
	 * @param value the transportationRateDetail
	 */
	public void setTransportationRateDetail(final Tax item, final TransportationRateDetail value)
	{
		setTransportationRateDetail( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.transportationRateDetail</code> attribute.
	 * @return the transportationRateDetail
	 */
	public TransportationRateDetail getTransportationRateDetail(final SessionContext ctx, final AbstractTravelogixSupplierOffer item)
	{
		return (TransportationRateDetail)item.getProperty( ctx, SupplierratedefinitionstransportConstants.Attributes.AbstractTravelogixSupplierOffer.TRANSPORTATIONRATEDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.transportationRateDetail</code> attribute.
	 * @return the transportationRateDetail
	 */
	public TransportationRateDetail getTransportationRateDetail(final AbstractTravelogixSupplierOffer item)
	{
		return getTransportationRateDetail( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.transportationRateDetail</code> attribute. 
	 * @param value the transportationRateDetail
	 */
	public void setTransportationRateDetail(final SessionContext ctx, final AbstractTravelogixSupplierOffer item, final TransportationRateDetail value)
	{
		item.setProperty(ctx, SupplierratedefinitionstransportConstants.Attributes.AbstractTravelogixSupplierOffer.TRANSPORTATIONRATEDETAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.transportationRateDetail</code> attribute. 
	 * @param value the transportationRateDetail
	 */
	public void setTransportationRateDetail(final AbstractTravelogixSupplierOffer item, final TransportationRateDetail value)
	{
		setTransportationRateDetail( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.transportratedetail</code> attribute.
	 * @return the transportratedetail
	 */
	public Collection<TransportationRateDetail> getTransportratedetail(final SessionContext ctx, final TravelogixPolicy item)
	{
		final List<TransportationRateDetail> items = item.getLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionstransportConstants.Relations.TRANSPORTRATEDET2TRAVELOGIXPOLICYRELATION,
			"TransportationRateDetail",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.transportratedetail</code> attribute.
	 * @return the transportratedetail
	 */
	public Collection<TransportationRateDetail> getTransportratedetail(final TravelogixPolicy item)
	{
		return getTransportratedetail( getSession().getSessionContext(), item );
	}
	
	public long getTransportratedetailCount(final SessionContext ctx, final TravelogixPolicy item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			SupplierratedefinitionstransportConstants.Relations.TRANSPORTRATEDET2TRAVELOGIXPOLICYRELATION,
			"TransportationRateDetail",
			null
		);
	}
	
	public long getTransportratedetailCount(final TravelogixPolicy item)
	{
		return getTransportratedetailCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.transportratedetail</code> attribute. 
	 * @param value the transportratedetail
	 */
	public void setTransportratedetail(final SessionContext ctx, final TravelogixPolicy item, final Collection<TransportationRateDetail> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionstransportConstants.Relations.TRANSPORTRATEDET2TRAVELOGIXPOLICYRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(TRANSPORTRATEDET2TRAVELOGIXPOLICYRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.transportratedetail</code> attribute. 
	 * @param value the transportratedetail
	 */
	public void setTransportratedetail(final TravelogixPolicy item, final Collection<TransportationRateDetail> value)
	{
		setTransportratedetail( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to transportratedetail. 
	 * @param value the item to add to transportratedetail
	 */
	public void addToTransportratedetail(final SessionContext ctx, final TravelogixPolicy item, final TransportationRateDetail value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionstransportConstants.Relations.TRANSPORTRATEDET2TRAVELOGIXPOLICYRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TRANSPORTRATEDET2TRAVELOGIXPOLICYRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to transportratedetail. 
	 * @param value the item to add to transportratedetail
	 */
	public void addToTransportratedetail(final TravelogixPolicy item, final TransportationRateDetail value)
	{
		addToTransportratedetail( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from transportratedetail. 
	 * @param value the item to remove from transportratedetail
	 */
	public void removeFromTransportratedetail(final SessionContext ctx, final TravelogixPolicy item, final TransportationRateDetail value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionstransportConstants.Relations.TRANSPORTRATEDET2TRAVELOGIXPOLICYRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TRANSPORTRATEDET2TRAVELOGIXPOLICYRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from transportratedetail. 
	 * @param value the item to remove from transportratedetail
	 */
	public void removeFromTransportratedetail(final TravelogixPolicy item, final TransportationRateDetail value)
	{
		removeFromTransportratedetail( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.vehicleTransporationOfferRestriction</code> attribute.
	 * @return the vehicleTransporationOfferRestriction
	 */
	public VehicleTransporationOfferRestriction getVehicleTransporationOfferRestriction(final SessionContext ctx, final Vehicle item)
	{
		return (VehicleTransporationOfferRestriction)item.getProperty( ctx, SupplierratedefinitionstransportConstants.Attributes.Vehicle.VEHICLETRANSPORATIONOFFERRESTRICTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.vehicleTransporationOfferRestriction</code> attribute.
	 * @return the vehicleTransporationOfferRestriction
	 */
	public VehicleTransporationOfferRestriction getVehicleTransporationOfferRestriction(final Vehicle item)
	{
		return getVehicleTransporationOfferRestriction( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.vehicleTransporationOfferRestriction</code> attribute. 
	 * @param value the vehicleTransporationOfferRestriction
	 */
	public void setVehicleTransporationOfferRestriction(final SessionContext ctx, final Vehicle item, final VehicleTransporationOfferRestriction value)
	{
		item.setProperty(ctx, SupplierratedefinitionstransportConstants.Attributes.Vehicle.VEHICLETRANSPORATIONOFFERRESTRICTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.vehicleTransporationOfferRestriction</code> attribute. 
	 * @param value the vehicleTransporationOfferRestriction
	 */
	public void setVehicleTransporationOfferRestriction(final Vehicle item, final VehicleTransporationOfferRestriction value)
	{
		setVehicleTransporationOfferRestriction( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SippCode.vehicleTransporationOfferRestriction</code> attribute.
	 * @return the vehicleTransporationOfferRestriction
	 */
	public VehicleTransporationOfferRestriction getVehicleTransporationOfferRestriction(final SessionContext ctx, final EnumerationValue item)
	{
		return (VehicleTransporationOfferRestriction)item.getProperty( ctx, SupplierratedefinitionstransportConstants.Attributes.SippCode.VEHICLETRANSPORATIONOFFERRESTRICTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SippCode.vehicleTransporationOfferRestriction</code> attribute.
	 * @return the vehicleTransporationOfferRestriction
	 */
	public VehicleTransporationOfferRestriction getVehicleTransporationOfferRestriction(final EnumerationValue item)
	{
		return getVehicleTransporationOfferRestriction( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SippCode.vehicleTransporationOfferRestriction</code> attribute. 
	 * @param value the vehicleTransporationOfferRestriction
	 */
	public void setVehicleTransporationOfferRestriction(final SessionContext ctx, final EnumerationValue item, final VehicleTransporationOfferRestriction value)
	{
		item.setProperty(ctx, SupplierratedefinitionstransportConstants.Attributes.SippCode.VEHICLETRANSPORATIONOFFERRESTRICTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SippCode.vehicleTransporationOfferRestriction</code> attribute. 
	 * @param value the vehicleTransporationOfferRestriction
	 */
	public void setVehicleTransporationOfferRestriction(final EnumerationValue item, final VehicleTransporationOfferRestriction value)
	{
		setVehicleTransporationOfferRestriction( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarGroup.vehicleTransporationOfferRestriction</code> attribute.
	 * @return the vehicleTransporationOfferRestriction
	 */
	public VehicleTransporationOfferRestriction getVehicleTransporationOfferRestriction(final SessionContext ctx, final CarGroup item)
	{
		return (VehicleTransporationOfferRestriction)item.getProperty( ctx, SupplierratedefinitionstransportConstants.Attributes.CarGroup.VEHICLETRANSPORATIONOFFERRESTRICTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarGroup.vehicleTransporationOfferRestriction</code> attribute.
	 * @return the vehicleTransporationOfferRestriction
	 */
	public VehicleTransporationOfferRestriction getVehicleTransporationOfferRestriction(final CarGroup item)
	{
		return getVehicleTransporationOfferRestriction( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarGroup.vehicleTransporationOfferRestriction</code> attribute. 
	 * @param value the vehicleTransporationOfferRestriction
	 */
	public void setVehicleTransporationOfferRestriction(final SessionContext ctx, final CarGroup item, final VehicleTransporationOfferRestriction value)
	{
		item.setProperty(ctx, SupplierratedefinitionstransportConstants.Attributes.CarGroup.VEHICLETRANSPORATIONOFFERRESTRICTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarGroup.vehicleTransporationOfferRestriction</code> attribute. 
	 * @param value the vehicleTransporationOfferRestriction
	 */
	public void setVehicleTransporationOfferRestriction(final CarGroup item, final VehicleTransporationOfferRestriction value)
	{
		setVehicleTransporationOfferRestriction( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.vehicleTransporationRateRestriction</code> attribute.
	 * @return the vehicleTransporationRateRestriction
	 */
	public VehicleTransporationRateRestriction getVehicleTransporationRateRestriction(final SessionContext ctx, final Vehicle item)
	{
		return (VehicleTransporationRateRestriction)item.getProperty( ctx, SupplierratedefinitionstransportConstants.Attributes.Vehicle.VEHICLETRANSPORATIONRATERESTRICTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.vehicleTransporationRateRestriction</code> attribute.
	 * @return the vehicleTransporationRateRestriction
	 */
	public VehicleTransporationRateRestriction getVehicleTransporationRateRestriction(final Vehicle item)
	{
		return getVehicleTransporationRateRestriction( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.vehicleTransporationRateRestriction</code> attribute. 
	 * @param value the vehicleTransporationRateRestriction
	 */
	public void setVehicleTransporationRateRestriction(final SessionContext ctx, final Vehicle item, final VehicleTransporationRateRestriction value)
	{
		item.setProperty(ctx, SupplierratedefinitionstransportConstants.Attributes.Vehicle.VEHICLETRANSPORATIONRATERESTRICTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.vehicleTransporationRateRestriction</code> attribute. 
	 * @param value the vehicleTransporationRateRestriction
	 */
	public void setVehicleTransporationRateRestriction(final Vehicle item, final VehicleTransporationRateRestriction value)
	{
		setVehicleTransporationRateRestriction( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SippCode.vehicleTransporationRateRestriction</code> attribute.
	 * @return the vehicleTransporationRateRestriction
	 */
	public VehicleTransporationRateRestriction getVehicleTransporationRateRestriction(final SessionContext ctx, final EnumerationValue item)
	{
		return (VehicleTransporationRateRestriction)item.getProperty( ctx, SupplierratedefinitionstransportConstants.Attributes.SippCode.VEHICLETRANSPORATIONRATERESTRICTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SippCode.vehicleTransporationRateRestriction</code> attribute.
	 * @return the vehicleTransporationRateRestriction
	 */
	public VehicleTransporationRateRestriction getVehicleTransporationRateRestriction(final EnumerationValue item)
	{
		return getVehicleTransporationRateRestriction( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SippCode.vehicleTransporationRateRestriction</code> attribute. 
	 * @param value the vehicleTransporationRateRestriction
	 */
	public void setVehicleTransporationRateRestriction(final SessionContext ctx, final EnumerationValue item, final VehicleTransporationRateRestriction value)
	{
		item.setProperty(ctx, SupplierratedefinitionstransportConstants.Attributes.SippCode.VEHICLETRANSPORATIONRATERESTRICTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SippCode.vehicleTransporationRateRestriction</code> attribute. 
	 * @param value the vehicleTransporationRateRestriction
	 */
	public void setVehicleTransporationRateRestriction(final EnumerationValue item, final VehicleTransporationRateRestriction value)
	{
		setVehicleTransporationRateRestriction( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarGroup.vehicleTransporationRateRestriction</code> attribute.
	 * @return the vehicleTransporationRateRestriction
	 */
	public VehicleTransporationRateRestriction getVehicleTransporationRateRestriction(final SessionContext ctx, final CarGroup item)
	{
		return (VehicleTransporationRateRestriction)item.getProperty( ctx, SupplierratedefinitionstransportConstants.Attributes.CarGroup.VEHICLETRANSPORATIONRATERESTRICTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarGroup.vehicleTransporationRateRestriction</code> attribute.
	 * @return the vehicleTransporationRateRestriction
	 */
	public VehicleTransporationRateRestriction getVehicleTransporationRateRestriction(final CarGroup item)
	{
		return getVehicleTransporationRateRestriction( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarGroup.vehicleTransporationRateRestriction</code> attribute. 
	 * @param value the vehicleTransporationRateRestriction
	 */
	public void setVehicleTransporationRateRestriction(final SessionContext ctx, final CarGroup item, final VehicleTransporationRateRestriction value)
	{
		item.setProperty(ctx, SupplierratedefinitionstransportConstants.Attributes.CarGroup.VEHICLETRANSPORATIONRATERESTRICTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarGroup.vehicleTransporationRateRestriction</code> attribute. 
	 * @param value the vehicleTransporationRateRestriction
	 */
	public void setVehicleTransporationRateRestriction(final CarGroup item, final VehicleTransporationRateRestriction value)
	{
		setVehicleTransporationRateRestriction( getSession().getSessionContext(), item, value );
	}
	
}
