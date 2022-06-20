package com.mln.javaStreams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.mln.dsArray.Person;

public class StreamLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> people = Arrays.asList(
				new Person("Lakshmi","Mohan", 34),
				new Person("Archana","Lakshmi",30),
				new Person ("Rishab","Rao",3),
				new Person("Brindha","Mohan",62),
				new Person ("Mohan","Narayana",63),
				new Person ("Sujatha","Sathya",40),
				new Person ("Sathya","Murali",44)					


				);		
		Predicate<Person>P = (s)-> s.strLastName.startsWith("M");
		Consumer<Person> p = p1-> System.out.println(p1.strFirstName +p1.strLastName+p1.iAge);
		//people.stream().filter(P).forEach(p);
		Iterator<Person> iter = people.stream().iterator();
		
		while (iter.hasNext()){
			Person Psn = iter.next();
			p.accept(Psn);
		}
		
	}



}
