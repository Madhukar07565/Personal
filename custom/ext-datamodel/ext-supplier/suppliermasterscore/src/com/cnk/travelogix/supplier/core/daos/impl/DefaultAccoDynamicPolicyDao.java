/**
 *
 */
package com.cnk.travelogix.supplier.core.daos.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

import de.hybris.platform.servicelayer.exceptions.ModelNotFoundException;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;

import java.util.List;

import org.apache.log4j.Logger;

import com.cnk.travelogix.masterdata.core.enums.PolicyDefinedByType;
import com.cnk.travelogix.supplier.core.daos.AccoDynamicPolicyDao;
import com.cnk.travelogix.supplier.masterdata.core.model.AccoDynamicPolicyModel;


/**
 * Implementation to check duplicate for "from" "to" and "percentage" from AccoDynamicPolicyModel
 *
 */
public class DefaultAccoDynamicPolicyDao extends AbstractItemDao implements AccoDynamicPolicyDao
{

	private static final Logger LOG = Logger.getLogger(DefaultAccoDynamicPolicyDao.class);

	String ACCODYNAMICPOLICY_QYERY = "SELECT {" + AccoDynamicPolicyModel.PK + "} FROM {" + AccoDynamicPolicyModel._TYPECODE
			+ " AS ap} WHERE {ap:" + AccoDynamicPolicyModel.CHARGESINPERCENTAGE + "} = ?chargesInPercentage and {ap:"
			+ AccoDynamicPolicyModel.FROMDAYSHOUR + "} = ?fromDaysHour and {ap:" + AccoDynamicPolicyModel.TODAYSHOUR
			+ "} = ?toDaysHour";

	String ACCOSLAB_QUERY = "SELECT {" + AccoDynamicPolicyModel.PK + "} FROM {" + AccoDynamicPolicyModel._TYPECODE + "}";

	String ACCOSLABPERCENTAGE_QUERY = "SELECT {" + AccoDynamicPolicyModel.PK + "} FROM {" + AccoDynamicPolicyModel._TYPECODE
			+ "} WHERE {" + AccoDynamicPolicyModel.CHARGESINPERCENTAGE + "} = ?chargesInPercentage ";

	String ACCOSLABAMOUNT_QUERY = "SELECT {" + AccoDynamicPolicyModel.PK + "} FROM {" + AccoDynamicPolicyModel._TYPECODE
			+ "} WHERE {" + AccoDynamicPolicyModel.CHARGESAMOUNT + "} = ?chargesAmount";
	String ACCOSLABCHARGENIGHT_QUERY = "SELECT {" + AccoDynamicPolicyModel.PK + "} FROM {" + AccoDynamicPolicyModel._TYPECODE
			+ "} WHERE {" + AccoDynamicPolicyModel.CHARGENIGHT + "} = ?chargeNight";

	String ACCO_CONTINUE_SLAB_QUERY = "SELECT {" + AccoDynamicPolicyModel.PK + "} FROM {" + AccoDynamicPolicyModel._TYPECODE
			+ " } WHERE {" + AccoDynamicPolicyModel.OWNER + "} == null ORDER BY {" + AccoDynamicPolicyModel.TODAYSHOUR
			+ "} DESC LIMIT 1; ";


	@Override
	public List<AccoDynamicPolicyModel> fetchFromToAndPercentage(final Double chargesInPercentage, final Integer fromDaysHour,
			final Integer toDaysHour)
	{
		validateParameterNotNull(chargesInPercentage, " ChargesInPercentage Should not null");
		validateParameterNotNull(fromDaysHour, " FromDaysHour Should not null");
		validateParameterNotNull(toDaysHour, " ToDaysHour Should not null");


		final FlexibleSearchQuery query = new FlexibleSearchQuery(ACCODYNAMICPOLICY_QYERY);
		if (chargesInPercentage != null)
		{
			query.addQueryParameter("chargesInPercentage", chargesInPercentage);
		}
		query.addQueryParameter("fromDaysHour", fromDaysHour);
		query.addQueryParameter("toDaysHour", toDaysHour);

		return getFlexibleSearchService().<AccoDynamicPolicyModel> search(query).getResult();
	}

	@Override
	public List<AccoDynamicPolicyModel> fetchSlabOfDayAndHour(final Integer fromDaysHour, final Integer toDaysHour)
	{
		validateParameterNotNull(fromDaysHour, " FromDaysHour Should not null");
		validateParameterNotNull(toDaysHour, " ToDaysHour Should not null");

		final FlexibleSearchQuery query = new FlexibleSearchQuery(ACCOSLAB_QUERY);

		query.addQueryParameter("fromDaysHour", fromDaysHour);
		query.addQueryParameter("toDaysHour", toDaysHour);

		return getFlexibleSearchService().<AccoDynamicPolicyModel> search(query).getResult();

	}

	@Override
	public List<AccoDynamicPolicyModel> checkDuplicacyOfChargeInPer(final Double chargesInPercentage)
	{

		final FlexibleSearchQuery query = new FlexibleSearchQuery(ACCOSLABPERCENTAGE_QUERY);
		if (chargesInPercentage != null)
		{
			query.addQueryParameter("chargesInPercentage", chargesInPercentage);
		}

		return getFlexibleSearchService().<AccoDynamicPolicyModel> search(query).getResult();
	}

	@Override
	public List<AccoDynamicPolicyModel> checkDuplicacyOfChargeAmout(final Double chargesAmount)
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(ACCOSLABAMOUNT_QUERY);
		if (chargesAmount != null)
		{
			query.addQueryParameter("chargesAmount", chargesAmount);
		}
		return getFlexibleSearchService().<AccoDynamicPolicyModel> search(query).getResult();
	}

	@Override
	public List<AccoDynamicPolicyModel> checkDuplicacyOfChargeNight(final Double chargeNight)
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(ACCOSLABCHARGENIGHT_QUERY);
		if (chargeNight != null)
		{
			query.addQueryParameter("chargeNight", chargeNight);
		}
		return getFlexibleSearchService().<AccoDynamicPolicyModel> search(query).getResult();
	}

	@Override
	public AccoDynamicPolicyModel checkContinuationOfSlab(final Integer fromDaysHour, final Integer toDaysHour,
			final PolicyDefinedByType definedBy) throws ModelNotFoundException
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(ACCO_CONTINUE_SLAB_QUERY);
		validateParameterNotNull(fromDaysHour, "fromDaysHour");
		validateParameterNotNull(toDaysHour, "toDaysHour");

		/*
		 * query.addQueryParameter("fromDaysHour", fromDaysHour); query.addQueryParameter("toDaysHour", toDaysHour);
		 * query.addQueryParameter("definedBy", definedBy);
		 */
		return getFlexibleSearchService().searchUnique(query);

	}




}
