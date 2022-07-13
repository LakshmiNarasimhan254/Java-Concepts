package com.mln.javaBasics;

public class LoopConcepts {

	public static void main(String[] args) {
		
		int iVar1=1;
		int iVar2;
		int iVar3=0;
		int iVar4=0;
		//While Loop
		while(iVar1<=10){
			System.out.print(iVar1);
			iVar1= iVar1+1;
		}
		System.out.println("********");
		//do while loop
		do{
			System.out.print(iVar1);
			iVar1=iVar1+1;
		}while(iVar1<=10);
		System.out.println("********");
		
		//for loop
		for (iVar2=12;iVar2<=20;iVar2++){
			System.out.print(iVar2);
		}
		System.out.println("********");
		System.out.println(iVar3++);//This will print 0, After printing the value will be incremented 
		System.out.println(++iVar4);//This will print 1, before printing the value will be incremented 
		System.out.println(iVar3);
		System.out.println(iVar4);
	}
	

}
