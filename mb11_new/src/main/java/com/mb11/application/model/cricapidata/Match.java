package com.mb11.application.model.cricapidata;

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

// TODO: Auto-generated Javadoc
/**
 * The Class Match.
 */
@Entity
@Table(name="Matches")
public class Match  {
	
	/** The id. */
	@Id
	@GeneratedValue
	private Long ID;
	
	/** The matchname. */
	@Column(nullable = false,length=30)
	private String matchname;
	
	/** The series. */
	
	@OneToMany
	private List<Series> series=new ArrayList<>();
	
	/**
	 * Instantiates a new match.
	 */
	public Match()
	{
		
	}

	/**
	 * Instantiates a new match.
	 *
	 * @param matchname the matchname
	 * @param series the series
	 */
	public Match(String matchname, List<Series> series) {
		super();
		
		this.matchname = matchname;
		this.series = series;
	}
	
	
	/**
	 * Instantiates a new match.
	 *
	 * @param iD the i D
	 * @param matchname the matchname
	 * @param series the series
	 */
	public Match(Long iD, String matchname, List<Series> series) {
		super();
		ID = iD;
		this.matchname = matchname;
		this.series = series;
	}




	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getID() {
		return ID;
	}

	/**
	 * Sets the id.
	 *
	 * @param iD the new id
	 */
	public void setID(Long iD) {
		ID = iD;
	}

	/**
	 * Gets the matchname.
	 *
	 * @return the matchname
	 */
	public String getMatchname() {
		return matchname;
	}

	/**
	 * Sets the matchname.
	 *
	 * @param matchname the new matchname
	 */
	public void setMatchname(String matchname) {
		this.matchname = matchname;
	}

	/**
	 * Gets the series.
	 *
	 * @return the series
	 */
	public List<Series> getseries() {
		return series;
	}

	/**
	 * Sets the series.
	 *
	 * @param series the new series
	 */
	public void setseries(List<Series> series) {
		this.series = series;
	}

	
	

}
