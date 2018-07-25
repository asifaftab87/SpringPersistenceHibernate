package org.liferayasif.front.config;

import org.liferayasif.front.config.web.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

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
		 return new Class<?>[] {WebConfig.class};
	 }

}
