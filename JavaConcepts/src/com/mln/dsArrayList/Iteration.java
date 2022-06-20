package com.mln.dsArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteration {

	public static void main(String[] args) {


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

		System.out.println("Iteration through for loop");
		for (int i=0;i<aL.size();i++){
			System.out.println(aL.get(i));
		}
		
		System.out.println("Iteration through  advanced for loop");
		for(String s : aL){
			//System.out.println(s);
			if (s.equals("2")){
				//	aL.add("its me");
				System.out.println(s);	
			}
		}

		System.out.println("Iteration through iterator");
		Iterator<String> iteraL= aL.iterator();
		while (iteraL.hasNext()){
			System.out.println(iteraL.next());	
		}
		
		System.out.println("Direct Print of ArrayList");
		System.out.println(aL);
	}

}



