/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.cnk.travelogix.sapintegrations.converters.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;

import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZifProdCatAccommodation;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZifProdCatActivities;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZifProdCatAircraft;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZifProdCatBus;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZifProdCatCruise;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZifProdCatFlights;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZifProdCatForex;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZifProdCatHolidays;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZifProdCatInsurance;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZifProdCatMotorBike;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZifProdCatRail;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZifProdCatVehSelfDrive;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZifProdCatVehicleRental;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZifProdCatVehicleTransfer;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZifProdCatVisa;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZifProdRvSbTuktukLimousin;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZifTerpOppHeader;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZifTerpOppItemData;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZifTerpOppPartner;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZifTerpOpportunity;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZttTerpOppItemData;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZttTerpOppPartner;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatAccommodationData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatActivitiesData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatAircraftData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatBusData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatCruiseData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatFlightsData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatForexData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatHolidaysData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatInsuranceData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatMotorBikeData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatRailData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatVehSelfDriveData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatVehicleRentalData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatVehicleTransferData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatVisaData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdRvSbTuktukLimousinData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifTerpOppHeaderData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifTerpOppItemDataData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifTerpOppPartnerData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifTerpOpportunityDataRequest;


/**
 *
 */
public class DefaultOpportunityRequestDataPopulator implements Populator<ZifTerpOpportunityDataRequest, ZifTerpOpportunity>
{
	private final Logger LOG = Logger.getLogger(getClass());

	@Override
	public void populate(final ZifTerpOpportunityDataRequest source, final ZifTerpOpportunity target) throws ConversionException
	{
		try
		{
			populateHeader(source, target);
			populateOppItem(source, target);
			populateOppPartner(source, target);
			populateProdCatAccommodation(source, target);
			populateProdCatActivities(source, target);
			populateProdCatAircraft(source, target);
			populateProdCatBus(source, target);
			populateProdCatCruise(source, target);
			populateProdCatFlights(source, target);
			populateProdCatForex(source, target);
			populateProdCatHolidays(source, target);
			populateProdCatInsurance(source, target);

			if (null != source.getProdCatMotorBike())
			{
				final ZifProdCatMotorBikeData zifProdCatMotorBikeData = source.getProdCatMotorBike();
				final ZifProdCatMotorBike zifProdCatMotorBike = new ZifProdCatMotorBike();
				BeanUtils.copyProperties(zifProdCatMotorBikeData, zifProdCatMotorBike);
				target.setProdCatMotorBike(zifProdCatMotorBike);
			}

			if (null != source.getProdCatRail())
			{
				final ZifProdCatRailData zifProdCatRailData = source.getProdCatRail();
				final ZifProdCatRail zifProdCatRail = new ZifProdCatRail();
				BeanUtils.copyProperties(zifProdCatRailData, zifProdCatRail);
				zifProdCatRail.setPreferredTime(zifProdCatRailData.getPreferredTime());
				target.setProdCatRail(zifProdCatRail);
			}

			if (null != source.getProdCatRvSbTuktukLimousin())
			{
				final ZifProdRvSbTuktukLimousinData zifProdRvSbTuktukLimousinData = source.getProdCatRvSbTuktukLimousin();
				final ZifProdRvSbTuktukLimousin zifProdRvSbTuktukLimousin = new ZifProdRvSbTuktukLimousin();
				BeanUtils.copyProperties(zifProdRvSbTuktukLimousinData, zifProdRvSbTuktukLimousin);
				zifProdRvSbTuktukLimousin.setDropOffTime(zifProdRvSbTuktukLimousinData.getDropOffTime());
				zifProdRvSbTuktukLimousin.setPickUpTime(zifProdRvSbTuktukLimousinData.getPickUpTime());
				target.setProdCatRvSbTuktukLimousin(zifProdRvSbTuktukLimousin);
			}

			if (null != source.getProdCatVehicleRental())
			{
				final ZifProdCatVehicleRentalData zifProdCatVehicleRentalData = source.getProdCatVehicleRental();
				final ZifProdCatVehicleRental zifProdCatVehicleRental = new ZifProdCatVehicleRental();
				BeanUtils.copyProperties(zifProdCatVehicleRentalData, zifProdCatVehicleRental);
				zifProdCatVehicleRental.setPickUpTime(zifProdCatVehicleRentalData.getPickUpTime());
				zifProdCatVehicleRental.setDropOffTime(zifProdCatVehicleRentalData.getDropOffTime());
				target.setProdCatVehicleRental(zifProdCatVehicleRental);
			}

			if (null != source.getProdCatVehicleSelfDrive())
			{
				final ZifProdCatVehSelfDriveData zifProdCatVehSelfDriveData = source.getProdCatVehicleSelfDrive();
				final ZifProdCatVehSelfDrive zifProdCatVehSelfDrive = new ZifProdCatVehSelfDrive();
				BeanUtils.copyProperties(zifProdCatVehSelfDriveData, zifProdCatVehSelfDrive);
				zifProdCatVehSelfDrive.setDropOffTime(zifProdCatVehSelfDriveData.getDropOffTime());
				zifProdCatVehSelfDrive.setPickUpTime(zifProdCatVehSelfDriveData.getPickUpTime());
				target.setProdCatVehicleSelfDrive(zifProdCatVehSelfDrive);
			}

			if (null != source.getProdCatVehicleTransfer())
			{
				final ZifProdCatVehicleTransferData zifProdCatVehicleTransferData = source.getProdCatVehicleTransfer();
				final ZifProdCatVehicleTransfer zifProdCatVehicleTransfer = new ZifProdCatVehicleTransfer();
				BeanUtils.copyProperties(zifProdCatVehicleTransferData, zifProdCatVehicleTransfer);
				zifProdCatVehicleTransfer.setDropOffTime(zifProdCatVehicleTransferData.getDropOffTime());
				zifProdCatVehicleTransfer.setPickUpTime(zifProdCatVehicleTransferData.getPickUpTime());
				target.setProdCatVehicleTransfer(zifProdCatVehicleTransfer);
			}

			if (null != source.getProdCatVisa())
			{
				final ZifProdCatVisaData zifProdCatVisaData = source.getProdCatVisa();
				final ZifProdCatVisa zifProdCatVisa = new ZifProdCatVisa();
				BeanUtils.copyProperties(zifProdCatVisaData, zifProdCatVisa);
				target.setProdCatVisa(zifProdCatVisa);
			}
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
	}

	public void populateHeader(final ZifTerpOpportunityDataRequest source, final ZifTerpOpportunity target)
	{
		if (source.getOppHeader() != null)
		{
			final ZifTerpOppHeaderData ZifTerpOppHeaderData = source.getOppHeader();
			final ZifTerpOppHeader oppHeader = new ZifTerpOppHeader();
			BeanUtils.copyProperties(ZifTerpOppHeaderData, oppHeader);
			oppHeader.setContactTime(ZifTerpOppHeaderData.getContactTime());
			target.setOppHeader(oppHeader);
		}
	}

	public void populateOppItem(final ZifTerpOpportunityDataRequest source, final ZifTerpOpportunity target)
	{
		if (source.getOppItem() != null)
		{
			final ZttTerpOppItemData zttTerpOppItemData = new ZttTerpOppItemData();
			final List<ZifTerpOppItemDataData> zifTerpOppItemDataDatalist = source.getOppItem().getItem();
			for (final ZifTerpOppItemDataData zifTerpOppItemDataData : zifTerpOppItemDataDatalist)
			{
				final ZifTerpOppItemData ZifTerpOppItemData = new ZifTerpOppItemData();
				BeanUtils.copyProperties(zifTerpOppItemDataData, ZifTerpOppItemData);
				zttTerpOppItemData.getItem().add(ZifTerpOppItemData);
			}
			target.setOppItem(zttTerpOppItemData);
		}
	}

	public void populateOppPartner(final ZifTerpOpportunityDataRequest source, final ZifTerpOpportunity target)
	{
		if (null != source.getOppPartner())
		{
			final ZttTerpOppPartner zttTerpOppPartner = new ZttTerpOppPartner();
			final List<ZifTerpOppPartnerData> zifTerpOppPartnerDataList = source.getOppPartner().getItem();
			for (final ZifTerpOppPartnerData zifTerpOppPartnerData : zifTerpOppPartnerDataList)
			{
				final ZifTerpOppPartner zifTerpOppPartner = new ZifTerpOppPartner();
				BeanUtils.copyProperties(zifTerpOppPartnerData, zifTerpOppPartner);
				zttTerpOppPartner.getItem().add(zifTerpOppPartner);
			}
			target.setOppPartner(zttTerpOppPartner);
		}
	}

	public void populateProdCatAccommodation(final ZifTerpOpportunityDataRequest source, final ZifTerpOpportunity target)
	{
		if (null != source.getProdCatAccommodation())
		{
			final ZifProdCatAccommodationData zifProdCatAccommodationData = source.getProdCatAccommodation();
			final ZifProdCatAccommodation zifProdCatAccommodation = new ZifProdCatAccommodation();
			BeanUtils.copyProperties(zifProdCatAccommodationData, zifProdCatAccommodation);
			target.setProdCatAccommodation(zifProdCatAccommodation);
		}
	}

	public void populateProdCatActivities(final ZifTerpOpportunityDataRequest source, final ZifTerpOpportunity target)
	{
		if (null != source.getProdCatActivities())
		{
			final ZifProdCatActivitiesData zifProdCatActivitiesData = source.getProdCatActivities();
			final ZifProdCatActivities zifProdCatActivities = new ZifProdCatActivities();
			BeanUtils.copyProperties(zifProdCatActivitiesData, zifProdCatActivities);
			target.setProdCatActivities(zifProdCatActivities);
		}
	}

	public void populateProdCatAircraft(final ZifTerpOpportunityDataRequest source, final ZifTerpOpportunity target)
	{
		if (null != source.getProdCatAircraft())
		{
			final ZifProdCatAircraftData zifProdCatAircraftData = source.getProdCatAircraft();
			final ZifProdCatAircraft zifProdCatAircraft = new ZifProdCatAircraft();
			zifProdCatAircraft.setDepartureDate(zifProdCatAircraftData.getDepartureDate());
			zifProdCatAircraft.setDepartureTime(zifProdCatAircraftData.getDepartureTime());
			zifProdCatAircraft.setNoOfPassangers(zifProdCatAircraftData.getNoOfPassangers());
			zifProdCatAircraft.setReturnDate(zifProdCatAircraftData.getReturnDate());
			zifProdCatAircraft.setReturnTime(zifProdCatAircraftData.getReturnTime());
			target.setProdCatAircraft(zifProdCatAircraft);
		}
	}

	public void populateProdCatBus(final ZifTerpOpportunityDataRequest source, final ZifTerpOpportunity target)
	{
		if (null != source.getProdCatBus())
		{
			final ZifProdCatBusData zifProdCatBusData = source.getProdCatBus();
			final ZifProdCatBus zifProdCatBus = new ZifProdCatBus();
			BeanUtils.copyProperties(zifProdCatBusData, zifProdCatBus);
			zifProdCatBus.setPreferredTime(zifProdCatBusData.getPreferredTime());
			target.setProdCatBus(zifProdCatBus);
		}
	}

	public void populateProdCatCruise(final ZifTerpOpportunityDataRequest source, final ZifTerpOpportunity target)
	{
		if (null != source.getProdCatCruise())
		{
			final ZifProdCatCruiseData zifProdCatCruiseData = source.getProdCatCruise();
			final ZifProdCatCruise zifProdCatCruise = new ZifProdCatCruise();
			BeanUtils.copyProperties(zifProdCatCruiseData, zifProdCatCruise);
			target.setProdCatCruise(zifProdCatCruise);
		}
	}

	public void populateProdCatFlights(final ZifTerpOpportunityDataRequest source, final ZifTerpOpportunity target)
	{
		if (null != source.getProdCatFlights())
		{
			final ZifProdCatFlightsData zifProdCatFlightsData = source.getProdCatFlights();
			final ZifProdCatFlights zifProdCatFlights = new ZifProdCatFlights();
			BeanUtils.copyProperties(zifProdCatFlightsData, zifProdCatFlights);
			target.setProdCatFlights(zifProdCatFlights);
		}
	}

	public void populateProdCatForex(final ZifTerpOpportunityDataRequest source, final ZifTerpOpportunity target)
	{
		if (null != source.getProdCatForex())
		{
			final ZifProdCatForexData ZifProdCatForexData = source.getProdCatForex();
			final ZifProdCatForex zifProdCatForex = new ZifProdCatForex();
			BeanUtils.copyProperties(ZifProdCatForexData, zifProdCatForex);
			target.setProdCatForex(zifProdCatForex);
		}
	}

	public void populateProdCatHolidays(final ZifTerpOpportunityDataRequest source, final ZifTerpOpportunity target)
	{
		if (null != source.getProdCatHolidays())
		{
			final ZifProdCatHolidaysData ZifProdCatHolidaysData = source.getProdCatHolidays();
			final ZifProdCatHolidays zifProdCatHolidays = new ZifProdCatHolidays();
			BeanUtils.copyProperties(ZifProdCatHolidaysData, zifProdCatHolidays);
			target.setProdCatHolidays(zifProdCatHolidays);
		}
	}

	public void populateProdCatInsurance(final ZifTerpOpportunityDataRequest source, final ZifTerpOpportunity target)
	{
		if (null != source.getProdCatInsurance())
		{
			final ZifProdCatInsuranceData zifProdCatInsuranceData = source.getProdCatInsurance();
			final ZifProdCatInsurance zifProdCatInsurance = new ZifProdCatInsurance();
			BeanUtils.copyProperties(zifProdCatInsuranceData, zifProdCatInsurance);
			target.setProdCatInsurance(zifProdCatInsurance);
		}
	}
}
