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
public class VowelinUserString {

	//This Method is created to find the vowels in the user string

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String UserInput =  "i bid adieu to the group";
		String vowel = "aeiou";
		int vowelCount =0;
		
        String[] chars =UserInput.toLowerCase().split("");
		for (String c : chars){
			if (vowel.contains(c)){
				vowelCount= vowelCount+1;
				
			}
		}
		System.out.println(vowelCount);

	}

}
