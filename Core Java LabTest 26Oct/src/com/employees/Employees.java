/*
Program: A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is Employees is allowed to sit in exam or not."
@author: Rahul jaiswal
@Date: 26  oct 2022  
*/
 
package com.employees;
import java.util.*;
//declaring a class to employees package
//Declaring  class 
class Employees
{
	//main method
public static void main(String args[])
{
	
 Scanner sc=new Scanner(System.in);
 //print no of class held
 System.out.println("Enter the No of classes held");
 float x=sc.nextFloat();
 //print a no of class attend
 System.out.println("Enter the No of classes attend");
 float y=sc.nextFloat();
 //Declaring a data type and variable
float pf;
 pf=((y*x)/100);
 System.out.println(pf);
if(pf>=75)
System.out.println("Student is allow to sit in the examS:"+ pf);
else 
System.out.println(" Not Eligible for a student is not allow to sit in the exam:"+ pf);
}
//end main method
}
