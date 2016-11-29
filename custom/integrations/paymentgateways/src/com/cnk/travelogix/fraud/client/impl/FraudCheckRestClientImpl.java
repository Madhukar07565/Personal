/**
 *
 */
package com.cnk.travelogix.fraud.client.impl;

import de.hybris.platform.servicelayer.config.ConfigurationService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.cnk.travelogix.fraud.beans.checkfraud.RMSIDResult;
import com.cnk.travelogix.fraud.client.FraudCheckRestClient;
import com.cnk.travelogix.integrations.payment.fraud.beans.FraudCheckData;
import com.cnk.travelogix.integrations.payment.fraud.beans.FraudCheckResponseUpdateData;


/**
 * This class is rest client used to communicate with RMS system for fraud check.
 *
 * @author I077988
 */
public class FraudCheckRestClientImpl implements FraudCheckRestClient
{

	private static final Logger LOG = LoggerFactory.getLogger(FraudCheckRestClientImpl.class);

	@Autowired
	private ConfigurationService configurationService;



	@Override
	public RMSIDResult rmsFraudCheck(final FraudCheckData fraudCheckData)
	{
		LOG.info("#rmsFraudCheck - Strat");
		LOG.info("RMSFraudCheckBean::{}", fraudCheckData);
		final String rmsFraudCheckRestUrl = configurationService.getConfiguration().getString(FRAUD_CHECK_REST_URL);
		LOG.info("RmsFraudCheckUrl: {}", rmsFraudCheckRestUrl);
		final RestTemplate restTemplate = new RestTemplate();
		final List<HttpMessageConverter<?>> messageConverters = restTemplate.getMessageConverters();
		final FormHttpMessageConverter formHttpMessageConverter = new FormHttpMessageConverter();
		messageConverters.add(formHttpMessageConverter);
		restTemplate.setMessageConverters(messageConverters);
		final MultiValueMap<String, String> multiValueMap = this.buildFraudCheckMultiValueMap(fraudCheckData);
		final RMSIDResult result = restTemplate.postForObject(rmsFraudCheckRestUrl, multiValueMap, RMSIDResult.class);
		LOG.info("#RmsFraudCheck - ReferenceNo: {}", result.getReferenceNo());
		LOG.info("#RmsFraudCheck - TxnLogID: {}", result.getTxnLogID());
		LOG.info("#RmsFraudCheck - TemplateID: {}", Byte.valueOf(result.getTemplateID()));
		LOG.info("#RmsFraudCheck - CreatedOn: {}", result.getCreatedOn());
		LOG.info("#RmsFraudCheck - RiskLevel: {}", result.getRiskLevel());
		LOG.info("#RmsFraudCheck - RiskPercentage: {}", Byte.valueOf(result.getRiskPercentage()));
		LOG.info("#RmsFraudCheck - Amount: {}", Float.valueOf(result.getAmount()));
		LOG.info("#RmsFraudCheck - DeviceID: {}", result.getDeviceID());
		LOG.info("#RmsFraudCheck - DeviceProfileStatus: {}", result.getDeviceProfileStatus());
		LOG.info("#RmsFraudCheck - Accuracy: {}", result.getAccuracy());
		LOG.info("#RmsFraudCheck - DeviceType: {}", result.getDeviceType());
		LOG.info("#RmsFraudCheck - Origin: {}", result.getOrigin());
		LOG.info("#RmsFraudCheck - Output: {}", result.getOutput());
		LOG.info("#RmsFraudCheck - AffectedRules: {}", result.getAffectedRules());
		LOG.info("#rmsFraudCheck - Finish");
		return result;
	}

	private MultiValueMap<String, String> buildFraudCheckMultiValueMap(final FraudCheckData rmsFraudCheck)
	{
		final MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<>();
		multiValueMap.add(VARIABLE_NAME_MERCHANTID, rmsFraudCheck.getMerchantID());
		multiValueMap.add(VARIABLE_NAME_KEY, rmsFraudCheck.getKey());
		multiValueMap.add(VARIABLE_NAME_TEMPLATEID, rmsFraudCheck.getTemplateID());
		multiValueMap.add(VARIABLE_NAME_CUSTOMERID, rmsFraudCheck.getCustomerID());
		multiValueMap.add(VARIABLE_NAME_CARD_NUMBER, rmsFraudCheck.getCardNumber());
		multiValueMap.add(VARIABLE_NAME_USERMD5, rmsFraudCheck.getUserMD5());
		multiValueMap.add(VARIABLE_NAME_PASSMD5, rmsFraudCheck.getPassMD5());
		multiValueMap.add(VARIABLE_NAME_SITE, rmsFraudCheck.getSite());
		multiValueMap.add(VARIABLE_NAME_AMOUNT, rmsFraudCheck.getAmount());
		multiValueMap.add(VARIABLE_NAME_REFERENCE_NO, rmsFraudCheck.getReferenceNo());
		multiValueMap.add(VARIABLE_NAME_CUST_EMAIL, rmsFraudCheck.getCustEmail());
		multiValueMap.add(VARIABLE_NAME_CUSST_PHONE, rmsFraudCheck.getCustPhone());
		multiValueMap.add(VARIABLE_NAME_COUNTRY, rmsFraudCheck.getCountry());
		multiValueMap.add(VARIABLE_NAME_DATE_TIME, rmsFraudCheck.getDateTime());
		return multiValueMap;
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.fraud.client.FraudCheckRestClient#rmsStatusUpdate(com.cnk.travelogix.fraud.client.
	 * FraudCheckResponseUpdateData)
	 */
	@Override
	public com.cnk.travelogix.fraud.beans.updatestatus.RMSIDResult rmsStatusUpdate(
			final FraudCheckResponseUpdateData fraudCheckResponseUpdateData)
	{
		LOG.info("#rmsFraudCheck - Strat");
		LOG.info("RMSFraudCheckBean::{}", fraudCheckResponseUpdateData);
		final String rmsFraudCheckUpdateStatusRestUrl = configurationService.getConfiguration()
				.getString(FRAUD_CHECK_STATUS_UPDATE_REST_URL);
		LOG.info("RmsFraudCheckUrl: {}", rmsFraudCheckUpdateStatusRestUrl);
		final RestTemplate restTemplate = new RestTemplate();
		final List<HttpMessageConverter<?>> messageConverters = restTemplate.getMessageConverters();
		final FormHttpMessageConverter formHttpMessageConverter = new FormHttpMessageConverter();
		messageConverters.add(formHttpMessageConverter);
		restTemplate.setMessageConverters(messageConverters);
		final MultiValueMap<String, String> multiValueMap = this.buildUpdateStatusMultiValueMap(fraudCheckResponseUpdateData);
		final com.cnk.travelogix.fraud.beans.updatestatus.RMSIDResult result = restTemplate.postForObject(
				rmsFraudCheckUpdateStatusRestUrl, multiValueMap, com.cnk.travelogix.fraud.beans.updatestatus.RMSIDResult.class);

		LOG.info("#RmsFraudCheckStatusUpdate - :Update {}", result.getUpdate());
		LOG.info("#RmsFraudCheckStatusUpdate - :ReferenceNo {}", result.getReferenceNo());
		LOG.info("#RmsFraudCheckStatusUpdate - :TxnLogID {}", Byte.valueOf(result.getTxnLogID()));
		LOG.info("#RmsFraudCheckStatusUpdate - :TemplateID {}", result.getTemplateID());
		LOG.info("#RmsFraudCheckStatusUpdate - :CreatedOn {}", result.getCreatedOn());
		LOG.info("#RmsFraudCheckStatusUpdate - :Amount {}", Byte.valueOf(result.getAmount()));
		LOG.info("#RmsFraudCheckStatusUpdate - :RiskLevel {}", result.getRiskLevel());
		LOG.info("#RmsFraudCheckStatusUpdate - :RiskPercentage {}", Float.valueOf(result.getRiskPercentage()));
		LOG.info("#RmsFraudCheckStatusUpdate - :PaymentStatus {}", result.getPaymentStatus());
		LOG.info("#RmsFraudCheckStatusUpdate - :IsFraud {}", result.getIsFraud());
		LOG.info("#RmsFraudCheckStatusUpdate - :IsChargeback {}", result.getIsChargeback());

		return result;
	}

	private MultiValueMap<String, String> buildUpdateStatusMultiValueMap(
			final FraudCheckResponseUpdateData fraudCheckResponseUpdateData)
	{
		final MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<>();
		multiValueMap.add(VARIABLE_NAME_MERCHANTID, fraudCheckResponseUpdateData.getMerchantID());
		multiValueMap.add(VARIABLE_NAME_KEY, fraudCheckResponseUpdateData.getKey());
		multiValueMap.add(VARIABLE_NAME_TXNLOGID, fraudCheckResponseUpdateData.getTxnLogID());
		multiValueMap.add(VARIABLE_NAME_STATUS, fraudCheckResponseUpdateData.getStatus());

		return multiValueMap;
	}
}
