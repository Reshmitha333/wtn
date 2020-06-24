package com.wipro.flowcontrolstatements;

public class Ex12 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int c=0;
		for(int i=1;i<=a/2;i++)
		{
			if(a%i==0) c++;
		}
		if(c==1) System.out.println("Prime");
		else System.out.println("Not Prime");
		
	}
}
