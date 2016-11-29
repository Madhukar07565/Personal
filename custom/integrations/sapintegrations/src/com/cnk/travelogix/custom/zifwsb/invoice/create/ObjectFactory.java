
package com.cnk.travelogix.custom.zifwsb.invoice.create;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.cnk.travelogix.sapintegrations.dto.factory.DTOObjectFactory;


/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * com.cnk.client package.
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
	private final static QName ZIFWSINVOICECREATE_QNAME = new QName("urn:sap-com:document:sap:soap:functions:mc-style",
			"ZIffmBillDocCreate");
	private final static QName ZIFWSINVOICECREATE_RESPONSE_QNAME = new QName("urn:sap-com:document:sap:soap:functions:mc-style",
			"ZIffmBillDocCreateResponse");


	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
	 * com.cnk.client
	 *
	 */
	public ObjectFactory()
	{
	}

	/**
	 * Create an instance of {@link ZIffmBillDocCreate }
	 *
	 */
	public ZIffmBillDocCreate createZIffmBillDocCreate()
	{
		return new ZIffmBillDocCreate();
	}

	/**
	 * Create an instance of {@link ZttBilldoc }
	 *
	 */
	public ZttBilldoc createZttBilldoc()
	{
		return new ZttBilldoc();
	}

	/**
	 * Create an instance of {@link ZIffmBillDocCreateResponse }
	 *
	 */
	public ZIffmBillDocCreateResponse createZIffmBillDocCreateResponse()
	{
		return new ZIffmBillDocCreateResponse();
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
	 * Create an instance of {@link ZifstBilldoc }
	 *
	 */
	public ZifstBilldoc createZifstBilldoc()
	{
		return new ZifstBilldoc();
	}

	@XmlElementDecl(namespace = "urn:sap-com:document:sap:soap:functions:mc-style", name = "ZIffmBillDocCreate")
	public JAXBElement<ZIffmBillDocCreate> createZIffmInvoice(final ZIffmBillDocCreate value)
	{
		return new JAXBElement<ZIffmBillDocCreate>(ZIFWSINVOICECREATE_QNAME, ZIffmBillDocCreate.class, null, value);
	}

	@XmlElementDecl(namespace = "urn:sap-com:document:sap:soap:functions:mc-style", name = "ZIffmBillDocCreateResponse")
	public JAXBElement<ZIffmBillDocCreateResponse> createZIffmInvoiceSaveResponse(final ZIffmBillDocCreateResponse value)
	{
		return new JAXBElement<ZIffmBillDocCreateResponse>(ZIFWSINVOICECREATE_RESPONSE_QNAME, ZIffmBillDocCreateResponse.class,
				null, value);
	}

}
