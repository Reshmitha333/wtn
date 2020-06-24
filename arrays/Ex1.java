package com.wipro.arrays;

public class Ex1 {
	public static void main(String[] args) {
		int[] a= {10,4,2,6,8,5};
		int l=a.length;
		float s=0;
		for(int i=0;i<l;i++) {
			s+=a[i];
	}
		System.out.println(s/l);
	}
}
