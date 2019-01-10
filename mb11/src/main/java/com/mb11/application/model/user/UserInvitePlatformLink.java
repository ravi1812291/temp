package com.mb11.application.model.user;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="UserInvitePlatformLink")
public class UserInvitePlatformLink {
	
	@Id
	@GeneratedValue
	private Long ID;
	
	@Column(nullable=false)
	@ManyToMany
	private List<MInvitePlatform> minviteplatformid=new ArrayList<>();
	
	@Column(nullable=false)
	@OneToMany
	private List<Users> userid=new ArrayList<>();
	
	public UserInvitePlatformLink()
	{
		
	}
	
	public UserInvitePlatformLink(List<MInvitePlatform> minviteplatformid, List<Users> userid) {
		super();
		
		this.minviteplatformid = minviteplatformid;
		this.userid = userid;
	}

	public UserInvitePlatformLink(Long iD, List<MInvitePlatform> minviteplatformid, List<Users> userid) {
		super();
		ID = iD;
		this.minviteplatformid = minviteplatformid;
		this.userid = userid;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public List<MInvitePlatform> getMinviteplatformid() {
		return minviteplatformid;
	}

	public void setMinviteplatformid(List<MInvitePlatform> minviteplatformid) {
		this.minviteplatformid = minviteplatformid;
	}

	public List<Users> getUserid() {
		return userid;
	}

	public void setUserid(List<Users> userid) {
		this.userid = userid;
	}

	
	
}
