package com.mb11.application.model.cricapidata;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Series")
public class Series {
	   
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   @Column(name="id")
	   private long ID; 
	   
	   @NotNull
	   @Column(name="seriesid",unique = true,length=30)
	   private String seriesId;
	   
	   @Column(nullable = false,length=30)
	   private String sname;
	   
	   @Column(nullable = false)
	   private Date startdate;
	   
	   @Column(nullable = false)
	   private Date enddate;
	   
	   @Column(nullable = false)
	   private int totalmatch;
	   
	   
	   public Series()
	   {
		   
		}
	   
	   
	   
  
	


	   public Series(String seriesId, String sname, Date startdate, Date enddate, int totalmatch) {
			super();
		
			this.seriesId = seriesId;
			this.sname = sname;
			this.startdate = startdate;
			this.enddate = enddate;
			this.totalmatch = totalmatch;
		}
	   
	public Series(long iD, String seriesId, String sname, Date startdate, Date enddate, int totalmatch) {
		super();
		ID = iD;
		this.seriesId = seriesId;
		this.sname = sname;
		this.startdate = startdate;
		this.enddate = enddate;
		this.totalmatch = totalmatch;
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






	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Series [ID=" + ID + ", seriesId=" + seriesId + ", sname=" + sname + ", startdate=" + startdate
				+ ", enddate=" + enddate + ", totalmatch=" + totalmatch + "]";
	}
	
	
	
	   
	   

}
