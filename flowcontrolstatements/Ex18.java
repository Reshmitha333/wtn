package com.wipro.flowcontrolstatements;

public class Ex18 {
	public static void main(String[] args) {
		int an=Integer.parseInt(args[0]);
		int l,s=0,a=an;
		while(a>0) {
			l=a%10;
			s=s*10+l;
			a=a/10;
		}
		if(an==s) System.out.println(an+" is a palindrome");
		else System.out.println(an+" is not a palindrome");
	}
}
