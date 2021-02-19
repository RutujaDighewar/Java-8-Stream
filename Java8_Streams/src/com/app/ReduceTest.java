package com.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class ReduceTest {

	public static void main(String[] args) {

		Stream<Integer> streamOfNum=Stream.of(5,7,8,3,2,5,4,9,1);
		System.out.println(streamOfNum.count());
		
		//reduction operation on elements of a stream using initial value and binary operation
		 int sum=Arrays.stream(new int[] {5,7,8,3,2,5,4,9,1}).reduce(0, (a,b) -> a+b);
		 System.out.println(sum);
		 
		 
		 // reduce() method which takes no initial value. But returns an Optional object.
		 OptionalInt sum1=Arrays.stream(new int[] {5,7,8,3,2,5,4,9,1}).reduce((a,b) -> a+b); 
		 System.out.println(sum1);
		
		
		 OptionalInt min=Arrays.stream(new int[] {5,7,8,3,2,5,4,9,1}).min();
		 System.out.println(min);
		 
		 
		 OptionalInt max =Arrays.stream(new int[] {5,7,8,3,2,5,4,9,1}).max();
		 System.out.println(max);
		 
		 
		 
		 List<String> names=new ArrayList<>();
		 names.add("Rutuja");
		 names.add("Vrushali");
		 names.add("Rohan");
		 names.add("Ashlesha");
		 names.add("Shravan");
		 names.add("Swara");
		 
	Optional<String> s= names.stream().reduce((s1,s2) -> s1 +"-"+ s2);
		 if(s.isPresent()) {
			 System.out.println(s);
		 }
		 
		
	}

}
