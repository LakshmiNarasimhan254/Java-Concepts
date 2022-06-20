package com.mln.javaOOPS2;

public interface USBank {
	
	double min_balance = 100;	
	public void dollarcredit();
	public void dollarDebit();
	
	public static void transfermoney(){
		System.out.println("This is possible");
	}

}
