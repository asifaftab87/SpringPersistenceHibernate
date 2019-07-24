package org.liferayasif.commons.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class DocumentsClient extends RestTemplate {

	@Value("${service.url.documents}")
	private String documentsURL;
	
	public DocumentsClient() {
		super();
	}

}
