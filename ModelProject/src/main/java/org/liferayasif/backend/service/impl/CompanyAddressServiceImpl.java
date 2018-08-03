package org.liferayasif.backend.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.liferayasif.backend.dao.CompanyAddressDao;
import org.liferayasif.backend.model.CompanyAddress;
import org.liferayasif.backend.service.CompanyAddressService;
import org.liferayasif.backend.util.time.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CompanyAddressService")
@Transactional
public class CompanyAddressServiceImpl implements CompanyAddressService {

	@Autowired
	private CompanyAddressDao companyAddressDao;
	
	@Override
	public List<CompanyAddress> getAllCompanyAddresses() {
		List<CompanyAddress> companyAddressList = companyAddressDao.getAllCompanyAddresses();
		return companyAddressList;
	}

	@Override
	public CompanyAddress getCompanyAddressById(Integer id) {
		CompanyAddress companyAddress = companyAddressDao.getCompanyAddressById(id);
		return companyAddress;
	}

	@Override
	public void addCompanyAddress(CompanyAddress companyAddress) {
		companyAddress.setCreateDt(TimeUtil.getSqlTimStmp());
		companyAddress.setUpdateDt(TimeUtil.getSqlTimStmp());
	}
	

	@Override
	public void addCompanyAddressList(List<CompanyAddress> companyAddressList) {
		if(companyAddressList !=null && companyAddressList.size()>0){
			
			for(CompanyAddress companyAddress : companyAddressList){
				addCompanyAddress(companyAddress);
				
			}
		}
		
	}

	@Override
	public void deleteCompanyAddress(Integer id) {
		companyAddressDao.deleteCompanyAddress(id);
		
	}

	@Override
	public CompanyAddress updateCompanyAddress(CompanyAddress companyAddress) {
		
		return companyAddressDao.updateCompanyAddress(companyAddress);
	}


	@Override
	public List<CompanyAddress> getCompanyAddressesByCompanyId(Integer id) {
		List<CompanyAddress> companyAddressList =companyAddressDao.getCompanyAddressByUserId(id);
		return companyAddressList;
	}

	

}
