package arrLearning;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayLearning {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Lakshmi","Mohan", 34),
				new Person("Archana","Lakshmi",30),
				new Person ("Rishab","Rao",3),
				new Person("Brindha","Mohan",62),
				new Person ("Mohan","Narayana",63),
				new Person ("Sujatha","Sathya",40),
				new Person ("Sathya","Murali",44)					
				);		
		Collections.sort(people, new Comparator<Person>(){

			@Override
			public int compare(Person o1, Person o2) {

				return o1.strLastName.compareTo(o2.strLastName);
			}

		});
		PrintAll(people);
		Printlastname(people, "M");
	}
	private static void PrintAll(List<Person> people) {
		for(Person p: people){
			System.out.println(p.strFirstName +p.strLastName+p.iAge);
		}
	}
	
	private static void Printlastname(List<Person> people, String strbegin) {
		for(Person p: people){
				if (p.strLastName.startsWith(strbegin)){
			System.out.println(p.strFirstName +p.strLastName+p.iAge);
		}
		}

	}
}
