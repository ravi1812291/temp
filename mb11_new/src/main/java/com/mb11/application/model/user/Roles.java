package com.mb11.application.model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Roles.
 */
@Entity
@Table(name="Roles")
public class Roles {
	
	/** The id. */
	@Id
	@GeneratedValue
	private Long ID;
	
	/** The name. */
	@Column(nullable=false,unique=true)
	private String name;
	
	

	/**
	 * Instantiates a new roles.
	 */
	public Roles() {
		
	}
	
	/**
	 * Instantiates a new roles.
	 *
	 * @param name the name
	 */
	public Roles(String name) {
		super();
		
		this.name = name;
	}
	
	
	/**
	 * Instantiates a new roles.
	 *
	 * @param iD the i D
	 * @param name the name
	 */
	public Roles(Long iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getID() {
		return ID;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param iD the new id
	 */
	public void setID(Long iD) {
		ID = iD;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	


}
