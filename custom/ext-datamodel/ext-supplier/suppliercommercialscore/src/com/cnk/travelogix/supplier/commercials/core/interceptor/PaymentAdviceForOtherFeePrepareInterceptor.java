/**
 *
 */
package com.cnk.travelogix.supplier.commercials.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.commercials.core.advanced.otherfee.paymentadvice.model.PaymentAdviceForOtherFeeModel;


/**
 * Prepare interceptor for PaymentAdviceForOtherFeeModel for autogenerating code
 *
 */
public class PaymentAdviceForOtherFeePrepareInterceptor implements PrepareInterceptor<PaymentAdviceForOtherFeeModel>
{
	private final Logger log = Logger.getLogger(PaymentAdviceForOtherFeePrepareInterceptor.class);

	private KeyGenerator keyGenerator;

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.interceptor.PrepareInterceptor#onPrepare(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onPrepare(final PaymentAdviceForOtherFeeModel paymentAdviceForOtherFee, final InterceptorContext ctx)
			throws InterceptorException
	{
		if (paymentAdviceForOtherFee.getCode() == null)
		{
			paymentAdviceForOtherFee.setCode(keyGenerator.generate().toString());
			log.debug("Set new code for PaymentAdviceForOtherFeeModel -" + paymentAdviceForOtherFee.getCode());
		}
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

}
