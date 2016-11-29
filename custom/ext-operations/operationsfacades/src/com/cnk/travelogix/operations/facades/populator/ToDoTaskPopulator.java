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
package com.cnk.travelogix.operations.facades.populator;

import de.hybris.platform.commercefacades.order.data.OrderData;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.enumeration.EnumerationService;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.workflow.model.WorkflowActionModel;

import java.util.Date;

import com.cnk.travelogix.common.core.enums.ToDoTaskStatus;
import com.cnk.travelogix.operations.data.WorkflowActionData;


/**
 *
 */
public class ToDoTaskPopulator implements Populator<WorkflowActionModel, WorkflowActionData>
{

	private Converter<OrderModel, OrderData> orderConverter;
	private EnumerationService enumerationService;

	@Override
	public void populate(final WorkflowActionModel source, final WorkflowActionData target) throws ConversionException
	{
		if (source != null)
		{
			target.setCode(source.getCode());
			target.setName(source.getName());
			target.setAssignedUser(source.getPrincipalAssigned().getUid());
			target.setSecondaryAssignedUser(
					source.getSecondaryAssignedUser() != null ? source.getSecondaryAssignedUser().getUid() : "");
			if (source.getDueDate() != null)
			{
				target.setDueDate(source.getDueDate() != null ? source.getDueDate() : null);
				if (source.getDueDate().before(new Date()))
				{
					target.setTaskStatus(enumerationService.getEnumerationName(ToDoTaskStatus.OVERDUE));
					final long diff = new Date().getTime() - source.getDueDate().getTime();
					final int noofdays = (int) (diff / (1000 * 24 * 60 * 60));
					target.setOverdueDays(new Integer(noofdays));
				}
				else
				{
					target.setTaskStatus(enumerationService.getEnumerationName(source.getTaskStatus()));
					target.setOverdueDays(new Integer(0));
				}
			}
			else
			{
				target.setTaskStatus(enumerationService.getEnumerationName(source.getTaskStatus()));
			}
			target.setStatus(source.getStatus() != null ? source.getStatus().getCode() : "");
			target.setAssignedTo(source.getAssignedTo() != null ? source.getAssignedTo().getUid() : "");
			target.setIsRead(source.getReadbyAssignedUser());
			target.setTaskType(source.getTaskType() != null ? source.getTaskType().getCode() : "");
			target.setTaskCategory(source.getTaskCategory() != null ? source.getTaskCategory().getCode() : "");
			target.setPriority(source.getAlertPriority() != null ? source.getAlertPriority().getCode() : "");
			target.setClientCategory(source.getClientCategory() != null ? source.getClientCategory().getCode() : "");
			target.setClientSubCategory(source.getClientSubCategory() != null ? source.getClientSubCategory().getCode() : "");
			target.setClientType(source.getClientType() != null ? source.getClientType().getCode() : "");
			target.setFunctionalArea(source.getFunctionalArea() != null ? source.getFunctionalArea().getCode() : "");
			target.setSuggestedAction(source.getSuggestedAction());
			target.setParent(source.getParent() != null ? source.getParent().getCode() : "");
			target.setLockedBy(source.getLockedBy() != null ? source.getLockedBy().getName() : "");
			if (source.getDueDate() != null)
			{
				//final Date date = source.getDueDate();
				//target.setDueDate(date.getDate() + "-" + date.getMonth() + "-" + date.getYear());

			}

			target.setParent(source.getParent() != null ? source.getParent().getCode() : "");
			if (source.getOrder() != null)
			{
				target.setOrder(getOrderConverter().convert(source.getOrder()));
			}
			target.setDesc(source.getDescription());
			if (source.getProduct() != null)
			{
				final ProductModel model = source.getProduct();
				final ProductData product = new ProductData();
				product.setCode(model.getCode());
				product.setName(model.getName());
				target.setProduct(product);
			}
			if (source.getCompany() != null)
			{
				target.setCompanyName(source.getCompany().getName());
			}

			if (source.getMarket() != null)
			{
				target.setCompanyMarket(source.getMarket().getName());
			}

		}
	}

	/**
	 * @return the orderConverter
	 */
	public Converter<OrderModel, OrderData> getOrderConverter()
	{
		return orderConverter;
	}

	/**
	 * @param orderConverter
	 *           the orderConverter to set
	 */
	public void setOrderConverter(final Converter<OrderModel, OrderData> orderConverter)
	{
		this.orderConverter = orderConverter;
	}

	/**
	 * @return the enumerationService
	 */
	public EnumerationService getEnumerationService()
	{
		return enumerationService;
	}

	/**
	 * @param enumerationService
	 *           the enumerationService to set
	 */
	public void setEnumerationService(final EnumerationService enumerationService)
	{
		this.enumerationService = enumerationService;
	}

}

