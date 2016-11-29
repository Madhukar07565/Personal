/**
 *
 */
package com.cnk.travelogix.common.core.process.actions;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.task.RetryLaterException;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.cnk.travelogix.common.core.model.SendCustomerToCRMProcessModel;
import com.cnk.travelogix.sapintegrations.facade.CRMServicesFacade;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.data.ZifErpStCustmastData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.data.ZifErpStStatusCData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.data.ZifErpTtContmastData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.data.ZifTerpPartnerSaveDataRequest;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.data.ZifTerpPartnerSaveDataResponse;


/**
 * @author i322561
 *
 */
public class SendCustomerToCRMAction extends AbstractSimpleDecisionAction<SendCustomerToCRMProcessModel>
{
	private static final Logger LOG = Logger.getLogger(SendCustomerToCRMAction.class);

	@Resource(name = "crmServicesFacade")
	private CRMServicesFacade crmServicesFacade;
	@Resource(name = "userService")
	private UserService userService;

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.processengine.action.AbstractSimpleDecisionAction#executeAction(de.hybris.platform.
	 * processengine.model.BusinessProcessModel)
	 */
	@Override
	public Transition executeAction(final SendCustomerToCRMProcessModel process) throws RetryLaterException, Exception
	{
		final ZifTerpPartnerSaveDataRequest request = new ZifTerpPartnerSaveDataRequest();
		final ZifErpTtContmastData contactData = new ZifErpTtContmastData();
		final ZifErpStCustmastData customerData = new ZifErpStCustmastData();
		customerData.setObjectTask(process.getObjectTask());
		customerData.setLegacyBp(process.getLegacyBP());
		customerData.setCategory(process.getCategory());
		customerData.setBpRole(process.getBpRole());
		customerData.setCustAccgrp(process.getCustAccGrp());
		customerData.setCustomer(process.getCustomer());
		customerData.setCompCode(process.getCompCode());
		customerData.setSalesOrg(process.getSalesOrg());
		customerData.setDistChannel(process.getDistChannel());
		customerData.setDivision(process.getDivision());
		customerData.setName1(process.getName1());
		customerData.setName2(process.getName2());
		customerData.setSearchTerm(process.getSearchTerm());
		customerData.setCountryKey(process.getCountryKey());
		customerData.setTradPartner(process.getTradePartner());
		customerData.setReccAcc(process.getReccAcc());
		customerData.setCurrency(process.getCurrency());
		customerData.setPricingProc(process.getPricingProc());
		customerData.setCustStatGrp(process.getCustStatGrp());
		customerData.setDelivPlant(process.getDelivPlant());
		customerData.setAccAssGrp(process.getAccAssGrp());
		customerData.setPlanGrp(process.getPlanGrp());

		request.setCustomerData(customerData);
		request.setContactData(contactData);
		boolean success = false;

		final ZifTerpPartnerSaveDataResponse response = crmServicesFacade.partnerSave(request);
		if (response != null)
		{
			final List<ZifErpStStatusCData> item = response.getStatus().getItem();

			//for B2C, there is only one item in list
			if (item != null)
			{
				final ZifErpStStatusCData data = item.get(0);

				if ("S".equals(data.getMessagetype().toUpperCase()))
				{
					success = true;
					if ("I".equals(process.getObjectTask()))
					{
						updateCustomer(data, process.getLegacyBP());
					}
					updateCustomerStatus(process.getLegacyBP());
					LOG.info("send customer " + process.getLegacyBP() + " to CRM successfully.");
				}
				LOG.info("ZifErpStStatusCData" + data.getMessagetype());

			}
			else
			{
				LOG.info("ZifTerpPartnerSaveDataResponse is null");
			}
		}

		if (success)
		{
			return Transition.OK;
		}
		else
		{
			return Transition.NOK;
		}

	}

	private void updateCustomerStatus(final String customerId)
	{
		final CustomerModel customer = userService.getUserForUID(customerId, CustomerModel.class);
		if (customer != null)
		{
			customer.setSendToCRM(Boolean.TRUE);
			getModelService().save(customer);
		}

	}

	private void updateCustomer(final ZifErpStStatusCData data, final String customerId)
	{
		final CustomerModel customer = userService.getUserForUID(customerId, CustomerModel.class);
		if (customer != null)
		{
			customer.setCrmCustomerId(data.getCustomer());
			getModelService().save(customer);
		}

	}

}
