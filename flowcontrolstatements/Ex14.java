package com.wipro.flowcontrolstatements;
import java.util.*;
public class Ex14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer");
		int a=sc.nextInt();
		int c=0;
		if(a==0 || a==1) System.out.println(a+" is neither prime nor composite");
		else {for(int i=1;i<=a/2;i++)
		{
			if(a%i==0) c++;
		}
		if(c==1) System.out.println(a+" is a prime number");
		else System.out.println(a+" is not a prime number");
		}
	}
}
