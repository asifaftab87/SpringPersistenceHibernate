package org.lifearyasif.first.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.lifearyasif.first.base.DomainObject;
import org.lifearyasif.first.dao.GenericDao;
import org.springframework.transaction.annotation.Transactional;

public class GenericDaoJpa <T extends DomainObject> implements GenericDao<T>{

	private Class<T> type;
	protected EntityManager entityManager;
	
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	
	public GenericDaoJpa(Class<T> type) {
		super();
		this.type = type;
	}
	
	@Override
	@Transactional(readOnly=true)
	public T get(Long id) {
		if (id == null) {
			return null;
		} 
		else {
			return entityManager.find(type, id);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	@Override
	public List<T> getAll() {
		return entityManager.createQuery("select o from " + type.getName() + "o").getResultList();
	}
	
	@Override
	public void save(T object) {
		entityManager.persist(object);
	}
	
	@Override
	public void delete(T object) {
		entityManager.remove(object);
	}

	
		
}
