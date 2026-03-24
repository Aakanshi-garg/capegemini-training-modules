package com.spring.beans;

public class Address {
	private int houseNo ; 
	private String city ; 
	private int Pincode ;
	
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPincode(int pincode) {
		this.Pincode = pincode;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "House_No : "  + houseNo + "City: " + city + "Pincode: " + Pincode ;
	} 
	
	
	
	

}
