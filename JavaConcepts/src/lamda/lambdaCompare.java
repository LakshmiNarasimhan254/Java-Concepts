package lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import arrayHandling.Person;

public class lambdaCompare {

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

		Comparator<Person> cmp =  (p1, p2) ->  p1.strLastName.compareTo(p2.strLastName);

		Collections.sort(people, cmp);
		//PrintAll(people);
		//Printlastname(people, "M");
		//Printlastname(people, "R");
		Printlastname Pl = (people1,strbegin )-> {
			for(Person p: people1){
				if (p.getStrLastName().startsWith(strbegin)){
					System.out.println(p.strFirstName +p.strLastName+p.iAge);
				}
		}};
		
		Pl.PntLstname(people, "R");
		
		
	}
	private static void PrintAll(List<Person> people) {
		for(Person p: people){
			System.out.println(p.strFirstName +p.strLastName+p.iAge);
		}
	}

	private static void Printlastname(List<Person> people, String strbegin) {
		for(Person p: people){
			if (p.getStrLastName().startsWith(strbegin)){
				System.out.println(p.strFirstName +p.strLastName+p.iAge);
			}
		}

	}
	@FunctionalInterface
		public interface Printlastname {
			void PntLstname(List<Person>people ,String Str);
	}
}
