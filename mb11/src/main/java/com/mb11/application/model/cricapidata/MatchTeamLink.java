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
@Table(name="MatchTeamLink")
public class MatchTeamLink {
	
	@Id
	@GeneratedValue
	private Long ID;
	
	@Column(nullable = false)
	@OneToMany
	private List<Match> mid=new ArrayList<>();
	
	@Column(nullable = false)
	@OneToMany
	private List<SeriesTeamLink> seriesteamlinkid=new ArrayList<>();;
	
	public MatchTeamLink()
	{
		
	}
	
	public MatchTeamLink(List<Match> mid, List<SeriesTeamLink> seriesteamlinkid) {
		super();

		this.mid = mid;
		this.seriesteamlinkid = seriesteamlinkid;
	}

	public MatchTeamLink(Long iD, List<Match> mid, List<SeriesTeamLink> seriesteamlinkid) {
		super();
		ID = iD;
		this.mid = mid;
		this.seriesteamlinkid = seriesteamlinkid;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public List<Match> getMid() {
		return mid;
	}

	public void setMid(List<Match> mid) {
		this.mid = mid;
	}

	public List<SeriesTeamLink> getSeriesteamlinkid() {
		return seriesteamlinkid;
	}

	public void setSeriesteamlinkid(List<SeriesTeamLink> seriesteamlinkid) {
		this.seriesteamlinkid = seriesteamlinkid;
	}

	

}
