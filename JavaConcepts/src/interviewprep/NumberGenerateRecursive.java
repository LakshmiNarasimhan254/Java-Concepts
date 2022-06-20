package interviewprep;

public class NumberGenerateRecursive {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =0;		
		printnum(num);
	}
		
		
	
	public static void printnum(int num){
		
		System.out.println(num);
		num=num+1;
		if (num<101){
			printnum(num);	
		
	   }
		
		
		

}
}
