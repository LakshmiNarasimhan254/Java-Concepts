/*********************
 **Date:{date}*******
 *********************
 *********************/
package com.mln.javaInterviewPrep;

import java.util.Arrays;
import java.util.HashSet;

/**
 ********************
 * @author laksh
 ********************
 **/
public class Pangram {



	//This Method is created to check if the given sentence is a pangram are not

	public static void main(String[] args) {
		String userInput = "A quick brown fox jumps over the lazy dog";
		if (isPangram(userInput)){
			System.out.println("\"" +userInput  + "\"" + " is a Pangram");
		}else{
			System.out.println(userInput + " is not a Pangram");
		}
		// TODO Auto-generated method stub



	}

	//This Method is created to 

	private static boolean isPangram(String userInput) {
		
		userInput = userInput.toLowerCase();
		String[] userInputs =  userInput.trim().split("");
		String Alphabet = "abcdefghijklmnopqrstuvwxyz" ;
		String [] Alphabets = Alphabet.split("");
		HashSet<String> set1 = new HashSet<String>(Arrays.asList(userInputs));
		HashSet<String> set2 = new HashSet<String>(Arrays.asList(Alphabets));
		set2.removeAll(set1);
		if (set2.isEmpty()){		
			return true;
		}
		return false;
	}
}
