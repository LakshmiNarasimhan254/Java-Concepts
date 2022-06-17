package java.OOPSConceptPart1;

public class WrapperClassConcept {

	
	public static void main(String[] args) {
		String sVar1 ="100";
		String sVar2 ="100a";
		System.out.println(sVar1+5);
		
		
		//data conversion  --String to Int
		int iVar1 = Integer.parseInt(sVar1);
		System.out.println(iVar1+5);
		
		int iVar2 = Integer.parseInt(sVar2);//java.lang.NumberFormatException: For input string: "100a"
		System.out.println(iVar2+5);
		
		//data conversion  --String to double
		double dVar2 = Double.parseDouble(sVar1);
		System.out.println(dVar2+5);
		
		//data conversion  --String to char[]
		char[] cVar3 = sVar1.toCharArray();
		System.out.println(cVar3);
		
		//data conversion --String to boolean
		boolean bVar4 = Boolean.parseBoolean(sVar1);
		System.out.println(bVar4);
		
		//data conversion --int to String
		String sVar5= String.valueOf(iVar1);
		System.out.println(sVar5+5);
		
		
		
		
		
	}
}
