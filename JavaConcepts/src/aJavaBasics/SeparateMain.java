package aJavaBasics;

public class SeparateMain {

	public static void main(String[] args) {
		SingleTon x = SingleTon.getInstance();
	     x.str  = x.str.toUpperCase();
	     System.out.println(x.str);
		SingleTon y = SingleTon.getInstance();
		System.out.println(y.str);
		SingleTon z = SingleTon.getInstance();
		System.out.println(z.str);
	

	}

}
