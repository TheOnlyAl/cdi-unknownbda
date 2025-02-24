package de.adtelligence.payara.jar;

import java.time.LocalDateTime;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloWorldBean {

	public String saySomething() {
		return "Hello World " + LocalDateTime.now();
	}
}