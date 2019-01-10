package com.mb11.application.model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address 
{
	@Id
	@GeneratedValue
	private Long ID;
	
	@Column(length=100)
	private String address1;
	
	@Column(length=100)
	private String address2; 
	
	@Column(length=100)
	private String city;   
	
	@Column(length=100)
	private String state;   
	
	@Column(length=100)
	private String country;  
	
	@Column(length=100)
	private String pincode;
	
	
	
	public Address()
	{
		
	}
	
	public Address(String address1, String address2, String city, String state, String country,
			String pincode) {
		super();
	
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	
	
	public Address(Long iD, String address1, String address2, String city, String state, String country,
			String pincode) {
		super();
		ID = iD;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	
	
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}  
	
	
}
