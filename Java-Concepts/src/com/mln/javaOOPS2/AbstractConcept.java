package com.mln.javaOOPS2;

abstract class USABanks {	
	public abstract void loan();	
	public void credit(){
		System.out.println("USA Bank-- Credit");
	}
	public void debit(){
		System.out.println("USA Bank-- debit");
	}
}
class BOFABanks extends USABanks{
	@Override
	public void loan() {
		System.out.println("BOFA--LOAN");
	}
	public void funds(){
		System.out.println("BOFA -FUNDS");
	}
}


public  class AbstractConcept {

	public static void main(String[] args) {

		USABanks ub1 = new BOFABanks();
		ub1.credit();
		ub1.debit();
		ub1.loan();

		BOFABanks ub2 = new BOFABanks();
		ub2.credit();
		ub2.debit();
		ub2.loan();
		ub2.funds();
	}

}
