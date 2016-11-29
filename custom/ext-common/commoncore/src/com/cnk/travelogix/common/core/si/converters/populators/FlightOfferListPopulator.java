/**
 * 
 */
package com.cnk.travelogix.common.core.si.converters.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlight;
import com.cnk.travelogix.common.core.storefront.svcint.dto.general.SvcIntOptionItem;
import com.cnk.travelogix.common.facades.product.data.flight.FlightData;


public class FlightOfferListPopulator implements Populator<SvcIntFlight, FlightData>
{
	private static final Logger LOG = Logger.getLogger(FlightOfferListPopulator.class);

	@Override
	public void populate(final SvcIntFlight source, final FlightData target) throws ConversionException
	{
		final List<SvcIntOptionItem> offerList = source.getOfferList();
		if (CollectionUtils.isNotEmpty(offerList))
		{
			final List<String> serviceList = new ArrayList<String>();
			for (SvcIntOptionItem svcIntOptionItem : offerList)
			{
				//TODO_SVTINT:We assume the offerList.name in the source as the services in the target here.
				serviceList.add(svcIntOptionItem.getName());
			}
			target.setServices(serviceList);
		}
	}

}
