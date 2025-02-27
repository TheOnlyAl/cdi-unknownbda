package de.adtelligence.payara.ejb;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.validation.constraints.NotNull;

@Stateless
@LocalBean
public class LocalServiceBean {

	public String saySomething(@NotNull String something) {
		return "Hello World: " + something;
	}
}
