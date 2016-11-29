package com.cnk.travelogix.crm.facade;
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

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.b2c.facades.customer.B2cCustomerFacade;
import com.cnk.travelogix.crm.converter.CRMCustomerConverter;
import com.cnk.travelogix.crm.converter.CRMEmployeeConverter;
import com.cnk.travelogix.sap.crm.integration.mapping.dto.CRMCustReplicationWSRequest;
import com.cnk.travelogix.sap.crm.integration.mapping.dto.CRMCustReplicationWSResponse;
import com.cnk.travelogix.sap.crm.integration.mapping.dto.Custmast;
import com.cnk.travelogix.sap.crm.integration.mapping.dto.Status;
import com.cnk.travelogix.sap.crm.integration.mapping.dto.StatusList;

import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.search.restriction.SearchRestrictionService;
import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.user.UserService;

/**
 *
 */
public class DefaultCRMCustomerFacade implements CRMCustomerFacade {

	@Resource(name = "crmCustomerConverter")
	CRMCustomerConverter crmCustomerConverter;

	@Resource(name = "searchRestrictionService")
	private SearchRestrictionService searchRestrictionService;

	@Resource(name = "customerFacade")
	private B2cCustomerFacade customerFacade;

	@Resource(name = "userService")
	UserService userService;

	@Resource(name = "modelService")
	ModelService modelService;

	@Resource(name = "flexibleSearchService")
	FlexibleSearchService flexibleSearchService;

	@Resource(name = "crmEmployeeConverter")
	CRMEmployeeConverter crmEmployeeConverter;

	@Autowired
	private ConfigurationService configurationService;

	Logger LOG = Logger.getLogger(DefaultCRMCustomerFacade.class);

	final static String ORIGINAL_PASSWORD = "crm.update.create.customer.original.password";
	final static String CUST_ACC_GRP_RETL = "RETL";

	final static String CUST_ACC_GRP_EMP = "01";

	@Override
	public CRMCustReplicationWSResponse createUpdateUser(final CRMCustReplicationWSRequest crmCustReplicationWSRequest)
			throws DuplicateUidException {

		final CRMCustReplicationWSResponse crmCustReplicationWSResponse = new CRMCustReplicationWSResponse();
		StatusList statusList = new StatusList();
		List<Status> status = new ArrayList<>();
		Status st = new Status();

		if (null != crmCustReplicationWSRequest.getCustomerData()) {
			Custmast custmast = crmCustReplicationWSRequest.getCustomerData();

			if (custmast.getCustAccgrp().equals(CUST_ACC_GRP_RETL)) {
				createUpdateCustomer(custmast, st);

			} else if (custmast.getCustAccgrp().equals(CUST_ACC_GRP_EMP)) {
				createUpdateemployee(custmast, st);
			}
			status.add(st);
			statusList.setItem(status);
			crmCustReplicationWSResponse.setStatus(statusList);
		}
		return crmCustReplicationWSResponse;
	}

	public void createUpdateCustomer(Custmast custmast, Status status) {
		CustomerModel customer = null;
		try {
			if ("I".equals(custmast.getObjectTask())) {
				customer = modelService.create(CustomerModel.class);
				crmCustomerConverter.populateCustomerModel(custmast, customer);
				customerFacade.createCustomerByCRM(customer,
						configurationService.getConfiguration().getString(ORIGINAL_PASSWORD));
				status.setMessage("Successfully created customer");
				LOG.info("Customer Inserted Sucessfully END");

			} else {
				customer = (CustomerModel) getUserByEmilOrCRMId(custmast.getEmail(), custmast.getCustomer());
				crmCustomerConverter.populateCustomerModel(custmast, customer);
				customerFacade.updateCustomerByCRM(customer);
				status.setMessage("Successfully updated customer");
				LOG.info("Customer Updated Sucessfully END");
			}
			status.setCustomer(custmast.getEmail());
			status.setStatus("Success");
			status.setMessagetype("S");
			status.setLegacyId(custmast.getCustomer());

		} catch (Exception e) {
			LOG.info("" + e.getMessage(), e);
			status.setCustomer(custmast.getEmail());
			status.setStatus("Error");
			status.setMessage("Error creating/updating  customer");
			status.setMessagetype("E");
			status.setLegacyId(custmast.getCustomer());
		}
	}

	public void createUpdateemployee(Custmast custmast, Status status) {
		EmployeeModel employee = null;
		try {
			if ("I".equals(custmast.getObjectTask())) {
				employee = modelService.create(EmployeeModel.class);
				crmEmployeeConverter.populateCustomerModel(custmast, employee);
				modelService.save(employee);
				status.setMessage("Successfully created employee");
				LOG.info("Employee Inserted Sucessfully END");
			} else {
				employee = (EmployeeModel) getUserByEmilOrCRMId(custmast.getEmail(), custmast.getCustomer());
				crmEmployeeConverter.populateCustomerModel(custmast, employee);
				modelService.save(employee);
				status.setMessage("Successfully updated employee");
				LOG.info("Employee Updated Sucessfully END");
			}
			status.setCustomer(custmast.getEmail());
			status.setStatus("Success");
			status.setMessagetype("S");
			status.setLegacyId(custmast.getCustomer());
		} catch (Exception e) {
			LOG.info("" + e.getMessage(), e);
			status.setCustomer(custmast.getEmail());
			status.setStatus("Error");
			status.setMessage("Error creating/updating  employee");
			status.setMessagetype("E");
			status.setLegacyId(custmast.getCustomer());
		}
	}

	public UserModel getUserByEmilOrCRMId(String email, String crmCustomerID) {
		UserModel user = null;
		try {
			if (null != crmCustomerID) {
				user = userService.getUserForUID(crmCustomerID);
			} else {
				user = userService.getUserForUID(email);			
			}
		} catch (UnknownIdentifierException e) {
			LOG.info("Customer Not Found " + e.getMessage(), e);
		}
		return user;
	}
}
