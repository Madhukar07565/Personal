/**
 *
 */
package com.cnk.travelogix.common.core.enquiry.services;


import de.hybris.platform.core.model.user.UserModel;

import com.cnk.travelogix.common.core.model.BaseEnquiryModel;


/**
 * @author i318043
 *
 */
public interface EnquiryService
{

	public static enum EnquiryFlowState
	{
		AT_PROCEED_FOR_BOOKING, AT_DROPSOUT, MT_OTHERS
	}

	/**
	 * @param enquiryModel
	 * @param state
	 */
	void createEnquiry(BaseEnquiryModel enquiryModel, EnquiryFlowState state);

	/**
	 * @param currentUser
	 * @return
	 */
	boolean isAlreadyLogin(UserModel currentUser);

}
