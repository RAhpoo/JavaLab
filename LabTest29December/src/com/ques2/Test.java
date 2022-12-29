package com.ques2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter a Number :");
		n = sc.nextInt();
		Sum a = new Sum();
		a.sum(n);
		sc.close();
	}

}