package org.liferayasif.backend.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.liferayasif.backend.dao.CategoryDao;
import org.liferayasif.backend.model.Category;
import org.liferayasif.backend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("categoryService")
@Transactional
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	public List<Category> getAllCategories() {
		List<Category> categoryList = categoryDao.getAllCategories();
		return categoryList;
	}

	@Override
	public Category getCategoryById(Integer id) {
		Category category= categoryDao.getCategoryById(id);
		return category;
	}

	
	@Override
	public Category addCategory(Category category) {
		return categoryDao.addCategory(category);
		   
	}
	
	@Override
	public void deleteCategory(Integer id) {
		categoryDao.deleteCategory(id);
		
	}

	@Override
	public Category updateCategory(Category category) {
		return categoryDao.updateCategory(category);
	}

	@Override
	public List<Category> findByCategoryName(String name) {
		return categoryDao.findByCategoryName(name);
	}

	

}
