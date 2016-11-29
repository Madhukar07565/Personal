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
package com.cnk.travelogix.crm.converter;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.util.Assert;

import com.cnk.travelogix.sap.crm.integration.mapping.dto.CRMCustReplicationWSRequest;
import com.cnk.travelogix.sap.crm.integration.mapping.dto.Custmast;

import de.hybris.platform.commerceservices.strategies.CustomerNameStrategy;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.c2l.RegionModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.search.restriction.SearchRestrictionService;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.user.UserService;

/**
 *
 */
public class CRMCustomerConverter extends AbstractCRMConverter {

	@Resource(name = "commonI18NService")
	private CommonI18NService commonI18NService;

	@Resource(name = "customerNameStrategy")
	private CustomerNameStrategy customerNameStrategy;

	@Resource(name = "modelService")
	private ModelService modelService;

	@Resource(name = "userService")
	private UserService userService;

	@Resource(name = "flexibleSearchService")
	FlexibleSearchService flexibleSearchService;

	@Resource(name = "searchRestrictionService")
	private SearchRestrictionService searchRestrictionService;

	Logger LOG = Logger.getLogger(CRMCustomerConverter.class);

	public void populateCustomerModel(final Custmast customerData, final CustomerModel customerModel) {
		Assert.notNull(customerData, "Parameter source cannot be null.");
		Assert.notNull(customerModel, "Parameter target cannot be null.");

			// Currency
		if (customerData.getCurrency() != null) {
			final String isocode = customerData.getCurrency();
			try {
				customerModel.setSessionCurrency(getCommonI18NService().getCurrency(isocode));
			} catch (final UnknownIdentifierException e) {
				throw new ConversionException("No currency with the code " + isocode + " found.", e);
			}
		}
		// First name and Last name
		customerModel.setName(getCustomerNameStrategy().getName(customerData.getName1(), customerData.getName2()));

		// Title
		if (StringUtils.isNotBlank(customerData.getTitle())) {
			customerModel.setTitle(getUserService().getTitleForCode(customerData.getTitle()));
		} else {
			customerModel.setTitle(null);
		}

		// UID
		setUid(customerData, customerModel);

		// Address
		setAddress(customerData, customerModel);

	}

	protected void setUid(final Custmast customerData, final CustomerModel customerModel) {
		// As per business we are setting uid as crm customer id if email id is
		// null.
		String uid = null;
		if (null != customerData.getEmail()) {
			uid = customerData.getEmail();
		} else {
			uid = customerData.getCustomer();
		}
		customerModel.setOriginalUid(uid);
		customerModel.setUid(uid);
	}

	protected void setAddress(final Custmast customerAddressData, final CustomerModel customerModel) {
		final AddressModel customerAddressModel = getModelService().create(AddressModel.class);

		if (StringUtils.isNotBlank(customerAddressData.getTitle())) {
			customerAddressModel.setTitle(getUserService().getTitleForCode(customerAddressData.getTitle()));
		}
		if (null != customerAddressData.getName1()) {
			customerAddressModel.setFirstname(customerAddressData.getName1());
		}
		if (null != customerAddressData.getName2()) {
			customerAddressModel.setLastname(customerAddressData.getName2());
		}
		if (null != customerAddressData.getCompCode()) {
			customerAddressModel.setCompany(customerAddressData.getCompCode());
		}
		if (null != customerAddressData.getStreet()) {
			customerAddressModel.setLine1(customerAddressData.getStreet());
		}
		if (null != customerAddressData.getStreet2()) {
			customerAddressModel.setLine2(customerAddressData.getStreet2());
		}
		if (null != customerAddressData.getStreet5()) {
			customerAddressModel.setTown(customerAddressData.getStreet5()); // town
		}
		if (null != customerAddressData.getPostalCode()) {
			customerAddressModel.setPostalcode(customerAddressData.getPostalCode());
		}
		if (null != customerAddressData.getTelNo()) {
			customerAddressModel.setPhone1(customerAddressData.getTelNo());
		}
		if (null != customerAddressData.getTelNo2()) {
			customerAddressModel.setPhone2(customerAddressData.getTelNo2());
		}

		if (customerAddressData.getCountryKey() != null) {
			final String isocode = customerAddressData.getCountryKey();
			try {
				final CountryModel countryModel = getCommonI18NService().getCountry(isocode);
				customerAddressModel.setCountry(countryModel);
			} catch (final UnknownIdentifierException e) {
				throw new ConversionException("No country with the code " + isocode + " found.", e);
			} catch (final AmbiguousIdentifierException e) {
				throw new ConversionException("More than one country with the code " + isocode + " found.", e);
			}
		}

		if (customerAddressData.getRegion() != null) {
			final String isocode = customerAddressData.getRegion();
			try {
				final RegionModel regionModel = getCommonI18NService()
						.getRegion(getCommonI18NService().getCountry(customerAddressData.getCountryKey()), isocode);
				customerAddressModel.setRegion(regionModel);
			} catch (final UnknownIdentifierException e) {
				throw new ConversionException("No region with the code " + isocode + " found.", e);
			} catch (final AmbiguousIdentifierException e) {
				throw new ConversionException("More than one region with the code " + isocode + " found.", e);
			}
		}
		customerAddressModel.setCity(getCity(customerAddressData.getCity()));

		customerAddressModel.setOwner(customerModel);
		customerModel.setDefaultShipmentAddress(customerAddressModel);
		customerModel.setDefaultPaymentAddress(customerAddressModel);

	}

	public CommonI18NService getCommonI18NService() {
		return commonI18NService;
	}

	public void setCommonI18NService(final CommonI18NService commonI18NService) {
		this.commonI18NService = commonI18NService;
	}

	public CustomerNameStrategy getCustomerNameStrategy() {
		return customerNameStrategy;
	}

	public void setCustomerNameStrategy(final CustomerNameStrategy customerNameStrategy) {
		this.customerNameStrategy = customerNameStrategy;
	}

	public ModelService getModelService() {
		return modelService;
	}

	public void setModelService(final ModelService modelService) {
		this.modelService = modelService;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(final UserService userService) {
		this.userService = userService;
	}
}
