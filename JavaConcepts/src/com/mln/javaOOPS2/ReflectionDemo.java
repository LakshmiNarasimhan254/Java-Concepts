/*********************
 **Date:{date}*******
 *********************
 *********************/
package com.mln.javaOOPS2;

import java.lang.reflect.Method;

/**
 ********************
 * @author laksh
 ********************
 **/
public class ReflectionDemo {

	//This Method is created to understand reflection concept 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW Obj = new BMW();
		Class cls = Obj.getClass();
		String sClassName = cls.getName();
		Method[] methods = cls.getMethods();
		
		
		//To get the constructor name 		
		try {
			System.out.println("The Constructor in " + sClassName + "are :"  +cls.getDeclaredConstructor(null));
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("The Methods in " + sClassName + "are :" );
		
		for (Method m : methods){
			String sMethodName= m.getName();
			
			System.out.println(sMethodName );
		}
		

	}

}
