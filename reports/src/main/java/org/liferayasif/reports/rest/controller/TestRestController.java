package org.liferayasif.reports.rest.controller;

import org.liferayasif.reports.model.Report;
import org.liferayasif.reports.repository.UserDao;
import org.liferayasif.reports.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;

@RestController
public class TestRestController {

	@Autowired
	private UserService userService;
	
	public JasperPrint test() {
		UserDao obj = new UserDao();
		return obj.get();
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public Report generateReport() throws JRException {
		return userService.generateReport();
	}
	
}
