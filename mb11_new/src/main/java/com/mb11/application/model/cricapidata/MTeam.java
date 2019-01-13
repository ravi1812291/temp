package com.mb11.application.model.cricapidata;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class MTeam.
 */
@Entity
@Table(name="MTeam")
public class MTeam {
	
	/** The id. */
	@Id
	@GeneratedValue
	Long ID;
	
	/** The teamname. */
	@Column(nullable = false,unique = true)
	String teamname;
	
	
	/** The sporttype. */
	@Column(nullable = false)
	Sporttype sporttype;
	
	
	@ManyToMany(mappedBy="mTeam")
	@Column(nullable = false)
	private  List<Series> series=new ArrayList<>();
	
	@Column(nullable = false)
	@OneToMany
	private List<TeamPlayers> teamPlayers=new ArrayList<>();
	
	/**
	 * Instantiates a new m team.
	 */
	public MTeam() {
	
		
	}
	
	

	public MTeam(String teamname, Sporttype sporttype, List<Series> series, List<TeamPlayers> teamPlayers) {
		super();
		this.teamname = teamname;
		this.sporttype = sporttype;
		this.series = series;
		this.teamPlayers = teamPlayers;
	}
	
	



	public MTeam(Long iD, String teamname, Sporttype sporttype, List<Series> series, List<TeamPlayers> teamPlayers) {
		super();
		ID = iD;
		this.teamname = teamname;
		this.sporttype = sporttype;
		this.series = series;
		this.teamPlayers = teamPlayers;
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

	public List<Series> getSeries() {
		return series;
	}

	public void setSeries(List<Series> series) {
		this.series = series;
	}

	public List<TeamPlayers> getTeamPlayers() {
		return teamPlayers;
	}

	public void setTeamPlayers(List<TeamPlayers> teamPlayers) {
		this.teamPlayers = teamPlayers;
	}

	
	
	
	  

}
