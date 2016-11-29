/**
 *
 */
package com.cnk.travelogix.common.facades.product.impl;

import com.cnk.travelogix.common.core.si.services.SIAirService;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlightGetAvailabilityAndFareRequest;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlightGetAvailabilityAndFareResponse;
import com.cnk.travelogix.common.facades.product.CnkProductSearchFacade;
import com.cnk.travelogix.common.facades.product.data.BasePageableSearchData;
import com.cnk.travelogix.common.facades.product.data.FlightHotelSearchData;
import com.cnk.travelogix.common.facades.product.data.FlightProductSearchPageData;
import com.cnk.travelogix.common.facades.product.data.flight.*;
import com.cnk.travelogix.common.facades.product.util.CnkBeanUtil;
import com.cnk.travelogix.suppliers.air.data.AirLowFareSearchRequest;
import com.cnk.travelogix.suppliers.air.data.AirLowFareSearchResponseWrapper;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.apache.log4j.Logger;

import javax.annotation.Resource;


/**
 * @author i318043
 *
 */
public class SvcIntFlightSearchFacade implements CnkProductSearchFacade<FlightData>
{

	private static final Logger LOG = Logger.getLogger(SvcIntFlightSearchFacade.class);

	private Converter<FlightHotelSearchData, SvcIntFlightGetAvailabilityAndFareRequest> searchRequestConverter;

	private Converter<SvcIntFlightGetAvailabilityAndFareResponse, FlightProductSearchPageData> searchResponseConverter;

	private SIAirService siAirService;

	public void setSearchRequestConverter(Converter<FlightHotelSearchData, SvcIntFlightGetAvailabilityAndFareRequest> searchRequestConverter) {
		this.searchRequestConverter = searchRequestConverter;
	}

	public void setSearchResponseConverter(Converter<SvcIntFlightGetAvailabilityAndFareResponse, FlightProductSearchPageData> searchResponseConverter) {
		this.searchResponseConverter = searchResponseConverter;
	}

	public void setSiAirService(SIAirService siAirService) {
		this.siAirService = siAirService;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.common.facades.product.CnkProductSearchFacade#searchProduct(com.cnk.travelogix.common.facades
	 * .product.data.BasePageableSearchData)
	 */
	@Override
	public FlightProductSearchPageData searchProduct(final BasePageableSearchData searchParameters)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug(CnkBeanUtil.getString(searchParameters));
		}

		FlightHotelSearchData sourceRequest = (FlightHotelSearchData) searchParameters;
		SvcIntFlightGetAvailabilityAndFareRequest targetRequest = new SvcIntFlightGetAvailabilityAndFareRequest();
		targetRequest = searchRequestConverter.convert(sourceRequest, targetRequest);

		SvcIntFlightGetAvailabilityAndFareResponse sourceResponse = siAirService.search(targetRequest);
		FlightProductSearchPageData targetResponse = new FlightProductSearchPageData();
		targetResponse = searchResponseConverter.convert(sourceResponse, targetResponse);

		return targetResponse;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.common.facades.product.CnkProductSearchFacade#searchProductDetail(com.cnk.travelogix.common
	 * .facades.product.data.BasePageableSearchData)
	 */
	@Override
	public FlightData searchProductDetail(final BasePageableSearchData searchParameters)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug(CnkBeanUtil.getString(searchParameters));
		}
		return null;
	}

	@Override
	public FlightData searchProductDetail(final String productId)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug(CnkBeanUtil.getString(productId));
		}
		return null;
	}

}
