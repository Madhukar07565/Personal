/*
 *
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 *
 */
package com.cnk.travelogix.common.core.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Optional;


/**
 * @author i323727
 *
 */
public class MathUtil
{
	public static double nullToZero(final Double d1)
	{
		return Optional.ofNullable(d1).orElse(Double.valueOf(0)).doubleValue();
	}

	/**
	 *
	 * @param d1
	 * @param d2
	 * @return d1-d2
	 */
	public static double substract(final Double d1, final Double d2)
	{
		return new BigDecimal(nullToZero(d1)).subtract(new BigDecimal(nullToZero(d2))).doubleValue();
	}

	public static double sum(final Double d1, final Double d2)
	{
		return new BigDecimal(nullToZero(d1)).add(new BigDecimal(nullToZero(d2))).doubleValue();
	}

	public static double multiply(final Double d1, final Double d2)
	{
		return BigDecimal.valueOf(d1.doubleValue()).multiply(BigDecimal.valueOf(d2.doubleValue())).doubleValue();
	}

	public static double scale(final double d, final int scale)
	{
		return BigDecimal.valueOf(d).setScale(scale, RoundingMode.HALF_UP).doubleValue();
	}

}
