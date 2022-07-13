
package com.mln.javaBasics;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java";
		String s2 = new String("Java");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s2==s1);
		System.out.println(s1.equals(s2));
		
		Object obj = new Object();
		System.out.println(obj);
		
		Integer i1= 1;
		Integer i2 =1;
		
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		System.out.println(i2==i1);
		System.out.println(i1.equals(2));
		
	}

}
