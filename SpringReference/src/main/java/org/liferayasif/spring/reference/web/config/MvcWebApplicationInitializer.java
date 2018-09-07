package org.liferayasif.spring.reference.web.config;

import org.liferayasif.spring.reference.security.config.SecurityConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MvcWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected String[] getServletMappings(){
		return new String[]{"/"};
	}
 
	@Override
	protected Class<?>[] getRootConfigClasses(){
		return new Class<?>[] {SecurityConfig.class};
	}
 
	@Override
	protected Class<?>[] getServletConfigClasses(){
		return new Class<?>[] {WebConfig.class};
	}
	 
}
