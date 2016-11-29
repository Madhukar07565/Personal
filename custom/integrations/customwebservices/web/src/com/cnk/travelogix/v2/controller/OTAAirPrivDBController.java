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


import com.coxandkings.suppl.airinterface.AirRQ;
import com.coxandkings.suppl.airinterface.AirRS;
@Controller
@RequestMapping(value = "/air/ota")
public class OTAAirPrivDBController {

	private static final Logger LOG = LoggerFactory.getLogger(OTAAirPrivDBController.class);

    // Acco GetAvailability&Fare
	//@Secured({ "ROLE_CUSTOMERGROUP", "ROLE_TRUSTED_CLIENT", "ROLE_CUSTOMERMANAGERGROUP" })
	@RequestMapping(value = "/getAvailability&Fare", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AirRS GetAvailabilityAndFare(@RequestBody final AirRQ airRequest) {
		AirRS airResponse;
		LOG.info("Air Request for GetAvailabilityAndFare"+airRequest);

		airResponse = getResponseFromXml("AvailRS.xml");
		return airResponse;
	}
	
	 
	 // Air CreateBooking
	//@Secured({ "ROLE_CUSTOMERGROUP", "ROLE_TRUSTED_CLIENT", "ROLE_CUSTOMERMANAGERGROUP" })
	@RequestMapping(value = "/createBooking", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AirRS createBooking(@RequestBody final AirRQ airRequest) {
		AirRS airResponse;
		LOG.info("Air Request for CreateBooking"+airRequest);

		airResponse = getResponseFromXml("BOOKRS.xml");
		return airResponse;
	}
	 // Air Repricing
	//@Secured({ "ROLE_CUSTOMERGROUP", "ROLE_TRUSTED_CLIENT", "ROLE_CUSTOMERMANAGERGROUP" })
	@RequestMapping(value = "/repricing", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AirRS repricing(@RequestBody final AirRQ airRequest) {
		AirRS airResponse;
		LOG.info("Air Request for Repricing"+airRequest);

		airResponse = getResponseFromXml("RePriceResponse.xml");
		return airResponse;
	}
	 // Air RetrievePNR
	//@Secured({ "ROLE_CUSTOMERGROUP", "ROLE_TRUSTED_CLIENT", "ROLE_CUSTOMERMANAGERGROUP" })
	@RequestMapping(value = "/RetrievePNR", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AirRS retrievePNR(@RequestBody final AirRQ airRequest) {
		AirRS airResponse;
		LOG.info("Air Request for RetrievePNR"+airRequest);

		airResponse = getResponseFromXml("RetrievePNRRS.xml");
		return airResponse;
	}
	 // Air UpdatePNR
	//@Secured({ "ROLE_CUSTOMERGROUP", "ROLE_TRUSTED_CLIENT", "ROLE_CUSTOMERMANAGERGROUP" })
	@RequestMapping(value = "/updatePNR", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AirRS updatePNR(@RequestBody final AirRQ accommodationRequest) {
		AirRS airResponse;
		LOG.info("Air Request for UpdatePNR"+accommodationRequest);

		airResponse = getResponseFromXml("UpdatePNRRS.xml");
		return airResponse;
	}
	
	
	// Air CancelPNR
		//@Secured({ "ROLE_CUSTOMERGROUP", "ROLE_TRUSTED_CLIENT", "ROLE_CUSTOMERMANAGERGROUP" })
		@RequestMapping(value = "/cancelPNR", method = RequestMethod.POST)
		@ResponseStatus(HttpStatus.CREATED)
		@ResponseBody
		public AirRS cancelPNR(@RequestBody final AirRQ accommodationRequest) {
			AirRS airResponse;
			LOG.info("Air Request for CancelPNR"+accommodationRequest);

			airResponse = getResponseFromXml("CancelRS.xml");
			return airResponse;
		}
	public AirRS getResponseFromXml(String xmlName)
	{
		AirRS airResponse = null;
		try {

			ClassLoader cl = getClass().getClassLoader();
			File file = new File(cl.getResource("privateDB/otaAirXmls/"+xmlName).getFile());

			JAXBContext jaxbContext = JAXBContext.newInstance(AirRS.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			airResponse = (AirRS) jaxbUnmarshaller.unmarshal(file);
			LOG.info("Air Response" + airResponse);

		} catch (JAXBException e) {
			LOG.info("JAXB Exception"+e.getMessage(),e);
		}
		return airResponse;
	}

}
