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
package com.cnk.travelogix.client.config.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;

import com.cnk.travelogix.client.config.core.document.model.DocumentManagementModel;
import com.cnk.travelogix.client.config.services.DocumentManagementService;


/**
 *DocumentManagementPrepareInterceptor to generated documentId.
 */
public class DocumentManagementPrepareInterceptor implements PrepareInterceptor<DocumentManagementModel>
{
	private DocumentManagementService documentIdService;

	@Resource
	private ModelService modelService;

	@Override
	public void onPrepare(final DocumentManagementModel documentManagementModel, final InterceptorContext ctx)
			throws InterceptorException
	{
		if (ctx.isNew(documentManagementModel))
		{
			documentIdService.generateDocumentId(documentManagementModel);
		}
	}

	/**
	 * @return the documentIdService
	 */
	public DocumentManagementService getDocumentIdService()
	{
		return documentIdService;
	}

	/**
	 * @param documentIdService
	 *           the documentIdService to set
	 */
	public void setDocumentIdService(final DocumentManagementService documentIdService)
	{
		this.documentIdService = documentIdService;
	}

	/**
	 * @return the modelService
	 */
	public ModelService getModelService()
	{
		return modelService;
	}

	/**
	 * @param modelService
	 *           the modelService to set
	 */
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}
}
