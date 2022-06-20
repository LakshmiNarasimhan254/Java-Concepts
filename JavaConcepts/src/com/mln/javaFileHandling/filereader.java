package com.mln.javaFileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;



public class filereader {
	
	static File myobj;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stu
		
			//ReadfromFile("MyTxt.txt");
			ReadfromFileScanner("MyTxt.txt");
				
					
				}

	private static void ReadfromFileScanner(String string) throws FileNotFoundException {
		File file = new File(string);
		Scanner sc = new Scanner(file);
		String word ;
		String line = "" ;
			int wordCount = 0;
			int characterCount = 0;
			 int sentenceCount = 0;
			 int paraCount = 0;
			 int whiteSpaceCount = 0;
		
				while(sc.hasNextLine()){
					line=sc.nextLine();
				    System.out.println(line);
					if (line.equals("")) {
		                paraCount += 1;
		            }
					
					else {
		                characterCount += line.length();
		                String words[] = line.split(" ");
		                wordCount += words.length;
		                whiteSpaceCount += wordCount - 1;
		                String sentence[] = line.split("[!?.:]+");
		                sentenceCount += sentence.length;
		            }
				}
					 
					System.out.println("Total word count = "+ wordCount);
			        System.out.println("Total number of sentences = "+ sentenceCount);
			        System.out.println("Total number of characters = "+ characterCount);
			       System.out.println("Number of paragraphs = "+ paraCount);
			       System.out.println("Total number of whitespaces = "+ whiteSpaceCount);	 
					

					
				}
				
				
	

	private static void ReadfromFile(String string) throws IOException {
		File file = new File(string);
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String line;
		
		int wordCount = 0;
        int characterCount = 0;
        int paraCount = 0;
        int whiteSpaceCount = 0;
        int sentenceCount = 0;
		
		while((line = br.readLine())!=null)	{
			if (line.equals("")) {
                paraCount += 1;
            }
			
			else {
                characterCount += line.length();
                String words[] = line.split("\\s+");
                wordCount += words.length;
                whiteSpaceCount += wordCount - 1;
                String sentence[] = line.split("[!?.:]+");
                sentenceCount += sentence.length;
            }
			
		}
		System.out.println("Total word count = "+ wordCount);
        System.out.println("Total number of sentences = "+ sentenceCount);
        System.out.println("Total number of characters = "+ characterCount);
        System.out.println("Number of paragraphs = "+ paraCount);
        System.out.println("Total number of whitespaces = "+ whiteSpaceCount);
		
		
	}
			



}
