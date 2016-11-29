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
package com.cnk.travelogix.exception.commonlogging.service.impl;

import static org.junit.Assert.assertEquals;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.ProductService;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;


public class AspecttrainingTest extends ServicelayerTransactionalTest
{

	@Resource
	private ModelService modelService;

	@Resource
	private ProductService productService;
	/** Edit the local|project.properties to change logging behaviour (properties log4j.*). */
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(AspecttrainingTest.class.getName());

	@Before
	public void setUp() throws Exception
	{
		createCoreData();
		createDefaultCatalog();
	}

	/**
	 * This case presents core aspectJ injection placed in CoreAspect which adds some '_aspected_description' to
	 * description getter regardless its real value
	 *
	 */
	@Test
	public void testAspecttraining()
	{

		final ProductModel product = productService.getProductForCode("testProduct0");

		assertEquals("null" + "_aspected_description", product.getDescription());

		product.setDescription("some_desc");

		modelService.save(product);

		assertEquals("some_desc" + "_aspected_description", product.getDescription());
	}
}