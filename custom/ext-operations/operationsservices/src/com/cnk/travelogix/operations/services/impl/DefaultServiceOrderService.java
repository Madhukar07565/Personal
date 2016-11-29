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
package com.cnk.travelogix.operations.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.cnk.travelogix.exception.commonlogging.customexception.UnknownException;
import com.cnk.travelogix.operation.enums.ServiceOrderStatus;
import com.cnk.travelogix.operation.enums.ServiceOrderType;
import com.cnk.travelogix.operation.enums.SupplierLiabilityStatus;
import com.cnk.travelogix.operation.enums.SupplierLiabilityType;
import com.cnk.travelogix.operation.serviceorder.model.ServiceOrderModel;
import com.cnk.travelogix.operation.serviceorder.model.SupplierLiabilityModel;
import com.cnk.travelogix.operations.daos.ServiceOrderDao;
import com.cnk.travelogix.operations.data.ServiceOrderSearchParameterData;
import com.cnk.travelogix.operations.exceptions.ServiceOrderException;
import com.cnk.travelogix.operations.services.ServiceOrderService;

import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.servicelayer.exceptions.ModelSavingException;
import de.hybris.platform.servicelayer.internal.model.impl.ItemModelCloneCreator;
import de.hybris.platform.servicelayer.internal.service.AbstractBusinessService;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;


/**
 * This Class provides services for creation, modification and cancellation of PSO, PSL, FSO and FSL.
 *
 */
public class DefaultServiceOrderService extends AbstractBusinessService implements ServiceOrderService
{
	private static final Logger LOG = Logger.getLogger(DefaultServiceOrderService.class);

	private KeyGenerator keyGenerator;
	private ItemModelCloneCreator cloneCreator;
	private FlexibleSearchService flexibleSearchService;
	private ServiceOrderDao serviceOrderDao;

	/**
	 * This method creates new provisional service order for order entries.
	 */
	@Override
	public List<ServiceOrderModel> createProvisionalServiceOrder(final AbstractOrderModel order) throws ServiceOrderException
	{
		if (order == null)
		{
			throw new ServiceOrderException(UnknownException.ERROR_CODE,
					"Abstract order model is null, unable to proceed with the creation of service orders !");
		}

		if (order.getEntries() == null || order.getEntries().isEmpty())
		{
			throw new ServiceOrderException(UnknownException.ERROR_CODE, "Order entries are unavailable for order: "
					+ order.getCode() + ", unable to proceed with the creation of service orders !");
		}

		final List<ServiceOrderModel> serviceOrders = new ArrayList<ServiceOrderModel>();
		for (final AbstractOrderEntryModel entry : order.getEntries())
		{
			try
			{
				//Create new instance of service order and populating with values.
				final ServiceOrderModel pso = getModelService().create(ServiceOrderModel.class);

				//Generating code of PSO as Order code + Order entry number.
				pso.setCode(order.getCode() + String.valueOf(entry.getEntryNumber()));
				pso.setType(ServiceOrderType.PSO);
				pso.setVersionNumber(Double.valueOf(1.0d));
				pso.setServiceOrderStatus(ServiceOrderStatus.FSO_NOT_GENERATED);
				pso.setActive(Boolean.TRUE);
				//Set below fields TODO
				//pso.setCurrency(value);
				//pso.setTravelCompletionDate(value);
				//pso.setPricingDetails(value);
				//pso.setPaymentStatus(value);
				pso.setOrderEntry(entry);
				entry.setLatestServiceOrder(pso);
				getModelService().saveAll(pso, entry);

				//Creating PSL only if the PSO creation is successful. In case of exception in PSO generation PSL will not be created.
				createProvisionalSupplierLiability(pso);

				serviceOrders.add(pso);
			}
			catch (final ModelSavingException ex)
			{
				LOG.error(ex);
				LOG.error("Unable to create PSO for order: " + order.getCode() + " with order entry: " + entry.getEntryNumber());
			}
		}
		return serviceOrders;
	}


	/**
	 * This method creates new version of Provisional Service Orders whenever there is any modification/amendments in the
	 * booking. Also it updates the status of older service orders to Cancel state.
	 */
	@Override
	public void modifyProvisionalServiceOrder(final AbstractOrderEntryModel entry) throws ServiceOrderException
	{
		if (entry == null)
		{
			throw new ServiceOrderException(UnknownException.ERROR_CODE,
					"Order entry null, unable to proceed with the creation of service orders !");
		}

		final ServiceOrderModel pso = entry.getLatestServiceOrder();
		if (pso == null)
		{
			throw new ServiceOrderException(UnknownException.ERROR_CODE,
					"Unable to get PSO for Order: " + entry.getOrder().getCode() + " with order entry: " + entry.getEntryNumber());
		}

		try
		{
			//Cloning the latest PSO
			final ServiceOrderModel newPso = createNewSOVersion(entry);

			//Updating the Latest Service Order in order entry.
			entry.setLatestServiceOrder(newPso);

			//Setting status of Old PSO to PSO_CANCELLED
			pso.setServiceOrderStatus(ServiceOrderStatus.PSO_CANCELLED);

			// Make modification in the new PSO TODO
			// Make changes related to amendment charges and other parameters.


			//Saving all the modifications
			getModelService().saveAll(newPso, pso, entry);

			//Canceling Old Supplier Liability
			cancelProvisionalSupplierLiability(pso);

			//Creating PSL only if the PSO creation is successful. In case of exception in PSO generation PSL will not be created.
			createProvisionalSupplierLiability(newPso);

		}
		catch (final ItemModelCloneCreator.CannotCloneException | ModelSavingException ex)
		{
			LOG.error(ex);
			throw new ServiceOrderException(UnknownException.ERROR_CODE,
					"Unable to modify PSO for order: " + entry.getOrder().getCode() + " for order entry: " + entry.getEntryNumber());
		}

	}

	/**
	 * This method creates new version of Provisional Service Orders whenever there is cancellation of PSO. Also it
	 * updates the status of older service orders to Cancel state.
	 */
	@Override
	public void cancelProvisionalServiceOrder(final AbstractOrderEntryModel entry) throws ServiceOrderException
	{
		if (entry == null)
		{
			throw new ServiceOrderException(UnknownException.ERROR_CODE,
					"Order entry null, unable to proceed with the creation of service orders !");
		}

		final ServiceOrderModel pso = entry.getLatestServiceOrder();
		if (pso == null)
		{

			throw new ServiceOrderException(UnknownException.ERROR_CODE,
					"Unable to get PSO for Order: " + entry.getOrder().getCode() + " with order entry: " + entry.getEntryNumber());

		}

		try
		{
			//Cloning the latest PSO
			final ServiceOrderModel newPso = createNewSOVersion(entry);

			//Updating the Latest Service Order in order entry.
			entry.setLatestServiceOrder(newPso);

			//Setting status of new PSO to FSO_NOT_GENERATED.
			newPso.setServiceOrderStatus(ServiceOrderStatus.FSO_NOT_GENERATED);

			//Setting status of old PSO to PSO_CANCELLED
			pso.setServiceOrderStatus(ServiceOrderStatus.PSO_CANCELLED);

			//Make modification in the new PSO
			// Make changes related to cancellation charges and other parameters.


			//Saving all the modifications
			getModelService().saveAll(newPso, pso, entry);

			//Setting status of Old PSL to PSL_CANCELLED
			cancelProvisionalSupplierLiability(pso);

			//Creating PSL only if the PSO creation is successful. In case of exception in PSO generation PSL will not be created.
			createProvisionalSupplierLiability(newPso);

		}
		catch (final ItemModelCloneCreator.CannotCloneException | ModelSavingException ex)
		{
			LOG.error(ex);
			throw new ServiceOrderException(UnknownException.ERROR_CODE,
					"Unable to Cancel PSO for order: " + entry.getOrder().getCode() + " for order entry: " + entry.getEntryNumber());
		}

	}

	/**
	 * This method will create Final Service Order from latest Service Order.
	 */
	@Override
	public ServiceOrderModel createFinalServiceOrder(final AbstractOrderEntryModel entry) throws ServiceOrderException
	{
		if (entry == null)
		{
			throw new ServiceOrderException(UnknownException.ERROR_CODE,
					"Order entry null, unable to proceed with the creation of service orders !");
		}

		final ServiceOrderModel pso = entry.getLatestServiceOrder();
		if (pso == null)
		{
			throw new ServiceOrderException(UnknownException.ERROR_CODE,
					"Unable to get PSO for Order: " + entry.getOrder().getCode() + " with order entry: " + entry.getEntryNumber());
		}

		try
		{
			//Cloning the latest PSO
			final ServiceOrderModel fso = createNewSOVersion(entry);

			//Updating the Latest Service Order in order entry.
			entry.setLatestServiceOrder(fso);

			//Set type of Final Service Order.
			fso.setType(ServiceOrderType.FSO);

			//Setting status of Old PSO to FSO_GENERATED
			pso.setServiceOrderStatus(ServiceOrderStatus.FSO_GENERATED);

			//Setting status of  FSO to BILL_PASSING_PENDING
			fso.setServiceOrderStatus(ServiceOrderStatus.BILL_PASSING_PENDING);


			// Make modification in the FSO TODO
			// Make changes related to amendment charges and other parameters.



			//Saving all the modifications
			getModelService().saveAll(fso, pso, entry);

			//Changing status of last PSL to FSL_Generated
			cancelProvisionalSupplierLiability(pso);

			//create FSL logic.
			createFinalSupplierLiability(fso);

			return fso;

		}
		catch (final ItemModelCloneCreator.CannotCloneException | ModelSavingException ex)
		{
			LOG.error(ex);
			throw new ServiceOrderException(UnknownException.ERROR_CODE,
					"Unable to create FSO for order: " + entry.getOrder().getCode() + " for order entry: " + entry.getEntryNumber());
		}
	}

	/**
	 * This method handles the cancellation of Final Service Orders.
	 */
	@Override
	public void cancelFinalServiceOrder(final AbstractOrderEntryModel entry) throws ServiceOrderException
	{
		// TODO  - To be implemented

	}

	@Override
	public SearchPageData<ServiceOrderModel> searchServiceOrders(final ServiceOrderSearchParameterData searchData,
			final PageableData pageableData)
	{
		SearchPageData<ServiceOrderModel> searchPageData = null;
		if (searchData != null)
		{
			try
			{
				searchPageData = serviceOrderDao.searchServiceOrders(searchData, pageableData);
			}
			catch (final Exception e)
			{
				LOG.error("Exception occured at the time of searching Service Order records...!! ", e);
			}
		}
		return searchPageData;
	}

	/**
	 * This method creates PSL. This method is not exposed via interface as the PSL is only created after successful
	 * creation of PSO. Stand alone creation of PSL is not possible.
	 */
	private SupplierLiabilityModel createProvisionalSupplierLiability(final ServiceOrderModel pso)
	{
		final SupplierLiabilityModel psl = getModelService().create(SupplierLiabilityModel.class);
		psl.setCode(String.valueOf(getKeyGenerator().generate()));
		psl.setType(SupplierLiabilityType.PSL);
		psl.setSupplierLiabilityStatus(SupplierLiabilityStatus.FSL_NOT_GENERATED);
		psl.setServiceOrder(pso);
		getModelService().save(psl);

		return psl;
	}

	/**
	 * This method updates the status of PSL to PSL_CANCELLED in case of any amendments or cancellation of PSO.
	 */
	private void cancelProvisionalSupplierLiability(final ServiceOrderModel pso)
	{
		SupplierLiabilityModel psl = new SupplierLiabilityModel();
		psl.setServiceOrder(pso);
		psl = getFlexibleSearchService().getModelByExample(psl);
		psl.setSupplierLiabilityStatus(SupplierLiabilityStatus.PSL_CANCELLED);
		getModelService().save(psl);
	}

	/**
	 * This method creates FSL. This method is not exposed via interface as the FSL is only created after successful
	 * creation of FSO. Stand alone creation of FSL is not possible.
	 *
	 */
	private SupplierLiabilityModel createFinalSupplierLiability(final ServiceOrderModel fso)
	{
		//TODO - To be implemented
		return null;
	}

	private ServiceOrderModel createNewSOVersion(final AbstractOrderEntryModel entry)
	{
		final ServiceOrderModel oldPso = entry.getLatestServiceOrder();
		ServiceOrderModel newPso = null;
		newPso = (ServiceOrderModel) getCloneCreator().copy(oldPso);

		final double version = oldPso.getVersionNumber().doubleValue() + 0.1d;
		newPso.setVersionNumber(Double.valueOf(version));

		oldPso.setActive(Boolean.FALSE);
		newPso.setActive(Boolean.TRUE);

		getModelService().saveAll(oldPso, newPso);
		return newPso;
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

	/**
	 * @return the cloneCreator
	 */
	public ItemModelCloneCreator getCloneCreator()
	{
		return cloneCreator;
	}

	/**
	 * @param cloneCreator
	 *           the cloneCreator to set
	 */
	public void setCloneCreator(final ItemModelCloneCreator cloneCreator)
	{
		this.cloneCreator = cloneCreator;
	}

	/**
	 * @return the flexibleSearchService
	 */
	public FlexibleSearchService getFlexibleSearchService()
	{
		return flexibleSearchService;
	}

	/**
	 * @param flexibleSearchService
	 *           the flexibleSearchService to set
	 */
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}

	/**
	 * @return the serviceOrderDao
	 */
	public ServiceOrderDao getServiceOrderDao()
	{
		return serviceOrderDao;
	}

	/**
	 * @param serviceOrderDao
	 *           the serviceOrderDao to set
	 */
	public void setServiceOrderDao(final ServiceOrderDao serviceOrderDao)
	{
		this.serviceOrderDao = serviceOrderDao;
	}

}
