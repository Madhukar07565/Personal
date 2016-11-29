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
package com.cnk.travelogix.product.accommodation.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.product.accommodation.masters.core.model.RoomInfoModel;


/**
 *
 */
public class RoomInfoPrepareInterceptor implements PrepareInterceptor<RoomInfoModel>
{

	@Resource
	private ModelService modelService;

	private KeyGenerator keyGenerator;

	String key = "";

	private static final Logger LOG = Logger.getLogger(RoomInfoPrepareInterceptor.class);


	/**
	 * @return the keyGenerator
	 */
	public KeyGenerator getKeyGenerator()
	{
		return keyGenerator;
	}

	/**
	 * @param keyGenerator
	 *           the keyGenerator to set
	 */
	public void setKeyGenerator(final KeyGenerator keyGenerator)
	{
		this.keyGenerator = keyGenerator;
	}

	@Override
	public void onPrepare(final RoomInfoModel roomInfoModel, final InterceptorContext arg1) throws InterceptorException
	{
		if (StringUtils.isNotEmpty(roomInfoModel.getCategory().toString()) && StringUtils.isNotEmpty(roomInfoModel.getRoomView()))
		{
			final String category = roomInfoModel.getCategory().toString();
			final String roomView = roomInfoModel.getRoomView();

			key = category.concat(roomView).concat(keyGenerator.generate().toString());
			roomInfoModel.setRoomId(key);
			LOG.debug("Generated code for Room ID is  " + roomInfoModel.getRoomId());
		}

	}
}
