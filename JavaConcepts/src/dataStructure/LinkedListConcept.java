package dataStructure;

import java.util.Iterator;
import java.util.LinkedList;



public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll =new LinkedList<String>();
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("Cypress");
		ll.add("UFT");
		System.out.println(ll);		
		ll.addFirst("Macro");
		System.out.println(ll);
		ll.addLast("AI");
		System.out.println(ll);
		System.out.println(ll.get(1));
		ll.set(1, "UFT");		
		System.out.println(ll);
		ll.remove();
		System.out.println(ll);
		ll.removeLastOccurrence("UFT");
		System.out.println(ll);


		//iterating using for loop
		for (int n = 0;n<ll.size();n++){
			System.out.println(ll.get(n));			
		}

		System.out.println("**********");

		//iterating using advance for loop/for each
		for (String n : ll){
			System.out.println(n);			
		}

		System.out.println("**********");

		//iterating using iterator
		Iterator<String> it = ll.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("**********");
		
		//using While loop
		int n=0;
		while(n<ll.size()){
			System.out.println(ll.get(n));		
			n++;


		}
	}

}
