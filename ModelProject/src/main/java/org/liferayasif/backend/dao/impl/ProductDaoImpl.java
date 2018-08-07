package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.ProductDao;
import org.liferayasif.backend.model.Product;
import org.springframework.stereotype.Repository;

@Repository("ProductDao")
public class ProductDaoImpl extends AbstractDao<Integer , Product> implements ProductDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProducts() {
		Criteria criteria = createEntityCriteria();
		return(List<Product>) criteria.list();
	
	}

	@Override
	public Product getProductById(Integer id) {
		
		return getByKey(id);
	}

	@Override
	public Product addProduct(Product product) {
		persist(product);
		return product;
		
	}

	@Override
	public void deleteProductById(Integer id) {
		Query query = getSession().createSQLQuery("delete from product where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	@Override
	public Product updateProduct(Product product) {
		getSession().update(product);
		return product;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> findByName(String name) {
		Criteria criteria = getSession().createCriteria(Product.class);
		criteria.add(Restrictions.eq("name" , name));
		
		List<Product> productList = criteria.list();
		return productList;
	}

	
}
