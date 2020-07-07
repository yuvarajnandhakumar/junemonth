package org.Trainning;

public class Starsmid {

	private void mian() {

for (int i = 0; i <5; i++) {
	for (int j = 0; j <5-i ; j++) {
		System.out.print("*");
	}
	for (int j = 0; j < i; j++) {
		System.out.println();
	}
}

	}
}
