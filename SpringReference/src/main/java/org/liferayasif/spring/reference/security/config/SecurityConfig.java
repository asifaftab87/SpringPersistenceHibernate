package org.liferayasif.spring.reference.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/*
 * The configuration creates a Servlet Filter known as the springSecurityFilterChain
 * which is responsible for all the security (protecting the application URLs, 
 * validating submitted username and passwords, redirecting to the log in form, etc)
 * within your application.
 * 
 * However, it is important to only configure AuthenticationManagerBuilder in a class annotated 
 * with either @EnableWebSecurity, @EnableGlobalMethodSecurity, or @EnableGlobalAuthentication.
 */

//@EnableWebSecurity
public class SecurityConfig{// extends WebSecurityConfigurerAdapter{

/*	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		
		auth
			.inMemoryAuthentication()
				.withUser("user").password("password").roles("USER");
	}*/
}
