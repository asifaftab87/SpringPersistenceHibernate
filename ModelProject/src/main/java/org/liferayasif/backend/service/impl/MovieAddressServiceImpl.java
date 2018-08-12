package org.liferayasif.backend.service.impl;

import java.util.List;

import org.liferayasif.backend.dao.MovieAddressDao;
import org.liferayasif.backend.model.MovieAddress;
import org.liferayasif.backend.service.MovieAddressService;
import org.liferayasif.backend.util.time.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("movieAddressService")
@Transactional
public class MovieAddressServiceImpl  implements MovieAddressService{

	@Autowired
	private MovieAddressDao movieAddressDao;
	
	@Override
	public List<MovieAddress> getAllMovieAddress() {
		List<MovieAddress> movieAddressList = movieAddressDao.getAllMovieAddresses();
		return movieAddressList;
	}

	@Override
	public MovieAddress getMovieAddressById(Integer id) {
		MovieAddress movieAddress = movieAddressDao.getMovieAddressById(id);
		return movieAddress;
	}

	@Override
	public MovieAddress addMovieAddress(MovieAddress movieAddress) {
		
		movieAddress.setCreateDt(TimeUtil.getSqlTimStmp());
		movieAddress.setUpdateDt(TimeUtil.getSqlTimStmp());
		
		return movieAddressDao.addMovieAddress(movieAddress);
	}

	@Override
	public List<MovieAddress> addMovieAddressList(List<MovieAddress> movieAddressList){
	
		if(movieAddressList != null && movieAddressList.size()>0){
			
			for(MovieAddress movieAddress : movieAddressList){
				addMovieAddress(movieAddress);
			}
		}
		
		return movieAddressList;
	}

	
	@Override
	public void deleteMovieAddress(Integer id) {
		movieAddressDao.deleteMovieAddress(id);
	}

	@Override
	public MovieAddress updateMovieAddress(MovieAddress movieAddress) {
		return movieAddressDao.updateMovieAddress(movieAddress);
	}
	
	public List<MovieAddress> getMovieAddressByMovieId(Integer id){
		List<MovieAddress> movieAddressList = movieAddressDao.getMovieAddressByMovieId(id);
		return movieAddressList;
	}

}
