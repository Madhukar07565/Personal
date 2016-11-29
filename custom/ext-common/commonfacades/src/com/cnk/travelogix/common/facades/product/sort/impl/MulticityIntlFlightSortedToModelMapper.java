/**
 *
 */
package com.cnk.travelogix.common.facades.product.sort.impl;

import java.util.ArrayList;
import java.util.List;


/**
 * @author i323616
 *
 */
public class MulticityIntlFlightSortedToModelMapper extends SortedToModelMapper
{
	@Override
	protected List<SortedToModelEntry> buildMockupEntries()
	{
		final List<SortedToModelEntry> entrys = new ArrayList();
		entrys.add(createEntry("Departure", "Departure", "multicityIntlFlightDepartureValueProvider"));
		entrys.add(createEntry("Duration", "Duration", "multicityIntlFlightDurationValueProvider"));
		entrys.add(createEntry("Arrival", "Arrival", "multicityIntlFlightArrivalValueProvider"));
		entrys.add(createEntry("Price", "Price", "multicityIntlFlightPriceValueProvider"));
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
