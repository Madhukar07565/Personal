/**
 * @author I077988
 */
package com.cnk.travelogix.suppliers.util;

import java.io.IOException;
import java.io.Writer;

import org.apache.log4j.Logger;

/**
 * @author I077988
 *
 */
public class CsvWriter {

    private static final Logger LOG = Logger.getLogger(CsvWriter.class);

    private final String systemRecordDelimiter = System.getProperty("line.separator");

    private char delimiter;
    private Writer outputStream;

    /**
     * Creates a {@link com.cnk.travelogix.suppliers.util.CsvWriter} object
     * using a Writer to write data to.
     *
     * @param outputStream
     *            The stream to write the column delimited data to.
     * @param delimiter
     *            The character to use as the column delimiter.
     */
    public CsvWriter(final Writer outputStream, final char delimiter) {
	if (outputStream == null) {
	    throw new IllegalArgumentException("Parameter outputStream can not be null.");
	}
	this.outputStream = outputStream;
	this.delimiter = delimiter;
    }

    /**
     * Writes another column of data to this record.
     *
     * @param content
     *            The data for the new column.
     * @exception IOException
     *                Thrown if an error occurs while writing data to the
     *                destination stream.
     */
    public void write(final String content) throws IOException {
	this.outputStream.append(content);
	this.outputStream.append(delimiter);
    }

    /**
     * Ends the current record by sending the record delimiter.
     *
     * @exception IOException
     *                Thrown if an error occurs while writing data to the
     *                destination stream.
     */
    public void endRecord() throws IOException {
	this.outputStream.append(systemRecordDelimiter);
    }

    /**
     * Closes and releases all related resources.
     */
    public void close() {
	try {
	    outputStream.flush();
	    outputStream.close();
	} catch (IOException e) {
	    LOG.warn(e.getMessage(), e);
	}
    }
}