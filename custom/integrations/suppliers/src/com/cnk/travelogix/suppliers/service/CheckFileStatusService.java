package com.cnk.travelogix.suppliers.service;

import java.util.Date;

/*
 * 
 * @author I323673
 *
 */
@FunctionalInterface 
public interface CheckFileStatusService {

	/**
	 * 
	 * @param date
	 */
	void getlistofFile(final Date date);

}
