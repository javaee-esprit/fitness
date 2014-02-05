package edu.esprit.fitness.persistence;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Team
 *
 */
@Entity
@Table(name="t_team")

public class Team implements Serializable {

	
	private int id;
	private String name;
	private static final long serialVersionUID = 1L;

	public Team() {
	}   
	
	
	public Team(int id, String name) {
		this.id = id;
		this.name = name;
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
	
	
	public String toString() {
		return "Team [id=" + id + ", name=" + name + "]";
	}
   
}
