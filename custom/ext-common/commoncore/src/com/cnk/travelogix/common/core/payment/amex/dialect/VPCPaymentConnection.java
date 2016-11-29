/*
 * VPCPaymentConnection.java
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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

import com.sun.net.ssl.SSLContext;
import com.sun.net.ssl.X509TrustManager;


/**
 * Helper class to perform 2 party Virtual Payment Client transactions. The helper functions contained in this class are
 * able to generate the post data to be sent to the Payment Server for processing, as well as determining whether data
 * has been returned in the response to the transaction request.
 */
public class VPCPaymentConnection
{

	/** Creates a new instance of VPCPaymentConnection */
	public VPCPaymentConnection()
	{
	}

	/**
	 * Declare a static X509 trust manager.
	 */
	public static X509TrustManager s_x509TrustManager = null;
	/**
	 * Declare a static ssl Socket Factory.
	 */
	public static SSLSocketFactory s_sslSocketFactory = null;

	static
	{
		s_x509TrustManager = new X509TrustManager()
		{
			public X509Certificate[] getAcceptedIssuers()
			{
				return new X509Certificate[] {};
			}

			public boolean isClientTrusted(final X509Certificate[] chain)
			{
				return true;
			}

			public boolean isServerTrusted(final X509Certificate[] chain)
			{
				return true;
			}
		};

		java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
		try
		{
			final SSLContext context = SSLContext.getInstance("TLS");
			context.init(null, new X509TrustManager[]
			{ s_x509TrustManager }, null);
			s_sslSocketFactory = context.getSocketFactory();
		}
		catch (final Exception e)
		{
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
	}

	/**
	 * Helper function to generate and send the POST data for a 2 party VPC txn.
	 * 
	 * @param vpc_Host
	 *           is the host where the 2 party transaction request is being sent to.
	 * @param data
	 *           is the data being sent in the POST request.
	 * @param useProxy
	 *           is the flag indicating whether a proxy is being used.
	 * @param proxyHost
	 *           is the proxy host being used for the transaction.
	 * @param proxyPort
	 *           is the port of the proxy host being used for the transaction.
	 * @return the response data for the 2 party transaction request.
	 * @throws java.io.IOException
	 *            when unable to perform the POST request for the 2 party transaction.
	 */
	public static String doPost(String vpc_Host, final String data, final boolean useProxy, final String proxyHost,
			final int proxyPort) throws IOException
	{

		InputStream is;
		OutputStream os;
		final int vpc_Port = 443;
		String fileName = "";
		boolean useSSL = false;

		// determine if SSL encryption is being used
		if (vpc_Host.substring(0, 8).equalsIgnoreCase("HTTPS://"))
		{
			useSSL = true;
			// remove 'HTTPS://' from host URL
			vpc_Host = vpc_Host.substring(8);
			// get the filename from the last section of vpc_URL
			fileName = vpc_Host.substring(vpc_Host.lastIndexOf("/"));
			// get the IP address of the VPC machine
			vpc_Host = vpc_Host.substring(0, vpc_Host.lastIndexOf("/"));
		}

		// use the next block of code if using a proxy server
		if (useProxy)
		{
			final Socket s = new Socket(proxyHost, proxyPort);
			os = s.getOutputStream();
			is = s.getInputStream();
			// use next block of code if using SSL encryption
			if (useSSL)
			{
				final String msg = "CONNECT " + vpc_Host + ":" + vpc_Port + " HTTP/1.0\r\n" + "User-Agent: HTTP Client\r\n\r\n";
				os.write(msg.getBytes());
				final byte[] buf = new byte[4096];
				final int len = is.read(buf);
				final String res = new String(buf, 0, len);

				// check if a successful HTTP connection
				if (res.indexOf("200") < 0)
				{
					throw new IOException("Proxy would now allow connection - " + res);
				}

				// write output to VPC
				final SSLSocket ssl = (SSLSocket) s_sslSocketFactory.createSocket(s, vpc_Host, vpc_Port, true);
				ssl.startHandshake();
				os = ssl.getOutputStream();
				// get response data from VPC
				is = ssl.getInputStream();
				// use the next block of code if NOT using SSL encryption
			}
			else
			{
				fileName = vpc_Host;
			}
			// use the next block of code if NOT using a proxy server
		}
		else
		{
			// use next block of code if using SSL encryption
			if (useSSL)
			{
				final Socket s = s_sslSocketFactory.createSocket(vpc_Host, vpc_Port);
				os = s.getOutputStream();
				is = s.getInputStream();
				// use next block of code if NOT using SSL encryption
			}
			else
			{
				final Socket s = new Socket(vpc_Host, vpc_Port);
				os = s.getOutputStream();
				is = s.getInputStream();
			}
		}

		final String req = "POST " + fileName + " HTTP/1.0\r\n" + "User-Agent: HTTP Client\r\n"
				+ "Content-Type: application/x-www-form-urlencoded\r\n" + "Content-Length: " + data.length() + "\r\n\r\n" + data;

		os.write(req.getBytes());
		final String res = new String(readAll(is));

		// check if a successful connection
		if (res.indexOf("200") < 0)
		{
			throw new IOException("Connection Refused - " + res);
		}

		if (res.indexOf("404 Not Found") > 0)
		{
			throw new IOException("File Not Found Error - " + res);
		}

		final int resIndex = res.indexOf("\r\n\r\n");
		final String body = res.substring(resIndex + 4, res.length());
		return body;
	}

	/**
	 * Helper function to read the response data.
	 * 
	 * @param is
	 *           the response data returned.
	 * @return a byte array of the input data.
	 * @throws java.io.IOException
	 *            when it is unable to read the response data.
	 */
	public static byte[] readAll(final InputStream is) throws IOException
	{

		final ByteArrayOutputStream baos = new ByteArrayOutputStream();
		final byte[] buf = new byte[1024];

		while (true)
		{
			final int len = is.read(buf);
			if (len < 0)
			{
				break;
			}
			baos.write(buf, 0, len);
		}
		return baos.toByteArray();
	}

	/**
	 * Helper function to create the POST data from the fields provided.
	 * 
	 * @param fields
	 *           a map of the fields to be included in the POST request.
	 * @return the POST data string to be sent for processing.
	 */
	public String createPostDataFromMap(final Map fields)
	{
		final StringBuffer buf = new StringBuffer();

		String ampersand = "";

		// append all fields in a data string
		for (final Iterator i = fields.keySet().iterator(); i.hasNext();)
		{

			final String key = (String) i.next();
			final String value = (String) fields.get(key);

			if ((value != null) && (value.length() > 0))
			{
				// append the parameters
				buf.append(ampersand);
				buf.append(URLEncoder.encode(key));
				buf.append('=');
				buf.append(URLEncoder.encode(value));
			}
			ampersand = "&";
		}

		// return string 
		return buf.toString();
	}

	/**
	 * Helper function to create a map of the response data.
	 * 
	 * @param queryString
	 *           the result string returned from the POST request.
	 * @return the map of the response fields returned.
	 */
	public Map createMapFromResponse(final String queryString)
	{
		final Map map = new HashMap();
		final StringTokenizer st = new StringTokenizer(queryString, "&");
		while (st.hasMoreTokens())
		{
			final String token = st.nextToken();
			final int i = token.indexOf('=');
			if (i > 0)
			{
				try
				{
					final String key = token.substring(0, i);
					final String value = URLDecoder.decode(token.substring(i + 1, token.length()));
					map.put(key, value);
				}
				catch (final Exception ex)
				{
					// Do Nothing and keep looping through data
				}
			}
		}
		return map;
	}



	/**
	 * Helper function to get the response data returned for the given field.
	 * 
	 * @param in
	 *           the field to retrieve the data for.
	 * @param responseFields
	 *           the map of fields in the response string to the transaction attempt.
	 * @return the data for the given field or "No Value Returned".
	 */
	public static String null2unknown(final String in, final Map responseFields)
	{
		if (in == null || in.length() == 0 || (String) responseFields.get(in) == null)
		{
			return "No Value Returned";
		}
		else
		{
			return (String) responseFields.get(in);
		}
	}

	/**
	 * This method takes a data String and returns a predefined value if empty If data Sting is null, returns string
	 * "No Value Returned", else returns input
	 *
	 * @param in
	 *           String containing the data String
	 * @return String containing the output String
	 */
	public static String null2unknownDR(final String in)
	{
		if (in == null || in.length() == 0)
		{
			return "No Value Returned";
		}
		else
		{
			return in;
		}
	}
}
