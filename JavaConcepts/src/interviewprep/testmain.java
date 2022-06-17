package interviewprep;

import interviewprep.innerclass.b;

public class testmain {
	public static void main(String[] args) {
		innerclass ic = new innerclass();
		innerclass.a ica = ic.new a();
		ica.p =1;
		
		innerclass.b icb = new b();
		icb.q=1;;
	}	
	

}
