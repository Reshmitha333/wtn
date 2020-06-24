package com.wipro.arrays;

public class Ex3 {
	public static void main(String[] args) {
		int[] a= {10,4,2,6,8,5};
		int flag=0;
		int l=a.length;
		int i;
		int ele=Integer.parseInt(args[0]);
		for( i=0;i<l;i++)
		{
			if(ele==a[i]) {flag=0; 
			break;
			}
			else flag=1;
		}
		if(flag==0) System.out.println(i);
		else System.out.println("-1");
		
}
}