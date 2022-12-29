package com.ques1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int decimal;
		System.out.println("Enter a Decimal Number :");
		decimal = sc.nextInt();
		Binary b = new Binary();
		b.binary(decimal);
		sc.close();
	}

}