package org.Trainning;

public class StringCount {
	static String s = "flowfer sfs hop";

	public static void main(String[] args) {
		//static String s = "flowersfshop";
		char[] c = s.toCharArray();
		int l = c.length;
		int d=1;

		for (int i = 0; i <l; i++) 
		{
			for (int j=(i+1); j < l; j++) 
			{
				if(c[i]==' ')
				{}
				if (c[i] ==c[j]) 
				{
					d++;	
					c[j]=' ';
				}
			}
			if(c[i]!=' ') 
			{
				System.out.println(c[i] +" " +d);
				d=1;
			}
		}
	}
}
