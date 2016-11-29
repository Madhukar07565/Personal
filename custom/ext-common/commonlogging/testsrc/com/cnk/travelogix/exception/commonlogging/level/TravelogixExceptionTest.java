package com.cnk.travelogix.exception.commonlogging.level;

import de.hybris.bootstrap.annotations.UnitTest;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cnk.travelogix.exception.commonlogging.master.TravelogixErrorExceptionMaster;


/**
 * The Class TravelogixLogLevelTest.
 */
@UnitTest
public class TravelogixExceptionTest
{

	/** The Constant logger. */
	private static final Logger logger = Logger.getLogger(TravelogixExceptionTest.class);

	@Test
	public void testExceptionLogServiceTest()
	{
		//logger.debug("This is a debug message");
		//logger.info("This is a information message");
		//logger.warn("This is a warning message");
		//logger.log(TravelogixAuditLogLevel.AUDIT, "Start this is audit message");
		logger.log(TravelogixAuditLogLevel.AUDIT, "Start the ecception message");
		Assert.assertEquals("AUDIT", TravelogixAuditLogLevel.AUDIT.toString());
		final ApplicationContext ctx = new ClassPathXmlApplicationContext("commonlogging-spring-test.xml");
		final TravelogixErrorExceptionMaster myExampleBean = ctx.getBean(TravelogixErrorExceptionMaster.class);
		myExampleBean.run();
		logger.log(TravelogixAuditLogLevel.AUDIT, "End the ecception message");
	}

}
