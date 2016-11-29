/**
 *
 */
package com.cnk.travelogix.common.facades.product.sort.impl;

import java.util.ArrayList;
import java.util.List;


/**
 * @author i313879
 *
 */
public class FlightSortedToModelMapper extends SortedToModelMapper
{

	@Override
	protected List<SortedToModelEntry> buildMockupEntries()
	{
		final List<SortedToModelEntry> entrys = new ArrayList();
		entrys.add(createEntry("Departure", "Departure", "flightDepartureValueProvider"));
		entrys.add(createEntry("Duration", "Duration", "flightDurationValueProvider"));
		entrys.add(createEntry("Arrival", "Arrival", "flightArrivalValueProvider"));
		entrys.add(createEntry("Price", "Price", "flightPriceValueProvider"));
		return entrys;
	}

	private SortedToModelEntry createEntry(final String code, final String name, final String providerName)
	{
		final SortedToModelEntry entry = new SortedToModelEntry();
		entry.setCode(code);
		entry.setName(name);
		entry.setDesc(false);
		entry.setSortedValueProvider(getProviderByName(providerName));
		return entry;
	}
}
