package com.cnk.travelogix.exception.commonlogging.level;

import de.hybris.bootstrap.annotations.UnitTest;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * The Class TravelogixLogLevelTest.
 */
@UnitTest
public class TravelogixLogLevelTest
{

	/** The Constant logger. */
	private static final Logger logger = Logger.getLogger(TravelogixLogLevelTest.class);

	/**
	 * Audit log level test.
	 */
	@Test
	public void testAuditLogLevel()
	{
		logger.debug("This is a debug message");
		logger.info("This is a information message");
		logger.warn("This is a warning message");
		logger.log(TravelogixAuditLogLevel.AUDIT, "this is audit message");
		Assert.assertEquals("AUDIT", TravelogixAuditLogLevel.AUDIT.toString());
	}

	@Test
	public void testAuditLogLevelService()
	{
		final ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]
		{ "commonlogging-spring-test.xml" });

		final TravelogixLogLevelService one = (TravelogixLogLevelService) appContext.getBean("testService");

		System.out.println("Main");
		one.testServiceMethod();
	}

}
