package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.Category;



public interface CategoryService {
	
	public List<Category> getAllCategories();
	
	public Category getCategoryById(Integer id);
	
	public Category addCategory(Category category);
	
	public void deleteCategory(Integer id);
	
	public Category updateCategory(Category category);
	
	public List<Category> findByCategoryName(String name);

}
