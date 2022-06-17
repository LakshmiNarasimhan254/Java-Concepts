package ds.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SyncHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer>StudentMark1 = new HashMap<>();
		StudentMark1.put("Ramesh", 50);
		StudentMark1.put("Suresh", 65);
		StudentMark1.put("Magesh", 34);
		StudentMark1.put("Satish", 18);
		StudentMark1.put("Ajish", 99);
		
	Map<String,Integer>StudentMark2= Collections.synchronizedMap(StudentMark1);
	
	

	}

}
