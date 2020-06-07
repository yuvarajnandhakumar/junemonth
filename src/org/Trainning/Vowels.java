package org.Trainning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Vowels {

	public Vowels() {

		String s="my name is yuvaraj";
		char[] c = s.toCharArray();

		int l = c.length;
		int a = 0,e=0,i=0,o=0,u=0;
		for (int j = 0; j < l; j++) {
			if (c[j]=='a'){
				a++;
			}
			if (c[j]=='e'){
				e++;
		}
			if (c[j]=='i'){
				i++;	
			}
			if (c[j]=='o'){
					o++;	
	}
			if (c[j]=='u'){
				u++;
		}
		}
		System.out.println("a count is :"+a+"\n" +"Count of E: "+e+"\n" +"I count is :"+i+"\n" +"o count is :"+o+"\n" +"u count is :"+u);

	}
	public static void main(String[] args) {
		Vowels v = new Vowels();
		/*int n[]= {1,2,3,4};
		String s[]= {"a","b"};
		
		System.out.println(n[1] +s[1]);
		
		int aiFirstArray[] = new int[6];

		int []aiMyArray;

int dd[][]=new int [2][2];
System.out.println(dd[1][1]);
*/




			//Creating HashSet and adding elements  
		/*List set=new LinkedList(); 
		
		List d = new ArrayList<>();
		d.add("yuvaraj");
			set.add(20);  
			set.add("Vijay");  
			set.add('C'); 
			set.add(40f);  
			set.add("Ajay");  
			set.add(2, "added");
			set.remove(0);	
			set.set(2, "yuvaraj");
			set.addAll(d);
			set.removeAll(set);
			System.out.println(set);*/  
			  
			}  

	}


