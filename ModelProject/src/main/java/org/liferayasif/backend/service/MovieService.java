package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.Movie;

public interface MovieService {

	public List<Movie> getAllMovies();
	
	public Movie getMovieById(Integer id);
	
	public Movie addMovie(Movie movie);
	
	public void deleteMovie(Integer id);
	
	public Movie updateMovie(Movie movie);
	
	public List<Movie> findByName(String name);

	public List<Movie> searchMovie(String email, String name);

	
}
