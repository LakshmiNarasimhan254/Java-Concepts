
package com.mln.javaBasics;

class Fruits{
	public String getStrName() {
		return strName;
	}
	public Fruits setStrName(String strName) {
		this.strName = strName;
		return this;
	}
	public String getStrColour() {
		return strColour;
	}
	public Fruits setStrColour(String strColour) {
		this.strColour = strColour;
		return this;
	}
	public String getStrTaste() {
		return strTaste;
		
	}
	public Fruits setStrTaste(String strTaste) {
		this.strTaste = strTaste;
		return this; // for method chaining return the object ("this") itself in the method 
	}
	String strName;
	String strColour;
	String strTaste;
	
}

public class MethodChaining {

	//This Method is created to 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits fruits = new Fruits();
		System.out.println(fruits.setStrName("Apple").setStrColour("Red").setStrTaste("Sweet").getStrName());
	
	
	}

}
