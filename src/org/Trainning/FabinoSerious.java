package org.Trainning;

public class FabinoSerious {
public static void main(String[] args) {
	int x =0;
	int y=1;
	System.out.println("0"+"\n"+"1");
	int a=5;
	for (int i =1; i <a; i++) {
		int c=x+y;
		x=y;
		y=c;
		System.out.println(c);
	}
}
}
