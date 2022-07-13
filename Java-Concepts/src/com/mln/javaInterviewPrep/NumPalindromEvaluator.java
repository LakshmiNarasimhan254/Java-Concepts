package com.mln.javaInterviewPrep;

public class NumPalindromEvaluator {

	public static void main(String[] args) {
		// To find out given number is a palindrom or not 
		int num1= 101;
		int reverse = 0;
		int num =num1;
		while(num!=0){
			System.out.println(num%10);
			reverse = reverse *10 +(num%10);
			System.out.println(reverse);
			num=num/10;
				}
		System.out.println(reverse);


	}
}


