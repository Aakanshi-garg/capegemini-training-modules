package com.spring.beans;

public class Address {
	private int houseNo ; 
	private String city ; 
	private int Pincode ;
	
	public Address(int houseNo, String city, int pincode) {
		
		this.houseNo = houseNo;
		this.city = city;
		Pincode = pincode;
	}

	@Override
	public String toString() {
		return " [houseNo=" + houseNo + ", city=" + city + ", Pincode=" + Pincode + "]";
	}
	
	
	
	
	
	
	

}
