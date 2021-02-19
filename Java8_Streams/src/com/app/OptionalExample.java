package com.app;

import java.util.Optional;

public class OptionalExample {
	
	String s=null;
	

	public Optional<String> concatStrings() {

		Optional<String> first = Optional.ofNullable(s);
		Optional<String> second = Optional.of("pqr");
		return first;
	}
	
	

	public static void main(String[] args) {
		OptionalExample test = new OptionalExample();
		Optional<String> result = test.concatStrings();
		if (result.isPresent())
			System.out.println(result.get());
		
		
		String nullName=null;
		Optional<String> os=Optional.ofNullable(nullName);
		System.out.println(os.isPresent());
		System.out.println(os.of("abc").toString());
		
		
	}
}
