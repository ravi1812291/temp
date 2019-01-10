package com.mb11.application.model.cricapidata;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MTeam")
public class MTeam {
	
	@Id
	@GeneratedValue
	Long ID;
	
	@Column(nullable = false,unique = true)
	String teamname;
	
	
	@Column(nullable = false)
	Sporttype sporttype;
	
	public MTeam() {
	
		
	}
	
	public MTeam(String teamname, Sporttype sporttype) {
		super();
		
		this.teamname = teamname;
		this.sporttype = sporttype;
	}
	
	public MTeam(Long iD, String teamname, Sporttype sporttype) {
		super();
		ID = iD;
		this.teamname = teamname;
		this.sporttype = sporttype;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public Sporttype getSporttype() {
		return sporttype;
	}

	public void setSporttype(Sporttype sporttype) {
		this.sporttype = sporttype;
	}
	
	
	
	
	  

}
