package com.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamToArray {

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
		
		//Storing first 4 names in an array
		Object[] streamArray=names.stream().limit(4).toArray();
		System.out.println(Arrays.toString(streamArray));
	}

}
