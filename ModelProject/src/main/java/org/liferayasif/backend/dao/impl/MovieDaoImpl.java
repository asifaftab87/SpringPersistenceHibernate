package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.MovieDao;
import org.liferayasif.backend.model.Movie;
import org.springframework.stereotype.Repository;

@Repository("movieDao")
public class MovieDaoImpl extends AbstractDao<Integer , Movie> implements MovieDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Movie> getAllMovies() {
		Criteria criteria = createEntityCriteria();
		return (List<Movie>) criteria.list();
		
	}

	@Override
	public Movie getMovieById(Integer id) {
		
		return getByKey(id);
	}

	@Override
	public void addMovie(Movie movie) {
		persist(movie);
		
	}

	@Override
	public void deleteMovie(Integer id) {
		Query query = getSession().createSQLQuery("delete from movie where is = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	@Override
	public Movie updateMovie(Movie movie) {
		getSession().update(movie);
		return movie;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Movie> findByName(String name) {
		Criteria criteria = getSession().createCriteria(Movie.class);
		criteria.add(Restrictions.eq("name", name));
		List<Movie> movieList = criteria.list();
		return movieList;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Movie> searchMovie(String email, String name) {
		Criteria criteria = getSession().createCriteria(Movie.class);
		Criterion cr1 = Restrictions.eq("name", name);
		Criterion cr2 = Restrictions.eq("email", email);
		criteria.add(Restrictions.or(cr1, cr2));

		List<Movie> movieList = criteria.list();
		return movieList;
	}
	
	

}
