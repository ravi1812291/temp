package com.mb11.application.model.cricapidata;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="SeriesTeamLink")
public class SeriesTeamLink {
	
	@Id
	@GeneratedValue
	private Long ID;
	
	@ManyToMany
	private  List<MTeam> mTeam=new ArrayList<>();
	
	@ManyToMany
	private  List<Series> series=new ArrayList<>();
	
	
	
	
	public SeriesTeamLink() {
		
	}


	public SeriesTeamLink(List<MTeam> mTeam, List<Series> series) {
		super();
	
		this.mTeam = mTeam;
		this.series = series;
	}


	public SeriesTeamLink(Long iD, List<MTeam> mTeam, List<Series> series) {
		super();
		ID = iD;
		this.mTeam = mTeam;
		this.series = series;
	}




	public Long getID() {
		return ID;
	}




	public void setID(Long iD) {
		ID = iD;
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
