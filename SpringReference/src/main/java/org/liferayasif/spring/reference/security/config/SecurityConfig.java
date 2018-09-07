package org.liferayasif.spring.reference.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/*
 * The configuration creates a Servlet Filter known as the springSecurityFilterChain
 * which is responsible for all the security (protecting the application URLs, 
 * validating submitted username and passwords, redirecting to the log in form, etc)
 * within your application.
 * 
 * However, it is important to only configure AuthenticationManagerBuilder in a class annotated 
 * with either @EnableWebSecurity, @EnableGlobalMethodSecurity, or @EnableGlobalAuthentication.
 */

@EnableWebSecurity
public class SecurityConfig extends AbstractSecurityWebApplicationInitializer{

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.inMemoryAuthentication()
		.withUser("test").password("test").roles("USER");
	}
	
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
			.anyRequest().authenticated()
			.and()
			.formLogin()
			.loginPage("/login.jsp")
			.permitAll();
	}
}


/*
 * If we are not using Spring or Spring MVC, we will need to pass in the SecurityConfig into the
 * superclass to ensure the configuration is picked up.

public class SecurityWebApplicationInitializer 	extends AbstractSecurityWebApplicationInitializer {
	
	public SecurityWebApplicationInitializer() {
		super(SecurityConfig.class);
	}
		
}
*/