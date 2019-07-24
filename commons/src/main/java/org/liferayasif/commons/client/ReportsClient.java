package org.liferayasif.commons.client;

import java.net.URI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class ReportsClient extends RestTemplate {

	@Value("${service.url.reports}")
	private String reportsURL;
	
	public ReportsClient() {
		super();
	}
	
	/*
	 * @Override public <T> T postForObject(URI url, Object request, Class<T>
	 * responseType) throws RestClientException { url = URI.create(reportsURL +
	 * url); return super.postForObject(url, request, responseType); }
	 */
}
