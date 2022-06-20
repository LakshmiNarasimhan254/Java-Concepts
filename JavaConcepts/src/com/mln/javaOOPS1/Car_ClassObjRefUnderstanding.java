package com.mln.javaOOPS1;

public class Car_ClassObjRefUnderstanding {

	int iModelNo;
	int iWheel;
	public static void main(String[] args) {
		
		//a,b,c is just the reference of the object not the object itself, new Car_ClassObjRefUnderstanding() is the object.
		//The Above point is proven below by changing the reference;
		Car_ClassObjRefUnderstanding a = new Car_ClassObjRefUnderstanding();
		Car_ClassObjRefUnderstanding b = new Car_ClassObjRefUnderstanding();
		Car_ClassObjRefUnderstanding c= new Car_ClassObjRefUnderstanding();
		
		a.iModelNo =2015;
		b.iModelNo=2016;
		c.iModelNo=2017;
		
		a.iWheel=4;
		b.iWheel=4;
		c.iWheel=4;
		
		
		
		System.out.println("Before Changing the references");
		System.out.println("*******************************");
		System.out.println(a.iModelNo);
		System.out.println(a.iWheel);
		System.out.println(b.iModelNo);
		System.out.println(b.iWheel);	
		System.out.println(c.iModelNo);
		System.out.println(c.iWheel);
		System.out.println("*******************************");
		
		
		System.out.println("a " + a);
		System.out.println("b " + b);
		System.out.println("c " + c);
		//Changing the reference
		a=b;
		b=c;
		c=a;
		System.out.println("*******************************");
		
		System.out.println("After Changing the references");
		System.out.println("*******************************");
		System.out.println(a.iModelNo);
		System.out.println(a.iWheel);
		System.out.println(b.iModelNo);
		System.out.println(b.iWheel);	
		System.out.println(c.iModelNo);
		System.out.println(c.iWheel);
		
		
		System.out.println("a " + a);
		System.out.println("b " + b);
		System.out.println("c " + c);
		System.out.println("*******************************");
	
		
	}

}
