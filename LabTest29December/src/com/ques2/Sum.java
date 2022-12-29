package com.ques2;

public class Sum {

	public void sum(int n) {
		int r, sum = 0;
		while (n > 0) {

			r = n % 10;
			sum = sum + r;
			n = n / 10;

		}
		System.out.println("Sum of digits of Integer is = " + sum);

	}
}