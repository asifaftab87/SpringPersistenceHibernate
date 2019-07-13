package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.WorkerDao;
import org.liferayasif.backend.model.Worker;
import org.springframework.stereotype.Repository;

@Repository("WorkerDao")
public class WorkerDaoImpl extends AbstractDao<Integer , Worker> implements WorkerDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Worker> getAllWorkers() {
		Criteria criteria=createEntityCriteria();
		return criteria.list();
	}

	@Override
	public Worker findWorkerById(Integer id) {
		return getByKey(id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Worker> getWorkerByName(String name) {
		Criteria criteria  =getSession().createCriteria(Worker.class);					
		criteria.add(Restrictions.eqProperty(name, name));					
		List<Worker> workerList=criteria.list();					
		return workerList;					

	}

	@Override
	public Worker addWorker(Worker worker) {
		persist(worker);	
		return worker;	

	}

	@Override
	public Worker updateWorker(Worker worker) {
		getSession().update(worker);			
		return worker;			

	}

	@Override
	public void deleteWorkerById(Integer id) {
		Query query = getSession().createSQLQuery("delete from Worker where id:id");							
		query.setInteger("id", id);							
		query.executeUpdate();							

	}

	@Override
	public void deleteByAnnualIncome(double yearlyIncome) {
		Query query = getSession().createSQLQuery("delete from Worker where yearlyIncome:yearlyIncome");									
		query.setDouble("yearlyIncome", yearlyIncome);									
		query.executeUpdate();									

	}

}
