/**
 *
 */
package com.cnk.travelogix.supplier.commercials.core.dao;

import java.util.List;

import com.cnk.travelogix.supplier.commercials.core.advanced.incentiveontopup.model.SupplierIncentiveOnTopupRecordModel;
import com.cnk.travelogix.supplier.commercials.core.advanced.looktobook.model.SupplierLookToBookCommercialRecordModel;
import com.cnk.travelogix.supplier.commercials.core.advanced.msf.model.SupplierMSFFeeRecordModel;
import com.cnk.travelogix.supplier.commercials.core.advanced.otherfee.model.SupplierOtherFeeCommercialRecordModel;
import com.cnk.travelogix.supplier.commercials.core.advanced.penalty.model.SupplierPenaltyKickBackCommercialRecordModel;
import com.cnk.travelogix.supplier.commercials.core.advanced.signupbonus.model.SupplierSignUpBonusCommercialRecordModel;
import com.cnk.travelogix.supplier.commercials.core.advanced.termination.model.SupplierTerminationFeeCommercialRecordModel;


/* Dao for commercial heads */
public interface SupplierCommercialHeadsDao
{

	public List<SupplierSignUpBonusCommercialRecordModel> getSignupBonusCommercials();

	public List<SupplierIncentiveOnTopupRecordModel> getIncentiveOnTopup();

	public List<SupplierLookToBookCommercialRecordModel> getLookToBookCommercials();

	public List<SupplierTerminationFeeCommercialRecordModel> getTerminationFeeCommercials();

	public List<SupplierMSFFeeRecordModel> getMsfFees();

	public List<SupplierPenaltyKickBackCommercialRecordModel> getPenaltyKickbackCommercials();

	public List<SupplierOtherFeeCommercialRecordModel> getOtherFeeCommercials();
}
