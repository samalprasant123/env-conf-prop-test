package com.prasant.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		EnvProfiles envProfiles = (EnvProfiles) context.getBean("envProfiles");
		
		System.out.println(envProfiles.getProfileName());
		
		context.close();
	}

}
