package stringHandling;

public class StringOptimization {

	public static void main(String[] args) {
		String variablesA,variablesB,variablesC;  
		long startTime0 = System.nanoTime();		
		variablesA = "hello";
		long endTime0 = System.nanoTime();
		System.out.println("Creation time" 
				+ " of String literals : "+ (endTime0 - startTime0) 
				+ " ms" );
		long startTime1 = System.nanoTime();		
		variablesB = new String("hello");
		long endTime1 = System.nanoTime();
		System.out.println("Creation time of" 
				+ " String objects with 'new' key word : " 
				+ (endTime1 - startTime1)
				+ " ms");
		long startTime2 = System.nanoTime();		
		variablesC = variablesB.intern();		  
		long endTime2 = System.nanoTime();
		System.out.println("Creation time of" 
				+ " String objects with intern(): " 
				+ (endTime2 - startTime2)
				+ " ms");
	}

}
