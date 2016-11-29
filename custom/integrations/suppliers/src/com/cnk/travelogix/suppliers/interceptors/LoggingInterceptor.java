package com.cnk.travelogix.suppliers.interceptors;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

/**
 * @author I077988
 */
public class LoggingInterceptor implements ClientHttpRequestInterceptor {

    private static final Logger LOG = LoggerFactory.getLogger(LoggingInterceptor.class);

    @Override
    public ClientHttpResponse intercept(final HttpRequest request, final byte[] body, final ClientHttpRequestExecution execution) throws IOException {
	traceRequest(request, body);
	final ClientHttpResponse response = execution.execute(request, body);
	traceResponse(response);
	return response;
    }

    private void traceRequest(HttpRequest request, byte[] body) throws IOException {
	LOG.info("=======================Request begin==============================================");
	LOG.info("URI: {}", request.getURI());
	LOG.info("Method: {}", request.getMethod());
	LOG.info("RequestBody: {}", new String(body, "UTF-8"));
	LOG.info("=======================Request end================================================");
    }

    private void traceResponse(final ClientHttpResponse response) throws IOException {
	final String responseXML = IOUtils.toString(response.getBody());
	LOG.info("=======================Response begin==============================================");
	LOG.info("StatusCode: {}", response.getStatusCode());
	LOG.info("StatusText: {}", response.getStatusText());
	LOG.info("ResponseBody: {}", responseXML);
	LOG.info("=======================Response end=================================================");
    }
}