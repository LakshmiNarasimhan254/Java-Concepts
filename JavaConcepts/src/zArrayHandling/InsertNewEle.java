package zArrayHandling;

import java.util.Arrays;

public class InsertNewEle {
	
	public static void main(String[] args) {
		Integer array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
	      Arrays.sort(array);
	      printArray("Sorted array", array);
	      int index = Arrays.binarySearch(array, 2);
	      System.out.println("Found 2 @ " + index);
	      //InsertEleArray(array,-6,index);
	      printArray("new array", InsertEleArray(array,-6,index));
	}
	private static Integer[] InsertEleArray(Integer[] array, int i,  int index) {
		Integer newarray[] = new Integer[array.length+1];
		System.arraycopy(array, 0, newarray, 0, index);
		newarray[index]= i;
		System.arraycopy(array, index, newarray, index+1, array.length-index); 
		return newarray;
	}
	private static void printArray(String string, Integer[] array) {
		for (int i : array)
			System.out.println(i);
		
	}

}
