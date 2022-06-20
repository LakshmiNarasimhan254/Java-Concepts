package com.mln.dsArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>ar1 = new ArrayList<Integer>(Arrays.asList(1,2,2,3,3,4,5,6,6,7,8,2,9,3,10,11));

		//1:Linked Hashset
		LinkedHashSet<Integer> lh  = new LinkedHashSet<Integer>(ar1);
		ArrayList<Integer>ar2 = new ArrayList<Integer>(lh);
		System.out.println(ar2);

		//2.Stream
		List<Integer>ls =ar1.stream().distinct().collect(Collectors.toList());
		System.out.println(ls);
	
		
		
	}}
