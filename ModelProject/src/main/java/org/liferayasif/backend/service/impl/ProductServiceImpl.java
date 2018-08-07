package org.liferayasif.backend.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.liferayasif.backend.dao.ProductDao;
import org.liferayasif.backend.model.Product;
import org.liferayasif.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("ProductDao")
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	@Override
	public List<Product> getAllProducts() {
		List<Product> productList = productDao.getAllProducts();
		return productList;
	}

	@Override
	public Product getProductById(Integer id) {
		Product product = productDao.getProductById(id);
		return product;
	}

	@Override
	public Product addProduct(Product product) {
		return productDao.addProduct(product);
		
	}

	@Override
	public void deleteProductById(Integer id) {
		productDao.deleteProductById(id);
		
	}

	@Override
	public Product updateProduct(Product product) {
		return productDao.updateProduct(product);
 
	}

	@Override
	public List<Product> findByName(String name) {
		return productDao.findByName(name);
		 
	}
	
}
