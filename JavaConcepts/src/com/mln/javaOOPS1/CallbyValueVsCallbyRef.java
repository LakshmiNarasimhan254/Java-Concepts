package com.mln.javaOOPS1;

public class CallbyValueVsCallbyRef {

	private int igVar1;
	private int igVar2;


	public static void main(String[] args) {
		
		int igVar1;
		int igVar2;
		
		CallbyValueVsCallbyRef obj = new CallbyValueVsCallbyRef();
		
		int iVariable1 = 10;
		int iVariable2 = 20;
		obj.sum(iVariable1, iVariable2); //Call by value 
		System.out.println(iVariable1+""+ iVariable2);
		obj.igVar1=50;
		obj.igVar2=60;
		obj.swap(obj);//Call by reference 
		System.out.println(obj.igVar1+""+obj.igVar2);
	}

	public int sum(int iVar1,int iVar2 ){
		iVar1 =100;
		iVar2= 200;
		int iVar3 =iVar1+iVar2;
		
		return iVar3;
	}
	
	
	public CallbyValueVsCallbyRef swap(CallbyValueVsCallbyRef t ){
		int temp;
		temp =t.igVar1;
		t.igVar1= t.igVar2;
		t.igVar2 =temp;
		
		return t;
	}
}
