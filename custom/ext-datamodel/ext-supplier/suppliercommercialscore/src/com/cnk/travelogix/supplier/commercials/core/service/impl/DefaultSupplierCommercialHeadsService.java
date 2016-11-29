/**
 *
 */
package com.cnk.travelogix.supplier.commercials.core.service.impl;

import de.hybris.platform.catalog.enums.ArticleApprovalStatus;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.Date;

import com.cnk.travelogix.supplier.commercials.core.advanced.incentiveontopup.model.SupplierIncentiveOnTopupRecordModel;
import com.cnk.travelogix.supplier.commercials.core.advanced.looktobook.model.SupplierLookToBookCommercialRecordModel;
import com.cnk.travelogix.supplier.commercials.core.advanced.msf.model.SupplierMSFFeeRecordModel;
import com.cnk.travelogix.supplier.commercials.core.advanced.otherfee.model.SupplierOtherFeeCommercialRecordModel;
import com.cnk.travelogix.supplier.commercials.core.advanced.penalty.model.SupplierPenaltyKickBackCommercialRecordModel;
import com.cnk.travelogix.supplier.commercials.core.advanced.signupbonus.model.SupplierSignUpBonusCommercialRecordModel;
import com.cnk.travelogix.supplier.commercials.core.advanced.termination.model.SupplierTerminationFeeCommercialRecordModel;
import com.cnk.travelogix.supplier.commercials.core.dao.SupplierCommercialHeadsDao;
import com.cnk.travelogix.supplier.commercials.core.service.SupplierCommercialHeadsService;


/**
 *
 */
public class DefaultSupplierCommercialHeadsService implements SupplierCommercialHeadsService
{
	private ModelService modelService;

	private SupplierCommercialHeadsDao supplierCommercialHeadsDao;

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.supplier.commercials.core.service.SupplierCommercialHeadsService#changeCommercialHeadsStatus()
	 */
	@Override
	public void changeCommercialHeadsStatus()
	{

		for (final SupplierSignUpBonusCommercialRecordModel signupBonus : supplierCommercialHeadsDao.getSignupBonusCommercials())
		{
			if (signupBonus.getValidTo().compareTo(new Date()) <= 0)
			{
				signupBonus.setApprovalStatus(ArticleApprovalStatus.UNAPPROVED);
			}
			modelService.save(signupBonus);
		}


		for (final SupplierIncentiveOnTopupRecordModel incentiveTopup : supplierCommercialHeadsDao.getIncentiveOnTopup())
		{
			if (incentiveTopup.getValidTo().compareTo(new Date()) <= 0)
			{
				incentiveTopup.setApprovalStatus(ArticleApprovalStatus.UNAPPROVED);
			}
			modelService.save(incentiveTopup);
		}


		for (final SupplierLookToBookCommercialRecordModel lookToBook : supplierCommercialHeadsDao.getLookToBookCommercials())
		{
			if (lookToBook.getValidTo().compareTo(new Date()) <= 0)
			{
				lookToBook.setApprovalStatus(ArticleApprovalStatus.UNAPPROVED);
			}
			modelService.save(lookToBook);
		}


		for (final SupplierMSFFeeRecordModel msfFee : supplierCommercialHeadsDao.getMsfFees())
		{
			if (msfFee.getValidTo().compareTo(new Date()) <= 0)
			{
				msfFee.setApprovalStatus(ArticleApprovalStatus.UNAPPROVED);
			}
			modelService.save(msfFee);
		}


		for (final SupplierOtherFeeCommercialRecordModel otherFee : supplierCommercialHeadsDao.getOtherFeeCommercials())
		{
			if (otherFee.getValidTo().compareTo(new Date()) <= 0)
			{
				otherFee.setApprovalStatus(ArticleApprovalStatus.UNAPPROVED);
			}
			modelService.save(otherFee);
		}


		for (final SupplierPenaltyKickBackCommercialRecordModel penaltyKickback : supplierCommercialHeadsDao
				.getPenaltyKickbackCommercials())
		{
			if (penaltyKickback.getValidTo().compareTo(new Date()) <= 0)
			{
				penaltyKickback.setApprovalStatus(ArticleApprovalStatus.UNAPPROVED);
			}
			modelService.save(penaltyKickback);
		}


		for (final SupplierTerminationFeeCommercialRecordModel terminationFee : supplierCommercialHeadsDao
				.getTerminationFeeCommercials())
		{
			if (terminationFee.getValidTo().compareTo(new Date()) <= 0)
			{
				terminationFee.setApprovalStatus(ArticleApprovalStatus.UNAPPROVED);
			}
			modelService.save(terminationFee);
		}

	}

	/**
	 * @return the modelService
	 */
	public ModelService getModelService()
	{
		return modelService;
	}

	/**
	 * @param modelService
	 *           the modelService to set
	 */
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	/**
	 * @return the supplierCommercialHeadsDao
	 */
	public SupplierCommercialHeadsDao getSupplierCommercialHeadsDao()
	{
		return supplierCommercialHeadsDao;
	}

	/**
	 * @param supplierCommercialHeadsDao
	 *           the supplierCommercialHeadsDao to set
	 */
	public void setSupplierCommercialHeadsDao(final SupplierCommercialHeadsDao supplierCommercialHeadsDao)
	{
		this.supplierCommercialHeadsDao = supplierCommercialHeadsDao;
	}

}
