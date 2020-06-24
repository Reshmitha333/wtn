package com.wipro.arrays;

public class Exm9 {
public static void main(String[] args) {
	if(args.length!=4)
	{
		System.out.println("Please enter 4 integer numbers");
	}
	else {
	int i,j,c=0;
	int[][] a=new int[args.length][args.length];
	for(i=(args.length/2)-1;i>=0;i--)
	{
		for(j=(args.length/2)-1;j>=0;j--)
		{
			a[i][j]=Integer.parseInt(args[c]);
			c++;
		}
	}
	for(i=0;i<args.length/2;i++)
	{
		for(j=0;j<args.length/2;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println("");
	}
	}
}
}