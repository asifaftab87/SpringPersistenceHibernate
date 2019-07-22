package org.liferayasif.commons.client;

import org.liferayasif.commons.template.WebRestTemplate;
import org.springframework.beans.factory.annotation.Value;

public abstract class RestClient {

	private WebRestTemplate webRestTemplate = new WebRestTemplate();
	
	@Value("${service.url.documents}")
	private String documentsURL;

	@Value("${service.url.reports}")
	private String reportsURL;
	
	public String getDocumentsURL() {
		return documentsURL;
	}

	public String getReportsURL() {
		return reportsURL;
	}
	
	public WebRestTemplate getWebRestTemplate() {
		return webRestTemplate;
	}
}
