package com.wipro.arrays;
import java.util.*;
public class Ex6 {
	public static void main(String[] args) {
		int[] a= {96,97,98,99};
		int l=a.length;
		Arrays.parallelSort(a);
		System.out.print("{");
		for(int i=0;i<l;i++)
		{
			System.out.print(a[i]);
			if(i==l-1) break;
			System.out.print(",");
		}
		System.out.println("}");
		
	}
		
}
