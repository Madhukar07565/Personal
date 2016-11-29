/**
 *
 */
package com.cnk.travelogix.common.facades.order.populators;

import de.hybris.platform.commercefacades.order.converters.populator.MiniCartPopulator;
import de.hybris.platform.commercefacades.order.data.AbstractOrderData;
import de.hybris.platform.commercefacades.order.data.CartData;
import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.Assert;

import com.cnk.travelogix.common.core.cart.data.OrderRoomDetailInfoData;
import com.cnk.travelogix.common.core.model.OrderProductInfoModel;
import com.cnk.travelogix.common.core.model.OrderRoomDetailInfoModel;


/**
 * @author i323801
 *
 */
public class CNKMiniCartPopulator extends MiniCartPopulator
{
	private Converter<AbstractOrderEntryModel, OrderEntryData> minicartOrderEntryConverter;
	private Converter<OrderRoomDetailInfoModel, OrderRoomDetailInfoData> roomConverter;

	@Override
	public void populate(final CartModel source, final CartData target)
	{
		Assert.notNull(target, "Parameter target cannot be null.");

		if (source == null)
		{
			target.setTotalPrice(createZeroPrice());
			target.setDeliveryCost(null);
			target.setSubTotal(createZeroPrice());
			target.setTotalItems(Integer.valueOf(0));
			target.setTotalUnitCount(Integer.valueOf(0));
		}
		else
		{
			addCommon(source, target);
			addTotals(source, target);
			addEntries(source, target);
			addPromotions(source, target);
			target.setGuid(source.getGuid());
			target.setTotalUnitCount(calcTotalUnitCount(source));
		}
	}

	@Override
	protected void addEntries(final AbstractOrderModel source, final AbstractOrderData prototype)
	{
		final List<AbstractOrderEntryModel> models = source.getEntries();
		final List<OrderEntryData> datalist = new ArrayList<OrderEntryData>();
		for (final AbstractOrderEntryModel model : models)
		{
			final OrderEntryData entryData = getMinicartOrderEntryConverter().convert(model);
			final OrderProductInfoModel prod = model.getOrderProductInfo();
			if (prod instanceof OrderRoomDetailInfoModel)
			{
				final OrderRoomDetailInfoModel room = (OrderRoomDetailInfoModel) prod;
				final OrderRoomDetailInfoData roomData = roomConverter.convert(room);
				entryData.setOrderProductInfo(roomData);
				entryData.setProductTypeEnum(model.getProductTypeEnum());
			}

			datalist.add(entryData);
		}
		prototype.setEntries(datalist);
	}


	/**
	 * @return the minicartOrderEntryConverter
	 */
	public Converter<AbstractOrderEntryModel, OrderEntryData> getMinicartOrderEntryConverter()
	{
		return minicartOrderEntryConverter;
	}

	/**
	 * @param minicartOrderEntryConverter
	 *           the minicartOrderEntryConverter to set
	 */
	public void setMinicartOrderEntryConverter(
			final Converter<AbstractOrderEntryModel, OrderEntryData> minicartOrderEntryConverter)
	{
		this.minicartOrderEntryConverter = minicartOrderEntryConverter;
	}

	/**
	 * @return the roomConverter
	 */
	public Converter<OrderRoomDetailInfoModel, OrderRoomDetailInfoData> getRoomConverter()
	{
		return roomConverter;
	}

	/**
	 * @param roomConverter
	 *           the roomConverter to set
	 */
	public void setRoomConverter(final Converter<OrderRoomDetailInfoModel, OrderRoomDetailInfoData> roomConverter)
	{
		this.roomConverter = roomConverter;
	}




}
