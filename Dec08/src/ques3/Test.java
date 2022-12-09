package ques3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob1 = new Employee(1, "Pranjal Rajeev", 55000, 4);
		Employee ob2 = new Employee(2, "Suman Kumar", 85000, 2);
		System.out.println("ID :"+ob1.id);
		System.out.println("Name :"+ob1.name);
		System.out.println("Salary :"+ob1.salary);
		System.out.println("Working Year :"+ob1.year);
		System.out.println();
		System.out.println("ID :"+ob2.id);
		System.out.println("Name :"+ob2.name);
		System.out.println("Salary :"+ob2.salary);
		System.out.println("Working Year :"+ob2.year);
		ob1.inc();
		ob2.inc();
		System.out.println("--------------After Increment---------------");
		System.out.println("ID :"+ob1.id);
		System.out.println("Name :"+ob1.name);
		System.out.println("Salary :"+ob1.salary);
		System.out.println("Working Year :"+ob1.year);
		System.out.println();
		System.out.println("ID :"+ob2.id);
		System.out.println("Name :"+ob2.name);
		System.out.println("Salary :"+ob2.salary);
		System.out.println("Working Year :"+ob2.year);

	}

}