package aJavaBasics;

public class ArrayConcept {
	public static void main(String[] args) {

		//Array is to store similar data type variables -To overcome this problem ,we use object array 
		//Array is always fixed size -To overcome this problem collections : ArrayList,HashTables,List etc: Dynamic Array 

		//int Array 		
		int[] iarrayVariable =new int[4];

		//To Print the Size of Array 
		System.out.println(iarrayVariable.length);

		System.out.println("********");

		//To Print add the values in Array
		for (int iIterator=0 ; iIterator < iarrayVariable.length;iIterator++){
			System.out.println(iarrayVariable[iIterator]);
		}
		System.out.println("********");

		//To Write values in Array
		for (int iIterator=0 ; iIterator < iarrayVariable.length;iIterator++){
			iarrayVariable[iIterator]=iIterator*5;
		}

		//To Print add the values in Array
		for (int iIterator=0 ; iIterator < iarrayVariable.length;iIterator++){
			System.out.println(iarrayVariable[iIterator]);
		}
		System.out.println("********");

		//double Array 	
		double[] darrayVariable =new double[3];
		//To Write values in Array
		for (int iIterator=0 ; iIterator < darrayVariable.length;iIterator++){
			darrayVariable[iIterator]=iIterator*.5;
		}		
		//To Print add the values in Array
		for (int iIterator=0 ; iIterator < darrayVariable.length;iIterator++){
			System.out.println(darrayVariable[iIterator]);
		}
		System.out.println("********");

		//char Array
		char[] carrayVariable =new char[3];
		//To Write values in Array
		for (int iIterator=0 ; iIterator < carrayVariable.length;iIterator++){
			carrayVariable[iIterator]=(char)(iIterator +65);
		}
		//To Print add the values in Array
		for (int iIterator=0 ; iIterator < carrayVariable.length;iIterator++){
			System.out.println(carrayVariable[iIterator]);
		}
		System.out.println("********");

		//String Array
		String[] sarrayVariable =new String[3];
		//To Write values in Array
		for (int iIterator=0 ; iIterator < sarrayVariable.length;iIterator++){
			sarrayVariable[iIterator]=(char)(iIterator +65)+ "-String";
		}
		//To Print add the values in Array
		for (int iIterator=0 ; iIterator < sarrayVariable.length;iIterator++){
			System.out.println(sarrayVariable[iIterator]);
		}
		System.out.println("********");
		//Object Array - This is used to store different data type
		//To Write values in Array
		Object[] oarrayVariable =new Object[4];
		oarrayVariable[0]="Lakshmi";
		oarrayVariable[1] = 2.5;
		oarrayVariable[2] =-1;
		oarrayVariable[3] ='c';
		
		
		//To Print add the values in Array
		for (int iIterator=0 ; iIterator < oarrayVariable.length;iIterator++){
			System.out.println(oarrayVariable[iIterator] + " ---> This is of type:  " + oarrayVariable[iIterator].getClass());
		}

	}

}
