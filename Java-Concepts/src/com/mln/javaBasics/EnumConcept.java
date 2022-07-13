/*********************
 **Date:{date}*******
 *********************
 *********************/
package com.mln.javaBasics;

/**
 ********************
 * @author laksh
 ********************
 **/

enum Level{
	BEGINNER("B"),INTERMEDIATE("I"),ADVANCED("A");
	private String abbr;
	Level(String ab){
		this.abbr =ab;	
	}
	String getAbbr(){
		return abbr;
	}
	
}
public class EnumConcept {

	//This Method is created to under enum

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Level l1 =Level.BEGINNER;
		Level l2 =Level.INTERMEDIATE;
		Level l3 =Level.ADVANCED;
		System.out.println(l1.getAbbr());
		System.out.println(l1);
		System.out.println(l1.toString());
		System.out.println(l1.ordinal());
		System.out.println(Level.valueOf("ADVANCED"));
	}

}
