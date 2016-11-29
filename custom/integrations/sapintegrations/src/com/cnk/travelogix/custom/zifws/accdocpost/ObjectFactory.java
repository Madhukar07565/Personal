
package com.cnk.travelogix.custom.zifws.accdocpost;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.cnk.travelogix.sapintegrations.dto.factory.DTOObjectFactory;


/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * com.cnk.travelogix.zifws.accdocpost package.
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

	private final static QName _AccDocRequest_QNAME = new QName("urn:sap-com:document:sap:soap:functions:mc-style",
			"ZIffmAccountDocument");
	private final static QName _AccDocResponse_QNAME = new QName("urn:sap-com:document:sap:soap:functions:mc-style",
			"ZIffmAccountDocumentResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
	 * com.cnk.travelogix.zifws.accdocpost
	 *
	 */
	public ObjectFactory()
	{
	}

	/**
	 * Create an instance of {@link ZIffmAccountDocumentResponse }
	 *
	 */
	public ZIffmAccountDocumentResponse createZIffmAccountDocumentResponse()
	{
		return new ZIffmAccountDocumentResponse();
	}

	@XmlElementDecl(namespace = "urn:sap-com:document:sap:soap:functions:mc-style", name = "ZIffmAccountDocumentResponse")
	public JAXBElement<ZIffmAccountDocumentResponse> createZIffmAccountDocumentResponse(final ZIffmAccountDocumentResponse value)
	{
		return new JAXBElement<ZIffmAccountDocumentResponse>(_AccDocResponse_QNAME, ZIffmAccountDocumentResponse.class, null, value);
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
	 * Create an instance of {@link TableOfZifstGlacc }
	 *
	 */
	public TableOfZifstGlacc createTableOfZifstGlacc()
	{
		return new TableOfZifstGlacc();
	}

	/**
	 * Create an instance of {@link TableOfZifstCustomer }
	 *
	 */
	public TableOfZifstCustomer createTableOfZifstCustomer()
	{
		return new TableOfZifstCustomer();
	}

	/**
	 * Create an instance of {@link TableOfZifstVendor }
	 *
	 */
	public TableOfZifstVendor createTableOfZifstVendor()
	{
		return new TableOfZifstVendor();
	}

	/**
	 * Create an instance of {@link ZIffmAccountDocument }
	 *
	 */
	public ZIffmAccountDocument createZIffmAccountDocument()
	{
		return new ZIffmAccountDocument();
	}

	@XmlElementDecl(namespace = "urn:sap-com:document:sap:soap:functions:mc-style", name = "ZIffmAccountDocument")
	public JAXBElement<ZIffmAccountDocument> createZIffmAccountDocument(final ZIffmAccountDocument value)
	{
		return new JAXBElement<ZIffmAccountDocument>(_AccDocRequest_QNAME, ZIffmAccountDocument.class, null, value);
	}

	/**
	 * Create an instance of {@link ZifstDochead }
	 *
	 */
	public ZifstDochead createZifstDochead()
	{
		return new ZifstDochead();
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
	 * Create an instance of {@link ZifstGlacc }
	 *
	 */
	public ZifstGlacc createZifstGlacc()
	{
		return new ZifstGlacc();
	}

	/**
	 * Create an instance of {@link ZifstVendor }
	 *
	 */
	public ZifstVendor createZifstVendor()
	{
		return new ZifstVendor();
	}

	/**
	 * Create an instance of {@link ZifstCustomer }
	 *
	 */
	public ZifstCustomer createZifstCustomer()
	{
		return new ZifstCustomer();
	}

}
