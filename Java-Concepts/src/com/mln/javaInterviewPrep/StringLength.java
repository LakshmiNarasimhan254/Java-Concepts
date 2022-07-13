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
public class StringLength {

	//This Method is created to get the string length without using length function

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String UserInput = "Find my Length";
		int iStringLength = getStringLength(UserInput);
		System.out.println("The length of " + "\"" + UserInput+ "\" is "  + iStringLength);

	}

	//This Method is created to 
	 
	private static int getStringLength(String userInput) {
		int iStringLength =0;
		char[] userInputs = userInput.toCharArray();
		for (char cUI: userInputs ){
			iStringLength =iStringLength+1;
		}
		
		return iStringLength;
	}

}
