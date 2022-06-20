package com.mnl.javaInterviewPrep;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int wordlenght = 0;
		List<String> words=new ArrayList<String>();

		words.add("Rat");
		words.add("Car");
		words.add("Below");
		words.add("Tast");
		words.add("Cried");
		words.add("Study");
		words.add("Thing");
		words.add("Chin");
		words.add("Grab");
		words.add("Act");
		words.add("Robed");
		words.add("Vase");
		words.add("Glean");
		words.add("Desserts");
		words.add("Tar");
		words.add("Arc");
		words.add("Elbow");
		words.add("State");
		words.add("Cider");
		words.add("Dusty");
		words.add("Night");
		words.add("Inch");
		words.add("Brag");
		words.add("Cat");
		words.add("Bored");
		words.add("Save");
		words.add("Angel");
		words.add("Streseed");

		List<List<String>> List1 = sub(words);
		List<List<String>> List2 = AnnAproach(words);

		for (List<String> s: List1){
			for (String s1: s){
				System.out.print(s1+" ");
			}
			System.out.println();
		}
		System.out.println("*********************");
		for (List<String> s: List2){
			for (String s1: s){
				System.out.print(s1+" ");
			}
			System.out.println();
		}

	}

	public static List<List<String>> sub(List<String>words ){
		List<List<String>> Words1 = new ArrayList<List<String>>();

		String ch1;
		String ch2;
		int iCount =0;

		for (int i=0 ;i<=words.size()-2;i++){
			boolean Result = false;
			ch1 = words.get(i);
			for (int j =1;j<=words.size()-1;j++){
				ch2 = words.get(j);
				if (ch1.length()==ch2.length()){
					if (!ch1.equalsIgnoreCase(ch2)){
						for (int k =0;k<=ch1.length()-1;k++)
							if (ch1.toLowerCase().contains(String.valueOf(ch2.charAt(k)).toLowerCase())){
								iCount=iCount+1;
							}
					}
					if (iCount==ch1.length())
					{	Result =true;
					List<String>s1 = new ArrayList<String>();
					s1.add(ch1);
					s1.add(ch2);
					Words1.add(s1);
					}
					iCount=0;
				}
			}
		}
		return Words1;
	}

	public static List<List<String>> AnnAproach(List<String>words ){
		List<List<String>> anagrampairs =new ArrayList<List<String>>();

		for (int i=0;i<words.size();i++){
			String word1 = words.get(i).toLowerCase();
			char[] c1 = (word1.toCharArray());
			for(int j=1;j<words.size()-1;j++){
				String word2 = words.get(j).toLowerCase();
				char[] c2 = (word2.toCharArray());
				if (word1.length()==word2.length()){
				if (!word1.equals(word2)){
					Arrays.sort(c1);
					Arrays.sort(c2);
					
					if (String.valueOf(c1).equalsIgnoreCase((String.valueOf(c2)))){
						List<String> anagrampair =new ArrayList<String>();
						anagrampair.add(word1);
						anagrampair.add(word2);
						anagrampairs.add(anagrampair);
					}
						
				}
				}
			
			}
		}


		return anagrampairs;

	}
}
