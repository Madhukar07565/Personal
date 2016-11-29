
package com.cnk.travelogix.addon.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractCheckoutController;
import de.hybris.platform.acceleratorstorefrontcommons.forms.validation.GuestRegisterValidator;
import de.hybris.platform.acceleratorstorefrontcommons.security.AutoLoginStrategy;
import de.hybris.platform.commercefacades.customer.CustomerFacade;
import de.hybris.platform.commercefacades.user.UserFacade;
import de.hybris.platform.servicelayer.exceptions.BusinessException;
import de.hybris.platform.servicelayer.exceptions.ModelNotFoundException;
import de.hybris.platform.servicelayer.session.Session;
import de.hybris.platform.servicelayer.session.SessionService;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cnk.travelogix.addon.controllers.PaymentgatewaysControllerConstants;
import com.cnk.travelogix.facades.PaymentGatwayMapperFacade;
import com.cnk.travelogix.fraud.service.FraudCheckService;
import com.cnk.travelogix.integrations.payment.request.beans.FormAttribute;
import com.cnk.travelogix.integrations.payment.request.beans.PaymentGatewayMappingData;
import com.cnk.travelogix.integrations.payment.request.beans.PaymentUserSelectedData;
import com.cnk.travelogix.services.paymentgateways.PaymentGatewayService;
import com.cnk.travelogix.services.paymentgateways.request.PaymentGatewayProviderRequestService;


/**
 * CheckoutController
 */
@Controller
@Scope("tenant")
//@RequestMapping(value = "/my-account/paymentgateways")
@RequestMapping(value = "/checkout/multi/payment/paymentgateways")
public class PaymentGatewaysController extends AbstractCheckoutController
{
	private static final Logger LOG = Logger.getLogger(PaymentGatewaysController.class);
	/**
	 * We use this suffix pattern because of an issue with Spring 3.1 where a Uri value is incorrectly extracted if it
	 * contains on or more '.' characters. Please see https://jira.springsource.org/browse/SPR-6164 for a discussion on
	 * the issue and future resolution.
	 */

	@Resource(name = "guestRegisterValidator")
	private GuestRegisterValidator guestRegisterValidator;

	@Resource(name = "autoLoginStrategy")
	private AutoLoginStrategy autoLoginStrategy;

	@Resource(name = "paymentGatewayProviderRequestService")
	private PaymentGatewayProviderRequestService paymentGatewayProviderRequestService;

	@Resource(name = "userFacade")
	private UserFacade userFacade;

	@Resource(name = "sessionService")
	private SessionService sessionService;

	@Resource(name = "customerFacade")
	private CustomerFacade customerFacade;

	@Resource(name = "fraudCheckService")
	private FraudCheckService fraudCheckService;

	@Resource(name = "paymentGatwayMapperFacade")
	private PaymentGatwayMapperFacade paymentGatwayMapperFacade;




	@ExceptionHandler(ModelNotFoundException.class)
	public String handleModelNotFoundException(final ModelNotFoundException exception, final HttpServletRequest request)
	{
		request.setAttribute("message", exception.getMessage());
		return FORWARD_PREFIX + "/404";
	}

	@RequestMapping(method = RequestMethod.GET)
	public String getPaymentGateways(final Model model)
	{
		final Map<String, String> paymentGatewaysMap = new LinkedHashMap<String, String>();

		LOG.info("######################## Payment Addon #########################");

		final List<PaymentGatewayMappingData> paymentGatewayMappingList = paymentGatwayMapperFacade.getPaymentGatewayDataList();

		for (final PaymentGatewayMappingData currPaymentGatewayMappingData : paymentGatewayMappingList)
		{

			paymentGatewaysMap.put(currPaymentGatewayMappingData.getPaymentGatewayName(),
					currPaymentGatewayMappingData.getPaymentGatewayName());
		}

		model.addAttribute("paymentGatewaysMap", paymentGatewaysMap);

		return PaymentgatewaysControllerConstants.PAYMENT_GATEWAYS_PAGE;
	}

	@ResponseBody
	@RequestMapping(value = "/getPaymentProviderForm", method = RequestMethod.POST)
	public String getPaymentGatewayFormAjax(@RequestBody final PaymentUserSelectedData paymentUserSelectedData) throws IOException
	{
		LOG.info("Inside ajax call");

		setBaseSiteURLIntoSession(paymentUserSelectedData.getCurrentBaseSiteURL());

		try
		{

			final PaymentGatewayMappingData paymentGatewayMappingData = paymentGatwayMapperFacade
					.getPaymentGatewayMappingForPGName(paymentUserSelectedData.getPaymentGatewayId());

			LOG.info(paymentGatewayMappingData);


			final PaymentUserSelectedData UpdatedPaymentUserSelectedData = paymentGatwayMapperFacade
					.updateUserSelectedMappedPaymentGatewayData(paymentUserSelectedData);


			final Map<String, Map<String, FormAttribute>> xmlUnprocessedFormMap = paymentGatewayProviderRequestService
					.getPaymentGatewayFormUnprocessedMap(UpdatedPaymentUserSelectedData.getPaymentGatewayId());

			final Map<String, Map<String, FormAttribute>> userSelectionUpdatedFormMap = paymentGatewayProviderRequestService
					.getUserSelectedValuesUpdatedPaymentFormMap(xmlUnprocessedFormMap, UpdatedPaymentUserSelectedData);


			if (fraudCheckService.hopFraudCheck(UpdatedPaymentUserSelectedData))
			{
				final String htmlForm = paymentGatewayProviderRequestService.getPaymentSubmitForm(userSelectionUpdatedFormMap);
				LOG.info(htmlForm);
				removeBaseSiteURLFromSession();
				return htmlForm;
			}


		}
		catch (final BusinessException e)
		{

			LOG.debug("fraud Check Exception ! business exception ");
		}
		return null;
	}

	/**
	 *
	 */
	private void setBaseSiteURLIntoSession(final String baseSiteURL)
	{
		final Session session = sessionService.getCurrentSession();
		if (session != null)
		{
			session.setAttribute(PaymentGatewayService.BASE_SITE_URL, baseSiteURL);
		}
		// YTODO Auto-generated method stub

	}

	private void removeBaseSiteURLFromSession()
	{
		final Session session = sessionService.getCurrentSession();
		if (session != null)
		{
			session.removeAttribute(PaymentGatewayService.BASE_SITE_URL);
		}
		// YTODO Auto-generated method stub

	}



}

