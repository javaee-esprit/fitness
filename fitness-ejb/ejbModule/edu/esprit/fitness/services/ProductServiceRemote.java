package edu.esprit.fitness.services;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.fitness.persistence.Product;



@Remote
public interface ProductServiceRemote {
	
	void createProduct(Product product);
	Product findProductById(int id);
	void updateProduct(Product product);
	void deleleProduct(Product product);
	List<Product> findAllProducts();
	

}
