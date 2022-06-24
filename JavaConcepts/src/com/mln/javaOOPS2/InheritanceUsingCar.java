package com.mln.javaOOPS2;
class Car {

	public void start(){
		System.out.println("Car--->Start");
	}

	protected void applyBreak(){
		System.out.println("Car--->Stop");
	}

	public static void Gear(){
		System.out.println("Car--->Gear");
	}

}
class BMW extends Car{ // has a relation
	
	BMW(){
		System.out.println("Am the Constructor of B");;
	}

	@Override
	public void start(){
		System.out.println("BMW--->Start");
	}

	protected void applyBreak(){
		System.out.println("BMW--->Stop");
	}

	public void theftsafety(){
		System.out.println("BMW--->Theftsafe");
	}

	public static void Gear(){
		System.out.println("BMW--->Gear");
	}
}

public class InheritanceUsingCar {

	public static void main(String[] args) {


		//Static PolyMorphism -----Compile Time Polymorphism
		BMW b1 = new BMW();
		b1.start();
		b1.applyBreak();
		b1.theftsafety();
		b1.Gear();

		//Dynamic PolyMorphism -----Run Time Polymorphism
		//When Parent Class Reference is given to Child object 

		// This is also called Top Casting
		Car c1 = new BMW();
		c1.start();
		c1.applyBreak();
		c1.Gear();


		//Down casting 
		//BMW b2 = (BMW) new Car(); //ClassCastException


	}

}
