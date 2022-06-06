package dataStructure;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
