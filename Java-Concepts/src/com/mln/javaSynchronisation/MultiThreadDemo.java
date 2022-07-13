/*********************
 **Date:{date}*******
 *********************
 *********************/
package com.mln.javaSynchronisation;

/**
 ********************
 * @author laksh
 ********************
 **/

class DBmanipulation implements Runnable{

	synchronized public void run(){
		for(int i=0;i<5;i++)
		{		System.out.println("Updating DB " + i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Excelmanipulation implements Runnable{

	public void run(){
		for(int i=0;i<5;i++)
		{		System.out.println("Updating Excel " +i);
		         try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
							
		}
	}	
}

public class MultiThreadDemo  {

	//This Method is created to 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable dbm = new DBmanipulation();
		Runnable em = new Excelmanipulation();
		
		Thread t1 = new Thread(dbm);
		Thread t2 = new Thread(em);
		t1.start();
		Thread t3 = new Thread(dbm);
		t3.start();
		t2.start();
		
		System.out.println("Am complete");
	}

}
