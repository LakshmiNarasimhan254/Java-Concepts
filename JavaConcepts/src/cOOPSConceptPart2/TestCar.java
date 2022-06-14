package cOOPSConceptPart2;

public class TestCar {
	
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
