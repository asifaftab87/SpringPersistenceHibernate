package org.liferayasif.backend.dao;

import java.util.List;

import org.liferayasif.backend.model.Category;

public interface CategoryDao {
	
	public List<Category> getAllCategories();
	
	public Category getCategoryById(Integer id);
	
	public void addCategory(Category category);
	
	public void deleteCategory(Integer id);
	
	public Category updateCategory(Category category);
	
	public List<Category> findByCategory(String name);

}
