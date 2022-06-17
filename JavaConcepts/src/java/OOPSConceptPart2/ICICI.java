package java.OOPSConceptPart2;

public class ICICI implements USBank,UKBank{
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
	
}
