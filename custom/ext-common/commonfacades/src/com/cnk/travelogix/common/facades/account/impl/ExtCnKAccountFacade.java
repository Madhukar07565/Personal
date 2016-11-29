/**
 *
 */
package com.cnk.travelogix.common.facades.account.impl;

import de.hybris.platform.servicelayer.session.SessionService;

import javax.annotation.Resource;

import com.cnk.travelogix.client.config.core.login.model.LoginConfigModel;
import com.cnk.travelogix.common.core.account.services.CnKAccountService;
import com.cnk.travelogix.common.facades.account.CnKAccountFacade;


/**
 * @author i322561
 *
 */
public class ExtCnKAccountFacade implements CnKAccountFacade
{
	@Resource(name = "cnKAccountService")
	private CnKAccountService cnKAccountService;

	@Resource(name = "sessionService")
	private SessionService sessionService;

	@Override
	public LoginConfigModel getLoginConfig()
	{
		return cnKAccountService.getLoginConfig();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.common.facades.account.CnKAccountFacade#storeCompanyDetailsInSession(org.apache.xpath.
	 * operations.String)
	 */
	@Override
	public void storeCompanyDetailsInSession(final String companyUid)
	{
		sessionService.setAttribute("companyUid", companyUid);
	}
}
