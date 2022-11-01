
/*
Program: WAP to print the tagline of various IT companies using enhanced switch case .
@author: Rahul jaiswal
@Date: 26  oct 2022  
*/

//import packages 
package com.Enhanced;
import java.util.Scanner;
//declaring a class
class EnhancedSwitch
{
	//method to print full form of abbreviation
	static void printAbbr(String abbr)
	{
		 switch(abbr)
	   {
		   //expression level
		   case "tcs" ->System.out.println("Tata Consultancy Services");		               
           case "tm" ->System.out.println("Tech Mahindra");		              		
           case "ofss"-> System.out.println("Oracle Financial Services Software");		               	
           default-> System.out.println("Wrong input");						
	   } 
		
	}	
		
		
	//main started
	public static void main(String args[])
	{
       // switch case with string
	   String inputAbbr;
	   
	    //declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an abbreviation(tcs,tm,ofss):");
		inputAbbr= sc.next().toLowerCase();// converting the input to lowercase
	   
	   //calling method
	  printAbbr(inputAbbr);
	  
	  
		    
	}
		
	// end of main
}
// end of class 
