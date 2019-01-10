package com.mb11.application.model.cricapidata;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="SeriesTeamPlayer")
public class SeriesTeamPlayer {
	
	@Id
	@GeneratedValue
	private Long ID;
	
	@ManyToMany
	private List<Series> sid=new ArrayList<>();
	
	@ManyToMany
	private List<TeamPlayers> tpid=new ArrayList<>();
	
	public SeriesTeamPlayer()
	{
		
	}
	
	public SeriesTeamPlayer(List<Series> sid, List<TeamPlayers> tpid) {
		super();
		
		this.sid = sid;
		this.tpid = tpid;
	}

	public SeriesTeamPlayer(Long iD, List<Series> sid, List<TeamPlayers> tpid) {
		super();
		ID = iD;
		this.sid = sid;
		this.tpid = tpid;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public List<Series> getSid() {
		return sid;
	}

	public void setSid(List<Series> sid) {
		this.sid = sid;
	}

	public List<TeamPlayers> getTpid() {
		return tpid;
	}

	public void setTpid(List<TeamPlayers> tpid) {
		this.tpid = tpid;
	}

	
	

}
