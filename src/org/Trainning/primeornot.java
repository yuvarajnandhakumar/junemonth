package org.Trainning;

public class primeornot {

	public primeornot(int i) {
		int f=0;
	if (i== 0|| i==1) {
	System.out.println( i +"  is not a Prime Number");
	System.exit(0);
	}
		for (int j = 2; j < i; j++) {
			int k=i%j;
			
			if (k==0) {
				System.out.println("Not a Prime Number");
				f=1;
				break;
			}
		}
		if (f==0) {
			System.out.println(i +"  Prime number");
		}
		

	
	}

	public static void main(String[] args) {
		primeornot s = new primeornot(23);
	}
}
