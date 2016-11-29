
package com.cnk.travelogix.datamodel.operation.mastercore.action;

import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.processengine.action.AbstractProceduralAction;
import de.hybris.platform.processengine.model.BusinessProcessModel;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.task.RetryLaterException;

import java.util.Date;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Required;

import com.cnk.travelogix.common.core.enums.PaymentMethodType;
import com.cnk.travelogix.common.core.enums.ReceiptType;
import com.cnk.travelogix.common.core.model.receipts.TravelogixPaymentReceiptModel;


/**
 * Class to auto create receipt after booking has been done.
 */
public class CreatePaymentReceiptAction extends AbstractProceduralAction<BusinessProcessModel>
{
	/**
	 * constant to get order from businessprocess model
	 */
	private static final String ORDER = "order";
	private ModelService modelService;

	/**
	 * @return the modelService
	 */
	@Override
	public ModelService getModelService()
	{
		return modelService;
	}

	/**
	 * @param modelService
	 *           the modelService to set
	 */
	@Override
	@Required
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	/**
	 * Action method to perform auto creation of receipt after booking.
	 */
	@Override
	public void executeAction(final BusinessProcessModel businessProcessModel) throws RetryLaterException, Exception
	{
		businessProcessModel.getProperty(ORDER);

		if (businessProcessModel.getProperty(ORDER) instanceof OrderModel)
		{
			final OrderModel orderModel = (OrderModel) businessProcessModel.getProperty(ORDER);
			final TravelogixPaymentReceiptModel receiptModel = getModelService().create(TravelogixPaymentReceiptModel.class);
			receiptModel.setCode(Integer.valueOf(123456));
			//receiptModel.setClient(orderModel.getUser());
			receiptModel.setAmount(orderModel.getTotalPrice());
			receiptModel.setReceiptType(ReceiptType.BOOKING_RECEIPT);
			receiptModel.setCreationtime(new Date());
			//TODO Modified  orderModel by someone in develop branch need to discuss with lead.
			//receiptModel.setCreatedBy(orderModel.getCurrentUser());
			receiptModel.setSupplier(null);
			receiptModel.setCurrency(orderModel.getCurrency());
			receiptModel.setPaymentMethod(PaymentMethodType.PAYMENT_IN_LOCAL_CURRENCY);
			receiptModel.setOrder(orderModel);
			if (CollectionUtils.isNotEmpty(orderModel.getPaymentTransactions()))
			{
				receiptModel.setPaymentTransaction(orderModel.getPaymentTransactions().stream().findFirst().get());
			}
			receiptModel.setUnappliedAmount(orderModel.getTotalPrice());

		}
	}

}
