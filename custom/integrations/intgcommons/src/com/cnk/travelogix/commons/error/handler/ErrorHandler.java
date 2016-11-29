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
package com.cnk.travelogix.commons.error.handler;

import com.cnk.travelogix.commons.error.Error;

/**
 *
 */
@FunctionalInterface
public interface ErrorHandler {

    /**
     * @param errors
     * @return Error
     */
    public Error handleError(final Error errors);

}
