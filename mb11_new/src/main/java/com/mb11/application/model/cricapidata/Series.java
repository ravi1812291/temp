package com.mb11.application.model.cricapidata;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

// TODO: Auto-generated Javadoc
/**
 * The Class Series.
 */
@Entity
@Table(name="Series")
public class Series {
	   
	   /** The id. */
   	@Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   @Column(name="id")
	   private long ID; 
	   
	   /** The series id. */
   	@NotNull
	   @Column(name="seriesid",unique = true,length=30)
	   private String seriesId;
	   
	   /** The sname. */
   	@Column(nullable = false,length=30)
	   private String sname;
	   
	   /** The startdate. */
   	@Column(nullable = false)
	   private Date startdate;
	   
	   /** The enddate. */
   	@Column(nullable = false)
	   private Date enddate;
	   
	   /** The totalmatch. */
   	@Column(nullable = false)
	   private int totalmatch;
   	
   	@ManyToMany
   	@Column(nullable = false)
   	@JoinTable(name = "SeriesTeamLink", joinColumns = @JoinColumn(name = "MTeam "), inverseJoinColumns = @JoinColumn(name = "Series"))
	private  List<MTeam> mTeam=new ArrayList<>();
	   
   	@ManyToMany
   	@Column(nullable = false)
   	@JoinTable(name = "SeriesTeamPlayer", joinColumns = @JoinColumn(name = "sid "), inverseJoinColumns = @JoinColumn(name = "tpid"))
   	private List<TeamPlayers> teamPlayers=new ArrayList<>();
   	
   	
//   	@ManyToOne
//   	@JoinColumn(name = "matches")
//    private List<Match> match=new ArrayList<>();
	   
	   /**
   	 * Instantiates a new series.
   	 */
   	public Series()
	   {
		   
		}
   	
   	


	public Series(@NotNull String seriesId, String sname, Date startdate, Date enddate, int totalmatch, List<MTeam> mTeam,
		List<TeamPlayers> teamPlayers) {
	super();
	this.seriesId = seriesId;
	this.sname = sname;
	this.startdate = startdate;
	this.enddate = enddate;
	this.totalmatch = totalmatch;
	this.mTeam = mTeam;
	this.teamPlayers = teamPlayers;
}




	public Series(long iD, @NotNull String seriesId, String sname, Date startdate, Date enddate, int totalmatch,
		List<MTeam> mTeam, List<TeamPlayers> teamPlayers) {
	super();
	ID = iD;
	this.seriesId = seriesId;
	this.sname = sname;
	this.startdate = startdate;
	this.enddate = enddate;
	this.totalmatch = totalmatch;
	this.mTeam = mTeam;
	this.teamPlayers = teamPlayers;
}




	public long getID() {
		return ID;
	}


	public void setID(long iD) {
		ID = iD;
	}


	public String getSeriesId() {
		return seriesId;
	}


	public void setSeriesId(String seriesId) {
		this.seriesId = seriesId;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public Date getStartdate() {
		return startdate;
	}


	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}


	public Date getEnddate() {
		return enddate;
	}


	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}


	public int getTotalmatch() {
		return totalmatch;
	}


	public void setTotalmatch(int totalmatch) {
		this.totalmatch = totalmatch;
	}


	public List<MTeam> getmTeam() {
		return mTeam;
	}


	public void setmTeam(List<MTeam> mTeam) {
		this.mTeam = mTeam;
	}


	public List<TeamPlayers> getTeamPlayers() {
		return teamPlayers;
	}


	public void setTeamPlayers(List<TeamPlayers> teamPlayers) {
		this.teamPlayers = teamPlayers;
	}

		   

}
