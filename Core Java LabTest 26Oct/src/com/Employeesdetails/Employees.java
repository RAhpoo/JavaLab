/*Employee Details
 * @Author: Rahul Jaiswal
@Date: 26/10/22*/

//creating packages
package com.Employeesdetails;

//importing scanner
import java.util.Scanner;

//creating employee class
public class Employees {

	//creating Scanner object
	static Scanner sc = new Scanner(System.in);
	
	//declaring instance variables
	static int id, salary;
	static String name, department;
	
	//GetDetails method
	public static void GetDetails()
	{
		System.out.println("Enter the ID of the Employee: ");
		id = sc.nextInt();
		System.out.println("Enter the Name of the Employee: ");
		name = sc.next();
		System.out.println("Enter the Department of the Employee: ");
		department = sc.next();
		System.out.println("Enter the Salary of the Employee: ");
		salary = sc.nextInt();
		
	}//end of GetDetails method
	
	//printDetails method
	public static void PrintDetails()
	{
		System.out.println("----------------------------");
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Department: "+department);
		System.out.println("Salary: "+salary);
	}//end of print details method
}//end of class