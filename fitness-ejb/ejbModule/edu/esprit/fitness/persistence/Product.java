package edu.esprit.fitness.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Product
 *
 */
@Entity
@Table(name="t_product")

public class Product implements Serializable {

	
	private int id;
	private String name;
	private double unitCost;
	private static final long serialVersionUID = 1L;

	public Product() {
		super();
	}
	
	public Product(int id, String name, double unitCost) {
		super();
		this.id = id;
		this.name = name;
		this.unitCost = unitCost;
	}
	
	
	@Id
	public int getId() {
		return this.id;
	}




	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	@Column(name="unit_cost")
	public double getUnitCost() {
		return this.unitCost;
	}

	public void setUnitCost(double unitCost) {
		this.unitCost = unitCost;
	}

	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", unitCost="
				+ unitCost + "]";
	}
	
	
   
}
