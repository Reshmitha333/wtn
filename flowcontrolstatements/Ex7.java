package com.wipro.flowcontrolstatements;

public class Ex7 {
	public static void main(String[] args) {
		char a=args[0].charAt(0);
		if(a>=97 && a<=122) System.out.println(args[0].toUpperCase());
		else System.out.println(args[0].toLowerCase());
	}
}
