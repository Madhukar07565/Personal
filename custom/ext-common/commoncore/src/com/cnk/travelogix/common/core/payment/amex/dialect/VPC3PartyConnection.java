/*
 * VPC3PartyConnection.java
 *
 * Version 1.0
 *
 * ----------------- Disclaimer ------------------------------------------------
 *
 * Copyright � 2007 Dialect Payment Technologies - a Transaction Network
 * Services company.  All rights reserved.
 *
 * This program is provided by Dialect Payment Technologies on the basis that
 * you will treat it as confidential.
 *
 * No part of this program may be reproduced or copied in any form by any means
 * without the written permission of Dialect Payment Technologies.  Unless
 * otherwise expressly agreed in writing, the information contained in this
 * program is subject to change without notice and Dialect Payment Technologies
 * assumes no responsibility for any alteration to, or any error or other
 * deficiency, in this program.
 *
 * 1. All intellectual property rights in the program and in all extracts and
 *    things derived from any part of the program are owned by Dialect and will
 *    be assigned to Dialect on their creation. You will protect all the
 *    intellectual property rights relating to the program in a manner that is
 *    equal to the protection you provide your own intellectual property.  You
 *    will notify Dialect immediately, and in writing where you become aware of
 *    a breach of Dialect's intellectual property rights in relation to the
 *    program.
 * 2. The names "Dialect", "QSI Payments" and all similar words are trademarks
 *    of Dialect Payment Technologies and you must not use that name or any
 *    similar name.
 * 3. Dialect may at its sole discretion terminate the rights granted in this
 *    program with immediate effect by notifying you in writing and you will
 *    thereupon return (or destroy and certify that destruction to Dialect) all
 *    copies and extracts of the program in its possession or control.
 * 4. Dialect does not warrant the accuracy or completeness of the program or
 *    its content or its usefulness to you or your merchant customers.  To the
 *    extent permitted by law, all conditions and warranties implied by law
 *    (whether as to fitness for any particular purpose or otherwise) are
 *    excluded. Where the exclusion is not effective, Dialect limits its
 *    liability to $100 or the resupply of the program (at Dialect's option).
 * 5. Data used in examples and sample data files are intended to be fictional
 *    and any resemblance to real persons or companies is entirely coincidental.
 * 6. Dialect does not indemnify you or any third party in relation to the
 *   content or any use of the content as contemplated in these terms and
 *    conditions.
 * 7. Mention of any product not owned by Dialect does not constitute an
 *    endorsement of that product.
 * 8. This program is governed by the laws of New South Wales, Australia and is
 *    intended to be legally binding.
 * ---------------------------------------------------------------------------*/

package com.cnk.travelogix.common.core.payment.amex.dialect;

import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


/**
 * Helper class to perform 3 party transactions for Virtual Payment Client. This class contains all the necessary
 * functions to set the Secure Secret and provide a sorted MD5 secure hash for the data provided.
 *
 * @author Dialect Payment Technologies
 */
public class VPC3PartyConnection
{

	/** Creates a new instance of VPC3PartyConnection */
	public VPC3PartyConnection()
	{
	}



	// This is an array for creating hex chars
	static final char[] HEX_TABLE = new char[]
	{ '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

	private String secureSecret = null;

	/**
	 * Helper function to set the Secure Secret value to create the hash map. This function will take the SecureSecret
	 * value provided for use later to generate the hash map. This function is only used for 3 party transactions.
	 *
	 * @param secret
	 *           the Secure Secret provided for the generation of the hash map.
	 */
	public void setSecureSecret(final String secret)
	{
		this.secureSecret = secret;
	}


	/**
	 * This method is for sorting the fields and creating an MD5 secure hash.
	 *
	 * @param fields
	 *           is a map of all the incoming hey-value pairs from the VPC
	 * @return the MD5 secure has once the fields have been sorted.
	 */
	public String hashAllFields(final Map fields)
	{

		// create a list and sort it
		final List fieldNames = new ArrayList(fields.keySet());
		Collections.sort(fieldNames);

		// create a buffer for the md5 input and add the secure secret first
		final StringBuffer buf = new StringBuffer();
		buf.append(secureSecret);

		// iterate through the list and add the remaining field values
		final Iterator itr = fieldNames.iterator();

		while (itr.hasNext())
		{
			final String fieldName = (String) itr.next();
			final String fieldValue = (String) fields.get(fieldName);
			if ((fieldValue != null) && (fieldValue.length() > 0))
			{
				buf.append(fieldValue);
			}
		}

		MessageDigest md5 = null;
		byte[] ba = null;

		// create the md5 hash and UTF-8 encode it
		try
		{
			md5 = MessageDigest.getInstance("MD5");
			ba = md5.digest(buf.toString().getBytes("UTF-8"));
		}
		catch (final Exception e)
		{
			throw new RuntimeException(e);
		} // wont happen

		//return buf.toString();
		return hex(ba);

	}

	/**
	 * Returns Hex output of byte array
	 *
	 * @param input
	 *           the input data to be converted to HEX.
	 * @return the string in HEX format.
	 */
	public static String hex(final byte[] input)
	{
		// create a StringBuffer 2x the size of the hash array
		final StringBuffer sb = new StringBuffer(input.length * 2);

		// retrieve the byte array data, convert it to hex
		// and add it to the StringBuffer
		for (int i = 0; i < input.length; i++)
		{
			sb.append(HEX_TABLE[(input[i] >> 4) & 0xf]);
			sb.append(HEX_TABLE[input[i] & 0xf]);
		}
		return sb.toString();
	}

	/**
	 * This method is for creating a URL query string.
	 *
	 * @param buf
	 *           is the inital URL for appending the encoded fields to
	 * @param fields
	 *           is the input parameters from the order page
	 */
	// Method for creating a URL query string
	public void appendQueryFields(final StringBuffer buf, final Map fields)
	{

		// create a list
		final List fieldNames = new ArrayList(fields.keySet());
		final Iterator itr = fieldNames.iterator();

		// move through the list and create a series of URL key/value pairs
		while (itr.hasNext())
		{
			final String fieldName = (String) itr.next();
			final String fieldValue = (String) fields.get(fieldName);

			if ((fieldValue != null) && (fieldValue.length() > 0))
			{
				// append the URL parameters
				buf.append(URLEncoder.encode(fieldName));
				buf.append('=');
				buf.append(URLEncoder.encode(fieldValue));
			}

			// add a '&' to the end if we have more fields coming.
			if (itr.hasNext())
			{
				buf.append('&');
			}
		}

	}



}
