package org.liferayasif.commons;

import org.liferayasif.commons.client.DocumentsClient;
import org.liferayasif.commons.client.NotificationsClient;
import org.liferayasif.commons.client.ReportsClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CommonsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonsApplication.class, args);
	}

	@Bean
	protected ReportsClient reportsClient() {
		return new ReportsClient();
	}
	
	@Bean
	protected DocumentsClient documentsClient() {
		return new DocumentsClient();
	}
	
	@Bean
	protected NotificationsClient notificationsClient() {
		return new NotificationsClient();
	}
}
