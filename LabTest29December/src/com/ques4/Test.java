package com.ques4;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Enter a String :");
		s = sc.next();
		Duplicate d = new Duplicate();
		d.duplicate(s);
		sc.close();
	}

}
