/**
 *
 */
package com.cnk.travelogix.common.facades.account;

import com.cnk.travelogix.client.config.core.login.model.LoginConfigModel;


/**
 * @author i322561
 *
 */
public interface CnKAccountFacade
{
	LoginConfigModel getLoginConfig();

	/**
	 * Method to store companyUid selected by employee to session
	 * 
	 * @param companyUid
	 */
	public void storeCompanyDetailsInSession(String companyUid);
}
