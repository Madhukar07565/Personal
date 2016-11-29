package com.cnk.travelogix.custom.zif.erp.ws.custmastercreate.b2b;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.cnk.travelogix.sapintegrations.dto.factory.DTOObjectFactory;


/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * com.cnk.travelogix.custom.zifwsb.custmastercreate.b2b package.
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
	private final static QName _ZifTerpPartnerSave_B2B_QNAME = new QName("urn:sap-com:document:sap:rfc:functions",
			"ZifTerpPartnerSave_B2B");
	private final static QName _ZifTerpPartnerSave_B2BResponse_QNAME = new QName("urn:sap-com:document:sap:rfc:functions",
			"ZifTerpPartnerSave_B2BResponse");


	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
	 * com.cnk.travelogix.custom.zifwsb.custmastercreate.b2b
	 *
	 */
	public ObjectFactory()
	{
	}

	/**
	 * Create an instance of {@link ZifErpStStatusC }
	 *
	 */
	public ZifErpStStatusC createZifErpStStatusC()
	{
		return new ZifErpStStatusC();
	}

	/**
	 * Create an instance of {@link ZifErpStCustmast }
	 *
	 */
	public ZifErpStCustmast createZifErpStCustmast()
	{
		return new ZifErpStCustmast();
	}

	/**
	 * Create an instance of {@link ZifErpStContmast }
	 *
	 */
	public ZifErpStContmast createZifErpStContmast()
	{
		return new ZifErpStContmast();
	}

	/**
	 * Create an instance of {@link ZifErpTtContmast }
	 *
	 */
	public ZifErpTtContmast createZifErpTtContmast()
	{
		return new ZifErpTtContmast();
	}

	/**
	 * Create an instance of {@link ZifErpTtStatusC }
	 *
	 */
	public ZifErpTtStatusC createZifErpTtStatusC()
	{
		return new ZifErpTtStatusC();
	}

	/**
	 * Create an instance of {@link ZifTerpPartnerSaveB2B }
	 *
	 */
	public ZifTerpPartnerSaveB2B createZifTerpPartnerSaveB2B()
	{
		return new ZifTerpPartnerSaveB2B();
	}

	@XmlElementDecl(namespace = "urn:sap-com:document:sap:rfc:functions", name = "ZifTerpPartnerSave_B2B")
	public JAXBElement<ZifTerpPartnerSaveB2B> createZifTerpPartnerSaveB2B(final ZifTerpPartnerSaveB2B value)
	{
		return new JAXBElement<ZifTerpPartnerSaveB2B>(_ZifTerpPartnerSave_B2B_QNAME, ZifTerpPartnerSaveB2B.class, null, value);
	}

	/**
	 * Create an instance of {@link ZifTerpPartnerSaveB2BResponse }
	 *
	 */
	public ZifTerpPartnerSaveB2BResponse createZifTerpPartnerSaveB2BResponse()
	{
		return new ZifTerpPartnerSaveB2BResponse();
	}

	@XmlElementDecl(namespace = "urn:sap-com:document:sap:rfc:functions", name = "ZifTerpPartnerSave_B2BResponse")
	public JAXBElement<ZifTerpPartnerSaveB2BResponse> createZifTerpPartnerSaveB2BResponse(final ZifTerpPartnerSaveB2BResponse value)
	{
		return new JAXBElement<ZifTerpPartnerSaveB2BResponse>(_ZifTerpPartnerSave_B2BResponse_QNAME,
				ZifTerpPartnerSaveB2BResponse.class, null, value);
	}
}
