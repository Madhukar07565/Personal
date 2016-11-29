package com.cnk.travelogix.exception.commonlogging.fileappender;

import static org.mockito.Mockito.mock;

import de.hybris.bootstrap.annotations.UnitTest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.cnk.travelogix.exception.commonlogging.level.TravelogixAuditLogLevel;


/**
 * The Class CoronaLogLevelFileAppenderTest.
 */
@UnitTest
public class TravelogixLogLevelFileAppenderTest
{

	/** The appender. */
	private TravelogixLogLevelFileAppender appender;

	/**
	 * Sets the up.
	 */
	@Before
	public void setUp()
	{
		appender = mock(TravelogixLogLevelFileAppender.class);
		Logger.getRootLogger().addAppender(appender);
	}

	/**
	 * Removes the appender.
	 */
	@After
	public void removeAppender()
	{
		Logger.getRootLogger().removeAppender(appender);
	}

	/**
	 * Test method.
	 */
	@Test
	public void testMethod()
	{
		final Logger loggerWrite = Logger.getLogger(TravelogixLogLevelFileAppenderTest.class);

		final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		final String currDate = sdf.format(new Date());
		//verify(appender).doAppend((LoggingEvent) anyObject());
		// ArgumentCaptor arguments = ArgumentCaptor.forClass(LoggingEvent.class);
		// assertThat(arguments.getValue(), is(TravelogixAuditLogLevel.WARN));
		//assertEquals( arguments.getValue() , TravelogixAuditLogLevel.AUDIT );
		final String fileName = "travelogix-web-AUDIT-" + currDate + ".log";
		final Logger rootLogger = Logger.getRootLogger();
		rootLogger.setLevel(TravelogixAuditLogLevel.AUDIT);
		final PatternLayout layout = new PatternLayout("%d{ISO8601} [%t] %-5p %c %x - %m%n");

		try
		{
			final TravelogixLogLevelFileAppender fileAppender = new TravelogixLogLevelFileAppender(layout, fileName);
			rootLogger.addAppender(fileAppender);
			loggerWrite.log(TravelogixAuditLogLevel.AUDIT, "This is audit test message");
			Assert.assertEquals(fileName, fileAppender.getFile());
		}
		catch (final IOException e)
		{
			loggerWrite.error("error", e);
		}

	}



}
