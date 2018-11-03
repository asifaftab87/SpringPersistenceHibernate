package org.liferayasif.backend.dao.impl;

import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.Query;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.BestDao;
import org.liferayasif.backend.model.Best;
import org.springframework.stereotype.Repository;

@Repository("Best")
public class BestIDaompl extends AbstractDao<Integer , Best> implements BestDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Best> getAllBest() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	public Best findById(Integer id)
	{
		return getByKey(id);
	}
	
	@Override
	public Best findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Best updateBest(Best best) {
		getSession().update(best);
		return best;
	}

	@Override
	public Best addBest(Best best) {
		persist(best);
		return best;
	}

	@Override
	public void deleteByEmail(String email) {
		Query query = getSession().createSQLQuery("delete from best where email:email");
		query.setString("email", email);
		query.executeUpdate();

	}

	

	
	@Override
	public void deleteById(Integer id) {
	Query query = getSession().createSQLQuery("delete from Best where id:id");
	query.setInteger("id", id);
	query.executeUpdate();
		
	}

	
	

}
