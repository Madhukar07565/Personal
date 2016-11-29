
package com.cnk.travelogix.custom.so.createchange;

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

	private final static QName _ZifTerpSalesOrder_QNAME = new QName("urn:sap-com:document:sap:rfc:functions", "ZifTerpSalesOrder");
	private final static QName _ZifTerpSalesOrderResponse_QNAME = new QName("urn:sap-com:document:sap:rfc:functions",
			"ZifTerpSalesOrderResponse");


	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
	 * com.cnk.travelogix.custom.order.createupdate
	 *
	 */
	public ObjectFactory()
	{
	}

	/**
	 * Create an instance of {@link ZifTerpSalesOrderResponse }
	 *
	 */
	public ZifTerpSalesOrderResponse createZifTerpSalesOrderResponse()
	{
		return new ZifTerpSalesOrderResponse();
	}

	@XmlElementDecl(namespace = "urn:sap-com:document:sap:rfc:functions", name = "ZifTerpSalesOrderResponse")
	public JAXBElement<ZifTerpSalesOrderResponse> createZifTerpSalesOrderResponse(final ZifTerpSalesOrderResponse value)
	{
		return new JAXBElement<ZifTerpSalesOrderResponse>(_ZifTerpSalesOrderResponse_QNAME, ZifTerpSalesOrderResponse.class, null,
				value);
	}

	/**
	 * Create an instance of {@link ZttTerpSoStatus }
	 *
	 */
	public ZttTerpSoStatus createZttTerpSoStatus()
	{
		return new ZttTerpSoStatus();
	}

	/**
	 * Create an instance of {@link ZifTerpSalesOrder }
	 *
	 */
	public ZifTerpSalesOrder createZifTerpSalesOrder()
	{
		return new ZifTerpSalesOrder();
	}

	@XmlElementDecl(namespace = "urn:sap-com:document:sap:rfc:functions", name = "ZifTerpSalesOrder")
	public JAXBElement<ZifTerpSalesOrder> createZifTerpSalesOrder(final ZifTerpSalesOrder value)
	{
		return new JAXBElement<ZifTerpSalesOrder>(_ZifTerpSalesOrder_QNAME, ZifTerpSalesOrder.class, null, value);
	}

	/**
	 * Create an instance of {@link ZttTerpSoConditions }
	 *
	 */
	public ZttTerpSoConditions createZttTerpSoConditions()
	{
		return new ZttTerpSoConditions();
	}

	/**
	 * Create an instance of {@link ZifTerpSoHeader }
	 *
	 */
	public ZifTerpSoHeader createZifTerpSoHeader()
	{
		return new ZifTerpSoHeader();
	}

	/**
	 * Create an instance of {@link ZttTerpSoItemData }
	 *
	 */
	public ZttTerpSoItemData createZttTerpSoItemData()
	{
		return new ZttTerpSoItemData();
	}

	/**
	 * Create an instance of {@link ZttTerpSoPartners }
	 *
	 */
	public ZttTerpSoPartners createZttTerpSoPartners()
	{
		return new ZttTerpSoPartners();
	}

	/**
	 * Create an instance of {@link ZifTerpSoItem }
	 *
	 */
	public ZifTerpSoItem createZifTerpSoItem()
	{
		return new ZifTerpSoItem();
	}

	/**
	 * Create an instance of {@link ZifTerpSoStatus }
	 *
	 */
	public ZifTerpSoStatus createZifTerpSoStatus()
	{
		return new ZifTerpSoStatus();
	}

	/**
	 * Create an instance of {@link ZifTerpSoConditions }
	 *
	 */
	public ZifTerpSoConditions createZifTerpSoConditions()
	{
		return new ZifTerpSoConditions();
	}

	/**
	 * Create an instance of {@link ZIfTerpSoPartners }
	 *
	 */
	public ZIfTerpSoPartners createZIfTerpSoPartners()
	{
		return new ZIfTerpSoPartners();
	}

}
