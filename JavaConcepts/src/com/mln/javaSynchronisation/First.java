package com.mln.javaSynchronisation;

public class First {
	synchronized public void display(String msg)
	  {
	    System.out.print ("["+msg);
	    try
	    {
	      Thread.sleep(1000);
	    }
	    catch(InterruptedException e)
	    {
	      e.printStackTrace();
	    }
	    System.out.println ("]");
	  }

}
