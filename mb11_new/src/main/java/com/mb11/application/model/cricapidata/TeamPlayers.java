package com.mb11.application.model.cricapidata;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class TeamPlayers.
 */
@Entity
@Table(name="TeamPlayers")
public class TeamPlayers {
	
	/** The id. */
	@Id
	@GeneratedValue
	private Long ID;
	
	/** The firstname. */
	@Column(nullable = false,length=30)
	private String firstname;
	
	/** The middlename. */
	@Column(length=30)
	private String middlename;
	
	/** The lastname. */
	@Column(nullable = false,length=30)
	private String lastname;
	
	/** The m team. */
	
	@Column(name="m_team")
	@OneToMany(mappedBy="series")
	private List<MTeam> mTeam=new ArrayList<>();
	
	@ManyToMany(mappedBy="teamPlayers")
	@Column(nullable = false)
	private  List<Series> series=new ArrayList<>();
	
	/**
	 * Instantiates a new team players.
	 */
	public TeamPlayers()
	{
		
	}

	public TeamPlayers(String firstname, String middlename, String lastname, List<MTeam> mTeam, List<Series> series) {
		super();
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.mTeam = mTeam;
		this.series = series;
	}

	public TeamPlayers(Long iD, String firstname, String middlename, String lastname, List<MTeam> mTeam,
			List<Series> series) {
		super();
		ID = iD;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.mTeam = mTeam;
		this.series = series;
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

	public List<Series> getSeries() {
		return series;
	}

	public void setSeries(List<Series> series) {
		this.series = series;
	}



	
}
