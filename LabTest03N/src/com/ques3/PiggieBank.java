/* Question 1: Piggie Bank
 @Author: Rahul jaiswal
 @Date: 3 Nov 2022
 */

//Package
package com.ques3;

//importing scanner
import java.util.Scanner;

//creating class
public class PiggieBank {


	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("WELCOME TO YOUR PIGGIE BANK");
		
		POJO c1 = new POJO();
		c1.setAmount(50);
		
		int addamt;
		
		int choice;
		System.out.println("Do you want to add more: ");
		choice = sc.nextInt();
		
		//switch case
		switch(choice)
		{
		case 1:System.out.println("Enter the amount: ");
			addamt = sc.nextInt();
			c1.setAddamt(addamt);
			System.out.println("AMOUNT ADDED SUCCESSFULLY");
			System.out.print("Your Amount is: "+c1.getAddamt());
			break;
		case 2:System.out.print("Your Amount is: "+c1.getAmount());
			break;
		default:
			System.out.println("Invalid Input....");
		}//end of switch

	}//end of main

}//end of class