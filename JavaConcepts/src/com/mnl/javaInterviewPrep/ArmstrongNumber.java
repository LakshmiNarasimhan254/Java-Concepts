package com.mnl.javaInterviewPrep;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum = 153;
		int iTempNum = iNum;
		int armstrongcheck=0;
		
		while(iTempNum!=0){
			int digit = iTempNum%10;
			armstrongcheck= armstrongcheck+(digit*digit*digit);
			iTempNum=iTempNum/10;	
			System.out.println();
		}
		System.out.println(armstrongcheck);
		

	}

}
