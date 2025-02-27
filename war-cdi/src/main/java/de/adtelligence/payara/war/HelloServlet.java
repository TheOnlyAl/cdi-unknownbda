package de.adtelligence.payara.war;

import java.io.IOException;

import de.adtelligence.payara.ejb.LocalServiceBean;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Stateless
@WebServlet(urlPatterns = "/")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Inject
	private LocalServiceBean bean;

	@Override
	protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
			throws ServletException, IOException {
		resp.getWriter()
			.println(bean.saySomething("Abc"));
	}
}
