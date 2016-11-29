package com.cnk.travelogix.v2.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.cnk.travelogix.crm.facade.CRMCustomerFacade;
import com.cnk.travelogix.sap.crm.integration.mapping.dto.CRMCustReplicationWSRequest;
import com.cnk.travelogix.sap.crm.integration.mapping.dto.CRMCustReplicationWSResponse;

import de.hybris.platform.commercefacades.customer.CustomerFacade;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;

@Controller
@RequestMapping(value = "/{baseSiteId}/CRMCustomer")
public class CRMCustomerController extends BaseController {

	@Resource(name = "customerFacade")
	private CustomerFacade customerFacade;

	@Resource(name = "crmCustomerFacade")
	private CRMCustomerFacade crmCustomerFacade;

	Logger LOG = Logger.getLogger(CRMCustomerController.class);

	// @Secured( { "ROLE_CUSTOMERGROUP", "ROLE_TRUSTED_CLIENT",
	// "ROLE_CUSTOMERMANAGERGROUP" } )
	@RequestMapping(value = "/insertCustomer", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public CRMCustReplicationWSResponse replicateCustomer(
			@RequestBody final CRMCustReplicationWSRequest crmCustReplicationWSRequest) throws DuplicateUidException {

		return crmCustomerFacade.createUpdateUser(crmCustReplicationWSRequest);
	}
}