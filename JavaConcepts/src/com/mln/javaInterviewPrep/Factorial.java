/*********************
 **Date:{date}*******
 *********************
 *********************/
package com.mln.javaInterviewPrep;

/**
 ********************
 * @author laksh
 ********************
 **/
public class Factorial {

	//This Method is created to 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fact = Fctl(3);
		System.out.println(fact);

	}

	//This Method is created to 

	private static int Fctl(int i) {
		int  Fact=1;
			if (i!=0){
			
				Fact =i*Fctl(i-1);
			// TODO Auto-generated method stub
			}
			return Fact;
	}

		
	}


