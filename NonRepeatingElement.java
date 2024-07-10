package com.arrays;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class NonRepeatingElement {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,1,2,4,5};
		
		// this program is find the 
		// Non- repeating element 
		
//		System.out.println(Arrays.toString(arr));
		List<Integer> list = new ArrayList<>();
		
		for(Integer i: arr)
			list.add(i);
		Set<Integer> set = new LinkedHashSet<>(list);
		
		for(Integer i : set)
			if((Collections.frequency(list, i))==1)
				System.out.println(i);
			
		
	}

}
