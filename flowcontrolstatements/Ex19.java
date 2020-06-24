package com.wipro.flowcontrolstatements;

public class Ex19 {
	public static void main(String[] args) {
		int c=0,i=1;
		while(c<5)
		{
			if(i%2==0 && i%3==0 && i%5==0)
			{
				System.out.println(i);
				c++;
			}
			i++;
		}
		
	}
}
