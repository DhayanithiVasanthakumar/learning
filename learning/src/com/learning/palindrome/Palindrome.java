package com.learning.palindrome;

public class Palindrome {
	public static void palindrome(String str) {
		str.toLowerCase();
		String reverse=new StringBuilder(str).reverse().toString();
		System.out.println(reverse.equalsIgnoreCase(str)?"it is palindrome":"it is not palindrome");
	}

}
