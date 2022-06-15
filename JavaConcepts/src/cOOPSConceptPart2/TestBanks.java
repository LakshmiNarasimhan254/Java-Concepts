package cOOPSConceptPart2;

public class TestBanks {

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
