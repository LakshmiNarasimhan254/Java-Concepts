package ds.hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer>StudentMark1 = new HashMap<>();
		StudentMark1.put("Ramesh", 50);
		StudentMark1.put("Suresh", 65);
		StudentMark1.put("Magesh", 34);
		StudentMark1.put("Satish", 18);
		StudentMark1.put("Ajish", 99);
		
		
		HashMap<String,Integer>StudentMark2 = new HashMap<>();
		StudentMark2.put("Ajish", 99);
		StudentMark2.put("Suresh", 65);
		StudentMark2.put("Ramesh", 50);
		StudentMark2.put("Magesh", 34);
		StudentMark2.put("Satish", 18);
		
		
		
		HashMap<String,Integer>StudentMark3 = new HashMap<>();
		StudentMark3.put("Ajish", 99);
		StudentMark3.put("Suresh", 65);
		StudentMark3.put("Ramesh", 50);
		StudentMark3.put("Satish", 18);
		
		
		HashMap<String,Integer>StudentMark4 = new HashMap<>();
		StudentMark4.put("Ajish", 99);
		StudentMark4.put("Suresh", 65);
		StudentMark4.put("Ramesh", 50);
		StudentMark4.put("Satish", 18);
		StudentMark4.put("brijesh", 18);
		
		
		//compare 2 Maps 
		System.out.println(StudentMark2.equals(StudentMark1));
		System.out.println(StudentMark2.equals(StudentMark3));
		
		//compare 2 map's key
		System.out.println(StudentMark2.keySet().equals(StudentMark1.keySet()));
		System.out.println(StudentMark2.keySet().equals(StudentMark3.keySet()));
		
		
		//compare 2 map's entryset
		System.out.println(StudentMark2.entrySet().equals(StudentMark1.entrySet()));
		System.out.println(StudentMark2.entrySet().equals(StudentMark3.entrySet()));
		
		
		
		HashSet<String> combinekeys = new HashSet<>(StudentMark2.keySet());
		combinekeys.addAll(StudentMark4.keySet());
		System.out.println(combinekeys);
		
		combinekeys.removeAll(StudentMark2.keySet());
		System.out.println(combinekeys);
		
		System.out.println(StudentMark2.values().equals(StudentMark2.values()));
		
		
	}

}
