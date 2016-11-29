package com.cnk.travelogix.core.livesupporti.client.impl;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import de.hybris.platform.servicelayer.config.ConfigurationService;

public class CommonRestClientImpl<T, T2, T3> {

	private static final Logger LOG = LoggerFactory.getLogger(BannedVisitorRestClientImpl.class);
	
	private static final String LIVE_SUPPORT_CREDENTIALS_USERNAME = "livesupport.api.credentials.username";
	private static final String LIVE_SUPPORT_CREDENTIALS_TOKEN = "livesupport.api.credentials.token";
	
	@Autowired
    private ConfigurationService configurationService;
	
	
	public RestTemplate initializeRestTemplate() {
		RestTemplate restTemplate;
		Credentials credentials;

		// 1. Set credentials
		credentials = new UsernamePasswordCredentials(configurationService.getConfiguration()
				.getString(LIVE_SUPPORT_CREDENTIALS_USERNAME), configurationService.getConfiguration()
				.getString(LIVE_SUPPORT_CREDENTIALS_TOKEN));
		CredentialsProvider credsProvider = new BasicCredentialsProvider();
		credsProvider.setCredentials(AuthScope.ANY, credentials);

		// 2. Bind credentialsProvider to httpClient
		HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
		httpClientBuilder.setDefaultCredentialsProvider(credsProvider);
		CloseableHttpClient httpClient = httpClientBuilder.build();
		HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory(httpClient);

		// 3. create restTemplate
		restTemplate = new RestTemplate();
		restTemplate.setRequestFactory(factory);

		return restTemplate;
	}

	public T getAll(String encodedUrl, Class<T> type) {

		T response = null;
		LOG.trace("EncodedUrl:: {}", encodedUrl);
		try {
			RestTemplate restTemplate = initializeRestTemplate();
			HttpEntity<String> request = new HttpEntity<>(createHeaders());
			ResponseEntity<String> responseEntity = restTemplate.exchange(encodedUrl, HttpMethod.GET, request,
					String.class);

			LOG.trace(responseEntity.getBody());
			ObjectMapper mapper = new ObjectMapper();
			response = mapper.readValue(responseEntity.getBody(), type);

		} catch (Exception e) {
			LOG.info("#getAllBannedVisitors - Failure ErrorMessage:{}" + e.getMessage(), e);

		}
		LOG.trace("#getAllBannedVisitors - Finish");
		return response;
	}

	public T2 getById(String encodedUrl, Class<T2> type2) {

		T2 response = null;
		try {
			RestTemplate restTemplate = initializeRestTemplate();
			LOG.trace("EncodedUrl:: >>>>>>>>>>>> " + encodedUrl);

			HttpEntity<String> request = new HttpEntity<>(createHeaders());
			ResponseEntity<String> responseEntity = restTemplate.exchange(encodedUrl, HttpMethod.GET, request,
					String.class);

			LOG.trace(responseEntity.getBody());
			ObjectMapper mapper = new ObjectMapper();
			response = mapper.readValue(responseEntity.getBody(), type2);

		} catch (Exception e) {
			LOG.info("#getAllBannedVisitors - Failure ErrorMessage:{}" + e.getMessage(), e);
		}
		LOG.trace("#getAllBannedVisitors - Finish");
		return response;
	}

	public T3 getStringArray(String encodedUrl, HttpMethod httpMethod, Class<T3> type3) {

		T3 response = null;
		try {
			RestTemplate restTemplate = initializeRestTemplate();
			LOG.trace("EncodedUrl:: >>>>>>>>>>>> " + encodedUrl);

			HttpEntity<String> request = new HttpEntity<>(createHeaders());
			ResponseEntity<String> responseEntity = restTemplate.exchange(encodedUrl, httpMethod, request,
					String.class);

			LOG.trace(responseEntity.getBody());
			ObjectMapper mapper = new ObjectMapper();
			response = mapper.readValue(responseEntity.getBody(), type3);

		} catch (Exception e) {
			LOG.info("#getAllBannedVisitors - Failure ErrorMessage:{}" + e.getMessage(), e);
		}
		LOG.trace("#getAllBannedVisitors - Finish");
		return response;
	}
	
	public void delete(String encodedUrl) {
		try {
			RestTemplate restTemplate = initializeRestTemplate();

			HttpEntity<String> request = new HttpEntity<>(createHeaders());
			ResponseEntity<String> responseEntity = restTemplate.exchange(encodedUrl, HttpMethod.DELETE, request,
					String.class);

			LOG.trace(responseEntity.getBody());

		} catch (Exception e) {
			LOG.info("#delete - Failure ErrorMessage:{}" + e.getMessage(), e);
		}
		LOG.trace("#delete - Finish");
	}

	public T2 createUpdate(String encodedUrl, HttpMethod httpMethod, T2 t2, Class<T2> type2) {
		T2 response = null;
		try {
			RestTemplate restTemplate = initializeRestTemplate();
			LOG.trace("EncodedUrl:: {}", encodedUrl);			
			HttpEntity<T2> request = new HttpEntity<>(t2, createHeaders());
			ResponseEntity<T2> responseEntity = restTemplate.exchange(encodedUrl, httpMethod, request, type2);
			response = responseEntity.getBody();			
			LOG.trace("create finish");
		} catch (Exception e) {
			LOG.info("#create - Failure ErrorMessage:{}" + e.getMessage(), e);
		}
		LOG.trace("#create - Finish");
		return response;
	}
	
	public HttpHeaders createHeaders() {
		return new HttpHeaders() {
			{
				String username = configurationService.getConfiguration()
						.getString(LIVE_SUPPORT_CREDENTIALS_USERNAME);
				String password = configurationService.getConfiguration()
						.getString(LIVE_SUPPORT_CREDENTIALS_TOKEN);
				String auth = username + ":" + password;
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes());
				String authHeader = "Basic " + new String(encodedAuth);
				set("Authorization", authHeader);
			}
		};
	}
}
