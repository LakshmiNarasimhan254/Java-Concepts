/*********************
 **Date:{date}*******
 *********************
 *********************/
package com.mln.javaOOPS2;

/**
 ********************
 * @author laksh
 ********************
 **/
class A{
	void display(){
		System.out.println("From Class A");
	}
}
class B extends A{
	@Override 
	void display(){
		System.out.println("From Class B");
	}
}
class C extends B{
	@Override 
	void display(){
		System.out.println("From Class C");
	}
}


public class MultipleInheritance {

	//This Method is created to understand multiple inheritance 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.display();
	}

}
