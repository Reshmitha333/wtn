package com.wipro.flowcontrolstatements;

public class Ex15 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int l,s=0;
		while(a>0) {
			l=a%10;
			s+=l;
			a=a/10;
		}
		System.out.println(s);
	}
}
