package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.BuildingDao;
import org.liferayasif.backend.model.Building;
import org.liferayasif.backend.model.User;
import org.springframework.stereotype.Repository;

@Repository("buildingDao")
public class BuildingDaoImpl extends AbstractDao<Integer, Building> implements BuildingDao{

	@Override
	@SuppressWarnings("unchecked")
	public List<Building> getAllBuilding() {
		Criteria criteria = createEntityCriteria();
		return (List<Building>) criteria.list();
	}

	@Override
	public Building getBuildingById(Integer id) {
		return getByKey(id);
	}

	@Override
	public void addBuilding(Building building) {
		persist(building);
	}

	@Override
	public void deleteBuilding(Integer id) {
		Query query = getSession().createSQLQuery("delete from Employee where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	@Override
	public User updateBuilding(Building building) {
		return null;
	}
	
}
