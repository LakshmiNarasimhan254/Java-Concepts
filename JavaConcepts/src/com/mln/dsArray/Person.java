package com.mln.dsArray;

public class Person {
	
	public String strFirstName;
	public String strLastName;
	public int iAge;
	
	public Person(String strFirstName,String strLastName,int iAge){
		this.strFirstName =strFirstName;
		this.strLastName =strLastName;
		this.iAge=iAge;
	}

	public String getStrFirstName() {
		return strFirstName;
	}

	public void setStrFirstName(String strFirstName) {
		this.strFirstName = strFirstName;
	}

	public String getStrLastName() {
		return strLastName;
	}

	public void setStrLastName(String strLastName) {
		this.strLastName = strLastName;
	}

	public int getiAge() {
		return iAge;
	}

	public void setiAge(int iAge) {
		this.iAge = iAge;
	}
	
	

}
