package interviewprep;

import java.util.Arrays;

import interviewprep.Innerclass.b;

public class testmain {
	public static void main(String[] args) {
		Innerclass ic = new Innerclass();
		Innerclass.a ica = ic.new a();
		ica.p =1;
		
		Innerclass.b icb = new b();
		icb.q=1;;
		
		
		String s = "Test";
		char[] c1 = s.toCharArray();
				Arrays.sort(c1);		
			
	}	
	

}
