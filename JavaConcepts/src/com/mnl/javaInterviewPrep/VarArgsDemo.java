/*********************
 **Date:{date}*******
 *********************
 *********************/
package com.mnl.javaInterviewPrep;

/**
 ********************
 * @author laksh
 ********************
 **/
public class VarArgsDemo {
	
	
	
	
	public void sum(double...Vals){
		int len = Vals.length;
		System.out.println(len+ " Am from double overload");
		
	}
	
	public void sum(int...Vals){
		int len = Vals.length;
		System.out.println(len+ " Am from Int overload");
		
	}
	public void sum(int x ,int y){
		int len = x+y;
		System.out.println(len);
		
	}


	//This Method is created to 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		VarArgsDemo v = new VarArgsDemo();
		v.sum(2,3);
		v.sum(2,3,4);
		v.sum();
	}
	
	
	
}
