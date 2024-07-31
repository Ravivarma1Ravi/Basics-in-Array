package com.mec.University;

import java.util.*;

public class ProductOfElements 
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Element:");
		int size = sc.nextInt();
		int a[] = new int[size];
		for (int i=0; i<size; i++)
		{
			System.out.println("Enter the "+i+" Element");
			a[i] = sc.nextInt();
		}
		int product = 1;
		for(int j=0; j<a.length; j++)
		{
			product = product*a[j];
		}
		System.out.println("the Product of the Element:"+product);
	}


}
