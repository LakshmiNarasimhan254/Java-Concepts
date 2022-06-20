package com.mnl.javaInterviewPrep;

public class FibonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ifirst=0;
		int inext = 1;
		System.out.println(ifirst);
		System.out.println(inext);
		for (int i=0;i<=10;i++){
		int itemp = ifirst;
		System.out.println(inext+ itemp);
		ifirst = inext;
		inext = inext +itemp;
		}		

	}

}
