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
package com.cnk.travelogix.common.data;

import java.util.ArrayList;
import java.util.List;


/**
 *
 */
public class Errors
{
	private List<com.cnk.travelogix.commons.error.Error> errors;

	/**
	 * @return the errors
	 */
	public List<com.cnk.travelogix.commons.error.Error> getErrors()
	{
		if (this.errors == null)
		{
			errors = new ArrayList();
		}
		return errors;
	}

	/**
	 * @param errors
	 *           the errors to set
	 */
	public void setErrors(final List<com.cnk.travelogix.commons.error.Error> errors)
	{
		this.errors = errors;
	}
}
