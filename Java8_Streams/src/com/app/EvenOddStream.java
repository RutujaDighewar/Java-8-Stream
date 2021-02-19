package com.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddStream {

	public static void main(String[] args) {
       
		List<Integer> list=new ArrayList<>();
	
	   for(int i=1;i<=50;i++) {
		  list.add(i);
	   }	
		System.out.println(list);
		
		/*
		for(Integer integer : list) {
			if (integer %2 == 0) {
				System.out.println(integer);
			}
		}
		*/
		
		System.out.println(" Even Stream...");
		
		list.stream().filter((s) -> s%2 == 0).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println(" Odd Stream...");
		
		list.stream().filter((s) -> s%2 == 1).collect(Collectors.toList()).forEach(System.out::println);

		
	}

}
