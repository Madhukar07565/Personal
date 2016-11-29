
package com.cnk.travelogix.custom.mappingtable.maintain;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.cnk.travelogix.sapintegrations.dto.factory.DTOObjectFactory;


/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * com.cnk.travelogix.custom.subscriber.mappingtblmgmt package.
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

	private final static QName _MappingTableCreateResponse_QNAME = new QName(
			"http://schema.subscribermappingtablemanagement.ws.highdeal.com/", "mappingTableCreateResponse");
	private final static QName _MappingTableMaintainResponse_QNAME = new QName(
			"http://schema.subscribermappingtablemanagement.ws.highdeal.com/", "mappingTableMaintainResponse");
	private final static QName _MappingTableMaintainRequest_QNAME = new QName(
			"http://schema.subscribermappingtablemanagement.ws.highdeal.com/", "mappingTableMaintainRequest");
	private final static QName _MappingTableCreateRequest_QNAME = new QName(
			"http://schema.subscribermappingtablemanagement.ws.highdeal.com/", "mappingTableCreateRequest");
	private final static QName _MappingTableFindRequest_QNAME = new QName(
			"http://schema.subscribermappingtablemanagement.ws.highdeal.com/", "mappingTableFindRequest");
	private final static QName _MappingTableRowMaintainRequest_QNAME = new QName(
			"http://schema.subscribermappingtablemanagement.ws.highdeal.com/", "mappingTableRowMaintainRequest");
	private final static QName _MappingTableRowCancelRequest_QNAME = new QName(
			"http://schema.subscribermappingtablemanagement.ws.highdeal.com/", "mappingTableRowCancelRequest");
	private final static QName _MappingTableCancelRequest_QNAME = new QName(
			"http://schema.subscribermappingtablemanagement.ws.highdeal.com/", "mappingTableCancelRequest");
	private final static QName _MappingTableRowMaintainResponse_QNAME = new QName(
			"http://schema.subscribermappingtablemanagement.ws.highdeal.com/", "mappingTableRowMaintainResponse");
	private final static QName _MappingTableCancelResponse_QNAME = new QName(
			"http://schema.subscribermappingtablemanagement.ws.highdeal.com/", "mappingTableCancelResponse");
	private final static QName _MappingTableFindResponse_QNAME = new QName(
			"http://schema.subscribermappingtablemanagement.ws.highdeal.com/", "mappingTableFindResponse");
	private final static QName _MappingTableRowCancelResponse_QNAME = new QName(
			"http://schema.subscribermappingtablemanagement.ws.highdeal.com/", "mappingTableRowCancelResponse");
	private final static QName _MappingTableClassOutputColumnNumber_QNAME = new QName("", "number");
	private final static QName _MappingTableClassOutputColumnString_QNAME = new QName("", "string");
	private final static QName _MappingTableClassInputColumnCurrency_QNAME = new QName("", "currency");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
	 * com.cnk.travelogix.custom.subscriber.mappingtblmgmt
	 * 
	 */
	public ObjectFactory()
	{
	}

	/**
	 * Create an instance of {@link FindMappingTableResponse }
	 * 
	 */
	public FindMappingTableResponse createFindMappingTableResponse()
	{
		return new FindMappingTableResponse();
	}

	/**
	 * Create an instance of {@link MappingTableRowOperationResponse }
	 * 
	 */
	public MappingTableRowOperationResponse createMappingTableRowOperationResponse()
	{
		return new MappingTableRowOperationResponse();
	}

	/**
	 * Create an instance of {@link MappingTableOperationResponse }
	 * 
	 */
	public MappingTableOperationResponse createMappingTableOperationResponse()
	{
		return new MappingTableOperationResponse();
	}

	/**
	 * Create an instance of {@link CancelMappingTableRequest }
	 * 
	 */
	public CancelMappingTableRequest createCancelMappingTableRequest()
	{
		return new CancelMappingTableRequest();
	}

	/**
	 * Create an instance of {@link CancelMappingTableRowRequest }
	 * 
	 */
	public CancelMappingTableRowRequest createCancelMappingTableRowRequest()
	{
		return new CancelMappingTableRowRequest();
	}

	/**
	 * Create an instance of {@link FindMappingTableRequest }
	 * 
	 */
	public FindMappingTableRequest createFindMappingTableRequest()
	{
		return new FindMappingTableRequest();
	}

	/**
	 * Create an instance of {@link MaintainMappingTableRowRequest }
	 * 
	 */
	public MaintainMappingTableRowRequest createMaintainMappingTableRowRequest()
	{
		return new MaintainMappingTableRowRequest();
	}

	/**
	 * Create an instance of {@link CreateMappingTableRequest }
	 * 
	 */
	public CreateMappingTableRequest createCreateMappingTableRequest()
	{
		return new CreateMappingTableRequest();
	}

	/**
	 * Create an instance of {@link MaintainMappingTableRequest }
	 * 
	 */
	public MaintainMappingTableRequest createMaintainMappingTableRequest()
	{
		return new MaintainMappingTableRequest();
	}

	/**
	 * Create an instance of {@link MappingTableSearchFilter }
	 * 
	 */
	public MappingTableSearchFilter createMappingTableSearchFilter()
	{
		return new MappingTableSearchFilter();
	}

	/**
	 * Create an instance of {@link PositiveAmount }
	 * 
	 */
	public PositiveAmount createPositiveAmount()
	{
		return new PositiveAmount();
	}

	/**
	 * Create an instance of {@link NullableString }
	 * 
	 */
	public NullableString createNullableString()
	{
		return new NullableString();
	}

	/**
	 * Create an instance of {@link SearchFilterWindow }
	 * 
	 */
	public SearchFilterWindow createSearchFilterWindow()
	{
		return new SearchFilterWindow();
	}

	/**
	 * Create an instance of {@link SearchFilter }
	 * 
	 */
	public SearchFilter createSearchFilter()
	{
		return new SearchFilter();
	}

	/**
	 * Create an instance of {@link NumberEnumeration }
	 * 
	 */
	public NumberEnumeration createNumberEnumeration()
	{
		return new NumberEnumeration();
	}

	/**
	 * Create an instance of {@link DateEnumeration }
	 * 
	 */
	public DateEnumeration createDateEnumeration()
	{
		return new DateEnumeration();
	}

	/**
	 * Create an instance of {@link DateRange }
	 * 
	 */
	public DateRange createDateRange()
	{
		return new DateRange();
	}

	/**
	 * Create an instance of {@link MassResponse }
	 * 
	 */
	public MassResponse createMassResponse()
	{
		return new MassResponse();
	}

	/**
	 * Create an instance of {@link DateAttributeDescription }
	 * 
	 */
	public DateAttributeDescription createDateAttributeDescription()
	{
		return new DateAttributeDescription();
	}

	/**
	 * Create an instance of {@link AdditionalAttributeDescription }
	 * 
	 */
	public AdditionalAttributeDescription createAdditionalAttributeDescription()
	{
		return new AdditionalAttributeDescription();
	}

	/**
	 * Create an instance of {@link Failure }
	 * 
	 */
	public Failure createFailure()
	{
		return new Failure();
	}

	/**
	 * Create an instance of {@link AdditionalInfo }
	 * 
	 */
	public AdditionalInfo createAdditionalInfo()
	{
		return new AdditionalInfo();
	}

	/**
	 * Create an instance of {@link StringAttributeDescription }
	 * 
	 */
	public StringAttributeDescription createStringAttributeDescription()
	{
		return new StringAttributeDescription();
	}

	/**
	 * Create an instance of {@link IntegerRange }
	 * 
	 */
	public IntegerRange createIntegerRange()
	{
		return new IntegerRange();
	}

	/**
	 * Create an instance of {@link IntegerBoundary }
	 * 
	 */
	public IntegerBoundary createIntegerBoundary()
	{
		return new IntegerBoundary();
	}

	/**
	 * Create an instance of {@link Amount }
	 * 
	 */
	public Amount createAmount()
	{
		return new Amount();
	}

	/**
	 * Create an instance of {@link NumberAttributeDescription }
	 * 
	 */
	public NumberAttributeDescription createNumberAttributeDescription()
	{
		return new NumberAttributeDescription();
	}

	/**
	 * Create an instance of {@link NumberBoundary }
	 * 
	 */
	public NumberBoundary createNumberBoundary()
	{
		return new NumberBoundary();
	}

	/**
	 * Create an instance of {@link SearchResponse }
	 * 
	 */
	public SearchResponse createSearchResponse()
	{
		return new SearchResponse();
	}

	/**
	 * Create an instance of {@link Response }
	 * 
	 */
	public Response createResponse()
	{
		return new Response();
	}

	/**
	 * Create an instance of {@link NumberRange }
	 * 
	 */
	public NumberRange createNumberRange()
	{
		return new NumberRange();
	}

	/**
	 * Create an instance of {@link StringEnumeration }
	 * 
	 */
	public StringEnumeration createStringEnumeration()
	{
		return new StringEnumeration();
	}

	/**
	 * Create an instance of {@link NullableFlag }
	 * 
	 */
	public NullableFlag createNullableFlag()
	{
		return new NullableFlag();
	}

	/**
	 * Create an instance of {@link DateBoundary }
	 * 
	 */
	public DateBoundary createDateBoundary()
	{
		return new DateBoundary();
	}

	/**
	 * Create an instance of {@link FailureCause }
	 * 
	 */
	public FailureCause createFailureCause()
	{
		return new FailureCause();
	}

	/**
	 * Create an instance of {@link NullableDate }
	 * 
	 */
	public NullableDate createNullableDate()
	{
		return new NullableDate();
	}

	/**
	 * Create an instance of {@link SubscriberMappingTable }
	 * 
	 */
	public SubscriberMappingTable createSubscriberMappingTable()
	{
		return new SubscriberMappingTable();
	}

	/**
	 * Create an instance of {@link MappingTableClassOutputColumn }
	 * 
	 */
	public MappingTableClassOutputColumn createMappingTableClassOutputColumn()
	{
		return new MappingTableClassOutputColumn();
	}

	/**
	 * Create an instance of {@link MappingTable }
	 * 
	 */
	public MappingTable createMappingTable()
	{
		return new MappingTable();
	}

	/**
	 * Create an instance of {@link MappingTableColumn }
	 * 
	 */
	public MappingTableColumn createMappingTableColumn()
	{
		return new MappingTableColumn();
	}

	/**
	 * Create an instance of {@link MappingTableClass }
	 * 
	 */
	public MappingTableClass createMappingTableClass()
	{
		return new MappingTableClass();
	}

	/**
	 * Create an instance of {@link MappingTableClassInputColumn }
	 * 
	 */
	public MappingTableClassInputColumn createMappingTableClassInputColumn()
	{
		return new MappingTableClassInputColumn();
	}

	/**
	 * Create an instance of {@link MappingTableRow }
	 * 
	 */
	public MappingTableRow createMappingTableRow()
	{
		return new MappingTableRow();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MappingTableOperationResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://schema.subscribermappingtablemanagement.ws.highdeal.com/", name = "mappingTableCreateResponse")
	public JAXBElement<MappingTableOperationResponse> createMappingTableCreateResponse(final MappingTableOperationResponse value)
	{
		return new JAXBElement<MappingTableOperationResponse>(_MappingTableCreateResponse_QNAME,
				MappingTableOperationResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MappingTableOperationResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://schema.subscribermappingtablemanagement.ws.highdeal.com/", name = "mappingTableMaintainResponse")
	public JAXBElement<MappingTableOperationResponse> createMappingTableMaintainResponse(final MappingTableOperationResponse value)
	{
		return new JAXBElement<MappingTableOperationResponse>(_MappingTableMaintainResponse_QNAME,
				MappingTableOperationResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MaintainMappingTableRequest }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://schema.subscribermappingtablemanagement.ws.highdeal.com/", name = "mappingTableMaintainRequest")
	public JAXBElement<MaintainMappingTableRequest> createMappingTableMaintainRequest(final MaintainMappingTableRequest value)
	{
		return new JAXBElement<MaintainMappingTableRequest>(_MappingTableMaintainRequest_QNAME, MaintainMappingTableRequest.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link CreateMappingTableRequest }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://schema.subscribermappingtablemanagement.ws.highdeal.com/", name = "mappingTableCreateRequest")
	public JAXBElement<CreateMappingTableRequest> createMappingTableCreateRequest(final CreateMappingTableRequest value)
	{
		return new JAXBElement<CreateMappingTableRequest>(_MappingTableCreateRequest_QNAME, CreateMappingTableRequest.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindMappingTableRequest }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://schema.subscribermappingtablemanagement.ws.highdeal.com/", name = "mappingTableFindRequest")
	public JAXBElement<FindMappingTableRequest> createMappingTableFindRequest(final FindMappingTableRequest value)
	{
		return new JAXBElement<FindMappingTableRequest>(_MappingTableFindRequest_QNAME, FindMappingTableRequest.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MaintainMappingTableRowRequest }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://schema.subscribermappingtablemanagement.ws.highdeal.com/", name = "mappingTableRowMaintainRequest")
	public JAXBElement<MaintainMappingTableRowRequest> createMappingTableRowMaintainRequest(
			final MaintainMappingTableRowRequest value)
	{
		return new JAXBElement<MaintainMappingTableRowRequest>(_MappingTableRowMaintainRequest_QNAME,
				MaintainMappingTableRowRequest.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link CancelMappingTableRowRequest }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://schema.subscribermappingtablemanagement.ws.highdeal.com/", name = "mappingTableRowCancelRequest")
	public JAXBElement<CancelMappingTableRowRequest> createMappingTableRowCancelRequest(final CancelMappingTableRowRequest value)
	{
		return new JAXBElement<CancelMappingTableRowRequest>(_MappingTableRowCancelRequest_QNAME,
				CancelMappingTableRowRequest.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link CancelMappingTableRequest }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://schema.subscribermappingtablemanagement.ws.highdeal.com/", name = "mappingTableCancelRequest")
	public JAXBElement<CancelMappingTableRequest> createMappingTableCancelRequest(final CancelMappingTableRequest value)
	{
		return new JAXBElement<CancelMappingTableRequest>(_MappingTableCancelRequest_QNAME, CancelMappingTableRequest.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MappingTableRowOperationResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://schema.subscribermappingtablemanagement.ws.highdeal.com/", name = "mappingTableRowMaintainResponse")
	public JAXBElement<MappingTableRowOperationResponse> createMappingTableRowMaintainResponse(
			final MappingTableRowOperationResponse value)
	{
		return new JAXBElement<MappingTableRowOperationResponse>(_MappingTableRowMaintainResponse_QNAME,
				MappingTableRowOperationResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MappingTableOperationResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://schema.subscribermappingtablemanagement.ws.highdeal.com/", name = "mappingTableCancelResponse")
	public JAXBElement<MappingTableOperationResponse> createMappingTableCancelResponse(final MappingTableOperationResponse value)
	{
		return new JAXBElement<MappingTableOperationResponse>(_MappingTableCancelResponse_QNAME,
				MappingTableOperationResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindMappingTableResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://schema.subscribermappingtablemanagement.ws.highdeal.com/", name = "mappingTableFindResponse")
	public JAXBElement<FindMappingTableResponse> createMappingTableFindResponse(final FindMappingTableResponse value)
	{
		return new JAXBElement<FindMappingTableResponse>(_MappingTableFindResponse_QNAME, FindMappingTableResponse.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MappingTableRowOperationResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://schema.subscribermappingtablemanagement.ws.highdeal.com/", name = "mappingTableRowCancelResponse")
	public JAXBElement<MappingTableRowOperationResponse> createMappingTableRowCancelResponse(
			final MappingTableRowOperationResponse value)
	{
		return new JAXBElement<MappingTableRowOperationResponse>(_MappingTableRowCancelResponse_QNAME,
				MappingTableRowOperationResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "number", scope = MappingTableClassOutputColumn.class)
	public JAXBElement<BigDecimal> createMappingTableClassOutputColumnNumber(final BigDecimal value)
	{
		return new JAXBElement<BigDecimal>(_MappingTableClassOutputColumnNumber_QNAME, BigDecimal.class,
				MappingTableClassOutputColumn.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "string", scope = MappingTableClassOutputColumn.class)
	public JAXBElement<String> createMappingTableClassOutputColumnString(final String value)
	{
		return new JAXBElement<String>(_MappingTableClassOutputColumnString_QNAME, String.class,
				MappingTableClassOutputColumn.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "string", scope = MappingTableClassInputColumn.class)
	public JAXBElement<String> createMappingTableClassInputColumnString(final String value)
	{
		return new JAXBElement<String>(_MappingTableClassOutputColumnString_QNAME, String.class, MappingTableClassInputColumn.class,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "currency", scope = MappingTableClassInputColumn.class)
	public JAXBElement<String> createMappingTableClassInputColumnCurrency(final String value)
	{
		return new JAXBElement<String>(_MappingTableClassInputColumnCurrency_QNAME, String.class,
				MappingTableClassInputColumn.class, value);
	}

}
