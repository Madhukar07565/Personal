
package com.cnk.travelogix.custom.zif.erp.ws.custmastercreate;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.cnk.travelogix.sapintegrations.dto.factory.DTOObjectFactory;

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cnk.travelogix.custom.zif.erp.ws.custmastercreate package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory implements DTOObjectFactory
{

	private final static QName _ZifTerpCustomerCreate_QNAME = new QName("urn:sap-com:document:sap:soap:functions:mc-style",
			"ZifTerpPartnerSave");
	private final static QName _ZifTerpCustomerCreateResponse_QNAME = new QName(
			"urn:sap-com:document:sap:soap:functions:mc-style", "ZifTerpPartnerSaveResponse");


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cnk.travelogix.custom.zif.erp.ws.custmastercreate
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ZifTerpPartnerSave }
     * 
     */
    public ZifTerpPartnerSave createZifTerpPartnerSave() {
        return new ZifTerpPartnerSave();
    }

    /**
     * Create an instance of {@link ZifErpTtContmast }
     * 
     */
    public ZifErpTtContmast createZifErpTtContmast() {
        return new ZifErpTtContmast();
    }

    /**
     * Create an instance of {@link ZifErpStCustmast }
     * 
     */
    public ZifErpStCustmast createZifErpStCustmast() {
        return new ZifErpStCustmast();
    }

    /**
     * Create an instance of {@link ZifTerpPartnerSaveResponse }
     * 
     */
    public ZifTerpPartnerSaveResponse createZifTerpPartnerSaveResponse() {
        return new ZifTerpPartnerSaveResponse();
    }

    /**
     * Create an instance of {@link ZifErpTtStatusC }
     * 
     */
    public ZifErpTtStatusC createZifErpTtStatusC() {
        return new ZifErpTtStatusC();
    }

    /**
     * Create an instance of {@link ZifErpStStatusC }
     * 
     */
    public ZifErpStStatusC createZifErpStStatusC() {
        return new ZifErpStStatusC();
    }

    /**
     * Create an instance of {@link ZifErpStContmast }
     * 
     */
    public ZifErpStContmast createZifErpStContmast() {
        return new ZifErpStContmast();
    }

	@XmlElementDecl(namespace = "urn:sap-com:document:sap:soap:functions:mc-style", name = "ZifTerpPartnerSave")
	public JAXBElement<ZifTerpPartnerSave> createZifTerpPartnerSave(final ZifTerpPartnerSave value)
	{
		return new JAXBElement<ZifTerpPartnerSave>(_ZifTerpCustomerCreate_QNAME, ZifTerpPartnerSave.class, null, value);
	}


	@XmlElementDecl(namespace = "urn:sap-com:document:sap:soap:functions:mc-style", name = "ZifTerpPartnerSaveResponse")
	public JAXBElement<ZifTerpPartnerSaveResponse> createZifTerpPartnerSaveResponse(final ZifTerpPartnerSaveResponse value)
	{
		return new JAXBElement<ZifTerpPartnerSaveResponse>(_ZifTerpCustomerCreateResponse_QNAME, ZifTerpPartnerSaveResponse.class,
				null, value);
	}
}
