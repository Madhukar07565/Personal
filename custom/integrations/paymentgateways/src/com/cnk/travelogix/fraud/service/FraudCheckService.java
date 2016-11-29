package com.cnk.travelogix.fraud.service;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.exceptions.BusinessException;
import de.hybris.platform.servicelayer.session.Session;
import de.hybris.platform.servicelayer.session.SessionService;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.enums.PaymentServiceResponseDecisionEnum;
import com.cnk.travelogix.enums.RMSFraudCheckUpdateStatusEnum;
import com.cnk.travelogix.fraud.beans.checkfraud.RMSIDResult;
import com.cnk.travelogix.fraud.client.FraudCheckRestClient;
import com.cnk.travelogix.integrations.payment.fraud.beans.FraudCheckData;
import com.cnk.travelogix.integrations.payment.fraud.beans.FraudCheckResponseUpdateData;
import com.cnk.travelogix.integrations.payment.request.beans.PaymentUserSelectedData;


/**
 * This class intercepts executePayment operation and do fraud check.
 *
 * @author I077988
 */
public class FraudCheckService
{

	@Resource(name = "sessionService")
	private SessionService sessionService;

	private Converter<PaymentUserSelectedData, FraudCheckData> fraudCheckDataConverter;

	/**
	 * @return the fraudCheckDataConverter
	 */
	public Converter<PaymentUserSelectedData, FraudCheckData> getFraudCheckDataConverter()
	{
		return fraudCheckDataConverter;
	}

	/**
	 * @param fraudCheckDataConverter
	 *           the fraudCheckDataConverter to set
	 */
	public void setFraudCheckDataConverter(final Converter<PaymentUserSelectedData, FraudCheckData> fraudCheckDataConverter)
	{
		this.fraudCheckDataConverter = fraudCheckDataConverter;
	}

	private Converter<Map<String, String>, FraudCheckResponseUpdateData> fraudCheckStatusUpdateDataConverter;


	/**
	 * @return the fraudCheckStatusUpdateDataConverter
	 */
	public Converter<Map<String, String>, FraudCheckResponseUpdateData> getFraudCheckStatusUpdateDataConverter()
	{
		return fraudCheckStatusUpdateDataConverter;
	}

	/**
	 * @param fraudCheckStatusUpdateDataConverter
	 *           the fraudCheckStatusUpdateDataConverter to set
	 */
	public void setFraudCheckStatusUpdateDataConverter(
			final Converter<Map<String, String>, FraudCheckResponseUpdateData> fraudCheckStatusUpdateDataConverter)
	{
		this.fraudCheckStatusUpdateDataConverter = fraudCheckStatusUpdateDataConverter;
	}

	/**
	 * @return the fraudCheckDataConverter
	 */


	private static final Logger LOG = LoggerFactory.getLogger(FraudCheckService.class);

	/**
	 * @return the fraudCheckDataConverter
	 */


	@Autowired
	private FraudCheckRestClient fraudCheckRestClient;


	/**
	 * @return the fraudCheckDataConverter
	 */


	public boolean hopFraudCheck(final PaymentUserSelectedData paymentUserSelectedData) throws BusinessException
	{
		LOG.info("#fraudCheck - Start");
		final FraudCheckData fraudCheckBean = getFraudCheckData(paymentUserSelectedData);// Populate data
		final RMSIDResult fraudCheckRes = fraudCheckRestClient.rmsFraudCheck(fraudCheckBean);

		setThisValueIntoSession(FraudCheckRestClient.VARIABLE_NAME_TXNLOGID, fraudCheckRes.getTxnLogID());
		setThisValueIntoSession(FraudCheckRestClient.VARIABLE_NAME_RISK_LEVEL, fraudCheckRes.getRiskLevel());


		/* create Check for Fraud check failure */
		if (!FraudCheckRestClient.RMS_RESPONSE_VALUE_GREEN.equalsIgnoreCase(fraudCheckRes.getRiskLevel()))
		{
			LOG.info("#fraudCheck - Failed !");
			return false;
		}
		LOG.info("#fraudCheck - Finish !");
		return true;
	}

	/**
	 * @param fraudCheckRes
	 */
	private void setThisValueIntoSession(final String key, final String value)
	{
		final Session currSession = sessionService.getCurrentSession();
		if (currSession != null && StringUtils.isNotEmpty(value))
		{
			currSession.setAttribute(key, value);
		}
	}

	public Map<String, String> hopFraudCheckStatusUpdate(final boolean paymentTransactionStatus) throws BusinessException
	{
		LOG.info("#fraud Check Status Update - Start");
		final Map<String, String> statusValueMap = getStatusValueMap(paymentTransactionStatus);
		final FraudCheckResponseUpdateData fraudCheckResponseUpdateData = getFraudCheckUpdateStatusData(statusValueMap);// Populate data
		final com.cnk.travelogix.fraud.beans.updatestatus.RMSIDResult fraudCheckRes = fraudCheckRestClient
				.rmsStatusUpdate(fraudCheckResponseUpdateData);
		/* create Check for Fraud check failure */
		final Map<String, String> fraudCheckResponseMap = new HashMap<>();

		fraudCheckResponseMap.put(FraudCheckRestClient.RMS_RESPONSE_UPDATE_STATUS_TRANSACTION_KEY, fraudCheckRes.getUpdate());
		fraudCheckResponseMap.put(FraudCheckRestClient.RMS_RESPONSE_UPDATE_ISFRAUD_KEY,
				getPaymentServiceResponseDecisionValue(fraudCheckRes.getIsFraud(), fraudCheckRes.getPaymentStatus()));
		fraudCheckResponseMap.put(FraudCheckRestClient.RMS_RESPONSE_UPDATE_PAYMENT_STATUS_key, fraudCheckRes.getPaymentStatus());

		return fraudCheckResponseMap;
	}

	/**
	 * @param isFraud
	 * @param paymentStatus
	 * @return
	 */
	private String getPaymentServiceResponseDecisionValue(final String isFraud, final String paymentStatus)
	{
		final String riskLevel = getValueFromCurrentsession(FraudCheckRestClient.VARIABLE_NAME_RISK_LEVEL,
				Boolean.TRUE.booleanValue());

		if (isFraud.equalsIgnoreCase(FraudCheckRestClient.RMS_RESPONSE_IS_FRAUD_VALUE_NO)
				&& paymentStatus.equalsIgnoreCase(RMSFraudCheckUpdateStatusEnum.APPROVED.getCode())
				&& riskLevel.equalsIgnoreCase(FraudCheckRestClient.RMS_RESPONSE_VALUE_GREEN))
		{
			return PaymentServiceResponseDecisionEnum.ACCEPT.getCode();
		}
		else if (isFraud.equalsIgnoreCase(FraudCheckRestClient.RMS_RESPONSE_IS_FRAUD_VALUE_NO)
				&& paymentStatus.equalsIgnoreCase(RMSFraudCheckUpdateStatusEnum.APPROVED.getCode())
				&& riskLevel.equalsIgnoreCase(FraudCheckRestClient.RMS_RESPONSE_VALUE_YELLOW))
		{
			return PaymentServiceResponseDecisionEnum.REVIEW.getCode();
		}
		return PaymentServiceResponseDecisionEnum.CANCELED.getCode();
	}

	/**
	 * @param status
	 * @return
	 */
	private Map<String, String> getStatusValueMap(final boolean status)
	{
		final Map<String, String> valueMap = new HashMap<>();

		final String txnLogId = getValueFromCurrentsession(FraudCheckRestClient.VARIABLE_NAME_TXNLOGID,
				Boolean.TRUE.booleanValue());
		final String riskLevel = getValueFromCurrentsession(FraudCheckRestClient.VARIABLE_NAME_RISK_LEVEL,
				Boolean.FALSE.booleanValue());
		if (StringUtils.isNotEmpty(txnLogId))
		{
			final String rmsStatus = getRMSStatusValue(status, riskLevel);

			valueMap.put(FraudCheckRestClient.VARIABLE_NAME_TXNLOGID, txnLogId);
			valueMap.put(FraudCheckRestClient.VARIABLE_NAME_STATUS, rmsStatus);
		}

		return valueMap;
	}


	private String getRMSStatusValue(final boolean status, final String riskLevel)
	{
		if (status && riskLevel.equalsIgnoreCase(FraudCheckRestClient.RMS_RESPONSE_VALUE_GREEN))
		{
			return RMSFraudCheckUpdateStatusEnum.APPROVED.getCode();
		}
		else if (status && riskLevel.equalsIgnoreCase(FraudCheckRestClient.RMS_RESPONSE_VALUE_YELLOW))
		{
			return RMSFraudCheckUpdateStatusEnum.REVIEW.getCode();
		}
		else if (status && riskLevel.equalsIgnoreCase(FraudCheckRestClient.RMS_RESPONSE_VALUE_RED))
		{
			return RMSFraudCheckUpdateStatusEnum.REJECTED.getCode();
		}
		return RMSFraudCheckUpdateStatusEnum.IGNORED.getCode();
	}


	private String getValueFromCurrentsession(final String sessionKeyForValue, final boolean deleteFlag)
	{
		final Session currSession = sessionService.getCurrentSession();
		if (currSession != null)
		{
			final String valueFromSession = currSession.getAttribute(sessionKeyForValue);
			if (deleteFlag)
			{
				currSession.removeAttribute(sessionKeyForValue);
			}
			return org.apache.commons.lang.StringUtils.isNotBlank(valueFromSession) ? valueFromSession
					: FraudCheckRestClient.EMPTY_STRING;
		}
		return FraudCheckRestClient.EMPTY_STRING;
	}

	private FraudCheckResponseUpdateData getFraudCheckUpdateStatusData(final Map<String, String> valueMap)
	{
		// YTODO Auto-generated method stub
		return fraudCheckStatusUpdateDataConverter.convert(valueMap, new FraudCheckResponseUpdateData());
	}


	private FraudCheckData getFraudCheckData(final PaymentUserSelectedData paymentUserSelectedData)
	{
		return getFraudCheckDataConverter().convert(paymentUserSelectedData, new FraudCheckData());
	}


	public void setFraudCheckRestClient(final FraudCheckRestClient fraudCheckRestClient)
	{
		this.fraudCheckRestClient = fraudCheckRestClient;
	}
}