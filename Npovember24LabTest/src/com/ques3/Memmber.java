package com.ques3;

public class Memmber {
	public String name;
	public int age;
	public String phone_number;
	public String address;
	public int salary;
	
	void print_salary(int salary)
	{
		System.out.println(salary);
	}

}

class Employee extends Memmber{
	public String Specialization;
	public String department;
	
}

class Manager extends Memmber{
	public String Specialization;
	public String department;
	
}