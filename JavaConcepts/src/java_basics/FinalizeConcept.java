package java_basics;

public class FinalizeConcept {
	
	public void finalize(){
		System.out.println("Am inside finalize");
	}
	
	public static void main(String[] args) {
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		f1=null;
		f2=null;
		System.out.println("Am outside finalize");
		//System.gc();// This is the manual method to call garbage collector 
		
		
		
	}

}
