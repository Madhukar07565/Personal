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
package com.cnk.travelogix.exception.commonlogging.master;

public class TravelogixErrorExceptionMaster
{

	private TravelogixError sneeze;

	/**
	 * @return
	 */
	public TravelogixError getSneeze()
	{
		return sneeze;
	}

	/**
	 * @param sneeze
	 */
	public void setSneeze(final TravelogixError sneeze)
	{
		this.sneeze = sneeze;
	}

	/**
	 * Do something
	 *
	 * @return
	 */
	public void run()
	{
		try
		{
			sneeze.sneeze("arg0", "arg1", 42);

		}
		catch (final Exception e)
		{
			System.out.println("Caught e");
		}
		finally
		{
			System.out.println("the end...");
		}
	}

}
