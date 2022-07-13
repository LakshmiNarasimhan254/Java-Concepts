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
public class ChangeCase {

	//This Method is created to write program to change case with using built in function 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String UserInput = "Hi this is a LakshmiNarasimhan";

		System.out.println(ToUpperCase(UserInput));
		System.out.println(ToLowerCase(UserInput));
		System.out.println(ToCamelCase(UserInput));
	}

	//This Method is created to 

	//This Method is created to 

	private static String ToUpperCase(String userInput) {

		char[] charArray  = userInput.toCharArray();
		for (int index =0; index<charArray.length;index++){
			if ((int)(charArray[index])>=97 && (int)(charArray[index])<=120){
				charArray[index]= (char) ((int)(charArray[index])-32);
			}
		}
		return String.valueOf(charArray);


	}

	private static String ToLowerCase(String userInput) {
		// TODO Auto-generated method stub
		char[] charArray  = userInput.toCharArray();
		for (int index =0; index<charArray.length;index++){
			if ((int)(charArray[index])>=65 && (int)(charArray[index])<=90){
				charArray[index]= (char) ((int)(charArray[index])+32);
			}
		}
		return String.valueOf(charArray);
	}

	private static String ToCamelCase(String userInput) {
		// TODO Auto-generated method stub
		String[] userInputs =userInput.split(" ");
		char[] charArray = null ;
		String returnString ="";

		for (String s : userInputs){
			charArray  = s.toCharArray();
			for (int index =0; index<charArray.length;index++){
				if (index==0){
					if ((int)(charArray[index])>=97 && (int)(charArray[index])<=120){
						charArray[index]= (char) ((int)(charArray[index])-32);
					}

				}else{
					if ((int)(charArray[index])>=65 && (int)(charArray[index])<=90){
						charArray[index]= (char) ((int)(charArray[index])+32);
					}
				}
			}
			returnString  = returnString + " " +String.valueOf(charArray);
			 
		}
		returnString=returnString.trim();
		return returnString ;
	}

	}
