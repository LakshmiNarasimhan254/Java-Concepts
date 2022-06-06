package ArrayHandling;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
	      Arrays.sort(array);
	      printArray("Sorted array", array);
	      int index = Arrays.binarySearch(array, 2);
	      System.out.println("Found 2 @ " + index);

	}

	private static void printArray(String string, int[] array) {
		for (int i : array)
			System.out.println(i);
		
	}

}
