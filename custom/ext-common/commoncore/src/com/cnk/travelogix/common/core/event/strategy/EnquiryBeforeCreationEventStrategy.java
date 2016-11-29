package com.cnk.travelogix.common.core.event.strategy;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import com.cnk.travelogix.common.core.enquiry.facade.EnquirySupplierFacade;
import com.cnk.travelogix.common.core.enquiry.services.EnquiryService.EnquiryFlowState;
import com.cnk.travelogix.common.core.event.CnkGenericEventListener.CnkGenericEventStrategy;
import com.cnk.travelogix.common.core.model.BaseEnquiryModel;


public class EnquiryBeforeCreationEventStrategy implements CnkGenericEventStrategy
{
	/**
	 * Logger for this class
	 */
	private static final Logger LOG = Logger.getLogger(EnquiryBeforeCreationEventStrategy.class);

	public static final String FLOW_STATE = "FLOW_STATE";
	public static final String ENQUIRY_MODEL = "ENQUIRY_MODEL";

	private EnquirySupplierFacade enquirySupplierFacade;

	/**
	 * @param enquirySupplierFacade
	 *           the enquirySupplierFacade to set
	 */
	@Required
	public void setEnquirySupplierFacade(final EnquirySupplierFacade enquirySupplierFacade)
	{
		this.enquirySupplierFacade = enquirySupplierFacade;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.common.core.event.CnkGenericEventListener.CnkGenericEventStrategy#handleEvent(java.util.Map)
	 */
	@Override
	public void handleEvent(final Map<String, Object> payloads)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("handleEvent(Map<String,Object>) - start"); //$NON-NLS-1$
		}

		final BaseEnquiryModel enquiryModel = (BaseEnquiryModel) payloads.get(ENQUIRY_MODEL);
		final EnquiryFlowState state = (EnquiryFlowState) payloads.get(FLOW_STATE);

		if (LOG.isDebugEnabled())
		{
			LOG.debug("handleEvent(Map<String,Object>) - enquiryModel.hashCode()=" + enquiryModel.hashCode() + ", state=" + state); //$NON-NLS-1$ //$NON-NLS-2$
		}

		if (EnquiryFlowState.MT_OTHERS.equals(state))
		{
			enquirySupplierFacade.registerCustomerAtCrm(enquiryModel);
		}
		else
		{
			if (LOG.isDebugEnabled())
			{
				LOG.debug("handleEvent(Map<String,Object>) - skipped, nothing to process"); //$NON-NLS-1$
			}
		}

		if (LOG.isDebugEnabled())
		{
			LOG.debug("handleEvent(Map<String,Object>) - end"); //$NON-NLS-1$
		}
	}
}
