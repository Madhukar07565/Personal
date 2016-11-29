/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.holiday.master.core.jalo;

import com.cnk.travelogix.product.common.core.jalo.AbstractDayWiseItinerary;
import com.cnk.travelogix.product.common.core.jalo.AbstractVisaDetails;
import com.cnk.travelogix.product.holiday.master.core.constants.HolidayproductmastercoreConstants;
import com.cnk.travelogix.product.holiday.masters.core.jalo.AccoDayWiseItinerary;
import com.cnk.travelogix.product.holiday.masters.core.jalo.ActivityDayWiseItinerary;
import com.cnk.travelogix.product.holiday.masters.core.jalo.BlackOutDates;
import com.cnk.travelogix.product.holiday.masters.core.jalo.CarPackage;
import com.cnk.travelogix.product.holiday.masters.core.jalo.DayWiseItinerary;
import com.cnk.travelogix.product.holiday.masters.core.jalo.Feeder;
import com.cnk.travelogix.product.holiday.masters.core.jalo.FlightTransferDayWiseItinerary;
import com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayBrand;
import com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayDestination;
import com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayFlavor;
import com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayHub;
import com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayItineraryDetails;
import com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayProduct;
import com.cnk.travelogix.product.holiday.masters.core.jalo.OfflineVisaDetails;
import com.cnk.travelogix.product.holiday.masters.core.jalo.OnlineVisaDetails;
import com.cnk.travelogix.product.holiday.masters.core.jalo.OtherDayWiseItinerary;
import com.cnk.travelogix.product.holiday.masters.core.jalo.Prices;
import com.cnk.travelogix.product.holiday.masters.core.jalo.RailPassTransferDayWiseItinerary;
import com.cnk.travelogix.product.holiday.masters.core.jalo.RailTicketTransferDayWiseItinerary;
import com.cnk.travelogix.product.holiday.masters.core.jalo.RailTransferDayWiseItinerary;
import com.cnk.travelogix.product.holiday.masters.core.jalo.RentalTransferDayWiseItinerary;
import com.cnk.travelogix.product.holiday.masters.core.jalo.TransferProductDayWiseItinerary;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>HolidayproductmastercoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHolidayproductmastercoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("holidayFlavor", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.product.common.core.jalo.AbstractDayWiseItinerary", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("holidayFlavor", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.product.common.core.jalo.AbstractVisaDetails", Collections.unmodifiableMap(tmp));
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
	
	public AccoDayWiseItinerary createAccoDayWiseItinerary(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayproductmastercoreConstants.TC.ACCODAYWISEITINERARY );
			return (AccoDayWiseItinerary)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AccoDayWiseItinerary : "+e.getMessage(), 0 );
		}
	}
	
	public AccoDayWiseItinerary createAccoDayWiseItinerary(final Map attributeValues)
	{
		return createAccoDayWiseItinerary( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivityDayWiseItinerary createActivityDayWiseItinerary(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayproductmastercoreConstants.TC.ACTIVITYDAYWISEITINERARY );
			return (ActivityDayWiseItinerary)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ActivityDayWiseItinerary : "+e.getMessage(), 0 );
		}
	}
	
	public ActivityDayWiseItinerary createActivityDayWiseItinerary(final Map attributeValues)
	{
		return createActivityDayWiseItinerary( getSession().getSessionContext(), attributeValues );
	}
	
	public BlackOutDates createBlackOutDates(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayproductmastercoreConstants.TC.BLACKOUTDATES );
			return (BlackOutDates)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating BlackOutDates : "+e.getMessage(), 0 );
		}
	}
	
	public BlackOutDates createBlackOutDates(final Map attributeValues)
	{
		return createBlackOutDates( getSession().getSessionContext(), attributeValues );
	}
	
	public CarPackage createCarPackage(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayproductmastercoreConstants.TC.CARPACKAGE );
			return (CarPackage)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CarPackage : "+e.getMessage(), 0 );
		}
	}
	
	public CarPackage createCarPackage(final Map attributeValues)
	{
		return createCarPackage( getSession().getSessionContext(), attributeValues );
	}
	
	public DayWiseItinerary createDayWiseItinerary(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayproductmastercoreConstants.TC.DAYWISEITINERARY );
			return (DayWiseItinerary)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DayWiseItinerary : "+e.getMessage(), 0 );
		}
	}
	
	public DayWiseItinerary createDayWiseItinerary(final Map attributeValues)
	{
		return createDayWiseItinerary( getSession().getSessionContext(), attributeValues );
	}
	
	public Feeder createFeeder(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayproductmastercoreConstants.TC.FEEDER );
			return (Feeder)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Feeder : "+e.getMessage(), 0 );
		}
	}
	
	public Feeder createFeeder(final Map attributeValues)
	{
		return createFeeder( getSession().getSessionContext(), attributeValues );
	}
	
	public FlightTransferDayWiseItinerary createFlightTransferDayWiseItinerary(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayproductmastercoreConstants.TC.FLIGHTTRANSFERDAYWISEITINERARY );
			return (FlightTransferDayWiseItinerary)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating FlightTransferDayWiseItinerary : "+e.getMessage(), 0 );
		}
	}
	
	public FlightTransferDayWiseItinerary createFlightTransferDayWiseItinerary(final Map attributeValues)
	{
		return createFlightTransferDayWiseItinerary( getSession().getSessionContext(), attributeValues );
	}
	
	public HolidayBrand createHolidayBrand(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayproductmastercoreConstants.TC.HOLIDAYBRAND );
			return (HolidayBrand)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating HolidayBrand : "+e.getMessage(), 0 );
		}
	}
	
	public HolidayBrand createHolidayBrand(final Map attributeValues)
	{
		return createHolidayBrand( getSession().getSessionContext(), attributeValues );
	}
	
	public HolidayDestination createHolidayDestination(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayproductmastercoreConstants.TC.HOLIDAYDESTINATION );
			return (HolidayDestination)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating HolidayDestination : "+e.getMessage(), 0 );
		}
	}
	
	public HolidayDestination createHolidayDestination(final Map attributeValues)
	{
		return createHolidayDestination( getSession().getSessionContext(), attributeValues );
	}
	
	public HolidayFlavor createHolidayFlavor(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayproductmastercoreConstants.TC.HOLIDAYFLAVOR );
			return (HolidayFlavor)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating HolidayFlavor : "+e.getMessage(), 0 );
		}
	}
	
	public HolidayFlavor createHolidayFlavor(final Map attributeValues)
	{
		return createHolidayFlavor( getSession().getSessionContext(), attributeValues );
	}
	
	public HolidayHub createHolidayHub(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayproductmastercoreConstants.TC.HOLIDAYHUB );
			return (HolidayHub)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating HolidayHub : "+e.getMessage(), 0 );
		}
	}
	
	public HolidayHub createHolidayHub(final Map attributeValues)
	{
		return createHolidayHub( getSession().getSessionContext(), attributeValues );
	}
	
	public HolidayItineraryDetails createHolidayItineraryDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayproductmastercoreConstants.TC.HOLIDAYITINERARYDETAILS );
			return (HolidayItineraryDetails)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating HolidayItineraryDetails : "+e.getMessage(), 0 );
		}
	}
	
	public HolidayItineraryDetails createHolidayItineraryDetails(final Map attributeValues)
	{
		return createHolidayItineraryDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public HolidayProduct createHolidayProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayproductmastercoreConstants.TC.HOLIDAYPRODUCT );
			return (HolidayProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating HolidayProduct : "+e.getMessage(), 0 );
		}
	}
	
	public HolidayProduct createHolidayProduct(final Map attributeValues)
	{
		return createHolidayProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public OfflineVisaDetails createOfflineVisaDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayproductmastercoreConstants.TC.OFFLINEVISADETAILS );
			return (OfflineVisaDetails)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating OfflineVisaDetails : "+e.getMessage(), 0 );
		}
	}
	
	public OfflineVisaDetails createOfflineVisaDetails(final Map attributeValues)
	{
		return createOfflineVisaDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public OnlineVisaDetails createOnlineVisaDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayproductmastercoreConstants.TC.ONLINEVISADETAILS );
			return (OnlineVisaDetails)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating OnlineVisaDetails : "+e.getMessage(), 0 );
		}
	}
	
	public OnlineVisaDetails createOnlineVisaDetails(final Map attributeValues)
	{
		return createOnlineVisaDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public OtherDayWiseItinerary createOtherDayWiseItinerary(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayproductmastercoreConstants.TC.OTHERDAYWISEITINERARY );
			return (OtherDayWiseItinerary)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating OtherDayWiseItinerary : "+e.getMessage(), 0 );
		}
	}
	
	public OtherDayWiseItinerary createOtherDayWiseItinerary(final Map attributeValues)
	{
		return createOtherDayWiseItinerary( getSession().getSessionContext(), attributeValues );
	}
	
	public Prices createPrices(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayproductmastercoreConstants.TC.PRICES );
			return (Prices)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Prices : "+e.getMessage(), 0 );
		}
	}
	
	public Prices createPrices(final Map attributeValues)
	{
		return createPrices( getSession().getSessionContext(), attributeValues );
	}
	
	public RailPassTransferDayWiseItinerary createRailPassTransferDayWiseItinerary(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayproductmastercoreConstants.TC.RAILPASSTRANSFERDAYWISEITINERARY );
			return (RailPassTransferDayWiseItinerary)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating RailPassTransferDayWiseItinerary : "+e.getMessage(), 0 );
		}
	}
	
	public RailPassTransferDayWiseItinerary createRailPassTransferDayWiseItinerary(final Map attributeValues)
	{
		return createRailPassTransferDayWiseItinerary( getSession().getSessionContext(), attributeValues );
	}
	
	public RailTicketTransferDayWiseItinerary createRailTicketTransferDayWiseItinerary(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayproductmastercoreConstants.TC.RAILTICKETTRANSFERDAYWISEITINERARY );
			return (RailTicketTransferDayWiseItinerary)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating RailTicketTransferDayWiseItinerary : "+e.getMessage(), 0 );
		}
	}
	
	public RailTicketTransferDayWiseItinerary createRailTicketTransferDayWiseItinerary(final Map attributeValues)
	{
		return createRailTicketTransferDayWiseItinerary( getSession().getSessionContext(), attributeValues );
	}
	
	public RailTransferDayWiseItinerary createRailTransferDayWiseItinerary(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayproductmastercoreConstants.TC.RAILTRANSFERDAYWISEITINERARY );
			return (RailTransferDayWiseItinerary)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating RailTransferDayWiseItinerary : "+e.getMessage(), 0 );
		}
	}
	
	public RailTransferDayWiseItinerary createRailTransferDayWiseItinerary(final Map attributeValues)
	{
		return createRailTransferDayWiseItinerary( getSession().getSessionContext(), attributeValues );
	}
	
	public RentalTransferDayWiseItinerary createRentalTransferDayWiseItinerary(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayproductmastercoreConstants.TC.RENTALTRANSFERDAYWISEITINERARY );
			return (RentalTransferDayWiseItinerary)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating RentalTransferDayWiseItinerary : "+e.getMessage(), 0 );
		}
	}
	
	public RentalTransferDayWiseItinerary createRentalTransferDayWiseItinerary(final Map attributeValues)
	{
		return createRentalTransferDayWiseItinerary( getSession().getSessionContext(), attributeValues );
	}
	
	public TransferProductDayWiseItinerary createTransferProductDayWiseItinerary(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayproductmastercoreConstants.TC.TRANSFERPRODUCTDAYWISEITINERARY );
			return (TransferProductDayWiseItinerary)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TransferProductDayWiseItinerary : "+e.getMessage(), 0 );
		}
	}
	
	public TransferProductDayWiseItinerary createTransferProductDayWiseItinerary(final Map attributeValues)
	{
		return createTransferProductDayWiseItinerary( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return HolidayproductmastercoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDayWiseItinerary.holidayFlavor</code> attribute.
	 * @return the holidayFlavor
	 */
	public HolidayFlavor getHolidayFlavor(final SessionContext ctx, final AbstractDayWiseItinerary item)
	{
		return (HolidayFlavor)item.getProperty( ctx, HolidayproductmastercoreConstants.Attributes.AbstractDayWiseItinerary.HOLIDAYFLAVOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDayWiseItinerary.holidayFlavor</code> attribute.
	 * @return the holidayFlavor
	 */
	public HolidayFlavor getHolidayFlavor(final AbstractDayWiseItinerary item)
	{
		return getHolidayFlavor( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDayWiseItinerary.holidayFlavor</code> attribute. 
	 * @param value the holidayFlavor
	 */
	public void setHolidayFlavor(final SessionContext ctx, final AbstractDayWiseItinerary item, final HolidayFlavor value)
	{
		item.setProperty(ctx, HolidayproductmastercoreConstants.Attributes.AbstractDayWiseItinerary.HOLIDAYFLAVOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDayWiseItinerary.holidayFlavor</code> attribute. 
	 * @param value the holidayFlavor
	 */
	public void setHolidayFlavor(final AbstractDayWiseItinerary item, final HolidayFlavor value)
	{
		setHolidayFlavor( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractVisaDetails.holidayFlavor</code> attribute.
	 * @return the holidayFlavor
	 */
	public HolidayFlavor getHolidayFlavor(final SessionContext ctx, final AbstractVisaDetails item)
	{
		return (HolidayFlavor)item.getProperty( ctx, HolidayproductmastercoreConstants.Attributes.AbstractVisaDetails.HOLIDAYFLAVOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractVisaDetails.holidayFlavor</code> attribute.
	 * @return the holidayFlavor
	 */
	public HolidayFlavor getHolidayFlavor(final AbstractVisaDetails item)
	{
		return getHolidayFlavor( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractVisaDetails.holidayFlavor</code> attribute. 
	 * @param value the holidayFlavor
	 */
	public void setHolidayFlavor(final SessionContext ctx, final AbstractVisaDetails item, final HolidayFlavor value)
	{
		item.setProperty(ctx, HolidayproductmastercoreConstants.Attributes.AbstractVisaDetails.HOLIDAYFLAVOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractVisaDetails.holidayFlavor</code> attribute. 
	 * @param value the holidayFlavor
	 */
	public void setHolidayFlavor(final AbstractVisaDetails item, final HolidayFlavor value)
	{
		setHolidayFlavor( getSession().getSessionContext(), item, value );
	}
	
}
