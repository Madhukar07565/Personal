package com.cnk.travelogix.custom.zifws.account.clear;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.cnk.travelogix.sapintegrations.dto.factory.DTOObjectFactory;


/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * com.cnk.travelogix.custom.zifws.account.clear package.
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

	private final static QName _ZIffmAccountClear_QNAME = new QName("urn:sap-com:document:sap:soap:functions:mc-style",
			"ZIffmAccountClear");
	private final static QName _ZIffmAccountClearResponse_QNAME = new QName("urn:sap-com:document:sap:soap:functions:mc-style",
			"ZIffmAccountClearResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
	 * com.cnk.travelogix.custom.zifws.account.clear
	 *
	 */
	public ObjectFactory()
	{
	}

	/**
	 * Create an instance of {@link ZIffmAccountClear }
	 *
	 */
	public ZIffmAccountClear createZIffmAccountClear()
	{
		return new ZIffmAccountClear();
	}

	@XmlElementDecl(namespace = "urn:sap-com:document:sap:soap:functions:mc-style", name = "ZIffmAccountClear")
	public JAXBElement<ZIffmAccountClear> createZIffmAccountClear(final ZIffmAccountClear value)
	{
		return new JAXBElement<ZIffmAccountClear>(_ZIffmAccountClear_QNAME, ZIffmAccountClear.class, null, value);
	}

	/**
	 * Create an instance of {@link ZifstDocheadClear }
	 *
	 */
	public ZifstDocheadClear createZifstDocheadClear()
	{
		return new ZifstDocheadClear();
	}

	/**
	 * Create an instance of {@link TableOfZifstAccount }
	 *
	 */
	public TableOfZifstAccount createTableOfZifstAccount()
	{
		return new TableOfZifstAccount();
	}

	/**
	 * Create an instance of {@link ZIffmAccountClearResponse }
	 *
	 */
	public ZIffmAccountClearResponse createZIffmAccountClearResponse()
	{
		return new ZIffmAccountClearResponse();
	}

	@XmlElementDecl(namespace = "urn:sap-com:document:sap:soap:functions:mc-style", name = "ZIffmAccountClearResponse")
	public JAXBElement<ZIffmAccountClearResponse> createZIffmAccountClearResponse(final ZIffmAccountClearResponse value)
	{
		return new JAXBElement<ZIffmAccountClearResponse>(_ZIffmAccountClearResponse_QNAME, ZIffmAccountClearResponse.class, null,
				value);
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
	 * Create an instance of {@link ZifstStatusDoc }
	 *
	 */
	public ZifstStatusDoc createZifstStatusDoc()
	{
		return new ZifstStatusDoc();
	}

	/**
	 * Create an instance of {@link ZifstAccount }
	 *
	 */
	public ZifstAccount createZifstAccount()
	{
		return new ZifstAccount();
	}

}
