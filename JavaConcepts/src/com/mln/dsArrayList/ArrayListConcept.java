package com.mln.dsArrayList;

import java.util.ArrayList;
import java.util.Iterator;

import com.mln.javaOOPS2.*;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Dynamic Array 
		
		//Non Generic 
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add("String");
		ar.add('c');
		ar.add(12.5);

		System.out.println(ar.size());
		System.out.println(ar.get(1));
		System.out.println(ar);


		//Generics 
		//1. Integer ArrayList 
		ArrayList<Integer>ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("String"); //This will give error as only Integer can be given

		//2. String ArrayList 
		ArrayList<String>ar2 = new ArrayList<String>();
		ar2.add("Hello World");
		ar2.add("Am learning selenium");
		
		//3. Character ArrayList 
		ArrayList<Character>ar3 = new ArrayList<Character>();
		ar3.add('a');
		
		
		//4. Object Array ArrayList 
		ArrayList<Object>ar4 = new ArrayList<Object>();
	    ar4.add(new Object());
	    
	    //5. Car Array ArrayList 
	  		ArrayList<InheritanceUsingCar>ar5 = new ArrayList<InheritanceUsingCar>();
	  	    ar5.add(new InheritanceUsingCar());
	  	    ar5.add(new InheritanceUsingCar());
	  	    ar5.add(new InheritanceUsingCar());
	  	    
	  	    
	  	//6. Primitive Array ArrayList 
	  // ArrayList<int>ar6 = new ArrayList<int>(); Not allowed 
	  	    
	  	    
	  //iterator to Traverse
	  Iterator<InheritanceUsingCar>iterator=  ar5.iterator();
	   	 while (iterator.hasNext()){
	   		InheritanceUsingCar e1 = iterator.next();
	   		
	   	 }
	  	

	   //************************************
	    
	   	 
	   	//Add all
	   	ArrayList<String>ar6 = new ArrayList<String>();
	   	ar6.addAll(ar2);
	   	ar6.add("QTP");
	   	ar6.add("JAVA");
	   	
	   	System.out.println(ar6);
	   	
	   	
	   	//Retain - Common between Ar2 and A6
	    ar6.retainAll(ar2);	    
	    System.out.println(ar6);
	    
	    
	    //Remove All	    
	    ar2.removeAll(ar6);	    
	    System.out.println(ar6);
	    
	    
	    //*******
	    
	    ArrayList<String>aL = new ArrayList<String>();
		aL	.getClass();
		System.out.println(aL.getClass());
		System.out.println(aL.size());
		aL.add("1");
		aL.add("3");
		aL.add("2");
		aL.add("1");
		System.out.println(aL.size());
		System.out.println(aL);
		aL.add(2,"1");
		System.out.println(aL);
		for(String s : aL){
			//System.out.println(s);
			if (s.equals("2")){
			//	aL.add("its me");
			System.out.println(s);	
			}
		}
		
		Iterator<String> iteraL= aL.iterator();
			while (iteraL.hasNext()){
				if(iteraL.next()== "2"){
					aL.add("its me");
					
				}
			}
			System.out.println(aL);
	}


	    
	   	 
	}




