package com.mln.dsArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<String>ar1 = new ArrayList<String>();
		ar1.add("Java");
		ar1.add("Python");
		ar1.add("C");
		ar1.add("C++");
		System.out.println("AR1--" +ar1);


		ArrayList<String>ar2 = new ArrayList<String>();
		ar2.add("Testing");
		ar2.add("Devops");
		System.out.println("AR2--" +ar2);


		//add all	
		//ar1.addAll(ar2);
		//System.out.println("AR1(After addition of AR2)--" +ar1);

		//add all from Particular index
		ar1.addAll(2, ar2);
		System.out.println("AR1(After addition of AR2 after the 2nd element)--" +ar1);

		//clone
		ArrayList<String>ar2clone = (ArrayList<String>) ar2.clone();
		System.out.println("AR2clone--" +ar2clone);

		//clear
		ar2.clear();
		System.out.println("AR2(After clearing)--" +ar2);

		//Contains -  A element as whole 
		System.out.println("Check if Python is Present:"+ar1.contains("Python"));

		//indexof
		System.out.println("Index of Python is :"+ar1.indexOf("Python"));

		//Lastindex
		ArrayList<String>ar3 = new ArrayList<String>(Arrays.asList("ABC","DEF","GHI","ABC","JKL","MNO","ABC"));
		System.out.println("Last Index of Python is :"+ar3.lastIndexOf( "ABC"));

		//Remove

		ar3.remove(1);
		System.out.println("AR3(After remove)--" +ar3);

		ar3.remove("ABC");
		System.out.println("AR3(After ABC removes(First Occurence)--" +ar3);

		//Remove if
		ArrayList<Integer>ar4 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		ar4.removeIf(num->num%2 == 0);
		System.out.println("AR4(After removal of elements matching above condition--" +ar4);

		//Retain all
		System.out.println(ar1.retainAll(ar2clone));
		System.out.println("AR1--" +ar1);

		//SubList
		ArrayList<Integer>ar5 =new ArrayList<Integer>(ar4.subList(2, 5));
		System.out.println("Sublist of AR4--" +ar5);

		//to array
		Object[] obj = ar5.toArray();
		for(Object o: obj){
			System.out.println("Object Array of AR5--" +o);
		}
		System.out.println(Arrays.toString(obj));
		
		
		
	}
}
