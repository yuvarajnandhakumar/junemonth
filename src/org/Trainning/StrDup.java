package org.Trainning;

public class StrDup {
	public void dupLi (String a) {
		char[] du = a.toCharArray();
		int l = du.length;
		for (int i = 0; i < l; i++) 
		{
			for (int j = i+1; j < l; j++) 
			{
				if (du[i]==du[j]) {
					du[j]=' ';
				}
			}
		}

		String ss = String.valueOf(du);
		String sss = ss.replace(" ", "");
		System.out.println(sss);



	}



	public static void main(String[] args) {

		StrDup cc =new StrDup();
		cc.dupLi("welcomeall");
	}

}
