package com.ques3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Enter a String :");
		s = sc.next();
		StrReverse s1 = new strReverse();
		s1.strrev(s);
		sc.close();
	}

}