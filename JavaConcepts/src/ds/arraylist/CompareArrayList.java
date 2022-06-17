package ds.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>ar1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,12,10,11));
		ArrayList<Integer>ar2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		System.out.println(ar1.containsAll(ar2));
		
		
		//1.Sort and equal
		//Collections.sort(ar1);
		System.out.println(ar1);
		//Collections.sort(ar2);
		System.out.println(ar2);
		System.out.println(ar1.equals(ar2));
		
		//Find out the addtional element 
		//ar1.removeAll(ar2);
		//System.out.println(ar1);
		
		ar2.removeAll(ar1);
		System.out.println(ar2);

	}

}
