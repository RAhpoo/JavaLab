/*
Program: WAP to implement enhanced switch case
@author: Rahul Jaiswal
@Date: 26 Oct 2022  
*/

package com.Loop;

import java.util.Scanner;

public class Loop {
	public static void main(String args[])   
	{  
	try (Scanner sc = new Scanner(System.in)) {
		System.out.print("Enter number: ");       
		//reading a number whose table is to be print  
		int num=sc.nextInt();  
		//loop start execution form and execute until the condition i<=10 becomes false  
		for(int i=1; i <= 10; i++)  
		{  
		//prints table of the entered number      
		System.out.println(num+" * "+i+" = "+num*i);  
		}
	}  
	}  
	}