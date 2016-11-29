/**
 *
 */
package com.cnk.travelogix.common.core.enquiry.facade.impl;

import org.apache.log4j.Logger;

import com.cnk.travelogix.common.core.enquiry.facade.EnquirySupplierFacade;
import com.cnk.travelogix.common.core.model.BaseEnquiryModel;


/**
 * @author i318043
 *
 */
public class DefaultEnquirySupplierFacade implements EnquirySupplierFacade
{
	/**
	 * Logger for this class
	 */
	private static final Logger LOG = Logger.getLogger(DefaultEnquirySupplierFacade.class);

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.common.core.enquiry.facade.EnquirySupplierFacade#registerCustomerAtCrm(com.cnk.travelogix.
	 * common.core.model.BaseEnquiryModel)
	 */
	@Override
	public void registerCustomerAtCrm(final BaseEnquiryModel enquiryModel)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("registerCustomerAtCrm(BaseEnquiryModel) - start"); //$NON-NLS-1$
		}

		// FIXME it's required to integrate with supplier later

		if (LOG.isDebugEnabled())
		{
			LOG.debug("registerCustomerAtCrm(BaseEnquiryModel) - end"); //$NON-NLS-1$
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.common.core.enquiry.facade.EnquirySupplierFacade#sendAcknowledgeToClient(com.cnk.travelogix.
	 * common.core.model.BaseEnquiryModel)
	 */
	@Override
	public void sendAcknowledgeToClient(final BaseEnquiryModel enquiryModel)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("sendAcknowledgeToClient(BaseEnquiryModel) - start"); //$NON-NLS-1$
		}

		// FIXME Q: what's the implementation for sending action?

		if (LOG.isDebugEnabled())
		{
			LOG.debug("sendAcknowledgeToClient(BaseEnquiryModel) - end"); //$NON-NLS-1$
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cnk.travelogix.common.core.enquiry.facade.EnquirySupplierFacade#triggerDisplayExitForm()
	 */
	@Override
	public void triggerDisplayExitForm()
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("triggerDisplayExitForm() - start"); //$NON-NLS-1$
		}

		// FIXME SAP to provide solution. No special BR

		if (LOG.isDebugEnabled())
		{
			LOG.debug("triggerDisplayExitForm() - end"); //$NON-NLS-1$
		}
	}

}
