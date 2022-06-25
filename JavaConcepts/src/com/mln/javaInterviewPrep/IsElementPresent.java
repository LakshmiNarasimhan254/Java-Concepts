/*********************
 **Date:{date}*******
 *********************
 *********************/
package com.mln.javaInterviewPrep;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 ********************
 * @author laksh
 ********************
 **/
public class IsElementPresent {

	//This Method is created to 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int givenEle = 4;
		int[] Array = {3,4,5,4,7,8};
		
		if((isElementPresent(Array,givenEle)) && (IntStream.of(Array).anyMatch(ele->ele==givenEle)))
				{
			System.out.println("The Given element " + givenEle + " is Present");
		}
		
		
	}

	//This Method is created to 
	 
	private static boolean isElementPresent(int[] array, int givenEle) {		
		for (int ele : array){
				if (ele==givenEle){
					return true;
				}
		}	
		return false;
		
	
		
		
	}

}
