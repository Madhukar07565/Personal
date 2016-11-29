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
package com.cnk.travelogix.b2b.facades.dropdownlist.impl;

import java.util.ArrayList;
import java.util.List;

import com.cnk.travelogix.b2b.facades.dropdownlist.DropDownListFacade;


/**
 *
 */
public class CityDropDownListFacade implements DropDownListFacade
{

	@Override
	public List<String> getDropDownListContents()
	{
		final List<String> cities = new ArrayList<String>();
		cities.add("New Delhi");
		cities.add("Mumbai");
		cities.add("Kolkata");
		cities.add("Chennai");
		cities.add("Bangalore");
		return cities;
	}

}
