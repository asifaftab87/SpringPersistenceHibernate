package org.liferayasif.reports.client;

import org.springframework.beans.factory.annotation.Value;

public abstract class RestClient {

	@Value("${service.url.documents}")
	private String documentsURL;

	@Value("${service.url.commons}")
	private String commonsURL;
	
	public String getDocumentsURL() {
		return documentsURL;
	}

	public String getCommonsURL() {
		return commonsURL;
	}
	
}
