package com.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FindingAndMatching {

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
		
		
		if(names.stream().anyMatch((s) -> s.length() == 8)) {
			System.out.println("Yes there is name exist with 5 letters");
		}else {
			System.out.println("Not exist");
		}
		
		
		
		if(names.stream().allMatch((s) -> s.length() > 3)) {
			System.out.println("All match");
		}else {
			System.out.println("not match");
		}
		
		
		if(names.stream().noneMatch((s) -> s.length() == 9)){
			System.out.println("There is no match");
		}
		
		
		
		Optional<String> firstelement=Stream.of("Rutuja","Vrushali", "Rohan", "Sagar", "Snehal").findFirst();
		System.out.println(firstelement);

		
		Optional<String> findanyelement=Stream.of("Rutuja","Vrushali", "Rohan", "Sagar", "Snehal").findAny();
		System.out.println(findanyelement);
	}

}
