package com.cnk.travelogix.exception.commonlogging.level;

import de.hybris.bootstrap.annotations.UnitTest;

import org.junit.Test;

import com.cnk.travelogix.exception.commonlogging.aop.Auditable;
import com.cnk.travelogix.exception.commonlogging.aop.Auditable.AuditingActionType;
import com.cnk.travelogix.exception.commonlogging.customexception.UnknownException;


@UnitTest
public class TravelogixLogLevelService
{

	@Test
	@Auditable(actionType = AuditingActionType.USER_LOGGED_IN)
	public void testServiceMethod()
	{
		System.out.println("#TestService.testServiceMethod");
	}

	@Test
	@Auditable(actionType = AuditingActionType.USER_LOGGED_IN)
	public void testExcpServiceMethod()
	{
		System.out.println("#TestService.testExcpServiceMethod");
	}

	/**
	 * Throw an exception
	 */
	public void sneeze(final String arg0, final String arg1, final int i) throws Exception
	{
		throw new UnknownException("TESTERROR", "Simulate an Travelogix Custom Exception");
	}

}
