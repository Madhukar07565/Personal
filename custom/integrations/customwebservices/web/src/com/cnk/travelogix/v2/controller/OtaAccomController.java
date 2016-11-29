package com.cnk.travelogix.v2.controller;

import java.io.File;
import java.util.List;

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

import com.coxandkings.integ.suppl.acco.OTAHotelAvailRQWrapper;
import com.coxandkings.integ.suppl.acco.OTAHotelGetCancellationPolicyRQWrapper;
import com.coxandkings.integ.suppl.acco.OTAHotelResModifyRQWrapper;
import com.coxandkings.integ.suppl.acco.OTAHotelResRQWrapper;
import com.coxandkings.integ.suppl.acco.OTAReadRQWrapper;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRS;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRS;

@Controller
@RequestMapping(value = "/{baseSiteId}/ota")
public class OtaAccomController {

	private static final Logger LOG = LoggerFactory.getLogger(OtaAccomController.class);

	// Acco Search
	//@Secured({ "ROLE_CUSTOMERGROUP", "ROLE_TRUSTED_CLIENT", "ROLE_CUSTOMERMANAGERGROUP" })
	@RequestMapping(value = "/accoSearch", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AccoInterfaceRS search(@RequestBody final AccoInterfaceRQ accoInterfaceRQ) {
		AccoInterfaceRS accoInterfaceResponse;
		List<OTAHotelAvailRQWrapper> otaAvailRQWrapper = accoInterfaceRQ.getRequestBody().getOTAHotelAvailRQWrapper();

		for (OTAHotelAvailRQWrapper otaHotelAvailRQWrapper : otaAvailRQWrapper) {
			LOG.info("target Name" + otaHotelAvailRQWrapper.getOTAHotelAvailRQ().getTargetName());
		}

		accoInterfaceResponse = getResponseFromXml("GetAvailabilityAndPriceRS.xml");
		return accoInterfaceResponse;
	}

	
	// Acco cancel Passenger 
		@RequestMapping(value = "/cancelBooking", method = RequestMethod.POST)
		@ResponseStatus(HttpStatus.CREATED)
		@ResponseBody
		public AccoInterfaceRS cancelBooking(@RequestBody final AccoInterfaceRQ accoInterfaceRQ) {
			AccoInterfaceRS accoInterfaceResponse ;
			LOG.info("Acco Interface Request" + accoInterfaceRQ);

			accoInterfaceResponse = getResponseFromXml("CancelBookingRS.xml");
			return accoInterfaceResponse;
		}
	// Acco cancel Passenger 
	@RequestMapping(value = "/cancelPassenger", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AccoInterfaceRS cancelPassenger(@RequestBody final AccoInterfaceRQ accoInterfaceRQ) {
		AccoInterfaceRS accoInterfaceResponse ;
		LOG.info("Acco Interface Request" + accoInterfaceRQ);
		accoInterfaceResponse = getResponseFromXml("CancelPassengerRS.xml");
		
		return accoInterfaceResponse;
	}

	// Acco create Booking
	@RequestMapping(value = "/createBooking", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AccoInterfaceRS booking(@RequestBody final AccoInterfaceRQ accoInterfaceRQ) {
		AccoInterfaceRS accoInterfaceResponse ;
		List<OTAHotelResRQWrapper> otaAvailRsWrapper = accoInterfaceRQ.getRequestBody().getOTAHotelResRQWrapper();

		for (OTAHotelResRQWrapper otaHotelResRQWrapper : otaAvailRsWrapper) {
			LOG.info("Discount " + otaHotelResRQWrapper.getOTAHotelResRQ().getHotelReservations().getHotelReservation()
					.get(0).getRoomStays().getRoomStay().get(0).getDiscount());
		}
		accoInterfaceResponse = getResponseFromXml("CreateBookingRS.xml");
		return accoInterfaceResponse;
	}

	// Acco get Details
	@RequestMapping(value = "/getDetails", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AccoInterfaceRS getDetails(@RequestBody final AccoInterfaceRQ accoInterfaceRQ) {
		AccoInterfaceRS accoInterfaceResponse ;
		String otaAvailRsWrapper = accoInterfaceRQ.getRequestBody().getOTAHotelAvailRQWrapper().get(0)
				.getOTAHotelAvailRQ().getAvailRequestSegments().getAvailRequestSegment().get(0).getHotelSearchCriteria()
				.getCriterion().get(0).getHotelRef().get(0).getHotelCode();

		LOG.info("Hotel Code" + otaAvailRsWrapper);

		accoInterfaceResponse = getResponseFromXml("GetDetailsRS.xml");
		
		return accoInterfaceResponse;
	}

	// Acco get Policies
	@RequestMapping(value = "/getPolicies", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AccoInterfaceRS getPolicies(@RequestBody final AccoInterfaceRQ accoInterfaceRQ) {
		AccoInterfaceRS accoInterfaceResponse;
		List<OTAHotelGetCancellationPolicyRQWrapper> otaAvailRsWrapper = accoInterfaceRQ.getRequestBody()
				.getOTAHotelGetCancellationPolicyRQWrapper();

		for (OTAHotelGetCancellationPolicyRQWrapper otaHotelGetCancellationPolicyRQWrapper : otaAvailRsWrapper) {
			LOG.info("Cancellation Policy Supplier "
					+ otaHotelGetCancellationPolicyRQWrapper.getOTAHotelGetCancellationPolicyRQ().getSupplier());
		}
		
		accoInterfaceResponse = getResponseFromXml("GetpoliciesRS.xml");
		
		return accoInterfaceResponse;
	}

	// Acco Modification or add room
	@RequestMapping(value = "/addRoom", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AccoInterfaceRS accoAddRoom(@RequestBody final AccoInterfaceRQ accoInterfaceRQ) {
		AccoInterfaceRS accoInterfaceResponse ;
		List<OTAHotelResModifyRQWrapper> otaAvailRsWrapper = accoInterfaceRQ.getRequestBody()
				.getOTAHotelResModifyRQWrapper();
        
		for (OTAHotelResModifyRQWrapper otaHotelResModifyRQWrapper : otaAvailRsWrapper) {
			LOG.info("Modificatin Supplier id" + otaHotelResModifyRQWrapper.getSupplierID());
		}

		accoInterfaceResponse = getResponseFromXml("Modification(AddRooms)RS.xml");
		return accoInterfaceResponse;
	}

	// Acco RePrice
	@RequestMapping(value = "/rePrice", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AccoInterfaceRS accoRePrice(@RequestBody final AccoInterfaceRQ accoInterfaceRQ) {
		AccoInterfaceRS accoInterfaceResponse ;
		List<OTAHotelAvailRQWrapper> otaAvailRsWrapper = accoInterfaceRQ.getRequestBody().getOTAHotelAvailRQWrapper();

		for (OTAHotelAvailRQWrapper otaHotelAvailRQWrapper : otaAvailRsWrapper) {
			LOG.info("Supplier Id" + otaHotelAvailRQWrapper.getSupplierID());
			LOG.info("Sequence Id " + otaHotelAvailRQWrapper.getSequence());
		}

		accoInterfaceResponse = getResponseFromXml("RePriceRS.xml");
		
		return accoInterfaceResponse;
	}

	// Acco Retriev Booking
	@RequestMapping(value = "/retrieveBooking", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AccoInterfaceRS accoRetrievBooking(@RequestBody final AccoInterfaceRQ accoInterfaceRQ) {
		AccoInterfaceRS accoInterfaceResponse ;
		List<OTAReadRQWrapper> otaAvailRsWrapper = accoInterfaceRQ.getRequestBody().getOTAReadRQWrapper();

		for (OTAReadRQWrapper otaReadRQWrapper : otaAvailRsWrapper) {
			LOG.info("Supplier Id" + otaReadRQWrapper.getSupplierID());
			LOG.info("Sequence" + otaReadRQWrapper.getSequence());
		}

		accoInterfaceResponse = getResponseFromXml("RetrieveBookingRS.xml");
		
		return accoInterfaceResponse;
	}

	// Acco Retrieve Booking List 
	@RequestMapping(value = "/retrieveBookingList", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AccoInterfaceRS accoRetrieveBookingList(@RequestBody final AccoInterfaceRQ accoInterfaceRQ) {
		AccoInterfaceRS accoInterfaceResponse ;
		LOG.info("Acco Interface Request" + accoInterfaceRQ);

		accoInterfaceResponse = getResponseFromXml("RetrieveBookingListRS.xml");
		
		return accoInterfaceResponse;
	}

	// Acco add passenger 
	@RequestMapping(value = "/addPassenger", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AccoInterfaceRS accoAddPassenger(@RequestBody final AccoInterfaceRQ accoInterfaceRQ) {
		AccoInterfaceRS accoInterfaceResponse;
		LOG.info("Acco Interface Request" + accoInterfaceRQ);
		List<OTAHotelResModifyRQWrapper> otaHotelResModifyRQWrapper = accoInterfaceRQ.getRequestBody().getOTAHotelResModifyRQWrapper();
		for (OTAHotelResModifyRQWrapper oTAHotelResModifyRQWrapper : otaHotelResModifyRQWrapper) {
			LOG.info("Supplier Id "+oTAHotelResModifyRQWrapper.getSupplierID());
		}
		
		accoInterfaceResponse = getResponseFromXml("AddPassengerRS.xml");

		return accoInterfaceResponse;
	}

	// Acco update passenger 
	@RequestMapping(value = "/updatePassenger", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AccoInterfaceRS accoUpdatePassenger(@RequestBody final AccoInterfaceRQ accoInterfaceRQ) {
		AccoInterfaceRS accoInterfaceResponse ;
		LOG.info("Acco Interface Request" + accoInterfaceRQ);

		accoInterfaceResponse = getResponseFromXml("UpdatePassengerRS.xml");
		

		return accoInterfaceResponse;
	}

	// on request booking update
	@RequestMapping(value = "/requestBookingUpdate", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AccoInterfaceRS accoRequestBookingUpdate(@RequestBody final AccoInterfaceRQ accoInterfaceRQ) {
		AccoInterfaceRS accoInterfaceResponse ;
		LOG.info("Acco Interface Request" + accoInterfaceRQ);

		accoInterfaceResponse = getResponseFromXml("OnRequestBookingUpdateRS.xml");
		

		return accoInterfaceResponse;
	}
	
	//Cancel Room
		@RequestMapping(value = "/cancelRoom", method = RequestMethod.POST)
		@ResponseStatus(HttpStatus.CREATED)
		@ResponseBody
		public AccoInterfaceRS accoCancelRoom(@RequestBody final AccoInterfaceRQ accoInterfaceRQ) {
			AccoInterfaceRS accoInterfaceResponse ;
			LOG.info("Acco Interface Request" + accoInterfaceRQ);

			accoInterfaceResponse = getResponseFromXml("CancelRoomRS.xml");
			return accoInterfaceResponse;
		}

	// Acco update room 
	@RequestMapping(value = "/updateRoom", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AccoInterfaceRS accoUpdateRoom(@RequestBody final AccoInterfaceRQ accoInterfaceRQ) {
		AccoInterfaceRS accoInterfaceResponse ;
		LOG.info("Acco Interface Request" + accoInterfaceRQ);

		
		accoInterfaceResponse = getResponseFromXml("UpdateRoomRS.xml");
		
		return accoInterfaceResponse;
	}

	// Acco change period of stay 
	@RequestMapping(value = "/changePeriodOfStay", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AccoInterfaceRS accoChangePeriodOfStay(@RequestBody final AccoInterfaceRQ accoInterfaceRQ) {
		AccoInterfaceRS accoInterfaceResponse ;
		LOG.info("Acco Interface Request" + accoInterfaceRQ);

		accoInterfaceResponse = getResponseFromXml("ChangePeriodOfStayRS.xml");
		

		return accoInterfaceResponse;
	}

	// Acco ancillary booking 
	@RequestMapping(value = "/ancillaryBooking", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AccoInterfaceRS accoAncillayBooking(@RequestBody final AccoInterfaceRQ accoInterfaceRQ) {
		AccoInterfaceRS accoInterfaceResponse;
		LOG.info("Acco Interface Request" + accoInterfaceRQ);

		accoInterfaceResponse = getResponseFromXml("AncillaryBookingRS.xml");
		

		return accoInterfaceResponse;
	}
	public AccoInterfaceRS getResponseFromXml(String xmlName)
	{
		AccoInterfaceRS airInterfaceResponse = null;
		try {

			ClassLoader cl = getClass().getClassLoader();
			File file = new File(cl.getResource("AirXmls/"+xmlName).getFile());

			JAXBContext jaxbContext = JAXBContext.newInstance(AirInterfaceRS.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			airInterfaceResponse = (AccoInterfaceRS) jaxbUnmarshaller.unmarshal(file);
			LOG.info("Air Response" + airInterfaceResponse);

		} catch (JAXBException e) {
			LOG.info("JAXB Exception"+e.getMessage(),e);
		}
		return airInterfaceResponse;
	}
	
	
	
}
