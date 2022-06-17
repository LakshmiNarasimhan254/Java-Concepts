package ds.hashmap;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialization {

	// Static Map
	public static HashMap<String,Integer>map3;

	static{
		map3 =new HashMap<String, Integer>();
		map3.put("Srinath", 100); 
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 . Using HashMap class
		HashMap<String,Integer>map1= new HashMap();

		//2 .Using Map Interface
		Map<String,Integer>map2= new HashMap();

		//3. immutableMap with one one single entry 
		Map<String,Integer>map4= Collections.singletonMap("test", 100);

		//JDK8
		Map<String,String>map5 = Stream.of(new String[][]{
			{"Tom","A Grade"},
			{"Naveen","A+ Grade"},
		}).collect(Collectors.toMap(data->data[0],data->data[1]));

	}
}


