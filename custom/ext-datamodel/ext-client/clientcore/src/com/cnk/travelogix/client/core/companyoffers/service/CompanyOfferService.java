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
package com.cnk.travelogix.client.core.companyoffers.service;

import com.cnk.travelogix.client.core.companyoffer.model.CodeDetailsRedemptionModel;
import com.cnk.travelogix.client.core.companyoffer.model.CompanyOffersModel;
import com.cnk.travelogix.client.core.companyoffer.model.RedemptionCompanyOffersModel;


/**
 *
 */
public interface CompanyOfferService
{

	void generateCompanyOfferId(CompanyOffersModel companyModel);

	/**
	 *
	 */
	void generateRedumptionConstructOfferId(RedemptionCompanyOffersModel redemtionModel);

	/**
	 *
	 */
	void generatedNoOfCodesGenerated(CodeDetailsRedemptionModel noOfCodeToBeGenerated);

	/*	*//**
		   * @return
		   *
		   */
	boolean checkForDuplicateAttibutes(CompanyOffersModel companyModel);

}
