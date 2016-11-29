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
package com.cnk.travelogix.operations.facades.impl;

import de.hybris.platform.commercefacades.storesession.StoreSessionFacade;
import de.hybris.platform.commercefacades.storesession.data.CurrencyData;
import de.hybris.platform.commercefacades.user.UserFacade;
import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.user.UserService;

import java.util.Collection;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.cnk.travelogix.operations.employee.data.EmployeeData;
import com.cnk.travelogix.operations.facades.EmployeeFacade;
import com.cnk.travelogix.operations.services.OperationUserService;


/**
 *
 */
public class DefaultEmployeeFacade implements EmployeeFacade
{
	private UserService userService;

	private Converter<UserModel, EmployeeData> employeeConverter;

	private StoreSessionFacade storeSessionFacade;

	private UserFacade userFacade;

	private OperationUserService operationUserService;

	@Override
	public EmployeeData getCurrentEmployee()
	{
		if (getCurrentUser() instanceof EmployeeModel)
		{
			return getEmployeeConverter().convert(getCurrentUser());
		}
		return new EmployeeData();

	}

	private UserModel getCurrentUser()
	{
		return getUserService().getCurrentUser();
	}

	@Override
	public void loginSuccess()
	{
		final EmployeeData userData = getCurrentEmployee();

		// Update the session currency (which might change the cart currency)
		if (!updateSessionCurrency(userData.getCurrency(), getStoreSessionFacade().getDefaultCurrency()))
		{
			// Update the user
			getUserFacade().syncSessionCurrency();
		}

		// Update the user
		getUserFacade().syncSessionLanguage();

	}

	@Override
	public String getCurrentEmployeeUid()
	{
		return getCurrentUser().getUid();
	}





	protected boolean updateSessionCurrency(final CurrencyData preferredCurrency, final CurrencyData defaultCurrency)
	{
		if (preferredCurrency != null)
		{
			final String currencyIsoCode = preferredCurrency.getIsocode();

			// Get the available currencies and check if the currency iso code is supported
			final Collection<CurrencyData> currencies = getStoreSessionFacade().getAllCurrencies();
			for (final CurrencyData currency : currencies)
			{
				if (StringUtils.equals(currency.getIsocode(), currencyIsoCode))
				{
					// Set the current currency
					getStoreSessionFacade().setCurrentCurrency(currencyIsoCode);
					return true;
				}
			}
		}

		// Fallback to the default
		getStoreSessionFacade().setCurrentCurrency(defaultCurrency.getIsocode());
		return false;
	}




	/**
	 * @return the userService
	 */
	public UserService getUserService()
	{
		return userService;
	}

	/**
	 * @param userService
	 *           the userService to set
	 */
	public void setUserService(final UserService userService)
	{
		this.userService = userService;
	}

	/**
	 * @return the employeeConverter
	 */
	public Converter<UserModel, EmployeeData> getEmployeeConverter()
	{
		return employeeConverter;
	}

	/**
	 * @param employeeConverter
	 *           the employeeConverter to set
	 */
	public void setEmployeeConverter(final Converter<UserModel, EmployeeData> employeeConverter)
	{
		this.employeeConverter = employeeConverter;
	}

	/**
	 * @return the storeSessionFacade
	 */
	public StoreSessionFacade getStoreSessionFacade()
	{
		return storeSessionFacade;
	}

	/**
	 * @param storeSessionFacade
	 *           the storeSessionFacade to set
	 */
	public void setStoreSessionFacade(final StoreSessionFacade storeSessionFacade)
	{
		this.storeSessionFacade = storeSessionFacade;
	}

	/**
	 * @return the userFacade
	 */
	public UserFacade getUserFacade()
	{
		return userFacade;
	}

	/**
	 * @param userFacade
	 *           the userFacade to set
	 */
	public void setUserFacade(final UserFacade userFacade)
	{
		this.userFacade = userFacade;
	}

	@Override
	public EmployeeData viewEmployeedata(final String uid)
	{
		final EmployeeModel employeeModel = (EmployeeModel) getUserService().getUserForUID(uid);
		return employeeConverter.convert(employeeModel);
	}

	@Override
	public List<EmployeeData> getGroupMembers(final String group)
	{
		return getEmployeeConverter().convertAll(getOperationUserService().getGroupMembers(group));
	}

	/**
	 * @return the operationUserService
	 */
	public OperationUserService getOperationUserService()
	{
		return operationUserService;
	}

	/**
	 * @param operationUserService
	 *           the operationUserService to set
	 */
	public void setOperationUserService(final OperationUserService operationUserService)
	{
		this.operationUserService = operationUserService;
	}
}
