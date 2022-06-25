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
public class IntegerExtractFromString {

	//This Method is created to exact all the integers from a String and get the sum of all

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digitSum = 0;
		String UserInput = "LakshmiNarasimhan254 was born on 25th April 1988";
		char[] chars = UserInput.toCharArray();
		for (char c: chars){
			if (Character.isDigit(c)){
				digitSum = digitSum + Character.getNumericValue(c);
			}

		}
		System.out.println("The Sum of all the digits in the given input is " + digitSum);
	}




}
