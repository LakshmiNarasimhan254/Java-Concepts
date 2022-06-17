package ds.arraylist;

import java.util.ArrayList;

public class VirtualCapacity {
	
	
	public static void main(String[] args) {
		 
		ArrayList<Object> ar1 = new ArrayList<Object>();
		System.out.println(ar1.size());		
		ar1.add(100);
		System.out.println(ar1.size());	
		ar1.add("String");
		ar1.add('c');
		ar1.add(12.5);
		ar1.add(1);
		ar1.add(1);
		ar1.add(1);
		ar1.add(1);
		ar1.add(1);
		ar1.add(1);
		ar1.add(1);
		System.out.println(ar1.size());	
		ar1.add(1);
		ar1.add(1);
		ar1.add(1);
		ar1.add(1);
		ar1.add(1);
		ar1.add(1);
		System.out.println(ar1.size());	
	}

}
