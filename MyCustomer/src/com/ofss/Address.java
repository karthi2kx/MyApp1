package com.ofss;

public class Address {
	
	int flatNo;
	String streetName;
	String city;
	long pinCode;
	
	public Address(int flatNo, String streetName, String city, int pinCode) {
		super();
		this.flatNo = flatNo;
		this.streetName = streetName;
		this.city = city;
		this.pinCode = pinCode;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		String msg = this.flatNo+" "+this.streetName+" "+this.city+" "+this.pinCode;
		return msg;
	}
	

}
