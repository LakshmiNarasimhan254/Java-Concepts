package com.mln.javaFileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;


public class FileLearning {
	static File myobj;
	public static void main(String[] args) {
		CreateFile("MyTxt.txt");
		WriteFileWritter("MyTxt.txt","My appended first text is what");
		WriteFileOutputStream("MyTxt.txt","My appended second text is what");
		WriteFileniofiles("MyTxt.txt","My appended third text is what");
		for (String s : ReadfromFile("MyTxt.txt")){
			System.out.println(s);
			
		}
	}	

	public static  void CreateFile(String spath){
		myobj = new File(spath);		
		try {
			if(myobj.exists()){
				System.out.println("File already existis in " +myobj.getAbsolutePath());
			}else {
				myobj.createNewFile();
				System.out.println("File created in " +myobj.getAbsolutePath());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	//Write to File using FileWritter class
	public static  boolean WriteFileWritter(String spath, String stxt){
		myobj = new File(spath);
		boolean result= false;
		try {
			if(myobj.exists()){
				if (myobj.canWrite()){
					FileWriter fwobj = new FileWriter(myobj, true);
					BufferedWriter bw = new BufferedWriter(fwobj);
					bw.write(stxt);	
					bw.newLine();
					bw.close();
					fwobj.close();
					result= true;
				}		

			}
		} catch (IOException e) {
			e.printStackTrace();
		}		

		return result;	
	}
	
	
	//Write to File using FileOutputStream class
	public static  boolean WriteFileOutputStream(String spath, String stxt){
		myobj = new File(spath);
		boolean result= false;
		try {
			if(myobj.exists()){
				if (myobj.canWrite()){
					FileOutputStream fos = new FileOutputStream(myobj, true);
					fos.write(stxt.getBytes());		
					fos.close();
					result= true;
				}		

			}
		} catch (IOException e) {
			e.printStackTrace();
		}		

		return result;	
	}
	
	
		
		
		public static  boolean WriteFileniofiles(String spath, String stxt){
			myobj = new File(spath);
			boolean result= false;
			try {
				if(myobj.exists()){
					if (myobj.canWrite()){					
						Files.write(Paths.get(spath), stxt.getBytes(), StandardOpenOption.APPEND);
						result = true;
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}	
			return result;
		}
	
	
	
	


	public static  ArrayList<String> ReadfromFile(String spath){
		myobj = new File(spath);
		ArrayList<String> sdata = new ArrayList<String>();
		int LineCount = 0;
		try {
			if(myobj.exists()){
				if (myobj.canRead()){					
					Scanner scnObj = new Scanner(myobj);
					while (scnObj.hasNextLine()){
						sdata.add(LineCount,scnObj.nextLine());
						LineCount= LineCount+1;
					}

				}
			}

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return sdata;

	}
	
}
