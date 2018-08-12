package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
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

}
