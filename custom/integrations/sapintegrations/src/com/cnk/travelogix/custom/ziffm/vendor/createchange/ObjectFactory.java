
package com.cnk.travelogix.custom.ziffm.vendor.createchange;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.cnk.travelogix.sapintegrations.dto.factory.DTOObjectFactory;


/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * com.cnk.travelogix.custom.order.createupdate package.
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

	private final static QName _ZiffmVendorCreateChange_QNAME = new QName("urn:sap-com:document:sap:soap:functions:mc-style",
			"ZVendorCreateChangeService");
	private final static QName _ZiffmVendorCreateChangeResponse_QNAME = new QName(
			"urn:sap-com:document:sap:soap:functions:mc-style", "ZVendorCreateChangeServiceResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
	 * com.cnk.travelogix.custom.order.createupdate
	 *
	 */
	public ObjectFactory()
	{
	}

	/**
	 * Create an instance of {@link ZVendorCreateChangeServiceResponse }
	 *
	 */
	public ZVendorCreateChangeServiceResponse createZVendorCreateChangeServiceResponse()
	{
		return new ZVendorCreateChangeServiceResponse();
	}

	@XmlElementDecl(namespace = "urn:sap-com:document:sap:soap:functions:mc-style", name = "ZVendorCreateChangeServiceResponse")
	public JAXBElement<ZVendorCreateChangeServiceResponse> createZVendorCreateChangeServiceResponse(
			final ZVendorCreateChangeServiceResponse value)
	{
		return new JAXBElement<ZVendorCreateChangeServiceResponse>(_ZiffmVendorCreateChangeResponse_QNAME,
				ZVendorCreateChangeServiceResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link ZifttStatusDoc }
	 *
	 */
	public ZifttStatusDoc createZifttStatusDoc()
	{
		return new ZifttStatusDoc();
	}

	/**
	 * Create an instance of {@link ZVendorCreateChangeService }
	 *
	 */
	public ZVendorCreateChangeService createZVendorCreateChangeService()
	{
		return new ZVendorCreateChangeService();
	}

	@XmlElementDecl(namespace = "urn:sap-com:document:sap:soap:functions:mc-style", name = "ZVendorCreateChangeService")
	public JAXBElement<ZVendorCreateChangeService> createZVendorCreateChangeService(final ZVendorCreateChangeService value)
	{
		return new JAXBElement<ZVendorCreateChangeService>(_ZiffmVendorCreateChange_QNAME, ZVendorCreateChangeService.class, null,
				value);
	}

	/**
	 * Create an instance of {@link ZvendorInput }
	 *
	 */
	public ZvendorInput createZvendorInput()
	{
		return new ZvendorInput();
	}

	/**
	 * Create an instance of {@link ZifstStatusDoc }
	 *
	 */
	public ZifstStatusDoc createZifstStatusDoc()
	{
		return new ZifstStatusDoc();
	}

	/**
	 * Create an instance of {@link ZbankDetailTt }
	 *
	 */
	public ZbankDetailTt createZbankDetailTt()
	{
		return new ZbankDetailTt();
	}

	/**
	 * Create an instance of {@link ZbankDetail }
	 *
	 */
	public ZbankDetail createZbankDetail()
	{
		return new ZbankDetail();
	}

}
