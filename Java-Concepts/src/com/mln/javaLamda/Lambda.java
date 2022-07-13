package com.mln.javaLamda;

public class Lambda {

	public void objGreetingMethod()
	{
		System.out.println("Hello world");
	}

	public void greetme(Greeting greeting){
		greeting.greet();
	}
	
	public void greetme(functionType ft){
		ft.greetmeLambda();
	}
	public  int addme(addfunctionlamda a_fl){
		return a_fl.add(1, 5);
	}
	public static void main(String[] args) {

		//1
		Lambda lambda1 = new Lambda();
		lambda1.objGreetingMethod();

		//2		
		Lambda lambda2 = new Lambda();
		Greeting helloworldgreeting = new HelloWorldGreeting();
		lambda1.greetme(helloworldgreeting);

	
		
		//3
		functionType lamdagreetingfunction = ()-> System.out.println("hello world");
		Lambda lambda3 = new Lambda();
		lambda3.greetme(lamdagreetingfunction);
		lamdagreetingfunction.greetmeLambda();
		
		//4
		functionType Anonymousagreetingfunction = new functionType(){
			public void greetmeLambda(){
				System.out.println("Hello world");
			}

		};
		lambda3.greetme(Anonymousagreetingfunction);
		Anonymousagreetingfunction.greetmeLambda();
		
		addfunctionlamda afl = (a,b)-> a+b;
		System.out.println(afl.add(1, 3));
		System.out.print(lambda3.addme((a,b)-> a+b));
	}	
}
	
	@FunctionalInterface
	interface functionType{
		void greetmeLambda();
		
		
	}
	
	
	interface addfunctionlamda{
		int add(int a, int b);
	}