package org.liferayasif.backend.dao.impl;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.CategoryDao;
import org.liferayasif.backend.model.Category;
import org.liferayasif.backend.model.Company;
import org.springframework.stereotype.Repository;

@Repository("CategoryDao")
public class CategoryDaoImpl extends AbstractDao<Integer , Category> implements CategoryDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Category> getAllCategories() {
		Criteria criteria = createEntityCriteria();
		return (List<Category>) criteria.list();
			
	}

	@Override
	public Category getCategoryById(Integer id) {
		
		return getByKey(id);
	}

	@Override
	public void addCategory(Category category) {
		persist(category);
		
	}

	@Override
	public void deleteCategory(Integer id) {
		Query query = getSession().createSQLQuery("Delete from Category where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	@Override
	public Category updateCategory(Category category) {
		getSession().update(category);
		return category;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Category> findByCategoryName(String name) {
		Criteria criteria = getSession().createCriteria(Category.class);
		criteria.add(Restrictions.eq("name", name));
		List<Category> categoryList = criteria.list();
		return categoryList;
	}

}
