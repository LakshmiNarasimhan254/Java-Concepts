/*********************
 **Date:{date}*******
 *********************
 *********************/
package com.mln.dsQueue;

import java.util.LinkedList;


import com.mln.dsQueue.QueueDemo.Queue;

/**
 ********************
 * @author laksh
 ********************
 **/
public class QueueDemo2 {

	//This Method is created to 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueDemo qd = new QueueDemo();
		Queue q1  =qd.new Queue(15);
		q1.enQueue("ithu");
		q1.printQueue();
		
		java.util.Queue <String> q2 = new LinkedList();
		q2.add("a");
		q2.add("b");	
		q2.add("c");
		q2.add("d");
		
		System.out.println(q2);
		System.out.println(q2.remove());
		System.out.println(q2.peek());
		System.out.println(q2.poll());
		
	}

}
