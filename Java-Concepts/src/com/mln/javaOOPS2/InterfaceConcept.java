package com.mln.javaOOPS2;

import java.util.Arrays;

interface UKBank {	
	double min_balance = 500;	
	public void dollarcredit();
	public void zelletransfer();
	
	default void display(){
		System.out.println("i follow UK Rules");	
	}
}
interface USBank {

	double min_balance = 100;	
	public void dollarcredit();
	public void dollarDebit();

	public static void transfermoney(){
		System.out.println("This is possible");
	}
	
	default void display(){
		System.out.println("i follow US Rules");	
	}
}
class ICICI implements USBank,UKBank{
	//is a relationship

	@Override
	public void dollarcredit() {
		System.out.println("credit should be in dollar");
	}
	@Override
	public void dollarDebit() {
		System.out.println("debit should be in dollar");
	}
	public void ATM(){
		System.out.println("I have an ATM");
	}
	@Override
	public void zelletransfer() {
		System.out.println("I can do zelle");
	}
	/* (non-Javadoc)
	 * @see com.mln.javaOOPS2.UKBank#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I follow my rules");
	}
	

	public static void transfermoney(){
		System.out.println("This is possible from ICICI");
	}

}

abstract class SBI implements USBank,UKBank{

	/* (non-Javadoc)
	 * @see com.mln.javaOOPS2.UKBank#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		UKBank.super.display();
	}
	//is a relationship


}

public class InterfaceConcept {
	public static void main(String[] args) {
		ICICI b1 = new ICICI();
		b1.dollarcredit();
		b1.dollarDebit();
		b1.ATM();
		b1.zelletransfer();
		//System.out.println(b1.min_balance); This is AmbiguosS
		
		
		b1.display();
		b1.transfermoney();

		USBank u1 = new ICICI();
		u1.dollarcredit();
		u1.dollarDebit();
		System.out.println(u1.min_balance);
		u1.display();
		

		UKBank u2 = new ICICI();
		u2.dollarcredit();
		u2.zelletransfer();
		System.out.println(u2.min_balance);
		u2.display();
		USBank.transfermoney();
		ICICI.transfermoney();
		

		
		USBank u3 = new USBank()
					{
					@Override
					public void dollarcredit(){
							System.out.println("i follow US Anonymous Rules for credit");	
						}

					@Override
					public void dollarDebit() {
						System.out.println("i follow US Anonymous Rules for debit ");	
						
					}
					};
					
		System.out.println("******************");
		u3.dollarcredit();	
		u3.dollarDebit();	
		u3.display();	
					
	}



}
