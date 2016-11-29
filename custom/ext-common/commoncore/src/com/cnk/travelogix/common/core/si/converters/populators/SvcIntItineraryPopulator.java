/**
 * 
 */
package com.cnk.travelogix.common.core.si.converters.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntAirRSItinerary;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlight;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntOriginDestinationOption;
import com.cnk.travelogix.suppliers.air.data.AirItinerary;
import com.cnk.travelogix.suppliers.air.data.FlightSegment;
import com.cnk.travelogix.suppliers.air.data.OriginDestinationOption;
import com.cnk.travelogix.suppliers.air.data.PricedItinerary;


/**
 * @author i317604
 *
 */
public class SvcIntItineraryPopulator implements Populator<PricedItinerary, SvcIntAirRSItinerary>
{

	@Autowired(required = true)
	@Qualifier("svcIntFlightConverter")
	private Converter<FlightSegment, SvcIntFlight> svcIntFlightConverter;

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final PricedItinerary source, final SvcIntAirRSItinerary target) throws ConversionException
	{
		target.setOriginDestinationOptionList(createSvcIntOriginDestinationOptionList(source.getAirItinerary()));
	}

	private List<SvcIntOriginDestinationOption> createSvcIntOriginDestinationOptionList(final AirItinerary airItinerary)
	{
		if (airItinerary != null && CollectionUtils.isNotEmpty(airItinerary.getOriginDestinationOptions()))
		{
			final List<SvcIntOriginDestinationOption> svcIntOriginDestinationOptionList = new ArrayList<SvcIntOriginDestinationOption>();
			airItinerary
					.getOriginDestinationOptions()
					.forEach(
							originDestinationOption -> {
								final SvcIntOriginDestinationOption svcIntOriginDestinationOption = createSvcIntOriginDestinationOption(originDestinationOption);
								if (svcIntOriginDestinationOption != null)
								{
									svcIntOriginDestinationOptionList.add(svcIntOriginDestinationOption);
								}
							});
			return svcIntOriginDestinationOptionList;
		}

		return null;
	}

	private SvcIntOriginDestinationOption createSvcIntOriginDestinationOption(final OriginDestinationOption originDestinationOption)
	{
		if (originDestinationOption != null && CollectionUtils.isNotEmpty(originDestinationOption.getFlightSegments()))
		{
			final SvcIntOriginDestinationOption svcIntOriginDestinationOption = new SvcIntOriginDestinationOption();
			svcIntOriginDestinationOption.setFlightList(new ArrayList<SvcIntFlight>());

			Date departureDateTime = null;
			Date arrivalDateTime = null;

			final List<FlightSegment> flightSegmentList = originDestinationOption.getFlightSegments();
			for (int index = 0; index < flightSegmentList.size(); index++)
			{
				final FlightSegment flightSegment = flightSegmentList.get(index);
				if (flightSegment == null)
				{
					continue;
				}

				if (index == 0 && flightSegment.getDepartureAirport() != null)
				{
					svcIntOriginDestinationOption.setStartingFromCode(flightSegment.getDepartureAirport().getLocationCode());
					departureDateTime = flightSegment.getDepartureDateTime();
				}

				if (index == flightSegmentList.size() - 1 && flightSegment.getArrivalAirport() != null)
				{
					svcIntOriginDestinationOption.setGoingToCode(flightSegment.getArrivalAirport().getLocationCode());
					arrivalDateTime = flightSegment.getArrivalDateTime();
				}

				final SvcIntFlight svcIntFlight = svcIntFlightConverter.convert(flightSegment);
				if (svcIntFlight != null)
				{
					svcIntOriginDestinationOption.getFlightList().add(svcIntFlight);
				}
			}

			svcIntOriginDestinationOption.setDuration(calculateDuration(departureDateTime, arrivalDateTime));

			return svcIntOriginDestinationOption;
		}

		return null;
	}

	private Duration calculateDuration(final Date departureDateTime, final Date arrivalDateTime)
	{
		if (departureDateTime != null && arrivalDateTime != null)
		{
			return Duration.between(departureDateTime.toInstant(), arrivalDateTime.toInstant());
		}

		return null;
	}

}
