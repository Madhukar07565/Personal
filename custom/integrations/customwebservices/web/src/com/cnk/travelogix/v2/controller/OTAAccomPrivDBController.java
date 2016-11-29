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


import com.coxandkings.suppl.accointerface.AccommodationRQ;
import com.coxandkings.suppl.accointerface.AccommodationRS;

@Controller
@RequestMapping(value = "/acco/ota")
public class OTAAccomPrivDBController {

	private static final Logger LOG = LoggerFactory.getLogger(OTAAccomPrivDBController.class);

	     // Acco GetAvailability&Price
		//@Secured({ "ROLE_CUSTOMERGROUP", "ROLE_TRUSTED_CLIENT", "ROLE_CUSTOMERMANAGERGROUP" })
		@RequestMapping(value = "/getAvailability&Price", method = RequestMethod.POST)
		@ResponseStatus(HttpStatus.CREATED)
		@ResponseBody
		public AccommodationRS GetAvailabilityAndPrice(@RequestBody final AccommodationRQ accommodationRequest) {
			AccommodationRS accommodationResponse;
			LOG.info("Accomodatin Request for GetAvailabilityAndPrice"+accommodationRequest);

			accommodationResponse = getResponseFromXml("GetAvailabilityAndPriceRS.xml");
			return accommodationResponse;
		}
		
		 // Acco CancelBooking
		//@Secured({ "ROLE_CUSTOMERGROUP", "ROLE_TRUSTED_CLIENT", "ROLE_CUSTOMERMANAGERGROUP" })
		@RequestMapping(value = "/cancelBooking", method = RequestMethod.POST)
		@ResponseStatus(HttpStatus.CREATED)
		@ResponseBody
		public AccommodationRS cancelBooking(@RequestBody final AccommodationRQ accommodationRequest) {
			AccommodationRS accommodationResponse;
			LOG.info("Accomodatin Request for CancelBooking"+accommodationRequest);

			accommodationResponse = getResponseFromXml("CancelBookingRS.xml");
			return accommodationResponse;
		}
		 // Acco CreateBooking
		//@Secured({ "ROLE_CUSTOMERGROUP", "ROLE_TRUSTED_CLIENT", "ROLE_CUSTOMERMANAGERGROUP" })
		@RequestMapping(value = "/createBooking", method = RequestMethod.POST)
		@ResponseStatus(HttpStatus.CREATED)
		@ResponseBody
		public AccommodationRS createBooking(@RequestBody final AccommodationRQ accommodationRequest) {
			AccommodationRS accommodationResponse;
			LOG.info("Accomodatin Request for CreateBooking"+accommodationRequest);

			accommodationResponse = getResponseFromXml("CreateBookingRS.xml");
			return accommodationResponse;
		}
		 // Acco Repricing
		//@Secured({ "ROLE_CUSTOMERGROUP", "ROLE_TRUSTED_CLIENT", "ROLE_CUSTOMERMANAGERGROUP" })
		@RequestMapping(value = "/repricing", method = RequestMethod.POST)
		@ResponseStatus(HttpStatus.CREATED)
		@ResponseBody
		public AccommodationRS repricing(@RequestBody final AccommodationRQ accommodationRequest) {
			AccommodationRS accommodationResponse;
			LOG.info("Accomodatin Request for Repricing"+accommodationRequest);

			accommodationResponse = getResponseFromXml("RePriceRS.xml");
			return accommodationResponse;
		}
		 // Acco RetrieveBooking
		//@Secured({ "ROLE_CUSTOMERGROUP", "ROLE_TRUSTED_CLIENT", "ROLE_CUSTOMERMANAGERGROUP" })
		@RequestMapping(value = "/retrieveBooking", method = RequestMethod.POST)
		@ResponseStatus(HttpStatus.CREATED)
		@ResponseBody
		public AccommodationRS retrieveBooking(@RequestBody final AccommodationRQ accommodationRequest) {
			AccommodationRS accommodationResponse;
			LOG.info("Accomodatin Request for RetrieveBooking"+accommodationRequest);

			accommodationResponse = getResponseFromXml("RetrieveBookingRS.xml");
			return accommodationResponse;
		}
		 // Acco AmendBooking
		//@Secured({ "ROLE_CUSTOMERGROUP", "ROLE_TRUSTED_CLIENT", "ROLE_CUSTOMERMANAGERGROUP" })
		@RequestMapping(value = "/amendBooking", method = RequestMethod.POST)
		@ResponseStatus(HttpStatus.CREATED)
		@ResponseBody
		public AccommodationRS amendBooking(@RequestBody final AccommodationRQ accommodationRequest) {
			AccommodationRS accommodationResponse;
			LOG.info("Accomodatin Request for AmendBooking"+accommodationRequest);

			accommodationResponse = getResponseFromXml("UpdateRoomRS.xml");
			return accommodationResponse;
		}
		public AccommodationRS getResponseFromXml(String xmlName)
		{
			AccommodationRS accoResponse = null;
			try {

				ClassLoader cl = getClass().getClassLoader();
				File file = new File(cl.getResource("privateDB/otaAccoXmls/"+xmlName).getFile());

				JAXBContext jaxbContext = JAXBContext.newInstance(AccommodationRS.class);

				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				accoResponse = (AccommodationRS) jaxbUnmarshaller.unmarshal(file);
				LOG.info("Accommodation Response" + accoResponse);

			} catch (JAXBException e) {
				LOG.info("JAXB Exception"+e.getMessage(),e);
			}
			return accoResponse;
		}

}
