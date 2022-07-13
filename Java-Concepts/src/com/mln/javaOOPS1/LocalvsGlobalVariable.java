package com.mln.javaOOPS1;

public class LocalvsGlobalVariable {
	
	//Global Varaiable / Class Variable 
	String sName = "Tom";
	int iAge = 25;
	public static void main(String[] args) {
		
		int iVar1 = 10; //Local Variable
		
		//Accessing the Local Variable 
		System.out.println(iVar1);
		
		//Accessing the global/class Variable 
		LocalvsGlobalVariable obj = new LocalvsGlobalVariable();
		System.out.println(obj.sName);
		System.out.println(obj.iAge);
		
			
	}
	public void add(){
		int iVar1 =15; //Local method for sum 
		int iAge =20;
		System.out.println(iVar1);
		System.out.println(iAge);
	}
}
