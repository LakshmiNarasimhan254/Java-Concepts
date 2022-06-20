package com.mln.javaStringHandling;

public class CharRemoveFromString {

	public static void main(String[] args) {
		// To remove a character from a particular position from a string with 
		//the help of removeCharAt(string,position) method.
		
		
		String strOrginal = "Hello world ,Hello Reader";
		 System.out.println(removeCharAt(strOrginal, 3));
	}

	
	/* The Logic here is to split the string in 2 substrings leaving behind the character at position to be 
	 * skipped and concatenate the resultant  string as the output
	 */
	private static String removeCharAt(String strOrginal, int Postion) {			
		return strOrginal.substring(0, Postion) +strOrginal.substring(Postion+1, strOrginal.length());
	}

}
