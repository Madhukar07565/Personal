package com.cnk.travelogix.v2.controller;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.coxandkings.suppl.acco.COTAHotelInvRateNotifRQ;
import com.coxandkings.suppl.acco.COTAHotelInvRateNotifRS;

@Controller
@RequestMapping(value = "/{baseSiteId}/cm")
public class ChannelManagerController {

    private static final Logger LOG = LoggerFactory.getLogger(ChannelManagerController.class);

    // @Secured({ "ROLE_CUSTOMERGROUP", "ROLE_TRUSTED_CLIENT",
    // "ROLE_CUSTOMERMANAGERGROUP" })
    @RequestMapping(value = "/updateRateAndInventory", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public COTAHotelInvRateNotifRS updateRateAndInventory(@RequestBody final COTAHotelInvRateNotifRQ request) {
	COTAHotelInvRateNotifRS otaHotelInvRateNotifRS;
	LOG.debug("HotelCode" + request.getRequestBody().getHotelCode());
	otaHotelInvRateNotifRS = getResponseFromXml("COTA_HotelInvRateNotifRS.xml");
	return otaHotelInvRateNotifRS;
    }

    public COTAHotelInvRateNotifRS getResponseFromXml(String xmlName) {
	COTAHotelInvRateNotifRS response = null;
	try {

	    ClassLoader cl = getClass().getClassLoader();
	    File file = new File(cl.getResource("privateDB/otaAccoXmls/"+xmlName).getFile());

	    JAXBContext jaxbContext = JAXBContext.newInstance(COTAHotelInvRateNotifRS.class);

	    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	    response = (COTAHotelInvRateNotifRS) jaxbUnmarshaller.unmarshal(file);
	    LOG.debug("Response" + response);

	} catch (JAXBException e) {
	    LOG.error("JAXB Exception" + e.getMessage(), e);
	}
	return response;
    }

}
