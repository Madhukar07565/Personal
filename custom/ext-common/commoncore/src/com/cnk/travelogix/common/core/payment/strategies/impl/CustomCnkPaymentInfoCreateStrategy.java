/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package com.cnk.travelogix.common.core.payment.strategies.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

import de.hybris.platform.acceleratorservices.payment.data.CustomerInfoData;
import de.hybris.platform.acceleratorservices.payment.data.PaymentInfoData;
import de.hybris.platform.acceleratorservices.payment.data.SubscriptionInfoData;
import de.hybris.platform.commerceservices.customer.CustomerEmailResolutionService;
import de.hybris.platform.core.enums.CreditCardType;
import de.hybris.platform.core.model.order.payment.CreditCardPaymentInfoModel;
import de.hybris.platform.core.model.order.payment.DebitPaymentInfoModel;
import de.hybris.platform.core.model.order.payment.PaymentInfoModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import com.cnk.travelogix.common.core.enums.PaymentModes;
import com.cnk.travelogix.common.core.model.CodPaymentInfoModel;
import com.cnk.travelogix.common.core.payment.converters.populator.CodPaymentInfoReversePopulator;
import com.cnk.travelogix.common.core.payment.data.CodPaymentInfoData;
import com.cnk.travelogix.common.core.payment.strategies.CnkPaymentInfoCreateStrategy;
import com.cnk.travelogix.integrations.payment.response.beans.PaymentServiceResponseData;


public class CustomCnkPaymentInfoCreateStrategy implements CnkPaymentInfoCreateStrategy
{
	private static final Logger LOG = Logger.getLogger(CustomCnkPaymentInfoCreateStrategy.class);
	private ModelService modelService;
	private CommonI18NService commonI18NService;
	private CustomerEmailResolutionService customerEmailResolutionService;
	private UserService userService;
	private CodPaymentInfoReversePopulator codPaymentInfoReversePopulator;
	private ConfigurationService configurationService;

	@Override
	public CreditCardPaymentInfoModel createCreditCardPaymentInfo(final SubscriptionInfoData subscriptionInfo,
			final PaymentInfoData paymentInfo, final AddressModel billingAddress, final CustomerModel customerModel,
			final boolean saveInAccount)
	{
		//		validateParameterNotNull(subscriptionInfo, "subscriptionInfo cannot be null");
		validateParameterNotNull(paymentInfo, "paymentInfo cannot be null");
		//		validateParameterNotNull(billingAddress, "billingAddress cannot be null");
		validateParameterNotNull(customerModel, "customerModel cannot be null");
		AddressModel tmp = billingAddress;
		if (tmp == null)
		{
			tmp = new AddressModel();
		}

		String subscriptionId = null;
		if (subscriptionInfo != null)
		{
			subscriptionId = subscriptionInfo.getSubscriptionID();
		}

		final CreditCardPaymentInfoModel cardPaymentInfoModel = getModelService().create(CreditCardPaymentInfoModel.class);
		cardPaymentInfoModel.setBillingAddress(billingAddress);
		cardPaymentInfoModel.setCode(customerModel.getUid() + "_" + UUID.randomUUID());
		cardPaymentInfoModel.setUser(customerModel);
		cardPaymentInfoModel.setSubscriptionId(subscriptionId);

		cardPaymentInfoModel.setNumber(paymentInfo.getCardAccountNumber());
		final CreditCardType creditCardType = paymentInfo.getCardCardType() != null
				? CreditCardType.valueOf(paymentInfo.getCardCardType().toUpperCase()) : CreditCardType.VISA;
		cardPaymentInfoModel.setType(creditCardType);
		cardPaymentInfoModel.setCcOwner(getCCOwner(paymentInfo, tmp));
		cardPaymentInfoModel.setValidFromMonth(paymentInfo.getCardStartMonth());
		cardPaymentInfoModel.setValidFromYear(paymentInfo.getCardStartYear());
		if (paymentInfo.getCardExpirationMonth().intValue() > 0)
		{
			cardPaymentInfoModel.setValidToMonth(String.valueOf(paymentInfo.getCardExpirationMonth()));
		}
		if (paymentInfo.getCardExpirationYear().intValue() > 0)
		{
			cardPaymentInfoModel.setValidToYear(String.valueOf(paymentInfo.getCardExpirationYear()));
		}

		cardPaymentInfoModel.setSaved(saveInAccount);
		if (StringUtils.isNotBlank(paymentInfo.getCardIssueNumber()))
		{
			cardPaymentInfoModel.setIssueNumber(Integer.valueOf(paymentInfo.getCardIssueNumber()));
		}

		return cardPaymentInfoModel;
	}

	@Override
	public CreditCardPaymentInfoModel createCreditCardPaymentInfo(final String subscriptionId, final PaymentInfoData paymentInfo,
			final AddressModel billingAddress, final CustomerModel customerModel, final boolean saveInAccount)
	{
		validateParameterNotNull(paymentInfo, "paymentInfo cannot be null");
		validateParameterNotNull(customerModel, "customerModel cannot be null");
		final CreditCardPaymentInfoModel cardPaymentInfoModel = getModelService().create(CreditCardPaymentInfoModel.class);
		cardPaymentInfoModel.setBillingAddress(billingAddress);
		cardPaymentInfoModel.setCode(customerModel.getUid() + "_" + UUID.randomUUID());
		cardPaymentInfoModel.setUser(customerModel);
		cardPaymentInfoModel.setSubscriptionId(subscriptionId);
		cardPaymentInfoModel.setNumber(paymentInfo.getCardAccountNumber());
		final CreditCardType creditCardType = paymentInfo.getCardCardType() != null
				? CreditCardType.valueOf(paymentInfo.getCardCardType().toUpperCase()) : CreditCardType.VISA;
		cardPaymentInfoModel.setType(creditCardType);
		cardPaymentInfoModel.setCcOwner(getCCOwner(paymentInfo, billingAddress));
		cardPaymentInfoModel.setValidFromMonth(paymentInfo.getCardStartMonth());
		cardPaymentInfoModel.setValidFromYear(paymentInfo.getCardStartYear());
		if (paymentInfo.getCardExpirationMonth().intValue() > 0)
		{
			cardPaymentInfoModel.setValidToMonth(String.valueOf(paymentInfo.getCardExpirationMonth()));
		}
		if (paymentInfo.getCardExpirationYear().intValue() > 0)
		{
			cardPaymentInfoModel.setValidToYear(String.valueOf(paymentInfo.getCardExpirationYear()));
		}
		cardPaymentInfoModel.setSaved(saveInAccount);
		if (StringUtils.isNotBlank(paymentInfo.getCardIssueNumber()))
		{
			cardPaymentInfoModel.setIssueNumber(Integer.valueOf(paymentInfo.getCardIssueNumber()));
		}
		return cardPaymentInfoModel;
	}

	@Override
	public CreditCardPaymentInfoModel saveSubscription(final CustomerModel customerModel, final CustomerInfoData customerInfoData,
			final SubscriptionInfoData subscriptionInfo, final PaymentInfoData paymentInfoData, final boolean saveInAccount)
	{
		validateParameterNotNull(subscriptionInfo, "subscriptionInfo cannot be null");
		validateParameterNotNull(paymentInfoData, "paymentInfoData cannot be null");
		final CreditCardPaymentInfoModel cardPaymentInfoModel = this.createCreditCardPaymentInfo(subscriptionInfo, paymentInfoData,
				null, customerModel, saveInAccount);
		getModelService().save(cardPaymentInfoModel);
		getModelService().refresh(customerModel);

		final List<PaymentInfoModel> paymentInfoModels = new ArrayList<PaymentInfoModel>(customerModel.getPaymentInfos());
		if (!paymentInfoModels.contains(cardPaymentInfoModel))
		{
			paymentInfoModels.add(cardPaymentInfoModel);
			if (saveInAccount)
			{
				customerModel.setPaymentInfos(paymentInfoModels);
				getModelService().save(customerModel);
			}
			getModelService().save(cardPaymentInfoModel);
			getModelService().refresh(customerModel);
		}

		return cardPaymentInfoModel;
	}

	@Override
	public PaymentInfoModel saveHopPaymentInfo(final CustomerModel customerModel,
			final PaymentServiceResponseData paymentServiceResponse, final PaymentInfoData paymentInfoData,
			final boolean saveInAccount)
	{
		validateParameterNotNull(paymentServiceResponse, "subscriptionInfo cannot be null");
		validateParameterNotNull(paymentInfoData, "paymentInfoData cannot be null");
		PaymentInfoModel paymentInfoModel = null;
		if (PaymentModes.CREDITCARD.getCode().equals(paymentServiceResponse.getPaymentMode()))
		{
			paymentInfoModel = createCreditCardPaymentInfo(paymentServiceResponse.getReceiptNo(), paymentInfoData, null,
					customerModel, saveInAccount);
		}
		else if (PaymentModes.DEBITCARD.getCode().equals(paymentServiceResponse.getPaymentMode()))
		{
			paymentInfoModel = createDebitCardPaymentInfo(paymentServiceResponse.getReceiptNo(), paymentInfoData, null,
					customerModel, saveInAccount);
		}
		else
		{
			final boolean allowUnknownPaymentMode = configurationService.getConfiguration()
					.getBoolean("payment.allow.unknown.paymentmode");
			if (!allowUnknownPaymentMode)
			{
				LOG.error("unknown payment modes is used");
				throw new RuntimeException("unknown payment modes is used");
			}
			paymentInfoModel = getModelService().create(PaymentInfoModel.class);
			paymentInfoModel.setUser(customerModel);
			paymentInfoModel.setCode(customerModel.getUid() + "_" + UUID.randomUUID());
			LOG.warn("unknown payment modes is used");
		}
		getModelService().save(paymentInfoModel);
		getModelService().refresh(customerModel);
		final List<PaymentInfoModel> paymentInfoModels = new ArrayList<PaymentInfoModel>(customerModel.getPaymentInfos());
		if (!paymentInfoModels.contains(paymentInfoModel))
		{
			paymentInfoModels.add(paymentInfoModel);
			if (saveInAccount)
			{
				customerModel.setPaymentInfos(paymentInfoModels);
				getModelService().save(customerModel);
			}
			getModelService().save(paymentInfoModel);
			getModelService().refresh(customerModel);
		}
		return paymentInfoModel;
	}

	/**
	 * @param receiptNo
	 * @param paymentInfoData
	 * @param object
	 * @param customerModel
	 * @param saveInAccount
	 * @return
	 */
	@Override
	public DebitPaymentInfoModel createDebitCardPaymentInfo(final String receiptNo, final PaymentInfoData paymentInfo,
			final AddressModel billingAddress, final CustomerModel customerModel, final boolean saveInAccount)
	{
		validateParameterNotNull(paymentInfo, "paymentInfo cannot be null");
		validateParameterNotNull(customerModel, "customerModel cannot be null");
		final DebitPaymentInfoModel cardPaymentInfoModel = getModelService().create(CreditCardPaymentInfoModel.class);
		final AddressModel billingAddressNew = billingAddress == null ? new AddressModel() : billingAddress;
		cardPaymentInfoModel.setBillingAddress(billingAddressNew);
		cardPaymentInfoModel.setCode(customerModel.getUid() + "_" + UUID.randomUUID());
		cardPaymentInfoModel.setUser(customerModel);
		cardPaymentInfoModel.setReceiptNo(receiptNo);

		cardPaymentInfoModel.setAccountNumber(paymentInfo.getCardAccountNumber());
		cardPaymentInfoModel.setBank(paymentInfo.getCardCardType());
		cardPaymentInfoModel.setBaOwner(getCCOwner(paymentInfo, billingAddressNew));
		cardPaymentInfoModel.setSaved(saveInAccount);
		cardPaymentInfoModel.setBankIDNumber(paymentInfo.getCardIssueNumber());
		return cardPaymentInfoModel;

	}

	protected String getCCOwner(final PaymentInfoData paymentInfo, final AddressModel billingAddress)
	{
		if (paymentInfo.getCardAccountHolderName() != null && !paymentInfo.getCardAccountHolderName().isEmpty())
		{
			return paymentInfo.getCardAccountHolderName();
		}
		else
		{
			return billingAddress.getFirstname() + " " + billingAddress.getLastname();
		}
	}

	@Required
	public void setUserService(final UserService userService)
	{
		this.userService = userService;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.common.core.payment.strategies.CnkPaymentInfoCreateStrategy#saveEzeePaymentInfo(de.hybris.
	 * platform.core.model.user.CustomerModel, de.hybris.platform.acceleratorservices.payment.data.CustomerInfoData,
	 * de.hybris.platform.acceleratorservices.payment.data.PaymentInfoData, boolean)
	 */
	@Override
	public PaymentInfoModel saveEzeePaymentInfo(final CustomerModel customerModel, final CustomerInfoData customerInfoData,
			final PaymentInfoData paymentInfoData, final boolean b)
	{

		final PaymentInfoModel ezeePaymentInfoModel = getModelService().create(PaymentInfoModel.class);
		ezeePaymentInfoModel.setBillingAddress(null);
		ezeePaymentInfoModel.setCode(customerModel.getUid() + "_" + UUID.randomUUID());
		ezeePaymentInfoModel.setUser(customerModel);
		final PaymentInfoModel paymentInfoModel = ezeePaymentInfoModel;
		getModelService().save(ezeePaymentInfoModel);
		getModelService().refresh(customerModel);
		final List<PaymentInfoModel> paymentInfoModels = new ArrayList<PaymentInfoModel>(customerModel.getPaymentInfos());
		if (!paymentInfoModels.contains(paymentInfoModel))
		{
			paymentInfoModels.add(paymentInfoModel);
			getModelService().save(paymentInfoModel);
			getModelService().refresh(customerModel);
		}
		return paymentInfoModel;
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.common.core.payment.strategies.CnkPaymentInfoCreateStrategy#createCodPaymentInfo(de.hybris.
	 * platform.core.model.user.CustomerModel, com.cnk.travelogix.common.core.payment.data.CodPaymentInfoData)
	 */
	@Override
	public CodPaymentInfoModel createCodPaymentInfo(final CustomerModel customerModel, final CodPaymentInfoData cod)
	{
		validateParameterNotNull(cod, "codInfo cannot be null");
		final CodPaymentInfoModel codPaymentInfoModel = getModelService().create(CodPaymentInfoModel.class);
		getCodPaymentInfoReversePopulator().populate(cod, codPaymentInfoModel);
		codPaymentInfoModel.setUser(customerModel);
		codPaymentInfoModel.setCode(customerModel.getUid() + "_" + UUID.randomUUID());
		getModelService().save(codPaymentInfoModel);
		getModelService().refresh(customerModel);
		return codPaymentInfoModel;
	}


	protected ModelService getModelService()
	{
		return modelService;
	}

	@Required
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	protected CommonI18NService getCommonI18NService()
	{
		return commonI18NService;
	}

	@Required
	public void setCommonI18NService(final CommonI18NService commonI18NService)
	{
		this.commonI18NService = commonI18NService;
	}


	protected CustomerEmailResolutionService getCustomerEmailResolutionService()
	{
		return customerEmailResolutionService;
	}

	@Required
	public void setCustomerEmailResolutionService(final CustomerEmailResolutionService customerEmailResolutionService)
	{
		this.customerEmailResolutionService = customerEmailResolutionService;
	}

	protected UserService getUserService()
	{
		return userService;
	}

	/**
	 * @return the codPaymentInfoReversePopulator
	 */
	public CodPaymentInfoReversePopulator getCodPaymentInfoReversePopulator()
	{
		return codPaymentInfoReversePopulator;
	}

	/**
	 * @param codPaymentInfoReversePopulator
	 *           the codPaymentInfoReversePopulator to set
	 */
	public void setCodPaymentInfoReversePopulator(final CodPaymentInfoReversePopulator codPaymentInfoReversePopulator)
	{
		this.codPaymentInfoReversePopulator = codPaymentInfoReversePopulator;
	}

	/**
	 * @return the configurationService
	 */
	public ConfigurationService getConfigurationService()
	{
		return configurationService;
	}

	/**
	 * @param configurationService
	 *           the configurationService to set
	 */
	public void setConfigurationService(final ConfigurationService configurationService)
	{
		this.configurationService = configurationService;
	}
}
