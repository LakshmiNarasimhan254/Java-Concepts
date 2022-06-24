/*********************
 **Date:{date}*******
 *********************
 *********************/
package com.mln.javaOOPS1;

/**
 ********************
 * @author laksh
 ********************
 **/
class Dept  implements Cloneable{
	public String DeptName;
	public int DeptID;
	
	Dept(int DeptID,String DeptName){
		this.DeptID =DeptID;
		this.DeptName = DeptName;
	}
	public Object clone() throws CloneNotSupportedException{
		Object o = super.clone();		
		return o;	
	}
	
}


class Student implements Cloneable{
	public String StudentName;
	public int StudentID;
	public Dept dept;
	
	Student(int StudentID,String StudentName,Dept dept){
		this.StudentID =StudentID;
		this.StudentName = StudentName;
		this.dept = dept;
	}
	
	public Object clone() throws CloneNotSupportedException{
		Object o = super.clone();		
		return o;	
	}
	
	

}

public class CloneDemo extends Object {

	//This Method is created to 

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Dept d1 = new Dept(1, "Maths");
		Dept d2 = new Dept(2, "Science");
		
		Student s1 = new Student(1, "Ramesh", d1);
		Student s2 = (Student)s1.clone();
		s2.dept = (Dept) s2.dept.clone();
		
		
		s1.dept.DeptID =2;
		s1.dept.DeptName ="Science";
		
		System.out.println(s1.StudentID + " "+ s1.StudentName +" "+ s1.dept.DeptID +" "+ s1.dept.DeptName);
		System.out.println(s2.StudentID + " "+ s2.StudentName +" "+ s2.dept.DeptID +" "+ s2.dept.DeptName);
	}

}
