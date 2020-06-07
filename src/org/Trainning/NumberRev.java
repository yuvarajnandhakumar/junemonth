package org.Trainning;

import java.util.Arrays;
import java.util.Collections;

public class NumberRev {

	public static void main(String[] args) {

		Integer []a = {10,20,40,30};
		Arrays.sort(a);

		String ss = Arrays.toString(a);
		System.out.println(ss);

		Collections.reverse(Arrays.asList(a));
		System.out.print(Arrays.asList(a)); 
	}
}
