package com.file;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class File {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		OutputStream os = new FileOutputStream("D://ProductDetails.txt");
		int id;
		String name;
		int price;
		System.out.println("Enter Product ID :");
		id = sc.nextInt();
		System.out.println("Enter Product name :");
		name = sc.next();
		System.out.println("Enter Product Price :");
		price = sc.nextInt();
		byte[] b = name.getBytes();
		os.write(b);
		os.write(price);
		sc.close();
		os.close();
	}

}