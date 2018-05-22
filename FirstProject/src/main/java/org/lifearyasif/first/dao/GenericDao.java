package org.lifearyasif.first.dao;

import java.util.List;

import org.lifearyasif.first.base.DomainObject;

public interface GenericDao <T extends DomainObject>{

	public T get(Long id);
	public List<T> getAll();
	public void save(T object);
	public void delete(T object);
	
}
