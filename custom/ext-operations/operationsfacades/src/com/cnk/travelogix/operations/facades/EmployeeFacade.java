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
package com.cnk.travelogix.operations.facades;

import java.util.List;

import com.cnk.travelogix.operations.employee.data.EmployeeData;


/**
 * @author C5244544
 */
public interface EmployeeFacade
{

	/**
	 * To get the Current Employee
	 *
	 * @return EmployeeData
	 */
	EmployeeData getCurrentEmployee();

	/**
	 * to ensure the loginSuccess of the Employee
	 */
	void loginSuccess();


	/**
	 * to get the current Employee UID.
	 *
	 * @return String
	 */
	String getCurrentEmployeeUid();

	public EmployeeData viewEmployeedata(String uid);

	/**
	 *
	 */
	List<EmployeeData> getGroupMembers(String group);
}
