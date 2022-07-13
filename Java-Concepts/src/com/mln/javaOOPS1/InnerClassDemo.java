/*********************
 **Date:{date}*******
 *********************
 *********************/
package com.mln.javaOOPS1;


/**
 ********************
 * @author laksh
 ********************
 **/

class Outer{
	void display(){
		System.out.println("I am from Outer class");
	}
	class Inner1{
		void display(){
			System.out.println("I am from Inner class");
		}
	}
	
	 static class Inner2{
		void display(){
			System.out.println("I am from Inner static class");
		}
	}
}

public class InnerClassDemo {

	//This Method is created to understand Inner Class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Object invocation 
		
		//1. Outer class
		Outer outer = new Outer();
		outer.display();
		
		//2.Inner 1 (Non static class)
		Outer.Inner1 inner1  = outer.new Inner1();
		inner1.display();
		
		//3.Inner 1 (Non static class)
		Outer.Inner2 inner2  = new Outer.Inner2();
		inner2.display();

	}

}
