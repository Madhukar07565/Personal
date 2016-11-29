package com.cnk.travelogix.custom.zifwsb.inv.cancel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.cnk.travelogix.sapintegrations.dto.factory.DTOObjectFactory;


/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * com.cnk.travelogix.custom.zifwsb.inv.cancel package.
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

	private final static QName _ZIffmBillingdocCancel_QNAME = new QName("urn:sap-com:document:sap:soap:functions:mc-style",
			"ZIffmBillingdocCancel");
	private final static QName _ZIffmBillingdocCancelResponse_QNAME = new QName(
			"urn:sap-com:document:sap:soap:functions:mc-style", "ZIffmBillingdocCancelResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
	 * com.cnk.travelogix.custom.zifwsb.inv.cancel
	 *
	 */
	public ObjectFactory()
	{
	}

	/**
	 * Create an instance of {@link ZIffmBillingdocCancelResponse }
	 *
	 */
	public ZIffmBillingdocCancelResponse createZIffmBillingdocCancelResponse()
	{
		return new ZIffmBillingdocCancelResponse();
	}

	@XmlElementDecl(namespace = "urn:sap-com:document:sap:soap:functions:mc-style", name = "ZIffmBillingdocCancelResponse")
	public JAXBElement<ZIffmBillingdocCancelResponse> createZIffmBillingdocCancelResponse(final ZIffmBillingdocCancelResponse value)
	{
		return new JAXBElement<ZIffmBillingdocCancelResponse>(_ZIffmBillingdocCancelResponse_QNAME,
				ZIffmBillingdocCancelResponse.class, null, value);
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
	 * Create an instance of {@link ZIffmBillingdocCancel }
	 *
	 */
	public ZIffmBillingdocCancel createZIffmBillingdocCancel()
	{
		return new ZIffmBillingdocCancel();
	}

	@XmlElementDecl(namespace = "urn:sap-com:document:sap:soap:functions:mc-style", name = "ZIffmBillingdocCancel")
	public JAXBElement<ZIffmBillingdocCancel> createZIffmBillingdocCancel(final ZIffmBillingdocCancel value)
	{
		return new JAXBElement<ZIffmBillingdocCancel>(_ZIffmBillingdocCancel_QNAME, ZIffmBillingdocCancel.class, null, value);
	}

}
