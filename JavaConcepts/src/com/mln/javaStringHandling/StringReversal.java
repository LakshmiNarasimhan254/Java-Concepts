package com.mln.javaStringHandling;



public class StringReversal {
	
	public static void main(String[] args) {
		/*
		 * To reverse a String after taking it from command line argument .
		 * The program buffers the input String using StringBuffer(String string) method,
		 * reverse the buffer and then converts the buffer into a String with the help of toString() method.
		 */
		String strOriginal = "Reverse me if you can";
		String StrReverseA = new StringBuffer(strOriginal).reverse().toString();
		System.out.println(StrReverseA);
		
		
		/*
		 * To reverse a String after taking it from command line argument .
		 * The program converts the String to character Array and Constructs a new string by traversing through 
		 */
		char [] CharArray = strOriginal.toCharArray();
		String StrReverseB ="";
		
		for(int i = 20; i>=0; i-- ){
			 StrReverseB = StrReverseB + CharArray[i];
		}
		
		
	}

}
