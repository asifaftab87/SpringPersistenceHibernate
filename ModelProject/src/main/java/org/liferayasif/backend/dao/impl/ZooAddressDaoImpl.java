package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.ZooAddressDao;
import org.liferayasif.backend.model.ZooAddress;
import org.springframework.stereotype.Repository;

@Repository("ZooAddressDao")
public class ZooAddressDaoImpl extends AbstractDao<Integer, ZooAddress> implements ZooAddressDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<ZooAddress> getAllZooAddresses(){
		Criteria criteria = createEntityCriteria();
		return (List<ZooAddress>) criteria.list();
	}

	@Override
	public ZooAddress getZooAddressbyId(Integer id) {
		return getByKey(id);
		
	}

	@Override
	public void addZooAddress(ZooAddress zooAddress) {
		persist(zooAddress);
		
	}

	@Override
	public void deleteZooAddressById(Integer id) {
		Query query  = getSession().createSQLQuery("delete from ZooAddress where id= : id");
		query.setInteger("id", id);
		query.executeUpdate();
		
		
	}

	@Override
	public ZooAddress updateZooAddress(ZooAddress zooAddress) {
		getSession().update(zooAddress);
		return zooAddress;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ZooAddress> getZooAddressByZooId(Integer id) {
		
			Criteria criteria = getSession().createCriteria(ZooAddress.class);
			criteria.add(Restrictions.eq("id" , id));
			List<ZooAddress> zooAddressList = criteria.list();
			return zooAddressList;
		}


	

	

}
