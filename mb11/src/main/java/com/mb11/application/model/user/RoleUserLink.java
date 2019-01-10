package com.mb11.application.model.user;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="RoleUserLink")
public class RoleUserLink {
	
	@Id
	@GeneratedValue
	private Long ID;
	
	@Column(nullable=false)
	@OneToMany
	private List<Users> userid=new ArrayList<>();
	
	@Column(nullable=false)
	@OneToMany
	private List<Roles> roleid=new ArrayList<>();
	 
	public RoleUserLink(){
		 
	 }
	
	public RoleUserLink(List<Users> userid, List<Roles> roleid) {
		super();
		
		this.userid = userid;
		this.roleid = roleid;
	}

	public RoleUserLink(Long iD, List<Users> userid, List<Roles> roleid) {
		super();
		ID = iD;
		this.userid = userid;
		this.roleid = roleid;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public List<Users> getUserid() {
		return userid;
	}

	public void setUserid(List<Users> userid) {
		this.userid = userid;
	}

	public List<Roles> getRoleid() {
		return roleid;
	}

	public void setRoleid(List<Roles> roleid) {
		this.roleid = roleid;
	}

	
	
	
	

}
