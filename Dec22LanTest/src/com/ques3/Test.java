package com.ques3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.name = "Rahul Jaiswal";
		e1.age = 22;
		e1.phone = "7477091868";
		e1.address = "Bhopal";
		e1.salary = 55000;
		e1.specialization = "Computer Science";
		e1.department = "Engineering and Applied Sciences";
		System.out.println("Employee Details........");
		System.out.println(e1);
		System.out.println();

		Manager m1 = new Manager();
		m1.name = "Mahesh";
		m1.age = 35;
		m1.phone = "9564852210";
		m1.address = "Chennai";
		m1.salary = 85000;
		m1.specialization = "Computer Science";
		m1.department = "Engineering and Applied Sciences";
		System.out.println("Manager Details........");
		System.out.println(m1);

	}

}
