/**
 * 
 */
package com.mln.javaStringHandling;

/**
 * @author laksh
 *  
 */
public class CompareStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  //This is a Java Program to Compare 2 Strings using Java String Handling Functions 
		
		String strFirstString ="Hello World";
		String strAnotherString = "hello world";
		Object objStr  = strFirstString;
		
		System.out.println(strFirstString.compareTo(strAnotherString));
		System.out.println(strFirstString.compareToIgnoreCase(strAnotherString));
		System.out.println(strFirstString.compareTo(strFirstString.toString()));
	}

}
