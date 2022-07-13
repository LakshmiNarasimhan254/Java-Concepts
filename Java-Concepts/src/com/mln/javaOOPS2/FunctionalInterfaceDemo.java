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



interface Rideable{

	void ride();
	default void display(){
		System.out.println("Am inside interface display");
	}
}


class Cars implements Rideable{

	/* (non-Javadoc)
	 * @see com.mln.javaOOPS2.rideable#ride()
	 */
	@Override
	public void ride() {
		System.out.println("Am riding a car");

	}

}

class Bikes implements Rideable{

	/* (non-Javadoc)
	 * @see com.mln.javaOOPS2.rideable#ride()
	 */
	@Override
	public void ride() {
		System.out.println("Am riding a bike");

	}

}
public class FunctionalInterfaceDemo {	
	
	//Anonymous class
	public static void main(String[] args) {
		Rideable r1 = new Rideable()
		{
			@Override
			public void ride() {
					System.out.println("Am riding a cycle");			
			}
		};
		
		r1.ride();
		
	//lambda expression 
		Rideable r2 = ()->System.out.println("Am riding a lorry");
		r2.ride();
		
	}

	

}
