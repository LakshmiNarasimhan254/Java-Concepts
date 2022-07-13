/*********************
 **Date:{date}*******
 *********************
 *********************/
package com.mln.dsPriorirtyQueue;

import java.util.PriorityQueue;


/**
 ********************
 * @author laksh
 ********************
 **/

class Employee implements Comparable<Employee> {	
	private static int iEmpNo= 134000;
	private  int iEmpNos= 134000;
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
		this.iEmpNos =iEmpNo;
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
	public void setRole(String strRole) {
		this.strRole = strRole;
	}
	public int getEmpNo() {
		return this.iEmpNos ;
	}
	
		
	
	public void setHike(){
		System.out.println(this.getSalary());
		this.setSalary((this.getSalary()+ (this.getSalary()*(iHikepercent))));
	}
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
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

public class PriorityQueueConcept {

	//This Method is created to 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Employee> q =new PriorityQueue();
		q.add(new Employee("Ramesh", 5000, "Clerk"));
		q.add(new Employee("Suresh", 2500, "Peon"));
		q.add(new Employee("Mahesh", 10000, "Supervisor"));
		
		for (Employee e : q){
		System.out.print(e.getEmpNo()+ ",");
		System.out.print(e.getName()+"," );
		System.out.print(e.getSalary());
		System.out.println();
		}
	}

}
