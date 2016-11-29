/**
 *
 */
package com.cnk.travelogix.common.core.enquiry.facade;

import com.cnk.travelogix.common.core.model.BaseEnquiryModel;


/**
 * @author i318043
 *
 */
public interface EnquirySupplierFacade
{
	/**
	 * @param enquiryModel
	 */
	void registerCustomerAtCrm(BaseEnquiryModel enquiryModel);

	/**
	 * @param enquiryModel
	 */
	void sendAcknowledgeToClient(BaseEnquiryModel enquiryModel);

	/**
	 *
	 */
	void triggerDisplayExitForm();
}
