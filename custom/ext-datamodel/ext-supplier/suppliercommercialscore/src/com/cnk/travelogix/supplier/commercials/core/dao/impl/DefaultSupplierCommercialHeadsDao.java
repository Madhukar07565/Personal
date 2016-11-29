/**
 *
 */
package com.cnk.travelogix.supplier.commercials.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import com.cnk.travelogix.supplier.commercials.core.advanced.incentiveontopup.model.SupplierIncentiveOnTopupRecordModel;
import com.cnk.travelogix.supplier.commercials.core.advanced.looktobook.model.SupplierLookToBookCommercialRecordModel;
import com.cnk.travelogix.supplier.commercials.core.advanced.msf.model.SupplierMSFFeeRecordModel;
import com.cnk.travelogix.supplier.commercials.core.advanced.otherfee.model.SupplierOtherFeeCommercialRecordModel;
import com.cnk.travelogix.supplier.commercials.core.advanced.penalty.model.SupplierPenaltyKickBackCommercialRecordModel;
import com.cnk.travelogix.supplier.commercials.core.advanced.signupbonus.model.SupplierSignUpBonusCommercialRecordModel;
import com.cnk.travelogix.supplier.commercials.core.advanced.termination.model.SupplierTerminationFeeCommercialRecordModel;
import com.cnk.travelogix.supplier.commercials.core.dao.SupplierCommercialHeadsDao;


/* Dao for commercial heads */
public class DefaultSupplierCommercialHeadsDao extends AbstractItemDao implements SupplierCommercialHeadsDao
{
	protected static final String signupBonusCommercialHeadQuery = "SELECT {" + SupplierSignUpBonusCommercialRecordModel.PK
			+ "} FROM {" + SupplierSignUpBonusCommercialRecordModel._TYPECODE + "}";

	protected static final String incentiveOnTopupQuery = "SELECT {" + SupplierIncentiveOnTopupRecordModel.PK + "} FROM {"
			+ SupplierIncentiveOnTopupRecordModel._TYPECODE + "}";

	protected static final String lookToBookCommercialsQuery = "SELECT {" + SupplierLookToBookCommercialRecordModel.PK + "} FROM {"
			+ SupplierLookToBookCommercialRecordModel._TYPECODE + "}";

	protected static final String terminationFeeCommercialQuery = "SELECT {" + SupplierTerminationFeeCommercialRecordModel.PK
			+ "} FROM {" + SupplierTerminationFeeCommercialRecordModel._TYPECODE + "}";

	protected static final String msfFeesQuery = "SELECT {" + SupplierMSFFeeRecordModel.PK + "} FROM {"
			+ SupplierMSFFeeRecordModel._TYPECODE + "}";

	protected static final String penaltyKickbackCommercialQuery = "SELECT {" + SupplierPenaltyKickBackCommercialRecordModel.PK
			+ "} FROM {" + SupplierPenaltyKickBackCommercialRecordModel._TYPECODE + "}";

	protected static final String otherFeeCommercialQuery = "SELECT {" + SupplierOtherFeeCommercialRecordModel.PK + "} FROM {"
			+ SupplierOtherFeeCommercialRecordModel._TYPECODE + "}";

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.supplier.commercials.core.dao.SupplierCommercialHeadsDao#getSignupBonusCommercials()
	 */
	@Override
	public List<SupplierSignUpBonusCommercialRecordModel> getSignupBonusCommercials()
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(signupBonusCommercialHeadQuery);
		final SearchResult<SupplierSignUpBonusCommercialRecordModel> result = search(query);

		return result.getResult();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.supplier.commercials.core.dao.SupplierCommercialHeadsDao#getIncentiveOnTopup()
	 */
	@Override
	public List<SupplierIncentiveOnTopupRecordModel> getIncentiveOnTopup()
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(incentiveOnTopupQuery);
		final SearchResult<SupplierIncentiveOnTopupRecordModel> result = search(query);

		return result.getResult();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.supplier.commercials.core.dao.SupplierCommercialHeadsDao#getLookToBookCommercials()
	 */
	@Override
	public List<SupplierLookToBookCommercialRecordModel> getLookToBookCommercials()
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(lookToBookCommercialsQuery);
		final SearchResult<SupplierLookToBookCommercialRecordModel> result = search(query);

		return result.getResult();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.supplier.commercials.core.dao.SupplierCommercialHeadsDao#getTerminationFeeCommercials()
	 */
	@Override
	public List<SupplierTerminationFeeCommercialRecordModel> getTerminationFeeCommercials()
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(terminationFeeCommercialQuery);
		final SearchResult<SupplierTerminationFeeCommercialRecordModel> result = search(query);

		return result.getResult();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.supplier.commercials.core.dao.SupplierCommercialHeadsDao#getMsfFees()
	 */
	@Override
	public List<SupplierMSFFeeRecordModel> getMsfFees()
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(msfFeesQuery);
		final SearchResult<SupplierMSFFeeRecordModel> result = search(query);

		return result.getResult();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.supplier.commercials.core.dao.SupplierCommercialHeadsDao#getPenaltyKickbackCommercials()
	 */
	@Override
	public List<SupplierPenaltyKickBackCommercialRecordModel> getPenaltyKickbackCommercials()
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(penaltyKickbackCommercialQuery);
		final SearchResult<SupplierPenaltyKickBackCommercialRecordModel> result = search(query);

		return result.getResult();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.supplier.commercials.core.dao.SupplierCommercialHeadsDao#getOtherFeeCommercials()
	 */
	@Override
	public List<SupplierOtherFeeCommercialRecordModel> getOtherFeeCommercials()
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(otherFeeCommercialQuery);
		final SearchResult<SupplierOtherFeeCommercialRecordModel> result = search(query);

		return result.getResult();
	}

}
