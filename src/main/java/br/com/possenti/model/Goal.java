package br.com.possenti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "goal")
public class Goal {
	
	public Goal(){
	}
	
	
	public Goal(String name, String description){
	    this.name = name;
	    this.description = description;
	}
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int  id;
	private String name;
	private String description;
	
	public int  getId() {
		return id;
	}

	public void setId(int  id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}
