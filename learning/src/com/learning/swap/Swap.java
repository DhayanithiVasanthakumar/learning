package com.learning.swap;

public class Swap {
	public static void swap(int a,int b) {
		System.out.println("brfore swaping");
		System.out.println(a);
		System.out.println(b);
		
		
		System.out.println("after swaping");
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
	}
}
