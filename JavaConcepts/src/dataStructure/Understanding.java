package dataStructure;



public class Understanding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Understanding Array
		//Declaration 
		int [] a; // 1
		String b[]; //2

		//Initialization
		a = new int[10];
		b = new String[]{ "a","b","c"}; 

		//Declaration & Initialization together 

		int[]a1 = new int[10];
		int b1[] = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
	

		System.out.println(a1[8]);
		
		
		for (int i : b1){
			System.out.println(i);
			//System.out.println(b1.toString());
		}
		
		int[] acopy = a.clone();
		
		System.out.println(b.toString());
		System.out.println(b.getClass());
		System.out.println(a.equals(acopy));

	}
}
