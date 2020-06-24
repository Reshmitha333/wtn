package com.wipro.flowcontrolstatements;

public class Ex6 {
	public static void main(String[] args) {
		//String g=args[0];
		int age=Integer.parseInt(args[1]);
		if(args[0].compareTo("female")==0)
		{
			if(age>=1 && age<=58) System.out.println("Percentage of interest is 8.2%");
			else if(age>=59 && age<=100) System.out.println("Percentage of interest is 9.2%");
			else System.out.println("Enter age between 1 to 100");
		}
		else
		{
			if(age>=1 && age<=58) System.out.println("Percentage of interest is 8.4%");
			else if(age>=59 && age<=100) System.out.println("Percentage of interest is 10.5%");
			else System.out.println("Enter age between 1 to 100");
		}
		
	}
}
