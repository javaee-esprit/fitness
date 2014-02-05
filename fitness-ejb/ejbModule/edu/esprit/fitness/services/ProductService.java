package edu.esprit.fitness.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.esprit.fitness.persistence.Product;

@Stateless
public class ProductService implements ProductServiceRemote, ProductServiceLocal {

	@PersistenceContext
	private EntityManager em;
	
    public ProductService() {
    }

	public void createProduct(Product product) {
		em.persist(product);
	}

	public void updateProduct(Product product) {
		em.merge(product);
	}

	public Product findProductById(int id) {
		return em.find(Product.class, id);
	}

	public void deleleProduct(Product product) {
		em.remove(em.merge(product));
	}

	public List<Product> findAllProducts() {
		List<Product> products = null;
		String jpql = "select p from Product p";
		Query query = em.createQuery(jpql);
		products = query.getResultList();
		return products;
	}

}
