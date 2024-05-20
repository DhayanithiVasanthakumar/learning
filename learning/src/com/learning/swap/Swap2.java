package com.learning.swap;

public class Swap2 {
	public static void swap2(int a,int b) {
		System.out.println("before swaping");
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("after swaping");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}

}
