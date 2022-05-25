package arrLearning;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ArrayLst_exp {
	public static void main(String[] args) {	
			List<Integer> Val= arl();
			//System.;out.println(Val);

			Collections.sort(Val);
			for (Integer i : Val){
				System.out.println(i);
			}
			//IterationMethods();		
	}
	public static ArrayList<Integer> arl(){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(0, 3);
		numbers.add(5);
		numbers.add(1);
		return numbers;
	}
	public static void IterationMethods(){
		Iterator<Integer> itrInt = arl().iterator();
		while(itrInt.hasNext()){
			Integer i = itrInt.next();
			System.out.println(i);

		}

	}



}