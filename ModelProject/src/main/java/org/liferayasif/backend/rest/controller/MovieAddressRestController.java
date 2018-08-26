package org.liferayasif.backend.rest.controller;

import java.util.List;

import org.liferayasif.backend.constants.PathConstants;
import org.liferayasif.backend.model.Movie;
import org.liferayasif.backend.model.MovieAddress;
import org.liferayasif.backend.service.MovieAddressService;
import org.liferayasif.backend.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = PathConstants.MOVIEADDRESS)
public class MovieAddressRestController {
	
	@Autowired
	private MovieService movieService;
	
	@Autowired
	private MovieAddressService movieAddressService;
	
	@RequestMapping(value=PathConstants.FIND_BY_MOVIE_ID)
	public List<MovieAddress> findById(@RequestParam("id") int id) throws Exception{
		
		Movie movie = movieService.getMovieById(id);
		 		
		if(movie == null){
			
			throw new Exception("The id "+id+" does not exist");			
		} 
		
		List<MovieAddress> movieAddressList = movieAddressService.getMovieAddressByMovieId(id);		
		return movieAddressList;
	}

	@RequestMapping(value=PathConstants.ADD_USER, method=RequestMethod.POST)
	public Movie addMovie(@RequestBody Movie movie){
		
		movie = movieService.addMovie(movie);
		
		List<MovieAddress> movieAddressList = movie.getMovieAddressList();
		
		if(movieAddressList != null){
			for(MovieAddress movieAddress : movieAddressList){
				movieAddress.setMovieId(movie.getId());
			}
			
			movieAddressService.addMovieAddressList(movieAddressList);
		}
		
		return movie;
	}
	
	@RequestMapping(value = PathConstants.SEARCH_BY_ID_CITY_COUNTRY)
	public List<MovieAddress> searchComp(@RequestParam(value="movieId",  required = false) int movieId , @RequestParam(value="city",  required = false) String city, @RequestParam(value="country",  required = false) String country    ) throws Exception
	{
		 
					
		List<MovieAddress> movieAddressList = movieAddressService.searchCompany(movieId, city, country);
		
		if(movieAddressList==null || movieAddressList.isEmpty())
		{
			throw new Exception("none of the criteria match......!!! no result found"+movieId+" : "+city+"  : "+country);
		} 
		
		return movieAddressList;
	}
	
}
