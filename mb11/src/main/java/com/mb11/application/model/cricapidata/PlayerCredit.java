package com.mb11.application.model.cricapidata;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PlayerCredit")
public class PlayerCredit {
	
	@Id
	@GeneratedValue
	private Long ID;
	private float credit;
	
	@OneToMany
	private List<SeriesTeamPlayer> vseriesTeamplayerid=new ArrayList<>();
	
	public PlayerCredit()
	{
		
	}
	
	public PlayerCredit(float credit, List<SeriesTeamPlayer> vseriesTeamplayerid) {
		super();
		
		this.credit = credit;
		this.vseriesTeamplayerid = vseriesTeamplayerid;
	}

	public PlayerCredit(Long iD, float credit, List<SeriesTeamPlayer> vseriesTeamplayerid) {
		super();
		ID = iD;
		this.credit = credit;
		this.vseriesTeamplayerid = vseriesTeamplayerid;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public float getCredit() {
		return credit;
	}

	public void setCredit(float credit) {
		this.credit = credit;
	}

	public List<SeriesTeamPlayer> getVseriesTeamplayerid() {
		return vseriesTeamplayerid;
	}

	public void setVseriesTeamplayerid(List<SeriesTeamPlayer> vseriesTeamplayerid) {
		this.vseriesTeamplayerid = vseriesTeamplayerid;
	}
	
	


}
