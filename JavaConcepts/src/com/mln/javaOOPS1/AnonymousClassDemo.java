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
class Cycle{
	public void display(){
		System.out.println("Am a cycle");
	}

	//This Method is created to 
	 
	public void displayWheelcount() {
		// TODO Auto-generated method stub
		
	}

}

public class AnonymousClassDemo {

	//This Method is created to 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cycle tricyle1 = new Cycle(){
			public  void display(){
				System.out.println("Am a tricycle");
			}
		};
		Cycle tricyle2 = new Cycle(){
			
			public void display(){
				System.out.println("Am a tricycle");
			}
			public void displayWheelcount(){
				System.out.println("I have 3 wheels");
			}
		};
		tricyle1.display();
		tricyle2.display();
		tricyle2.displayWheelcount();
	}
}



