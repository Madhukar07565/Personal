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

import de.hybris.platform.catalog.enums.ArticleApprovalStatus;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.enumeration.EnumerationService;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.util.Config;
import de.hybris.platform.util.localization.Localization;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.common.facades.alert.service.AlertNotificationService;
import com.cnk.travelogix.datamodel.operation.reconfirmationconfig.model.ReconfirmationConfigModel;
import com.cnk.travelogix.masterdata.core.enums.ReconfirmationCutOffType;
import com.cnk.travelogix.masterdata.core.enums.ReconfirmationToBeSentToType;
import com.cnk.travelogix.operations.common.services.TravelogixAuthoriseUserService;
import com.cnk.travelogix.operations.data.ActivateParameterData;
import com.cnk.travelogix.operations.data.EnumerationDto;
import com.cnk.travelogix.operations.data.ReconfirmationConfigData;
import com.cnk.travelogix.operations.data.ReconfirmationSearchParameterData;
import com.cnk.travelogix.operations.facades.TravelogixCommonDataFacade;
import com.cnk.travelogix.operations.facades.TravelogixReconfirmationConfigFacade;
import com.cnk.travelogix.operations.services.LockUnlockService;
import com.cnk.travelogix.operations.services.TravelogixReconfirmationConfigService;


/**
 * This Facade design pattern used for Reconfirmation Config Master
 *
 * @author C5244543
 */
public class TravelogixReconfirmationConfigFacadeImpl implements TravelogixReconfirmationConfigFacade
{
	@Autowired
	private TravelogixCommonDataFacade travelogixCommonDataFacade;
	@Autowired
	private TravelogixReconfirmationConfigService reconfirmationConfigService;
	@Autowired
	private Converter<ReconfirmationConfigModel, ReconfirmationConfigData> reconfirmationConfigConverter;
	@Autowired
	private ModelService modelService;
	@Autowired
	private EnumerationService enumerationService;
	@Autowired
	private AlertNotificationService defaultAlertNotificationService;

	LockUnlockService<ReconfirmationConfigModel> lockUnlockService;
	@Autowired
	private TravelogixAuthoriseUserService travelogixAuthoriseUserService;
	@Autowired
	private UserService userService;

	private static final Logger LOG = Logger.getLogger(TravelogixReconfirmationConfigFacadeImpl.class);

	@Override
	public SearchPageData<ReconfirmationConfigData> getAllReconfirmationConfigs(
			final ReconfirmationSearchParameterData reconfirmationSearchParameterData, final PageableData pageableData)
	{
		final SearchPageData<ReconfirmationConfigModel> models = getReconfirmationConfigService()
				.getAllReconfirmationConfigs(reconfirmationSearchParameterData, pageableData);
		return convertPageData(models, getReconfirmationConfigConverter());
	}

	protected <S, T> SearchPageData<T> convertPageData(final SearchPageData<S> source, final Converter<S, T> converter)
	{
		final SearchPageData<T> result = new SearchPageData<>();
		result.setPagination(source.getPagination());
		result.setSorts(source.getSorts());
		result.setResults(Converters.convertAll(source.getResults(), converter));
		return result;
	}

	@Override
	public ReconfirmationConfigData getReconfirmationConfigForCode(final String code)
	{
		ReconfirmationConfigData configData = null;
		final ReconfirmationConfigModel configModel = reconfirmationConfigService.getReconfirmationConfigForCode(code);
		if (configModel != null)
		{
			configData = reconfirmationConfigConverter.convert(configModel);
		}
		else
		{
			if (LOG.isDebugEnabled())
			{
				LOG.debug(" Reconfirmation config Record Result of code[" + code + "] is null ");
			}
		}
		return configData;
	}

	@Override
	public List<EnumerationDto> getConfirmationFor()
	{
		final List<EnumerationDto> dtos = new ArrayList<>();
		final EnumerationDto dto = new EnumerationDto();
		dto.setCode("supplier");
		dto.setName("Supplier");
		dtos.add(dto);
		final EnumerationDto dto1 = new EnumerationDto();
		dto1.setCode("client");
		dto1.setName("Client");
		dtos.add(dto1);
		final EnumerationDto dto2 = new EnumerationDto();
		dto2.setCode("clientAndSupplier");
		dto2.setName("Client & Supplier");
		dtos.add(dto2);
		return dtos;
	}

	@Override
	public List<EnumerationDto> getRecofirmationCutOffType()
	{
		final List<EnumerationDto> dtos = new ArrayList<>();
		final List<ReconfirmationCutOffType> enumTypes = enumerationService
				.getEnumerationValues(ReconfirmationCutOffType._TYPECODE);
		for (final ReconfirmationCutOffType enumType : enumTypes)
		{
			final EnumerationDto dto = new EnumerationDto();
			dto.setCode(enumType.getCode());
			dto.setName(enumerationService.getEnumerationName(enumType));
			dtos.add(dto);
		}
		return dtos;
	}

	@Override
	public List<EnumerationDto> getRecofirmationToBeSentTo()
	{
		final List<EnumerationDto> dtos = new ArrayList<>();
		final List<ReconfirmationToBeSentToType> enumTypes = enumerationService
				.getEnumerationValues(ReconfirmationToBeSentToType._TYPECODE);
		for (final ReconfirmationToBeSentToType enumType : enumTypes)
		{
			final EnumerationDto dto = new EnumerationDto();
			dto.setCode(enumType.getCode());
			dto.setName(enumerationService.getEnumerationName(enumType));
			dtos.add(dto);
		}
		return dtos;
	}

	@Override
	public boolean deleteReconfirmationRecordForCode(final String code)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("Deleting the Reconfirmation record of code[" + code + "]");
		}
		final ReconfirmationConfigModel configModel = reconfirmationConfigService.getReconfirmationConfigForCode(code);

		if (configModel != null && !configModel.getApprovalStatus().equals(ArticleApprovalStatus.APPROVED))
		{
			modelService.remove(configModel);
			return true;
		}
		return false;
	}

	@Override
	public String updateReconfirmationRecordForCode(final ReconfirmationConfigData configData)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("Updating the Reconfirmation record of code[" + configData.getCode() + "]");
		}
		try
		{
			ReconfirmationConfigModel configModel = reconfirmationConfigService.getReconfirmationConfigForCode(configData.getCode());

			configModel = reconfirmationConfigService.addReconfirmationConfigRecord(configData, configModel);
			modelService.saveAll();
			if (LOG.isDebugEnabled())
			{
				LOG.debug("UPDATED Reconfirmation configuration record id is :" + configModel.getCode());
			}
		}
		catch (final Exception e)
		{
			LOG.error(e);
			return Localization.getLocalizedString("reconfirmationconfig.update.error");
		}
		return Localization.getLocalizedString("reconfirmationconfig.update.success");

	}

	@Override
	public boolean activateReconfirmationRecord(final ActivateParameterData activateData)
	{
		boolean flag = false;

		if (LOG.isDebugEnabled())
		{
			LOG.debug("Changing the active mode the Reconfirmation record of code[" + activateData.getCode() + "]");
		}
		if (activateData != null)
		{
			final ReconfirmationConfigModel configModel = reconfirmationConfigService
					.getReconfirmationConfigForCode(activateData.getCode());

			if (configModel != null)
			{
				configModel.setActive(activateData.getActive());
				configModel.setReason(activateData.getReason());
				configModel.setEffectiveFrom(activateData.getEffectiveFromDate());
				modelService.save(configModel);
				flag = true;
				defaultAlertNotificationService.sendNotification(activateData.getCode(),
						Localization.getLocalizedString("reconfirmationconfig.update.active.status", new Object[]
						{ activateData.getCode(), activateData.getActive() }), "Pending", (EmployeeModel) userService.getCurrentUser());
			}
		}
		return flag;
	}

	@Override
	public boolean releaseLockReconfirmationRecord(final String code)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("Releasing Lock the Reconfirmation record of code[" + code + "]");
		}
		final ReconfirmationConfigModel configModel = reconfirmationConfigService.getReconfirmationConfigForCode(code);
		final UserModel user = userService.getCurrentUser();
		if (user instanceof EmployeeModel)
		{
			final EmployeeModel currentUser = (EmployeeModel) user;

			if (configModel != null && lockUnlockService.canUnlock(configModel, currentUser))
			{
				lockUnlockService.unlock(configModel, currentUser);
				return true;
			}
		}
		return false;
	}


	@Override
	public boolean lockReconfirmationRecord(final String code)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("Locking the Reconfirmation record of code[" + code + "]");
		}
		final ReconfirmationConfigModel configModel = reconfirmationConfigService.getReconfirmationConfigForCode(code);

		if (configModel != null && lockUnlockService.canLock(configModel))
		{
			final UserModel user = userService.getCurrentUser();
			if (user instanceof EmployeeModel)
			{
				final EmployeeModel currentUser = (EmployeeModel) user;
				lockUnlockService.lock(configModel, currentUser);
				return true;
			}
		}
		return false;
	}

	@Override
	public String addRecofirmationRecord(final ReconfirmationConfigData configData)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("Adding the Reconfirmation configuration record");
		}
		try
		{
			ReconfirmationConfigModel reconfirmationConfigModel = modelService.create(ReconfirmationConfigModel.class);
			reconfirmationConfigModel = reconfirmationConfigService.addReconfirmationConfigRecord(configData,
					reconfirmationConfigModel);
			modelService.saveAll();
			if (LOG.isDebugEnabled())
			{
				LOG.debug("INSERTED Reconfirmation configuration record id is :" + reconfirmationConfigModel.getCode());
			}
		}
		catch (final Exception e)
		{
			LOG.error(e);
			return Localization.getLocalizedString("reconfirmationconfig.insert.duplicate.error");
		}
		return Localization.getLocalizedString("reconfirmationconfig.insert.success");
	}

	/**
	 * @return the reconfirmationConfigService
	 */
	public TravelogixReconfirmationConfigService getReconfirmationConfigService()
	{
		return reconfirmationConfigService;
	}

	/**
	 * @param reconfirmationConfigService
	 *           the reconfirmationConfigService to set
	 */
	public void setReconfirmationConfigService(final TravelogixReconfirmationConfigService reconfirmationConfigService)
	{
		this.reconfirmationConfigService = reconfirmationConfigService;
	}

	/**
	 * @return the reconfirmationConfigConverter
	 */
	public Converter<ReconfirmationConfigModel, ReconfirmationConfigData> getReconfirmationConfigConverter()
	{
		return reconfirmationConfigConverter;
	}

	/**
	 * @param reconfirmationConfigConverter
	 *           the reconfirmationConfigConverter to set
	 */
	public void setReconfirmationConfigConverter(
			final Converter<ReconfirmationConfigModel, ReconfirmationConfigData> reconfirmationConfigConverter)
	{
		this.reconfirmationConfigConverter = reconfirmationConfigConverter;
	}

	/**
	 * @return the lockUnlockService
	 */
	public LockUnlockService<ReconfirmationConfigModel> getLockUnlockService()
	{
		return lockUnlockService;
	}


	/**
	 * @param lockUnlockService
	 *           the lockUnlockService to set
	 */
	public void setLockUnlockService(final LockUnlockService<ReconfirmationConfigModel> lockUnlockService)
	{
		this.lockUnlockService = lockUnlockService;
	}

	@Override
	public boolean isReconfirmationApprover()
	{
		final String userGroup_Uid = Config.getParameter("reconfirmation.approver.group.name");
		return travelogixAuthoriseUserService.isApprover(userGroup_Uid);
	}

	@Override
	public boolean isReconfirmationCreator()
	{
		final String userGroup_Uid = Config.getParameter("reconfirmation.creator.group.name");
		return travelogixAuthoriseUserService.isApprover(userGroup_Uid);
	}


	@Override
	public boolean approvalReconfirmationRecord(final String code, final String remark)
	{
		boolean flag = false;
		if (LOG.isDebugEnabled())
		{
			LOG.debug("Approval the Reconfirmation record of code[" + code + "]");
		}
		final ReconfirmationConfigModel configModel = reconfirmationConfigService.getReconfirmationConfigForCode(code);
		if (configModel != null)
		{
			flag = travelogixCommonDataFacade.approval(configModel, remark);
			defaultAlertNotificationService.sendNotification(configModel.getCode(),
					Localization.getLocalizedString("reconfirmationconfig.update.approval.status.approved", new Object[]
					{ configModel.getCode(), userService.getCurrentUser().getName() }), "APPROVED", (EmployeeModel) userService.getCurrentUser());
		}
		return flag;
	}


	@Override
	public boolean rejectReconfirmationRecord(final String code, final String remark)
	{
		boolean flag = false;
		if (LOG.isDebugEnabled())
		{
			LOG.debug("Approval the Reconfirmation record of code[" + code + "]");
		}
		final ReconfirmationConfigModel configModel = reconfirmationConfigService.getReconfirmationConfigForCode(code);
		if (configModel != null)
		{
			flag = travelogixCommonDataFacade.reject(configModel, remark);
			defaultAlertNotificationService.sendNotification(configModel.getCode(),
					Localization.getLocalizedString("reconfirmationconfig.update.approval.status.unapproved", new Object[]
					{ configModel.getCode(), userService.getCurrentUser().getName() }), "UNAPPROVED", (EmployeeModel) userService.getCurrentUser());
		}
		return flag;
	}

}
