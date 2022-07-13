/*********************
 **Date:{date}*******
 *********************
 *********************/
package com.mln.javaLamda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 ********************
 * @author laksh
 ********************
 **/
public class LambdaDemo {

	//This Method is created to different types of Functioan interface 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//accepts one argument and does not return anything 
		Consumer<String> c1= (s)-> System.out.println(s);		
		c1.accept("Consumer");
					
		Consumer<Integer> c2= (i)-> System.out.println(fact(i));		
		c2.accept(3);
		Consumer<Integer> c3= (i)-> { 
										i= i+3;
										System.out.println(i);										
									};		
		c3.accept(4);
		
		//biConsumer accepts 2 arguments and does not return anything 		
		BiConsumer<Integer,Integer> c4= (i,j)-> System.out.println(i+j);
        c4.accept(4,5);
		
        
        Predicate<Integer> p1 = (i)-> i>0;
        System.out.println(p1.test(3));
        
        BiPredicate<Integer,Integer>p2 = (i,j)-> i>j;
        System.out.println(p2.test(3,2));
		
        
        Function<Integer,Integer> f1=(i)-> i+3;
        System.out.println(f1.apply(3));
        
        
        BiFunction<Integer,Integer,Integer>f2 = (i,j)->i+j;
        System.out.println(f2.apply(3,2));
        
        Supplier s1 = ()-> "Hello World";
        System.out.println(s1.get());
	}

	//This Method is created to 
	 
	private static Integer fact(Integer i) {
		// TODO Auto-generated method stub
	     		int  Fact=1;
				if (i!=0){
				
					Fact =i*fact(i-1);
				// TODO Auto-generated method stub
				}
				return Fact;
		}
	}


