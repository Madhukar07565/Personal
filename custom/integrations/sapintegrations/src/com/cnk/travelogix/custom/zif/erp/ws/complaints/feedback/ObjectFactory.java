package com.cnk.travelogix.custom.zif.erp.ws.complaints.feedback;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.cnk.travelogix.sapintegrations.dto.factory.DTOObjectFactory;


/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * com.cnk.travelogix.custom.zif.erp.ws.complaints.feedback package.
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

	private final static QName _ZifTerpComplaints_QNAME = new QName("urn:sap-com:document:sap:rfc:functions", "ZifTerpComplaints");
	private final static QName _ZifTerpComplaintsResponse_QNAME = new QName("urn:sap-com:document:sap:rfc:functions",
			"ZifTerpComplaintsResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
	 * com.cnk.travelogix.custom.zif.erp.ws.complaints.feedback
	 *
	 */
	public ObjectFactory()
	{
	}

	/**
	 * Create an instance of {@link ZifTerpComplaintsStatus }
	 *
	 */
	public ZifTerpComplaintsStatus createZifTerpComplaintsStatus()
	{
		return new ZifTerpComplaintsStatus();
	}

	/**
	 * Create an instance of {@link ZifTerpComplaintsPartners }
	 *
	 */
	public ZifTerpComplaintsPartners createZifTerpComplaintsPartners()
	{
		return new ZifTerpComplaintsPartners();
	}

	/**
	 * Create an instance of {@link ZttTerpComplaintsItems }
	 *
	 */
	public ZttTerpComplaintsItems createZttTerpComplaintsItems()
	{
		return new ZttTerpComplaintsItems();
	}

	/**
	 * Create an instance of {@link ZttTerpComplaintsPartners }
	 *
	 */
	public ZttTerpComplaintsPartners createZttTerpComplaintsPartners()
	{
		return new ZttTerpComplaintsPartners();
	}

	/**
	 * Create an instance of {@link ZifTerpComplaintsItems }
	 *
	 */
	public ZifTerpComplaintsItems createZifTerpComplaintsItems()
	{
		return new ZifTerpComplaintsItems();
	}

	/**
	 * Create an instance of {@link ZifTerpComplaintsHeader }
	 *
	 */
	public ZifTerpComplaintsHeader createZifTerpComplaintsHeader()
	{
		return new ZifTerpComplaintsHeader();
	}

	/**
	 * Create an instance of {@link ZttTerpComplaintsStatus }
	 *
	 */
	public ZttTerpComplaintsStatus createZttTerpComplaintsStatus()
	{
		return new ZttTerpComplaintsStatus();
	}

	/**
	 * Create an instance of {@link ZifTerpComplaints }
	 *
	 */
	public ZifTerpComplaints createZifTerpComplaints()
	{
		return new ZifTerpComplaints();
	}

	@XmlElementDecl(namespace = "urn:sap-com:document:sap:rfc:functions", name = "ZifTerpComplaints")
	public JAXBElement<ZifTerpComplaints> createZifTerpComplaints(final ZifTerpComplaints value)
	{
		return new JAXBElement<ZifTerpComplaints>(_ZifTerpComplaints_QNAME, ZifTerpComplaints.class, null, value);
	}

	/**
	 * Create an instance of {@link ZifTerpComplaintsResponse }
	 *
	 */
	public ZifTerpComplaintsResponse createZifTerpComplaintsResponse()
	{
		return new ZifTerpComplaintsResponse();
	}

	@XmlElementDecl(namespace = "urn:sap-com:document:sap:rfc:functions", name = "ZifTerpComplaintsResponse")
	public JAXBElement<ZifTerpComplaintsResponse> createZifTerpComplaintsResponse(final ZifTerpComplaintsResponse value)
	{
		return new JAXBElement<ZifTerpComplaintsResponse>(_ZifTerpComplaintsResponse_QNAME, ZifTerpComplaintsResponse.class, null,
				value);
	}
}
