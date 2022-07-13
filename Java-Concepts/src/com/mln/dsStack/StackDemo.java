/*********************
 **Date:{date}*******
 *********************
 *********************/
package com.mln.dsStack;

import java.util.Collections;
import java.util.Stack;

/**
 ********************
 * @author laksh
 ********************
 **/
public class StackDemo {
	public static void main(String[] args) {
		Stack<String> s1=  new Stack<String>();
		s1.push("Virkapadum");
		s1.push("Meenkal");
		s1.push("nalla");
		s1.push("ingu");
		//System.out.println(s1);
		Collections.reverse(s1);
		//System.out.println(s1);
		System.out.println(s1.pop());
		//System.out.println(s1.elementAt(2));
		//System.out.println(s1);
	}
	
}
