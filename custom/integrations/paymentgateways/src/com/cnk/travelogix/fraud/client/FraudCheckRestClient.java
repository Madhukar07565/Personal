/**
 *
 */
package com.cnk.travelogix.fraud.client;



import com.cnk.travelogix.integrations.payment.fraud.beans.FraudCheckData;
import com.cnk.travelogix.integrations.payment.fraud.beans.FraudCheckResponseUpdateData;


/**
 * @author I077988
 *
 */

public interface FraudCheckRestClient
{
	public static final String FRAUD_CHECK_REST_URL = "rms.base.rest.fraud.check.post.url";

	public static final String FRAUD_CHECK_STATUS_UPDATE_REST_URL = "rms.base.rest.update.by.txnlogid.post.url";

	public static final String VARIABLE_NAME_MERCHANTID = "MerchantID";
	public static final String VARIABLE_NAME_KEY = "Key";
	public static final String VARIABLE_NAME_TEMPLATEID = "TemplateID ";
	public static final String VARIABLE_NAME_CUSTOMERID = "CustomerID";
	public static final String VARIABLE_NAME_CARD_NUMBER = "CardNumber";
	public static final String VARIABLE_NAME_USERMD5 = "UserMD5";
	public static final String VARIABLE_NAME_PASSMD5 = "PassMD5";
	public static final String VARIABLE_NAME_SITE = "Site";
	public static final String VARIABLE_NAME_AMOUNT = "Amount";
	public static final String VARIABLE_NAME_REFERENCE_NO = "ReferenceNo";
	public static final String VARIABLE_NAME_CUST_EMAIL = "CustEmail";
	public static final String VARIABLE_NAME_CUSST_PHONE = "CustPhone";
	public static final String VARIABLE_NAME_COUNTRY = "Country";
	public static final String VARIABLE_NAME_DATE_TIME = "DateTime";
	public static final String VARIABLE_NAME_STATUS = "Status";
	public static final String VARIABLE_NAME_TXNLOGID = "TxnLogID";

	public static final String VARIABLE_NAME_RISK_LEVEL = "RiskLevel";
	public static final String VARIABLE_NAME_RISK_PERCENTAGE = "RiskPercentage";
	public static final String VARIABLE_NAME_DEVICE_ID = "DeviceID";
	public static final String VARIABLE_NAME_DEVICE_PROFILE_STATUS = "DeviceProfileStatus";
	public static final String VARIABLE_NAME_DEVICE_ACCUARACY = "Accuaracy";
	public static final String VARIABLE_NAME_DEVICE_TYPE = "DeviceType";

	public static final String RMS_RESPONSE_VALUE_SUCCESS = "SUCCESS";

	public static final String RMS_RESPONSE_VALUE_GREEN = "GREEN";
	public static final String RMS_RESPONSE_VALUE_YELLOW = "YELLOW";
	public static final String RMS_RESPONSE_VALUE_RED = "RED";

	public static final String RMS_RESPONSE_IS_FRAUD_VALUE_NO = "N";
	public static final String RMS_RESPONSE_IS_FRAUD_VALUE_YES = "Y";

	public static final String RMS_RESPONSE_UPDATE_STATUS_TRANSACTION_KEY = "update_status_transaction_key";
	public static final String RMS_RESPONSE_UPDATE_ISFRAUD_KEY = "is_fraud_key";
	public static final String RMS_RESPONSE_UPDATE_PAYMENT_STATUS_key = "payment_status_key";

	public static final String RMS_DATE_FORMAT = "YYYY-MM-DD HH:MM:SS";

	public static final String RMS_CREDENTIALS_MERCHANTID = "rms.rest.api.config.credentials.merchantid";
	public static final String RMS_CREDENTIALS_KEY = "rms.rest.api.config.credentials.key";
	public static final String RMS_CREDENTIALS_ECOM_TEMPLATEID = "rms.rest.api.config.credentials.ecom.templateid";
	public static final String RMS_CREDENTIALS_MOTTO_TEMPLATEID = "rms.rest.api.config.credentials.motto.templateid";
	public static final String RMS_CREDENTIALS_SITE = "rms.rest.api.config.credentials.site";

	public static final String EMPTY_STRING = "";





	/**
	 * @param fraudCheckBean
	 * @return RMSIDResult
	 */
	public com.cnk.travelogix.fraud.beans.checkfraud.RMSIDResult rmsFraudCheck(final FraudCheckData fraudCheckData);


	public com.cnk.travelogix.fraud.beans.updatestatus.RMSIDResult rmsStatusUpdate(
			final FraudCheckResponseUpdateData fraudCheckResponseUpdateData);

}
