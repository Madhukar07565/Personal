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
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;

import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.datamodel.operation.reconfirmationinterval.model.ReconfirmationIntervalModel;
import com.cnk.travelogix.datamodel.operation.supplierreconfirmationconfig.model.SupplierReconfirmationConfigModel;
import com.cnk.travelogix.masterdata.core.enums.ReconfirmationToBeSentToType;
import com.cnk.travelogix.operations.data.ReconfirmationIntervalData;
import com.cnk.travelogix.operations.data.SupplierReconfirmationConfigData;
import com.cnk.travelogix.operations.services.SupplierService;
import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;


/**
 * Populating SupplierReconfirmationConfig model into Data
 *
 * @author C5244543
 */
public class SupplierReconfirmationConfigReversePopulator
		implements Populator<SupplierReconfirmationConfigData, SupplierReconfirmationConfigModel>
{
	@Autowired
	private SupplierService commonSupplierService;
	@Autowired
	private ModelService modelService;
	@Autowired
	private Converter<ReconfirmationIntervalData, ReconfirmationIntervalModel> reconfirmationIntervalReverseConverter;

	@Override
	public void populate(final SupplierReconfirmationConfigData source, final SupplierReconfirmationConfigModel target)
			throws ConversionException
	{
		if (source != null)
		{
			target.setReconfirmationTo(ReconfirmationToBeSentToType.valueOf(source.getReconfirmationTo()));

			if (source.getSupplier() != null)
			{
				target.setSupplier(getSupplier(source));
			}
			if (source.getSupplierReconfirmationInterval() != null)
			{
				final ReconfirmationIntervalModel intervalModel = modelService.create(ReconfirmationIntervalModel.class);
				target.setSupplierReconfirmationInterval(
						reconfirmationIntervalReverseConverter.convert(source.getSupplierReconfirmationInterval(), intervalModel));
			}
		}
	}

	private SupplierModel getSupplier(final SupplierReconfirmationConfigData source)
	{
		return commonSupplierService.findSupplierByCode(source.getSupplier().getCode());
	}
}
