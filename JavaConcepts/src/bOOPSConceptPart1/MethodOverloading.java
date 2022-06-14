package bOOPSConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(1,2);
		obj.sum(1,2,3);
		obj.main(1);//main method can be overloaded 
	}
	
	public static void main(int p) {
		MethodOverloading obj = new MethodOverloading();
		//obj.sum();
		obj.sum(1,2);
		//obj.sum(1,2,3);
	}
	//Method overloading - When method name is same with different arguments or different number of arguments with in the same class
	public void sum(){
		int iVar1 =10;
		int iVar2 =20;
		int iVar3 =iVar1+iVar2;
		System.out.println(iVar3);
	}

	public void sum(int iVar1,int iVar2 ){
		int iVar3 =iVar1+iVar2;
		System.out.println(iVar3);
	}

	public boolean sum(int iVar1,int iVar2 ,int iVar3){
		boolean bresult = false;
		if (iVar3 ==iVar1+iVar2){
			bresult = true;
		}
		return bresult;
	}


}
