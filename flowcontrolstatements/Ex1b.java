package com.wipro.flowcontrolstatements;

public class Ex1b {
public static void main(String[] args) {
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	int al=a%10;
	int bl=b%10;
	if(al==bl) System.out.println("true");
	else System.out.println("false");
}
}
