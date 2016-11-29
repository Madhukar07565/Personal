package com.cnk.travelogix.suppliers.service.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.suppliers.constants.SuppliersConstants;
import com.cnk.travelogix.suppliers.helper.ProcessFileDataHelper;
import com.cnk.travelogix.suppliers.service.CheckFileStatusService;

import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.util.Config;

/*
 * 
 * @author I323673
 *
 *         The class CheckFileStatusServiceImpl
 */
public class CheckFileStatusServiceImpl implements CheckFileStatusService {

	/** The Constant LOGGER. */
	private static final Logger LOG = Logger.getLogger(CheckFileStatusServiceImpl.class);

	/** The event service. */
	@Resource
	private EventService eventService;

	/** The flexible service. */
	@Resource
	private FlexibleSearchService flexibleSearchService;

	/**
	 * @return void
	 * @param Date
	 *            date
	 */
	@Override
	public void getlistofFile(final Date date) {

		final File currentDir = new File("C:\\Users\\I323673\\Desktop\\csvFolder");
		displayDirectoryContents(currentDir, date);
	}

	/**
	 * 
	 * @param dir
	 * @param date
	 */
	private void displayDirectoryContents(final File dir, final Date date) {

		final File[] files = dir.listFiles();
		for (final File file : files) {
			if (file.isDirectory()) {
				displayDirectoryContents(file, date);
			} else {
				final Date lastMod = getLastModifiedDateOfFile(file);
				if (lastMod.compareTo(date) > 0) {
					/*Config.getParameter("total.threads.Value")*/
					final ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors
							.newFixedThreadPool(4);
					LOG.info("File is modified recently : " + file.getName());
					final ProcessFileDataHelper processFileDataHelper = new ProcessFileDataHelper(file);
					final Future<List<String>> errorLineList = executor.submit(processFileDataHelper);
					LOG.info("Received the response");
					LOG.info("errorlines"+errorLineList);;
					/*
					 * if (null != errorLineList) { LOG.info(
					 * "The error list is not empty and hence writing the list to a file."
					 * ); writeErrorsToFile(file, errorLineList); } else {
					 */
					executor.shutdown();
					exectutorAwait(executor);
					LOG.info("Error List is empty and hence moving the complete file to the processed folder.");
					moveFileToProcessedFolder(file);
					
					executor.shutdown();
				}
			}
		}
	}

	
public void exectutorAwait(ThreadPoolExecutor executor )
{
	try {
		executor.awaitTermination(60, TimeUnit.MINUTES);
	} catch (Exception e) {
		
		LOG.error("InterruptedException"+e.getMessage(),e);
	}
}
	/**
	 * 
	 * @param file
	 */
	private void moveFileToProcessedFolder(final File file) {
		try {
			if (null != file) {
				final File sourceFile = new File(file.getAbsolutePath());
				final File destinationDir = new File("C:\\Users\\I323673\\Desktop\\csvFolder\\directory-destination");
				FileUtils.moveFileToDirectory(sourceFile, destinationDir, true);
				
				LOG.info("File **" + file.getName() + "** is copied to processed folder successfully!");
			}
		} catch (final IOException io) {
			try {
				FileUtils.forceDelete(file);
			} catch (final IOException e) {
				LOG.error("Error in force delete.", e);
			}
			LOG.error("Error occurred in catch block while moving the file to processed folder.", io);
		} catch (final Exception e) {
			LOG.error("Error occurred while moving the file to processed folder.", e);
		}
	}

	/**
	 * 
	 * @param file
	 * @return Date
	 */
	private Date getLastModifiedDateOfFile(final File file) {
		final String string = StringUtils.substringAfter(file.getName(), "_");
		final DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss", Locale.ENGLISH);
		try {
			if (StringUtils.isNotBlank(string)) {
				return format.parse(string);
			}
		} catch (final ParseException e) {
			LOG.error("Error while parsing the date of the file.", e);
		}
		return new Date();
	}

	/**
	 * 
	 * @param file
	 * @param errorLineList
	 */
	@SuppressWarnings("unused")
	private void writeErrorsToFile(final File file, final Future<List<String>> errorLineList) {
		try (FileWriter fileWriter = new FileWriter(file.getName() + "_Error");){
			for (String errorLine : errorLineList.get()) {
				fileWriter.append(String.valueOf(errorLine));
				fileWriter.append(SuppliersConstants.NEW_LINE_SEPARATOR);
			}
		} catch (final IOException io) {
			LOG.error("I/O Error in Csv File Writer !!!", io);
		} catch (final Exception e) {
			LOG.error("Error in Csv File Writer !!!", e);
		} 
	}
}