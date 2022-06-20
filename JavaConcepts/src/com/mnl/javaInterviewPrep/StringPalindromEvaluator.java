package com.mnl.javaInterviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringPalindromEvaluator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using string manipulation and forloop
		String original = "MALAYdfdgsdtALAM";
		String reverse ="";
		for(int i=original.length()-1;i>=0;i--){
		reverse = reverse + original.charAt(i)
		;
		}
		System.out.println(reverse);
		
		//using StringBulider
		reverse= new StringBuilder(original).reverse().toString();
		
		
		
		//usiing collection and char array 
		char[] Charray = original.toCharArray();
		 ArrayList <Character>Chal = new ArrayList<Character>(Arrays.asList());
		
		
		
	}
}
