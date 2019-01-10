package com.mb11.application.model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Roles")
public class Roles {
	
	@Id
	@GeneratedValue
	private Long ID;
	
	@Column(nullable=false,unique=true)
	private String name;
	
	

	public Roles() {
		
	}
	
	public Roles(String name) {
		super();
		
		this.name = name;
	}
	
	
	public Roles(Long iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}
	
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	


}
