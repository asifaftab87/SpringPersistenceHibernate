package org.liferayasif.backend.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.liferayasif.backend.constants.PathConstants;
import org.liferayasif.backend.model.Movie;
import org.liferayasif.backend.model.MovieAddress;
import org.liferayasif.backend.service.MovieAddressService;
import org.liferayasif.backend.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public Movie findById(@RequestParam("id") int id) throws Exception{
		
		Movie movie = movieService.getMovieById(id);
		
		List<MovieAddress> movieAddressList = new ArrayList<MovieAddress>();
		 
		
		if(movie != null){
			movieAddressList = movieAddressService.getMovieAddressByMovieId(id);		
			movie.setMovieAddressList(movieAddressList);
		} 
		else {
			throw new Exception("There is no list");
		}
		return movie;
	}


	
}
