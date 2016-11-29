package com.cnk.travelogix.exception.commonlogging.fileappender;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.MDC;
import org.apache.log4j.spi.LoggingEvent;


/**
 * The Class TravelogixLogLevelFileAppender.
 */
public class TravelogixLogLevelFileAppender extends FileAppender
{

	/** The Constant DOT. */
	private final static String DOT = ".";

	/** The Constant HIPHEN. */
	private final static String HIPHEN = "-";

	/** The Constant ORIG_LOG_FILE_NAME. */
	private static final String ORIG_LOG_FILE_NAME = "OrginalLogFileName";

	/** The file backup. Saves the file pattern */
	private String fileBackup;

	/** The log. */
	Logger logger = Logger.getLogger(TravelogixLogLevelFileAppender.class);

	/** The Constant AUDIT_LOG_LEVEL. */
	private static final String AUDIT_LOG_LEVEL = "AUDIT";

	/**
	 * Instantiates a new corona log level file appender.
	 */
	public TravelogixLogLevelFileAppender()
	{
		/*
		 * empty
		 */
	}

	/**
	 * Instantiates a new corona log level file appender.
	 *
	 * @param layout
	 *           the layout
	 * @param fileName
	 *           the file name
	 * @param append
	 *           the append
	 * @param bufferedIO
	 *           the buffered io
	 * @param bufferSize
	 *           the buffer size
	 * @throws IOException
	 *            Signals that an I/O exception has occurred.
	 */
	public TravelogixLogLevelFileAppender(final Layout layout, final String fileName, final boolean append,
			final boolean bufferedIO, final int bufferSize) throws IOException
	{
		super(layout, fileName, append, bufferedIO, bufferSize);
	}

	/**
	 * Instantiates a new corona log level file appender.
	 *
	 * @param layout
	 *           the layout
	 * @param fileName
	 *           the file name
	 * @param append
	 *           the append
	 * @throws IOException
	 *            Signals that an I/O exception has occurred.
	 */
	public TravelogixLogLevelFileAppender(final Layout layout, final String fileName, final boolean append) throws IOException
	{
		super(layout, fileName, append);
	}

	/**
	 * Instantiates a new corona log level file appender.
	 *
	 * @param layout
	 *           the layout
	 * @param fileName
	 *           the file name
	 * @throws IOException
	 *            Signals that an I/O exception has occurred.
	 */
	public TravelogixLogLevelFileAppender(final Layout layout, final String fileName) throws IOException
	{
		super(layout, fileName);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.apache.log4j.FileAppender#activateOptions()
	 */
	@Override
	public void activateOptions()
	{
		MDC.put(ORIG_LOG_FILE_NAME, fileName);
		super.activateOptions();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.apache.log4j.FileAppender#setFile(java.lang.String)
	 */
	@Override
	public synchronized void setFile(final String file)
	{
		super.setFile(file);
		this.fileBackup = getFile();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.apache.log4j.WriterAppender#subAppend(org.apache.log4j.spi.LoggingEvent)
	 */
	@Override
	protected void subAppend(final LoggingEvent event)
	{
		if (AUDIT_LOG_LEVEL.equalsIgnoreCase(event.getLevel().toString()))
		{
			try
			{
				// First reset the file so each new log gets a new file.
				setFile(getFile(), getAppend(), getBufferedIO(), getBufferSize(), event.getLevel().toString());
			}
			catch (final IOException e)
			{
				logger.error("Unable to reset fileName.", e);
			}
		}
		super.subAppend(event);
	}

	/**
	 * set the file for writing the custom log .
	 *
	 * @param fileName
	 *           the file name
	 * @param append
	 *           the append
	 * @param bufferedIO
	 *           the buffered io
	 * @param bufferSize
	 *           the buffer size
	 * @param level
	 *           the level
	 * @throws IOException
	 *            Signals that an I/O exception has occurred.
	 */
	public synchronized void setFile(final String fileName, final boolean append, final boolean bufferedIO, final int bufferSize,
			final String level) throws IOException
	{
		final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		final String currDate = sdf.format(new Date());

		if (fileBackup != null)
		{
			String newFileName = "";
			final int dotIndex = fileBackup.indexOf(DOT);
			if (dotIndex != -1)
			{
				// the file name has an extension. so, insert the level
				// between the file name and the extension
				newFileName = fileBackup.substring(0, dotIndex) + HIPHEN + level + HIPHEN + currDate + DOT
						+ fileBackup.substring(dotIndex + 1);
			}
			else
			{
				// the file name has no extension. So, just append the level
				// at the end.
				newFileName = fileBackup + HIPHEN + level;
			}
			super.setFile(newFileName, append, bufferedIO, bufferSize);
		}
	}

	/**
	 * Append level to file name.
	 *
	 * @param oldLogFileName
	 *           the old log file name
	 * @param level
	 *           the level
	 * @return the string
	 */
	public String appendLevelToFileName(final String oldLogFileName, final String level)
	{
		if (oldLogFileName != null)
		{
			logger.info("Log file name ===" + oldLogFileName);
			final File logFile = new File(oldLogFileName);
			String newFileName = "";
			final String fn = logFile.getName();
			final int dotIndex = fn.indexOf(DOT);
			if (dotIndex != -1)
			{
				// the file name has an extension. so, insert the level
				// between the file name and the extension
				newFileName = fn.substring(0, dotIndex) + HIPHEN + level + DOT + fn.substring(dotIndex + 1);
			}
			else
			{
				// the file name has no extension. So, just append the level
				// at the end.
				newFileName = fn + HIPHEN + level;
			}
			return logFile.getParent() + File.separator + newFileName;
		}
		return null;
	}

}
