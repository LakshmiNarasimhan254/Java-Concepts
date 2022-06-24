package com.mln.javaBasics;

public class StaticUnderstanding {
	
	static int variable = 1;
	int var = 0;
	
	public StaticUnderstanding() {
		variable++;
	}

	public static void add10()
	
	{
		variable = variable +10;
		System.out.println(variable);
	}

}
