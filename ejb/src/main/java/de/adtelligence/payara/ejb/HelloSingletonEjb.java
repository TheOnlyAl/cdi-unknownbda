package de.adtelligence.payara.ejb;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;

@Startup
@Singleton
public class HelloSingletonEjb {

	@PostConstruct
	public void postConstruct() {
		System.out.println("Hello to the log");
	}
}