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
package com.cnk.travelogix.common.core.payment.data;

/**
 *
 */
public class PaymentServerSetting
{

	/**
	 *
	 */
	private String paymentServerUrl;
	private String paymentServerVersion;
	private String paymentServerSecureSecret;

	private String mearchantAccessCode;
	private String mearchantId;
	private String mearchantSecureSecret;
	private String mearchantLocale;

	/**
	 * @return the mearchantLocale
	 */
	public String getMearchantLocale()
	{
		return mearchantLocale;
	}

	/**
	 * @param mearchantLocale
	 *           the mearchantLocale to set
	 */
	public void setMearchantLocale(final String mearchantLocale)
	{
		this.mearchantLocale = mearchantLocale;
	}

	/**
	 * @return the paymentServerUrl
	 */
	public String getPaymentServerUrl()
	{
		return paymentServerUrl;
	}

	/**
	 * @param paymentServerUrl
	 *           the paymentServerUrl to set
	 */
	public void setPaymentServerUrl(final String paymentServerUrl)
	{
		this.paymentServerUrl = paymentServerUrl;
	}

	/**
	 * @return the paymentServerVersion
	 */
	public String getPaymentServerVersion()
	{
		return paymentServerVersion;
	}

	/**
	 * @param paymentServerVersion
	 *           the paymentServerVersion to set
	 */
	public void setPaymentServerVersion(final String paymentServerVersion)
	{
		this.paymentServerVersion = paymentServerVersion;
	}

	/**
	 * @return the mearchantAccessCode
	 */
	public String getMearchantAccessCode()
	{
		return mearchantAccessCode;
	}

	/**
	 * @param mearchantAccessCode
	 *           the mearchantAccessCode to set
	 */
	public void setMearchantAccessCode(final String mearchantAccessCode)
	{
		this.mearchantAccessCode = mearchantAccessCode;
	}

	/**
	 * @return the mearchantId
	 */
	public String getMearchantId()
	{
		return mearchantId;
	}

	/**
	 * @param mearchantId
	 *           the mearchantId to set
	 */
	public void setMearchantId(final String mearchantId)
	{
		this.mearchantId = mearchantId;
	}

	/**
	 * @return the mearchantSecureSecret
	 */
	public String getMearchantSecureSecret()
	{
		return mearchantSecureSecret;
	}

	/**
	 * @param mearchantSecureSecret
	 *           the mearchantSecureSecret to set
	 */
	public void setMearchantSecureSecret(final String mearchantSecureSecret)
	{
		this.mearchantSecureSecret = mearchantSecureSecret;
	}

	/**
	 * @return the paymentServerSecureSecret
	 */
	public String getPaymentServerSecureSecret()
	{
		return paymentServerSecureSecret;
	}

	/**
	 * @param paymentServerSecureSecret
	 *           the paymentServerSecureSecret to set
	 */
	public void setPaymentServerSecureSecret(final String paymentServerSecureSecret)
	{
		this.paymentServerSecureSecret = paymentServerSecureSecret;
	}

	/**
	 * {@literal change bean to Map}
	 * <li>hide mearchantSecureSecret from the result map</li>
	 */
	//	public Map<String, String> toMap()
	//	{
	//		final Map<String, String> result = new HashMap<>();
	//		try
	//		{
	//			final BeanInfo info = Introspector.getBeanInfo(this.getClass());
	//			for (final PropertyDescriptor pd : info.getPropertyDescriptors())
	//			{
	//				final Method reader = pd.getReadMethod();
	//				if (reader != null)
	//				{
	//					if (pd.getName().equals("mearchantSecureSecret") || pd.getName().equals("class"))
	//					{
	//						continue;
	//					}
	//					final String returnValue = (String) (reader.invoke(this));
	//					if (StringUtils.isNotEmpty(returnValue) && !pd.getName().equals("mearchantSecureSecret"))
	//					{
	//						result.put(pd.getName(), returnValue);
	//					}
	//				}
	//			}
	//		}
	//		catch (final Exception e)
	//		{
	//			throw new RuntimeException("PaymentServerSetting toMap error, ", e);
	//		}
	//		return result;
	//	}

}
