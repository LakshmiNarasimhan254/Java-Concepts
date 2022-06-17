package java.OOPSConceptPart1;

public class StaticVsNonStaticConcept {
	String sName = "Tom";
	static int iage = 25;

	public static void main(String[] args) {
		//How to call static method 

		//1.Direct call
		method2();

		//2.By Class name 
		StaticVsNonStaticConcept.method2();

		//3. Creating obj reference 
		StaticVsNonStaticConcept obj = new StaticVsNonStaticConcept();
		obj.method2(); //Not a good Practice

		//How to call static variable 
		System.out.println(iage);
		System.out.println(StaticVsNonStaticConcept.iage);

		//How to call Non static method 
		obj.method1();

		//How to call Non static variable  
		System.out.println(obj.sName);
	}

	public void method1(){
		System.out.println("Am an Non Static Method");
	}

	public static void method2 (){
		System.out.println("Am an Static Method");
	}

}
