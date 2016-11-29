/**
 *
 */
package com.cnk.travelogix.supplier.masters.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;
import de.hybris.platform.util.localization.Localization;

import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.core.daos.services.AccoDynamicPolicyService;
import com.cnk.travelogix.supplier.masterdata.core.model.AccoDynamicPolicyModel;


/**
 * Interceptor to validate duplicacy in between "to","from","defaultby"
 *
 */
public class AccoDynamicPolicyValidateInterceptor implements ValidateInterceptor<AccoDynamicPolicyModel>
{

	private static final Logger LOG = Logger.getLogger(AccoDynamicPolicyValidateInterceptor.class.getName());

	AccoDynamicPolicyService accoDynamicPolicyService;
	KeyGenerator keyGenerator;

	@Override
	public void onValidate(final AccoDynamicPolicyModel accoDynamicPolicyModel, final InterceptorContext ctx)
			throws InterceptorException
	{
		if (LOG.isDebugEnabled())
		{
			LOG.info("Inside the onValidate method of AccoDynamicPolicyValidateInterceptor ");
		}
		if (ctx.isNew(accoDynamicPolicyModel))
		{

			if (((accoDynamicPolicyModel.getChargesInPercentage() != null) && (accoDynamicPolicyModel.getFromDaysHour() != null)
					&& (accoDynamicPolicyModel.getToDaysHour() != null))
					&& (!accoDynamicPolicyService.fetchFromToAndPercentage(accoDynamicPolicyModel.getChargesInPercentage(),
							accoDynamicPolicyModel.getFromDaysHour(), accoDynamicPolicyModel.getToDaysHour()).isEmpty()))
			{
				LOG.debug("Record is already exist.");
				throw new InterceptorException(Localization.getLocalizedString("supplier.policy.duplicate"));
			}

			checkDuplicayOfPercentage(accoDynamicPolicyModel);
			checkDulicacyOfAmount(accoDynamicPolicyModel);
			checkDulicayOfNight(accoDynamicPolicyModel);
			checkContinuationOfSlab(accoDynamicPolicyModel);
		}
	}

	private void checkDuplicayOfPercentage(final AccoDynamicPolicyModel accoDynamicPolicyModel) throws InterceptorException
	{
		if ((accoDynamicPolicyModel.getChargesInPercentage() != null)
				&& (!accoDynamicPolicyService.checkDuplicacyOfChargeInPer(accoDynamicPolicyModel.getChargesInPercentage()).isEmpty()))
		{
			LOG.debug("Record is already exist.");
			throw new InterceptorException(Localization.getLocalizedString("supplier.policy.duplicate"));
		}
	}

	private void checkDulicacyOfAmount(final AccoDynamicPolicyModel accoDynamicPolicyModel) throws InterceptorException
	{
		if ((accoDynamicPolicyModel.getChargesAmount() != null)
				&& (!accoDynamicPolicyService.checkDuplicacyOfChargeAmout(accoDynamicPolicyModel.getChargesAmount()).isEmpty()))
		{
			LOG.debug("Record is already exist.");
			throw new InterceptorException(Localization.getLocalizedString("supplier.policy.duplicate"));
		}
	}

	private void checkDulicayOfNight(final AccoDynamicPolicyModel accoDynamicPolicyModel) throws InterceptorException
	{
		if ((accoDynamicPolicyModel.getChargeNight() != null)
				&& (!accoDynamicPolicyService.checkDuplicacyOfChargeNight(accoDynamicPolicyModel.getChargeNight()).isEmpty()))
		{
			LOG.debug("Record is already exist.");
			throw new InterceptorException(Localization.getLocalizedString("supplier.policy.duplicate"));
		}
	}

	private void checkContinuationOfSlab(final AccoDynamicPolicyModel accoDynamicPolicyModel) throws InterceptorException
	{

		final Integer tempFromDay = accoDynamicPolicyModel.getFromDaysHour();
		final Integer tempToDay = accoDynamicPolicyModel.getToDaysHour();

		final AccoDynamicPolicyModel accoDynamicPolicyModel1 = accoDynamicPolicyService.checkContinuationOfSlab(
				accoDynamicPolicyModel.getFromDaysHour(), accoDynamicPolicyModel.getToDaysHour(),
				accoDynamicPolicyModel.getDefinedBy());

		if (accoDynamicPolicyModel1 != null)
		{
			final Integer toDay = accoDynamicPolicyModel1.getToDaysHour();
			final Integer addOneToday = new Integer(toDay.intValue() + 1);

			if (tempFromDay == addOneToday)
			{
				accoDynamicPolicyModel.setFromDaysHour(tempFromDay);
				accoDynamicPolicyModel.setToDaysHour(tempToDay);
				LOG.debug("New Record is saved successfully");
			}
			else
			{
				LOG.debug("Record is already exist.");
				throw new InterceptorException(Localization.getLocalizedString("supplier.policy.duplicate"));

			}
		}

	}

	public AccoDynamicPolicyService getAccoDynamicPolicyService()
	{
		return accoDynamicPolicyService;
	}


	public void setAccoDynamicPolicyService(final AccoDynamicPolicyService accoDynamicPolicyService)
	{
		this.accoDynamicPolicyService = accoDynamicPolicyService;
	}

	public KeyGenerator getKeyGenerator()
	{
		return keyGenerator;
	}

	public void setKeyGenerator(final KeyGenerator keyGenerator)
	{
		this.keyGenerator = keyGenerator;
	}


}
