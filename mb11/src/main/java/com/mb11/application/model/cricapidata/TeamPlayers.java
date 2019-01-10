package com.mb11.application.model.cricapidata;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TeamPlayers")
public class TeamPlayers {
	
	@Id
	@GeneratedValue
	private Long ID;
	
	@Column(nullable = false,length=30)
	private String firstname;
	
	@Column(length=30)
	private String middlename;
	
	@Column(nullable = false,length=30)
	private String lastname;
	
	@Column(nullable = false)
	@OneToMany
	private List<MTeam> mTeam=new ArrayList<>();
	
	public TeamPlayers()
	{
		
	}
	
	public TeamPlayers(String firstname, String middlename, String lastname, List<MTeam> mTeam) {
		super();
		
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.mTeam = mTeam;
	
	}

	public TeamPlayers(Long iD, String firstname, String middlename, String lastname, List<MTeam> mTeam) {
		super();
		ID = iD;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.mTeam = mTeam;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public List<MTeam> getmTeam() {
		return mTeam;
	}

	public void setmTeam(List<MTeam> mTeam) {
		this.mTeam = mTeam;
	}

	
	

	
}
