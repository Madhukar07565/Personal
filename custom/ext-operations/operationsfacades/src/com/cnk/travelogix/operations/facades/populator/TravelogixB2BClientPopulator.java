package com.cnk.travelogix.operations.facades.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.enumeration.EnumerationService;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.cnk.travelogix.client.core.b2bunit.model.TravelogixB2BUnitModel;
import com.cnk.travelogix.operations.data.EnumerationDto;
import com.cnk.travelogix.operations.data.TravelogixClientDetailsData;


/**
 * The travelogix B2B unit client populator
 */
public class TravelogixB2BClientPopulator implements Populator<TravelogixB2BUnitModel, TravelogixClientDetailsData>
{

	@Resource
	private EnumerationService enumerationService;

	@Override
	public void populate(final TravelogixB2BUnitModel source, final TravelogixClientDetailsData target) throws ConversionException
	{
		target.setClientId(source.getUid());
		target.setClientName(source.getLocName());
		target.setClientType(getClientType(source));
		target.setClientCategory(getClientCategory(source));
		target.setClientSubCategory(getClientSubCategory(source));
	}

	public List<EnumerationDto> getClientType(final TravelogixB2BUnitModel source)
	{
		final List<EnumerationDto> dtos = new ArrayList<>();
		final EnumerationDto dto = new EnumerationDto();
		dto.setCode(source.getTrvlClientType().getCode());
		dto.setName(enumerationService.getEnumerationName(source.getTrvlClientType()));
		dtos.add(dto);
		return dtos;
	}

	public List<EnumerationDto> getClientCategory(final TravelogixB2BUnitModel source)
	{
		final List<EnumerationDto> dtos = new ArrayList<>();
		final EnumerationDto dto = new EnumerationDto();
		dto.setCode(source.getClientCategory().getCode());
		dto.setName(enumerationService.getEnumerationName(source.getClientCategory()));
		dtos.add(dto);
		return dtos;
	}

	public List<EnumerationDto> getClientSubCategory(final TravelogixB2BUnitModel source)
	{
		final List<EnumerationDto> dtos = new ArrayList<>();
		final EnumerationDto dto = new EnumerationDto();
		dto.setCode(source.getClientSubCategory().getCode());
		dto.setName(enumerationService.getEnumerationName(source.getClientSubCategory()));
		dtos.add(dto);
		return dtos;
	}
}
