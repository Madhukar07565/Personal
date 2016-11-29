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

import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.category.CategoryService;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.product.ProductService;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import com.cnk.travelogix.datamodel.operation.reconfirmationconfig.model.ReconfirmationConfigModel;
import com.cnk.travelogix.masterdata.core.category.model.ProductCategorySubTypeModel;
import com.cnk.travelogix.operations.data.ReconfirmationConfigData;


/**
 * Reverse Populating ReconfirmationConfig data into Model.
 *
 * @author C5244543
 */
public class ReconfirmationConfigReversePopulator implements Populator<ReconfirmationConfigData, ReconfirmationConfigModel>
{
	@Autowired
	private ProductService productService;
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private CatalogVersionService catalogVersionService;


	@Override
	public void populate(final ReconfirmationConfigData source, final ReconfirmationConfigModel target) throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");
		if (null != source.getProduct())
		{
			target.setProduct(productService.getProductForCode(source.getProduct().getCode()));
		}
		if (null != source.getProductCategory())
		{
			target.setProductCategory(categoryService.getCategoryForCode(source.getProductCategory().getCode()));
		}

		if (null != source.getProductCategorySubType())
		{
			final CategoryModel categoryModel = categoryService.getCategoryForCode(source.getProductCategorySubType().getCode());
			if (categoryModel instanceof ProductCategorySubTypeModel)
			{
				target.setProductCategorySubType((ProductCategorySubTypeModel) categoryModel);
			}
		}
		//	target.setCatalogVersion(catalogVersionService.getCatalogVersion("EZ-IN", "Staged"));
		target.setCatalogVersion(catalogVersionService.getSessionCatalogVersionForCatalog("EZ-IN"));
		target.setEffectiveFrom(new Date());
	}
}
