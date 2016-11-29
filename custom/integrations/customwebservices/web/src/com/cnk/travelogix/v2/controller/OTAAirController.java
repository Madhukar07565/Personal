package com.cnk.travelogix.v2.controller;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.opentravel.ota._2003._05.AirItineraryType.OriginDestinationOptions;
import org.opentravel.ota._2003._05.AirItineraryType.OriginDestinationOptions.OriginDestinationOption;
import org.opentravel.ota._2003._05.OTAAirBookRQ;
import org.opentravel.ota._2003._05.OTAAirLowFareSearchRQ;
import org.opentravel.ota._2003._05.OTAAirSeatMapRQ;
import org.opentravel.ota._2003._05.OTAAirSeatMapRQ.SeatMapRequests;
import org.opentravel.ota._2003._05.OTAAirSeatMapRQ.SeatMapRequests.SeatMapRequest;
import org.opentravel.ota._2003._05.OriginDestinationOptionType.FlightSegment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.cnk.travelogix.suppliers.air.data.OriginDestinationInformation;
import com.coxandkings.integ.suppl.air.AirBusinessServiceRQ;
import com.coxandkings.integ.suppl.air.AirBusinessServiceRS;
import com.coxandkings.integ.suppl.air.OTAAirAvailRQWrapper;
import com.coxandkings.integ.suppl.air.OTAAirDemandTicketRQWrapper;
import com.coxandkings.integ.suppl.air.OTAAirPriceRQWrapper;
import com.coxandkings.integ.suppl.air.OTACancelRQWrapper;
import com.coxandkings.integ.suppl.air.OTAReadRQWrapper;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRS;

@Controller
@RequestMapping(value = "/{baseSiteId}/ota")
public class OTAAirController {

	private static final Logger LOG = LoggerFactory.getLogger(OTAAirController.class);

	
	
	// Air Search
	@RequestMapping(value = "/airSearch", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AirInterfaceRS airSearch(@RequestBody final AirInterfaceRQ airInterfaceRQ) {
		AirInterfaceRS airInterfaceResponse ;
		
		OTAAirLowFareSearchRQ oTAAirLowFareSearchRQ = airInterfaceRQ.getRequestBody().getOTAAirLowFareSearchRQ();
		List<org.opentravel.ota._2003._05.OTAAirLowFareSearchRQ.OriginDestinationInformation> originalDestinationInformation= oTAAirLowFareSearchRQ.getOriginDestinationInformation();
		for (org.opentravel.ota._2003._05.OTAAirLowFareSearchRQ.OriginDestinationInformation originDestinationInformation : originalDestinationInformation) {
			LOG.info("Departure time"+originDestinationInformation.getDepartureDateTime());
		}
		
		
		airInterfaceResponse = getResponseFromXml("OTA_SearchResponse.xml");
		
		return airInterfaceResponse;
	}

	// Air Get Availability & Fare
	@RequestMapping(value = "/airGetAvailability&Fare", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AirInterfaceRS getAvailabilityAndFare(@RequestBody final AirInterfaceRQ airInterfaceRQ) {
		AirInterfaceRS airInterfaceResponse ;
		List<OTAAirAvailRQWrapper> oTAAirAvailRQWrapper = airInterfaceRQ.getRequestBody().getOTAAirAvailRQWrapper();
		for (OTAAirAvailRQWrapper otaAirAvailRQWrapper : oTAAirAvailRQWrapper) {
			LOG.info("getAvailabilityAndFare SupplierId" + otaAirAvailRQWrapper.getSupplierID());
		}
		
		airInterfaceResponse = getResponseFromXml("Int_AvailRS.xml");
		

		return airInterfaceResponse;
	}

	// Air List Bookings
	@RequestMapping(value = "/airListBookings", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AirInterfaceRS getListBookings(@RequestBody final AirInterfaceRQ airInterfaceRQ) {
		AirInterfaceRS airInterfaceResponse;
		
		List<OTAReadRQWrapper> oTAReadRQWrapper = airInterfaceRQ.getRequestBody().getOTAReadRQWrapper();
		
		for (OTAReadRQWrapper otAReadRQWrapper : oTAReadRQWrapper) {
			LOG.info("supplire id"+otAReadRQWrapper.getSupplierID().getValue());
		}
		
			airInterfaceResponse = getResponseFromXml("OTA_ListBooking_RS.xml");
			
           	return airInterfaceResponse;
	}

	// Air Issue ticket Bookings
	@RequestMapping(value = "/airIssueTicket", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AirInterfaceRS getIssueTicket(@RequestBody final AirInterfaceRQ airInterfaceRQ) {
		AirInterfaceRS airInterfaceResponse ;
		List<OTAAirDemandTicketRQWrapper> oTAAirDemandTicketRQWrapper = airInterfaceRQ.getRequestBody().getOTAAirDemandTicketRQWrapper();

		for (OTAAirDemandTicketRQWrapper otaAirDemandTicketRQWrapper : oTAAirDemandTicketRQWrapper) {
			LOG.info("Supplier id"+otaAirDemandTicketRQWrapper.getSupplierID());
		}

			
			airInterfaceResponse = getResponseFromXml("IssueTktRS.xml");
			
		return airInterfaceResponse;
	}

	// Air PriceRequest
	@RequestMapping(value = "/airPriceRequest", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AirInterfaceRS airPriceRequest(@RequestBody final AirInterfaceRQ airInterfaceRQ) {
		AirInterfaceRS airInterfaceResponse ;
		
		List<OTAAirPriceRQWrapper> otAAirPriceRQWrapper = airInterfaceRQ.getRequestBody().getOTAAirPriceRQWrapper();
		for (OTAAirPriceRQWrapper oTAAirPriceRQWrapper : otAAirPriceRQWrapper) {
			LOG.info("supplier id "+oTAAirPriceRQWrapper.getSupplierID());
		}

	
			airInterfaceResponse = getResponseFromXml("OTA_PriceResponse.xml");
			

		return airInterfaceResponse;
	}

	// Air Create Booking GDC & LCC
	@RequestMapping(value = "/airCreateBooking", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AirBusinessServiceRS airCreateBookingRequest(@RequestBody final AirBusinessServiceRQ airBusinessServiceRQ) {
		AirBusinessServiceRS airBusinessResponse ;
		
	OTAAirBookRQ otaAirBookRQ=	airBusinessServiceRQ.getRequestBody().getOTAAirBookRQ();
	
	List<OriginDestinationOption> originDestinationOptionList= otaAirBookRQ.getAirItinerary().getOriginDestinationOptions().getOriginDestinationOption();
 for (OriginDestinationOption originDestinationOption : originDestinationOptionList) {
	 List<FlightSegment> flightSegmentList = originDestinationOption.getFlightSegment();
	 for (FlightSegment flightSegment : flightSegmentList) {
		LOG.info("Departure AirPort"+flightSegment.getDepartureAirport());
	}
}
 
     airBusinessResponse = getResponseFromAirXml("BOOKRS.xml");
 		return airBusinessResponse;
	}

	// Air RePrice Request
	@RequestMapping(value = "/airRePriceRequest", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AirInterfaceRS airRePriceRequest(@RequestBody final AirInterfaceRQ airInterfaceRQ) {
		AirInterfaceRS airInterfaceResponse ;
		
	List<OTAAirPriceRQWrapper> otairPriceRQWrapperList =	airInterfaceRQ.getRequestBody().getOTAAirPriceRQWrapper();
		for (OTAAirPriceRQWrapper otaAirPriceRQWrapper : otairPriceRQWrapperList) {
			LOG.info("reprice request supplier id"+otaAirPriceRQWrapper.getSupplierID());
		}

		airInterfaceResponse = getResponseFromXml("OTA_RePriceResponse.xml");
		

		return airInterfaceResponse;
	}

	// Air Sell Request
	@RequestMapping(value = "/airSellRequest", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AirInterfaceRS airSellRequest(@RequestBody final AirInterfaceRQ airInterfaceRQ) {
		AirInterfaceRS airInterfaceResponse ;
		List<OTAAirPriceRQWrapper> oTAirPriceRQWrapper= airInterfaceRQ.getRequestBody().getOTAAirPriceRQWrapper();
		
		for (OTAAirPriceRQWrapper otaAirPriceRQWrapper : oTAirPriceRQWrapper) {
			LOG.info("Supplire id of sell request"+otaAirPriceRQWrapper.getSupplierID());
		}
		LOG.info("interface request"+airInterfaceRQ);
		
		airInterfaceResponse = getResponseFromXml("Sell_RS.xml");
		

		return airInterfaceResponse;
	}

	// Air Retrieve PNR Request
	@RequestMapping(value = "/airRetrievePNR", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AirInterfaceRS airRetrivePNRRequest(@RequestBody final AirInterfaceRQ airInterfaceRQ) {
		AirInterfaceRS airInterfaceResponse ;
		LOG.info("interface request"+airInterfaceRQ);
		
		airInterfaceResponse = getResponseFromXml("RetrievePNRRS.xml");
		

		return airInterfaceResponse;
	}

	// Air Cancel Room Request
	@RequestMapping(value = "/airCancelRoom", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AirInterfaceRS airCancelRoomRequest(@RequestBody final AirInterfaceRQ airInterfaceRQ) {
		AirInterfaceRS airInterfaceResponse;
		LOG.info("interface request"+airInterfaceRQ);
		
		airInterfaceResponse = getResponseFromXml("1ADT_1WAY_DOM_CANCELRS.xml");
		return airInterfaceResponse;
	}

	// Air get Availability 
	@RequestMapping(value = "/airGetAvailability", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AirInterfaceRS airGetAvailability(@RequestBody final AirInterfaceRQ airInterfaceRQ) {
		AirInterfaceRS airInterfaceResponse ;
		LOG.info("interface request"+airInterfaceRQ);

		airInterfaceResponse = getResponseFromXml("Int_AvailRS.xml");
		

		return airInterfaceResponse;
	}

	// Air get AirRules 
	@RequestMapping(value = "/airGetRules", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AirInterfaceRS airGetRules(@RequestBody final AirInterfaceRQ airInterfaceRQ) {
		AirInterfaceRS airInterfaceResponse ;
		
		LOG.info("interface request"+airInterfaceRQ);
		
		airInterfaceResponse = getResponseFromXml("GetAirRulesRS.xml");
		

		return airInterfaceResponse;
	}

	// Air get seat map
	@RequestMapping(value = "/airGetSeatMap", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AirBusinessServiceRS airGetSeatMap(@RequestBody final AirBusinessServiceRQ airInterfaceRQ) {
		AirBusinessServiceRS airInterfaceResponse ;
		OTAAirSeatMapRQ OtairSeatMapRQ = airInterfaceRQ.getRequestBody().getOTAAirSeatMapRQ();
		
		SeatMapRequests seatMapRequests = OtairSeatMapRQ.getSeatMapRequests();
		List<SeatMapRequest> seatMapRequestList = seatMapRequests.getSeatMapRequest();
		for (SeatMapRequest seatMapRequest : seatMapRequestList) {
			LOG.info("Departur time "+seatMapRequest.getFlightSegmentInfo().getDepartureDateTime());
		}
		
		airInterfaceResponse = getResponseFromAirXml("SeatMapRS.xml");
	
		return airInterfaceResponse;
	}

	// Air get seat map
	@RequestMapping(value = "/airCancel", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AirInterfaceRS airCancel(@RequestBody final AirInterfaceRQ airInterfaceRQ) {
		AirInterfaceRS airInterfaceResponse ;
		LOG.info("Supplier ID"+airInterfaceRQ);
		
		airInterfaceResponse = getResponseFromXml("CancelRS.xml");
		
		return airInterfaceResponse;
	}


	// Air PushSSR
	@RequestMapping(value = "/airSSR", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AirInterfaceRS airPushSSR(@RequestBody final AirInterfaceRQ airInterfaceRQ) {
		AirInterfaceRS airInterfaceResponse ;
		LOG.info("interface request"+airInterfaceRQ);

		
		airInterfaceResponse = getResponseFromXml("SSRRS.xml");
		
		return airInterfaceResponse;
	}

	// Air Push Seat 
	@RequestMapping(value = "/airpushSeatRequest", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AirInterfaceRS airPushSeatRequest(@RequestBody final AirInterfaceRQ airInterfaceRQ) {
		AirInterfaceRS airInterfaceResponse ;
		LOG.info("interface request"+airInterfaceRQ);
		
		airInterfaceResponse = getResponseFromXml("PushSeatRS.xml");
		return airInterfaceResponse;
	}

	// Air Split PNR 
	@RequestMapping(value = "/airSplitPNR", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AirInterfaceRS airSplitPNR(@RequestBody final AirInterfaceRQ airInterfaceRQ) {
		AirInterfaceRS airInterfaceResponse ;
		LOG.info("interface request"+airInterfaceRQ);

		
		airInterfaceResponse = getResponseFromXml("SplitPNRRS.xml");
		

		return airInterfaceResponse;
	}

	// Air getSSR
	@RequestMapping(value = "/airgetSSR", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AirInterfaceRS airgetSSR(@RequestBody final AirInterfaceRQ airInterfaceRQ) {
		AirInterfaceRS airInterfaceResponse;
		
		LOG.info("interface request"+airInterfaceRQ);
		
		airInterfaceResponse = getResponseFromXml("GetSSRRS.xml");
		
		return airInterfaceResponse;
	}
	
	// Air getSSR
		@RequestMapping(value = "/updatePNR", method = RequestMethod.POST)
		@ResponseStatus(HttpStatus.CREATED)
		@ResponseBody
		public AirInterfaceRS airUpdatePNR(@RequestBody final AirInterfaceRQ airInterfaceRQ) {
			AirInterfaceRS airInterfaceResponse ;
			
			LOG.info("interface request"+airInterfaceRQ);
			
			airInterfaceResponse = getResponseFromXml("UpdatePNRRS.xml");
			

			return airInterfaceResponse;
		}

	

	
	// Air Push OSi 
		@RequestMapping(value = "/airPushOsi", method = RequestMethod.POST)
		@ResponseStatus(HttpStatus.CREATED)
		@ResponseBody
		public AirInterfaceRS airPushOsi(@RequestBody final AirInterfaceRQ airInterfaceRQ) {
			AirInterfaceRS airInterfaceResponse;
			LOG.info("interface request"+airInterfaceRQ);
			
			airInterfaceResponse = getResponseFromXml("PushOsiRS.xml");
     		return airInterfaceResponse;
		}
		
		
		// Air Push OSi 
		@RequestMapping(value = "/airGetSession", method = RequestMethod.POST)
		@ResponseStatus(HttpStatus.CREATED)
		@ResponseBody
		public AirInterfaceRS airGetSession(@RequestBody final AirInterfaceRQ airInterfaceRQ) {
			AirInterfaceRS airInterfaceResponse ;
			LOG.info("interface request"+airInterfaceRQ);

			
			airInterfaceResponse = getResponseFromXml("SampleResponse.xml");
		
			return airInterfaceResponse;
		}
	
	// Air Push OSi
		@RequestMapping(value = "/airSessionLogout", method = RequestMethod.POST)
		@ResponseStatus(HttpStatus.CREATED)
		@ResponseBody
		public AirBusinessServiceRS airSessionLogout(@RequestBody final AirBusinessServiceRQ airInterfaceRQ) {
			AirBusinessServiceRS airInterfaceResponse ;
			LOG.info("interface request"+airInterfaceRQ);

			airInterfaceResponse = getResponseFromAirXml("SampleResponse.xml");
			

			return airInterfaceResponse;
		}

	// Air Queue Get PNR 
	@RequestMapping(value = "/airQueueGetPNR", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AirInterfaceRS  airQueueGetPNR(@RequestBody final AirInterfaceRQ  airInterfaceRQ) {
		AirInterfaceRS  airInterfaceResponse ;
		
		LOG.info("interface request"+airInterfaceRQ);
		
		airInterfaceResponse = getResponseFromXml("RetrievePNRRS.xml");
		

		return airInterfaceResponse;
	}

	// Air Queue Put PNR 
	@RequestMapping(value = "/airQueuePutPNR", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public AirInterfaceRS airQueuePutPNR(@RequestBody final AirInterfaceRQ airInterfaceRQ) {
		AirInterfaceRS airInterfaceResponse ;
		LOG.info("interface request"+airInterfaceRQ);

		
		airInterfaceResponse = getResponseFromXml("PutPNROnQueueRS.xml");
		
		return airInterfaceResponse;
	}

	public AirInterfaceRS getResponseFromXml(String xmlName)
	{
		AirInterfaceRS airInterfaceResponse = null;
		try {

			ClassLoader cl = getClass().getClassLoader();
			File file = new File(cl.getResource("AirXmls/"+xmlName).getFile());

			JAXBContext jaxbContext = JAXBContext.newInstance(AirInterfaceRS.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			airInterfaceResponse = (AirInterfaceRS) jaxbUnmarshaller.unmarshal(file);
			LOG.info("Air Response" + airInterfaceResponse);

		} catch (JAXBException e) {
			LOG.info("JAXB Exception"+e.getMessage(),e);
		}
		return airInterfaceResponse;
	}
	
	public AirBusinessServiceRS getResponseFromAirXml(String xmlName)
	{
		AirBusinessServiceRS airInterfaceResponse = null;
		try {

			ClassLoader cl = getClass().getClassLoader();
			File file = new File(cl.getResource("AirXmls/"+xmlName).getFile());

			JAXBContext jaxbContext = JAXBContext.newInstance(AirInterfaceRS.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			airInterfaceResponse = (AirBusinessServiceRS) jaxbUnmarshaller.unmarshal(file);
			LOG.info("Air Response" + airInterfaceResponse);

		} catch (JAXBException e) {
			LOG.info("JAXB Exception"+e.getMessage(),e);
		}
		return airInterfaceResponse;
	}
	
}
