package com.wipro.arrays;

public class Ex5 {
	public static void main(String[] args) {
		int[] a= {1,100,24,89,41,0,3};
		int l=a.length;
		int min1=a[0],min2=a[1],max1=a[0],max2=a[1];
		if(max1<max2)
		{
			int temp=max1;
			max1=max2;
			max2=temp;
		}
		for(int i=0;i<l;i++)
		{
			if(a[i]<min1) min1=a[i];
			
			if(a[i]>max1) max1=a[i];
			
		}
		for(int i=0;i<l;i++)
		{
			if(a[i]>min1 && a[i]<min2) min2=a[i];
			if(a[i]<max1 && a[i]>max2) max2=a[i];
		}
		System.out.println("Min1:"+min1+" Min2:"+min2+" Max1:"+max1+" Max2:"+max2);
	}
}
