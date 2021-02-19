package com.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class nameStream {

	public static void main(String[] args) {


		
		List<String> names=new ArrayList<>();
		names.add("Rutuja");
		names.add("Vrushali");
		names.add("Rucha");
		names.add("Rohan");
		names.add("Dipali");
		names.add("Vinaya");
		names.add("Ashlesha");
		names.add("Mahi");
		names.add("Mahi");
		names.add("Rutuja");
		
		
		names.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
		System.out.println();
		
		names.stream().sorted().map(s -> s.toLowerCase()).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println();
		
		//Sorting the names according to natural order 
		names.stream().sorted().map(s -> s.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println();
		
		//Sorting the names according to natural order
		names.stream().sorted().limit(3).forEach(System.out::println);
		System.out.println();
		
		names.stream().limit(3).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println();
		
		//Selecting names containing more than 5 characters
		names.stream().filter((s) -> s.length() > 7 ).forEach(System.out::println);
		
		
		//Selecting only unique names
		names.stream().distinct().forEach(System.out::println);
		
		System.out.println();
		//skip first n element
        names.stream().skip(4).forEach(System.out::println);	
        
        
        System.out.println();
      //Returns length of each name
        names.stream().map(String::length).forEach(System.out::println);
        
        
        System.out.println();
      //Sorting the names according to their length
        names.stream().sorted((String name1 , String name2) -> name1.length() - name2.length()).forEach(System.out::println);
       // names.stream().sorted((s1 ,s2) -> s1.length() - s2.length()).forEach(System.out::println);
        
        
        System.out.println();
      //Counting the names with length > 5
       long num= names.stream().filter((s) -> s.length() > 5).count();
       System.out.println(num);
       
		
		
	}

}
