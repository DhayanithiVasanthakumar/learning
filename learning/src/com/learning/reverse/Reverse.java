package com.learning.reverse;

public class Reverse {

	public static void reverse(String str) {
		StringBuffer run=new StringBuffer(str);
		run.reverse();
		System.out.println(run);
	}
}
