package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>ar1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11));
		ArrayList<Integer>ar2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		System.out.println(ar1.containsAll(ar2));

	}

}
