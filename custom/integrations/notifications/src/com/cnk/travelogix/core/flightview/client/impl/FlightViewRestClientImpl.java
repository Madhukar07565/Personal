/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the terms of the license agreement you entered into with SAP Hybris.
 */
package com.cnk.travelogix.core.flightview.client.impl;

import de.hybris.platform.servicelayer.config.ConfigurationService;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.cnk.travelogix.core.flightview.client.FlightViewRestClient;
import com.cnk.travelogix.core.flightview.datamodels.FlightRegisterRequest;
import com.cnk.travelogix.core.flightview.fnbclient.dto.FlightRegisterResponse;
import com.cnk.travelogix.core.flightview.fnbclient.dto.FlightViewUpdateDeliverUrlResponse;

/**
 * This class is rest client used to communicate with Flight View.
 * 
 * @author I313619
 */
public class FlightViewRestClientImpl implements FlightViewRestClient {

	private static final Logger LOG = LoggerFactory
			.getLogger(FlightViewRestClientImpl.class);

	private static final String FNB_REG_FLIGHT_URL = "flightview.fbn.registerFlighturl";
	private static final String APP_ID = "flightview.fbn.appid";
	private static final String APP_KEY = "flightview.fbn.appkey";
	private static final String FNB_UPDATE_DELIVERY_URL = "flightview.fbn.updateDeliveryUrl";

	@Autowired
	private ConfigurationService configurationService;

	private String encodeFlightRegisterUrl(FlightRegisterRequest flightRegisterRequest) {
		final String restUrl = configurationService.getConfiguration()
				.getString(FNB_REG_FLIGHT_URL);
		final String appId = configurationService.getConfiguration().getString(
				APP_ID);
		final String appKey = configurationService.getConfiguration()
				.getString(APP_KEY);

		Map<String, String> params = new HashMap();
		params.put("action", flightRegisterRequest.getAction());
		params.put("airport", flightRegisterRequest.getAirport());
		params.put("carrier", flightRegisterRequest.getCarrier());
		params.put("day", flightRegisterRequest.getDay());
		params.put("endpointtype", flightRegisterRequest.getEndpointType());
		params.put("flightnumber", flightRegisterRequest.getFlightNumber());
		params.put("month", flightRegisterRequest.getMonth());
		params.put("time", flightRegisterRequest.getTime());
		params.put("year", flightRegisterRequest.getYear());

		UriComponentsBuilder builder = UriComponentsBuilder
				.fromHttpUrl(restUrl).queryParam("appID", appId)
				.queryParam("appKey", appKey);
		return builder.buildAndExpand(params).toUri().toString();
	}

	@Override
	public FlightRegisterResponse registerFlight(
			FlightRegisterRequest flightRegisterRequest) {
		LOG.info("#registerFlight - Start");
		LOG.debug("#registerFlight - Action:{}, EndpointType:{}",
				flightRegisterRequest.getAction(),
				flightRegisterRequest.getEndpointType());
		FlightRegisterResponse response = null;
		try {
			final RestTemplate restTemplate = new RestTemplate();
			final List<HttpMessageConverter<?>> messageConverters = restTemplate
					.getMessageConverters();
			final Jaxb2RootElementHttpMessageConverter messageConverter = new Jaxb2RootElementHttpMessageConverter();
			messageConverter.setSupportedMediaTypes(Arrays
					.asList(MediaType.TEXT_PLAIN));
			messageConverter.setSupportDtd(Boolean.TRUE);
			messageConverters.add(messageConverter);
			restTemplate.setMessageConverters(messageConverters);
			final String encodedUrl = encodeFlightRegisterUrl(flightRegisterRequest);
			LOG.info("EncodedUrl::{}" , encodedUrl);
			String jsonInString = restTemplate.getForObject(encodedUrl,
					String.class);
			ObjectMapper mapper = new ObjectMapper();
			response = mapper.readValue(jsonInString,
					FlightRegisterResponse.class);

			LOG.info("registerFlight action ::{}",
					response.getRegistrationRequest());

		} catch (Exception e) {
			LOG.error("#registerFlight - Failure ErrorMessage:{}",
					e.getMessage(), e);
		}
		LOG.info("#registerFlight - Finish");
		return response;
	}

	@Override
	public FlightViewUpdateDeliverUrlResponse updateDeliverUrl(String deliverUrl) {
		LOG.info("#updateDeliverUrl - Start");
		LOG.trace("#updateDeliverUrl - deliverUrl : {}", deliverUrl);
		FlightViewUpdateDeliverUrlResponse response = null;
		try {
			final RestTemplate restTemplate = new RestTemplate();
			final List<HttpMessageConverter<?>> messageConverters = restTemplate
					.getMessageConverters();
			final Jaxb2RootElementHttpMessageConverter messageConverter = new Jaxb2RootElementHttpMessageConverter();
			messageConverter.setSupportedMediaTypes(Arrays
					.asList(MediaType.TEXT_PLAIN));
			messageConverter.setSupportDtd(Boolean.TRUE);
			messageConverters.add(messageConverter);
			restTemplate.setMessageConverters(messageConverters);
			final String encodedUrl = encodeUpdateDeliveryUrl(deliverUrl);
			LOG.info("EncodedUrl::{}" + encodedUrl);
			String jsonInString = restTemplate.getForObject(encodedUrl,
					String.class);
			LOG.info(jsonInString);
			ObjectMapper mapper = new ObjectMapper();

			response = mapper.readValue(jsonInString,
					FlightViewUpdateDeliverUrlResponse.class);
		} catch (Exception e) {
			LOG.error("#updateDeliverUrl - Failure ErrorMessage:{}",
					e.getMessage(), e);
		}
		LOG.info("#updateDeliverUrl - Finish");
		return response;
	}

	private String encodeUpdateDeliveryUrl(String deliveryUrl) {
		final String fnbDeliveryRestUrl = configurationService
				.getConfiguration().getString(FNB_UPDATE_DELIVERY_URL);
		final String appId = configurationService.getConfiguration().getString(
				APP_ID);
		final String appKey = configurationService.getConfiguration()
				.getString(APP_KEY);

		final UriComponentsBuilder builder = UriComponentsBuilder
				.fromUriString(fnbDeliveryRestUrl);
		builder.queryParam("appID", appId);
		builder.queryParam("appKey", appKey);
		builder.queryParam("deliveryURL", deliveryUrl);
		builder.queryParam("VerifyURL", "false");
		return builder.build(Boolean.TRUE).toUriString();
	}
}