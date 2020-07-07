package org.Trainning;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int y=1;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = num; i> 0; i--) {

			y=i*y;
		}
		System.out.println(y);
	}
}

