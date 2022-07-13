package com.mln.javaInterviewPrep;

public class NumPatternGenerator {

	public static void main(String[] args) {

		//To Print Numbers 1 to 10 in Pyramid for mad

		int iRow,iCol,inum=0;

		for (iRow = 0;iRow<=3;iRow++){
			for (int iSpace=4-iRow;iSpace>=1;iSpace--){
				System.out.print(" ");
			}
			for (iCol =1;iCol<=iRow+1;iCol++){
				System.out.print(inum+ " ");
				inum++;
			}
			System.out.println();


		} 

		//To Print Numbers 1 to 10 inverted Pyramid for mad
		int iRow1,iCol1,inum1=0;
		for (iRow1=0;iRow1<=3;iRow1++){	
			for (int iSpace=1;iSpace<=iRow1+1;iSpace++){
				System.out.print(" ");
			}
			for (iCol1=4-iRow1;iCol1>=1;iCol1--){
				System.out.print(inum1+ " ");
				inum1++;
			}
			System.out.println();

		}


	}

}
