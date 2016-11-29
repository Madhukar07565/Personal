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
package com.cnk.travelogix.commons.exception;

/**
 *
 */
public class BackendServicesException extends RuntimeException {
    /**
    * 
    */
    private static final long serialVersionUID = 1L;

    public BackendServicesException(final Exception e) {
	super(e);
    }

    public BackendServicesException(final String code) {
	super(code);
    }
}
