package com.cpulover.springrest.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// reference to Spring Config
		return new Class[] { AppConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		//map to root path
		return new String[] { "/" }; 
	}

}
