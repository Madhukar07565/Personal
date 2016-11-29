/**
 *
 */
package com.cnk.travelogix.common.core.si.converters.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntAirlineCompany;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntCabinClass;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlight;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlightGeneral;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntStopGeneral;
import com.cnk.travelogix.common.facades.product.data.flight.AirlineIATAData;
import com.cnk.travelogix.common.facades.product.data.flight.AirportData;
import com.cnk.travelogix.common.facades.product.data.flight.FlightData;


public class FlightGeneralPolulator implements Populator<SvcIntFlight, FlightData>
{
	private static final Logger LOG = Logger.getLogger(FlightGeneralPolulator.class);

	@Override
	public void populate(final SvcIntFlight source, final FlightData target) throws ConversionException
	{
		final SvcIntFlightGeneral flightGeneral = source.getFlightGeneral();
		if (null == flightGeneral)
		{
			LOG.error("The SvcIntFlight.getFlightGeneral() returns empty!");
			return;
		}

		target.setFlightNumber(flightGeneral.getFlightNumber());

		// TODO_SVTINT: Maybe we need to process all later, but currently we just need to process the first one.
		final List<String> cabinClassList = createCabinClassList(flightGeneral.getCabinClassList());
		if (CollectionUtils.isNotEmpty(cabinClassList))
		{
			target.setCabinClass(cabinClassList.get(0));
		}

		// TODO_SVTINT: Could you please review this part of code?
		final SvcIntAirlineCompany airlineCompany = flightGeneral.getAirlineCompany();
		if (null != airlineCompany)
		{
			AirlineIATAData airlineIATA = new AirlineIATAData();
			airlineIATA.setAirlineName(airlineCompany.getName());
			airlineIATA.setAccountingCode(airlineCompany.getCode());
			target.setAirlineIATA(airlineIATA);
		}

		// Departure time.
		// TODO_SVTINT: Not sure about the value of the displayXXX, should it be the same as XXX?
		final Date departureDateTime = flightGeneral.getDepartureDateTime();
		if (null != departureDateTime)
		{
			target.setDepartureTime(departureDateTime);
			target.setDisplayDepartureTime(departureDateTime.toString());
			target.setDisplayDepartureDate(departureDateTime.toString());
		}

		// Arrival time.
		// TODO_SVTINT: Not sure about the value of the displayXXX, should it be the same as XXX?
		final Date arrivalDateTime = flightGeneral.getArrivalDateTime();
		if (null != arrivalDateTime)
		{
			target.setArrivalTime(arrivalDateTime);
			target.setDisplayArrivalTime(arrivalDateTime.toString());
			target.setDisplayArrivalDate(arrivalDateTime.toString());
		}

		// Duration.
		// TODO_SVTINT: Not sure about the value of the displayXXX, should it be the same as XXX?
		final Duration duration = flightGeneral.getDuration();
		if (null != duration)
		{
			target.setDuration(duration.toString());
			target.setDisplayDuration(duration.toString());
		}

		// From section.
		AirportData fromSection = new AirportData();
		fromSection.setAirport(flightGeneral.getDepartureAirport());
		fromSection.setCity(flightGeneral.getStartingFrom());
		fromSection.setTerminal(flightGeneral.getDepartureTerminal());
		target.setFromSection(fromSection);

		// To section.
		AirportData toSection = new AirportData();
		toSection.setAirport(flightGeneral.getArrivalAirport());
		toSection.setCity(flightGeneral.getGoingTo());
		toSection.setTerminal(flightGeneral.getArrivalTerminal());
		target.setToSection(toSection);

		//target.getFlightDetails();
		//TODO_SVTINT:this cannot be done because there is not a layoverDuration in the flightGeneral.


		final String numberOfStopsAsString = numberOfStopsAsString(source.getStopList());
		if (StringUtils.isNotBlank(numberOfStopsAsString))
		{
			target.setNumberOfStops(numberOfStopsAsString);
			target.setDisplayNumberOfStops(numberOfStopsAsString);
		}
	}

	private List<String> createCabinClassList(final List<SvcIntCabinClass> svcIntCabinClassList)
	{
		if (CollectionUtils.isNotEmpty(svcIntCabinClassList))
		{
			final List<String> cabinClassList = new ArrayList<String>();
			svcIntCabinClassList.forEach(svcIntCabinClass -> {
				cabinClassList.add(svcIntCabinClass.getName());
			});
			return cabinClassList;
		}

		return null;
	}

	private String numberOfStopsAsString(final List<SvcIntStopGeneral> svcIntStopGeneralList)
	{
		if (CollectionUtils.isNotEmpty(svcIntStopGeneralList))
		{
			return "" + svcIntStopGeneralList.size();
		}
		return null;
	}

}
