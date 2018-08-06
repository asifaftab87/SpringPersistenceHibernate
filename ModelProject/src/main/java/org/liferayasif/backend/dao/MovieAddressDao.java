package org.liferayasif.backend.dao;

import java.util.List;

import org.liferayasif.backend.model.MovieAddress;

public interface MovieAddressDao {
	
	public List<MovieAddress> getAllMovieAddresses();
	
	public MovieAddress getMovieAddressById(Integer id);
	
	public void addMovieAddress(MovieAddress movieAddress);
	
	public void deleteMovieAddress(Integer id);
	
	public MovieAddress updateMovieAddress(MovieAddress movieAddress);
	
	public List<MovieAddress> getMovieAddressByMovieId(Integer id);
}
