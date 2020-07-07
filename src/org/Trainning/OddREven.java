package org.Trainning;

import java.util.Scanner;

public class OddREven {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int x=num%2;
	while (x==0) 
	{
		System.out.println(num +" is Even number");
		break;
	}
while (x!=0) 
{
	System.out.println(num +" is odd number");
	break;
}
}}