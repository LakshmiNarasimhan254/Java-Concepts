package java_basics;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		//2D int Array 
		int[][] i2darrayVar =new int [2][3];
		//To Write values in Array
		for (int iVar1=0 ; iVar1 < i2darrayVar.length;iVar1++){
			for (int iVar2=0 ; iVar2 < i2darrayVar[0].length;iVar2++){
				i2darrayVar[iVar1][iVar2]= iVar1+iVar2;
			}
		}

		//To Print values in Array
		for (int iVar1=0 ; iVar1 < i2darrayVar.length;iVar1++){
			for (int iVar2=0 ; iVar2 < i2darrayVar[0].length;iVar2++){
				System.out.println(i2darrayVar[iVar1][iVar2]);
			}
		}

	}
}
