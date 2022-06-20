package com.mln.javaInterviewPrep;

import java.util.Arrays;

import com.mln.javaInterviewPrep.InnerClass.B;

public class testmain {
	public static void main(String[] args) {
		InnerClass icObj = new InnerClass();
		InnerClass.A icaObj = icObj.new A();
		icaObj.p =1;
		
		InnerClass.B ICbobj = new B();
		ICbobj.q =2;
		
		String s = "Test";
		char[] c1 = s.toCharArray();
				Arrays.sort(c1);		
			
	}	
	

}
