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
@Table(name="Matches")
public class Match  {
	
	@Id
	@GeneratedValue
	private Long ID;
	
	@Column(nullable = false,length=30)
	private String matchname;
	
	@Column(nullable = false)
	@OneToMany
	private List<Series> sid=new ArrayList<>();
	
	public Match()
	{
		
	}

	public Match(String matchname, List<Series> sid) {
		super();
		
		this.matchname = matchname;
		this.sid = sid;
	}
	
	
	public Match(Long iD, String matchname, List<Series> sid) {
		super();
		ID = iD;
		this.matchname = matchname;
		this.sid = sid;
	}




	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getMatchname() {
		return matchname;
	}

	public void setMatchname(String matchname) {
		this.matchname = matchname;
	}

	public List<Series> getSid() {
		return sid;
	}

	public void setSid(List<Series> sid) {
		this.sid = sid;
	}

	
	

}
