package org.lifearyasif.first.model;

import java.io.Serializable;

import org.lifearyasif.first.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private AuthenticationService authHandler;
	private String username;
	private String password;
	
	public User(){}
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public AuthenticationService getAuthHandler() {
		return authHandler;
	}

	@Autowired
	@Qualifier("basicAuthHandler")
	public void setAuthHandler(AuthenticationService authHandler) {
		this.authHandler = authHandler;
	}
	
}
