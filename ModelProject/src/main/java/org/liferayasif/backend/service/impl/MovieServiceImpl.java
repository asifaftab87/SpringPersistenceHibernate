package org.liferayasif.backend.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.liferayasif.backend.dao.MovieDao;
import org.liferayasif.backend.model.Movie;
import org.liferayasif.backend.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("movieService")
@Transactional
public class MovieServiceImpl implements MovieService{

	@Autowired
	private MovieDao movieDao;
	
	@Override
	public List<Movie> getAllMovies() {
		List<Movie> movieList = movieDao.getAllMovies();
		return movieList;
	}

	@Override
	public Movie getMovieById(Integer id) {
		Movie movie = movieDao.getMovieById(id);
		return movie;
	}

	@Override
	public Movie addMovie(Movie movie) {
		movieDao.addMovie(movie);
		return movie;
		
	}

	@Override
	public void deleteMovie(Integer id) {
		movieDao.deleteMovie(id);
		
	}

	@Override
	public Movie updateMovie(Movie movie) {
		return movieDao.updateMovie(movie);
	}

	@Override
	public List<Movie> findByName(String name) {
		return movieDao.findByName(name);
		
	}

	@Override
	public List<Movie> searchMovie(String email, String name) {
		List<Movie> movieList = movieDao.searchMovie(email, name);
		return movieList;
	}

}
