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
package com.cnk.travelogix.operations.order.converters.populator;

import de.hybris.platform.commercefacades.user.data.AddressData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import com.cnk.travelogix.common.core.cart.data.SupplierData;
import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;


/**
 * @author C5244544
 */
public class SupplierPopulator implements Populator<SupplierModel, SupplierData>
{
	Converter<AddressModel, AddressData> addressConverter;

	@Override
	public void populate(final SupplierModel source, final SupplierData target) throws ConversionException
	{
		if (source.getAddress() != null)
		{
			target.setAddress(addressConverter.convert(source.getAddress()));
		}
		if (null != source.getName())
		{
			target.setName(source.getName());
		}
		
		target.setCode(source.getCode());
		
		//		if (source.getBrands() != null)
		//		{
		//			final List<String> brandList = new ArrayList<>();
		//			final List<Map<LanguageModel, String>> brands = (List<Map<LanguageModel, String>>) source.getBrands();
		//			final Iterator<Map<LanguageModel, String>> it = brands.iterator();
		//			while (it.hasNext())
		//			{
		//				brandList.addAll(it.next().values());
		//
		//			}
		//			target.setBrands(brandList);
		//		}
		//		target.setApiSupplier(source.getApiSupplier());
		//		target.setCommonUid(source.getCommonUid());
		//		target.setCstNo(source.getCstNo());
		//		target.setDeclarationReceived(source.getDeclarationReceived());
		//		target.setExciseRegNo(source.getExciseRegNo());
		//		target.setExtranetAccess(source.getExtranetAccess());
		//		target.setFinanceControlId(source.getFinanceControlId());
		//		target.setIsNew(source.getIsNew());
		//		target.setLstNo(source.getLstNo());
		//		target.setName(source.getName());
		//		target.setOnlineFrom(source.getOnlineFrom());
		//		target.setOnlineTo(source.getOnlineTo());
		//		target.setPanNo(source.getPanNo());
		//		target.setParentCompany(source.getParentCompany());
		//		target.setShortName(source.getShortName());
		//		target.setStRegNo(source.getStRegNo());
		//
		//		final SupplierType supplierType = source.getSupplierType();
		//		if (supplierType != null)
		//		{
		//			target.setSupplierType(supplierType.getCode());
		//		}
		//
		//
		//		target.setTanNo(source.getTanNo());
		//		final ClientCompanyType cctype = source.getTypeOfOrganization();
		//		if (cctype != null)
		//		{
		//			target.setTypeOfOrganization(cctype.getCode());
		//		}
		//		target.setVatOrTinNo(source.getVatOrTinNo());

	}

	/**
	 * @return the addressConverter
	 */
	public Converter<AddressModel, AddressData> getAddressConverter()
	{
		return addressConverter;
	}

	/**
	 * @param addressConverter
	 *           the addressConverter to set
	 */
	public void setAddressConverter(final Converter<AddressModel, AddressData> addressConverter)
	{
		this.addressConverter = addressConverter;
	}

}
