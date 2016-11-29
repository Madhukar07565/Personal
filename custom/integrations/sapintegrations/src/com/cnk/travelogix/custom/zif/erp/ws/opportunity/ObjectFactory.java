package com.cnk.travelogix.custom.zif.erp.ws.opportunity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.cnk.travelogix.sapintegrations.dto.factory.DTOObjectFactory;


/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * com.cnk.travelogix.custom.zif.erp.ws.opportunity package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content.
 * The Java representation of XML content can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in
 * this class.
 *
 */
@XmlRegistry
public class ObjectFactory implements DTOObjectFactory
{
	private final static QName _ZifTerpOpportunity_QNAME = new QName("urn:sap-com:document:sap:rfc:functions",
			"ZifTerpOpportunity");
	private final static QName _ZifTerpOpportunityResponse_QNAME = new QName("urn:sap-com:document:sap:rfc:functions",
			"ZifTerpOpportunityResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
	 * com.cnk.travelogix.custom.zif.erp.ws.opportunity
	 *
	 */
	public ObjectFactory()
	{
	}

	/**
	 * Create an instance of {@link ZifTerpOpportunity }
	 *
	 */
	public ZifTerpOpportunity createZifTerpOpportunity()
	{
		return new ZifTerpOpportunity();
	}

	@XmlElementDecl(namespace = "urn:sap-com:document:sap:rfc:functions", name = "ZifTerpOpportunity")
	public JAXBElement<ZifTerpOpportunity> createZifTerpOpportunity(final ZifTerpOpportunity value)
	{
		return new JAXBElement<ZifTerpOpportunity>(_ZifTerpOpportunity_QNAME, ZifTerpOpportunity.class, null, value);
	}

	/**
	 * Create an instance of {@link ZifTerpOppHeader }
	 *
	 */
	public ZifTerpOppHeader createZifTerpOppHeader()
	{
		return new ZifTerpOppHeader();
	}

	/**
	 * Create an instance of {@link ZttTerpOppItemData }
	 *
	 */
	public ZttTerpOppItemData createZttTerpOppItemData()
	{
		return new ZttTerpOppItemData();
	}

	/**
	 * Create an instance of {@link ZttTerpOppPartner }
	 *
	 */
	public ZttTerpOppPartner createZttTerpOppPartner()
	{
		return new ZttTerpOppPartner();
	}

	/**
	 * Create an instance of {@link ZifProdCatAccommodation }
	 *
	 */
	public ZifProdCatAccommodation createZifProdCatAccommodation()
	{
		return new ZifProdCatAccommodation();
	}

	/**
	 * Create an instance of {@link ZifProdCatActivities }
	 *
	 */
	public ZifProdCatActivities createZifProdCatActivities()
	{
		return new ZifProdCatActivities();
	}

	/**
	 * Create an instance of {@link ZifProdCatAircraft }
	 *
	 */
	public ZifProdCatAircraft createZifProdCatAircraft()
	{
		return new ZifProdCatAircraft();
	}

	/**
	 * Create an instance of {@link ZifProdCatBus }
	 *
	 */
	public ZifProdCatBus createZifProdCatBus()
	{
		return new ZifProdCatBus();
	}

	/**
	 * Create an instance of {@link ZifProdCatCruise }
	 *
	 */
	public ZifProdCatCruise createZifProdCatCruise()
	{
		return new ZifProdCatCruise();
	}

	/**
	 * Create an instance of {@link ZifProdCatFlights }
	 *
	 */
	public ZifProdCatFlights createZifProdCatFlights()
	{
		return new ZifProdCatFlights();
	}

	/**
	 * Create an instance of {@link ZifProdCatForex }
	 *
	 */
	public ZifProdCatForex createZifProdCatForex()
	{
		return new ZifProdCatForex();
	}

	/**
	 * Create an instance of {@link ZifProdCatHolidays }
	 *
	 */
	public ZifProdCatHolidays createZifProdCatHolidays()
	{
		return new ZifProdCatHolidays();
	}

	/**
	 * Create an instance of {@link ZifProdCatInsurance }
	 *
	 */
	public ZifProdCatInsurance createZifProdCatInsurance()
	{
		return new ZifProdCatInsurance();
	}

	/**
	 * Create an instance of {@link ZifProdCatMotorBike }
	 *
	 */
	public ZifProdCatMotorBike createZifProdCatMotorBike()
	{
		return new ZifProdCatMotorBike();
	}

	/**
	 * Create an instance of {@link ZifProdCatRail }
	 *
	 */
	public ZifProdCatRail createZifProdCatRail()
	{
		return new ZifProdCatRail();
	}

	/**
	 * Create an instance of {@link ZifProdRvSbTuktukLimousin }
	 *
	 */
	public ZifProdRvSbTuktukLimousin createZifProdRvSbTuktukLimousin()
	{
		return new ZifProdRvSbTuktukLimousin();
	}

	/**
	 * Create an instance of {@link ZifProdCatVehicleRental }
	 *
	 */
	public ZifProdCatVehicleRental createZifProdCatVehicleRental()
	{
		return new ZifProdCatVehicleRental();
	}

	/**
	 * Create an instance of {@link ZifProdCatVehSelfDrive }
	 *
	 */
	public ZifProdCatVehSelfDrive createZifProdCatVehSelfDrive()
	{
		return new ZifProdCatVehSelfDrive();
	}

	/**
	 * Create an instance of {@link ZifProdCatVehicleTransfer }
	 *
	 */
	public ZifProdCatVehicleTransfer createZifProdCatVehicleTransfer()
	{
		return new ZifProdCatVehicleTransfer();
	}

	/**
	 * Create an instance of {@link ZifProdCatVisa }
	 *
	 */
	public ZifProdCatVisa createZifProdCatVisa()
	{
		return new ZifProdCatVisa();
	}

	/**
	 * Create an instance of {@link ZifTerpOpportunityResponse }
	 *
	 */
	public ZifTerpOpportunityResponse createZifTerpOpportunityResponse()
	{
		return new ZifTerpOpportunityResponse();
	}

	@XmlElementDecl(namespace = "urn:sap-com:document:sap:rfc:functions", name = "ZifTerpOpportunityResponse")
	public JAXBElement<ZifTerpOpportunityResponse> createZifTerpOpportunityResponse(final ZifTerpOpportunityResponse value)
	{
		return new JAXBElement<ZifTerpOpportunityResponse>(_ZifTerpOpportunityResponse_QNAME, ZifTerpOpportunityResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link ZttStatusOpp }
	 *
	 */
	public ZttStatusOpp createZttStatusOpp()
	{
		return new ZttStatusOpp();
	}

	/**
	 * Create an instance of {@link ZifTerpOppItemData }
	 *
	 */
	public ZifTerpOppItemData createZifTerpOppItemData()
	{
		return new ZifTerpOppItemData();
	}

	/**
	 * Create an instance of {@link ZifstStatusOpp }
	 *
	 */
	public ZifstStatusOpp createZifstStatusOpp()
	{
		return new ZifstStatusOpp();
	}

	/**
	 * Create an instance of {@link ZifTerpOppPartner }
	 *
	 */
	public ZifTerpOppPartner createZifTerpOppPartner()
	{
		return new ZifTerpOppPartner();
	}

}
