package cOOPSConceptPart2;

public class TestBank {
	public static void main(String[] args) {
		ICICI b1 = new ICICI();
		b1.dollarcredit();
		b1.dollarDebit();
		b1.ATM();
		b1.zelletransfer();
		//System.out.println(b1.min_balance); This is Ambiguos
		
		USBank u1 = new ICICI();
		u1.dollarcredit();
		u1.dollarDebit();
		System.out.println(u1.min_balance);

		UKBank u2 = new ICICI();
		u2.dollarcredit();
		u2.zelletransfer();
		System.out.println(u2.min_balance);
		
		
	}
	
	

}
