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
package com.cnk.travelogix.operations.facades.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import com.cnk.travelogix.common.core.model.receipts.TravelogixRemarksModel;
import com.cnk.travelogix.operations.data.TravelogixRemarksData;
import com.cnk.travelogix.operations.employee.data.EmployeeData;


/**
 * The travelogix remarks populator
 */
public class TravelogixRemarksPopulator implements Populator<TravelogixRemarksModel, TravelogixRemarksData>
{
	private Converter<EmployeeModel, EmployeeData> employeeConverter;

	@Override
	public void populate(final TravelogixRemarksModel source, final TravelogixRemarksData target) throws ConversionException
	{
		target.setCreatedBy(employeeConverter.convert(source.getCreatedBy()));
		target.setCommentsText(source.getCommentsText());
		target.setChangedStatus(source.getChangedStatus());

	}

	/**
	 * @return the employeeConverter
	 */
	public Converter<EmployeeModel, EmployeeData> getEmployeeConverter()
	{
		return employeeConverter;
	}

	/**
	 * @param employeeConverter
	 *           the employeeConverter to set
	 */
	public void setEmployeeConverter(final Converter<EmployeeModel, EmployeeData> employeeConverter)
	{
		this.employeeConverter = employeeConverter;
	}

}
