/*********************
 **Date:{date}*******
 *********************
 *********************/
package com.mln.dsQueue;

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
		Queue q  =qd.new Queue(15);
		q.enQueue("ithu");
		q.printQueue();
	}

}
