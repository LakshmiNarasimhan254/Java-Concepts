package java.OOPSConceptPart1;

public class FunctionsinJava {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		FunctionsinJava fn = new FunctionsinJava();
		fn.add();
		fn.display();
		double prod  = fn.product(10.5, 2.5);
		fn.DisplayChar();
		String dspString = fn.DisplayString();
		System.out.println(prod+dspString);
		
	}

	
	//Non Static Method 
	public void display(){
		System.out.println("Hi this is just a display Method");
	}

	public void add(){
		int iVar1 =10;
		int iVar2 =20;
		int iVar3 =iVar1+iVar2;
		System.out.println(iVar3);
	}
	
	public double product(double dVar1,double dVar2 ){
		double dVar3 = dVar1*dVar2;
		System.out.println(dVar3);
		return dVar3;
	}
	public void DisplayChar(){
		char cVar1 = 'a';
		System.out.println(cVar1);
		
	}
	
	public String DisplayString(){
		String sVar1 = "This is a string";
		System.out.println(sVar1);
		return sVar1;
	}
}

