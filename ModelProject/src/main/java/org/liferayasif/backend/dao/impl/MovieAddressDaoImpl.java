package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.MovieAddressDao;
import org.liferayasif.backend.model.MovieAddress;
import org.springframework.stereotype.Repository;

@Repository("movieAddressDao")
public class MovieAddressDaoImpl extends AbstractDao<Integer , MovieAddress> implements MovieAddressDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<MovieAddress> getAllMovieAddresses() {
		Criteria criteria = createEntityCriteria();
		return (List<MovieAddress>) criteria.list();
	}

	@Override
	public MovieAddress getMovieAddressById(Integer id) {
		return getByKey(id);
		
	}

	@Override
	public MovieAddress addMovieAddress(MovieAddress movieAddress) {
		persist(movieAddress);
		return movieAddress;
		
	}

	@Override
	public void deleteMovieAddress(Integer id) {
		Query query = getSession().createSQLQuery("delete from MovieAddress where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	@Override
	public MovieAddress updateMovieAddress(MovieAddress movieAddress) {
		getSession().update(movieAddress);
		return movieAddress;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MovieAddress> getMovieAddressByMovieId(Integer id) {
		
		Criteria criteria = getSession().createCriteria(MovieAddress.class);
		criteria.add(Restrictions.eq("movieId", id));
		
		List<MovieAddress> movieAddressList = criteria.list();
		
		return movieAddressList;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<MovieAddress> searchMovie(Integer movieId, String city, String country) {
		Criteria criteria = getSession().createCriteria(MovieAddress.class);
		Criterion cr1 = Restrictions.eq("movieId", movieId);
		Criterion cr2 = Restrictions.eq("city", city);
		Criterion cr3 = Restrictions.eq("country", country);
		criteria.add(Restrictions.or(cr1,cr2,cr3));
		
		List<MovieAddress> movieAddessList = criteria.list();
		return movieAddessList;
	}

}
