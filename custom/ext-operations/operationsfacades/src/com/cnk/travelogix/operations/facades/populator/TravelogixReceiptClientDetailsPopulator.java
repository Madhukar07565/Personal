package com.cnk.travelogix.operations.facades.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.springframework.util.Assert;

import com.cnk.travelogix.client.core.companyoffer.model.ClientDetailsModel;
import com.cnk.travelogix.operations.data.TravelogixClientDetailsData;


/**
 * The populator for ClientDetailsModel
 */
public class TravelogixReceiptClientDetailsPopulator implements Populator<ClientDetailsModel, TravelogixClientDetailsData>
{

	@Override
	public void populate(final ClientDetailsModel source, final TravelogixClientDetailsData target) throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");
		target.setClientName(source.getClientName().getCode());
		// TODO The below value has been modified by someone.Need to check.
		//target.setClientId(source.getCode());
		//target.setClientCategory(source.getClientCategory().getCode());
		//target.setClientSubCategory(source.getClientSubCategory().getCode());
		//target.setClientType(source.getClientType().getCode());
	}
}
