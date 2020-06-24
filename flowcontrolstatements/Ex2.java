package com.wipro.flowcontrolstatements;

public class Ex2 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		//int b=Integer.parseInt(args[1]);
		String s=(a%2==0)?"even":"odd";
		System.out.println(s);
	}
}
