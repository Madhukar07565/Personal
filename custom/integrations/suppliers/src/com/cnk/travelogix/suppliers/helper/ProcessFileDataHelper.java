package com.cnk.travelogix.suppliers.helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.mappings.product.model.SupplierProductModel;
import com.cnk.travelogix.suppliers.constants.SuppliersConstants;
import com.cnk.travelogix.suppliers.events.CheckFileStatusEvent;

import de.hybris.platform.core.Registry;
import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.ModelNotFoundException;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.util.Config;

public class ProcessFileDataHelper implements Callable<List<String>> {

	/** The Constant LOGGER. */
	private static final Logger LOG = Logger.getLogger(ProcessFileDataHelper.class);

	/** The Constant lineItem. */
	private File file;

	/** The event service. */
	private EventService eventService;

	/** The list for error **/
	private List<String> errorLines = null;

	/** The flexible service. */
	private FlexibleSearchService flexibleSearchService;

	public ProcessFileDataHelper(final File file) {
		this.file = file;
	}

	@Override
	public List<String> call() throws IOException {
		LOG.info("Inside the run method- Start");
		errorLines = new ArrayList<>();
		process(file, errorLines);
		LOG.info("Inside the run method- End");
		return errorLines;
	}

	/**
	 * 
	 * @param line
	 * @throws IOException
	 */
	private void process(final File file, final List<String> errorLines) {

		if (null != file) {
			String line = StringUtils.EMPTY;
			try(BufferedReader reader = new BufferedReader(new FileReader(file));) {
				
				while ((line = reader.readLine()) != null) {
					setEmailParams(line);
				}
			} catch (IOException ioe) {
				LOG.error("IO Exception occured.", ioe);
				errorLines.add(line);
			}
			LOG.info("Inside the processLineItem method- End");
		}
	}

	public void setEmailParams(String line)
	
	{
		final CheckFileStatusEvent event = new CheckFileStatusEvent();
		LOG.info("Inside the processLineItem method- Start");
		final String[] column = line.split(SuppliersConstants.SPLIT_OPERATOR);
		Registry.activateMasterTenant();
		if (StringUtils.isNotBlank(column[14])) {
			LOG.info("Inside the if, since we have the action type.");
			// Checking the flag for type of email to be sent.
			if (StringUtils.equalsIgnoreCase(column[14], "U")) {
				event.setEmailId(Config.getParameter("add.update.emailId.reference"));
				event.setEmailJourney("Update");
			}
			if (StringUtils.equalsIgnoreCase(column[14], "D")) {
				event.setEmailId(Config.getParameter("delete.emailId.reference"));
				event.setEmailJourney("Delete");
			}
			LOG.info("Triggering the email from if loop.");
			eventService.publishEvent(event);
		} else {
			LOG.info("Inside the else, since we do not have the action type.");
			SupplierProductModel supplierProductModel = new SupplierProductModel();
			if (StringUtils.isNotBlank(column[4])) {
				supplierProductModel.setAddress(column[4]);
			}
			if (StringUtils.isNotBlank(column[5])) {
				supplierProductModel.setTelephone(column[5]);
			}
			if (StringUtils.isNotBlank(column[6])) {
				supplierProductModel.setCountry(column[6]);
			}
			if (StringUtils.isNotBlank(column[7])) {
				supplierProductModel.setCity(column[7]);
			}
			if (StringUtils.isNotBlank(column[8])) {
				supplierProductModel.setLocation(column[8]);
			}
			LOG.info("All attributes are set now for the model.");
			getSupplierModel(supplierProductModel,event);
			
		}
	}
	
	public void getSupplierModel(SupplierProductModel supplierProductModel,CheckFileStatusEvent event)
	{
		try {
			SupplierProductModel supplierProductNewModel = flexibleSearchService.getModelByExample(supplierProductModel);
			LOG.info("Supplier model found with the details of the line."+supplierProductNewModel);
		} catch (final ModelNotFoundException mnfe) {
			LOG.error("Supplier product model not found in the DB.", mnfe);
			event.setEmailId(Config.getParameter("add.update.emailId.reference"));
			eventService.publishEvent(event);
		} catch (final AmbiguousIdentifierException aie) {
			LOG.error(" Multiple Supplier product model found in the DB.", aie);
		}
	}
	public void setEventService(EventService eventService) {
		this.eventService = eventService;
	}

	public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
		this.flexibleSearchService = flexibleSearchService;
	}

}
