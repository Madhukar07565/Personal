/**
 * @author I077988
 */
package com.cnk.travelogix.suppliers.util;

import de.hybris.platform.servicelayer.config.ConfigurationService;

import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author I077988
 *
 */
public class SupplierUtils {

    public static final char COMMA_DELIMITER = ',';

    @Autowired
    private ConfigurationService configurationService;

    public String getMappingOutputFile(final String mappingFilePathKey, final String mappingFileName) throws IOException {

	final Format formatter = new SimpleDateFormat("yyyy-MM-dd");
	final String timeStamp = formatter.format(Calendar.getInstance().getTime());

	final String mappingFilePath = configurationService.getConfiguration().getString(mappingFilePathKey);
	final StringBuilder mappingOutputFile = new StringBuilder();
	mappingOutputFile.append(mappingFilePath).append(mappingFileName).append(timeStamp).append(".csv");

	return mappingOutputFile.toString();
    }
}
