package com.waiyanhtet.assignment.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class SpringContainerManager implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Initialized IOC container");
		
		//Add IOC container to application scope
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Closed IOC container");
	}
}
