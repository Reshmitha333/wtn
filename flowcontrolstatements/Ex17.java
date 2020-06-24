package com.wipro.flowcontrolstatements;

public class Ex17 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int l,s=0;
		while(a>0) {
			l=a%10;
			s=s*10+l;
			a=a/10;
		}
		System.out.println(s);
	}
}
