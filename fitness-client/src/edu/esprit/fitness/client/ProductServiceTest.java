package edu.esprit.fitness.client;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.fitness.persistence.Product;
import edu.esprit.fitness.services.ProductServiceRemote;

public class ProductServiceTest {
	
	private static ProductServiceRemote remote;
	
	
	
	public static void main(String[] args) throws NamingException {
		
		Context ctx = new InitialContext();
		remote = (ProductServiceRemote) ctx.lookup("ejb:/fitness-ejb/ProductService!edu.esprit.fitness.services.ProductServiceRemote");
		
//		testCreateProduct();
//		testUpdateProduct();
//		testFindProduct();
//		testFindAll();
//		testDeleteProduct();
	}



	public static void testDeleteProduct() {
		Product product = new Product();
		product.setId(1);
		remote.deleleProduct(product);
	}



	public static void testFindAll() {
		List<Product> products  = null;
		products = remote.findAllProducts();
		for(Product p:products)
			System.out.println(p);
	}



	public static void testFindProduct() {
		Product found = null;
		found = remote.findProductById(3);
		System.out.println(found);
	}



	public static void testCreateProduct() {
		Product product = new Product();
		product.setId(3);
		product.setName("Samsung S4");
		product.setUnitCost(1.350);
		remote.createProduct(product);
	}
	
	public static void testUpdateProduct() {
		Product product = new Product();
		product.setId(2);
		product.setName("iPhone");
		product.setUnitCost(1600);
		remote.updateProduct(product);
	}
	
	

}
