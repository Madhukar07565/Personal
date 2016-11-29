package com.cnk.travelogix.common.core.event.strategy;

import de.hybris.platform.servicelayer.model.ModelService;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import com.cnk.travelogix.common.core.enquiry.facade.EnquirySupplierFacade;
import com.cnk.travelogix.common.core.enquiry.services.EnquiryService.EnquiryFlowState;
import com.cnk.travelogix.common.core.enums.EnquiryStatus;
import com.cnk.travelogix.common.core.event.CnkGenericEventListener.CnkGenericEventStrategy;
import com.cnk.travelogix.common.core.model.BaseEnquiryModel;


public class EnquiryAfterCreationEventStrategy implements CnkGenericEventStrategy
{
	/**
	 * Logger for this class
	 */
	private static final Logger LOG = Logger.getLogger(EnquiryAfterCreationEventStrategy.class);

	public static final String FLOW_STATE = "FLOW_STATE";
	public static final String ENQUIRY_MODEL = "ENQUIRY_MODEL";
	private ModelService modelService;

	@Required
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

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

		if (EnquiryFlowState.AT_PROCEED_FOR_BOOKING.equals(state))
		{
			changeEnquiryModelStatusAsWON(enquiryModel);
		}
		else
		{
			enquirySupplierFacade.sendAcknowledgeToClient(enquiryModel);
		}

		if (LOG.isDebugEnabled())
		{
			LOG.debug("handleEvent(Map<String,Object>) - end"); //$NON-NLS-1$
		}
	}

	/**
	 * @param enquiryModel
	 */
	private void changeEnquiryModelStatusAsWON(final BaseEnquiryModel enquiryModel)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("changeEnquiryModelStatusAsWON(BaseEnquiryModel) - start"); //$NON-NLS-1$
		}

		enquiryModel.setStatus(EnquiryStatus.WON);
		modelService.save(enquiryModel);

		if (LOG.isDebugEnabled())
		{
			LOG.debug("changeEnquiryModelStatusAsWON(BaseEnquiryModel) - end"); //$NON-NLS-1$
		}
	}
}
