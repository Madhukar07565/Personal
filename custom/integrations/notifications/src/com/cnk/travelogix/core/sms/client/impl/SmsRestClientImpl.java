/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the terms of the license agreement you entered into with SAP Hybris.
 */
package com.cnk.travelogix.core.sms.client.impl;

import de.hybris.platform.servicelayer.config.ConfigurationService;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.lang3.text.translate.AggregateTranslator;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.EntityArrays;
import org.apache.commons.lang3.text.translate.LookupTranslator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.cnk.travelogix.core.sms.client.SmsRestClient;
import com.cnk.travelogix.core.sms.client.dto.NetcoreResponse;

/**
 * This class is rest client used to communicate with SMS gateway.
 * 
 * @author I077988
 */
public class SmsRestClientImpl implements SmsRestClient {

    private static final Logger LOG = LoggerFactory.getLogger(SmsRestClientImpl.class);

    private static final String REST_URL = "sms.netcore.base.rest.url";
    private static final String FEED_ID = "sms.netcore.feedid";
    private static final String USER_NAME = "sms.netcore.username";
    private static final String USER_PASSWORD = "sms.netcore.password";
    private static final String SENDER_ID = "sms.netcore.senderid";

    /**
     * Translator object for escaping
     */
    public static final CharSequenceTranslator ESCAPE = new AggregateTranslator(new LookupTranslator(EntityArrays.BASIC_ESCAPE()),
	    new LookupTranslator(new String[][] { { "\u000c", "&#012;" }, { "\u0009", "&#009;" }, { "\u0025", "&#37;" }, { "\n", "&#010;" },
		    { "'", "&apos;" }, { " ", "%20" } }));;

    @Autowired
    private ConfigurationService configurationService;

    @Override
    public NetcoreResponse sendSmsNetcore(final String toMobile, final String smsText) {
	LOG.info("#sendSmsNetcore - Start");
	NetcoreResponse response = null;
	try {
	    final RestTemplate restTemplate = new RestTemplate();
	    final List<HttpMessageConverter<?>> messageConverters = restTemplate.getMessageConverters();
	    final Jaxb2RootElementHttpMessageConverter messageConverter = new Jaxb2RootElementHttpMessageConverter();
	    messageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.TEXT_PLAIN));
	    messageConverter.setSupportDtd(Boolean.TRUE);
	    messageConverters.add(messageConverter);
	    restTemplate.setMessageConverters(messageConverters);
	    final String encodedUrl = encodeUrl(toMobile, ESCAPE.translate(smsText));
	    LOG.debug("EncodedUrl::{}", encodedUrl);
	    response = restTemplate.getForObject(encodedUrl, NetcoreResponse.class);
	    LOG.trace("NetcoreResponse::{}", response);
	} catch (Exception e) {
	    LOG.error("#sendSmsNetcore - Failure ErrorMessage:{}", e.getMessage(), e);
	    throw e;
	}
	LOG.info("#sendSmsNetcore - Finish");
	return response;
    }

    private String encodeUrl(String toMobile, String smsText) {

	final String restUrl = configurationService.getConfiguration().getString(REST_URL);
	final String feedId = configurationService.getConfiguration().getString(FEED_ID);
	final String userName = configurationService.getConfiguration().getString(USER_NAME);
	final String userPassward = configurationService.getConfiguration().getString(USER_PASSWORD);
	final String senderId = configurationService.getConfiguration().getString(SENDER_ID);

	final UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(restUrl);
	builder.queryParam("feedid", feedId);
	builder.queryParam("To", toMobile);
	builder.queryParam("Text", smsText);
	
	builder.queryParam("username", userName);// Optional
	builder.queryParam("password", userPassward);// Optional
	builder.queryParam("senderid", senderId);// Optional
	builder.queryParam("time", Calendar.getInstance().getTimeInMillis()); // Optional Default if time is not set, Message is sent immediately
	return builder.build(Boolean.TRUE).toUriString();
    }
}