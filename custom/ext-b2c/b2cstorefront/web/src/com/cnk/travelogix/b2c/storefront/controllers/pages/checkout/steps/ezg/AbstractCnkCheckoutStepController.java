/**
 *
 */
package com.cnk.travelogix.b2c.storefront.controllers.pages.checkout.steps.ezg;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.checkout.steps.AbstractCheckoutStepController;
import de.hybris.platform.commercefacades.order.data.OrderEntryData;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.ui.Model;

import com.cnk.travelogix.b2c.facades.order.B2cCartFacade;
import com.cnk.travelogix.common.core.cart.data.OrderHotelDetailInfoData;


/**
 * @author i323801
 *
 */
public abstract class AbstractCnkCheckoutStepController extends AbstractCheckoutStepController
{
	@Resource(name = "b2cCartFacade")
	private B2cCartFacade b2cCartFacade;


	public void setUpOrderHotelInfo(final Model model)
	{
//		final List<OrderEntryData> hotelRoomInfo = b2cCartFacade.getHotelInfoByGroup();
//
//		model.addAttribute("hotelData", hotelRoomInfo);
	}

}
