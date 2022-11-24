/*
Author : Rahul Jaiswal
date   : 24/11/2022
Program :Student  Details 
*/



import java.util.Scanner;

public class StudentDetails {
	Scanner sc = new Scanner(System.in);
	public void details(String f_name,String l_name,int age,String course,int enrolled,int student_id)
	{
		System.out.println("Enter First name: ");
		f_name = sc.next();
		System.out.println("Enter Last name: ");
		l_name = sc.next();
		System.out.println("Enter Age : ");
		age = sc.nextInt();
		System.out.println("Enter Course name: ");
		course = sc.next();
		System.out.println("Enter Enrolled year: ");
		enrolled = sc.nextInt();
		System.out.println("Enter Student id: ");
		student_id = sc.nextInt();
		
		System.out.println("---------------------------");
		System.out.println("Student ID :"+student_id);
		System.out.println("First Name :"+f_name);
		System.out.println("Last Name :"+l_name);
		System.out.println("Age :"+age);
		System.out.println("Course Name :"+course);
		System.out.println("Entrolled Year :"+enrolled);
		System.out.println("---------------------------");
		
		
	}
	
	public void details(String f_name,String l_name,int salary,String d_name,String designation,int emp_id)
	{
		System.out.println("Enter First name: ");
		f_name = sc.next();
		System.out.println("Enter Last name: ");
		l_name = sc.next();
		System.out.println("Enter Salary : ");
		salary = sc.nextInt();
		System.out.println("Enter Department name: ");
		d_name = sc.next();
		System.out.println("Enter Designation: ");
		designation = sc.next();
		System.out.println("Enter Employee id: ");
		emp_id = sc.nextInt();
		
		System.out.println("---------------------------");
		System.out.println("Employee ID :"+emp_id);
		System.out.println("First Name :"+f_name);
		System.out.println("Last Name :"+l_name);
		System.out.println("Department :"+d_name);
		System.out.println("Designation :"+designation);
		System.out.println("Salary :"+salary);
		System.out.println("---------------------------");
		
	}
	

}