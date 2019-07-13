package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.NgoDao;
import org.liferayasif.backend.model.Ngo;
import org.springframework.stereotype.Repository;

@Repository("NgoDao")
public class NgoDaoImpl extends AbstractDao<Integer , Ngo>implements NgoDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Ngo> getAllNgo() {
		Criteria criteria=createEntityCriteria();
		return criteria.list();
	}

	@Override
	public Ngo getNgoById(Integer id) {
		return getByKey(id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ngo> getNgoByState(String state) {
		Criteria criteria  =getSession().createCriteria(Ngo.class);
		criteria.add(Restrictions.eqProperty(state, state));
		List<Ngo> ngoList=criteria.list();
		return ngoList;
	}

	@Override
	public Ngo addNgo(Ngo ngo) {
		persist(ngo);
		return ngo;
	}
	
	@Override
	public Ngo updateNgo(Ngo ngo) {
		getSession().update(ngo);
		return ngo;
	}

	@Override
	public void deleteNgoById(Integer id) {
		Query query = getSession().createSQLQuery("delete from Ngo where id:id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	@Override
	public void deleteByyearlyIncome(double yearlyIncome) {
		Query query = getSession().createSQLQuery("delete from Ngo where yearlyIncome:yearlyIncome");
		query.setDouble("yearlyIncome", yearlyIncome);
		query.executeUpdate();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ngo> getByEmail(String emailAddress) {
		Criteria criteria  =getSession().createCriteria(Ngo.class);
		criteria.add(Restrictions.eqProperty(emailAddress, emailAddress));
		List<Ngo> ngoList=criteria.list();
		return ngoList;
	}

	@Override
	public void deleteEmail(String emailAddress) {
		Query query = getSession().createSQLQuery("delete from Ngo where emailAddress:emailAddress");
		query.setString("emailAddress", emailAddress);
		query.executeUpdate();
		
	}

	

}
