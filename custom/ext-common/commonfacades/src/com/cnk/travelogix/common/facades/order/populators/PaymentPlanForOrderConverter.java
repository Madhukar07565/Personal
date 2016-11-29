/**
 *
 */
package com.cnk.travelogix.common.facades.order.populators;

import de.hybris.platform.commercefacades.order.data.AbstractOrderData;
import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.commercefacades.product.PriceDataFactory;
import de.hybris.platform.commercefacades.product.data.PriceData;
import de.hybris.platform.commercefacades.product.data.PriceDataType;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.core.enums.PaymentStatus;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Consumer;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.common.core.cart.data.FlightGroupOrderEntryInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderEntryInfoData;
import com.cnk.travelogix.common.core.cart.data.PaymentSummaryInfoData;
import com.cnk.travelogix.common.core.cart.data.RoomOrderEntryInfoData;
import com.cnk.travelogix.common.core.enums.OrderEntryTypeEnum;
import com.cnk.travelogix.common.core.enums.PaymentPlanType;
import com.cnk.travelogix.common.core.payment.data.PaymentPlanData;
import com.cnk.travelogix.common.core.payment.data.PaymentPlanEntryData;


/**
 * @author i317604
 *
 */
public class PaymentPlanForOrderConverter<SOURCE extends AbstractOrderData, TARGET extends AbstractOrderData> extends
		AbstractPopulatingConverter<SOURCE, TARGET>
{
	private static final Logger LOG = Logger.getLogger(PaymentPlanForOrderConverter.class);

	@Resource(name = "priceDataFactory")
	private PriceDataFactory priceDataFactory;

	@Resource(name = "commonI18NService")
	private CommonI18NService commonI18NService;

	@Override
	public void populate(final SOURCE source, final TARGET target)
	{
		final List<OrderEntryData> orderEntryDataList = source.getEntries();
		if (CollectionUtils.isNotEmpty(orderEntryDataList))
		{
			orderEntryDataList.forEach(orderEntryData -> {
				switch (orderEntryData.getOrderEntryType())
				{
					case HOTEL:
						populatePaymentPlanForHotel(target, orderEntryData);
						break;
					case FLIGHT_GROUP:
						populatePaymentPlanForFlight(target, orderEntryData);
						break;
					default:
						throw new RuntimeException("Payment plan converter does not support ["
								+ orderEntryData.getOrderEntryType().toString() + "]");
				}
			});

			// Format price data.
			formatPriceData(target.getPaymentSummaryInfoData());
		}
	}

	/**
	 * Populate payment plan for hotel.
	 */
	private void populatePaymentPlanForHotel(final TARGET target, final OrderEntryData hotelOrderEntryData)
	{
		final PaymentSummaryInfoData hotelPaymentSummaryInfoData = getPaymentSummaryInfoData(hotelOrderEntryData);
		final List<OrderEntryData> roomOrderEntryDataList = hotelOrderEntryData.getEntries();
		if (CollectionUtils.isNotEmpty(roomOrderEntryDataList))
		{
			roomOrderEntryDataList.forEach(roomOrderEntryData -> {
				final RoomOrderEntryInfoData roomOrderEntryInfoData = getRoomOrderEntryInfoData(roomOrderEntryData);
				if (roomOrderEntryInfoData != null)
				{
					// Populate payment summary into order data level.
					populatePaymentSummaryInfo(getPaymentSummaryInfoData(target), roomOrderEntryInfoData.getPaymentPlan());
					
					// Populate payment summary into hotel level.
					populatePaymentSummaryInfo(hotelPaymentSummaryInfoData, roomOrderEntryInfoData.getPaymentPlan());
					
					// Populate payment summary into room level.
					final PaymentSummaryInfoData roomPaymentSummaryInfoData = getPaymentSummaryInfoData(roomOrderEntryData);
					populatePaymentSummaryInfo(roomPaymentSummaryInfoData, roomOrderEntryInfoData.getPaymentPlan());
					formatPriceData(roomPaymentSummaryInfoData);
				}
			});
			
			formatPriceData(hotelPaymentSummaryInfoData);
		}
	}

	/**
	 * Get room order entry info data from the given order entry data.
	 */
	private RoomOrderEntryInfoData getRoomOrderEntryInfoData(final OrderEntryData roomOrderEntryData)
	{
		RoomOrderEntryInfoData roomOrderEntryInfoData = null;

		final OrderEntryInfoData orderEntryInfoData = roomOrderEntryData.getOrderEntryInfoData();

		if (OrderEntryTypeEnum.HOTEL_ROOM == roomOrderEntryData.getOrderEntryType()
				&& orderEntryInfoData instanceof RoomOrderEntryInfoData)
		{
			roomOrderEntryInfoData = (RoomOrderEntryInfoData) orderEntryInfoData;
		}
		else
		{
			LOG.error("Please assign a valid room order entry data.");
		}

		return roomOrderEntryInfoData;
	}

	/**
	 * Populate payment plan for flight.
	 */
	private void populatePaymentPlanForFlight(final TARGET target, final OrderEntryData flightGroupOrderEntryData)
	{
		final FlightGroupOrderEntryInfoData flightGroupOrderEntryInfoData = getFlightGroupOrderEntryInfoData(flightGroupOrderEntryData);

		if (flightGroupOrderEntryInfoData != null)
		{
			// Populate payment summary into order data level.
			populatePaymentSummaryInfo(getPaymentSummaryInfoData(target), flightGroupOrderEntryInfoData.getPaymentPlan());
			
			// Populate payment summary into flight group level.
			final PaymentSummaryInfoData flightGroupPaymentSummaryInfoData = getPaymentSummaryInfoData(flightGroupOrderEntryData);
			populatePaymentSummaryInfo(flightGroupPaymentSummaryInfoData, flightGroupOrderEntryInfoData.getPaymentPlan());
			formatPriceData(flightGroupPaymentSummaryInfoData);
		}
	}

	/**
	 * Get flight group order entry info data from the given order entry data.
	 */
	private FlightGroupOrderEntryInfoData getFlightGroupOrderEntryInfoData(final OrderEntryData flightGroupOrderEntryData)
	{
		FlightGroupOrderEntryInfoData flightGroupOrderEntryInfoData = null;

		final OrderEntryInfoData orderEntryInfoData = flightGroupOrderEntryData.getOrderEntryInfoData();

		if (OrderEntryTypeEnum.FLIGHT_GROUP == flightGroupOrderEntryData.getOrderEntryType()
				&& orderEntryInfoData instanceof FlightGroupOrderEntryInfoData)
		{
			flightGroupOrderEntryInfoData = (FlightGroupOrderEntryInfoData) orderEntryInfoData;
		}
		else
		{
			LOG.error("Please assign a valid flight group order entry data.");
		}

		return flightGroupOrderEntryInfoData;
	}
	
	/**
	 * Get payment summary info from order data.
	 * 
	 * @param target
	 * @return payment summary info.
	 */
	private PaymentSummaryInfoData getPaymentSummaryInfoData(final TARGET target)
	{
		if (target.getPaymentSummaryInfoData() == null)
		{
			target.setPaymentSummaryInfoData(new PaymentSummaryInfoData());
		}

		return target.getPaymentSummaryInfoData();
	}

	/**
	 * Get payment summary info from order entry data.
	 * 
	 * @param orderEntryData
	 * @return payment summary info.
	 */
	private PaymentSummaryInfoData getPaymentSummaryInfoData(final OrderEntryData orderEntryData)
	{
		if (orderEntryData.getPaymentSummaryInfoData() == null)
		{
			orderEntryData.setPaymentSummaryInfoData(new PaymentSummaryInfoData());
		}

		return orderEntryData.getPaymentSummaryInfoData();
	}

	/**
	 * Populate payment plan info.
	 */
	private void populatePaymentSummaryInfo(final PaymentSummaryInfoData paymentSummaryInfoData, final PaymentPlanData paymentPlanData)
	{
		if (paymentPlanData != null)
		{
			final PaymentPlanType paymentPlanType = paymentPlanData.getType();
			if (LOG.isDebugEnabled())
			{
				LOG.debug("Current payment plan type is [" + paymentPlanType + "].");
			}

			if (PaymentPlanType.FULL == paymentPlanType)
			{
				populatePaymentSummaryInfo(paymentSummaryInfoData, paymentPlanData, paymentSummaryInfoData.getPendingBalanceForFull(), priceData -> {
					paymentSummaryInfoData.setPendingBalanceForFull(priceData);
				});
			}
			else if (PaymentPlanType.PART == paymentPlanType)
			{
				populatePaymentSummaryInfo(paymentSummaryInfoData, paymentPlanData, paymentSummaryInfoData.getPendingBalanceForPart(), priceData -> {
					paymentSummaryInfoData.setPendingBalanceForPart(priceData);
				});
			}
			else if (PaymentPlanType.TIMELIMIT == paymentPlanType)
			{
				populatePaymentSummaryInfo(paymentSummaryInfoData, paymentPlanData, paymentSummaryInfoData.getPayOnConfirmation(), priceData -> {
					paymentSummaryInfoData.setPayOnConfirmation(priceData);
				});
			}
			else if (PaymentPlanType.OFFLINE == paymentPlanType)
			{
				populatePaymentSummaryInfo(paymentSummaryInfoData, paymentPlanData, paymentSummaryInfoData.getPayAtLocation(), priceData -> {
					paymentSummaryInfoData.setPayAtLocation(priceData);
				});
			}
			else
			{
				LOG.error("Payment plan converter does not support the current type [" + paymentPlanType + "].");
			}
		}
		else
		{
			LOG.error("The given payment plan is NULL.");
		}
	}

	/**
	 * Populate payment info.
	 */
	private void populatePaymentSummaryInfo(final PaymentSummaryInfoData paymentSummaryInfoData, final PaymentPlanData paymentPlanData, final PriceData targetPriceData,
			final Consumer<PriceData> consumer)
	{
		final List<PaymentPlanEntryData> paymentPlanEntryDataList = paymentPlanData.getPaymentPlanEntryDataList();
		if (CollectionUtils.isNotEmpty(paymentPlanEntryDataList))
		{
			final PaymentStatus paymentStatus = paymentPlanData.getPaymentStatus();
			if (PaymentStatus.PAID == paymentStatus)
			{
				calculatePriceData(paymentSummaryInfoData.getAmountPaid(), paymentPlanData.getPrice().getCostPrice(), priceData -> {
					paymentSummaryInfoData.setAmountPaid(priceData);
				});
			}
			else if (PaymentStatus.NOTPAID == paymentStatus)
			{
				calculatePriceData(targetPriceData, paymentPlanData.getPrice().getCostPrice(), consumer);
			}
			else if (PaymentStatus.PARTPAID == paymentStatus)
			{
				paymentPlanEntryDataList.forEach(paymentPlanEntryData -> {
					final Double amount = paymentPlanEntryData.getAmount();
					final Double payAmount = paymentPlanEntryData.getPayAmount();

					calculatePriceData(paymentSummaryInfoData.getAmountPaid(), payAmount == null ? 0 : payAmount.doubleValue(), priceData -> {
						paymentSummaryInfoData.setAmountPaid(priceData);
					});
					calculatePriceData(targetPriceData,
							subtract(amount == null ? 0 : amount.doubleValue(), payAmount == null ? 0 : payAmount.doubleValue())
									.doubleValue(), consumer);
				});
			}
		}
		else
		{
			LOG.error("Full payment plan must contain one item.");
		}
	}

	/**
	 * Calculate price data.
	 */
	private void calculatePriceData(final PriceData priceData, final double amount, final Consumer<PriceData> consumer)
	{
		if (priceData == null)
		{
			PriceData newPriceData = new PriceData();
			newPriceData.setValue(new BigDecimal(amount));
			consumer.accept(newPriceData);
		}
		else
		{
			final BigDecimal value = priceData.getValue();
			priceData.setValue(add(value == null ? 0 : value.doubleValue(), amount));
		}
	}

	/**
	 * Returns baseNumber - subtrahend.
	 * 
	 * @param baseNumber
	 * @param subtrahend
	 * @return baseNumber - subtrahend.
	 */
	private BigDecimal subtract(final double baseNumber, final double subtrahend)
	{
		return new BigDecimal(baseNumber).subtract(new BigDecimal(subtrahend));
	}

	/**
	 * Returns baseNumber + augend.
	 * 
	 * @param baseNumber
	 * @param augend
	 * @return baseNumber + augend.
	 */
	private BigDecimal add(final double baseNumber, final double augend)
	{
		return new BigDecimal(baseNumber).add(new BigDecimal(augend));
	}

	/**
	 * Format price data.
	 * 
	 * @param paymentSummaryInfoData
	 */
	private void formatPriceData(final PaymentSummaryInfoData paymentSummaryInfoData)
	{
		// Amount paid.
		paymentSummaryInfoData.setAmountPaid(getFormattedPriceData(paymentSummaryInfoData.getAmountPaid()));

		// Pending balance for full.
		paymentSummaryInfoData.setPendingBalanceForFull(getFormattedPriceData(paymentSummaryInfoData.getPendingBalanceForFull()));
		
		// Pending balance for part.
		paymentSummaryInfoData.setPendingBalanceForPart(getFormattedPriceData(paymentSummaryInfoData.getPendingBalanceForPart()));

		// Pay on confirmation.
		paymentSummaryInfoData.setPayOnConfirmation(getFormattedPriceData(paymentSummaryInfoData.getPayOnConfirmation()));

		// Pay at location.
		paymentSummaryInfoData.setPayAtLocation(getFormattedPriceData(paymentSummaryInfoData.getPayAtLocation()));
	}

	/**
	 * Format price data.
	 * 
	 * @param priceData
	 * @return Formatted price data.
	 */
	private PriceData getFormattedPriceData(final PriceData priceData)
	{
		return priceData == null ? null : priceDataFactory.create(PriceDataType.BUY, priceData.getValue(),
				commonI18NService.getCurrentCurrency());
	}
}
