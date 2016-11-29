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
package com.cnk.travelogix.user.converters.populator;

import de.hybris.platform.catalog.model.CompanyModel;
import de.hybris.platform.commercefacades.storesession.data.CurrencyData;
import de.hybris.platform.commercefacades.storesession.data.LanguageData;
import de.hybris.platform.commercefacades.user.data.UserGroupData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.security.PrincipalGroupModel;
import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.core.model.user.UserGroupModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.util.Assert;

import com.cnk.travelogix.operations.employee.data.EmployeeData;
import com.cnk.travelogix.orgstructure.core.model.BusinessUnitModel;
import com.cnk.travelogix.orgstructure.core.model.StrategicBusinessUnitModel;
import com.cnk.travelogix.orgstructure.core.sales.model.SalesGroupModel;
import com.cnk.travelogix.orgstructure.core.sales.model.SalesOfficeModel;
import com.cnk.travelogix.presales.model.RoleModel;


/**
 *
 */
public class EmployeePopulator implements Populator<EmployeeModel, EmployeeData>
{

	private Converter<CurrencyModel, CurrencyData> currencyConverter;
	private Converter<LanguageModel, LanguageData> languageConverter;

	@Resource(name = "userGroupConverter")
	private Converter<UserGroupModel, UserGroupData> userGroupConverter;

	@Override
	public void populate(final EmployeeModel source, final EmployeeData target) throws ConversionException
	{
		// YTODO Auto-generated method stub
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");

		if (source.getSessionCurrency() != null)
		{
			target.setCurrency(getCurrencyConverter().convert(source.getSessionCurrency()));
		}
		if (source.getSessionLanguage() != null)
		{
			target.setLanguage(getLanguageConverter().convert(source.getSessionLanguage()));
		}

		target.setName(source.getName());
		target.setUid(source.getUid());
		//target.setUid(source.getUid());
		target.setDisplayUid(source.getUid());
		target.setFirstName(source.getName());

		if (source.getName() != null)
		{
			if (null != source.getFirstName() && null != source.getMiddleName() && null != source.getLastName())
			{
				target.setName(
						source.getFirstName().concat(".").concat(source.getMiddleName().concat(".").concat(source.getLastName())));
			}
			//	target.setName(source.getFirstName().concat(".").concat(source.getMiddleName().concat(".").concat(source.getLastName())));
			target.setName(source.getName());

		}
		if (source.getFirstName() != null)
		{
			target.setFirstName(source.getFirstName());
		}
		if (source.getMiddleName() != null)
		{
			target.setMiddleName(source.getMiddleName());
		}
		if (source.getLastName() != null)
		{
			target.setLastName(source.getLastName());
		}
		if (source.getContactEmail() != null)
		{
			target.setContactEmail(source.getContactEmail());
		}
		if (source.getMobileNumber() != null)
		{
			target.setMobileNumber(source.getMobileNumber());
		}
		if (source.getDesignation() != null)
		{
			target.setDesignation(source.getDesignation());
		}
		if (source.getFunctionalRole() != null)
		{
			target.setFunctionalRole(source.getFunctionalRole().getName());
		}
		if (source.getReportingManager() != null)
		{
			target.setReportingManager(source.getReportingManager().getName());
		}

		target.setDefaultCompany(getCompany(source));

		target.setIsManager(source.getIsManager());

		target.setBu(getBU(source));

		target.setSbu(getSBU(source));

		target.setSalesOffice(getSalesOffice(source));

		target.setSalesGroup(getSalesGroup(source));

		target.setCompanies(getCompanies(source));

		final List<RoleModel> roleList = source.getRoles();
		final List<String> roleName = new ArrayList();
		if (roleList != null)
		{
			final Iterator<RoleModel> itr = roleList.iterator();
			while (itr.hasNext())
			{
				roleName.add(itr.next().getName());
			}
			target.setRoles(roleName);
		}
	}

	public String getCompany(final EmployeeModel employeeModel)
	{
		final Set<PrincipalGroupModel> principalGroupModels = employeeModel.getGroups();
		for (final PrincipalGroupModel principalGroupModel : principalGroupModels)
		{
			if (principalGroupModel instanceof CompanyModel)
			{
				final CompanyModel companyModel = (CompanyModel) principalGroupModel;
				return companyModel.getLocName();
			}
		}
		return null;
	}

	public String getBU(final EmployeeModel employeeModel)
	{
		final Set<PrincipalGroupModel> principalGroupModels = employeeModel.getGroups();
		for (final PrincipalGroupModel principalGroupModel : principalGroupModels)
		{
			if (principalGroupModel instanceof BusinessUnitModel)
			{
				final BusinessUnitModel bu = (BusinessUnitModel) principalGroupModel;
				return bu.getUid();
			}
		}
		return null;
	}

	public String getSBU(final EmployeeModel employeeModel)
	{
		final Set<PrincipalGroupModel> principalGroupModels = employeeModel.getGroups();
		for (final PrincipalGroupModel principalGroupModel : principalGroupModels)
		{
			if (principalGroupModel instanceof StrategicBusinessUnitModel)
			{
				final StrategicBusinessUnitModel sbu = (StrategicBusinessUnitModel) principalGroupModel;
				return sbu.getUid();
			}
		}
		return null;
	}

	public String getSalesOffice(final EmployeeModel employeeModel)
	{
		final Set<PrincipalGroupModel> principalGroupModels = employeeModel.getGroups();
		for (final PrincipalGroupModel principalGroupModel : principalGroupModels)
		{
			if (principalGroupModel instanceof SalesOfficeModel)
			{
				final SalesOfficeModel officeModel = (SalesOfficeModel) principalGroupModel;
				return officeModel.getUid();
			}
		}
		return null;
	}

	public String getSalesGroup(final EmployeeModel employeeModel)
	{
		final Set<PrincipalGroupModel> principalGroupModels = employeeModel.getGroups();
		for (final PrincipalGroupModel principalGroupModel : principalGroupModels)
		{
			if (principalGroupModel instanceof SalesGroupModel)
			{
				final SalesGroupModel salesGroupModel = (SalesGroupModel) principalGroupModel;
				return salesGroupModel.getDisplayName();
			}
		}
		return null;
	}

	public List<UserGroupData> getCompanies(final EmployeeModel employeeModel)
	{
		final Set<PrincipalGroupModel> principalGroupModels = employeeModel.getGroups();
		final List<UserGroupData> companies = new ArrayList<UserGroupData>();
		for (final PrincipalGroupModel principalGroupModel : principalGroupModels)
		{
			if (principalGroupModel instanceof CompanyModel)
			{
				companies.add(userGroupConverter.convert((UserGroupModel) principalGroupModel));
			} //if
		} //for
		return companies;
	}

	protected Converter<CurrencyModel, CurrencyData> getCurrencyConverter()
	{
		return currencyConverter;
	}

	@Required
	public void setCurrencyConverter(final Converter<CurrencyModel, CurrencyData> currencyConverter)
	{
		this.currencyConverter = currencyConverter;
	}

	protected Converter<LanguageModel, LanguageData> getLanguageConverter()
	{
		return languageConverter;
	}

	@Required
	public void setLanguageConverter(final Converter<LanguageModel, LanguageData> languageConverter)
	{
		this.languageConverter = languageConverter;
	}

}
