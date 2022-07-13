/*********************
 **Date:{date}*******
 *********************
 *********************/
package com.mln.javaOOPS2;

import java.util.Arrays;

/**
 ********************
 * @author laksh
 ********************
 **/

class Employee implements Comparable<Employee> {	
	private static int iEmpNo= 134000;
	private String strName,strRole;	
	private double iSalary;
	private final double iHikepercent =.10 ;
	/**
	 * Constructor 
	 */

	Employee(String strName, int strSalary, String strRole){
		iEmpNo=iEmpNo+1;
		this.strName =strName;
		this.iSalary=strSalary;
		this.strRole =strRole;

	}
	public String getName() {
		return strName;
	}
	public void setName(String strName) {
		this.strName = strName;
	}	
	public double getSalary() {
		return iSalary;
	}
	public void setSalary(double iSalary) {
		this.iSalary = iSalary;
	}	
	public String getRole() {
		return strRole;
	}
	public void seRole(String strRole) {
		this.strRole = strRole;
	}	
	public int getEmpNo() {
		return iEmpNo;
	}
	public void setHike(){
		System.out.println(this.getSalary());
		this.setSalary((this.getSalary()+ (this.getSalary()*(iHikepercent))));
	}
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */

	public int compareTo(Employee e) {

		if (this.equals(e)){
			return 0;
		}
		if(this.iSalary==e.iSalary){
			return 0;
		}

		if(this.iSalary>e.iSalary){
			return 1;	
		}


		return -1;

	}
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	
}

class Manager extends Employee{

	private final double iHikepercent =.25 ;


	/**
	 * @param strName
	 * @param strSalary
	 * @param strRole
	 */
	Manager(String strName, int iSalary) {
		super(strName, iSalary, "Manager");
		// TODO Auto-generated constructor stub
	}

	public void setHike(){
		System.out.println(super.getSalary());
		super.setSalary(super.getSalary() +(super.getSalary()*(iHikepercent)));
	}
}



public class InterfaceDemo  {
	public static void main(String[] args) {
		Employee e1 = new Employee("Ramesh",25000,"Clerk");

		System.out.println("Before Hike");
		System.out.println("**************");
		System.out.println("EmpName:" +e1.getName());
		System.out.println("EmpNo:" +e1.getEmpNo());
		System.out.println("Role:" +e1.getRole());
		System.out.println("Salary:" +e1.getSalary());

		System.out.println("--------------------");

		Employee e2 = new Manager("Suresh",50000);
		System.out.println("EmpName:" +e2.getName());
		System.out.println("EmpNo:" +e2.getEmpNo());
		System.out.println("Role:" +e2.getRole());
		System.out.println("Salary:" +e2.getSalary());

		//e1.setHike();
		e2.setHike();

		System.out.println("After  Hike");
		System.out.println("**************");
		System.out.println("EmpName:" +e1.getName());
		System.out.println("EmpNo:" +e1.getEmpNo());
		System.out.println("Role:" +e1.getRole());
		System.out.println("Salary:" +e1.getSalary());
		System.out.println("--------------------");
		System.out.println("EmpName:" +e2.getName());
		System.out.println("EmpNo:" +e2.getEmpNo());
		System.out.println("Role:" +e2.getRole());
		System.out.println("Salary:" +e2.getSalary());

		Employee e3 = new Employee("Satish",35000,"Senior Clerk");
		Employee e4 = new Employee("Mahesh",40000,"Assitant Manager");
		Employee e5 = new Employee("Rajesh",25000,"Clerk");


		Employee[] Employees = new Employee[5];
		Employees[0]= e1;
		Employees[1] =e2;
		Employees[2] =e3;
		Employees[3] =e4;
		Employees[4] =e5;
		Arrays.sort(Employees);
		
		for (Employee e :Employees){
			System.out.println("--------------------");
			System.out.println(e.getName() + ":" + e.getSalary());
			
		}
		
	


	}




}
