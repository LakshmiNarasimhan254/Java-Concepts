package com.mln.javaOOPS2;

public class BMW extends Car{ // has a relation
	
	@Override
	public void start(){
		System.out.println("BMW--->Start");
	}
	
	protected void applyBreak(){
		System.out.println("BMW--->Stop");
	}
	
	public void theftsafety(){
		System.out.println("BMW--->Theftsafe");
	}
	
	public static void Gear(){
		System.out.println("BMW--->Gear");
	}

}
