package arrLearning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Datastructure_learning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> list = new ArrayList<Object> (); 
		list.add("1");
		list.add("1");
		list.add(null);
		list.add(1, "new");
		System.out.println("The Contents of List " +list );
		System.out.println("The Size of List " +list.size() );
		for (Object i : list){
			System.out.println(i);
		}
	
	
		Set<Object> set = new HashSet<Object> (); 
		set.add(2);
		set.add(3);
		set.add(1);
		set.add(null);
		System.out.println("The Contents of SET " +set );
		System.out.println("The Size of SET " +set.size() );
		for (Object i : set){
			System.out.println(i);
		}
		

	}

}
