package org.lifearyasif.first.service.impl;

import org.lifearyasif.first.model.User;
import org.lifearyasif.first.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("basicAuthHandler")
public class AuthenticationServiceImpl implements AuthenticationService{

	public User authenticateUser(String username, String password){
		
		return new User();
	}
}
