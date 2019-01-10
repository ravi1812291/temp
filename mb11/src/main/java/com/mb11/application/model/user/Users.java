package com.mb11.application.model.user;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="Users")
public class Users {
	
	@Id
	@GeneratedValue
	private Long ID;
	
	@Column(length=30)
	private String name;
	
	@Column(length=50)
	private String email;
	
	@Column(name="imageurl",length=100)
	private String imageUrl;
	
	@Column(name="emailverified")
	private boolean emailVerified;
	
	@Column(length=50)
	private String password;
	
	@Column(length=10)
	private String mobilenumber;
	
	@Column(name="providerid",length=100)
	private String providerId;
	
	@Column(length=50)
	private String firstname;
	
	@Column(length=50)
	private String middlename;
	
	@Column(length=50)
	private String lastname;
	
	private Date dob;
	
	@CreationTimestamp
	@Column(nullable=false)
	private LocalDateTime  createtime;
	
	@UpdateTimestamp
	@Column(nullable=false)
	private LocalDateTime  updatetime;
	
	@OneToOne
	private Address address;
	
	
	@Column(length=50)
	private String reffrencecode;
	
	public Users()
	{
		
	}
	
	public Users(String name, String email, String imageUrl, boolean emailVerified, String password,
			String mobilenumber, String providerId, String firstname, String middlename, String lastname, Date dob,
			LocalDateTime createtime, LocalDateTime updatetime, Address address, String reffrencecode) {
		super();
		
		this.name = name;
		this.email = email;
		this.imageUrl = imageUrl;
		this.emailVerified = emailVerified;
		this.password = password;
		this.mobilenumber = mobilenumber;
		this.providerId = providerId;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.dob = dob;
		this.createtime = createtime;
		this.updatetime = updatetime;
		this.address = address;
		this.reffrencecode = reffrencecode;
	}

	public Users(Long iD, String name, String email, String imageUrl, boolean emailVerified, String password,
			String mobilenumber, String providerId, String firstname, String middlename, String lastname, Date dob,
			LocalDateTime createtime, LocalDateTime updatetime, Address address, String reffrencecode) {
		super();
		ID = iD;
		this.name = name;
		this.email = email;
		this.imageUrl = imageUrl;
		this.emailVerified = emailVerified;
		this.password = password;
		this.mobilenumber = mobilenumber;
		this.providerId = providerId;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.dob = dob;
		this.createtime = createtime;
		this.updatetime = updatetime;
		this.address = address;
		this.reffrencecode = reffrencecode;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public boolean isEmailVerified() {
		return emailVerified;
	}

	public void setEmailVerified(boolean emailVerified) {
		this.emailVerified = emailVerified;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public LocalDateTime getCreatetime() {
		return createtime;
	}

	public void setCreatetime(LocalDateTime createtime) {
		this.createtime = createtime;
	}

	public LocalDateTime getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(LocalDateTime updatetime) {
		this.updatetime = updatetime;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getReffrencecode() {
		return reffrencecode;
	}

	public void setReffrencecode(String reffrencecode) {
		this.reffrencecode = reffrencecode;
	}
	
	
	
	

	
	
	

}
