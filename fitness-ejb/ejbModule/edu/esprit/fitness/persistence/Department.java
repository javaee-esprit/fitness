package edu.esprit.fitness.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name = "t_department" )
public class Department implements Serializable{
	
	private int id;
	private String name;
	
	private List<Employee> employees;
	
	public Department() {
	}

	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany( mappedBy = "department")
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
