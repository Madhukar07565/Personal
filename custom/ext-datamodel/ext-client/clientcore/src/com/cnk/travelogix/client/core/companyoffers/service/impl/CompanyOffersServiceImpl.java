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
package com.cnk.travelogix.client.core.companyoffers.service.impl;

import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.cnk.travelogix.client.core.companyoffer.model.CodeDetailsRedemptionModel;
import com.cnk.travelogix.client.core.companyoffer.model.CompanyOffersModel;
import com.cnk.travelogix.client.core.companyoffer.model.RedemptionCompanyOffersModel;
import com.cnk.travelogix.client.core.companyoffers.dao.CompanyOfferDao;
import com.cnk.travelogix.client.core.companyoffers.service.CompanyOfferService;
import com.cnk.travelogix.client.core.enums.CodeGeneratedBy;


/**
 * Company offer service implementation class
 */
public class CompanyOffersServiceImpl implements CompanyOfferService
{
	private KeyGenerator keyGenerator;


	@Resource(name = "companyOfferDao")
	private CompanyOfferDao companyOfferDao;



	@Override
	public void generateCompanyOfferId(final CompanyOffersModel companyModel)
	{
		companyModel.setOfferID(getKeyGenerator().generate().toString());

	}


	/**
	 * @return the keyGenerator
	 */
	public KeyGenerator getKeyGenerator()
	{
		return keyGenerator;
	}


	/**
	 * @param keyGenerator
	 *           the keyGenerator to set
	 */
	public void setKeyGenerator(final KeyGenerator keyGenerator)
	{
		this.keyGenerator = keyGenerator;
	}


	@Override
	public void generateRedumptionConstructOfferId(final RedemptionCompanyOffersModel redemtionModel)
	{
		redemtionModel.setRedemptionOfferId(getKeyGenerator().generate().toString());
	}

	@Override
	public void generatedNoOfCodesGenerated(final CodeDetailsRedemptionModel noOfCodeToBeGenerated)
	{
		int quantity = 1;

		final List<String> codes = new ArrayList();

		if (noOfCodeToBeGenerated.getCodeGeneratedBy().equals(CodeGeneratedBy.PRODUCTWISECODE))
		{
			quantity = noOfCodeToBeGenerated.getNoOfCodeToBeGenerated().intValue();
		}
		for (int voucherCodesMedia = 0; voucherCodesMedia < quantity; ++voucherCodesMedia)
		{
			if (noOfCodeToBeGenerated.getPrefix() != null || !noOfCodeToBeGenerated.getPrefix().isEmpty())
			{
				codes.add(noOfCodeToBeGenerated.getPrefix() + "-" + getKeyGenerator().generate().toString());
			}
			else
			{
				codes.add(getKeyGenerator().generate().toString());
			}
		}
		noOfCodeToBeGenerated.setCodes(codes);

	}


	@Override
	public boolean checkForDuplicateAttibutes(final CompanyOffersModel companyModel)
	{
		boolean val;
		val = companyOfferDao.checkForDuplicateValues(companyModel);
		return val;
	}
}