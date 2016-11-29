/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package com.cnk.travelogix.common.core.payment.strategies.impl;

import de.hybris.platform.core.enums.PaymentStatus;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.apache.commons.collections.CollectionUtils;

import com.cnk.travelogix.common.core.enums.PaymentPlanType;
import com.cnk.travelogix.common.core.model.OrderRoomDetailInfoModel;
import com.cnk.travelogix.common.core.model.OrderTicketInfoModel;
import com.cnk.travelogix.common.core.model.PaymentPlanEntryModel;
import com.cnk.travelogix.common.core.model.PaymentPlanModel;
import com.cnk.travelogix.common.core.model.PriceInfoModel;
import com.cnk.travelogix.common.core.payment.services.CnkPaymentPlanService;
import com.cnk.travelogix.common.core.payment.strategies.CnkPaymentPlanCreateStrategy;
import com.cnk.travelogix.common.core.util.MathUtil;


public class CustomCnkPaymentPlanCreateStrategy implements CnkPaymentPlanCreateStrategy
{

	private ModelService modelService;

	private CnkPaymentPlanService paymentPlanService;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.common.core.payment.strategies.CnkPaymentPlanCreateStrategy#createPaymentPlan(de.hybris.
	 * platform.core.model.order.AbstractOrderModel)
	 */
	@Override
	public void createPaymentPlan(final AbstractOrderModel order)
	{
		paymentPlanService.getTicketByGroupId(order).forEach((key, value) -> {
			final List<OrderTicketInfoModel> ticketList = new ArrayList<>();
			value.stream().forEach(oEntry -> ticketList.add((OrderTicketInfoModel) oEntry.getOrderProductInfo()));
			final double totalPrice = value.stream().mapToDouble(oEntry -> MathUtil.nullToZero(oEntry.getTotalPrice())).sum();
			generatePaymentPlanForFlightGroup(ticketList, totalPrice);
		});

		paymentPlanService.getRoomByGroupId(order).forEach((key, value) -> {
			value.forEach(rEntry -> {
				generatePaymentPlanForRoom((OrderRoomDetailInfoModel) rEntry.getOrderProductInfo(),
						MathUtil.nullToZero(rEntry.getTotalPrice()));
			});
		});
	}

	/**
	 * @param room
	 * @param d
	 */
	private void generatePaymentPlanForRoom(final OrderRoomDetailInfoModel room, final double rPrice)
	{
		PaymentPlanModel plan = room.getPaymentPlan();
		if (!Optional.ofNullable(plan).isPresent())
		{
			plan = modelService.create(PaymentPlanModel.class);
		}
		if (plan.getPaymentStatus() == PaymentStatus.NOTPAID)
		{
			Optional.ofNullable(plan.getPaymentPlanEntryList())
					.ifPresent(entryList -> entryList.forEach(e -> modelService.remove(e)));
		}
		final PriceInfoModel roomPrice = modelService.create(PriceInfoModel.class);
		roomPrice.setCostPrice(Double.valueOf(rPrice));
		roomPrice.setCurrency(room.getPriceInfo().getCurrency());

		plan.setPrice(roomPrice);
		if (Boolean.TRUE == room.getPayAtHotel())
		{
			buildPlanForOfflinePay(plan);
			final PaymentPlanEntryModel entry = modelService.create(PaymentPlanEntryModel.class);
			buildPlanEntry(entry, plan, roomPrice.getCostPrice(), null);
			modelService.save(entry);
		}
		if (Boolean.TRUE == room.getTimeLimit())
		{
			//timelimit config
			buildPlanForTimeLimit(plan);
			final PaymentPlanEntryModel entry = modelService.create(PaymentPlanEntryModel.class);
			buildPlanEntry(entry, plan, roomPrice.getCostPrice(), room.getTimeLimitExpDate());
			modelService.save(entry);
		}

		if (Boolean.TRUE == Boolean.FALSE)
		{
			//YTODO_LGL add logic for partpayment || partpayment & timelimit

		}

		if (Boolean.TRUE != room.getTimeLimit() && Boolean.TRUE != room.getPayAtHotel())
		{
			buildPlanForFullPay(plan);
			// full pay option
			final PaymentPlanEntryModel entry = modelService.create(PaymentPlanEntryModel.class);
			buildPlanEntry(entry, plan, roomPrice.getCostPrice(), null);
			modelService.save(entry);
		}
		modelService.save(plan);
		room.setPaymentPlan(plan);
		modelService.save(room);
	}


	/**
	 * @param totalPrice
	 */
	private void generatePaymentPlanForFlightGroup(final List<OrderTicketInfoModel> ticketList, final double totalPrice)
	{
		if (CollectionUtils.isEmpty(ticketList))
		{
			return;
		}
		final PriceInfoModel tPrice = modelService.create(PriceInfoModel.class);
		// sum all the ticket price as the plan price
		tPrice.setCurrency(ticketList.get(0).getPriceInfo().getCurrency());
		tPrice.setCostPrice(Double.valueOf(totalPrice));

		// get payment Plan or generate new plan
		PaymentPlanModel plan = ticketList.get(0).getOrderFlightDetailInfo().getPaymentPlan();
		if (plan == null)
		{
			plan = modelService.create(PaymentPlanModel.class);
		}
		if (plan.getPaymentStatus() == PaymentStatus.NOTPAID)
		{
			Optional.ofNullable(plan.getPaymentPlanEntryList())
					.ifPresent(entryList -> entryList.forEach(e -> modelService.remove(e)));
		}
		plan.setPrice(tPrice);
		plan.setShared(Boolean.TRUE);


		if (Boolean.TRUE == ticketList.get(0).getOrderFlightDetailInfo().getTimeLimit())
		{
			//timelimit config
			buildPlanForTimeLimit(plan);

		}

		if (Boolean.TRUE == Boolean.FALSE)
		{
			//YTODO_LGL add logic for partpayment || partpayment & timelimit

		}

		if (Boolean.TRUE != ticketList.get(0).getOrderFlightDetailInfo().getTimeLimit())
		{
			buildPlanForFullPay(plan);
			// full pay option
			final PaymentPlanEntryModel entry = modelService.create(PaymentPlanEntryModel.class);
			buildPlanEntry(entry, plan, tPrice.getCostPrice(), null);
			modelService.save(entry);
		}
		modelService.save(plan);
		for (final OrderTicketInfoModel ticket : ticketList)
		{
			if (ticket.getOrderFlightDetailInfo().getPaymentPlan() == plan)
			{
				continue;
			}
			ticket.getOrderFlightDetailInfo().setPaymentPlan(plan);
			modelService.save(ticket.getOrderFlightDetailInfo());
		}
	}

	private void buildPlanEntry(final PaymentPlanEntryModel entry, final PaymentPlanModel plan, final Double price,
			final Date dueDate)
	{
		entry.setPaymentPlan(plan);
		entry.setAmount(price);
		entry.setDueDate(dueDate);
	}

	/**
	 * @param plan
	 */
	private void buildPlanForFullPay(final PaymentPlanModel plan)
	{
		plan.setType(PaymentPlanType.FULL);
		plan.setPaymentStatus(PaymentStatus.NOTPAID);
	}

	/**
	 * @param plan
	 */
	private void buildPlanForTimeLimit(final PaymentPlanModel plan)
	{
		plan.setType(PaymentPlanType.TIMELIMIT);
		plan.setPaymentStatus(PaymentStatus.NOTPAID);
	}

	/**
	 * @param plan
	 */
	private void buildPlanForOfflinePay(final PaymentPlanModel plan)
	{
		plan.setType(PaymentPlanType.OFFLINE);
		plan.setPaymentStatus(PaymentStatus.NA);
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
	 * @return the paymentPlanService
	 */
	public CnkPaymentPlanService getPaymentPlanService()
	{
		return paymentPlanService;
	}

	/**
	 * @param paymentPlanService
	 *           the paymentPlanService to set
	 */
	public void setPaymentPlanService(final CnkPaymentPlanService paymentPlanService)
	{
		this.paymentPlanService = paymentPlanService;
	}
}