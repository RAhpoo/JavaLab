package com.ques3;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		emp.name = "Pranjal";
		emp.age = 22;
		emp.phone_number = "8340459063";
		emp.address = "Patna";
		emp.department = "Civil";
		emp.Specialization = "Practical";
		//printing details
		System.out.println("----------Employee Details---------");
		System.out.println("Name :"+emp.name);
		System.out.println("Age :"+emp.age);
		System.out.println("Contact :"+emp.phone_number);
		System.out.println("Address :"+emp.address);
		System.out.print("Salary :");
		emp.print_salary(50000);
		System.out.println("Department :"+emp.department);
		System.out.println("Specialization :"+emp.Specialization);
		System.out.println("------------end of Employee---------------");
		
		Manager man = new Manager();
		man.name = "Suman";
		man.age= 22;
		man.phone_number = "7477091868";
		man.address= "Ranchi";
		man.department = "Civil";
		man.Specialization = "Practical";
		
		System.out.println("----------Manager Details---------");
		System.out.println("Name :"+man.name);
		System.out.println("Age :"+man.age);
		System.out.println("Contact :"+man.phone_number);
		System.out.println("Address :"+man.address);
		System.out.print("Salary :");
		man.print_salary(55000);
		System.out.println("Department :"+man.department);
		System.out.println("Specialization :"+man.Specialization);
		

	}

}
