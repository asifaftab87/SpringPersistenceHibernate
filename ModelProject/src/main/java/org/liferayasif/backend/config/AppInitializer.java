package org.liferayasif.backend.config;

import org.liferayasif.backend.config.rest.RestConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	 protected String[] getServletMappings(){
		 return new String[]{"/"};
	 }
	 
	 @Override
	 protected Class<?>[] getRootConfigClasses(){
		 //return new Class<?>[] {RootConfig.class};
		 return null;
	 }
	 
	 @Override
	 protected Class<?>[] getServletConfigClasses(){
		 return new Class<?>[] {RestConfig.class};
	 }
	 
}
