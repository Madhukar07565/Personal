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
package com.cnk.travelogix.common.facades.order.populators.flight;

import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.common.core.cart.data.FlightGroupOrderEntryInfoData;
import com.cnk.travelogix.common.core.cart.data.FlightOrderEntryInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderEntryInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderFlightDetailInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderFlightGroupDetailInfoData;
import com.cnk.travelogix.common.core.cart.data.PriceInfoData;
import com.cnk.travelogix.common.core.cart.data.TicketOrderEntryInfoData;
import com.cnk.travelogix.common.core.enums.OrderEntryTypeEnum;
import com.cnk.travelogix.common.core.enums.PassengerType;



/**
 *
 */
public class GroupFlightOrderEntryPopulator implements Populator<List<OrderEntryData>, List<OrderEntryData>>
{
	private static final Logger LOG = Logger.getLogger(GroupFlightOrderEntryPopulator.class);

	@Override
	public void populate(final List<OrderEntryData> source, final List<OrderEntryData> target) throws ConversionException
	{
		if (CollectionUtils.isNotEmpty(source))
		{

			// Group by group ID.
			final Map<String, List<OrderEntryData>> groupedOrderEntryDataMap = source.stream().collect(
					Collectors.groupingBy(new Function<OrderEntryData, String>()
					{

						@Override
						public String apply(final OrderEntryData orderEntryData)
						{
							return getGroupId(orderEntryData);
						}

					}));
			if (LOG.isDebugEnabled())
			{
				LOG.debug("Order entry data list after grouped by group ID:" + groupedOrderEntryDataMap);
			}
			
			groupedOrderEntryDataMap.forEach((groupId, orderEntryDataList) -> {
				final OrderEntryData groupedFlightGroupOrderEntryData = orderEntryDataList.get(0);
				
				OrderEntryData groupedFlightOrderEntryData = groupedFlightGroupOrderEntryData.getEntries().get(0);
				String groupedSequence = getSequence(groupedFlightOrderEntryData);
				
				populateFlight(groupedFlightOrderEntryData, groupedFlightOrderEntryData);
				populateFlightGroup(groupedFlightGroupOrderEntryData, groupedFlightOrderEntryData, parameters -> {
					populateFlightPathList(parameters.getFlightGroupDetailInfoData(), parameters.getFlightDetailInfoData());
					populateNumber(parameters.getFlightGroupDetailInfoData(), parameters.getFlightOrderEntryData());
				});

				final AtomicBoolean isFlightChanged = new AtomicBoolean(false);
				for (int index = 1; index < orderEntryDataList.size(); index++)
				{
					final OrderEntryData flightOrderEntryData = orderEntryDataList.get(index).getEntries().get(0);
					final String sequence = getSequence(flightOrderEntryData);
					
					if (LOG.isDebugEnabled())
					{
						LOG.debug(String.format("The grouped sequence is [%s], the current sequence is [%s].", groupedSequence,
								sequence));
					}

					if (StringUtils.equals(groupedSequence, sequence))
					{
						populateFlightGroup(groupedFlightGroupOrderEntryData, flightOrderEntryData, parameters -> {
							if (isFlightChanged.get() == false)
							{
								populateNumber(parameters.getFlightGroupDetailInfoData(), parameters.getFlightOrderEntryData());
							}
						});
						groupedFlightOrderEntryData.getEntries().addAll(flightOrderEntryData.getEntries());
					}
					else
					{
						isFlightChanged.getAndSet(true);
						populateFlightGroup(groupedFlightGroupOrderEntryData, flightOrderEntryData, parameters -> {
							populateFlightPathList(parameters.getFlightGroupDetailInfoData(), parameters.getFlightDetailInfoData());
						});
						groupedFlightOrderEntryData = flightOrderEntryData;
						groupedSequence = sequence;
						groupedFlightGroupOrderEntryData.getEntries().add(flightOrderEntryData);
					}
					
					populateFlight(groupedFlightOrderEntryData, flightOrderEntryData);
				}
				
				target.add(groupedFlightGroupOrderEntryData);
			});
		}
	}

	/**
	 * Get group ID from flight group order entry data.
	 */
	private String getGroupId(final OrderEntryData flightGroupOrderEntryData)
	{
		final FlightGroupOrderEntryInfoData flightGroupOrderEntryInfoData = getFlightGroupOrderEntryInfoData(flightGroupOrderEntryData);
		
		return flightGroupOrderEntryInfoData != null ? flightGroupOrderEntryInfoData.getGroupId() : null;
	}

	/**
	 * Get sequence from flight order entry data.
	 */
	private String getSequence(final OrderEntryData flightOrderEntryData)
	{
		
		final FlightOrderEntryInfoData flightOrderEntryInfoData = getFlightOrderEntryInfoData(flightOrderEntryData);
		
		return flightOrderEntryInfoData != null ? flightOrderEntryInfoData.getSequence() : null;
	}

	/**
	 * Populate flight group using the given flight.
	 */
	private void populateFlightGroup(final OrderEntryData flightGroupOrderEntryData, final OrderEntryData flightOrderEntryData, final Consumer<PopulateParameter> consumer)
	{
		final FlightGroupOrderEntryInfoData flightGroupOrderEntryInfoData = getFlightGroupOrderEntryInfoData(flightGroupOrderEntryData);
		if (flightGroupOrderEntryInfoData != null)
		{
			final OrderFlightGroupDetailInfoData flightGroupDetailInfoData = flightGroupOrderEntryInfoData.getFlightGroupDetailInfoData();

			final FlightOrderEntryInfoData flightOrderEntryInfoData = getFlightOrderEntryInfoData(flightOrderEntryData);
			if (flightOrderEntryInfoData != null)
			{
				final OrderFlightDetailInfoData flightDetailInfoData = flightOrderEntryInfoData.getFlightDetailInfoData();
				
				consumer.accept(new PopulateParameter(flightGroupDetailInfoData, flightDetailInfoData, flightOrderEntryData));
				
				// Populate departure/arrival time.
				if (flightGroupDetailInfoData.getDepartureTime() == null)
				{
					flightGroupDetailInfoData.setDepartureTime(flightDetailInfoData.getCommonFlightInfoData().getDepartureTime());
				}
				flightGroupDetailInfoData.setArrivalTime(flightDetailInfoData.getCommonFlightInfoData().getArrivalTime());
			}
		}
	}
	
	/**
	 * Populate flight info.
	 */
	private void populateFlight(final OrderEntryData groupedFlightOrderEntryData, final OrderEntryData flightOrderEntryData)
	{
		final List<OrderEntryData> ticketOrderentryDataList = flightOrderEntryData.getEntries();
		if (CollectionUtils.isNotEmpty(ticketOrderentryDataList))
		{
			final FlightOrderEntryInfoData flightOrderEntryInfoData = getFlightOrderEntryInfoData(groupedFlightOrderEntryData);
			final PriceInfoData totalPriceInfoData = flightOrderEntryInfoData.getFlightDetailInfoData().getPriceInfo();
			if (totalPriceInfoData == null)
			{
				flightOrderEntryInfoData.getFlightDetailInfoData().setPriceInfo(new PriceInfoData());
			}
			BigDecimal totalPrice= new BigDecimal(totalPriceInfoData == null ? 0 : totalPriceInfoData.getCostPrice());
			
			for (final OrderEntryData ticketOrderEntryData : ticketOrderentryDataList)
			{
				final TicketOrderEntryInfoData ticketOrderEntryInfoData = getTicketOrderEntryInfoData(ticketOrderEntryData);

				if (ticketOrderEntryInfoData != null)
				{
					final PriceInfoData priceInfo = ticketOrderEntryInfoData.getTicketDetailInfoData().getPriceInfo();
					totalPrice = totalPrice.add(new BigDecimal(priceInfo.getCostPrice()));
				}
			}
			
			flightOrderEntryInfoData.getFlightDetailInfoData().getPriceInfo().setCostPrice((totalPrice.doubleValue()));
		}
	}
	
	/**
	 * Get int from string value.
	 */
	private int getIntFromString(final String numberInString, final int defaultValue)
	{
		int number = defaultValue;

		if (StringUtils.isNotBlank(numberInString))
		{
			try
			{
				number = Integer.parseInt(numberInString);
			}
			catch (final Exception e)
			{
				LOG.error(String.format("Error during parsing [%s] to int", numberInString));
			}
		}

		return number;
	}
	
	/**
	 * Get flight group order entry info data from the given order entry data.
	 */
	private FlightGroupOrderEntryInfoData getFlightGroupOrderEntryInfoData(final OrderEntryData flightGroupOrderEntryData)
	{
		FlightGroupOrderEntryInfoData flightGroupOrderEntryInfoData = null;
		
		final OrderEntryInfoData orderEntryInfoData = flightGroupOrderEntryData.getOrderEntryInfoData();

		if (OrderEntryTypeEnum.FLIGHT_GROUP == flightGroupOrderEntryData.getOrderEntryType()
				&& orderEntryInfoData instanceof FlightGroupOrderEntryInfoData)
		{
			flightGroupOrderEntryInfoData = (FlightGroupOrderEntryInfoData) orderEntryInfoData;
		}
		else
		{
			LOG.error("Please assign a valid flight group order entry data.");
		}
		
		return flightGroupOrderEntryInfoData;
	}
	
	/**
	 * Get flight order entry info data from the given order entry data.
	 */
	private FlightOrderEntryInfoData getFlightOrderEntryInfoData(final OrderEntryData flightOrderEntryData)
	{
		FlightOrderEntryInfoData flightOrderEntryInfoData = null;

		final OrderEntryInfoData orderEntryInfoData = flightOrderEntryData.getOrderEntryInfoData();

		if (OrderEntryTypeEnum.FLIGHT == flightOrderEntryData.getOrderEntryType()
				&& orderEntryInfoData instanceof FlightOrderEntryInfoData)
		{
			flightOrderEntryInfoData = (FlightOrderEntryInfoData) orderEntryInfoData;
		}
		else
		{
			LOG.error("Please assign a valid flight order entry data.");
		}

		return flightOrderEntryInfoData;
	}
	
	/**
	 * Get ticket order entry info data from the given order entry data.
	 */
	private TicketOrderEntryInfoData getTicketOrderEntryInfoData(final OrderEntryData ticketOrderEntryData)
	{
		TicketOrderEntryInfoData ticketOrderEntryInfoData = null;
		
		final OrderEntryInfoData orderEntryInfoData = ticketOrderEntryData.getOrderEntryInfoData();
		
		if (OrderEntryTypeEnum.FLIGHT_TICKET == ticketOrderEntryData.getOrderEntryType()
				&& orderEntryInfoData instanceof TicketOrderEntryInfoData)
		{
			ticketOrderEntryInfoData = (TicketOrderEntryInfoData) orderEntryInfoData;
		}
		else
		{
			LOG.error("Please assign a valid ticket order entry data.");
		}
		
		return ticketOrderEntryInfoData;
	}
	
	/**
	 * Populate flight group info using the given flight info.
	 */
	private void populateFlightPathList(final OrderFlightGroupDetailInfoData flightGroupDetailInfoData, final OrderFlightDetailInfoData flightDetailInfoData)
	{
		final List<String> flightPathList = flightGroupDetailInfoData.getFlightPathList();
		if (CollectionUtils.isEmpty(flightPathList))
		{
			final List<String> tempFlightPathList = new ArrayList<String>();
			tempFlightPathList.add(flightDetailInfoData.getCommonFlightInfoData().getFromCity());
			tempFlightPathList.add("-");
			tempFlightPathList.add(flightDetailInfoData.getCommonFlightInfoData().getToCity());
			flightGroupDetailInfoData.setFlightPathList(tempFlightPathList);
		}
		else
		{
			final String lastToCity = flightPathList.get(flightPathList.size() - 1);
			
			final String currentFromCity = flightDetailInfoData.getCommonFlightInfoData().getFromCity();
			final String currentToCity = flightDetailInfoData.getCommonFlightInfoData().getToCity();
			
			if (StringUtils.equals(lastToCity, currentFromCity))
			{
				flightPathList.add("-");
				flightPathList.add(currentToCity);
			}
			else
			{
				flightPathList.add(",");
				flightPathList.add(currentFromCity);
				flightPathList.add("-");
				flightPathList.add(currentToCity);
			}
			
		}
	}
	
	/**
	 * Populate flight group info using the given flight info.
	 */
	private void populateNumber(final OrderFlightGroupDetailInfoData flightGroupDetailInfoData, final OrderEntryData flightOrderEntryData)
	{
		int numberOfAdult = getIntFromString(flightGroupDetailInfoData.getNumberOfAdult(), 0);
		int numberOfChild = getIntFromString(flightGroupDetailInfoData.getNumberOfChild(), 0);
		for (final OrderEntryData ticketOrderEntryData : flightOrderEntryData.getEntries())
		{
			final TicketOrderEntryInfoData ticketOrderEntryInfoData = getTicketOrderEntryInfoData(ticketOrderEntryData);
			if (ticketOrderEntryInfoData != null)
			{
				final PassengerType passengerType = ticketOrderEntryInfoData.getTicketDetailInfoData().getPassengerType();
				if (PassengerType.ADULT.equals(passengerType))
				{
					numberOfAdult++;
				}
				else if (PassengerType.CHILD.equals(passengerType) || PassengerType.INFANT.equals(passengerType))
				{
					numberOfChild++;
				}
			}
		}
		flightGroupDetailInfoData.setNumberOfAdult("" + numberOfAdult);
		flightGroupDetailInfoData.setNumberOfChild("" + numberOfChild);
	}
	
	class PopulateParameter
	{
		private OrderFlightGroupDetailInfoData flightGroupDetailInfoData;
		private OrderFlightDetailInfoData flightDetailInfoData;
		private OrderEntryData flightOrderEntryData;
		
		public PopulateParameter(OrderFlightGroupDetailInfoData flightGroupDetailInfoData, OrderFlightDetailInfoData flightDetailInfoData, OrderEntryData flightOrderEntryData)
		{
			this.flightGroupDetailInfoData = flightGroupDetailInfoData;
			this.flightDetailInfoData = flightDetailInfoData;
			this.flightOrderEntryData = flightOrderEntryData;
		}
		/**
		 * @return the flightGroupDetailInfoData
		 */
		public OrderFlightGroupDetailInfoData getFlightGroupDetailInfoData()
		{
			return flightGroupDetailInfoData;
		}
		/**
		 * @param flightGroupDetailInfoData the flightGroupDetailInfoData to set
		 */
		public void setFlightGroupDetailInfoData(OrderFlightGroupDetailInfoData flightGroupDetailInfoData)
		{
			this.flightGroupDetailInfoData = flightGroupDetailInfoData;
		}
		/**
		 * @return the flightDetailInfoData
		 */
		public OrderFlightDetailInfoData getFlightDetailInfoData()
		{
			return flightDetailInfoData;
		}
		/**
		 * @param flightDetailInfoData the flightDetailInfoData to set
		 */
		public void setFlightDetailInfoData(OrderFlightDetailInfoData flightDetailInfoData)
		{
			this.flightDetailInfoData = flightDetailInfoData;
		}
		/**
		 * @return the flightOrderEntryData
		 */
		public OrderEntryData getFlightOrderEntryData()
		{
			return flightOrderEntryData;
		}
		/**
		 * @param flightOrderEntryData the flightOrderEntryData to set
		 */
		public void setFlightOrderEntryData(OrderEntryData flightOrderEntryData)
		{
			this.flightOrderEntryData = flightOrderEntryData;
		}
	}
	
}
