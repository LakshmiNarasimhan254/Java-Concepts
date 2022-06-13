package arrayHandling;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrary {
	public static void main(String[] args) {
		
		String strOriginal = "ABCDEFGHIJKLMNOPQRSTUVWXXYZ";
		char [] ChrArray = strOriginal.toCharArray();
		List<Character> list = new ArrayList<Character>();
		for (char c: ChrArray){
			list.add(c);
		}
		Collections.reverse(list);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}


}
