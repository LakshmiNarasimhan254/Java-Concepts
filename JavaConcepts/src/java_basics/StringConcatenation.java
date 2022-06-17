package java_basics;

public class StringConcatenation {
	
	//This is an important program on how concatenation works;

	public static void main(String[] args) {
		int iVar1 = 10;
		int iVar2 = 20;
		double dVar1 = -1.2;
		double dVar2 = 0.0;
		double dVar3 = 1.5678;
		double dVar4 = 100;
		String sVar1 ="Hello";
		String sVar2 ="World";
		System.out.println(iVar1+iVar2);
		System.out.println(sVar1+sVar2);
		System.out.println(iVar1+iVar2+sVar1+sVar2);
		System.out.println(sVar1+sVar2+iVar1+iVar2);
		System.out.println(sVar1+sVar2+(iVar1+iVar2));
		System.out.println(sVar1+sVar2+(dVar1+dVar3));
	}

}
