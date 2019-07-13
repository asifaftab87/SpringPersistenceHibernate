package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.MovieAddress;

public interface MovieAddressService {
	
	public List<MovieAddress> getAllMovieAddress();
	
	public MovieAddress getMovieAddressById(Integer id);
	
	public MovieAddress addMovieAddress(MovieAddress movieAddress);
	
	public List<MovieAddress> addMovieAddressList(List<MovieAddress> movieAddressList);
	
	public void deleteMovieAddress(Integer id);
	
	public MovieAddress updateMovieAddress(MovieAddress movieAddress);
	
	public List<MovieAddress> getMovieAddressByMovieId(Integer id);
	
	public List<MovieAddress> searchCompany(Integer movieId , String city , String country);

}
