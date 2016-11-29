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
import de.hybris.platform.payment.model.PaymentTransactionModel;
import de.hybris.platform.servicelayer.model.ModelService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;

import com.cnk.travelogix.common.core.enums.PaymentModes;
import com.cnk.travelogix.common.core.model.AmountAllocationModel;
import com.cnk.travelogix.common.core.model.PaymentPlanEntryModel;
import com.cnk.travelogix.common.core.model.PaymentPlanModel;
import com.cnk.travelogix.common.core.payment.comparator.PaymentPlanDueDateComparator;
import com.cnk.travelogix.common.core.payment.criterias.PaymentPlanEntryNotFullyPaid;
import com.cnk.travelogix.common.core.payment.services.CnkPaymentPlanService;
import com.cnk.travelogix.common.core.payment.strategies.CnkPaymentPlanUpdateStrategy;
import com.cnk.travelogix.common.core.util.MathUtil;


public class CustomCnkPaymentPlanUpdateStrategy implements CnkPaymentPlanUpdateStrategy
{

	private static final Logger LOGGER = Logger.getLogger(CustomCnkPaymentPlanUpdateStrategy.class);
	private ModelService modelService;
	private CnkPaymentPlanService paymentPlanService;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.common.core.payment.strategies.CnkPaymentPlanCreateStrategy#createPaymentPlan(de.hybris.
	 * platform.core.model.order.AbstractOrderModel)
	 */
	@Override
	public void updatePaymentPlan(final AbstractOrderModel order, final PaymentTransactionModel transaction)
	{
		final BigDecimal transactionAmount = transaction.getPlannedAmount();
		final List<PaymentPlanEntryModel> list = new PaymentPlanEntryNotFullyPaid()
				.meetCriteria(paymentPlanService.getPaymentPlanEntryFromOrder(order));
		// ascending order, early due date with small index
		list.sort(new PaymentPlanDueDateComparator());
		// 1 retrieve paid amount
		//		final double amount = transaction.getPlannedAmount().doubleValue();
		if (PaymentModes.COD.getCode().equals(transaction.getPaymentMode()))
		{
			for (final PaymentPlanEntryModel entryModel : list)
			{
				if (entryModel.getPaymentPlan().getPaymentStatus() == PaymentStatus.NOTPAID)
				{
					updatePaymentPlanStatus(entryModel);
					final AmountAllocationModel allocationModel = modelService.create(AmountAllocationModel.class);
					allocationModel.setPaymentTransaction(transaction);
					allocationModel.setPaymentPlanEntry(entryModel);
					//					final List<PaymentTransactionModel> transList = new ArrayList<>(
					//							Optional.ofNullable(model.getPaymentTransactionList()).orElse(Collections.EMPTY_LIST));
					//					transList.add(transaction);
					//					model.setPaymentTransactionList(transList);
					final List<AmountAllocationModel> aaList = new ArrayList<>(
							Optional.ofNullable(entryModel.getAmountAllocationList()).orElse(new ArrayList<AmountAllocationModel>()));
					if (!aaList.contains(allocationModel))
					{
						aaList.add(allocationModel);
					}
					entryModel.setAmountAllocationList(aaList);

					final List<AmountAllocationModel> atList = new ArrayList<>(
							Optional.ofNullable(transaction.getAmountAllocationList()).orElse(new ArrayList<AmountAllocationModel>()));
					if (!atList.contains(allocationModel))
					{
						atList.add(allocationModel);
					}
					transaction.setAmountAllocationList(atList);
					modelService.saveAll(allocationModel, transaction, entryModel);

					modelService.save(allocationModel);
					modelService.save(entryModel.getPaymentPlan());

				}
			}
		}
		else
		{
			BigDecimal balanceTransactionAmount = transactionAmount;
			for (final PaymentPlanEntryModel entryModel : list)
			{
				if (balanceTransactionAmount.compareTo(BigDecimal.ZERO) <= 0)
				{
					// transaction amount is fully distributed, break
					break;
				}
				final AmountAllocationModel allocationModel = modelService.create(AmountAllocationModel.class);
				allocationModel.setPaymentTransaction(transaction);
				allocationModel.setPaymentPlanEntry(entryModel);
				//				final List<PaymentTransactionModel> transList = new ArrayList<>(
				//						Optional.ofNullable(model.getPaymentTransactionList()).orElse(Collections.EMPTY_LIST));
				//				transList.add(transaction);
				//				model.setPaymentTransactionList(transList);
				final double balancePlanEntryAmount = MathUtil.substract(entryModel.getAmount(), entryModel.getPayAmount());
				final int compareResult = balanceTransactionAmount.compareTo(BigDecimal.valueOf(balancePlanEntryAmount));
				if (compareResult < 0)
				{
					// txn amount < balance amount, entry is not fulfilled
					entryModel.setPayAmount(Double
							.valueOf(MathUtil.sum(entryModel.getPayAmount(), Double.valueOf(balanceTransactionAmount.doubleValue()))));
					allocationModel.setAmount(Double.valueOf((balanceTransactionAmount.doubleValue())));
					entryModel.setPayDate(new Date());
				}
				else
				{
					// txn amount >= balance amount, entry is fulfilled
					entryModel.setPayAmount(entryModel.getAmount());
					entryModel.setPayDate(new Date());
					allocationModel.setAmount(Double.valueOf(balancePlanEntryAmount));
				}

				//				modelService.save(allocationModel);

				// save amount allocation to payment plan entry
				final List<AmountAllocationModel> aaList = new ArrayList<>(
						Optional.ofNullable(entryModel.getAmountAllocationList()).orElse(new ArrayList<AmountAllocationModel>()));
				if (!aaList.contains(allocationModel))
				{
					aaList.add(allocationModel);
				}
				entryModel.setAmountAllocationList(aaList);
				//				modelService.save(entryModel);

				// save amount allocation to transaction
				final List<AmountAllocationModel> atList = new ArrayList<>(
						Optional.ofNullable(transaction.getAmountAllocationList()).orElse(new ArrayList<AmountAllocationModel>()));
				if (!atList.contains(allocationModel))
				{
					atList.add(allocationModel);
				}
				transaction.setAmountAllocationList(atList);
				modelService.saveAll(allocationModel, transaction, entryModel);

				updatePaymentPlanStatus(entryModel);
				balanceTransactionAmount = balanceTransactionAmount.subtract(BigDecimal.valueOf(balancePlanEntryAmount));
			}
		}

		updateOrderPaymentStatus(order);

	}


	/**
	 * @param order
	 */
	private void updateOrderPaymentStatus(final AbstractOrderModel order)
	{
		final List<PaymentPlanEntryModel> resultList = paymentPlanService.getPaymentPlanEntryFromOrder(order);
		final double totalPaidAmount = resultList.stream().mapToDouble(entryi -> MathUtil.nullToZero(entryi.getPayAmount())).sum();
		final double totalAmount = resultList.stream().mapToDouble(entryi -> MathUtil.nullToZero(entryi.getAmount())).sum();

		final List<PaymentPlanModel> planList = paymentPlanService.getPaymentPlanFromOrder(order);
		final int totalCount = planList.size();
		final Map<PaymentStatus, Long> paymentStatusMap = planList.stream()
				.collect(Collectors.groupingBy(PaymentPlanModel::getPaymentStatus, Collectors.counting()));
		final int paidCount = Optional.ofNullable(paymentStatusMap.get(PaymentStatus.PAID)).orElse(Long.valueOf(0)).intValue();
		final int partPaidCount = Optional.ofNullable(paymentStatusMap.get(PaymentStatus.PARTPAID)).orElse(Long.valueOf(0))
				.intValue();
		final int notPaidCount = Optional.ofNullable(paymentStatusMap.get(PaymentStatus.NOTPAID)).orElse(Long.valueOf(0))
				.intValue();
		final int naPaidCount = Optional.ofNullable(paymentStatusMap.get(PaymentStatus.NA)).orElse(Long.valueOf(0)).intValue();

		PaymentStatus orderPaymentStatus = null;
		if (naPaidCount == totalCount)
		{
			// all status are N/A
			orderPaymentStatus = PaymentStatus.NA;
		}
		else if (paidCount == totalCount)
		{
			// all status are PAID
			orderPaymentStatus = PaymentStatus.PAID;
		}
		else if (notPaidCount == totalCount)
		{
			// all status are NOT PAID
			orderPaymentStatus = PaymentStatus.NOTPAID;
		}
		else if (naPaidCount + paidCount == totalCount)
		{
			// all status are N/A or PAID
			orderPaymentStatus = PaymentStatus.NA;
		}
		else
		{
			// not all paid, not all N/A, not all not paid, then status is pard paid
			orderPaymentStatus = PaymentStatus.PARTPAID;
		}
		LOGGER.info("updateOrderPaymentStatus to [" + orderPaymentStatus + "],  paidCount=" + paidCount + ", partPaidCount="
				+ partPaidCount + ", notPaidCount=" + notPaidCount + ", naCount=" + naPaidCount + "}");
		modelService.refresh(order);
		order.setTotalPaidAmount(Double.valueOf(totalPaidAmount));
		order.setTotalNotPaidAmount(
				Double.valueOf(MathUtil.substract(Double.valueOf(totalAmount), Double.valueOf(totalPaidAmount))));
		order.setPaymentStatus(orderPaymentStatus);
		modelService.save(order);
	}

	/**
	 * @param model
	 */
	private void updatePaymentPlanStatus(final PaymentPlanEntryModel model)
	{
		modelService.refresh(model.getPaymentPlan());
		final double balance = model.getPaymentPlan().getPaymentPlanEntryList().stream()
				.mapToDouble(entry -> MathUtil.substract(entry.getAmount(), entry.getPayAmount())).sum();
		if (Double.compare(balance, Double.valueOf(0).doubleValue()) == 0)
		{
			model.getPaymentPlan().setPaymentStatus(PaymentStatus.PAID);
		}
		else if (Double.compare(balance, Double.valueOf(0).doubleValue()) > 0)
		{
			model.getPaymentPlan().setPaymentStatus(PaymentStatus.PARTPAID);
		}
		modelService.save(model.getPaymentPlan());
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
