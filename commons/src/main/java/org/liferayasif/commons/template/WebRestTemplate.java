package org.liferayasif.commons.template;

import java.net.URI;

import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class WebRestTemplate extends RestTemplate {

	public WebRestTemplate(){
		super();
	}
	
	public WebRestTemplate(ClientHttpRequestFactory requestFactory) {
        super(requestFactory);
    }
	
	@Override
	public <T> T postForObject(URI url, Object request, Class<T> responseType) throws RestClientException {
		
		return super.postForObject(url, request, responseType);
	}
}
