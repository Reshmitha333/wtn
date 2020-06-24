package com.wipro.flowcontrolstatements;

public class Ex13 {
	public static void main(String[] args) {
		int c;
		for(int i=10;i<=99;i++)
		{
			c=0;
			for(int j=1;j<=i/2;j++)
			{
				if(i%j==0) c++;
			}
			if(c==1) System.out.println(i);
		}
	}
}
