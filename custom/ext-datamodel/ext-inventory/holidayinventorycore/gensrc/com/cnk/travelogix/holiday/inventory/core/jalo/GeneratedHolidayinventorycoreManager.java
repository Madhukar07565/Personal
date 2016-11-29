/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.holiday.inventory.core.jalo;

import com.cnk.travelogix.datamodel.holiday.inventory.jalo.HolidayAnyRoomInvDetail;
import com.cnk.travelogix.datamodel.holiday.inventory.jalo.HolidayDetailedRoomInfo;
import com.cnk.travelogix.datamodel.holiday.inventory.jalo.HolidayInventoryDetail;
import com.cnk.travelogix.datamodel.holiday.inventory.jalo.HolidayInventoryRequest;
import com.cnk.travelogix.datamodel.holiday.inventory.jalo.HolidayPaxRoomInvDetail;
import com.cnk.travelogix.datamodel.holiday.inventory.jalo.HolidayRoomInfo;
import com.cnk.travelogix.datamodel.holiday.inventory.jalo.HolidayRoomTypeInvDetail;
import com.cnk.travelogix.datamodel.holiday.inventory.jalo.PackageInclusionInfo;
import com.cnk.travelogix.datamodel.holiday.inventory.jalo.SpecificTravelDatesHolidayInvDetails;
import com.cnk.travelogix.datamodel.holiday.inventory.jalo.TravelRangeHolidayInvDetails;
import com.cnk.travelogix.holiday.inventory.core.constants.HolidayinventorycoreConstants;
import com.cnk.travelogix.holiday.inventory.core.jalo.HolidayCompanySpecificInventory;
import com.cnk.travelogix.holiday.inventory.core.jalo.HolidayCutOffAndCharges;
import com.cnk.travelogix.holiday.inventory.core.jalo.HolidayInvSupplierAdvanceDefinition;
import com.cnk.travelogix.holiday.inventory.core.jalo.HolidayInventoryDefinition;
import com.cnk.travelogix.holiday.inventory.core.jalo.HolidayPenaltyCharges;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>HolidayinventorycoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHolidayinventorycoreManager extends Extension
{
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
	
	public HolidayAnyRoomInvDetail createHolidayAnyRoomInvDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayinventorycoreConstants.TC.HOLIDAYANYROOMINVDETAIL );
			return (HolidayAnyRoomInvDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating HolidayAnyRoomInvDetail : "+e.getMessage(), 0 );
		}
	}
	
	public HolidayAnyRoomInvDetail createHolidayAnyRoomInvDetail(final Map attributeValues)
	{
		return createHolidayAnyRoomInvDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public HolidayCompanySpecificInventory createHolidayCompanySpecificInventory(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayinventorycoreConstants.TC.HOLIDAYCOMPANYSPECIFICINVENTORY );
			return (HolidayCompanySpecificInventory)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating HolidayCompanySpecificInventory : "+e.getMessage(), 0 );
		}
	}
	
	public HolidayCompanySpecificInventory createHolidayCompanySpecificInventory(final Map attributeValues)
	{
		return createHolidayCompanySpecificInventory( getSession().getSessionContext(), attributeValues );
	}
	
	public HolidayCutOffAndCharges createHolidayCutOffAndCharges(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayinventorycoreConstants.TC.HOLIDAYCUTOFFANDCHARGES );
			return (HolidayCutOffAndCharges)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating HolidayCutOffAndCharges : "+e.getMessage(), 0 );
		}
	}
	
	public HolidayCutOffAndCharges createHolidayCutOffAndCharges(final Map attributeValues)
	{
		return createHolidayCutOffAndCharges( getSession().getSessionContext(), attributeValues );
	}
	
	public HolidayDetailedRoomInfo createHolidayDetailedRoomInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayinventorycoreConstants.TC.HOLIDAYDETAILEDROOMINFO );
			return (HolidayDetailedRoomInfo)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating HolidayDetailedRoomInfo : "+e.getMessage(), 0 );
		}
	}
	
	public HolidayDetailedRoomInfo createHolidayDetailedRoomInfo(final Map attributeValues)
	{
		return createHolidayDetailedRoomInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public HolidayInventoryDefinition createHolidayInventoryDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayinventorycoreConstants.TC.HOLIDAYINVENTORYDEFINITION );
			return (HolidayInventoryDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating HolidayInventoryDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public HolidayInventoryDefinition createHolidayInventoryDefinition(final Map attributeValues)
	{
		return createHolidayInventoryDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public HolidayInventoryDetail createHolidayInventoryDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayinventorycoreConstants.TC.HOLIDAYINVENTORYDETAIL );
			return (HolidayInventoryDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating HolidayInventoryDetail : "+e.getMessage(), 0 );
		}
	}
	
	public HolidayInventoryDetail createHolidayInventoryDetail(final Map attributeValues)
	{
		return createHolidayInventoryDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public HolidayInventoryRequest createHolidayInventoryRequest(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayinventorycoreConstants.TC.HOLIDAYINVENTORYREQUEST );
			return (HolidayInventoryRequest)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating HolidayInventoryRequest : "+e.getMessage(), 0 );
		}
	}
	
	public HolidayInventoryRequest createHolidayInventoryRequest(final Map attributeValues)
	{
		return createHolidayInventoryRequest( getSession().getSessionContext(), attributeValues );
	}
	
	public HolidayInvSupplierAdvanceDefinition createHolidayInvSupplierAdvanceDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayinventorycoreConstants.TC.HOLIDAYINVSUPPLIERADVANCEDEFINITION );
			return (HolidayInvSupplierAdvanceDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating HolidayInvSupplierAdvanceDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public HolidayInvSupplierAdvanceDefinition createHolidayInvSupplierAdvanceDefinition(final Map attributeValues)
	{
		return createHolidayInvSupplierAdvanceDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public HolidayPaxRoomInvDetail createHolidayPaxRoomInvDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayinventorycoreConstants.TC.HOLIDAYPAXROOMINVDETAIL );
			return (HolidayPaxRoomInvDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating HolidayPaxRoomInvDetail : "+e.getMessage(), 0 );
		}
	}
	
	public HolidayPaxRoomInvDetail createHolidayPaxRoomInvDetail(final Map attributeValues)
	{
		return createHolidayPaxRoomInvDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public HolidayPenaltyCharges createHolidayPenaltyCharges(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayinventorycoreConstants.TC.HOLIDAYPENALTYCHARGES );
			return (HolidayPenaltyCharges)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating HolidayPenaltyCharges : "+e.getMessage(), 0 );
		}
	}
	
	public HolidayPenaltyCharges createHolidayPenaltyCharges(final Map attributeValues)
	{
		return createHolidayPenaltyCharges( getSession().getSessionContext(), attributeValues );
	}
	
	public HolidayRoomInfo createHolidayRoomInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayinventorycoreConstants.TC.HOLIDAYROOMINFO );
			return (HolidayRoomInfo)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating HolidayRoomInfo : "+e.getMessage(), 0 );
		}
	}
	
	public HolidayRoomInfo createHolidayRoomInfo(final Map attributeValues)
	{
		return createHolidayRoomInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public HolidayRoomTypeInvDetail createHolidayRoomTypeInvDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayinventorycoreConstants.TC.HOLIDAYROOMTYPEINVDETAIL );
			return (HolidayRoomTypeInvDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating HolidayRoomTypeInvDetail : "+e.getMessage(), 0 );
		}
	}
	
	public HolidayRoomTypeInvDetail createHolidayRoomTypeInvDetail(final Map attributeValues)
	{
		return createHolidayRoomTypeInvDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public PackageInclusionInfo createPackageInclusionInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayinventorycoreConstants.TC.PACKAGEINCLUSIONINFO );
			return (PackageInclusionInfo)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PackageInclusionInfo : "+e.getMessage(), 0 );
		}
	}
	
	public PackageInclusionInfo createPackageInclusionInfo(final Map attributeValues)
	{
		return createPackageInclusionInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public SpecificTravelDatesHolidayInvDetails createSpecificTravelDatesHolidayInvDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayinventorycoreConstants.TC.SPECIFICTRAVELDATESHOLIDAYINVDETAILS );
			return (SpecificTravelDatesHolidayInvDetails)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SpecificTravelDatesHolidayInvDetails : "+e.getMessage(), 0 );
		}
	}
	
	public SpecificTravelDatesHolidayInvDetails createSpecificTravelDatesHolidayInvDetails(final Map attributeValues)
	{
		return createSpecificTravelDatesHolidayInvDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public TravelRangeHolidayInvDetails createTravelRangeHolidayInvDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HolidayinventorycoreConstants.TC.TRAVELRANGEHOLIDAYINVDETAILS );
			return (TravelRangeHolidayInvDetails)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TravelRangeHolidayInvDetails : "+e.getMessage(), 0 );
		}
	}
	
	public TravelRangeHolidayInvDetails createTravelRangeHolidayInvDetails(final Map attributeValues)
	{
		return createTravelRangeHolidayInvDetails( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return HolidayinventorycoreConstants.EXTENSIONNAME;
	}
	
}
