/**
 *
 */
package com.cnk.travelogix.v2.controller;

import de.hybris.platform.webservicescommons.cache.CacheControl;
import de.hybris.platform.webservicescommons.cache.CacheControlDirective;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.cnk.travelogix.flightview.mapping.dto.FlightViewNotificationWSRequest;
import com.cnk.travelogix.flightview.mapping.dto.FlightViewNotificationWSResponse;

/**
 * This controller class manages Flight view push notification.
 * 
 * @author I313619
 *
 */
@Controller
@RequestMapping(value = "/{baseSiteId}/flightview")
@CacheControl(directive = CacheControlDirective.PRIVATE)
public class FlightViewController extends BaseCommerceController {

    private static final Logger LOG = LoggerFactory.getLogger(FlightViewController.class);

    @Secured({ "ROLE_CUSTOMERGROUP", "ROLE_TRUSTED_CLIENT", "ROLE_CUSTOMERMANAGERGROUP" })
    @RequestMapping(value = "/FnbReceiver", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public FlightViewNotificationWSResponse flightViewNotification(@RequestBody final FlightViewNotificationWSRequest flightViewNotificationWSRequest) {
	LOG.info("#flightViewNotification - Start");
	LOG.trace("#flightViewNotificationRequest - {}", flightViewNotificationWSRequest);
	String alertIdentifier = flightViewNotificationWSRequest.getAlertIdentifier();
	String responseText = "Processed without errors";
	FlightViewNotificationWSResponse flightViewNotificationWSResponse = new FlightViewNotificationWSResponse();
	flightViewNotificationWSResponse.setAlertIdentifier(alertIdentifier);
	flightViewNotificationWSResponse.setResponseText(responseText);
	// TODO to update another system to send SMS or Email notification to the registered customer for flight notification.	
	LOG.info("#flightViewNotification - Finish");
	return flightViewNotificationWSResponse;
    }
}
