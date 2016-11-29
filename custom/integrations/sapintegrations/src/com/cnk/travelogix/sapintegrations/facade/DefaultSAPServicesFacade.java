/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.cnk.travelogix.sapintegrations.facade;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import org.apache.log4j.Logger;

import com.cnk.travelogix.custom.ziffm.vendor.createchange.ZVendorCreateChangeService;
import com.cnk.travelogix.custom.ziffm.vendor.createchange.ZVendorCreateChangeServiceResponse;
import com.cnk.travelogix.custom.zifws.accdocpost.ZIffmAccountDocumentResponse;
import com.cnk.travelogix.custom.zifws.account.clear.ZIffmAccountClear;
import com.cnk.travelogix.custom.zifws.account.clear.ZIffmAccountClearResponse;
import com.cnk.travelogix.custom.zifws.account.clear.data.ZIffmAccountClearDataRequest;
import com.cnk.travelogix.custom.zifws.account.clear.data.ZIffmAccountClearDataResponse;
import com.cnk.travelogix.custom.zifwsb.inv.cancel.ZIffmBillingdocCancel;
import com.cnk.travelogix.custom.zifwsb.inv.cancel.ZIffmBillingdocCancelResponse;
import com.cnk.travelogix.custom.zifwsb.inv.cancel.data.ZIffmBillingdocCancelDataRequest;
import com.cnk.travelogix.custom.zifwsb.inv.cancel.data.ZIffmBillingdocCancelDataResponse;
import com.cnk.travelogix.custom.zifwsb.invoice.create.ZIffmBillDocCreate;
import com.cnk.travelogix.custom.zifwsb.invoice.create.ZIffmBillDocCreateResponse;
import com.cnk.travelogix.sapintegrations.accdocpost.data.ZIffmAccountDocument;
import com.cnk.travelogix.sapintegrations.exception.ServiceNotSupportedException;
import com.cnk.travelogix.sapintegrations.factory.SAPWebServicesFactory;
import com.cnk.travelogix.sapintegrations.invoice.create.data.ZIffmBillDocCreateData;
import com.cnk.travelogix.sapintegrations.invoice.create.data.ZIffmBillDocCreateResponseData;
import com.cnk.travelogix.sapintegrations.processor.AccountClearRequestProcessor;
import com.cnk.travelogix.sapintegrations.processor.AccountDocumentRequestProcessor;
import com.cnk.travelogix.sapintegrations.processor.BillingDocCancelRequestProcessor;
import com.cnk.travelogix.sapintegrations.processor.InvoiceCreateProcessor;
import com.cnk.travelogix.sapintegrations.processor.VendorCreateChangeRequestProcessor;
import com.cnk.travelogix.sapintegrations.ziffm.vendor.createchange.data.ZVendorCreateChangeServiceDataRequest;
import com.cnk.travelogix.sapintegrations.ziffm.vendor.createchange.data.ZVendorCreateChangeServiceDataResponse;


/**
 *
 */
public class DefaultSAPServicesFacade implements SAPServicesFacade
{
	private final Logger LOG = Logger.getLogger(getClass());
	private SAPWebServicesFactory sapWebServicesFactory;
	private Converter<ZIffmAccountDocument, com.cnk.travelogix.custom.zifws.accdocpost.ZIffmAccountDocument> accDocPostRequestDataConverter = null;
	private Converter<ZIffmAccountDocumentResponse, com.cnk.travelogix.sapintegrations.accdocpost.data.ZIffmAccountDocumentResponse> accDocPostResponseDataConverter = null;
	private Converter<ZIffmBillDocCreateData, ZIffmBillDocCreate> invoiceCreateRequestDataConverter = null;
	private Converter<ZIffmBillDocCreateResponse, ZIffmBillDocCreateResponseData> invoiceCreateResponseDataConverter = null;
	private Converter<ZIffmBillingdocCancelDataRequest, ZIffmBillingdocCancel> billingDocCancelRequestDataConverter = null;
	private Converter<ZIffmBillingdocCancelResponse, ZIffmBillingdocCancelDataResponse> billingDocCancelResponseDataConverter = null;
	private Converter<ZIffmAccountClearDataRequest, ZIffmAccountClear> accountClearRequestDataConverter = null;
	private Converter<ZIffmAccountClearResponse, ZIffmAccountClearDataResponse> accountClearResponseDataConverter = null;
	private Converter<ZVendorCreateChangeServiceDataRequest, ZVendorCreateChangeService> vendorCreateChangeRequestDataConverter = null;
	private Converter<ZVendorCreateChangeServiceResponse, ZVendorCreateChangeServiceDataResponse> vendorCreateChangeResponseDataConverter = null;

	/**
	 * @return the accDocPostRequestDataConverter
	 */
	public Converter<ZIffmAccountDocument, com.cnk.travelogix.custom.zifws.accdocpost.ZIffmAccountDocument> getAccDocPostRequestDataConverter()
	{
		return accDocPostRequestDataConverter;
	}

	/**
	 * @param accDocPostRequestDataConverter
	 *           the accDocPostRequestDataConverter to set
	 */
	public void setAccDocPostRequestDataConverter(
			final Converter<ZIffmAccountDocument, com.cnk.travelogix.custom.zifws.accdocpost.ZIffmAccountDocument> accDocPostRequestDataConverter)
	{
		this.accDocPostRequestDataConverter = accDocPostRequestDataConverter;
	}

	/**
	 * @return the accDocPostResponseDataConverter
	 */
	public Converter<ZIffmAccountDocumentResponse, com.cnk.travelogix.sapintegrations.accdocpost.data.ZIffmAccountDocumentResponse> getAccDocPostResponseDataConverter()
	{
		return accDocPostResponseDataConverter;
	}

	/**
	 * @param accDocPostResponseDataConverter
	 *           the accDocPostResponseDataConverter to set
	 */
	public void setAccDocPostResponseDataConverter(
			final Converter<ZIffmAccountDocumentResponse, com.cnk.travelogix.sapintegrations.accdocpost.data.ZIffmAccountDocumentResponse> accDocPostResponseDataConverter)
	{
		this.accDocPostResponseDataConverter = accDocPostResponseDataConverter;
	}


	/**
	 * @return the sapWebServicesFactory
	 */
	public SAPWebServicesFactory getSapWebServicesFactory()
	{
		return sapWebServicesFactory;
	}

	/**
	 * @param sapWebServicesFactory
	 *           the sapWebServicesFactory to set
	 */
	public void setSapWebServicesFactory(final SAPWebServicesFactory sapWebServicesFactory)
	{
		this.sapWebServicesFactory = sapWebServicesFactory;
	}

	@Override
	public com.cnk.travelogix.sapintegrations.accdocpost.data.ZIffmAccountDocumentResponse accDocPost(
			final ZIffmAccountDocument request)
	{
		try
		{
			final com.cnk.travelogix.custom.zifws.accdocpost.ZIffmAccountDocument accDocRequest = getAccDocPostRequestDataConverter()
					.convert(request);
			final AccountDocumentRequestProcessor processor = getSapWebServicesFactory()
					.createSAPWebService(AccountDocumentRequestProcessor.class);
			final ZIffmAccountDocumentResponse response = processor.processRequest(accDocRequest);
			return getAccDocPostResponseDataConverter().convert(response);

		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
		return null;
	}


	/**
	 * @return the invoiceCreateRequestDataConverter
	 */
	public Converter<ZIffmBillDocCreateData, ZIffmBillDocCreate> getInvoiceCreateRequestDataConverter()
	{
		return invoiceCreateRequestDataConverter;
	}

	/**
	 * @param invoiceCreateRequestDataConverter
	 *           the invoiceCreateRequestDataConverter to set
	 */
	public void setInvoiceCreateRequestDataConverter(
			final Converter<ZIffmBillDocCreateData, ZIffmBillDocCreate> invoiceCreateRequestDataConverter)
	{
		this.invoiceCreateRequestDataConverter = invoiceCreateRequestDataConverter;
	}

	/**
	 * @return the invoiceCreateResponseDataConverter
	 */
	public Converter<ZIffmBillDocCreateResponse, ZIffmBillDocCreateResponseData> getInvoiceCreateResponseDataConverter()
	{
		return invoiceCreateResponseDataConverter;
	}

	/**
	 * @param invoiceCreateResponseDataConverter
	 *           the invoiceCreateResponseDataConverter to set
	 */
	public void setInvoiceCreateResponseDataConverter(
			final Converter<ZIffmBillDocCreateResponse, ZIffmBillDocCreateResponseData> invoiceCreateResponseDataConverter)
	{
		this.invoiceCreateResponseDataConverter = invoiceCreateResponseDataConverter;
	}

	@Override
	public ZIffmBillDocCreateResponseData createInvoice(final ZIffmBillDocCreateData docCreaterequest)
	{

		try
		{
			System.out.println("In the controller");
			final ZIffmBillDocCreate request = getInvoiceCreateRequestDataConverter().convert(docCreaterequest);
			final InvoiceCreateProcessor processor = getSapWebServicesFactory().createSAPWebService(InvoiceCreateProcessor.class);
			final ZIffmBillDocCreateResponse response = processor.processRequest(request);
			LOG.info("<<Response>>" + response);


			return getInvoiceCreateResponseDataConverter().convert(response);


		}
		catch (final ServiceNotSupportedException e)
		{
			LOG.error(e.getMessage(), e);
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
		return null;
	}

	@Override
	public ZVendorCreateChangeServiceDataResponse createChangeVendor(final ZVendorCreateChangeServiceDataRequest request)
	{
		try
		{
			final ZVendorCreateChangeService zVendorCreateService = getVendorCreateChangeRequestDataConverter().convert(request);
			final VendorCreateChangeRequestProcessor processor = getSapWebServicesFactory()
					.createSAPWebService(VendorCreateChangeRequestProcessor.class);
			final ZVendorCreateChangeServiceResponse response = processor.processRequest(zVendorCreateService);

			return getVendorCreateChangeResponseDataConverter().convert(response);
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
		return null;
	}

	/**
	 * @return the vendorCreateChangeRequestDataConverter
	 */
	public Converter<ZVendorCreateChangeServiceDataRequest, ZVendorCreateChangeService> getVendorCreateChangeRequestDataConverter()
	{
		return vendorCreateChangeRequestDataConverter;
	}

	/**
	 * @param vendorCreateChangeRequestDataConverter
	 *           the vendorCreateChangeRequestDataConverter to set
	 */
	public void setVendorCreateChangeRequestDataConverter(
			final Converter<ZVendorCreateChangeServiceDataRequest, ZVendorCreateChangeService> vendorCreateChangeRequestDataConverter)
	{
		this.vendorCreateChangeRequestDataConverter = vendorCreateChangeRequestDataConverter;
	}

	/**
	 * @return the vendorCreateChangeResponseDataConverter
	 */
	public Converter<ZVendorCreateChangeServiceResponse, ZVendorCreateChangeServiceDataResponse> getVendorCreateChangeResponseDataConverter()
	{
		return vendorCreateChangeResponseDataConverter;
	}

	/**
	 * @param vendorCreateChangeResponseDataConverter
	 *           the vendorCreateChangeResponseDataConverter to set
	 */
	public void setVendorCreateChangeResponseDataConverter(
			final Converter<ZVendorCreateChangeServiceResponse, ZVendorCreateChangeServiceDataResponse> vendorCreateChangeResponseDataConverter)
	{
		this.vendorCreateChangeResponseDataConverter = vendorCreateChangeResponseDataConverter;
	}

	/**
	 * @return the billingDocCancelRequestDataConverter
	 */
	public Converter<ZIffmBillingdocCancelDataRequest, ZIffmBillingdocCancel> getBillingDocCancelRequestDataConverter()
	{
		return billingDocCancelRequestDataConverter;
	}

	/**
	 * @return the billingDocCancelResponseDataConverter
	 */
	public Converter<com.cnk.travelogix.custom.zifwsb.inv.cancel.ZIffmBillingdocCancelResponse, ZIffmBillingdocCancelDataResponse> getBillingDocCancelResponseDataConverter()
	{
		return billingDocCancelResponseDataConverter;
	}

	@Override
	public ZIffmBillingdocCancelDataResponse invoiceCancel(final ZIffmBillingdocCancelDataRequest request)
	{
		try
		{
			final ZIffmBillingdocCancel billingdocCancelRequest = getBillingDocCancelRequestDataConverter().convert(request);
			final BillingDocCancelRequestProcessor processor = getSapWebServicesFactory()
					.createSAPWebService(BillingDocCancelRequestProcessor.class);
			final ZIffmBillingdocCancelResponse response = processor.processRequest(billingdocCancelRequest);

			return getBillingDocCancelResponseDataConverter().convert(response);

		}
		catch (final ServiceNotSupportedException sns)
		{
			LOG.error(sns.getMessage(), sns);
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
		return null;
	}

	@Override
	public ZIffmAccountClearDataResponse accountClear(final ZIffmAccountClearDataRequest request)
	{
		try
		{
			final ZIffmAccountClear accountClearRequest = getAccountClearRequestDataConverter().convert(request);
			final AccountClearRequestProcessor processor = getSapWebServicesFactory()
					.createSAPWebService(AccountClearRequestProcessor.class);
			final ZIffmAccountClearResponse response = processor.processRequest(accountClearRequest);

			return getAccountClearResponseDataConverter().convert(response);

		}
		catch (final ServiceNotSupportedException sns)
		{
			LOG.error(sns.getMessage(), sns);
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
		return null;
	}

	/**
	 * @return the accountClearRequestDataConverter
	 */
	public Converter<ZIffmAccountClearDataRequest, ZIffmAccountClear> getAccountClearRequestDataConverter()
	{
		return accountClearRequestDataConverter;
	}

	/**
	 * @return the accountClearResponseDataConverter
	 */
	public Converter<ZIffmAccountClearResponse, ZIffmAccountClearDataResponse> getAccountClearResponseDataConverter()
	{
		return accountClearResponseDataConverter;
	}

	/**
	 * @param billingDocCancelRequestDataConverter
	 *           the billingDocCancelRequestDataConverter to set
	 */
	public void setBillingDocCancelRequestDataConverter(
			final Converter<ZIffmBillingdocCancelDataRequest, ZIffmBillingdocCancel> billingDocCancelRequestDataConverter)
	{
		this.billingDocCancelRequestDataConverter = billingDocCancelRequestDataConverter;
	}

	/**
	 * @param billingDocCancelResponseDataConverter
	 *           the billingDocCancelResponseDataConverter to set
	 */
	public void setBillingDocCancelResponseDataConverter(
			final Converter<ZIffmBillingdocCancelResponse, ZIffmBillingdocCancelDataResponse> billingDocCancelResponseDataConverter)
	{
		this.billingDocCancelResponseDataConverter = billingDocCancelResponseDataConverter;
	}

	/**
	 * @param accountClearRequestDataConverter
	 *           the accountClearRequestDataConverter to set
	 */
	public void setAccountClearRequestDataConverter(
			final Converter<ZIffmAccountClearDataRequest, ZIffmAccountClear> accountClearRequestDataConverter)
	{
		this.accountClearRequestDataConverter = accountClearRequestDataConverter;
	}

	/**
	 * @param accountClearResponseDataConverter
	 *           the accountClearResponseDataConverter to set
	 */
	public void setAccountClearResponseDataConverter(
			final Converter<ZIffmAccountClearResponse, ZIffmAccountClearDataResponse> accountClearResponseDataConverter)
	{
		this.accountClearResponseDataConverter = accountClearResponseDataConverter;
	}
}
