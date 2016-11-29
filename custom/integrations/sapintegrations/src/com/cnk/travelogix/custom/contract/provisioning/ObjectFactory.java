
package com.cnk.travelogix.custom.contract.provisioning;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.cnk.travelogix.sapintegrations.dto.factory.DTOObjectFactory;


/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * com.cnk.travelogix.custom.contract.provisioning package.
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

	private final static QName _ChargingContractMaintainBundleRequest_QNAME = new QName(
			"http://schema.provisioning.ws.highdeal.com/", "chargingContractMaintainBundleRequest");
	private final static QName _ChargingContractFindRequest_QNAME = new QName("http://schema.provisioning.ws.highdeal.com/",
			"chargingContractFindRequest");
	private final static QName _ChargingContractMaintainMassRequest_QNAME = new QName(
			"http://schema.provisioning.ws.highdeal.com/", "chargingContractMaintainMassRequest");
	private final static QName _ChargingContractMaintainMassResponse_QNAME = new QName(
			"http://schema.provisioning.ws.highdeal.com/", "chargingContractMaintainMassResponse");
	private final static QName _ChargingContractFindResponse_QNAME = new QName("http://schema.provisioning.ws.highdeal.com/",
			"chargingContractFindResponse");
	private final static QName _ChargingContractCancelResponse_QNAME = new QName("http://schema.provisioning.ws.highdeal.com/",
			"chargingContractCancelResponse");
	private final static QName _ChargingContractMaintainBundleResponse_QNAME = new QName(
			"http://schema.provisioning.ws.highdeal.com/", "chargingContractMaintainBundleResponse");
	private final static QName _ChargingContractMaintainResponse_QNAME = new QName("http://schema.provisioning.ws.highdeal.com/",
			"chargingContractMaintainResponse");
	private final static QName _ChargingContractCancelRequest_QNAME = new QName("http://schema.provisioning.ws.highdeal.com/",
			"chargingContractCancelRequest");
	private final static QName _ChargingContractMaintainRequest_QNAME = new QName("http://schema.provisioning.ws.highdeal.com/",
			"chargingContractMaintainRequest");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
	 * com.cnk.travelogix.custom.contract.provisioning
	 * 
	 */
	public ObjectFactory()
	{
	}

	/**
	 * Create an instance of {@link ContractOperationResponse }
	 * 
	 */
	public ContractOperationResponse createContractOperationResponse()
	{
		return new ContractOperationResponse();
	}

	/**
	 * Create an instance of {@link CancelChargingContractRequest }
	 * 
	 */
	public CancelChargingContractRequest createCancelChargingContractRequest()
	{
		return new CancelChargingContractRequest();
	}

	/**
	 * Create an instance of {@link MaintainChargingContractRequest }
	 * 
	 */
	public MaintainChargingContractRequest createMaintainChargingContractRequest()
	{
		return new MaintainChargingContractRequest();
	}

	/**
	 * Create an instance of {@link FindChargingContractRequest }
	 * 
	 */
	public FindChargingContractRequest createFindChargingContractRequest()
	{
		return new FindChargingContractRequest();
	}

	/**
	 * Create an instance of {@link ChargingContractMaintainMassRequest }
	 * 
	 */
	public ChargingContractMaintainMassRequest createChargingContractMaintainMassRequest()
	{
		return new ChargingContractMaintainMassRequest();
	}

	/**
	 * Create an instance of {@link ChargingContractMaintainBundleRequest }
	 * 
	 */
	public ChargingContractMaintainBundleRequest createChargingContractMaintainBundleRequest()
	{
		return new ChargingContractMaintainBundleRequest();
	}

	/**
	 * Create an instance of {@link ChargingContractMaintainBundleResponse }
	 * 
	 */
	public ChargingContractMaintainBundleResponse createChargingContractMaintainBundleResponse()
	{
		return new ChargingContractMaintainBundleResponse();
	}

	/**
	 * Create an instance of {@link FindChargingContractResponse }
	 * 
	 */
	public FindChargingContractResponse createFindChargingContractResponse()
	{
		return new FindChargingContractResponse();
	}

	/**
	 * Create an instance of {@link ChargingContractMaintainMassResponse }
	 * 
	 */
	public ChargingContractMaintainMassResponse createChargingContractMaintainMassResponse()
	{
		return new ChargingContractMaintainMassResponse();
	}

	/**
	 * Create an instance of {@link ChargingContractSearchFilter }
	 * 
	 */
	public ChargingContractSearchFilter createChargingContractSearchFilter()
	{
		return new ChargingContractSearchFilter();
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
	 * Create an instance of {@link ChargingContractItemPeriod }
	 * 
	 */
	public ChargingContractItemPeriod createChargingContractItemPeriod()
	{
		return new ChargingContractItemPeriod();
	}

	/**
	 * Create an instance of {@link ChargingContract }
	 * 
	 */
	public ChargingContract createChargingContract()
	{
		return new ChargingContract();
	}

	/**
	 * Create an instance of {@link ChargingContractItemUserTechnicalIdentifier }
	 * 
	 */
	public ChargingContractItemUserTechnicalIdentifier createChargingContractItemUserTechnicalIdentifier()
	{
		return new ChargingContractItemUserTechnicalIdentifier();
	}

	/**
	 * Create an instance of {@link ChargingContractItemParameter }
	 * 
	 */
	public ChargingContractItemParameter createChargingContractItemParameter()
	{
		return new ChargingContractItemParameter();
	}

	/**
	 * Create an instance of {@link ChargingContractItemRevisionAccountAssignment }
	 * 
	 */
	public ChargingContractItemRevisionAccountAssignment createChargingContractItemRevisionAccountAssignment()
	{
		return new ChargingContractItemRevisionAccountAssignment();
	}

	/**
	 * Create an instance of {@link ChargingContractItem }
	 * 
	 */
	public ChargingContractItem createChargingContractItem()
	{
		return new ChargingContractItem();
	}

	/**
	 * Create an instance of {@link ChargingContractItemSharedCounter }
	 * 
	 */
	public ChargingContractItemSharedCounter createChargingContractItemSharedCounter()
	{
		return new ChargingContractItemSharedCounter();
	}

	/**
	 * Create an instance of {@link ChargingContractItemPooledCounter }
	 * 
	 */
	public ChargingContractItemPooledCounter createChargingContractItemPooledCounter()
	{
		return new ChargingContractItemPooledCounter();
	}

	/**
	 * Create an instance of {@link ChargingContractItemAccountAssignment }
	 * 
	 */
	public ChargingContractItemAccountAssignment createChargingContractItemAccountAssignment()
	{
		return new ChargingContractItemAccountAssignment();
	}

	/**
	 * Create an instance of {@link ChargingContractRevision }
	 * 
	 */
	public ChargingContractRevision createChargingContractRevision()
	{
		return new ChargingContractRevision();
	}

	/**
	 * Create an instance of {@link ChargingContractItemRevision }
	 * 
	 */
	public ChargingContractItemRevision createChargingContractItemRevision()
	{
		return new ChargingContractItemRevision();
	}

	/**
	 * Create an instance of {@link StateSchedule }
	 * 
	 */
	public StateSchedule createStateSchedule()
	{
		return new StateSchedule();
	}

	/**
	 * Create an instance of {@link SubscriberAccount }
	 * 
	 */
	public SubscriberAccount createSubscriberAccount()
	{
		return new SubscriberAccount();
	}

	/**
	 * Create an instance of {@link SubscriberAccountWithAccounts }
	 * 
	 */
	public SubscriberAccountWithAccounts createSubscriberAccountWithAccounts()
	{
		return new SubscriberAccountWithAccounts();
	}

	/**
	 * Create an instance of {@link ExternalAccount }
	 * 
	 */
	public ExternalAccount createExternalAccount()
	{
		return new ExternalAccount();
	}

	/**
	 * Create an instance of {@link StateChangeAlert }
	 * 
	 */
	public StateChangeAlert createStateChangeAlert()
	{
		return new StateChangeAlert();
	}

	/**
	 * Create an instance of {@link PrepaidAccount }
	 * 
	 */
	public PrepaidAccount createPrepaidAccount()
	{
		return new PrepaidAccount();
	}

	/**
	 * Create an instance of {@link StateScheduleItem }
	 * 
	 */
	public StateScheduleItem createStateScheduleItem()
	{
		return new StateScheduleItem();
	}

	/**
	 * Create an instance of {@link TaxInfoVAT }
	 * 
	 */
	public TaxInfoVAT createTaxInfoVAT()
	{
		return new TaxInfoVAT();
	}

	/**
	 * Create an instance of {@link AmountAlert }
	 * 
	 */
	public AmountAlert createAmountAlert()
	{
		return new AmountAlert();
	}

	/**
	 * Create an instance of {@link TaxInfo }
	 * 
	 */
	public TaxInfo createTaxInfo()
	{
		return new TaxInfo();
	}

	/**
	 * Create an instance of {@link PrepaidAccountReference }
	 * 
	 */
	public PrepaidAccountReference createPrepaidAccountReference()
	{
		return new PrepaidAccountReference();
	}

	/**
	 * Create an instance of {@link TaxInfoEZTax }
	 * 
	 */
	public TaxInfoEZTax createTaxInfoEZTax()
	{
		return new TaxInfoEZTax();
	}

	/**
	 * Create an instance of {@link ExternalAccountReference }
	 * 
	 */
	public ExternalAccountReference createExternalAccountReference()
	{
		return new ExternalAccountReference();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ChargingContractMaintainBundleRequest }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://schema.provisioning.ws.highdeal.com/", name = "chargingContractMaintainBundleRequest")
	public JAXBElement<ChargingContractMaintainBundleRequest> createChargingContractMaintainBundleRequest(
			final ChargingContractMaintainBundleRequest value)
	{
		return new JAXBElement<ChargingContractMaintainBundleRequest>(_ChargingContractMaintainBundleRequest_QNAME,
				ChargingContractMaintainBundleRequest.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindChargingContractRequest }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://schema.provisioning.ws.highdeal.com/", name = "chargingContractFindRequest")
	public JAXBElement<FindChargingContractRequest> createChargingContractFindRequest(final FindChargingContractRequest value)
	{
		return new JAXBElement<FindChargingContractRequest>(_ChargingContractFindRequest_QNAME, FindChargingContractRequest.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ChargingContractMaintainMassRequest }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://schema.provisioning.ws.highdeal.com/", name = "chargingContractMaintainMassRequest")
	public JAXBElement<ChargingContractMaintainMassRequest> createChargingContractMaintainMassRequest(
			final ChargingContractMaintainMassRequest value)
	{
		return new JAXBElement<ChargingContractMaintainMassRequest>(_ChargingContractMaintainMassRequest_QNAME,
				ChargingContractMaintainMassRequest.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ChargingContractMaintainMassResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://schema.provisioning.ws.highdeal.com/", name = "chargingContractMaintainMassResponse")
	public JAXBElement<ChargingContractMaintainMassResponse> createChargingContractMaintainMassResponse(
			final ChargingContractMaintainMassResponse value)
	{
		return new JAXBElement<ChargingContractMaintainMassResponse>(_ChargingContractMaintainMassResponse_QNAME,
				ChargingContractMaintainMassResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FindChargingContractResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://schema.provisioning.ws.highdeal.com/", name = "chargingContractFindResponse")
	public JAXBElement<FindChargingContractResponse> createChargingContractFindResponse(final FindChargingContractResponse value)
	{
		return new JAXBElement<FindChargingContractResponse>(_ChargingContractFindResponse_QNAME,
				FindChargingContractResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ContractOperationResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://schema.provisioning.ws.highdeal.com/", name = "chargingContractCancelResponse")
	public JAXBElement<ContractOperationResponse> createChargingContractCancelResponse(final ContractOperationResponse value)
	{
		return new JAXBElement<ContractOperationResponse>(_ChargingContractCancelResponse_QNAME, ContractOperationResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ChargingContractMaintainBundleResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://schema.provisioning.ws.highdeal.com/", name = "chargingContractMaintainBundleResponse")
	public JAXBElement<ChargingContractMaintainBundleResponse> createChargingContractMaintainBundleResponse(
			final ChargingContractMaintainBundleResponse value)
	{
		return new JAXBElement<ChargingContractMaintainBundleResponse>(_ChargingContractMaintainBundleResponse_QNAME,
				ChargingContractMaintainBundleResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ContractOperationResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://schema.provisioning.ws.highdeal.com/", name = "chargingContractMaintainResponse")
	public JAXBElement<ContractOperationResponse> createChargingContractMaintainResponse(final ContractOperationResponse value)
	{
		return new JAXBElement<ContractOperationResponse>(_ChargingContractMaintainResponse_QNAME, ContractOperationResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link CancelChargingContractRequest }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://schema.provisioning.ws.highdeal.com/", name = "chargingContractCancelRequest")
	public JAXBElement<CancelChargingContractRequest> createChargingContractCancelRequest(
			final CancelChargingContractRequest value)
	{
		return new JAXBElement<CancelChargingContractRequest>(_ChargingContractCancelRequest_QNAME,
				CancelChargingContractRequest.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MaintainChargingContractRequest }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://schema.provisioning.ws.highdeal.com/", name = "chargingContractMaintainRequest")
	public JAXBElement<MaintainChargingContractRequest> createChargingContractMaintainRequest(
			final MaintainChargingContractRequest value)
	{
		return new JAXBElement<MaintainChargingContractRequest>(_ChargingContractMaintainRequest_QNAME,
				MaintainChargingContractRequest.class, null, value);
	}

}
