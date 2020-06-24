package com.wipro.arrays;

public class Ex2 {
	public static void main(String[] args) {
		int[] a= {10,4,2,6,8,5};
		int l=a.length;
		int min=a[0],max=a[0];
		for(int i=0;i<l;i++)
		{
			if(a[i]<min) min=a[i];
			if(a[i]>max) max=a[i];
		}
		System.out.println("Min:"+min+" Max:"+max);
	}
}
