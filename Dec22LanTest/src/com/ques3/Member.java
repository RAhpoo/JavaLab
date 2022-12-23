package com.ques3;

public class Member {

	public String name;
	public int age;
	public String phone;
	public String address;
	public int salary;

	public int printSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", phone=" + phone + ", address=" + address + ", salary="
				+ salary + "]";
	}

}

class Employee extends Member {
	public String specialization;
	public String department;
}

class Manager extends Member {
	public String specialization;
	public String department;
}