package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.Product;

	public interface ProductService {
		
	public List<Product> getAllProducts();
	
	public Product getProductById(Integer id);
	
	public Product addProduct(Product product);
	
	public void deleteProductById(Integer id);
	
	public Product updateProduct(Product product);
	
	public List<Product> findByName(String name);

}
