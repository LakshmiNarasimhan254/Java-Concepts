package com.mln.javaInterviewPrep;

public class FibonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int iFirst=0;
		int iNext = 1;
		int iMax =100;
		
		
		printFibonaci(iFirst,iNext,iMax);
		System.out.println();
		System.out.println("******************************");
		recursiveFibonaci(iFirst,iNext,iMax);


		//				

	}

	private static void printFibonaci(int iFirst,int iNext,int iMax){
		
		System.out.print(iFirst +",");

		do{
			System.out.print(iNext+",");
			int iTemp =iNext;
			iNext = iNext+iFirst;
			iFirst= iTemp;
		}while(iNext<iMax);
	}


	private static void recursiveFibonaci(int iFirst, int iNext ,int iMax){
		if (iNext<iMax){
		if (iFirst==0){
			System.out.print(iFirst +",");
		}
		System.out.print(iNext+",");
		int iTemp =iNext;
		iNext = iNext+iFirst;
		iFirst= iTemp;
		recursiveFibonaci(iFirst,iNext,iMax);
		}
	}
}
