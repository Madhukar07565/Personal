/**
 * 
 */
package com.cnk.travelogix.common.core.si.converters.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlight;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlightFare;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlightFareBreakup;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlightFareSummary;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlightRefundPolicy;
import com.cnk.travelogix.common.facades.product.data.flight.FareDetailData;
import com.cnk.travelogix.common.facades.product.data.flight.FareSummaryData;
import com.cnk.travelogix.common.facades.product.data.flight.FlightData;


public class FlightFareListPopulator implements Populator<SvcIntFlight, FlightData>
{
	private static final Logger LOG = Logger.getLogger(FlightFareListPopulator.class);

	@Override
	public void populate(final SvcIntFlight source, final FlightData target) throws ConversionException
	{
		final List<SvcIntFlightFare> fareList = source.getFareList();
		if (CollectionUtils.isEmpty(fareList))
		{
			LOG.error("The SvcIntFlight.getFareList() returns empty!");
			return;
		}

		final List<FareSummaryData> fareSummaryDataList = new ArrayList<FareSummaryData>();
		final List<FareDetailData> fareDetailDataList = new ArrayList<FareDetailData>();
		Set<String> fareType = new HashSet<>();
		for (SvcIntFlightFare svcIntFlightFare : fareList)
		{
			if (null == svcIntFlightFare)
			{
				LOG.error("The FareSummaryData is empty!");
				return;
			}

			// FareSummaryData.
			final FareSummaryData fareSummaryData = createFareSummaryData(svcIntFlightFare);
			if (null != fareSummaryData)
			{
				fareSummaryDataList.add(fareSummaryData);
			}

			// FareDetailData.
			final FareDetailData fareDetailData = createFareDetailData(svcIntFlightFare);
			if (null != fareDetailData)
			{
				fareDetailDataList.add(fareDetailData);
			}

			fareType.add(svcIntFlightFare.getFareOptionName());
		}
		target.setFareSummary(fareSummaryDataList);
		target.setFareDetail(fareDetailDataList);
		// TODO_SVTINT: Not sure is it correct?
		target.setSelectdFareType(fareType.size());

	}
	
	private FareSummaryData createFareSummaryData(final SvcIntFlightFare svcIntFlightFare)
	{
		final SvcIntFlightFareSummary svcIntFlightFareSummary = svcIntFlightFare.getSummary();
		if (null != svcIntFlightFareSummary)
		{
			FareSummaryData fareSummaryData = new FareSummaryData();
			fareSummaryData.setType(svcIntFlightFare.getFareOptionName());
			if (null != svcIntFlightFare.getCurrency())
				fareSummaryData.setCurrency(svcIntFlightFare.getCurrency().toString());
			
			if (null != svcIntFlightFareSummary.getListPrice())
				fareSummaryData.setListPrice(svcIntFlightFareSummary.getListPrice().toString());
			if (null != svcIntFlightFareSummary.getWebPrice())
				fareSummaryData.setWebPrice(svcIntFlightFareSummary.getWebPrice().toString());
			if (null != svcIntFlightFareSummary.getPointsToEarn())
				fareSummaryData.setPointEarn(svcIntFlightFareSummary.getPointsToEarn().toString());
			
			return fareSummaryData;
		}
		
		return null;
	}
	
	private FareDetailData createFareDetailData(final SvcIntFlightFare svcIntFlightFare)
	{
		FareDetailData fareDetailData = new FareDetailData();
		fareDetailData.setType(svcIntFlightFare.getFareOptionName());
		if (null != svcIntFlightFare.getCurrency())
			fareDetailData.setCurrency(svcIntFlightFare.getCurrency().toString());
		
		final SvcIntFlightFareBreakup svcIntFlightFareBreakup = svcIntFlightFare.getBreakup();
		if (null != svcIntFlightFareBreakup)
		{
			if (null != svcIntFlightFareBreakup.getBaseFare())
			{
				fareDetailData.setBaseFare(svcIntFlightFareBreakup.getBaseFare().toString());
			}
			
			if (null != svcIntFlightFareBreakup.getFuelSurcharge())
			{
				fareDetailData.setFuelSurcharge(svcIntFlightFareBreakup.getFuelSurcharge().toString());
			}
			if (null != svcIntFlightFareBreakup.getJnTax())
			{
				fareDetailData.setJnTax(svcIntFlightFareBreakup.getJnTax().toString());
			}
			
			if (null != svcIntFlightFareBreakup.getPassagerServiceFee())
			{
				fareDetailData.setPsgrSvcFee(svcIntFlightFareBreakup.getPassagerServiceFee().toString());
			}
			
			if (null != svcIntFlightFareBreakup.getServiceTax())
			{
				fareDetailData.setServiceTax(svcIntFlightFareBreakup.getServiceTax().toString());
			}
			
			// TODO_SVTINT: Not sure is it correct.
			if (null !=svcIntFlightFareBreakup.getBaseFare() && null != svcIntFlightFareBreakup.getFuelSurcharge()
					&& null != svcIntFlightFareBreakup.getJnTax()
					&& null != svcIntFlightFareBreakup.getPassagerServiceFee()
					&& null != svcIntFlightFareBreakup.getServiceTax())
				fareDetailData.setTotal((svcIntFlightFareBreakup.getBaseFare().add(svcIntFlightFare
						.getBreakup()
						.getFuelSurcharge()
						.add(svcIntFlightFare
								.getBreakup()
								.getJnTax()
								.add(svcIntFlightFareBreakup.getPassagerServiceFee()
										.add(svcIntFlightFareBreakup.getServiceTax()))))).toString());
		}
		
		final SvcIntFlightRefundPolicy refundPolicy = svcIntFlightFare.getRefundPolicy();
		if (null != refundPolicy && null != refundPolicy.getRefundable())
		{
			fareDetailData.setRefundable(refundPolicy.getRefundable().booleanValue());
		}
		
		return fareDetailData;
	}

}
