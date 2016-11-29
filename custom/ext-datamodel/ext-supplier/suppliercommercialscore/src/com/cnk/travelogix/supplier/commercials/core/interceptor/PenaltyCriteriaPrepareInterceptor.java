/**
 *
 */
package com.cnk.travelogix.supplier.commercials.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import java.util.Calendar;

import com.cnk.travelogix.supplier.commercials.core.advanced.penalty.model.PenaltyCriteriaModel;


/**
 * Prepare interceptor for PenaltyKickbackCommercial for setting period to date.
 */
public class PenaltyCriteriaPrepareInterceptor implements PrepareInterceptor<PenaltyCriteriaModel>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.interceptor.PrepareInterceptor#onPrepare(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onPrepare(final PenaltyCriteriaModel penaltyCriteriaModel, final InterceptorContext ctx)
			throws InterceptorException
	{
		if (penaltyCriteriaModel.getPercentage() == Boolean.TRUE && penaltyCriteriaModel.getValue() != null
				&& (penaltyCriteriaModel.getValue().doubleValue() > 100 || penaltyCriteriaModel.getValue().doubleValue() < 0))
		{
			throw new InterceptorException("Percentage should be in range 0-100");
		}
		if (penaltyCriteriaModel.getAchievementPeriod() != null && penaltyCriteriaModel.getPeriodFrom() != null)
		{
			final Calendar cal = Calendar.getInstance();
			cal.setTime(penaltyCriteriaModel.getPeriodFrom());
			switch (penaltyCriteriaModel.getAchievementPeriod())
			{
				case HOURLY:
					cal.add(cal.HOUR, 1);
					break;
				case DAILY:
					cal.add(cal.HOUR, 24);
					break;
				case WEEKLY:
					cal.add(cal.DAY_OF_WEEK, 7);
					break;
				case FORTNIGHTLY:
					cal.add(cal.DAY_OF_MONTH, 15);
					break;
				case MONTHLY:
					cal.add(cal.MONTH, 1);
					break;
				case QUARTERLY:
					cal.add(cal.MONTH, 3);
					break;
				case HALF_YEARLY:
					cal.add(cal.MONTH, 6);
					break;
				case ANNUAL:
					cal.add(cal.YEAR, 1);
					break;
				default:
					break;
			}
			penaltyCriteriaModel.setPeriodTo(cal.getTime());
		}
	}
}