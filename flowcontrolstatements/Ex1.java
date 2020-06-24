package com.wipro.flowcontrolstatements;

public class Ex1 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		String s=(a>0)?"positive":(a<0?"negative":"zero");
		System.out.println(s);
	}

}
