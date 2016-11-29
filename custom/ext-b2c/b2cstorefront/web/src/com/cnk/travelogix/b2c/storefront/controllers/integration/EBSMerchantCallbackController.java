/**
 *
 */
package com.cnk.travelogix.b2c.storefront.controllers.integration;

import de.hybris.platform.acceleratorservices.payment.PaymentService;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * @author C5243355
 *
 */
@Controller
@RequestMapping(value = "/ebs/fraud-management-callback")
public class EBSMerchantCallbackController extends BaseIntegrationController
{
	private static final Logger LOG = Logger.getLogger(EBSMerchantCallbackController.class);
	@Resource(name = "acceleratorPaymentService")
	private PaymentService acceleratorPaymentService;

	@ResponseStatus(value = HttpStatus.OK)
	@RequestMapping(method = RequestMethod.POST)
	public void ebsCallBackhandler(final HttpServletRequest request,
			@RequestParam(value = "MerchantID", required = false) final String merchantID,
			@RequestParam(value = "TxnLogID", required = false) final String txnLogID,
			@RequestParam(value = "ReferenceNo", required = false) final String referenceNo,
			@RequestParam(value = "status", required = false) final String status,
			@RequestParam(value = "user", required = false) final String user,
			@RequestParam(value = "comment", required = false) final String comment) throws IOException
	{
		LOG.info("EBS Call Back Handler" + request);

		LOG.info("MerchantID - " + merchantID);
		LOG.info("MerchantID - " + txnLogID);
		LOG.info("MerchantID - " + referenceNo);
		LOG.info("MerchantID - " + status);
		LOG.info("MerchantID - " + user);
		LOG.info("MerchantID - " + comment);
	}

	/* method to mock a post call */
	@RequestMapping(method = RequestMethod.GET)
	public void ebsCallBackhandler(final HttpServletRequest request) throws IOException
	{
		final String urlParameters = "MerchantID=Test_Merchant&TxnLogID=TEST_1234&ReferenceNo=ORD_TEST1234&status=Rejected&user=TEST_USER&comment=MOCK_RESPONSE";
		final byte[] postData = urlParameters.getBytes(StandardCharsets.UTF_8);
		final int postDataLength = postData.length;
		final String request1 = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
				+ request.getRequestURI();
		final URL url = new URL(request1);
		final HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setInstanceFollowRedirects(false);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		conn.setRequestProperty("charset", "utf-8");
		conn.setRequestProperty("Content-Length", Integer.toString(postDataLength));
		conn.setUseCaches(false);
		try (DataOutputStream wr = new DataOutputStream(conn.getOutputStream()))
		{
			wr.write(postData);
		}
	}

}
