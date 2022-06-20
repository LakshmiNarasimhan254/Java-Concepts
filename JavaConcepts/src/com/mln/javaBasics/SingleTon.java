package com.mln.javaBasics;

public class SingleTon {


	private static SingleTon st = null;
	public String str;
	private SingleTon(){
		str ="Am a single method";
	}

	public static SingleTon getInstance(){
		st =(st == null) ? new SingleTon() : st;
		return st;

	}
	public static void main(String[] args) {
		SingleTon x = SingleTon.getInstance();
	     x.str  = x.str.toUpperCase();
	     System.out.println(x.str);
		SingleTon y = new SingleTon();
		System.out.println(y.str);
		SingleTon z = new SingleTon();
		System.out.println(z.str);
	

	}
	
	
}
