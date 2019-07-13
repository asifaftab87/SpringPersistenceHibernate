package org.liferayasif.reports.service;

import org.liferayasif.reports.model.Report;
import org.liferayasif.reports.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public JasperPrint get() {
		return userDao.get();
	}
	
	public Report generateReport() throws JRException {
		
		JasperPrint print = userDao.get();
		
		byte[] content = null;
		
		Report report = new Report();
		
		if(print!=null) {
			content = JasperExportManager.exportReportToPdf(print);
			
			if(content!=null) {
				
				report.setFileName("first");
				report.setReportType("pdf");
			    report.setMimeType("application/pdf");
			    report.setReportBytes(content);
			}
		}
		return report;
	}
}
