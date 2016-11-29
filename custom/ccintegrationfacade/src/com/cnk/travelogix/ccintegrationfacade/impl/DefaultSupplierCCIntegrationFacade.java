package com.cnk.travelogix.ccintegrationfacade.impl;

import org.apache.log4j.Logger;
import org.springframework.core.convert.converter.Converter;

import com.cnk.travelogix.ccintegrationfacade.SupplierCCIntegrationFacade;
import com.cnk.travelogix.ccintegrationfacade.exception.CCIntegrationErrorCodes;
import com.cnk.travelogix.ccintegrationfacade.exception.CCIntegrationException;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.ResponseStatus;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.SubscriberAccount;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.SubscriberAccountOperationResponseData;
import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;


// TODO: Auto-generated Javadoc
/**
 * The Class DefaultSupplierCCIntegrationFacade.
 */
public class DefaultSupplierCCIntegrationFacade extends AbstractCCIntegrationFacade implements SupplierCCIntegrationFacade
{

	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(DefaultSupplierCCIntegrationFacade.class);

	/** The supplier subscriber account converter. */
	private Converter<SupplierModel, SubscriberAccount> supplierSubscriberAccountConverter;


	/**
	 * Creates the supplier account.
	 *
	 * @param pSupplierModel
	 *           the supplier model
	 * @throws CCIntegrationException
	 *            the CC integration exception
	 */

	@Override
	public void createSupplierAccount(final SupplierModel pSupplierModel) throws CCIntegrationException
	{
		LOGGER.debug("DefaultSupplierCCIntegrationFacade : createSupplierAccount() : Entering.");
		try
		{
			final SubscriberAccountOperationResponseData lSubscriberAccountOperationResponseData = super.createSubscriberAccount(
					pSupplierModel, getSupplierSubscriberAccountConverter());

			if (lSubscriberAccountOperationResponseData != null
					&& lSubscriberAccountOperationResponseData.getStatus().equals(ResponseStatus.RETURN))
			{
				//	RETRIEVE SUBSCRIBER ACC ID OR REF NUMMER AND SAVE TO MODEL
				//pSupplierModel

				//				pSupplierModel.setSubscriberAccountRef(lSubscriberAccountOperationResponseData.getSubscriberAccountReference());

				LOGGER.info("..........Subscriber Response Successfull");

			}

		}
		catch (final CCIntegrationException e)
		{
			throw e;
		}
		catch (final Exception e)
		{
			// Any other exception
			throw new CCIntegrationException(CCIntegrationErrorCodes.ERR_RUNTIME, e);
		}
		finally
		{
			LOGGER.debug("DefaultSupplierCCIntegrationFacade : createSupplierAccount() : Exiting");
		}
	}


	/**
	 * Gets the supplier subscriber account converter.
	 *
	 * @return the supplier subscriber account converter
	 */
	public Converter<SupplierModel, SubscriberAccount> getSupplierSubscriberAccountConverter()
	{
		return supplierSubscriberAccountConverter;
	}


	/**
	 * Sets the supplier subscriber account converter.
	 *
	 * @param supplierSubscriberAccountConverter
	 *           the supplier subscriber account converter
	 */
	public void setSupplierSubscriberAccountConverter(
			final Converter<SupplierModel, SubscriberAccount> supplierSubscriberAccountConverter)
	{
		this.supplierSubscriberAccountConverter = supplierSubscriberAccountConverter;
	}

}
