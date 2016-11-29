package com.cnk.travelogix.sapintegrations.ws.client.core;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.transform.TransformerException;

import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.WebServiceTransformerException;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceMessageExtractor;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.transport.WebServiceConnection;


public class TravelogixWebServiceTemplate extends WebServiceTemplate
{
	final Logger LOG = LoggerFactory.getLogger(TravelogixWebServiceTemplate.class);

	@Override
	@SuppressWarnings("unchecked")
	protected <T> T doSendAndReceive(final MessageContext messageContext, final WebServiceConnection connection,
			final WebServiceMessageCallback requestCallback, final WebServiceMessageExtractor<T> responseExtractor)
					throws IOException
	{
		try
		{
			if (requestCallback != null)
			{
				requestCallback.doWithMessage(messageContext.getRequest());
			}
			// Apply handleRequest of registered interceptors
			int interceptorIndex = -1;

			for (int i = 0; getInterceptors() != null && i < getInterceptors().length; i++)
			{
				interceptorIndex = i;
				if (!getInterceptors()[i].handleRequest(messageContext))
				{
					break;
				}
			}
			// if an interceptor has set a response, we don't send/receive
			if (!messageContext.hasResponse())
			{
				sendRequest(connection, messageContext.getRequest());
				if (hasError(connection, messageContext.getRequest()))
				{
					return (T) handleError(connection, messageContext.getRequest());
				}
				final WebServiceMessage response = connection.receive(getMessageFactory());
				messageContext.setResponse(response);
			}
			final boolean hasResponse = messageContext.hasResponse();
			final WebServiceMessage response = messageContext.getResponse();
			final boolean hasFault = hasResponse && hasFault(connection, response);
			logResponse(hasFault, messageContext);
			if (hasResponse)
			{
				if (!hasFault(connection, response))
				{
					triggerHandleResponse(interceptorIndex, messageContext);
					return responseExtractor.extractData(response);
				}
				else
				{
					triggerHandleFault(interceptorIndex, messageContext);
					return (T) handleFault(connection, messageContext);
				}
			}
			else
			{
				return null;
			}
		}
		catch (final TransformerException ex)
		{
			throw new WebServiceTransformerException("Transformation error: " + ex.getMessage(), ex);
		}
	}

	private void sendRequest(final WebServiceConnection connection, final WebServiceMessage request) throws IOException
	{
		if (LOG.isDebugEnabled())
		{
			final ByteArrayOutputStream os = new ByteArrayOutputStream();
			request.writeTo(os);
			LOG.debug((new StringBuilder()).append("Sent request [").append(getFormattedXML(os.toString("UTF-8"))).append("]")
					.toString());
		}
		connection.send(request);
	}

	private void logResponse(final boolean hasFault, final MessageContext messageContext) throws IOException
	{
		if (LOG.isDebugEnabled() || hasFault)
		{
			String responseString = StringUtils.EMPTY;
			final ByteArrayOutputStream requestStream = new ByteArrayOutputStream();
			messageContext.getRequest().writeTo(requestStream);
			final String requestString = requestStream.toString("UTF-8");
			LOG.debug("--------------------- REQUEST MESSAGE TO SAP WS --------------------");
			LOG.debug(getFormattedXML(requestString));
			if (messageContext.hasResponse())
			{
				final ByteArrayOutputStream responseStream = new ByteArrayOutputStream();
				messageContext.getResponse().writeTo(responseStream);
				responseString = responseStream.toString("UTF-8");
				LOG.debug("--------------------- RESPONSE MESSAGE FROM SAP WS --------------------");
				LOG.debug(getFormattedXML(responseString));
			}
			else
			{
				responseString = "NO_RESPONSE";
				LOG.debug("---------------------" + responseString + " --------------------");
			}
		}
	}

	/**
	 * Trigger handleResponse on the defined ClientInterceptors. Will just invoke said method on all interceptors whose
	 * handleRequest invocation returned <code>true</code>, in addition to the last interceptor who returned
	 * <code>false</code>.
	 *
	 * @param interceptorIndex
	 *           index of last interceptor that was called
	 * @param messageContext
	 *           the message context, whose request and response are filled
	 * @see ClientInterceptor#handleResponse(MessageContext)
	 * @see ClientInterceptor#handleFault(MessageContext)
	 */
	private void triggerHandleResponse(final int interceptorIndex, final MessageContext messageContext)
	{
		if (messageContext.hasResponse() && getInterceptors() != null)
		{
			for (int i = interceptorIndex; i >= 0; i--)
			{
				if (!getInterceptors()[i].handleResponse(messageContext))
				{
					break;
				}
			}
		}
	}

	/**
	 * Trigger handleFault on the defined ClientInterceptors. Will just invoke said method on all interceptors whose
	 * handleRequest invocation returned <code>true</code>, in addition to the last interceptor who returned
	 * <code>false</code>.
	 *
	 * @param interceptorIndex
	 *           index of last interceptor that was called
	 * @param messageContext
	 *           the message context, whose request and response are filled
	 * @see ClientInterceptor#handleResponse(MessageContext)
	 * @see ClientInterceptor#handleFault(MessageContext)
	 */
	private void triggerHandleFault(final int interceptorIndex, final MessageContext messageContext)
	{
		if (messageContext.hasResponse() && getInterceptors() != null)
		{
			for (int i = interceptorIndex; i >= 0; i--)
			{
				if (!getInterceptors()[i].handleFault(messageContext))
				{
					break;
				}
			}
		}
	}

	private String getFormattedXML(final String message)
	{
		try
		{
			final Document doc = DocumentHelper.parseText(message);
			final StringWriter sw = new StringWriter();
			final OutputFormat format = OutputFormat.createPrettyPrint();
			final XMLWriter xw = new XMLWriter(sw, format);
			xw.write(doc);
			return sw.toString();
		}
		catch (final Exception e)
		{
			LOG.debug("Error in formatting XML " + e);
		}
		return message;
	}
}
