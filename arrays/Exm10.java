package com.wipro.arrays;

public class Exm10 {
public static void main(String[] args) {
	if(args.length!=9) System.out.println("Please enter 9 integer numbers");
	else {
	int[][] a=new int[3][3];
	int i,j,c=0,max=Integer.parseInt(args[0]);
	System.out.println("The given array is :");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++) {
			System.out.print(Integer.parseInt(args[c])+" ");
			c++;
		}
		System.out.println("");
	}
	for(i=0;i<args.length;i++)
	{
		if(Integer.parseInt(args[i])>max) max=Integer.parseInt(args[i]);
	}
	System.out.println("The biggest number in the given array is "+max);
}
}
}
