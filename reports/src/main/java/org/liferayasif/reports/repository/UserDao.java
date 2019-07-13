package org.liferayasif.reports.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Repository;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

@Repository
public class UserDao {

	@Autowired
	private ResourceLoader resourceLoader; 
	
	public JasperPrint get() {
		
		//Resource resource = new ClassPathResource("android.png");
		JasperPrint print = null;
		try {
			resourceLoader = new DefaultResourceLoader();
			//ClassPathResource reportResource = new ClassPathResource("reports/first.jrxml");
			
			String path = resourceLoader.getResource("classpath:reports/first.jrxml").getURI().getPath();
			System.out.println(path);
			
			JasperReport jasperReport = JasperCompileManager.compileReport(path);
			Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("cmpny_name", "best");
			parameters.put("passport", "h8591287");
			parameters.put("pageTitle", "Title of page");
			parameters.put("school_name", "mdjan");
			
			print = JasperFillManager.fillReport(jasperReport, parameters);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return print;
	}
}
