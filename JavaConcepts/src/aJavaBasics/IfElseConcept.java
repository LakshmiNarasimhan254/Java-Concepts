package aJavaBasics;

public class IfElseConcept {
	public static void main(String[] args) {

		int iVar1 = 10;
		int iVar2 = 20;

		if (iVar1>iVar2){
			System.out.println(iVar1+" is greater than "+iVar2);
		}
		else{
			System.out.println(iVar2+" is greater than "+iVar1);
		}

		int iVar3 = 100;
		int iVar4 = 200;

		if (iVar3==iVar4){
			System.out.println(iVar3+" is equal to "+iVar4);
		}
		else{
			System.out.println(iVar3+" is not equal to "+iVar4);
		}
		
		
		char cVar1 ='c';
		char cVar2 ='c';
		if (cVar1==cVar2){
			System.out.println(cVar1+" is equal to "+cVar2);
		}
		else{
			System.out.println(cVar1+" is not equal to "+cVar2);
		}
		String sVar1 = "c";
		String sVar2 = "c";
		if (sVar1==sVar2){
			System.out.println(sVar1+" is equal to "+sVar2);
		}
		else{
			System.out.println(sVar1+" is not equal to "+sVar2);
		}
		
		int iVar5 = 100;
		int iVar6 = 300;
		int iVar7 = 50;
		if ((iVar5>iVar6)&(iVar5>iVar7)){
			System.out.println(iVar5+" is the greatest.");
		}else if (iVar6>iVar7){
			System.out.println(iVar6+" is the greatest.");
		}else{
			System.out.println(iVar7+" is the greatest.");
		}
	}

}
