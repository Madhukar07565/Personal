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

import com.cnk.travelogix.custom.so.createchange.ZifTerpSalesOrder;
import com.cnk.travelogix.custom.so.createchange.ZifTerpSalesOrderResponse;
import com.cnk.travelogix.custom.zif.erp.ws.complaints.feedback.ZifTerpComplaints;
import com.cnk.travelogix.custom.zif.erp.ws.complaints.feedback.ZifTerpComplaintsResponse;
import com.cnk.travelogix.custom.zif.erp.ws.custmastercreate.ZifTerpPartnerSave;
import com.cnk.travelogix.custom.zif.erp.ws.custmastercreate.ZifTerpPartnerSaveResponse;
import com.cnk.travelogix.custom.zif.erp.ws.custmastercreate.b2b.ZifTerpPartnerSaveB2B;
import com.cnk.travelogix.custom.zif.erp.ws.custmastercreate.b2b.ZifTerpPartnerSaveB2BResponse;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZifTerpOpportunity;
import com.cnk.travelogix.custom.zif.erp.ws.opportunity.ZifTerpOpportunityResponse;
import com.cnk.travelogix.sapintegrations.exception.ServiceNotSupportedException;
import com.cnk.travelogix.sapintegrations.factory.SAPWebServicesFactory;
import com.cnk.travelogix.sapintegrations.processor.ComplaintsFeedbackRequestProcessor;
import com.cnk.travelogix.sapintegrations.processor.CustomerMasterCreateB2BRequestProcessor;
import com.cnk.travelogix.sapintegrations.processor.CustomerMasterCreateRequestProcessor;
import com.cnk.travelogix.sapintegrations.processor.OpportunityRequestProcessor;
import com.cnk.travelogix.sapintegrations.processor.SOCreateChangeRequestProcessor;
import com.cnk.travelogix.sapintegrations.so.createchange.data.ZifTerpSalesOrderDataRequest;
import com.cnk.travelogix.sapintegrations.so.createchange.data.ZifTerpSalesOrderDataResponse;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.complaints.feedback.data.ZifTerpComplaintsDataRequest;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.complaints.feedback.data.ZifTerpComplaintsDataResponse;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.b2b.data.ZifTerpPartnerSaveB2BDataRequest;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.b2b.data.ZifTerpPartnerSaveB2BDataResponse;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.data.ZifTerpPartnerSaveDataRequest;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.data.ZifTerpPartnerSaveDataResponse;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifTerpOpportunityDataRequest;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifTerpOpportunityDataResponse;


/**
 *
 */
public class DefaultCRMServicesFacade implements CRMServicesFacade
{
	private final Logger LOG = Logger.getLogger(getClass());
	private SAPWebServicesFactory sapWebServicesFactory;
	private Converter<ZifTerpPartnerSaveDataRequest, ZifTerpPartnerSave> partnerSaveRequestDataConverter = null;
	private Converter<ZifTerpPartnerSaveResponse, ZifTerpPartnerSaveDataResponse> partnerSaveResponseDataConverters = null;
	private Converter<ZifTerpComplaintsDataRequest, ZifTerpComplaints> complaintsFeedbackRequestDataConverter = null;
	private Converter<ZifTerpComplaintsResponse, ZifTerpComplaintsDataResponse> complaintsFeedbackResponseDataConverters = null;
	private Converter<ZifTerpOpportunityDataRequest, ZifTerpOpportunity> opportunityRequestDataConverter = null;
	private Converter<ZifTerpOpportunityResponse, ZifTerpOpportunityDataResponse> opportunityResponseDataConverters = null;
	private Converter<ZifTerpSalesOrderDataRequest, ZifTerpSalesOrder> salesOrderCreateChangeRequestDataConverter = null;
	private Converter<ZifTerpSalesOrderResponse, ZifTerpSalesOrderDataResponse> salesOrderCreateChangeResponseDataConverter = null;
	private Converter<ZifTerpPartnerSaveB2BDataRequest, ZifTerpPartnerSaveB2B> partnerSaveB2BRequestDataConverter = null;
	private Converter<ZifTerpPartnerSaveB2BResponse, ZifTerpPartnerSaveB2BDataResponse> partnerSaveB2BResponseDataConverters = null;

	/**
	 * @return the partnerSaveRequestDataConverter
	 */
	public Converter<ZifTerpPartnerSaveDataRequest, ZifTerpPartnerSave> getPartnerSaveRequestDataConverter()
	{
		return partnerSaveRequestDataConverter;
	}

	/**
	 * @param partnerSaveRequestDataConverter
	 *           the partnerSaveRequestDataConverter to set
	 */
	public void setPartnerSaveRequestDataConverter(
			final Converter<ZifTerpPartnerSaveDataRequest, ZifTerpPartnerSave> partnerSaveRequestDataConverter)
	{
		this.partnerSaveRequestDataConverter = partnerSaveRequestDataConverter;
	}

	/**
	 * @return the partnerSaveResponseDataConverters
	 */
	public Converter<ZifTerpPartnerSaveResponse, ZifTerpPartnerSaveDataResponse> getPartnerSaveResponseDataConverters()
	{
		return partnerSaveResponseDataConverters;
	}

	/**
	 * @param partnerSaveResponseDataConverters
	 *           the partnerSaveResponseDataConverters to set
	 */
	public void setPartnerSaveResponseDataConverters(
			final Converter<ZifTerpPartnerSaveResponse, ZifTerpPartnerSaveDataResponse> partnerSaveResponseDataConverters)
	{
		this.partnerSaveResponseDataConverters = partnerSaveResponseDataConverters;
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
	public ZifTerpPartnerSaveDataResponse partnerSave(final ZifTerpPartnerSaveDataRequest request)
	{
		try
		{
			final ZifTerpPartnerSave partnerSaveRequest = getPartnerSaveRequestDataConverter().convert(request);
			final CustomerMasterCreateRequestProcessor processor = getSapWebServicesFactory().createSAPWebService(
					CustomerMasterCreateRequestProcessor.class);
			final ZifTerpPartnerSaveResponse response = processor.processRequest(partnerSaveRequest);

			return getPartnerSaveResponseDataConverters().convert(response);

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
	public ZifTerpComplaintsDataResponse complaintsFeedback(final ZifTerpComplaintsDataRequest request)
	{
		try
		{
			final ZifTerpComplaints complaintsFeedbackRequest = getComplaintsFeedbackRequestDataConverter().convert(request);
			final ComplaintsFeedbackRequestProcessor processor = getSapWebServicesFactory().createSAPWebService(
					ComplaintsFeedbackRequestProcessor.class);
			final ZifTerpComplaintsResponse response = processor.processRequest(complaintsFeedbackRequest);

			return getComplaintsFeedbackResponseDataConverters().convert(response);

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
	 * @return the complaintsFeedbackRequestDataConverter
	 */
	public Converter<ZifTerpComplaintsDataRequest, ZifTerpComplaints> getComplaintsFeedbackRequestDataConverter()
	{
		return complaintsFeedbackRequestDataConverter;
	}

	/**
	 * @param complaintsFeedbackRequestDataConverter
	 *           the complaintsFeedbackRequestDataConverter to set
	 */
	public void setComplaintsFeedbackRequestDataConverter(
			final Converter<ZifTerpComplaintsDataRequest, ZifTerpComplaints> complaintsFeedbackRequestDataConverter)
	{
		this.complaintsFeedbackRequestDataConverter = complaintsFeedbackRequestDataConverter;
	}

	/**
	 * @return the complaintsFeedbackResponseDataConverters
	 */
	public Converter<ZifTerpComplaintsResponse, ZifTerpComplaintsDataResponse> getComplaintsFeedbackResponseDataConverters()
	{
		return complaintsFeedbackResponseDataConverters;
	}

	/**
	 * @param complaintsFeedbackResponseDataConverters
	 *           the complaintsFeedbackResponseDataConverters to set
	 */
	public void setComplaintsFeedbackResponseDataConverters(
			final Converter<ZifTerpComplaintsResponse, ZifTerpComplaintsDataResponse> complaintsFeedbackResponseDataConverters)
	{
		this.complaintsFeedbackResponseDataConverters = complaintsFeedbackResponseDataConverters;
	}

	@Override
	public ZifTerpOpportunityDataResponse opportunity(final ZifTerpOpportunityDataRequest request)
	{
		try
		{
			final ZifTerpOpportunity opportunityRequest = getOpportunityRequestDataConverter().convert(request);
			final OpportunityRequestProcessor processor = getSapWebServicesFactory().createSAPWebService(
					OpportunityRequestProcessor.class);
			final ZifTerpOpportunityResponse response = processor.processRequest(opportunityRequest);

			return getOpportunityResponseDataConverters().convert(response);

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
	public ZifTerpSalesOrderDataResponse createChangeSalesOrder(final ZifTerpSalesOrderDataRequest request)
	{
		try
		{
			final ZifTerpSalesOrder salesOrderRequest = salesOrderCreateChangeRequestDataConverter.convert(request);
			final SOCreateChangeRequestProcessor processor = getSapWebServicesFactory().createSAPWebService(
					SOCreateChangeRequestProcessor.class);
			final ZifTerpSalesOrderResponse response = processor.processRequest(salesOrderRequest);
			return getSalesOrderCreateChangeResponseDataConverter().convert(response);
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
	 * @return the opportunityRequestDataConverter
	 */
	public Converter<ZifTerpOpportunityDataRequest, ZifTerpOpportunity> getOpportunityRequestDataConverter()
	{
		return opportunityRequestDataConverter;
	}

	/**
	 * @param opportunityRequestDataConverter
	 *           the opportunityRequestDataConverter to set
	 */
	public void setOpportunityRequestDataConverter(
			final Converter<ZifTerpOpportunityDataRequest, ZifTerpOpportunity> opportunityRequestDataConverter)
	{
		this.opportunityRequestDataConverter = opportunityRequestDataConverter;
	}

	/**
	 * @return the opportunityResponseDataConverters
	 */
	public Converter<ZifTerpOpportunityResponse, ZifTerpOpportunityDataResponse> getOpportunityResponseDataConverters()
	{
		return opportunityResponseDataConverters;
	}

	/**
	 * @param opportunityResponseDataConverters
	 *           the opportunityResponseDataConverters to set
	 */
	public void setOpportunityResponseDataConverters(
			final Converter<ZifTerpOpportunityResponse, ZifTerpOpportunityDataResponse> opportunityResponseDataConverters)
	{
		this.opportunityResponseDataConverters = opportunityResponseDataConverters;
	}

	/**
	 * @return the salesOrderCreateChangeRequestDataConverter
	 */
	public Converter<ZifTerpSalesOrderDataRequest, ZifTerpSalesOrder> getSalesOrderCreateChangeRequestDataConverter()
	{
		return salesOrderCreateChangeRequestDataConverter;
	}

	/**
	 * @param salesOrderCreateChangeRequestDataConverter
	 *           the salesOrderCreateChangeRequestDataConverter to set
	 */
	public void setSalesOrderCreateChangeRequestDataConverter(
			final Converter<ZifTerpSalesOrderDataRequest, ZifTerpSalesOrder> salesOrderCreateChangeRequestDataConverter)
	{
		this.salesOrderCreateChangeRequestDataConverter = salesOrderCreateChangeRequestDataConverter;
	}

	/**
	 * @return the salesOrderCreateChangeResponseDataConverter
	 */
	public Converter<ZifTerpSalesOrderResponse, ZifTerpSalesOrderDataResponse> getSalesOrderCreateChangeResponseDataConverter()
	{
		return salesOrderCreateChangeResponseDataConverter;
	}

	/**
	 * @param salesOrderCreateChangeResponseDataConverter
	 *           the salesOrderCreateChangeResponseDataConverter to set
	 */
	public void setSalesOrderCreateChangeResponseDataConverter(
			final Converter<ZifTerpSalesOrderResponse, ZifTerpSalesOrderDataResponse> salesOrderCreateChangeResponseDataConverter)
	{
		this.salesOrderCreateChangeResponseDataConverter = salesOrderCreateChangeResponseDataConverter;
	}

	@Override
	public ZifTerpPartnerSaveB2BDataResponse partnerSaveB2B(final ZifTerpPartnerSaveB2BDataRequest request)
	{

		try
		{
			final ZifTerpPartnerSaveB2B partnerSaveB2BRequest = getPartnerSaveB2BRequestDataConverter().convert(request);
			final CustomerMasterCreateB2BRequestProcessor processor = getSapWebServicesFactory().createSAPWebService(
					CustomerMasterCreateB2BRequestProcessor.class);
			final ZifTerpPartnerSaveB2BResponse response = processor.processRequest(partnerSaveB2BRequest);

			return getPartnerSaveB2BResponseDataConverters().convert(response);

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
	 * @return the partnerSaveB2BRequestDataConverter
	 */
	public Converter<ZifTerpPartnerSaveB2BDataRequest, ZifTerpPartnerSaveB2B> getPartnerSaveB2BRequestDataConverter()
	{
		return partnerSaveB2BRequestDataConverter;
	}

	/**
	 * @param partnerSaveB2BRequestDataConverter
	 *           the partnerSaveB2BRequestDataConverter to set
	 */
	public void setPartnerSaveB2BRequestDataConverter(
			final Converter<ZifTerpPartnerSaveB2BDataRequest, ZifTerpPartnerSaveB2B> partnerSaveB2BRequestDataConverter)
	{
		this.partnerSaveB2BRequestDataConverter = partnerSaveB2BRequestDataConverter;
	}

	/**
	 * @return the partnerSaveB2BResponseDataConverters
	 */
	public Converter<ZifTerpPartnerSaveB2BResponse, ZifTerpPartnerSaveB2BDataResponse> getPartnerSaveB2BResponseDataConverters()
	{
		return partnerSaveB2BResponseDataConverters;
	}

	/**
	 * @param partnerSaveB2BResponseDataConverters
	 *           the partnerSaveB2BResponseDataConverters to set
	 */
	public void setPartnerSaveB2BResponseDataConverters(
			final Converter<ZifTerpPartnerSaveB2BResponse, ZifTerpPartnerSaveB2BDataResponse> partnerSaveB2BResponseDataConverters)
	{
		this.partnerSaveB2BResponseDataConverters = partnerSaveB2BResponseDataConverters;
	}

}
