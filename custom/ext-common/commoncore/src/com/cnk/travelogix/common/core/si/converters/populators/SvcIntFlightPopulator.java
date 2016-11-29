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

import org.apache.commons.collections.CollectionUtils;

import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntAirlineCompany;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntCabinClass;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlight;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlightGeneral;
import com.cnk.travelogix.suppliers.air.data.ArrivalAirport;
import com.cnk.travelogix.suppliers.air.data.DepartureAirport;
import com.cnk.travelogix.suppliers.air.data.FlightSegment;
import com.cnk.travelogix.suppliers.air.data.MarketingCabinType;
import com.cnk.travelogix.suppliers.air.data.OperatingAirline;
import com.cnk.travelogix.suppliers.common.data.TPAExtensions;


/**
 * @author i317604
 *
 */
public class SvcIntFlightPopulator implements Populator<FlightSegment, SvcIntFlight>
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final FlightSegment source, final SvcIntFlight target) throws ConversionException
	{
		target.setFlightGeneral(createSvcIntFlightGeneral(source));
		
		// TODO_SVTINT (Start)
		// target.setOfferList(offerList);
		// target.setBookingPolicyList(bookingPolicyList);
		// We just can get stop location and stop quantity from FlightSegment.
		// target.setStopList(stopList);
		// target.setFareList(fareList);
		// TODO_SVTINT (End)
		
	}

	private SvcIntFlightGeneral createSvcIntFlightGeneral(final FlightSegment source)
	{
		final SvcIntFlightGeneral svcIntFlightGeneral = new SvcIntFlightGeneral();

		final DepartureAirport departureAirport = source.getDepartureAirport();
		if (departureAirport != null)
		{
			// TODO_SVTINT (Start)
			//	svcIntFlightGeneral.setStartingFrom(departureAirport.getTerminal());
			svcIntFlightGeneral.setStartingFromCode(departureAirport.getLocationCode());
			//	svcIntFlightGeneral.setDepartureAirport(departureAirport.getAirport());
			// TODO_SVTINT (End)
			svcIntFlightGeneral.setDepartureTerminal(departureAirport.getTerminal());
			svcIntFlightGeneral.setDepartureDateTime(source.getDepartureDateTime());
		}

		final ArrivalAirport arrivalAirport = source.getArrivalAirport();
		if (arrivalAirport != null)
		{
			// TODO_SVTINT (Start)
			//	svcIntFlightGeneral.setGoingTo(arrivalAirport.getTerminal());
			svcIntFlightGeneral.setGoingToCode(arrivalAirport.getLocationCode());
			//	svcIntFlightGeneral.setArrivalAirport(arrivalAirport.getAirport());
			// TODO_SVTINT (End)
			svcIntFlightGeneral.setArrivalTerminal(arrivalAirport.getTerminal());
			svcIntFlightGeneral.setArrivalDateTime(source.getArrivalDateTime());
		}

		svcIntFlightGeneral.setDuration(calculateDuration(source.getDepartureDateTime(), source.getArrivalDateTime()));

		// TODO_SVTINT: Two flight number?
		final OperatingAirline operatingAirline = source.getOperatingAirline();
		if (operatingAirline != null)
		{
			svcIntFlightGeneral.setAirlineCompany(createSvcIntAirlineCompany(operatingAirline.getFlightNumber()));
			svcIntFlightGeneral.setFlightNumber(operatingAirline.getFlightNumber());
		}

		svcIntFlightGeneral.setCabinClassList(createSvcIntCabinClassList(source.getMarketingCabin()));
		
		// TODO_SVTINT (Start)
		// TPAExtensions does not contain a field for avaibale count.
		// <tns:TPA_Extensions>
		// <n2:ExtendedRPH>6E~ 372~ ~~HYD~09/25/2016
		// 	05:40~AMD~09/25/2016 07:15~^6E~ 238~ ~~AMD~09/25/2016
		// 	09:55~BLR~09/25/2016 13:45~MAA</n2:ExtendedRPH>
		// <n2:AvailableCount>58</n2:AvailableCount>
		// </tns:TPA_Extensions>
		// final TPAExtensions tpaExtensions = source.getTpaExtensions();
		// if (tpaExtensions != null)
		// {
			// svcIntFlightGeneral.setAvailableSeats(tpaExtensions.get);
		// }
		// svcIntFlightGeneral.setAircraftType(aircraftType);
		// TODO_SVTINT(End)

		return svcIntFlightGeneral;
	}

	private Duration calculateDuration(final Date departureDateTime, final Date arrivalDateTime)
	{
		if (departureDateTime != null && arrivalDateTime != null)
		{
			return Duration.between(departureDateTime.toInstant(), arrivalDateTime.toInstant());
		}

		return null;
	}

	private SvcIntAirlineCompany createSvcIntAirlineCompany(final String flightNumber)
	{
		if (flightNumber != null)
		{
			final SvcIntAirlineCompany svcIntAirlineCompany = new SvcIntAirlineCompany();
			svcIntAirlineCompany.setFlightNumber(flightNumber);
			return svcIntAirlineCompany;
		}

		return null;
	}

	private List<SvcIntCabinClass> createSvcIntCabinClassList(final List<MarketingCabinType> marketingCabin)
	{
		if (CollectionUtils.isNotEmpty(marketingCabin))
		{
			final List<SvcIntCabinClass> SvcIntCabinClassList = new ArrayList<SvcIntCabinClass>();

			marketingCabin.forEach(marketingCabinType -> {
				final SvcIntCabinClass svcIntCabinClass = new SvcIntCabinClass();
				// TODO_SVTINT (Start)
				// svcIntCabinClass.setCode(code);
				// svcIntCabinClass.setDescription(description);
				// svcIntCabinClass.setIndex(index);
				// TODO_SVTINT (End)
					svcIntCabinClass.setName(marketingCabinType.getName());
					SvcIntCabinClassList.add(svcIntCabinClass);
				});

			return SvcIntCabinClassList;
		}

		return null;
	}

}
