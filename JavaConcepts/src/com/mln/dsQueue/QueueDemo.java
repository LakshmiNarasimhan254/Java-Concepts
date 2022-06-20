/*********************
 **Date:{date}*******
 *********************
 *********************/
package com.mln.dsQueue;

import java.util.Arrays;

/**
 ********************
 * @author laksh
 ********************
 **/
public class QueueDemo {

	class Queue{
		private String[] qArray;
		private int qSize;
		private final int soQ = 0;
		int eoQ;

	Queue(int qSize){
			super();
			this.qSize = qSize;
			qArray= new String[qSize];
			this.eoQ =qArray.length-1;
			;

		}	

	protected  void enQueue(String qele){
			if (eoQ<=qSize-1){
				for (int i=0; i<=eoQ; i++){
					if (qArray[i]==null){
						qArray[i]=qele;
						break;
					}

				}

			}else{
				System.out.println("Queue is full");
			}
		}
	protected	void printQueue(){
			for (int i =0; i<=qArray.length-1;i++ ){
				if (qArray[i] != null){
					System.out.print(qArray[i]+" ");
				}
			}
			System.out.println();
		}

	protected	void deQueue(){
			for (int i =0; i<=qArray.length-2;i++ ){
				if(qArray[soQ]!=null){
					qArray[i] =qArray[i+1];
				}else{
					System.out.println("Onnumey illa ,apprum ethukku board");
					break;
				}
				qArray[qArray.length-1]=null;
			}

		}
	}

		//This Method is created to Queue class

		public static void main(String[] args) {
			
		//	System.out.println(args[0]);
			// TODO Auto-generated method stub
			QueueDemo qd = new QueueDemo();
			Queue q = qd.new Queue(10);
			q.enQueue("Ingu");
			q.enQueue("nalla");
			q.enQueue("Meenkal");
			q.enQueue("virkapadum");		
			q.printQueue();
			q.deQueue();
			q.printQueue();
			q.deQueue();
			q.printQueue();
			q.deQueue();
			q.printQueue();
			q.deQueue();
			q.printQueue();



		}


	}
