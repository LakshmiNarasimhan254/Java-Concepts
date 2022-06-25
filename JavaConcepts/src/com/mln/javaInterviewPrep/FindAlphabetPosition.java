/*********************
 **Date:{date}*******
 *********************
 *********************/
package com.mln.javaInterviewPrep;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 ********************
 * @author laksh
 ********************
 **/
public class FindAlphabetPosition {

	//This Method is created to find the alphabet position

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char alphabet = 'Z';
		int alphabetPosition = getAlphabetPosition(alphabet);
		System.out.println(alphabetPosition);

	}

	//This Method is created to 
	 
	private static int getAlphabetPosition(char alphabet) {
		// TODO Auto-generated method stub
		alphabet= Character.toLowerCase(alphabet);
		int asciivalue = alphabet;
		int position = asciivalue-96;
		
		
		return position;
	}

}
